import Foundation
import GRDB

// DAOs for the activity log and hour-period tables, ported from the
// Android `*Dao` interfaces in `shared/data/db/`. Range queries are
// half-open on startTime (>= low, < high); upserts are INSERT OR REPLACE.

extension PowerWatchDatabase {

    // MARK: - WalkingLog DAO

    public func upsertWalkingLogs(_ logs: [WalkingLogRecord]) throws {
        _ = try dbQueue.write { db in
            for log in logs {
                var copy = log
                try copy.insert(db, onConflict: .replace)
            }
        }
    }

    public func fetchWalkingLogs(from: Int64, to: Int64) throws -> [WalkingLogRecord] {
        try dbQueue.read { db in
            try WalkingLogRecord
                .filter(Column("startTime") >= from && Column("startTime") < to)
                .order(Column("startTime").asc)
                .fetchAll(db)
        }
    }

    public func fetchAllWalkingLogs() throws -> [WalkingLogRecord] {
        try dbQueue.read { db in
            try WalkingLogRecord.order(Column("startTime").asc).fetchAll(db)
        }
    }

    public func fetchUnsyncedWalkingLogs() throws -> [WalkingLogRecord] {
        try dbQueue.read { db in
            try WalkingLogRecord.filter(Column("shouldSend") == true).fetchAll(db)
        }
    }

    public func deleteWalkingLogs(from: Int64, to: Int64) throws {
        _ = try dbQueue.write { db in
            try WalkingLogRecord
                .filter(Column("startTime") >= from && Column("startTime") < to)
                .deleteAll(db)
        }
    }

    public func deleteAllWalkingLogs() throws {
        _ = try dbQueue.write { db in
            try WalkingLogRecord.deleteAll(db)
        }
    }

    // MARK: - Purge

    /// Empties the watch-derived log and hour-period tables. The user profile,
    /// goals, device row and activity sessions are untouched (sessions carry a
    /// timestamp of their own from `9215`).
    ///
    /// Needed once, after FW v3.01.00's undateable background logs were written
    /// with invented timestamps — those rows cannot be told apart from real ones
    /// afterwards, so the honest repair is to drop them and let the watch refill
    /// the tables with logs it timestamped itself. Returns the row count.
    @discardableResult
    public func purgeLogTables() throws -> Int {
        try dbQueue.write { db in
            [
                try WalkingLogRecord.deleteAll(db),
                try RestingLogRecord.deleteAll(db),
                try SleepLogRecord.deleteAll(db),
                try WalkingHourPeriodRecord.deleteAll(db),
                try RestingHourPeriodRecord.deleteAll(db),
                try SleepHourPeriodRecord.deleteAll(db),
            ].reduce(0, +)
        }
    }

    // MARK: - RestingLog DAO

    public func upsertRestingLogs(_ logs: [RestingLogRecord]) throws {
        _ = try dbQueue.write { db in
            for log in logs {
                var copy = log
                try copy.insert(db, onConflict: .replace)
            }
        }
    }

    public func fetchRestingLogs(from: Int64, to: Int64) throws -> [RestingLogRecord] {
        try dbQueue.read { db in
            try RestingLogRecord
                .filter(Column("startTime") >= from && Column("startTime") < to)
                .order(Column("startTime").asc)
                .fetchAll(db)
        }
    }

    public func fetchAllRestingLogs() throws -> [RestingLogRecord] {
        try dbQueue.read { db in
            try RestingLogRecord.order(Column("startTime").asc).fetchAll(db)
        }
    }

    public func deleteAllRestingLogs() throws {
        _ = try dbQueue.write { db in
            try RestingLogRecord.deleteAll(db)
        }
    }

    // MARK: - SleepLog DAO

    public func upsertSleepLogs(_ logs: [SleepLogRecord]) throws {
        _ = try dbQueue.write { db in
            for log in logs {
                var copy = log
                try copy.insert(db, onConflict: .replace)
            }
        }
    }

    public func fetchSleepLogs(from: Int64, to: Int64) throws -> [SleepLogRecord] {
        try dbQueue.read { db in
            try SleepLogRecord
                .filter(Column("startTime") >= from && Column("startTime") < to)
                .order(Column("startTime").asc)
                .fetchAll(db)
        }
    }

    public func fetchAllSleepLogs() throws -> [SleepLogRecord] {
        try dbQueue.read { db in
            try SleepLogRecord.order(Column("startTime").asc).fetchAll(db)
        }
    }

    public func deleteAllSleepLogs() throws {
        _ = try dbQueue.write { db in
            try SleepLogRecord.deleteAll(db)
        }
    }

    // MARK: - Hour period DAOs

