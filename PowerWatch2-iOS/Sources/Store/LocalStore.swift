import Foundation

/// Local persistence. This is the iOS counterpart of the Room database
/// `PowerWatchDB` (schema version 23, identityHash
/// `7eea0e60d59cd2ba54d78e05b0b90fa3`) in `shared/data/db/RoomDB_Impl.java`.
///
/// The Android build treated Room as the source of truth for anything created on
/// the phone: `BaseLogRepositoryImpl.save` marked rows `shouldSend = true` and
/// wrote them with `dao.saveCompletable(...)`, and the upload was a *separate*
/// chain (`getSaveCloudCompletable` → `walkingLogCloudService.saveAllWalkingLogs`)
/// whose failure was swallowed by an empty `logUploadFailedError()`. The two
/// cloud-first read paths (`GoalConfigurationRepositoryImpl.all`,
/// `UserAccountRepositoryImpl.getFirst`) fell back to the DAO with
/// `onErrorResumeNext { dao.all() }`, and `DeviceRepositoryImpl` carried the
/// comment "be sure to store it in local cache even if error occurs". With the
/// cloud removed, this store is simply the only store.
///
/// Format: **one** `snapshot.json` document in Application Support holding the
/// `Snapshot` below, chosen over Core Data/SwiftData so the mapping to the
/// recovered `CREATE TABLE` statements stays readable in one file. `Snapshot`
/// covers the same ground as the 14 Room entities with two deliberate
/// consolidations:
///
/// - `RestingLog`/`SleepLog`/`WalkingLog` and `RestingHourPeriod`/
///   `SleepHourPeriod`/`WalkingHourPeriod` are single collections carrying a state
///   discriminator (`BackgroundLogEntry.logType`, `HourPeriod.state`) instead of
///   three tables each; `PeriodAggregator` groups by (start of hour, state), which
///   is what the three-way split encoded.
/// - The `notSynced*` columns (`notSyncedLogs`, `notSyncedSessions`, …) are gone:
///   they existed only to select rows for `CloudSynchronizer`, which no longer
///   exists. `PasswordCredentials` became `KeychainStore`, and `User.password` is
///   no longer persisted.
///
/// `DefaultPhoneWatch`, `UpdateInfo` and `Device` are represented by
/// `PairedDevice`/`FirmwareUpdateInfo`; the derived day/week/month figures are
/// still computed rather than stored, because the schema has no period table for
/// them.
actor LocalStore {
    static let shared = LocalStore()

    private let directory: URL
    private var cache: Snapshot
    private let encoder: JSONEncoder
    private let decoder = JSONDecoder()

    struct Snapshot: Codable {
        var user: UserAccount?
        var device: PairedDevice?
        var goals: GoalConfiguration = GoalConfiguration()
        var backgroundLogs: [BackgroundLogEntry] = []
        var activityLogs: [ActivityLogEntry] = []
        var hourPeriods: [HourPeriod] = []
        var activitySessions: [UserActivitySession] = []
        var activityDates: [UserActivityDate] = []
        var updateInfo: FirmwareUpdateInfo?
        var watchSettings: WatchSettings = WatchSettings()
        var notifications: NotificationPreferences = NotificationPreferences()
        var allowList: NotificationAllowList = NotificationAllowList()
        var onboardingComplete: Bool = false
        var pairedAt: Date? = nil
    }

    init(directory: URL? = nil) {
        let base = directory
            ?? FileManager.default.urls(for: .applicationSupportDirectory, in: .userDomainMask)[0]
                .appendingPathComponent("PowerWatchDB", isDirectory: true)
        self.directory = base
        self.cache = Snapshot()
        self.encoder = JSONEncoder()
        self.encoder.outputFormatting = [.sortedKeys]
        self.encoder.dateEncodingStrategy = .iso8601
        self.decoder.dateDecodingStrategy = .iso8601
        try? FileManager.default.createDirectory(at: base, withIntermediateDirectories: true)
        Self.applyProtection(to: base)
        switch Self.load(from: base, decoder: decoder) {
        case .missing:
            self.cache = Snapshot()
        case .unreadable:
            // The file is there and we could not read or decode it. Loading an empty
            // cache is fine for this session; writing it back would replace the user's
            // history with nothing, so persistence stays off until the file is fixed or
            // removed (L6, and the locked-device case of `applyProtection`).
            self.cache = Snapshot()
            self.persistenceBlocked = true
            NSLog("pw2-store snapshot is present but unreadable; persistence paused")
        case let .decoded(snapshot):
            self.cache = snapshot
        }
    }

    /// True while on-disk writes are suppressed — see `init`.
    private(set) var persistenceBlocked = false
    /// Last error from a snapshot write, for diagnostics and tests (L6).
    private(set) var lastPersistenceError: Error?

    private enum LoadResult {
        case missing
        case unreadable
        case decoded(Snapshot)
    }

    /// Health and profile data at rest. `completeUnlessOpen` rather than `complete`
    /// because the transport keeps running under `bluetooth-central`: a handle opened
    /// before the lock keeps working, while a fresh open on a locked device fails — and
    /// `persistenceBlocked` is what stops that failure from being answered with an
    /// overwrite (M2).
    private nonisolated static func applyProtection(to url: URL) {
        try? FileManager.default.setAttributes(
            [.protectionKey: FileProtectionType.completeUnlessOpen], ofItemAtPath: url.path)
    }

    private nonisolated static func load(from dir: URL, decoder: JSONDecoder) -> LoadResult {
        let url = dir.appendingPathComponent("snapshot.json")
        guard FileManager.default.fileExists(atPath: url.path) else { return .missing }
        guard let data = try? Data(contentsOf: url) else { return .unreadable }
        guard let decoded = try? decoder.decode(Snapshot.self, from: data) else { return .unreadable }
        return .decoded(decoded)
    }

    private func persist() {
        guard !persistenceBlocked else { return }
        let url = directory.appendingPathComponent("snapshot.json")
        guard let data = try? encoder.encode(cache) else { return }
        do {
            try data.write(to: url, options: .atomic)
            // An atomic write lands as a new file, so protection is applied to the
            // result rather than relying on the directory's.
            Self.applyProtection(to: url)
            lastPersistenceError = nil
        } catch {
            lastPersistenceError = error
            NSLog("pw2-store snapshot write failed: %@", error.localizedDescription)
        }
    }

    // MARK: Account

    func user() -> UserAccount? { cache.user }

    func save(user: UserAccount) {
        // Normalise defensively: the secret belongs to the keychain, so it must
        // not survive in the actor's cache either (see `UserAccount.password`).
        var persisted = user
        persisted.password = ""
        cache.user = persisted
        persist()
    }

    func clearUser() {
        cache.user = nil
        persist()
    }

    var isOnboardingComplete: Bool { cache.onboardingComplete }
    func setOnboardingComplete(_ value: Bool) {
        cache.onboardingComplete = value
        persist()
    }

    // MARK: Device

    func device() -> PairedDevice? { cache.device }
    func pairedAt() -> Date? { cache.pairedAt }

    func save(device: PairedDevice) {
        cache.device = device
        cache.pairedAt = Date()
        persist()
    }

    func updateDevice(_ transform: (inout PairedDevice) -> Void) {
        guard var d = cache.device else { return }
        transform(&d)
        cache.device = d
        persist()
    }

    /// `UnpairAction.unpair` / `unpairAndReset`.
    func unpairDevice(clearLogs: Bool) {
        cache.device = nil
        cache.pairedAt = nil
        if clearLogs {
            clearAllActivityData()
        }
        discardUnreadableSnapshot()
        persist()
    }

    // MARK: Goals

    func goals() -> GoalConfiguration { cache.goals }

    func save(goals: GoalConfiguration) {
        cache.goals = goals
        persist()
    }

    func updateGoals(_ transform: (inout GoalConfiguration) -> Void) {
        transform(&cache.goals)
        persist()
    }

    // MARK: Logs

    func backgroundLogs() -> [BackgroundLogEntry] { cache.backgroundLogs }

    func appendBackgroundLogs(_ logs: [BackgroundLogEntry]) {
        let existing = Set(cache.backgroundLogs.map(\.id))
        cache.backgroundLogs.append(contentsOf: logs.filter { !existing.contains($0.id) })
        cache.backgroundLogs.sort { $0.startTime < $1.startTime }
        persist()
    }

    func activityLogs() -> [ActivityLogEntry] { cache.activityLogs }

    func replaceActivityLogs(_ logs: [ActivityLogEntry]) {
        cache.activityLogs = logs.sorted { $0.startTime < $1.startTime }
        persist()
    }

    func appendActivityLogs(_ logs: [ActivityLogEntry]) {
        let existing = Set(cache.activityLogs.map(\.id))
        cache.activityLogs.append(contentsOf: logs.filter { !existing.contains($0.id) })
        cache.activityLogs.sort { $0.startTime < $1.startTime }
        persist()
    }

    func hourPeriods() -> [HourPeriod] { cache.hourPeriods }

    func replaceHourPeriods(_ periods: [HourPeriod]) {
        var byID: [String: HourPeriod] = [:]
        for p in periods { byID[p.id] = p }
        cache.hourPeriods = byID.values.sorted { $0.startTime < $1.startTime }
        persist()
    }

    /// `CleanAllLogsCommand` (9023) equivalent: the watch clears its logs after
    /// a successful transfer, so the phone keeps only derived data.
    func clearBackgroundLogs() {
        cache.backgroundLogs = []
        persist()
    }

    // MARK: Activity sessions

    func activitySessions() -> [UserActivitySession] { cache.activitySessions }

    func activitySession(id: String) -> UserActivitySession? {
        cache.activitySessions.first { $0.id == id }
    }

    func activitySessions(on day: Date, calendar: Calendar = .current) -> [UserActivitySession] {
        cache.activitySessions
            .filter { calendar.isDate($0.startTime, inSameDayAs: day) }
            .sorted { $0.startTime < $1.startTime }
    }

    func saveActivitySessions(_ sessions: [UserActivitySession]) {
        var byID: [String: UserActivitySession] = [:]
        for s in cache.activitySessions { byID[s.id] = s }
        for s in sessions { byID[s.id] = s }
        cache.activitySessions = byID.values.sorted { $0.startTime < $1.startTime }
        rebuildActivityDates()
        persist()
    }

    func updateActivitySession(_ session: UserActivitySession) {
        guard let idx = cache.activitySessions.firstIndex(where: { $0.id == session.id }) else { return }
        cache.activitySessions[idx] = session
        rebuildActivityDates()
        persist()
    }

    /// `UserActivitySessionRepository.delete` -> `/pwuser/activitySession/delete`
    /// in the cloud build; local-only here.
    func deleteActivitySession(id: String) {
        cache.activitySessions.removeAll { $0.id == id }
        rebuildActivityDates()
        persist()
    }

    func activityDates() -> [UserActivityDate] { cache.activityDates }

    func hasActivity(on day: Date, calendar: Calendar = .current) -> Bool {
        cache.activityDates.contains { calendar.isDate($0.startTime, inSameDayAs: day) }
    }

    private func rebuildActivityDates() {
        let cal = Calendar.current
        let days = Set(cache.activitySessions.map { cal.startOfDay(for: $0.startTime) })
        cache.activityDates = days.map(UserActivityDate.init(startTime:)).sorted { $0.startTime < $1.startTime }
    }

    // MARK: Firmware

    func updateInfo() -> FirmwareUpdateInfo? { cache.updateInfo }
    func save(updateInfo: FirmwareUpdateInfo) {
        cache.updateInfo = updateInfo
        persist()
    }

    // MARK: Settings

    func watchSettings() -> WatchSettings { cache.watchSettings }
    func updateWatchSettings(_ transform: (inout WatchSettings) -> Void) {
        transform(&cache.watchSettings)
        persist()
    }

    func notifications() -> NotificationPreferences { cache.notifications }
    func updateNotifications(_ transform: (inout NotificationPreferences) -> Void) {
        transform(&cache.notifications)
        persist()
    }

    func allowList() -> NotificationAllowList { cache.allowList }
    func updateAllowList(_ transform: (inout NotificationAllowList) -> Void) {
        transform(&cache.allowList)
        persist()
    }

    // MARK: Wipe paths

    /// Mirrors `DBManager.clearBackgroundAndActivityLogsCompletable` used by
    /// logout.
    func clearAllActivityData() {
        cache.backgroundLogs = []
        cache.activityLogs = []
        cache.hourPeriods = []
        cache.activitySessions = []
        cache.activityDates = []
        discardUnreadableSnapshot()
        persist()
    }

    /// Full local logout: wipes user + activity data, keeps nothing cloud-side
    /// because there is nothing cloud-side.
    func logout() {
        cache.user = nil
        cache.device = nil
        cache.pairedAt = nil
        cache.goals = GoalConfiguration()
        cache.backgroundLogs = []
        cache.activityLogs = []
        cache.hourPeriods = []
        cache.activitySessions = []
        cache.activityDates = []
        cache.watchSettings = WatchSettings()
        cache.notifications = NotificationPreferences()
        cache.onboardingComplete = false
        discardUnreadableSnapshot()
        persist()
    }

    /// Wipe paths have to actually erase. When the snapshot was readable the atomic
    /// write that follows replaces it; when it was not — which is precisely why
    /// persistence is paused — deleting is still possible, and the delete lifts the
    /// pause so the emptied state reaches disk instead of leaving the old file (M1).
    private func discardUnreadableSnapshot() {
        guard persistenceBlocked else { return }
        let url = directory.appendingPathComponent("snapshot.json")
        do {
            try FileManager.default.removeItem(at: url)
            persistenceBlocked = false
            lastPersistenceError = nil
        } catch {
            lastPersistenceError = error
            NSLog("pw2-store could not remove the unreadable snapshot: %@", error.localizedDescription)
        }
    }
}
