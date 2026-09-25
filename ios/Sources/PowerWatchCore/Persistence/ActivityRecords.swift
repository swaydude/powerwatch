import Foundation
import GRDB

// Activity log and period records, ported from the Android Room schema
// (`shared/data/db/` — see the exact CREATE TABLE statements in
// `PowerWatchDatabase.migrations`). Column names and types mirror Room:
// epoch-millisecond timestamps as INTEGER, Float metrics as REAL.
//
// JSON columns (sleepFiveMins, splits, gpsPositions, heartRates) replace
// Android's Gson converters with Codable JSON — same wire shape on disk.

// MARK: - JSON child models

/// One five-minute sleep bucket, embedded in `SleepHourPeriod.sleepFiveMins`.
/// Ported from `SleepFiveMinPeriod` (stored as Gson JSON in Android).
public struct SleepFiveMinPeriod: Equatable, Sendable, Codable {
    public var startTime: Int64
    public var endTime: Int64
    public var heartRate: Float
    public var maxHeartRate: Int
    public var minHeartRate: Int
    public var hrv: Float
    public var skinTemp: Float
    public var maxSkinTemp: Float
    public var minSkinTemp: Float
    public var bodyPower: Float
    public var solarPower: Float
    public var peakTemp: Float
    public var activeCalories: Int
    public var minsInPeriod: Int
    public var bmrCalories: Int
    public var caseTemp: Float
    public var minCaseTemp: Float
    public var maxCaseTemp: Float
    public var fiveMinsInHour: Int
    public var restlessMinutes: Int
    public var sleepType: SleepType

    public init(
        startTime: Int64 = 0, endTime: Int64 = 0, heartRate: Float = 0,
        maxHeartRate: Int = 0, minHeartRate: Int = 0, hrv: Float = 0,
        skinTemp: Float = 0, maxSkinTemp: Float = 0, minSkinTemp: Float = 0,
        bodyPower: Float = 0, solarPower: Float = 0, peakTemp: Float = 0,
        activeCalories: Int = 0, minsInPeriod: Int = 0, bmrCalories: Int = 0,
        caseTemp: Float = 0, minCaseTemp: Float = 0, maxCaseTemp: Float = 0,
        fiveMinsInHour: Int = 0, restlessMinutes: Int = 0, sleepType: SleepType = .awake
    ) {
        self.startTime = startTime
        self.endTime = endTime
        self.heartRate = heartRate
        self.maxHeartRate = maxHeartRate
        self.minHeartRate = minHeartRate
        self.hrv = hrv
        self.skinTemp = skinTemp
        self.maxSkinTemp = maxSkinTemp
        self.minSkinTemp = minSkinTemp
        self.bodyPower = bodyPower
        self.solarPower = solarPower
        self.peakTemp = peakTemp
        self.activeCalories = activeCalories
        self.minsInPeriod = minsInPeriod
        self.bmrCalories = bmrCalories
        self.caseTemp = caseTemp
        self.minCaseTemp = minCaseTemp
        self.maxCaseTemp = maxCaseTemp
        self.fiveMinsInHour = fiveMinsInHour
        self.restlessMinutes = restlessMinutes
        self.sleepType = sleepType
    }
}

/// GPS position, embedded in `UserActivitySession.gpsPositions` JSON.
/// Ported from `shared/data/models/GPSPosition`.
public struct GPSPosition: Equatable, Sendable, Codable {
    public var longitude: Double
    public var latitude: Double
    public var altitude: Double
    public var speed: Double
    public var timestamp: Int64

    public init(longitude: Double = 0, latitude: Double = 0, altitude: Double = 0,
                speed: Double = 0, timestamp: Int64 = 0) {
        self.longitude = longitude
        self.latitude = latitude
        self.altitude = altitude
        self.speed = speed
        self.timestamp = timestamp
    }
}

/// Heart-rate sample, embedded in `UserActivitySession.heartRates` JSON.
public struct HeartRate: Equatable, Sendable, Codable {
    public var beatsPerMinute: Int
    public var startTime: Int64
    public var endTime: Int64

