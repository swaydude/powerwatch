import XCTest
@testable import PowerWatchCore

/// TC-S01–S04 (software half) — the sync orchestration engine over a
/// scripted transport: full pull cycle, clean-after-commit, interruption
/// recovery, idempotent re-sync. The on-watch half is hardware-gated.
final class SyncEngineTests: XCTestCase {

    // MARK: - Scripted transport

    /// Responds to each engine command with a scripted frame, like the watch
    /// would: acks carry the E200 status word, data commands carry records.
    class ScriptedTransport: MockTransport {

        var script: [Gen2CommandID: [UInt8]] = [:]
        /// Multi-frame responses: each body is delivered as its own data frame
        /// and the transfer is then closed with a success ack — how the watch
        /// ends a log pull (`takeUntil { successReceived }`).
        var scriptFrames: [Gen2CommandID: [[UInt8]]] = [:]
        /// Data/status frames this transport fired at the engine — the number
        /// of ACKs the engine owes back.
        private(set) var firedFrames = 0
        /// Command that should fail with a transport-level error.
        var failOn: Gen2CommandID?
        /// Command whose response is held until `releaseGate()` (concurrency
        /// tests: keeps a sync verifiably in flight).
        var holdOn: Gen2CommandID?
        /// Called with each decoded request in order.
        var onCommand: ((Gen2CommandID) -> Void)?

        /// Runs at cleanAllLogs time (TC-S02): the DB must already hold rows.
        var dbCheckOnClean: (() -> Void)?

        private var gate: CheckedContinuation<Void, Never>?

        /// `true` once a held command is parked in `gate`.
        var gateArmed: Bool { gate != nil }

        /// Lets a held command continue.
        func releaseGate() {
            gate?.resume()
            gate = nil
        }

        override func fireData(_ bytes: [UInt8]) {
            firedFrames += 1
            super.fireData(bytes)
        }

        override func send(_ data: [UInt8]) async throws {
            // Raw setting writes (`0x84 …`, see `DTPSetting`) carry no DTP
            // framing and are answered with nothing — record and move on.
            guard let frame = try? DTPFrame.decode(data) else {
                try await super.send(data)
                return
            }
            onCommand?(frame.command)
            if frame.command == failOn {
                throw TransportError.notConnected
            }
            if frame.command == holdOn {
                await withCheckedContinuation { gate = $0 }
            }
            try await super.send(data)
            if let bodies = scriptFrames[frame.command] {
                for body in bodies {
                    fireData(DTPResponse(body: body).encoded)
                }
                fireData(DTPResponse(body: [0xE2, 0x00]).encoded)
            } else if let payload = script[frame.command] {
                // Wire fact: a control command is answered with a status-only
                // frame (E200), a data command with a frame whose body is the
                // raw payload — no status word, no command id.
                fireData(DTPResponse(body: payload.isEmpty ? [0xE2, 0x00] : payload).encoded)
            } else {
                // Unscripted commands still get an answer, as any real control
                // command would — otherwise the engine waits forever.
                fireData(DTPResponse(body: [0xE2, 0x00]).encoded)
            }
        }
    }

    // MARK: - Payload builders (mirror the wire format the watch emits)

    private func logCountPayload(background: UInt32, sleep: UInt32 = 0,
                                 activityStart: UInt32 = 0, activityEnd: UInt32 = 0,
                                 activityDelta: UInt32 = 0, realtime: UInt32 = 0,
                                 realtimeStatus: UInt32 = 0) -> [UInt8] {
        var writer = ByteWriter()
        writer.write(realtimeStatus)
        writer.write(realtime)
        writer.write(activityStart)
        writer.write(activityEnd)
        writer.write(activityDelta)
        writer.write(background)
        writer.write(sleep)
        return writer.bytes
    }

    /// One byte-reversed (little-endian) UInt32 epoch-second timestamp per
    /// entry — the 9117 wire format; `parseRTLTimes` undoes the reversal.
    private func rtlTimesPayload(_ seconds: [Int]) -> [UInt8] {
        var writer = ByteWriter()
        for s in seconds { writer.write(UInt32(s), bigEndian: false) }
        return writer.bytes
    }

