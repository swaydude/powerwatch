import Foundation

/// Decoded data structures for watch log responses. Field names mirror the
/// Android data classes.

/// Log counts (response to `9116`). Ported from `Gen2LogsCount`.
public struct Gen2LogsCount: Equatable, Sendable {
    public var realtimeStatusLogs: Int
    public var realtimeLogs: Int
    public var activityHeaderLogs: Int
    public var activityStartLogs: Int
    public var activityEndLogs: Int
    public var activityDeltaLogs: Int
    public var backgroundLogs: Int
    public var sleepLogs: Int

    public init(
        realtimeStatusLogs: Int = 0, realtimeLogs: Int = 0, activityHeaderLogs: Int = 0,
        activityStartLogs: Int = 0, activityEndLogs: Int = 0, activityDeltaLogs: Int = 0,
        backgroundLogs: Int = 0, sleepLogs: Int = 0
    ) {
        self.realtimeStatusLogs = realtimeStatusLogs
        self.realtimeLogs = realtimeLogs
        self.activityHeaderLogs = activityHeaderLogs
        self.activityStartLogs = activityStartLogs
        self.activityEndLogs = activityEndLogs
        self.activityDeltaLogs = activityDeltaLogs
        self.backgroundLogs = backgroundLogs
        self.sleepLogs = sleepLogs
    }
}

/// One sleep session. Ported from `Gen2SleepEntryLog`.
public struct SleepEntryLog: Equatable, Sendable {
    public var startSleepTime: Int
    public var endSleepTime: Int
    public var hoursSlept: Int
    public var minutesSlept: Int
    public var percentRestless: Int
    public var percentLightSleep: Int
    public var percentDeepSleep: Int
    public var sleepQuality: Int
}

/// Power telemetry packed in each background log entry. Ported from
/// `WatchPowerLog`.
public struct WatchPowerLog: Equatable, Sendable {
    public var caseTemp: Int
    public var skinTemp: Int
    public var thermalGen: Int
    public var solarGen: Int
    public var powerConsumed: Int
}

/// One 60-second background sample. Ported from `Gen2BackgroundLog`.
public struct BackgroundLogEntry: Equatable, Sendable {
    public var logType: LogType
    public var logTimeIndex: Int
    public var walkStepDelta: Int
    public var runningStepDelta: Int
    public var distanceDelta: Int
    public var battery: Int
    public var activeCalories: Int
    public var bmrCalories: Int
    public var heartRate: Int
    public var powerLog: WatchPowerLog
    public var hrv: Int
}

/// Normalized background entry stored for the dashboard. Ported from
/// `WatchLogEntry` (the `isSleep` / quality / timestamp derived form).
public struct WatchLogEntry: Equatable, Sendable {
    public var isSleep: Bool
    public var timestamp: Int64      // epoch milliseconds
    public var sleepQuality: Int     // 5 deep, 3 light, 1 restless, 0 other
    public var battery: Int
    public var activeCalories: Int
    public var bmrCalories: Int
    public var hrv: Int
    public var heartRate: Int
    public var walkStepDelta: Int
    public var runningStepDelta: Int
    public var distanceDelta: Int
    public var powerLog: WatchPowerLog
}

/// One 12-byte activity delta record. Ported from `Gen2ActivityDeltaLog`.
public struct ActivityDeltaLogEntry: Equatable, Sendable {
    public var type: ActivityType
    public var deltaStep: Int
    public var deltaRunningStepCount: Int
    public var deltaDistance: Int
    public var deltaCalsActive: Int
    public var deltaCalsBRM: Int
    public var deltaGPSLat: Int8
    public var deltaGPSLong: Int8
    public var deltaSkinTemp: Int
    public var deltaCaseTemp: Int
    public var deltaHeartRate: Int
    public var deltaHRV: Int
    public var deltaThermalGen: Int
    public var deltaSolarGen: Int
    public var deltaPowerConsumed: Int
    public var deltaAltitude: Int
}

/// Realtime totals (response to `9104`). Ported from `RealtimeData`.
public struct RealtimeData: Equatable, Sendable {
    public var timestamp: Int
    public var currentSteps: Int
    public var currentDistance: Int
    public var currentCalories: Int

    public init(timestamp: Int, currentSteps: Int, currentDistance: Int, currentCalories: Int) {
        self.timestamp = timestamp
        self.currentSteps = currentSteps
        self.currentDistance = currentDistance
        self.currentCalories = currentCalories
    }
}

/// The watch's own running totals, read from the serial characteristic
/// (`00002a25`) rather than over DTP. Ported from `RealtimeDataParser` +
/// `HSMTable`; this is what the watch face itself shows.
public struct LiveTotals: Equatable, Sendable {
    public var totalSteps: Int
    public var activeCalories: Int
    public var sleepMinutes: Int
    public var distanceMetres: Int
    public var solarPower: Int
    public var thermalPower: Int
    public var batteryPercent: Int
    public var skinTemp: Int

