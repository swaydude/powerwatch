import XCTest
@testable import PowerWatchCore

/// Activity sessions as the v4 watch reports them: `9215` carries interleaved
/// start/end markers (paired by activity id) and `9205` the per-minute deltas
/// between the markers' log indexes.
final class ActivitySessionTests: XCTestCase {

    // MARK: - Wire builders (48-byte header, 12-byte delta, little-endian)

    private func le(_ value: UInt32) -> [UInt8] {
        [UInt8(value & 0xFF), UInt8((value >> 8) & 0xFF),
         UInt8((value >> 16) & 0xFF), UInt8((value >> 24) & 0xFF)]
    }

    private func headerRecord(marker: Int, activityId: Int, steps: Int, logIndex: Int,
                              time: Int, latitude: Float, longitude: Float,
                              altitude: Int, activeCals: Int, heartRate: Int,
                              activityType: Int, logDistance: Int) -> [UInt8] {
        let w1 = UInt32(marker & 0x3F)
            | UInt32(activityId & 0xFF) << 6
            | UInt32(steps & 0x3FFFF) << 14
        let w7 = UInt32(activeCals & 0xFFFFFF) | UInt32(heartRate & 0xFF) << 24
        let w8 = UInt32(activityType & 0xFF) << 18
        return le(w1) + le(UInt32(logIndex)) + le(UInt32(time))
            + le(latitude.bitPattern) + le(longitude.bitPattern)
            + le(UInt32(altitude & 0xFFFF)) + le(w7) + le(w8)
            + le(UInt32(logDistance & 0x7FFFF)) + [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    }

    private func deltaBytes(heartRate: Int, distance: Int, steps: Int,
                             gpsLat: Int8, gpsLong: Int8,
                             activityType: Int = 1) -> [UInt8] {
        let w1 = UInt32(steps & 0xF) | UInt32(distance & 0x3F) << 4
        let w2 = UInt32(UInt8(bitPattern: gpsLat))
            | UInt32(UInt8(bitPattern: gpsLong)) << 8
            | UInt32(activityType & 0xFF) << 24
        let w3 = UInt32(heartRate & 0xFF)
        return le(w1) + le(w2) + le(w3)
    }

    private func deltas(_ chunks: [[UInt8]]) throws -> [ActivityDeltaLogEntry] {
        try LogParsers.parseVer3ActivityDeltaLogs(chunks.flatMap { $0 })
    }

    func testHeaderBlockSplitsStartAndEndMarkers() throws {
        let payload = headerRecord(marker: 0, activityId: 7, steps: 10, logIndex: 0,
                                   time: 1_700_000_000, latitude: 52.1, longitude: 4.5,
                                   altitude: 0, activeCals: 5, heartRate: 90,
                                   activityType: 1, logDistance: 100)
            + headerRecord(marker: 1, activityId: 7, steps: 2500, logIndex: 1,
                           time: 1_700_000_600, latitude: 52.1, longitude: 4.5,
                           altitude: 0, activeCals: 120, heartRate: 120,
                           activityType: 1, logDistance: 1100)

        let parsed = try LogParsers.parseVer3ActivityHeaderLogs(payload)

        XCTAssertEqual(parsed.starts.count, 1)
        XCTAssertEqual(parsed.ends.count, 1)
        XCTAssertEqual(parsed.starts[0].activityId, 7)
        XCTAssertEqual(parsed.starts[0].startTime, 1_700_000_000)
        XCTAssertEqual(parsed.starts[0].startLogDistance, 100)
        XCTAssertEqual(parsed.starts[0].type, .walking)
        XCTAssertEqual(parsed.ends[0].endLogTime, 1_700_000_600)
        XCTAssertEqual(parsed.ends[0].endStepsWalk, 2500)
        XCTAssertEqual(parsed.ends[0].endLogDistance, 1100)
    }

    /// A partial record is ignored rather than fatal: the watch sometimes ends a
    /// `9215` transfer with a few trailing bytes, and the sync must still deliver
    /// everything else it pulled.
    func testHeaderBlockIgnoresPartialRecord() throws {
        let parsed = try LogParsers.parseVer3ActivityHeaderLogs([UInt8](repeating: 0, count: 47))
        XCTAssertTrue(parsed.starts.isEmpty)
        XCTAssertTrue(parsed.ends.isEmpty)
    }

    func testBuilderPairsMarkersIntoOneSession() throws {
        let parsed = try LogParsers.parseVer3ActivityHeaderLogs(
            headerRecord(marker: 0, activityId: 7, steps: 10, logIndex: 0,
                         time: 1_700_000_000, latitude: 52.1, longitude: 4.5,
                         altitude: 0, activeCals: 5, heartRate: 90,
                         activityType: 1, logDistance: 100)
                + headerRecord(marker: 1, activityId: 7, steps: 2500, logIndex: 1,
                               time: 1_700_000_600, latitude: 52.1, longitude: 4.5,
                               altitude: 0, activeCals: 120, heartRate: 120,
                               activityType: 1, logDistance: 1100))
        let deltas = try deltas([
            deltaBytes(heartRate: 100, distance: 40, steps: 20, gpsLat: 5, gpsLong: 7),
            deltaBytes(heartRate: 110, distance: 41, steps: 21, gpsLat: 5, gpsLong: 7),
        ])

        let sessions = ActivitySessionBuilder.buildSessions(
            starts: parsed.starts, ends: parsed.ends, deltas: deltas)

        XCTAssertEqual(sessions.count, 1)
        let session = try XCTUnwrap(sessions.first)
        XCTAssertEqual(session.name, "Outdoor Walk")
        XCTAssertEqual(session.activityType, "ACTIVITY_WALKING")
        XCTAssertEqual(session.startTime, 1_700_000_000_000)
        XCTAssertEqual(session.endTime, 1_700_000_600_000)
        XCTAssertEqual(session.distance, 1000)
        XCTAssertEqual(session.steps, 2500)
        XCTAssertEqual(session.activeCalories, 120)
        XCTAssertFalse(session.shouldSend)

        // Start position plus one sample per delta, each drifting by its
        // hundred-thousandth-of-a-degree offset (Android's reformatDataLogs).
        XCTAssertEqual(session.positions.count, 3)
        XCTAssertEqual(session.positions[1].latitude, 52.10005, accuracy: 0.0001)
        XCTAssertEqual(session.positions[1].longitude, 4.50007, accuracy: 0.0001)
        XCTAssertEqual(session.positions[2].timestamp, 1_700_000_002_000)
        XCTAssertEqual(session.rates.map(\.beatsPerMinute), [90, 100, 110])
    }

    /// No fix on the start marker means the session claims no deltas — Android
    /// skips them for exactly this reason (`No valid gps locations found`).
    func testSessionWithoutFixKeepsNoDeltas() throws {
        let parsed = try LogParsers.parseVer3ActivityHeaderLogs(
            headerRecord(marker: 0, activityId: 1, steps: 10, logIndex: 0,
                         time: 1_700_000_000, latitude: .nan, longitude: .nan,
                         altitude: 0, activeCals: 5, heartRate: 90,
                         activityType: 1, logDistance: 100)
                + headerRecord(marker: 1, activityId: 1, steps: 500, logIndex: 4,
                               time: 1_700_000_300, latitude: .nan, longitude: .nan,
                               altitude: 0, activeCals: 40, heartRate: 100,
                               activityType: 1, logDistance: 400))

        let sessions = ActivitySessionBuilder.buildSessions(
            starts: parsed.starts, ends: parsed.ends,
            deltas: try deltas([deltaBytes(heartRate: 100, distance: 40, steps: 20,
                                                     gpsLat: 5, gpsLong: 7)]))

        XCTAssertEqual(sessions.count, 1)
        XCTAssertTrue(sessions[0].positions.isEmpty)
        XCTAssertEqual(sessions[0].distance, 300)
    }

    func testUnmatchedStartMarkerIsDropped() throws {
        let parsed = try LogParsers.parseVer3ActivityHeaderLogs(
            headerRecord(marker: 0, activityId: 3, steps: 10, logIndex: 0,
                         time: 1_700_000_000, latitude: 52.1, longitude: 4.5,
                         altitude: 0, activeCals: 5, heartRate: 90,
                         activityType: 1, logDistance: 100))
        XCTAssertTrue(ActivitySessionBuilder.buildSessions(
            starts: parsed.starts, ends: parsed.ends, deltas: []).isEmpty)
    }


    /// FW v3.01.00 answers `9215`/`9205` with a few junk bytes when the count
    /// says there are no records (real device 2026-09-25). Failing the whole
    /// sync over that hid every other result, so a body that is not a whole
    /// number of records yields the records it does contain — and nothing else.
    func testJunkActivityBodyYieldsNoRecordsInsteadOfFailingTheSync() throws {
        let headers = try LogParsers.parseVer3ActivityHeaderLogs([0x00, 0x04, 0x04])
        XCTAssertTrue(headers.starts.isEmpty)
        XCTAssertTrue(headers.ends.isEmpty)

        let deltas = try LogParsers.parseVer3ActivityDeltaLogs([0xFF, 0xFF, 0xFF])
        XCTAssertTrue(deltas.isEmpty)

        // A real record still parses, even with trailing junk after it.
        let one = headerRecord(marker: 0, activityId: 3, steps: 42, logIndex: 7,
                               time: 1_700_000_000, latitude: 50.0, longitude: 6.0,
                               altitude: 0, activeCals: 2, heartRate: 80,
                               activityType: 0, logDistance: 500)
        let mixed = try LogParsers.parseVer3ActivityHeaderLogs(one + [0x01])
        XCTAssertEqual(mixed.starts.count, 1)
        XCTAssertEqual(mixed.starts.first?.activityId, 3)
    }

}
