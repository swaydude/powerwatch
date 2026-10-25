import SwiftUI

/// Mirrors `main/watch/WatchFragment` — the "My PowerWatch" tab. Every row here
/// corresponds to a `WatchSettingsVM`/`PersonalSettingsVM` screen in the APK.
struct MyPowerWatchRootView: View {
    var body: some View {
        NavigationStack {
            MyPowerWatchView()
                .navigationTitle("My PowerWatch")
        }
    }
}

struct MyPowerWatchView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @State private var showUnpairConfirmation = false
    @State private var showLogoutConfirmation = false

    var body: some View {
        List {
            Section {
                WatchHeaderCard()
                    .listRowInsets(EdgeInsets())
                    .listRowBackground(Color.clear)
            }

            Section("Profile") {
                NavigationLink { PersonalSettingsView() } label: {
                    Label("Personal Settings", systemImage: "person.crop.circle")
                }
                NavigationLink { DailyGoalsView() } label: {
                    Label("Daily Goals", systemImage: "target")
                }
            }

            Section("Watch") {
                NavigationLink { WatchSettingsView() } label: {
                    Label("Watch Settings", systemImage: "gearshape.2")
                }
                NavigationLink { NotificationsView() } label: {
                    Label("Notifications", systemImage: "bell.badge")
                }
                NavigationLink { AlarmView() } label: {
                    Label("Alarm", systemImage: "alarm")
                }
                NavigationLink { TimerView() } label: {
                    Label("Timer", systemImage: "timer")
                }
                // The APK's firmware-update screen (`main/watch` ▸ Firmware) is not
                // reachable here: an offline build cannot ship an OTA image, so the
                // entry was removed rather than pointing at a no-op flow.
            }

            Section("Preferences") {
                NavigationLink { AppLanguageView() } label: {
                    Label("Language", systemImage: "globe")
                }
                NavigationLink { UnitsView() } label: {
                    Label("Units", systemImage: "ruler")
                }
                NavigationLink { ClockFormatView() } label: {
                    Label("Clock", systemImage: "clock")
                }
                NavigationLink { DataSourcesView() } label: {
                    Label("Data & privacy", systemImage: "wifi.slash")
                }
            }

            Section {
                Button { showUnpairConfirmation = true } label: {
                    Label("Unpair Watch", systemImage: "link.badge.plus")
                }
                Button(role: .destructive) { showLogoutConfirmation = true } label: {
                    Label("Log Out", systemImage: "rectangle.portrait.and.arrow.right")
                }
            } footer: {
                Text("Unpairing removes the device row; logging out wipes the local database copy. Nothing is sent to a server because there is none.")
                    .font(.caption2)
            }

            Section("Support") {
                NavigationLink { ContactSupportView() } label: {
                    Label("Contact Support", systemImage: "questionmark.bubble")
                }
                NavigationLink { AboutView() } label: {
                    Label("About", systemImage: "info.circle")
                }
            }
        }
        .confirmationDialog("Unpair this watch?", isPresented: $showUnpairConfirmation, titleVisibility: .visible) {
            Button("Unpair", role: .destructive) {
                Task { await environment.unpairDevice() }
            }
        }
        .confirmationDialog("Log out and erase local data?", isPresented: $showLogoutConfirmation, titleVisibility: .visible) {
            Button("Log Out", role: .destructive) {
                Task { await environment.signOut() }
            }
        }
    }
}

private struct WatchHeaderCard: View {
    @EnvironmentObject private var environment: AppEnvironment

    /// The APK's battery comes from `RealtimeWatchData.batteryPercent` — the
    /// `HSMTable.BatteryPercentage` record of the `2A25` read, which `BatteryNotificationCenter`
    /// gates on `isBatteryValid()` (E-66, E-67). So the live poll is the primary source here
    /// too, and the value a sync stored from the log records is only the fallback for the
    /// window before the first tick. `nil` means the watch has never reported one, which must
    /// not be drawn as `0%`.
    private var battery: Int? {
        if let live = environment.realtimeData?.batteryPercent { return Int(live) }
        return environment.synchronizer.batteryPercent
    }

