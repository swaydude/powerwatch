import Foundation

/// Turns decoded per-minute background-log samples into the hour and day
/// aggregations the UI renders.
///
/// In the Android app these are the `LogToHourGrouper1` /
/// `HourToDayGrouper1` providers plus the `*HourPeriod` / `*Period` Room
/// tables: day/week/month figures are *computed*, never stored as such, and the
/// cloud `/pwuser/{walking,resting,sleep}/day|week|month` endpoints returned the
/// same shapes. Grouping key is (start of hour, state); state comes from
/// `WatchLogType`:
///   sleepDeep / sleepLight / sleepRestless -> .sleep
///   awakeWalking / awakeRunning            -> .walking
///   everything else                        -> .resting
enum PeriodAggregator {
    static func state(for type: WatchLogType) -> ActivityLogEntry.State {
        if type.isSleep { return .sleep }
        switch type {
        case .awakeWalking, .awakeRunning: return .walking
        default: return .resting
        }
    }

    // MARK: Logs -> hour periods

    static func hourPeriods(from logs: [BackgroundLogEntry], calendar: Calendar = .current) -> [HourPeriod] {
        var buckets: [String: [BackgroundLogEntry]] = [:]
        for entry in logs {
            let hour = calendar.dateInterval(of: .hour, for: entry.startTime)?.start ?? entry.startTime
            let key = "\(hour.timeIntervalSince1970)-\(state(for: entry.logType).rawValue)"
            buckets[key, default: []].append(entry)
        }

        return buckets.values.compactMap { group -> HourPeriod? in
            guard let first = group.min(by: { $0.startTime < $1.startTime }) else { return nil }
            let state = state(for: first.logType)
            let start = calendar.dateInterval(of: .hour, for: first.startTime)?.start ?? first.startTime
            let end = calendar.date(byAdding: .hour, value: 1, to: start) ?? start

            let steps = group.reduce(0) { $0 + $1.totalSteps }
            let metres = group.reduce(0) { $0 + $1.distanceDelta }
            let active = group.reduce(0) { $0 + $1.activeCalories }
            let bmr = group.reduce(0) { $0 + $1.bmrCalories }
            let body = group.reduce(0) { $0 + $1.thermalGen }
            let solar = group.reduce(0) { $0 + $1.solarGen }

            let rates = group.map(\.heartRate)
            let skins = group.map(\.skinTempC)
            let cases = group.map(\.caseTempC)

            var period = HourPeriod(
                state: state,
                startTime: start,
                endTime: end,
                hourInDay: calendar.component(.hour, from: start),
                steps: steps,
                distance: Double(metres),
                activeCalories: active,
                bmrCalories: bmr,
                minHeartRate: rates.min() ?? 0,
                maxHeartRate: rates.max() ?? 0,
                minSkinTemp: skins.min() ?? 0,
                maxSkinTemp: skins.max() ?? 0,
                minCaseTemp: cases.min() ?? 0,
                maxCaseTemp: cases.max() ?? 0,
                bodyPower: body,
                solarPower: solar,
                minsInPeriod: group.count,
                lastUpdated: Date()
            )
            period.heartRate = average(rates)
            period.hrv = average(group.map(\.hrv))
            period.skinTemp = average(skins)
            period.caseTemp = average(cases)
            period.peakTemp = (skins.max() ?? 0) > (cases.max() ?? 0) ? (skins.max() ?? 0) : (cases.max() ?? 0)

            if state == .sleep {
                period.sleepType = dominantSleepType(in: group)
                if period.sleepType == .restless { period.restlessMinutes = group.count }
            }
            return period
        }
        .sorted { $0.startTime < $1.startTime }
    }

    /// Hour periods -> the per-hour rows the Room log tables would hold.
    static func activityLogs(from logs: [BackgroundLogEntry],
                             calendar: Calendar = .current) -> [ActivityLogEntry] {
        hourPeriods(from: logs, calendar: calendar).map { period in
            var entry = ActivityLogEntry(
                state: period.state,
                startTime: period.startTime,
                endTime: period.endTime,
                steps: period.steps,
                distance: period.distance,
                activeCalories: period.activeCalories,
                bmrCalories: period.bmrCalories,
                heartRate: Int(period.heartRate.rounded()),
                minHeartRate: period.minHeartRate,
                maxHeartRate: period.maxHeartRate,
                hrv: period.hrv,
                skinTemp: period.skinTemp,
                minSkinTemp: period.minSkinTemp,
                maxSkinTemp: period.maxSkinTemp,
                caseTemp: period.caseTemp,
                minCaseTemp: period.minCaseTemp,
                maxCaseTemp: period.maxCaseTemp,
                bodyPower: period.bodyPower,
                solarPower: period.solarPower,
                sleepType: period.sleepType,
                restlessMinutes: period.restlessMinutes,
                minsInPeriod: period.minsInPeriod,
                shouldSend: true
            )
            entry.email = ""
            return entry
        }
    }

