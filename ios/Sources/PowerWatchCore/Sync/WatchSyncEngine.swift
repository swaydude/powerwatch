import Foundation

// T4.1 — the sync orchestration state machine, ported from
// `sdk/protocol/executors/Gen2Ver2SyncExecutorImpl` (the standard sync flow):
//
//     startAmDTP → getLogCount → rtlStatus → rtlTime →
//     activityStart → activityEnd → activityDelta → backgroundLog →
//     [format + persist] → cleanAllLogs → stopAmDTP
//
// Differences from Android, deliberately kept:
// - Persistence happens BEFORE the clean commands (TC-S02: clean only runs
//   after the DB transaction commits; Android cleans after the pull, before
//   formatting).
// - `stopAmDTP` is always sent, success or failure (Android's
//   `onErrorResumeNext(handleSyncError(...))`).
// - No device-info / user-and-goals / trace-log steps: those are pairing
//   concerns (see `PairingFlow`, later) or debug-only.
//
// The engine is transport-agnostic: it speaks `WatchTransport` + `DTPFrame`,
// so the whole flow is testable with a scripted transport (TC-S01–S04
// software half). The on-watch half is TC-S05/S06, hardware-gated.

/// Sync phases, reported through `onPhase`.
public enum SyncPhase: Equatable, Sendable {
    case idle
    case starting
    case countingLogs
    case readingRTL
    case pullingActivity
    case pullingBackground
    case persisting
    case cleaning
    case stopping
    case finished(SyncOutcome)
    case failed(String)
}

/// What a completed sync moved from the watch into the database.
public struct SyncOutcome: Equatable, Sendable {
    public var logsCount: Gen2LogsCount
    public var savedWalking: Int
    public var savedResting: Int
    public var savedSleep: Int
    public var savedSessions: Int

    public init(logsCount: Gen2LogsCount, savedWalking: Int, savedResting: Int,
                savedSleep: Int, savedSessions: Int = 0) {
        self.logsCount = logsCount
        self.savedWalking = savedWalking
        self.savedResting = savedResting
        self.savedSleep = savedSleep
        self.savedSessions = savedSessions
    }
}

public enum SyncError: Error, Equatable {
    case alreadyRunning
    case notConnected
    case unexpectedResponse(String)
    /// No frame at all for `WatchSyncEngine.responseIdleTimeout` — the watch
    /// went silent rather than answering or dropping the link.
    case responseTimeout(Gen2CommandID)
}

/// Orchestrates one full watch sync over a `WatchTransport`.
public final class WatchSyncEngine: WatchTransportDelegate {

    private let transport: WatchTransport
    private let database: PowerWatchDatabase
    private let calendar: Calendar

    /// Phase transitions (UI progress surface).
    public var onPhase: (@Sendable (SyncPhase) -> Void)?

    /// Realtime frames (`9104`) arriving while no request is pending.
    public var onRealtime: (@Sendable (RealtimeData) -> Void)?

    /// Watches seen while the transport scans (T3.1 → pairing UI). The
    /// engine owns the transport delegate, so discovery is re-emitted here.
    public var onDiscover: (@Sendable (DiscoveredWatch) -> Void)?

    /// Transport state changes (connect/bond/UI banners, T6.1).
    public var onTransportState: (@Sendable (TransportState) -> Void)?

    /// Fired when the channel is fully usable (characteristics discovered +
    /// subscriptions confirmed) — the right moment to auto-start a sync.
    public var onReady: (@Sendable () -> Void)?

    /// The watch's battery percent (0–127 wire field) carried in the pulled
    /// background log — feeds the phone-side battery notifications
    /// (Android `RealtimeWatchData.batteryPercent` → `BatteryNotificationCenter`).
    public var onBattery: (@Sendable (Int) -> Void)?

    /// The watch's own running totals (day steps, active calories, sleep,
    /// distance, solar/thermal power, battery, skin temp), delivered by polling
    /// the serial characteristic `00002a25` while the link is up. This is the
    /// only figure the watch face itself shows; DTP `9104` was never observed
    /// answering on real firmware, so without it the app can only show minutes
    /// it reconstructed from logs.
    public var onLiveTotals: (@Sendable (LiveTotals) -> Void)?

    /// Everything one request received.
    struct DTPStream {
        /// The command's data, concatenated across frames.
        let payload: [UInt8]
        /// The status word that closed the exchange (nil when a byte/entry
        /// bound stopped the collection instead).
        let status: ResponseType?
    }