    public init(totalSteps: Int, activeCalories: Int, sleepMinutes: Int, distanceMetres: Int,
                solarPower: Int, thermalPower: Int, batteryPercent: Int, skinTemp: Int) {
        self.totalSteps = totalSteps
        self.activeCalories = activeCalories
        self.sleepMinutes = sleepMinutes
        self.distanceMetres = distanceMetres
        self.solarPower = solarPower
        self.thermalPower = thermalPower
        self.batteryPercent = batteryPercent
        self.skinTemp = skinTemp
    }
}

/// Activity session start marker (response to `9115`). Ported from
/// `Gen2ActivityStartLog` — a 48-byte little-endian record.
public struct ActivityStartLogEntry: Equatable, Sendable {
    public var type: ActivityType
    public var activityId: Int          // always 0 on the wire (Android passes a literal)
    public var startTime: Int
    public var startLogIndex: Int
    public var startLatitude: Float
    public var startLongitude: Float
    public var startAltitude: Float    // always 0 on the wire
    public var startLogDistance: Int
    public var startStepsWalk: Int
    public var startStepsRunning: Int
    public var startActiveCals: Int
    public var startBMRCals: Int
    public var startHeartRate: Int
    public var startHRV: Int
    public var activityValue2: Int
    public var powerLog: WatchPowerLog
}

/// Activity session end marker (response to `9125`). Ported from
/// `Gen2ActivityEndLog` — a 48-byte little-endian record.
public struct ActivityEndLogEntry: Equatable, Sendable {
    public var activityId: Int          // always 0 on the wire
    public var endLogTime: Int
    public var endLogIndex: Int
    public var endLogDistance: Int
    public var endStepsWalk: Int
    public var endStepsRunning: Int
    public var endActiveCals: Int
    public var endBMRCals: Int
    public var endHeartRate: Int
    public var endHRV: Int
    public var endThermalGen: Int
    public var endSolarGen: Int
    public var endPowerConsumed: Int
    public var endSkinTemp: Int
    public var endCaseTemp: Int
    public var endLatitude: Float
    public var endLongitude: Float
    public var endAltitude: Int        // always 0 on the wire
    public var endActivityValue1: Int
    public var endActivityValue2: Int
}

/// Both halves of the `9215` ActivityHeaderLogVer3 block, kept together
/// because the watch interleaves start and end markers in one stream.
public struct Ver3ActivityHeaderLogs: Equatable, Sendable {
    public var starts: [ActivityStartLogEntry]
    public var ends: [ActivityEndLogEntry]

    public init(starts: [ActivityStartLogEntry] = [], ends: [ActivityEndLogEntry] = []) {
        self.starts = starts
        self.ends = ends
    }
}

/// Response parsers. Each mirrors the `extractResponse` of the corresponding
/// Android command class.
public enum LogParsers {

    /// Response to `9116` GetLogCount: 28 bytes = 7 big-endian UInt32s
    /// (`realtimeStatus, realtime, activityStart, activityEnd, activityDelta,
    /// background, sleep`). The Android constructor takes the header count
    /// as a literal `0`.
    public static func parseLogCount(_ payload: [UInt8]) throws -> Gen2LogsCount {
        guard payload.count == 28 else {
            throw DTPProtocolError.parseError("log count payload is \(payload.count) bytes, expected 28")
        }
        var reader = ByteReader(payload)
        let realtimeStatus = Int(try reader.readUInt32BE())
        let realtime = Int(try reader.readUInt32BE())
        let activityStart = Int(try reader.readUInt32BE())
        let activityEnd = Int(try reader.readUInt32BE())
        let activityDelta = Int(try reader.readUInt32BE())
        let background = Int(try reader.readUInt32BE())
        let sleep = Int(try reader.readUInt32BE())
        return Gen2LogsCount(
            realtimeStatusLogs: realtimeStatus,
            realtimeLogs: realtime,
            activityHeaderLogs: 0,
            activityStartLogs: activityStart,
            activityEndLogs: activityEnd,
            activityDeltaLogs: activityDelta,
            backgroundLogs: background,
            sleepLogs: sleep)
    }

