import Foundation
import PowerWatchCore

/// The hour-period fields shared by the walking/resting/sleep tables that
/// aren't on `BaseLogData` (hour-of-day plus the skin-temperature extremes).
protocol HourTempFields {
    var hourInDay: Int { get }
    var minSkinTemp: Float { get }
    var maxSkinTemp: Float { get }
}

extension WalkingHourPeriodRecord: HourTempFields {}
extension RestingHourPeriodRecord: HourTempFields {}
extension SleepHourPeriodRecord: HourTempFields {}

/// One hour of a min/max chart series (heart-rate and temperature range
/// charts, Android's per-hour range/candlestick views).
struct HourRange: Identifiable, Equatable {
    let hour: Int
    let low: Double
    let high: Double
    var id: Int { hour }
}

/// Aggregates the dashboard shows for one period. Reads the stored
/// hour-period tables (written by the sync engine after each pull, like
/// Android's `WatchSynchronizerImpl`) and aggregates them through the
/// PeriodPipeline day/week/month chain.
struct DashboardSummary: Equatable {
    var steps: Int = 0
    var activeCalories: Int = 0
    var bmrCalories: Int = 0
    var distance: Double = 0            // meters
    var sleepMinutes: Int = 0
    var walkingMinutes: Int = 0
    var restingMinutes: Int = 0
    var heartRate: Float = 0             // minutes-weighted mean, 0 when no data
    var minHeartRate: Int = 0            // lowest positive min across the period
    var maxHeartRate: Int = 0
    var hrv: Float = 0                   // mean of positive walking-log HRVs (Android day override)
    var sleepByType: [SleepType: Int] = [:]   // minutes by type
    /// Thermoelectric generation over the period, µWh (µW × hours), split
    /// body-heat / solar like Android's "FROM BODY / FROM LIGHT" gauge.
    var bodyPowerMWh: Double = 0
    var solarPowerMWh: Double = 0
    var generatedPowerMWh: Double { bodyPowerMWh + solarPowerMWh }
    var currentSkinTemp: Float = 0       // most recent hour with a temperature
    var avgSkinTemp: Float = 0
    var minSkinTemp: Float = 0
    var maxSkinTemp: Float = 0
    /// Hour-indexed series (day view chart): steps per hour of day.
    var stepsByHour: [Int] = Array(repeating: 0, count: 24)
    /// Hour-indexed series (day view chart): sleep minutes per hour of day.
    var sleepByHour: [Int] = Array(repeating: 0, count: 24)
    /// Day view charts: per-hour HR range, skin-temp range, generated µWh.
    var hrRangeByHour: [HourRange] = []
    var tempRangeByHour: [HourRange] = []
    var powerMWhByHour: [Double] = Array(repeating: 0, count: 24)
    /// Android's combined charts pair steps with calories and sleep with heart
    /// rate (`steps_calories`, `sleep_heartrate`), so both series exist per hour.
    var caloriesByHour: [Int] = Array(repeating: 0, count: 24)
    var heartRateByHour: [Float] = Array(repeating: 0, count: 24)