    var body: some View {
        Card {
            HStack(spacing: 14) {
                Image(systemName: "applewatch")
                    .font(.system(size: 34, weight: .light))
                    .foregroundStyle(Color.accentColor)
                VStack(alignment: .leading, spacing: 3) {
                    Text(environment.device?.productName ?? "PowerWatch 2").font(.headline)
                    Text("Firmware \(environment.synchronizer.firmwareVersion.isEmpty ? (environment.device?.firmwareVersion ?? "—") : environment.synchronizer.firmwareVersion)")
                        .font(.caption).foregroundStyle(.secondary)
                    Text("Serial \(environment.device?.serialNumber ?? "—")")
                        .font(.caption2).foregroundStyle(.tertiary)
                }
                Spacer()
                VStack(alignment: .trailing, spacing: 4) {
                    Image(systemName: batterySymbol)
                        .font(.title3)
                        .foregroundStyle(batteryColor)
                    Text(battery.map { "\($0)%" } ?? "--")
                        .font(.caption).monospacedDigit().foregroundStyle(.secondary)
                }
            }
            if let battery,
               let message = Formatters.batteryMessage(
                   for: Formatters.batteryLevel(battery), percent: battery) {
                Text(message).font(.caption).foregroundStyle(.orange).padding(.top, 6)
            }
        }
    }

    private var batterySymbol: String {
        // Unreported keeps a full outline in grey: an empty symbol would claim 0 %.
        guard let battery else { return "battery.100" }
        switch Formatters.batteryLevel(battery) {
        case .critical: return "battery.25"
        case .low: return "battery.50"
        case .normal, .charging: return "battery.100"
        }
    }

    private var batteryColor: Color {
        guard let battery else { return .secondary }
        switch Formatters.batteryLevel(battery) {
        case .critical: return .red
        case .low: return .orange
        case .normal, .charging: return .green
        }
    }
}

// MARK: - Personal settings

/// `setup/goals` + profile editing (`POST /pwuser/update` in the cloud build).
struct PersonalSettingsView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @State private var name = ""
    @State private var email = ""
    @State private var age = 25
    /// Both held in the **display** unit. `PersonalSettingsVM` shows
    /// `UserPrefsUtils.getValue(user.height, HEIGHT)` / `(user.weight, WEIGHT)` —
    /// inches and pounds for an imperial user — and converts back on save, so Room,
    /// `9012` and `9024` keep seeing cm and kg (E-63).
    @State private var height = 180.0
    @State private var weight = 80.0
    @State private var gender: Gender = .male
    @State private var saved = false

    private var unit: UnitType { environment.user?.unitType ?? .metric }

    var body: some View {
        Form {
            Section("Account") {
                TextField("Name", text: $name)
                TextField("Email", text: $email)
                    .keyboardType(.emailAddress)
                    .autocorrectionDisabled()
            }
            Section("Body") {
                Picker("Gender", selection: $gender) {
                    ForEach(Gender.allCases) { Text($0.displayName).tag($0) }
                }
                Stepper(value: $age, in: 13...120) { Text("Age: \(age)") }
                Section {
                    HStack {
                        Slider(value: $height, in: Formatters.heightRange(unit), step: 1)
                        Text("\(Int(height))" + Formatters.heightSuffix(unit))
                            .monospacedDigit().frame(width: 64, alignment: .trailing)
                    }
                    HStack {
                        Slider(value: $weight, in: Formatters.weightRange(unit), step: 1)
                        Text("\(Int(weight))" + Formatters.weightSuffix(unit))
                            .monospacedDigit().frame(width: 72, alignment: .trailing)
                    }
                }
            }
            Section {
                Button("Save") {
                    Task {
                        guard var user = environment.user else { return }
                        user.name = name
                        user.email = email
                        user.age = age
                        // Back to the model's metric units, exactly as the APK's
                        // wheel picker callback does with `getValue`'s pair.
                        user.height = Formatters.centimetres(fromHeight: height, unit: unit).rounded()
                        user.weight = Formatters.kilograms(fromWeight: weight, unit: unit)
                        user.gender = gender
                        // Local replacement for POST /pwuser/update.
                        try? await environment.cloud.updateUser(user)
                        await environment.reload()
                        saved = true
                    }
                }
                .buttonStyle(.borderedProminent)
                if saved {
                    Label("Saved locally", systemImage: "checkmark.circle.fill")
                        .font(.caption).foregroundStyle(.green)
                }
            }
        }
        .navigationTitle("Personal Settings")
        .onAppear(perform: load)
    }

    private func load() {
        guard let user = environment.user else { return }
        name = user.name
        email = user.email
        age = user.age
        // Clamped into the picker's range so the slider thumb starts where the
        // value is rather than snapping on the first drag.
        height = Self.clamp(Formatters.heightValue(user.height, unit: user.unitType),
                            to: Formatters.heightRange(user.unitType))
        weight = Self.clamp(Formatters.weightValue(user.weight, unit: user.unitType),
                            to: Formatters.weightRange(user.unitType))
        gender = user.gender
    }

    private static func clamp(_ value: Double, to range: ClosedRange<Double>) -> Double {
        min(max(value, range.lowerBound), range.upperBound)
    }
}

