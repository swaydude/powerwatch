import XCTest
@testable import PowerWatchCore

/// TC-P06: property-style robustness tests — every encoded frame must survive
/// a decode round-trip, and every strict truncation must be rejected (never
/// crash, never silently succeed with garbage).
final class FramePropertyTests: XCTestCase {

    private let samplePayloads: [Gen2CommandID: [UInt8]] = [
        .sendUserInformation: CommandPayloads.sendUserInformation(
            hourFormat: .twentyFour, metricUnits: true,
            unixSeconds: 1_769_000_000, utcOffsetMinutes: 60),
        .sendBiometrics: CommandPayloads.sendBiometrics(
            gender: .female, age: 42, weightKg: 65, heightCm: 170),
        .sendLanguage: CommandPayloads.sendLanguage(.french),
        .sendUserPrefsAndGoals: CommandPayloads.sendUserPrefsAndGoals(
            hourFormat: .twelve, metricUnits: true, unixSeconds: 1_000,
            utcOffsetMinutes: 0, gender: .male, age: 30, weightKg: 70, heightCm: 180,
            stepsGoal: 8_000, distanceGoal: 4_000, caloriesGoal: 500,
            sleepGoalMinutes: 420, locale: .german),
        .alarm: WatchSettingsPayloads.alarm(
            hour: 7, minute: 30, isAM: true, days: .everyDay, control: .on),
        .timer: WatchSettingsPayloads.timer(
            hour: 1, minute: 2, seconds: 3, control: .start),
    ]

    /// Every command round-trips, with and without a payload.
    func testAllCommandsRoundTrip() throws {
        for command in Gen2CommandID.allCases {
            for payload in [samplePayloads[command] ?? [], [0x01, 0x02, 0xFF]] {
                let frame = DTPFrame(command: command, payload: payload)
                let decoded = try DTPFrame.decode(frame.encoded)
                XCTAssertEqual(decoded.command, command)
                XCTAssertEqual(decoded.payload, payload)
            }
        }
    }

    /// No strict truncation of a valid frame ever decodes successfully.
    func testTruncationsAreRejected() {
        for command in Gen2CommandID.allCases {
            let frame = DTPFrame(command: command, payload: samplePayloads[command] ?? [0xAB])
            let encoded = frame.encoded
            for cut in 1..<encoded.count {
                XCTAssertThrowsError(
                    try DTPFrame.decode(Array(encoded[..<cut])),
                    "truncation at \(cut) bytes for \(command.rawValue) should throw")
            }
        }
    }

    /// Flipping any single payload bit breaks the CRC. (The Android app does
    /// not validate the frame magic, and a flipped command-id bit can alias
    /// to another valid command, so only length + payload bits are asserted.)
    func testPayloadBitFlipsAreRejected() throws {
        let frame = DTPFrame(command: .backgroundLog, payload: [0x00, 0x11, 0x22, 0x33])
        let encoded = frame.encoded
        // Payload starts at header(4) + command(2); CRC is the last 4 bytes.
        let payloadRange = 6..<(encoded.count - 4)
        for index in payloadRange {
            for bit in 0..<8 {
                var corrupted = encoded
                corrupted[index] ^= (1 << bit)
                XCTAssertThrowsError(
                    try DTPFrame.decode(corrupted),
                    "bit \(bit) of payload byte \(index) flipped should fail CRC")
            }
        }
        // Length header corruption must also fail framing.
        for index in 0...1 {
            var corrupted = encoded
            corrupted[index] ^= 0x01
            XCTAssertThrowsError(try DTPFrame.decode(corrupted))
        }
    }

    /// Parser robustness: odd-length log payloads throw instead of crashing.
    func testLogParsersRejectBadSizes() {
        let sizes = [1, 3, 5, 7, 15, 17, 11, 13, 47, 49, 27, 29]
        for size in sizes {
            let payload = [UInt8](repeating: 0x7F, count: size)
            XCTAssertThrowsError(try LogParsers.parseBackgroundLogs(payload))
            XCTAssertThrowsError(try LogParsers.parseSleepLogs(payload))
            XCTAssertThrowsError(try LogParsers.parseActivityStartLogs(payload))
            XCTAssertThrowsError(try LogParsers.parseActivityEndLogs(payload))
            XCTAssertThrowsError(try LogParsers.parseActivityDeltaLogs(payload))
            // The ver-3 activity parsers are deliberately tolerant: FW v3.01.00
            // answers `9215`/`9205` with short junk bodies when its count says
            // there are no records, and failing the sync there lost every other
            // result. They must not throw, and must not crash either.
            _ = try? LogParsers.parseVer3ActivityHeaderLogs(payload)
            _ = try? LogParsers.parseVer3ActivityDeltaLogs(payload)
            XCTAssertThrowsError(try LogParsers.parseLogCount(payload))
            XCTAssertThrowsError(try LogParsers.parseVer3LogCount(payload))
        }
    }
}
