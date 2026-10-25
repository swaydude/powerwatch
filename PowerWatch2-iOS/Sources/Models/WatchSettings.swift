import Foundation

// MARK: - Watch-side settings
//
// Option labels come from `setup/language/SettingsDisplayValueLoader.java` and
// the default-locale string pool. Commands come from
// `sdk/protocol/commands/Gen2CommandIDs.java` (9300...930B).

/// `9300` DND
enum DoNotDisturbSetting: Int, Codable, CaseIterable, Identifiable {
    case off = 0, on, auto
    var id: Int { rawValue }
    var displayName: String {
        switch self { case .off: return "Off"; case .on: return "On"; case .auto: return "Auto" }
    }
}

/// `9301` BackLight
enum BacklightTrigger: Int, Codable, CaseIterable, Identifiable {
    case off = 0, doubleTap, tilt, shake
    var id: Int { rawValue }
    var displayName: String {
        switch self {
        case .off: return "Off"
        case .doubleTap: return "Double Tap"
        case .tilt: return "Tilt"
        case .shake: return "Shake"
        }
    }
}

/// `9302` BackLightDuration
enum BacklightDuration: Int, Codable, CaseIterable, Identifiable {
    case twoSeconds = 2, fiveSeconds = 5, tenSeconds = 10
    var id: Int { rawValue }
    var displayName: String { "\(rawValue)s" }
}

/// `9303` PopupDuration
enum PopupDuration: Int, Codable, CaseIterable, Identifiable {
    case fiveSeconds = 5, tenSeconds = 10, fifteenSeconds = 15
    var id: Int { rawValue }
    var displayName: String { "\(rawValue)s" }
}

/// `9304` GPSUpdateRate
enum GPSUpdateRate: Int, Codable, CaseIterable, Identifiable {
    case oneSecond = 1, twoSeconds = 2, fiveSeconds = 5, tenSeconds = 10, auto = 0
    var id: Int { rawValue }
    var displayName: String { self == .auto ? "Auto" : "\(rawValue)s" }
}

/// `9305` HomeScreen
enum HomeScreen: Int, Codable, CaseIterable, Identifiable {
    case stepsCalories = 0
    case sleepHeartRate = 1
    case power = 2
    case temperature = 3

    var id: Int { rawValue }
    var displayName: String {
        switch self {
        case .stepsCalories: return "Steps + Calories"
        case .sleepHeartRate: return "Sleep + Heartrate"
        case .power: return "Power"
        case .temperature: return "Temperature"
        }
    }
}

/// `9306` BLEDisconnection alert
enum BLEDisconnectionAlert: Int, Codable, CaseIterable, Identifiable {
    case off = 0, vibrate, audio, vibrateAndAudio
    var id: Int { rawValue }
    var displayName: String {
        switch self {
        case .off: return "Off"
        case .vibrate: return "Vibrate"
        case .audio: return "Audio"
        case .vibrateAndAudio: return "Vibrate + Audio"
        }
    }
}

/// `9307` Ringtone
enum Ringtone: Int, Codable, CaseIterable, Identifiable {
    case single = 0, double, triple
    var id: Int { rawValue }
    var displayName: String {
        switch self { case .single: return "Single"; case .double: return "Double"; case .triple: return "Triple" }
    }
}

/// `9308` Alert type
enum AlertType: Int, Codable, CaseIterable, Identifiable {
    case vibrate = 0, audio, vibrateAndAudio
    var id: Int { rawValue }
    var displayName: String {
        switch self {
        case .vibrate: return "Vibrate"
        case .audio: return "Audio"
        case .vibrateAndAudio: return "Vibrate + Audio"
        }
    }
}

/// `main/watch/settings/alarm` activation mode (`once`, `once`.. repeat strings)
enum AlarmActivation: Int, Codable, CaseIterable, Identifiable {
    case off = 0, on, once
    var id: Int { rawValue }
    var displayName: String {
        switch self { case .off: return "Off"; case .on: return "On"; case .once: return "Once" }
    }
}

enum AlarmRepeat: Int, Codable, CaseIterable, Identifiable {
    case everyDay = 0, everyWeekDay, everyWeekend
    var id: Int { rawValue }
    var displayName: String {
        switch self {
        case .everyDay: return "Every Day"
        case .everyWeekDay: return "Every Week Day"
        case .everyWeekend: return "Every Weekend"
        }
    }
}

/// `sdk/protocol/commands/watchsettings/AlarmData`
struct WatchAlarm: Codable, Equatable {
    var hour: Int = 7
    var minute: Int = 0
    var isAM: Bool = true
    var repeatMode: AlarmRepeat = .everyDay
    var activation: AlarmActivation = .on
}

/// `TimerState`
enum WatchTimerState: String, Codable {
    case idle, running, paused
}

/// Full settings block pushed to the watch with `9024`
/// SendUserPrefsAndGoalsVer3 (32-byte payload).
struct WatchSettings: Codable, Equatable {
    var dnd: DoNotDisturbSetting = .off
    var backlight: BacklightTrigger = .doubleTap
    var backlightDuration: BacklightDuration = .fiveSeconds
    var popupDuration: PopupDuration = .tenSeconds
    var gpsUpdateRate: GPSUpdateRate = .auto
    var homeScreen: HomeScreen = .stepsCalories
    var bleDisconnection: BLEDisconnectionAlert = .vibrate
    var ringtone: Ringtone = .single
    var alertType: AlertType = .vibrate
    var alarm: WatchAlarm = WatchAlarm()
    var timerHour: Int = 0
    var timerMinute: Int = 5
    var timerSecond: Int = 0
    /// Firmware >= 3 gate (`WatchSettingsVM`).
    var sleepTimeSelection: Int = 0
}

/// Per-device notification toggles, persisted in SharedPreferences in the APK
/// under `<deviceId>notification_enabled_key` / `stored_setting_key` /
/// `goals_notification_enabled_key`, all defaulting to true.
struct NotificationPreferences: Codable, Equatable {
    var connectionNotifications: Bool = true
    var batteryNotifications: Bool = true
    var goalsNotifications: Bool = true
    /// `GoalsType.storeKey` one-shot latches.
    var caloriesGoalReachedToday: Bool = false
    var stepsGoalReachedToday: Bool = false
    var powerGoalReachedToday: Bool = false
    var sleepGoalReachedToday: Bool = false
    var lastBatteryLevel: Float = 100
}

/// Third-party notification allow-list. In the APK this is
/// `shared/watchNotification/alerts/` with hardcoded package names; on iOS the
/// equivalent of Android's NotificationListenerService does not exist, so this
/// models which notification *types* and app categories are forwarded.
struct NotificationAllowList: Codable, Equatable {
    var callsEnabled: Bool = true
    var messagesEnabled: Bool = true
    /// App display names from `AlertsConstantsKt` / `WhiteListResolver`.
    var enabledApps: [String: Bool] = NotificationAllowList.defaultApps

    static let defaultApps: [String: Bool] = [
        "Whatsapp": true,
        "Gmail": true,
        "Facebook Messenger": false,
        "Facebook Messenger Lite": false,
        "Instagram": false,
        "Telegram": false,
        "Skype": false,
        "Viber": false,
        "WeChat": false,
        "Outlook": false,
        "Line": false,
        "Line Lite": false,
        "Fongo": false,
        "Calendar": true
    ]
}
