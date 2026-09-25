import Foundation

/// Watch-settings payloads (`Gen2SendUserLocationCommand`-style encoders for
/// the 93xx command family). Ported from
/// `sdk/protocol/commands/watchsettings/*` — every mode's raw value is a wire
/// constant.

// MARK: - Modes

/// 9300 — `DNDMode`
public enum DNDMode: UInt8, Hashable, Codable, Sendable, CaseIterable {
    case off = 0
    case on = 1
    case auto = 2
}

/// 9301 — `BackLightMode`
public enum BackLightMode: UInt8, Hashable, Codable, Sendable, CaseIterable {
    case off = 0
    case doubleTap = 1
    case wristTilt = 2
    case wristShake = 3
}

/// 9302 — `BackLightDuration`
public enum BackLightDuration: UInt8, Hashable, Codable, Sendable, CaseIterable {
    case timed2Sec = 0
    case timed5Sec = 1
    case timed10Sec = 2
}

/// 9303 — `PopupDuration`
public enum PopupDuration: UInt8, Hashable, Codable, Sendable, CaseIterable {
    case timed5Sec = 0
    case timed10Sec = 1
    case timed15Sec = 2
}

/// 9304 — `GPSUpdateRate`
public enum GPSUpdateRate: UInt8, Hashable, Codable, Sendable, CaseIterable {
    case auto = 0
    case timed1Sec = 1
    case timed2Sec = 2
    case timed5Sec = 3
    case timed10Sec = 4
}

/// 9305 — `HomeScreenMode`
public enum HomeScreenMode: UInt8, Hashable, Codable, Sendable, CaseIterable {
    case stepsCalories = 0
    case sleepHR = 1
    case temperature = 2
    case power = 3
}

/// 9306 — `BLEAlertMode` (BLE disconnection alert)
public enum BLEAlertMode: UInt8, Hashable, Codable, Sendable, CaseIterable {
    case off = 0
    case vibrate = 1
    case audio = 2
    case vibeAudio = 3
}

/// 9307 — `RingtoneMode`
public enum RingtoneMode: UInt8, Hashable, Codable, Sendable, CaseIterable {
    case single = 0
    case double = 1
    case triple = 2
}

/// 9308 — `AlertMode`
public enum AlertMode: UInt8, Hashable, Codable, Sendable, CaseIterable {
    case vibeAudio = 0
    case vibrate = 1
    case audio = 2
}

/// 9309 — `ResetMode`
public enum ResetMode: UInt8, Hashable, Codable, Sendable, CaseIterable {
    case reset = 0
    case factoryReset = 1
    case powerOff = 2
}

/// 930A alarm day selection — `DaySelection`
public enum DaySelection: UInt8, Hashable, Codable, Sendable, CaseIterable {
    case everyDay = 0
    case everyWeekDay = 1
    case everyWeekend = 2
}

/// 930A alarm control — `AlarmControl`
public enum AlarmControl: UInt8, Hashable, Codable, Sendable, CaseIterable {
    case off = 0
    case on = 1
    case once = 2
}

/// 930B timer control — `TimerControl`
public enum TimerControl: UInt8, Hashable, Codable, Sendable, CaseIterable {
    case start = 0
    case pause = 1
    case reset = 2
}

// MARK: - Payloads

public enum WatchSettingsPayloads {

    /// 9300 — `DNDGen2Command`
    public static func dnd(_ mode: DNDMode) -> [UInt8] { [mode.rawValue] }

    /// 9301 — `Gen2BackLightCommand`
    public static func backLight(_ mode: BackLightMode) -> [UInt8] { [mode.rawValue] }

    /// 9302 — `Gen2BackLightDurationCommand`
    public static func backLightDuration(_ duration: BackLightDuration) -> [UInt8] { [duration.rawValue] }

    /// 9303 — `Gen2PopupDurationCommand`
    public static func popupDuration(_ duration: PopupDuration) -> [UInt8] { [duration.rawValue] }

    /// 9304 — `Gen2GPSUpdateRateCommand`
    public static func gpsUpdateRate(_ rate: GPSUpdateRate) -> [UInt8] { [rate.rawValue] }

    /// 9305 — `Gen2HomeScreenCommand`
    public static func homeScreen(_ mode: HomeScreenMode) -> [UInt8] { [mode.rawValue] }

    /// 9306 — `Gen2BLEDisconnectionAlertCommand`
    public static func bleDisconnectionAlert(_ mode: BLEAlertMode) -> [UInt8] { [mode.rawValue] }

    /// 9307 — `Gen2RingtoneCommand`
    public static func ringtone(_ mode: RingtoneMode) -> [UInt8] { [mode.rawValue] }

    /// 9308 — `Gen2AlertCommand` (alert type)
    public static func alertType(_ mode: AlertMode) -> [UInt8] { [mode.rawValue] }

    /// 9309 — `Gen2ResetCommand`
    public static func reset(_ mode: ResetMode) -> [UInt8] { [mode.rawValue] }

    /// 930A — `Gen2AlarmCommand`: [hour, minute, PM flag, days, control].
    /// The PM flag is `!isAM` in the Android app (0 = AM, 1 = PM).
    public static func alarm(
        hour: UInt8, minute: UInt8, isAM: Bool,
        days: DaySelection, control: AlarmControl
    ) -> [UInt8] {
        [hour, minute, isAM ? 0 : 1, days.rawValue, control.rawValue]
    }

    /// 930B — `Gen2TimerCommand`: [hour, minute, seconds, control].
    public static func timer(
        hour: UInt8, minute: UInt8, seconds: UInt8, control: TimerControl
    ) -> [UInt8] {
        [hour, minute, seconds, control.rawValue]
    }
}
