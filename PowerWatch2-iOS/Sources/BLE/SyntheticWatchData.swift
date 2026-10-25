import Foundation

/// Synthetic PowerWatch 2 data source.
///
/// These types **encode** wire-format records using the exact bit layout the
/// APK's decoders expect, so the simulated watch flows through the same
/// `Gen2ResponseCollector` + `BackgroundLogDecoder` + `ActivityDeltaDecoder`
/// code path as real hardware. That makes the codec self-verifying: if the
/// encoder and decoder disagree, the app shows nonsense and the unit tests fail.
struct SyntheticSample {
    var logTimeIndex: Int
    var time: Date
    var steps: Int
    var distance: Int
    var activeCalories: Int
    var bmrCalories: Int
    var thermalGen: Int          // µWh
    var solarGen: Int            // µWh
    var powerConsumed: Int       // µWh
    var caseTempC: Double
    var skinTempC: Double
    var heartRate: Int
    var hrv: Int
    var battery: Int
    var logType: WatchLogType
}

enum SyntheticEncoder {
    /// Nearest table index for a desired value (the decoder resolves indices
    /// through `LogTables`, so the encoder must store indices).
    static func index(for value: Int, in table: [Int]) -> Int {
        guard !table.isEmpty else { return 0 }
        var best = 0
        var bestDelta = Int.max
        for (i, candidate) in table.enumerated() {
            let delta = abs(candidate - value)
            if delta < bestDelta { bestDelta = delta; best = i }
        }
        return best
    }

    static func pack(_ samples: [SyntheticSample]) -> [UInt8] {
        var out: [UInt8] = []
        for s in samples {
            let skinRaw = Int((s.skinTempC * 4).rounded())
            // The decoder does `if (v > 255) v - 512`, so negatives are shipped
            // as the same 9-bit value offset by 512.
            let skinField = (skinRaw < 0 || skinRaw > 255) ? skinRaw + 512 : skinRaw

            let w0 = put(0, high: 6, low: 0, UInt32(clamping: s.logTimeIndex))
                | put(0, high: 14, low: 7, UInt32(clamping: s.steps))
                | put(0, high: 22, low: 15, 0)                       // runningStepDelta
                | put(0, high: 31, low: 23, UInt32(clamping: s.distance))

            let w1 = put(0, high: 14, low: 0, UInt32(clamping: s.activeCalories))
                | put(0, high: 25, low: 15, UInt32(clamping: s.bmrCalories))
                | put(0, high: 31, low: 26, UInt32(clamping: index(for: s.thermalGen, in: LogTables.generationArray)))

            let w2 = put(0, high: 8, low: 0, UInt32(clamping: Int((s.caseTempC * 4).rounded())))
                | put(0, high: 16, low: 9, UInt32(clamping: index(for: s.powerConsumed, in: LogTables.consumptionArray)))
                | put(0, high: 24, low: 17, UInt32(clamping: s.heartRate))
                | put(0, high: 31, low: 25, UInt32(clamping: s.hrv))

            let w3 = put(0, high: 6, low: 0, UInt32(clamping: s.battery))
                | put(0, high: 12, low: 7, UInt32(clamping: index(for: s.solarGen, in: LogTables.generationArray)))
                | put(0, high: 21, low: 13, UInt32(clamping: skinField))
                | put(0, high: 25, low: 22, UInt32(clamping: s.logType.rawValue))

            out.append(contentsOf: le(w0) + le(w1) + le(w2) + le(w3))
        }
        return out
    }

    /// Inverse of `ActivityDeltaDecoder` (12-byte little endian records, `9205`).
    struct DeltaRecord {
        var type: WatchActivityType
        var step: Int
        var calsBMR: Int
        var calsActive: Int
        var powerConsumed: Int
        var gpsLatByte: Int
        var gpsLongByte: Int
        var heartRate: Int
        var hrv: Int
        var distance: Int
        var caseTemp: Int
        var skinTemp: Int
    }

