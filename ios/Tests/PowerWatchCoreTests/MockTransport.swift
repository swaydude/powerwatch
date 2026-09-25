import Foundation
@testable import PowerWatchCore

/// In-memory `WatchTransport` used by unit tests (and later by the sync
/// engine tests) — no CoreBluetooth, no hardware. Not `final` so
/// `SyncEngineTests.ScriptedTransport` can subclass it.
class MockTransport: WatchTransport {

    weak var delegate: WatchTransportDelegate?
    var state: TransportState = .idle

    var startScanCalls = 0
    var startPairScanCalls = 0
    var stopScanCalls = 0
    var connectCalls: [UUID] = []
    var disconnectCalls = 0
    var sentData: [[UInt8]] = []
    /// Frames written to the event characteristic (DTP flow-control ACKs).
    var sentEvents: [[UInt8]] = []
    var highPriorityCalls = 0

    /// Set to throw from `send`.
    var sendError: TransportError?

    func startScan() {
        startScanCalls += 1
        state = .scanning
        delegate?.transportStateDidChange(self, state: state)
    }

    func startPairScan() {
        startPairScanCalls += 1
        state = .scanning
        delegate?.transportStateDidChange(self, state: state)
    }

    func stopScan() {
        stopScanCalls += 1
        state = .idle
        delegate?.transportStateDidChange(self, state: state)
    }

    func connect(to id: UUID) {
        connectCalls.append(id)
        state = .connecting(id)
        delegate?.transportStateDidChange(self, state: state)
    }

    func disconnect() {
        disconnectCalls += 1
        state = .idle
        delegate?.transportStateDidChange(self, state: state)
    }

    func send(_ data: [UInt8]) async throws {
        if let sendError { throw sendError }
        sentData.append(data)
    }

    func sendEvent(_ data: [UInt8]) {
        sentEvents.append(data)
    }

    func requestHighPriority() {
        highPriorityCalls += 1
    }

    // MARK: Test helpers (drive the delegate as if CoreBluetooth fired)

    func fireDiscover(_ watch: DiscoveredWatch) {
        delegate?.transport(self, didDiscover: watch)
    }

    func fireConnected(_ id: UUID) {
        state = .connected(id)
        delegate?.transportStateDidChange(self, state: state)
    }

    func fireData(_ bytes: [UInt8]) {
        delegate?.transport(self, didReceiveData: bytes)
    }

    func fireEvent(_ bytes: [UInt8]) {
        delegate?.transport(self, didReceiveEvent: bytes)
    }
}
