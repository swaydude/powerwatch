import XCTest
@testable import PowerWatchCore

/// TC-D04–D06 — derived-metric pipeline: grouping keys, PeriodFiller
/// semantics, sleep specifics, day/week/month aggregation.
final class CalculationTests: XCTestCase {

    /// Fixed timezone so date-component assertions don't shift with the
    /// host's zone.
    private var utc: Calendar {
        var cal = Calendar(identifier: .gregorian)
        cal.timeZone = TimeZone(identifier: "UTC")!
        cal.firstWeekday = 1
        return cal
    }

    // MARK: - Grouping keys

    func testGroupingKeys() {
        let cal = utc
        // 2026-09-17 14:23:05 UTC (Thursday)
        let t: Int64 = 1_789_654_985_000
        XCTAssertEqual(PWDate.dayUniqueID(t, calendar: cal), "17D/9M/2026Y")
        XCTAssertEqual(PWDate.monthUniqueID(t, calendar: cal), "9M/2026Y")
        XCTAssertEqual(PWDate.weekUniqueID(t, calendar: cal), "38W/2026Y")
        XCTAssertEqual(PWDate.hourInDay(t, calendar: cal), 14)
        XCTAssertEqual(PWDate.dayOfMonth(t, calendar: cal), 17)
        XCTAssertEqual(PWDate.dayInWeek(t, calendar: cal), 4)  // Thursday, Sunday-first
        XCTAssertEqual(PWDate.minInHour(t, calendar: cal), 24)  // 23 + 1 (Android quirk)

        // Month rollover identity: Oct 1 2026 vs Sep 30 2026 differ.
        let oct1: Int64 = 1_790_812_800_000   // 2026-10-01 00:00 UTC
        let sep30: Int64 = 1_790_726_400_000  // 2026-09-30 00:00 UTC
        XCTAssertNotEqual(PeriodGrouping.month.key(oct1, calendar: cal),
                          PeriodGrouping.month.key(sep30, calendar: cal))
        XCTAssertEqual(PWDate.monthUniqueID(oct1, calendar: cal), "10M/2026Y")
        // Week identity: with firstWeekday = 1, Sunday STARTS the week, so a
        // Sunday and the following Saturday share a week — but Saturday and
        // the NEXT day's Sunday do not.
        let sunday: Int64 = 1_769_299_200_000    // 2026-01-25 (Sunday)
        let nextSaturday: Int64 = 1_769_817_600_000  // 2026-01-31 (Saturday)
        XCTAssertEqual(PWDate.weekUniqueID(sunday, calendar: cal),
                       PWDate.weekUniqueID(nextSaturday, calendar: cal))
        let prevSaturday: Int64 = 1_769_212_800_000  // 2026-01-24 (Saturday)
        XCTAssertNotEqual(PWDate.weekUniqueID(prevSaturday, calendar: cal),
                          PWDate.weekUniqueID(sunday, calendar: cal))
    }

    func testGroupingByHourAndFiveMinutes() {
        let cal = utc
        // Two logs in the same hour, one in the next hour.
        let logs = [
            WalkingLogRecord(startTime: 1_789_653_700_000),  // 14:01:40
            WalkingLogRecord(startTime: 1_789_654_600_000),  // 14:16:40
            WalkingLogRecord(startTime: 1_789_659_100_000),  // 15:31:40
        ]
        let groups = groupByTime(logs, grouping: .hour, calendar: cal)
        XCTAssertEqual(groups.count, 2)
        XCTAssertEqual(groups[0].items.count, 2)
        XCTAssertEqual(groups[1].items.count, 1)

        // Five-minute buckets follow the (minute + 1) / 5 quirk.
        let key14_01 = PeriodGrouping.fiveMinute.key(1_789_653_700_000, calendar: cal)
        let key14_16 = PeriodGrouping.fiveMinute.key(1_789_654_600_000, calendar: cal)
        XCTAssertTrue(key14_01.hasSuffix(":0"))   // minute = 1 → (1 + 1) / 5 = 0
        XCTAssertTrue(key14_16.hasSuffix(":3"))   // minute = 16 → 17 / 5 = 3
        XCTAssertNotEqual(key14_01, key14_16)
    }

    // MARK: - PeriodFillerImpl.fill

