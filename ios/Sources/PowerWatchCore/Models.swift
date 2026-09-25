import Foundation

// MARK: - User
// Ported from `shared/data/models/UserAccount.kt` (User.java in jadx output).

public struct User: Equatable, Sendable, Codable {
    public var uid: Int64
    public var enabled: Bool
    public var name: String
    public var email: String
    public var password: String
    public var age: Int
    public var height: Int
    public var weight: Float
    public var gender: Gender
    public var shouldSync: Bool
    public var accountSettings: UserAccountSettings

    public init(
        uid: Int64 = 0,
        enabled: Bool = true,
        name: String = "",
        email: String = "",
        password: String = "",
        age: Int = 0,
        height: Int = 0,
        weight: Float = 0,
        gender: Gender = .male,
        shouldSync: Bool = true,
        accountSettings: UserAccountSettings = UserAccountSettings()
    ) {
        self.uid = uid
        self.enabled = enabled
        self.name = name
        self.email = email
        self.password = password
        self.age = age
        self.height = height
        self.weight = weight
        self.gender = gender
        self.shouldSync = shouldSync
        self.accountSettings = accountSettings
    }
}

// MARK: - UserAccountSettings
// Ported from `shared/data/models/UserAccountSettings.java`.

public struct UserAccountSettings: Equatable, Sendable, Codable {
    public var language: String
    public var timeFormatType: Int
    public var unitType: UnitType

    public init(
        language: String = "en",
        timeFormatType: Int = HourFormat.twelve.rawValue,
        unitType: UnitType = .metric
    ) {
        self.language = language
        self.timeFormatType = timeFormatType
        self.unitType = unitType
    }
}

// MARK: - Device
// Ported from `shared/data/models/Device.java`.

public struct Device: Equatable, Sendable, Codable {
    public var uid: Int64
    public var pid: Int
    public var productName: String
    public var serialNumber: String
    public var bluetoothAddress: String
    public var firmwareVersion: String
    public var callNotification: Bool
    public var messageNotification: Bool
    public var alarmNotification: Bool
    public var activityGoalNotification: Bool
    public var shouldSync: Bool?

    public init(
        uid: Int64 = 0,
        pid: Int = 0,
        productName: String = "",
        serialNumber: String = "",
        bluetoothAddress: String = "",
        firmwareVersion: String = "",
        callNotification: Bool = false,
        messageNotification: Bool = false,
        alarmNotification: Bool = false,
        activityGoalNotification: Bool = false,
        shouldSync: Bool? = nil
    ) {
        self.uid = uid
        self.pid = pid
        self.productName = productName
        self.serialNumber = serialNumber
        self.bluetoothAddress = bluetoothAddress
        self.firmwareVersion = firmwareVersion
        self.callNotification = callNotification
        self.messageNotification = messageNotification
        self.alarmNotification = alarmNotification
        self.activityGoalNotification = activityGoalNotification
        self.shouldSync = shouldSync
    }
}

// MARK: - DefaultPhoneWatch
// Ported from `shared/data/models/DefaultPhoneWatch.java`.

public struct DefaultPhoneWatch: Equatable, Sendable {
    public var uid: Int64
    public var serialNumber: String
    public var bluetoothAddress: String

    public init(uid: Int64 = 0, serialNumber: String = "", bluetoothAddress: String = "") {
        self.uid = uid
        self.serialNumber = serialNumber
        self.bluetoothAddress = bluetoothAddress
    }
}

// MARK: - GoalConfiguration
// Ported from `shared/data/models/GoalConfiguration.java`.

public struct GoalConfiguration: Equatable, Sendable, Codable {
    public var id: Int64
    public var steps: Int
    public var calories: Int
    public var sleep: Int
    public var power: Int
    public var distance: Float
    public var createdAt: Int64
    public var shouldSync: Bool

    public init(
        id: Int64 = 0,
        steps: Int = 0,
        calories: Int = 0,
        sleep: Int = 0,
        power: Int = 0,
        distance: Float = 0,
        createdAt: Int64 = 0,
        shouldSync: Bool = true
    ) {
        self.id = id
        self.steps = steps
        self.calories = calories
        self.sleep = sleep
        self.power = power
        self.distance = distance
        self.createdAt = createdAt
        self.shouldSync = shouldSync
    }

    /// Functional copies for incremental goal edits from the settings UI.
    public func with(steps: Int? = nil, calories: Int? = nil, sleep: Int? = nil,
                     power: Int? = nil, distance: Float? = nil) -> GoalConfiguration {
        var copy = self
        copy.steps = steps ?? self.steps
        copy.calories = calories ?? self.calories
        copy.sleep = sleep ?? self.sleep
        copy.power = power ?? self.power
        copy.distance = distance ?? self.distance
        return copy
    }
}

// MARK: - Enums

/// Ported from `shared/data/models/Gender.java`.
public enum Gender: String, Equatable, CaseIterable, Sendable, Codable {
    case male = "male"
    case female = "female"
}

/// Ported from `shared/data/models/UnitType.java`.
public enum UnitType: String, Equatable, CaseIterable, Sendable, Codable {
    case metric = "metric"
    case imperial = "imperial"
}

/// Ported from `shared/data/models/HourFormat.java`.
public enum HourFormat: Int, Equatable, CaseIterable, Sendable, Codable {
    case twelve = 0
    case twentyFour = 1
}

/// Ported from `shared/data/models/SleepType.java` — the five-minute sleep
/// period classification. Stored in the DB as the uppercase enum name via
/// `SleepTypeTypeConverter` (raw values match the Android enum names).
public enum SleepType: String, Equatable, CaseIterable, Sendable, Codable {
    case awake = "SLEEP_AWAKE"
    case restless = "RESTLESS"
    case light = "LIGHT"
    case deep = "DEEP"
}
