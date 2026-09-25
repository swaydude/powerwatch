import CoreBluetooth
import Foundation

// T3.1/T3.2 — CoreBluetooth implementation of `WatchTransport`, porting
// `BleCommunicationTechnology` (scanner) + `BleConnectionOperation` /
// `BLECommunicationChannel` (connect/subscribe/write) from RxAndroidBLE.
//
// Hardware facts baked in (proven on-device 2026-09-06 against the real
// watch — see the project memory; do not re-discover):
// - Constants are named from the WATCH's viewpoint: the phone WRITES to
//   BASIC_DTP_SERVICE_RX (…0011) and the watch NOTIFIES on
//   BASIC_DTP_SERVICE_TX (…0012). `BLEService` keeps the Android names; here
//   they are mapped explicitly so the confusion is impossible to miss.
// - GATT connect is asynchronous: wait for `.connected` before
//   `discoverServices` or discovery is rejected.
// - Write type follows the characteristic properties (proven on-device
//   2026-09-17: a `.withResponse` write to …0011 is rejected by the watch with
//   "Writing is not permitted" — it is write-without-response only, which is
//   what Android's rxandroidble picks too). The watch never answers GATT
//   reads with data — everything arrives as notifications on the TX
//   characteristic.

/// CoreBluetooth-backed transport. One instance manages the whole lifecycle:
/// scan → connect → discover → subscribe → send.
public final class CoreBluetoothTransport: NSObject, WatchTransport {

    public weak var delegate: WatchTransportDelegate?
    public private(set) var state: TransportState = .idle {
        didSet {
            if oldValue != state {
                pwLog("state \(oldValue) → \(state)")
                delegate?.transportStateDidChange(self, state: state)
            }
        }
    }

    // Created after super.init(): CoreBluetooth requires the delegate (which
    // implements willRestoreState:) to be present at init time when a restore
    // identifier is set — passing nil then crashes with NSInternalInconsistency.
    private var central: CBCentralManager!
    private var peripherals: [UUID: CBPeripheral] = [:]
    private var connectedPeripheral: CBPeripheral?

    /// Discovered characteristics on the DTP service (named by role from the
    /// phone's viewpoint — `BLEService`'s Android names map onto these).
    private var writeCharacteristic: CBCharacteristic?     // phone → watch (…0011)
    private var notifyCharacteristic: CBCharacteristic?      // watch → phone (…0012)
    private var eventCharacteristic: CBCharacteristic?      // PWX events (…0013)
    /// Live-totals UUID as a `CBUUID`, so short ("2A25") and long forms match.
    static let liveDataUUID = CBUUID(string: BLEService.liveData)

    /// Live totals, read on request (…180a/2a25) — see `readLiveData`.
    private var liveCharacteristic: CBCharacteristic?

    /// Continuations for one-at-a-time awaited writes (Android's RxJava
    /// serialization is replaced by an actor-friendly single-flight guard).
    private var pendingWrite: CheckedContinuation<Void, Error>?
    /// Queued write-without-response frame awaiting `peripheralIsReady`.
    private var pendingWriteWithoutResponse: (Data, CBCharacteristic)?

    /// Partial frames awaiting the rest of the notification stream, keyed by
    /// characteristic UUID (see `route(_:from:)`).
    private var framers: [String: DTPStreamFramer] = [:]

    /// `true` once `central` has reported a powered-on state.
    private var centralReady = false
    /// Scan request that arrived before the central was ready.
    private var scanWhenReady = false
    /// Pair-scan mode (no service filter — see `startPairScan()`).
    private var pairScanActive = false
    private var pairScanRequested = false
    /// `true` once the ready callback fired for the current connection.
    private var readySignalled = false
    /// Connect request that arrived before the central was ready.
    private var pendingConnectID: UUID?
    /// A link being torn down only so it can be re-negotiated (see
    /// `willRestoreState` and `connect(to:)`): the next disconnect of this
    /// peripheral must reconnect rather than report an idle link.
    private var pendingFreshConnectID: UUID?