    init(goals: GoalConfiguration,
         database: PowerWatchDatabase, calendar: Calendar = .current, now: Date = .now) {
        // The dashboard is day-only: the day/week/month switcher was removed, so
        // the range is always today. The week/month formatters stay in
        // `PeriodPipeline` (still covered by `CalculationTests`).
        let start = calendar.startOfDay(for: now)
        let end = calendar.date(byAdding: .day, value: 1, to: start) ?? now
        let from = Int64(start.timeIntervalSince1970 * 1000)
        let to = Int64(end.timeIntervalSince1970 * 1000)

        guard let walkingHours = try? database.fetchWalkingPeriods(from: from, to: to),
              let restingHours = try? database.fetchRestingPeriods(from: from, to: to),
              let sleepHours = try? database.fetchSleepPeriods(from: from, to: to) else { return }

        // Walking chain (Android fidelity): stored hours → days.
        let days = formatWalkingDayPeriods(walkingHours, calendar: calendar)
        applyWalkingAggregates(days)

        walkingMinutes = walkingHours.reduce(0) { $0 + $1.minsInPeriod }
        restingMinutes = restingHours.reduce(0) { $0 + $1.minsInPeriod }
        sleepMinutes = sleepHours.reduce(0) { $0 + $1.minsInPeriod }

        // Sleep type split: decode the stored five-minute buckets.
        for hour in sleepHours {
            for fiveMin in hour.fiveMinPeriods {
                sleepByType[fiveMin.sleepType, default: 0] += fiveMin.minsInPeriod
            }
        }

        // Day-view charts: per hour-of-day series.
        for hour in walkingHours where (0..<24).contains(hour.hourInDay) {
            stepsByHour[hour.hourInDay] += hour.steps
        }
        for hour in sleepHours where (0..<24).contains(hour.hourInDay) {
            sleepByHour[hour.hourInDay] += hour.minsInPeriod
        }
        for hour in walkingHours where (0..<24).contains(hour.hourInDay) {
            caloriesByHour[hour.hourInDay] += hour.activeCalories
            accumulateHeartRate(hour.heartRate, minutes: hour.minsInPeriod, hour: hour.hourInDay)
        }
        for hour in restingHours where (0..<24).contains(hour.hourInDay) {
            caloriesByHour[hour.hourInDay] += hour.activeCalories
            accumulateHeartRate(hour.heartRate, minutes: hour.minsInPeriod, hour: hour.hourInDay)
        }
        for hour in sleepHours where (0..<24).contains(hour.hourInDay) {
            caloriesByHour[hour.hourInDay] += hour.activeCalories
            accumulateHeartRate(hour.heartRate, minutes: hour.minsInPeriod, hour: hour.hourInDay)
        }
        for hour in 0..<24 where heartRateWeight[hour] > 0 {
            heartRateByHour[hour] = heartRateTotal[hour] / Float(heartRateWeight[hour])
        }

        applyPowerTemperatureAndHeartRate(walking: walkingHours,
                                          resting: restingHours,
                                          sleep: sleepHours)
    }

    /// Power generation (µWh from µW × minutes), skin temperature and heart
    /// rate range/HRV — Android's power, temperature and heart-rate cards
    /// read the same hour-period fields the sync engine stores.
    /// Minutes-weighted heart rate per hour (`heartRateTotal` / `heartRateWeight`).
    private var heartRateTotal = Array(repeating: Float(0), count: 24)
    private var heartRateWeight = Array(repeating: Int(0), count: 24)

    private mutating func accumulateHeartRate(_ value: Float, minutes: Int, hour: Int) {
        guard minutes > 0, value > 0 else { return }
        heartRateTotal[hour] += value * Float(minutes)
        heartRateWeight[hour] += minutes
    }

