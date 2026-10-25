import Foundation

/// Built-in simulated PowerWatch 2.
///
/// The Android app can only show data once hardware is on the wrist. To keep the
/// iOS port fully functional without a watch, this transport answers the same
/// `Gen2Command`s — but it does so by **emitting real wire frames** through
/// `Gen2ResponseCollector`, i.e. the identical validation/decoding path the
/// CoreBluetooth transport uses. The simulator cannot pass by faking Swift
/// structs; it has to satisfy the same CRC and record-alignment rules.
///
/// Selection happens in `AppEnvironment`: if no real watch has been paired (or
/// CoreBluetooth is unavailable/unauthorized), the app uses this transport.
final class SimulatedTransport: WatchTransport, @unchecked Sendable {
    var onState: ((TransportState) -> Void)?
    var onHeartRate: ((Int) -> Void)?
    var onUnsolicitedFrame: (([UInt8]) -> Void)?

    private(set) var state: TransportState = .idle
    private(set) var isConnected = false

    static let simulatedIdentifier = "00000000-0000-0000-0000-000050574132"
    static let simulatedName = "PowerWatch 2 (Simulated)"

    private let deviceInfo = WatchDeviceInfo(
        firmware: "1.5.6.0",
        serialNumber: "SIMULATED01",
        modelNumber: "PW2-2760"
    )

    /// Injectable clock. Production leaves this at `Date.init`: the simulated
    /// watch reports only the part of today that has actually happened, exactly
    /// like real hardware, so tests pin it to get a deterministic full day.
    var now: @Sendable () -> Date = { Date() }
    private lazy var day: SyntheticWatchData.Day = SyntheticWatchData.makeDay(now: now())
    private var heartRateTimer: DispatchSourceTimer?
    private var rng = DeterministicRandom(seed: 0xC0FFEE)
    private let queue = DispatchQueue(label: "com.matrixindustries.powerwatch2.simulated")

    var simulatedDevice: DiscoveredWatch {
        // The same three bytes a real watch puts in its advertisement: pairing code
        // 4242 (big-endian short over the first two bytes) and protocol version 4,
        // so the QR / pairing-code step exercises identically without hardware.
        DiscoveredWatch(identifier: Self.simulatedIdentifier, name: Self.simulatedName, rssi: -45,
                        pairingCode: 4242, protocolVersion: 4, manufacturerData: [0x10, 0x92, 0x04])
    }

    // MARK: - WatchTransport

    func prepare() {
        queue.async { [weak self] in self?.publish(.idle) }
    }

    func scan(duration: TimeInterval) async -> [DiscoveredWatch] {
        let device = simulatedDevice
        return await withCheckedContinuation { (continuation: CheckedContinuation<[DiscoveredWatch], Never>) in
            queue.asyncAfter(deadline: .now() + min(0.6, duration)) {
                continuation.resume(returning: [device])
            }
        }
    }

    func connect(_ watch: DiscoveredWatch) async throws {
        try await withCheckedThrowingContinuation { (continuation: CheckedContinuation<Void, Error>) in
            queue.asyncAfter(deadline: .now() + 0.35) { [weak self] in
                guard let self else { return continuation.resume(throwing: TransportError.released) }
                self.isConnected = true
                self.publish(.connected(self.deviceInfo))
                continuation.resume(returning: ())
            }
        }
    }

    func disconnect() {
        queue.async { [weak self] in
            guard let self else { return }
            self.isConnected = false
            self.stopHeartRateStream()
            self.publish(.disconnected(nil))
        }
    }

    /// The simulated watch is always "in range", so reconnecting is just the same
    /// connect the pairing flow ran, with no scan and no pending request.
    @discardableResult
    func startConnection(to identifier: String) async -> Bool {
        guard !isConnected else { return true }
        guard identifier.isEmpty || identifier == Self.simulatedIdentifier else {
            NSLog("pw2-sim startConnection: %@ was not this watch", identifier)
            return false
        }
        try? await connect(simulatedDevice)
        return isConnected
    }

    func stopConnection() {
        disconnect()
    }

    /// Opcodes this watch has been asked to execute, in arrival order. Queue
    /// confined; read it with `opcodeTrace()`. The sync-order test asserts against
    /// this rather than trusting the caller's bookkeeping.
    private var observedOpcodes: [String] = []

    func opcodeTrace() async -> [String] {
        await withCheckedContinuation { (continuation: CheckedContinuation<[String], Never>) in
            queue.async { continuation.resume(returning: self.observedOpcodes) }
        }
    }

