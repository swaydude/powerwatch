import Foundation

// ============================================================================
// Gen2 command definitions and log decoders.
//
// Opcodes: sdk/protocol/commands/Gen2CommandIDs.java (55 entries, each built as
// `super("XXXX")` and turned into bytes by Gen2ExecutorKt.mapToBytes).
//
// Payload layouts are the byte-for-byte layouts recovered from the
// corresponding Gen2*Command classes.
// ============================================================================

enum Gen2Opcode {
    // Session control
    static let startAmDTP = "9000"
    static let stopAmDTP = "9001"
    static let startPairing = "9010"
    static let stopPairing = "9011"
    static let enableMock = "900D"

    // Clean
    static let cleanActivityLog = "9005"
    static let cleanBackgroundLog = "9006"
    static let cleanRTL = "9007"
    static let cleanSleepLog = "9008"
    static let cleanAllLogs = "9023"

    // User / goals
    static let receiveUserInformation = "9102"
    static let sendUserInformation = "9002"
    static let sendBiometrics = "9012"
    static let sendLanguage = "9004"
    static let receiveStepsDistanceGoals = "9103"
    static let sendStepsDistanceGoal = "9003"
    static let sendCaloriesSleepGoal = "9013"
    static let getUserAndGoals = "9122"
    static let sendUserPrefsAndGoals = "9022"
    static let getUserAndGoalsVer3 = "9124"
    static let sendUserPrefsAndGoalsVer3 = "9024"
    static let sendUserLocation = "9015"

    // Logs
    static let receiveRealTime = "9104"
    static let rtlStatus = "9107"
    static let rtlTime = "9117"
    static let activityDelta = "9105"
    static let activityDeltaVer3 = "9205"
    static let backgroundLog = "9106"
    static let sleepLog = "9108"
    static let activityStartLog = "9115"
    static let activityEndLog = "9125"
    static let activityHeaderLog = "9215"
    static let getLogCount = "9116"
    static let getLogCountVer3 = "9126"
    static let headerTraceLog = "9120"
    static let accelTraceLog = "9121"
    static let errorLog = "9226"

    // Notifications
    static let alertType = "9009"
    static let alertDate = "9019"
    static let alertTitle = "9029"
    static let alertSubtitle = "9039"
    static let alertMessage = "9049"
    static let fullAlertsType = "9059"

    // Watch settings
    static let settingDND = "9300"
    static let settingBackLight = "9301"
    static let settingBackLightDuration = "9302"
    static let settingPopupDuration = "9303"
    static let settingGPSUpdateRate = "9304"
    static let settingHomeScreen = "9305"
    static let settingBLEDisconnection = "9306"
    static let settingRingtone = "9307"
    static let settingAlertType = "9308"
    static let settingReset = "9309"
    static let settingAlarm = "930A"
    static let settingTimer = "930B"
}

/// A command ready to be framed and written.
struct Gen2Command {
    let opcode: String
    let payload: [UInt8]
    /// Per-command timeout in seconds (call sites supply these; the executor
    /// defaults observed are 15 s for ACK and response waits).
    var timeoutSeconds: TimeInterval = 15
    /// False for the settings/simple writes whose response the SDK ignores
    /// (`@UnusedCommandResult` in the APK). Those complete as soon as the watch
    /// acknowledges the frame.
    var expectsResponse: Bool = true

    init(_ opcode: String, payload: [UInt8] = [], timeoutSeconds: TimeInterval = 15,
         expectsResponse: Bool = true) {
        self.opcode = opcode
        self.payload = payload
        self.timeoutSeconds = timeoutSeconds
        self.expectsResponse = expectsResponse
    }

    var frame: [UInt8] { Gen2Framing.encode(opcodeBytes: Gen2Framing.opcodeBytes(fromHex: opcode), payload: payload) }

    // MARK: - Outgoing payload builders (all big endian unless noted)

