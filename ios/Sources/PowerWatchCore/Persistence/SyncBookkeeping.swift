import Foundation
import GRDB

// Local-only port of Android's `shouldSync` / `shouldSend` dirty-flag
// bookkeeping (UserAccountRepositoryImpl, DeviceRepositoryImpl,
// GoalConfigurationRepositoryImpl, UserActivitySessionRepositoryImpl and the
// `SaveSync` interface on the log models).
//
// Android semantics: every repository write goes through a cloud service
// first — on success the row is persisted with the flag cleared, on failure
// (or when the cloud step is skipped) the row is persisted with the flag SET,
// marking it "pending upload". A later sync pass picks the flagged rows back
// up (`getNotRegisteredDevices`, `notSyncedSessions`, `getShouldSyncDevice`).
//
// This port is offline by design (TC-R02): there is no cloud step, so every
// write takes the "failure" branch and lands dirty. `SyncBookkeeper` keeps
// the same state machine — writes mark records dirty, `markSynced(_:)` clears
// the flags in one transaction (the local equivalent of a completed upload,
// e.g. after an export) — without ever touching the network.

/// Which record family a dirty flag belongs to.
public enum SyncedRecordKind: String, CaseIterable, Sendable {
    case user
    case device
    case goalConfiguration
    case activitySession
    case walkingLogs
    case restingLogs
    case sleepLogs

    /// The table + flag column the kind maps to.
    var tableAndFlag: (table: String, column: String) {
        switch self {
        case .user: return ("User", "shouldSync")
        case .device: return ("Device", "shouldSync")
        case .goalConfiguration: return ("GoalConfiguration", "shouldSync")
        case .activitySession: return ("UserActivitySession", "shouldSend")
        case .walkingLogs: return ("WalkingLog", "shouldSend")
        case .restingLogs: return ("RestingLog", "shouldSend")
        case .sleepLogs: return ("SleepLog", "shouldSend")
        }
    }
}

/// Snapshot of the dirty-flag state across all record kinds.
public struct SyncStatus: Equatable, Sendable {
    /// Number of pending records per kind (kinds with none are omitted).
    public var pending: [SyncedRecordKind: Int]

    public init(pending: [SyncedRecordKind: Int] = [:]) {
        self.pending = pending
    }

    /// True when any record is waiting to be marked synced.
    public var isDirty: Bool { !pending.isEmpty }

    public var totalPending: Int { pending.values.reduce(0, +) }
}

/// The dirty-flag state machine, replacing Android's CloudSynchronizer-driven
/// flow with a purely local one:
///
///     write ──► dirty ──(markSynced)──► clean
///
/// There is no transition back to clean on its own: offline, nothing clears a
/// flag except an explicit `markSynced(_:)` call.
public final class SyncBookkeeper {

    private let database: PowerWatchDatabase

    public init(database: PowerWatchDatabase) {
        self.database = database
    }

    // MARK: - Dirty writes (Android's onErrorResumeNext path)

    /// Persists a user with `shouldSync = true` — the branch Android takes
    /// when `userAccountCloudService.updateUser` fails, i.e. always offline.
    public func saveUserDirty(_ user: User) throws {
        var dirty = user
        dirty.shouldSync = true
        try database.upsertUser(dirty)
    }

    /// Persists a device with `shouldSync = true` (registerDevice failed).
    public func saveDeviceDirty(_ device: Device) throws {
        var dirty = device
        dirty.shouldSync = true
        try database.upsertDevice(dirty)
    }

    /// Persists a device with `shouldSync = false` — Android's success path
    /// after `registerDevice` completes. Used when the device has been fully
    /// processed locally (e.g. pairing finished).
    public func saveDeviceRegistered(_ device: Device) throws {
        var clean = device
        clean.shouldSync = false
        try database.upsertDevice(clean)
    }

    /// Persists a goal configuration with `shouldSync = true`.
    public func saveGoalDirty(_ goal: GoalConfiguration) throws {
        var dirty = goal
        dirty.shouldSync = true
        try database.upsertGoal(dirty)
    }

    /// Persists an activity session with `shouldSend = true`
    /// (saveUserActivities failed).
    public func saveActivitySessionDirty(_ session: UserActivitySessionRecord) throws {
        var dirty = session
        dirty.shouldSend = true
        try database.upsertActivitySession(dirty)
    }

    // MARK: - Pending queries (Android's flag-based re-sync selectors)

    /// Android `UserDao` re-sync path (User is a single pinned row).
    public func pendingUser() throws -> User? {
        guard let user = try database.fetchUser(), user.shouldSync else { return nil }
        return user
    }

    /// Android `DeviceDao.getShouldSyncDevice`.
    public func pendingDevices() throws -> [Device] {
        var devices: [Device] = []
        if let device = try database.fetchDeviceNeedingSync() {
            devices.append(device)
        }
        return devices
    }

    /// Android `GoalConfigurationDao` unsynced goals.
    public func pendingGoals() throws -> [GoalConfiguration] {
        try database.fetchUnsyncedGoals()
    }

    public func pendingActivitySessions() throws -> [UserActivitySessionRecord] {
        try database.dbQueue.read { db in
            try UserActivitySessionRecord.filter(Column("shouldSend") == true).fetchAll(db)
        }
    }

    public func pendingWalkingLogs() throws -> [WalkingLogRecord] {
        try database.fetchUnsyncedWalkingLogs()
    }

    public func pendingRestingLogs() throws -> [RestingLogRecord] {
        try database.dbQueue.read { db in
            try RestingLogRecord.filter(Column("shouldSend") == true).fetchAll(db)
        }
    }

    public func pendingSleepLogs() throws -> [SleepLogRecord] {
        try database.dbQueue.read { db in
            try SleepLogRecord.filter(Column("shouldSend") == true).fetchAll(db)
        }
    }

    // MARK: - State snapshot

    public func status() throws -> SyncStatus {
        var pending: [SyncedRecordKind: Int] = [:]
        for kind in SyncedRecordKind.allCases {
            let (table, column) = kind.tableAndFlag
            let count = try database.dbQueue.read { db in
                try Int.fetchOne(db, sql: "SELECT COUNT(*) FROM \(table) WHERE \(column) = 1") ?? 0
            }
            if count > 0 { pending[kind] = count }
        }
        return SyncStatus(pending: pending)
    }

    // MARK: - Clearing flags

    /// Clears the dirty flags for the given kinds in a single transaction —
    /// the local equivalent of Android's
    /// `.andThen(dao.save(items.map { it.copy(shouldSend = false) }))` after a
    /// completed upload. No-op for kinds with nothing pending; idempotent.
    @discardableResult
    public func markSynced(_ kinds: [SyncedRecordKind]) throws -> SyncStatus {
        let before = try status()
        let toClear = kinds.filter { before.pending[$0] != nil }
        guard !toClear.isEmpty else { return before }
        try database.dbQueue.write { db in
            for kind in toClear {
                let (table, column) = kind.tableAndFlag
                try db.execute(sql: "UPDATE \(table) SET \(column) = 0 WHERE \(column) = 1")
            }
        }
        return try status()
    }

    /// Clears dirty flags for every kind.
    @discardableResult
    public func markAllSynced() throws -> SyncStatus {
        try markSynced(SyncedRecordKind.allCases)
    }
}
