import Foundation

/// Watch log state classification. Ported from `LogType` (values 0–9).
public enum LogType: Int, Equatable, CaseIterable, Sendable {
    case devOffWrist = 0
    case sleepDeep = 1
    case sleepLight = 2
    case sleepRestless = 3
    case awakeStill = 4
    case awakeWalking = 5
    case awakeRunning = 6
    case awakeBike = 7
    case awakeVehicle = 8
    case stateUnknown = 9

    /// Watch-log "sleep quality" word used by `WatchLogEntry`
    /// (ported from `Gen2BackgroundLogCommand.extractResponse`).
    var watchLogSleepQuality: Int {
        switch self {
        case .sleepDeep: return 5
        case .sleepLight: return 3
        case .sleepRestless: return 1
        default: return 0
        }
    }

    var isSleep: Bool {
        self == .sleepDeep || self == .sleepLight || self == .sleepRestless
    }
}

/// Ported from `ActivityType`.
public enum ActivityType: Int, Equatable, CaseIterable, Sendable {
    case stationary = 0
    case walking = 1
    case running = 2
    case jogging = 3
    case biking = 4
    case driving = 5
    case indoorWalking = 6
    case indoorRunning = 7
    case indoorJogging = 8
    case indoorBiking = 9
    case hiit = 10
    case unknown = 255
}

/// Watch language codes sent with the `9004` SendLanguage command.
/// Ported from `LocaleCommandValue`.
public enum WatchLocale: Int, Equatable, CaseIterable, Codable, Sendable {
    case english = 0
    case simplifiedChinese = 1
    case japanese = 2
    case russian = 3
    case german = 4
    case french = 5
    case italian = 6
    case spanish = 7
    case portuguese = 8
    case korean = 9
    case traditionalChinese = 10
    case czech = 11
    case polish = 12
}

/// Power-conversion lookup tables for the background log's bit-packed
/// generation/consumption indices. Ported from `Gen2BackgroundLogCommandKt`.
enum PowerTables {
    static let generation: [Int] = [
        0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 20, 24, 28, 32, 40, 48, 56,
        64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 640, 768,
        896, 1024, 1280, 1536, 1792, 2048, 2560, 3072, 3584, 4096, 5120, 6144,
        7168, 8192, 10240, 12288, 14336, 16384, 20480, 24576, 28672, 32768,
        40960, 49152, 57344, 65536, 81920, 98304, 114688,
    ]

    static let consumption: [Int] = [
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
        20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 34, 36, 38, 40, 42,
        44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 68, 72, 76, 80, 84, 88, 92,
        96, 100, 104, 108, 112, 116, 120, 124, 128, 136, 144, 152, 160, 168,
        176, 184, 192, 200, 208, 216, 224, 232, 240, 248, 256, 272, 288, 304,
        320, 336, 352, 368, 384, 400, 416, 432, 448, 464, 480, 496, 512, 544,
        576, 608, 640, 672, 704, 736, 768, 800, 832, 864, 896, 928, 960, 992,
        1024, 1088, 1152, 1216, 1280, 1344, 1408, 1472, 1536, 1600, 1664, 1728,
        1792, 1856, 1920, 1984, 2048, 2176, 2304, 2432, 2560, 2688, 2816, 2944,
        3072, 3200, 3328, 3456, 3584, 3712, 3840, 3968, 4096, 4352, 4608, 4864,
        5120, 5376, 5632, 5888, 6144, 6400, 6656, 6912, 7168, 7424, 7680, 7936,
        8192, 8704, 9216, 9728, 10240, 10752, 11264, 11776, 12288, 12800, 13312,
        13824, 14336, 14848, 15360, 15872, 16384, 17408, 18432, 19456, 20480,
        21504, 22528, 23552, 24576, 25600, 26624, 27648, 28672, 29696, 30720,
        31744, 32768, 34816, 36864, 38912, 40960, 43008, 45056, 47104, 49152,
        51200, 53248, 55296, 57344, 59392, 61440, 63488, 65536, 69632, 73728,
        77824, 81920, 86016, 90112, 94208, 98304, 102400, 106496, 110592,
        114688, 118784, 122880, 126976, 131072, 139264, 147456, 155648, 163840,
        172032, 180224, 188416, 196608, 204800, 212992, 221184, 229376, 237568,
        245760, 253952, 262144, 278528, 294912, 311296, 327680, 344064, 360448,
        376832, 393216, 409600, 425984, 442368, 458752, 475136, 491520, 507904,
    ]
}
