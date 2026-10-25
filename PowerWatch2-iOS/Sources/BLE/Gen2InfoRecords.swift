import Foundation

/// Decoders for the two characteristics `Gen2ProtocolBasics` **reads** instead of sending
/// a DTP command.
///
/// `Gen2ProtocolBasics.sendMessage` maps the message type to a characteristic out of
/// `characteristicTypeMap` and finishes with `channel.read(it)`:
///
/// * `GEN2_FIRMWARE_REQUEST` → `CharacteristicType.FIRMWARE`      (`GEN2_FIRMWARE_INFO`  = `2a26`)
/// * `GEN2_SERIAL_REQUEST`   → `CharacteristicType.SERIAL`        (`GEN2_SERIAL_INFO`    = `2a25`)
/// * `GEN2_SETTINGS_REQUEST` → `CharacteristicType.SETTINGS_INFO` (`GEN2_SETTINGS_INFO`  = `2a24`)
///
/// — the map itself is built by `ProtocolCreatorImpl`, which matches characteristic UUIDs
/// against the `BLEServicesKt` constants. So "read realtime data" and "read settings" are
/// plain GATT reads, and their payloads are packed record lists rather than DTP frames.
///
/// Record layout, identical in `RealtimeDataParser.extractData` and
/// `SettingsDataParser.extractData`: the value is `chunked(4)`, groups shorter than 4 bytes
/// are dropped, and each group becomes `(id, rest)` by **reversing** it — so the *fourth*
/// byte is the table id and the first three are the value. `extractInt` then does
/// `ByteBuffer.allocate(4).put(0).put(rest).getInt()` over that reversed tail, which
/// evaluates to `b0 | b1 << 8 | b2 << 16`: a little-endian 24-bit integer. When a field is
/// signed (in the APK only `TotalSkinTemp`) values above `2^23 - 1` get `2^24` subtracted.
enum Gen2InfoRecords {
    /// `sdk/HSMTable`, the id space of the realtime (`2a25`) records.
    enum RealtimeField: UInt8 {
        case totalSteps = 0
        case totalCurrentStepsWalk = 1
        case totalCurrentStepsRun = 2
        case totalCalories = 16
        case totalCurrentCaloriesBRM = 17
        case totalCurrentCaloriesActive = 18
        case totalSleep = 32
        case totalDistance = 48
        case totalSolarPower = 64
        case totalThermalPower = 65
        case batteryPercentage = 66
        case totalSkinTemp = 80
    }

    /// `sdk/SettingTable`, the id space of the settings (`2a24`) records. Ids 0…20 line up
    /// with `SettingsData`'s constructor order.
    enum SettingsField: UInt8 {
        case clockFormatSelection = 0
        case unitSelection = 1
        case languageSelection = 2
        case timeZone = 3
        case gender = 4
        case age = 5
        case weight = 6
        case height = 7
        case stepGoal = 8
        case distanceGoal = 9
        case caloriesGoal = 10
        case sleepGoal = 11
        case dnd = 12
        case backLight = 13
        case backLightDuration = 14
        case popupDuration = 15
        case gpsUpdateRate = 16
        case homeScreen = 17
        case bleDisconnect = 18
        case ringtone = 19
        case alert = 20
    }

    /// Complete groups of four, in order — `chunked(4).filter { it.size >= 4 }`.
    static func groups(_ bytes: [UInt8]) -> [[UInt8]] {
        var result: [[UInt8]] = []
        var index = 0
        while index + 4 <= bytes.count {
            result.append(Array(bytes[index..<(index + 4)]))
            index += 4
        }
        return result
    }

    /// `extractInt` for one group: the three value bytes little-endian, sign-extended when
    /// the field is signed.
    static func value(of group: [UInt8], signed: Bool = false) -> Int {
        guard group.count >= 4 else { return 0 }
        var result = Int(group[0]) | (Int(group[1]) << 8) | (Int(group[2]) << 16)
        if signed, result > (1 << 23) - 1 { result -= 1 << 24 }
        return result
    }

    static func id(of group: [UInt8]) -> UInt8? {
        group.count >= 4 ? group[3] : nil
    }

    /// Encodes records the way the watch sends them — the inverse of `value(of:)`/`id(of:)`,
    /// used by the simulator so it answers with byte-true payloads.
    static func encode(_ records: [(UInt8, Int)]) -> [UInt8] {
        records.flatMap { id, value in
            [UInt8(truncatingIfNeeded: value),
             UInt8(truncatingIfNeeded: value >> 8),
             UInt8(truncatingIfNeeded: value >> 16),
             id]
        }
    }

    // MARK: - Realtime (`2a25`)

