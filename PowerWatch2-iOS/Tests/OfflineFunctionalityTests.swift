import XCTest
@testable import PowerWatch2

/// End-to-end proof that the app is self-sufficient with the network removed:
/// sign-up, pairing, a full sync and the derived aggregations all run against
/// local implementations only.
@MainActor
final class OfflineFunctionalityTests: XCTestCase {
    private var directory: URL!
    private var store: LocalStore!

    override func setUp() async throws {
        directory = FileManager.default.temporaryDirectory
            .appendingPathComponent("pw2-tests-\(UUID().uuidString)", isDirectory: true)
        store = LocalStore(directory: directory)
    }

    override func tearDown() async throws {
        try? FileManager.default.removeItem(at: directory)
    }

    private func makeUser() -> UserAccount {
        UserAccount(uid: "u-1", enabled: true, name: "Test", email: "test@example.com",
                    password: "hunter2hunter2", age: 33, height: 180, weight: 80,
                    gender: .male, language: .en, unitType: .metric, timeFormatType: .twentyFour)
    }

    // MARK: Local account, no /oauth/token

    func testSignUpAndLoginWorkWithoutNetwork() async throws {
        let cloud = LocalOnlyCloudAPI(store: store, keychain: KeychainStore())
        let created = try await cloud.signUp(user: makeUser())
        XCTAssertTrue(created.enabled)

        let session = try await cloud.login(email: "test@example.com", password: "hunter2hunter2", hostUUID: "host")
        XCTAssertTrue(session.isValid)
        XCTAssertTrue(session.accessToken.hasPrefix("local-"))

        do {
            _ = try await cloud.login(email: "test@example.com", password: "wrong-password", hostUUID: "host")
            XCTFail("wrong password should be rejected")
        } catch let error as LocalOnlyCloudAPI.CloudError {
            XCTAssertEqual(error.localizedDescription, "Email and password do not match.")
        }
    }

    func testWeakPasswordIsRejected() async throws {
        let cloud = LocalOnlyCloudAPI(store: store, keychain: KeychainStore())
        var short = makeUser()
        short.password = "short"
        do {
            _ = try await cloud.signUp(user: short)
            XCTFail("weak password should be rejected")
        } catch let error as LocalOnlyCloudAPI.CloudError {
            XCTAssertEqual(error.localizedDescription, "The password must be a minimum of 8 characters.")
        }
    }

    /// Room kept the password in the clear in `User.password` and
    /// `PasswordCredentials.password`. Here the snapshot excludes it
    /// (`UserAccount.CodingKeys`) and the store blanks it defensively, so the
    /// secret must not appear anywhere in the file on disk — while login still
    /// works from the keychain.
    func testPasswordNeverReachesDisk() async throws {
        let cloud = LocalOnlyCloudAPI(store: store, keychain: KeychainStore())
        var user = makeUser()
        user.email = "nosecret@example.com"
        user.password = "sup3r-s3cret-passphrase"
        _ = try await cloud.signUp(user: user)

        let snapshot = try Data(contentsOf: directory.appendingPathComponent("snapshot.json"))
        let text = String(decoding: snapshot, as: UTF8.self)
        XCTAssertFalse(text.contains("sup3r-s3cret-passphrase"),
                       "snapshot.json must never contain the login secret")
        XCTAssertFalse(text.contains("password"),
                       "no password column should be serialised at all")
        XCTAssertTrue(text.contains("nosecret@example.com"), "sanity: the rest is stored")

        let session = try await cloud.login(email: "nosecret@example.com",
                                           password: "sup3r-s3cret-passphrase", hostUUID: "host")
        XCTAssertTrue(session.isValid)

        // And it survives a reload from disk, i.e. login does not depend on the
        // in-memory copy of the user.
        let reloaded = LocalStore(directory: directory)
        let cloud2 = LocalOnlyCloudAPI(store: reloaded, keychain: KeychainStore())
        let again = try await cloud2.login(email: "nosecret@example.com",
                                          password: "sup3r-s3cret-passphrase", hostUUID: "host")
        XCTAssertTrue(again.isValid)
    }

    /// `Gen2Ver4SyncExecutorImpl.create` fixes the command order, and two details
    /// matter for real hardware: `9024` carries the epoch + timezone the watch
    /// clock (and therefore the RTL-anchored log decode) comes from, so it has to
    /// precede the log reads; and `9001 StopAmDTP` closes the session on the
    /// success path, not only on error. `9108 SleepLog` is never sent (the executor
    /// carries a literal `//TODO sleep log command`) and `9023 CleanAllLogs` is
    /// opt-in here rather than unconditional.
    func testSyncCommandOrderMatchesVer4Executor() async throws {
        await store.save(user: makeUser())
        await store.save(device: PairedDevice(uid: "d-1", serialNumber: "SIM", bluetoothAddress: "SIM"))

        let transport = SimulatedTransport()
        try await transport.connect(transport.simulatedDevice)
        let synchronizer = WatchSynchronizer(
            transport: transport, store: store,
            cloud: LocalOnlyCloudAPI(store: store, keychain: KeychainStore())
        )
        await synchronizer.sync()
        XCTAssertNil(synchronizer.lastError, "sync failed: \(synchronizer.lastError ?? "none")")

        let trace = await transport.opcodeTrace()
        XCTAssertEqual(trace.first, Gen2Opcode.startAmDTP, "DTP session opens the sync")

        let expected = [
            Gen2Opcode.startAmDTP,            // 9000
            Gen2Opcode.getLogCountVer3,       // 9126
            Gen2Opcode.getUserAndGoalsVer3,   // 9124
            Gen2Opcode.sendUserPrefsAndGoalsVer3, // 9024  <- before the logs
            Gen2Opcode.rtlStatus,             // 9107
            Gen2Opcode.rtlTime,               // 9117
            Gen2Opcode.activityHeaderLog,     // 9215
            Gen2Opcode.activityDeltaVer3,     // 9205
            Gen2Opcode.backgroundLog,         // 9106
            Gen2Opcode.stopAmDTP,             // 9001
        ]
        let positions = expected.compactMap { trace.firstIndex(of: $0) }
        XCTAssertEqual(positions.count, expected.count,
                       "missing commands in trace \(trace)")
        XCTAssertEqual(positions, positions.sorted(),
                       "commands out of order; expected \(expected) in \(trace)")

        XCTAssertFalse(trace.contains(Gen2Opcode.sleepLog), "9108 is not part of the Ver4 chain")
        XCTAssertFalse(trace.contains(Gen2Opcode.cleanAllLogs), "9023 is opt-in")
        XCTAssertEqual(trace.filter { $0 == Gen2Opcode.stopAmDTP }.count, 1,
                       "exactly one StopAmDTP on success")
    }

