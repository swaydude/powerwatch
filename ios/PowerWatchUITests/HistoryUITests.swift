import XCTest

/// TC-X04: history/report screens (T5.7) — seeded days appear in the list
/// and drill down to a per-day report.
final class HistoryUITests: XCTestCase {

    override func setUpWithError() throws {
        continueAfterFailure = false
    }

    func testHistoryListsSeededDayAndDrillsDown() throws {
        let app = XCUIApplication()
        app.launchArguments += ["-uitest-reset", "-uitest-seed"]
        app.launch()

        // Complete onboarding.
        let nameField = app.textFields["Name"]
        XCTAssertTrue(nameField.waitForExistence(timeout: 10))
        nameField.tap()
        nameField.typeText("Test User")
        app.buttons["onboarding.next"].tap()
        let saveButton = app.buttons["onboarding.save"]
        XCTAssertTrue(saveButton.waitForExistence(timeout: 10))
        saveButton.tap()
        XCTAssertTrue(app.staticTexts["6000"].waitForExistence(timeout: 10))

        // History tab shows the seeded day (row label starts with "Today").
        let tab = app.tabBars.buttons["History"]
        XCTAssertTrue(tab.waitForExistence(timeout: 10))
        tab.tap()
        let row = app.staticTexts["Today"]
        XCTAssertTrue(row.waitForExistence(timeout: 10), "seeded day should be listed")

        // Drill down: the day report shows the seeded totals.
        row.tap()
        XCTAssertTrue(app.staticTexts["6000"].waitForExistence(timeout: 10),
                      "day report should show the seeded step count")
        XCTAssertTrue(app.staticTexts["Sleep by Type"].exists,
                      "day report should show the sleep-type chart")

        // Date-arrow navigation (Android's ‹ › day stepping) is present;
        // with a single seeded day both arrows are disabled.
        XCTAssertTrue(app.buttons["history.prev"].waitForExistence(timeout: 10),
                      "day drill-down should expose date-arrow navigation")
        XCTAssertTrue(app.buttons["history.next"].exists)
    }

    /// Onboards with the seeded fixture (one walking hour, one resting hour,
    /// sleep, and one activity session with a track).
    @discardableResult
    private func onboardSeeded(_ app: XCUIApplication) -> XCUIApplication {
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
        return app
    }

    private func openTodayReport(_ app: XCUIApplication) {
        let tab = app.tabBars.buttons["History"]
        XCTAssertTrue(tab.waitForExistence(timeout: 10))
        tab.tap()
        let row = app.staticTexts["Today"]
        XCTAssertTrue(row.waitForExistence(timeout: 10))
        row.tap()
    }

    /// Sessions paired out of the v4 `9215`/`9205` logs show up under the
    /// day's totals (Android lists them there too) and open the session report.
    func testDayReportListsActivitySession() throws {
        let app = onboardSeeded(XCUIApplication())
        openTodayReport(app)

        XCTAssertTrue(app.staticTexts["Activity"].waitForExistence(timeout: 10),
                      "day report should list the day's activity sessions")
        XCTAssertTrue(app.staticTexts["Outdoor Walk"].exists)
        XCTAssertTrue(app.staticTexts["2.00 km"].exists)

        app.staticTexts["Outdoor Walk"].tap()
        XCTAssertTrue(app.staticTexts["Pace"].waitForExistence(timeout: 10),
                      "session report should show the session metrics")
        XCTAssertTrue(app.staticTexts["Splits"].exists,
                      "session report should show the per-minute splits")
        XCTAssertTrue(app.maps.firstMatch.waitForExistence(timeout: 10),
                      "session report should draw the recorded GPS track")
    }

    /// Android's calendar screen: a month grid with a marker on every day that
    /// holds data, opening that day's report.
    func testCalendarMarksDaysWithHistory() throws {
        let app = onboardSeeded(XCUIApplication())
        let tab = app.tabBars.buttons["History"]
        XCTAssertTrue(tab.waitForExistence(timeout: 10))
        tab.tap()

        app.buttons["history.calendar"].tap()
        XCTAssertTrue(app.staticTexts["Calendar"].waitForExistence(timeout: 10))
        XCTAssertTrue(app.buttons["history.calendarPrev"].exists)
        XCTAssertTrue(app.buttons["history.calendarNext"].exists)

        let marked = app.buttons["history.calendarDay"]
        XCTAssertTrue(marked.waitForExistence(timeout: 10),
                      "days with stored history should be marked")
        marked.firstMatch.tap()
        XCTAssertTrue(app.staticTexts["Steps"].waitForExistence(timeout: 10),
                      "tapping a marked day should open its report")
    }
}
