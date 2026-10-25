import Foundation

/// Unit formatting that mirrors `shared/extensions/UserPrefsUtilsKt` and the
/// `UnitType`-driven helpers in the APK.
enum Formatters {
    // MARK: Distance

    static func distance(_ metres: Double, unit: UnitType, precision: Int = 2) -> String {
        switch unit {
        case .metric:
            return String(format: "%.\(precision)f km", metres / 1000.0)
        case .imperial:
            return String(format: "%.\(precision)f mi", metres / 1609.344)
        }
    }

    static func distanceValue(_ metres: Double, unit: UnitType) -> Double {
        unit == .metric ? metres / 1000.0 : metres / 1609.344
    }

    static func distanceUnit(_ unit: UnitType) -> String { unit == .metric ? "km" : "mi" }

    // MARK: Pace / speed

    /// `min/km` (metric) or `min/mi` (imperial), rendered `m'ss"`.
    static func pace(distance metres: Double, duration seconds: TimeInterval, unit: UnitType) -> String {
        guard metres > 0, seconds > 0 else { return "--" }
        let perUnit = seconds / (distanceValue(metres, unit: unit) == 0 ? 1 : distanceValue(metres, unit: unit))
        let minutes = Int(perUnit) / 60
        let secs = Int(perUnit) % 60
        return String(format: "%d'%02d\"", minutes, secs)
    }

    static func speed(distance metres: Double, duration seconds: TimeInterval, unit: UnitType) -> String {
        guard seconds > 0 else { return "0.0" }
        let hours = seconds / 3600
        return String(format: "%.1f", distanceValue(metres, unit: unit) / hours)
    }

    static func speedUnit(_ unit: UnitType) -> String { unit == .metric ? "km/h" : "mph" }

    // MARK: Temperature

    /// `caseTemp`/`skinTemp` arrive as ninths of a degree scaled by 4
    /// (`extractNumber(...)/4` in `Gen2BackgroundLogCommand`), which the decoder
    /// already applied. Only the unit conversion happens here.
    static func temperature(celsius: Double, unit: UnitType, precision: Int = 1) -> String {
        let value = unit == .metric ? celsius : celsius * 9 / 5 + 32
        return String(format: "%.\(precision)f°", value)
    }

    static func temperatureUnit(_ unit: UnitType) -> String { unit == .metric ? "C" : "F" }

    // MARK: Height / weight
    //
    // `utils/HeightConverter` and `utils/WeightConverter` are the only places the
    // unit system touches body metrics: Room keeps `User.height` in **cm** and
    // `User.weight` in **kg** — that is what `9012`/`9024` encode (height×10 = mm,
    // weight in kg) — and `PersonalSettingsVM` converts on the way to the screen via
    // `UserPrefsUtils.getValue(value, MetricsConvertType.HEIGHT/WEIGHT)`, which
    // returns the value plus its unit suffix. The factors are the APK's (`/2.54`,
    // `×2.2046`) rather than the exact ones, and so are the suffixes, which carry a
    // leading space (`UserPrefsUtilsKt.metricHeightUnit == " cm"`).

    /// cm → the number the screen shows (inches for an imperial user).
    static func heightValue(_ centimetres: Double, unit: UnitType) -> Double {
        unit == .metric ? centimetres : centimetres / 2.54
    }

    /// The inverse, i.e. what an imperial editor writes back to the model.
    static func centimetres(fromHeight value: Double, unit: UnitType) -> Double {
        unit == .metric ? value : value * 2.54
    }

    static func heightSuffix(_ unit: UnitType) -> String { unit == .metric ? " cm" : " in" }

    static func height(_ centimetres: Double, unit: UnitType) -> String {
        "\(Int(heightValue(centimetres, unit: unit).rounded()))" + heightSuffix(unit)
    }

    /// kg → the number the screen shows (pounds for an imperial user).
    static func weightValue(_ kilograms: Double, unit: UnitType) -> Double {
        unit == .metric ? kilograms : kilograms * 2.2046
    }

    static func kilograms(fromWeight value: Double, unit: UnitType) -> Double {
        unit == .metric ? value : value / 2.2046
    }

    static func weightSuffix(_ unit: UnitType) -> String { unit == .metric ? " kg" : " lb" }

    static func weight(_ kilograms: Double, unit: UnitType) -> String {
        "\(Int(weightValue(kilograms, unit: unit).rounded()))" + weightSuffix(unit)
    }

