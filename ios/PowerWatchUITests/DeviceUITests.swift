import XCTest

/// Android parity: the device tab carries the distance goal (Android
/// `DailyGoalsSettingsFragment`) and a personal-settings screen that can
/// edit the biometrics after onboarding (Android `PersonalSettingsFragment`).
final class DeviceUITests: XCTestCase {

    override func setUpWithError() throws {
        continueAfterFailure = false
    }

    func testPersonalSettingsEditAndDistanceGoal() throws {
        let app = XCUIApplication()
        app.launchArguments += ["-uitest-reset", "-uitest-seed"]
        app.launch()

        // Complete onboarding (name + goals, defaults: weight 70 kg,
        // distance goal 5 km).
        let nameField = app.textFields["Name"]
        XCTAssertTrue(nameField.waitForExistence(timeout: 10))
        nameField.tap()
        nameField.typeText("Test User")
        app.buttons["onboarding.next"].tap()
        let saveButton = app.buttons["onboarding.save"]
        XCTAssertTrue(saveButton.waitForExistence(timeout: 10))
        saveButton.tap()
        XCTAssertTrue(app.staticTexts["6000"].waitForExistence(timeout: 10))

        // My PowerWatch tab: distance goal row and the personal-settings link.
        let tab = app.tabBars.buttons["My PowerWatch"]
        XCTAssertTrue(tab.waitForExistence(timeout: 10))
        tab.tap()
        let distanceRow = app.staticTexts.containing(
            NSPredicate(format: "label BEGINSWITH %@", "Distance:")).firstMatch
        XCTAssertTrue(distanceRow.waitForExistence(timeout: 10),
                      "device tab should carry the distance goal stepper")

        let link = app.buttons["device.personalSettings"]
        for _ in 0..<6 where !link.isHittable {
            app.swipeUp()
        }
        XCTAssertTrue(link.waitForExistence(timeout: 10))
        link.tap()

        // Edit the gender (male → female) and save.
        let gender = app.buttons.containing(
            NSPredicate(format: "label BEGINSWITH %@", "Gender,")).firstMatch
        XCTAssertTrue(gender.waitForExistence(timeout: 10))
        gender.tap()
        let female = app.buttons["Female"]
        XCTAssertTrue(female.waitForExistence(timeout: 10))
        female.tap()
        app.buttons["settings.save"].tap()
        XCTAssertTrue(app.staticTexts["Saved."].waitForExistence(timeout: 10),
                      "save without a watch should confirm locally")

        // Back and re-enter: the edit persisted.
        app.navigationBars.buttons["My PowerWatch"].tap()
        let relink = app.buttons["device.personalSettings"]
        for _ in 0..<6 where !relink.isHittable {
            app.swipeUp()
        }
        relink.tap()
        let genderFemale = app.buttons.containing(
            NSPredicate(format: "label BEGINSWITH %@", "Gender, Female")).firstMatch
        XCTAssertTrue(genderFemale.waitForExistence(timeout: 10),
                      "personal-settings edits must persist after saving")
    }

    /// Android `NotificationSettingsFragment`: the three phone-side switches
    /// (connection / battery / goals) with Android's on-by-default behavior.
    func testNotificationSwitches() throws {
        let app = XCUIApplication()
        app.launchArguments += ["-uitest-reset", "-uitest-seed"]
        app.launch()

        let nameField = app.textFields["Name"]
        XCTAssertTrue(nameField.waitForExistence(timeout: 10))
        nameField.tap()
        nameField.typeText("Test User")
        app.buttons["onboarding.next"].tap()
        let saveButton = app.buttons["onboarding.save"]
        XCTAssertTrue(saveButton.waitForExistence(timeout: 10))
        saveButton.tap()
        XCTAssertTrue(app.staticTexts["6000"].waitForExistence(timeout: 10))

        // Clear any system permission prompt left on screen from earlier runs.
        let springboard = XCUIApplication(bundleIdentifier: "com.apple.springboard")
        let staleAllow = springboard.buttons["Allow"]
        if staleAllow.waitForExistence(timeout: 2) {
            staleAllow.tap()
            usleep(500_000)
        }

        app.tabBars.buttons["My PowerWatch"].tap()
        let connection = app.switches["device.notify.connection"]
        XCTAssertTrue(connection.waitForExistence(timeout: 10),
                      "connection-notification switch should show")
        // The notifications section sits under the tab bar until scrolled:
        // lazy Form rows only render (and only take taps) once fully visible.
        func fullyVisible(_ element: XCUIElement) -> Bool {
            let f = element.frame
            return f.minY > 80 && f.maxY < app.frame.maxY - 110
        }
        for _ in 0..<8 where !fullyVisible(connection) {
            app.swipeUp()
        }
        XCTAssertTrue(fullyVisible(connection), "connection switch must scroll into view")
        XCTAssertTrue(app.switches["device.notify.battery"].exists)
        XCTAssertTrue(app.switches["device.notify.goals"].exists)

        func waitValue(_ element: XCUIElement, _ expected: String) -> Bool {
            for _ in 0..<10 {
                if element.value as? String == expected { return true }
                usleep(300_000)
            }
            return false
        }
        // The Switch-identifying element spans the whole row; only its nested
        // knob child receives the toggle tap (row-center taps land on the
        // label, which does not toggle).
        func knob(_ id: String) -> XCUIElement {
            app.switches[id].switches.firstMatch
        }

        // Android defaults: all three on. Toggle connection off…
        XCTAssertTrue(waitValue(connection, "1"), "switches default to on (Android)")
        knob("device.notify.connection").tap()
        XCTAssertTrue(waitValue(connection, "0"), "toggling off must stick")
        XCTAssertTrue(waitValue(app.switches["device.notify.battery"], "1"),
                      "the other switches stay untouched")

        // …and back on — the first re-enable may raise the system
        // permission prompt (already-determined authorization on later runs).
        knob("device.notify.connection").tap()
        XCTAssertTrue(waitValue(connection, "1"), "toggling back on must stick")
        let allow = springboard.buttons["Allow"]
        if allow.waitForExistence(timeout: 5) {
            allow.tap()
        }
        XCTAssertTrue(app.tabBars.buttons["My PowerWatch"].exists,
                      "toggling notifications must not destabilize the app")
    }
}
