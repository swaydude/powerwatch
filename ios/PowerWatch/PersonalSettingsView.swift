import SwiftUI
import PowerWatchCore

/// Personal settings (Android `settings.personal.PersonalSettingsFragment`):
/// edit the biometrics after onboarding. Saves locally and pushes the 9012
/// biometrics command to the watch when connected.
struct PersonalSettingsView: View {
    @Environment(AppModel.self) private var model
    @Environment(SyncController.self) private var sync

    @State private var name = ""
    @State private var age: Double = 30
    @State private var height: Double = 170
    @State private var weight: Double = 70
    @State private var gender: Gender = .male
    @State private var loaded = false
    @State private var status: String?

    var body: some View {
        Form {
            Section("Profile") {
                TextField("Name", text: $name)
                stepperRow("Age", value: $age, range: 10...100, suffix: "years")
                stepperRow("Height", value: $height, range: 120...220, suffix: "cm",
                           imperial: heightImperial(height))
                stepperRow("Weight", value: $weight, range: 30...200, suffix: "kg",
                           imperial: String(format: "%.0f lb", weight * 2.20462))
                Picker("Gender", selection: $gender) {
                    Text("Male").tag(Gender.male)
                    Text("Female").tag(Gender.female)
                }
            }
            Section {
                if let status {
                    Text(status)
                        .font(.footnote)
                        .foregroundStyle(.secondary)
                }
                Button {
                    save()
                } label: {
                    Text("Save")
                        .frame(maxWidth: .infinity)
                        .fontWeight(.semibold)
                }
                .listRowBackground(Color.pwRed)
                .foregroundStyle(.white)
                .accessibilityIdentifier("settings.save")
            }
        }
        .navigationTitle("Personal Settings")
        .navigationBarTitleDisplayMode(.inline)
        .onAppear(perform: load)
    }

    private func heightImperial(_ cm: Double) -> String {
        let totalInches = cm / 2.54
        let feet = Int(totalInches) / 12
        let inches = Int(totalInches) % 12
        return "\(feet)'\(inches)\""
    }

    private func load() {
        guard !loaded, let user = model.user else { return }
        loaded = true
        name = user.name
        age = Double(user.age)
        height = Double(user.height)
        weight = Double(user.weight)
        gender = user.gender
    }

    private func save() {
        guard var user = model.user else { return }
        user.name = name
        user.age = Int(age)
        user.height = Int(height)
        user.weight = Float(weight)
        user.gender = gender
        model.updateUser(user)
        Task {
            let sent = await sync.applySetting(command: .sendBiometrics, payload:
                CommandPayloads.sendBiometrics(
                    gender: gender,
                    age: UInt8(clamping: Int(age)),
                    weightKg: Int16(clamping: Int(weight)),
                    heightCm: Int16(clamping: Int(height))))
            status = sent ? "Saved — biometrics sent to the watch." : "Saved."
        }
    }

    private func stepperRow(_ title: String, value: Binding<Double>,
                            range: ClosedRange<Double>, suffix: String,
                            imperial: String? = nil) -> some View {
        Stepper(value: value, in: range, step: 1) {
            HStack {
                Text(title)
                Spacer()
                if model.user?.accountSettings.unitType == .imperial, let imperial {
                    Text(imperial)
                } else {
                    Text("\(Int(value.wrappedValue)) \(suffix)")
                }
            }
            .foregroundStyle(.secondary)
            .monospacedDigit()
        }
    }
}