    /// `Gen2SendUserPrefsAndGoalsCommandVer3` — 32 bytes:
    /// the 31-byte Ver1 layout plus `[31]` sleepTimeSelection.
    static func sendUserPrefsAndGoalsVer3(
        user: UserAccount,
        goals: GoalConfiguration,
        settings: WatchSettings,
        now: Date = Date(),
        timeZone: TimeZone = .current
    ) -> Gen2Command {
        var p: [UInt8] = []
        p.append(user.timeFormatType == .twentyFour ? 1 : 0)          // [0] 24h flag
        p.append(user.unitType == .metric ? 1 : 0)                    // [1] metric flag
        p.append(contentsOf: be32(UInt32(now.timeIntervalSince1970)))  // [2..5] epoch
        p.append(contentsOf: be16(Int16(timeZone.secondsFromDate(now) / 60))) // [6..7] tz minutes
        p.append(user.gender == .male ? 0 : 1)                        // [8] !male
        p.append(UInt8(clamping: user.age))                           // [9] age
        p.append(contentsOf: be16(UInt16(clamping: Int(user.weight.rounded()))))      // [10..11] weight
        p.append(contentsOf: be16(UInt16(clamping: Int((user.height * 10).rounded())))) // [12..13] height*10
        p.append(contentsOf: be32(UInt32(clamping: goals.steps)))     // [14..17]
        p.append(contentsOf: be32(UInt32(clamping: Int(goals.distance.rounded())))) // [18..21]
        p.append(contentsOf: be32(UInt32(clamping: goals.calories)))  // [22..25]
        p.append(contentsOf: be32(UInt32(clamping: goals.sleep)))     // [26..29]
        p.append(languageByte(user.language))                         // [30]
        p.append(UInt8(clamping: settings.sleepTimeSelection))        // [31]
        precondition(p.count == 32, "9024 payload must be 32 bytes, got \(p.count)")
        return Gen2Command(Gen2Opcode.sendUserPrefsAndGoalsVer3, payload: p)
    }

    /// `Gen2SendUserLocationCommand` — u32 epoch, u32 lat*1e7, u32 lon*1e7, u32 alt*100.
    static func sendUserLocation(latitude: Double, longitude: Double, altitude: Double,
                                 now: Date = Date()) -> Gen2Command {
        var p: [UInt8] = []
        p.append(contentsOf: be32(UInt32(now.timeIntervalSince1970)))
        p.append(contentsOf: be32(UInt32(clamping: Int((latitude * 10_000_000).rounded()))))
        p.append(contentsOf: be32(UInt32(clamping: Int((longitude * 10_000_000).rounded()))))
        p.append(contentsOf: be32(UInt32(clamping: Int((altitude * 100).rounded()))))
        return Gen2Command(Gen2Opcode.sendUserLocation, payload: p, expectsResponse: false)
    }

    /// `Gen2SendBiometricsCommand` — 6 bytes: !male, age, u16 weight, u16 height*10.
    static func sendBiometrics(user: UserAccount) -> Gen2Command {
        var p: [UInt8] = []
        p.append(user.gender == .male ? 0 : 1)
        p.append(UInt8(clamping: user.age))
        p.append(contentsOf: be16(UInt16(clamping: Int(user.weight.rounded()))))
        p.append(contentsOf: be16(UInt16(clamping: Int((user.height * 10).rounded()))))
        return Gen2Command(Gen2Opcode.sendBiometrics, payload: p, expectsResponse: false)
    }

    /// `Gen2SendLanguageCommand` — 1 byte LocaleCommandValue.
    static func sendLanguage(_ language: AppLanguage) -> Gen2Command {
        Gen2Command(Gen2Opcode.sendLanguage, payload: [languageByte(language)], expectsResponse: false)
    }

    static func sendStepsDistanceGoal(steps: Int, distance: Double) -> Gen2Command {
        var p = be32(UInt32(clamping: steps))
        p.append(contentsOf: be32(UInt32(clamping: Int(distance.rounded()))))
        return Gen2Command(Gen2Opcode.sendStepsDistanceGoal, payload: p, expectsResponse: false)
    }