    func perform(_ command: Gen2Command) async throws -> [UInt8] {
        try await withCheckedThrowingContinuation { (continuation: CheckedContinuation<[UInt8], Error>) in
            queue.async { [weak self] in
                guard let self else { return continuation.resume(throwing: TransportError.released) }
                guard self.isConnected else {
                    continuation.resume(throwing: TransportError.notConnected); return
                }
                self.observedOpcodes.append(command.opcode)
                let frames = self.frames(for: command)
                var result: Result<[UInt8], Error> = .success([])
                let collector = Gen2ResponseCollector { _ in /* simulated: no write-back needed */ }
                stream: for frame in frames {
                    switch collector.ingest(frame) {
                    case .complete(let body):
                        result = .success(body)
                        break stream
                    case .failed(let error):
                        result = .failure(error)
                        break stream
                    case .watchAckReceived:
                        // Fire-and-forget commands finish at the watch's ACK.
                        if !command.expectsResponse {
                            result = .success([])
                            break stream
                        }
                    case .ignored, .controlResend:
                        break
                    }
                }
                continuation.resume(with: result)
            }
        }
    }

    func readDeviceInfo() async throws -> WatchDeviceInfo {
        deviceInfo
    }

    /// Answers `2A25` the way a Gen2 watch does: 4-byte little-endian records whose fourth
    /// byte is the `HSMTable` id. The values come from the same simulated day the log
    /// commands answer with, so the realtime card and a later sync agree. Scaling matches the
    /// frames captured from real hardware where the APK's parser pins it (calories in
    /// thousandths, distance in metres); skin temperature is scaled ×10 to look like the wire,
    /// but no unit is established for it — the APK's realtime path never renders that field.
    func readRealtimePayload() async throws -> [UInt8] {
        try await withCheckedThrowingContinuation { (continuation: CheckedContinuation<[UInt8], Error>) in
            queue.async { [weak self] in
                guard let self, self.isConnected else {
                    continuation.resume(throwing: TransportError.notConnected); return
                }
                let samples = self.day.samples
                let steps = samples.reduce(0) { $0 + $1.steps }
                let running = samples.filter { $0.logType == .awakeRunning }.reduce(0) { $0 + $1.steps }
                let active = samples.reduce(0) { $0 + $1.activeCalories }
                let bmr = samples.reduce(0) { $0 + $1.bmrCalories }
                let distance = samples.reduce(0) { $0 + $1.distance }
                let thermal = samples.reduce(0) { $0 + $1.thermalGen }
                let solar = samples.reduce(0) { $0 + $1.solarGen }
                let sleepMinutes = samples.filter {
                    $0.logType == .sleepDeep || $0.logType == .sleepLight || $0.logType == .sleepRestless
                }.count
                let battery = samples.last?.battery ?? 100
                let skinRaw = Int(((samples.last?.skinTempC ?? 34.0) * 10).rounded())
                continuation.resume(returning: Gen2InfoRecords.encode([
                    (Gen2InfoRecords.RealtimeField.totalSteps.rawValue, steps),
                    (Gen2InfoRecords.RealtimeField.totalCurrentStepsWalk.rawValue, max(0, steps - running)),
                    (Gen2InfoRecords.RealtimeField.totalCurrentStepsRun.rawValue, running),
                    (Gen2InfoRecords.RealtimeField.totalCalories.rawValue, (active + bmr) * 1000),
                    (Gen2InfoRecords.RealtimeField.totalCurrentCaloriesBRM.rawValue, bmr * 1000),
                    (Gen2InfoRecords.RealtimeField.totalCurrentCaloriesActive.rawValue, active * 1000),
                    (Gen2InfoRecords.RealtimeField.totalSleep.rawValue, sleepMinutes),
                    (Gen2InfoRecords.RealtimeField.totalDistance.rawValue, distance),
                    (Gen2InfoRecords.RealtimeField.totalSolarPower.rawValue, solar),
                    (Gen2InfoRecords.RealtimeField.totalThermalPower.rawValue, thermal),
                    (Gen2InfoRecords.RealtimeField.batteryPercentage.rawValue, battery),
                    (Gen2InfoRecords.RealtimeField.totalSkinTemp.rawValue, skinRaw),
                ]))
            }
        }
    }

