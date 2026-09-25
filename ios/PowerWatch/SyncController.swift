import Foundation
import PowerWatchCore

/// App-level BLE + sync surface (T5.3/T5.5/T6.1). Owns the CoreBluetooth
/// transport and the sync engine, and publishes everything the UI needs:
/// discovered watches, transport state, sync phase, realtime values and
/// errors. Offline by construction — the only link is the watch itself.
@MainActor
@Observable
final class SyncController {

    // MARK: Published state

    private(set) var transportState: TransportState = .idle
    private(set) var discovered: [DiscoveredWatch] = []
    private(set) var syncPhase: SyncPhase = .idle
    private(set) var realtime: RealtimeData?
    /// Phone-clock arrival time of `realtime`. The watch's own `timestamp` can
    /// be skewed or sit on its side of midnight, so day scoping uses this.
    private(set) var realtimeAt: Date?

    /// The watch's own day totals (`00002a25`), refreshed every 20 s while the
    /// link is up — the numbers the watch face shows.
    private(set) var liveTotals: LiveTotals?
    private(set) var liveTotalsAt: Date?

    /// The dashboard's live card: the last sample, but only while the link is
    /// up and the sample arrived today. Android does the same (`observeData`
    /// serves live values only while connected, otherwise the day's stored
    /// totals) — without this the card keeps showing totals from a day that
    /// has already ended.
    var liveData: RealtimeData? {
        // The characteristic is the watch's own total, so it wins over the
        // (never-answered on real firmware) DTP realtime command.
        if let totals = liveTotals, let at = liveTotalsAt, isWatchConnected,
           Calendar.current.isDateInToday(at) {
            return RealtimeData(
                timestamp: Int(at.timeIntervalSince1970),
                currentSteps: totals.totalSteps,
                currentDistance: totals.distanceMetres,
                currentCalories: totals.activeCalories)
        }
        guard let realtime, let realtimeAt, isWatchConnected,
              Calendar.current.isDateInToday(realtimeAt) else { return nil }
        return realtime
    }
    private(set) var lastError: String?
    private(set) var lastOutcome: SyncOutcome?
    /// Active pair code (from the watch's QR code or manual entry) — the
    /// controller auto-connects the first advertisement carrying it.
    private(set) var pairCode: Int16?
    var isScanning: Bool { transportState == .scanning }
    var isPairing: Bool { pairCode != nil && isScanning }
    var isSyncing: Bool {
        if case .finished = syncPhase { return false }
        if case .failed = syncPhase { return false }
        if case .idle = syncPhase { return false }
        return true
    }

    /// Called after a sync commits so the dashboard can reload (AppModel).
    var onSyncCompleted: (() -> Void)?

    /// Called when a scanned watch finishes connecting, so the app records
    /// it as the paired device (AppModel.attachDevice).
    var onWatchConnected: ((DiscoveredWatch) -> Void)?

    /// Phone-side notification sink (connection / battery events).
    var notifications: NotificationController?

    /// Builds the 9024 payload for pairing provisioning from the current
    /// profile/goals/settings (wired by `PowerWatchApp` from `AppModel`).
    var pairingPayloadProvider: (() -> [UInt8])?

    /// The current connection was initiated as PAIRING (not a reconnect):
    /// run Android's provisioning when the channel is ready — the watch
    /// stays in pairing mode until start/stop-pairing + prefs are sent.
    private var pendingPairingProvisioning = false

    /// Latest watch battery percent seen in a sync pull (Android
    /// `RealtimeWatchData.batteryPercent`).
    private(set) var batteryPercent: Int?

    /// The watch we asked the transport to connect to (resolved on .connected).
    private var pendingWatch: DiscoveredWatch?
    /// Edge detection for the connect/disconnect notifications.
    private var wasConnected = false

    // MARK: Plumbing

    private let transport: CoreBluetoothTransport
    private let engine: WatchSyncEngine

    /// Persisted DTP protocol version of the paired watch.
    private static let protocolVersionKey = "watch.protocolVersion"

