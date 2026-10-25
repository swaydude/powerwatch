import XCTest
@testable import PowerWatch2

/// Protocol-level tests. The expected values here are taken from byte
/// constants that exist verbatim in the APK, so they check the port against the
/// original rather than against itself.
final class Gen2ProtocolTests: XCTestCase {

    // MARK: CRC32 (java.util.zip.CRC32)

    /// `DTPAckType.AckGood = 05 00 00 20 00 | 8D EF 02 D2`.
    /// The trailing four bytes are the little-endian CRC32 of the single-byte
    /// body `00`, so `CRC32([0x00])` must be 0xD202EF8D.
    func testCRC32MatchesAckGoodConstant() {
        XCTAssertEqual(CRC32.checksum([0x00]), 0xD202_EF8D)
    }

    /// `DTPAckType.AckCRCInvalid = 05 00 00 20 01 | 1B DF 05 A5` → body `01`,
    /// CRC little-endian bytes `1B DF 05 A5` = 0xA505DF1B.
    func testCRC32MatchesAckCRCInvalidConstant() {
        XCTAssertEqual(CRC32.checksum([0x01]), 0xA505_DF1B)
    }

    func testCRC32OfEmptyDataIsZero() {
        // java.util.zip.CRC32 over no bytes yields 0 after the final xor.
        XCTAssertEqual(CRC32.checksum([]), 0)
    }

    // MARK: Request framing

    func testRequestFrameLayout() {
        let frame = Gen2Framing.encode(opcodeBytes: [0x91, 0x26], payload: [])
        XCTAssertEqual(frame.count, 10)
        // len = payload + 6 = 6, little endian
        XCTAssertEqual(Array(frame[0..<2]), [0x06, 0x00])
        // kind 0x1040 written as 40 10
        XCTAssertEqual(Array(frame[2..<4]), [0x40, 0x10])
        XCTAssertEqual(Array(frame[4..<6]), [0x91, 0x26])
        XCTAssertEqual(Gen2Framing.readUInt32LE(frame, at: 6), CRC32.checksum([0x91, 0x26]))
    }

    func testRequestFrameLengthFieldMatchesStreamReassembly() {
        // ChannelStreamImpl: total frame length == LE u16 at [0] + 4.
        for payloadSize in [0, 1, 7, 32, 640] {
            let payload = [UInt8](repeating: 0x5A, count: payloadSize)
            let frame = Gen2Framing.encode(opcodeBytes: [0x91, 0x06], payload: payload)
            let declared = Int(frame[0]) | (Int(frame[1]) << 8)
            XCTAssertEqual(declared + Gen2Framing.headerSize, frame.count,
                           "payload size \(payloadSize)")
        }
    }

    // MARK: Response framing

    func testResponseFramePassesValidationAndCRC() {
        let body = [UInt8](repeating: 0x11, count: 32)
        let frame = Gen2Framing.encodeResponse(body: body)
        XCTAssertTrue(Gen2Framing.validateResponse(frame))
        XCTAssertTrue(Gen2Framing.compareCRC(frame))
        let (valid, extracted) = Gen2Framing.extractPayload(frame)
        XCTAssertTrue(valid)
        XCTAssertEqual(extracted, body)
    }

    func testTamperedResponseFailsCRC() {
        var frame = Gen2Framing.encodeResponse(body: [UInt8](repeating: 0x22, count: 16))
        frame[5] ^= 0xFF
        XCTAssertFalse(Gen2Framing.compareCRC(frame))
    }

    func testCompletionFrameDecodesAsSuccess() {
        let frame = Gen2Framing.completionFrame()
        let (valid, body) = Gen2Framing.extractPayload(frame)
        XCTAssertTrue(valid)
        XCTAssertEqual(body, [0xE2, 0x00])
        XCTAssertEqual(Gen2Framing.responseType(fromBody: body), .success)
        XCTAssertNil(Gen2Framing.responseType(fromBody: body)?.error)
    }