    /// One 16-byte background-log record (field packing mirrors
    /// `LogParsers.parseBackgroundRecord`).
    private func backgroundRecord(logTimeIndex: Int, walkSteps: Int, runningSteps: Int = 0,
                                  logType: LogType, heartRate: Int = 60, hrv: Int = 40,
                                  activeCalories: Int = 5, bmrCalories: Int = 7) -> [UInt8] {
        var w1 = UInt32(logTimeIndex) & 0x7F          // RTL index: bits 0-6
        w1 |= (UInt32(walkSteps) & 0xFF) << 7         // walk delta: 7-14
        w1 |= (UInt32(runningSteps) & 0xFF) << 15     // run delta: 15-22
        var w2 = UInt32(activeCalories) & 0x7FFF
        w2 |= (UInt32(bmrCalories) & 0x7FF) << 15
        var w3 = UInt32(heartRate & 0xFF) << 17
        w3 |= (UInt32(hrv) & 0x7F) << 25
        let w4 = UInt32(logType.rawValue & 0xF) << 22
        var writer = ByteWriter()
        writer.write(w1, bigEndian: false)
        writer.write(w2, bigEndian: false)
        writer.write(w3, bigEndian: false)
        writer.write(w4, bigEndian: false)
        return writer.bytes
    }

    /// A default happy-path script: 3 background entries in RTL bucket 0.
    private func happyPathScript() -> [Gen2CommandID: [UInt8]] {
        let background = backgroundRecord(logTimeIndex: 0, walkSteps: 20, logType: .awakeWalking)
            + backgroundRecord(logTimeIndex: 0, walkSteps: 0, logType: .awakeStill)
            + backgroundRecord(logTimeIndex: 0, walkSteps: 0, logType: .sleepDeep)
        return [
            .startAmDTP: [],
            .getLogCount: logCountPayload(background: 3),
            .rtlStatus: [0x00],   // one RTL record
            .rtlTime: rtlTimesPayload([1_789_653_700]),   // 2026-09-17 14:01:40 UTC
            .activityStartLog: [],
            .activityEndLog: [],
            .activityDeltaLog: [],
            .backgroundLog: background,
            .cleanAllLogs: [],
            .stopAmDTP: [],
        ]
    }

    private func makeEngine() throws -> (database: PowerWatchDatabase,
                                         transport: ScriptedTransport,
                                         engine: WatchSyncEngine) {
        let database = try PowerWatchDatabase()
        let transport = ScriptedTransport()
        let engine = WatchSyncEngine(transport: transport, database: database)
        engine.start()
        return (database, transport, engine)
    }

    // MARK: - TC-S01: full pull cycle

    func testFullPullCyclePersistsLogs() async throws {
        let (database, transport, engine) = try makeEngine()
        transport.script = happyPathScript()

        var phases: [SyncPhase] = []
        engine.onPhase = { phases.append($0) }

        let outcome = try await engine.sync()

        // Counts come from the 9116 response.
        XCTAssertEqual(outcome.logsCount.backgroundLogs, 3)
        // One walking (steps > 0, awake), one resting (0 steps, awake),
        // one sleep (sleep state) entry.
        XCTAssertEqual(outcome.savedWalking, 1)
        XCTAssertEqual(outcome.savedResting, 1)
        XCTAssertEqual(outcome.savedSleep, 1)

        XCTAssertEqual(try database.fetchAllWalkingLogs().count, 1)
        XCTAssertEqual(try database.fetchAllRestingLogs().count, 1)
        XCTAssertEqual(try database.fetchAllSleepLogs().count, 1)

        // Command order: start → count → rtl → activity → background → clean → stop.
        XCTAssertEqual(phases.first, .starting)
        XCTAssertTrue(phases.contains(.persisting))

        // The walking record carries the RTL-derived timestamp + 60 s window.
        let walking = try database.fetchAllWalkingLogs()[0]
        XCTAssertEqual(walking.startTime, 1_789_653_700_000)
        XCTAssertEqual(walking.endTime, 1_789_653_760_000)
        XCTAssertEqual(walking.steps, 20)
        // `minsInPeriod` is @Ignore-equivalent (no Room column): the in-memory
        // value is 1 before insert, 0 after the DB round-trip — parity kept.
        XCTAssertEqual(walking.minsInPeriod, 0)

        // The sleep record maps the sleep state to a type.
        let sleep = try database.fetchAllSleepLogs()[0]
        XCTAssertEqual(sleep.sleepType, .deep)
    }

    // MARK: - TC-S02: clean commands run only after the DB commit

