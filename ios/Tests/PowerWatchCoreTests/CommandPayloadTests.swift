import XCTest
@testable import PowerWatchCore

/// TC-P03–P05, P08 — payload encoders produce the exact Android byte layout.
final class CommandPayloadTests: XCTestCase {

    // TC-P03: user info (9002)
    func testSendUserInformation() {
        let payload = CommandPayloads.sendUserInformation(
            hourFormat: .twentyFour, metricUnits: true,
            unixSeconds: 1_769_000_000, utcOffsetMinutes: -300)
        XCTAssertEqual(payload, [
            0x01, 0x01,                                   // 24h, metric
            0x69, 0x70, 0xCC, 0x40,                       // 1_769_000_000 BE
            0xFE, 0xD4,                                   // -300 as UInt16 BE
        ])
        XCTAssertEqual(payload.count, 8)
    }

    // TC-P04: biometrics (9012)
    func testSendBiometrics() {
        let payload = CommandPayloads.sendBiometrics(
            gender: .female, age: 36, weightKg: 68, heightCm: 172)
        XCTAssertEqual(payload, [
            0x01,          // female
            36,            // age
            0x00, 0x44,    // 68 kg
            0x06, 0xB8,    // 172 * 10 = 1720
        ])
        XCTAssertEqual(payload.count, 6)
    }

    func testSendLanguage() {
        XCTAssertEqual(CommandPayloads.sendLanguage(.english), [0])
        XCTAssertEqual(CommandPayloads.sendLanguage(.german), [4])
        XCTAssertEqual(CommandPayloads.sendLanguage(.polish), [12])
    }

    func testGoals() {
        XCTAssertEqual(
            CommandPayloads.sendStepsDistanceGoal(steps: 10_000, distance: 5_000),
            [0x00, 0x00, 0x27, 0x10, 0x00, 0x00, 0x13, 0x88])
        XCTAssertEqual(
            CommandPayloads.sendCaloriesSleepGoal(calories: 600, sleepMinutes: 480),
            [0x00, 0x00, 0x02, 0x58, 0x00, 0x00, 0x01, 0xE0])
    }

    // TC-P08: clean commands carry no payload
    func testCleanCommandsArePayloadFree() {
        XCTAssertTrue(CommandPayloads.cleanAllLogs().isEmpty)
        XCTAssertTrue(CommandPayloads.cleanActivityLogs().isEmpty)
        XCTAssertTrue(CommandPayloads.cleanBackgroundLogs().isEmpty)
        XCTAssertTrue(CommandPayloads.cleanSleepLogs().isEmpty)
        XCTAssertTrue(CommandPayloads.cleanRTLLogs().isEmpty)
        XCTAssertTrue(CommandPayloads.startPairing().isEmpty)
        XCTAssertTrue(CommandPayloads.stopPairing().isEmpty)
        XCTAssertTrue(CommandPayloads.startAmDTP().isEmpty)
        XCTAssertTrue(CommandPayloads.stopAmDTP().isEmpty)
    }

    // TC-P05: log-count parse
    func testParseLogCount() throws {
        var writer = ByteWriter()
        for value: UInt32 in [2, 10, 3, 4, 120, 7, 6] {
            writer.write(value)
        }
        let counts = try LogParsers.parseLogCount(writer.bytes)
        XCTAssertEqual(counts.realtimeStatusLogs, 2)
        XCTAssertEqual(counts.realtimeLogs, 10)
        XCTAssertEqual(counts.activityStartLogs, 3)
        XCTAssertEqual(counts.activityEndLogs, 4)
        XCTAssertEqual(counts.activityDeltaLogs, 120)
        XCTAssertEqual(counts.backgroundLogs, 7)
        XCTAssertEqual(counts.sleepLogs, 6)
        // header count is a literal 0 in the Android constructor
        XCTAssertEqual(counts.activityHeaderLogs, 0)
    }

    func testParseLogCountRejectsWrongSize() {
        XCTAssertThrowsError(try LogParsers.parseLogCount([1, 2, 3]))
        XCTAssertThrowsError(try LogParsers.parseLogCount([UInt8](repeating: 0, count: 32)))
    }

    // TC-P06: sleep log decode
    func testParseSleepLogs() throws {
        var writer = ByteWriter()
        // record 1
        writer.write(UInt32(1_740_000_000), bigEndian: false)
        writer.write(UInt32(1_740_004_500), bigEndian: false)
        // w3: hoursSlept bits 0-7, minutes bits 8-15, restless bits 16-23, light bits 24-31
        writer.write(UInt32(7 | 30 << 8 | 5 << 16 | 20 << 24), bigEndian: false)
        // w4: percentDeep bits 0-7, quality bits 8-15
        writer.write(UInt32(0x14 | 0x4B << 8), bigEndian: false)
        // record 2 (all zeros)
        writer.write([UInt8](repeating: 0, count: 16))

        let entries = try LogParsers.parseSleepLogs(writer.bytes)
        XCTAssertEqual(entries.count, 2)
        XCTAssertEqual(entries[0].startSleepTime, 1_740_000_000)
        XCTAssertEqual(entries[0].endSleepTime, 1_740_004_500)
        XCTAssertEqual(entries[0].hoursSlept, 7)
        XCTAssertEqual(entries[0].minutesSlept, 30)
        XCTAssertEqual(entries[0].percentRestless, 5)
        XCTAssertEqual(entries[0].percentLightSleep, 20)
        XCTAssertEqual(entries[0].percentDeepSleep, 0x14)   // 20
        XCTAssertEqual(entries[0].sleepQuality, 0x4B)        // 75
        XCTAssertEqual(entries[1].hoursSlept, 0)
    }

