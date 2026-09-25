import Foundation

/// Gen 2 watch command identifiers.
///
/// Every command sent to (or received from) the PowerWatch 2 carries a
/// two-byte identifier. The raw values below are hex strings exactly as they
/// appear in the Android app (`sdk/protocol/commands/Gen2CommandIDs.kt`,
/// decompiled as `Gen2CommandIDs.java`) — 55 commands in total. Do not rename
/// cases or change raw values: they are wire constants.
public enum Gen2CommandID: String, CaseIterable, Sendable {

    // MARK: AmDTP session

    case startAmDTP = "9000"
    case stopAmDTP = "9001"

    // MARK: Pairing

    case startPairing = "9010"
    case stopPairing = "9011"

    // MARK: User information

    case sendUserInformation = "9002"
    case receiveUserInformation = "9102"
    case sendBiometrics = "9012"

    // MARK: Goals

    case sendStepsDistanceGoal = "9003"
    case receiveStepsDistanceGoals = "9103"
    case sendCaloriesSleepGoal = "9013"

    // MARK: Preferences

    case sendLanguage = "9004"
    case receiveRealTime = "9104"
    case sendUserLocation = "9015"

    // MARK: Real-time log (RTL)

    case rtlStatus = "9107"
    case rtlTime = "9117"

    // MARK: Log pull

    case activityStartLog = "9115"
    case activityEndLog = "9125"
    case activityDeltaLog = "9105"
    case backgroundLog = "9106"
    case sleepLog = "9108"
    case headerTraceLog = "9120"
    case accelTraceLog = "9121"

    // MARK: Log counts

    case getLogCount = "9116"
    case ver3GetLogCount = "9126"

    // MARK: Log clean

    case cleanRTL = "9007"
    case cleanActivityLog = "9005"
    case cleanBackgroundLog = "9006"
    case cleanSleepLog = "9008"
    case cleanAllLogs = "9023"

    // MARK: User prefs & goals (bulk)

    case getUserAndGoals = "9122"
    case sendUserPrefsAndGoals = "9022"
    case getUserAndGoalsVer3 = "9124"
    case sendUserPrefsAndGoalsVer3 = "9024"

    // MARK: Ver-3 log variants

    case activityHeaderLog = "9215"
    case activityDeltaLogVer3 = "9205"

    // MARK: Alerts

    case alertsType = "9009"
    case alertsDate = "9019"
    case alertsTitle = "9029"
    case alertsSubtitle = "9039"
    case alertsMessage = "9049"
    case fullAlertsType = "9059"

    // MARK: Watch settings (93xx family)

    case dnd = "9300"
    case backLight = "9301"
    case backLightDuration = "9302"
    case popupDuration = "9303"
    case gpsUpdateRate = "9304"
    case homeScreen = "9305"
    case bleDisconnectionAlert = "9306"
    case ringtone = "9307"
    case alertType = "9308"
    case reset = "9309"
    case alarm = "930A"
    case timer = "930B"

    // MARK: Diagnostics

    case errorLog = "9226"
    case enableMock = "900D"

    // MARK: Response status words
    //
    // Hardware fact (real watch, 2026-09-17): a response frame carries the
    // response status — not the echoed command — in its two-byte command
    // slot, with the command's data as the frame payload. Android's
    // `Gen2Command.extractPayload` strips only the header and CRC and reads
    // these leading bytes via `extractResponseType`.

    case responseSuccess = "E200"
    case responseError = "E404"
    case responseLocked = "E423"
    case responseWait = "E102"
    case responseProcessing = "E202"

    /// Command id bytes as they appear on the wire (big-endian pair).
    public var bytes: [UInt8] {
        let value = UInt16(rawValue, radix: 16)!
        return [UInt8(value >> 8), UInt8(value & 0xFF)]
    }

    /// The response status when this id is one of the E2xx/E4xx words.
    public var responseType: ResponseType? {
        switch self {
        case .responseSuccess: return .success
        case .responseError: return .error
        case .responseLocked: return .locked
        case .responseWait: return .wait
        case .responseProcessing: return .processing
        default: return nil
        }
    }
}