    /// Response to `9108` SleepLog: 16-byte little-endian records.
    public static func parseSleepLogs(_ payload: [UInt8]) throws -> [SleepEntryLog] {
        guard payload.count % 16 == 0 else {
            throw DTPProtocolError.parseError("sleep payload not a multiple of 16 bytes")
        }
        var reader = ByteReader(payload)
        var entries: [SleepEntryLog] = []
        while reader.remaining >= 16 {
            let record = try reader.readBytes(16)
            var rec = ByteReader(record)
            let w1 = try rec.readUInt32LE()
            let w2 = try rec.readUInt32LE()
            let w3 = try rec.readUInt32LE()
            let w4 = try rec.readUInt32LE()
            entries.append(SleepEntryLog(
                startSleepTime: Int(w1),
                endSleepTime: Int(w2),
                hoursSlept: Int(bits(w3, from: 0, to: 7)),
                minutesSlept: Int(bits(w3, from: 8, to: 15)),
                percentRestless: Int(bits(w3, from: 16, to: 23)),
                percentLightSleep: Int(bits(w3, from: 24, to: 31)),
                percentDeepSleep: Int(bits(w4, from: 0, to: 7)),
                sleepQuality: Int(bits(w4, from: 8, to: 15))))
        }
        return entries
    }

    /// Response to `9106` BackgroundLog: 16-byte little-endian records.
    /// Returns the raw entries; timestamp assignment happens in the sync
    /// engine (RTL-time correlation), mirroring `Gen2BackgroundLogCommand`.
    public static func parseBackgroundLogs(_ payload: [UInt8]) throws -> [BackgroundLogEntry] {
        guard payload.count % 16 == 0 else {
            throw DTPProtocolError.backgroundLogSizeMismatch
        }
        var reader = ByteReader(payload)
        var entries: [BackgroundLogEntry] = []
        while reader.remaining >= 16 {
            let record = try reader.readBytes(16)
            entries.append(try parseBackgroundRecord(record))
        }
        return entries
    }

    static func parseBackgroundRecord(_ record: [UInt8]) throws -> BackgroundLogEntry {
        var rec = ByteReader(record)
        let w1 = try rec.readUInt32LE()   // RTL index / steps / distance
        let w2 = try rec.readUInt32LE()   // calories / thermal generation
        let w3 = try rec.readUInt32LE()   // skin temp / power / heart rate / HRV
        let w4 = try rec.readUInt32LE()   // battery / solar / case temp / log type

        // Word order is `Gen2BackgroundLogCommand.parseSingleLog`'s exactly. The
        // RTL index is w1 bits 0-6 — the FIRST field, not the last: reading it
        // from the far end (where the distance lives) makes every record that
        // carries steps miss its RTL lookup and get dropped as undateable
        // (real watch 2026-09-25: 32 records / 419 steps discarded this way).
        let logTimeIndex = Int(bits(w1, from: 0, to: 6))
        let walkStepDelta = Int(bits(w1, from: 7, to: 14))
        let runningStepDelta = Int(bits(w1, from: 15, to: 22))
        let distanceDelta = Int(bits(w1, from: 23, to: 31))

        let activeCalories = Int(bits(w2, from: 0, to: 14))
        let bmrCalories = Int(bits(w2, from: 15, to: 25))
        let thermalGen = PowerTables.generation[Int(bits(w2, from: 26, to: 31))]

        let skinTemp = Int(bits(w3, from: 0, to: 8))
        let powerConsumed = PowerTables.consumption[Int(bits(w3, from: 9, to: 16))]
        let heartRate = Int(bits(w3, from: 17, to: 24))
        let hrv = Int(bits(w3, from: 25, to: 31))

        let battery = Int(bits(w4, from: 0, to: 6))
        let solarGen = PowerTables.generation[Int(bits(w4, from: 7, to: 12))]
        let caseTemp = signed9(bits(w4, from: 13, to: 21))
        let typeWord = Int(bits(w4, from: 22, to: 25))

        let logType = LogType(rawValue: typeWord) ?? .stateUnknown

        return BackgroundLogEntry(
            logType: logType,
            logTimeIndex: logTimeIndex,
            walkStepDelta: walkStepDelta,
            runningStepDelta: runningStepDelta,
            distanceDelta: distanceDelta,
            battery: battery,
            activeCalories: activeCalories,
            bmrCalories: bmrCalories,
            heartRate: heartRate,
            powerLog: WatchPowerLog(
                caseTemp: caseTemp,       // w4 bits 13-21 (9-bit signed)
                skinTemp: skinTemp,       // w3 bits 0-8
                thermalGen: thermalGen,
                solarGen: solarGen,
                powerConsumed: powerConsumed),
            hrv: hrv)
    }