    init(database: PowerWatchDatabase) {
        let transport = CoreBluetoothTransport()
        self.transport = transport
        self.engine = WatchSyncEngine(transport: transport, database: database)
        engine.start()

        // Which sync flow the watch speaks (Android `ExecutorsFactory`). The
        // value comes from the pairing advertisement's manufacturer data; it is
        // persisted because a reconnect retrieves the peripheral by UUID
        // without ever seeing an advertisement.
        let storedVersion = UserDefaults.standard.integer(forKey: Self.protocolVersionKey)
        // Older builds persisted the probe's answer, which can only say
        // "v3 or newer" — a v4 watch was then stuck at 3 forever and never
        // sent its v4-only `errorLog`. Treat that value as unknown so an
        // advertisement can supply the real version.
        engine.protocolVersion = storedVersion == 3 ? 0 : storedVersion
        engine.prefsPayloadProvider = { [weak self] in
            self?.pairingPayloadProvider?() ?? []
        }
        engine.onProtocolVersionResolved = { version in
            // The probe only distinguishes v2 (28-byte log count) from v3+
            // (24-byte), so only v2 is worth persisting. Storing "3" for a v4
            // watch would permanently hide the v4-only `errorLog` step, which
            // an advertisement can still reveal.
            if version == 2 {
                UserDefaults.standard.set(version, forKey: Self.protocolVersionKey)
            }
        }

        engine.onPhase = { [weak self] phase in
            Task { @MainActor in self?.syncPhase = phase }
        }
        engine.onRealtime = { [weak self] data in
            Task { @MainActor in
                self?.realtime = data
                self?.realtimeAt = .now
            }
        }
        engine.onDiscover = { [weak self] watch in
            Task { @MainActor in self?.addDiscovered(watch) }
        }
        engine.onLiveTotals = { [weak self] totals in
            Task { @MainActor in
                self?.liveTotals = totals
                self?.liveTotalsAt = .now
            }
        }
        engine.onTransportState = { [weak self] state in
            Task { @MainActor in self?.handleTransportState(state) }
        }
        engine.onReady = { [weak self] in
            // Auto-sync once the channel is fully usable — at `.connected` the
            // GATT discovery may still be in flight and a send would fail.
            PowerWatchLog.log("sync: channel ready")
            Task { @MainActor in await self?.handleChannelReady() }
        }
        engine.onBattery = { [weak self] percent in
            Task { @MainActor in
                self?.batteryPercent = percent
                self?.notifications?.batteryLevel(percent)
            }
        }
    }

    // MARK: Pairing (T3.1/T3.4 software half)

    func startScan() {
        discovered.removeAll()
        transport.startScan()
    }

    func stopScan() {
        pairCode = nil
        transport.stopScan()
    }

    /// T3.4 pairing: start from the QR payload the camera resolved (or a
    /// manually entered code) — parses the code (Android
    /// `QRPairingViewModel.extractQRCode`), then scans all advertisements for
    /// the manufacturer-data pairing code and auto-connects the match.
    @discardableResult
    func startPairing(qrText: String? = nil, code: Int16? = nil) -> Bool {
        let parsed = code ?? qrText.flatMap(PairCodeParser.extract)
        PowerWatchLog.log("pairing: qr=\(qrText.map { $0.replacingOccurrences(of: "\n", with: " | ") } ?? "nil") parsed=\(String(describing: parsed))")
        guard let parsed else { return false }
        pairCode = parsed
        discovered.removeAll()
        transport.startPairScan()
        return true
    }

    /// Cancel an in-flight pairing (keeps any other scan state clean).
    func cancelPairing() {
        pairCode = nil
        pendingPairingProvisioning = false
        transport.stopScan()
    }

    func connect(to watch: DiscoveredWatch) {
        pendingWatch = watch
        transport.stopScan()
        transport.connect(to: watch.id)
    }

    /// Reconnect to the bonded watch directly — no advertisement needed
    /// (CoreBluetooth retrieves the system-known peripheral by UUID; a bonded
    /// PowerWatch2 stops broadcasting its pairing advertisement).
    func reconnect(to id: UUID) {
        // No `.idle`-only guard: a request CoreBluetooth is still holding
        // pending (an out-of-range watch) used to make this button a no-op.
        // `connect(to:)` cancels whatever is in flight and starts fresh.
        PowerWatchLog.log("reconnecting to bonded watch \(id)")
        transport.connect(to: id)
    }

    func disconnect() {
        transport.disconnect()
    }

    // MARK: Sync (T4.x)

    func syncNow() async {
        PowerWatchLog.log("sync: syncNow called")
        lastError = nil
        do {
            let outcome = try await engine.sync()
            lastOutcome = outcome
            onSyncCompleted?()
        } catch {
            lastError = String(describing: error)
        }
    }

    /// Pull-to-refresh on the dashboard. A sync started by the connect
    /// auto-sync must not surface `.alreadyRunning`, so wait it out and reuse
    /// its result; offline there is nothing to refresh, and the spinner must
    /// not sit there pretending otherwise.
    func refreshSync() async {
        for _ in 0..<40 where isSyncing {
            try? await Task.sleep(nanoseconds: 250_000_000)
        }
        guard case .connected = transportState, !isSyncing else {
            PowerWatchLog.log("sync: pull ignored — transport not idle and connected")
            return
        }
        await syncNow()
    }

