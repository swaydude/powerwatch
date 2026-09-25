import Foundation

/// Builds activity sessions out of the three activity log families, porting
/// Android's `ActivityLogExtensionsKt.exportPaired`, `Gen2ExecutorImpl
/// .reformatDataLogs` and `RunningSessionActivityFormatter.format`.
///
/// The watch reports a session as a start marker and an end marker (both from
/// the `9215` header block, paired by activity id) plus the per-minute delta
/// records (`9205`) that fall between the two markers' log indexes.
public enum ActivitySessionBuilder {

    /// Sessions in start-marker order, ready for `upsertActivitySession`.
    ///
    /// Deviations from Android, both deliberate:
    /// - a start marker with no matching end marker is dropped (Android keeps
    ///   it and then dereferences a null end log);
    /// - the delta range is clamped to the received records (Android's
    ///   `subList(start, endLogIndex + 1)` can run one past the end).
    public static func buildSessions(starts: [ActivityStartLogEntry],
                                     ends: [ActivityEndLogEntry],
                                     deltas: [ActivityDeltaLogEntry],
                                     email: String = "") -> [UserActivitySessionRecord] {
        var sessions: [UserActivitySessionRecord] = []
        for start in starts {
            guard let end = ends.first(where: { $0.activityId == start.activityId }) else {
                continue
            }
            sessions.append(session(start: start, end: end,
                                    deltas: deltaLogs(start: start, end: end, deltas: deltas),
                                    email: email))
        }
        return sessions
    }

    /// `extractDeltaLogs`: only a session whose start marker carries a fix
    /// claims delta records, and it claims the inclusive index range the two
    /// markers announce.
    static func deltaLogs(start: ActivityStartLogEntry, end: ActivityEndLogEntry,
                          deltas: [ActivityDeltaLogEntry]) -> [ActivityDeltaLogEntry] {
        guard !start.startLatitude.isNaN, start.startLogIndex >= 0, !deltas.isEmpty else {
            return []
        }
        let upper = min(end.endLogIndex, deltas.count - 1)
        guard start.startLogIndex <= upper else { return [] }
        return Array(deltas[start.startLogIndex...upper])
    }

    /// `reformatDataLogs` + `RunningSessionActivityFormatter.format`. Timestamps
    /// arrive in epoch seconds and become epoch millis, exactly as Android's
    /// `* 1000` does; the GPS position drifts forward by each delta's
    /// hundred-thousandth-of-a-degree offset.
    static func session(start: ActivityStartLogEntry, end: ActivityEndLogEntry,
                        deltas: [ActivityDeltaLogEntry],
                        email: String) -> UserActivitySessionRecord {
        let startMs = Int64(start.startTime) * 1000
        let endMs = Int64(end.endLogTime) * 1000

        var splits: [RunningSplit] = []
        var positions: [GPSPosition] = []
        var rates: [HeartRate] = []
        if !start.startLatitude.isNaN {
            positions.append(GPSPosition(longitude: Double(start.startLongitude),
                                         latitude: Double(start.startLatitude),
                                         altitude: Double(start.startAltitude),
                                         speed: 0, timestamp: startMs))
            rates.append(HeartRate(beatsPerMinute: start.startHeartRate,
                                   startTime: startMs, endTime: startMs + 1000))
            splits.append(RunningSplit(distance: Double(start.startLogDistance), period: 1000))

            var latitude = Double(start.startLatitude)
            var longitude = Double(start.startLongitude)
            var altitude = Double(start.startAltitude)
            for (offset, delta) in deltas.enumerated() {
                let timestamp = (Int64(start.startTime) + Int64(offset + 1)) * 1000
                latitude += Double(delta.deltaGPSLat) / 100_000
                longitude += Double(delta.deltaGPSLong) / 100_000
                altitude += Double(delta.deltaAltitude)
                positions.append(GPSPosition(longitude: longitude, latitude: latitude,
                                             altitude: altitude, speed: 0,
                                             timestamp: timestamp))
                rates.append(HeartRate(beatsPerMinute: delta.deltaHeartRate,
                                       startTime: timestamp, endTime: timestamp + 1000))
                splits.append(RunningSplit(distance: Double(delta.deltaDistance), period: 1000))
            }
        }

        return UserActivitySessionRecord(
            id: "\(email)_\(startMs)",
            name: displayName(for: start.type),
            activityType: typeName(for: start.type),
            locationName: "",
            distance: Double(end.endLogDistance - start.startLogDistance),
            steps: end.endStepsRunning + end.endStepsWalk,
            startTime: startMs,
            endTime: endMs,
            pace: 0,
            activeCalories: end.endActiveCals + end.endBMRCals,
            bmrCalories: 0,
            splits: encode(splits),
            gpsPositions: encode(positions),
            heartRates: encode(rates),
            notes: "",
            // Already-synced data has nothing to upload (Android passes false).
            shouldSend: false,
            email: email)
    }

    /// `UserActivityType` names, stored verbatim as Android's Room converter does.
    public static func typeName(for activity: ActivityType) -> String {
        switch activity {
        case .stationary: return "ACTIVITY_STATIONARY"
        case .walking: return "ACTIVITY_WALKING"
        case .running: return "ACTIVITY_RUNNING"
        case .jogging: return "ACTIVITY_JOGGING"
        case .biking: return "ACTIVITY_BIKING"
        case .driving: return "ACTIVITY_DRIVING"
        case .indoorWalking: return "ACTIVITY_INDOOR_WALKING"
        case .indoorRunning: return "ACTIVITY_INDOOR_RUNNING"
        case .indoorJogging: return "ACTIVITY_INDOOR_JOGGING"
        case .indoorBiking: return "ACTIVITY_INDOOR_BIKING"
        case .hiit: return "ACTIVITY_HIIT"
        case .unknown: return "ACTIVITY_UNKNOWN"
        }
    }

    /// `mapActivityTypeToName` over the English strings Android ships.
    public static func displayName(for activity: ActivityType) -> String {
        switch activity {
        case .stationary: return "Stationary"
        case .walking: return "Outdoor Walk"
        case .running: return "Outdoor Run"
        case .jogging: return "Outdoor Jog"
        case .biking: return "Outdoor Cycle"
        case .driving: return "Driving"
        case .indoorWalking: return "Indoor Walk"
        case .indoorRunning: return "Indoor Run"
        case .indoorJogging: return "Indoor Jog"
        case .indoorBiking: return "Indoor Cycle"
        case .hiit: return "Interval Training"
        case .unknown: return "Unknown"
        }
    }

    private static func encode<T: Encodable>(_ value: T) -> String {
        guard let data = try? JSONEncoder().encode(value),
              let json = String(data: data, encoding: .utf8) else { return "[]" }
        return json
    }
}
