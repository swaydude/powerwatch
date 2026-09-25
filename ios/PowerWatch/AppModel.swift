import Foundation
import PowerWatchCore
import Observation

/// Root observable model. Offline by construction: no network client exists
/// in this app target (TC-R02 zero-network audit). All state lives in the
/// local GRDB database ported from the Android Room schema (T2.2).
@MainActor
@Observable
final class AppModel {

    // MARK: State

    let database: PowerWatchDatabase

    /// Phone-side notifications (Android `NotificationManager` + switches).
    let notifications = NotificationController()

    private(set) var user: User?
    private(set) var goals: GoalConfiguration
    private(set) var device: Device?
    private(set) var isOnboarded: Bool

    /// Snapshot of the dashboard aggregates for today.
    private(set) var summary: DashboardSummary?

    /// Called after a sync commits so views can refresh (dashboard reload).
    var onDataChanged: (() -> Void)?

    init(database: PowerWatchDatabase = AppModel.openDatabase()) {
        let storedUser = try? database.fetchUser()
        let storedGoals = (try? database.fetchLatestGoal()) ?? GoalConfiguration()
        let storedDevice = try? database.fetchDevice()
        self.database = database
        self.user = storedUser
        self.goals = storedGoals
        self.device = storedDevice
        self.isOnboarded = storedUser != nil
        migrateLegacyJSONStoreIfNeeded()
        loadDashboard()
    }

    /// App-support database; wiped on `-uitest-reset`; `-uitest-seed` also
    /// inserts a day of fixture logs so the dashboard shows real numbers.
    /// Set once the invented-timestamp rows have been cleared (see `init`).
    private static let logPurgeKey = "db.purge.emptyRTLLogs.v1"

    /// One-time repair: background logs pulled while the watch's RTL table was
    /// empty were stored with invented timestamps, which filed other days'
    /// activity under today. Those rows cannot be told apart from real ones
    /// afterwards, so the log tables start clean and refill from logs the watch
    /// timestamped itself. Runs before the UI-test seeding.
    nonisolated static func purgeInventedLogRowsIfNeeded(_ database: PowerWatchDatabase) {
        guard !UserDefaults.standard.bool(forKey: logPurgeKey) else { return }
        if let removed = try? database.purgeLogTables(), removed > 0 {
            PowerWatchLog.log("db: purged \(removed) rows dating from the empty-RTL fallback")
        }
        UserDefaults.standard.set(true, forKey: logPurgeKey)
    }

    nonisolated static func openDatabase() -> PowerWatchDatabase {
        let args = CommandLine.arguments
        let base = FileManager.default.urls(for: .applicationSupportDirectory, in: .userDomainMask)[0]
        let url = base.appendingPathComponent("powerwatch.sqlite")
        if args.contains("-uitest-reset") {
            try? FileManager.default.removeItem(at: url)
            LocalStore.deleteSaved()   // legacy JSON too, or migration restores it
            // The watch-settings file lives beside the database and is read when
            // the settings tab builds its state — leave it and pickers start on
            // the value a previous run saved, so their `.onChange` never fires.
            try? FileManager.default.removeItem(at: WatchSettingsState.url)
        }
        do {
            let db = try PowerWatchDatabase(path: url.path)
            purgeInventedLogRowsIfNeeded(db)   // before seeding, so fixtures survive
            if args.contains("-uitest-seed") {
                try DashboardFixtures.seedToday(db)
            }
            return db
        } catch {
            // Unwritable storage still yields a working (in-memory) app.
            return try! PowerWatchDatabase()
        }
    }

    /// One-time import from the phase-0 JSON store (before the GRDB port).
    private func migrateLegacyJSONStoreIfNeeded() {
        guard user == nil else { return }
        let legacy = LocalStore.load()
        guard let legacyUser = legacy.user else { return }
        user = legacyUser
        device = legacy.device
        try? database.upsertUser(legacyUser)
        if let legacyGoals = legacy.goals { try? database.upsertGoal(legacyGoals) }
        if let legacyDevice = legacy.device { try? database.upsertDevice(legacyDevice) }
        isOnboarded = true
    }

