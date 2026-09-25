import XCTest
@testable import PowerWatchCore

/// T3.4 pairing parsers — ports of Android `QRPairingViewModel.extractQRCode`
/// and the `BleScanningTechnology` manufacturer-data parse.
final class PairingTests: XCTestCase {

    // MARK: QR payload → pair code

    func testPairCodeLineExtractsLastToken() {
        let qr = """
        MATRIX PowerWatch 2
        Serial 1234567890
        Pair code 3141
        Thanks
        """
        XCTAssertEqual(PairCodeParser.extract(qr), 3141)
    }

    func testPairCodeCaseInsensitiveAndExtraSpaces() {
        XCTAssertEqual(PairCodeParser.extract("pair CODE 42"), 42)
    }

    func testOpenURLFallback() {
        XCTAssertEqual(PairCodeParser.extract("something\nGo to open?code=777\n"), 777)
    }

    func testUnparseableCodeReturnsNil() {
        XCTAssertNil(PairCodeParser.extract("Pair code abcdef"))
        XCTAssertNil(PairCodeParser.extract("no code here at all"))
        XCTAssertNil(PairCodeParser.extract(""))
    }

    func testCodeOutOfRangeTruncatesLikeAndroidShortParse() {
        // Android toIntOrNull accepts any Int; the match parses it as a
        // Short, so out-of-range values truncate rather than match.
        XCTAssertEqual(PairCodeParser.extract("Pair code 70000"), Int16(truncatingIfNeeded: 70000))
    }

    // MARK: Manufacturer data → (pairing code, protocol version)

    func testManufacturerDataParsesCodeAndVersion() {
        // First two bytes big-endian = code, third byte = protocol version.
        let parsed = PairingAdvertisement.parse([0x0C, 0x45, 0x02])
        XCTAssertEqual(parsed?.pairingCode, 0x0C45)   // 3141
        XCTAssertEqual(parsed?.protocolVersion, 2)
    }

    func testTwoByteManufacturerDataDefaultsVersion() {
        let parsed = PairingAdvertisement.parse([0x0C, 0x45])
        XCTAssertEqual(parsed?.pairingCode, 3141)
        XCTAssertEqual(parsed?.protocolVersion, 1)
    }

    func testShortManufacturerDataReturnsNil() {
        XCTAssertNil(PairingAdvertisement.parse([0x0C]))
        XCTAssertNil(PairingAdvertisement.parse([]))
    }

    func testMatchMatchesQRCodeAgainstAdvertisement() {
        let qr = PairCodeParser.extract("Pair code 3141")
        let ad = PairingAdvertisement.parse([0x0C, 0x45, 0x01])
        XCTAssertEqual(qr, ad?.pairingCode)
    }
}
