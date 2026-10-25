import Foundation
import CoreBluetooth

// ============================================================================
// Gen2 (PowerWatch 2) DTP protocol
//
// Recovered from:
//   sdk/protocol/BLEServicesKt.java            - GATT UUIDs
//   sdk/protocol/commands/Gen2Command.java     - header/CRC construction
//   sdk/channels/stream/ChannelStreamImpl.java - notification reassembly
//   sdk/protocol/executors/DTPAckType.java     - ACK byte sequences
//   sdk/protocol/commands/Gen2CommandIDs.java  - opcode table
//   sdk/protocol/commands/ResponseType.java    - response status codes
//   sdk/protocol/executors/CRCCalculationUtilsKt.java - java.util.zip.CRC32
// ============================================================================

enum PWUUID {
    /// `DTP_SERVICE` — phone<->watch data transfer service.
    static let dtpService = CBUUID(string: "00002760-08C2-11E1-9073-0E8AC72E1011")
    /// `BASIC_DTP_SERVICE_RX` — phone **writes** DTP frames here.
    static let dtpWrite = CBUUID(string: "00002760-08C2-11E1-9073-0E8AC72E0011")
    /// `BASIC_DTP_SERVICE_TX` — **notify**, DTP frames from the watch.
    static let dtpNotify = CBUUID(string: "00002760-08C2-11E1-9073-0E8AC72E0012")
    /// `BASIC_DTP_SERVICE_PWX_RX` — ACK / event writes.
    static let dtpEventWrite = CBUUID(string: "00002760-08C2-11E1-9073-0E8AC72E0013")

    /// `OTA_SERVICE` and its characteristics (kept for the bundled-file OTA).
    static let otaService = CBUUID(string: "00002760-08C2-11E1-9073-0E8AC72E1001")
    static let otaWrite = CBUUID(string: "00002760-08C2-11E1-9073-0E8AC72E0001")
    static let otaNotify = CBUUID(string: "00002760-08C2-11E1-9073-0E8AC72E0002")

    /// Standard Device Information service used by `Gen2ProtocolBasics`.
    static let deviceInfoService = CBUUID(string: "180A")
    static let firmwareRevision = CBUUID(string: "2A26") // GEN2_FIRMWARE_INFO
    static let serialNumber = CBUUID(string: "2A25")     // GEN2_SERIAL_INFO
    static let modelNumber = CBUUID(string: "2A24")      // GEN2_SETTINGS_INFO

    /// The same two characteristics under the names `Gen2ProtocolBasics` uses:
    /// `CharacteristicType.SERIAL` is the realtime-data read (`GEN2_SERIAL_REQUEST`) and
    /// `CharacteristicType.SETTINGS_INFO` the settings read (`GEN2_SETTINGS_REQUEST`). The
    /// GATT-spec names above are misleading here — `2A24` carries goals and units, not a
    /// model number, and `2A25` carries steps and battery, not a serial.
    static let realtimeInfo = serialNumber
    static let settingsInfo = modelNumber

    /// Standard Heart Rate service (`GEN2_HEART_RATE_SERVICE` / `..._INFO`).
    static let heartRateService = CBUUID(string: "180D")
    static let heartRateMeasurement = CBUUID(string: "2A37")

    /// Two name rules exist in the APK and both are honoured here (as prefixes,
    /// which is a superset of each):
    /// * `shared/extensions/BluetoothExtensionsKt.isPowerWatchDevice` — classic
    ///   discovery accepts the name *exactly* equal to `PowerWatch`, `Powerwatch`,
    ///   `powerwatch` or `PW_X` (`BluetoothScannerImpl.scan`'s `.filter { it.isPowerWatchDevice() }`).
    /// * `pair/ui/gen2/Gen2PairingProgressViewModel` — the BLE scan the pairing
    ///   screen actually starts filters on `ScanFilter.Builder().setDeviceName("PowerWatch 2")`,
    ///   i.e. the advertised name of a real Gen2 watch is `PowerWatch 2`, which the
    ///   classic predicate above would have rejected.
    static let advertisedNamePrefixes = ["PowerWatch", "Powerwatch", "powerwatch", "PW_X"]

    static func isPowerWatchName(_ name: String?) -> Bool {
        guard let name else { return false }
        return advertisedNamePrefixes.contains(where: { name.hasPrefix($0) })
            || name.localizedCaseInsensitiveContains("powerwatch")
            || name == "PW_X"
    }