    func testFillBasePeriodSemantics() {
        let logs: [WalkingLogRecord] = [
            WalkingLogRecord(startTime: 100, steps: 10, distance: 8, endTime: 160,
                             heartRate: 60, bodyPower: 1.5, solarPower: 2.5,
                             skinTemp: 30, maxSkinTemp: 31, minSkinTemp: 29,
                             caseTemp: 28, activeCalories: 5, hrv: 40, bmrCalories: 7,
                             minHeartRate: 55, maxHeartRate: 80, minsInPeriod: 1),
            WalkingLogRecord(startTime: 200, steps: 20, distance: 16, endTime: 260,
                             heartRate: 70, bodyPower: 2.5, solarPower: 3.5,
                             skinTemp: 32, maxSkinTemp: 30, minSkinTemp: 28,
                             caseTemp: 26, activeCalories: 6, hrv: 0, bmrCalories: 8,
                             minHeartRate: 0, maxHeartRate: 90, minsInPeriod: 1),
        ]
        let v = fillBasePeriod(logs)
        XCTAssertEqual(v.startTime, 100)
        XCTAssertEqual(v.endTime, 260)
        XCTAssertEqual(v.activeCalories, 11)
        XCTAssertEqual(v.bmrCalories, 15)
        XCTAssertEqual(v.minsInPeriod, 2)
        // minHeartRate: only > 0 values (second log's 0 is ignored).
        XCTAssertEqual(v.minHeartRate, 55)
        // heartRate: mean of > 0 values.
        XCTAssertEqual(v.heartRate, 65, accuracy: 0.001)
        XCTAssertEqual(v.maxHeartRate, 90)
        XCTAssertEqual(v.bodyPower, 4, accuracy: 0.001)
        XCTAssertEqual(v.solarPower, 6, accuracy: 0.001)
        // maxSkinTemp over ALL logs (no > 0 filter) → 31; peakTemp mirrors it.
        XCTAssertEqual(v.maxSkinTemp, 31)
        XCTAssertEqual(v.peakTemp, 31)
        // skinTemp mean over ALL logs: (30 + 32) / 2.
        XCTAssertEqual(v.skinTemp, 31, accuracy: 0.001)
        // hrv: FIRST positive value.
        XCTAssertEqual(v.hrv, 40)
        // case temps: max/min over all caseTemp values.
        XCTAssertEqual(v.maxCaseTemp, 28)
        XCTAssertEqual(v.minCaseTemp, 26)
        XCTAssertEqual(v.minSkinTemp, 28)
    }

    func testFillBasePeriodEmptyGroup() {
        let v = fillBasePeriod([])
        XCTAssertEqual(v, BasePeriodValues())
    }

    // MARK: - mergePeriod (quirks)

    func testMergeBasePeriodQuirks() {
        var output = BasePeriodValues()
        output.startTime = 1_000
        output.minsInPeriod = 3
        output.heartRate = 80
        output.skinTemp = 30
        output.maxHeartRate = 120
        output.minHeartRate = 50
        output.bodyPower = 10
        output.activeCalories = 100
        output.bmrCalories = 200
        output.peakTemp = 32

        var other = BasePeriodValues()
        other.startTime = 500
        other.minsInPeriod = 1
        other.heartRate = 60
        other.skinTemp = 34
        other.maxHeartRate = 140
        other.minHeartRate = 60
        other.bodyPower = 5
        other.activeCalories = 50
        other.bmrCalories = 80
        other.peakTemp = 35

        mergeBasePeriod(&output, other)
        // startTime takes the merged (older) period's start.
        XCTAssertEqual(output.startTime, 500)
        XCTAssertEqual(output.minsInPeriod, 4)
        // Quirk: heartRate scaled ONLY by the first weighted term
        // (3/4 → round(0.75) = 1 → 80 * 1 = 80); the second term is dropped.
        XCTAssertEqual(output.heartRate, 80, accuracy: 0.001)
        XCTAssertEqual(output.skinTemp, 30, accuracy: 0.001)
        // Quirk: maxHeartRate combined with min (140 ignored).
        XCTAssertEqual(output.maxHeartRate, 120)
        XCTAssertEqual(output.minHeartRate, 50)
        XCTAssertEqual(output.bodyPower, 15)
        XCTAssertEqual(output.activeCalories, 150)
        XCTAssertEqual(output.bmrCalories, 280)
        XCTAssertEqual(output.peakTemp, 35)
    }

    func testMergeScalesWhenWeightBelowHalf() {
        var output = BasePeriodValues()
        output.minsInPeriod = 1
        output.heartRate = 80
        var other = BasePeriodValues()
        other.minsInPeriod = 3
        // 1/4 → round(0.25) = 0 → heartRate drops to 0 (faithful to Android).
        mergeBasePeriod(&output, other)
        XCTAssertEqual(output.heartRate, 0, accuracy: 0.001)
    }