/// `setup/goals` — Room `GoalConfiguration`.
struct DailyGoalsView: View {
    @EnvironmentObject private var environment: AppEnvironment

    var body: some View {
        Form {
            Section("Steps") {
                Stepper(value: Binding(
                    get: { environment.goals.steps },
                    set: { newSteps in Task { await environment.updateGoals { $0.steps = newSteps } } }
                ), in: 1000...40_000, step: 500) {
                    Text(Formatters.count(environment.goals.steps)).monospacedDigit()
                }
            }
            Section("Calories") {
                Stepper(value: Binding(
                    get: { environment.goals.calories },
                    set: { newValue in Task { await environment.updateGoals { $0.calories = newValue } } }
                ), in: 500...8000, step: 50) {
                    Text("\(Formatters.count(environment.goals.calories)) kcal").monospacedDigit()
                }
            }
            Section("Sleep") {
                Stepper(value: Binding(
                    get: { environment.goals.sleep / 60 },
                    set: { hours in Task { await environment.updateGoals { $0.sleep = hours * 60 } } }
                ), in: 4...14) {
                    Text(Formatters.sleepGoal(environment.goals.sleep)).monospacedDigit()
                }
            }
            Section("Distance & power") {
                Stepper(value: Binding(
                    get: { Int(environment.goals.distance) },
                    set: { metres in Task { await environment.updateGoals { $0.distance = Double(metres) } } }
                ), in: 0...100_000, step: 1000) {
                    Text(Formatters.distance(environment.goals.distance, unit: environment.user?.unitType ?? .metric))
                        .monospacedDigit()
                }
                Stepper(value: Binding(
                    get: { environment.goals.power },
                    set: { value in Task { await environment.updateGoals { $0.power = value } } }
                ), in: 100...100_000, step: 100) {
                    Text(Formatters.power(environment.goals.power)).monospacedDigit()
                }
            }
        }
        .navigationTitle("Daily Goals")
    }
}

// MARK: - Watch settings

/// The `93xx` command block, driven by `SettingsDisplayValueLoader` labels.
struct WatchSettingsView: View {
    @EnvironmentObject private var environment: AppEnvironment

