import SwiftUI
import PowerWatchCore

/// Get-started wizard: profile → goals. Local-only — no account creation
/// (the Android app's cloud account flows are deliberately out of scope).
struct OnboardingView: View {
    @Environment(AppModel.self) private var model

    @State private var page = 0
    @State private var name = ""
    @State private var age: Double = 30
    @State private var height: Double = 170
    @State private var weight: Double = 70
    @State private var gender: Gender = .male
    @State private var units: UnitType = .metric
    @State private var hourFormat: HourFormat = .twelve
    @State private var stepsGoal: Double = 10_000
    @State private var caloriesGoal: Double = 600
    @State private var sleepGoalHours: Double = 8
    @State private var distanceGoalKm: Double = 5

    var body: some View {
        NavigationStack {
            Group {
                switch page {
                case 0: profileForm
                default: goalsForm
                }
            }
            .navigationTitle(page == 0 ? "Your Profile" : "Your Goals")
            .navigationBarTitleDisplayMode(.inline)
        }
    }

    private var profileForm: some View {
        Form {
            Section("About You") {
                TextField("Name", text: $name)
                stepperRow("Age", value: $age, range: 10...100, suffix: "years")
                stepperRow("Height", value: $height, range: 120...220, suffix: "cm")
                stepperRow("Weight", value: $weight, range: 30...200, suffix: "kg")
                Picker("Gender", selection: $gender) {
                    Text("Male").tag(Gender.male)
                    Text("Female").tag(Gender.female)
                }
            }
            Section("Preferences") {
                Picker("Units", selection: $units) {
                    Text("Metric").tag(UnitType.metric)
                    Text("Imperial").tag(UnitType.imperial)
                }
                Picker("Clock", selection: $hourFormat) {
                    Text("12-hour").tag(HourFormat.twelve)
                    Text("24-hour").tag(HourFormat.twentyFour)
                }
            }
            Button {
                withAnimation { page = 1 }
            } label: {
                Text("Next")
                    .frame(maxWidth: .infinity)
                    .fontWeight(.semibold)
            }
            .listRowBackground(Color.pwRed)
            .foregroundStyle(.white)
            .accessibilityIdentifier("onboarding.next")
        }
    }

    private var goalsForm: some View {
        Form {
            Section("Daily Goals") {
                stepperRow("Steps", value: $stepsGoal, range: 0...50_000, suffix: "steps")
                stepperRow("Calories", value: $caloriesGoal, range: 0...5_000, suffix: "kcal")
                stepperRow("Sleep", value: $sleepGoalHours, range: 0...14, suffix: "hours")
                stepperRow("Distance", value: $distanceGoalKm, range: 0...50, suffix: "km")
            }
            Button {
                save()
            } label: {
                Text("Get Started")
                    .frame(maxWidth: .infinity)
                    .fontWeight(.semibold)
            }
            .listRowBackground(Color.pwRed)
            .foregroundStyle(.white)
            .accessibilityIdentifier("onboarding.save")
        }
    }

    private func stepperRow(_ title: String, value: Binding<Double>, range: ClosedRange<Double>, suffix: String) -> some View {
        VStack(alignment: .leading, spacing: 4) {
            HStack {
                Text(title)
                Spacer()
                Text("\(Int(value.wrappedValue)) \(suffix)")
                    .foregroundStyle(.secondary)
                    .monospacedDigit()
            }
            Slider(value: value, in: range, step: 1)
        }
    }

    private func save() {
        let settings = UserAccountSettings(
            language: Locale.current.language.languageCode?.identifier ?? "en",
            timeFormatType: hourFormat.rawValue,
            unitType: units)
        let user = User(
            name: name,
            age: Int(age),
            height: Int(height),
            weight: Float(weight),
            gender: gender,
            shouldSync: false,
            accountSettings: settings)
        let goals = GoalConfiguration(
            steps: Int(stepsGoal),
            calories: Int(caloriesGoal),
            sleep: Int(sleepGoalHours) * 60,       // stored in minutes, like the Android app
            power: 0,
            distance: Float(distanceGoalKm * 1000))   // stored in meters
        model.completeOnboarding(user: user, goals: goals)
    }
}