    // MARK: Auto-reconnect (Android `DeviceManagerImpl` + `auto_connect_enabled`)

    /// The watch to keep the link up with. Every explicit `connect(to:)` arms
    /// it; a user-initiated disconnect, or a spent retry budget, clears it.
    private var autoReconnectID: UUID?
    private var planner = ReconnectPlanner()
    private var reconnectTask: Task<Void, Never>?
    private var connectDeadlineTask: Task<Void, Never>?

    /// `central.connect` has no timeout of its own: an out-of-range or
    /// half-dead watch leaves the request pending forever, the app stays on
    /// `.connecting`, and nothing ever retries.
    static let connectTimeout: TimeInterval = 12

    private var isLinked: Bool {
        if case .connected = state { return true }
        return false
    }

    public init(restoreIdentifier: String = "powerwatch.transport") {
        super.init()
        central = CBCentralManager(
            delegate: self,
            queue: nil,
            options: [CBCentralManagerOptionRestoreIdentifierKey: restoreIdentifier]
        )
    }

    // MARK: - WatchTransport

    public func startScan() {
        pairScanActive = false
        pairScanRequested = false
        guard centralReady else {
            scanWhenReady = true
            return
        }
        state = .scanning
        // Scan by advertised service UUID — the watch advertises the DTP
        // service (data mode) or OTA service (firmware mode).
        central.scanForPeripherals(
            withServices: [CBUUID(string: BLEService.dtpService),
                           CBUUID(string: BLEService.otaService)],
            options: [CBCentralManagerScanOptionAllowDuplicatesKey: false]
        )
    }

    public func startPairScan() {
        pairScanActive = true
        pairScanRequested = true
        guard centralReady else {
            scanWhenReady = true
            return
        }
        state = .scanning
        // T3.4: unfiltered scan — the pairing advertisement may carry no
        // service UUIDs; the watch is identified by its manufacturer data.
        central.scanForPeripherals(
            withServices: nil,
            options: [CBCentralManagerScanOptionAllowDuplicatesKey: false]
        )
    }

    public func stopScan() {
        scanWhenReady = false
        pairScanActive = false
        pairScanRequested = false
        guard centralReady else { return }
        central.stopScan()
        if state == .scanning { state = .idle }
    }

    public func connect(to id: UUID) {
        // Any explicit connect (launch auto-reconnect, the Reconnect button, a
        // pair-code match) arms auto-reconnect and starts the budget afresh.
        autoReconnectID = id
        planner.reset()
        reconnectTask?.cancel()
        reconnectTask = nil
        link(to: id)
    }

    /// Brings the link up for `id` without touching the retry budget, so the
    /// auto-reconnect path can re-enter it while still counting its attempts.
    private func link(to id: UUID) {
        guard centralReady else {
            pendingConnectID = id
            return
        }
        let peripheral: CBPeripheral
        if let known = peripherals[id] {
            peripheral = known
        } else {
            // Reconnect to a previously paired (system-known) watch. With no
            // CoreBluetooth record of it — fresh stack, or the watch rebooted
            // and hasn't been seen since — scanning is the only way back, and
            // returning silently here is what looked like "never reconnects".
            guard let retrieved = central.retrievePeripherals(withIdentifiers: [id]).first else {
                pwLog("connect(\(id)): no cached peripheral — scanning")
                startScan()
                return
            }
            peripherals[id] = retrieved
            peripheral = retrieved
        }
        // Already linked (restored from the background, or a retry): `connect`
        // will not call back, so go straight to discovery — otherwise the
        // transport reports `.connected` with no characteristics and every
        // send fails `notConnected`.
        if peripheral.state == .connected {
            // Already linked: `connect` will not call back, and the cached
            // service/notification state may belong to a link the watch has
            // already left. Tear it down and reconnect fresh so discovery and
            // the subscriptions are negotiated for real.
            pwLog("connect(\(id)) while already connected — cycling the link")
            connectedPeripheral = peripheral
            readySignalled = false
            pendingFreshConnectID = id
            state = .connecting(id)
            central.cancelPeripheralConnection(peripheral)
            return
        }
        state = .connecting(id)
        armConnectDeadline(for: id)
        central.connect(peripheral, options: nil)
    }