    public init(beatsPerMinute: Int = 0, startTime: Int64 = 0, endTime: Int64 = 0) {
        self.beatsPerMinute = beatsPerMinute
        self.startTime = startTime
        self.endTime = endTime
    }
}

/// Running split, embedded in `UserActivitySession.splits` JSON.
/// Ported from `shared/data/models/RunningSplit`.
public struct RunningSplit: Equatable, Sendable, Codable {
    public var distance: Double
    public var period: Int64

    public init(distance: Double = 0, period: Int64 = 1000) {
        self.distance = distance
        self.period = period
    }
}

// MARK: - Log records (pulled from the watch, flagged for send)

/// Ported from `logPeriodsFormatters.WalkingLog` / Room table `WalkingLog`.
public struct WalkingLogRecord: Codable, Equatable, Sendable, FetchableRecord, MutablePersistableRecord {
    public static let databaseTableName = "WalkingLog"

    public var startTime: Int64
    public var steps: Int
    public var distance: Double
    public var endTime: Int64
    public var heartRate: Float
    public var bodyPower: Float
    public var solarPower: Float
    public var skinTemp: Float
    public var maxSkinTemp: Float
    public var minSkinTemp: Float
    public var caseTemp: Float
    public var maxCaseTemp: Float
    public var minCaseTemp: Float
    public var activeCalories: Int
    public var hrv: Float
    public var shouldSend: Bool
    public var bmrCalories: Int
    public var minHeartRate: Int
    public var maxHeartRate: Int
    public var email: String
    /// In-memory only — the Android model has this property but the Room
    /// table has no column for it (`@Ignore` equivalent; excluded from
    /// `CodingKeys` so GRDB does not persist it).
    public var minsInPeriod: Int = 0

    enum CodingKeys: String, CodingKey {
        case startTime, steps, distance, endTime, heartRate, bodyPower, solarPower
        case skinTemp, maxSkinTemp, minSkinTemp, caseTemp, maxCaseTemp, minCaseTemp
        case activeCalories, hrv, shouldSend, bmrCalories, minHeartRate, maxHeartRate, email
    }

    public init(
        startTime: Int64 = 0, steps: Int = 0, distance: Double = 0, endTime: Int64 = 0,
        heartRate: Float = 0, bodyPower: Float = 0, solarPower: Float = 0,
        skinTemp: Float = 0, maxSkinTemp: Float = 0, minSkinTemp: Float = 0,
        caseTemp: Float = 0, maxCaseTemp: Float = 0, minCaseTemp: Float = 0,
        activeCalories: Int = 0, hrv: Float = 0, shouldSend: Bool = true,
        bmrCalories: Int = 0, minHeartRate: Int = 0, maxHeartRate: Int = 0, email: String = "",
        minsInPeriod: Int = 0
    ) {
        self.startTime = startTime
        self.steps = steps
        self.distance = distance
        self.endTime = endTime
        self.heartRate = heartRate
        self.bodyPower = bodyPower
        self.solarPower = solarPower
        self.skinTemp = skinTemp
        self.maxSkinTemp = maxSkinTemp
        self.minSkinTemp = minSkinTemp
        self.caseTemp = caseTemp
        self.maxCaseTemp = maxCaseTemp
        self.minCaseTemp = minCaseTemp
        self.activeCalories = activeCalories
        self.hrv = hrv
        self.shouldSend = shouldSend
        self.bmrCalories = bmrCalories
        self.minHeartRate = minHeartRate
        self.maxHeartRate = maxHeartRate
        self.email = email
        self.minsInPeriod = minsInPeriod
    }
}

/// Ported from `logPeriodsFormatters.SleepLog` / Room table `SleepLog`.
public struct SleepLogRecord: Codable, Equatable, Sendable, FetchableRecord, MutablePersistableRecord {
    public static let databaseTableName = "SleepLog"

