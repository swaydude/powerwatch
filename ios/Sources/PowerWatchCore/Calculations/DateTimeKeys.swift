import Foundation

// Port of the date helpers from `shared/extensions/DateTimeExtensionsKt.java`
// that the period groupers depend on. Semantics are matched to
// `java.util.Calendar` in the default time zone:
// - weekday numbering is identical (1 = Sunday … 7 = Saturday)
// - `minInHour` returns minute + 1 (Android quirk, kept faithfully — the
//   five-minute grouper divides it by 5)
// - week/year identity keys follow Calendar's week-of-year with the
//   calendar's firstWeekday/minimumDaysInFirstWeek

/// Namespace for the ported date helpers (epoch milliseconds in, calendar
/// components out).
public enum PWDate {

    /// `toZonedCalendar(startTime)` — Date for epoch millis in the calendar's zone.
    public static func date(_ millis: Int64, calendar: Calendar = .current) -> Date {
        Date(timeIntervalSince1970: TimeInterval(millis) / 1000)
    }

    /// Components of an epoch-millis timestamp in the calendar's zone.
    public static func components(_ millis: Int64, calendar: Calendar = .current) -> DateComponents {
        calendar.dateComponents(in: calendar.timeZone, from: date(millis, calendar: calendar))
    }

    /// DateTimeExtensionsKt.hourInDay(cal) — with `offsetHours` applied first
    /// (the groupers call `cal.add(HOUR, offset)` before extracting keys).
    public static func hourInDay(_ millis: Int64, calendar: Calendar = .current,
                                 offsetHours: Int = 0) -> Int {
        let shifted = millis + Int64(offsetHours) * 3_600_000
        return calendar.component(.hour, from: date(shifted, calendar: calendar))
    }

    /// DateTimeExtensionsKt.dayOfMonth(cal).
    public static func dayOfMonth(_ millis: Int64, calendar: Calendar = .current) -> Int {
        components(millis, calendar: calendar).day ?? 0
    }

    /// DateTimeExtensionsKt.dayInWeek(cal) — zero-based offset from the
    /// calendar's first day of week (0-based Monday-style index).
    public static func dayInWeek(_ millis: Int64, calendar: Calendar = .current) -> Int {
        let comps = components(millis, calendar: calendar)
        let weekday = comps.weekday ?? 1     // 1 = Sunday … 7 = Saturday
        if calendar.firstWeekday == 1 {
            return weekday - 1
        }
        if weekday == 1 { return 6 }
        return weekday - 2
    }

    /// DateTimeExtensionsKt.minInHour(cal) — returns minute + 1 (quirk).
    public static func minInHour(_ millis: Int64, calendar: Calendar = .current) -> Int {
        (components(millis, calendar: calendar).minute ?? 0) + 1
    }

    /// DateTimeExtensionsKt.dayUniqueID(cal): "dD/mM/yYYY".
    public static func dayUniqueID(_ millis: Int64, calendar: Calendar = .current) -> String {
        let c = components(millis, calendar: calendar)
        return "\((c.day ?? 0))D/\((c.month ?? 0))M/\((c.year ?? 0))Y"
    }

    /// DateTimeExtensionsKt.monthUniqueID(cal): "mM/yYYY".
    public static func monthUniqueID(_ millis: Int64, calendar: Calendar = .current) -> String {
        let c = components(millis, calendar: calendar)
        return "\((c.month ?? 0))M/\((c.year ?? 0))Y"
    }

    /// DateTimeExtensionsKt.weekUniqueID(cal): week-of-year plus a
    /// year-bump when the week's last day (+6 − dayInWeek days) crosses
    /// into the next year.
    public static func weekUniqueID(_ millis: Int64, calendar: Calendar = .current) -> String {
        let dayInWeek = self.dayInWeek(millis, calendar: calendar)
        let c = components(millis, calendar: calendar)
        let weekOfYear = c.weekOfYear ?? 0
        let year = c.year ?? 0
        let shifted = components(millis + Int64(6 - dayInWeek) * 86_400_000, calendar: calendar)
        let shiftedYear = shifted.year ?? 0
        if year != shiftedYear {
            return "\(weekOfYear)W/\(year + 1)Y"
        }
        return "\(weekOfYear)W/\(year)Y"
    }

    /// DateTimeExtensionsKt.weekOfYear(cal).
    public static func weekOfYear(_ millis: Int64, calendar: Calendar = .current) -> Int {
        components(millis, calendar: calendar).weekOfYear ?? 0
    }

    /// DateTimeExtensionsKt.month(cal) — 1-based month.
    public static func month(_ millis: Int64, calendar: Calendar = .current) -> Int {
        components(millis, calendar: calendar).month ?? 0
    }
}