    private mutating func applyPowerTemperatureAndHeartRate(
        walking: [WalkingHourPeriodRecord],
        resting: [RestingHourPeriodRecord],
        sleep: [SleepHourPeriodRecord]
    ) {
        struct Point {
            let hour: Int
            let start: Int64
            let mins: Int
            let minHeartRate: Int
            let maxHeartRate: Int
            let minSkinTemp: Float
            let maxSkinTemp: Float
            let skinTemp: Float
            let bodyPower: Float
            let solarPower: Float
        }
        func points<T: BaseLogData & HourTempFields>(
            _ records: [T]
        ) -> [Point] {
            records.map {
                Point(hour: $0.hourInDay, start: $0.startTime, mins: $0.minsInPeriod,
                      minHeartRate: $0.minHeartRate, maxHeartRate: $0.maxHeartRate,
                      minSkinTemp: $0.minSkinTemp, maxSkinTemp: $0.maxSkinTemp,
                      skinTemp: $0.skinTemp, bodyPower: $0.bodyPower, solarPower: $0.solarPower)
            }
        }
        let all = points(walking) + points(resting) + points(sleep)

        for point in all {
            bodyPowerMWh += Double(point.bodyPower) * Double(point.mins) / 60
            solarPowerMWh += Double(point.solarPower) * Double(point.mins) / 60
            if (0..<24).contains(point.hour) {
                powerMWhByHour[point.hour] +=
                    Double(point.bodyPower + point.solarPower) * Double(point.mins) / 60
            }
            if point.maxHeartRate > maxHeartRate { maxHeartRate = point.maxHeartRate }
            if point.minHeartRate > 0, minHeartRate == 0 || point.minHeartRate < minHeartRate {
                minHeartRate = point.minHeartRate
            }
        }

        // HRV: mean of the positive walking-log values (Android's day override).
        let hrvs = walking.map(\.hrv).filter { $0 > 0 }
        hrv = hrvs.isEmpty ? 0 : hrvs.reduce(0, +) / Float(hrvs.count)

        // Skin temperature: average of the positive means, extremes of the
        // per-hour min/max, "current" from the latest hour with a reading.
        let temps = all.filter { $0.skinTemp > 0 }
        avgSkinTemp = temps.isEmpty ? 0 : temps.map(\.skinTemp).reduce(0, +) / Float(temps.count)
        maxSkinTemp = all.map(\.maxSkinTemp).max() ?? 0
        let positiveMins = all.map(\.minSkinTemp).filter { $0 > 0 }
        minSkinTemp = positiveMins.min() ?? (temps.map(\.skinTemp).min() ?? 0)
        currentSkinTemp = temps.max { $0.start < $1.start }?.skinTemp ?? 0

        // Per-hour range charts (only hours that actually recorded data).
        func ranges(_ lowOf: (Point) -> Float, _ highOf: (Point) -> Float) -> [HourRange] {
            let grouped = Dictionary(grouping: all.filter { (0..<24).contains($0.hour) },
                                     by: \.hour)
            return grouped.compactMap { hour, items in
                let lows = items.map(lowOf).filter { $0 > 0 }
                let highs = items.map(highOf).filter { $0 > 0 }
                guard let low = lows.min(), let high = highs.max(), high >= low else { return nil }
                return HourRange(hour: hour, low: Double(low), high: Double(high))
            }.sorted { $0.hour < $1.hour }
        }
        hrRangeByHour = ranges({ Float($0.minHeartRate) }, { Float($0.maxHeartRate) })
        tempRangeByHour = ranges({ $0.minSkinTemp }, { $0.maxSkinTemp })
    }

    private mutating func applyWalkingAggregates(_ days: [WalkingDayPeriod]) {
        applyPeriods(days.map(\.values), days.map(\.steps), days.map(\.distance))
    }

    private mutating func applyWalkingAggregates(_ weeks: [WalkingWeekPeriod]) {
        applyPeriods(weeks.map(\.values), weeks.map(\.steps), weeks.map(\.distance))
    }

    private mutating func applyWalkingAggregates(_ months: [WalkingMonthPeriod]) {
        applyPeriods(months.map(\.values), months.map(\.steps), months.map(\.distance))
    }

    private mutating func applyPeriods(_ values: [BasePeriodValues],
                                       _ steps: [Int], _ distances: [Double]) {
        self.steps = steps.reduce(0, +)
        distance = distances.reduce(0, +)
        activeCalories = values.reduce(0) { $0 + $1.activeCalories }
        bmrCalories = values.reduce(0) { $0 + $1.bmrCalories }
        let weighted = values.reduce(0.0) {
            $0 + Double($1.heartRate) * Double($1.minsInPeriod)
        }
        let minutes = values.reduce(0) { $0 + $1.minsInPeriod }
        heartRate = minutes > 0 ? Float(weighted / Double(minutes)) : 0
    }
}

/// Fixture data for the dashboard UI tests (`-uitest-seed`): one walking
/// hour, one resting hour, two sleep hours early "today".
enum DashboardFixtures {