    var body: some View {
        Form {
            Picker("Do Not Disturb", selection: binding(\.dnd)) {
                ForEach(DoNotDisturbSetting.allCases) { Text($0.displayName).tag($0) }
            }
            Picker("Backlight Trigger", selection: binding(\.backlight)) {
                ForEach(BacklightTrigger.allCases) { Text($0.displayName).tag($0) }
            }
            Picker("Backlight Duration", selection: binding(\.backlightDuration)) {
                ForEach(BacklightDuration.allCases) { Text($0.displayName).tag($0) }
            }
            Picker("Popup Duration", selection: binding(\.popupDuration)) {
                ForEach(PopupDuration.allCases) { Text($0.displayName).tag($0) }
            }
            Picker("GPS Update Rate", selection: binding(\.gpsUpdateRate)) {
                ForEach(GPSUpdateRate.allCases) { Text($0.displayName).tag($0) }
            }
            Picker("Home Screen", selection: binding(\.homeScreen)) {
                ForEach(HomeScreen.allCases) { Text($0.displayName).tag($0) }
            }
            Picker("BLE Disconnection Alert", selection: binding(\.bleDisconnection)) {
                ForEach(BLEDisconnectionAlert.allCases) { Text($0.displayName).tag($0) }
            }
            Picker("Ringtone", selection: binding(\.ringtone)) {
                ForEach(Ringtone.allCases) { Text($0.displayName).tag($0) }
            }
            Picker("Alert Type", selection: binding(\.alertType)) {
                ForEach(AlertType.allCases) { Text($0.displayName).tag($0) }
            }
            Section {
                Button("Send all settings to watch") {
                    Task {
                        try? await environment.synchronizer
                            .apply(Gen2Command.sendUserPrefsAndGoalsVer3(
                                user: environment.user ?? UserAccount(uid: "x", name: "", email: ""),
                                goals: environment.goals,
                                settings: environment.watchSettings
                            ))
                        for command in environment.synchronizer.settingsCommands(environment.watchSettings) {
                            try? await environment.synchronizer.apply(command)
                        }
                    }
                }
            } footer: {
                Text("Each row writes its own opcode (9300–930B). “Send all” re-applies the whole block.")
                    .font(.caption2)
            }
        }
        .navigationTitle("Watch Settings")
    }

    private func binding<Value: Hashable>(_ keyPath: WritableKeyPath<WatchSettings, Value>) -> Binding<Value> {
        Binding(
            get: { environment.watchSettings[keyPath: keyPath] },
            set: { newValue in
                Task {
                    await environment.updateWatchSettings { $0[keyPath: keyPath] = newValue }
                    if let command = settingCommand(for: keyPath, value: newValue) {
                        try? await environment.synchronizer.apply(command)
                    }
                }
            }
        )
    }

    /// Maps a settings edit onto its single opcode write.
    private func settingCommand<Value>(for keyPath: WritableKeyPath<WatchSettings, Value>, value: Value) -> Gen2Command? {
        let settings = environment.watchSettings
        if keyPath == \WatchSettings.dnd { return Gen2Command.setSetting(Gen2Opcode.settingDND, settings.dnd.rawValue) }
        if keyPath == \WatchSettings.backlight { return Gen2Command.setSetting(Gen2Opcode.settingBackLight, settings.backlight.rawValue) }
        if keyPath == \WatchSettings.backlightDuration { return Gen2Command.setSetting(Gen2Opcode.settingBackLightDuration, settings.backlightDuration.rawValue) }
        if keyPath == \WatchSettings.popupDuration { return Gen2Command.setSetting(Gen2Opcode.settingPopupDuration, settings.popupDuration.rawValue) }
        if keyPath == \WatchSettings.gpsUpdateRate { return Gen2Command.setSetting(Gen2Opcode.settingGPSUpdateRate, settings.gpsUpdateRate.rawValue) }
        if keyPath == \WatchSettings.homeScreen { return Gen2Command.setSetting(Gen2Opcode.settingHomeScreen, settings.homeScreen.rawValue) }
        if keyPath == \WatchSettings.bleDisconnection { return Gen2Command.setSetting(Gen2Opcode.settingBLEDisconnection, settings.bleDisconnection.rawValue) }
        if keyPath == \WatchSettings.ringtone { return Gen2Command.setSetting(Gen2Opcode.settingRingtone, settings.ringtone.rawValue) }
        if keyPath == \WatchSettings.alertType { return Gen2Command.setSetting(Gen2Opcode.settingAlertType, settings.alertType.rawValue) }
        return nil
    }
}