    func testBusyAndLockedStatusesMapToErrors() {
        XCTAssertEqual(Gen2Framing.responseType(fromBody: [0xE1, 0x02])?.error, .watchBusy)
        XCTAssertEqual(Gen2Framing.responseType(fromBody: [0xE4, 0x23])?.error, .syncLocked)
        XCTAssertNotNil(Gen2Framing.responseType(fromBody: [0xE4, 0x04])?.error)
    }

    func testControlAckMarkIsComparedOnFourBytes() {
        var mark = Gen2Framing.controlAckMark
        mark.append(contentsOf: [0x00, 0x00, 0x00, 0x00, 0x00])
        XCTAssertTrue(Gen2Framing.isControlAckMark(mark))
        XCTAssertFalse(Gen2Framing.isControlAckMark(Gen2Framing.ackGood))
    }

    // MARK: Bit extraction

    func testBitReaderMatchesExtractNumberSemantics() {
        // (word & mask(high, low)) >>> low
        XCTAssertEqual(BitReader.extract(0b1_0110_0001_0000, high: 6, low: 0), 16)
        XCTAssertEqual(BitReader.extract(0xFFFF_FFFF, high: 31, low: 0), 0xFFFF_FFFF)
        XCTAssertEqual(BitReader.extract(0x1FF, high: 8, low: 0, signed: true), -1)
        XCTAssertEqual(BitReader.extract(0x0FF, high: 8, low: 0, signed: true), 255)
    }

    /// Regression: masking with an unshifted `(1 << width) - 1` made every field
    /// whose `low` was not zero read back as 0, which silently zeroed the whole
    /// background/delta/header log decode.
    func testBitReaderExtractsPositionedFields() {
        XCTAssertEqual(BitReader.extract(UInt32(42) << 7, high: 14, low: 7), 42)
        XCTAssertEqual(BitReader.extract(UInt32(33) << 23, high: 31, low: 23), 33)
        XCTAssertEqual(BitReader.extract(UInt32(0x2BC) << 15, high: 25, low: 15), 0x2BC)
        XCTAssertEqual(BitReader.extract(UInt32(0b101) << 10, high: 14, low: 10), 0b101)
        XCTAssertEqual(BitReader.extract(0xDEAD_BEEF, high: 31, low: 0), 0xDEAD_BEEF)
        // Values wider than the field are masked, exactly like the Java version.
        XCTAssertEqual(BitReader.extract(UInt32(0x2ABC) << 15, high: 25, low: 15), 0x2ABC & 0x7FF)

        // Adjacent fields must not bleed into each other.
        let packed: UInt32 = (0x1FF << 0) | (0x3F << 9) | (1 << 15)
        XCTAssertEqual(BitReader.extract(packed, high: 8, low: 0), 0x1FF)
        XCTAssertEqual(BitReader.extract(packed, high: 14, low: 9), 0x3F)
        XCTAssertEqual(BitReader.extract(packed, high: 15, low: 15), 1)

        // Signed extraction at a non-zero offset (the skin-temperature field).
        XCTAssertEqual(BitReader.extract(UInt32(0x1FF) << 13, high: 21, low: 13, signed: true), -1)
        XCTAssertEqual(BitReader.extract(UInt32(0x0FF) << 13, high: 21, low: 13, signed: true), 255)
    }

    // MARK: Command/response state machine

    func testCollectorAccumulatesDataThenCompletesOnSuccess() {
        var ackWrites: [Bool] = []
        let collector = Gen2ResponseCollector { ackWrites.append($0) }
        let records = [UInt8](repeating: 0x03, count: 32)

        switch collector.ingest(Gen2Framing.ackGood) {
        case .watchAckReceived: break
        case let other: XCTFail("expected .watchAckReceived, got \(other)")
        }
        XCTAssertTrue(collector.sawAck)

        switch collector.ingest(Gen2Framing.encodeResponse(body: records)) {
        case .ignored: break
        case let other: XCTFail("expected .ignored while accumulating, got \(other)")
        }

        switch collector.ingest(Gen2Framing.completionFrame()) {
        case .complete(let body): XCTAssertEqual(body, records)
        case let other: XCTFail("expected .complete, got \(other)")
        }
        // One AckGood written back per data frame we accepted.
        XCTAssertEqual(ackWrites, [true, true])
    }

