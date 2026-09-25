import SwiftUI
import PowerWatchCore

/// Watch settings screen (T5.6): the 93xx command family. Each picker edits
/// a local value; changes are pushed to the watch when connected (Android
/// `WatchSettingsExecutor` semantics). Values persist locally.
struct WatchSettingsView: View {
    @Environment(SyncController.self) private var sync
    @Environment(AppModel.self) private var model
    @State private var settings = WatchSettingsState.load()
    @State private var sendStatus: String?
    /// Send All runs ~12 round-trips, so the screen shows progress rather than
    /// looking dead while it works.
    @State private var sendingAll = false

    var body: some View {
        NavigationStack {
            Form {
                Section {
                    if sync.isScanning {
                        Text("Settings are sent when a watch is connected.")
                            .font(.footnote)
                            .foregroundStyle(.secondary)
                    } else if let status = sendStatus {
                        Text(status)
                            .font(.footnote)
                            .foregroundStyle(.secondary)
                    }
                    Button("Send All to Watch") { Task { await sendAll() } }
                        .disabled(sendingAll || !sync.isWatchConnected)
                        .accessibilityIdentifier("watchsettings.sendAll")
                }
                Section("Watch + App") {
                    Picker("Clock", selection: $settings.hourFormat) {
                        Text("12h").tag(HourFormat.twelve)
                        Text("24h").tag(HourFormat.twentyFour)
                    }
                    Picker("Units", selection: $settings.units) {
                        Text("Metric").tag(UnitType.metric)
                        Text("Imperial").tag(UnitType.imperial)
                    }
                    Picker("Language", selection: $settings.locale) {
                        ForEach(WatchLocale.allCases, id: \.rawValue) { locale in
                            Text(locale.displayName).tag(locale)
                        }
                    }
                }
                Section("Display") {
                    picker("Backlight", $settings.backLight, over: BackLightMode.allCases)
                    picker("Backlight Duration", $settings.backLightDuration, over: BackLightDuration.allCases)
                    picker("Popup Duration", $settings.popupDuration, over: PopupDuration.allCases)
                    picker("Home Screen", $settings.homeScreen, over: HomeScreenMode.allCases)
                }
                Section("Alerts") {
                    picker("Ringtone", $settings.ringtone, over: RingtoneMode.allCases)
                    picker("Alert Type", $settings.alertType, over: AlertMode.allCases)
                    picker("BLE Disconnect Alert", $settings.bleAlert, over: BLEAlertMode.allCases)
                    picker("Do Not Disturb", $settings.dnd, over: DNDMode.allCases)
                }
                Section("GPS") {
                    picker("GPS Update Rate", $settings.gpsRate, over: GPSUpdateRate.allCases)
                }
            }
            .navigationTitle("Watch Settings")
            // Android `WatchSettingsExecutor` pushes each setting as it is
            // edited (while connected); the local value always persists.
            .onChange(of: settings.hourFormat) { _, _ in sendPrefs() }
            .onChange(of: settings.units) { _, _ in sendPrefs() }
            .onChange(of: settings.locale) { _, _ in
                push(.sendLanguage, CommandPayloads.sendLanguage(settings.locale))
                sendPrefs()
            }
            .onChange(of: settings.dnd) { _, _ in
                push(.dnd, WatchSettingsPayloads.dnd(settings.dnd))
            }
            .onChange(of: settings.backLight) { _, _ in
                push(.backLight, WatchSettingsPayloads.backLight(settings.backLight))
            }
            .onChange(of: settings.backLightDuration) { _, _ in
                push(.backLightDuration, WatchSettingsPayloads.backLightDuration(settings.backLightDuration))
            }
            .onChange(of: settings.popupDuration) { _, _ in
                push(.popupDuration, WatchSettingsPayloads.popupDuration(settings.popupDuration))
            }
            .onChange(of: settings.gpsRate) { _, _ in
                push(.gpsUpdateRate, WatchSettingsPayloads.gpsUpdateRate(settings.gpsRate))
            }
            .onChange(of: settings.homeScreen) { _, _ in
                push(.homeScreen, WatchSettingsPayloads.homeScreen(settings.homeScreen))
            }
            .onChange(of: settings.bleAlert) { _, _ in
                push(.bleDisconnectionAlert, WatchSettingsPayloads.bleDisconnectionAlert(settings.bleAlert))
            }
            .onChange(of: settings.ringtone) { _, _ in
                push(.ringtone, WatchSettingsPayloads.ringtone(settings.ringtone))
            }
            .onChange(of: settings.alertType) { _, _ in
                push(.alertType, WatchSettingsPayloads.alertType(settings.alertType))
            }
        }
    }

    /// One command on edit — silent when disconnected (Android only sends
    /// while connected; "Send All" covers the reconnect case).
    private func push(_ command: Gen2CommandID, _ payload: [UInt8]) {
        settings.save()
        Task {
            if await sync.applySetting(command: command, payload: payload) {
                sendStatus = "Sent \(command.rawValue) to the watch."
            } else if !sync.isWatchConnected {
                sendStatus = "Saved — sends when the watch connects."
            } else {
                sendStatus = "Not sent (\(command.rawValue)) — watch busy?"
            }
        }
    }

    private func sendPrefs() {
        push(.sendUserPrefsAndGoalsVer3, prefsAndGoalsPayload())
    }

    /// 9024 bulk payload (shared with pairing provisioning; every edit
    /// `save()`s immediately, so the persisted state is the live state).
    private func prefsAndGoalsPayload() -> [UInt8] {
        model.userPrefsAndGoalsPayload()
    }