/// `shared/watchNotification` — the Android build read notifications through a
/// NotificationListenerService and forwarded them over 9009/9019/9029/9039/9049.
/// iOS has no equivalent listener, so this is the type/app allow-list only.
struct NotificationsView: View {
    @EnvironmentObject private var environment: AppEnvironment

    var body: some View {
        Form {
            Section("Watch alerts") {
                CheckmarkRow("Connection notifications",
                             subtitle: "Vibrate on the watch when it connects or disconnects",
                             isOn: notificationBinding(\.connectionNotifications))
                CheckmarkRow("Battery notifications",
                             subtitle: "Warn at 10 % and 5 %",
                             isOn: notificationBinding(\.batteryNotifications))
                CheckmarkRow("Goal notifications",
                             subtitle: "Congratulate when a daily goal is met",
                             isOn: notificationBinding(\.goalsNotifications))
            }
            Section("Forwarded message types") {
                CheckmarkRow("Calls", isOn: allowListBinding(\.callsEnabled))
                CheckmarkRow("Messages", isOn: allowListBinding(\.messagesEnabled))
            }
            Section("Apps") {
                ForEach(environment.allowList.enabledApps.keys.sorted(), id: \.self) { app in
                    Toggle(app, isOn: Binding(
                        get: { environment.allowList.enabledApps[app] ?? false },
                        set: { value in
                            Task { await environment.updateAllowList { $0.enabledApps[app] = value } }
                        }
                    ))
                }
            }
        }
        .navigationTitle("Notifications")
    }

    private func notificationBinding(
        _ keyPath: WritableKeyPath<NotificationPreferences, Bool>
    ) -> Binding<Bool> {
        Binding(
            get: { environment.notificationPrefs[keyPath: keyPath] },
            set: { value in
                Task { await environment.updateNotifications { $0[keyPath: keyPath] = value } }
            }
        )
    }

    private func allowListBinding(
        _ keyPath: WritableKeyPath<NotificationAllowList, Bool>
    ) -> Binding<Bool> {
        Binding(
            get: { environment.allowList[keyPath: keyPath] },
            set: { value in
                Task { await environment.updateAllowList { $0[keyPath: keyPath] = value } }
            }
        )
    }
}

struct AlarmView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @State private var hour = 7
    @State private var minute = 0
    @State private var isAM = true
    @State private var repeatMode: AlarmRepeat = .everyDay
    @State private var activation: AlarmActivation = .on
    @State private var status = ""

    var body: some View {
        Form {
            Section("Time") {
                Stepper("Hour: \(hour)", value: $hour, in: 0...23)
                Stepper("Minute: \(minute)", value: $minute, in: 0...59, step: 5)
                if environment.user?.timeFormatType == .twelve {
                    Toggle("AM", isOn: $isAM)
                }
            }
            Section("Repeat") {
                Picker("Repeat", selection: $repeatMode) {
                    ForEach(AlarmRepeat.allCases) { Text($0.displayName).tag($0) }
                }
                Picker("Activation", selection: $activation) {
                    ForEach(AlarmActivation.allCases) { Text($0.displayName).tag($0) }
                }
            }
            Section {
                Button("Save alarm") {
                    let alarm = WatchAlarm(hour: hour, minute: minute, isAM: isAM,
                                           repeatMode: repeatMode, activation: activation)
                    Task {
                        await environment.updateWatchSettings { $0.alarm = alarm }
                        do {
                            try await environment.synchronizer.apply(Gen2Command.setAlarm(alarm))
                            status = "Alarm sent to watch"
                        } catch {
                            status = error.localizedDescription
                        }
                    }
                }
                if !status.isEmpty {
                    Text(status).font(.caption).foregroundStyle(.secondary)
                }
            }
        }
        .navigationTitle("Alarm")
        .onAppear {
            let alarm = environment.watchSettings.alarm
            hour = alarm.hour
            minute = alarm.minute
            isAM = alarm.isAM
            repeatMode = alarm.repeatMode
            activation = alarm.activation
        }
    }
}