    /// Awaiting one request's response. The watch answers a control command
    /// with a single status frame; a data command answers with one or more
    /// data frames closed by a status frame (Android `readWithAck`'s
    /// `takeUntil { successReceived }`, and `AccumulatedGen2Command` for the
    /// log families, which concatenates frame bodies because a record can
    /// straddle a frame).
    private struct Pending {
        /// Lets the watchdog recognise *its own* exchange: several commands run
        /// back to back, and a stale watchdog must not judge the next one.
        let id = UUID()
        let started = ContinuousClock.now
        let continuation: CheckedContinuation<DTPStream, Error>
        /// `true` = data-read command: keep collecting data frames until the
        /// transfer closes.
        let collecting: Bool
        /// Stop once this many data bytes have arrived (0 = stop at the first
        /// data frame — used for reads whose size the caller can predict).
        let maxBytes: Int
        var frames: [[UInt8]] = []
        var lastActivity = ContinuousClock.now
    }

    /// Hard ceiling on frames per response, so a transfer that never closes
    /// cannot wedge the engine forever.
    static let maxFramesPerResponse = 400

    /// A live watch ACKs within milliseconds and keeps frames flowing through a
    /// log pull, so this much silence means the answer is never coming (Android
    /// stalls on the same order). Without it a silent link left `syncInProgress`
    /// set permanently and every later settings write died on `alreadyRunning`.
    static let responseIdleTimeout: Duration = .seconds(10)

    private var pending: Pending?

    /// Live-totals (`00002a25`) poll loop; cancelled whenever the link dies.
    private var livePollTask: Task<Void, Never>?

    /// Android `RealTimeDataProviderImpl`: `interval(0, 20, SECONDS)`.
    static let livePollNanoseconds: UInt64 = 20_000_000_000
    /// DTP protocol version of the paired watch — the third manufacturer-data
    /// byte of the pairing advertisement. Android gets the same value from
    /// `Gen2DeviceInfoCommand`, and `ExecutorsFactory` chooses the sync flow
    /// with it: 2 → Ver2, 3 → Ver3, ≥4 → Ver4. Real watch (FW v3.01.00) = 4.
    public var protocolVersion = 2

    /// Reports the protocol version the engine settled on, so the app can
    /// cache it (a reconnect sees no advertisement to learn it from).
    public var onProtocolVersionResolved: (@Sendable (Int) -> Void)?

    /// Builds the `9024` user-prefs-and-goals payload. The Ver3/Ver4 sync flow
    /// pushes the profile to the watch before pulling logs (Android
    /// `Gen2SendUserPrefsAndGoalsCommandVer3`), so the engine needs it.
    /// Not `@Sendable`: the app hands over a main-actor-backed builder.
    public var prefsPayloadProvider: (() -> [UInt8])?
    /// Guard so a second `sync()` can't interleave (Android `syncInProgress`).
    private var syncInProgress = false

    public init(transport: WatchTransport, database: PowerWatchDatabase,
                calendar: Calendar = .current) {
        self.transport = transport
        self.database = database
        self.calendar = calendar
    }

    /// Attaches the engine to the transport (idempotent).
    public func start() {
        transport.delegate = self
    }

    // MARK: - The sync flow (T4.1)

    public func sync() async throws -> SyncOutcome {
        guard !syncInProgress else { throw SyncError.alreadyRunning }
        syncInProgress = true
        defer { syncInProgress = false }

        // Android `SyncXExecutor`: the watch's "syncing" animation is driven by
        // the app, not by the session — `ShowSyncAnimationCommand` before the
        // transfer, `HideSyncAnimationCommand` as the last command of the sync.
        // Omitting the hide leaves the watch face showing "syncing" long after
        // `9001` closed the session.
        await sendSetting(DTPSetting.showSyncAnimation)
        do {
            let outcome = try await runSync()
            await sendSetting(DTPSetting.hideSyncAnimation)
            return outcome
        } catch {
            // Android `handleSyncError`: always terminate the AmDTP session,
            // even (especially) after a failure. Best-effort — if the link
            // is gone this throws too, which we swallow.
            phase(.stopping)
            try? await expectSuccess(.stopAmDTP)
            await sendSetting(DTPSetting.hideSyncAnimation)
            phase(.failed(String(describing: error)))
            throw error
        }
    }