    /// `sdk/RealtimeWatchData`, as filled in by `RealtimeDataParser.extractData`. The
    /// scaling is the APK's own, integer division included: active calories and distance are
    /// `extractInt(...) / 1000`, so a distance under a kilometre reads 0 km. `batteryPercent`
    /// is nil where the APK leaves `Float.MIN_VALUE`, i.e. `isBatteryValid() == false`.
    /// Heart rate is not in this payload — the APK takes it from the `2a37` stream.
    struct RealtimeData: Equatable {
        var totalSteps = 0
        var totalActiveCalories = 0
        var totalSleepMinutes = 0
        var totalDistanceKilometres = 0.0
        var totalThermalPower = 0
        var totalSolarPower = 0
        var skinTemp: Int?
        var batteryPercent: Float?

        /// `isBatteryValid()`
        var isBatteryValid: Bool { batteryPercent != nil }
    }

    /// The eight branches `extractData` actually has. The walk/run/total-calories/BRM ids
    /// are in `HSMTable` and on the wire, but the parser has no branch for them, so they
    /// stay at zero here exactly as they do in the APK.
    static func parseRealtime(_ bytes: [UInt8]) -> RealtimeData {
        var data = RealtimeData()
        for group in groups(bytes) {
            guard let raw = id(of: group), let field = RealtimeField(rawValue: raw) else { continue }
            switch field {
            case .totalSteps:
                data.totalSteps = value(of: group)
            case .totalCurrentCaloriesActive:
                data.totalActiveCalories = value(of: group) / 1000
            case .totalSleep:
                data.totalSleepMinutes = value(of: group)
            case .totalDistance:
                data.totalDistanceKilometres = Double(value(of: group) / 1000)
            case .totalThermalPower:
                data.totalThermalPower = value(of: group)
            case .totalSolarPower:
                data.totalSolarPower = value(of: group)
            case .totalSkinTemp:
                data.skinTemp = value(of: group, signed: true)
            case .batteryPercentage:
                data.batteryPercent = Float(value(of: group))
            case .totalCurrentStepsWalk, .totalCurrentStepsRun, .totalCalories,
                 .totalCurrentCaloriesBRM:
                break   // no branch in RealtimeDataParser
            }
        }
        return data
    }

    // MARK: - Settings (`2a24`)

    /// `sdk/SettingsData`. Every one of the 21 `SettingTable` entries is
    /// `SettingsDataParserKt.extractInt(dataList, signed = false)`, so all fields are plain
    /// unsigned 24-bit ints; only `alert` has a non-zero default (`2097151` = 0xFFFFFF,
    /// "not reported"), which is why it stays optional here.
    struct SettingsData: Equatable {
        var clockFormatSelection = 0
        var unitSelection = 0
        var languageSelection = 0
        var timeZone = 0
        var gender = 0
        var age = 0
        var weight = 0
        /// Millimetres: the observed watch reports `0x6d6` = 1750 for a 175 cm profile.
        var height = 0
        var stepGoal = 0
        var distanceGoal = 0
        var caloriesGoal = 0
        var sleepGoal = 0
        var dnd = 0
        var backLight = 0
        var backLightDuration = 0
        var popupDuration = 0
        var gpsUpdateRate = 0
        var homeScreen = 0
        var bleDisconnect = 0
        var ringtone = 0
        var alert: Int?

        /// The two unit-bearing fields are stored the way the APK stores them: `weight` in
        /// kilograms and `height` in millimetres (E-63), so conversions happen at display
        /// time only.
        var heightCentimetres: Double { Double(height) / 10.0 }
        var weightKilograms: Double { Double(weight) }
    }

    static func parseSettings(_ bytes: [UInt8]) -> SettingsData {
        var data = SettingsData()
        for group in groups(bytes) {
            guard let raw = id(of: group), let field = SettingsField(rawValue: raw) else { continue }
            switch field {
            case .clockFormatSelection: data.clockFormatSelection = value(of: group)
            case .unitSelection: data.unitSelection = value(of: group)
            case .languageSelection: data.languageSelection = value(of: group)
            case .timeZone: data.timeZone = value(of: group)
            case .gender: data.gender = value(of: group)
            case .age: data.age = value(of: group)
            case .weight: data.weight = value(of: group)
            case .height: data.height = value(of: group)
            case .stepGoal: data.stepGoal = value(of: group)
            case .distanceGoal: data.distanceGoal = value(of: group)
            case .caloriesGoal: data.caloriesGoal = value(of: group)
            case .sleepGoal: data.sleepGoal = value(of: group)
            case .dnd: data.dnd = value(of: group)
            case .backLight: data.backLight = value(of: group)
            case .backLightDuration: data.backLightDuration = value(of: group)
            case .popupDuration: data.popupDuration = value(of: group)
            case .gpsUpdateRate: data.gpsUpdateRate = value(of: group)
            case .homeScreen: data.homeScreen = value(of: group)
            case .bleDisconnect: data.bleDisconnect = value(of: group)
            case .ringtone: data.ringtone = value(of: group)
            case .alert: data.alert = value(of: group)
            }
        }
        return data
    }
}
