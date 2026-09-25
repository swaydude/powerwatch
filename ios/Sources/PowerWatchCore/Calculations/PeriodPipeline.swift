import Foundation

// Port of the derived-metric pipeline from
// `shared/data/logPeriodsFormatters/` (PeriodGroupers.kt, PeriodFiller.kt,
// Walking/Resting/Sleep PeriodFormatters.kt).
//
// Pipeline: watch logs → five-minute buckets (sleep) → hour periods →
// day periods → week periods → month periods. Grouping is by string
// identity keys (`DateTimeKeys.swift`), insertion-ordered like the
// original LinkedHashMap.
//
// Android quirks are ported faithfully and marked with comments:
// - `mergePeriod` scales heartRate/skinTemp by only the FIRST weighted term
//   (the second term is computed and discarded in the shipped bytecode)
// - `mergePeriod` combines maxHeartRate with `min` (not `max`)
// - `minInHour` returns minute + 1, so five-minute buckets are (m+1)/5
// - sleep type falls back to RESTLESS when a group is empty

// MARK: - Log protocol (BaseLog)

/// Port of `logPeriodsFormatters.BaseLog` — every log-shaped input to the
/// fillers (DB log records, five-minute sleep buckets, hour periods).
public protocol BaseLogData {
    var startTime: Int64 { get }
    var endTime: Int64 { get }
    var activeCalories: Int { get }
    var bmrCalories: Int { get }
    var heartRate: Float { get }
    var minHeartRate: Int { get }
    var maxHeartRate: Int { get }
    var minsInPeriod: Int { get }
    var bodyPower: Float { get }
    var solarPower: Float { get }
    var skinTemp: Float { get }
    var maxSkinTemp: Float { get }
    var minSkinTemp: Float { get }
    var hrv: Float { get }
    var caseTemp: Float { get }
}

/// Port of `SleepBaseLog` — BaseLog + sleep classification.
public protocol SleepLogData: BaseLogData {
    var sleepType: SleepType { get }
}

extension WalkingLogRecord: BaseLogData {}
extension RestingLogRecord: BaseLogData {}
extension SleepLogRecord: SleepLogData {}
extension WalkingHourPeriodRecord: BaseLogData {}
extension RestingHourPeriodRecord: BaseLogData {}
extension SleepHourPeriodRecord: SleepLogData {}
extension SleepFiveMinPeriod: SleepLogData {}

// MARK: - Grouping (PeriodGroupers.kt)

public enum PeriodGrouping {
    case fiveMinute
    case hour
    case day
    case week
    case month

    /// The groupCriteria string for a timestamp. `offsetHours` is added to
    /// the timestamp before the key is extracted (LogToHourGrouper1(offset)
    /// calls cal.add(HOUR, offset) first) — the sleep pipeline passes the
    /// corrected sleep offset (default 12) here.
    public func key(_ millis: Int64, offsetHours: Int = 0, calendar: Calendar = .current) -> String {
        let shifted = millis + Int64(offsetHours) * 3_600_000
        switch self {
        case .fiveMinute:
            let c = PWDate.components(shifted, calendar: calendar)
            return "\(c.year ?? 0)/\(c.month ?? 0)/\(c.day ?? 0):\(c.hour ?? 0):\(PWDate.minInHour(shifted, calendar: calendar) / 5)"
        case .hour:
            let c = PWDate.components(shifted, calendar: calendar)
            return "\(c.year ?? 0)/\(c.month ?? 0)/\(c.day ?? 0):\(c.hour ?? 0)"
        case .day:
            return PWDate.dayUniqueID(shifted, calendar: calendar)
        case .week:
            return PWDate.weekUniqueID(shifted, calendar: calendar)
        case .month:
            return PWDate.monthUniqueID(shifted, calendar: calendar)
        }
    }
}

