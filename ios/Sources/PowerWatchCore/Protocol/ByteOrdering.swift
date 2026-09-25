import Foundation

/// Inclusive bit-field extraction, ported from the Android
/// `shared/extensions/NumberExtensionsKt.extractNumber(value, from, to)`.
/// `from` and `to` are inclusive bit indices, little-endian bit order
/// (bit 0 = LSB).
func bits(_ value: UInt32, from: Int, to: Int) -> UInt32 {
    let width = to - from + 1
    let mask: UInt32 = width >= 32 ? .max : ((1 << UInt32(width)) - 1)
    return (value & (mask << UInt32(from))) >> UInt32(from)
}

/// Nine-bit two's-complement decode used for the case-temperature field of the
/// background log (`if (v > 255) v -= 512`).
func signed9(_ v: UInt32) -> Int {
    v > 255 ? Int(v) - 512 : Int(v)
}

/// Sequential reader with explicit endianness, mirroring `java.nio.ByteBuffer`.
struct ByteReader {
    let bytes: [UInt8]
    private(set) var position = 0

    init(_ bytes: [UInt8]) {
        self.bytes = bytes
    }

    var hasRemaining: Bool { position < bytes.count }
    var remaining: Int { bytes.count - position }

    mutating func readUInt8() throws -> UInt8 {
        guard remaining >= 1 else { throw DTPProtocolError.parseError("read past end") }
        defer { position += 1 }
        return bytes[position]
    }

    mutating func readUInt16BE() throws -> UInt16 {
        let hi = try readUInt8(), lo = try readUInt8()
        return UInt16(hi) << 8 | UInt16(lo)
    }

    mutating func readUInt32BE() throws -> UInt32 {
        let b0 = try readUInt8(), b1 = try readUInt8(), b2 = try readUInt8(), b3 = try readUInt8()
        return UInt32(b0) << 24 | UInt32(b1) << 16 | UInt32(b2) << 8 | UInt32(b3)
    }

    mutating func readUInt32LE() throws -> UInt32 {
        let b0 = try readUInt8(), b1 = try readUInt8(), b2 = try readUInt8(), b3 = try readUInt8()
        return UInt32(b3) << 24 | UInt32(b2) << 16 | UInt32(b1) << 8 | UInt32(b0)
    }

    mutating func readBytes(_ count: Int) throws -> [UInt8] {
        guard remaining >= count else { throw DTPProtocolError.parseError("read past end") }
        defer { position += count }
        return Array(bytes[position..<(position + count)])
    }
}

/// Sequential writer with explicit endianness.
struct ByteWriter {
    private(set) var bytes: [UInt8] = []

    mutating func write(_ byte: UInt8) { bytes.append(byte) }
    mutating func write(_ value: UInt16, bigEndian: Bool = true) {
        if bigEndian {
            bytes.append(UInt8(value >> 8)); bytes.append(UInt8(value & 0xFF))
        } else {
            bytes.append(UInt8(value & 0xFF)); bytes.append(UInt8(value >> 8))
        }
    }
    mutating func write(_ value: UInt32, bigEndian: Bool = true) {
        let b: [UInt8] = bigEndian
            ? [
                UInt8(truncatingIfNeeded: value >> 24), UInt8(truncatingIfNeeded: value >> 16),
                UInt8(truncatingIfNeeded: value >> 8), UInt8(truncatingIfNeeded: value),
            ]
            : [
                UInt8(truncatingIfNeeded: value), UInt8(truncatingIfNeeded: value >> 8),
                UInt8(truncatingIfNeeded: value >> 16), UInt8(truncatingIfNeeded: value >> 24),
            ]
        bytes.append(contentsOf: b)
    }
    mutating func write(_ data: [UInt8]) { bytes.append(contentsOf: data) }
}
