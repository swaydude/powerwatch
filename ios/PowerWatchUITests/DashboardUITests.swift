import XCTest

/// TC-X02: seeded log data flows through the period tables into the
/// dashboard — goal rings, totals and the day-view charts (T5.4).
final class DashboardUITests: XCTestCase {

    override func setUpWithError() throws {
        continueAfterFailure = false
    }

    func testDashboardShowsSeededPeriodData() throws {
        let app = XCUIApplication()
        app.launchArguments += ["-uitest-reset", "-uitest-seed"]
        app.launch()

        // Complete onboarding (fresh DB after reset).
        let nameField = app.textFields["Name"]
        XCTAssertTrue(nameField.waitForExistence(timeout: 10))
        nameField.tap()
        nameField.typeText("Test User")
        app.buttons["onboarding.next"].tap()
        let saveButton = app.buttons["onboarding.save"]
        XCTAssertTrue(saveButton.waitForExistence(timeout: 10))
        saveButton.tap()

        // Dashboard appears; the seeded hour of walking is 60 × 100 steps.
        XCTAssertTrue(app.staticTexts["6000"].waitForExistence(timeout: 10),
                      "seeded steps total (6000) should show on the dashboard")

        // Period switcher: week and month views show the same totals
        // (all seeded data is from today).
        let weekButton = app.buttons["Week"].firstMatch
        if weekButton.exists { weekButton.tap() }
        XCTAssertTrue(app.staticTexts["6000"].waitForExistence(timeout: 10))

        let monthButton = app.buttons["Month"].firstMatch
        if monthButton.exists { monthButton.tap() }
        XCTAssertTrue(app.staticTexts["6000"].waitForExistence(timeout: 10))

        // Day view charts are visible again after switching back.
        let dayButton = app.buttons["Day"].firstMatch
        if dayButton.exists { dayButton.tap() }
        XCTAssertTrue(app.staticTexts["Steps by Hour"].waitForExistence(timeout: 10),
                      "day view should show the hour-of-day steps chart")
        XCTAssertTrue(app.staticTexts["Sleep by Hour"].exists,
                      "day view should show the hour-of-day sleep chart")
    }

    /// Android parity: the heart-rate, power (from body/light) and skin
    /// temperature cards render from the stored hour-period fields.
    func testDashboardShowsPowerHeartRateAndTemperature() throws {
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

        // Scroll the metric cards into view, then assert each section.
        func scrollTo(_ text: String) {
            for _ in 0..<8 where !app.staticTexts[text].exists {
                app.swipeUp()
            }
        }
        scrollTo("Power Generation")
        XCTAssertTrue(app.staticTexts["Power Generation"].exists,
                      "power card (Android FROM BODY / FROM LIGHT gauge) should show")
        XCTAssertTrue(app.staticTexts["From Body"].exists)
        XCTAssertTrue(app.staticTexts["From Light"].exists)

        scrollTo("Heart Rate")
        XCTAssertTrue(app.staticTexts["Heart Rate"].exists,
                      "heart-rate card (avg / range / HRV) should show")
        XCTAssertTrue(app.staticTexts["HRV"].exists)

        scrollTo("Temperature")
        XCTAssertTrue(app.staticTexts["Temperature"].exists,
                      "temperature card (current / average / range) should show")
    }

    /// Android's day charts pair steps with calories and sleep with heart rate
    /// (`steps_calories`, `sleep_heartrate`).
    func testDayChartToggleSwitchesCompanionSeries() throws {
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

        XCTAssertTrue(app.staticTexts["Calories by Hour"].waitForExistence(timeout: 10),
                      "day view should pair steps with calories by default")
        app.buttons["Sleep + Heartrate"].firstMatch.tap()
        XCTAssertTrue(app.staticTexts["Sleep + Heart Rate"].waitForExistence(timeout: 10),
                      "the toggle should swap in the sleep + heart-rate pair")
    }
}
