import Foundation
import Combine

/// Drives one watch sync session.
///
/// The order below is the chain in `Gen2Ver4SyncExecutorImpl.create` (selected by
/// `ExecutorsFactory` whenever `protocolVersion != 3`):
///
///   Device Information reads (2a26 / 2a25 / 2a24)   sendAndWait(Gen2DeviceInfoCommand)
///   9000 StartAmDTP
///   [9011 SendUserLocation]                         dropped: Play-Services location
///   9126 GetLogCountVer3
///   9124 GetUserAndGoalsVer3                        ack-only
///   9024 SendUserPrefsAndGoalsVer3 + 93xx settings   before the logs: it carries
///                                                    the clock the RTL decode uses
///   9107 RTLStatus  -> 9117 RTLTime                  must be paired before 9106
///   9215 ActivityHeaderLog
///   9205 ActivityDeltaVer3
///   9106 BackgroundLog
///   [9120 HeaderTraceLog, 9121 AccelDataTraceLog,
///    9226 ErrorLog]                                 dropped: Bugfender diagnostics
///   9023 CleanAllLogs                               opt-in here, see below
///   9001 StopAmDTP                                  also on failure, via
///                                                    onErrorResumeNext { stopSync() }
///
/// `9108 SleepLog` is **not** part of the sequence: `Gen2SleepLogCommand` has no
/// call site anywhere in the DEX and the executor carries a literal
/// `//TODO sleep log command` where it would go. Sleep rows are derived from the
/// background log instead, exactly as `WatchSynchronizerImpl` does when it splits
/// `LogsContainer` into the walking/resting/sleep log tables.
///
/// In the APK the tail of a successful sync was
/// `CloudSynchronizer.syncAllDataToCloud()`; here it is
/// `LocalOnlyCloudAPI.syncAllDataToCloud()`, which only clears local
/// `shouldSend` flags. No bytes leave the device.
@MainActor
final class WatchSynchronizer: ObservableObject {
    enum Phase: String {
        case idle, connecting, readingDevice, countingLogs, readingLogs
        case aggregating, pushingSettings, completed, failed
    }

    @Published private(set) var phase: Phase = .idle
    @Published private(set) var isSyncing = false
    @Published private(set) var progress: Double = 0
    @Published private(set) var statusMessage: String = ""
    @Published private(set) var lastError: String?
    @Published private(set) var lastSyncDate: Date?
    @Published private(set) var dayPeriod: DayPeriod?
    @Published private(set) var hourlyHeartRate: [HourPeriod] = []
    @Published private(set) var sessions: [UserActivitySession] = []
    @Published private(set) var batteryPercent: Int?
    @Published private(set) var realtimeHeartRate: Int?
    @Published private(set) var firmwareVersion: String = ""
    @Published private(set) var deviceSerial: String = ""

    /// `Gen2Ver4SyncExecutorImpl` sends `9023 CleanAllLogs` at the end of *every*
    /// sync. That is only safe once the decoded rows are durably in storage, and it
    /// destroys the watch-side copy, so it is opt-in here instead. Re-syncing
    /// without it is idempotent (`appendBackgroundLogs` de-duplicates by entry id).
    var clearsWatchLogsAfterSync = false

    private let transport: WatchTransport
    private let store: LocalStore
    private let cloud: LocalOnlyCloudAPI
    private let queuer = OperationQueuer()
    private let calendar: Calendar

    init(transport: WatchTransport, store: LocalStore = .shared,
         cloud: LocalOnlyCloudAPI = LocalOnlyCloudAPI(), calendar: Calendar = .current) {
        self.transport = transport
        self.store = store
        self.cloud = cloud
        self.calendar = calendar
    }

    /// `AppEnvironment` owns the single `WatchTransport` callbacks and fans them
    /// out, so the synchronizer must not overwrite them.
    func ingest(heartRate: Int) {
        realtimeHeartRate = heartRate
    }

    func ingest(state: TransportState) {
        absorb(state)
    }

    private func absorb(_ state: TransportState) {
        switch state {
        case .connected(let info):
            firmwareVersion = info.firmware
            deviceSerial = info.serialNumber
        case .disconnected, .failed:
            realtimeHeartRate = nil
        default:
            break
        }
    }

    var isConnected: Bool { transport.isConnected }

    // MARK: - Sync

    /// Serialised through `OperationQueuer` as a `Blocker`, matching
    /// `SyncProcessExecutor` which blocks `Discard` operations (notifications,
    /// setting writes) for the duration of a sync.
    func sync() async {
        await withCheckedContinuation { (continuation: CheckedContinuation<Void, Never>) in
            queuer.enqueue(type: .blocker) {
                await self.runSync()
                continuation.resume()
            }
        }
    }