    static func packDelta(_ records: [DeltaRecord]) -> [UInt8] {
        var out: [UInt8] = []
        for r in records {
            let w0 = put(0, high: 3, low: 0, UInt32(clamping: r.type.rawValue))
                | put(0, high: 9, low: 4, UInt32(clamping: r.step))
                | put(0, high: 15, low: 10, UInt32(clamping: r.calsBMR))
                | put(0, high: 21, low: 16, UInt32(clamping: r.calsActive))
                | put(0, high: 29, low: 22, UInt32(clamping: r.powerConsumed))
            let w1 = put(0, high: 7, low: 0, UInt32(clamping: r.gpsLatByte))
                | put(0, high: 15, low: 8, UInt32(clamping: r.gpsLongByte))
            let w2 = put(0, high: 7, low: 0, UInt32(clamping: r.heartRate))
                | put(0, high: 14, low: 8, UInt32(clamping: r.hrv))
                | put(0, high: 23, low: 15, UInt32(clamping: r.distance))
                | put(0, high: 27, low: 24, UInt32(clamping: r.caseTemp))
                | put(0, high: 31, low: 28, UInt32(clamping: r.skinTemp))
            out.append(contentsOf: le(w0) + le(w1) + le(w2))
        }
        return out
    }

    /// Inverse of `ActivityHeaderDecoder` (48-byte little endian records, `9215`).
    struct HeaderRecord {
        var isEnd: Bool
        var activityId: Int
        var startStepsWalk: Int
        var startLogIndex: Int
        var time: Date
        var latitude: Double
        var longitude: Double
        var altitude: Double
        var activeCalories: Int
        var heartRate: Int
        var caseTempRaw: Int
        var skinTempRaw: Int
        var activityType: WatchActivityType
        var logDistance: Int
        var thermalGen: Int
        var solarGen: Int
        var powerConsumed: Int
    }

    static func packHeader(_ records: [HeaderRecord]) -> [UInt8] {
        var out: [UInt8] = []
        for r in records {
            let w0 = put(0, high: 5, low: 0, r.isEnd ? 1 : 0)
                | put(0, high: 13, low: 6, UInt32(clamping: r.activityId))
                | put(0, high: 31, low: 14, UInt32(clamping: r.startStepsWalk))
            // The Android decoder turns these two words back into Doubles with
            // `Float.intBitsToFloat`, so they are stored as IEEE-754 floats.
            let latBits = Float32(r.latitude).bitPattern
            let lonBits = Float32(r.longitude).bitPattern
            let w5 = put(0, high: 15, low: 0, UInt32(clamping: Int(r.altitude.rounded())))
            let w6 = put(0, high: 23, low: 0, UInt32(clamping: r.activeCalories))
                | put(0, high: 31, low: 24, UInt32(clamping: r.heartRate))
            let w7 = put(0, high: 8, low: 0, UInt32(clamping: r.caseTempRaw))
                | put(0, high: 17, low: 9, UInt32(clamping: r.skinTempRaw))
                | put(0, high: 25, low: 18, UInt32(clamping: r.activityType.rawValue))
            let w8 = put(0, high: 18, low: 0, UInt32(clamping: r.logDistance))
            out.append(contentsOf: le(w0) + le(UInt32(clamping: r.startLogIndex))
                + le(UInt32(clamping: Int(r.time.timeIntervalSince1970)))
                + le(latBits) + le(lonBits) + le(w5) + le(w6) + le(w7) + le(w8)
                + le(UInt32(clamping: r.thermalGen)) + le(UInt32(clamping: r.solarGen))
                + le(UInt32(clamping: r.powerConsumed)))
        }
        return out
    }

    /// Inverse of `SleepLogDecoder` (16-byte little endian records, `9108`).
    struct SleepRecord {
        var start: Date
        var end: Date
        var hours: Int
        var minutes: Int
        var percentRestless: Int
        var percentLight: Int
        var percentDeep: Int
        var quality: Int
    }

    static func packSleep(_ records: [SleepRecord]) -> [UInt8] {
        var out: [UInt8] = []
        for r in records {
            let w2 = put(0, high: 7, low: 0, UInt32(clamping: r.hours))
                | put(0, high: 15, low: 8, UInt32(clamping: r.minutes))
                | put(0, high: 23, low: 16, UInt32(clamping: r.percentRestless))
                | put(0, high: 31, low: 24, UInt32(clamping: r.percentLight))
            let w3 = put(0, high: 7, low: 0, UInt32(clamping: r.percentDeep))
                | put(0, high: 15, low: 8, UInt32(clamping: r.quality))
            out.append(contentsOf: le(UInt32(clamping: Int(r.start.timeIntervalSince1970)))
                + le(UInt32(clamping: Int(r.end.timeIntervalSince1970))) + le(w2) + le(w3))
        }
        return out
    }

