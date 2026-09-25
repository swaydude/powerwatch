import Foundation

/// GATT service and characteristic UUIDs used by the PowerWatch 2 watch.
///
/// Ported verbatim from the Android app (`sdk/protocol/BLEServicesKt.kt`,
/// decompiled as `BLEServicesKt.java`). Do not change these values: they are
/// the watch's wire identifiers.
public enum BLEService {

    /// Main data-transfer service used for all non-OTA traffic (Gen 2).
    public static let dtpService = "00002760-08C2-11E1-9073-0E8AC72E1011"

    /// DTP characteristic the watch notifies on (phone ← watch).
    public static let dtpRX = "00002760-08C2-11E1-9073-0E8AC72E0011"

    /// DTP characteristic the phone writes to (phone → watch).
    public static let dtpTX = "00002760-08C2-11E1-9073-0E8AC72E0012"

    /// Basic DTP RX variant used by some firmware revisions.
    public static let basicDTPPwxRX = "00002760-08C2-11E1-9073-0E8AC72E0013"

    /// Standard Device Information service (`180a` in Android's
    /// `BLEServicesKt.GEN2_DEVICE_INFO`). The watch answers no DTP realtime
    /// command (`9104` was never seen on-device) but publishes its live totals
    /// here instead.
    public static let deviceInfoService = "0000180A-0000-1000-8000-00805F9B34FB"

    /// Live totals characteristic (`2a25`, Android's `GEN2_SERIAL_INFO`) —
    /// `GEN2_SERIAL_REQUEST` is literally a GATT read of this characteristic
    /// (`Gen2ProtocolBasics`), answered with tag/value groups.
    public static let liveData = "00002A25-0000-1000-8000-00805F9B34FB"

    /// Service used for firmware updates.
    public static let otaService = "00002760-08C2-11E1-9073-0E8AC72E1001"

    /// OTA characteristic the watch notifies on.
    public static let otaRX = "00002760-08C2-11E1-9073-0E8AC72E0001"

    /// OTA characteristic the phone writes to.
    public static let otaTX = "00002760-08C2-11E1-9073-0E8AC72E0002"

    /// All services the scanner should filter advertisements on.
    public static let scanServices: [String] = [dtpService, otaService]
}