    private func runSync() async {
        guard !isSyncing else { return }
        isSyncing = true
        lastError = nil
        defer { isSyncing = false }

        do {
            // 1. `sendAndWait(Gen2DeviceInfoCommand)` — plain GATT reads, done
            //    first in the APK, before the DTP session is opened.
            let info: WatchDeviceInfo = try await step(.readingDevice, weight: 0.05, message: "Reading watch information") {
                let read = try await self.transport.readDeviceInfo()
                self.firmwareVersion = read.firmware
                self.deviceSerial = read.serialNumber
                await self.store.updateDevice { device in
                    device.firmwareVersion = read.firmware
                    if !read.serialNumber.isEmpty { device.serialNumber = read.serialNumber }
                }
                return read
            }
            _ = info

            // 2. `9000 StartAmDTP`. The APK's next step is
            //    `Gen2SendUserLocationCommand`, which is skipped here on purpose:
            //    it fed the watch a fix from `LocationInfoProvider`, i.e. the
            //    Google Play Services location client that was removed with the
            //    rest of the network stack.
            try await step(.connecting, weight: 0.12, message: "Starting DTP session") {
                _ = try await self.transport.perform(.startAmDTP)
            }

            // 3. `9126 GetLogCountVer3`. The counts are reported in the UI; the
            //    reads themselves are issued unconditionally (see U-07).
            let counts: Gen2LogsCount = try await step(.countingLogs, weight: 0.2, message: "Counting watch logs") {
                let body = try await self.transport.perform(.getLogCountVer3)
                return Gen2LogsCount.parseVer3(body) ?? Gen2LogsCount()
            }

            // 4. `9124 GetUserAndGoalsVer3` — the watch's copy of the profile,
            //    read immediately before `9024` overwrites it. The command has no
            //    payload and no `extractResponse`, so this is an ack exchange.
            try await step(.pushingSettings, weight: 0.26, message: "Reading watch profile") {
                _ = try await self.transport.perform(.getUserAndGoalsVer3)
            }

            // 5. `9024 SendUserPrefsAndGoalsVer3` + the `93xx` block. Position
            //    matters: `9024` carries the epoch and timezone the watch sets its
            //    clock from, and the RTL decode is anchored to that clock, so the
            //    APK pushes it *before* reading any logs.
            try await step(.pushingSettings, weight: 0.34, message: "Sending goals and settings") {
                try await self.pushSettings()
            }

            // 6/7. `9107 RTLStatus` then `9117 RTLTime` — must be paired, the
            //      background log decodes its timestamps from them.
            let rtl: RTLTable = try await step(.readingLogs, weight: 0.44, message: "Reading realtime clock") {
                _ = try await self.transport.perform(.rtlStatus)
                let body = try await self.transport.perform(.rtlTime)
                return RTLTable.parseTime(body)
            }

            // 8/9/10. `9215` headers, `9205` deltas, `9106` background log.
            let headers: [ActivityHeaderDecoder.Marker] = try await step(.readingLogs, weight: 0.54, message: "Reading activity headers (\(counts.activityHeaderLogs))") {
                let body = try await self.transport.perform(.activityHeaderLog)
                return ActivityHeaderDecoder.parse(aligned(body, to: ActivityHeaderDecoder.recordSize))
            }

            let deltas: [ActivityDeltaDecoder.Record] = try await step(.readingLogs, weight: 0.66, message: "Reading activity deltas (\(counts.activityDeltaLogs))") {
                let body = try await self.transport.perform(.activityDeltaVer3)
                return ActivityDeltaDecoder.parse(aligned(body, to: ActivityDeltaDecoder.recordSize))
            }

            let logs: [BackgroundLogEntry] = try await step(.readingLogs, weight: 0.84, message: "Reading activity log (\(counts.backgroundLogs))") {
                let body = try await self.transport.perform(.backgroundLog)
                guard let decoded = BackgroundLogDecoder.parse(aligned(body, to: BackgroundLogDecoder.recordSize), rtl: rtl) else {
                    throw Gen2ProtocolError.parsing("background log size mismatch (\(body.count) bytes)")
                }
                if let latest = decoded.last?.battery, latest > 0 { self.batteryPercent = latest }
                return decoded
            }

            // `reformatDataLogs` in the executor, then the `*HourPeriodFormatter`
            // trio and `RunningSessionActivityFormatter` in `WatchSynchronizerImpl`.
            try await step(.aggregating, weight: 0.9, message: "Aggregating day") {
                let hours = PeriodAggregator.hourPeriods(from: logs, calendar: self.calendar)
                let day = PeriodAggregator.dayPeriod(from: hours)
                let sessions = PeriodAggregator.sessions(headers: headers, deltas: deltas)

                self.dayPeriod = day
                self.hourlyHeartRate = hours
                self.sessions = sessions

                await self.store.appendBackgroundLogs(logs)
                await self.store.replaceHourPeriods(hours)
                await self.store.replaceActivityLogs(PeriodAggregator.activityLogs(from: logs, calendar: self.calendar))
                if !sessions.isEmpty { await self.store.saveActivitySessions(sessions) }
                await self.store.updateNotifications { prefs in
                    if let battery = self.batteryPercent { prefs.lastBatteryLevel = Float(battery) }
                }
            }

            // 13. `9023 CleanAllLogs`. The APK issues this unconditionally at the
            //     end of every sync, which is safe for it because the decoded logs
            //     are already in Room. It is opt-in here so a decode bug cannot
            //     destroy the only copy of the data; re-reads are idempotent
            //     because `appendBackgroundLogs` de-duplicates by entry id.
            if clearsWatchLogsAfterSync {
                _ = try await self.transport.perform(.cleanAllLogs)
                await self.store.clearBackgroundLogs()
            }

            // 15. `9001 StopAmDTP` — on the success path too, not just on error.
            _ = try? await self.transport.perform(.stopAmDTP)

            await self.cloud.syncAllDataToCloud()
            self.lastSyncDate = Date()
            self.phase = .completed
            self.progress = 1
            self.statusMessage = "Synced"
        } catch {
            self.lastError = error.localizedDescription
            self.phase = .failed
            self.statusMessage = error.localizedDescription
            // `onErrorResumeNext { stopSync() }` — always try to leave the watch
            // in a sane state.
            _ = try? await transport.perform(.stopAmDTP)
        }

        // `MainActivityViewModel.onResume` / post-sync trigger a cloud pass; the
        // local implementation only reconciles flags.
        await cloud.syncAllDataToCloud()
    }

