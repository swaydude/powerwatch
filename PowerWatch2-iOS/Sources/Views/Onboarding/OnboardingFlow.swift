import SwiftUI

/// Mirrors `setup/SetupActivity` + `SetupActivityViewModel`: a linear step
/// machine over welcome -> sign in / create account -> profile -> language ->
/// units -> goals -> clock format -> permissions -> Main.
///
/// The cloud build inserted `verifyaccount` (browser e-mail link +
/// `com.matrixpowerwatch.verify` deep link) and `forgotpassword`; both are
/// satisfied locally in `LocalOnlyCloudAPI`, so the steps collapse.
@MainActor
final class OnboardingViewModel: ObservableObject {
    enum Step: Int, CaseIterable {
        case welcome, signIn, signUp, profile, language, units, goals, clock, permissions
    }

    @Published var step: Step = .welcome
    @Published var busy = false
    @Published var errorText: String?

    @Published var name = ""
    @Published var email = ""
    @Published var password = ""
    @Published var confirmPassword = ""

    @Published var age = 25
    @Published var heightCm = 180.0
    @Published var weightKg = 80.0
    @Published var gender: Gender = .male

    @Published var language: AppLanguage = .en
    @Published var unit: UnitType = .metric
    @Published var hourFormat: HourFormat = .twentyFour

    @Published var stepsGoal = 10_000
    @Published var caloriesGoal = 2_000
    @Published var sleepHours = 8

    // Strings reproduced from the APK's default-locale resources.
    static let weakPassword = "The password must be a minimum of 8 characters."
    static let invalidEmail = "Please enter a valid email address."
    static let passwordMismatch = "Passwords do not match."
    static let invalidCredentials = "Email and password do not match."

    var canSignUp: Bool {
        !name.trimmingCharacters(in: .whitespaces).isEmpty
            && email.contains("@")
            && password.count >= 8
            && password == confirmPassword
    }

    var canSignIn: Bool {
        email.contains("@") && !password.isEmpty
    }

    func next() {
        errorText = nil
        if let next = Step(rawValue: step.rawValue + 1) { step = next }
    }

    func back() {
        errorText = nil
        if let previous = Step(rawValue: step.rawValue - 1) { step = previous }
    }

    func signIn(with environment: AppEnvironment) async {
        guard canSignIn else { errorText = Self.invalidEmail; return }
        busy = true
        defer { busy = false }
        do {
            try await environment.signIn(email: email, password: password)
            next()
        } catch {
            errorText = error.localizedDescription
        }
    }

    func signUp(with environment: AppEnvironment) async {
        if name.trimmingCharacters(in: .whitespaces).isEmpty { errorText = "Enter your name."; return }
        guard email.contains("@") else { errorText = Self.invalidEmail; return }
        guard password.count >= 8 else { errorText = Self.weakPassword; return }
        guard password == confirmPassword else { errorText = Self.passwordMismatch; return }
        busy = true
        defer { busy = false }
        do {
            try await environment.signUp(
                name: name, email: email, password: password,
                age: age, height: heightCm, weight: weightKg,
                gender: gender, unit: unit, hourFormat: hourFormat, language: language
            )
            step = .language
        } catch {
            errorText = error.localizedDescription
        }
    }

    /// Persists the collected preferences and finishes the flow. The Android
    /// `SavePreferencesViewModel` wrote these to `SharedPreferences` + Room and
    /// then pushed them to the watch with `9024`.
    func finish(with environment: AppEnvironment) async {
        busy = true
        defer { busy = false }
        guard var user = environment.user else { return }
        user.age = age
        user.height = heightCm
        user.weight = weightKg
        user.gender = gender
        user.language = language
        user.unitType = unit
        user.timeFormatType = hourFormat
        await environment.setUser(user)

        var goals = environment.goals
        goals.steps = stepsGoal
        goals.calories = caloriesGoal
        goals.sleep = sleepHours * 60      // stored in minutes, as in Room
        await environment.setGoals(goals)
        await environment.completeOnboarding()
    }
}

struct OnboardingFlow: View {
    @EnvironmentObject private var environment: AppEnvironment
    @StateObject private var model = OnboardingViewModel()

    var body: some View {
        VStack(spacing: 0) {
            header
            content
            footer
        }
        .background(Color(.systemGroupedBackground))
    }

    private var header: some View {
        HStack {
            if model.step != .welcome {
                Button { model.back() } label: { Image(systemName: "chevron.left") }
                    .buttonStyle(.borderless)
            }
            Spacer()
            Text("Step \(model.step.rawValue + 1) of \(OnboardingViewModel.Step.allCases.count)")
                .font(.caption).foregroundStyle(.secondary)
        }
        .padding(.horizontal)
        .padding(.vertical, 10)
    }