    // MARK: - Sleep filler

    func testSleepFillExtras() {
        let logs: [SleepLogRecord] = [
            SleepLogRecord(startTime: 0, endTime: 300_000, sleepType: .deep),
            SleepLogRecord(startTime: 300_000, endTime: 600_000, sleepType: .deep),
            SleepLogRecord(startTime: 600_000, endTime: 900_000, sleepType: .restless),
            SleepLogRecord(startTime: 900_000, endTime: 1_100_000, sleepType: .light),
        ]
        let extras = fillSleepExtras(logs)
        XCTAssertEqual(extras.sleepType, .deep)             // majority
        // Restless: (900_000 - 600_000) / 60_000 = 5 minutes.
        XCTAssertEqual(extras.restlessMinutes, 5)
        // Empty group falls back to RESTLESS.
        XCTAssertEqual(fillSleepExtras([]).sleepType, .restless)
    }

    // MARK: - Hour formatters

    func testFormatWalkingHourPeriodsMergesWithStored() {
        let cal = utc
        let base: Int64 = 1_789_653_700_000   // 2026-09-17 14:01 UTC
        let logs = [
            WalkingLogRecord(startTime: base, steps: 100, distance: 80, endTime: base + 300_000,
                             minsInPeriod: 5),
        ]
        var stored = WalkingHourPeriodRecord()
        stored.startTime = base - 600_000
        stored.steps = 50
        stored.distance = 40
        stored.minsInPeriod = 30
        stored.hourInDay = 14
        stored.activeCalories = 20

        let periods = formatWalkingHourPeriods(logs, lastStoredPeriod: stored, calendar: cal)
        XCTAssertEqual(periods.count, 1)
        let merged = periods[0]
        // Same hourInDay and later start → merged with the stored period.
        XCTAssertEqual(merged.steps, 150)
        XCTAssertEqual(merged.distance, 120, accuracy: 0.001)
        XCTAssertEqual(merged.minsInPeriod, 35)
        XCTAssertEqual(merged.activeCalories, 20)
        XCTAssertEqual(merged.startTime, stored.startTime)  // older start wins
        XCTAssertEqual(merged.hourInDay, 14)
    }

    func testFormatWalkingHourPeriodsDifferentHourNoMerge() {
        let cal = utc
        let base: Int64 = 1_789_653_700_000
        let logs = [WalkingLogRecord(startTime: base + 3_600_000, steps: 10, minsInPeriod: 5)]
        var stored = WalkingHourPeriodRecord()
        stored.startTime = base
        stored.hourInDay = 14
        let periods = formatWalkingHourPeriods(logs, lastStoredPeriod: stored, calendar: cal)
        XCTAssertEqual(periods.count, 1)
        XCTAssertEqual(periods[0].steps, 10)  // not merged
    }

    // MARK: - Sleep five-minute → hour chain

    func testSleepFiveMinAndHourChain() {
        let cal = utc
        let base: Int64 = 1_789_653_700_000   // 14:01 UTC
        let sleepLogs = [
            SleepLogRecord(startTime: base, endTime: base + 300_000, sleepType: .deep, minsInPeriod: 5),
            SleepLogRecord(startTime: base + 300_000, endTime: base + 600_000, sleepType: .deep, minsInPeriod: 5),
            SleepLogRecord(startTime: base + 600_000, endTime: base + 900_000, sleepType: .restless, minsInPeriod: 5),
        ]
        let fiveMins = formatSleepFiveMinPeriods(sleepLogs, lastStoredPeriod: nil, calendar: cal)
        XCTAssertEqual(fiveMins.count, 3)
        // fiveMinsInHour = minute + 1: minutes 1, 6, 11 → 2, 7, 12.
        XCTAssertEqual(fiveMins.map(\.fiveMinsInHour), [2, 7, 12])

        let hourPeriods = formatSleepHourPeriods(fiveMins, calendar: cal)
        XCTAssertEqual(hourPeriods.count, 1)
        XCTAssertEqual(hourPeriods[0].sleepType, .deep)      // majority
        XCTAssertEqual(hourPeriods[0].restlessMinutes, 5)
        XCTAssertEqual(hourPeriods[0].hourInDay, 14)
        XCTAssertEqual(hourPeriods[0].fiveMinPeriods.count, 3)
        XCTAssertEqual(hourPeriods[0].minsInPeriod, 15)
    }

