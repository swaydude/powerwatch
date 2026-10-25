import Foundation

// MARK: - Enums recovered from the APK
//
// Every enum here mirrors a class in
// powerwatch.matrix.com.pwgen2android.shared.data.models or
// ...sdk.protocol.commands. Source of truth is the decompiled DEX.

/// `sdk/protocol/commands/LogType.java`
enum WatchLogType: Int, Codable, CaseIterable, Identifiable {
    case devOffWrist = 0
    case sleepDeep = 1
    case sleepLight = 2
    case sleepRestless = 3
    case awakeStill = 4
    case awakeWalking = 5
    case awakeRunning = 6
    case awakeBike = 7
    case awakeVehicle = 8
    case stateUnknown = 9

    var id: Int { rawValue }

    var isSleep: Bool {
        self == .sleepDeep || self == .sleepLight || self == .sleepRestless
    }

    /// Sleep classification written into `WatchLogEntry.sleepType`:
    /// Deep -> 5, Light -> 3, Restless -> 1, everything else -> 0.
    /// (Gen2BackgroundLogCommand.extractResponse)
    var sleepClassification: Int {
        switch self {
        case .sleepDeep: return 5
        case .sleepLight: return 3
        case .sleepRestless: return 1
        default: return 0
        }
    }
}

/// `sdk/protocol/commands/ActivityType`
enum WatchActivityType: Int, Codable, CaseIterable, Identifiable {
    case stationary = 0
    case walking = 1
    case running = 2
    case jogging = 3
    case biking = 4
    case driving = 5
    case indoorWalking = 6
    case indoorRunning = 7
    case indoorJogging = 8
    case indoorBiking = 9
    case hiit = 10
    case unknown = 255

    var id: Int { rawValue }
}

/// `shared/data/models/UserActivityType` + `ActivityPeriodsExtensionsKt.mapActivityTypeToName`
/// Labels are the exact default-locale strings from resources.arsc
/// (activity_walking, activity_indoor_walking, ...).
enum UserActivityType: String, Codable, CaseIterable, Identifiable {
    case outdoorWalk
    case indoorWalk
    case outdoorJog
    case indoorJog
    case outdoorRun
    case indoorRun
    case outdoorCycle
    case indoorCycle
    case intervalTraining
    case driving
    case stationary
    case unknown

    var id: String { rawValue }

    var displayName: String {
        switch self {
        case .outdoorWalk: return "Outdoor Walk"
        case .indoorWalk: return "Indoor Walk"
        case .outdoorJog: return "Outdoor Jog"
        case .indoorJog: return "Indoor Jog"
        case .outdoorRun: return "Outdoor Run"
        case .indoorRun: return "Indoor Run"
        case .outdoorCycle: return "Outdoor Cycle"
        case .indoorCycle: return "Indoor Cycle"
        case .intervalTraining: return "Interval Training"
        case .driving: return "Driving"
        case .stationary: return "Stationary"
        case .unknown: return "Unknown"
        }
    }

    /// Maps a watch-side `ActivityType` to the user-facing activity type.
    static func from(watchType: WatchActivityType) -> UserActivityType {
        switch watchType {
        case .walking: return .outdoorWalk
        case .indoorWalking: return .indoorWalk
        case .jogging: return .outdoorJog
        case .indoorJogging: return .indoorJog
        case .running: return .outdoorRun
        case .indoorRunning: return .indoorRun
        case .biking: return .outdoorCycle
        case .indoorBiking: return .indoorCycle
        case .hiit: return .intervalTraining
        case .driving: return .driving
        case .stationary: return .stationary
        case .unknown: return .unknown
        }
    }
}

/// `shared/data/models/SleepType`
enum SleepType: String, Codable, CaseIterable, Identifiable {
    case awake = "AWAKE"
    case restless = "RESTLESS"
    case light = "LIGHT"
    case deep = "DEEP"

    var id: String { rawValue }

    var displayName: String {
        switch self {
        case .awake: return "Awake"
        case .restless: return "RESTLESS"
        case .light: return "Light Sleep"
        case .deep: return "Deep Sleep"
        }
    }
}

/// `shared/data/models/Gender`
enum Gender: String, Codable, CaseIterable, Identifiable {
    case male
    case female
    var id: String { rawValue }
    var displayName: String { self == .male ? "Male" : "Female" }
}