    // MARK: Hour periods -> day period

    /// `HourToDayGrouper1`: sums the counters and averages the rates by minutes
    /// in period.
    static func dayPeriod(from hours: [HourPeriod]) -> DayPeriod {
        guard let first = hours.min(by: { $0.startTime < $1.startTime }) else {
            return DayPeriod(startTime: .distantPast, endTime: .distantPast)
        }
        let start = first.startTime
        let end = hours.map(\.endTime).max() ?? start

        var day = DayPeriod(
            startTime: start,
            endTime: end,
            steps: hours.reduce(0) { $0 + $1.steps },
            distance: hours.reduce(0) { $0 + $1.distance },
            activeCalories: hours.reduce(0) { $0 + $1.activeCalories },
            bmrCalories: hours.reduce(0) { $0 + $1.bmrCalories },
            minHeartRate: hours.map(\.minHeartRate).filter { $0 > 0 }.min() ?? 0,
            maxHeartRate: hours.map(\.maxHeartRate).max() ?? 0,
            bodyPower: hours.reduce(0) { $0 + $1.bodyPower },
            solarPower: hours.reduce(0) { $0 + $1.solarPower },
            hours: hours
        )

        let weighted = hours.filter { $0.minsInPeriod > 0 }
        day.avgHeartRate = weightedRates(weighted, keyPath: \.heartRate)
        day.avgHRV = weightedRates(weighted, keyPath: \.hrv)
        day.avgSkinTemp = weightedRates(weighted, keyPath: \.skinTemp)
        day.minSkinTemp = weighted.compactMap { $0.minSkinTemp > 0 ? $0.minSkinTemp : nil }.min() ?? 0
        day.maxSkinTemp = weighted.map(\.maxSkinTemp).max() ?? 0

        let sleeping = hours.filter { $0.state == .sleep }
        day.sleepingMinutes = sleeping.reduce(0) { $0 + $1.minsInPeriod }
        day.restlessMinutes = sleeping.filter { $0.sleepType == .restless }.reduce(0) { $0 + $1.minsInPeriod }
        day.lightMinutes = sleeping.filter { $0.sleepType == .light }.reduce(0) { $0 + $1.minsInPeriod }
        day.deepMinutes = sleeping.filter { $0.sleepType == .deep }.reduce(0) { $0 + $1.minsInPeriod }
        day.awakeMinutes = hours.filter { $0.state == .resting }.reduce(0) { $0 + $1.minsInPeriod }
        day.wentToBed = sleeping.map(\.startTime).min()
        day.wokeUp = sleeping.map(\.endTime).max()
        return day
    }

    // MARK: Activity sessions

    /// Both marker timestamps are a `u32` epoch off the wire (`Gen2Commands` reads
    /// `w[2]` with no sanity window), so a spoofed marker pair is the only limit on how
    /// far apart they can be. `duration` drives the per-10-minute split array below, so
    /// an unchecked pair is an allocation the peripheral chooses — reject instead (H1).
    private static let maxSessionDuration: TimeInterval = 24 * 60 * 60
    /// A marker stamped outside this band around the phone's clock is corrupt or hostile,
    /// not a workout: `u32` epochs reach 2106 and negatives reach 1901.
    private static let maxSessionClockSkew: TimeInterval = 365 * 24 * 60 * 60

