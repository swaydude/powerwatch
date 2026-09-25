import XCTest
@testable import PowerWatchCore

/// TC-U06–TC-U08 — ported models keep field parity with
/// `shared/data/models/*.java`.
final class ModelTests: XCTestCase {

    // TC-U06: User
    func testUserDefaultConstruction() {
        let user = User()
        XCTAssertEqual(user.uid, 0)
        XCTAssertTrue(user.enabled)
        XCTAssertEqual(user.name, "")
        XCTAssertEqual(user.email, "")
        XCTAssertEqual(user.password, "")
        XCTAssertEqual(user.age, 0)
        XCTAssertEqual(user.height, 0)
        XCTAssertEqual(user.weight, 0)
        XCTAssertEqual(user.gender, .male)
        XCTAssertTrue(user.shouldSync)
    }

    func testUserFieldParity() {
        let settings = UserAccountSettings(language: "de", timeFormatType: 1, unitType: .imperial)
        let user = User(
            uid: 42, enabled: false, name: "Ada", email: "ada@example.com",
            password: "x", age: 36, height: 170, weight: 68.5,
            gender: .female, shouldSync: false, accountSettings: settings
        )
        XCTAssertEqual(user.uid, 42)
        XCTAssertFalse(user.enabled)
        XCTAssertEqual(user.name, "Ada")
        XCTAssertEqual(user.email, "ada@example.com")
        XCTAssertEqual(user.age, 36)
        XCTAssertEqual(user.height, 170)
        XCTAssertEqual(user.weight, 68.5, accuracy: 0.001)
        XCTAssertEqual(user.gender, .female)
        XCTAssertFalse(user.shouldSync)
        XCTAssertEqual(user.accountSettings, settings)
    }

    // TC-U07: Device / GoalConfiguration / UserAccountSettings
    func testDeviceFieldParity() {
        let device = Device(
            uid: 7, pid: 2, productName: "PowerWatch 2", serialNumber: "SN-123",
            bluetoothAddress: "AA:BB:CC:DD:EE:FF", firmwareVersion: "1.2.3",
            callNotification: true, messageNotification: true, alarmNotification: false,
            activityGoalNotification: true, shouldSync: nil
        )
        XCTAssertEqual(device.pid, 2)
        XCTAssertEqual(device.productName, "PowerWatch 2")
        XCTAssertEqual(device.serialNumber, "SN-123")
        XCTAssertEqual(device.bluetoothAddress, "AA:BB:CC:DD:EE:FF")
        XCTAssertEqual(device.firmwareVersion, "1.2.3")
        XCTAssertTrue(device.callNotification)
        XCTAssertTrue(device.messageNotification)
        XCTAssertFalse(device.alarmNotification)
        XCTAssertTrue(device.activityGoalNotification)
        XCTAssertNil(device.shouldSync)
    }

    func testGoalConfigurationFieldParity() {
        let goal = GoalConfiguration(
            id: 1, steps: 10000, calories: 600, sleep: 8, power: 300,
            distance: 5.5, createdAt: 1_769_000_000_000, shouldSync: true
        )
        XCTAssertEqual(goal.steps, 10000)
        XCTAssertEqual(goal.calories, 600)
        XCTAssertEqual(goal.sleep, 8)
        XCTAssertEqual(goal.power, 300)
        XCTAssertEqual(goal.distance, 5.5, accuracy: 0.001)
        XCTAssertEqual(goal.createdAt, 1_769_000_000_000)
        XCTAssertTrue(goal.shouldSync)
    }

    // TC-U08: enums
    func testEnumParity() {
        XCTAssertEqual(Set(Gender.allCases.map(\.rawValue)), Set(["male", "female"]))
        XCTAssertEqual(Set(UnitType.allCases.map(\.rawValue)), Set(["metric", "imperial"]))
        XCTAssertEqual(HourFormat.twelve.rawValue, 0)
        XCTAssertEqual(HourFormat.twentyFour.rawValue, 1)
        XCTAssertEqual(UserAccountSettings().timeFormatType, HourFormat.twelve.rawValue)
    }

    func testSleepTypeEnumRoundTrip() {
        // Raw values are the uppercase Android enum names stored in the DB
        // via SleepTypeTypeConverter (`SleepType.java`: SLEEP_AWAKE,
        // RESTLESS, LIGHT, DEEP).
        XCTAssertEqual(Set(SleepType.allCases.map(\.rawValue)),
                       Set(["SLEEP_AWAKE", "RESTLESS", "LIGHT", "DEEP"]))
        for type in SleepType.allCases {
            XCTAssertEqual(SleepType(rawValue: type.rawValue), type)
        }
    }
}