    /// Pushes one 93xx watch-settings command (Android `WatchSettingsExecutor`
    /// sends each setting as it is edited while connected).
    func applySetting(command: Gen2CommandID, payload: [UInt8]) async -> Bool {
        // An edit landing during an auto-sync must not be dropped: wait for the
        // transfer to finish and send right after (Android's executor serialises
        // settings behind the sync the same way). Only give up if it never frees.
        for _ in 0..<40 where isSyncing {
            try? await Task.sleep(nanoseconds: 250_000_000)
        }
        guard case .connected = transportState, !isSyncing else { return false }
        // Same bytes already committed on this link: skip. This firmware has
        // rebooted on a repeated prefs/settings write, and Android only ever
        // sends a setting when it changes, so a repeat is never wanted.
        if let previous = sentSettings[command.rawValue], previous == payload { return true }
        // `syncPhase` (UI) and the engine's own busy flag flip a moment apart,
        // so an `alreadyRunning` here is a race with a finishing sync rather
        // than a real refusal — retry rather than report a failure.
        for attempt in 1...3 {
            do {
                _ = try await engine.sendCommand(command, payload: payload)
                sentSettings[command.rawValue] = payload
                return true
            } catch SyncError.alreadyRunning where attempt < 3 {
                try? await Task.sleep(nanoseconds: 300_000_000)
            } catch {
                lastError = String(describing: error)
                return false
            }
        }
        return false
    }

    /// True while a live link exists — settings edits are still accepted while
    /// offline (they persist and go out on the next connect), so the UI needs
    /// this only for its messaging.
    var isWatchConnected: Bool {
        if case .connected = transportState { return true }
        return false
    }

    // MARK: Private

    /// Channel is fully usable. A fresh pairing first runs Android's
    /// provisioning (9010/9124/9024/9011 — commits the bond and releases
    /// the watch from pairing mode), then the ordinary log sync follows.
    private func handleChannelReady() async {
        if pendingPairingProvisioning {
            do {
                try await engine.provisionPairing(
                    userPrefsAndGoals: pairingPayloadProvider?() ?? [])
                pendingPairingProvisioning = false
            } catch {
                // Keep the flag: if the link dropped mid-provisioning the
                // watch is still in pairing mode — retry on next ready.
                PowerWatchLog.log("sync: pairing provisioning failed: \(error)")
            }
        }
        await syncNow()
    }

    private func addDiscovered(_ watch: DiscoveredWatch) {
        if let index = discovered.firstIndex(where: { $0.id == watch.id }) {
            discovered[index] = watch     // refreshed RSSI/name
        } else {
            discovered.append(watch)
        }
        // Pairing: the advertisement carrying our code is the watch —
        // connect to it (Android `Gen2PairingProgressViewModel` numeric match).
        if let code = pairCode, case .scanning = transportState {
            if watch.pairingCode == code {
                PowerWatchLog.log("pairing: MATCH \(watch.name) code \(code) proto \(watch.protocolVersion)")
                UserDefaults.standard.set(Int(watch.protocolVersion), forKey: Self.protocolVersionKey)
                engine.protocolVersion = Int(watch.protocolVersion)
                pairCode = nil
                pendingPairingProvisioning = true
                connect(to: watch)
            } else if let found = watch.pairingCode {
                PowerWatchLog.log("pairing: \(watch.name) advertises \(found), expected \(code)")
            }
        } else if pairCode == nil,
                  engine.protocolVersion == 0,
                  watch.protocolVersion > 0 {
            // No version on file (paired before the version was persisted, or
            // reinstalled) and the sync-time probe can only tell v2 from v3+.
            // The advertisement is the only place iOS can read it — Android
            // gets it from the device-info/OTA channel instead — so cache it
            // here: it is what selects the v4 flow's `errorLog` step.
            PowerWatchLog.log("sync: cached protocol version \(watch.protocolVersion) from advertisement of \(watch.name)")
            UserDefaults.standard.set(Int(watch.protocolVersion), forKey: Self.protocolVersionKey)
            engine.protocolVersion = Int(watch.protocolVersion)
        }
    }

    /// Settings already committed on the current link, so an identical re-send
    /// is skipped until the watch reconnects (then the values are re-provisioned).
    private var sentSettings: [String: [UInt8]] = [:]

    private func handleTransportState(_ state: TransportState) {
        let wasConnected = self.wasConnected
        self.wasConnected = { if case .connected = state { return true } else { return false } }()
        transportState = state
        if wasConnected, !self.wasConnected {
            sentSettings.removeAll()
            // Live totals belong to the link that reported them.
            realtime = nil
            realtimeAt = nil
            liveTotals = nil
            liveTotalsAt = nil
        }
        switch state {
        case .connected(let id):
            // Record the pairing; the auto-sync starts when the engine
            // reports the channel ready (characteristics subscribed).
            if let watch = pendingWatch, watch.id == id {
                onWatchConnected?(watch)
                pendingWatch = nil
            }
            if !wasConnected { notifications?.watchConnected() }
        case .unavailable:
            discovered.removeAll()
            if wasConnected { notifications?.watchDisconnected() }
        default:
            if wasConnected { notifications?.watchDisconnected() }
        }
    }
}
