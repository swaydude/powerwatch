import Foundation
import GRDB

// Port of the Android Room database (`shared/data/db/RoomDB.java` + DAOs).
// Schema uses Room's column names verbatim; user-facing models are the
// `Models.swift` structs, mapped to/from the flattened rows here.
//
// Conventions kept from Android:
// - epoch-millisecond timestamps (INTEGER)
// - single-row tables (User, UpdateInfo) pinned to uid = 0
// - writes are INSERT OR REPLACE upserts
// - range queries are half-open: startTime >= low AND startTime < high
// - SleepType stored as the uppercase enum name (SleepTypeTypeConverter)
// - the cloud-only PasswordCredentials table is intentionally NOT ported
//   (offline build: no auth, no network).

// MARK: - User row

/// Room table `User` — accountSettings flattened to columns, gender stored
/// as the lowercase enum name. Pinned to uid = 0.
public struct UserRow: Codable, Equatable, Sendable, FetchableRecord, MutablePersistableRecord {
    public static let databaseTableName = "User"

    public var uid: Int64
    public var email: String
    public var password: String
    public var name: String
    public var age: Int
    public var height: Int
    public var weight: Float
    public var gender: String
    public var language: String
    public var timeFormatType: Int
    public var unitType: String
    public var enabled: Bool
    public var shouldSync: Bool

    public init(user: User, uid: Int64 = 0) {
        self.uid = uid
        self.email = user.email
        self.password = user.password
        self.name = user.name
        self.age = user.age
        self.height = user.height
        self.weight = user.weight
        self.gender = user.gender.rawValue
        self.language = user.accountSettings.language
        self.timeFormatType = user.accountSettings.timeFormatType
        self.unitType = user.accountSettings.unitType.rawValue
        self.enabled = user.enabled
        self.shouldSync = user.shouldSync
    }

    public func toModel() -> User {
        User(
            uid: uid, enabled: enabled, name: name, email: email, password: password,
            age: age, height: height, weight: weight,
            gender: Gender(rawValue: gender) ?? .male,
            shouldSync: shouldSync,
            accountSettings: UserAccountSettings(
                language: language,
                timeFormatType: timeFormatType,
                unitType: UnitType(rawValue: unitType) ?? .metric
            )
        )
    }
}

// MARK: - Device row

/// Room table `Device`.
public struct DeviceRow: Codable, Equatable, Sendable, FetchableRecord, MutablePersistableRecord {
    public static let databaseTableName = "Device"

    public var uid: Int64
    public var pid: Int
    public var serialNumber: String
    public var productName: String
    public var firmwareVersion: String
    public var bluetoothAddress: String
    public var callNotification: Bool
    public var messageNotification: Bool
    public var alarmNotification: Bool
    public var activityGoalNotification: Bool
    public var shouldSync: Bool?

    public init(device: Device, uid: Int64 = 0) {
        self.uid = uid
        self.pid = device.pid
        self.serialNumber = device.serialNumber
        self.productName = device.productName
        self.firmwareVersion = device.firmwareVersion
        self.bluetoothAddress = device.bluetoothAddress
        self.callNotification = device.callNotification
        self.messageNotification = device.messageNotification
        self.alarmNotification = device.alarmNotification
        self.activityGoalNotification = device.activityGoalNotification
        self.shouldSync = device.shouldSync
    }

    public func toModel() -> Device {
        Device(
            uid: uid, pid: pid, productName: productName, serialNumber: serialNumber,
            bluetoothAddress: bluetoothAddress, firmwareVersion: firmwareVersion,
            callNotification: callNotification, messageNotification: messageNotification,
            alarmNotification: alarmNotification,
            activityGoalNotification: activityGoalNotification, shouldSync: shouldSync
        )
    }
}

// MARK: - GoalConfiguration row

/// Room table `GoalConfiguration`.
public struct GoalConfigurationRow: Codable, Equatable, Sendable, FetchableRecord, MutablePersistableRecord {
    public static let databaseTableName = "GoalConfiguration"

    public var id: Int64
    public var steps: Int
    public var calories: Int
    public var sleep: Int
    public var power: Int
    public var distance: Float
    public var createdAt: Int64
    public var shouldSync: Bool