    func testCollectorRejectsCorruptedFrameWithAckCRCInvalid() {
        var ackWrites: [Bool] = []
        let collector = Gen2ResponseCollector { ackWrites.append($0) }
        var corrupted = Gen2Framing.encodeResponse(body: [UInt8](repeating: 0x04, count: 16))
        corrupted[6] ^= 0xFF
        switch collector.ingest(corrupted) {
        case .ignored: break
        case let other: XCTFail("expected .ignored, got \(other)")
        }
        // `writeAck(false)` is the `DTPAckType.AckCRCInvalid` response the watch
        // is told to retransmit with.
        XCTAssertEqual(ackWrites, [false])
        XCTAssertTrue(collector.accumulated.isEmpty)
    }

    func testCollectorAbortsOnWatchBusy() {
        let collector = Gen2ResponseCollector { _ in }
        switch collector.ingest(Gen2Framing.encodeResponse(body: [0xE1, 0x02])) {
        case .failed(.watchBusy): break
        case let other: XCTFail("expected .failed(.watchBusy), got \(other)")
        }
    }

    func testCollectorObservesAcksWithoutACommandInFlight() {
        let collector = Gen2ResponseCollector { _ in }
        switch collector.ingest(Gen2Framing.ackGood) {
        case .watchAckReceived: break
        case let other: XCTFail("expected .watchAckReceived, got \(other)")
        }
        switch collector.ingest(Gen2Framing.ackCRCInvalid) {
        case .ignored: break
        case let other: XCTFail("expected .ignored, got \(other)")
        }
        // `sawAck` mirrors `DTPCommand.isWatchAckReceived`: it records that the
        // watch acknowledged *something*, independently of our own in-flight
        // command, and the unsolicited path uses it the same way.
        XCTAssertTrue(collector.sawAck)
    }

    func testCollectorResendsAckOnControlMark() {
        var ackWrites: [Bool] = []
        let collector = Gen2ResponseCollector { ackWrites.append($0) }
        switch collector.ingest(Gen2Framing.controlAckMark) {
        case .controlResend: break
        case let other: XCTFail("expected .controlResend, got \(other)")
        }
        XCTAssertEqual(ackWrites, [true])
    }

    // MARK: Background log round trip through the real decoder

    func testBackgroundLogEncodeDecodeRoundTrip() {
        let start = Date(timeIntervalSince1970: 1_700_000_000)
        let rtl = RTLTable(timestamps: [start, start.addingTimeInterval(1800)])

        let samples = [
            SyntheticSample(logTimeIndex: 0, time: start,
                            steps: 42, distance: 33,
                            activeCalories: 5, bmrCalories: 2,
                            thermalGen: 48, solarGen: 128, powerConsumed: 68,
                            caseTempC: 32.25, skinTempC: 33.75,
                            heartRate: 72, hrv: 40, battery: 87, logType: .awakeWalking),
            SyntheticSample(logTimeIndex: 0, time: start.addingTimeInterval(60),
                            steps: 0, distance: 0,
                            activeCalories: 0, bmrCalories: 1,
                            thermalGen: 8, solarGen: 0, powerConsumed: 12,
                            caseTempC: 31.0, skinTempC: -4.5,
                            heartRate: 51, hrv: 62, battery: 86, logType: .sleepDeep)
        ]

        let body = SyntheticEncoder.pack(samples)
        XCTAssertEqual(body.count % BackgroundLogDecoder.recordSize, 0)

        guard let decoded = BackgroundLogDecoder.parse(body, rtl: rtl) else {
            return XCTFail("decoder rejected a record-aligned body")
        }
        XCTAssertEqual(decoded.count, 2)

        let first = decoded[0]
        XCTAssertEqual(first.walkStepDelta, 42)
        XCTAssertEqual(first.distanceDelta, 33)
        XCTAssertEqual(first.activeCalories, 5)
        XCTAssertEqual(first.bmrCalories, 2)
        // Table indices must resolve back to the exact µWh values.
        XCTAssertEqual(first.thermalGen, 48)
        XCTAssertEqual(first.solarGen, 128)
        XCTAssertEqual(first.powerConsumed, 68)
        XCTAssertEqual(first.caseTempC, 32.25, accuracy: 0.001)
        XCTAssertEqual(first.skinTempC, 33.75, accuracy: 0.001)
        XCTAssertEqual(first.heartRate, 72)
        XCTAssertEqual(first.hrv, 40)
        XCTAssertEqual(first.battery, 87)
        XCTAssertEqual(first.logType, .awakeWalking)
        XCTAssertEqual(first.startTime, start)

        let second = decoded[1]
        XCTAssertEqual(second.logType, .sleepDeep)
        XCTAssertEqual(second.logType.sleepClassification, 5)
        XCTAssertEqual(second.skinTempC, -4.5, accuracy: 0.001)
        // Within a logTimeIndex group the clock advances one minute per record.
        XCTAssertEqual(second.startTime, start.addingTimeInterval(60))
    }