    /// Best-effort raw setting write: losing one of these must never fail a
    /// sync, and the watch answers them with nothing we wait for.
    private func sendSetting(_ bytes: [UInt8]) async {
        PowerWatchLog.log("engine: setting \(bytes.map { String(format: "%02x", $0) }.joined())")
        try? await transport.send(bytes)
    }

    /// Runs the sync flow the paired watch's protocol version calls for
    /// (Android `ExecutorsFactory.createSyncExecutor`).
    private func runSync() async throws -> SyncOutcome {
        if protocolVersion < 3 {
            // Android learns the version from `Gen2DeviceInfoCommand`, a
            // firmware-request on the OTA service. Rather than depend on that
            // channel, ask the version-specific count command and read the
            // shape of the answer: the Ver3/Ver4 count block is 24 bytes, the
            // legacy one 28. Cached by the caller, so this costs one command.
            let probe = try await send(.ver3GetLogCount)
            switch probe.payload.count {
            case 24: protocolVersion = 3
            case 28: protocolVersion = 2
            default: break
            }
            PowerWatchLog.log("engine: protocol version probe (body \(probe.payload.count)B) → v\(protocolVersion)")
            onProtocolVersionResolved?(protocolVersion)
        }
        if protocolVersion >= 3 { return try await runModernSync() }
        return try await runLegacySync()
    }

    private func runLegacySync() async throws -> SyncOutcome {

        phase(.starting)
        try await expectSuccess(.startAmDTP)

        phase(.countingLogs)
        let counts = try await request(.getLogCount) {
            $0.isEmpty ? Gen2LogsCount() : try LogParsers.parseLogCount($0)
        }

        phase(.readingRTL)
        // 9107 answers with the timestamp count, 9117 with the timestamps.
        _ = try await request(.rtlStatus) {
            LogParsers.parseRTLStatusCount($0)
        }
        let rtlTimestamps = try await request(.rtlTime) {
            try LogParsers.parseRTLTimes($0)
        }

        phase(.pullingActivity)
        _ = try await request(.activityStartLog) {
            try LogParsers.parseActivityStartLogs($0)
        }
        _ = try await request(.activityEndLog) {
            try LogParsers.parseActivityEndLogs($0)
        }
        _ = try await request(.activityDeltaLog) {
            try LogParsers.parseActivityDeltaLogs($0)
        }

        phase(.pullingBackground)
        let backgroundEntries = try await request(.backgroundLog) {
            try LogParsers.parseBackgroundLogs($0)
        }

        // Correlate the RTL timestamps the background entries reference.
        // RTL times arrive in epoch SECONDS; log entries are epoch millis.
        var rtlByIndex: [Int: Int64] = [:]
        for (i, ts) in rtlTimestamps.enumerated() { rtlByIndex[i] = ts * 1000 }
        let correlated = correlate(backgroundEntries, rtlTimestampsByIndex: rtlByIndex)
        let entries = correlated.entries

        // Latest battery reading in the pull (Android `isBatteryValid`:
        // a zero field means "no reading").
        if let battery = entries.last(where: { $0.battery > 0 })?.battery {
            onBattery?(battery)
        }

        phase(.persisting)
        let formatted = WatchLogFormatters.format(entries)
        try database.upsertWalkingLogs(formatted.walking)
        try database.upsertRestingLogs(formatted.resting)
        try database.upsertSleepLogs(formatted.sleep)

        // Post-sync hour-period formatting (Android `WatchSynchronizerImpl`
        // runs the same chain after the pull): logs → hour periods, stored in
        // the period tables the dashboard reads. Deviation from Android: the
        // lastStoredPeriod merge input is nil — the upsert's INSERT OR REPLACE
        // already collapses re-pulled periods by start time (TC-S04).
        let walkingHours = formatWalkingHourPeriods(formatted.walking, lastStoredPeriod: nil, calendar: calendar)
        let restingHours = formatRestingHourPeriods(formatted.resting, lastStoredPeriod: nil, calendar: calendar)
        let sleepFiveMin = formatSleepFiveMinPeriods(formatted.sleep, lastStoredPeriod: nil, calendar: calendar)
        let sleepHours = formatSleepHourPeriods(sleepFiveMin, calendar: calendar)
        try database.upsertWalkingPeriods(walkingHours)
        try database.upsertRestingPeriods(restingHours)
        try database.upsertSleepPeriods(sleepHours)

        phase(.cleaning)
        // TC-S02: cleaning runs only after the persist above committed — and only
        // when the whole pull was dated. `9023` wipes every log the watch holds,
        // so cleaning an undated block makes those minutes unrecoverable; left on
        // the device they can still be dated by a later sync.
        if correlated.undateable == 0 {
            try await expectSuccess(.cleanAllLogs)
        } else {
            PowerWatchLog.log("engine: \(correlated.undateable) undateable entries left on the watch — cleaning would destroy them")
        }

        phase(.stopping)
        try await expectSuccess(.stopAmDTP)

        let outcome = SyncOutcome(
            logsCount: counts,
            savedWalking: formatted.walking.count,
            savedResting: formatted.resting.count,
            savedSleep: formatted.sleep.count)
        PowerWatchLog.log("engine: sync finished — \(outcome)")
        phase(.finished(outcome))
        return outcome
    }

