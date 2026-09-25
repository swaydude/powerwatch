import XCTest
@testable import PowerWatchCore

/// TC-P01, TC-P02, TC-P07 — frame encode/decode round-trip and safety.
final class DTPFrameTests: XCTestCase {

    func testFrameLayoutMatchesAndroidSpec() {
        // startPairing (9010), empty payload
        let frame = DTPFrame(command: .startPairing).encoded
        XCTAssertEqual(Array(frame[0..<2]), [0x06, 0x00])   // len = 2 + 0 + 4 = 6, LE
        XCTAssertEqual(Array(frame[2..<4]), [0x40, 0x10])    // magic 0x1040, LE
        XCTAssertEqual(Array(frame[4..<6]), [0x90, 0x10])     // command id, BE pair
        // CRC over [0x90, 0x10], little-endian
        let expectedCRC = CRC32.checksum([0x90, 0x10])
        XCTAssertEqual(Array(frame[6..<10]), [
            UInt8(expectedCRC & 0xFF), UInt8(expectedCRC >> 8 & 0xFF),
            UInt8(expectedCRC >> 16 & 0xFF), UInt8(expectedCRC >> 24 & 0xFF),
        ])
        XCTAssertEqual(frame.count, 10)
    }

    func testRoundTripAllCommandsWithEmptyPayload() {
        for command in Gen2CommandID.allCases {
            let frame = DTPFrame(command: command).encoded
            let decoded = try? DTPFrame.decode(frame)
            XCTAssertEqual(decoded?.command, command, "round-trip failed for \(command)")
            XCTAssertEqual(decoded?.payload, [])
        }
    }

    func testRoundTripWithPayload() throws {
        let payload: [UInt8] = [0x01, 0x00, 0x7B, 0xFF, 0x42]
        let frame = DTPFrame(command: .sendBiometrics, payload: payload).encoded
        let decoded = try XCTUnwrap(try DTPFrame.decode(frame))
        XCTAssertEqual(decoded.command, .sendBiometrics)
        XCTAssertEqual(decoded.payload, payload)
    }

    func testDecodeRejectsTruncatedFrames() {
        let frame = DTPFrame(command: .sendUserInformation, payload: [0, 1, 2, 3, 4, 5, 6, 7]).encoded
        for cut in 0..<frame.count {
            XCTAssertThrowsError(try DTPFrame.decode(Array(frame[0..<cut])), "cut at \(cut) must throw")
        }
    }

    func testDecodeRejectsCorruptedCRC() {
        var frame = DTPFrame(command: .startAmDTP, payload: [1, 2, 3]).encoded
        frame[frame.count - 1] ^= 0xFF
        XCTAssertThrowsError(try DTPFrame.decode(frame))
    }

    func testDecodeRejectsLengthMismatch() {
        var frame = DTPFrame(command: .startAmDTP).encoded
        frame[0] = 0x09   // claim a longer body than present
        XCTAssertThrowsError(try DTPFrame.decode(frame))
    }

    func testResponseTypes() {
        XCTAssertEqual(ResponseType(rawValue: 0xE200), .success)
        XCTAssertEqual(ResponseType(rawValue: 0xE404), .error)
        XCTAssertEqual(ResponseType(rawValue: 0xE423), .locked)
        XCTAssertEqual(ResponseType(rawValue: 0xE102), .wait)
        XCTAssertEqual(ResponseType(rawValue: 0xE202), .processing)
        XCTAssertNil(ResponseType.success.protocolError)
        XCTAssertNil(ResponseType.processing.protocolError)
        XCTAssertEqual(ResponseType.locked.protocolError, .syncLocked)
        XCTAssertEqual(ResponseType.wait.protocolError, .watchBusy)
        XCTAssertEqual(ResponseType.error.protocolError, .unknownResponse)
    }

    /// Wire regression (2026-09-17): the real watch's success ack to
    /// startAmDTP (9000) — the E200 status word sits in the command slot and
    /// the payload is empty.
    func testDecodeRealWatchStartAmDTPAck() throws {
        let bytes: [UInt8] = [0x06, 0x00, 0x40, 0x10, 0xE2, 0x00,
                              0x91, 0x83, 0x91, 0x2D]
        let decoded = try XCTUnwrap(try DTPFrame.decode(bytes))
        XCTAssertEqual(decoded.command, .responseSuccess)
        XCTAssertEqual(decoded.payload, [])
        XCTAssertNil(decoded.command.responseType?.protocolError)
    }
}