    public init(goal: GoalConfiguration) {
        self.id = goal.id
        self.steps = goal.steps
        self.calories = goal.calories
        self.sleep = goal.sleep
        self.power = goal.power
        self.distance = goal.distance
        self.createdAt = goal.createdAt
        self.shouldSync = goal.shouldSync
    }

    public func toModel() -> GoalConfiguration {
        GoalConfiguration(
            id: id, steps: steps, calories: calories, sleep: sleep, power: power,
            distance: distance, createdAt: createdAt, shouldSync: shouldSync
        )
    }
}

// MARK: - DefaultPhoneWatch / UpdateInfo rows

/// Room table `DefaultPhoneWatch`.
public struct DefaultPhoneWatchRow: Codable, Equatable, Sendable, FetchableRecord, MutablePersistableRecord {
    public static let databaseTableName = "DefaultPhoneWatch"

    public var uid: Int64
    public var serialNumber: String
    public var bluetoothAddress: String

    public init(_ watch: DefaultPhoneWatch) {
        self.uid = watch.uid
        self.serialNumber = watch.serialNumber
        self.bluetoothAddress = watch.bluetoothAddress
    }

    public func toModel() -> DefaultPhoneWatch {
        DefaultPhoneWatch(uid: uid, serialNumber: serialNumber, bluetoothAddress: bluetoothAddress)
    }
}

/// Room table `UpdateInfo` — a firmware-update descriptor pulled from the
/// cloud. The offline port never populates it, but the table exists for
/// schema parity.
public struct UpdateInfoRow: Codable, Equatable, Sendable, FetchableRecord, MutablePersistableRecord {
    public static let databaseTableName = "UpdateInfo"

    public var uid: Int64
    public var pid: Int
    public var releaseNotes: String
    public var language: String
    public var releaseVersion: String
    public var downloadUrl: String
    public var mandatory: Bool
    public var forced: Bool
    public var releaseDate: String?

    public init(uid: Int64 = 0, pid: Int = 0, releaseNotes: String = "", language: String = "en",
                releaseVersion: String = "", downloadUrl: String = "", mandatory: Bool = false,
                forced: Bool = false, releaseDate: String? = nil) {
        self.uid = uid
        self.pid = pid
        self.releaseNotes = releaseNotes
        self.language = language
        self.releaseVersion = releaseVersion
        self.downloadUrl = downloadUrl
        self.mandatory = mandatory
        self.forced = forced
        self.releaseDate = releaseDate
    }
}

// MARK: - Database

/// GRDB-backed port of `RoomDB`. All DAO operations run through the
/// `DatabaseWriter`; upserts mirror Android's `@Insert(onConflict = REPLACE)`.
public final class PowerWatchDatabase: Sendable {
    public let dbQueue: DatabaseQueue

    /// Opens (creating if needed) the database at `path`.
    public init(path: String? = nil) throws {
        if let path {
            self.dbQueue = try DatabaseQueue(path: path)
        } else {
            self.dbQueue = try DatabaseQueue()   // in-memory (tests)
        }
        try migrator.migrate(self.dbQueue)
    }

    public init(dbQueue: DatabaseQueue) throws {
        self.dbQueue = dbQueue
        try migrator.migrate(dbQueue)
    }