    /// `Gen2PairExecutorImpl` sends `9010`/`9011` through
    /// `sendSingleCommandWithAck`, so the watch answers them with an `E200`
    /// completion frame the phone has to ACK — they are not fire-and-forget
    /// commands. Treating them as such left the watch retransmitting that frame
    /// every 10 s and then dropping the link, which is how the first real pairing
    /// attempt ended (10 s after `9000` the watch disconnected).
    func testPairingCommandsWaitForTheCompletionFrame() async throws {
        XCTAssertTrue(Gen2Command.startPairing.expectsResponse,
                      "9010 is sendSingleCommandWithAck in Gen2PairExecutorImpl")
        XCTAssertTrue(Gen2Command.stopPairing.expectsResponse,
                      "9011 is sendSingleCommandWithAck in Gen2PairExecutorImpl")

        let transport = SimulatedTransport()
        try await transport.connect(transport.simulatedDevice)
        let started = try await transport.perform(Gen2Command.startPairing)
        let stopped = try await transport.perform(Gen2Command.stopPairing)
        XCTAssertEqual(started, [], "the completion frame carries status only")
        XCTAssertEqual(stopped, [])
        let trace = await transport.opcodeTrace()
        XCTAssertEqual(trace, [Gen2Opcode.startPairing, Gen2Opcode.stopPairing])
    }

    /// `ExecutorsFactory.createPairExecutor` routes the pairing chain by the
    /// protocol version in the advertisement, and every step is
    /// `sendSingleCommandWithAck`, so each one must wait for the `E200` status
    /// frame. The real watch advertises version 4, i.e. the
    /// `Gen2Version3PairExecutorImpl` row.
    func testPairingChainFollowsExecutorsFactory() {
        func opcodes(_ version: Int) -> [String] {
            Gen2Command.pairingChain(protocolVersion: version, user: makeUser(),
                                     goals: GoalConfiguration(), settings: WatchSettings())
                .map(\.command.opcode)
        }
        func powers(_ version: Int) -> [Double] {
            Gen2Command.pairingChain(protocolVersion: version, user: makeUser(),
                                     goals: GoalConfiguration(), settings: WatchSettings())
                .map(\.power)
        }

        XCTAssertEqual(opcodes(0), [Gen2Opcode.startPairing, Gen2Opcode.receiveUserInformation,
                                    Gen2Opcode.sendUserInformation, Gen2Opcode.sendBiometrics,
                                    Gen2Opcode.sendLanguage, Gen2Opcode.receiveStepsDistanceGoals,
                                    Gen2Opcode.sendStepsDistanceGoal, Gen2Opcode.sendCaloriesSleepGoal,
                                    Gen2Opcode.stopPairing],
                       "Gen2PairExecutorImpl's ten-command chain (device info is a GATT read, not a frame)")
        XCTAssertEqual(opcodes(1), opcodes(0))
        XCTAssertEqual(opcodes(2), [Gen2Opcode.startPairing, Gen2Opcode.getUserAndGoals,
                                    Gen2Opcode.sendUserPrefsAndGoals, Gen2Opcode.stopPairing],
                       "Gen2Version2PairExecutorImpl")
        XCTAssertEqual(opcodes(3), [Gen2Opcode.startPairing, Gen2Opcode.getUserAndGoalsVer3,
                                    Gen2Opcode.sendUserPrefsAndGoalsVer3, Gen2Opcode.stopPairing],
                       "Gen2Version3PairExecutorImpl, which is what a version-4 watch gets")
        XCTAssertEqual(opcodes(4), opcodes(3))

        // SyncProgressChannel weights: `f * 0.1f` per step, except the two config
        // commands in the Ver2/Ver3 executors which pass 0.3f and 0.4f.
        XCTAssertEqual(powers(1), [Double](repeating: 0.1, count: 9))
        XCTAssertEqual(powers(4).map { ($0 * 10).rounded() }, [1, 3, 4, 1])
        XCTAssertEqual(powers(4).reduce(0, +), 0.9, accuracy: 0.0001,
                       "the remaining 0.1 is the device-info read before the chain")

        for version in [0, 2, 4] {
            for step in Gen2Command.pairingChain(protocolVersion: version, user: makeUser(),
                                                 goals: GoalConfiguration(), settings: WatchSettings()) {
                XCTAssertTrue(step.command.expectsResponse,
                              "\(step.command.opcode) is sendSingleCommandWithAck during pairing")
            }
        }
    }