    /// Converts parsed background entries into timestamped `WatchLogEntry`
    /// values. Ported from the timestamp-correlation loop of
    /// `Gen2BackgroundLogCommand.extractResponse`: each `logTimeIndex` maps to
    /// an RTL timestamp; entries within a group are spaced 60 s apart.
    public static func assignTimestamps(
        _ entries: [BackgroundLogEntry],
        rtlTimestampsByIndex: [Int: Int64]
    ) throws -> [WatchLogEntry] {
        var cursorByIndex: [Int: Int64] = [:]
        var result: [WatchLogEntry] = []
        for entry in entries {
            guard var timestamp = cursorByIndex[entry.logTimeIndex]
                ?? rtlTimestampsByIndex[entry.logTimeIndex] else {
                throw DTPProtocolError.invalidBackgroundLogTimestampIndex
            }
            result.append(WatchLogEntry(
                isSleep: entry.logType.isSleep,
                timestamp: timestamp,
                sleepQuality: entry.logType.watchLogSleepQuality,
                battery: entry.battery,
                activeCalories: entry.activeCalories,
                bmrCalories: entry.bmrCalories,
                hrv: entry.hrv,
                heartRate: entry.heartRate,
                walkStepDelta: entry.walkStepDelta,
                runningStepDelta: entry.runningStepDelta,
                distanceDelta: entry.distanceDelta,
                powerLog: entry.powerLog))
            timestamp += 60_000
            cursorByIndex[entry.logTimeIndex] = timestamp
        }
        return result
    }

    /// Best-effort variant of `assignTimestamps`: date every entry whose RTL
    /// index resolves and report how many did not, instead of failing the whole
    /// block on the first miss.
    ///
    /// Android throws (`InvalidBackLogTimestampIndex`) at the first unresolved
    /// index, which discards a pull wholesale — and because the watch is cleaned
    /// right after, the discarded minutes are gone for good (real device
    /// 2026-09-25: a block carrying 419 steps lost because four of its fifty
    /// records pointed at a slot `9117` never answered). Nothing is invented
    /// here; entries whose index has no time are simply returned unsent.
    public static func assignTimestampsSkippingUndateable(
        _ entries: [BackgroundLogEntry],
        rtlTimestampsByIndex: [Int: Int64]
    ) -> (dated: [WatchLogEntry], undateable: Int) {
        var cursorByIndex: [Int: Int64] = [:]
        var dated: [WatchLogEntry] = []
        var undateable = 0
        for entry in entries {
            guard var timestamp = cursorByIndex[entry.logTimeIndex]
                ?? rtlTimestampsByIndex[entry.logTimeIndex] else {
                undateable += 1
                continue
            }
            dated.append(WatchLogEntry(
                isSleep: entry.logType.isSleep,
                timestamp: timestamp,
                sleepQuality: entry.logType.watchLogSleepQuality,
                battery: entry.battery,
                activeCalories: entry.activeCalories,
                bmrCalories: entry.bmrCalories,
                hrv: entry.hrv,
                heartRate: entry.heartRate,
                walkStepDelta: entry.walkStepDelta,
                runningStepDelta: entry.runningStepDelta,
                distanceDelta: entry.distanceDelta,
                powerLog: entry.powerLog))
            timestamp += 60_000
            cursorByIndex[entry.logTimeIndex] = timestamp
        }
        return (dated, undateable)
    }

    /// Response to `9105` ActivityDeltaLog: 12-byte little-endian records.
    public static func parseActivityDeltaLogs(_ payload: [UInt8]) throws -> [ActivityDeltaLogEntry] {
        guard payload.count % 12 == 0 else {
            throw DTPProtocolError.activityDeltaLogSizeMismatch
        }
        var reader = ByteReader(payload)
        var entries: [ActivityDeltaLogEntry] = []
        while reader.remaining >= 12 {
            let record = try reader.readBytes(12)
            entries.append(try parseActivityDeltaRecord(record))
        }
        return entries
    }

    static func parseActivityDeltaRecord(_ record: [UInt8]) throws -> ActivityDeltaLogEntry {
        var rec = ByteReader(record)
        let w1 = try rec.readUInt32LE()
        let w2 = try rec.readUInt32LE()
        let w3 = try rec.readUInt32LE()

        let type = ActivityType(rawValue: Int(bits(w1, from: 0, to: 4))) ?? .unknown

        return ActivityDeltaLogEntry(
            type: type,
            deltaStep: Int(bits(w2, from: 25, to: 27)),
            deltaRunningStepCount: Int(bits(w1, from: 5, to: 7)),
            deltaDistance: Int(bits(w1, from: 8, to: 13)),
            deltaCalsActive: Int(bits(w1, from: 14, to: 15)),
            deltaCalsBRM: Int(bits(w1, from: 16, to: 17)),
            deltaGPSLat: Int8(truncatingIfNeeded: bits(w3, from: 15, to: 22)),
            deltaGPSLong: Int8(truncatingIfNeeded: bits(w3, from: 23, to: 30)),
            deltaSkinTemp: Int(bits(w1, from: 26, to: 29)),
            deltaCaseTemp: Int(bits(w2, from: 0, to: 3)),
            deltaHeartRate: Int(bits(w2, from: 4, to: 11)),
            deltaHRV: Int(bits(w2, from: 12, to: 18)),
            deltaThermalGen: Int(bits(w2, from: 19, to: 21)),
            deltaSolarGen: Int(bits(w2, from: 22, to: 24)),
            deltaPowerConsumed: Int(bits(w3, from: 0, to: 14)),
            deltaAltitude: 0)
    }

