import XCTest
@testable import PowerWatchCore

/// TC-P07: 93xx watch-settings payloads (modes, alarm, timer).
final class WatchSettingsTests: XCTestCase {

    func testSingleByteModePayloads() {
        XCTAssertEqual(WatchSettingsPayloads.dnd(.auto), [0x02])
        XCTAssertEqual(WatchSettingsPayloads.backLight(.wristTilt), [0x02])
        XCTAssertEqual(WatchSettingsPayloads.backLightDuration(.timed5Sec), [0x01])
        XCTAssertEqual(WatchSettingsPayloads.popupDuration(.timed15Sec), [0x02])
        XCTAssertEqual(WatchSettingsPayloads.gpsUpdateRate(.timed2Sec), [0x02])
        XCTAssertEqual(WatchSettingsPayloads.homeScreen(.power), [0x03])
        XCTAssertEqual(WatchSettingsPayloads.bleDisconnectionAlert(.vibeAudio), [0x03])
        XCTAssertEqual(WatchSettingsPayloads.ringtone(.triple), [0x02])
        XCTAssertEqual(WatchSettingsPayloads.alertType(.vibrate), [0x01])
        XCTAssertEqual(WatchSettingsPayloads.reset(.factoryReset), [0x01])
    }

    func testAlarmPayload() {
        // hour, minute, PM flag (!isAM), day selection, control — 5 bytes
        XCTAssertEqual(
            WatchSettingsPayloads.alarm(hour: 7, minute: 30, isAM: false,
                                       days: .everyWeekDay, control: .on),
            [7, 30, 1, 1, 1])
        XCTAssertEqual(
            WatchSettingsPayloads.alarm(hour: 23, minute: 0, isAM: true,
                                       days: .everyDay, control: .once),
            [23, 0, 0, 0, 2])
    }

    func testTimerPayload() {
        // hour, minute, seconds, control — 4 bytes
        XCTAssertEqual(
            WatchSettingsPayloads.timer(hour: 1, minute: 2, seconds: 3, control: .start),
            [1, 2, 3, 0])
        XCTAssertEqual(
            WatchSettingsPayloads.timer(hour: 0, minute: 5, seconds: 0, control: .pause),
            [0, 5, 0, 1])
    }
}

/// TC-P07 extension: bulk user-prefs payload (9022/9024) and location (9015).
final class BulkPrefsPayloadTests: XCTestCase {

    func testSendUserPrefsAndGoalsLayout() {
        // 31 bytes: 1+1+4+2 (watch) + 1+1+2+2 (user) + 4*4 (goals) + 1 (locale)
        let payload = CommandPayloads.sendUserPrefsAndGoals(
            hourFormat: .twentyFour,
            metricUnits: true,
            unixSeconds: 1_769_000_000,
            utcOffsetMinutes: -120,
            gender: .female,
            age: 42,
            weightKg: 65,
            heightCm: 170,
            stepsGoal: 10_000,
            distanceGoal: 5_000,
            caloriesGoal: 600,
            sleepGoalMinutes: 480,
            locale: .english)
        XCTAssertEqual(payload.count, 31)
        XCTAssertEqual(payload[0], 1)                 // 24h format
        XCTAssertEqual(payload[1], 1)                 // metric
        XCTAssertEqual(Array(payload[2...5]), [0x69, 0x70, 0xCC, 0x40])   // unix seconds
        XCTAssertEqual(Array(payload[6...7]), [0xFF, 0x88])                // -120 as u16
        XCTAssertEqual(payload[8], 1)                 // female
        XCTAssertEqual(payload[9], 42)                // age
        XCTAssertEqual(Array(payload[10...11]), [0x00, 0x41])             // 65 kg
        XCTAssertEqual(Array(payload[12...13]), [0x06, 0xA4])             // 1700 = 170 cm × 10
        XCTAssertEqual(Array(payload[14...17]), [0x00, 0x00, 0x27, 0x10])   // 10 000 steps
        XCTAssertEqual(Array(payload[18...21]), [0x00, 0x00, 0x13, 0x88]) // 5 000 m
        XCTAssertEqual(Array(payload[22...25]), [0x00, 0x00, 0x02, 0x58])  // 600 kcal
        XCTAssertEqual(Array(payload[26...29]), [0x00, 0x00, 0x01, 0xE0]) // 480 min sleep
        XCTAssertEqual(payload[30], 0)                 // english
    }

    func testSendUserPrefsAndGoalsVer3AppendsSleepTime() {
        let base = CommandPayloads.sendUserPrefsAndGoals(
            hourFormat: .twelve, metricUnits: false, unixSeconds: 0, utcOffsetMinutes: 0,
            gender: .male, age: 30, weightKg: 70, heightCm: 180,
            stepsGoal: 8_000, distanceGoal: 4_000, caloriesGoal: 500,
            sleepGoalMinutes: 420, locale: .french)
        let ver3 = CommandPayloads.sendUserPrefsAndGoalsVer3(
            hourFormat: .twelve, metricUnits: false, unixSeconds: 0, utcOffsetMinutes: 0,
            gender: .male, age: 30, weightKg: 70, heightCm: 180,
            stepsGoal: 8_000, distanceGoal: 4_000, caloriesGoal: 500,
            sleepGoalMinutes: 420, locale: .french, sleepTimeSelection: 3)
        XCTAssertEqual(ver3.count, 32)
        XCTAssertEqual(Array(ver3.dropLast()), base)
        XCTAssertEqual(ver3.last, 3)
    }

    func testSendUserLocationLayout() {
        // 16 bytes: unix seconds, lat × 1e7, lon × 1e7, alt × 100
        let payload = CommandPayloads.sendUserLocation(
            unixSeconds: 1_000_000,
            latitude: 12.5,
            longitude: -0.001,
            altitude: 123.45)
        XCTAssertEqual(payload.count, 16)
        XCTAssertEqual(Array(payload[0...3]), [0x00, 0x0F, 0x42, 0x40])
        XCTAssertEqual(Array(payload[4...7]), [0x07, 0x73, 0x59, 0x40])   // 125 000 000
        XCTAssertEqual(Array(payload[8...11]), [0xFF, 0xFF, 0xD8, 0xF0])  // -10 000
        XCTAssertEqual(Array(payload[12...15]), [0x00, 0x00, 0x30, 0x39]) // 12 345
    }
}
