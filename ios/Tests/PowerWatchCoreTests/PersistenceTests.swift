import XCTest
@testable import PowerWatchCore

/// TC-D01–TC-D03 — GRDB port of the Room schema and DAOs: upsert
/// idempotency, half-open range queries, single-row tables, JSON columns.
final class PersistenceTests: XCTestCase {

    private func makeDB() throws -> PowerWatchDatabase {
        try PowerWatchDatabase()
    }

    // TC-D01: schema matches Room's onCreate tables
    func testSchemaTablesExist() throws {
        let db = try makeDB()
        let tables = try db.dbQueue.read { d in
            try String.fetchAll(d, sql: "SELECT name FROM sqlite_master WHERE type = 'table' ORDER BY name")
        }
        XCTAssertEqual(Set(tables), Set([
            "User", "Device", "DefaultPhoneWatch", "GoalConfiguration", "UpdateInfo",
            "WalkingLog", "RestingLog", "SleepLog",
            "WalkingHourPeriod", "RestingHourPeriod", "SleepHourPeriod",
            "UserActivitySession", "UserActivityDate",
            // GRDB bookkeeping:
            "grdb_migrations",
        ]))
        // Cloud-only PasswordCredentials is deliberately absent.
        XCTAssertFalse(tables.contains("PasswordCredentials"))
    }

    // TC-D02: INSERT OR REPLACE upserts are idempotent (same PK → 1 row)
    func testUpsertIdempotency() throws {
        let db = try makeDB()
        var log = WalkingLogRecord(startTime: 1_700_000_000_000, steps: 100, distance: 80)
        try db.upsertWalkingLogs([log])
        log.steps = 250
        try db.upsertWalkingLogs([log])

        let fetched = try db.fetchAllWalkingLogs()
        XCTAssertEqual(fetched.count, 1)
        XCTAssertEqual(fetched[0].steps, 250)

        // Same for hour periods (PK startTime) and sessions (PK id).
        var period = SleepHourPeriodRecord(startTime: 1_700_000_000_000, sleepType: .deep)
        try db.upsertSleepPeriods([period])
        period.sleepType = .light
        try db.upsertSleepPeriods([period])
        let periods = try db.fetchSleepPeriods(from: 0, to: Int64.max)
        XCTAssertEqual(periods.count, 1)
        XCTAssertEqual(periods[0].sleepType, .light)

        var session = UserActivitySessionRecord(id: "s1", startTime: 100, endTime: 200)
        try db.upsertActivitySession(session)
        session.steps = 42
        try db.upsertActivitySession(session)
        let sessions = try db.fetchAllActivitySessions()
        XCTAssertEqual(sessions.count, 1)
        XCTAssertEqual(sessions[0].steps, 42)
    }

    // TC-D03: range queries are half-open [from, to)
    func testHalfOpenRangeQueries() throws {
        let db = try makeDB()
        try db.upsertWalkingLogs([
            WalkingLogRecord(startTime: 100, steps: 1),
            WalkingLogRecord(startTime: 200, steps: 2),
            WalkingLogRecord(startTime: 300, steps: 3),
        ])
        let mid = try db.fetchWalkingLogs(from: 100, to: 300)
        XCTAssertEqual(mid.map(\.startTime), [100, 200])
        let none = try db.fetchWalkingLogs(from: 300, to: 300)
        XCTAssertTrue(none.isEmpty)
        let all = try db.fetchWalkingLogs(from: 0, to: Int64.max)
        XCTAssertEqual(all.count, 3)
    }

    func testUserRowRoundTripAndSingleRowPin() throws {
        let db = try makeDB()
        let user = User(
            uid: 0, enabled: false, name: "Ada", email: "ada@example.com",
            password: "x", age: 36, height: 170, weight: 68.5, gender: .female
        )
        try db.upsertUser(user)
        // Different uid must still land on the single pinned row 0.
        var second = user
        second.uid = 7
        second.name = "Bob"
        try db.upsertUser(second)

        let fetched = try db.fetchUser()
        XCTAssertNotNil(fetched)
        XCTAssertEqual(fetched!.name, "Bob")            // row 0 replaced
        XCTAssertEqual(fetched!.gender, .female)
        XCTAssertEqual(fetched!.age, 36)
        XCTAssertEqual(fetched!.height, 170)
        XCTAssertEqual(fetched!.weight, 68.5, accuracy: 0.001)
        let count = try db.dbQueue.read { try Int.fetchOne($0, sql: "SELECT COUNT(*) FROM User") }
        XCTAssertEqual(count, 1)
    }

    func testDeviceRowRoundTrip() throws {
        let db = try makeDB()
        let device = Device(
            uid: 0, pid: 2, productName: "PowerWatch 2", serialNumber: "SN-1",
            bluetoothAddress: "AA:BB", firmwareVersion: "1.2.3",
            callNotification: true, messageNotification: true, alarmNotification: false,
            activityGoalNotification: true, shouldSync: true
        )
        try db.upsertDevice(device)
        let fetched = try db.fetchDevice()
        XCTAssertEqual(fetched, device)
        // shouldSync = 1 row is discoverable via getShouldSyncDevice.
        XCTAssertEqual(try db.fetchDeviceNeedingSync(), device)

        try db.upsertDevice(device.withShouldSync(nil))
        XCTAssertNil(try db.fetchDeviceNeedingSync())
    }