    static func sendCaloriesSleepGoal(calories: Int, sleepMinutes: Int) -> Gen2Command {
        var p = be32(UInt32(clamping: calories))
        p.append(contentsOf: be32(UInt32(clamping: sleepMinutes)))
        return Gen2Command(Gen2Opcode.sendCaloriesSleepGoal, payload: p, expectsResponse: false)
    }

    /// Watch settings writes (`Gen2*SettingCommand`): single value byte.
    static func setSetting(_ opcode: String, _ value: Int) -> Gen2Command {
        Gen2Command(opcode, payload: [UInt8(clamping: value)], expectsResponse: false)
    }

    /// `AlarmData(hour, minute, isAM, currentRepeat, currentSelectionMode)`
    static func setAlarm(_ alarm: WatchAlarm) -> Gen2Command {
        let repeatValue = alarm.repeatMode.rawValue + 1
        let selection = alarm.activation.rawValue
        return Gen2Command(Gen2Opcode.settingAlarm, payload: [
            UInt8(clamping: alarm.hour),
            UInt8(clamping: alarm.minute),
            alarm.isAM ? 0 : 1,
            UInt8(clamping: repeatValue),
            UInt8(clamping: selection)
        ], expectsResponse: false)
    }

    static func setTimer(hour: Int, minute: Int, second: Int) -> Gen2Command {
        Gen2Command(Gen2Opcode.settingTimer, payload: [
            UInt8(clamping: hour), UInt8(clamping: minute), UInt8(clamping: second)
        ], expectsResponse: false)
    }

    /// Alert delivery (`9009/9019/9029/9039/9049`). UTF-8 body, as the Android
    /// alerts service builds them.
    static func alert(type: Int, title: String, subtitle: String, message: String, date: Date = Date()) -> [Gen2Command] {
        [
            Gen2Command(Gen2Opcode.alertType, payload: [UInt8(clamping: type)], expectsResponse: false),
            Gen2Command(Gen2Opcode.alertDate, payload: be32(UInt32(date.timeIntervalSince1970)), expectsResponse: false),
            Gen2Command(Gen2Opcode.alertTitle, payload: Array(title.utf8), expectsResponse: false),
            Gen2Command(Gen2Opcode.alertSubtitle, payload: Array(subtitle.utf8), expectsResponse: false),
            Gen2Command(Gen2Opcode.alertMessage, payload: Array(message.utf8), expectsResponse: false)
        ]
    }

    /// `Gen2SendUserInformationCommand` — 8 bytes: `!twelveHourFormat`,
    /// `metricsFormat`, u32 epoch, i16 timezone offset in minutes, all big endian.
    /// Only the Ver1 pairing chain sends it; `9024` carries the same fields plus goals.
    static func sendUserInformation(user: UserAccount, now: Date = Date(),
                                    timeZone: TimeZone = .current) -> Gen2Command {
        var p: [UInt8] = []
        p.append(user.timeFormatType == .twentyFour ? 1 : 0)   // !twelveHourFormat
        p.append(user.unitType == .metric ? 1 : 0)             // metricsFormat
        p.append(contentsOf: be32(UInt32(clamping: Int(now.timeIntervalSince1970))))
        p.append(contentsOf: be16(Int16(timeZone.secondsFromDate(now) / 60)))
        precondition(p.count == 8, "9002 payload must be 8 bytes, got \(p.count)")
        return Gen2Command(Gen2Opcode.sendUserInformation, payload: p)
    }

    /// `Gen2SendUserPrefsAndGoalsCommand` (`9022`) — the 31-byte Ver1 layout, which
    /// is exactly `9024` without the trailing `sleepTimeSelection` byte.
    static func sendUserPrefsAndGoals(
        user: UserAccount,
        goals: GoalConfiguration,
        settings: WatchSettings,
        now: Date = Date(),
        timeZone: TimeZone = .current
    ) -> Gen2Command {
        var p = sendUserPrefsAndGoalsVer3(user: user, goals: goals, settings: settings,
                                         now: now, timeZone: timeZone).payload
        if p.count == 32 { p.removeLast() }
        return Gen2Command(Gen2Opcode.sendUserPrefsAndGoals, payload: p)
    }