    @ViewBuilder private var content: some View {
        switch model.step {
        case .welcome: WelcomeStep(model: model)
        case .signIn: SignInStep(model: model)
        case .signUp: SignUpStep(model: model)
        case .profile: ProfileStep(model: model)
        case .language: LanguageStep(model: model)
        case .units: UnitsStep(model: model)
        case .goals: GoalsStep(model: model)
        case .clock: ClockStep(model: model)
        case .permissions: PermissionsStep(model: model)
        }
    }

    private var footer: some View {
        VStack(spacing: 8) {
            if let error = model.errorText {
                Text(error).font(.footnote).foregroundStyle(.red).multilineTextAlignment(.center)
            }
            Button {
                Task { await primaryAction() }
            } label: {
                Text(primaryTitle)
                    .font(.headline)
                    .frame(maxWidth: .infinity)
                    .padding(.vertical, 6)
            }
            .buttonStyle(.borderedProminent)
            .disabled(model.busy)
            .padding(.horizontal)
        }
        .padding()
    }

    private var primaryTitle: String {
        switch model.step {
        case .welcome: return "Get Started"
        case .signIn: return "Sign In"
        case .signUp: return "Create Account"
        case .permissions: return "Finish"
        default: return "Continue"
        }
    }

    private func primaryAction() async {
        switch model.step {
        case .welcome:
            // The APK shows sign-in and create-account side by side; with the
            // cloud gone, an existing local profile is the fast path.
            model.step = environment.hasProfile ? .signIn : .signUp
        case .signIn:
            await model.signIn(with: environment)
        case .signUp:
            await model.signUp(with: environment)
        case .permissions:
            await model.finish(with: environment)
        default:
            if model.step == .profile {
                // Push profile edits into the store before leaving the step.
                if var user = environment.user {
                    user.age = model.age
                    user.height = model.heightCm
                    user.weight = model.weightKg
                    user.gender = model.gender
                    await environment.setUser(user)
                }
            }
            model.next()
        }
    }
}

// MARK: - Steps

private struct WelcomeStep: View {
    @ObservedObject var model: OnboardingViewModel

    var body: some View {
        ScrollView {
            VStack(alignment: .leading, spacing: 18) {
                Text("Your watch, offline.")
                    .font(.largeTitle.weight(.bold))
                Text("PowerWatch2 keeps every measurement on this phone. The Matrix cloud account, Firebase messaging, crash reporting and third-party uploads are not part of this build.")
                    .foregroundStyle(.secondary)
                FeatureRow(icon: "bolt.heart", title: "Body-powered metrics",
                           text: "Steps, calories, heart rate, skin and case temperature, plus generation and consumption in µWh.")
                FeatureRow(icon: "moon.zzz", title: "Sleep breakdown",
                           text: "Awake, restless, light and deep minutes derived from the watch's per-minute log.")
                FeatureRow(icon: "wifi.slash", title: "No network required",
                           text: "No sign-in server, no analytics, no firmware download. Sync happens over Bluetooth only.")
            }
            .padding()
        }
    }
}

private struct FeatureRow: View {
    let icon: String
    let title: String
    let text: String

    var body: some View {
        HStack(alignment: .top, spacing: 14) {
            Image(systemName: icon)
                .font(.title3)
                .foregroundStyle(Color.accentColor)
                .frame(width: 28)
            VStack(alignment: .leading, spacing: 3) {
                Text(title).font(.headline)
                Text(text).font(.subheadline).foregroundStyle(.secondary)
            }
        }
    }
}

private struct SignInStep: View {
    @ObservedObject var model: OnboardingViewModel
    @EnvironmentObject private var environment: AppEnvironment

    var body: some View {
        Form {
            Section("Sign in") {
                TextField("Email", text: $model.email)
                    .textContentType(.emailAddress)
                    .keyboardType(.emailAddress)
                    .autocorrectionDisabled()
                SecureField("Password", text: $model.password)
                    .textContentType(.password)
            }
            if let user = environment.user {
                Section {
                    Text("Local account: \(user.email)")
                        .font(.caption).foregroundStyle(.secondary)
                } footer: {
                    Text("Accounts live in this app's storage only. There is no /oauth/token call to validate against.")
                        .font(.caption2)
                }
            }
            Button("Create a new account instead") { model.step = .signUp }
        }
    }
}

private struct SignUpStep: View {
    @ObservedObject var model: OnboardingViewModel

    var body: some View {
        Form {
            Section("Account") {
                TextField("Name", text: $model.name)
                TextField("Email", text: $model.email)
                    .textContentType(.emailAddress)
                    .keyboardType(.emailAddress)
                    .autocorrectionDisabled()
                SecureField("Password", text: $model.password)
                SecureField("Confirm password", text: $model.confirmPassword)
            }
            Section {
                Text("Password is stored on this device only.")
                    .font(.caption2).foregroundStyle(.secondary)
            }
            Button("Already have an account? Sign in") { model.step = .signIn }
        }
    }
}