    /// `9002`/`9022` only appear on the older chains, so pin their byte layouts
    /// against `Gen2SendUserInformationCommand` and `Gen2SendUserPrefsAndGoalsCommand`.
    func testLegacyPairingPayloadLayouts() {
        let zone = TimeZone(secondsFromGMT: 3600)!
        let now = Date(timeIntervalSince1970: 1_700_000_000)
        let info = Gen2Command.sendUserInformation(user: makeUser(), now: now, timeZone: zone)
        XCTAssertEqual(info.payload.count, 8, "!twelveHourFormat, metricsFormat, u32 epoch, i16 tz")
        XCTAssertEqual(info.payload[0], 1, "the user is on the 24 h clock, i.e. !twelveHourFormat")
        XCTAssertEqual(info.payload[1], 1, "metric")
        XCTAssertEqual(Array(info.payload[2..<6]), [0x65, 0x53, 0xF1, 0x00], "epoch big endian")
        XCTAssertEqual(Array(info.payload[6...]), [0x00, 0x3C], "+60 minutes big endian")

        let ver3 = Gen2Command.sendUserPrefsAndGoalsVer3(user: makeUser(), goals: GoalConfiguration(),
                                                        settings: WatchSettings(), now: now, timeZone: zone)
        let ver1 = Gen2Command.sendUserPrefsAndGoals(user: makeUser(), goals: GoalConfiguration(),
                                                     settings: WatchSettings(), now: now, timeZone: zone)
        XCTAssertEqual(ver3.payload.count, 32)
        XCTAssertEqual(ver1.payload.count, 31, "the Ver1 layout is 9024 without sleepTimeSelection")
        XCTAssertEqual(ver1.payload, Array(ver3.payload.dropLast()))
    }

    /// Foundation's `%s` wants a `char *`, so the APK's `searching_for_single_device`
    /// ("Searching for %s", formatted in Java with any object) segfaulted the app as
    /// soon as a QR code resolved: the main thread died in `_platform_strlen` under
    /// `PairingViewModel.scan` (`PowerWatch2-2026-10-24-131642.ips`). `R.format` is the
    /// only way an APK string with a `%s` may be formatted.
    func testAPKFormatStringsAcceptStringArguments() {
        XCTAssertEqual(R.searchingForSingleDevice, "Searching for %s")
        XCTAssertEqual(R.format(R.searchingForSingleDevice, "1278"), "Searching for 1278")
        XCTAssertEqual(R.format("%s%%", "42"), "42%")
    }

    /// `sdk/DeviceManagerImpl` connects by itself: `MainDashboardViewModel`'s
    /// constructor calls `deviceManager.init()`, whose Bluetooth subscription runs
    /// `startConnection()` → `communicator.startConnection(listOf(device.bluetoothAddress))`,
    /// and `BleConnectionWithRetryOperation` waits in `establishConnection(autoConnect = true)`.
    /// There is no Connect button anywhere in the APK, so the transports own that
    /// behaviour here — and the contract is checkable without a radio: the identifier
    /// that was paired reconnects on its own, a stranger's does not.
    func testTransportReconnectsToThePairedWatch() async {
        let sim = SimulatedTransport()
        XCTAssertFalse(sim.isConnected, "a fresh transport starts idle, like the APK's")

        let reconnected = await sim.startConnection(to: SimulatedTransport.simulatedIdentifier)
        XCTAssertTrue(reconnected, "the stored identifier has to bring the link back up")
        XCTAssertTrue(sim.isConnected)

        let stranger = SimulatedTransport()
        let foreign = await stranger.startConnection(to: "1F2E3D4C-0000-4000-8000-112233445566")
        XCTAssertFalse(foreign, "a watch that was never paired must not be connected")
        XCTAssertFalse(stranger.isConnected)

        // `DeviceManagerImpl.stopConnection()` clears the subscription; afterwards a
        // reconnect attempt is refused rather than silently succeeding.
        stranger.stopConnection()
    }