    /// `value << low`, masked to the field width — the exact inverse of
    /// `BitReader.extract`.
    private static func put(_ base: UInt32, high: Int, low: Int, _ value: UInt32) -> UInt32 {
        let width = high - low + 1
        let mask: UInt32 = width >= 32 ? 0xFFFF_FFFF : (1 << UInt32(width)) - 1
        return base | ((value << UInt32(low)) & (mask << UInt32(low)))
    }

    private static func le(_ v: UInt32) -> [UInt8] {
        [UInt8(v & 0xFF), UInt8((v >> 8) & 0xFF), UInt8((v >> 16) & 0xFF), UInt8((v >> 24) & 0xFF)]
    }
}

/// Deterministic PRNG so the demo watch is stable across launches.
struct DeterministicRandom {
    private var state: UInt64
    init(seed: UInt64) { state = seed == 0 ? 0x9E37_79B9_7F4A_7C15 : seed }

    mutating func next() -> UInt64 {
        state ^= state << 13
        state ^= state >> 7
        state ^= state << 17
        return state
    }

    mutating func int(in range: ClosedRange<Int>) -> Int {
        guard range.lowerBound < range.upperBound else { return range.lowerBound }
        let span = UInt64(range.upperBound - range.lowerBound + 1)
        return range.lowerBound + Int(next() % span)
    }

    mutating func double(in range: ClosedRange<Double>) -> Double {
        let unit = Double(next() % 1_000_000) / 1_000_000.0
        return range.lowerBound + unit * (range.upperBound - range.lowerBound)
    }

    mutating func bool(_ probability: Double) -> Bool { double(in: 0...1) < probability }
}

enum SyntheticWatchData {
    struct Day {
        var samples: [SyntheticSample]
        var rtlTimestamps: [Date]
        var sessions: [SyntheticSession]
    }

