import XCTest
@testable import PowerWatchCore

/// TC-P05 extension: activity start/end logs (9115/9125), ver-3 log count
/// (9126) and ver-3 delta logs (9205).
final class ActivityLogTests: XCTestCase {

    /// Packs 12 little-endian UInt32 words into a 48-byte record.
    private func record(_ words: [UInt32]) -> [UInt8] {
        var bytes: [UInt8] = []
        for word in words {
            bytes.append(UInt8(word & 0xFF))
            bytes.append(UInt8((word >> 8) & 0xFF))
            bytes.append(UInt8((word >> 16) & 0xFF))
            bytes.append(UInt8((word >> 24) & 0xFF))
        }
        return bytes
    }

    func testParseActivityStartRecord() throws {
        // w1: time, w2: latitude bits, w3: longitude bits,
        // w4: stepsRun 0-17 / skinTemp 18-25, w5: stepsWalk 0-17 / caseTemp 18-25,
        // w6: distance 0-18, w7: activeCals 0-23 / HRV 24-30,
        // w8: bmrCals 0-23 / heartRate 24-30,
        // w9: thermalGen 0-17 / type 18-25, w10: solarGen 0-17 / value2 18-25,
        // w11: powerConsumed 0-29, w12: log index.
        let entry = try LogParsers.parseActivityStartRecord(record([
            1_000_000,                                   // startTime
            Float(37.7749).bitPattern,                    // latitude
            Float(-122.4194).bitPattern,                 // longitude
            300 | (40 << 18),                            // stepsRunning 300, skinTemp 40
            1_200 | (55 << 18),                          // stepsWalk 1200, caseTemp 55
            5_000,                                       // distance
            90 | (60 << 24),                             // activeCals 90, HRV 60
            150 | (70 << 24),                            // bmrCals 150, heartRate 70
            12 | (2 << 18),                              // thermalGen 12, type 2 (running)
            34 | (9 << 18),                              // solarGen 34, value2 9
            789,                                         // powerConsumed
            42                                           // logIndex
        ]))

        XCTAssertEqual(entry.type, .running)
        XCTAssertEqual(entry.startTime, 1_000_000)
        XCTAssertEqual(entry.startLogIndex, 42)
        XCTAssertEqual(entry.startLatitude, 37.7749, accuracy: 0.001)
        XCTAssertEqual(entry.startLongitude, -122.4194, accuracy: 0.001)
        XCTAssertEqual(entry.startLogDistance, 5_000)
        XCTAssertEqual(entry.startStepsWalk, 1_200)
        XCTAssertEqual(entry.startStepsRunning, 300)
        XCTAssertEqual(entry.startActiveCals, 90)
        XCTAssertEqual(entry.startBMRCals, 150)
        XCTAssertEqual(entry.startHeartRate, 70)
        XCTAssertEqual(entry.startHRV, 60)
        XCTAssertEqual(entry.activityValue2, 9)
        XCTAssertEqual(entry.powerLog.caseTemp, 55)
        XCTAssertEqual(entry.powerLog.skinTemp, 40)
        XCTAssertEqual(entry.powerLog.thermalGen, 12)
        XCTAssertEqual(entry.powerLog.solarGen, 34)
        XCTAssertEqual(entry.powerLog.powerConsumed, 789)
        XCTAssertEqual(entry.activityId, 0)
        XCTAssertEqual(entry.startAltitude, 0)
    }

    func testParseActivityEndRecord() throws {
        let entry = try LogParsers.parseActivityEndRecord(record([
            2_000_000,                                   // endLogTime
            Float(10.5).bitPattern,                      // latitude
            Float(-20.25).bitPattern,                    // longitude
            250 | (45 << 18),                            // stepsRunning, skinTemp
            800 | (60 << 18),                            // stepsWalk, caseTemp
            6_000,                                       // distance
            120 | (55 << 24),                            // activeCals, HRV
            200 | (80 << 24),                            // bmrCals, heartRate
            20 | (7 << 18),                              // thermalGen, value1
            30 | (8 << 18),                              // solarGen, value2
            999,                                         // powerConsumed
            43                                           // logIndex
        ]))

        XCTAssertEqual(entry.endLogTime, 2_000_000)
        XCTAssertEqual(entry.endLogIndex, 43)
        XCTAssertEqual(entry.endLogDistance, 6_000)
        XCTAssertEqual(entry.endStepsWalk, 800)
        XCTAssertEqual(entry.endStepsRunning, 250)
        XCTAssertEqual(entry.endActiveCals, 120)
        XCTAssertEqual(entry.endBMRCals, 200)
        XCTAssertEqual(entry.endHeartRate, 80)
        XCTAssertEqual(entry.endHRV, 55)
        XCTAssertEqual(entry.endThermalGen, 20)
        XCTAssertEqual(entry.endSolarGen, 30)
        XCTAssertEqual(entry.endPowerConsumed, 999)
        XCTAssertEqual(entry.endSkinTemp, 45)
        XCTAssertEqual(entry.endCaseTemp, 60)
        XCTAssertEqual(entry.endLatitude, 10.5, accuracy: 0.001)
        XCTAssertEqual(entry.endLongitude, -20.25, accuracy: 0.001)
        XCTAssertEqual(entry.endActivityValue1, 7)
        XCTAssertEqual(entry.endActivityValue2, 8)
    }