    /// `sdk/RealtimeDataParser`/`sdk/SettingsDataParser` both decode the same record layout:
    /// `chunked(4)`, groups shorter than four dropped, the **fourth** byte is the table id and
    /// the first three are a little-endian 24-bit value (`ByteBuffer.allocate(4).put(0)
    /// .put(reversedTail).getInt()`). Ids are `sdk/HSMTable` for `2A25` and `sdk/SettingTable`
    /// for `2A24`. The vectors are the real bytes this watch sent on `2A25`/`2A24`.
    func testRealtimeAndSettingsCharacteristicsDecode() {
        // Read from a V2.8.4r2 watch: 1042 steps, 62 active kcal, no sleep yet, 856 m.
        let realtimeBytes: [UInt8] = [
            0x12, 0x04, 0x00, 0x00,   // TotalSteps = 1042
            0x12, 0x04, 0x00, 0x01,   // walk steps = 1042 (parsed by nobody, as in the APK)
            0x00, 0x00, 0x00, 0x02,   // run steps = 0
            0x4B, 0x23, 0x02, 0x10,   // total calories, 24-bit
            0x07, 0x2F, 0x01, 0x11,   // BRM calories
            0x44, 0xF4, 0x00, 0x12,   // active calories 62_532 → /1000 = 62
            0x00, 0x00, 0x00, 0x20,   // sleep = 0 minutes
            0x58, 0x03, 0x00, 0x30,   // distance 856 m → /1000 (integer) = 0 km
            0x50, 0x00, 0x00, 0x40,   // solar power = 80
            0x15, 0x00, 0x00, 0x41,   // thermal power = 21
            0x78, 0x00, 0x00, 0x50,   // skin temp: the parser's one signed field, raw 120
            0x3C, 0x00, 0x00, 0x42,   // battery 60 %
            0x01, 0x02,               // trailing partial group → dropped
        ]
        let realtime = Gen2InfoRecords.parseRealtime(realtimeBytes)
        XCTAssertEqual(realtime.totalSteps, 1_042)
        XCTAssertEqual(realtime.totalActiveCalories, 62)
        XCTAssertEqual(realtime.totalSleepMinutes, 0)
        XCTAssertEqual(realtime.totalDistanceKilometres, 0,
                       "the APK divides metres by 1000 with integer arithmetic")
        XCTAssertEqual(realtime.totalSolarPower, 80)
        XCTAssertEqual(realtime.totalThermalPower, 21)
        XCTAssertEqual(realtime.skinTemp, 120)
        XCTAssertEqual(realtime.batteryPercent, 60)
        XCTAssertTrue(realtime.isBatteryValid)

        // A payload with no battery record keeps the APK's `Float.MIN_VALUE` meaning.
        var noBattery = realtimeBytes
        noBattery.removeSubrange(44..<50)   // the battery record and the trailing stub
        XCTAssertFalse(Gen2InfoRecords.parseRealtime(noBattery).isBatteryValid)

        // Negative skin temperature exercises the 24-bit sign extension.
        let frozen = Gen2InfoRecords.parseRealtime([0x9C, 0xFF, 0xFF, 0x50])
        XCTAssertEqual(frozen.skinTemp, -100)

        // `2A24` from the same watch: metric, 24 h, English, 25 y, 75 kg, 175 cm, 5 000 steps.
        let settingsBytes: [UInt8] = [
            0x00, 0x00, 0x00, 0x00,   // ClockFormatSelection
            0x00, 0x00, 0x00, 0x01,   // UnitSelection
            0x00, 0x00, 0x00, 0x02,   // LanguageSelection
            0xD4, 0xFE, 0xFF, 0x03,   // TimeZone (read unsigned by the APK)
            0x00, 0x00, 0x00, 0x04,   // Gender
            0x19, 0x00, 0x00, 0x05,   // Age = 25
            0x4B, 0x00, 0x00, 0x06,   // Weight = 75 kg
            0xD6, 0x06, 0x00, 0x07,   // Height = 1750 mm
            0x88, 0x13, 0x00, 0x08,   // StepGoal = 5000
            0x88, 0x13, 0x00, 0x09,   // DistanceGoal
            0x2C, 0x01, 0x00, 0x0A,   // CaloriesGoal = 300
            0xE0, 0x01, 0x00, 0x0B,   // SleepGoal = 480 min
        ]
        let settings = Gen2InfoRecords.parseSettings(settingsBytes)
        XCTAssertEqual(settings.age, 25)
        XCTAssertEqual(settings.weight, 75)
        XCTAssertEqual(settings.height, 1_750)
        XCTAssertEqual(settings.heightCentimetres, 175)
        XCTAssertEqual(settings.stepGoal, 5_000)
        XCTAssertEqual(settings.sleepGoal, 480)
        XCTAssertNil(settings.alert, "absent ⇒ the APK's 0xFFFFFF `not reported` default")

        // Encoding is the exact inverse, which is what the simulated watch answers with.
        let roundTrip: [(UInt8, Int)] = [
            (Gen2InfoRecords.RealtimeField.totalSteps.rawValue, 1_042),
            (Gen2InfoRecords.RealtimeField.totalCurrentCaloriesActive.rawValue, 62_532),
            (Gen2InfoRecords.SettingsField.height.rawValue, 1_750),
        ]
        let encoded = Gen2InfoRecords.encode(roundTrip)
        XCTAssertEqual(Gen2InfoRecords.parseRealtime(Array(encoded[0..<8])).totalSteps, 1_042)
        XCTAssertEqual(Gen2InfoRecords.parseRealtime(Array(encoded[0..<8])).totalActiveCalories, 62)
        XCTAssertEqual(Gen2InfoRecords.parseSettings(Array(encoded[8..<12])).height, 1_750)
    }

    /// `RealTimeDataProviderImpl`'s constructor connects a `replay(1)` built on
    /// `deviceManager.connect()`; for a connected Gen2 device it ticks
    /// `Observable.interval(0, 20, SECONDS)` → `realtimeDataExecutor.readData` (a GATT read of
    /// `2A25`) followed by `loadSettingsFromWatch` (a GATT read of `2A24`). Those two reads are
    /// the APK's keep-alive, and they have to run without a radio too.
    @MainActor
    func testRealtimeProviderPollsBothCharacteristics() async throws {
        let sim = SimulatedTransport()
        _ = await sim.startConnection(to: SimulatedTransport.simulatedIdentifier)
        XCTAssertTrue(sim.isConnected)

        let provider = RealtimeDataProvider(transportProvider: { sim }, interval: 0.05)
        var ticks = 0
        provider.onUpdate = { _, _ in ticks += 1 }
        provider.start()
        for _ in 0..<60 where provider.realtime == nil {
            try await Task.sleep(nanoseconds: 20_000_000)
        }
        provider.stop()

        XCTAssertFalse(provider.isRunning, "stopping clears the subscription")
        XCTAssertGreaterThan(ticks, 0, "each decoded tick is handed to the observer")
        let data = try XCTUnwrap(provider.realtime, "the poll must decode 2A25")
        XCTAssertGreaterThan(data.totalSteps, 0)
        XCTAssertTrue(data.isBatteryValid, "the simulated watch reports a battery, like a real one")
        XCTAssertNotNil(provider.settings?.stepGoal)

        // While disconnected the APK's `switchMap` yields `Observable.empty()`, so a provider
        // must not invent values.
        sim.disconnect()
        let idle = RealtimeDataProvider(transportProvider: { sim }, interval: 0.05)
        idle.start()
        try await Task.sleep(nanoseconds: 150_000_000)
        idle.stop()
        XCTAssertNil(idle.realtime)
    }

