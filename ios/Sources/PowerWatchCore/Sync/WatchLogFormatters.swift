import Foundation

// Port of `WatchEntryToWalkingFormatter` / `WatchEntryToRestingFormatter` /
// `WatchEntryToSleepFormatter` (`shared/data/logPeriodsFormatters/
// WatchEntryToLogFormatter.kt`). They split one stream of timestamped
// background-log entries into the three Room log tables:
//
// - walking:  walkingSteps > 0 && !isSleep
// - resting:  walkingSteps == 0 && !isSleep
// - sleep:    isSleep (state 1 → restless, 3 → light, 5 → deep, else awake)
//
// Gen2 semantics (this watch): each entry covers [timestamp, timestamp+60 s);
// calories are NOT rescaled (the Gen1 `×1000` branch is dropped).

/// Formatted sync results ready to upsert into the Room tables.
public struct FormattedWatchLogs: Equatable, Sendable {
    public var walking: [WalkingLogRecord]
    public var resting: [RestingLogRecord]
    public var sleep: [SleepLogRecord]

    public init(walking: [WalkingLogRecord] = [], resting: [RestingLogRecord] = [],
                sleep: [SleepLogRecord] = []) {
        self.walking = walking
        self.resting = resting
        self.sleep = sleep
    }

    public var isEmpty: Bool { walking.isEmpty && resting.isEmpty && sleep.isEmpty }
}

public enum WatchLogFormatters {

    /// `WatchEntryToWalkingFormatter.format` (Gen2 branch). The Android code
    /// iterates the REVERSED entry list; the filter is walkingSteps > 0 and
    /// not sleep. min/max heart rate mirror the pulse value.
    public static func formatWalkingLogs(_ entries: [WatchLogEntry]) -> [WalkingLogRecord] {
        entries.reversed().compactMap { entry -> WalkingLogRecord? in
            guard entry.walkStepDelta + entry.runningStepDelta > 0, !entry.isSleep else {
                return nil
            }
            let startTime = entry.timestamp
            let endTime = startTime + 60_000
            let steps = entry.walkStepDelta + entry.runningStepDelta
            let mins = Int((Double(endTime - startTime) / 60_000.0).rounded())
            return WalkingLogRecord(
                startTime: startTime,
                steps: steps,
                distance: Double(entry.distanceDelta),
                endTime: endTime,
                heartRate: Float(entry.heartRate),
                bodyPower: Float(entry.powerLog.thermalGen),
                solarPower: Float(entry.powerLog.solarGen),
                skinTemp: Float(entry.powerLog.skinTemp),
                caseTemp: Float(entry.powerLog.caseTemp),
                activeCalories: entry.activeCalories,
                hrv: Float(entry.hrv),
                shouldSend: true,
                bmrCalories: entry.bmrCalories,
                minHeartRate: entry.heartRate,
                maxHeartRate: entry.heartRate,
                minsInPeriod: mins)
        }
    }

    /// `WatchEntryToRestingFormatter.format` (Gen2 branch) — walkingSteps
    /// == 0 and not sleep.
    public static func formatRestingLogs(_ entries: [WatchLogEntry]) -> [RestingLogRecord] {
        entries.reversed().compactMap { entry -> RestingLogRecord? in
            guard entry.walkStepDelta + entry.runningStepDelta == 0, !entry.isSleep else {
                return nil
            }
            let startTime = entry.timestamp
            let endTime = startTime + 60_000
            let mins = Int((Double(endTime - startTime) / 60_000.0).rounded())
            return RestingLogRecord(
                startTime: startTime,
                endTime: endTime,
                heartRate: Float(entry.heartRate),
                bodyPower: Float(entry.powerLog.thermalGen),
                solarPower: Float(entry.powerLog.solarGen),
                skinTemp: Float(entry.powerLog.skinTemp),
                caseTemp: Float(entry.powerLog.caseTemp),
                activeCalories: entry.activeCalories,
                hrv: Float(entry.hrv),
                shouldSend: true,
                bmrCalories: entry.bmrCalories,
                minHeartRate: entry.heartRate,
                maxHeartRate: entry.heartRate,
                minsInPeriod: mins)
        }
    }

    /// `WatchEntryToSleepFormatter.format` (Gen2 branch) — sleep-state
    /// mapping 1 → RESTLESS, 3 → LIGHT, 5 → DEEP, else SLEEP_AWAKE.
    public static func formatSleepLogs(_ entries: [WatchLogEntry]) -> [SleepLogRecord] {
        entries.reversed().compactMap { entry -> SleepLogRecord? in
            guard entry.isSleep else { return nil }
            let startTime = entry.timestamp
            let endTime = startTime + 60_000
            let mins = Int((Double(endTime - startTime) / 60_000.0).rounded())
            return SleepLogRecord(
                startTime: startTime,
                endTime: endTime,
                heartRate: Float(entry.heartRate),
                bodyPower: Float(entry.powerLog.thermalGen),
                solarPower: Float(entry.powerLog.solarGen),
                skinTemp: Float(entry.powerLog.skinTemp),
                caseTemp: Float(entry.powerLog.caseTemp),
                activeCalories: entry.activeCalories,
                sleepType: Self.sleepType(forState: entry.sleepQuality),
                hrv: Float(entry.hrv),
                shouldSend: true,
                bmrCalories: entry.bmrCalories,
                minHeartRate: entry.heartRate,
                maxHeartRate: entry.heartRate,
                minsInPeriod: mins)
        }
    }

    /// The watch's sleep-state word → `SleepType`.
    public static func sleepType(forState state: Int) -> SleepType {
        switch state {
        case 1: return .restless
        case 3: return .light
        case 5: return .deep
        default: return .awake
        }
    }

    /// Convenience: all three formatters at once.
    public static func format(_ entries: [WatchLogEntry]) -> FormattedWatchLogs {
        FormattedWatchLogs(
            walking: formatWalkingLogs(entries),
            resting: formatRestingLogs(entries),
            sleep: formatSleepLogs(entries))
    }
}