    /// One step of the pairing chain: the command plus the `power` the executor
    /// passes for it (`f * 0.1f`, `f * 0.3f`, …), i.e. its share of the pairing
    /// progress bar in `SyncProgressChannel`.
    struct Gen2PairingStep {
        let command: Gen2Command
        let power: Double
    }

    /// `ExecutorsFactory.createPairExecutor` chooses the pairing chain from the
    /// protocol version in the advertisement, and every step of every chain is
    /// `sendSingleCommandWithAck` — so each one owes the watch an ACK of its
    /// `E200` status frame:
    ///
    /// | version | executor | chain |
    /// |---|---|---|
    /// | 0, 1 | `Gen2PairExecutorImpl` | `9010 9102 9002 9012 9004 9103 9003 9013 9011` |
    /// | 2 | `Gen2Version2PairExecutorImpl` | `9010 9122 9022 9011` |
    /// | ≥ 3 | `Gen2Version3PairExecutorImpl` | `9010 9124 9024 9011` |
    ///
    /// The `Gen2DeviceInfoCommand` that precedes all three is *not* a DTP command:
    /// its `ProtocolMessageType.GEN2_FIRMWARE_REQUEST` resolves in
    /// `Gen2ProtocolBasics` to `channel.read(CharacteristicType.FIRMWARE)`, i.e. the
    /// `2a26` characteristic read that `readDeviceInfo()` performs — run *before*
    /// `9010`, and it is what sets `pid = 4` on the saved device.
    static func pairingChain(
        protocolVersion: Int,
        user: UserAccount,
        goals: GoalConfiguration,
        settings: WatchSettings,
        now: Date = Date(),
        timeZone: TimeZone = .current
    ) -> [Gen2PairingStep] {
        func acked(_ command: Gen2Command, power: Double = 0.1) -> Gen2PairingStep {
            var command = command
            command.expectsResponse = true
            return Gen2PairingStep(command: command, power: power)
        }
        switch protocolVersion {
        case 0, 1:
            // `Gen2PairExecutorImpl`: every lambda passes `f * 0.1f`.
            return [
                acked(.startPairing),
                acked(.receiveUserInformation),
                acked(sendUserInformation(user: user, now: now, timeZone: timeZone)),
                acked(sendBiometrics(user: user)),
                acked(sendLanguage(user.language)),
                acked(.receiveStepsDistanceGoals),
                acked(sendStepsDistanceGoal(steps: goals.steps, distance: goals.distance)),
                acked(sendCaloriesSleepGoal(calories: goals.calories, sleepMinutes: goals.sleep)),
                acked(.stopPairing),
            ]
        case 2:
            return [
                acked(.startPairing),
                acked(.getUserAndGoals, power: 0.3),
                acked(sendUserPrefsAndGoals(user: user, goals: goals, settings: settings,
                                            now: now, timeZone: timeZone), power: 0.4),
                acked(.stopPairing),
            ]
        default:
            return [
                acked(.startPairing),
                acked(.getUserAndGoalsVer3, power: 0.3),
                acked(sendUserPrefsAndGoalsVer3(user: user, goals: goals, settings: settings,
                                                now: now, timeZone: timeZone), power: 0.4),
                acked(.stopPairing),
            ]
        }
    }