    /// v1 — Room's onCreate schema, verbatim column names/types.
    private var migrator: DatabaseMigrator {
        var migrator = DatabaseMigrator()
        migrator.registerMigration("v1-room-schema") { db in
            try db.execute(sql: """
                CREATE TABLE User (
                    uid INTEGER PRIMARY KEY,
                    email TEXT NOT NULL,
                    password TEXT NOT NULL,
                    name TEXT NOT NULL,
                    age INTEGER NOT NULL,
                    height INTEGER NOT NULL,
                    weight REAL NOT NULL,
                    gender TEXT NOT NULL,
                    language TEXT NOT NULL,
                    timeFormatType INTEGER NOT NULL,
                    unitType TEXT NOT NULL,
                    enabled INTEGER NOT NULL,
                    shouldSync INTEGER NOT NULL
                )
                """)
            try db.execute(sql: """
                CREATE TABLE Device (
                    uid INTEGER PRIMARY KEY,
                    pid INTEGER NOT NULL,
                    serialNumber TEXT NOT NULL,
                    productName TEXT NOT NULL,
                    firmwareVersion TEXT NOT NULL,
                    bluetoothAddress TEXT NOT NULL,
                    callNotification INTEGER NOT NULL,
                    messageNotification INTEGER NOT NULL,
                    alarmNotification INTEGER NOT NULL,
                    activityGoalNotification INTEGER NOT NULL,
                    shouldSync INTEGER
                )
                """)
            try db.execute(sql: """
                CREATE TABLE DefaultPhoneWatch (
                    uid INTEGER PRIMARY KEY,
                    serialNumber TEXT NOT NULL,
                    bluetoothAddress TEXT NOT NULL
                )
                """)
            try db.execute(sql: """
                CREATE TABLE GoalConfiguration (
                    id INTEGER PRIMARY KEY,
                    steps INTEGER NOT NULL,
                    calories INTEGER NOT NULL,
                    sleep INTEGER NOT NULL,
                    power INTEGER NOT NULL,
                    distance REAL NOT NULL,
                    createdAt INTEGER NOT NULL,
                    shouldSync INTEGER NOT NULL
                )
                """)
            try db.execute(sql: """
                CREATE TABLE UpdateInfo (
                    uid INTEGER PRIMARY KEY,
                    pid INTEGER NOT NULL,
                    releaseNotes TEXT NOT NULL,
                    language TEXT NOT NULL,
                    releaseVersion TEXT NOT NULL,
                    downloadUrl TEXT NOT NULL,
                    mandatory INTEGER NOT NULL,
                    forced INTEGER NOT NULL,
                    releaseDate TEXT
                )
                """)
            try db.execute(sql: """
                CREATE TABLE WalkingLog (
                    startTime INTEGER PRIMARY KEY,
                    steps INTEGER NOT NULL,
                    distance REAL NOT NULL,
                    endTime INTEGER NOT NULL,
                    heartRate REAL NOT NULL,
                    bodyPower REAL NOT NULL,
                    solarPower REAL NOT NULL,
                    skinTemp REAL NOT NULL,
                    maxSkinTemp REAL NOT NULL,
                    minSkinTemp REAL NOT NULL,
                    caseTemp REAL NOT NULL,
                    maxCaseTemp REAL NOT NULL,
                    minCaseTemp REAL NOT NULL,
                    activeCalories INTEGER NOT NULL,
                    hrv REAL NOT NULL,
                    shouldSend INTEGER NOT NULL,
                    bmrCalories INTEGER NOT NULL,
                    minHeartRate INTEGER NOT NULL,
                    maxHeartRate INTEGER NOT NULL,
                    email TEXT NOT NULL
                )
                """)
            try db.execute(sql: """
                CREATE TABLE RestingLog (
                    startTime INTEGER PRIMARY KEY,
                    endTime INTEGER NOT NULL,
                    heartRate REAL NOT NULL,
                    bodyPower REAL NOT NULL,
                    solarPower REAL NOT NULL,
                    skinTemp REAL NOT NULL,
                    maxSkinTemp REAL NOT NULL,
                    minSkinTemp REAL NOT NULL,
                    caseTemp REAL NOT NULL,
                    maxCaseTemp REAL NOT NULL,
                    minCaseTemp REAL NOT NULL,
                    activeCalories INTEGER NOT NULL,
                    hrv REAL NOT NULL,
                    shouldSend INTEGER NOT NULL,
                    bmrCalories INTEGER NOT NULL,
                    minHeartRate INTEGER NOT NULL,
                    maxHeartRate INTEGER NOT NULL,
                    email TEXT NOT NULL
                )
                """)
            try db.execute(sql: """
                CREATE TABLE SleepLog (
                    startTime INTEGER PRIMARY KEY,
                    endTime INTEGER NOT NULL,
                    heartRate REAL NOT NULL,
                    bodyPower REAL NOT NULL,
                    solarPower REAL NOT NULL,
                    skinTemp REAL NOT NULL,
                    maxSkinTemp REAL NOT NULL,
                    minSkinTemp REAL NOT NULL,
                    caseTemp REAL NOT NULL,
                    maxCaseTemp REAL NOT NULL,
                    minCaseTemp REAL NOT NULL,
                    activeCalories INTEGER NOT NULL,
                    sleepType TEXT NOT NULL,
                    hrv REAL NOT NULL,
                    shouldSend INTEGER NOT NULL,
                    bmrCalories INTEGER NOT NULL,
                    minHeartRate INTEGER NOT NULL,
                    maxHeartRate INTEGER NOT NULL,
                    email TEXT NOT NULL,
                    minsInPeriod INTEGER NOT NULL
                )
                """)
            try db.execute(sql: """
                CREATE TABLE WalkingHourPeriod (
                    startTime INTEGER PRIMARY KEY,
                    endTime INTEGER NOT NULL,
                    hourInDay INTEGER NOT NULL,
                    maxHeartRate INTEGER NOT NULL,
                    minHeartRate INTEGER NOT NULL,
                    heartRate REAL NOT NULL,
                    skinTemp REAL NOT NULL,
                    maxSkinTemp REAL NOT NULL,
                    minSkinTemp REAL NOT NULL,
                    bodyPower REAL NOT NULL,
                    solarPower REAL NOT NULL,
                    hrv REAL NOT NULL,
                    peakTemp REAL NOT NULL,
                    activeCalories INTEGER NOT NULL,
                    steps INTEGER NOT NULL,
                    distance REAL NOT NULL,
                    lastUpdated INTEGER NOT NULL,
                    minsInPeriod INTEGER NOT NULL,
                    bmrCalories INTEGER NOT NULL,
                    caseTemp REAL NOT NULL,
                    minCaseTemp REAL NOT NULL,
                    maxCaseTemp REAL NOT NULL
                )
                """)
            try db.execute(sql: """
                CREATE TABLE RestingHourPeriod (
                    startTime INTEGER PRIMARY KEY,
                    endTime INTEGER NOT NULL,
                    hourInDay INTEGER NOT NULL,
                    heartRate REAL NOT NULL,
                    maxHeartRate INTEGER NOT NULL,
                    minHeartRate INTEGER NOT NULL,
                    hrv REAL NOT NULL,
                    skinTemp REAL NOT NULL,
                    maxSkinTemp REAL NOT NULL,
                    minSkinTemp REAL NOT NULL,
                    bodyPower REAL NOT NULL,
                    solarPower REAL NOT NULL,
                    peakTemp REAL NOT NULL,
                    activeCalories INTEGER NOT NULL,
                    lastUpdated INTEGER NOT NULL,
                    minsInPeriod INTEGER NOT NULL,
                    bmrCalories INTEGER NOT NULL,
                    caseTemp REAL NOT NULL,
                    minCaseTemp REAL NOT NULL,
                    maxCaseTemp REAL NOT NULL
                )
                """)
            try db.execute(sql: """
                CREATE TABLE SleepHourPeriod (
                    startTime INTEGER PRIMARY KEY,
                    endTime INTEGER NOT NULL,
                    heartRate REAL NOT NULL,
                    maxHeartRate INTEGER NOT NULL,
                    minHeartRate INTEGER NOT NULL,
                    skinTemp REAL NOT NULL,
                    maxSkinTemp REAL NOT NULL,
                    minSkinTemp REAL NOT NULL,
                    hrv REAL NOT NULL,
                    bodyPower REAL NOT NULL,
                    solarPower REAL NOT NULL,
                    peakTemp REAL NOT NULL,
                    activeCalories INTEGER NOT NULL,
                    hourInDay INTEGER NOT NULL,
                    restlessMinutes INTEGER NOT NULL,
                    sleepFiveMins TEXT NOT NULL,
                    sleepType TEXT NOT NULL,
                    lastUpdated INTEGER NOT NULL,
                    minsInPeriod INTEGER NOT NULL,
                    bmrCalories INTEGER NOT NULL,
                    caseTemp REAL NOT NULL,
                    minCaseTemp REAL NOT NULL,
                    maxCaseTemp REAL NOT NULL
                )
                """)
            try db.execute(sql: """
                CREATE TABLE UserActivitySession (
                    id TEXT PRIMARY KEY NOT NULL,
                    name TEXT NOT NULL,
                    activityType TEXT NOT NULL,
                    locationName TEXT NOT NULL,
                    distance REAL NOT NULL,
                    steps INTEGER NOT NULL,
                    startTime INTEGER NOT NULL,
                    endTime INTEGER NOT NULL,
                    pace REAL NOT NULL,
                    activeCalories INTEGER NOT NULL,
                    bmrCalories INTEGER NOT NULL,
                    splits TEXT NOT NULL,
                    gpsPositions TEXT NOT NULL,
                    heartRates TEXT NOT NULL,
                    notes TEXT NOT NULL,
                    shouldSend INTEGER NOT NULL,
                    email TEXT NOT NULL
                )
                """)
            try db.execute(sql: """
                CREATE TABLE UserActivityDate (
                    startTime INTEGER PRIMARY KEY NOT NULL
                )
                """)
        }
        return migrator
    }
}