    public var startTime: Int64
    public var endTime: Int64
    public var heartRate: Float
    public var bodyPower: Float
    public var solarPower: Float
    public var skinTemp: Float
    public var maxSkinTemp: Float
    public var minSkinTemp: Float
    public var caseTemp: Float
    public var maxCaseTemp: Float
    public var minCaseTemp: Float
    public var activeCalories: Int
    public var sleepType: SleepType
    public var hrv: Float
    public var shouldSend: Bool
    public var bmrCalories: Int
    public var minHeartRate: Int
    public var maxHeartRate: Int
    public var email: String
    public var minsInPeriod: Int

    public init(
        startTime: Int64 = 0, endTime: Int64 = 0, heartRate: Float = 0,
        bodyPower: Float = 0, solarPower: Float = 0, skinTemp: Float = 0,
        maxSkinTemp: Float = 0, minSkinTemp: Float = 0, caseTemp: Float = 0,
        maxCaseTemp: Float = 0, minCaseTemp: Float = 0, activeCalories: Int = 0,
        sleepType: SleepType = .awake, hrv: Float = 0, shouldSend: Bool = true,
        bmrCalories: Int = 0, minHeartRate: Int = 0, maxHeartRate: Int = 0,
        email: String = "", minsInPeriod: Int = 0
    ) {
        self.startTime = startTime
        self.endTime = endTime
        self.heartRate = heartRate
        self.bodyPower = bodyPower
        self.solarPower = solarPower
        self.skinTemp = skinTemp
        self.maxSkinTemp = maxSkinTemp
        self.minSkinTemp = minSkinTemp
        self.caseTemp = caseTemp
        self.maxCaseTemp = maxCaseTemp
        self.minCaseTemp = minCaseTemp
        self.activeCalories = activeCalories
        self.sleepType = sleepType
        self.hrv = hrv
        self.shouldSend = shouldSend
        self.bmrCalories = bmrCalories
        self.minHeartRate = minHeartRate
        self.maxHeartRate = maxHeartRate
        self.email = email
        self.minsInPeriod = minsInPeriod
    }
}

/// Ported from `logPeriodsFormatters.RestingLog` / Room table `RestingLog`.
/// (The Android model has `minsInPeriod` but the table has no such column.)
public struct RestingLogRecord: Codable, Equatable, Sendable, FetchableRecord, MutablePersistableRecord {
    public static let databaseTableName = "RestingLog"

    public var startTime: Int64
    public var endTime: Int64
    public var heartRate: Float
    public var bodyPower: Float
    public var solarPower: Float
    public var skinTemp: Float
    public var maxSkinTemp: Float
    public var minSkinTemp: Float
    public var caseTemp: Float
    public var maxCaseTemp: Float
    public var minCaseTemp: Float
    public var activeCalories: Int
    public var hrv: Float
    public var shouldSend: Bool
    public var bmrCalories: Int
    public var minHeartRate: Int
    public var maxHeartRate: Int
    public var email: String
    /// In-memory only (`@Ignore` equivalent — not a Room column).
    public var minsInPeriod: Int = 0

    enum CodingKeys: String, CodingKey {
        case startTime, endTime, heartRate, bodyPower, solarPower
        case skinTemp, maxSkinTemp, minSkinTemp, caseTemp, maxCaseTemp, minCaseTemp
        case activeCalories, hrv, shouldSend, bmrCalories, minHeartRate, maxHeartRate, email
    }

    public init(
        startTime: Int64 = 0, endTime: Int64 = 0, heartRate: Float = 0,
        bodyPower: Float = 0, solarPower: Float = 0, skinTemp: Float = 0,
        maxSkinTemp: Float = 0, minSkinTemp: Float = 0, caseTemp: Float = 0,
        maxCaseTemp: Float = 0, minCaseTemp: Float = 0, activeCalories: Int = 0,
        hrv: Float = 0, shouldSend: Bool = true, bmrCalories: Int = 0,
        minHeartRate: Int = 0, maxHeartRate: Int = 0, email: String = "",
        minsInPeriod: Int = 0
    ) {
        self.startTime = startTime
        self.endTime = endTime
        self.heartRate = heartRate
        self.bodyPower = bodyPower
        self.solarPower = solarPower
        self.skinTemp = skinTemp
        self.maxSkinTemp = maxSkinTemp
        self.minSkinTemp = minSkinTemp
        self.caseTemp = caseTemp
        self.maxCaseTemp = maxCaseTemp
        self.minCaseTemp = minCaseTemp
        self.activeCalories = activeCalories
        self.hrv = hrv
        self.shouldSend = shouldSend
        self.bmrCalories = bmrCalories
        self.minHeartRate = minHeartRate
        self.maxHeartRate = maxHeartRate
        self.email = email
        self.minsInPeriod = minsInPeriod
    }
}

