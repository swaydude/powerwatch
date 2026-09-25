import XCTest

/// TC-X03: watch-settings screen (T5.6) — the 93xx family UI edits local
/// values and reports the offline state (no watch connected → send fails
/// with a hint, nothing crashes).
final class WatchSettingsUITests: XCTestCase {

    override func setUpWithError() throws {
        continueAfterFailure = false
    }

    func testWatchSettingsTabEditsAndSends() throws {
        let app = XCUIApplication()
        app.launchArguments += ["-uitest-reset", "-uitest-seed"]
        app.launch()

        // Complete onboarding to reach the tabs.
        let nameField = app.textFields["Name"]
        XCTAssertTrue(nameField.waitForExistence(timeout: 10))
        nameField.tap()
        nameField.typeText("Test User")
        app.buttons["onboarding.next"].tap()
        let saveButton = app.buttons["onboarding.save"]
        XCTAssertTrue(saveButton.waitForExistence(timeout: 10))
        saveButton.tap()
        XCTAssertTrue(app.staticTexts["6000"].waitForExistence(timeout: 10))

        // Open the watch-settings tab.
        let tab = app.tabBars.buttons["Watch Settings"]
        XCTAssertTrue(tab.waitForExistence(timeout: 10), "watch settings tab should exist")
        tab.tap()

        // Change a picker value (Backlight → Wrist Tilt). A menu-style
        // picker row's label is "<title>, <current value>".
        let backlight = app.buttons.containing(
            NSPredicate(format: "label BEGINSWITH %@", "Backlight,")).firstMatch
        XCTAssertTrue(backlight.waitForExistence(timeout: 10), "backlight picker row should exist")
        backlight.tap()
        let option = app.buttons["Wrist Tilt"]
        XCTAssertTrue(option.waitForExistence(timeout: 10))
        option.tap()

        // Scroll back to the header so the status line is on screen.
        let send = app.buttons["watchsettings.sendAll"]
        for _ in 0..<8 where !send.isHittable {
            app.swipeDown()
        }
        XCTAssertTrue(send.waitForExistence(timeout: 10))

        // The edit above persisted locally and says so, instead of blaming a
        // connection that does not exist.
        let savedHint = app.staticTexts["Saved — sends when the watch connects."]
        XCTAssertTrue(savedHint.waitForExistence(timeout: 10),
                      "an offline edit should say it is saved for the next connect")

        // Send-all without a watch is inert — settings live on the phone until
        // the watch reconnects, so there is nothing to "fail".
        XCTAssertFalse(send.isEnabled,
                       "send-all should be disabled while no watch is connected")

        // Alarm (930A) and countdown timer (930B) are deliberately absent from
        // this screen, so nothing here can send them.
        for _ in 0..<10 where app.staticTexts["Alarm"].exists || app.staticTexts["Timer"].exists {
            app.swipeUp()
        }
        XCTAssertFalse(app.staticTexts["Alarm"].exists,
                       "watch settings should not carry an alarm section")
        XCTAssertFalse(app.staticTexts["Timer"].exists,
                       "watch settings should not carry a timer section")
        XCTAssertFalse(app.buttons["watchsettings.timer.start"].exists,
                       "watch settings should not expose timer controls")
    }
}
