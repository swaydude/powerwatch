import XCTest
@testable import PowerWatchCore

/// Stream framing for MTU-fragmented notifications. The real watch answers
/// with frames bigger than a single notification, so a whole frame has to be
/// rebuilt from the byte stream before it can be decoded.
final class DTPStreamFramerTests: XCTestCase {

    /// Real capture (2026-09-24): the watch's answer to getLogCount (9116).
    private let logCountFrame: [UInt8] = [
        0x20, 0x00, 0x40, 0x10,
        0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x01,
        0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
        0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x39,
        0x00, 0x00, 0x00, 0x00,
        0x8E, 0xBE, 0x10, 0x16,
    ]

    /// Real capture: the watch's ACK/control frame on …0013.
    private let controlFrame: [UInt8] = [0x05, 0x00, 0x00, 0x20, 0x00, 0x8D, 0xEF, 0x02, 0xD2]

    func testWholeFrameArrivingInOneNotification() {
        var framer = DTPStreamFramer()
        XCTAssertEqual(framer.append(logCountFrame), [logCountFrame])
    }

    /// The framing that keeps a big log pull from being decoded as garbage.
    func testFrameReassembledFromSingleByteNotifications() {
        var framer = DTPStreamFramer()
        var frames: [[UInt8]] = []
        for byte in logCountFrame {
            frames.append(contentsOf: framer.append([byte]))
        }
        XCTAssertEqual(frames, [logCountFrame])
    }

    func testFrameSplitAcrossThreeNotifications() {
        var framer = DTPStreamFramer()
        XCTAssertEqual(framer.append(Array(logCountFrame[0..<5])), [])
        XCTAssertEqual(framer.append(Array(logCountFrame[5..<20])), [])
        XCTAssertEqual(framer.append(Array(logCountFrame[20...])), [logCountFrame])
    }

    func testSeveralFramesInOneNotification() {
        var framer = DTPStreamFramer()
        let batch = controlFrame + logCountFrame + controlFrame
        XCTAssertEqual(framer.append(batch), [controlFrame, logCountFrame, controlFrame])
    }

    func testTrailingPartialFrameWaitsForMore() {
        var framer = DTPStreamFramer()
        XCTAssertEqual(framer.append(controlFrame + Array(logCountFrame[0..<10])), [controlFrame])
        XCTAssertEqual(framer.append(Array(logCountFrame[10...])), [logCountFrame])
    }

    /// Android's `extractPayload` never reads the magic, and the watch proves
    /// why: the `9107` reply carries `4011` where `9000`/`9116` carry `4010`.
    func testFramingIgnoresTheMagicWord() {
        var variant = logCountFrame
        variant[3] = 0x11
        var framer = DTPStreamFramer()
        XCTAssertEqual(framer.append(variant), [variant])
        // …and it still decodes: only size + CRC are validated.
        XCTAssertEqual(try DTPResponse.decode(variant).body.count, 28)
    }

    func testStrayBytesAreSkipped() {
        var framer = DTPStreamFramer()
        XCTAssertEqual(framer.append([0xAA, 0xBB] + controlFrame), [controlFrame])
    }

    /// An absurd size can't be a frame — resync one byte and recover the next.
    func testImplausibleSizeResyncs() {
        var framer = DTPStreamFramer()
        let garbage: [UInt8] = [0xFF, 0xFF, 0xFF]
        XCTAssertEqual(framer.append(garbage + controlFrame), [controlFrame])
    }

    func testResetDropsAPartialFrame() {
        var framer = DTPStreamFramer()
        XCTAssertEqual(framer.append(Array(controlFrame[0..<5])), [])
        framer.reset()
        XCTAssertEqual(framer.append(controlFrame), [controlFrame])
    }

    /// A frame at the sanity bound still frames; anything beyond is garbage.
    func testMaxSizeBoundary() {
        var framer = DTPStreamFramer()
        framer.maxSize = 8
        let frame: [UInt8] = [0x08, 0x00, 0x40, 0x10] + [0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08]
        XCTAssertEqual(framer.append(frame), [frame])
        let tooBig: [UInt8] = [0x09, 0x00, 0x40, 0x10] + Array(repeating: 0x01, count: 9)
        XCTAssertEqual(framer.append(tooBig), [])
    }
}