// MARK: - Hour period records

/// Ported from `shared/data/models/WalkingHourPeriod` / Room table
/// `WalkingHourPeriod` (PK startTime).
public struct WalkingHourPeriodRecord: Codable, Equatable, Sendable, FetchableRecord, MutablePersistableRecord {
    public static let databaseTableName = "WalkingHourPeriod"

    public var startTime: Int64
    public var endTime: Int64
    public var hourInDay: Int
    public var maxHeartRate: Int
    public var minHeartRate: Int
    public var heartRate: Float
    public var skinTemp: Float
    public var maxSkinTemp: Float
    public var minSkinTemp: Float
    public var bodyPower: Float
    public var solarPower: Float
    public var hrv: Float
    public var peakTemp: Float
    public var activeCalories: Int
    public var steps: Int
    public var distance: Double
    public var lastUpdated: Int64
    public var minsInPeriod: Int
    public var bmrCalories: Int
    public var caseTemp: Float
    public var minCaseTemp: Float
    public var maxCaseTemp: Float

    public init(
        startTime: Int64 = 0, endTime: Int64 = 0, hourInDay: Int = 0,
        maxHeartRate: Int = 0, minHeartRate: Int = 0, heartRate: Float = 0,
        skinTemp: Float = 0, maxSkinTemp: Float = 0, minSkinTemp: Float = 0,
        bodyPower: Float = 0, solarPower: Float = 0, hrv: Float = 0,
        peakTemp: Float = 0, activeCalories: Int = 0, steps: Int = 0,
        distance: Double = 0, lastUpdated: Int64 = 0, minsInPeriod: Int = 0,
        bmrCalories: Int = 0, caseTemp: Float = 0, minCaseTemp: Float = 0,
        maxCaseTemp: Float = 0
    ) {
        self.startTime = startTime
        self.endTime = endTime
        self.hourInDay = hourInDay
        self.maxHeartRate = maxHeartRate
        self.minHeartRate = minHeartRate
        self.heartRate = heartRate
        self.skinTemp = skinTemp
        self.maxSkinTemp = maxSkinTemp
        self.minSkinTemp = minSkinTemp
        self.bodyPower = bodyPower
        self.solarPower = solarPower
        self.hrv = hrv
        self.peakTemp = peakTemp
        self.activeCalories = activeCalories
        self.steps = steps
        self.distance = distance
        self.lastUpdated = lastUpdated
        self.minsInPeriod = minsInPeriod
        self.bmrCalories = bmrCalories
        self.caseTemp = caseTemp
        self.minCaseTemp = minCaseTemp
        self.maxCaseTemp = maxCaseTemp
    }
}

/// Ported from `RestingHourPeriod` / Room table `RestingHourPeriod`.
public struct RestingHourPeriodRecord: Codable, Equatable, Sendable, FetchableRecord, MutablePersistableRecord {
    public static let databaseTableName = "RestingHourPeriod"

    public var startTime: Int64
    public var endTime: Int64
    public var hourInDay: Int
    public var heartRate: Float
    public var maxHeartRate: Int
    public var minHeartRate: Int
    public var hrv: Float
    public var skinTemp: Float
    public var maxSkinTemp: Float
    public var minSkinTemp: Float
    public var bodyPower: Float
    public var solarPower: Float
    public var peakTemp: Float
    public var activeCalories: Int
    public var lastUpdated: Int64
    public var minsInPeriod: Int
    public var bmrCalories: Int
    public var caseTemp: Float
    public var minCaseTemp: Float
    public var maxCaseTemp: Float