    /// Response to `9126` Ver3GetLogCount: 24 bytes = 6 big-endian UInt32s
    /// (`realtimeStatus, realtime, activityHeader, activityDelta, background,
    /// sleep`). The Android constructor passes literal `0` for the start and
    /// end log counts.
    public static func parseVer3LogCount(_ payload: [UInt8]) throws -> Gen2LogsCount {
        guard payload.count == 24 else {
            throw DTPProtocolError.parseError("ver3 log count payload is \(payload.count) bytes, expected 24")
        }
        var reader = ByteReader(payload)
        let realtimeStatus = Int(try reader.readUInt32BE())
        let realtime = Int(try reader.readUInt32BE())
        let activityHeader = Int(try reader.readUInt32BE())
        let activityDelta = Int(try reader.readUInt32BE())
        let background = Int(try reader.readUInt32BE())
        let sleep = Int(try reader.readUInt32BE())
        return Gen2LogsCount(
            realtimeStatusLogs: realtimeStatus,
            realtimeLogs: realtime,
            activityHeaderLogs: activityHeader,
            activityStartLogs: 0,
            activityEndLogs: 0,
            activityDeltaLogs: activityDelta,
            backgroundLogs: background,
            sleepLogs: sleep)
    }

    /// Response to `9115` ActivityStartLog: 48-byte little-endian records.
    /// The sync engine accumulates BLE chunks before calling this.
    public static func parseActivityStartLogs(_ payload: [UInt8]) throws -> [ActivityStartLogEntry] {
        guard payload.count % 48 == 0 else {
            throw DTPProtocolError.activityStartLogSizeMismatch
        }
        var reader = ByteReader(payload)
        var entries: [ActivityStartLogEntry] = []
        while reader.remaining >= 48 {
            let record = try reader.readBytes(48)
            entries.append(try parseActivityStartRecord(record))
        }
        return entries
    }

    static func parseActivityStartRecord(_ record: [UInt8]) throws -> ActivityStartLogEntry {
        var rec = ByteReader(record)
        let w1 = try rec.readUInt32LE()   // startTime
        let w2 = try rec.readUInt32LE()   // latitude
        let w3 = try rec.readUInt32LE()   // longitude
        let w4 = try rec.readUInt32LE()   // steps running / skin temp
        let w5 = try rec.readUInt32LE()   // steps walk / case temp
        let w6 = try rec.readUInt32LE()   // distance
        let w7 = try rec.readUInt32LE()   // active cals / HRV
        let w8 = try rec.readUInt32LE()   // BMR cals / heart rate
        let w9 = try rec.readUInt32LE()   // thermal gen / activity type
        let w10 = try rec.readUInt32LE()  // solar gen / activityValue2
        let w11 = try rec.readUInt32LE()  // power consumed
        let w12 = try rec.readUInt32LE()  // log index

        return ActivityStartLogEntry(
            type: ActivityType(rawValue: Int(bits(w9, from: 18, to: 25))) ?? .unknown,
            activityId: 0,
            startTime: Int(w1),
            startLogIndex: Int(w12),
            startLatitude: Float(bitPattern: w2),
            startLongitude: Float(bitPattern: w3),
            startAltitude: 0,
            startLogDistance: Int(bits(w6, from: 0, to: 18)),
            startStepsWalk: Int(bits(w5, from: 0, to: 17)),
            startStepsRunning: Int(bits(w4, from: 0, to: 17)),
            startActiveCals: Int(bits(w7, from: 0, to: 23)),
            startBMRCals: Int(bits(w8, from: 0, to: 23)),
            startHeartRate: Int(bits(w8, from: 24, to: 30)),
            startHRV: Int(bits(w7, from: 24, to: 30)),
            activityValue2: Int(bits(w10, from: 18, to: 25)),
            powerLog: WatchPowerLog(
                caseTemp: Int(bits(w5, from: 18, to: 25)),
                skinTemp: Int(bits(w4, from: 18, to: 25)),
                thermalGen: Int(bits(w9, from: 0, to: 17)),
                solarGen: Int(bits(w10, from: 0, to: 17)),
                powerConsumed: Int(bits(w11, from: 0, to: 29))))
    }