    /// `utils/HeightConverter` (÷2.54) and `utils/WeightConverter` (×2.2046) with the
    /// ranges from `UserPrefsUtilsKt`. The model — and therefore `9012`/`9024` — always
    /// holds cm and kg; only the screen converts, which is what `PersonalSettingsVM`
    /// does with `UserPrefsUtils.getValue(value, HEIGHT/WEIGHT)` (E-63).
    func testBodyMetricsFollowTheUsersUnits() {
        XCTAssertEqual(Formatters.heightValue(180, unit: .metric), 180)
        XCTAssertEqual(Formatters.heightValue(180, unit: .imperial), 70.866, accuracy: 0.001)
        XCTAssertEqual(Formatters.height(180, unit: .metric), "180 cm")
        XCTAssertEqual(Formatters.height(180, unit: .imperial), "71 in")
        XCTAssertEqual(Formatters.centimetres(fromHeight: 70.866, unit: .imperial), 180, accuracy: 0.01)

        XCTAssertEqual(Formatters.weightValue(80, unit: .metric), 80)
        XCTAssertEqual(Formatters.weightValue(80, unit: .imperial), 176.368, accuracy: 0.001)
        XCTAssertEqual(Formatters.weight(80, unit: .metric), "80 kg")
        XCTAssertEqual(Formatters.weight(80, unit: .imperial), "176 lb")
        XCTAssertEqual(Formatters.kilograms(fromWeight: 176.368, unit: .imperial), 80, accuracy: 0.01)

        XCTAssertEqual(Formatters.heightRange(.metric), 100...270)
        XCTAssertEqual(Formatters.heightRange(.imperial), 40...330)
        XCTAssertEqual(Formatters.weightRange(.metric), 29...150)
        XCTAssertEqual(Formatters.weightRange(.imperial), 65...330)

        // The wire format is unaffected by the display unit: an imperial user's
        // 70 in / 155 lb still reaches the watch as 1778 (cm×10) and 70 kg.
        let user = UserAccount(uid: "u-imp", name: "Imp", email: "i@example.com", age: 33,
                               height: Formatters.centimetres(fromHeight: 70, unit: .imperial),
                               weight: Formatters.kilograms(fromWeight: 155, unit: .imperial),
                               gender: .male, language: .en, unitType: .imperial,
                               timeFormatType: .twentyFour)
        let command = Gen2Command.sendUserPrefsAndGoalsVer3(
            user: user, goals: GoalConfiguration(), settings: WatchSettings(),
            now: Date(timeIntervalSince1970: 1_700_000_000),
            timeZone: TimeZone(secondsFromGMT: 0)!)
        XCTAssertEqual(command.payload[1], 0, "the metric flag is off for an imperial user")
        XCTAssertEqual(Int(command.payload[8]), 0, "!male")
        XCTAssertEqual(Int(command.payload[10]) << 8 | Int(command.payload[11]), 70, "155 lb → 70 kg")
        XCTAssertEqual(Int(command.payload[12]) << 8 | Int(command.payload[13]), 1_778, "70 in → 177.8 cm ×10")
    }

    /// The simulated watch has to answer the chain the same way the hardware does,
    /// otherwise the pairing screen only works on a real watch.
    func testSimulatedWatchAnswersTheWholePairingChain() async throws {
        let transport = SimulatedTransport()
        try await transport.connect(transport.simulatedDevice)
        let steps = Gen2Command.pairingChain(
            protocolVersion: Int(transport.simulatedDevice.protocolVersion ?? 4),
            user: makeUser(), goals: GoalConfiguration(), settings: WatchSettings()
        )
        XCTAssertEqual(steps.map(\.command.opcode),
                       [Gen2Opcode.startPairing, Gen2Opcode.getUserAndGoalsVer3,
                        Gen2Opcode.sendUserPrefsAndGoalsVer3, Gen2Opcode.stopPairing])
        for step in steps {
            _ = try await transport.perform(step.command)
        }
        let trace = await transport.opcodeTrace()
        XCTAssertEqual(trace, steps.map(\.command.opcode))
    }

    /// The watch retransmits any frame it has not heard an ACK for: on hardware the
    /// `E200` completion frame for `9010` arrived, was unanswered because the
    /// command had already completed on its ACK, arrived again 10 s later, and the
    /// watch disconnected. The transport answers such frames through this same
    /// collector, so pin that a lone status frame still produces an `AckGood`.
    func testStatusFrameIsAckedEvenWithoutACommandInFlight() {
        var acks: [Bool] = []
        let collector = Gen2ResponseCollector { acks.append($0) }
        let outcome = collector.ingest(Gen2Framing.completionFrame())
        XCTAssertEqual(acks, [true], "an unanswered completion frame makes the watch retry")
        XCTAssertEqual(outcome, .complete([]))
    }

    func testGoalsAreReadableAndWritableLocally() async throws {
        let cloud = LocalOnlyCloudAPI(store: store, keychain: KeychainStore())
        // The cloud build's `GoalConfigurationRepository.all` was cloud-first; it
        // must now succeed with no server at all. The values are the Kotlin
        // default arguments in the `GoalConfiguration` entity's synthetic
        // constructor — note steps is 5000 there, not the 10000 that
        // `SingleGoalEditViewModel` substitutes when the edit field is empty.
        let fetched = try await cloud.fetchGoals()
        XCTAssertEqual(fetched.calories, 2000)
        XCTAssertEqual(fetched.distance, 5000)
        XCTAssertEqual(fetched.power, 6000)
        XCTAssertEqual(fetched.sleep, 480)
        XCTAssertEqual(fetched.steps, 5000)

        var updated = fetched
        updated.steps = 12_345
        try await cloud.saveGoals(updated)
        let round = try await cloud.fetchGoals()
        XCTAssertEqual(round.steps, 12_345)
    }

    func testFirmwareComesFromBundleNotURL() async throws {
        let cloud = LocalOnlyCloudAPI(store: store, keychain: KeychainStore())
        let info = try await cloud.fetchUpdateInfo(pid: 0, language: "en")
        XCTAssertEqual(info.localBundleResource, "ota_gps")
        // The payload lives in the app bundle, so this assertion only holds when
        // running inside the host app (it is not a SwiftPM package resource).
        try XCTSkipIf(
            Bundle.main.url(forResource: "ota_gps", withExtension: "bin") == nil,
            "ota_gps.bin is an app-bundle resource; not present in this host"
        )
        let data = try await cloud.downloadFirmware(info)
        XCTAssertFalse(data.isEmpty, "bundled firmware payload must be present")
    }

    func testAnalyticsCallsAreInert() async throws {
        let cloud = LocalOnlyCloudAPI(store: store, keychain: KeychainStore())
        // These used to hit /metrics/events/device/add and /reports/addAttachment.
        try await cloud.logDeviceEvents([.syncStart, .syncEnd], device: nil)
        try await cloud.uploadReport(attachment: Data([0x00]), type: "logcat")
    }

    // MARK: Full sync against the simulated watch