// MARK: - User DAO (UserDao.java)

extension PowerWatchDatabase {

    /// INSERT OR REPLACE — Android `UserDao.insertUser`.
    public func upsertUser(_ user: User) throws {
        _ = try dbQueue.write { db in
            var row = UserRow(user: user)
            try row.insert(db, onConflict: .replace)
        }
    }

    public func fetchUser() throws -> User? {
        try dbQueue.read { db in
            try UserRow.fetchOne(db, sql: "SELECT * FROM User WHERE uid = 0")?.toModel()
        }
    }

    public func deleteUser() throws {
        _ = try dbQueue.write { db in
            try db.execute(sql: "DELETE FROM User WHERE uid = 0")
        }
    }
}

// MARK: - Device DAO (DeviceDao.java)

extension PowerWatchDatabase {

    public func upsertDevice(_ device: Device) throws {
        _ = try dbQueue.write { db in
            var row = DeviceRow(device: device)
            try row.insert(db, onConflict: .replace)
        }
    }

    public func fetchDevice() throws -> Device? {
        try dbQueue.read { db in
            try DeviceRow.fetchOne(db, sql: "SELECT * FROM Device LIMIT 1")?.toModel()
        }
    }

    public func deleteDevice() throws {
        _ = try dbQueue.write { db in
            try db.execute(sql: "DELETE FROM Device")
        }
    }