    static let startAmDTP = Gen2Command(Gen2Opcode.startAmDTP)
    static let stopAmDTP = Gen2Command(Gen2Opcode.stopAmDTP)
    /// `9010`/`9011` are sent with `sendSingleCommandWithAck` in
    /// `Gen2PairExecutorImpl`, i.e. the watch answers the AckGood with an `E200`
    /// status frame that the phone must ACK. Confirmed on hardware: after each of
    /// them the watch sends `06 00 40 10 e2 00 91 83 91 2d` on the TX characteristic
    /// and retransmits it every 10 s until it is ACKed.
    static let startPairing = Gen2Command(Gen2Opcode.startPairing)
    static let stopPairing = Gen2Command(Gen2Opcode.stopPairing)
    static let cleanAllLogs = Gen2Command(Gen2Opcode.cleanAllLogs)
    static let getLogCountVer3 = Gen2Command(Gen2Opcode.getLogCountVer3)
    static let getUserAndGoalsVer3 = Gen2Command(Gen2Opcode.getUserAndGoalsVer3)
    /// Payload-less reads used by the two older pairing chains: `9102` and `9103`
    /// in `Gen2PairExecutorImpl`, `9122` in `Gen2Version2PairExecutorImpl`.
    static let receiveUserInformation = Gen2Command(Gen2Opcode.receiveUserInformation)
    static let receiveStepsDistanceGoals = Gen2Command(Gen2Opcode.receiveStepsDistanceGoals)
    static let getUserAndGoals = Gen2Command(Gen2Opcode.getUserAndGoals)
    static let rtlStatus = Gen2Command(Gen2Opcode.rtlStatus)
    static let rtlTime = Gen2Command(Gen2Opcode.rtlTime)
    static let activityHeaderLog = Gen2Command(Gen2Opcode.activityHeaderLog)
    static let activityDeltaVer3 = Gen2Command(Gen2Opcode.activityDeltaVer3)
    static let backgroundLog = Gen2Command(Gen2Opcode.backgroundLog)
    static let sleepLog = Gen2Command(Gen2Opcode.sleepLog)
    static let headerTraceLog = Gen2Command(Gen2Opcode.headerTraceLog)
    static let accelTraceLog = Gen2Command(Gen2Opcode.accelTraceLog)
    static let errorLog = Gen2Command(Gen2Opcode.errorLog)

    // MARK: helpers

    private static func be32(_ v: UInt32) -> [UInt8] {
        // Each byte must be masked: `UInt8(v >> 16)` traps once `v` has bits
        // above the low byte (`Not enough bits to represent the passed value`).
        [UInt8((v >> 24) & 0xFF), UInt8((v >> 16) & 0xFF), UInt8((v >> 8) & 0xFF), UInt8(v & 0xFF)]
    }
    private static func be16(_ v: UInt16) -> [UInt8] { [UInt8(v >> 8), UInt8(v & 0xFF)] }
    private static func be16(_ v: Int16) -> [UInt8] { be16(UInt16(bitPattern: v)) }

    /// `LocaleCommandValue` ordering is not fully recoverable from the DEX;
    /// English is the documented default. Index into the supported language list
    /// is used as the wire value.
    private static func languageByte(_ language: AppLanguage) -> UInt8 {
        let all = AppLanguage.allCases
        return UInt8(clamping: all.firstIndex(of: language) ?? 0)
    }
}

private extension TimeZone {
    func secondsFromDate(_ date: Date) -> Int { secondsFromGMT(for: date) }
}

// MARK: - Log decoders

/// `Gen2Ver3GetLogCountCommand` requires the body to be 24 bytes of BE u32 x6
/// (the Ver1 `9116` variant expects 28 bytes / x7).
struct Gen2LogsCount: Equatable {
    var realtimeStatusLogs = 0
    var realtimeLogs = 0
    var activityHeaderLogs = 0
    var activityStartLogs = 0
    var activityEndLogs = 0
    var activityDeltaLogs = 0
    var backgroundLogs = 0
    var sleepLogs = 0

    static func parseVer3(_ body: [UInt8]) -> Gen2LogsCount? {
        let words = body.count / 4
        guard words >= 6 else { return nil }
        var c = Gen2LogsCount()
        for i in 0..<6 {
            let v = Int(Gen2Framing.readUInt32BE(body, at: i * 4))
            switch i {
            case 0: c.realtimeStatusLogs = v
            case 1: c.realtimeLogs = v
            case 2: c.activityHeaderLogs = v
            case 3: c.activityDeltaLogs = v
            case 4: c.backgroundLogs = v
            case 5: c.sleepLogs = v
            default: break
            }
        }
        return c
    }
}

/// `9107` RTL status → N placeholder entries, `9117` RTL time → N timestamps.
/// The two are paired 1:1 and must be fetched before `9106`.
struct RTLTable {
    var timestamps: [Date]