    /// Secondary acceptance rule the Android app did not need: a peripheral that
    /// advertises the proprietary DTP or OTA service but broadcasts no name.
    /// `ProtocolCreatorImpl` in the APK chose the protocol from the *discovered
    /// service set*, so those UUIDs identify a PowerWatch just as authoritatively
    /// as the broadcast name does — and CoreBluetooth reports `peripheral.name`
    /// as nil whenever the device puts its name only in the GATT Generic Access
    /// characteristic rather than in the advertisement.
    static func isPowerWatchService(_ uuids: [CBUUID]) -> Bool {
        uuids.contains(dtpService) || uuids.contains(otaService)
    }
}

/// The Gen2 identity carried in the advertisement's manufacturer-specific data.
///
/// `sdk/technologies/BleScanningTechnology.startMonitoring` is the only place the
/// APK learns a watch's pairing code, and it does so **before connecting**:
///
/// ```kotlin
/// scanResult.scanRecord.manufacturerSpecificData.keys().forEach { key ->
///     data += byteArrayOf((key and 0xff).toByte(), ((key shr 8) and 0xff).toByte()) +
///               scanRecord.getManufacturerSpecificData(key)
/// }
/// data.forEach {
///     val bb = ByteBuffer.wrap(it)          // ByteBuffer is big endian
///     val code = bb.short                   // → pairingCode
///     protocolVersion = bb.get()            // → next byte
/// }
/// DeviceInfo(mac, pairingCode /* -1 if no record */, protocolVersion /* 1 by default */, …)
/// ```
///
/// CoreBluetooth hands out the same byte layout under
/// `CBAdvertisementDataManufacturerDataKey` (company id little endian, then the
/// payload), so the two byte orders cancel out and `getShort()` is a big-endian
/// read of the first two bytes.
///
/// `pair/ui/gen2/Gen2PairingProgressViewModel` then refuses every discovered
/// device whose `pairingCode` differs from the code the user scanned off the
/// watch's QR code, which is what makes a watch that is not in "Show QR" mode
/// unpairable — and what makes the code the strongest discovery signal there is.
struct Gen2Advertisement: Equatable {
    /// The APK's defaults for a scan record with no manufacturer data at all.
    static let noPairingCode = -1
    static let defaultProtocolVersion: UInt8 = 1

    let raw: [UInt8]
    let pairingCode: Int
    let protocolVersion: UInt8

    init(manufacturerData: Data?) {
        let bytes = manufacturerData.map { Array($0) } ?? []
        raw = bytes
        guard bytes.count >= 2 else {
            pairingCode = Self.noPairingCode
            protocolVersion = Self.defaultProtocolVersion
            return
        }
        pairingCode = Int(Int16(bitPattern: (UInt16(bytes[0]) << 8) | UInt16(bytes[1])))
        protocolVersion = bytes.count >= 3 ? bytes[2] : Self.defaultProtocolVersion
    }

    var hasManufacturerData: Bool { raw.count >= 2 }
}

/// `java.util.zip.CRC32` — reflected CRC-32/ISO-HDLC, poly 0xEDB88320,
/// init 0xFFFFFFFF, final XOR 0xFFFFFFFF. `CRCCalculationUtilsKt.calculateCRCVer1`
/// is exactly this (it instantiates `java.util.zip.CRC32` directly).
enum CRC32 {
    private static let table: [UInt32] = {
        (0..<256).map { byte -> UInt32 in
            var crc = UInt32(byte)
            for _ in 0..<8 {
                crc = (crc & 1) == 1 ? (crc >> 1) ^ 0xEDB8_8320 : crc >> 1
            }
            return crc
        }
    }()

    static func checksum(_ data: [UInt8]) -> UInt32 {
        var crc: UInt32 = 0xFFFF_FFFF
        for byte in data {
            crc = table[Int((crc ^ UInt32(byte)) & 0xFF)] ^ (crc >> 8)
        }
        return crc ^ 0xFFFF_FFFF
    }
}

/// Response status codes (`sdk/protocol/commands/ResponseType.java`).
enum Gen2ResponseType: UInt16 {
    case success = 0xE200
    case processing = 0xE202
    case watchBusy = 0xE102
    case error = 0xE404
    case syncLocked = 0xE423

    /// Maps a decoded status to the protocol error the executor raises.
    /// `nil` means "success/complete" — `Gen2Command.extractResponseType`
    /// returns null for E200 and E202.
    var error: Gen2ProtocolError? {
        switch self {
        case .success, .processing: return nil
        case .watchBusy: return .watchBusy
        case .syncLocked: return .syncLocked
        case .error: return .unknown
        }
    }
}