    private func picker<T: RawRepresentable & CaseIterable & Hashable>(
        _ title: String, _ value: Binding<T>, over cases: [T]
    ) -> some View where T.RawValue == UInt8, T.AllCases: RandomAccessCollection, T.AllCases.Element == T {
        Picker(title, selection: value) {
            ForEach(cases, id: \.rawValue) { mode in
                Text(String(describing: mode).titleCased()).tag(mode)
            }
        }
    }

    /// Pushes every setting as its own 93xx command (Android sends each
    /// setting as it is edited while connected; "send all" covers reconnects).
    private func sendAll() async {
        guard sync.isWatchConnected else {
            settings.save()
            sendStatus = "Watch not connected — settings saved on the phone."
            return
        }
        sendingAll = true
        sendStatus = "Sending settings…"
        defer { sendingAll = false }
        var sent = 0
        var failed = 0
        var abandoned: Gen2CommandID?
        func one(_ command: Gen2CommandID, _ payload: [UInt8]) async {
            // A command the watch never answers means the link is going (or the
            // firmware is rebooting) — writing the rest into it is pointless and
            // only deepens the stall.
            guard abandoned == nil else { return }
            if await sync.applySetting(command: command, payload: payload) {
                sent += 1
            } else {
                failed += 1
                abandoned = command
            }
        }
        // 9024 bulk prefs: clock/units/language plus user biometrics and
        // goals from the app model (Android packs both on the same screen).
        await one(.sendUserPrefsAndGoalsVer3, prefsAndGoalsPayload())
        await one(.sendLanguage, CommandPayloads.sendLanguage(settings.locale))
        await one(.dnd, WatchSettingsPayloads.dnd(settings.dnd))
        await one(.backLight, WatchSettingsPayloads.backLight(settings.backLight))
        await one(.backLightDuration, WatchSettingsPayloads.backLightDuration(settings.backLightDuration))
        await one(.popupDuration, WatchSettingsPayloads.popupDuration(settings.popupDuration))
        await one(.gpsUpdateRate, WatchSettingsPayloads.gpsUpdateRate(settings.gpsRate))
        await one(.homeScreen, WatchSettingsPayloads.homeScreen(settings.homeScreen))
        await one(.bleDisconnectionAlert, WatchSettingsPayloads.bleDisconnectionAlert(settings.bleAlert))
        await one(.ringtone, WatchSettingsPayloads.ringtone(settings.ringtone))
        await one(.alertType, WatchSettingsPayloads.alertType(settings.alertType))
        if failed == 0 {
            sendStatus = "Sent \(sent) settings to the watch."
        } else if let command = abandoned, sent > 0 {
            sendStatus = "Sent \(sent) settings — the watch stopped answering \(command.rawValue)."
        } else {
            // The watch was connected (checked above), so a miss here is the
            // link or the watch refusing, not an offline phone.
            sendStatus = "Nothing sent — the watch did not answer \(abandoned?.rawValue ?? "the first command")."
        }
        settings.save()
    }
}

/// Local watch-settings state (the Android app keeps the equivalent in
/// the device/settings repository; nothing here leaves the phone except
/// the 93xx commands themselves).
struct WatchSettingsState: Codable, Equatable {
    var hourFormat: HourFormat = .twelve
    var units: UnitType = .metric
    var locale: WatchLocale = .english
    var dnd: DNDMode = .off
    var backLight: BackLightMode = .doubleTap
    var backLightDuration: BackLightDuration = .timed2Sec
    var popupDuration: PopupDuration = .timed5Sec
    var gpsRate: GPSUpdateRate = .auto
    var homeScreen: HomeScreenMode = .stepsCalories
    var bleAlert: BLEAlertMode = .vibrate
    var ringtone: RingtoneMode = .single
    var alertType: AlertMode = .vibeAudio
    // Android exposes an alarm (`930A`) and a countdown timer (`930B`) screen;
    // this app deliberately has neither, so neither is sent by "Send All".

    static let url = FileManager.default.urls(for: .applicationSupportDirectory, in: .userDomainMask)[0]
        .appendingPathComponent("watchsettings.json")

    static func load() -> WatchSettingsState {
        guard let data = try? Data(contentsOf: url),
              let state = try? JSONDecoder().decode(WatchSettingsState.self, from: data) else {
            return WatchSettingsState()
        }
        return state
    }

    func save() {
        if let data = try? JSONEncoder().encode(self) {
            try? data.write(to: Self.url, options: .atomic)
        }
    }
}

extension WatchLocale {
    var displayName: String {
        switch self {
        case .english: return "English"
        case .simplifiedChinese: return "简体中文"
        case .traditionalChinese: return "繁體中文"
        case .japanese: return "日本語"
        case .korean: return "한국어"
        case .russian: return "Русский"
        case .german: return "Deutsch"
        case .french: return "Français"
        case .italian: return "Italiano"
        case .spanish: return "Español"
        case .portuguese: return "Português"
        case .czech: return "Čeština"
        case .polish: return "Polski"
        }
    }
}

extension String {
    /// Enum-case names ("off", "backLightFour") shown as "Off" / "Backlight Four".
    func titleCased() -> String {
        (self as NSString).replacingOccurrences(
            of: "([a-z])([A-Z])", with: "$1 $2",
            options: .regularExpression, range: NSRange(location: 0, length: count)
        ).capitalized
    }
}