    /// Builds a plausible day: sleep overnight, sedentary mornings, walks at
    /// lunch and evening, body heat roughly tracking activity.
    static func makeDay(now: Date = Date(), seed: UInt64 = 0x5EED) -> Day {
        var rng = DeterministicRandom(seed: seed)
        let calendar = Calendar.current
        let startOfToday = calendar.startOfDay(for: now)
        let minutesElapsed = max(60, calendar.dateComponents([.minute], from: startOfToday, to: now).minute ?? 720)

        // RTL table: 30-minute blocks, mirroring how the watch indexes groups of
        // per-minute records.
        let blockMinutes = 30
        let blockCount = max(1, (minutesElapsed + blockMinutes - 1) / blockMinutes)
        var rtlTimestamps: [Date] = (0..<blockCount).compactMap {
            calendar.date(byAdding: .minute, value: $0 * blockMinutes, to: startOfToday)
        }
        if rtlTimestamps.isEmpty { rtlTimestamps = [startOfToday] }

        var samples: [SyntheticSample] = []
        samples.reserveCapacity(minutesElapsed)

        for minute in 0..<minutesElapsed {
            guard let time = calendar.date(byAdding: .minute, value: minute, to: startOfToday) else { continue }
            let hour = Double(calendar.component(.hour, from: time)) + Double(minute % 60) / 60.0
            let block = min(blockCount - 1, minute / blockMinutes)

            let phase: Phase = {
                if hour < 6.6 { return .sleep }
                if hour >= 6.6 && hour < 8.0 { return .wake }
                if hour >= 12.0 && hour < 12.6 { return .walk }
                if hour >= 17.5 && hour < 18.0 { return .run }
                if hour >= 22.5 { return .sleep }
                return .awake
            }()

            let isDaylight = hour > 7 && hour < 19
            let sample: SyntheticSample
            switch phase {
            case .sleep:
                let stage: WatchLogType = rng.bool(0.45) ? .sleepDeep : (rng.bool(0.6) ? .sleepLight : .sleepRestless)
                sample = SyntheticSample(
                    logTimeIndex: block, time: time,
                    steps: 0, distance: 0,
                    activeCalories: 0, bmrCalories: rng.int(in: 1...2),
                    thermalGen: rng.int(in: 6...18), solarGen: 0,
                    powerConsumed: rng.int(in: 3...12),
                    caseTempC: rng.double(in: 30.5...32.5), skinTempC: rng.double(in: 31.5...34.0),
                    heartRate: rng.int(in: 44...58), hrv: rng.int(in: 38...72),
                    battery: 100 - minute / 480, logType: stage
                )
            case .wake, .awake:
                // ~10% of idle minutes contain a short burst of steps, which
                // keeps the resting baseline near a few thousand steps/day so the
                // 10 000 goal is meaningful rather than always exceeded.
                let moving = rng.bool(0.10)
                sample = SyntheticSample(
                    logTimeIndex: block, time: time,
                    steps: moving ? rng.int(in: 12...40) : rng.int(in: 0...2),
                    distance: moving ? rng.int(in: 8...30) : 0,
                    activeCalories: moving ? rng.int(in: 1...3) : 0,
                    bmrCalories: rng.int(in: 1...2),
                    thermalGen: rng.int(in: 8...30),
                    solarGen: isDaylight ? rng.int(in: 4...120) : 0,
                    powerConsumed: rng.int(in: 10...70),
                    caseTempC: rng.double(in: 31.0...34.0), skinTempC: rng.double(in: 32.0...35.5),
                    heartRate: moving ? rng.int(in: 78...112) : rng.int(in: 58...82),
                    hrv: rng.int(in: 22...60),
                    battery: max(18, 100 - minute / 420),
                    logType: moving ? .awakeWalking : .awakeStill
                )
            case .walk:
                sample = SyntheticSample(
                    logTimeIndex: block, time: time,
                    steps: rng.int(in: 90...130), distance: rng.int(in: 70...105),
                    activeCalories: rng.int(in: 3...7), bmrCalories: rng.int(in: 1...3),
                    thermalGen: rng.int(in: 30...90),
                    solarGen: isDaylight ? rng.int(in: 60...320) : 0,
                    powerConsumed: rng.int(in: 60...220),
                    caseTempC: rng.double(in: 33.0...35.5), skinTempC: rng.double(in: 33.5...36.5),
                    heartRate: rng.int(in: 92...128), hrv: rng.int(in: 18...44),
                    battery: max(18, 100 - minute / 420), logType: .awakeWalking
                )
            case .run:
                sample = SyntheticSample(
                    logTimeIndex: block, time: time,
                    steps: rng.int(in: 130...180), distance: rng.int(in: 150...210),
                    activeCalories: rng.int(in: 6...12), bmrCalories: rng.int(in: 2...4),
                    thermalGen: rng.int(in: 80...220),
                    solarGen: isDaylight ? rng.int(in: 20...140) : 0,
                    powerConsumed: rng.int(in: 200...640),
                    caseTempC: rng.double(in: 34.0...36.5), skinTempC: rng.double(in: 34.5...37.4),
                    heartRate: rng.int(in: 128...172), hrv: rng.int(in: 12...34),
                    battery: max(18, 100 - minute / 420), logType: .awakeRunning
                )
            }
            samples.append(sample)
        }

        let sessions = makeSessions(now: now, calendar: calendar, rng: &rng)
        return Day(samples: samples, rtlTimestamps: rtlTimestamps, sessions: sessions)
    }

    private enum Phase { case sleep, wake, awake, walk, run }

    struct SyntheticSession {
        var id: Int
        var type: WatchActivityType
        var start: Date
        var end: Date
        var latitude: Double
        var longitude: Double
        var altitude: Double
    }

    static func makeSessions(now: Date, calendar: Calendar, rng: inout DeterministicRandom) -> [SyntheticSession] {
        let base = calendar.startOfDay(for: now)
        let specs: [(Int, WatchActivityType, Int, Int)] = [
            (1, .walking, 12 * 60, 12 * 60 + 34),
            (2, .biking, 17 * 60 + 30, 18 * 60)
        ]
        return specs.map { spec in
            SyntheticSession(
                id: spec.0,
                type: spec.1,
                start: calendar.date(byAdding: .minute, value: spec.2, to: base) ?? now,
                end: calendar.date(byAdding: .minute, value: spec.3, to: base) ?? now,
                latitude: 45.4642 + Double(rng.int(in: -200...200)) / 100_000.0,
                longitude: 9.1900 + Double(rng.int(in: -200...200)) / 100_000.0,
                altitude: 120 + Double(rng.int(in: 0...40))
            )
        }
    }
}
