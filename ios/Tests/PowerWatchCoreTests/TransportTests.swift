import XCTest
@testable import PowerWatchCore

/// TC-B0x (software half) — transport abstraction: advertisement filtering
/// (T3.1), the state machine (T3.2), channel writes and notification routing
/// (T3.3). The on-device half (scan→connect→subscribe→9107) is TC-B01–B05,
/// hardware-gated.
final class TransportTests: XCTestCase {

    // MARK: - Advertisement filter (T3.1)

    func testAdvertisementFilterAcceptsPowerWatchServices() {
        XCTAssertTrue(AdvertisementFilter.isPowerWatch(
            serviceUUIDs: [BLEService.dtpService]))
        XCTAssertTrue(AdvertisementFilter.isPowerWatch(
            serviceUUIDs: ["0000180A-0000-1000-8000-00805F9B34FB", BLEService.otaService]))
        XCTAssertFalse(AdvertisementFilter.isPowerWatch(
            serviceUUIDs: ["0000180D-0000-1000-8000-00805F9B34FB"]))
        XCTAssertFalse(AdvertisementFilter.isPowerWatch(serviceUUIDs: []))
    }

    func testAdvertisementFilterClassifiesService() {
        XCTAssertEqual(
            AdvertisementFilter.advertisedService(serviceUUIDs: [BLEService.dtpService]),
            .dtp)
        XCTAssertEqual(
            AdvertisementFilter.advertisedService(serviceUUIDs: [BLEService.otaService]),
            .ota)
        XCTAssertNil(AdvertisementFilter.advertisedService(serviceUUIDs: ["FFFF"]))
    }

    func testDiscoveredWatchServiceClassification() {
        // Case-insensitive UUID match (CoreBluetooth normalizes case).
        let upper = BLEService.dtpService.uppercased()
        XCTAssertEqual(DiscoveredWatch.AdvertisedService(serviceUUID: upper), .dtp)
        XCTAssertNil(DiscoveredWatch.AdvertisedService(serviceUUID: "0000FFFF-0000-0000-0000-000000000000"))
    }

    // MARK: - State machine shape (T3.2)

    func testTransportStatesAreDistinct() {
        let id = UUID()
        XCTAssertNotEqual(TransportState.connecting(id), TransportState.connected(id))
        XCTAssertNotEqual(TransportState.idle, TransportState.scanning)
        XCTAssertEqual(TransportState.unavailable(reason: .poweredOff),
                      TransportState.unavailable(reason: .poweredOff))
    }

    // MARK: - MockTransport + delegate routing (T3.3)

    func testMockTransportDrivesDelegate() async throws {
        let transport = MockTransport()
        let recorder = TransportRecorder()
        transport.delegate = recorder

        transport.startScan()
        XCTAssertEqual(transport.startScanCalls, 1)

        let watch = DiscoveredWatch(id: UUID(), name: "PW2", rssi: -62, advertisedService: .dtp)
        transport.fireDiscover(watch)
        XCTAssertEqual(recorder.discovered, [watch])

        transport.connect(to: watch.id)
        XCTAssertEqual(transport.connectCalls, [watch.id])

        transport.fireConnected(watch.id)
        XCTAssertEqual(recorder.states.filter {
            if case .connected = $0 { return true } else { return false }
        }.count, 1)

        let frame: [UInt8] = [0x10, 0x40, 0, 0, 0]
        try await transport.send(frame)
        XCTAssertEqual(transport.sentData, [frame])

        transport.fireData([0x01])
        transport.fireEvent([0x02])
        XCTAssertEqual(recorder.dataFrames, [[0x01]])
        XCTAssertEqual(recorder.eventFrames, [[0x02]])
    }

    func testMockTransportSendError() async {
        let transport = MockTransport()
        transport.sendError = .notConnected
        do {
            try await transport.send([0x00])
            XCTFail("expected TransportError.notConnected")
        } catch let error as TransportError {
            XCTAssertEqual(error, .notConnected)
        } catch {
            XCTFail("unexpected error \(error)")
        }
    }
}

/// Captures every delegate callback in order.
final class TransportRecorder: WatchTransportDelegate {
    var discovered: [DiscoveredWatch] = []
    var states: [TransportState] = []
    var dataFrames: [[UInt8]] = []
    var eventFrames: [[UInt8]] = []

    func transportStateDidChange(_ transport: WatchTransport, state: TransportState) {
        states.append(state)
    }

    func transport(_ transport: WatchTransport, didDiscover watch: DiscoveredWatch) {
        discovered.append(watch)
    }

    func transport(_ transport: WatchTransport, didReceiveData data: [UInt8]) {
        dataFrames.append(data)
    }

    func transport(_ transport: WatchTransport, didReceiveEvent data: [UInt8]) {
        eventFrames.append(data)
    }
}