    /// Pushes the phone-side authoritative profile to the watch. The APK does
    /// this with `9024` plus the individual `93xx` setting writes; the phone is
    /// the source of truth because the watch has no way to edit them.
    func pushSettings() async throws {
        guard let user = await store.user() else { throw SyncError.noUser }
        let goals = await store.goals()
        let settings = await store.watchSettings()

        _ = try await transport.perform(.sendUserPrefsAndGoalsVer3(
            user: user, goals: goals, settings: settings
        ))
        _ = try await transport.perform(.sendBiometrics(user: user))
        _ = try await transport.perform(.sendLanguage(user.language))
        _ = try await transport.perform(.sendStepsDistanceGoal(steps: goals.steps, distance: goals.distance))
        _ = try await transport.perform(.sendCaloriesSleepGoal(calories: goals.calories, sleepMinutes: goals.sleep))

        for command in settingsCommands(settings) {
            _ = try await transport.perform(command)
        }
    }

    func settingsCommands(_ settings: WatchSettings) -> [Gen2Command] {
        [
            Gen2Command.setSetting(Gen2Opcode.settingDND, settings.dnd.rawValue),
            Gen2Command.setSetting(Gen2Opcode.settingBackLight, settings.backlight.rawValue),
            Gen2Command.setSetting(Gen2Opcode.settingBackLightDuration, settings.backlightDuration.rawValue),
            Gen2Command.setSetting(Gen2Opcode.settingPopupDuration, settings.popupDuration.rawValue),
            Gen2Command.setSetting(Gen2Opcode.settingGPSUpdateRate, settings.gpsUpdateRate.rawValue),
            Gen2Command.setSetting(Gen2Opcode.settingHomeScreen, settings.homeScreen.rawValue),
            Gen2Command.setSetting(Gen2Opcode.settingBLEDisconnection, settings.bleDisconnection.rawValue),
            Gen2Command.setSetting(Gen2Opcode.settingRingtone, settings.ringtone.rawValue),
            Gen2Command.setSetting(Gen2Opcode.settingAlertType, settings.alertType.rawValue),
            Gen2Command.setAlarm(settings.alarm)
        ]
    }

    /// Send a single watch-settings write (used by the settings screens).
    func apply(_ command: Gen2Command) async throws {
        try await withCheckedThrowingContinuation { (continuation: CheckedContinuation<Void, Error>) in
            queuer.enqueue(type: .discard) {
                do {
                    _ = try await self.transport.perform(command)
                    continuation.resume(returning: ())
                } catch {
                    continuation.resume(throwing: error)
                }
            }
        }
    }

    /// Trims a stream that ended mid-record, mirroring the
    /// `AccumulatedGen2Command` leftover handling.
    private func aligned(_ body: [UInt8], to recordSize: Int) -> [UInt8] {
        guard recordSize > 0 else { return body }
        let usable = (body.count / recordSize) * recordSize
        return Array(body.prefix(usable))
    }

    private func step<T>(_ phase: Phase, weight: Double, message: String,
                        _ work: () async throws -> T) async throws -> T {
        self.phase = phase
        self.statusMessage = message
        self.progress = weight
        return try await work()
    }

    enum SyncError: LocalizedError {
        case noUser, notConnected
        var errorDescription: String? {
            switch self {
            case .noUser: return "Create a profile before syncing."
            case .notConnected: return "Your watch is not connected."
            }
        }
    }
}