/// `shared/data/models/UnitType`
enum UnitType: String, Codable, CaseIterable, Identifiable {
    case metric
    case imperial
    var id: String { rawValue }
    /// resources: metrics_units = "Metric", imperials_units = "Imperial"
    var displayName: String { self == .metric ? "Metric" : "Imperial" }
}

/// `shared/data/models/TimeFormatType`
enum HourFormat: String, Codable, CaseIterable, Identifiable {
    case twelve = "12h"
    case twentyFour = "24h"
    var id: String { rawValue }
}

/// `utils/LanguageControllerImpl` language keys (13 supported).
enum AppLanguage: String, CaseIterable, Identifiable, Codable {
    case en, fr, de, ko, ja, it, pt, es, zh_CN = "zh_CN", zh_TW = "zh_TW", ru, cs, pl

    var id: String { rawValue }

    /// Display names from resources: english_language, french_language, ...
    var displayName: String {
        switch self {
        case .en: return "English"
        case .fr: return "Français"
        case .de: return "Deutsch"
        case .ko: return "한국어"
        case .ja: return "日本語"
        case .it: return "Italiano"
        case .pt: return "Português"
        case .es: return "Español"
        case .zh_CN: return "简体中文"
        case .zh_TW: return "繁體中文"
        case .ru: return "Pусский"
        case .cs: return "Čeština"
        case .pl: return "Polski"
        }
    }

    var localeIdentifier: String {
        switch self {
        case .zh_CN: return "zh-Hans"
        case .zh_TW: return "zh-Hant"
        default: return rawValue
        }
    }

    /// Chinese locales switch the activity map renderer to Baidu in the Android
    /// app (`runningcomponent/MapType.java`). With maps removed, the flag only
    /// drives which manual/asset variant would be shown.
    var usesChinaRegionAssets: Bool { self == .zh_CN || self == .zh_TW }

    /// gen2_manual_<lang>.pdf shipped in APK assets; cs and pl have none.
    var manualAssetName: String? {
        switch self {
        case .cs, .pl: return nil
        case .en: return "gen2_manual_en"
        case .zh_CN: return "gen2_manual_zh_CN"
        case .zh_TW: return "gen2_manual_zh_TW"
        default: return "gen2_manual_\(rawValue)"
        }
    }
}

// MARK: - Persisted records (Room table analogues)
//
// Table names and columns come from the CREATE TABLE statements in
// shared/data/db/RoomDB_Impl.java (schema version 23,
// identityHash 7eea0e60d59cd2ba54d78e05b0b90fa3).

/// Room table `User`
struct UserAccount: Codable, Equatable, Identifiable {
    var uid: String
    var enabled: Bool = true
    var name: String
    var email: String

    /// Room's `User.password TEXT` column, kept so the shape still matches the
    /// recovered schema — but **transient**: it is absent from `CodingKeys`, so
    /// `LocalStore`'s snapshot never contains a secret. The real value lives in
    /// `KeychainStore.savePassword(_:for:)`.
    var password: String = ""

    var age: Int = 25
    var height: Double = 180
    var weight: Double = 80
    var gender: Gender = .male
    var shouldSync: Bool = false
    var language: AppLanguage = .en
    var unitType: UnitType = .metric
    var timeFormatType: HourFormat = .twentyFour

    var id: String { uid }

    /// Every column except `password`, which must not be serialised.
    enum CodingKeys: String, CodingKey {
        case uid, enabled, name, email, age, height, weight, gender
        case shouldSync, language, unitType, timeFormatType
    }
}

/// Room table `Device`
struct PairedDevice: Codable, Equatable, Identifiable {
    var uid: String
    var serialNumber: String
    var bluetoothAddress: String
    var pid: Int = 0
    var firmwareVersion: String = ""
    var productName: String = "PowerWatch 2"
    var shouldSync: Bool = false
    var callNotification: Bool = true
    var messageNotification: Bool = true
    var activityGoalNotification: Bool = true
    var alarmNotification: Bool = true
    /// The protocol version the watch advertised (`04 fe 04 5f 00` → 4 for every
    /// Gen2 watch seen on air). `ExecutorsFactory.createPairExecutor` picks the
    /// pairing chain from it and `DeviceProtocolStorage.saveDeviceProtocolVersion`
    /// persists it in the APK. Optional so snapshots written before it existed
    /// still decode.
    var protocolVersion: Int? = nil