    /// Response to `9125` ActivityEndLog: 48-byte little-endian records.
    public static func parseActivityEndLogs(_ payload: [UInt8]) throws -> [ActivityEndLogEntry] {
        guard payload.count % 48 == 0 else {
            throw DTPProtocolError.activityEndLogSizeMismatch
        }
        var reader = ByteReader(payload)
        var entries: [ActivityEndLogEntry] = []
        while reader.remaining >= 48 {
            let record = try reader.readBytes(48)
            entries.append(try parseActivityEndRecord(record))
        }
        return entries
    }

    static func parseActivityEndRecord(_ record: [UInt8]) throws -> ActivityEndLogEntry {
        var rec = ByteReader(record)
        let w1 = try rec.readUInt32LE()   // endLogTime
        let w2 = try rec.readUInt32LE()   // latitude
        let w3 = try rec.readUInt32LE()   // longitude
        let w4 = try rec.readUInt32LE()   // steps running / skin temp
        let w5 = try rec.readUInt32LE()   // steps walk / case temp
        let w6 = try rec.readUInt32LE()   // distance
        let w7 = try rec.readUInt32LE()   // active cals / HRV
        let w8 = try rec.readUInt32LE()   // BMR cals / heart rate
        let w9 = try rec.readUInt32LE()   // thermal gen / value1
        let w10 = try rec.readUInt32LE()  // solar gen / value2
        let w11 = try rec.readUInt32LE()  // power consumed
        let w12 = try rec.readUInt32LE()  // log index

        return ActivityEndLogEntry(
            activityId: 0,
            endLogTime: Int(w1),
            endLogIndex: Int(w12),
            endLogDistance: Int(bits(w6, from: 0, to: 18)),
            endStepsWalk: Int(bits(w5, from: 0, to: 17)),
            endStepsRunning: Int(bits(w4, from: 0, to: 17)),
            endActiveCals: Int(bits(w7, from: 0, to: 23)),
            endBMRCals: Int(bits(w8, from: 0, to: 23)),
            endHeartRate: Int(bits(w8, from: 24, to: 30)),
            endHRV: Int(bits(w7, from: 24, to: 30)),
            endThermalGen: Int(bits(w9, from: 0, to: 17)),
            endSolarGen: Int(bits(w10, from: 0, to: 17)),
            endPowerConsumed: Int(bits(w11, from: 0, to: 29)),
            endSkinTemp: Int(bits(w4, from: 18, to: 25)),
            endCaseTemp: Int(bits(w5, from: 18, to: 25)),
            endLatitude: Float(bitPattern: w2),
            endLongitude: Float(bitPattern: w3),
            endAltitude: 0,
            endActivityValue1: Int(bits(w9, from: 18, to: 25)),
            endActivityValue2: Int(bits(w10, from: 18, to: 25)))
    }

