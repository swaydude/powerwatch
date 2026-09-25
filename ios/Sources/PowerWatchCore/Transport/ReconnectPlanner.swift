import Foundation

/// Retry policy for re-establishing a dropped watch link. Android has no
/// equivalent wait: `DeviceManagerImpl` simply re-issues `startConnection`
/// whenever the radio or the device comes back, because the OS reconnects
/// transparently. iOS does not, so a dropped link needs a capped, escalating
/// retry — otherwise the app sits idle until the user notices.
///
/// Pure logic (no clock, no I/O) so the schedule is unit-testable;
/// `CoreBluetoothTransport` owns the timer and the connect calls.
public struct ReconnectPlanner: Sendable {

    /// Seconds to wait before each attempt; the final value repeats until the
    /// budget is spent (a watch left the radio range should not be hammered).
    public static let backoff: [TimeInterval] = [1, 2, 5, 10, 30]

    /// Attempts before giving up and falling back to a scan.
    public static let maxAttempts = 8

    public private(set) var attempt = 0

    public init() {}

    /// Delay before the next attempt, or `nil` when the budget is spent.
    public mutating func nextDelay() -> TimeInterval? {
        guard attempt < Self.maxAttempts else { return nil }
        let delay = Self.backoff[min(attempt, Self.backoff.count - 1)]
        attempt += 1
        return delay
    }

    /// A live link, or an explicit user-initiated connect, restarts the budget.
    public mutating func reset() { attempt = 0 }

    public var isExhausted: Bool { attempt >= Self.maxAttempts }
}