    /// The Ver3/Ver4 sync flow (`Gen2Ver3SyncExecutorImpl` /
    /// `Gen2Ver4SyncExecutorImpl`), which is what firmware ≥ 3.x speaks —
    /// the real watch's pairing advertisement reports protocol version 4.
    ///
    /// Differences from the legacy flow that matter on hardware:
    /// - the log count comes from `9126` (24-byte answer), not `9116` (28);
    /// - the user/goals handshake (`9124` + `9024`) runs BEFORE any log pull,
    ///   which is what arms the watch's RTL table — reading RTL out of this
    ///   order answers `E200`-only and then every background entry fails its
    ///   timestamp lookup;
    /// - activity logs are one `9215` header block plus one `9205` delta
    ///   block instead of `9115`/`9125`/`9105`;
    /// - `9120`/`9121` trace logs and (v4 only) `9226` error log are read;
    /// - `9015` user location is sent only when a valid fix is stored
    ///   (Android's `isLocationValid` branch) — this port has no location
    ///   source, so it takes the same skip path.
    ///
    /// The log families stream as multiple frames, so they are collected until
    /// the watch closes the transfer (see `Pending`).
    private func runModernSync() async throws -> SyncOutcome {

        phase(.starting)
        try await expectSuccess(.startAmDTP)

        phase(.countingLogs)
        let counts = try await request(.ver3GetLogCount) {
            // A status-only reply means the watch has nothing to report:
            // `extractPayload` returns null for a status frame and Android
            // skips parsing entirely. Empty counts, not an error.
            $0.isEmpty ? Gen2LogsCount() : try LogParsers.parseVer3LogCount($0)
        }

        // Profile handshake before logs (Android `Gen2GetUserAndGoalsCommand
        // Ver3` + `Gen2SendUserPrefsAndGoalsCommandVer3`).
        _ = try await request(.getUserAndGoalsVer3, parse: { $0 })
        try await expectSuccess(.sendUserPrefsAndGoalsVer3,
                               payload: prefsPayloadProvider?() ?? [])

        phase(.readingRTL)
        // `9107` answers one byte per RTL record; `9117` answers the times,
        // which `RTLTimeCommand` zips onto those records (seconds → millis).
        let rtlCount = try await request(.rtlStatus) {
            LogParsers.parseRTLStatusCount($0)
        }
        var rtlTimes = try await request(.rtlTime) {
            try LogParsers.parseRTLTimes($0)
        }

        phase(.pullingActivity)
        // Sessions come from the `9215` header block (start and end markers,
        // paired by activity id) plus the `9205` per-minute deltas between the
        // markers' log indexes — see `ActivitySessionBuilder`. A status-only
        // answer means no sessions, which parses as empty.
        let headerStream = try await send(.activityHeaderLog, collecting: true)
        // The watch sometimes answers `9117` with nothing and hands the times
        // over one exchange late. Recover them before the header bytes are
        // swallowed by the 48-byte record parser.
        if rtlTimes.isEmpty,
           let late = LogParsers.parseLateRTLTimes(headerStream.payload, slots: rtlCount) {
            PowerWatchLog.log("engine: \(late.count) RTL times arrived on the 9215 exchange — used")
            rtlTimes = late
        }
        let headers = try LogParsers.parseVer3ActivityHeaderLogs(headerStream.payload)
        let activityDeltas = try await request(.activityDeltaLogVer3, collecting: true) {
            try LogParsers.parseVer3ActivityDeltaLogs($0)
        }
        let sessions = ActivitySessionBuilder.buildSessions(
            starts: headers.starts, ends: headers.ends, deltas: activityDeltas)

        phase(.pullingBackground)
        // 16 bytes per entry; the watch splits the pull across frames, so stop
        // when the announced count has arrived.
        let backgroundEntries = try await request(.backgroundLog,
                                                 collecting: true,
                                                 maxBytes: counts.backgroundLogs * 16) {
            try LogParsers.parseBackgroundLogs($0)
        }

        // Android caps the zip at the `9107` slot count, but on this firmware the
        // size byte and the time list disagree (real watch 2026-09-24 16:59: size
        // 0, one real time, and every background entry referencing index 0 — so
        // the cap threw the only timestamp away and lost the whole pull). The
        // time list is what actually carries the data and the watch pairs the two
        // positionally, so the list wins — bounded by the 7-bit index span.
        var rtlByIndex: [Int: Int64] = [:]
        for (i, ts) in rtlTimes.prefix(128).enumerated() { rtlByIndex[i] = ts * 1000 }
        let correlated = correlate(backgroundEntries, rtlTimestampsByIndex: rtlByIndex)
        let entries = correlated.entries

        if let battery = entries.last(where: { $0.battery > 0 })?.battery {
            onBattery?(battery)
        }

        phase(.persisting)
        let formatted = WatchLogFormatters.format(entries)
        try database.upsertWalkingLogs(formatted.walking)
        try database.upsertRestingLogs(formatted.resting)
        try database.upsertSleepLogs(formatted.sleep)

        let walkingHours = formatWalkingHourPeriods(formatted.walking, lastStoredPeriod: nil, calendar: calendar)
        let restingHours = formatRestingHourPeriods(formatted.resting, lastStoredPeriod: nil, calendar: calendar)
        let sleepFiveMin = formatSleepFiveMinPeriods(formatted.sleep, lastStoredPeriod: nil, calendar: calendar)
        let sleepHours = formatSleepHourPeriods(sleepFiveMin, calendar: calendar)
        try database.upsertWalkingPeriods(walkingHours)
        try database.upsertRestingPeriods(restingHours)
        try database.upsertSleepPeriods(sleepHours)

        for session in sessions {
            try database.upsertActivitySession(session)
        }

        phase(.cleaning)
        // Same rule as the legacy flow: `9023` wipes the watch's whole log
        // buffer, so it only runs once everything in the pull has been dated and
        // stored. Cleaning an undated block is what lost a 419-step pull on
        // 2026-09-25 — the watch face kept counting, the app could never show it.
        if correlated.undateable == 0 {
            try await expectSuccess(.cleanAllLogs)
        } else {
            PowerWatchLog.log("engine: \(correlated.undateable) undateable entries left on the watch — cleaning would destroy them")
        }
        if protocolVersion >= 4 {
            try await expectSuccess(.errorLog)
        }

        phase(.stopping)
        try await expectSuccess(.stopAmDTP)

        let outcome = SyncOutcome(
            logsCount: counts,
            savedWalking: formatted.walking.count,
            savedResting: formatted.resting.count,
            savedSleep: formatted.sleep.count,
            savedSessions: sessions.count)
        PowerWatchLog.log("engine: sync finished (v\(protocolVersion)) — \(outcome)")
        phase(.finished(outcome))
        return outcome
    }