/// PeriodGrouper1.groupBy — groups by criteria key preserving first-seen
/// order (LinkedHashMap semantics).
public func groupByTime<T: BaseLogData>(
    _ data: [T], grouping: PeriodGrouping, offsetHours: Int = 0,
    calendar: Calendar = .current
) -> [(key: String, items: [T])] {
    groupByKey(data) { grouping.key($0.startTime, offsetHours: offsetHours, calendar: calendar) }
}

/// Keyed variant for higher-level periods whose timestamp lives on a child
/// property (day/week/month periods key on `values.startTime`).
public func groupByKey<T>(
    _ data: [T], key: (T) -> String
) -> [(key: String, items: [T])] {
    var order: [String] = []
    var buckets: [String: [T]] = [:]
    for item in data {
        let k = key(item)
        if buckets[k] == nil { order.append(k) }
        buckets[k, default: []].append(item)
    }
    return order.map { ($0, buckets[$0]!) }
}

// MARK: - Base fill (PeriodFillerImpl.fill)

/// The set of fields `PeriodFillerImpl.fill` writes onto any output period.
public struct BasePeriodValues: Equatable, Sendable {
    public var startTime: Int64 = 0
    public var endTime: Int64 = 0
    public var minsInPeriod: Int = 0
    public var activeCalories: Int = 0
    public var bmrCalories: Int = 0
    public var heartRate: Float = 0
    public var maxHeartRate: Int = 0
    public var minHeartRate: Int = 0
    public var bodyPower: Float = 0
    public var solarPower: Float = 0
    public var peakTemp: Float = 0
    public var hrv: Float = 0
    public var skinTemp: Float = 0
    public var maxSkinTemp: Float = 0
    public var minSkinTemp: Float = 0
    public var maxCaseTemp: Float = 0
    public var minCaseTemp: Float = 0
    /// Never set by `fillBasePeriod` — period rows chain with caseTemp 0
    /// (Android's fill only writes max/min case temps).
    public var caseTemp: Float = 0

    public init() {}
}

extension BasePeriodValues: BaseLogData {}

/// Port of `PeriodFillerImpl.fill` — aggregates a non-empty group of logs
/// into the shared period fields. Groups handed here are never empty (the
/// groupers only create buckets for present logs).
public func fillBasePeriod(_ inputs: [any BaseLogData]) -> BasePeriodValues {
    var v = BasePeriodValues()
    guard !inputs.isEmpty else { return v }

    v.activeCalories = inputs.reduce(0) { $0 + $1.activeCalories }
    v.bmrCalories = inputs.reduce(0) { $0 + $1.bmrCalories }
    v.startTime = inputs.map(\.startTime).min() ?? 0
    v.endTime = inputs.map(\.endTime).max() ?? 0

    v.minHeartRate = inputs.map(\.minHeartRate).filter { $0 > 0 }.min() ?? 0

    let heartRates = inputs.map(\.heartRate).filter { $0 > 0 }
    v.heartRate = heartRates.isEmpty ? 0 : heartRates.reduce(0, +) / Float(heartRates.count)

    v.maxHeartRate = inputs.map(\.maxHeartRate).filter { $0 > 0 }.max() ?? 0
    v.minsInPeriod = inputs.reduce(0) { $0 + $1.minsInPeriod }
    v.bodyPower = Float(inputs.reduce(0.0) { $0 + Double($1.bodyPower) })
    v.solarPower = Float(inputs.reduce(0.0) { $0 + Double($1.solarPower) })

    // maxSkinTemp: max over ALL logs (no > 0 filter); peakTemp mirrors it.
    v.maxSkinTemp = inputs.map(\.maxSkinTemp).max() ?? 0
    v.peakTemp = v.maxSkinTemp

    // skinTemp: mean over ALL logs (no filter).
    let skinTemps = inputs.map(\.skinTemp)
    v.skinTemp = skinTemps.isEmpty ? 0 : skinTemps.reduce(0, +) / Float(skinTemps.count)

    // hrv: FIRST log with hrv > 0 (not an average).
    v.hrv = inputs.first { $0.hrv > 0 }?.hrv ?? 0

    v.maxCaseTemp = inputs.map(\.caseTemp).max() ?? 0
    v.minCaseTemp = inputs.map(\.caseTemp).min() ?? 0
    v.minSkinTemp = inputs.map(\.minSkinTemp).min() ?? 0
    return v
}