    /// `RTLTimeCommand.extractResponse` wraps the payload reversed and reads
    /// u32s, then reverses the resulting list.
    static func parseTime(_ body: [UInt8]) -> RTLTable {
        let reversed = Array(body.reversed())
        var values: [UInt32] = []
        var offset = 0
        while offset + 4 <= reversed.count {
            values.append(Gen2Framing.readUInt32BE(reversed, at: offset))
            offset += 4
        }
        let seconds = values.reversed().map { $0 }
        return RTLTable(timestamps: seconds.map { Date(timeIntervalSince1970: TimeInterval($0)) })
    }

    static func parseStatus(_ body: [UInt8]) -> [UInt8] { body }
}

/// `9106` background log: 16-byte records, little endian.
/// Bit layout from `Gen2BackgroundLogCommand.parseSingleLog`.
enum BackgroundLogDecoder {
    static let recordSize = 16

    struct RawRecord {
        var logTimeIndex: Int
        var walkStepDelta: Int
        var runningStepDelta: Int
        var distanceDelta: Int
        var activeCalories: Int
        var bmrCalories: Int
        var thermalGenIndex: Int
        var caseTempRaw: Int
        var powerConsumedIndex: Int
        var heartRate: Int
        var hrv: Int
        var battery: Int
        var solarGenIndex: Int
        var skinTempRaw: Int
        var logTypeValue: Int
    }

    /// Requires `body.count % 16 == 0`, matching the
    /// `DTPProtocolParsingError.BackgroundLogSizeMismatch` guard.
    static func parse(_ body: [UInt8], rtl: RTLTable, now: Date = Date()) -> [BackgroundLogEntry]? {
        guard body.count % recordSize == 0 else { return nil }
        var raws: [RawRecord] = []
        raws.reserveCapacity(body.count / recordSize)
        var offset = 0
        while offset + recordSize <= body.count {
            let w0 = Gen2Framing.readUInt32LE(body, at: offset)
            let w1 = Gen2Framing.readUInt32LE(body, at: offset + 4)
            let w2 = Gen2Framing.readUInt32LE(body, at: offset + 8)
            let w3 = Gen2Framing.readUInt32LE(body, at: offset + 12)
            let skinRaw = BitReader.extract(w3, high: 21, low: 13)
            raws.append(RawRecord(
                logTimeIndex: BitReader.extract(w0, high: 6, low: 0),
                walkStepDelta: BitReader.extract(w0, high: 14, low: 7),
                runningStepDelta: BitReader.extract(w0, high: 22, low: 15),
                distanceDelta: BitReader.extract(w0, high: 31, low: 23),
                activeCalories: BitReader.extract(w1, high: 14, low: 0),
                bmrCalories: BitReader.extract(w1, high: 25, low: 15),
                thermalGenIndex: BitReader.extract(w1, high: 31, low: 26),
                caseTempRaw: BitReader.extract(w2, high: 8, low: 0),
                powerConsumedIndex: BitReader.extract(w2, high: 16, low: 9),
                heartRate: BitReader.extract(w2, high: 24, low: 17),
                hrv: BitReader.extract(w2, high: 31, low: 25),
                battery: BitReader.extract(w3, high: 6, low: 0),
                solarGenIndex: BitReader.extract(w3, high: 12, low: 7),
                // `> 255 -> - 512` correction from the original decoder.
                skinTempRaw: skinRaw > 255 ? skinRaw - 512 : skinRaw,
                logTypeValue: BitReader.extract(w3, high: 25, low: 22)
            ))
            offset += recordSize
        }

        // Group by logTimeIndex, seed each group from the RTL timestamp and
        // advance 60 000 ms per entry within the group.
        var grouped: [Int: [RawRecord]] = [:]
        var order: [Int] = []
        for r in raws {
            if grouped[r.logTimeIndex] == nil { order.append(r.logTimeIndex) }
            grouped[r.logTimeIndex, default: []].append(r)
        }

        var entries: [BackgroundLogEntry] = []
        for index in order {
            guard index >= 0, index < rtl.timestamps.count else {
                // InvalidBackLogTimestampIndex in the Android decoder.
                continue
            }
            var time = roundMillisToSeconds(rtl.timestamps[index])
            for (i, r) in (grouped[index] ?? []).enumerated() {
                let type = WatchLogType(rawValue: r.logTypeValue) ?? .stateUnknown
                entries.append(BackgroundLogEntry(
                    logTimeIndex: index,
                    indexInGroup: i,
                    startTime: Date(timeIntervalSince1970: time),
                    walkStepDelta: r.walkStepDelta,
                    runningStepDelta: r.runningStepDelta,
                    distanceDelta: r.distanceDelta,
                    activeCalories: r.activeCalories,
                    bmrCalories: r.bmrCalories,
                    thermalGen: LogTables.generation(r.thermalGenIndex),
                    solarGen: LogTables.generation(r.solarGenIndex),
                    powerConsumed: LogTables.consumption(r.powerConsumedIndex),
                    caseTempRaw: r.caseTempRaw,
                    skinTempRaw: r.skinTempRaw,
                    heartRate: r.heartRate,
                    hrv: r.hrv,
                    battery: r.battery,
                    logType: type
                ))
                time += 60
            }
        }
        return entries
    }