    func testCleanRunsOnlyAfterPersist() async throws {
        let (database, transport, engine) = try makeEngine()
        transport.script = happyPathScript()

        transport.dbCheckOnClean = {
            // When the watch receives the clean command, the pulled rows are
            // already committed locally — losing the link now loses no data.
            XCTAssertEqual((try? database.fetchAllWalkingLogs().count), 1)
            XCTAssertEqual((try? database.fetchAllSleepLogs().count), 1)
        }
        transport.onCommand = { command in
            if command == .cleanAllLogs {
                transport.dbCheckOnClean?()
            }
        }

        _ = try await engine.sync()
    }

    // MARK: - TC-S03 (software half): interruption mid-sync

    func testMidSyncFailureStillStopsAndDoesNotClean() async throws {
        let (database, transport, engine) = try makeEngine()
        transport.script = happyPathScript()
        transport.failOn = .backgroundLog

        var commandsSeen: [Gen2CommandID] = []
        transport.onCommand = { commandsSeen.append($0) }

        do {
            _ = try await engine.sync()
            XCTFail("expected sync to fail")
        } catch {
            // transport-level failure surfaces
        }

        // No data was persisted and the watch was NOT cleaned.
        XCTAssertEqual(try database.fetchAllWalkingLogs().count, 0)
        XCTAssertFalse(commandsSeen.contains(.cleanAllLogs))
        // stopAmDTP is still sent (Android handleSyncError).
        XCTAssertEqual(commandsSeen.last, .stopAmDTP)
        // The failed command is not retried and a second sync can start.
        transport.failOn = nil
        _ = try await engine.sync()
        XCTAssertEqual(try database.fetchAllWalkingLogs().count, 1)
    }

    // MARK: - TC-S04: idempotent re-sync

    func testReSyncIsIdempotent() async throws {
        let (database, transport, engine) = try makeEngine()
        transport.script = happyPathScript()

        _ = try await engine.sync()
        let firstWalking = try database.fetchAllWalkingLogs()
        XCTAssertEqual(firstWalking.count, 1)

        // Same data pulled again (e.g. watch not cleaned): no duplicates.
        _ = try await engine.sync()
        XCTAssertEqual(try database.fetchAllWalkingLogs().count, 1)
        XCTAssertEqual(try database.fetchAllWalkingLogs(), firstWalking)
        XCTAssertEqual(try database.fetchAllRestingLogs().count, 1)
        XCTAssertEqual(try database.fetchAllSleepLogs().count, 1)
    }

    // MARK: - Concurrent sync guard

    func testConcurrentSyncRejected() async throws {
        let (_, transport, engine) = try makeEngine()
        transport.script = happyPathScript()

        // Hold the first sync at getLogCount so it is verifiably still
        // running when the second starts (Android `syncInProgress` guard).
        transport.holdOn = .getLogCount
        let first = Task { try await engine.sync() }
        while !transport.gateArmed {
            try await Task.sleep(nanoseconds: 1_000_000)
        }

        do {
            _ = try await engine.sync()
            XCTFail("expected SyncError.alreadyRunning")
        } catch let error as SyncError {
            XCTAssertEqual(error, .alreadyRunning)
        }

        // Release the gate: the first sync runs to completion normally.
        transport.releaseGate()
        let outcome = try await first.value
        XCTAssertEqual(outcome.savedWalking, 1)
    }

    // MARK: - Pairing provisioning (Android Gen2Version3PairExecutorImpl)

    func testProvisionPairingRunsTheCommitSequence() async throws {
        let (_, transport, engine) = try makeEngine()
        transport.script = [
            .startPairing: [],
            .getUserAndGoalsVer3: [],
            .sendUserPrefsAndGoalsVer3: [],
            .stopPairing: [],
        ]
        var commands: [Gen2CommandID] = []
        transport.onCommand = { commands.append($0) }

        try await engine.provisionPairing(userPrefsAndGoals: [0xAA, 0xBB])

        XCTAssertEqual(commands, [.startPairing, .getUserAndGoalsVer3,
                                  .sendUserPrefsAndGoalsVer3, .stopPairing])
        let sent = transport.sentData.compactMap { try? DTPFrame.decode($0) }
        XCTAssertEqual(sent.first { $0.command == .sendUserPrefsAndGoalsVer3 }?.payload,
                       [0xAA, 0xBB])
    }

    // MARK: - Unsolicited realtime routing