/// Port of `PeriodFillerImpl.mergePeriod` — merges `other` (an older stored
/// period) into `output` (the freshly filled period). Faithful to the
/// shipped bytecode, including two quirks noted inline.
public func mergeBasePeriod(_ output: inout BasePeriodValues, _ other: BasePeriodValues) {
    let total = output.minsInPeriod + other.minsInPeriod
    if total > 0 {
        let scale = (Double(output.minsInPeriod) / Double(total)).rounded()
        // Quirk: the periodToMerge weighted term is computed and discarded
        // in the shipped code — only the first term scales the average.
        output.heartRate *= Float(scale)
        output.skinTemp *= Float(scale)
    }
    output.peakTemp = max(output.peakTemp, other.peakTemp)
    output.maxCaseTemp = max(output.maxCaseTemp, other.maxCaseTemp)
    output.minCaseTemp = min(output.minCaseTemp, other.minCaseTemp)
    output.maxSkinTemp = max(output.maxSkinTemp, other.maxSkinTemp)
    output.minSkinTemp = min(output.minSkinTemp, other.minSkinTemp)
    output.minHeartRate = min(output.minHeartRate, other.minHeartRate)
    // Quirk: maxHeartRate combines with `min`, not `max`.
    output.maxHeartRate = min(output.maxHeartRate, other.maxHeartRate)
    output.bodyPower += other.bodyPower
    output.solarPower += other.solarPower
    output.activeCalories += other.activeCalories
    output.bmrCalories += other.bmrCalories
    output.startTime = other.startTime
    output.minsInPeriod += other.minsInPeriod
}

// MARK: - Sleep fill (SleepPeriodFillerImpl.fill)

/// The sleep-specific outputs of `SleepPeriodFillerImpl.fill`: the majority
/// sleep type and the summed restless minutes.
public struct SleepFillExtras: Equatable, Sendable {
    public var sleepType: SleepType
    public var restlessMinutes: Int

    public init(sleepType: SleepType, restlessMinutes: Int) {
        self.sleepType = sleepType
        self.restlessMinutes = restlessMinutes
    }
}

public func fillSleepExtras(_ inputs: [any SleepLogData]) -> SleepFillExtras {
    // Majority sleep type, first-seen on ties; RESTLESS when empty.
    var counts: [SleepType: Int] = [:]
    var order: [SleepType] = []
    for input in inputs {
        if counts[input.sleepType] == nil { order.append(input.sleepType) }
        counts[input.sleepType, default: 0] += 1
    }
    let sleepType = order.first { counts[$0] == counts.values.max() } ?? .restless

    // Restless minutes: sum of round((end - start) / 60_000) over RESTLESS logs.
    let restless = inputs.filter { $0.sleepType == .restless }
    let restlessMinutes = restless.reduce(0) {
        $0 + Int((Double($1.endTime - $1.startTime) / 60_000).rounded())
    }
    return SleepFillExtras(sleepType: sleepType, restlessMinutes: restlessMinutes)
}

// MARK: - Hour formatters

/// Port of `WalkingHourPeriodFormatterImpl.formatFromRecords`.
/// Groups walking logs into hour periods, merging with `lastStoredPeriod`
/// when the new period is later and falls in the same hour-of-day.
public func formatWalkingHourPeriods(
    _ logs: [WalkingLogRecord],
    lastStoredPeriod: WalkingHourPeriodRecord?,
    calendar: Calendar = .current
) -> [WalkingHourPeriodRecord] {
    groupByTime(logs, grouping: .hour, calendar: calendar).map { _, items in
        var period = WalkingHourPeriodRecord()
        applyBase(period: &period, values: fillBasePeriod(items))
        period.steps = items.reduce(0) { $0 + $1.steps }
        period.distance = items.reduce(0.0) { $0 + $1.distance }
        period.hourInDay = PWDate.hourInDay(period.startTime, calendar: calendar)
        if let last = lastStoredPeriod,
           period.startTime > last.startTime, last.hourInDay == period.hourInDay {
            mergeWalkingPeriods(&period, last)
        }
        return period
    }
}