    /// Answers `2A24` with the settings pairing writes (`9022`/`9024`), so the read looks
    /// like a freshly paired watch: metric, 24 h, English, 175 cm/75 kg, 5 000 steps.
    func readSettingsPayload() async throws -> [UInt8] {
        try await withCheckedThrowingContinuation { (continuation: CheckedContinuation<[UInt8], Error>) in
            queue.async { [weak self] in
                guard let self, self.isConnected else {
                    continuation.resume(throwing: TransportError.notConnected); return
                }
                let s = Gen2InfoRecords.SettingsField.self
                continuation.resume(returning: Gen2InfoRecords.encode([
                    (s.clockFormatSelection.rawValue, 0),
                    (s.unitSelection.rawValue, 0),
                    (s.languageSelection.rawValue, 0),
                    (s.timeZone.rawValue, 0),
                    (s.gender.rawValue, 0),
                    (s.age.rawValue, 30),
                    (s.weight.rawValue, 75),
                    (s.height.rawValue, 1750),
                    (s.stepGoal.rawValue, 5_000),
                    (s.distanceGoal.rawValue, 5_000),
                    (s.caloriesGoal.rawValue, 500),
                    (s.sleepGoal.rawValue, 480),
                    (s.backLight.rawValue, 1),
                    (s.backLightDuration.rawValue, 5),
                    (s.popupDuration.rawValue, 10),
                    (s.gpsUpdateRate.rawValue, 1),
                    (s.homeScreen.rawValue, 0),
                    (s.bleDisconnect.rawValue, 0),
                    (s.ringtone.rawValue, 0),
                ]))
            }
        }
    }

    func subscribeHeartRate() async throws {
        queue.async { [weak self] in self?.startHeartRateStream() }
    }

    func unsubscribeHeartRate() async {
        await withCheckedContinuation { (continuation: CheckedContinuation<Void, Never>) in
            queue.async { [weak self] in
                self?.stopHeartRateStream()
                continuation.resume()
            }
        }
    }

    // MARK: - Frame generation

    private func publish(_ newState: TransportState) {
        state = newState
        onState?(newState)
    }

    /// Every command is answered with the observed sequence: the watch's own
    /// `AckGood`, zero or more data frames, then the `E200` completion frame.
    private func frames(for command: Gen2Command) -> [[UInt8]] {
        var frames: [[UInt8]] = [Gen2Framing.ackGood]
        switch command.opcode {
        case Gen2Opcode.getLogCountVer3, Gen2Opcode.getLogCount:
            let samples = day.samples.count
            let deltas = deltaRecords().count
            var sessionRng = DeterministicRandom(seed: 0x5EED)
            let headers = SyntheticWatchData.makeSessions(
                now: now(), calendar: Calendar.current, rng: &sessionRng
            ).count * 2
            let counts = [0, 0, headers, deltas, samples, 1]
                .flatMap { Gen2Framing.bigEndianBytes(UInt32(clamping: $0)) }
            frames.append(Gen2Framing.encodeResponse(body: counts))

        case Gen2Opcode.rtlStatus:
            frames.append(Gen2Framing.encodeResponse(body: Array(repeating: 0, count: max(8, day.rtlTimestamps.count))))

        case Gen2Opcode.rtlTime:
            frames.append(Gen2Framing.encodeResponse(body: rtlTimeBody(day.rtlTimestamps)))

        case Gen2Opcode.backgroundLog:
            frames.append(contentsOf: chunked(day.samples.map { $0 }, size: 40)
                .map { Gen2Framing.encodeResponse(body: SyntheticEncoder.pack($0)) })

        case Gen2Opcode.activityDeltaVer3, Gen2Opcode.activityDelta:
            let records = deltaRecords()
            frames.append(contentsOf: chunked(records, size: 40)
                .map { Gen2Framing.encodeResponse(body: SyntheticEncoder.packDelta($0)) })

        case Gen2Opcode.activityHeaderLog, Gen2Opcode.activityStartLog, Gen2Opcode.activityEndLog:
            let records = headerRecords()
            frames.append(contentsOf: chunked(records, size: 8)
                .map { Gen2Framing.encodeResponse(body: SyntheticEncoder.packHeader($0)) })

        case Gen2Opcode.sleepLog:
            frames.append(Gen2Framing.encodeResponse(body: SyntheticEncoder.packSleep(sleepRecords())))

        default:
            // Settings writes, session control, clean commands: ack + completion.
            break
        }
        frames.append(Gen2Framing.completionFrame())
        return frames
    }

    /// `RTLTimeCommand.extractResponse` reverses the payload, reads big endian
    /// u32s and reverses the resulting list, so build the body accordingly.
    private func rtlTimeBody(_ timestamps: [Date]) -> [UInt8] {
        let values = timestamps.map { UInt32(clamping: Int($0.timeIntervalSince1970)) }.reversed()
        let oriented = values.flatMap { Gen2Framing.bigEndianBytes($0) }
        return Array(oriented.reversed())
    }

    private func chunked<T>(_ items: [T], size: Int) -> [[T]] {
        guard !items.isEmpty else { return [] }
        return stride(from: 0, to: items.count, by: size).map {
            Array(items[$0..<min($0 + size, items.count)])
        }
    }

    // MARK: - Synthetic content