    /// Android `DeviceDao.getShouldSyncDevice` (shouldSync = 1).
    public func fetchDeviceNeedingSync() throws -> Device? {
        try dbQueue.read { db in
            try DeviceRow.fetchOne(db, sql: "SELECT * FROM Device WHERE shouldSync = 1 LIMIT 1")?.toModel()
        }
    }
}

// MARK: - GoalConfiguration DAO (GoalConfigurationDao.java)

extension PowerWatchDatabase {

    public func upsertGoal(_ goal: GoalConfiguration) throws {
        _ = try dbQueue.write { db in
            var row = GoalConfigurationRow(goal: goal)
            try row.insert(db, onConflict: .replace)
        }
    }

    /// Latest goal by createdAt — Android `getGoalConfiguration` (max createdAt).
    public func fetchLatestGoal() throws -> GoalConfiguration? {
        try dbQueue.read { db in
            try GoalConfigurationRow
                .order(Column("createdAt").desc)
                .fetchOne(db)?
                .toModel()
        }
    }

    public func fetchAllGoals() throws -> [GoalConfiguration] {
        try dbQueue.read { db in
            try GoalConfigurationRow.order(Column("createdAt").desc).fetchAll(db).map { $0.toModel() }
        }
    }

    public func fetchUnsyncedGoals() throws -> [GoalConfiguration] {
        try dbQueue.read { db in
            try GoalConfigurationRow
                .filter(Column("shouldSync") == true)
                .fetchAll(db).map { $0.toModel() }
        }
    }

    public func deleteGoals() throws {
        _ = try dbQueue.write { db in
            try db.execute(sql: "DELETE FROM GoalConfiguration")
        }
    }
}

// MARK: - DefaultPhoneWatch / UpdateInfo DAOs

extension PowerWatchDatabase {

    public func upsertDefaultPhoneWatch(_ watch: DefaultPhoneWatch) throws {
        _ = try dbQueue.write { db in
            var row = DefaultPhoneWatchRow(watch)
            try row.insert(db, onConflict: .replace)
        }
    }

    public func fetchDefaultPhoneWatch() throws -> DefaultPhoneWatch? {
        try dbQueue.read { db in
            try DefaultPhoneWatchRow.fetchOne(db)?.toModel()
        }
    }

    public func upsertUpdateInfo(_ info: UpdateInfoRow) throws {
        _ = try dbQueue.write { db in
            var row = info
            try row.insert(db, onConflict: .replace)
        }
    }

    public func fetchUpdateInfo() throws -> UpdateInfoRow? {
        try dbQueue.read { db in
            try UpdateInfoRow.fetchOne(db, sql: "SELECT * FROM UpdateInfo WHERE uid = 0")
        }
    }
}