    public init(
        startTime: Int64 = 0, endTime: Int64 = 0, hourInDay: Int = 0,
        heartRate: Float = 0, maxHeartRate: Int = 0, minHeartRate: Int = 0,
        hrv: Float = 0, skinTemp: Float = 0, maxSkinTemp: Float = 0,
        minSkinTemp: Float = 0, bodyPower: Float = 0, solarPower: Float = 0,
        peakTemp: Float = 0, activeCalories: Int = 0, lastUpdated: Int64 = 0,
        minsInPeriod: Int = 0, bmrCalories: Int = 0, caseTemp: Float = 0,
        minCaseTemp: Float = 0, maxCaseTemp: Float = 0
    ) {
        self.startTime = startTime
        self.endTime = endTime
        self.hourInDay = hourInDay
        self.heartRate = heartRate
        self.maxHeartRate = maxHeartRate
        self.minHeartRate = minHeartRate
        self.hrv = hrv
        self.skinTemp = skinTemp
        self.maxSkinTemp = maxSkinTemp
        self.minSkinTemp = minSkinTemp
        self.bodyPower = bodyPower
        self.solarPower = solarPower
        self.peakTemp = peakTemp
        self.activeCalories = activeCalories
        self.lastUpdated = lastUpdated
        self.minsInPeriod = minsInPeriod
        self.bmrCalories = bmrCalories
        self.caseTemp = caseTemp
        self.minCaseTemp = minCaseTemp
        self.maxCaseTemp = maxCaseTemp
    }
}

/// Ported from `SleepHourPeriod` / Room table `SleepHourPeriod`.
/// `sleepFiveMins` is the JSON array of `SleepFiveMinPeriod` (Gson on
/// Android, Codable JSON here); `sleepType` is the uppercase enum name.
public struct SleepHourPeriodRecord: Codable, Equatable, Sendable, FetchableRecord, MutablePersistableRecord {
    public static let databaseTableName = "SleepHourPeriod"

    public var startTime: Int64
    public var endTime: Int64
    public var heartRate: Float
    public var maxHeartRate: Int
    public var minHeartRate: Int
    public var skinTemp: Float
    public var maxSkinTemp: Float
    public var minSkinTemp: Float
    public var hrv: Float
    public var bodyPower: Float
    public var solarPower: Float
    public var peakTemp: Float
    public var activeCalories: Int
    public var hourInDay: Int
    public var restlessMinutes: Int
    public var sleepFiveMins: String        // JSON [SleepFiveMinPeriod]
    public var sleepType: SleepType
    public var lastUpdated: Int64
    public var minsInPeriod: Int
    public var bmrCalories: Int
    public var caseTemp: Float
    public var minCaseTemp: Float
    public var maxCaseTemp: Float

    public init(
        startTime: Int64 = 0, endTime: Int64 = 0, heartRate: Float = 0,
        maxHeartRate: Int = 0, minHeartRate: Int = 0, skinTemp: Float = 0,
        maxSkinTemp: Float = 0, minSkinTemp: Float = 0, hrv: Float = 0,
        bodyPower: Float = 0, solarPower: Float = 0, peakTemp: Float = 0,
        activeCalories: Int = 0, hourInDay: Int = 0, restlessMinutes: Int = 0,
        sleepFiveMins: String = "[]", sleepType: SleepType = .awake,
        lastUpdated: Int64 = 0, minsInPeriod: Int = 0, bmrCalories: Int = 0,
        caseTemp: Float = 0, minCaseTemp: Float = 0, maxCaseTemp: Float = 0
    ) {
        self.startTime = startTime
        self.endTime = endTime
        self.heartRate = heartRate
        self.maxHeartRate = maxHeartRate
        self.minHeartRate = minHeartRate
        self.skinTemp = skinTemp
        self.maxSkinTemp = maxSkinTemp
        self.minSkinTemp = minSkinTemp
        self.hrv = hrv
        self.bodyPower = bodyPower
        self.solarPower = solarPower
        self.peakTemp = peakTemp
        self.activeCalories = activeCalories
        self.hourInDay = hourInDay
        self.restlessMinutes = restlessMinutes
        self.sleepFiveMins = sleepFiveMins
        self.sleepType = sleepType
        self.lastUpdated = lastUpdated
        self.minsInPeriod = minsInPeriod
        self.bmrCalories = bmrCalories
        self.caseTemp = caseTemp
        self.minCaseTemp = minCaseTemp
        self.maxCaseTemp = maxCaseTemp
    }