    func testUnsolicitedRealtimeFrameRoutesToHandler() async throws {
        let (database, transport, engine) = try makeEngine()
        transport.script = happyPathScript()

        var realtime: [RealtimeData] = []
        engine.onRealtime = { realtime.append($0) }

        _ = try await engine.sync()
        XCTAssertTrue(realtime.isEmpty)   // scripted answers all consumed by requests

        // A 9104 frame arriving while no request is pending goes to onRealtime.
        var writer = ByteWriter()
        writer.write(UInt32(100))
        writer.write(UInt32(500))
        writer.write(UInt32(400))
        writer.write(UInt32(50))
        transport.fireData(DTPResponse(body: writer.bytes).encoded)
        XCTAssertEqual(realtime.count, 1)
        XCTAssertEqual(realtime[0].currentSteps, 500)
    }

    // MARK: - Flow control (real-watch requirement)

    /// Every frame from the watch has to be ACKed on the event characteristic,
    /// and a frame that fails to decode gets the resend ACK instead.
    func testEveryReceivedFrameIsAcked() async throws {
        let (_, transport, engine) = try makeEngine()
        transport.script = happyPathScript()

        _ = try await engine.sync()

        XCTAssertFalse(transport.sentEvents.isEmpty)
        XCTAssertTrue(transport.sentEvents.allSatisfy { $0 == DTPAck.good })

        // Junk on the data channel → resend ack, and no crash/hang.
        transport.fireData([0x01, 0x02, 0x03])
        XCTAssertEqual(transport.sentEvents.last, DTPAck.crcInvalid)
    }

    /// Wire regression (2026-09-24): the real watch's answer to getLogCount
    /// (9116) — a 36-byte frame whose 28-byte body is seven big-endian counts,
    /// with no command id and no status word.
    func testRealWatchLogCountResponseParses() async throws {
        let bytes: [UInt8] = [0x20, 0x00, 0x40, 0x10,
                              0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x01,
                              0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                              0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x0C,
                              0x00, 0x00, 0x00, 0x00,
                              0x78, 0x89, 0xD1, 0x7F]
        let response = try DTPResponse.decode(bytes)
        XCTAssertEqual(response.body.count, 28)
        XCTAssertNil(response.status)

        let counts = try LogParsers.parseLogCount(response.payload)
        XCTAssertEqual(counts.backgroundLogs, 12)
    }

    /// A link drop has to release the awaited response, or the wedged
    /// `syncInProgress` blocks every later sync with `.alreadyRunning`.
    func testDisconnectReleasesAnInFlightSync() async throws {
        let (_, transport, engine) = try makeEngine()
        transport.script = happyPathScript()
        transport.holdOn = .backgroundLog

        let syncTask = Task { try await engine.sync() }
        while !transport.gateArmed { await Task.yield() }

        transport.disconnect()
        do {
            _ = try await syncTask.value
            XCTFail("expected the in-flight sync to fail with notConnected")
        } catch {
            XCTAssertEqual(error as? TransportError, .notConnected)
        }

        // A later sync can start (the flag cleared) rather than throwing
        // `.alreadyRunning`.
        transport.holdOn = nil
        _ = try await engine.sync()
    }

    // MARK: - Ver3/Ver4 flow (firmware ≥ 3.x — the real watch is v4)

    /// `9126` count block: 24 bytes = 6 big-endian counts.
    private func ver3Count(background: UInt32) -> [UInt8] {
        var writer = ByteWriter()
        for value: UInt32 in [0, 0, 0, 0, background, 0] { writer.write(value) }
        return writer.bytes
    }