    func testBackgroundLogRejectsMisalignedBody() {
        XCTAssertNil(BackgroundLogDecoder.parse([UInt8](repeating: 0, count: 15),
                                                rtl: RTLTable(timestamps: [Date()])))
    }

    func testLogTimeIndexOutOfRangeIsDropped() {
        let start = Date(timeIntervalSince1970: 1_700_000_000)
        let sample = SyntheticSample(logTimeIndex: 9, time: start, steps: 10, distance: 8,
                                     activeCalories: 1, bmrCalories: 1, thermalGen: 2,
                                     solarGen: 3, powerConsumed: 4, caseTempC: 31, skinTempC: 32,
                                     heartRate: 60, hrv: 30, battery: 50, logType: .awakeStill)
        let body = SyntheticEncoder.pack([sample])
        let decoded = BackgroundLogDecoder.parse(body, rtl: RTLTable(timestamps: [start]))
        XCTAssertEqual(decoded?.count ?? -1, 0)
    }

    // MARK: Lookup tables

    func testGenerationAndConsumptionTables() {
        XCTAssertEqual(LogTables.generationArray.count, 64)
        XCTAssertEqual(LogTables.consumptionArray.count, 256)
        XCTAssertEqual(LogTables.generationArray.first, 0)
        // Index 69 of consumptionArray is ActivityConstantsKt.WEEK_HOURS_PAGE_LIMIT.
        XCTAssertEqual(LogTables.consumptionArray[69], 168)
        XCTAssertTrue(zip(LogTables.consumptionArray, LogTables.consumptionArray.dropFirst())
            .allSatisfy { $0 <= $1 })
        XCTAssertEqual(LogTables.generation(-1), 0)
        XCTAssertEqual(LogTables.generation(9999), 0)
    }

    // MARK: Log counts / heart rate

    func testLogCountVer3IsBigEndian() {
        var body: [UInt8] = []
        for value in [1, 2, 3, 4, 5, 6] {
            body.append(contentsOf: Gen2Framing.bigEndianBytes(UInt32(value)))
        }
        let counts = Gen2LogsCount.parseVer3(body)
        XCTAssertEqual(counts?.realtimeStatusLogs, 1)
        XCTAssertEqual(counts?.activityHeaderLogs, 3)
        XCTAssertEqual(counts?.backgroundLogs, 5)
        XCTAssertEqual(counts?.sleepLogs, 6)
        XCTAssertNil(Gen2LogsCount.parseVer3([UInt8](repeating: 0, count: 20)))
    }

    func testHeartRateParserEightAndSixteenBit() {
        XCTAssertEqual(HeartRateParser.parse([0x00, 72]), 72)
        // The APK reads the 16-bit form big endian.
        XCTAssertEqual(HeartRateParser.parse([0x01, 0x01, 0x08]), 0x0108)
        XCTAssertNil(HeartRateParser.parse([]))
    }