    private func armConnectDeadline(for id: UUID) {
        connectDeadlineTask?.cancel()
        connectDeadlineTask = Task { [weak self] in
            let nanoseconds = UInt64(CoreBluetoothTransport.connectTimeout * 1_000_000_000)
            try? await Task.sleep(nanoseconds: nanoseconds)
            guard let self, !Task.isCancelled else { return }
            self.connectDeadlineExpired(id)
        }
    }

    /// CoreBluetooth never reports failure for a watch that simply stops
    /// answering, so drop the pending request and hand over to the retry policy.
    private func connectDeadlineExpired(_ id: UUID) {
        guard case .connecting(let target) = state, target == id else { return }
        pwLog("connect(\(id)) unanswered for \(Int(Self.connectTimeout))s — retrying")
        if let peripheral = peripherals[id] {
            central.cancelPeripheralConnection(peripheral)
        }
        scheduleReconnect()
    }

    /// Queues the next capped, escalating attempt. The wait keeps `.connecting`
    /// (rather than `.idle`) so the UI reads as "trying to reach the watch".
    private func scheduleReconnect() {
        guard let id = autoReconnectID, reconnectTask == nil else { return }
        guard let delay = planner.nextDelay() else {
            pwLog("auto-reconnect: giving up on \(id) after \(planner.attempt) attempts")
            autoReconnectID = nil
            planner.reset()
            state = .idle
            // Leave a scan running: a watch that reboots advertises again, and
            // `didDiscover` will take it from there.
            startScan()
            return
        }
        pwLog("auto-reconnect attempt \(planner.attempt) for \(id) in \(delay)s")
        state = .connecting(id)
        reconnectTask = Task { [weak self] in
            try? await Task.sleep(nanoseconds: UInt64(delay * 1_000_000_000))
            guard let self, !Task.isCancelled else { return }
            self.reconnectTask = nil
            guard case .connecting(let target) = self.state, target == id else { return }
            self.link(to: id)
        }
    }

    public func disconnect() {
        // User-initiated: the one teardown that must not be followed by a
        // reconnect (Android's `enableAutoConnect(false)` on a manual disconnect).
        autoReconnectID = nil
        planner.reset()
        reconnectTask?.cancel()
        reconnectTask = nil
        connectDeadlineTask?.cancel()
        connectDeadlineTask = nil
        guard let peripheral = connectedPeripheral else {
            // Nothing was linked — a retry in flight. Cancelling it is the whole
            // request, and the UI has to leave `.connecting` to show that.
            if case .connecting = state { state = .idle }
            return
        }
        pendingFreshConnectID = nil
        // Unsubscribe first (Android: `subscription.clear()` on close).
        if let notify = notifyCharacteristic { peripheral.setNotifyValue(false, for: notify) }
        if let event = eventCharacteristic { peripheral.setNotifyValue(false, for: event) }
        central.cancelPeripheralConnection(peripheral)
    }

    public func send(_ data: [UInt8]) async throws {
        guard let peripheral = connectedPeripheral, let characteristic = writeCharacteristic else {
            throw TransportError.notConnected
        }
        pwLog("tx \(data.count)B: \(data.map { String(format: "%02x", $0) }.joined())")
        // Hardware fact (real watch, CBATT 0x03): the DTP RX characteristic
        // (…0011) accepts write-without-response only — a write-with-response
        // is rejected with "Writing is not permitted". Android's rxandroidble
        // likewise picks the write type from the characteristic properties.
        let type: CBCharacteristicWriteType
        if characteristic.properties.contains(.write) {
            type = .withResponse
        } else if characteristic.properties.contains(.writeWithoutResponse) {
            type = .withoutResponse
        } else {
            throw TransportError.writeFailed("Characteristic is not writable")
        }
        if type == .withoutResponse {
            if peripheral.canSendWriteWithoutResponse {
                peripheral.writeValue(Data(data), for: characteristic, type: .withoutResponse)
                return
            }
            // Back-pressure: queue the frame, send it once the radio drains.
            try await withCheckedThrowingContinuation { (continuation: CheckedContinuation<Void, Error>) in
                pendingWrite = continuation
                pendingWriteWithoutResponse = (Data(data), characteristic)
            }
            return
        }
        try await withCheckedThrowingContinuation { (continuation: CheckedContinuation<Void, Error>) in
            pendingWrite = continuation
            peripheral.writeValue(Data(data), for: characteristic, type: .withResponse)
        }
    }