    /// Firmware v4 pulls the count from `9126`, pushes the profile before any
    /// log read, and receives a background log too big for one frame — the
    /// engine has to collect frames until the watch closes the transfer.
    func testModernFlowCollectsMultiFrameBackgroundLog() async throws {
        let (database, transport, engine) = try makeEngine()
        engine.protocolVersion = 4
        engine.prefsPayloadProvider = { [1, 2, 3] }

        transport.script = [
            .ver3GetLogCount: ver3Count(background: 2),
            .rtlStatus: [0x00],                       // one RTL record
            .rtlTime: rtlTimesPayload([1_789_653_700]),
        ]
        // Two 16-byte entries split across two frames, as the watch sends them.
        transport.scriptFrames = [
            .backgroundLog: [
                backgroundRecord(logTimeIndex: 0, walkSteps: 20, logType: .awakeWalking),
                backgroundRecord(logTimeIndex: 0, walkSteps: 0, logType: .sleepDeep),
            ],
        ]

        let outcome = try await engine.sync()

        XCTAssertEqual(outcome.savedWalking, 1)
        XCTAssertEqual(outcome.savedSleep, 1)
        XCTAssertEqual(try database.fetchAllWalkingLogs().count, 1)
        XCTAssertEqual(try database.fetchAllSleepLogs().count, 1)

        // The v4 command set was used — never the legacy log reads.
        let sent = transport.sentData.compactMap { try? DTPFrame.decode($0) }.map(\.command)
        XCTAssertTrue(sent.contains(.ver3GetLogCount))
        XCTAssertTrue(sent.contains(.sendUserPrefsAndGoalsVer3))
        XCTAssertTrue(sent.contains(.activityHeaderLog))
        XCTAssertTrue(sent.contains(.activityDeltaLogVer3))
        XCTAssertTrue(sent.contains(.errorLog))
        XCTAssertFalse(sent.contains(.getLogCount))
        XCTAssertFalse(sent.contains(.activityStartLog))
        XCTAssertFalse(sent.contains(.activityEndLog))
        XCTAssertEqual(sent.last, .stopAmDTP)
    }

    /// The watch's "syncing" animation is app-driven: Android's `SyncXExecutor`
    /// writes `0x84 0x40` before the transfer and `0x84 0x41` as its last
    /// command. `9001` does not clear the animation, so without the hide the
    /// watch face keeps showing "syncing" after the sync is long gone.
    func testSyncAnimationBracketsTheSync() async throws {
        let (_, transport, engine) = try makeEngine()
        engine.protocolVersion = 4
        engine.prefsPayloadProvider = { [] }
        transport.script = [.ver3GetLogCount: ver3Count(background: 0)]

        _ = try await engine.sync()

        XCTAssertEqual(transport.sentData.first, DTPSetting.showSyncAnimation)
        XCTAssertEqual(transport.sentData.last, DTPSetting.hideSyncAnimation)
    }

    /// A failed sync still has to hand the watch back out of its animation.
    func testSyncAnimationHiddenAfterFailedSync() async throws {
        let (_, transport, engine) = try makeEngine()
        engine.protocolVersion = 4
        transport.script = [.ver3GetLogCount: ver3Count(background: 0)]
        transport.failOn = .ver3GetLogCount

        do {
            _ = try await engine.sync()
            XCTFail("expected the scripted failure")
        } catch {}

        XCTAssertTrue(transport.sentData.contains(DTPSetting.showSyncAnimation))
        XCTAssertEqual(transport.sentData.last, DTPSetting.hideSyncAnimation)
        XCTAssertEqual(transport.sentData.compactMap { try? DTPFrame.decode($0) }.last?.command,
                       .stopAmDTP)
    }

    /// The `9107` slot count and the `9117` time list disagree on FW v3.01.00
    /// (real watch 2026-09-24 16:59: size `E200`-only, i.e. zero slots, yet one
    /// real timestamp, and all 32 background entries referencing index 0).
    /// Android caps the zip at the slot count and loses the pull; the time list
    /// is what carries the data, so it wins here.
    func testRTLTimeIsUsedEvenWhenTheSizeByteReportsNoSlots() async throws {
        let (database, transport, engine) = try makeEngine()
        engine.protocolVersion = 4
        transport.script = [
            .ver3GetLogCount: ver3Count(background: 1),
            // No `rtlStatus` → zero slots announced.
            .rtlTime: rtlTimesPayload([1_789_653_700]),
        ]
        transport.scriptFrames = [.backgroundLog: [
            backgroundRecord(logTimeIndex: 0, walkSteps: 20, logType: .awakeWalking),
        ]]

        let outcome = try await engine.sync()

        XCTAssertEqual(outcome.savedWalking, 1)
        let stored = try database.fetchAllWalkingLogs()
        XCTAssertEqual(stored.count, 1)
        XCTAssertEqual(stored[0].steps, 20)
        // Dated from the watch's own RTL entry, not from the phone's clock.
        XCTAssertEqual(stored[0].startTime, 1_789_653_700 * 1000)
    }