    var id: String { uid }
}

/// Room table `GoalConfiguration`. `sleep` is stored in minutes
/// (DailyGoalsSettingsVM renders `sleep/60 + "h"`).
///
/// The defaults are the Kotlin default-argument values in the entity's synthetic
/// constructor: calories 2000, distance 5000, power 6000, sleep 480 min,
/// steps 5000.
struct GoalConfiguration: Codable, Equatable, Identifiable {
    var id: Int = 0
    var calories: Int = 2000
    var distance: Double = 5000
    var power: Int = 6000
    var sleep: Int = 480
    var steps: Int = 5000
    var createdAt: Date = Date()
    var shouldSync: Bool = false
}

/// One decoded `9106` background-log sample (per-minute).
/// Field/bit layout: Gen2BackgroundLogCommand.parseSingleLog.
struct BackgroundLogEntry: Codable, Equatable, Identifiable {
    var id: String { "\(startTime)-\(logTimeIndex)-\(indexInGroup)" }

    var logTimeIndex: Int
    var indexInGroup: Int
    var startTime: Date

    var walkStepDelta: Int
    var runningStepDelta: Int
    var distanceDelta: Int

    var activeCalories: Int
    var bmrCalories: Int

    /// µWh, already resolved through `generationArray`.
    var thermalGen: Int
    /// µWh, already resolved through `generationArray`.
    var solarGen: Int
    /// µWh, already resolved through `consumptionArray`.
    var powerConsumed: Int

    /// Raw 9-bit value; divide by 4 for °C.
    var caseTempRaw: Int
    /// Raw value with the >255 -> -512 correction applied; divide by 4 for °C.
    var skinTempRaw: Int

    var heartRate: Int
    var hrv: Int
    var battery: Int
    var logType: WatchLogType

    var caseTempC: Double { Double(caseTempRaw) / 4.0 }
    var skinTempC: Double { Double(skinTempRaw) / 4.0 }
    var totalSteps: Int { walkStepDelta + runningStepDelta }
}

/// Room tables `WalkingLog` / `RestingLog` / `SleepLog`, collapsed into one
/// record with a state discriminator. `startTime` is the primary key.
struct ActivityLogEntry: Codable, Equatable, Identifiable {
    enum State: String, Codable, CaseIterable {
        case walking, resting, sleep
    }

    var id: String { "\(state.rawValue)-\(startTime.timeIntervalSince1970)" }

    var state: State
    var startTime: Date
    var endTime: Date

    var steps: Int = 0
    var distance: Double = 0
    var activeCalories: Int = 0
    var bmrCalories: Int = 0

    var heartRate: Int = 0
    var minHeartRate: Int = 0
    var maxHeartRate: Int = 0
    var hrv: Double = 0

    var skinTemp: Double = 0
    var minSkinTemp: Double = 0
    var maxSkinTemp: Double = 0
    var caseTemp: Double = 0
    var minCaseTemp: Double = 0
    var maxCaseTemp: Double = 0

    var bodyPower: Int = 0
    var solarPower: Int = 0

    var sleepType: SleepType? = nil
    var restlessMinutes: Int = 0
    var minsInPeriod: Int = 60

    var shouldSend: Bool = false
    var email: String = ""
}

/// Room tables `*HourPeriod` (Walking/Resting/Sleep), collapsed with a state
/// discriminator. `startTime` is the primary key.
struct HourPeriod: Codable, Equatable, Identifiable {
    var id: String { "\(state.rawValue)-\(startTime.timeIntervalSince1970)" }

    var state: ActivityLogEntry.State
    var startTime: Date
    var endTime: Date
    var hourInDay: Int

    var steps: Int = 0
    var distance: Double = 0
    var activeCalories: Int = 0
    var bmrCalories: Int = 0

    var heartRate: Double = 0
    var minHeartRate: Int = 0
    var maxHeartRate: Int = 0
    var hrv: Double = 0

    var skinTemp: Double = 0
    var minSkinTemp: Double = 0
    var maxSkinTemp: Double = 0
    var caseTemp: Double = 0
    var minCaseTemp: Double = 0
    var maxCaseTemp: Double = 0
    var peakTemp: Double = 0