    /// `DateTimeExtensionsKt.roundMillisToSeconds`
    static func roundMillisToSeconds(_ date: Date) -> TimeInterval {
        let millis = date.timeIntervalSince1970 * 1000
        let rounded = (millis / 1000).rounded() * 1000
        return rounded / 1000
    }
}

/// `9205` / `9105` activity delta: 12-byte LE records.
enum ActivityDeltaDecoder {
    static let recordSize = 12

    struct Record: Equatable {
        var type: WatchActivityType
        var deltaStep: Int
        var deltaCalsBMR: Int
        var deltaCalsActive: Int
        var deltaPowerConsumed: Int
        var deltaGPSLatByte: Int
        var deltaGPSLongByte: Int
        var deltaHeartRate: Int
        var deltaHRV: Int
        var deltaDistance: Int
        var deltaCaseTemp: Int
        var deltaSkinTemp: Int
    }

    static func parse(_ body: [UInt8]) -> [Record] {
        var records: [Record] = []
        var offset = 0
        while offset + recordSize <= body.count {
            let w0 = Gen2Framing.readUInt32LE(body, at: offset)
            let w1 = Gen2Framing.readUInt32LE(body, at: offset + 4)
            let w2 = Gen2Framing.readUInt32LE(body, at: offset + 8)
            let typeValue = BitReader.extract(w0, high: 3, low: 0)
            records.append(Record(
                type: WatchActivityType(rawValue: typeValue) ?? .unknown,
                deltaStep: BitReader.extract(w0, high: 9, low: 4),
                deltaCalsBMR: BitReader.extract(w0, high: 15, low: 10),
                deltaCalsActive: BitReader.extract(w0, high: 21, low: 16),
                deltaPowerConsumed: BitReader.extract(w0, high: 29, low: 22),
                deltaGPSLatByte: BitReader.extract(w1, high: 7, low: 0),
                deltaGPSLongByte: BitReader.extract(w1, high: 15, low: 8),
                deltaHeartRate: BitReader.extract(w2, high: 7, low: 0),
                deltaHRV: BitReader.extract(w2, high: 14, low: 8),
                deltaDistance: BitReader.extract(w2, high: 23, low: 15),
                deltaCaseTemp: BitReader.extract(w2, high: 27, low: 24),
                deltaSkinTemp: BitReader.extract(w2, high: 31, low: 28)
            ))
            offset += recordSize
        }
        return records
    }
}

/// `9215` activity header: 48-byte LE records (start and end markers paired by
/// `activityId`).
enum ActivityHeaderDecoder {
    static let recordSize = 48

    struct Marker: Equatable {
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