    /// Pairing provisioning (Android `Gen2Version3PairExecutorImpl
    /// .transferData`): the watch stays in pairing mode until this runs —
    /// start pairing → read current user/goals → push the app's
    /// prefs/goals/user → stop pairing (commits; watch leaves pairing mode).
    /// `userPrefsAndGoals` is the 9024 payload (already built by the caller
    /// via `CommandPayloads.sendUserPrefsAndGoalsVer3`). Deviation from
    /// Android: the leading device-info read is skipped (firmware metadata
    /// only, not pairing-relevant).
    public func provisionPairing(userPrefsAndGoals: [UInt8]) async throws {
        guard !syncInProgress else { throw SyncError.alreadyRunning }
        syncInProgress = true
        defer { syncInProgress = false }
        PowerWatchLog.log("engine: pairing provisioning → 9010")
        try await expectSuccess(.startPairing)
        PowerWatchLog.log("engine: pairing provisioning → 9124 (read)")
        _ = try await request(.getUserAndGoalsVer3, parse: { $0 })
        PowerWatchLog.log("engine: pairing provisioning → 9024 (\(userPrefsAndGoals.count)B)")
        try await expectSuccess(.sendUserPrefsAndGoalsVer3, payload: userPrefsAndGoals)
        PowerWatchLog.log("engine: pairing provisioning → 9011 (commit)")
        try await expectSuccess(.stopPairing)
        PowerWatchLog.log("engine: pairing provisioning complete — watch exits pairing mode")
    }