struct TimerView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @State private var hour = 0
    @State private var minute = 5
    @State private var second = 0
    @State private var status = ""

    var body: some View {
        Form {
            Stepper("Hours: \(hour)", value: $hour, in: 0...23)
            Stepper("Minutes: \(minute)", value: $minute, in: 0...59)
            Stepper("Seconds: \(second)", value: $second, in: 0...59)
            Section {
                Button("Start timer on watch") {
                    Task {
                        do {
                            try await environment.synchronizer.apply(Gen2Command.setTimer(
                                hour: hour, minute: minute, second: second))
                            status = "Timer started"
                        } catch {
                            status = error.localizedDescription
                        }
                    }
                }
                if !status.isEmpty {
                    Text(status).font(.caption).foregroundStyle(.secondary)
                }
            }
        }
        .navigationTitle("Timer")
        .onAppear {
            hour = environment.watchSettings.timerHour
            minute = environment.watchSettings.timerMinute
            second = environment.watchSettings.timerSecond
        }
    }
}

struct AppLanguageView: View {
    @EnvironmentObject private var environment: AppEnvironment

    var body: some View {
        List(selection: binding) {
            ForEach(AppLanguage.allCases) { language in
                HStack {
                    Text(language.displayName)
                    Spacer()
                    if language.usesChinaRegionAssets {
                        Text("CN assets").font(.caption2).foregroundStyle(.tertiary)
                    }
                }
                .tag(language)
            }
        }
        .navigationTitle("Language")
    }

    private var binding: Binding<AppLanguage?> {
        Binding(
            get: { environment.user?.language },
            set: { newValue in
                guard let newValue, var user = environment.user else { return }
                user.language = newValue
                Task {
                    try? await environment.cloud.updateUser(user)
                    await environment.reload()
                    try? await environment.synchronizer.apply(Gen2Command.sendLanguage(newValue))
                }
            }
        )
    }
}

struct UnitsView: View {
    @EnvironmentObject private var environment: AppEnvironment
    private var sample: Double { 4216 }

    var body: some View {
        Form {
            Picker("Unit system", selection: binding) {
                ForEach(UnitType.allCases) { Text($0.displayName).tag($0) }
            }
            .pickerStyle(.segmented)
            Section("Preview") {
                LabeledContent("Distance", value: Formatters.distance(sample, unit: environment.user?.unitType ?? .metric))
                LabeledContent("Temperature",
                               value: Formatters.temperature(celsius: 33.4, unit: environment.user?.unitType ?? .metric)
                                + " " + Formatters.temperatureUnit(environment.user?.unitType ?? .metric))
                LabeledContent("Power", value: Formatters.power(12_480))
                LabeledContent("Pace",
                               value: Formatters.pace(distance: sample, duration: 1800,
                                                      unit: environment.user?.unitType ?? .metric))
            }
        }
        .navigationTitle("Units")
    }

    private var binding: Binding<UnitType> {
        Binding(
            get: { environment.user?.unitType ?? .metric },
            set: { newValue in
                guard var user = environment.user else { return }
                user.unitType = newValue
                Task {
                    try? await environment.cloud.updateUser(user)
                    await environment.reload()
                }
            }
        )
    }
}