    /// `UserPrefsUtils.minUnitValue`/`maxUnitValue`, expressed in the **display**
    /// unit: `UserPrefsUtilsKt` has height 100/270 cm and 40/330 in, weight 29/150 kg
    /// and 65/330 lb. The 150 kg ceiling and the 40–330 inch range are the APK's.
    static func heightRange(_ unit: UnitType) -> ClosedRange<Double> {
        unit == .metric ? 100...270 : 40...330
    }

    static func weightRange(_ unit: UnitType) -> ClosedRange<Double> {
        unit == .metric ? 29...150 : 65...330
    }

    // MARK: Power

    /// `UserPrefsUtilsKt.powerUnit == " µWh"`. Generation and consumption are both
    /// reported in micro-watt-hours; the Dashboard shows "Total Generation" and
    /// "Consumed Power".
    static func power(_ microWattHours: Int) -> String {
        let formatter = NumberFormatter()
        formatter.numberStyle = .decimal
        formatter.groupingSeparator = " "
        formatter.maximumFractionDigits = 0
        let text = formatter.string(from: NSNumber(value: microWattHours)) ?? "\(microWattHours)"
        return text + " µWh"
    }

    static func powerValue(_ microWattHours: Int) -> String {
        let formatter = NumberFormatter()
        formatter.numberStyle = .decimal
        formatter.groupingSeparator = " "
        formatter.maximumFractionDigits = 0
        return formatter.string(from: NSNumber(value: microWattHours)) ?? "\(microWattHours)"
    }

    static let powerUnit = " µWh"

    // MARK: Scalars

    static func count(_ value: Int) -> String {
        let formatter = NumberFormatter()
        formatter.numberStyle = .decimal
        formatter.groupingSeparator = " "
        return formatter.string(from: NSNumber(value: value)) ?? "\(value)"
    }

    static func calories(_ kilocalories: Int) -> String { "\(count(kilocalories)) kcal" }

    // MARK: Time

    static func clock(_ date: Date, format: HourFormat) -> String {
        let formatter = DateFormatter()
        formatter.locale = Locale(identifier: "en_US_POSIX")
        formatter.dateFormat = format == .twentyFour ? "HH:mm" : "h:mm a"
        return formatter.string(from: date)
    }

    static func dayLabel(_ date: Date) -> String {
        let calendar = Calendar.current
        if calendar.isDateInToday(date) { return "Today" }
        if calendar.isDateInYesterday(date) { return "Yesterday" }
        let formatter = DateFormatter()
        formatter.dateStyle = .medium
        formatter.timeStyle = .none
        return formatter.string(from: date)
    }

    static func weekdayShort(_ date: Date) -> String {
        let formatter = DateFormatter()
        formatter.dateFormat = "EEEEE"
        return formatter.string(from: date)
    }

    static func fullDate(_ date: Date) -> String {
        let formatter = DateFormatter()
        formatter.dateStyle = .full
        formatter.timeStyle = .none
        return formatter.string(from: date)
    }

    static func duration(_ seconds: TimeInterval) -> String {
        let total = Int(seconds)
        let hours = total / 3600
        let minutes = (total % 3600) / 60
        if hours > 0 { return String(format: "%dh %02dm", hours, minutes) }
        return String(format: "%dm %02ds", minutes, total % 60)
    }

    /// `DailyGoalsSettingsVM` renders the sleep goal as `sleep/60 + "h"`.
    static func sleepGoal(_ minutes: Int) -> String { "\(minutes / 60)h \(minutes % 60)m" }

    // MARK: Battery

    /// `main/battery/BatteryChangeLevel`: the `Critical` singleton carries
    /// threshold 5.0f and `Low` 10.0f (`Normal` 100.0f); `getLevel` compares with
    /// `<=`, so exactly 5 % is critical and exactly 10 % is low.
    enum BatteryLevel { case normal, low, critical, charging }

    static func batteryLevel(_ percent: Int, charging: Bool = false) -> BatteryLevel {
        if charging { return .charging }
        if percent <= 5 { return .critical }
        if percent <= 10 { return .low }
        return .normal
    }

    /// The `battery_critical` / `battery_low` strings from `resources.arsc`,
    /// surfaced through `main/battery/ResourcesKt.batteryCriticalMessage` /
    /// `batteryLowMessage` and interpolated with the percentage by
    /// `BatteryNotificationCenter` (`String.format(format, *args)`), under the
    /// title `Battery Status`.
    static func batteryMessage(for level: BatteryLevel, percent: Int) -> String? {
        switch level {
        case .critical: return String(format: "Your PowerWatch 2 battery is critical - %d%%", percent)
        case .low: return String(format: "Your PowerWatch 2 battery is low - %d%%", percent)
        case .normal, .charging: return nil
        }
    }
}