    static func parse(_ body: [UInt8]) -> [Marker] {
        var markers: [Marker] = []
        var offset = 0
        while offset + recordSize <= body.count {
            var w: [UInt32] = []
            for i in 0..<12 { w.append(Gen2Framing.readUInt32LE(body, at: offset + i * 4)) }
            markers.append(Marker(
                isEnd: BitReader.extract(w[0], high: 5, low: 0) == 1,
                activityId: BitReader.extract(w[0], high: 13, low: 6),
                startStepsWalk: BitReader.extract(w[0], high: 31, low: 14),
                startLogIndex: Int(w[1]),
                time: Date(timeIntervalSince1970: TimeInterval(w[2])),
                latitude: Double(bitPattern: w[3].littleEndianBitPattern),
                longitude: Double(bitPattern: w[4].littleEndianBitPattern),
                altitude: Double(BitReader.extract(w[5], high: 15, low: 0)),
                activeCalories: BitReader.extract(w[6], high: 23, low: 0),
                heartRate: BitReader.extract(w[6], high: 31, low: 24),
                caseTempRaw: BitReader.extract(w[7], high: 8, low: 0),
                skinTempRaw: BitReader.extract(w[7], high: 17, low: 9),
                activityType: WatchActivityType(rawValue: BitReader.extract(w[7], high: 25, low: 18)) ?? .unknown,
                logDistance: BitReader.extract(w[8], high: 18, low: 0),
                thermalGen: Int(w[9]),
                solarGen: Int(w[10]),
                powerConsumed: Int(w[11])
            ))
            offset += recordSize
        }
        return markers
    }
}

private extension UInt32 {
    /// `ActivityLogExtensionsKt.parseValueToFloat` reads an Int32 and converts
    /// with `java.lang.Float.intBitsToFloat`, so the stored word is an IEEE-754
    /// float, widened to Double.
    var littleEndianBitPattern: UInt64 {
        let bits = UInt32(littleEndian: self)
        let asFloat = withUnsafeBytes(of: bits) { $0.load(as: Float32.self) }
        return Double(asFloat).bitPattern
    }
}

/// `9108` sleep log: 16-byte LE records.
struct Gen2SleepEntryLog: Equatable {
    var startSleepTime: Date
    var endSleepTime: Date
    var hoursSlept: Int
    var minutesSlept: Int
    var percentRestless: Int
    var percentLightSleep: Int
    var percentDeepSleep: Int
    var sleepQuality: Int
}

enum SleepLogDecoder {
    static let recordSize = 16

    static func parse(_ body: [UInt8]) -> [Gen2SleepEntryLog] {
        var logs: [Gen2SleepEntryLog] = []
        var offset = 0
        while offset + recordSize <= body.count {
            let w0 = Gen2Framing.readUInt32LE(body, at: offset)
            let w1 = Gen2Framing.readUInt32LE(body, at: offset + 4)
            let w2 = Gen2Framing.readUInt32LE(body, at: offset + 8)
            let w3 = Gen2Framing.readUInt32LE(body, at: offset + 12)
            logs.append(Gen2SleepEntryLog(
                startSleepTime: Date(timeIntervalSince1970: TimeInterval(w0)),
                endSleepTime: Date(timeIntervalSince1970: TimeInterval(w1)),
                hoursSlept: BitReader.extract(w2, high: 7, low: 0),
                minutesSlept: BitReader.extract(w2, high: 15, low: 8),
                percentRestless: BitReader.extract(w2, high: 23, low: 16),
                percentLightSleep: BitReader.extract(w2, high: 31, low: 24),
                percentDeepSleep: BitReader.extract(w3, high: 7, low: 0),
                sleepQuality: BitReader.extract(w3, high: 15, low: 8)
            ))
            offset += recordSize
        }
        return logs
    }
}

/// `Gen2HeartRateParser`: `data[0] & 1 == 0` -> single byte at [1];
/// otherwise a 16-bit value from [1..2] read **big endian** by the Android code
/// (the Bluetooth HRS spec says little endian — reproduced as-is, flagged in
/// EVIDENCE.md).
enum HeartRateParser {
    static func parse(_ data: [UInt8]) -> Int? {
        guard let first = data.first else { return nil }
        if (first & 1) == 0 {
            guard data.count >= 2 else { return nil }
            return Int(data[1])
        }
        guard data.count >= 3 else { return nil }
        return Int((UInt16(data[1]) << 8) | UInt16(data[2]))
    }
}
