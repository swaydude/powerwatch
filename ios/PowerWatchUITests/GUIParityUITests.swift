import XCTest

/// Not a behavioural test: walks every screen of the iOS app and writes a PNG
/// per screen to /tmp/pw_ios_shots, so the SwiftUI clone can be compared
/// against the Android screenshots in verify_shots/screens.
final class GUIParityUITests: XCTestCase {

    private let outDir = NSTemporaryDirectory() + "/pw_ios_shots"

    override func setUpWithError() throws {
        continueAfterFailure = false
        try? FileManager.default.createDirectory(atPath: outDir,
                                                 withIntermediateDirectories: true)
        print("SHOTDIR=\(outDir)")
    }

    private func shot(_ app: XCUIApplication, _ name: String) {
        app.activate()
        usleep(700_000)
        let data = XCUIScreen.main.screenshot().pngRepresentation
        try? data.write(to: URL(fileURLWithPath: "\(outDir)/\(name).png"))
    }

    private func onboard(_ app: XCUIApplication) {
        let nameField = app.textFields["Name"]
        XCTAssertTrue(nameField.waitForExistence(timeout: 15))
        shot(app, "01_onboarding_profile")
        nameField.tap()
        nameField.typeText("Test User")
        app.buttons["onboarding.next"].tap()
        shot(app, "02_onboarding_goals")
        let save = app.buttons["onboarding.save"]
        XCTAssertTrue(save.waitForExistence(timeout: 10))
        save.tap()
    }

    func testScreenshotTour() throws {
        addUIInterruptionMonitor(withDescription: "system alert") { alert in
            for title in ["Allow", "OK", "Don’t Allow"] where alert.buttons[title].exists {
                alert.buttons[title].tap()
                return true
            }
            return false
        }

        let app = XCUIApplication()
        app.launchArguments += ["-uitest-reset", "-uitest-seed"]
        app.launch()
        onboard(app)

        XCTAssertTrue(app.staticTexts["6000"].waitForExistence(timeout: 15))
        shot(app, "03_dashboard_day")
        for (label, file) in [("Week", "04_dashboard_week"), ("Month", "05_dashboard_month")] {
            let b = app.buttons[label].firstMatch
            if b.exists { b.tap(); shot(app, file) }
        }
        let day = app.buttons["Day"].firstMatch
        if day.exists { day.tap() }

        if app.tabBars.buttons["History"].exists {
            app.tabBars.buttons["History"].tap()
            shot(app, "06_history_list")
            let row = app.staticTexts["Today"]
            if row.waitForExistence(timeout: 5) {
                row.tap()
                shot(app, "07_history_day")
                // The day's activity session and its report (new in the parity pass).
            let session = app.staticTexts["Outdoor Walk"]
            if session.waitForExistence(timeout: 3) {
                session.tap()
                shot(app, "12_session_detail")
                app.navigationBars.buttons.firstMatch.tap()
            }
            if app.navigationBars.buttons.count > 1 {
                app.navigationBars.buttons.firstMatch.tap()
            }
            app.buttons["history.calendar"].tap()
            shot(app, "13_calendar")
            if app.navigationBars.buttons.count > 1 {
                app.navigationBars.buttons.firstMatch.tap()
            }
            }
        }

        app.tabBars.buttons["My PowerWatch"].tap()
        shot(app, "08_device")

        let personal = app.buttons["device.personalSettings"]
        if personal.waitForExistence(timeout: 5) {
            personal.tap()
            shot(app, "09_personal_settings")
            if app.navigationBars.buttons.count > 1 {
                app.navigationBars.buttons.firstMatch.tap()
            }
        }

        let pair = app.buttons["dashboard.pairLink"]
        if pair.waitForExistence(timeout: 3) {
            pair.tap()
            usleep(1_500_000)
            shot(app, "10_pairing_qr")
            if app.buttons["Close"].exists { app.buttons["Close"].tap() }
            else { app.swipeDown() }
        }

        if app.tabBars.buttons["Watch Settings"].exists {
            app.tabBars.buttons["Watch Settings"].tap()
            shot(app, "11_watch_settings")
        }
    }
}