    /// `9107` announces 3 slots, `9117` answers status-only, and the 3 times
    /// then turn up on the next exchange — the `9215` one (real watch
    /// 2026-09-25 09:43, where `9126` had announced 0 header logs so the header
    /// block had nothing to carry). Without this the whole background pull is
    /// undateable and the dashboard stays at zero.
    func testRTLTimesDeliveredOnTheActivityExchangeAreRecovered() async throws {
        let (database, transport, engine) = try makeEngine()
        engine.protocolVersion = 4
        transport.script = [
            .ver3GetLogCount: ver3Count(background: 1),
            .rtlStatus: [0x00, 0x04, 0x04],       // three RTL records
        ]
        transport.scriptFrames = [
            // 3 × UInt32 epoch seconds — 12 bytes, so not a header record.
            .activityHeaderLog: [rtlTimesPayload([1_789_653_700,
                                                  1_789_654_500,
                                                  1_789_655_300])],
            .backgroundLog: [
                backgroundRecord(logTimeIndex: 1, walkSteps: 30, logType: .awakeWalking),
            ],
        ]

        let outcome = try await engine.sync()

        XCTAssertEqual(outcome.savedWalking, 1)
        let stored = try database.fetchAllWalkingLogs()
        XCTAssertEqual(stored[0].steps, 30)
        // Index 1 → the SECOND recovered time, proving the list kept index order.
        XCTAssertEqual(stored[0].startTime, 1_789_654_500 * 1000)
    }

    /// A short `9215` answer whose words are not epoch seconds stays a short
    /// `9215` answer: junk bytes must never be laundered into timestamps.
    func testJunkOnTheActivityExchangeIsNotMistakenForRTLTimes() async throws {
        let (database, transport, engine) = try makeEngine()
        engine.protocolVersion = 4
        transport.script = [
            .ver3GetLogCount: ver3Count(background: 1),
            .rtlStatus: [0x00, 0x04, 0x04],
        ]
        transport.scriptFrames = [
            .activityHeaderLog: [[0xDE, 0xAD, 0xBE, 0xEF, 0x01, 0x02, 0x03, 0x04,
                                 0x05, 0x06, 0x07, 0x08]],
            .backgroundLog: [
                backgroundRecord(logTimeIndex: 1, walkSteps: 30, logType: .awakeWalking),
            ],
        ]

        _ = try await engine.sync()

        XCTAssertTrue(try database.fetchAllWalkingLogs().isEmpty)
    }

    /// Both background frames must be ACKed — an unacked frame is what made the
    /// real watch stall and then disconnect.
    func testEveryFrameOfAMultiFrameResponseIsAcked() async throws {
        let (_, transport, engine) = try makeEngine()
        engine.protocolVersion = 4
        transport.script = [
            .ver3GetLogCount: ver3Count(background: 2),
            .rtlStatus: [0x00],
            .rtlTime: rtlTimesPayload([1_789_653_700]),
        ]
        transport.scriptFrames = [.backgroundLog: [
            backgroundRecord(logTimeIndex: 0, walkSteps: 5, logType: .awakeWalking),
            backgroundRecord(logTimeIndex: 0, walkSteps: 5, logType: .awakeStill),
        ]]

        _ = try await engine.sync()

        XCTAssertEqual(transport.sentEvents.count, transport.firedFrames,
                       "every frame the watch sent must be ACKed")
        XCTAssertTrue(transport.sentEvents.allSatisfy { $0 == DTPAck.good })
    }

    /// The real watch (FW v3.01.00) holds background logs whose RTL slots it never
    /// answered, so those minutes have no honest timestamp. They are dropped from
    /// the day view — dating them "back from now" filed other days' activity under
    /// today — but they are LEFT on the watch, because `9023` wipes the whole
    /// buffer and cleaning an undated block destroys it for good (real device
    /// 2026-09-25 lost a 419-step pull that way).
    func testUndateableBackgroundLogsAreDroppedButNotCleanedOffTheWatch() async throws {
        let (database, transport, engine) = try makeEngine()
        engine.protocolVersion = 4
        transport.script = [.ver3GetLogCount: ver3Count(background: 2)]
        // No `rtlStatus`/`rtlTime` scripted → both get a plain success ack →
        // zero RTL records for the pull to reference.
        transport.scriptFrames = [.backgroundLog: [
            backgroundRecord(logTimeIndex: 0, walkSteps: 12, logType: .awakeWalking),
            backgroundRecord(logTimeIndex: 0, walkSteps: 0, logType: .awakeStill),
        ]]

        let outcome = try await engine.sync()

        XCTAssertEqual(outcome.savedWalking, 0, "undateable logs must not reach a day")
        XCTAssertEqual(outcome.savedResting, 0)
        XCTAssertTrue(try database.fetchAllWalkingLogs().isEmpty)
        XCTAssertTrue(try database.fetchAllRestingLogs().isEmpty)
        XCTAssertFalse(transport.sentData.contains { frame in
            (try? DTPFrame.decode(frame))?.command == .cleanAllLogs
        }, "cleaning would destroy logs the watch can still date on a later sync")
        // …and the sync still completes normally.
        XCTAssertEqual(transport.sentData.compactMap { try? DTPFrame.decode($0) }.last?.command,
                       .stopAmDTP)
    }