    /// Field widths are the Java `extractNumber(word, low, high)` bounds in
    /// `Gen2Ver3ActivityDeltaCommand`: type [0,3], step [4,9], calsBMR [10,15],
    /// calsActive [16,21], powerConsumed [22,29]; gpsLat [0,7], gpsLong [8,15];
    /// heartRate [0,7], hrv [8,14], distance [15,23], caseTemp [24,27],
    /// skinTemp [28,31]. Values are masked to the field, exactly as in Java, so
    /// the fixtures stay inside their widths.
    func testActivityDeltaDecode() {
        let record = SyntheticEncoder.DeltaRecord(
            type: .running, step: 44, calsBMR: 2, calsActive: 6, powerConsumed: 255,
            gpsLatByte: 12, gpsLongByte: 200, heartRate: 155, hrv: 22,
            distance: 180, caseTemp: 9, skinTemp: 11
        )
        let decoded = ActivityDeltaDecoder.parse(SyntheticEncoder.packDelta([record]))
        XCTAssertEqual(decoded.count, 1)
        XCTAssertEqual(decoded[0].type, .running)
        XCTAssertEqual(decoded[0].deltaStep, 44)
        XCTAssertEqual(decoded[0].deltaCalsActive, 6)
        XCTAssertEqual(decoded[0].deltaPowerConsumed, 255)
        XCTAssertEqual(decoded[0].deltaGPSLongByte, 200)
        XCTAssertEqual(decoded[0].deltaHeartRate, 155)
        XCTAssertEqual(decoded[0].deltaDistance, 180)
        XCTAssertEqual(decoded[0].deltaCaseTemp, 9)
        XCTAssertEqual(decoded[0].deltaSkinTemp, 11)
        // Out-of-width input is masked, not saturated.
        let oversized = SyntheticEncoder.DeltaRecord(
            type: .walking, step: 100, calsBMR: 0, calsActive: 0, powerConsumed: 0,
            gpsLatByte: 0, gpsLongByte: 0, heartRate: 0, hrv: 0, distance: 0,
            caseTemp: 0, skinTemp: 0
        )
        XCTAssertEqual(ActivityDeltaDecoder.parse(SyntheticEncoder.packDelta([oversized]))[0].deltaStep,
                       100 & 0x3F)
    }

    func testActivityHeaderDecode() {
        let start = Date(timeIntervalSince1970: 1_700_000_000)
        let record = SyntheticEncoder.HeaderRecord(
            isEnd: false, activityId: 7, startStepsWalk: 1234, startLogIndex: 3, time: start,
            latitude: 45.12345, longitude: 9.67891, altitude: 128,
            activeCalories: 210, heartRate: 133, caseTempRaw: 133, skinTempRaw: 136,
            activityType: .biking, logDistance: 4321, thermalGen: 9000, solarGen: 4000,
            powerConsumed: 1200
        )
        let decoded = ActivityHeaderDecoder.parse(SyntheticEncoder.packHeader([record]))
        XCTAssertEqual(decoded.count, 1)
        XCTAssertEqual(decoded[0].activityId, 7)
        XCTAssertEqual(decoded[0].startStepsWalk, 1234)
        XCTAssertEqual(decoded[0].time, start)
        XCTAssertEqual(decoded[0].latitude, 45.12345, accuracy: 0.001)
        XCTAssertEqual(decoded[0].longitude, 9.67891, accuracy: 0.001)
        XCTAssertEqual(decoded[0].activityType, .biking)
        XCTAssertEqual(decoded[0].logDistance, 4321)
        XCTAssertEqual(decoded[0].thermalGen, 9000)
    }

    // MARK: 9024 payload