/// Port of `WalkingPeriodFillerImpl.mergePeriod` (base merge + steps/distance).
public func mergeWalkingPeriods(_ output: inout WalkingHourPeriodRecord, _ other: WalkingHourPeriodRecord) {
    var values = baseValues(of: output)
    mergeBasePeriod(&values, baseValues(of: other))
    applyBase(period: &output, values: values)
    output.steps += other.steps
    output.distance += other.distance
}

/// Port of `RestingHourPeriodFormatterImpl.formatFromRecords` — drops logs
/// at or before the stored period's start, then groups by hour.
public func formatRestingHourPeriods(
    _ logs: [RestingLogRecord],
    lastStoredPeriod: RestingHourPeriodRecord?,
    calendar: Calendar = .current
) -> [RestingHourPeriodRecord] {
    let filtered: [RestingLogRecord]
    if let last = lastStoredPeriod {
        filtered = logs.filter { $0.startTime > last.startTime }
    } else {
        filtered = logs
    }
    return groupByTime(filtered, grouping: .hour, calendar: calendar).map { _, items in
        var period = RestingHourPeriodRecord()
        applyBase(period: &period, values: fillBasePeriod(items))
        period.hourInDay = PWDate.hourInDay(period.startTime, calendar: calendar)
        if let last = lastStoredPeriod,
           period.startTime > last.startTime, last.hourInDay == period.hourInDay {
            var values = baseValues(of: period)
            mergeBasePeriod(&values, baseValues(of: last))
            applyBase(period: &period, values: values)
        }
        return period
    }
}

/// Port of `SleepFiveMinsPeriodFormatterImpl.formatFromRecords` — five-minute
/// sleep buckets from raw sleep logs, merging into the last stored bucket
/// of the same five-minute slot.
public func formatSleepFiveMinPeriods(
    _ logs: [SleepLogRecord],
    lastStoredPeriod: SleepFiveMinPeriod?,
    offsetHours: Int = 0,
    calendar: Calendar = .current
) -> [SleepFiveMinPeriod] {
    let filtered: [SleepLogRecord]
    if let last = lastStoredPeriod {
        filtered = logs.filter { $0.startTime > last.startTime }
    } else {
        filtered = logs
    }
    return groupByTime(filtered, grouping: .fiveMinute, offsetHours: offsetHours,
                      calendar: calendar).map { _, items in
        let base = fillBasePeriod(items)
        let extras = fillSleepExtras(items)
        var period = SleepFiveMinPeriod()
        applyBase(period: &period, values: base)
        period.sleepType = extras.sleepType
        period.restlessMinutes = extras.restlessMinutes
        period.fiveMinsInHour = PWDate.minInHour(period.startTime, calendar: calendar)
        if let last = lastStoredPeriod,
           period.startTime > last.startTime, last.fiveMinsInHour == period.fiveMinsInHour {
            var values = baseValues(of: period)
            mergeBasePeriod(&values, baseValues(of: last))
            applyBase(period: &period, values: values)
        }
        return period
    }
}

