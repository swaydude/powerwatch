import Foundation

/// Command payload encoders. Each function mirrors the `createPayload()` of the
/// corresponding Android command class; multi-byte fields are big-endian
/// unless noted.
public enum CommandPayloads {

    // MARK: Pairing session (no payload)

    public static func startPairing() -> [UInt8] { [] }
    public static func stopPairing() -> [UInt8] { [] }
    public static func startAmDTP() -> [UInt8] { [] }
    public static func stopAmDTP() -> [UInt8] { [] }

    // MARK: Clean commands (no payload)

    public static func cleanAllLogs() -> [UInt8] { [] }
    public static func cleanActivityLogs() -> [UInt8] { [] }
    public static func cleanBackgroundLogs() -> [UInt8] { [] }
    public static func cleanSleepLogs() -> [UInt8] { [] }
    public static func cleanRTLLogs() -> [UInt8] { [] }

    // MARK: User information (9002) — Gen2SendUserInformationCommand

    /// - Parameters:
    ///   - hourFormat: 24h flag (Android sends `!twelveHourFormat`)
    ///   - metricUnits: metrics-format flag
    ///   - unixSeconds: current wall-clock time
    ///   - utcOffsetMinutes: timezone offset in minutes
    public static func sendUserInformation(
        hourFormat: HourFormat,
        metricUnits: Bool,
        unixSeconds: UInt32,
        utcOffsetMinutes: Int16
    ) -> [UInt8] {
        var writer = ByteWriter()
        writer.write(hourFormat == .twentyFour ? 1 : 0)
        writer.write(metricUnits ? 1 : 0)
        writer.write(unixSeconds)
        writer.write(UInt16(bitPattern: utcOffsetMinutes))
        return writer.bytes
    }

    // MARK: Biometrics (9012) — Gen2SendBiometricsCommand

    public static func sendBiometrics(
        gender: Gender,
        age: UInt8,
        weightKg: Int16,
        heightCm: Int16
    ) -> [UInt8] {
        var writer = ByteWriter()
        writer.write(gender == .female ? 1 : 0)   // Android: !genderMale
        writer.write(age)
        writer.write(UInt16(bitPattern: weightKg))
        writer.write(UInt16(bitPattern: heightCm * 10))
        return writer.bytes
    }

    // MARK: Language (9004) — Gen2SendLanguageCommand

    public static func sendLanguage(_ locale: WatchLocale) -> [UInt8] {
        [UInt8(locale.rawValue)]
    }

    // MARK: Goals

    /// 9003 — Gen2SendStepsDistanceGoal
    public static func sendStepsDistanceGoal(steps: Int32, distance: Int32) -> [UInt8] {
        var writer = ByteWriter()
        writer.write(UInt32(bitPattern: steps))
        writer.write(UInt32(bitPattern: distance))
        return writer.bytes
    }

    /// 9013 — Gen2SendCaloriesSleepGoal. Sleep mirrors the Android
    /// `GoalConfiguration.sleep` field, stored in minutes.
    public static func sendCaloriesSleepGoal(calories: Int32, sleepMinutes: Int32) -> [UInt8] {
        var writer = ByteWriter()
        writer.write(UInt32(bitPattern: calories))
        writer.write(UInt32(bitPattern: sleepMinutes))
        return writer.bytes
    }

    // MARK: User prefs & goals in bulk (9022/9024)

    /// 9022 — Gen2SendUserPrefsAndGoalsCommand: watch data + user prefs +
    /// goals + language, 31 bytes big-endian (mirrors packWatchData →
    /// packUserPrefs → packGoals → packLanguageInfo).
    public static func sendUserPrefsAndGoals(
        hourFormat: HourFormat,
        metricUnits: Bool,
        unixSeconds: UInt32,
        utcOffsetMinutes: Int16,
        gender: Gender,
        age: UInt8,
        weightKg: Int16,
        heightCm: Int16,
        stepsGoal: Int32,
        distanceGoal: Int32,
        caloriesGoal: Int32,
        sleepGoalMinutes: Int32,
        locale: WatchLocale
    ) -> [UInt8] {
        var writer = ByteWriter()
        // packWatchData
        writer.write(hourFormat == .twentyFour ? 1 : 0)
        writer.write(metricUnits ? 1 : 0)
        writer.write(unixSeconds)
        writer.write(UInt16(bitPattern: utcOffsetMinutes))
        // packUserPrefs
        writer.write(gender == .female ? 1 : 0)
        writer.write(age)
        writer.write(UInt16(bitPattern: weightKg))
        writer.write(UInt16(bitPattern: heightCm * 10))
        // packGoals
        writer.write(UInt32(bitPattern: stepsGoal))
        writer.write(UInt32(bitPattern: distanceGoal))
        writer.write(UInt32(bitPattern: caloriesGoal))
        writer.write(UInt32(bitPattern: sleepGoalMinutes))
        // packLanguageInfo
        writer.write(UInt8(locale.rawValue))
        return writer.bytes
    }

    /// 9024 — Gen2SendUserPrefsAndGoalsCommandVer3: the 9022 payload plus a
    /// trailing sleep-time selection byte, 32 bytes.
    public static func sendUserPrefsAndGoalsVer3(
        hourFormat: HourFormat,
        metricUnits: Bool,
        unixSeconds: UInt32,
        utcOffsetMinutes: Int16,
        gender: Gender,
        age: UInt8,
        weightKg: Int16,
        heightCm: Int16,
        stepsGoal: Int32,
        distanceGoal: Int32,
        caloriesGoal: Int32,
        sleepGoalMinutes: Int32,
        locale: WatchLocale,
        sleepTimeSelection: UInt8
    ) -> [UInt8] {
        var payload = sendUserPrefsAndGoals(
            hourFormat: hourFormat, metricUnits: metricUnits, unixSeconds: unixSeconds,
            utcOffsetMinutes: utcOffsetMinutes, gender: gender, age: age, weightKg: weightKg,
            heightCm: heightCm, stepsGoal: stepsGoal, distanceGoal: distanceGoal,
            caloriesGoal: caloriesGoal, sleepGoalMinutes: sleepGoalMinutes, locale: locale)
        payload.append(sleepTimeSelection)
        return payload
    }

    // MARK: User location (9015)

    /// 9015 — Gen2SendUserLocationCommand: 16 bytes — unix seconds, latitude
    /// × 1e7, longitude × 1e7, altitude × 100, all big-endian.
    public static func sendUserLocation(
        unixSeconds: UInt32,
        latitude: Double,
        longitude: Double,
        altitude: Double
    ) -> [UInt8] {
        var writer = ByteWriter()
        writer.write(unixSeconds)
        writer.write(UInt32(bitPattern: Int32(latitude * 10_000_000)))
        writer.write(UInt32(bitPattern: Int32(longitude * 10_000_000)))
        writer.write(UInt32(bitPattern: Int32(altitude * 100)))
        return writer.bytes
    }
}