    static func seedToday(_ database: PowerWatchDatabase, calendar: Calendar = .current,
                          now: Date = .now) throws {
        let start = calendar.startOfDay(for: now)
        let dayStart = Int64(start.timeIntervalSince1970 * 1000)
        func ts(_ hours: Int) -> Int64 { dayStart + Int64(hours) * 3_600_000 }

        var walking: [WalkingLogRecord] = []
        for minute in 0..<60 {
            walking.append(WalkingLogRecord(
                startTime: ts(8) + Int64(minute) * 60_000,
                steps: 100,
                distance: 70,
                endTime: ts(8) + Int64(minute + 1) * 60_000,
                heartRate: 100, bodyPower: 40, solarPower: 10,
                skinTemp: 33, maxSkinTemp: 33.5, minSkinTemp: 32.5,
                activeCalories: 2, hrv: 40, bmrCalories: 1,
                minHeartRate: 90, maxHeartRate: 110, minsInPeriod: 1))
        }
        try database.upsertWalkingLogs(walking)

        var resting: [RestingLogRecord] = []
        for minute in 0..<60 {
            resting.append(RestingLogRecord(
                startTime: ts(12) + Int64(minute) * 60_000,
                endTime: ts(12) + Int64(minute + 1) * 60_000,
                heartRate: 70, bodyPower: 30, solarPower: 0,
                skinTemp: 32, maxSkinTemp: 32.5, minSkinTemp: 31.5,
                activeCalories: 0, bmrCalories: 1, minHeartRate: 65, maxHeartRate: 75, minsInPeriod: 1))
        }
        try database.upsertRestingLogs(resting)

        var sleep: [SleepLogRecord] = []
        for minute in 0..<120 {
            sleep.append(SleepLogRecord(
                startTime: ts(0) + Int64(minute) * 60_000,
                endTime: ts(0) + Int64(minute + 1) * 60_000,
                heartRate: 55, bodyPower: 25, solarPower: 0,
                skinTemp: 31, maxSkinTemp: 31.5, minSkinTemp: 30.5,
                activeCalories: 0, sleepType: .deep, bmrCalories: 1, minHeartRate: 50, maxHeartRate: 60, minsInPeriod: 1))
        }
        try database.upsertSleepLogs(sleep)

        // One activity session, as the v4 header/delta logs would have built it
        // (a walk over the hour the walking logs cover, with a track).
        var positions: [GPSPosition] = []
        var rates: [HeartRate] = []
        var splits: [RunningSplit] = []
        for minute in 0..<30 {
            positions.append(GPSPosition(
                longitude: 4.89 + Double(minute) * 0.0002,
                latitude: 52.37 + Double(minute) * 0.0001,
                altitude: 3, speed: 1.4,
                timestamp: ts(8) + Int64(minute) * 60_000))
            rates.append(HeartRate(beatsPerMinute: 105,
                                   startTime: ts(8) + Int64(minute) * 60_000,
                                   endTime: ts(8) + Int64(minute + 1) * 60_000))
            splits.append(RunningSplit(distance: 66.67, period: 1000))
        }
        func json<T: Encodable>(_ value: T) -> String {
            String(data: (try? JSONEncoder().encode(value)) ?? Data("[]".utf8), encoding: .utf8) ?? "[]"
        }
        try database.upsertActivitySession(UserActivitySessionRecord(
            id: "_\(ts(8))", name: "Outdoor Walk", activityType: "ACTIVITY_WALKING",
            distance: 2000, steps: 3000, startTime: ts(8), endTime: ts(8) + 1_800_000,
            activeCalories: 120, splits: json(splits), gpsPositions: json(positions),
            heartRates: json(rates), shouldSend: false))

        // Store the hour periods exactly as the sync engine would.
        try database.upsertWalkingPeriods(formatWalkingHourPeriods(walking, lastStoredPeriod: nil, calendar: calendar))
        try database.upsertRestingPeriods(formatRestingHourPeriods(resting, lastStoredPeriod: nil, calendar: calendar))
        let fiveMin = formatSleepFiveMinPeriods(sleep, lastStoredPeriod: nil, calendar: calendar)
        try database.upsertSleepPeriods(formatSleepHourPeriods(fiveMin, calendar: calendar))
    }
}
