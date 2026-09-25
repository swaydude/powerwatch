import XCTest
@testable import PowerWatchCore

/// The retry schedule is the part of auto-reconnect that can be tested without
/// a radio: it must escalate, stay bounded (a watch out of range should not be
/// hammered), and restart when the user asks for a link explicitly.
final class ReconnectPlannerTests: XCTestCase {

    func testBackoffEscalatesThenHoldsAtTheCeiling() {
        var planner = ReconnectPlanner()
        var delays: [TimeInterval] = []
        while let delay = planner.nextDelay() { delays.append(delay) }
        XCTAssertEqual(delays, [1, 2, 5, 10, 30, 30, 30, 30])
        XCTAssertEqual(delays.count, ReconnectPlanner.maxAttempts)
        XCTAssertTrue(planner.isExhausted)
    }

    func testExhaustedPlannerKeepsRefusing() {
        var planner = ReconnectPlanner()
        for _ in 0..<(ReconnectPlanner.maxAttempts * 3) {
            _ = planner.nextDelay()
        }
        XCTAssertNil(planner.nextDelay())
        XCTAssertTrue(planner.isExhausted)
    }

    func testResetRestartsTheBudget() {
        var planner = ReconnectPlanner()
        XCTAssertEqual(planner.nextDelay(), 1)
        XCTAssertEqual(planner.nextDelay(), 2)
        planner.reset()
        XCTAssertEqual(planner.attempt, 0)
        XCTAssertFalse(planner.isExhausted)
        XCTAssertEqual(planner.nextDelay(), 1)
    }
}