    /// One answered RTL slot must date every record that points at it, even when
    /// other records point at slots the watch never answered. Android throws at
    /// the first miss and loses the whole block; here only the misses are dropped.
    /// Cleaning is still skipped, because `9023` would take the unanswered
    /// records with it and they may yet be dateable on a later sync.
    func testPartiallyDateablePullKeepsWhatItCanAndLeavesTheRest() async throws {
        let (database, transport, engine) = try makeEngine()
        engine.protocolVersion = 4
        transport.script = [
            .ver3GetLogCount: ver3Count(background: 3),
            .rtlStatus: [0x00],                    // slot 0 only
            .rtlTime: rtlTimesPayload([1_789_653_700]),
        ]
        transport.scriptFrames = [.backgroundLog: [
            backgroundRecord(logTimeIndex: 0, walkSteps: 40, logType: .awakeWalking),
            backgroundRecord(logTimeIndex: 7, walkSteps: 99, logType: .awakeWalking),  // no slot
            backgroundRecord(logTimeIndex: 0, walkSteps: 8, logType: .awakeWalking),
        ]]

        let outcome = try await engine.sync()

        // The two index-0 minutes survive (40 then 40+8 steps); index 7 is dropped.
        XCTAssertEqual(outcome.savedWalking, 2)
        let stored = try database.fetchAllWalkingLogs()
        XCTAssertEqual(stored.reduce(0) { $0 + $1.steps }, 48)
        XCTAssertFalse(transport.sentData.contains { frame in
            (try? DTPFrame.decode(frame))?.command == .cleanAllLogs
        }, "index 7 is still on the watch — cleaning would destroy it")
    }
    /// The repair that follows dropping undateable logs: the log and hour-period
    /// tables empty, and everything else the app owns survives.
    func testPurgeLogTablesClearsLogsButKeepsEverythingElse() async throws {
        let (database, transport, engine) = try makeEngine()
        transport.script = happyPathScript()
        _ = try await engine.sync()
        XCTAssertEqual(try database.fetchAllWalkingLogs().count, 1,
                       "the scripted sync should have stored timestamped logs")

        let removed = try database.purgeLogTables()
        XCTAssertGreaterThan(removed, 0)
        XCTAssertTrue(try database.fetchAllWalkingLogs().isEmpty)
        XCTAssertTrue(try database.fetchAllRestingLogs().isEmpty)
        XCTAssertTrue(try database.fetchWalkingPeriods(from: 0, to: .max).isEmpty)
        XCTAssertTrue(try database.fetchRestingPeriods(from: 0, to: .max).isEmpty)
    }

    /// v4 sessions must reach the database: `9215` gives the paired start/end
    /// markers, `9205` the per-minute deltas between their log indexes.
    func testModernFlowPersistsActivitySession() async throws {
        let (database, transport, engine) = try makeEngine()
        engine.protocolVersion = 4
        transport.script = [.ver3GetLogCount: ver3Count(background: 1)]
        transport.scriptFrames = [
            .activityHeaderLog: [
                activityHeaderRecord(marker: 0, activityId: 9, steps: 10, logIndex: 0,
                                     time: 1_700_000_000, latitude: 52.1, longitude: 4.5,
                                     activeCals: 5, heartRate: 90, logDistance: 100),
                activityHeaderRecord(marker: 1, activityId: 9, steps: 2500, logIndex: 1,
                                     time: 1_700_000_600, latitude: 52.1, longitude: 4.5,
                                     activeCals: 120, heartRate: 120, logDistance: 1100),
            ],
            .activityDeltaLogVer3: [
                activityDeltaRecord(heartRate: 100, distance: 40, steps: 20),
                activityDeltaRecord(heartRate: 110, distance: 41, steps: 21),
            ],
        ]

        let outcome = try await engine.sync()

        XCTAssertEqual(outcome.savedSessions, 1)
        let stored = try database.fetchAllActivitySessions()
        XCTAssertEqual(stored.count, 1)
        XCTAssertEqual(stored[0].name, "Outdoor Walk")
        XCTAssertEqual(stored[0].distance, 1000)
        XCTAssertEqual(stored[0].steps, 2500)
    }