    public func upsertWalkingPeriods(_ periods: [WalkingHourPeriodRecord]) throws {
        _ = try dbQueue.write { db in
            for period in periods {
                var copy = period
                try copy.insert(db, onConflict: .replace)
            }
        }
    }

    public func fetchWalkingPeriods(from: Int64, to: Int64) throws -> [WalkingHourPeriodRecord] {
        try dbQueue.read { db in
            try WalkingHourPeriodRecord
                .filter(Column("startTime") >= from && Column("startTime") < to)
                .order(Column("startTime").asc)
                .fetchAll(db)
        }
    }

    public func upsertRestingPeriods(_ periods: [RestingHourPeriodRecord]) throws {
        _ = try dbQueue.write { db in
            for period in periods {
                var copy = period
                try copy.insert(db, onConflict: .replace)
            }
        }
    }

    public func fetchRestingPeriods(from: Int64, to: Int64) throws -> [RestingHourPeriodRecord] {
        try dbQueue.read { db in
            try RestingHourPeriodRecord
                .filter(Column("startTime") >= from && Column("startTime") < to)
                .order(Column("startTime").asc)
                .fetchAll(db)
        }
    }

    public func upsertSleepPeriods(_ periods: [SleepHourPeriodRecord]) throws {
        _ = try dbQueue.write { db in
            for period in periods {
                var copy = period
                try copy.insert(db, onConflict: .replace)
            }
        }
    }

    public func fetchSleepPeriods(from: Int64, to: Int64) throws -> [SleepHourPeriodRecord] {
        try dbQueue.read { db in
            try SleepHourPeriodRecord
                .filter(Column("startTime") >= from && Column("startTime") < to)
                .order(Column("startTime").asc)
                .fetchAll(db)
        }
    }

    // MARK: - UserActivitySession DAO

    public func upsertActivitySession(_ session: UserActivitySessionRecord) throws {
        _ = try dbQueue.write { db in
            var copy = session
            try copy.insert(db, onConflict: .replace)
        }
    }

    public func fetchActivitySessions(from: Int64, to: Int64) throws -> [UserActivitySessionRecord] {
        try dbQueue.read { db in
            try UserActivitySessionRecord
                .filter(Column("startTime") >= from && Column("startTime") < to)
                .order(Column("startTime").asc)
                .fetchAll(db)
        }
    }

    public func fetchAllActivitySessions() throws -> [UserActivitySessionRecord] {
        try dbQueue.read { db in
            try UserActivitySessionRecord.order(Column("startTime").asc).fetchAll(db)
        }
    }

    public func deleteActivitySession(id: String) throws {
        _ = try dbQueue.write { db in
            try UserActivitySessionRecord.filter(Column("id") == id).deleteAll(db)
        }
    }

    // MARK: - UserActivityDate DAO

    public func upsertActivityDates(_ dates: [UserActivityDateRecord]) throws {
        _ = try dbQueue.write { db in
            for date in dates {
                var copy = date
                try copy.insert(db, onConflict: .replace)
            }
        }
    }

    public func fetchActivityDates(from: Int64, to: Int64) throws -> [UserActivityDateRecord] {
        try dbQueue.read { db in
            try UserActivityDateRecord
                .filter(Column("startTime") >= from && Column("startTime") < to)
                .order(Column("startTime").asc)
                .fetchAll(db)
        }
    }

    // MARK: - DBManagerImpl clear helpers

    /// Android `DBManagerImpl.clearAllData` (drops every table's rows).
    public func clearAllData() throws {
        _ = try dbQueue.write { db in
            for table in ["User", "Device", "DefaultPhoneWatch", "GoalConfiguration",
                          "UpdateInfo", "WalkingLog", "RestingLog", "SleepLog",
                          "WalkingHourPeriod", "RestingHourPeriod", "SleepHourPeriod",
                          "UserActivitySession", "UserActivityDate"] {
                try db.execute(sql: "DELETE FROM \(table)")
            }
        }
    }

    /// Android `DBManagerImpl.clearBackgroundAndActivityLogs`.
    public func clearBackgroundAndActivityLogs() throws {
        _ = try dbQueue.write { db in
            for table in ["WalkingLog", "RestingLog", "SleepLog",
                          "WalkingHourPeriod", "RestingHourPeriod", "SleepHourPeriod",
                          "UserActivitySession", "UserActivityDate"] {
                try db.execute(sql: "DELETE FROM \(table)")
            }
        }
    }

    /// Android `DBManagerImpl.clearDevices`.
    public func clearDevices() throws {
        _ = try dbQueue.write { db in
            try db.execute(sql: "DELETE FROM Device")
        }
    }

    /// Android `DBManagerImpl.clearGoalConfigurations`.
    public func clearGoalConfigurations() throws {
        _ = try dbQueue.write { db in
            try db.execute(sql: "DELETE FROM GoalConfiguration")
        }
    }
}
