import Foundation

/// Shared command/response state machine, extracted so that both the real
/// CoreBluetooth transport and the built-in simulated watch run through the
/// *same* frame validation and decoding code.
///
/// Faithful to `Gen2ExecutorImpl.readWithAck`:
///   - only `AckGood` releases the command
///   - the `06 00 00 30` control mark re-triggers our ACK write
///   - every data frame is CRC-checked and answered with AckGood / AckCRCInvalid
///   - `E200` / `E202` completes, `E102` / `E423` abort
final class Gen2ResponseCollector {
    enum Outcome: Equatable {
        case ignored
        case watchAckReceived
        case controlResend
        case complete([UInt8])
        case failed(Gen2ProtocolError)
    }

    private(set) var accumulated: [UInt8] = []
    private(set) var sawAck = false
    private let onWriteAck: (Bool) -> Void

    init(onWriteAck: @escaping (Bool) -> Void) {
        self.onWriteAck = onWriteAck
    }

    func reset() {
        accumulated = []
        sawAck = false
    }

    /// Ceiling on the body one command may accumulate. A real `9000` answer is
    /// `count × 16` bytes and the largest one captured from hardware is a few tens of
    /// kilobytes, so this can only trip on a peripheral that keeps streaming frames at
    /// us; without it `accumulated` grows until the app is killed (H2).
    static let maxAccumulatedBytes = 512 * 1024

    func ingest(_ frame: [UInt8]) -> Outcome {
        if frame == Gen2Framing.ackGood {
            sawAck = true
            return .watchAckReceived
        }
        // `readAckResponse` only matches AckGood; an AckCRCInvalid is ignored so
        // the command runs into its timeout, exactly as the SDK does.
        if frame == Gen2Framing.ackCRCInvalid {
            return .ignored
        }
        if Gen2Framing.isControlAckMark(frame) {
            onWriteAck(true)
            return .controlResend
        }

        guard Gen2Framing.validateResponse(frame) else { return .ignored }
        let crcOK = Gen2Framing.compareCRC(frame)
        let (valid, body) = Gen2Framing.extractPayload(frame)
        // 200 ms delay before the write is applied by the caller's scheduler.
        onWriteAck(crcOK && valid)
        guard valid, crcOK else { return .ignored }

        if let status = Gen2Framing.responseType(fromBody: body) {
            if let error = status.error { return .failed(error) }
            return .complete(accumulated)
        }
        // Refuse to be turned into a memory leak: a valid-CRC deluge ends the command
        // with a protocol error instead of growing this array (H2).
        guard accumulated.count + body.count <= Self.maxAccumulatedBytes else {
            return .failed(.parsing("response exceeded \(Self.maxAccumulatedBytes) bytes"))
        }
        accumulated.append(contentsOf: body)
        return .ignored
    }
}