    /// A link that goes dead mid-flight — no ACK, no response, no disconnect —
    /// must not wedge the engine: the command times out and the next sync runs
    /// normally. Watch-settings writes depend on this, because `applySetting`
    /// refuses to send while a sync is in flight.
    func testSilentWatchTimesOutAndEngineRecovers() async throws {
        final class DeadLinkTransport: ScriptedTransport {
            private var swallowNext = true
            override func send(_ data: [UInt8]) async throws {
                // The *command* write is what vanishes; the raw animation
                // setting that precedes it is not the exchange under test.
                if swallowNext, (try? DTPFrame.decode(data)) != nil {
                    swallowNext = false
                    return                       // the write vanishes into a dead link
                }
                try await super.send(data)
            }
        }
        let database = try PowerWatchDatabase()
        let transport = DeadLinkTransport()
        let engine = WatchSyncEngine(transport: transport, database: database)
        engine.start()

        let started = Date()
        do {
            _ = try await engine.sync()
            XCTFail("a silent watch should time out the command")
        } catch SyncError.responseTimeout(let command) {
            XCTAssertEqual(command, .ver3GetLogCount)
        }
        XCTAssertGreaterThan(Date().timeIntervalSince(started), 5,
                             "the timeout should be a real wait, not an instant refusal")

        let sentBefore = transport.sentData.count
        _ = try await engine.sync()
        XCTAssertGreaterThan(transport.sentData.count, sentBefore,
                             "the engine must accept commands again after a timeout")
    }

    /// Silence on one command must be blamed on that command — the watchdog is
    /// per exchange, not per link, so answered commands cannot inherit a later
    /// stall (which is what made a real reboot look like six failed commands).
    func testSilenceIsAttributedToTheUnansweredCommand() async throws {
        final class SelectiveSilenceTransport: ScriptedTransport {
            var silentOn: Gen2CommandID?
            override func send(_ data: [UInt8]) async throws {
                let frame = try DTPFrame.decode(data)
                if frame.command == silentOn { return }
                try await super.send(data)
            }
        }
        let database = try PowerWatchDatabase()
        let transport = SelectiveSilenceTransport()
        transport.silentOn = .cleanAllLogs
        let engine = WatchSyncEngine(transport: transport, database: database)
        engine.start()

        do {
            _ = try await engine.sync()
            XCTFail("a silent clean should time out")
        } catch SyncError.responseTimeout(let command) {
            XCTAssertEqual(command, .cleanAllLogs)
        }
    }

    // MARK: - Activity wire bytes (48-byte header, 12-byte delta, little-endian)

    private func activityWord(_ value: UInt32) -> [UInt8] {
        [UInt8(value & 0xFF), UInt8((value >> 8) & 0xFF),
         UInt8((value >> 16) & 0xFF), UInt8((value >> 24) & 0xFF)]
    }

    private func activityHeaderRecord(marker: Int, activityId: Int, steps: Int,
                                      logIndex: Int, time: Int, latitude: Float,
                                      longitude: Float, activeCals: Int,
                                      heartRate: Int, logDistance: Int) -> [UInt8] {
        let w1 = UInt32(marker & 0x3F)
            | UInt32(activityId & 0xFF) << 6
            | UInt32(steps & 0x3FFFF) << 14
        let w7 = UInt32(activeCals & 0xFFFFFF) | UInt32(heartRate & 0xFF) << 24
        let w8 = UInt32(ActivityType.walking.rawValue & 0xFF) << 18
        return activityWord(w1) + activityWord(UInt32(logIndex)) + activityWord(UInt32(time))
            + activityWord(latitude.bitPattern) + activityWord(longitude.bitPattern)
            + activityWord(0) + activityWord(w7) + activityWord(w8)
            + activityWord(UInt32(logDistance & 0x7FFFF)) + [UInt8](repeating: 0, count: 12)
    }

    private func activityDeltaRecord(heartRate: Int, distance: Int, steps: Int) -> [UInt8] {
        let w1 = UInt32(steps & 0xF) | UInt32(distance & 0x3F) << 4
        let w2 = UInt32(ActivityType.walking.rawValue & 0xFF) << 24
        let w3 = UInt32(heartRate & 0xFF)
        return activityWord(w1) + activityWord(w2) + activityWord(w3)
    }
}