    var bodyPower: Int = 0
    var solarPower: Int = 0

    var restlessMinutes: Int = 0
    var minsInPeriod: Int = 0
    var sleepType: SleepType? = nil

    var lastUpdated: Date = Date()
}

/// Aggregated day view. In the Android app this is *not* a table: it is
/// computed by `HourToDayGrouper1` from the hour periods.
struct DayPeriod: Equatable, Identifiable {
    var id: Date { startTime }

    var startTime: Date
    var endTime: Date

    var steps: Int = 0
    var distance: Double = 0
    var activeCalories: Int = 0
    var bmrCalories: Int = 0

    var avgHeartRate: Double = 0
    var minHeartRate: Int = 0
    var maxHeartRate: Int = 0
    var avgHRV: Double = 0

    var avgSkinTemp: Double = 0
    var minSkinTemp: Double = 0
    var maxSkinTemp: Double = 0

    var bodyPower: Int = 0
    var solarPower: Int = 0

    var sleepingMinutes: Int = 0
    var restlessMinutes: Int = 0
    var lightMinutes: Int = 0
    var deepMinutes: Int = 0
    var awakeMinutes: Int = 0
    var wentToBed: Date? = nil
    var wokeUp: Date? = nil

    var hours: [HourPeriod] = []
}

/// Room table `UserActivitySession`. `splits`, `gpsPositions` and `heartRates`
/// are JSON TEXT columns via `UserActivitySessionConverter`.
struct UserActivitySession: Codable, Equatable, Identifiable {
    var id: String
    var name: String
    var activityType: UserActivityType
    var locationName: String
    var distance: Double
    var steps: Int
    var startTime: Date
    var endTime: Date
    var pace: Double
    var activeCalories: Int
    var bmrCalories: Int
    var splits: [RunningSplit]
    var gpsPositions: [GPSPosition]
    var heartRates: [HeartRateSample]
    var notes: String
    var shouldSend: Bool = false
    var email: String = ""

    var duration: TimeInterval { max(0, endTime.timeIntervalSince(startTime)) }

    var totalAscended: Double {
        gpsPositions.enumerated().reduce(0.0) { acc, el in
            guard el.offset > 0 else { return acc }
            let d = el.element.altitude - gpsPositions[el.offset - 1].altitude
            return d > 0 ? acc + d : acc
        }
    }

    var totalDescended: Double {
        gpsPositions.enumerated().reduce(0.0) { acc, el in
            guard el.offset > 0 else { return acc }
            let d = el.element.altitude - gpsPositions[el.offset - 1].altitude
            return d < 0 ? acc - d : acc
        }
    }
}

struct RunningSplit: Codable, Equatable {
    var splitDuration: TimeInterval
}

struct GPSPosition: Codable, Equatable {
    var latitude: Double
    var longitude: Double
    var altitude: Double
}

struct HeartRateSample: Codable, Equatable {
    var startTime: Date
    var value: Int
}

/// Room table `UserActivityDate` — the "this day has data" calendar index.
struct UserActivityDate: Codable, Equatable, Identifiable {
    var startTime: Date
    var id: Date { startTime }
}

/// Room table `UpdateInfo`. In the APK `downloadUrl` comes from
/// `GET /pwuser/update/latest`; here it is a bundled local resource.
struct FirmwareUpdateInfo: Codable, Equatable, Identifiable {
    var uid: String
    var pid: Int
    var releaseNotes: String
    var language: String
    var releaseVersion: String
    /// Local resource name (no network). Was `downloadUrl` in the cloud build.
    var localBundleResource: String
    var mandatory: Bool = false
    var forced: Bool = false
    var releaseDate: Date? = nil

    var id: String { uid }
}

/// `shared/data/models/DeviceEvent` event kinds. The cloud endpoint
/// `/metrics/events/device/add` is gone; these are kept for the local logger.
enum DeviceMetricEvent: String, Codable {
    case syncStart = "SYNC_START"
    case syncEnd = "SYNC_END"
    case pairStart = "PAIR_START"
    case pairEnd = "PAIR_END"
    case otaStart = "OTA_START"
    case otaEnd = "OTA_END"
}