/// Port of `SleepHourPeriodFormatterImpl.formatFromRecords` — hour sleep
/// periods from five-minute buckets.
public func formatSleepHourPeriods(
    _ fiveMinPeriods: [SleepFiveMinPeriod],
    offsetHours: Int = 0,
    calendar: Calendar = .current
) -> [SleepHourPeriodRecord] {
    groupByTime(fiveMinPeriods, grouping: .hour, offsetHours: offsetHours,
                calendar: calendar).map { _, items in
        let base = fillBasePeriod(items)
        let extras = fillSleepExtras(items)
        var period = SleepHourPeriodRecord()
        applyBase(period: &period, values: base)
        period.sleepType = extras.sleepType
        period.restlessMinutes = extras.restlessMinutes
        period.sleepFiveMins = SleepHourPeriodRecord.encodeFiveMins(items)
        period.hourInDay = PWDate.hourInDay(period.startTime, calendar: calendar)
        return period
    }
}

// MARK: - Day / week / month (walking chain, full fidelity)

/// Port of `WalkingDayPeriod` (in-memory, not a Room table).
public struct WalkingDayPeriod: Equatable, Sendable {
    public var values: BasePeriodValues
    public var steps: Int
    public var distance: Double
    public var walkingHours: [WalkingHourPeriodRecord]
    public var dayInMonth: Int
    public var dayInWeek: Int
    /// Any hour in the day reported no heart rate at all.
    public var malformed: Bool

    public init(values: BasePeriodValues = BasePeriodValues(), steps: Int = 0, distance: Double = 0,
                walkingHours: [WalkingHourPeriodRecord] = [], dayInMonth: Int = 0,
                dayInWeek: Int = 0, malformed: Bool = false) {
        self.values = values
        self.steps = steps
        self.distance = distance
        self.walkingHours = walkingHours
        self.dayInMonth = dayInMonth
        self.dayInWeek = dayInWeek
        self.malformed = malformed
    }
}

/// Port of `WalkingWeekPeriod`.
public struct WalkingWeekPeriod: Equatable, Sendable {
    public var values: BasePeriodValues
    public var steps: Int
    public var distance: Double
    public var walkingDays: [WalkingDayPeriod]
    public var weekInMonth: Int
    public var malformed: Bool

    public init(values: BasePeriodValues = BasePeriodValues(), steps: Int = 0, distance: Double = 0,
                walkingDays: [WalkingDayPeriod] = [], weekInMonth: Int = 0, malformed: Bool = false) {
        self.values = values
        self.steps = steps
        self.distance = distance
        self.walkingDays = walkingDays
        self.weekInMonth = weekInMonth
        self.malformed = malformed
    }
}

/// Port of `WalkingMonthPeriod`.
public struct WalkingMonthPeriod: Equatable, Sendable {
    public var values: BasePeriodValues
    public var steps: Int
    public var distance: Double
    public var walkingWeeks: [WalkingWeekPeriod]
    public var monthInYear: Int
    public var malformed: Bool

    public init(values: BasePeriodValues = BasePeriodValues(), steps: Int = 0, distance: Double = 0,
                walkingWeeks: [WalkingWeekPeriod] = [], monthInYear: Int = 0, malformed: Bool = false) {
        self.values = values
        self.steps = steps
        self.distance = distance
        self.walkingWeeks = walkingWeeks
        self.monthInYear = monthInYear
        self.malformed = malformed
    }
}

/// Port of `WalkingDayPeriodFormatterImpl.formatFromRecords`.
public func formatWalkingDayPeriods(
    _ hourPeriods: [WalkingHourPeriodRecord],
    calendar: Calendar = .current
) -> [WalkingDayPeriod] {
    groupByTime(hourPeriods, grouping: .day, calendar: calendar).map { _, items in
        var day = WalkingDayPeriod(
            values: fillBasePeriod(items),
            steps: items.reduce(0) { $0 + $1.steps },
            distance: items.reduce(0.0) { $0 + $1.distance },
            walkingHours: items
        )
        day.dayInMonth = PWDate.dayOfMonth(day.values.startTime, calendar: calendar)
        day.dayInWeek = PWDate.dayInWeek(day.values.startTime, calendar: calendar)
        day.malformed = items.contains { $0.heartRate == 0 }
        // hrv override: mean of the positive hrv values (0 when none).
        let hrvs = items.map(\.hrv).filter { $0 > 0 }
        day.values.hrv = hrvs.isEmpty ? 0 : hrvs.reduce(0, +) / Float(hrvs.count)
        return day
    }
}

