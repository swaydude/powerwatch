import Foundation

// T3.3 — port of the `sdk/technologies` + `sdk/channels` abstraction
// (`CommunicationTechnology`, `CommunicationChannel`). Android's stack is
// RxJava + RxBleClient; this port replaces Rx with delegate callbacks and the
// RxAndroidBLE implementation with CoreBluetooth
// (`CoreBluetoothTransport`). Everything in this file is hardware- and
// CoreBluetooth-independent so the routing/filter logic is unit-testable.

/// Snapshot of a watch seen in an advertisement (T3.1 scanner output).
public struct DiscoveredWatch: Identifiable, Equatable, Sendable {
    /// Stable peripheral identifier (CBPeripheral identifier on iOS).
    public let id: UUID
    /// Advertised local name (may be empty for the watch).
    public let name: String
    /// Latest RSSI in dBm.
    public let rssi: Int
    /// Which PowerWatch service the advertisement carried ("DTP" / "OTA").
    public let advertisedService: AdvertisedService
    /// Pairing code from the manufacturer data (Android
    /// `BleScanningTechnology` parses the same value); nil when the
    /// advertisement carried none.
    public let pairingCode: Int16?
    /// Protocol version byte from the manufacturer data (1 when absent).
    public let protocolVersion: Int8

    public init(id: UUID, name: String, rssi: Int, advertisedService: AdvertisedService,
                pairingCode: Int16? = nil, protocolVersion: Int8 = 1) {
        self.id = id
        self.name = name
        self.rssi = rssi
        self.advertisedService = advertisedService
        self.pairingCode = pairingCode
        self.protocolVersion = protocolVersion
    }

    public enum AdvertisedService: String, Equatable, Sendable {
        case dtp
        case ota
        /// Advertised no PowerWatch service UUID — seen in pair scans, where
        /// the watch is identified by its manufacturer-data pairing code.
        case unknown

        public init?(serviceUUID: String) {
            switch serviceUUID.lowercased() {
            case BLEService.dtpService.lowercased(): self = .dtp
            case BLEService.otaService.lowercased(): self = .ota
            default: return nil
            }
        }
    }
}

/// Pairing-code extraction from the watch's QR payload — port of Android
/// `QRPairingViewModel.extractQRCode`. The QR is multi-line text; the line
/// containing "Pair code" ends with the code, with an "open?…" URL line as
/// fallback.
public enum PairCodeParser {

    public static func extract(_ qrText: String) -> Int16? {
        for line in qrText.split(separator: "\n", omittingEmptySubsequences: false) {
            if line.lowercased().contains("pair code") {
                // Android splits on " " and takes the last token.
                guard let token = line.split(separator: " ").last,
                      let value = Int(token) else { return nil }
                return Int16(truncatingIfNeeded: value)
            }
        }
        for line in qrText.split(separator: "\n", omittingEmptySubsequences: false) {
            if line.lowercased().contains("open?") {
                // "…open?code=12345" → segment after "?" split by "=" [1].
                let parts = line.split(separator: "?")
                guard parts.count > 1 else { return nil }
                let pair = parts[1].split(separator: "=")
                guard pair.count > 1, let value = Int(pair[1]) else { return nil }
                return Int16(truncatingIfNeeded: value)
            }
        }
        return nil
    }
}

/// Manufacturer-data parsing (Android `BleScanningTechnology` pairs the
/// company-ID-prefixed buffer): the first two bytes read big-endian are the
/// pairing code, the third byte is the protocol version. On iOS
/// `CBAdvertisementDataManufacturerDataKey` already carries the company ID
/// as its first two bytes — the layouts coincide.
public enum PairingAdvertisement {

    /// `(pairingCode, protocolVersion)` from a manufacturer-data blob, or nil
    /// when the blob is too short (Android requires ≥ 3 bytes to be useful).
    public static func parse(_ manufacturerData: [UInt8]) -> (pairingCode: Int16, protocolVersion: Int8)? {
        guard manufacturerData.count >= 2 else { return nil }
        let code = Int16(manufacturerData[0]) << 8 | Int16(manufacturerData[1])
        let version: Int8 = manufacturerData.count > 2 ? Int8(bitPattern: manufacturerData[2]) : 1
        return (code, version)
    }
}

/// Transport state machine (T3.2). The CoreBluetooth states are folded into
/// `unavailable(reason:)` — the app surfaces a single banner for all of them.
public enum TransportState: Equatable, Sendable {
    case idle
    case scanning
    case connecting(UUID)
    case connected(UUID)
    case unavailable(reason: UnavailableReason)

    public enum UnavailableReason: Equatable, Sendable {
        case poweredOff
        case unauthorized
        case unsupported
    }
}