    /// Response to `9215` ActivityHeaderLogVer3: 48-byte little-endian records,
    /// each of which is EITHER a session start or a session end marker
    /// (`Gen2Ver3ActivityHeaderCommand.parseSingleLog`). The legacy `9115`/`9125`
    /// pair split these across two commands; the ver-3 header block interleaves
    /// them and carries the activity id used to pair them
    /// (see `ActivitySessionBuilder`).
    public static func parseVer3ActivityHeaderLogs(_ payload: [UInt8]) throws -> Ver3ActivityHeaderLogs {
        // Whole-record validation used to fail the entire sync here. FW v3.01.00
        // answers `9215` with a few junk bytes when it has no header logs (real
        // device 2026-09-25: a 3-byte body with `activityHeaderLogs == 0`), and
        // Android's own count/record checker only *logs* such a mismatch
        // (`LogsCountChecker`'s return value is discarded). So: read the whole
        // records, note the remainder, keep the sync alive.
        var reader = ByteReader(payload)
        var starts: [ActivityStartLogEntry] = []
        var ends: [ActivityEndLogEntry] = []
        while reader.remaining >= 48 {
            let record = try reader.readBytes(48)
            var rec = ByteReader(record)
            let w1 = try rec.readUInt32LE()   // marker | activity id | steps
            let w2 = try rec.readUInt32LE()   // log index
            let w3 = try rec.readUInt32LE()   // time (epoch seconds)
            let w4 = try rec.readUInt32LE()   // latitude (float bits)
            let w5 = try rec.readUInt32LE()   // longitude (float bits)
            let w6 = try rec.readUInt32LE()   // altitude
            let w7 = try rec.readUInt32LE()   // active cals | heart rate
            let w8 = try rec.readUInt32LE()   // skin | case | activity type
            let w9 = try rec.readUInt32LE()   // log distance
            let w10 = try rec.readUInt32LE()  // thermal generation
            let w11 = try rec.readUInt32LE()  // solar generation
            let w12 = try rec.readUInt32LE()  // power consumed

            let marker = Int(bits(w1, from: 0, to: 5))
            let activityId = Int(bits(w1, from: 6, to: 13))
            let steps = Int(bits(w1, from: 14, to: 31))
            let latitude = Float(bitPattern: w4)
            let longitude = Float(bitPattern: w5)
            let altitude = Int(bits(w6, from: 0, to: 15))
            let activeCals = Int(bits(w7, from: 0, to: 23))
            let heartRate = Int(bits(w7, from: 24, to: 31))
            let skinTemp = Int(bits(w8, from: 0, to: 8))
            let caseTemp = Int(bits(w8, from: 9, to: 17))
            let type = ActivityType(rawValue: Int(bits(w8, from: 18, to: 25))) ?? .unknown
            let logDistance = Int(bits(w9, from: 0, to: 18))
            let power = WatchPowerLog(
                caseTemp: caseTemp, skinTemp: skinTemp,
                thermalGen: Int(w10), solarGen: Int(w11), powerConsumed: Int(w12))

            switch marker {
            case 0:
                starts.append(ActivityStartLogEntry(
                    type: type, activityId: activityId, startTime: Int(w3),
                    startLogIndex: Int(w2), startLatitude: latitude,
                    startLongitude: longitude, startAltitude: Float(altitude),
                    startLogDistance: logDistance, startStepsWalk: steps,
                    startStepsRunning: 0, startActiveCals: activeCals,
                    startBMRCals: 0, startHeartRate: heartRate, startHRV: 0,
                    activityValue2: 0, powerLog: power))
            case 1:
                ends.append(ActivityEndLogEntry(
                    activityId: activityId, endLogTime: Int(w3),
                    endLogIndex: Int(w2), endLogDistance: logDistance,
                    endStepsWalk: steps, endStepsRunning: 0,
                    endActiveCals: activeCals, endBMRCals: 0,
                    endHeartRate: heartRate, endHRV: 0,
                    endThermalGen: Int(w10), endSolarGen: Int(w11),
                    endPowerConsumed: Int(w12), endSkinTemp: skinTemp,
                    endCaseTemp: caseTemp, endLatitude: latitude,
                    endLongitude: longitude, endAltitude: altitude,
                    endActivityValue1: 0, endActivityValue2: 0))
            default:
                // Android returns early on any other marker: not a session edge.
                continue
            }
        }
        if reader.remaining > 0 {
            PowerWatchLog.log("parser: 9215 left \(reader.remaining)B that is not a whole 48B record — ignored")
        }
        return Ver3ActivityHeaderLogs(starts: starts, ends: ends)
    }

    /// Response to `9205` ActivityDeltaLogVer3: 12-byte little-endian records
    /// with the ver-3 bit layout (differs from `9105`).
    public static func parseVer3ActivityDeltaLogs(_ payload: [UInt8]) throws -> [ActivityDeltaLogEntry] {
        // Tolerant for the same reason as `parseVer3ActivityHeaderLogs`.
        var reader = ByteReader(payload)
        var entries: [ActivityDeltaLogEntry] = []
        while reader.remaining >= 12 {
            let record = try reader.readBytes(12)
            entries.append(try parseVer3ActivityDeltaRecord(record))
        }
        if reader.remaining > 0 {
            PowerWatchLog.log("parser: 9205 left \(reader.remaining)B that is not a whole 12B record — ignored")
        }
        return entries
    }

    static func parseVer3ActivityDeltaRecord(_ record: [UInt8]) throws -> ActivityDeltaLogEntry {
        var rec = ByteReader(record)
        let w1 = try rec.readUInt32LE()
        let w2 = try rec.readUInt32LE()
        let w3 = try rec.readUInt32LE()

        return ActivityDeltaLogEntry(
            type: ActivityType(rawValue: Int(bits(w2, from: 24, to: 31))) ?? .unknown,
            deltaStep: Int(bits(w1, from: 0, to: 3)),
            deltaRunningStepCount: 0,
            deltaDistance: Int(bits(w1, from: 4, to: 9)),
            deltaCalsActive: Int(bits(w3, from: 15, to: 23)),
            deltaCalsBRM: 0,
            deltaGPSLat: Int8(truncatingIfNeeded: bits(w2, from: 0, to: 7)),
            deltaGPSLong: Int8(truncatingIfNeeded: bits(w2, from: 8, to: 15)),
            deltaSkinTemp: Int(bits(w3, from: 24, to: 27)),
            deltaCaseTemp: Int(bits(w3, from: 28, to: 31)),
            deltaHeartRate: Int(bits(w3, from: 0, to: 7)),
            deltaHRV: Int(bits(w3, from: 8, to: 14)),
            deltaThermalGen: Int(bits(w1, from: 10, to: 15)),
            deltaSolarGen: Int(bits(w1, from: 16, to: 21)),
            deltaPowerConsumed: Int(bits(w1, from: 22, to: 29)),
            deltaAltitude: Int(Int8(truncatingIfNeeded: bits(w2, from: 16, to: 23))))
    }