    /// T3.5 — connection priority. Android requests
    /// `CONNECTION_PRIORITY_HIGH` every 30 s (throttled). CoreBluetooth has
    /// NO public connection-priority/interval API; iOS manages the interval
    /// itself and keeps it short while notifications are subscribed. This is
    /// therefore a documented no-op whose real work is keeping the
    /// subscriptions alive (see `resubscribeCharacteristics()`).
    public func requestHighPriority() {
        // Intentionally empty — see the doc comment.
    }

    /// Android `resubscribeCharacteristics()`: clear and re-establish the
    /// notification subscriptions (used after a connection refresh).
    public func resubscribeCharacteristics() {
        guard let peripheral = connectedPeripheral else { return }
        if let notify = notifyCharacteristic {
            peripheral.setNotifyValue(false, for: notify)
            peripheral.setNotifyValue(true, for: notify)
        }
        if let event = eventCharacteristic {
            peripheral.setNotifyValue(false, for: event)
            peripheral.setNotifyValue(true, for: event)
        }
    }

    // MARK: - Logging

    /// Trace logging for hardware sessions — stdout, visible when launched
    /// via `devicectl device process launch --console`. Off in normal use.
    private func pwLog(_ message: String) {
        PowerWatchLog.log("transport: \(message)")
    }

    // MARK: - Frame routing

    private func route(_ data: Data, from characteristic: CBCharacteristic) {
        let key = characteristic.uuid.uuidString
        let fragment = [UInt8](data)
        pwLog("rx-frag \(fragment.count)B on \(key.suffix(4)): \(fragment.map { String(format: "%02x", $0) }.joined())")
        // Notifications are MTU-sized, so whole frames are re-assembled from
        // the stream before decoding (see `DTPStreamFramer`).
        var framer = framers[key] ?? DTPStreamFramer()
        let frames = framer.append(fragment)
        framers[key] = framer
        for frame in frames {
            pwLog("rx \(frame.count)B on \(key.suffix(4)): \(frame.map { String(format: "%02x", $0) }.joined())")
            // Watch-viewpoint names: the watch NOTIFIES on TX (…0012) and
            // listens on RX (…0011) — routing is by the notify characteristics.
            switch key {
            case BLEService.dtpTX:          // …0012 — watch → phone data
                delegate?.transport(self, didReceiveData: frame)
            case BLEService.basicDTPPwxRX:  // …0013 — PWX events / watch ACKs
                delegate?.transport(self, didReceiveEvent: frame)
            default:
                break
            }
        }
    }

    /// Write to the event characteristic (…0013) — DTP flow-control ACKs
    /// (`DTPAck`). Fire-and-forget write-without-response, like Android's
    /// `writeAck`, which never awaits the GATT write.
    public func sendEvent(_ data: [UInt8]) {
        guard let peripheral = connectedPeripheral, let characteristic = eventCharacteristic else { return }
        pwLog("tx-ack \(data.count)B: \(data.map { String(format: "%02x", $0) }.joined())")
        peripheral.writeValue(Data(data), for: characteristic, type: .withoutResponse)
    }

    /// Android's `GEN2_SERIAL_REQUEST`: a plain GATT read of `00002a25`. The
    /// value arrives through `didUpdateValueFor` → `didReceiveLiveData`, so
    /// there is nothing to await here (and nothing to ACK — the ACK channel
    /// belongs to DTP frames only).
    public func readLiveData() {
        guard let peripheral = connectedPeripheral, let characteristic = liveCharacteristic else { return }
        peripheral.readValue(for: characteristic)
    }
}

