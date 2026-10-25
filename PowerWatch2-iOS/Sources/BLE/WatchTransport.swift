import Foundation
import CoreBluetooth

// ============================================================================
// Watch transport
//
// Mirrors the layering in .../sdk:
//   CommunicatorImpl            -> per-uid message routing
//   DeviceCommunicationQueuerImpl -> single-threaded serial operation queue,
//                                    Blocker vs Discard operations
//   BLECommunicationChannel     -> write to RX, notify on TX, events on PWX_RX
//   BleStreamCommunicationChannel + ChannelStreamImpl -> frame reassembly
//   Gen2ExecutorImpl            -> command/ack/response state machine
// ============================================================================

struct DiscoveredWatch: Equatable, Identifiable {
    var id: String { identifier }
    var identifier: String
    var name: String
    var rssi: Int
    /// Pairing code read out of the advertisement's manufacturer data, i.e. the
    /// number the watch also shows as a QR code (`Gen2Advertisement`). nil means
    /// the advertisement carried no manufacturer data, which the APK encodes as
    /// `-1` and which therefore can never match a scanned code.
    var pairingCode: Int? = nil
    /// Protocol version byte from the same record; `ExecutorsFactory` picks the
    /// Ver3 executor for 3 and the Ver4 one otherwise.
    var protocolVersion: UInt8? = nil
    /// Raw manufacturer-specific data, kept for the pairing screen's diagnostics.
    var manufacturerData: [UInt8] = []
    /// CoreBluetooth's stable per-device identifier replaces the Android MAC
    /// address (`bluetoothAddress` in the Room `Device` table).
    var bluetoothAddress: String { identifier }
}

struct WatchDeviceInfo: Equatable {
    var firmware: String = ""
    var serialNumber: String = ""
    var modelNumber: String = ""
    /// Firmware version tuple parsed from the 8-byte firmware string.
    var firmwareVersionString: String { firmware }
}

enum TransportState: Equatable {
    case idle
    case poweringOn
    case unauthorized
    case unsupported
    case scanning
    case connecting
    case connected(WatchDeviceInfo)
    case disconnected(String?)
    case failed(String)
}

/// One command/response exchange.
///
/// `Gen2ExecutorImpl.sendSingleCommandWithAck` is
/// `zip(readWithAck, sendWithAck + controlListener).firstOrError()` with:
///   - 15 s ACK timeout
///   - 15 s response timeout
///   - 200 ms delay before writing our ACK
///   - control-package resend (`06 00 00 30`) re-triggers the ACK write
/// Why a scan produced what it produced. "No devices" has four completely
/// different causes on iOS — Bluetooth off, permission not granted, permission
/// never asked, or a working radio whose advertisements all failed the name
/// filter — and the user can only act on the right one. The Android build had
/// the same problem and solved it by simply scanning for 11.5 s and retrying
/// (`BluetoothScannerImpl.scan`'s `timeout(11500, MILLISECONDS).retryWhen`).
struct ScanReport: Equatable {
    var bluetoothState: String = "unknown"
    var authorization: String = "notDetermined"
    /// Advertisements CoreBluetooth reported before any filtering.
    var peripheralsSeen = 0
    /// Advertisements that passed the PowerWatch filter.
    var matched = 0
    /// Names of the loudest unfiltered neighbours, so a watch that is being
    /// rejected by the filter is visible instead of invisible.
    var samples: [String] = []
    var waitedForPower = false
    var hint = ""
}

protocol WatchTransport: AnyObject {
    var onState: ((TransportState) -> Void)? { get set }
    var onHeartRate: ((Int) -> Void)? { get set }
    /// Frames the watch pushes unsolicited (realtime notifications, HR stream).
    var onUnsolicitedFrame: (([UInt8]) -> Void)? { get set }

    var state: TransportState { get }
    var isConnected: Bool { get }

    func prepare()
    func scan(duration: TimeInterval) async -> [DiscoveredWatch]
    /// Diagnostics for the most recent `scan`. Defaults to an empty report; only
    /// the CoreBluetooth transport can populate it.
    var lastScanReport: ScanReport { get }
    func connect(_ watch: DiscoveredWatch) async throws

    /// Reconnect to a watch that is already paired, the counterpart of
    /// `Communicator.startConnection(listOf(device.bluetoothAddress))`, which
    /// `DeviceManagerImpl.startConnection()` calls as soon as the dashboard exists.
    /// Returns true only when the link is actually up; a false return does **not**
    /// mean the attempt was given up — the CoreBluetooth request stays pending, the
    /// same way Android's `establishConnection(autoConnect = true)` does.
    @discardableResult
    func startConnection(to identifier: String) async -> Bool