    func testActivityLogSizeMismatch() {
        XCTAssertThrowsError(try LogParsers.parseActivityStartLogs([UInt8](repeating: 0, count: 47))) {
            XCTAssertEqual($0 as? DTPProtocolError, .activityStartLogSizeMismatch)
        }
        XCTAssertThrowsError(try LogParsers.parseActivityEndLogs([UInt8](repeating: 0, count: 40))) {
            XCTAssertEqual($0 as? DTPProtocolError, .activityEndLogSizeMismatch)
        }
    }

    func testMultipleStartRecordsRoundTrip() throws {
        let payload = record(Array(repeating: 0, count: 12)) + record(Array(repeating: 0, count: 12))
        let entries = try LogParsers.parseActivityStartLogs(payload)
        XCTAssertEqual(entries.count, 2)
    }

    func testParseVer3LogCount() throws {
        var payload: [UInt8] = []
        for value: UInt32 in [5, 100, 7, 1_000, 2_000, 30] {
            payload.append(UInt8(value >> 24))
            payload.append(UInt8((value >> 16) & 0xFF))
            payload.append(UInt8((value >> 8) & 0xFF))
            payload.append(UInt8(value & 0xFF))
        }
        let count = try LogParsers.parseVer3LogCount(payload)
        XCTAssertEqual(count.realtimeStatusLogs, 5)
        XCTAssertEqual(count.realtimeLogs, 100)
        XCTAssertEqual(count.activityHeaderLogs, 7)
        XCTAssertEqual(count.activityStartLogs, 0)
        XCTAssertEqual(count.activityEndLogs, 0)
        XCTAssertEqual(count.activityDeltaLogs, 1_000)
        XCTAssertEqual(count.backgroundLogs, 2_000)
        XCTAssertEqual(count.sleepLogs, 30)
    }

    func testVer3LogCountWrongSizeThrows() {
        XCTAssertThrowsError(try LogParsers.parseVer3LogCount([UInt8](repeating: 0, count: 28)))
    }

    func testParseVer3ActivityDeltaRecord() throws {
        // w1: step 0-3, distance 4-9, thermalGen 10-15, solarGen 16-21,
        //     powerConsumed 22-29
        // w2: GPSLat 0-7, GPSLong 8-15, altitude 16-23, type 24-31
        // w3: heartRate 0-7, HRV 8-14, calsActive 15-23, skinTemp 24-27,
        //     caseTemp 28-31
        let entry = try LogParsers.parseVer3ActivityDeltaRecord(record([
            5 | (56 << 4) | (6 << 10) | (3 << 16) | (200 << 22),
            4 | (250 << 8) | (200 << 16) | (1 << 24),
            110 | (40 << 8) | (75 << 15) | (9 << 24) | (2 << 28)
        ]))

        XCTAssertEqual(entry.type, .walking)
        XCTAssertEqual(entry.deltaStep, 5)
        XCTAssertEqual(entry.deltaDistance, 56)
        XCTAssertEqual(entry.deltaThermalGen, 6)
        XCTAssertEqual(entry.deltaSolarGen, 3)
        XCTAssertEqual(entry.deltaPowerConsumed, 200)
        XCTAssertEqual(entry.deltaGPSLat, 4)
        XCTAssertEqual(entry.deltaGPSLong, -6)   // 250 as signed byte
        XCTAssertEqual(entry.deltaAltitude, -56) // 200 as signed byte
        XCTAssertEqual(entry.deltaHeartRate, 110)
        XCTAssertEqual(entry.deltaHRV, 40)
        XCTAssertEqual(entry.deltaCalsActive, 75)
        XCTAssertEqual(entry.deltaSkinTemp, 9)
        XCTAssertEqual(entry.deltaCaseTemp, 2)
        XCTAssertEqual(entry.deltaRunningStepCount, 0)
        XCTAssertEqual(entry.deltaCalsBRM, 0)
    }
}