/// Port of `WalkingWeekPeriodFormatterImpl.formatFromRecords`.
public func formatWalkingWeekPeriods(
    _ dayPeriods: [WalkingDayPeriod],
    calendar: Calendar = .current
) -> [WalkingWeekPeriod] {
    groupByKey(dayPeriods) { PeriodGrouping.week.key($0.values.startTime, calendar: calendar) }.map { _, items in
        var week = WalkingWeekPeriod(
            values: fillBasePeriod(items.map(\.values)),
            steps: items.reduce(0) { $0 + $1.steps },
            distance: items.reduce(0.0) { $0 + $1.distance },
            walkingDays: items
        )
        week.weekInMonth = PWDate.weekOfYear(week.values.startTime, calendar: calendar)
        week.malformed = items.contains { $0.malformed }
        return week
    }
}

/// Port of `WalkingMonthPeriodFormatterImpl.formatFromRecords`.
public func formatWalkingMonthPeriods(
    _ weekPeriods: [WalkingWeekPeriod],
    calendar: Calendar = .current
) -> [WalkingMonthPeriod] {
    groupByKey(weekPeriods) { PeriodGrouping.week.key($0.values.startTime, calendar: calendar) }.map { _, items in
        var month = WalkingMonthPeriod(
            values: fillBasePeriod(items.map(\.values)),
            steps: items.reduce(0) { $0 + $1.steps },
            distance: items.reduce(0.0) { $0 + $1.distance },
            walkingWeeks: items
        )
        month.monthInYear = PWDate.month(month.values.startTime, calendar: calendar)
        month.malformed = items.contains { $0.malformed }
        return month
    }
}

// MARK: - Generic day/week/month aggregation (resting & sleep chains)

/// Day/week/month aggregation for chains without walking-specific extras
/// (resting, sleep). Sleep keeps its filler extras (majority type,
/// restless minutes).
public struct AggregatedPeriod<Child: BaseLogData> {
    public var values: BasePeriodValues
    public var children: [Child]

    public init(values: BasePeriodValues, children: [Child]) {
        self.values = values
        self.children = children
    }
}

public func aggregatePeriods<Child: BaseLogData>(
    _ inputs: [Child], grouping: PeriodGrouping,
    offsetHours: Int = 0, calendar: Calendar = .current
) -> [AggregatedPeriod<Child>] {
    groupByTime(inputs, grouping: grouping, offsetHours: offsetHours,
                calendar: calendar).map { _, items in
        AggregatedPeriod(values: fillBasePeriod(items), children: items)
    }
}

// MARK: - Base-value plumbing

private extension BasePeriodValues {
    init(of log: any BaseLogData) {
        self.init()
        startTime = log.startTime
        endTime = log.endTime
        minsInPeriod = log.minsInPeriod
        activeCalories = log.activeCalories
        bmrCalories = log.bmrCalories
        heartRate = log.heartRate
        maxHeartRate = log.maxHeartRate
        minHeartRate = log.minHeartRate
        bodyPower = log.bodyPower
        solarPower = log.solarPower
        peakTemp = 0
        hrv = log.hrv
        skinTemp = log.skinTemp
        maxSkinTemp = log.maxSkinTemp
        minSkinTemp = log.minSkinTemp
        maxCaseTemp = 0
        minCaseTemp = 0
    }
}