// MARK: - CBCentralManagerDelegate

extension CoreBluetoothTransport: CBCentralManagerDelegate {

    /// T3.2 state restoration: the central calls this on relaunch when it
    /// was restored from the background with active connections.
    public func centralManager(_ central: CBCentralManager,
                               willRestoreState dict: [String: Any]) {
        if let restored = dict[CBCentralManagerRestoredStatePeripheralsKey] as? [CBPeripheral] {
            for peripheral in restored {
                peripherals[peripheral.identifier] = peripheral
                peripheral.delegate = self
                switch peripheral.state {
                case .connected:
                    pwLog("restored connection \(peripheral.identifier), cycling the link")
                    // A restored link can be a phantom. iOS replays the cached
                    // services and notification state, so discovery "succeeds"
                    // and channel-ready fires — while writes reach nothing
                    // (real device 2026-09-24: `9000` went unanswered for a
                    // minute on a restored link the watch had already left).
                    // Tear it down and reconnect, so discovery and the
                    // subscriptions are negotiated on a live link.
                    connectedPeripheral = peripheral
                    readySignalled = false
                    pendingFreshConnectID = peripheral.identifier
                    state = .connecting(peripheral.identifier)
                    central.cancelPeripheralConnection(peripheral)
                case .connecting:
                    state = .connecting(peripheral.identifier)
                default:
                    break
                }
            }
        }
    }

    public func centralManagerDidUpdateState(_ central: CBCentralManager) {
        switch central.state {
        case .poweredOn:
            centralReady = true
            if scanWhenReady {
                scanWhenReady = false
                pairScanRequested ? startPairScan() : startScan()
            }
            if let pending = pendingConnectID {
                pendingConnectID = nil
                connect(to: pending)
            } else if autoReconnectID != nil, connectedPeripheral == nil,
                      reconnectTask == nil, state != .scanning, !isLinked {
                // Android re-issues `startConnection` whenever the radio comes
                // up; iOS needs the nudge.
                pwLog("radio powered on — resuming auto-reconnect")
                scheduleReconnect()
            }
        case .poweredOff:
            state = .unavailable(reason: .poweredOff)
        case .unauthorized:
            state = .unavailable(reason: .unauthorized)
        case .unsupported:
            state = .unavailable(reason: .unsupported)
        default:
            break
        }
    }

    public func centralManager(_ central: CBCentralManager,
                               didDiscover peripheral: CBPeripheral,
                               advertisementData: [String: Any],
                               rssi RSSI: NSNumber) {
        peripherals[peripheral.identifier] = peripheral
        // Auto-reconnect: the watch we are trying to get back to is on air, so
        // take it now instead of waiting out the backoff. Pairing takes
        // precedence — the user may be reaching for a different watch.
        if !pairScanActive, connectedPeripheral == nil,
           autoReconnectID == peripheral.identifier, state == .scanning {
            pwLog("auto-reconnect: found \(peripheral.identifier) while scanning")
            planner.reset()
            central.stopScan()
            link(to: peripheral.identifier)
            return
        }
        let serviceUUIDs = (advertisementData[CBAdvertisementDataServiceUUIDsKey] as? [CBUUID] ?? [])
            .map(\.uuidString)
        let manufacturer = [UInt8]((advertisementData[CBAdvertisementDataManufacturerDataKey] as? Data) ?? Data())
        let pairing = PairingAdvertisement.parse(manufacturer)
        let service = AdvertisementFilter.advertisedService(serviceUUIDs: serviceUUIDs)

        let name = (advertisementData[CBAdvertisementDataLocalNameKey] as? String) ?? peripheral.name ?? ""

        if pairScanActive {
            // T3.4 pair mode (Android's patched scan keeps every device and
            // identifies the watch by its manufacturer-data pairing code; the
            // ORIGINAL app found it by the name "PowerWatch 2"): keep devices
            // with a parseable pairing code, a PowerWatch service, or a
            // watch-like name; everything else is unrelated BLE traffic.
            let watchLikeName = ["power", "matrix", "watch", "pw2"]
                .contains { name.lowercased().contains($0) }
            guard pairing != nil || service != nil || watchLikeName else {
                if !name.isEmpty {
                    pwLog("dropped \(name) rssi \(RSSI) (no pair code/service/watch name)")
                }
                return
            }
        } else {
            guard service != nil else { return }
        }
        pwLog("discovered \(name.isEmpty ? "(unnamed)" : name) [\(peripheral.identifier)] rssi \(RSSI) "
              + "service \(service.map(String.init(describing:)) ?? "none") "
              + "pair \(pairing.map { String($0.pairingCode) } ?? "—") "
              + "mfr \(manufacturer.map { String(format: "%02x", $0) }.joined())")
        let watch = DiscoveredWatch(
            id: peripheral.identifier,
            name: name.isEmpty ? "MATRIX Watch" : name,
            rssi: RSSI.intValue,
            advertisedService: service ?? .unknown,
            pairingCode: pairing?.pairingCode,
            protocolVersion: pairing?.protocolVersion ?? 1
        )
        delegate?.transport(self, didDiscover: watch)
    }