    /// One-shot command send for the 93xx settings family (Android
    /// `WatchSettingsExecutor`): awaits the watch's ack frame and returns
    /// its payload. Refused while a sync is running (the pending-response
    /// slot is single-flight, like the shared RX notification stream).
    public func sendCommand(_ command: Gen2CommandID, payload: [UInt8] = []) async throws -> [UInt8] {
        guard !syncInProgress else { throw SyncError.alreadyRunning }
        syncInProgress = true
        defer { syncInProgress = false }
        let frame = try await send(command, payload: payload)
        return frame.payload
    }

    // MARK: - Request/response correlation

    /// Sends a command and awaits the next response frame (a pending read
    /// consumes the next RX frame — hardware fact; unsolicited frames route
    /// to `onRealtime`). The response body is the command's raw payload
    /// (responses carry no command id — see `DTPResponse`).
    private func request<T>(_ command: Gen2CommandID,
                            payload: [UInt8] = [],
                            collecting: Bool = false,
                            maxBytes: Int = 0,
                            parse: @escaping ([UInt8]) throws -> T) async throws -> T {
        let stream = try await send(command, payload: payload,
                                    collecting: collecting, maxBytes: maxBytes)
        // Android `extractResponseType` short-circuits a status frame to
        // `onSuccess` BEFORE the command's parser sees any bytes: an
        // `E200`-only answer means "done, nothing to send" (e.g. an empty
        // activity log). Feeding the status bytes to the parser instead fails
        // with a size mismatch.
        return try parse(stream.payload)
    }

    /// Sends a command and requires a success ack. The watch answers control
    /// commands with a status-only frame (`E200` …); a data frame instead is
    /// accepted as an ack (Android would keep waiting for the status, but a
    /// strict reading here is what hung the real watch).
    private func expectSuccess(_ command: Gen2CommandID,
                               payload: [UInt8] = []) async throws {
        let stream = try await send(command, payload: payload)
        guard let type = stream.status else { return }
        if let protocolError = type.protocolError {
            throw SyncError.unexpectedResponse(
                "\(command.rawValue) answered \(type) (\(protocolError))")
        }
    }

    private func send(_ command: Gen2CommandID,
                      payload: [UInt8] = [],
                      collecting: Bool = false,
                      maxBytes: Int = 0) async throws -> DTPStream {
        let frame = DTPFrame(command: command, payload: payload)
        return try await withCheckedThrowingContinuation { continuation in
            let exchange = Pending(continuation: continuation, collecting: collecting, maxBytes: maxBytes)
            pending = exchange
            Task { [weak self] in
                guard let self else { return }
                do {
                    try await self.transport.send(frame.encoded)
                } catch {
                    self.failPending(with: error)
                }
            }
            Task { [weak self] in
                while !Task.isCancelled {
                    try? await Task.sleep(nanoseconds: 500_000_000)
                    guard let self, !Task.isCancelled else { return }
                    switch await self.pendingIdleState(for: exchange.id, started: exchange.started) {
                    case .resolved: return
                    case .waiting: continue
                    case .timedOut:
                        PowerWatchLog.log("engine: \(command.rawValue) silent for \(Self.responseIdleTimeout)")
                        await self.failPending(with: SyncError.responseTimeout(command))
                        return
                    }
                }
            }
        }
    }

    private static func concat(_ frames: [[UInt8]]) -> [UInt8] {
        frames.reduce(into: []) { $0.append(contentsOf: $1) }
    }

    private enum PendingIdleState { case resolved, waiting, timedOut }

    private func pendingIdleState(for id: UUID, started: ContinuousClock.Instant) -> PendingIdleState {
        guard let pending, pending.id == id else { return .resolved }
        let since = max(pending.lastActivity, started)
        return ContinuousClock.now - since > Self.responseIdleTimeout ? .timedOut : .waiting
    }

    private func finishPending(_ pending: Pending, status: ResponseType?) {
        self.pending = nil
        pending.continuation.resume(
            returning: DTPStream(payload: Self.concat(pending.frames), status: status))
    }