    // MARK: - Day / week / month walking chain

    func testWalkingDayWeekMonthChain() {
        let cal = utc
        let day1: Int64 = 1_789_660_800_000   // 2026-09-17 16:00 UTC
        let hourPeriods = [
            WalkingHourPeriodRecord(startTime: day1, endTime: day1 + 3_600_000, steps: 100,
                                    distance: 80, minsInPeriod: 60),
            WalkingHourPeriodRecord(startTime: day1 + 3_600_000, endTime: day1 + 7_200_000,
                                    steps: 50, distance: 40, minsInPeriod: 60),
            // Next day.
            WalkingHourPeriodRecord(startTime: day1 + 86_400_000,
                                    endTime: day1 + 90_000_000_000,
                                    steps: 70, distance: 56, minsInPeriod: 60),
        ]
        let days = formatWalkingDayPeriods(hourPeriods, calendar: cal)
        XCTAssertEqual(days.count, 2)
        XCTAssertEqual(days[0].steps, 150)
        XCTAssertEqual(days[0].distance, 120, accuracy: 0.001)
        XCTAssertEqual(days[0].dayInMonth, 17)
        XCTAssertEqual(days[0].walkingHours.count, 2)
        // A day with any zero-heartRate hour is malformed.
        XCTAssertTrue(days[0].malformed)

        let weeks = formatWalkingWeekPeriods(days, calendar: cal)
        XCTAssertEqual(weeks.count, 1)
        XCTAssertEqual(weeks[0].steps, 220)
        XCTAssertEqual(weeks[0].walkingDays.count, 2)

        let months = formatWalkingMonthPeriods(weeks, calendar: cal)
        XCTAssertEqual(months.count, 1)
        XCTAssertEqual(months[0].steps, 220)
        XCTAssertEqual(months[0].monthInYear, 9)
        XCTAssertEqual(months[0].walkingWeeks.count, 1)
    }

    // MARK: - DST boundary (aggregation across a DST change)

    func testDSTBoundaryGrouping() {
        // America/New_York: 2026-11-01 has a 25-hour day (clocks back).
        var cal = Calendar(identifier: .gregorian)
        cal.timeZone = TimeZone(identifier: "America/New_York")!
        cal.firstWeekday = 1

        // 2026-11-01 01:00 EDT and 01:00 EST both exist (same wall hour).
        let before: Int64 = 1_793_509_200_000   // 2026-11-01 01:00:00 EDT
        let after: Int64 = 1_793_512_800_000    // 2026-11-01 01:00:00 EST
        let hourGroups = groupByTime(
            [WalkingLogRecord(startTime: before), WalkingLogRecord(startTime: after)],
            grouping: .hour, calendar: cal)
        // Both land in wall-clock hour 1 — same identity key, one bucket.
        XCTAssertEqual(hourGroups.count, 1)

        let dayGroups = groupByTime(
            [WalkingLogRecord(startTime: before), WalkingLogRecord(startTime: after)],
            grouping: .day, calendar: cal)
        XCTAssertEqual(dayGroups.count, 1)
    }

    // MARK: - Resting hour formatter

    func testRestingHourFormatterFiltersAndMerges() {
        let cal = utc
        let base: Int64 = 1_789_653_700_000   // 14:01 UTC
        let logs = [
            RestingLogRecord(startTime: base, endTime: base + 60_000, minsInPeriod: 1),
            RestingLogRecord(startTime: base + 120_000, endTime: base + 180_000, minsInPeriod: 1),
            RestingLogRecord(startTime: base + 3_600_000, endTime: base + 3_660_000, minsInPeriod: 1),
        ]
        var stored = RestingHourPeriodRecord()
        stored.startTime = base - 60_000   // filters out nothing (all later)
        stored.hourInDay = 14
        stored.minsInPeriod = 10

        let periods = formatRestingHourPeriods(logs, lastStoredPeriod: stored, calendar: cal)
        XCTAssertEqual(periods.count, 2)
        // First hour merges with the stored period (same hourInDay, later start).
        XCTAssertEqual(periods[0].minsInPeriod, 12)
        XCTAssertEqual(periods[0].startTime, stored.startTime)

        // A stored period at/after the logs filters them out.
        var late = RestingHourPeriodRecord()
        late.startTime = base + 4_000_000
        XCTAssertTrue(formatRestingHourPeriods(logs, lastStoredPeriod: late, calendar: cal).isEmpty)
    }
}
