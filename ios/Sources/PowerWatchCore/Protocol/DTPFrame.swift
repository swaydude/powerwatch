import Foundation

/// DTP wire frame, ported byte-for-byte from the Android
/// `sdk/protocol/commands/Gen2Command.DefaultImpls`.
///
/// Frame layout (all multi-byte fields little-endian unless noted):
///
///     ┌────────┬──────────┬─────────────┬─────────┬────────────┐
///     │ len:2  │ magic:2  │ command:2   │ payload │ crc32:4    │
///     │ LE     │ LE       │ BE (0x9000) │         │ LE over    │
///     │        │ 0x1040   │             │         │ cmd+payload│
///     └────────┴──────────┴─────────────┴─────────┴────────────┘
///
/// `len` counts everything after the 4-byte header: 2 (command) + payload + 4
/// (CRC), i.e. `frame.count - 4` on the wire.
public struct DTPFrame: Equatable {
    static let magic: UInt16 = 0x1040
    static let headerSize = 4
    static let crcSize = 4
    static let commandSize = 2

    public let command: Gen2CommandID
    public let payload: [UInt8]

    public init(command: Gen2CommandID, payload: [UInt8] = []) {
        self.command = command
        self.payload = payload
    }

    /// Serialized frame bytes.
    public var encoded: [UInt8] {
        var writer = ByteWriter()
        let length = DTPFrame.commandSize + payload.count + DTPFrame.crcSize
        writer.write(UInt16(length), bigEndian: false)   // header: length LE
        writer.write(DTPFrame.magic, bigEndian: false)   // header: magic LE
        writer.write(command.bytes)                        // command id, big-endian pair
        writer.write(payload)
        var crcInput = command.bytes
        crcInput.append(contentsOf: payload)
        writer.write(CRC32.checksum(crcInput), bigEndian: false)
        return writer.bytes
    }

    /// Decodes a received frame, validating length and CRC.
    /// Mirrors `extractPayload` + `compareCRC`.
    public static func decode(_ bytes: [UInt8]) throws -> DTPFrame {
        guard bytes.count >= headerSize + crcSize else {
            throw DTPProtocolError.parseError("frame too short (\(bytes.count) bytes)")
        }
        let length = UInt16(bytes[0]) | UInt16(bytes[1]) << 8
        let body = Array(bytes[headerSize..<(bytes.count - crcSize)])
        guard Int(length) == body.count + 4 else {
            throw DTPProtocolError.parseError("length mismatch: header says \(length), body is \(body.count)")
        }
        let commandBytes = Array(body.prefix(commandSize))
        guard commandBytes.count == commandSize,
              let command = Gen2CommandID(rawValue: String(
                format: "%02X%02X", commandBytes[0], commandBytes[1])) else {
            throw DTPProtocolError.parseError("unknown command id \(commandBytes.map { String(format: "%02X", $0) })")
        }
        let payload = Array(body.dropFirst(commandSize))
        let crcStored = UInt32(bytes[bytes.count - 4]) | UInt32(bytes[bytes.count - 3]) << 8
            | UInt32(bytes[bytes.count - 2]) << 16 | UInt32(bytes[bytes.count - 1]) << 24
        guard CRC32.checksum(body) == crcStored else {
            throw DTPProtocolError.parseError("CRC mismatch")
        }
        return DTPFrame(command: command, payload: payload)
    }
}

/// A frame received from the watch.
///
/// Responses carry **no command id** — that was the real-watch bug
/// (2026-09-24): `DTPFrame.decode` demanded one and threw the watch's answers
/// away, so every data command hung and the watch dropped the link. Android
/// never reads a command id out of a response: `extractPayload` strips only the
/// 4-byte header and the CRC, and the awaited command is handed the whole body
/// (`Gen2GetLogCountCommand.extractResponse` wants exactly 28 raw bytes).
/// So a response body is either
/// - just the two-byte status word (`E200` success …), or
/// - the awaited command's raw payload (no status prefix).
///
/// Requests are correlated with responses by sequencing, not by id: the
/// pending command consumes the next frame on the channel.
public struct DTPResponse: Equatable {
    public let body: [UInt8]

    public init(body: [UInt8]) {
        self.body = body
    }

    /// The status word when the body opens with a known `ResponseType`
    /// (`extractResponseType` reads the first two bytes big-endian).
    public var status: ResponseType? {
        guard body.count >= 2 else { return nil }
        return ResponseType(rawValue: UInt16(body[0]) << 8 | UInt16(body[1]))
    }

    /// The command's data: the whole body, since data frames have no header
    /// of their own — and nothing at all for a status-only frame, which means
    /// "done, no records" (Android routes a status frame to `onSuccess`
    /// without ever calling the command's parser).
    public var payload: [UInt8] { status == nil ? body : [] }

    /// Serialises a response — the scripted/test counterpart of a watch TX.
    public var encoded: [UInt8] {
        var writer = ByteWriter()
        writer.write(UInt16(body.count + DTPFrame.crcSize), bigEndian: false)
        writer.write(DTPFrame.magic, bigEndian: false)
        writer.write(body)
        writer.write(CRC32.checksum(body), bigEndian: false)
        return writer.bytes
    }