private func baseValues(of log: any BaseLogData) -> BasePeriodValues {
    var v = BasePeriodValues(of: log)
    // peak/case temp fields live on period records, not logs — read them
    // when the source actually has them.
    if let p = log as? WalkingHourPeriodRecord {
        v.peakTemp = p.peakTemp
        v.maxCaseTemp = p.maxCaseTemp
        v.minCaseTemp = p.minCaseTemp
    } else if let p = log as? RestingHourPeriodRecord {
        v.peakTemp = p.peakTemp
        v.maxCaseTemp = p.maxCaseTemp
        v.minCaseTemp = p.minCaseTemp
    } else if let p = log as? SleepFiveMinPeriod {
        v.peakTemp = p.peakTemp
        v.maxCaseTemp = p.maxCaseTemp
        v.minCaseTemp = p.minCaseTemp
    }
    return v
}

private func applyBase(period: inout WalkingHourPeriodRecord, values: BasePeriodValues) {
    period.startTime = values.startTime; period.endTime = values.endTime
    period.minsInPeriod = values.minsInPeriod
    period.activeCalories = values.activeCalories; period.bmrCalories = values.bmrCalories
    period.heartRate = values.heartRate
    period.maxHeartRate = values.maxHeartRate; period.minHeartRate = values.minHeartRate
    period.bodyPower = values.bodyPower; period.solarPower = values.solarPower
    period.peakTemp = values.peakTemp; period.hrv = values.hrv
    period.skinTemp = values.skinTemp
    period.maxSkinTemp = values.maxSkinTemp; period.minSkinTemp = values.minSkinTemp
    period.maxCaseTemp = values.maxCaseTemp; period.minCaseTemp = values.minCaseTemp
}

private func applyBase(period: inout RestingHourPeriodRecord, values: BasePeriodValues) {
    period.startTime = values.startTime; period.endTime = values.endTime
    period.minsInPeriod = values.minsInPeriod
    period.activeCalories = values.activeCalories; period.bmrCalories = values.bmrCalories
    period.heartRate = values.heartRate
    period.maxHeartRate = values.maxHeartRate; period.minHeartRate = values.minHeartRate
    period.bodyPower = values.bodyPower; period.solarPower = values.solarPower
    period.peakTemp = values.peakTemp; period.hrv = values.hrv
    period.skinTemp = values.skinTemp
    period.maxSkinTemp = values.maxSkinTemp; period.minSkinTemp = values.minSkinTemp
    period.maxCaseTemp = values.maxCaseTemp; period.minCaseTemp = values.minCaseTemp
}

private func applyBase(period: inout SleepFiveMinPeriod, values: BasePeriodValues) {
    period.startTime = values.startTime; period.endTime = values.endTime
    period.minsInPeriod = values.minsInPeriod
    period.activeCalories = values.activeCalories; period.bmrCalories = values.bmrCalories
    period.heartRate = values.heartRate
    period.maxHeartRate = values.maxHeartRate; period.minHeartRate = values.minHeartRate
    period.bodyPower = values.bodyPower; period.solarPower = values.solarPower
    period.peakTemp = values.peakTemp; period.hrv = values.hrv
    period.skinTemp = values.skinTemp
    period.maxSkinTemp = values.maxSkinTemp; period.minSkinTemp = values.minSkinTemp
    period.maxCaseTemp = values.maxCaseTemp; period.minCaseTemp = values.minCaseTemp
}

private func applyBase(period: inout SleepHourPeriodRecord, values: BasePeriodValues) {
    period.startTime = values.startTime; period.endTime = values.endTime
    period.minsInPeriod = values.minsInPeriod
    period.activeCalories = values.activeCalories; period.bmrCalories = values.bmrCalories
    period.heartRate = values.heartRate
    period.maxHeartRate = values.maxHeartRate; period.minHeartRate = values.minHeartRate
    period.bodyPower = values.bodyPower; period.solarPower = values.solarPower
    period.peakTemp = values.peakTemp; period.hrv = values.hrv
    period.skinTemp = values.skinTemp
    period.maxSkinTemp = values.maxSkinTemp; period.minSkinTemp = values.minSkinTemp
    period.maxCaseTemp = values.maxCaseTemp; period.minCaseTemp = values.minCaseTemp
}