enum Gen2ProtocolError: Error, Equatable {
    case watchBusy
    case syncLocked
    case parsing(String)
    case ackTimeout
    case responseTimeout
    case unknown
}

/// Frame construction and parsing.
///
/// Wire layout, phone -> watch (`Gen2Command.DefaultImpls.createHeader/createCRC`
/// plus `getSendingData`):
///
///     [0..1] u16 LE   len  = payloadCount + 6
///     [2..3] u16 LE   0x1040  (written as 40 10)
///     [4..5] opcode, two bytes, high nibble byte first ("9106" -> 91 06)
///     [6.. ] payload
///     [n-4..n] u32 LE CRC32 over (opcode bytes + payload)
///
/// Notification reassembly (`ChannelStreamImpl.extractHeaderSize`, headerAddition
/// = 4): a frame's total length is the LE u16 at [0] plus 4, so a payload of
/// `p` bytes produces a `p + 10` byte frame.
enum Gen2Framing {
    static let headerSize = 4
    static let minimumResponseLength = 8
    /// `createHeader` writes `putShort((short) 4160)` = 0x1040 little-endian.
    static let frameKindBytes: [UInt8] = [0x40, 0x10]

    /// `DTPAckType.AckGood` = mapToBytes("05000020008DEF02D2")
    static let ackGood: [UInt8] = [0x05, 0x00, 0x00, 0x20, 0x00, 0x8D, 0xEF, 0x02, 0xD2]
    /// `DTPAckType.AckCRCInvalid` = mapToBytes("05000020011BDF05A5")
    static let ackCRCInvalid: [UInt8] = [0x05, 0x00, 0x00, 0x20, 0x01, 0x1B, 0xDF, 0x05, 0xA5]
    /// `Gen2ExecutorImpl.newControlAckMark` = mapToBytes("06000030"); compared
    /// against the leading four bytes only (`isAckControlMark`).
    static let controlAckMark: [UInt8] = [0x06, 0x00, 0x00, 0x30]

    static func isControlAckMark(_ data: [UInt8]) -> Bool {
        guard data.count >= controlAckMark.count else { return false }
        return Array(data.prefix(controlAckMark.count)) == controlAckMark
    }

    /// `Gen2ExecutorKt.mapToBytes`: parses a 4-hex-digit id in order.
    static func opcodeBytes(fromHex hex: String) -> [UInt8] {
        var bytes: [UInt8] = []
        var idx = hex.startIndex
        while idx < hex.endIndex {
            let next = hex.index(idx, offsetBy: 2, limitedBy: hex.endIndex) ?? hex.endIndex
            bytes.append(UInt8(hex[idx..<next], radix: 16) ?? 0)
            idx = next
        }
        return bytes
    }

    static func encode(opcode: String, payload: [UInt8]) -> [UInt8] {
        encode(opcodeBytes: opcodeBytes(fromHex: opcode), payload: payload)
    }

    static func encode(opcodeBytes: [UInt8], payload: [UInt8]) -> [UInt8] {
        // createHeader is fed the *payload only*: length = payload + 2 + 4.
        let length = UInt16(truncatingIfNeeded: payload.count + 6)
        var frame: [UInt8] = [
            UInt8(length & 0xFF), UInt8((length >> 8) & 0xFF)
        ]
        frame.append(contentsOf: frameKindBytes)
        frame.append(contentsOf: opcodeBytes)
        frame.append(contentsOf: payload)
        // createCRC is fed coreCommand + payload.
        var crcInput: [UInt8] = []
        crcInput.append(contentsOf: opcodeBytes)
        crcInput.append(contentsOf: payload)
        frame.append(contentsOf: littleEndianBytes(CRC32.checksum(crcInput)))
        return frame
    }

    static func littleEndianBytes(_ value: UInt32) -> [UInt8] {
        [
            UInt8(value & 0xFF),
            UInt8((value >> 8) & 0xFF),
            UInt8((value >> 16) & 0xFF),
            UInt8((value >> 24) & 0xFF)
        ]
    }