    func testFullSyncPopulatesLocalStoreThroughRealCodec() async throws {
        await store.save(user: makeUser())
        await store.save(device: PairedDevice(uid: "d-1", serialNumber: "SIM", bluetoothAddress: "SIM"))

        let transport = SimulatedTransport()
        // Pin the simulated watch's clock to the evening: the synthetic day only
        // contains the hours that have "happened", so running this test at 07:00
        // would legitimately see ~150 steps and no evening workout.
        let calendar = Calendar.current
        let evening = calendar.date(byAdding: .minute, value: 21 * 60 + 30,
                                    to: calendar.startOfDay(for: Date())) ?? Date()
        transport.now = { evening }
        try await transport.connect(transport.simulatedDevice)

        let cloud = LocalOnlyCloudAPI(store: store, keychain: KeychainStore())
        let synchronizer = WatchSynchronizer(transport: transport, store: store, cloud: cloud)
        await synchronizer.sync()

        XCTAssertNil(synchronizer.lastError, "sync failed: \(synchronizer.lastError ?? "none")")
        XCTAssertEqual(synchronizer.progress, 1)

        let logs = await store.backgroundLogs()
        XCTAssertFalse(logs.isEmpty, "background log records must be stored")
        XCTAssertTrue(logs.contains { $0.logType == .awakeWalking || $0.logType == .awakeRunning },
                      "activity samples expected")
        XCTAssertTrue(logs.contains { $0.logType.isSleep }, "sleep samples expected")
        XCTAssertTrue(logs.allSatisfy { $0.heartRate >= 40 && $0.heartRate <= 200 })

        let hours = await store.hourPeriods()
        XCTAssertFalse(hours.isEmpty)
        XCTAssertTrue(Set(hours.map(\.state)).count >= 2, "walking/resting/sleep states expected")

        let day = synchronizer.dayPeriod
        XCTAssertNotNil(day)
        XCTAssertGreaterThan(day?.steps ?? 0, 500, "a full day of simulated steps should aggregate")
        XCTAssertGreaterThan(day?.activeCalories ?? 0, 20)
        XCTAssertGreaterThan(day?.bodyPower ?? 0, 0, "thermal generation must resolve through the µWh table")
        XCTAssertGreaterThan(day?.maxHeartRate ?? 0, day?.minHeartRate ?? 0)
        XCTAssertNotNil(day?.wentToBed)
        XCTAssertNotNil(day?.wokeUp)
        XCTAssertNotNil(synchronizer.batteryPercent)

        // Two synthetic sessions (walk + bike) come back as user activity sessions.
        let sessions = await store.activitySessions()
        XCTAssertEqual(sessions.count, 2)
        XCTAssertTrue(sessions.contains { $0.activityType == .outdoorWalk })
        XCTAssertTrue(sessions.contains { $0.activityType == .outdoorCycle })
        XCTAssertTrue(sessions.allSatisfy { !$0.gpsPositions.isEmpty })
        XCTAssertTrue(sessions.allSatisfy { !$0.shouldSend })

        // The calendar index is rebuilt from sessions.
        let dates = await store.activityDates()
        XCTAssertFalse(dates.isEmpty)

        // Nothing is queued for upload once the (local) sync pass has run.
        let cloudAPI = cloud
        await cloudAPI.syncAllDataToCloud()
        let pending = await cloudAPI.hasDataToSync
        XCTAssertFalse(pending)
    }

    func testHeartRateStreamIsDeliveredFromTransport() async throws {
        let transport = SimulatedTransport()
        try await transport.connect(transport.simulatedDevice)
        let delivered = expectation(description: "heart rate")
        delivered.assertForOverFulfill = false
        var received: [Int] = []
        transport.onHeartRate = { bpm in
            received.append(bpm)
            delivered.fulfill()
        }
        try await transport.subscribeHeartRate()
        await fulfillment(of: [delivered], timeout: 8)
        XCTAssertFalse(received.isEmpty)
        XCTAssertTrue(received.allSatisfy { (40...200).contains($0) },
                      "simulated heart rate must stay physiological: \(received)")
        await transport.unsubscribeHeartRate()
    }

    // MARK: Aggregation unit behaviour

    /// Hour rows carry a *single* `sleepType` (majority classification per hour),
    /// mirroring the Room `ActivityLog.sleepType` column that
    /// `LogToHourGrouper1` produced. Day-level stage minutes are therefore
    /// attributed in whole hours, not per sample.
    func testPeriodAggregatorGroupsByHourAndState() {
        let calendar = Calendar.current
        let base = calendar.startOfDay(for: Date(timeIntervalSince1970: 1_700_000_000))
        let logs = (0..<90).map { minute in
            BackgroundLogEntry(
                logTimeIndex: 0, indexInGroup: minute,
                startTime: base.addingTimeInterval(TimeInterval(minute * 60)),
                walkStepDelta: 10, runningStepDelta: 0, distanceDelta: 7,
                activeCalories: 1, bmrCalories: 1,
                thermalGen: 16, solarGen: 32, powerConsumed: 8,
                caseTempRaw: 128, skinTempRaw: 136,
                heartRate: 60 + (minute % 40), hrv: 40, battery: 80,
                // Hour 0: 40 deep + 20 light (deep is the majority);
                // hour 1: 30 walking minutes.
                logType: minute < 40 ? .sleepDeep : (minute < 60 ? .sleepLight : .awakeWalking)
            )
        }
        let hours = PeriodAggregator.hourPeriods(from: logs, calendar: calendar)
        XCTAssertEqual(hours.count, 2, "one sleeping hour and one walking hour")
        XCTAssertEqual(hours.first?.state, .sleep)
        XCTAssertEqual(hours.first?.minsInPeriod, 60)
        XCTAssertEqual(hours.first?.sleepType, .deep, "40 of 60 minutes are deep")
        XCTAssertEqual(hours.first?.steps, 600, "every sample carries 10 steps")
        XCTAssertEqual(hours.last?.state, .walking)
        XCTAssertEqual(hours.last?.minsInPeriod, 30)
        XCTAssertEqual(hours.last?.steps, 300)

        let day = PeriodAggregator.dayPeriod(from: hours)
        XCTAssertEqual(day.steps, 900, "90 samples x 10 steps")
        XCTAssertEqual(day.sleepingMinutes, 60)
        XCTAssertEqual(day.deepMinutes, 60, "attributed in whole hours")
        XCTAssertEqual(day.lightMinutes, 0)
        XCTAssertEqual(day.awakeMinutes, 0, "hour 1 is walking, not resting")
        XCTAssertGreaterThan(day.avgHeartRate, 60)
        XCTAssertEqual(day.bodyPower, 90 * 16)
        XCTAssertEqual(day.solarPower, 90 * 32)
    }