struct ClockFormatView: View {
    @EnvironmentObject private var environment: AppEnvironment

    var body: some View {
        Form {
            Picker("Time format", selection: binding) {
                Text("12-hour").tag(HourFormat.twelve)
                Text("24-hour").tag(HourFormat.twentyFour)
            }
            .pickerStyle(.inline)
            LabeledContent("Preview", value: Formatters.clock(Date(), format: environment.user?.timeFormatType ?? .twentyFour))
        }
        .navigationTitle("Clock")
    }

    private var binding: Binding<HourFormat> {
        Binding(
            get: { environment.user?.timeFormatType ?? .twentyFour },
            set: { newValue in
                guard var user = environment.user else { return }
                user.timeFormatType = newValue
                Task {
                    try? await environment.cloud.updateUser(user)
                    await environment.reload()
                    // 24h flag is byte 0 of the 9024 payload.
                    try? await environment.synchronizer.apply(Gen2Command.sendUserPrefsAndGoalsVer3(
                        user: user, goals: environment.goals, settings: environment.watchSettings))
                }
            }
        )
    }
}

/// Documentation of what was removed, surfaced in the UI.
struct DataSourcesView: View {
    var body: some View {
        List {
            Section("Removed in this build") {
                ForEach(rows, id: \.self) { Text($0).font(.callout) }
            }
            Section("What stays") {
                Label("Bluetooth LE to the watch (DTP + OTA services)", systemImage: "antenna.radiowaves.left.and.right")
                Label("Local database (Room equivalent) in app storage", systemImage: "square.stack.3d.up")
                Label("Keychain for the local session token", systemImage: "key")
                Label("GPX / TCX export through the share sheet", systemImage: "square.and.arrow.up")
            }
        }
        .navigationTitle("Data & privacy")
    }

    private var rows: [String] {
        [
            "api.prod.powerwatch.com / api.dev.powerwatch.com (OAuth2, /pwuser, /host, /metrics, /reports)",
            "Firebase project matrix-powerwatch-2 (FCM, Analytics, Crashlytics)",
            "Bugfender log upload + POST /reports/addAttachment",
            "report.powerwatch.com WebView + JS bridge",
            "Strava OAuth and TCX upload",
            "Google Fit",
            "Google Maps / Baidu Maps tiles",
            "S3 firmware, font and AGPS downloads",
            "Google Play in-app update check"
        ]
    }
}

struct ContactSupportView: View {
    var body: some View {
        List {
            Section("Before contacting support") {
                Label("Keep the watch connected and run a sync", systemImage: "arrow.clockwise")
                Label("Note the firmware version from this screen", systemImage: "info.circle")
                Label("Describe the last time the data was correct", systemImage: "calendar")
            }
            Section("Support is offline in this build") {
                Text("The cloud build uploaded a logcat and screenshots via POST /reports/addAttachment and opened a support conversation. Both were network calls, so this screen simply lists what to include when you reach support yourself.")
                    .font(.callout)
                    .foregroundStyle(.secondary)
            }
        }
        .navigationTitle("Contact Support")
    }
}

struct AboutView: View {
    var body: some View {
        List {
            Section("Build") {
                LabeledContent("Ported from", value: "powerwatch.matrix.com.pwgen2android 1.5.6 (197)")
                LabeledContent("Protocol", value: "Gen2 DTP, service 00002760-08C2-11E1-9073-0E8AC72E1011")
                LabeledContent("Deployment target", value: "iOS 17.0")
                LabeledContent("Network requests", value: "None")
            }
            Section("EULA") {
                // The Android build opened https://www.powerwatch.com/pages/eula.
                Text("This offline build ships without the hosted EULA. It is a clean-room feature port for interoperability purposes; the original firmware and trademarks belong to Matrix Industries.")
                    .font(.caption)
                    .foregroundStyle(.secondary)
            }
        }
        .navigationTitle("About")
    }
}
