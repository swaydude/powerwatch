import XCTest
@testable import PowerWatchCore

/// TC-U01, TC-U02 — GATT UUIDs must match the Android app verbatim
/// (`sdk/protocol/BLEServicesKt.java`).
final class BLEServiceTests: XCTestCase {

    func testServiceUUIDsMatchAndroidConstants() {
        XCTAssertEqual(BLEService.dtpService, "00002760-08C2-11E1-9073-0E8AC72E1011")
        XCTAssertEqual(BLEService.dtpRX, "00002760-08C2-11E1-9073-0E8AC72E0011")
        XCTAssertEqual(BLEService.dtpTX, "00002760-08C2-11E1-9073-0E8AC72E0012")
        XCTAssertEqual(BLEService.basicDTPPwxRX, "00002760-08C2-11E1-9073-0E8AC72E0013")
        XCTAssertEqual(BLEService.otaService, "00002760-08C2-11E1-9073-0E8AC72E1001")
        XCTAssertEqual(BLEService.otaRX, "00002760-08C2-11E1-9073-0E8AC72E0001")
        XCTAssertEqual(BLEService.otaTX, "00002760-08C2-11E1-9073-0E8AC72E0002")
    }

    func testScanFilterIncludesDTPAndOTA() {
        XCTAssertEqual(Set(BLEService.scanServices), Set([BLEService.dtpService, BLEService.otaService]))
    }

    func testAllUUIDsAreValidUUIDStrings() {
        let all = [
            BLEService.dtpService, BLEService.dtpRX, BLEService.dtpTX,
            BLEService.basicDTPPwxRX, BLEService.otaService,
            BLEService.otaRX, BLEService.otaTX,
        ]
        for uuid in all {
            XCTAssertEqual(uuid.count, 36, "malformed UUID string: \(uuid)")
        }
    }
}