/// Advertisement filtering (T3.1): the scanner keeps a peripheral only when
/// its advertised service UUIDs contain the DTP service (data/normal use) or
/// the OTA service (firmware update mode).
public enum AdvertisementFilter {

    /// `true` when the advertisement's service UUIDs include one of the
    /// PowerWatch services.
    public static func isPowerWatch(serviceUUIDs: [String]) -> Bool {
        serviceUUIDs.contains { DiscoveredWatch.AdvertisedService(serviceUUID: $0) != nil }
    }

    /// Which PowerWatch service the advertisement carried (DTP preferred).
    public static func advertisedService(serviceUUIDs: [String]) -> DiscoveredWatch.AdvertisedService? {
        for uuid in serviceUUIDs {
            if let service = DiscoveredWatch.AdvertisedService(serviceUUID: uuid) {
                return service
            }
        }
        return nil
    }
}

/// T3.3 — the `CommunicationTechnology`/`CommunicationChannel` surface.
/// `CoreBluetoothTransport` implements this over CBCentralManager/CBPeripheral;
/// tests use `MockTransport`.
public protocol WatchTransportDelegate: AnyObject {
    func transportStateDidChange(_ transport: WatchTransport, state: TransportState)
    func transport(_ transport: WatchTransport, didDiscover watch: DiscoveredWatch)
    /// A DTP frame arrived on the RX characteristic (watch → phone data).
    func transport(_ transport: WatchTransport, didReceiveData data: [UInt8])
    /// A PWX event arrived on the event characteristic (watch → phone events).
    func transport(_ transport: WatchTransport, didReceiveEvent data: [UInt8])
    /// The channel is fully usable: connected, DTP characteristics discovered
    /// and notification subscriptions confirmed. Sync starts here, not at
    /// `.connected` — GATT discovery is async and a send before this point
    /// fails with notConnected (proven on-device 2026-09-17).
    /// Must be a protocol REQUIREMENT: a member declared only in the
    /// extension below is statically dispatched when called through the
    /// existential `delegate` — the conformer's override never runs
    /// (real-watch regression 2026-09-24: auto-sync silently never started).
    func transportDidBecomeReady(_ transport: WatchTransport)
    /// The raw value of the live-totals characteristic (`00002a25`) following a
    /// `readLiveData()`. Not a DTP frame — tag/value groups, see
    /// `LogParsers.parseLiveTotals`.
    func transport(_ transport: WatchTransport, didReceiveLiveData data: [UInt8])
}

extension WatchTransportDelegate {
    public func transportDidBecomeReady(_ transport: WatchTransport) {}
    public func transport(_ transport: WatchTransport, didReceiveLiveData data: [UInt8]) {}
}

public protocol WatchTransport: AnyObject {
    var delegate: WatchTransportDelegate? { get set }
    var state: TransportState { get }

    /// T3.1 — begin scanning for watch advertisements.
    func startScan()
    /// T3.4 — pair-mode scan: no service-UUID filter (the watch's pairing
    /// advertisement may carry no service UUIDs); discovered devices are
    /// identified by the manufacturer-data pairing code.
    func startPairScan()
    /// Stop scanning.
    func stopScan()

    /// T3.2 — connect to a discovered watch and subscribe to the RX
    /// characteristic's notifications.
    func connect(to id: UUID)
    func disconnect()

    /// T3.3 channel write — send a DTP payload to the watch (write to the
    /// TX characteristic with response).
    func send(_ data: [UInt8]) async throws

    /// Write to the event characteristic (…0013) — the DTP flow-control ACK
    /// channel (`DTPAck`). Android sends `ACK_MESSAGE` frames via
    /// `Gen2Protocol`'s `channel.sendEvent`; the watch stalls and then
    /// disconnects if frames are never ACKed. Fire-and-forget
    /// (write-without-response), so it is not `async`.
    func sendEvent(_ data: [UInt8])

    /// T3.5 — request high connection priority. See `CoreBluetoothTransport`
    /// for the iOS story.
    func requestHighPriority()

    /// Issue the GATT read that returns the watch's live totals
    /// (`00002a25`) — Android's `GEN2_SERIAL_REQUEST`. The answer comes back
    /// through `transport(_:didReceiveLiveData:)`, not as a return value.
    /// Must be a protocol REQUIREMENT so the conformer is actually called
    /// through the existential (see `transportDidBecomeReady`).
    func readLiveData()
}

extension WatchTransport {
    /// Transports without the serial characteristic (and every test double)
    /// simply never produce live samples.
    public func readLiveData() {}
}

/// Errors surfaced by the transport.
public enum TransportError: Error, Equatable {
    case notScanning
    case notConnected
    case characteristicMissing(String)
    case writeFailed(String)
    case bluetoothUnavailable(TransportState.UnavailableReason)
}
