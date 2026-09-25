import XCTest
@testable import PowerWatchCore

/// TC-U03–TC-U05 — the command catalog must exactly mirror
/// `sdk/protocol/commands/Gen2CommandIDs.java` (55 commands), plus the five
/// E2xx/E4xx response status words the watch puts in the command slot of
/// response frames (proven on the wire 2026-09-17).
final class Gen2CommandIDTests: XCTestCase {

    func testCatalogIsComplete() {
        XCTAssertEqual(Gen2CommandID.allCases.count, 60,
                       "command count drifted from the Android app + response words")
    }

    func testResponseStatusWords() {
        XCTAssertEqual(Gen2CommandID.responseSuccess.responseType, .success)
        XCTAssertEqual(Gen2CommandID.responseError.responseType, .error)
        XCTAssertEqual(Gen2CommandID.responseLocked.responseType, .locked)
        XCTAssertEqual(Gen2CommandID.responseWait.responseType, .wait)
        XCTAssertEqual(Gen2CommandID.responseProcessing.responseType, .processing)
        XCTAssertNil(Gen2CommandID.startAmDTP.responseType)
    }

    func testRawValuesAreUnique() {
        let rawValues = Gen2CommandID.allCases.map(\.rawValue)
        XCTAssertEqual(Set(rawValues).count, rawValues.count, "duplicate command id on the wire")
    }

    func testRawValuesAreFourHexDigits() {
        for command in Gen2CommandID.allCases {
            XCTAssertEqual(command.rawValue.count, 4)
            XCTAssertNotNil(UInt16(command.rawValue, radix: 16), "non-hex id: \(command)")
        }
    }

    func testSpotCheckedWireMappings() {
        XCTAssertEqual(Gen2CommandID(rawValue: "9000"), .startAmDTP)
        XCTAssertEqual(Gen2CommandID(rawValue: "9001"), .stopAmDTP)
        XCTAssertEqual(Gen2CommandID(rawValue: "9010"), .startPairing)
        XCTAssertEqual(Gen2CommandID(rawValue: "9011"), .stopPairing)
        XCTAssertEqual(Gen2CommandID(rawValue: "9002"), .sendUserInformation)
        XCTAssertEqual(Gen2CommandID(rawValue: "9102"), .receiveUserInformation)
        XCTAssertEqual(Gen2CommandID(rawValue: "9012"), .sendBiometrics)
        XCTAssertEqual(Gen2CommandID(rawValue: "9104"), .receiveRealTime)
        XCTAssertEqual(Gen2CommandID(rawValue: "9107"), .rtlStatus)
        XCTAssertEqual(Gen2CommandID(rawValue: "9117"), .rtlTime)
        XCTAssertEqual(Gen2CommandID(rawValue: "9116"), .getLogCount)
        XCTAssertEqual(Gen2CommandID(rawValue: "9126"), .ver3GetLogCount)
        XCTAssertEqual(Gen2CommandID(rawValue: "9108"), .sleepLog)
        XCTAssertEqual(Gen2CommandID(rawValue: "9105"), .activityDeltaLog)
        XCTAssertEqual(Gen2CommandID(rawValue: "9106"), .backgroundLog)
        XCTAssertEqual(Gen2CommandID(rawValue: "9309"), .reset)
        XCTAssertEqual(Gen2CommandID(rawValue: "9023"), .cleanAllLogs)
    }

    func testBytesAreBigEndianPairs() {
        XCTAssertEqual(Gen2CommandID.startAmDTP.bytes, [0x90, 0x00])
        XCTAssertEqual(Gen2CommandID.stopAmDTP.bytes, [0x90, 0x01])
        XCTAssertEqual(Gen2CommandID.startPairing.bytes, [0x90, 0x10])
        XCTAssertEqual(Gen2CommandID.alarm.bytes, [0x93, 0x0A])
        XCTAssertEqual(Gen2CommandID.timer.bytes, [0x93, 0x0B])
    }
}