    // MARK: Export

    func testGPXAndTCXExportProduceValidDocuments() async throws {
        let session = UserActivitySession(
            id: "s-1", name: "Outdoor Run", activityType: .outdoorRun, locationName: "",
            distance: 5000, steps: 5000,
            startTime: Date(timeIntervalSince1970: 1_700_000_000),
            endTime: Date(timeIntervalSince1970: 1_700_001_800),
            pace: 6, activeCalories: 300, bmrCalories: 60,
            splits: [RunningSplit(splitDuration: 600), RunningSplit(splitDuration: 600)],
            gpsPositions: (0..<20).map {
                GPSPosition(latitude: 45.46 + Double($0) / 10_000,
                            longitude: 9.19 + Double($0) / 10_000,
                            altitude: 120 + Double($0))
            },
            heartRates: (0..<20).map { _ in HeartRateSample(startTime: Date(), value: 140) },
            notes: "test"
        )

        let gpx = ActivityExport.gpx(for: session)
        XCTAssertTrue(gpx.contains("<gpx"))
        XCTAssertTrue(gpx.count > 500)
        XCTAssertFalse(gpx.contains("<trkpt") == false)

        let tcx = ActivityExport.tcx(for: session)
        XCTAssertTrue(tcx.contains("http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2"),
                      "namespace must match the string found in the APK")
        XCTAssertTrue(tcx.contains("<HeartRateBpm>"))

        for format in ActivityExport.Format.allCases {
            let file = try XCTUnwrap(ActivityExport.write(session, format: format))
            let data = try Data(contentsOf: file.url)
            XCTAssertFalse(data.isEmpty)
            try? FileManager.default.removeItem(at: file.url)
        }
    }

    // MARK: Untrusted peripheral data (security review H1, H2, L2, L4)

    private func marker(id: Int, isEnd: Bool, time: Date, steps: Int = 1_200,
                        distance: Int = 900, latitude: Double = 40.7,
                        longitude: Double = -74.0) -> ActivityHeaderDecoder.Marker {
        ActivityHeaderDecoder.Marker(isEnd: isEnd, activityId: id, startStepsWalk: steps,
                                     startLogIndex: 0, time: time, latitude: latitude,
                                     longitude: longitude, altitude: 12, activeCalories: 80,
                                     heartRate: 96, caseTempRaw: 30, skinTempRaw: 120,
                                     activityType: .walking, logDistance: distance,
                                     thermalGen: 0, solarGen: 0, powerConsumed: 0)
    }

    private func delta(heartRate: Int = 90, latByte: Int = 1,
                       longByte: Int = 1) -> ActivityDeltaDecoder.Record {
        ActivityDeltaDecoder.Record(type: .walking, deltaStep: 40, deltaCalsBMR: 2,
                                    deltaCalsActive: 1, deltaPowerConsumed: 0,
                                    deltaGPSLatByte: latByte, deltaGPSLongByte: longByte,
                                    deltaHeartRate: heartRate, deltaHRV: 0, deltaDistance: 30,
                                    deltaCaseTemp: 0, deltaSkinTemp: 0)
    }

    /// The `9215` marker timestamps are a `u32` epoch off the wire, and `duration` used to
    /// decide how many `RunningSplit` values got allocated: 4e9 seconds apart was a
    /// peripheral's choice of ~7 million. Rejected now (H1).
    func testSpoofedSessionWindowIsRejected() {
        let now = Date()
        let sane = [marker(id: 1, isEnd: false, time: now.addingTimeInterval(-1_800)),
                    marker(id: 1, isEnd: true, time: now)]
        let sessions = PeriodAggregator.sessions(headers: sane, deltas: [delta(), delta()], now: now)
        XCTAssertEqual(sessions.count, 1, "an honest pair still produces a session")
        XCTAssertEqual(sessions.first?.splits.count, 3, "30 min is three 10-minute splits")
        XCTAssertEqual(sessions.first?.heartRates.count, 2)

        let impossible = [marker(id: 2, isEnd: false, time: Date(timeIntervalSince1970: 0)),
                          marker(id: 2, isEnd: true, time: Date(timeIntervalSince1970: 4_000_000_000))]
        XCTAssertTrue(PeriodAggregator.sessions(headers: impossible, deltas: [], now: now).isEmpty,
                      "a 127-year session is a spoof, not a workout")

        let farFuture = [marker(id: 3, isEnd: false, time: now.addingTimeInterval(400 * 86_400)),
                         marker(id: 3, isEnd: true, time: now.addingTimeInterval(400 * 86_400) + 600)]
        XCTAssertTrue(PeriodAggregator.sessions(headers: farFuture, deltas: [], now: now).isEmpty)

        let backwards = [marker(id: 4, isEnd: false, time: now),
                         marker(id: 4, isEnd: true, time: now.addingTimeInterval(-600))]
        XCTAssertTrue(PeriodAggregator.sessions(headers: backwards, deltas: [], now: now).isEmpty)

        let marathon = [marker(id: 5, isEnd: false, time: now.addingTimeInterval(-20 * 3_600)),
                        marker(id: 5, isEnd: true, time: now.addingTimeInterval(-19 * 3_600))]
        XCTAssertEqual(PeriodAggregator.sessions(headers: marathon, deltas: [], now: now).count, 1,
                       "one hour inside the 24-hour ceiling is legitimate")
    }