    private func deltaRecords() -> [SyntheticEncoder.DeltaRecord] {
        day.samples.compactMap { sample in
            guard sample.logType == .awakeWalking || sample.logType == .awakeRunning else { return nil }
            let type: WatchActivityType = sample.logType == .awakeRunning ? .running : .walking
            return SyntheticEncoder.DeltaRecord(
                type: type,
                step: sample.steps,
                calsBMR: sample.bmrCalories,
                calsActive: sample.activeCalories,
                powerConsumed: sample.powerConsumed,
                gpsLatByte: Int(abs(sample.logTimeIndex * 7)) % 256,
                gpsLongByte: Int(abs(sample.logTimeIndex * 11)) % 256,
                heartRate: sample.heartRate,
                hrv: sample.hrv,
                distance: sample.distance,
                caseTemp: Int((sample.caseTempC * 4).rounded()) % 16,
                skinTemp: Int((sample.skinTempC * 4).rounded()) % 16
            )
        }
    }

    private func headerRecords() -> [SyntheticEncoder.HeaderRecord] {
        day.sessions.flatMap { session -> [SyntheticEncoder.HeaderRecord] in
            let inSession = day.samples.filter {
                $0.time >= session.start && $0.time <= session.end
            }
            let steps = inSession.reduce(0) { $0 + $1.steps }
            let distance = inSession.reduce(0) { $0 + $1.distance }
            let active = inSession.reduce(0) { $0 + $1.activeCalories }
            let thermal = inSession.reduce(0) { $0 + $1.thermalGen }
            let solar = inSession.reduce(0) { $0 + $1.solarGen }
            let consumed = inSession.reduce(0) { $0 + $1.powerConsumed }
            let avgHR = inSession.isEmpty ? 0 : inSession.reduce(0) { $0 + $1.heartRate } / inSession.count
            let peakSkin = inSession.map(\.skinTempC).max() ?? 34
            let peakCase = inSession.map(\.caseTempC).max() ?? 33

            let shared: (Bool, Date) -> SyntheticEncoder.HeaderRecord = { isEnd, time in
                SyntheticEncoder.HeaderRecord(
                    isEnd: isEnd,
                    activityId: session.id,
                    startStepsWalk: steps,
                    startLogIndex: inSession.first?.logTimeIndex ?? 0,
                    time: time,
                    latitude: session.latitude,
                    longitude: session.longitude,
                    altitude: session.altitude,
                    activeCalories: active,
                    heartRate: avgHR,
                    caseTempRaw: Int((peakCase * 4).rounded()),
                    skinTempRaw: Int((peakSkin * 4).rounded()),
                    activityType: session.type,
                    logDistance: distance,
                    thermalGen: thermal,
                    solarGen: solar,
                    powerConsumed: consumed
                )
            }
            return [shared(false, session.start), shared(true, session.end)]
        }
    }

    private func sleepRecords() -> [SyntheticEncoder.SleepRecord] {
        let sleepSamples = day.samples.filter { $0.logType.isSleep }
        guard let first = day.samples.first(where: { $0.logType.isSleep }),
              let last = sleepSamples.last else { return [] }
        let total = sleepSamples.count
        let deep = sleepSamples.filter { $0.logType == .sleepDeep }.count
        let light = sleepSamples.filter { $0.logType == .sleepLight }.count
        let restless = sleepSamples.filter { $0.logType == .sleepRestless }.count
        let hours = total / 60
        let minutes = total % 60
        return [
            SyntheticEncoder.SleepRecord(
                start: first.time,
                end: last.time,
                hours: hours,
                minutes: minutes,
                percentRestless: total == 0 ? 0 : restless * 100 / total,
                percentLight: total == 0 ? 0 : light * 100 / total,
                percentDeep: total == 0 ? 0 : deep * 100 / total,
                quality: min(100, 55 + total / 20)
            )
        ]
    }

    // MARK: - Heart rate stream

    private func startHeartRateStream() {
        heartRateTimer?.cancel()
        let timer = DispatchSource.makeTimerSource(queue: queue)
        timer.schedule(deadline: .now() + 1, repeating: 2.0)
        timer.setEventHandler { [weak self] in
            guard let self, self.isConnected else { return }
            let minute = Calendar.current.component(.minute, from: self.now())
            let hour = Double(Calendar.current.component(.hour, from: self.now())) + Double(minute) / 60
            let base: ClosedRange<Int> = (hour >= 12 && hour < 13) || (hour >= 17.5 && hour < 18.6)
                ? (95...165) : (hour < 6.6 || hour >= 22.5 ? (44...60) : (56...104))
            self.onHeartRate?(self.rng.int(in: base))
        }
        timer.resume()
        heartRateTimer = timer
    }

    private func stopHeartRateStream() {
        heartRateTimer?.cancel()
        heartRateTimer = nil
    }
}