    func testSendUserPrefsAndGoalsPayloadIs32BytesBigEndian() {
        let user = UserAccount(uid: "u", name: "Test", email: "t@e.st", password: "password",
                              age: 33, height: 182.5, weight: 81, gender: .female,
                              timeFormatType: .twentyFour)
        let goals = GoalConfiguration(id: 1, calories: 2200, distance: 5000, power: 1000,
                                     sleep: 480, steps: 9000)
        let command = Gen2Command.sendUserPrefsAndGoalsVer3(user: user, goals: goals,
                                                            settings: WatchSettings(),
                                                            now: Date(timeIntervalSince1970: 1_700_000_000),
                                                            timeZone: TimeZone(secondsFromGMT: 0)!)
        XCTAssertEqual(command.payload.count, 32)
        XCTAssertEqual(command.payload[0], 1)                     // 24h flag
        XCTAssertEqual(command.payload[1], 1)                     // metric
        XCTAssertEqual(command.payload[8], 1)                     // !male
        XCTAssertEqual(command.payload[9], 33)                    // age
        XCTAssertEqual(Gen2Framing.readUInt32BE(command.payload, at: 2), 1_700_000_000)
        XCTAssertEqual(Int(Gen2Framing.readUInt32BE(command.payload, at: 14)), 9000) // steps
        XCTAssertEqual(Int(Gen2Framing.readUInt32BE(command.payload, at: 22)), 2200) // calories
    }

    // MARK: Pairing code (`BleScanningTechnology` + `QRPairingViewModel`)

    /// `BleScanningTechnology.startMonitoring` rebuilds each manufacturer record as
    /// `[companyId lo, companyId hi, payload…]` and then reads it with
    /// `ByteBuffer.getShort()` / `get()`, i.e. a big-endian short over the first two
    /// bytes plus the next byte as the protocol version. 0x10 0x92 is therefore
    /// pairing code 4242.
    func testAdvertisementPairingCodeIsBigEndianShortOfManufacturerData() {
        let advertising = Gen2Advertisement(manufacturerData: Data([0x10, 0x92, 0x04]))
        XCTAssertEqual(advertising.pairingCode, 4242)
        XCTAssertEqual(advertising.protocolVersion, 4)
        XCTAssertTrue(advertising.hasManufacturerData)
    }

    /// A negative short is what the APK sees for a company id with the top bit set,
    /// and the absence of manufacturer data is its own sentinel: code `-1`,
    /// protocol version `1`.
    func testAdvertisementDefaultsMatchTheApkSentinels() {
        XCTAssertEqual(Gen2Advertisement(manufacturerData: nil).pairingCode, Gen2Advertisement.noPairingCode)
        XCTAssertEqual(Gen2Advertisement(manufacturerData: nil).protocolVersion, 1)
        XCTAssertEqual(Gen2Advertisement(manufacturerData: Data([0xFF])).pairingCode, -1)
        XCTAssertEqual(Gen2Advertisement(manufacturerData: Data([0xFF, 0xFF])).protocolVersion, 1)
        XCTAssertEqual(Gen2Advertisement(manufacturerData: Data([0xFF, 0xFF])).pairingCode, -1)
    }

    /// `QRPairingViewModel.extractQRCode`: the last space-separated token of the
    /// "Pair code" line.
    func testPairCodeFromWatchQRText() {
        let qr = "PowerWatch 2\nSN 12345\nPair code: 4242\nfw 1.5.6"
        XCTAssertEqual(PairCode.extract(qr), 4242)
        // The keyword match is case-insensitive, the " " split is not.
        XCTAssertEqual(PairCode.extract("pair CODE 88"), 88)
    }

    /// …with the `open?…=digits` URL line as fallback, and *only* when no
    /// "Pair code" line exists at all.
    func testPairCodeFallbackAndItsLimits() {
        XCTAssertEqual(PairCode.extract("https://powerwatch.matrix.com/open?code=99"), 99)
        // A "Pair code" line that does not end in a number yields nothing: the
        // fallback branch is skipped because the keyword line was found.
        XCTAssertNil(PairCode.extract("Pair code: ----"))
        XCTAssertNil(PairCode.extract("nothing useful here"))
        // Kotlin's `split(" ").last()` on a trailing space is "" → null.
        XCTAssertNil(PairCode.extract("Pair code 4242 "))
    }
}