    /// Response to `9104` ReceiveRealTime: 4 big-endian UInt32s
    /// (timestamp, steps, distance, calories).
    public static func parseRealtime(_ payload: [UInt8]) throws -> RealtimeData {
        var reader = ByteReader(payload)
        let timestamp = Int(try reader.readUInt32BE())
        let steps = Int(try reader.readUInt32BE())
        let distance = Int(try reader.readUInt32BE())
        let calories = Int(try reader.readUInt32BE())
        guard reader.remaining == 0 else {
            throw DTPProtocolError.parseError("realtime payload has trailing bytes")
        }
        return RealtimeData(
            timestamp: timestamp,
            currentSteps: steps,
            currentDistance: distance,
            currentCalories: calories)
    }

    /// The live-totals characteristic value (`00002a25`) — Android's
    /// `GEN2_SERIAL_REQUEST` answer. Format (`RealtimeDataParser.extractData`):
    /// consecutive 4-byte groups of `[v0, v1, v2, tag]`, the value the 24-bit
    /// little-endian integer `v2<<16 | v1<<8 | v0`, and a trailing partial group
    /// is discarded. Tags are `HSMTable`: 0 total steps, 18 active calories
    /// (thousandths), 32 sleep minutes, 48 distance in metres (Android keeps
    /// `metres/1000` as km), 64 solar µW, 65 thermal µW, 66 battery %, 80 skin
    /// temp (24-bit signed).
    public static func parseLiveTotals(_ payload: [UInt8]) -> LiveTotals {
        var totals = LiveTotals(totalSteps: 0, activeCalories: 0, sleepMinutes: 0,
                                distanceMetres: 0, solarPower: 0, thermalPower: 0,
                                batteryPercent: 0, skinTemp: 0)
        var i = 0
        while i + 4 <= payload.count {
            let value = Int(payload[i]) | Int(payload[i + 1]) << 8 | Int(payload[i + 2]) << 16
            switch payload[i + 3] {
            case 0: totals.totalSteps = value
            case 18: totals.activeCalories = value / 1_000
            case 32: totals.sleepMinutes = value
            case 48: totals.distanceMetres = value
            case 64: totals.solarPower = value
            case 65: totals.thermalPower = value
            case 66: totals.batteryPercent = value
            case 80: totals.skinTemp = value > 0x7F_FFFF ? value - 0x100_0000 : value
            default: break
            }
            i += 4
        }
        return totals
    }

    /// Response to `9107` RTLStatus: one byte per RTL record, in order.
    public static func parseRTLStatusCount(_ payload: [UInt8]) -> Int {
        payload.count
    }

    /// Response to `9117` RTLTime: the payload is read as a byte-reversed
    /// array of big-endian UInt32 epoch seconds, then the resulting list is
    /// reversed back to index order. Returns timestamps in seconds.
    public static func parseRTLTimes(_ payload: [UInt8]) throws -> [Int64] {
        var reader = ByteReader(Array(payload.reversed()))
        var times: [Int64] = []
        while reader.remaining >= 4 {
            times.append(Int64(try reader.readUInt32BE()))
        }
        return times.reversed()
    }

    /// RTL times the watch delivered on some OTHER exchange instead of `9117`.
    ///
    /// FW v3.01.00 misaligns the two RTL commands: `9107` reports N slots,
    /// `9117` answers status-only, and the N times then turn up on the very
    /// next exchange (real watch 2026-09-25 09:43 — 3 slots announced, and 3
    /// epoch seconds arriving where the `9215` header block should have been,
    /// with `9126` having announced 0 header logs).
    ///
    /// A payload qualifies only when it is exactly `4 × slots` bytes, is NOT a
    /// whole number of 48-byte activity-header records, and every word is a
    /// plausible epoch second — otherwise this would happily invent dates out
    /// of an unrelated short answer.
    public static func parseLateRTLTimes(_ payload: [UInt8], slots: Int) -> [Int64]? {
        guard slots > 0, payload.count == slots * 4, payload.count % 48 != 0 else { return nil }
        var reader = ByteReader(payload)
        var times: [Int64] = []
        while reader.remaining >= 4 {
            guard let word = try? reader.readUInt32LE(),
                  (1_577_836_800 ... 2_208_988_800).contains(Int64(word)) else { return nil }
            times.append(Int64(word))
        }
        return times
    }
}