    /// `CommunicatorImpl.stopConnection()`: drop a pending connect request and the link.
    func stopConnection()

    /// `GEN2_SERIAL_REQUEST` → `channel.read(characteristicTypeMap[SERIAL])`, i.e. a GATT
    /// read of `2A25`. Not a DTP command: `Gen2ProtocolBasics.sendMessage` picks a
    /// characteristic by message type and reads it, and `RealtimeDataParser` decodes the
    /// result. This is the APK's realtime-data poll.
    func readRealtimePayload() async throws -> [UInt8]

    /// `GEN2_SETTINGS_REQUEST` → `channel.read(characteristicTypeMap[SETTINGS_INFO])`, a
    /// GATT read of `2A24` decoded by `SettingsDataParser`; the APK reads it on the same
    /// tick as the realtime payload (`Gen2RealtimeDataExecutor.readData`'s
    /// `readSettingsData`) and again from `SettingsDataProvider.loadSettingsFromWatch`.
    func readSettingsPayload() async throws -> [UInt8]

    func disconnect()

    /// Send a command and collect the data frames that belong to it.
    /// Returns the concatenated record body (header/CRC/opcode stripped),
    /// or an empty array for fire-and-forget commands.
    func perform(_ command: Gen2Command) async throws -> [UInt8]

    /// `Gen2DeviceInfoCommand` is not a framed command: it reads the standard
    /// Device Information characteristics 2a26 / 2a25 / 2a24.
    func readDeviceInfo() async throws -> WatchDeviceInfo

    func subscribeHeartRate() async throws
    func unsubscribeHeartRate() async
}

extension WatchTransport {
    var lastScanReport: ScanReport { ScanReport() }
}

/// Errors surfaced by any `WatchTransport`. The wording of the user-visible
/// strings is copied from the APK's `R.string` values so error text matches the
/// original app.
enum TransportError: LocalizedError {
    case released, notConnected, disconnected, connectionFailed, serviceNotFound, busy, deviceNotFound(String), characteristicMissing(String), readTimeout(String)

    var errorDescription: String? {
        switch self {
        case .released: return "Transport was released."
        case .notConnected: return "Your watch is not connected."
        case .disconnected: return "Your watch has been disconnected. Please check airplane mode on your watch and Bluetooth status on your phone"
        case .connectionFailed: return "Watch communication error"
        case .serviceNotFound: return "Watch communication error"
        case .busy: return "Watch is busy, please try later."
        case .deviceNotFound(let id): return "Watch \(id) is not available."
        case .characteristicMissing(let uuid): return "Watch characteristic \(uuid) is missing."
        case .readTimeout(let uuid): return "Reading \(uuid) from your watch timed out."
        }
    }
}

/// Serialises operations exactly like `DeviceCommunicationQueuerImpl`: one
/// operation in flight on a private serial queue, `Blocker` operations stop
/// `Discard` operations from being accepted at all.
final class OperationQueuer {
    enum OperationType { case blocker, delayer, discard }

    private struct Item {
        let type: OperationType
        let run: () async -> Void
    }

    private let queue = DispatchQueue(label: "com.matrixindustries.powerwatch2.operation-queue")
    private var pending: [Item] = []
    private var running = false
    private var blockerCount = 0
    private let lock = NSLock()

    func enqueue(type: OperationType, _ run: @escaping () async -> Void) {
        lock.lock()
        // `if (operationType == Discard && blockingOperationWaiting > 0) return complete()`
        if type == .discard && blockerCount > 0 {
            lock.unlock()
            return
        }
        if type == .blocker { blockerCount += 1 }
        pending.append(Item(type: type, run: run))
        let shouldStart = !running
        if shouldStart { running = true }
        lock.unlock()
        if shouldStart { drain() }
    }

    private func drain() {
        queue.async { [weak self] in
            guard let self else { return }
            self.lock.lock()
            guard !self.pending.isEmpty else {
                self.running = false
                self.lock.unlock()
                return
            }
            let item = self.pending.removeFirst()
            self.lock.unlock()

            Task {
                await item.run()
                self.finish(item)
                self.drain()
            }
        }
    }

    /// Kept synchronous so `NSLock` is never touched from an async context.
    private func finish(_ item: Item) {
        lock.lock()
        if item.type == .blocker { blockerCount = max(0, blockerCount - 1) }
        lock.unlock()
    }
}
