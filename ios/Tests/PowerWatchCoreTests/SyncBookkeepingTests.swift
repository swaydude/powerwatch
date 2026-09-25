import XCTest
@testable import PowerWatchCore

/// TC-D07 — sync bookkeeping: `shouldSync`/`shouldSend` dirty flags as a
/// local-only state machine (write → dirty → markSynced → clean).
final class SyncBookkeepingTests: XCTestCase {

    private func makeBookkeeper() throws -> (database: PowerWatchDatabase, bookkeeper: SyncBookkeeper) {
        let database = try PowerWatchDatabase()
        return (database, SyncBookkeeper(database: database))
    }

    func testWritesLandDirty() throws {
        let (_, bookkeeper) = try makeBookkeeper()

        let user = User(name: "Ada", email: "ada@example.com")
        try bookkeeper.saveUserDirty(user)
        XCTAssertTrue(try bookkeeper.pendingUser()!.shouldSync)

        let device = Device(serialNumber: "SN-1", bluetoothAddress: "AA:BB")
        try bookkeeper.saveDeviceDirty(device)
        XCTAssertEqual(try bookkeeper.pendingDevices().count, 1)

        let goal = GoalConfiguration(steps: 10_000)
        try bookkeeper.saveGoalDirty(goal)
        XCTAssertEqual(try bookkeeper.pendingGoals().count, 1)

        // Clean write path: a fully-processed device is not pending.
        try bookkeeper.saveDeviceRegistered(device)
        XCTAssertTrue(try bookkeeper.pendingDevices().isEmpty)
    }

    func testPendingLogQueries() throws {
        let (database, bookkeeper) = try makeBookkeeper()

        try database.upsertWalkingLogs([
            WalkingLogRecord(startTime: 100, steps: 10, shouldSend: true),
            WalkingLogRecord(startTime: 200, steps: 20, shouldSend: false),
        ])
        try database.upsertRestingLogs([
            RestingLogRecord(startTime: 100, shouldSend: true),
        ])
        try database.upsertSleepLogs([
            SleepLogRecord(startTime: 100, endTime: 200, shouldSend: true),
        ])

        XCTAssertEqual(try bookkeeper.pendingWalkingLogs().count, 1)
        XCTAssertEqual(try bookkeeper.pendingRestingLogs().count, 1)
        XCTAssertEqual(try bookkeeper.pendingSleepLogs().count, 1)
    }

    func testStatusSnapshot() throws {
        let (database, bookkeeper) = try makeBookkeeper()

        var status = try bookkeeper.status()
        XCTAssertFalse(status.isDirty)
        XCTAssertEqual(status.totalPending, 0)

        try bookkeeper.saveGoalDirty(GoalConfiguration(steps: 8_000))
        try database.upsertWalkingLogs([
            WalkingLogRecord(startTime: 1, shouldSend: true),
            WalkingLogRecord(startTime: 2, shouldSend: true),
        ])

        status = try bookkeeper.status()
        XCTAssertTrue(status.isDirty)
        XCTAssertEqual(status.pending[.goalConfiguration], 1)
        XCTAssertEqual(status.pending[.walkingLogs], 2)
        XCTAssertEqual(status.totalPending, 3)
        // Kinds with nothing pending are omitted.
        XCTAssertNil(status.pending[.user])
    }

    func testMarkSyncedClearsFlagsTransactionally() throws {
        let (database, bookkeeper) = try makeBookkeeper()

        try bookkeeper.saveUserDirty(User(name: "Ada"))
        try bookkeeper.saveGoalDirty(GoalConfiguration(steps: 8_000))
        try database.upsertWalkingLogs([
            WalkingLogRecord(startTime: 1, shouldSend: true),
            WalkingLogRecord(startTime: 2, shouldSend: true),
        ])

        // Clear only the logs: user and goal stay dirty.
        var status = try bookkeeper.markSynced([.walkingLogs])
        XCTAssertNil(status.pending[.walkingLogs])
        XCTAssertEqual(status.pending[.user], 1)
        XCTAssertEqual(status.pending[.goalConfiguration], 1)

        // Clear everything: nothing pending. Idempotent on repeat.
        status = try bookkeeper.markAllSynced()
        XCTAssertFalse(status.isDirty)
        XCTAssertFalse(try bookkeeper.status().isDirty)
        _ = try bookkeeper.markAllSynced()
        XCTAssertFalse(try bookkeeper.status().isDirty)

        // The underlying rows keep their data — only the flag changed.
        let user = try database.fetchUser()
        XCTAssertNotNil(user)
        XCTAssertEqual(user?.name, "Ada")
        XCTAssertFalse(user!.shouldSync)
        XCTAssertEqual(try database.fetchAllWalkingLogs().count, 2)
    }

    func testMarkSyncedWithNothingPendingIsNoOp() throws {
        let (_, bookkeeper) = try makeBookkeeper()

        let status = try bookkeeper.markSynced(SyncedRecordKind.allCases)
        XCTAssertFalse(status.isDirty)
    }

    func testActivitySessionDirtyFlag() throws {
        let (database, bookkeeper) = try makeBookkeeper()

        let session = UserActivitySessionRecord(id: "session-1", startTime: 1_000)
        try bookkeeper.saveActivitySessionDirty(session)
        XCTAssertEqual(try bookkeeper.pendingActivitySessions().count, 1)

        _ = try bookkeeper.markSynced([.activitySession])
        XCTAssertEqual(try bookkeeper.pendingActivitySessions().count, 0)
        XCTAssertEqual(try database.fetchAllActivitySessions().count, 1)
    }
}