private struct ProfileStep: View {
    @ObservedObject var model: OnboardingViewModel

    var body: some View {
        Form {
            Picker("Gender", selection: $model.gender) {
                ForEach(Gender.allCases) { Text($0.displayName).tag($0) }
            }
            Stepper(value: $model.age, in: 13...120) {
                // Age bounds 13...120, default 25 (setup/createaccount).
                Text("Age: \(model.age)")
            }
            Section("Height") {
                HStack {
                    // Metric-only by design: this step comes *before* the units step
                    // (`Step.profile` < `Step.units`), and the APK's biometrics screens
                    // ask `UserPrefsUtils.isMetricsUsed()`, which has no user to ask yet,
                    // so it shows the metric side too. Ranges and defaults are
                    // `UserPrefsUtilsKt`: 100–270 cm, default 180.
                    Slider(value: $model.heightCm, in: Formatters.heightRange(.metric), step: 1)
                    Text("\(Int(model.heightCm))" + Formatters.heightSuffix(.metric))
                        .monospacedDigit().frame(width: 62, alignment: .trailing)
                }
            }
            Section("Weight") {
                HStack {
                    // 29–150 kg, default 80 (`UserPrefsUtilsKt.metricWeight*`).
                    Slider(value: $model.weightKg, in: Formatters.weightRange(.metric), step: 1)
                    Text("\(Int(model.weightKg))" + Formatters.weightSuffix(.metric))
                        .monospacedDigit().frame(width: 72, alignment: .trailing)
                }
            }
        }
    }
}

private struct LanguageStep: View {
    @ObservedObject var model: OnboardingViewModel

    var body: some View {
        Form {
            // 13 languages from LanguageControllerImpl.
            Picker("Language", selection: $model.language) {
                ForEach(AppLanguage.allCases) { language in
                    Text(language.displayName).tag(language)
                }
            }
            .pickerStyle(.inline)
            .labelsHidden()
        }
    }
}

private struct UnitsStep: View {
    @ObservedObject var model: OnboardingViewModel

    var body: some View {
        Form {
            Picker("Unit system", selection: $model.unit) {
                ForEach(UnitType.allCases) { Text($0.displayName).tag($0) }
            }
            .pickerStyle(.segmented)
            LabeledContent("Distance", value: model.unit == .metric ? "km" : "mi")
            LabeledContent("Temperature", value: "°" + Formatters.temperatureUnit(model.unit))
            LabeledContent("Power", value: "µWh")
        }
    }
}

private struct GoalsStep: View {
    @ObservedObject var model: OnboardingViewModel

    var body: some View {
        Form {
            Section("Steps") {
                Stepper(value: $model.stepsGoal, in: 1000...40_000, step: 500) {
                    Text(Formatters.count(model.stepsGoal)).monospacedDigit()
                }
            }
            Section("Calories") {
                Stepper(value: $model.caloriesGoal, in: 500...8000, step: 50) {
                    Text("\(Formatters.count(model.caloriesGoal)) kcal").monospacedDigit()
                }
            }
            Section("Sleep") {
                Stepper(value: $model.sleepHours, in: 4...14) {
                    Text("\(model.sleepHours) hours").monospacedDigit()
                }
            }
        }
    }
}

private struct ClockStep: View {
    @ObservedObject var model: OnboardingViewModel

    var body: some View {
        Form {
            Picker("Time format", selection: $model.hourFormat) {
                Text("12-hour").tag(HourFormat.twelve)
                Text("24-hour").tag(HourFormat.twentyFour)
            }
            .pickerStyle(.inline)
            LabeledContent("Preview", value: Formatters.clock(Date(), format: model.hourFormat))
        }
    }
}

private struct PermissionsStep: View {
    @ObservedObject var model: OnboardingViewModel
    @EnvironmentObject private var environment: AppEnvironment

    var body: some View {
        Form {
            Section("Bluetooth") {
                Label(
                    environment.isBluetoothUsable ? "Bluetooth access granted" : "Bluetooth access not granted",
                    systemImage: environment.isBluetoothUsable ? "checkmark.circle.fill" : "exclamationmark.triangle.fill"
                )
                .foregroundStyle(environment.isBluetoothUsable ? Color.accentColor : .orange)
                Text("iOS asks when the pairing screen starts scanning. If you decline, the app keeps working with the simulated watch.")
                    .font(.caption).foregroundStyle(.secondary)
            }
            Section("What this build does not ask for") {
                Label("No location services beyond the BLE scan prompt", systemImage: "location.slash")
                Label("No notifications permission", systemImage: "bell.slash")
                Label("No Sign in with Apple / account server", systemImage: "person.slash")
                Label("No network permission use", systemImage: "network")
                    .font(.caption)
            }
        }
    }
}