    /// Validates and unpacks a received frame — `extractPayload` + `compareCRC`:
    /// minimum length, `size == body + 4` (little-endian) and a CRC32 over the
    /// body matching the trailing four little-endian bytes.
    public static func decode(_ bytes: [UInt8]) throws -> DTPResponse {
        guard bytes.count >= DTPFrame.headerSize + DTPFrame.crcSize else {
            throw DTPProtocolError.parseError("frame too short (\(bytes.count) bytes)")
        }
        let length = UInt16(bytes[0]) | UInt16(bytes[1]) << 8
        let body = Array(bytes[DTPFrame.headerSize..<(bytes.count - DTPFrame.crcSize)])
        guard Int(length) == body.count + 4 else {
            throw DTPProtocolError.parseError("length mismatch: header says \(length), body is \(body.count)")
        }
        let crcStored = UInt32(bytes[bytes.count - 4]) | UInt32(bytes[bytes.count - 3]) << 8
            | UInt32(bytes[bytes.count - 2]) << 16 | UInt32(bytes[bytes.count - 1]) << 24
        guard CRC32.checksum(body) == crcStored else {
            throw DTPProtocolError.parseError("CRC mismatch")
        }
        return DTPResponse(body: body)
    }
}

/// DTP flow-control frames, written to the event characteristic (…0013) after
/// every frame received from the watch.
///
/// Android `Gen2ExecutorImpl.writeAck` builds these from `DTPAckType` and
/// `Gen2Protocol` routes `ACK_MESSAGE` to `channel.sendEvent` — i.e. the event
/// characteristic, not the DTP write characteristic. They are fixed byte
/// strings in the SDK (framing rule as usual: `size = body + 4`, magic
/// `0x2000` for the control protocol, CRC32 little-endian over the body).
///
/// Mandatory, not optional: the watch does not answer the next command until
/// the current frame is ACKed, and it tears the link down ~10 s after an
/// unacked frame (real-watch trace 2026-09-24 — getLogCount answered 10 s
/// late, then CBError 7 "device has disconnected from us").
public enum DTPAck {
    /// Magic of the control/ACK protocol (`0x2000`), vs `0x1040` for DTP data.
    public static let magic: UInt16 = 0x2000
    /// `0500 0020 00 8DEF02D2` — frame accepted.
    public static let good: [UInt8] = [0x05, 0x00, 0x00, 0x20, 0x00, 0x8D, 0xEF, 0x02, 0xD2]
    /// `0500 0020 01 1BDF05A5` — CRC failed, resend the last frame.
    public static let crcInvalid: [UInt8] = [0x05, 0x00, 0x00, 0x20, 0x01, 0x1B, 0xDF, 0x05, 0xA5]
}

/// Raw (unframed) DTP-X writes: `DTPXProtocol` parses with
/// `SimpleProtocolParser`, so these go to the write characteristic verbatim —
/// no DTP header, length or CRC, and no ACK is owed for them. Ported from
/// `ShowSyncAnimationCommand`, `HideSyncAnimationCommand` and
/// `DTPXProtocol.connectToChannel`.
public enum DTPSetting {
    /// `0x84 0x40` — start the watch's syncing animation (Android sends this
    /// first, before any log transfer).
    public static let showSyncAnimation: [UInt8] = [0x84, 0x40]
    /// `0x84 0x41` — stop it. **Required**: `9001` alone leaves the watch face
    /// displaying "syncing" indefinitely (Android sends this as the last thing
    /// its sync does).
    public static let hideSyncAnimation: [UInt8] = [0x84, 0x41]
    /// `0x84 0x42 0x01` — Android sends this when the DTP-X channel opens.
    public static let openSession: [UInt8] = [0x84, 0x42, 0x01]
}

/// Response status words carried in the first two bytes of a response payload
/// (read big-endian). Ported from `ResponseType`.
public enum ResponseType: UInt16, Equatable {
    case success = 0xE200      // "E200"
    case error = 0xE404        // "E404"
    case locked = 0xE423       // "E423"
    case wait = 0xE102         // "E102"
    case processing = 0xE202   // "E202"

    /// `DTPProtocolError` equivalent for this status word
    /// (ported from `Gen2Command.DefaultImpls.extractResponseType`).
    public var protocolError: DTPProtocolError? {
        switch self {
        case .success, .processing: return nil
        case .locked: return .syncLocked
        case .wait: return .watchBusy
        case .error: return .unknownResponse
        }
    }
}

/// Ported from `DTPProtocolError`.
public enum DTPProtocolError: Error, Equatable {
    case syncLocked
    case watchBusy
    case unknownResponse
    case backgroundLogSizeMismatch
    case activityDeltaLogSizeMismatch
    case activityStartLogSizeMismatch
    case activityEndLogSizeMismatch
    case invalidBackgroundLogTimestampIndex
    case parseError(String)
}
