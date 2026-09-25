import Foundation

/// Re-assembles whole DTP frames from the notification stream.
///
/// BLE notifications are MTU-sized, so any frame larger than the negotiated
/// payload arrives in pieces (the real watch's log-count answer is already
/// 36 bytes; a 57-entry background pull is far more). Framing is decided by
/// the size field alone — `size` counts body + CRC, so a frame spans exactly
/// `4 + size` bytes. That is what Android does: `extractPayload` never looks
/// at the magic, which is NOT a constant on receive (the watch answers
/// `9000`/`9116` with `4010` and `9107` with `4011`). Integrity is the CRC's
/// job — checked by `DTPResponse.decode`, not here.
///
/// One framer per notification characteristic.
public struct DTPStreamFramer {
    /// `size` = body + CRC, so it can never be smaller than the CRC alone.
    static let minSize = 4
    /// Sanity bound: a full ATT payload is 512 bytes, so anything larger is
    /// stream garbage rather than a real frame.
    public var maxSize = 516

    private var buffer: [UInt8] = []

    public init() {}

    /// Appends one notification and returns every frame that is now complete.
    public mutating func append(_ bytes: [UInt8]) -> [[UInt8]] {
        buffer.append(contentsOf: bytes)
        var frames: [[UInt8]] = []
        while let frame = nextFrame() {
            frames.append(frame)
        }
        return frames
    }

    /// Forgets any partial frame (call on disconnect — a stale fragment from
    /// the old link must not be spliced onto the next one).
    public mutating func reset() {
        buffer.removeAll()
    }

    private mutating func nextFrame() -> [UInt8]? {
        // Resync past garbage: skip bytes until the size field is plausible.
        while buffer.count >= 2 {
            let size = Int(UInt16(buffer[0]) | UInt16(buffer[1]) << 8)
            if size >= Self.minSize && size <= maxSize { break }
            buffer.removeFirst()
        }
        guard buffer.count >= 2 else { return nil }
        let total = 4 + Int(UInt16(buffer[0]) | UInt16(buffer[1]) << 8)
        guard buffer.count >= total else { return nil }
        let frame = Array(buffer[0..<total])
        buffer.removeFirst(total)
        return frame
    }
}