    // MARK: Onboarding

    func completeOnboarding(user: User, goals: GoalConfiguration) {
        self.user = user
        self.goals = goals
        self.isOnboarded = true
        try? database.upsertUser(user)
        try? database.upsertGoal(goals)
    }

    func updateGoals(_ goals: GoalConfiguration) {
        self.goals = goals
        try? database.upsertGoal(goals)
    }

    /// Personal-settings save (Android `PersonalSettingsFragment`): biometric
    /// edits persist locally and are pushed to the watch by the caller
    /// (9012 biometrics / 9024 bulk prefs).
    func updateUser(_ user: User) {
        self.user = user
        try? database.upsertUser(user)
        loadDashboard()
    }

    /// Unpair: forget the watch locally (Android `UnpairDialogFragment`;
    /// the bond itself is removed in iOS Settings ▸ Bluetooth).
    func removeDevice() {
        device = nil
        try? database.deleteDevice()
    }

    /// A watch connected for the first time — record it as the paired device
    /// (serial/firmware fill in from the device-info read during a real sync).
    func attachDevice(_ watch: DiscoveredWatch) {
        guard device == nil else { return }
        let record = Device(
            productName: watch.name.isEmpty ? "MATRIX Watch" : watch.name,
            bluetoothAddress: watch.id.uuidString,
            shouldSync: false)
        device = record
        try? database.upsertDevice(record)
    }

    // MARK: Watch payloads

    /// The 9024 bulk payload (clock/units/language + biometrics + goals)
    /// shared by the watch-settings send-all and pairing provisioning
    /// (Android packs the same block on `Gen2SendUserPrefsAndGoalsVer3`).
    func userPrefsAndGoalsPayload() -> [UInt8] {
        let settings = WatchSettingsState.load()
        let user = self.user
        let now = Date()
        return CommandPayloads.sendUserPrefsAndGoalsVer3(
            hourFormat: settings.hourFormat,
            metricUnits: settings.units == .metric,
            unixSeconds: UInt32(now.timeIntervalSince1970),
            utcOffsetMinutes: Int16(TimeZone.current.secondsFromGMT(for: now) / 60),
            gender: user?.gender ?? .male,
            age: UInt8(clamping: user?.age ?? 30),
            weightKg: Int16(clamping: Int(user?.weight ?? 75)),
            heightCm: Int16(clamping: Int(user?.height ?? 175)),
            stepsGoal: Int32(goals.steps),
            distanceGoal: Int32(clamping: Int(goals.distance)),
            caloriesGoal: Int32(goals.calories),
            sleepGoalMinutes: Int32(goals.sleep),
            locale: settings.locale,
            sleepTimeSelection: 0)
    }

    // MARK: Dashboard

    /// Recomputes `summary` for today from the log tables through the period
    /// pipeline (T2.4). Called after sync, goal edits and data changes.
    func loadDashboard() {
        summary = DashboardSummary(
            goals: goals,
            database: database,
            calendar: .current)
        // Goal-achieved notifications compare the day's totals with the goals
        // (Android `BatteryNotificationCenter` uses the realtime day totals).
        if let summary {
            notifications.goalsAchieved(
                summary: summary, goals: goals,
                imperialUnits: user?.accountSettings.unitType == .imperial)
        }
        onDataChanged?()
    }

    // MARK: Derived formatting (dashboard tiles)

    var distanceText: String {
        let km = Double(goals.distance) / 1000.0
        if user?.accountSettings.unitType == .imperial {
            return String(format: "%.2f mi", km * 0.621371)
        }
        return String(format: "%.2f km", km)
    }

    var heightText: String {
        guard let height = user?.height, height > 0 else { return "—" }
        if user?.accountSettings.unitType == .imperial {
            let inches = Double(height) / 2.54
            return String(format: "%.0f\"", inches)
        }
        return "\(height) cm"
    }

    var sleepGoalText: String {
        let hours = goals.sleep / 60
        let minutes = goals.sleep % 60
        return String(format: "%d:%02d", hours, minutes)
    }
}