    func testParseSleepLogsRejectsBadSize() {
        XCTAssertThrowsError(try LogParsers.parseSleepLogs([UInt8](repeating: 0, count: 15)))
    }

    func testParseBackgroundRecord() throws {
        // Build a 16-byte LE record with known field values.
        func pack(_ w1: UInt32, _ w2: UInt32, _ w3: UInt32, _ w4: UInt32) -> [UInt8] {
            var writer = ByteWriter()
            for word in [w1, w2, w3, w4] { writer.write(word, bigEndian: false) }
            return writer.bytes
        }
        // w1: logTimeIndex=9 (bits 0-6), walk=20 (7-14), running=5 (15-22), distance=3 (23-31)
        let w1: UInt32 = 9 | 20 << 7 | 5 << 15 | 3 << 23
        // w2: activeCals=1000 (0-14), bmr=200 (15-25), thermalGenIdx=0 (26-31)
        let w2: UInt32 = 1000 | 200 << 15
        // w3: skinTemp=42 (0-8), consIdx=0 (9-16), hr=66 (17-24), hrv=40 (25-31)
        let w3: UInt32 = 42 | 0 << 9 | 66 << 17 | 40 << 25
        // w4: battery=88 (0-6), solarGenIdx=0 (7-12), caseTemp=30 (13-21, 9-bit), type=2 sleepLight (22-25)
        let w4: UInt32 = 88 | 0 << 7 | 30 << 13 | UInt32(LogType.sleepLight.rawValue) << 22

        let entries = try LogParsers.parseBackgroundLogs(pack(w1, w2, w3, w4))
        XCTAssertEqual(entries.count, 1)
        let entry = entries[0]
        XCTAssertEqual(entry.logType, .sleepLight)
        XCTAssertEqual(entry.logTimeIndex, 9)
        XCTAssertEqual(entry.walkStepDelta, 20)
        XCTAssertEqual(entry.runningStepDelta, 5)
        XCTAssertEqual(entry.distanceDelta, 3)
        XCTAssertEqual(entry.battery, 88)
        XCTAssertEqual(entry.activeCalories, 1000)
        XCTAssertEqual(entry.bmrCalories, 200)
        XCTAssertEqual(entry.heartRate, 66)
        XCTAssertEqual(entry.hrv, 40)
        XCTAssertEqual(entry.powerLog.caseTemp, 30)
        XCTAssertEqual(entry.powerLog.skinTemp, 42)
        XCTAssertEqual(entry.powerLog.solarGen, 0)
        XCTAssertEqual(entry.powerLog.powerConsumed, 0)
    }

    func testBackgroundLogNegativeCaseTemp() throws {
        // w4 with 9-bit field bits 13-21 = 300 (> 255 → 300 - 512 = -212)
        let w4: UInt32 = 300 << 13
        var writer = ByteWriter()
        writer.write(UInt32(0), bigEndian: false)
        writer.write(UInt32(0), bigEndian: false)
        writer.write(UInt32(0), bigEndian: false)
        writer.write(w4, bigEndian: false)
        let entry = try LogParsers.parseBackgroundLogs(writer.bytes)[0]
        XCTAssertEqual(entry.powerLog.caseTemp, -212)
    }

    func testTimestampAssignment() throws {
        var writer = ByteWriter()
        // two entries with same logTimeIndex=1 (w1 bits 0-6), type sleepDeep (w4 type field = 1)
        let w1: UInt32 = 1
        let w4: UInt32 = UInt32(LogType.sleepDeep.rawValue) << 22
        for _ in 0..<2 {
            writer.write(w1, bigEndian: false)
            writer.write(UInt32(0), bigEndian: false)
            writer.write(UInt32(0), bigEndian: false)
            writer.write(w4, bigEndian: false)
        }
        let parsed = try LogParsers.parseBackgroundLogs(writer.bytes)
        let timed = try LogParsers.assignTimestamps(parsed, rtlTimestampsByIndex: [1: 1_000_000])
        XCTAssertEqual(timed[0].timestamp, 1_000_000)
        XCTAssertEqual(timed[1].timestamp, 1_060_000)
        XCTAssertTrue(timed[0].isSleep)
        XCTAssertEqual(timed[0].sleepQuality, 5)   // deep
    }