    /// Decoded five-minute buckets (Android's `ActivityHourDataConverter.toSleepMins`).
    public var fiveMinPeriods: [SleepFiveMinPeriod] {
        guard let data = sleepFiveMins.data(using: .utf8),
              let periods = try? JSONDecoder().decode([SleepFiveMinPeriod].self, from: data) else {
            return []
        }
        return periods
    }

    public static func encodeFiveMins(_ periods: [SleepFiveMinPeriod]) -> String {
        guard let data = try? JSONEncoder().encode(periods) else { return "[]" }
        return String(data: data, encoding: .utf8) ?? "[]"
    }
}

// MARK: - Activity sessions

/// Ported from `shared/data/models/UserActivitySession` / Room table
/// `UserActivitySession` (String PK, JSON columns for splits/GPS/heart rates).
public struct UserActivitySessionRecord: Codable, Equatable, Sendable, FetchableRecord, MutablePersistableRecord {
    public static let databaseTableName = "UserActivitySession"

    public var id: String
    public var name: String
    public var activityType: String          // uppercase enum name
    public var locationName: String
    public var distance: Double
    public var steps: Int
    public var startTime: Int64
    public var endTime: Int64
    public var pace: Float
    public var activeCalories: Int
    public var bmrCalories: Int
    public var splits: String                 // JSON [RunningSplit]
    public var gpsPositions: String           // JSON [GPSPosition]
    public var heartRates: String             // JSON [HeartRate]
    public var notes: String
    public var shouldSend: Bool
    public var email: String

    public init(
        id: String = UUID().uuidString, name: String = "", activityType: String = "UNKNOWN",
        locationName: String = "", distance: Double = 0, steps: Int = 0,
        startTime: Int64 = 0, endTime: Int64 = 0, pace: Float = 0,
        activeCalories: Int = 0, bmrCalories: Int = 0, splits: String = "[]",
        gpsPositions: String = "[]", heartRates: String = "[]", notes: String = "",
        shouldSend: Bool = true, email: String = ""
    ) {
        self.id = id
        self.name = name
        self.activityType = activityType
        self.locationName = locationName
        self.distance = distance
        self.steps = steps
        self.startTime = startTime
        self.endTime = endTime
        self.pace = pace
        self.activeCalories = activeCalories
        self.bmrCalories = bmrCalories
        self.splits = splits
        self.gpsPositions = gpsPositions
        self.heartRates = heartRates
        self.notes = notes
        self.shouldSend = shouldSend
        self.email = email
    }

    public var runningSplits: [RunningSplit] {
        guard let data = splits.data(using: .utf8),
              let value = try? JSONDecoder().decode([RunningSplit].self, from: data) else { return [] }
        return value
    }

    public var positions: [GPSPosition] {
        guard let data = gpsPositions.data(using: .utf8),
              let value = try? JSONDecoder().decode([GPSPosition].self, from: data) else { return [] }
        return value
    }

    public var rates: [HeartRate] {
        guard let data = heartRates.data(using: .utf8),
              let value = try? JSONDecoder().decode([HeartRate].self, from: data) else { return [] }
        return value
    }
}

/// Ported from `shared/data/models/UserActivityDate` / Room table
/// `UserActivityDate` (single startTime column).
public struct UserActivityDateRecord: Codable, Equatable, Sendable, FetchableRecord, MutablePersistableRecord {
    public static let databaseTableName = "UserActivityDate"

    public var startTime: Int64

    public init(startTime: Int64 = 0) {
        self.startTime = startTime
    }
}