    /// Watch -> phone frame.
    ///
    /// Unlike a request, a response carries **no opcode field**: `extractPayload`
    /// yields `response[4 ..< count-4]` and requires `len == body.count + 4`,
    /// while `Gen2BackgroundLogCommand.extractResponse` requires the same body to
    /// satisfy `count % 16 == 0`. Both hold only for
    ///
    ///     [0..1] u16 LE  len = bodyCount + 4
    ///     [2..3] kind (0x1040)
    ///     [4.. ] body (record data, or a 2-byte status word)
    ///     [n-4..] u32 LE CRC32 over body
    ///
    /// which is why `extractResponseType` reads the status out of `body[0..1]`.
    static func encodeResponse(body: [UInt8], kind: [UInt8] = frameKindBytes) -> [UInt8] {
        let length = UInt16(truncatingIfNeeded: body.count + 4)
        var frame: [UInt8] = [UInt8(length & 0xFF), UInt8((length >> 8) & 0xFF)]
        frame.append(contentsOf: kind)
        frame.append(contentsOf: body)
        frame.append(contentsOf: littleEndianBytes(CRC32.checksum(body)))
        return frame
    }

    /// `ResponseType.SUCCESS` (E200) as a standalone completion frame.
    static func completionFrame() -> [UInt8] { encodeResponse(body: [0xE2, 0x00]) }

    static func bigEndianBytes(_ value: UInt32) -> [UInt8] {
        [
            UInt8((value >> 24) & 0xFF),
            UInt8((value >> 16) & 0xFF),
            UInt8((value >> 8) & 0xFF),
            UInt8(value & 0xFF)
        ]
    }

    /// `Gen2Command.validateResponse`
    static func validateResponse(_ response: [UInt8]) -> Bool {
        response.count >= minimumResponseLength
    }

    /// `Gen2Command.extractPayload`: returns (valid, body) where body is
    /// response[4 ..< count-4] and valid requires len == body.count + 4.
    static func extractPayload(_ response: [UInt8]) -> (valid: Bool, body: [UInt8]) {
        guard validateResponse(response) else { return (false, response) }
        let length = UInt16(response[0]) | (UInt16(response[1]) << 8)
        let body = Array(response[4..<(response.count - 4)])
        return (Int(length) == body.count + 4, body)
    }

    /// `Gen2ComandsKt.compareCRC`
    static func compareCRC(_ response: [UInt8]) -> Bool {
        guard response.count >= minimumResponseLength else { return false }
        let body = Array(response[4..<(response.count - 4)])
        let received = readUInt32LE(response, at: response.count - 4)
        return received == CRC32.checksum(body)
    }

    static func readUInt32LE(_ data: [UInt8], at offset: Int) -> UInt32 {
        guard offset >= 0, offset + 4 <= data.count else { return 0 }
        return UInt32(data[offset])
            | (UInt32(data[offset + 1]) << 8)
            | (UInt32(data[offset + 2]) << 16)
            | (UInt32(data[offset + 3]) << 24)
    }

    /// Some decoders use `ByteBuffer.wrap(...)` with no `.order()`, i.e. **big
    /// endian**: the 9104 daily total, and the log-count commands.
    static func readUInt32BE(_ data: [UInt8], at offset: Int) -> UInt32 {
        guard offset >= 0, offset + 4 <= data.count else { return 0 }
        return UInt32(data[offset]) << 24
            | UInt32(data[offset + 1]) << 16
            | UInt32(data[offset + 2]) << 8
            | UInt32(data[offset + 3])
    }

    /// `extractResponseType` reads payload[0..1] with `ByteBuffer.wrap().getShort()`
    /// — i.e. big endian.
    static func responseType(fromBody body: [UInt8]) -> Gen2ResponseType? {
        guard body.count >= 2 else { return nil }
        let raw = (UInt16(body[0]) << 8) | UInt16(body[1])
        return Gen2ResponseType(rawValue: raw)
    }
}

/// `shared/extensions/NumberExtensionsKt.extractNumber(word, high, low, signed)`
/// = `(word & createMask(high, low)) >>> low`.
enum BitReader {
    static func extract(_ word: UInt32, high: Int, low: Int, signed: Bool = false) -> Int {
        let width = high - low + 1
        guard width > 0, width <= 32, low >= 0 else { return 0 }
        let mask: UInt32 = width == 32 ? 0xFFFF_FFFF : (1 << UInt32(width)) - 1
        // Java: `(word & (mask << low)) >>> low`. The mask has to be shifted
        // into position first; masking with an unshifted `(1 << width) - 1`
        // silently drops the low `low` bits of every field.
        let positioned = mask << UInt32(low)
        let raw = (word & positioned) >> UInt32(low)
        if signed, raw > (1 << UInt32(width - 1)) - 1 {
            return Int(Int64(bitPattern: UInt64(raw)) << (64 - width)) >> (64 - width)
        }
        return Int(raw)
    }
}