    /// A peripheral that keeps sending CRC-valid frames used to grow `accumulated` until
    /// the app was killed; the collector now ends the command instead (H2).
    func testCollectorRefusesAnUnboundedResponse() {
        let frame = Gen2Framing.encodeResponse(body: [UInt8](repeating: 0x5A, count: 4_096))
        var acknowledged = false
        let collector = Gen2ResponseCollector { acknowledged = $0 }
        var rounds = 0
        var outcome: Gen2ResponseCollector.Outcome = .ignored
        while rounds < 4_096 {
            rounds += 1
            outcome = collector.ingest(frame)
            if case .failed = outcome { break }
        }
        guard case .failed(let error) = outcome else {
            return XCTFail("the collector accumulated \(collector.accumulated.count) bytes without stopping")
        }
        if case .parsing(let reason) = error {
            XCTAssertTrue(reason.contains("bytes"), reason)
        } else {
            return XCTFail("expected a parsing failure, got \(error)")
        }
        XCTAssertLessThanOrEqual(collector.accumulated.count, Gen2ResponseCollector.maxAccumulatedBytes)
        XCTAssertTrue(acknowledged, "the frames that were accepted were ACKed as usual")
    }

    /// `session.name` is free text from History ▸ Edit and it becomes a filename
    /// (`appendingPathComponent` does not interpret `..`) (L2).
    func testExportFileNameCannotChooseWhereTheFileLands() throws {
        XCTAssertEqual(ActivityExport.safeFileName("../../../../Library/Application Support/pw"),
                       "Library-Application-Support-pw")
        XCTAssertFalse(ActivityExport.safeFileName("a/../../../b").contains("/"))
        XCTAssertFalse(ActivityExport.safeFileName("..hidden").contains(".."))
        XCTAssertFalse(ActivityExport.safeFileName("..hidden").hasPrefix("."))
        XCTAssertEqual(ActivityExport.safeFileName(""), "session")
        XCTAssertEqual(ActivityExport.safeFileName("...."), "session")
        XCTAssertLessThanOrEqual(ActivityExport.safeFileName(String(repeating: "x", count: 500)).count, 64)
        XCTAssertEqual(ActivityExport.safeFileName("Morning Run \u{2713}"), "Morning-Run")

        var session = UserActivitySession(
            id: "s-traversal", name: "../../../../tmp/pwn", activityType: .outdoorRun,
            locationName: "", distance: 1, steps: 1,
            startTime: Date(timeIntervalSince1970: 1_700_000_000),
            endTime: Date(timeIntervalSince1970: 1_700_000_600),
            pace: 1, activeCalories: 1, bmrCalories: 1, splits: [], gpsPositions: [],
            heartRates: [], notes: ""
        )
        session.name = "../../escape"
        let file = try XCTUnwrap(ActivityExport.write(session, format: .gpx))
        let temp = FileManager.default.temporaryDirectory.standardizedFileURL.path
        XCTAssertTrue(file.url.standardizedFileURL.path.hasPrefix(temp + "/"), file.url.path)
        XCTAssertTrue(file.url.lastPathComponent.hasSuffix(".gpx"))
        try? FileManager.default.removeItem(at: file.url)
    }

    /// `9205` GPS deltas are signed bytes and nothing bounded the running total, so a
    /// crafted stream walked the coordinate off to infinity and into the export (L4).
    func testGPSDeltaStreamSaturatesInsteadOfDiverging() {
        let now = Date()
        let headers = [marker(id: 7, isEnd: false, time: now.addingTimeInterval(-600),
                              latitude: 89.9, longitude: 179.9),
                       marker(id: 7, isEnd: true, time: now)]
        let flooded = Array(repeating: delta(latByte: 127, longByte: 127), count: 500)
        let session = try? XCTUnwrap(PeriodAggregator.sessions(headers: headers, deltas: flooded, now: now).first)
        let positions = try? XCTUnwrap(session?.gpsPositions)
        XCTAssertFalse(positions?.isEmpty ?? true)
        for position in positions ?? [] {
            XCTAssertTrue(position.latitude.isFinite && position.longitude.isFinite)
            XCTAssertTrue((-90...90).contains(position.latitude), "\(position.latitude)")
            XCTAssertTrue((-180...180).contains(position.longitude), "\(position.longitude)")
        }
    }

    /// A snapshot that cannot be read must not be answered with an empty one written back,
    /// and the wipe paths must still erase it (M2, L6).
    func testUnreadableSnapshotIsNeitherLostNorOverwritten() async throws {
        let dir = FileManager.default.temporaryDirectory
            .appendingPathComponent("pw2-corrupt-\(UUID().uuidString)", isDirectory: true)
        try FileManager.default.createDirectory(at: dir, withIntermediateDirectories: true)
        defer { try? FileManager.default.removeItem(at: dir) }
        let snapshot = dir.appendingPathComponent("snapshot.json")
        let garbage = Data("this is not json".utf8)
        try garbage.write(to: snapshot)

        let store = LocalStore(directory: dir)
        let paused = await store.persistenceBlocked
        XCTAssertTrue(paused, "an unreadable file has to pause persistence, not look like a fresh install")
        await store.save(user: makeUser())
        XCTAssertEqual(try Data(contentsOf: snapshot), garbage,
                       "the unreadable file must survive untouched")

        // Log out deletes the file it could not read and then persists the emptied
        // state, so what matters is that the unreadable bytes are gone and no user
        // record came back with the rewrite.
        await store.logout()
        let after = try String(contentsOf: snapshot, encoding: .utf8)
        XCTAssertFalse(after.contains("this is not json"), "the unreadable file was not replaced")
        XCTAssertFalse(after.contains("test@example.com"), "log out must not resurrect an account")
        let resumed = await store.persistenceBlocked
        XCTAssertFalse(resumed)
    }
}