    func testTimestampAssignmentUnknownIndexThrows() {
        var writer = ByteWriter()
        writer.write(UInt32(5 << 23), bigEndian: false)
        writer.write(UInt32(0), bigEndian: false)
        writer.write(UInt32(0), bigEndian: false)
        writer.write(UInt32(0), bigEndian: false)
        let parsed = try? LogParsers.parseBackgroundLogs(writer.bytes)
        XCTAssertThrowsError(try LogParsers.assignTimestamps(parsed!, rtlTimestampsByIndex: [1: 0]))
    }

    func testParseRealtime() throws {
        var writer = ByteWriter()
        writer.write(UInt32(1_740_000_000))
        writer.write(UInt32(4_321))
        writer.write(UInt32(3_100))
        writer.write(UInt32(450))
        let data = try LogParsers.parseRealtime(writer.bytes)
        XCTAssertEqual(data.timestamp, 1_740_000_000)
        XCTAssertEqual(data.currentSteps, 4_321)
        XCTAssertEqual(data.currentDistance, 3_100)
        XCTAssertEqual(data.currentCalories, 450)
    }

    func testParseLiveTotals() {
        // `00002a25` value: [v0, v1, v2, tag] groups, value a 24-bit LE int.
        // Calories and distance are transmitted thousandths (÷1000), skin temp
        // is 24-bit signed — all per `RealtimeDataParser`/`HSMTable`.
        let payload: [UInt8] = [
            0x5E, 0x02, 0x00, 0x00,   // tag 0  — total steps 606
            0x50, 0xD4, 0x12, 0x12,   // tag 18 — 1_234_000 → 1234 kcal
            0xA4, 0x01, 0x00, 0x20,   // tag 32 — sleep 420 min
            0xC0, 0x01, 0x00, 0x30,   // tag 48 — distance 448 m (as sent)
            0xD2, 0x04, 0x00, 0x40,   // tag 64 — solar 1234 µW
            0xF4, 0x01, 0x00, 0x41,   // tag 65 — thermal 500 µW
            0x57, 0x00, 0x00, 0x42,   // tag 66 — battery 87 %
            0xFB, 0xFF, 0xFF, 0x50,   // tag 80 — skin temp −5 (signed)
        ]
        let totals = LogParsers.parseLiveTotals(payload)
        XCTAssertEqual(totals.totalSteps, 606)
        XCTAssertEqual(totals.activeCalories, 1234)
        XCTAssertEqual(totals.sleepMinutes, 420)
        XCTAssertEqual(totals.distanceMetres, 448)
        XCTAssertEqual(totals.solarPower, 1234)
        XCTAssertEqual(totals.thermalPower, 500)
        XCTAssertEqual(totals.batteryPercent, 87)
        XCTAssertEqual(totals.skinTemp, -5)
    }

    func testParseLiveTotalsIgnoresUnknownTagsAndPartialGroup() {
        let payload: [UInt8] = [
            0x09, 0x03, 0x00, 0x01,   // tag 1 (current walk steps) — unused
            0x5E, 0x02, 0x00, 0x00,   // tag 0  — total steps 606
            0xAA, 0xBB, 0xCC,         // short trailing group is discarded
        ]
        XCTAssertEqual(LogParsers.parseLiveTotals(payload).totalSteps, 606)
        XCTAssertEqual(LogParsers.parseLiveTotals([]).totalSteps, 0)
    }

    func testParseLiveTotalsFromRealWatchCapture() {
        // Verbatim `00002a25` value from the v3.01.00 watch (trace t21,
        // 13:52:21), whose face read 606 steps. Tag 81 is not in `HSMTable`.
        let hex = "5e0200005e0200010000000258c40610b9bf04119f0402121f000020"
            + "c0010030d9000040270000417f0000507d00005156000042"
        let payload = stride(from: 0, to: hex.count, by: 2).map {
            UInt8(hex[hex.index(hex.startIndex, offsetBy: $0)
                ..< hex.index(hex.startIndex, offsetBy: $0 + 2)], radix: 16)!
        }
        let totals = LogParsers.parseLiveTotals(payload)
        XCTAssertEqual(totals.totalSteps, 606)
        XCTAssertEqual(totals.activeCalories, 132)
        XCTAssertEqual(totals.sleepMinutes, 31)
        XCTAssertEqual(totals.distanceMetres, 448)
        XCTAssertEqual(totals.solarPower, 217)
        XCTAssertEqual(totals.thermalPower, 39)
        XCTAssertEqual(totals.batteryPercent, 86)
        XCTAssertEqual(totals.skinTemp, 127)
    }

    func testParseRTLTimes() throws {
        // Android reads the byte-reversed payload as BE u32s, then reverses
        // the list — equivalent to reading little-endian u32s in order.
        var writer = ByteWriter()
        writer.write(UInt32(100), bigEndian: false)
        writer.write(UInt32(200), bigEndian: false)
        writer.write(UInt32(300), bigEndian: false)
        let times = try LogParsers.parseRTLTimes(writer.bytes)
        XCTAssertEqual(times, [100, 200, 300])
    }
}