    private func failPending(with error: Error) {
        guard let pending else { return }
        self.pending = nil
        pending.continuation.resume(throwing: error)
    }

    /// RTL-correlated log timestamps, plus the count of entries that had no RTL
    /// time for their index. A watch whose RTL table is incomplete cannot date
    /// its background logs — see the note in `LogParsers.assignTimestampsSkippingUndateable`.
    private func correlate(_ entries: [BackgroundLogEntry],
                           rtlTimestampsByIndex: [Int: Int64]) -> (entries: [WatchLogEntry], undateable: Int) {
        let result = LogParsers.assignTimestampsSkippingUndateable(
            entries, rtlTimestampsByIndex: rtlTimestampsByIndex)
        if result.undateable > 0 {
            PowerWatchLog.log("engine: no RTL time for \(result.undateable) of \(entries.count) background entries — dropped")
        }
        return (result.dated, result.undateable)
    }

    private func phase(_ phase: SyncPhase) {
        PowerWatchLog.log("engine: phase → \(phase)")
        onPhase?(phase)
    }

    // MARK: - WatchTransportDelegate

    public func transportStateDidChange(_ transport: WatchTransport, state: TransportState) {
        onTransportState?(state)
        // A dead link must release the awaited response, otherwise the sync
        // task stays suspended forever and `syncInProgress` wedges every later
        // sync/pairing attempt with `.alreadyRunning` (real-watch 2026-09-24).
        switch state {
        case .idle, .unavailable:
            stopLivePolling()
            failPending(with: TransportError.notConnected)
        case .scanning, .connecting, .connected:
            break
        }
    }

    public func transport(_ transport: WatchTransport, didDiscover watch: DiscoveredWatch) {
        onDiscover?(watch)
    }

    public func transportDidBecomeReady(_ transport: WatchTransport) {
        PowerWatchLog.log("engine: transportDidBecomeReady (onReady set: \(onReady != nil))")
        startLivePolling(transport)
        onReady?()
    }

    public func transport(_ transport: WatchTransport, didReceiveLiveData data: [UInt8]) {
        let totals = LogParsers.parseLiveTotals(data)
        PowerWatchLog.log("engine: live totals — \(totals.totalSteps) steps, \(totals.activeCalories) kcal, battery \(totals.batteryPercent)%")
        onLiveTotals?(totals)
    }

    /// Poll the serial characteristic, mirroring Android's 20-second interval
    /// read. The read is fire-and-forget at GATT level; the value arrives via
    /// `transport(_:didReceiveLiveData:)`.
    private func startLivePolling(_ transport: WatchTransport) {
        guard livePollTask == nil else { return }
        livePollTask = Task { [weak transport] in
            while !Task.isCancelled {
                transport?.readLiveData()
                try? await Task.sleep(nanoseconds: Self.livePollNanoseconds)
            }
        }
    }

    private func stopLivePolling() {
        livePollTask?.cancel()
        livePollTask = nil
    }

    public func transport(_ transport: WatchTransport, didReceiveData data: [UInt8]) {
        // Flow control: every frame must be ACKed on the event characteristic,
        // or the watch repeats itself and drops the link after ~10 s (Android
        // `writeAck`). A CRC failure gets the resend ack instead.
        guard let response = try? DTPResponse.decode(data) else {
            transport.sendEvent(DTPAck.crcInvalid)
            PowerWatchLog.log("engine: dropped unframed \(data.count)B frame")
            return
        }
        transport.sendEvent(DTPAck.good)
        guard var pending = pending else {
            if let realtime = try? LogParsers.parseRealtime(response.payload) {
                onRealtime?(realtime)
            }
            return
        }
        if let status = response.status {
            // A status word closes the exchange. `E200` with nothing collected
            // means the watch had nothing to send.
            PowerWatchLog.log("engine: response closed by \(status) after \(pending.frames.count) frame(s)")
            finishPending(pending, status: status)
            return
        }
        pending.frames.append(response.payload)
        pending.lastActivity = .now
        self.pending = pending
        let bytes = pending.frames.reduce(0) { $0 + $1.count }
        let capped = pending.maxBytes > 0 && bytes >= pending.maxBytes
        let tooMany = pending.frames.count >= Self.maxFramesPerResponse
        if !pending.collecting || capped || tooMany {
            finishPending(pending, status: nil)
        }
    }

    public func transport(_ transport: WatchTransport, didReceiveEvent data: [UInt8]) {}
}