    func testGoalLatestByCreatedAtAndUnsynced() throws {
        let db = try makeDB()
        try db.upsertGoal(GoalConfiguration(id: 1, steps: 5_000, createdAt: 100))
        try db.upsertGoal(GoalConfiguration(id: 2, steps: 10_000, createdAt: 200, shouldSync: false))
        XCTAssertEqual(try db.fetchLatestGoal()?.steps, 10_000)
        XCTAssertEqual(try db.fetchAllGoals().map(\.steps), [10_000, 5_000])
        XCTAssertEqual(try db.fetchUnsyncedGoals().map(\.steps), [5_000])
    }

    func testSleepFiveMinsJSONColumnRoundTrip() throws {
        let db = try makeDB()
        let buckets = [
            SleepFiveMinPeriod(startTime: 100, endTime: 400, heartRate: 55,
                               maxHeartRate: 60, minHeartRate: 50, hrv: 40,
                               skinTemp: 32.5, maxSkinTemp: 33, minSkinTemp: 31,
                               bodyPower: 1, solarPower: 2, peakTemp: 34,
                               activeCalories: 5, minsInPeriod: 5, bmrCalories: 8,
                               caseTemp: 30, minCaseTemp: 29, maxCaseTemp: 31,
                               fiveMinsInHour: 1, restlessMinutes: 2, sleepType: .deep),
            SleepFiveMinPeriod(startTime: 400, endTime: 700, sleepType: .restless),
        ]
        let period = SleepHourPeriodRecord(
            startTime: 100, endTime: 700,
            sleepFiveMins: SleepHourPeriodRecord.encodeFiveMins(buckets),
            sleepType: .light
        )
        try db.upsertSleepPeriods([period])

        let fetched = try db.fetchSleepPeriods(from: 0, to: Int64.max)
        XCTAssertEqual(fetched.count, 1)
        XCTAssertEqual(fetched[0].sleepType, .light)
        XCTAssertEqual(fetched[0].fiveMinPeriods, buckets)
        XCTAssertEqual(fetched[0].fiveMinPeriods[0].sleepType, .deep)
        XCTAssertEqual(fetched[0].fiveMinPeriods[0].maxHeartRate, 60)
    }

    func testActivitySessionJSONColumns() throws {
        let db = try makeDB()
        let session = UserActivitySessionRecord(
            id: "abc", name: "Morning Run", activityType: "RUN",
            distance: 5_300, steps: 6_000, startTime: 100, endTime: 2_000,
            splits: "[{\"distance\":1000,\"period\":1000}]",
            gpsPositions: "[{\"longitude\":-1.5,\"latitude\":51.2,\"altitude\":10,\"speed\":3,\"timestamp\":150}]",
            heartRates: "[{\"beatsPerMinute\":120,\"startTime\":100,\"endTime\":200}]"
        )
        try db.upsertActivitySession(session)
        let fetched = try db.fetchActivitySessions(from: 0, to: Int64.max)
        XCTAssertEqual(fetched.count, 1)
        XCTAssertEqual(fetched[0].runningSplits, [RunningSplit(distance: 1000, period: 1000)])
        XCTAssertEqual(fetched[0].positions.count, 1)
        XCTAssertEqual(fetched[0].positions[0].latitude, 51.2, accuracy: 0.0001)
        XCTAssertEqual(fetched[0].rates, [HeartRate(beatsPerMinute: 120, startTime: 100, endTime: 200)])
    }

    func testClearHelpers() throws {
        let db = try makeDB()
        try db.upsertUser(User(name: "A"))
        try db.upsertDevice(Device(productName: "W"))
        try db.upsertGoal(GoalConfiguration(steps: 1))
        try db.upsertWalkingLogs([WalkingLogRecord(startTime: 10)])
        try db.upsertSleepLogs([SleepLogRecord(startTime: 10)])
        try db.upsertActivitySession(UserActivitySessionRecord(startTime: 10))

        try db.clearBackgroundAndActivityLogs()
        XCTAssertNotNil(try db.fetchUser())
        XCTAssertNotNil(try db.fetchDevice())
        XCTAssertNotNil(try db.fetchLatestGoal())
        XCTAssertTrue(try db.fetchAllWalkingLogs().isEmpty)
        XCTAssertTrue(try db.fetchAllSleepLogs().isEmpty)
        XCTAssertTrue(try db.fetchAllActivitySessions().isEmpty)

        try db.clearDevices()
        XCTAssertNil(try db.fetchDevice())
        try db.clearGoalConfigurations()
        XCTAssertNil(try db.fetchLatestGoal())

        try db.clearAllData()
        XCTAssertNil(try db.fetchUser())
    }

    func testDeleteWalkingLogRange() throws {
        let db = try makeDB()
        try db.upsertWalkingLogs([
            WalkingLogRecord(startTime: 100),
            WalkingLogRecord(startTime: 200),
            WalkingLogRecord(startTime: 300),
        ])
        try db.deleteWalkingLogs(from: 100, to: 300)
        XCTAssertEqual(try db.fetchAllWalkingLogs().map(\.startTime), [300])
    }
}

// Local convenience — Device needs a shouldSync mutator for tests.
private extension Device {
    func withShouldSync(_ value: Bool?) -> Device {
        var copy = self
        copy.shouldSync = value
        return copy
    }
}
