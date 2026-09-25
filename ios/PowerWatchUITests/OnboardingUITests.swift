import XCTest

/// TC-X01: fresh launch → onboarding → complete profile+goals → dashboard.
final class OnboardingUITests: XCTestCase {

    override func setUpWithError() throws {
        continueAfterFailure = false
    }

    func testOnboardingFlowLeadsToDashboard() throws {
        let app = XCUIApplication()
        app.launchArguments += ["-uitest-reset"]
        app.launch()

        // Page 1: profile form.
        let nameField = app.textFields["Name"]
        XCTAssertTrue(nameField.waitForExistence(timeout: 10), "onboarding profile page should show")
        nameField.tap()
        nameField.typeText("Test User")

        app.buttons["onboarding.next"].tap()

        // Page 2: goals form.
        let saveButton = app.buttons["onboarding.save"]
        XCTAssertTrue(saveButton.waitForExistence(timeout: 10), "onboarding goals page should show")
        saveButton.tap()

        // Dashboard appears with the "no watch" banner (fresh install, no device).
        XCTAssertTrue(app.otherElements["dashboard.noWatch"].waitForExistence(timeout: 10)
                      || app.staticTexts["dashboard.noWatch"].waitForExistence(timeout: 10),
                      "dashboard should appear after onboarding")
    }
}