    public func centralManager(_ central: CBCentralManager, didConnect peripheral: CBPeripheral) {
        pwLog("connected \(peripheral.identifier), discovering services")
        readySignalled = false
        connectedPeripheral = peripheral
        peripheral.delegate = self
        // Link is back: the retry budget is no longer relevant.
        planner.reset()
        reconnectTask?.cancel()
        reconnectTask = nil
        connectDeadlineTask?.cancel()
        connectDeadlineTask = nil
        state = .connected(peripheral.identifier)
        // Hardware fact: discovery is only accepted once in `.connected`.
        // The Device Information service is requested alongside DTP because the
        // watch's live totals (steps/calories/power/battery) come from a GATT
        // read there, not over DTP.
        peripheral.discoverServices([CBUUID(string: BLEService.dtpService),
                                     CBUUID(string: BLEService.deviceInfoService)])
    }

    public func centralManager(_ central: CBCentralManager,
                               didDisconnectPeripheral peripheral: CBPeripheral,
                               error: Error?) {
        pwLog("disconnected \(peripheral.identifier) error: \(error.map(String.init(describing:)) ?? "nil")")
        // A link we tore down only to re-negotiate it (state restoration, or
        // connecting onto an already-linked peripheral): reconnect now rather
        // than going idle, so the app sees one continuous `.connecting` phase.
        if let id = pendingFreshConnectID, peripheral.identifier == id {
            pendingFreshConnectID = nil
            pwLog("reconnecting for a fresh link")
            readySignalled = false
            connectedPeripheral = nil
            writeCharacteristic = nil
            notifyCharacteristic = nil
            eventCharacteristic = nil
            liveCharacteristic = nil
            state = .connecting(id)
            central.connect(peripheral, options: nil)
            return
        }
        readySignalled = false
        if connectedPeripheral === peripheral {
            connectedPeripheral = nil
            writeCharacteristic = nil
            notifyCharacteristic = nil
            eventCharacteristic = nil
            liveCharacteristic = nil
            // Don't strand an in-flight send on a dead link.
            pendingWriteWithoutResponse = nil
            for key in framers.keys { framers[key]?.reset() }
            if let continuation = pendingWrite {
                pendingWrite = nil
                continuation.resume(throwing: TransportError.notConnected)
            }
        }
        peripherals[peripheral.identifier] = peripheral  // keep for reconnect
        state = .idle
        // Anything we did not ask for — the watch rebooted, a supervision
        // timeout, walking out of range, the watch disconnecting us — is what
        // Android's auto-connect exists for: go back.
        if autoReconnectID == peripheral.identifier {
            scheduleReconnect()
        }
    }

    public func centralManager(_ central: CBCentralManager,
                               didFailToConnect peripheral: CBPeripheral,
                               error: Error?) {
        pwLog("failed to connect \(peripheral.identifier) error: \(error.map(String.init(describing:)) ?? "nil")")
        if case .connecting(let id) = state, id == peripheral.identifier {
            state = .idle
            if autoReconnectID == id { scheduleReconnect() }
        }
    }
}