    /// Pairs `9215` start/end markers by `activityId` and folds the `9205`
    /// deltas that fall inside the window into per-session samples.
    static func sessions(headers: [ActivityHeaderDecoder.Marker],
                         deltas: [ActivityDeltaDecoder.Record],
                         now: Date = Date()) -> [UserActivitySession] {
        let starts = headers.filter { !$0.isEnd }
        let ends = headers.filter { $0.isEnd }

        return starts.compactMap { start in
            guard let end = ends.first(where: { $0.activityId == start.activityId }) else { return nil }
            let span = end.time.timeIntervalSince(start.time)
            guard span >= 0, span <= Self.maxSessionDuration,
                  abs(start.time.timeIntervalSince(now)) <= Self.maxSessionClockSkew,
                  abs(end.time.timeIntervalSince(now)) <= Self.maxSessionClockSkew else {
                NSLog("pw2-sync rejected session %d: span %.0fs outside %.0f..%.0f of the phone clock",
                      start.activityId, span, -Self.maxSessionClockSkew, Self.maxSessionClockSkew)
                return nil
            }
            let duration = max(60, span)
            let steps = max(0, start.startStepsWalk)
            let metres = max(0, end.logDistance)
            let type = UserActivityType.from(watchType: start.activityType)
            let distance = Double(metres)

            let rates = deltas.prefix(min(deltas.count, Int(duration / 60))).enumerated().map { index, record in
                HeartRateSample(
                    startTime: start.time.addingTimeInterval(TimeInterval(index) * 60),
                    value: record.deltaHeartRate
                )
            }
            let splits: [RunningSplit] = stride(from: 0.0, to: duration, by: 600).map {
                RunningSplit(splitDuration: min(600, duration - $0))
            }
            let positions = gpsTrail(from: start, to: end, deltas: deltas)

            return UserActivitySession(
                id: "watch-\(start.activityId)-\(Int(start.time.timeIntervalSince1970))",
                name: type.displayName,
                activityType: type,
                locationName: "",
                distance: distance,
                steps: steps,
                startTime: start.time,
                endTime: end.time,
                pace: steps > 0 ? duration / Double(steps) : 0,
                activeCalories: end.activeCalories,
                bmrCalories: Int((duration / 60) * 1.1),
                splits: splits,
                gpsPositions: positions,
                heartRates: rates,
                notes: ""
            )
        }
    }

    /// The delta log stores per-sample GPS *byte* deltas, so the trail is
    /// reconstructed by walking them from the header's absolute fix.
    private static func gpsTrail(from start: ActivityHeaderDecoder.Marker,
                                 to end: ActivityHeaderDecoder.Marker,
                                 deltas: [ActivityDeltaDecoder.Record]) -> [GPSPosition] {
        guard !deltas.isEmpty else {
            return [GPSPosition(latitude: start.latitude, longitude: start.longitude, altitude: start.altitude)]
        }
        var positions: [GPSPosition] = []
        var lat = start.latitude
        var lon = start.longitude
        positions.append(GPSPosition(latitude: lat, longitude: lon, altitude: start.altitude))
        for record in deltas {
            // Deltas are signed bytes off the wire and nothing in the APK bounds the
            // running total, so a crafted stream walks the coordinate off to infinity
            // and lands there in the preview and the exported file. Saturate instead.
            let dLat = Double(record.deltaGPSLatByte > 127 ? record.deltaGPSLatByte - 256 : record.deltaGPSLatByte) / 100_000
            let dLon = Double(record.deltaGPSLongByte > 127 ? record.deltaGPSLongByte - 256 : record.deltaGPSLongByte) / 100_000
            lat = min(90, max(-90, lat + dLat))
            lon = min(180, max(-180, lon + dLon))
            positions.append(GPSPosition(latitude: lat, longitude: lon, altitude: start.altitude))
        }
        return positions
    }

    // MARK: helpers

    private static func average(_ values: [Int]) -> Double {
        guard !values.isEmpty else { return 0 }
        return Double(values.reduce(0, +)) / Double(values.count)
    }

    private static func average(_ values: [Double]) -> Double {
        guard !values.isEmpty else { return 0 }
        return values.reduce(0, +) / Double(values.count)
    }

    private static func weightedRates(_ hours: [HourPeriod], keyPath: KeyPath<HourPeriod, Double>) -> Double {
        let total = hours.reduce(0) { $0 + $1.minsInPeriod }
        guard total > 0 else { return 0 }
        let sum = hours.reduce(0.0) { $0 + ($1[keyPath: keyPath] * Double($1.minsInPeriod)) }
        return sum / Double(total)
    }

    /// Sleep classification written by `Gen2BackgroundLogCommand.extractResponse`
    /// (Deep -> 5, Light -> 3, Restless -> 1); the hour row takes the majority.
    private static func dominantSleepType(in group: [BackgroundLogEntry]) -> SleepType {
        let counts = Dictionary(grouping: group.map { $0.logType.sleepClassification }, by: { $0 })
            .mapValues { $0.count }
        switch counts.max(by: { $0.value < $1.value })?.key {
        case 5: return .deep
        case 3: return .light
        case 1: return .restless
        default: return .awake
        }
    }
}