// MARK: - CBPeripheralDelegate

extension CoreBluetoothTransport: CBPeripheralDelegate {

    public func peripheral(_ peripheral: CBPeripheral,
                           didDiscoverServices error: Error?) {
        pwLog("services discovered: \(peripheral.services?.map { $0.uuid.uuidString } ?? [])")
        // Every requested service, not just DTP: the live-totals
        // characteristic lives under Device Information (0x180a).
        for service in peripheral.services ?? [] {
            peripheral.discoverCharacteristics(nil, for: service)
        }
    }

    public func peripheral(_ peripheral: CBPeripheral,
                           didDiscoverCharacteristicsFor service: CBService,
                           error: Error?) {
        for characteristic in service.characteristics ?? [] {
            pwLog("  \(characteristic.uuid.uuidString.suffix(4)) props \(characteristic.properties)")
        }
        for characteristic in service.characteristics ?? [] {
            switch characteristic.uuid.uuidString {
            case BLEService.dtpRX:          // …0011 — phone → watch writes
                writeCharacteristic = characteristic
            case BLEService.dtpTX:          // …0012 — watch → phone notifications
                notifyCharacteristic = characteristic
                peripheral.setNotifyValue(true, for: characteristic)
            case BLEService.basicDTPPwxRX:  // …0013 — PWX events
                eventCharacteristic = characteristic
                peripheral.setNotifyValue(true, for: characteristic)
            default:
                // `CBUUID` equality normalises the stack's short forms — the
                // watch reports this service/characteristic as "180A"/"2A25",
                // so a `uuidString` comparison against the long spelling never
                // matches (proven on-device 2026-09-25).
                if characteristic.uuid == Self.liveDataUUID {
                    liveCharacteristic = characteristic
                }
            }
        }
    }

    public func peripheral(_ peripheral: CBPeripheral,
                           didUpdateValueFor characteristic: CBCharacteristic,
                            error: Error?) {
        guard error == nil, let data = characteristic.value else { return }
        // A read response carries no framing/ACK obligations — the live
        // characteristic is a plain value, so it must not enter the framers.
        if characteristic.uuid == Self.liveDataUUID {
            let bytes = [UInt8](data)
            pwLog("live \(bytes.count)B: \(bytes.map { String(format: "%02x", $0) }.joined())")
            delegate?.transport(self, didReceiveLiveData: bytes)
            return
        }
        route(data, from: characteristic)
    }

    public func peripheral(_ peripheral: CBPeripheral,
                           didWriteValueFor characteristic: CBCharacteristic,
                           error: Error?) {
        guard characteristic.uuid.uuidString == BLEService.dtpRX else { return }
        guard let continuation = pendingWrite else { return }
        pendingWrite = nil
        if let error {
            continuation.resume(throwing: TransportError.writeFailed(error.localizedDescription))
        } else {
            continuation.resume()
        }
    }

    public func peripheralIsReady(toSendWriteWithoutResponse peripheral: CBPeripheral) {
        guard let continuation = pendingWrite,
              let (data, characteristic) = pendingWriteWithoutResponse else { return }
        pendingWrite = nil
        pendingWriteWithoutResponse = nil
        peripheral.writeValue(data, for: characteristic, type: .withoutResponse)
        continuation.resume()
    }

    public func peripheral(_ peripheral: CBPeripheral,
                           didUpdateNotificationStateFor characteristic: CBCharacteristic,
                           error: Error?) {
        pwLog("notify \(characteristic.uuid.uuidString.suffix(4)) → \(characteristic.isNotifying) error: \(error.map(String.init(describing:)) ?? "nil")")
        // Channel-ready: both the data (…0012) and event (…0013)
        // subscriptions are confirmed — sync may start.
        if let notify = notifyCharacteristic, let event = eventCharacteristic,
           notify.isNotifying, event.isNotifying, !readySignalled {
            readySignalled = true
            pwLog("channel ready")
            delegate?.transportDidBecomeReady(self)
        }
    }
}
