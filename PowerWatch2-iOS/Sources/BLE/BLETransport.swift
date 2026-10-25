import Foundation
import CoreBluetooth

/// CoreBluetooth central implementing the Gen2 DTP transport.
///
/// All GATT work happens on one serial queue (CoreBluetooth is handed that
/// queue at initialisation), which reproduces the single-threaded
/// `Executors.newSingleThreadExecutor()` used by `DeviceCommunicationQueuerImpl`.
/// All CoreBluetooth work is funnelled onto one private serial queue, hence
/// `@unchecked Sendable`; delegate callbacks arrive on that queue too.
final class BLETransport: NSObject, WatchTransport, @unchecked Sendable {
    var onState: ((TransportState) -> Void)?
    var onHeartRate: ((Int) -> Void)?
    var onUnsolicitedFrame: (([UInt8]) -> Void)?

    private(set) var state: TransportState = .idle

    private let queue = DispatchQueue(label: "com.matrixindustries.powerwatch2.ble")
    private var central: CBCentralManager!
    private var peripheral: CBPeripheral?
    private var characteristicTable: [CBUUID: CBCharacteristic] = [:]
    /// ACKs frames that arrive with no command in flight. Its accumulated body and
    /// `sawAck` are never read — only its ACK decision is used — so it is reset
    /// before every ingest.
    private lazy var unsolicitedCollector = Gen2ResponseCollector(onWriteAck: { [weak self] validCRC in
        self?.writeAck(validCRC: validCRC)
    })
    /// Counts `didDiscoverCharacteristicsFor` callbacks still owed by CoreBluetooth
    /// before the GATT setup is considered complete.
    private var pendingServiceEnumerations = 0

    private var scanResults: [String: DiscoveredWatch] = [:]
    private var scanContinuation: CheckedContinuation<[DiscoveredWatch], Never>?
    private var powerWaiters: [CheckedContinuation<Bool, Never>] = []
    private(set) var lastScanReport = ScanReport()
    private var sawAnyAdvertisements = 0
    private var scanSamples: [String] = []

    /// The pair code the user scanned or typed in, when they have one. Set before
    /// `scan(duration:)`; mirrors `Gen2PairingProgressViewModel`'s
    /// `foundDevicesChange().filter { it.pairingCode == Short.parseShort(code) }`,
    /// which makes the code from the watch's QR the acceptance criterion.
    var expectedPairingCode: Int?
    private var connectContinuation: CheckedContinuation<Void, Error>?
    private var deviceInfoContinuation: CheckedContinuation<WatchDeviceInfo, Error>?
    private var deviceInfoReadsRemaining: [CBUUID] = []
    private var deviceInfo = WatchDeviceInfo()
    private var subscribeContinuation: CheckedContinuation<Void, Error>?

    /// In-flight `readValue(for:)` calls, keyed by a token so the watchdog can cancel the
    /// right one (closures are not comparable).
    private struct PendingValueRead {
        let token: UInt64
        let uuid: CBUUID
        let completion: (Result<[UInt8], Error>) -> Void
    }
    private var pendingValueReads: [PendingValueRead] = []
    private var nextPendingReadToken: UInt64 = 1

    // Command state machine
    private struct InFlight {
        let opcode: String
        let expectsResponse: Bool
        let completion: (Result<[UInt8], Error>) -> Void
    }
    private var inFlight: InFlight?
    private var collector: Gen2ResponseCollector?
    private var watchdog: DispatchSourceTimer?

    // ChannelStreamImpl accumulation buffer
    private var rxBuffer: [UInt8] = []

    /// Ceiling on that buffer. A frame is at most `0xFFFF + 4` bytes, so anything
    /// larger is either a flood or a peripheral that announced a length it never
    /// delivers — both cases drop the buffer instead of growing it (H2).
    private static let maxReassemblyBytes = 256 * 1024
    /// A partial frame still incomplete after this window is abandoned. Without it one
    /// hostile `len` field desynchronises the rest of the session permanently, because
    /// every later notification would be parsed as the tail of that phantom frame.
    private static let reassemblyStall: TimeInterval = 5
    /// Scheduled on `queue`, which is also the CoreBluetooth delegate queue, so it
    /// touches `rxBuffer` without locking.
    private var rxStallTimer: DispatchWorkItem?

    private let commandIdleTimeout: TimeInterval = 15
    private let commandHardTimeout: TimeInterval = 180

    override init() {
        super.init()
        central = CBCentralManager(delegate: self, queue: queue,
                                   options: [CBCentralManagerOptionShowPowerAlertKey: true])
    }

    var isConnected: Bool { peripheral?.state == .connected }

    func prepare() {
        queue.async { [weak self] in
            guard let self else { return }
            switch self.central.state {
            case .poweredOn: break
            case .unauthorized: self.publish(.unauthorized)
            case .unsupported: self.publish(.unsupported)
            case .poweredOff: self.publish(.failed("Bluetooth is off on this iPhone. Turn it on and try again."))
            default: self.publish(.poweringOn)
            }
        }
    }

    // MARK: - Discovery

    /// Waits until CoreBluetooth reports `.poweredOn`. Without this, a scan
    /// started while the "Would Like to Use Bluetooth" dialog is still on screen
    /// saw `.unknown`, returned immediately and the pairing screen said "no
    /// PowerWatch found" even though the radio had never been switched on.
    /// Returns false when the radio can never come up.
    private func waitForPoweredOn(timeout: TimeInterval) async -> Bool {
        await withCheckedContinuation { (continuation: CheckedContinuation<Bool, Never>) in
            queue.async { [weak self] in
                guard let self else { continuation.resume(returning: false); return }
                switch self.central.state {
                case .poweredOn:
                    continuation.resume(returning: true)
                case .unsupported, .unauthorized:
                    continuation.resume(returning: false)
                default:
                    self.powerWaiters.append(continuation)
                    self.queue.asyncAfter(deadline: .now() + timeout) { [weak self] in
                        self?.resumePowerWaiters()
                    }
                }
            }
        }
    }

    private func resumePowerWaiters() {
        guard !powerWaiters.isEmpty else { return }
        let cameUp = central.state == .poweredOn
        for waiter in powerWaiters { waiter.resume(returning: cameUp) }
        powerWaiters.removeAll()
    }

    func scan(duration: TimeInterval) async -> [DiscoveredWatch] {
        let waited = await waitForPoweredOn(timeout: 10)
        return await withCheckedContinuation { continuation in
            queue.async { [weak self] in
                guard let self else { continuation.resume(returning: []); return }
                guard self.central.state == .poweredOn else {
                    self.lastScanReport = ScanReport(
                        bluetoothState: Self.describe(self.central.state),
                        authorization: Self.describe(CBManager.authorization),
                        waitedForPower: !waited,
                        hint: Self.radioHint(for: self.central.state)
                    )
                    NSLog("pw2-ble scan aborted: state=%@ authorization=%@",
                          self.lastScanReport.bluetoothState,
                          self.lastScanReport.authorization)
                    continuation.resume(returning: []); return
                }
                self.scanResults = [:]
                self.sawAnyAdvertisements = 0
                self.scanSamples = []
                self.scanContinuation = continuation
                // No service-UUID scan filter: the Android app scans by name
                // (`isPowerWatchDevice`) and lets discoverServices() pick the
                // protocol, so we do the same.
                self.central.scanForPeripherals(
                    withServices: nil,
                    options: [CBCentralManagerScanOptionAllowDuplicatesKey: false]
                )
                self.queue.asyncAfter(deadline: .now() + duration) { [weak self] in
                    self?.stopScan()
                }
            }
        }
    }

    private func stopScan() {
        if central.isScanning { central.stopScan() }
        guard let cont = scanContinuation else { return }
        scanContinuation = nil
        let found = Array(scanResults.values).sorted { $0.name < $1.name }
        lastScanReport = ScanReport(
            bluetoothState: Self.describe(central.state),
            authorization: Self.describe(CBManager.authorization),
            peripheralsSeen: sawAnyAdvertisements,
            matched: found.count,
            samples: Array(scanSamples.prefix(6))
        )
        NSLog("pw2-ble scan done: saw=%d matched=%d state=%@ authorization=%@ samples=%@",
              sawAnyAdvertisements, found.count, lastScanReport.bluetoothState,
              lastScanReport.authorization,
              scanSamples.prefix(6).joined(separator: " | "))
        cont.resume(returning: found)
    }

    private static func describe(_ state: CBManagerState) -> String {
        switch state {
        case .poweredOn: return "poweredOn"
        case .poweredOff: return "poweredOff"
        case .unauthorized: return "unauthorized"
        case .unsupported: return "unsupported"
        case .unknown: return "unknown"
        case .resetting: return "resetting"
        @unknown default: return "unknown(\(state.rawValue))"
        }
    }

    private static func describe(_ authorization: CBManagerAuthorization) -> String {
        switch authorization {
        case .allowedAlways: return "allowedAlways"
        case .denied: return "denied"
        case .restricted: return "restricted"
        case .notDetermined: return "notDetermined"
        @unknown default: return "unknown"
        }
    }

    private static func radioHint(for state: CBManagerState) -> String {
        switch state {
        case .poweredOff: return "Bluetooth is off on this iPhone."
        case .unauthorized: return "PowerWatch2 is not allowed to use Bluetooth (Settings ▸ Privacy & Security ▸ Bluetooth)."
        case .unsupported: return "This iPhone cannot use Bluetooth Low Energy."
        case .unknown, .resetting: return "Bluetooth is still starting up — scan again in a moment."
        default: return ""
        }
    }

    // MARK: - Connect

    func connect(_ watch: DiscoveredWatch) async throws {
        NSLog("pw2-ble connect: %@ (%@)", watch.name, watch.identifier)
        try await withCheckedThrowingContinuation { (continuation: CheckedContinuation<Void, Error>) in
            queue.async { [weak self] in
                guard let self else { return continuation.resume(throwing: TransportError.released) }
                self.publish(.connecting)
                let cb = CBPeripheralsRegistry.peripheral(for: watch.identifier)
                    ?? self.central.retrievePeripherals(withIdentifiers: [UUID(uuidString: watch.identifier) ?? UUID()]).first
                guard let target = cb else {
                    NSLog("pw2-ble connect: no CBPeripheral for %@", watch.identifier)
                    continuation.resume(throwing: TransportError.deviceNotFound(watch.identifier)); return
                }
                self.peripheral = target
                self.connectContinuation = continuation
                self.pendingServiceEnumerations = 0
                self.characteristicTable.removeAll()
                target.delegate = self
                self.central.connect(target, options: nil)
            }
        }
    }

    func disconnect() {
        queue.async { [weak self] in
            guard let self, let p = self.peripheral else { return }
            self.central.cancelPeripheralConnection(p)
        }
    }

    // MARK: - Reconnecting to the paired watch
    //
    // `MainDashboardViewModel`'s constructor calls `deviceManager.init()`, which
    // subscribes to the Bluetooth state; every time the radio reports Enabled,
    // `DeviceManagerImpl.startConnection()` reads the stored device out of Room and,
    // unless `communicator.connectedDevices()` is already non-empty, hands its address
    // to `Communicator.startConnection(listOf(device.bluetoothAddress))`. That is the
    // whole of the APK's "the app connects on its own" behaviour — there is no Connect
    // button anywhere in it. The Android side then waits inside
    // `BleConnectionWithRetryOperation`, i.e. `establishConnection(autoConnect = true)`
    // (`ConnectionPreference.isAutoConnectEnabled`, default true), so the request stays
    // pending and completes whenever the watch next advertises. `CBCentralManager
    // .connect(_:options:)` has exactly that property, so the request is left pending
    // here as well; only the case where CoreBluetooth has no handle for the peripheral
    // needs a scan first — and the watch only advertises while it sits on
    // Settings ▸ Show QR, which is why the scan is not assumed to succeed.

    private var autoConnectContinuation: CheckedContinuation<Bool, Never>?
    private var autoConnectDeadline: DispatchWorkItem?

    @discardableResult
    func startConnection(to identifier: String) async -> Bool {
        await startConnection(to: identifier, scanTimeout: 8, connectTimeout: 12)
    }

    @discardableResult
    func startConnection(to identifier: String, scanTimeout: TimeInterval,
                         connectTimeout: TimeInterval) async -> Bool {
        guard await waitForPoweredOn(timeout: 10) else {
            NSLog("pw2-ble startConnection: the radio never came up")
            return false
        }
        guard let uuid = UUID(uuidString: identifier) else {
            NSLog("pw2-ble startConnection: %@ is not a peripheral identifier", identifier)
            return false
        }
        // `communicator.connectedDevices().firstOrNull() != null -> return`
        if peripheral?.identifier == uuid, peripheral?.state == .connected {
            NSLog("pw2-ble startConnection: already connected to %@", identifier)
            return true
        }

        var target = CBPeripheralsRegistry.peripheral(for: identifier)
        if target == nil { target = await knownPeripheral(uuid) }
        if target == nil {
            _ = await scan(duration: scanTimeout)
            target = CBPeripheralsRegistry.peripheral(for: identifier)
            if target == nil { target = await knownPeripheral(uuid) }
        }
        guard let target else {
            NSLog("pw2-ble startConnection: no handle for %@ and nothing matched a %ds scan",
                  identifier, Int(scanTimeout))
            return false
        }

        return await withCheckedContinuation { (continuation: CheckedContinuation<Bool, Never>) in
            queue.async { [weak self] in
                guard let self else { continuation.resume(returning: false); return }
                if self.peripheral?.identifier == target.identifier, self.peripheral?.state == .connected {
                    continuation.resume(returning: true); return
                }
                self.peripheral = target
                target.delegate = self
                self.pendingServiceEnumerations = 0
                self.characteristicTable.removeAll()
                self.autoConnectContinuation = continuation
                self.publish(.connecting)
                NSLog("pw2-ble startConnection: connecting to %@ (request stays pending)",
                      target.identifier.uuidString)
                self.central.connect(target, options: nil)
                // Report back without cancelling: the request survives and `didConnect`
                // still fires when the watch starts advertising.
                let deadline = DispatchWorkItem { [weak self] in
                    guard let self, self.autoConnectContinuation != nil else { return }
                    self.autoConnectContinuation = nil
                    continuation.resume(returning: self.peripheral?.state == .connected)
                }
                self.autoConnectDeadline = deadline
                self.queue.asyncAfter(deadline: .now() + connectTimeout, execute: deadline)
            }
        }
    }

    func stopConnection() {
        queue.async { [weak self] in
            guard let self else { return }
            self.autoConnectDeadline?.cancel()
            self.autoConnectDeadline = nil
            if let continuation = self.autoConnectContinuation {
                self.autoConnectContinuation = nil
                continuation.resume(returning: false)
            }
            if let p = self.peripheral { self.central.cancelPeripheralConnection(p) }
        }
    }

    /// CoreBluetooth's cache of peripherals it has seen for this app before. Nothing
    /// is persisted by us: `retrievePeripherals(withIdentifiers:)` only answers for a
    /// watch this install has already discovered, and it has to be called on the
    /// central's queue.
    private func knownPeripheral(_ identifier: UUID) async -> CBPeripheral? {
        await withCheckedContinuation { (continuation: CheckedContinuation<CBPeripheral?, Never>) in
            queue.async {
                continuation.resume(returning: self.central.retrievePeripherals(withIdentifiers: [identifier]).first)
            }
        }
    }

    // MARK: - Commands

    func perform(_ command: Gen2Command) async throws -> [UInt8] {
        try await withCheckedThrowingContinuation { (continuation: CheckedContinuation<[UInt8], Error>) in
            queue.async { [weak self] in
                guard let self else { return continuation.resume(throwing: TransportError.released) }
                guard let peripheral = self.peripheral, peripheral.state == .connected else {
                    continuation.resume(throwing: TransportError.notConnected); return
                }
                guard let writeChar = self.characteristicTable[PWUUID.dtpWrite] else {
                    continuation.resume(throwing: TransportError.characteristicMissing(PWUUID.dtpWrite.uuidString)); return
                }
                guard self.inFlight == nil else {
                    continuation.resume(throwing: TransportError.busy); return
                }

                self.rxBuffer.removeAll()
                self.collector = Gen2ResponseCollector { [weak self] validCRC in
                    self?.writeAck(validCRC: validCRC)
                }
                let context = InFlight(
                    opcode: command.opcode,
                    expectsResponse: command.expectsResponse,
                    completion: { result in continuation.resume(with: result) }
                )
                self.inFlight = context
                self.startWatchdog(hardTimeout: max(command.timeoutSeconds, self.commandHardTimeout))
                NSLog("pw2-ble tx opcode %@ (%d bytes, expectsResponse=%d)",
                      command.opcode, command.frame.count, command.expectsResponse ? 1 : 0)
                self.write(command.frame, to: writeChar)
            }
        }
    }

    private func write(_ data: [UInt8], to characteristic: CBCharacteristic) {
        guard let peripheral else { return }
        let type: CBCharacteristicWriteType =
            characteristic.properties.contains(.write) ? .withResponse : .withoutResponse
        peripheral.writeValue(Data(data), for: characteristic, type: type)
    }

    /// `writeAck` in `Gen2ExecutorImpl`: after a 200 ms delay the phone writes
    /// `AckGood` or `AckCRCInvalid` to the PWX event characteristic.
    private func writeAck(validCRC: Bool) {
        guard let eventChar = characteristicTable[PWUUID.dtpEventWrite] else {
            NSLog("pw2-ble ack skipped: PWX event characteristic %@ absent", PWUUID.dtpEventWrite.uuidString)
            return
        }
        queue.asyncAfter(deadline: .now() + 0.2) { [weak self] in
            guard let self else { return }
            self.write(validCRC ? Gen2Framing.ackGood : Gen2Framing.ackCRCInvalid, to: eventChar)
        }
    }

    private static func hex(_ bytes: [UInt8], limit: Int = 48) -> String {
        let shown = bytes.prefix(limit).map { String(format: "%02x", $0) }.joined()
        return bytes.count > limit ? shown + "…" : shown
    }

    private func startWatchdog(hardTimeout: TimeInterval) {
        watchdog?.cancel()
        let timer = DispatchSource.makeTimerSource(queue: queue)
        timer.schedule(deadline: .now() + hardTimeout)
        timer.setEventHandler { [weak self] in
            self?.failInFlight(Gen2ProtocolError.responseTimeout)
        }
        timer.resume()
        watchdog = timer
    }

    private func failInFlight(_ error: Error) {
        watchdog?.cancel()
        watchdog = nil
        guard let context = inFlight else { return }
        inFlight = nil
        NSLog("pw2-ble command %@ failed: %@", context.opcode, error.localizedDescription)
        context.completion(.failure(error))
    }

    private func completeInFlight(_ body: [UInt8]) {
        watchdog?.cancel()
        watchdog = nil
        guard let context = inFlight else { return }
        inFlight = nil
        context.completion(.success(body))
    }

    /// `ChannelStreamImpl`: a notification may contain a partial frame, a full
    /// frame, or several frames. Frame total length is the LE u16 at [0] + 4.
    private func consumeNotification(_ data: [UInt8]) {
        // Gen1 text frames are rejected outright by `isDataValid`.
        if String(data: Data(rxBuffer + data), encoding: .utf8)?.hasPrefix("#QI:Notification") == true {
            rxBuffer.removeAll()
            rxStallTimer?.cancel()
            rxStallTimer = nil
            return
        }
        rxBuffer.append(contentsOf: data)
        if rxBuffer.count > Self.maxReassemblyBytes {
            NSLog("pw2-ble rx buffer passed %d bytes: dropping %d undecodable bytes",
                  Self.maxReassemblyBytes, rxBuffer.count)
            rxBuffer.removeAll()
            rxStallTimer?.cancel()
            rxStallTimer = nil
            return
        }

        while true {
            guard rxBuffer.count > 2 else {
                rxStallTimer?.cancel()
                rxStallTimer = nil
                return
            }
            let declared = Int(UInt16(rxBuffer[0]) | (UInt16(rxBuffer[1]) << 8))
            // extractHeaderSize rejects the 0x9242 sentinel.
            if declared >= 37442 { rxBuffer.removeAll(); return }
            let total = declared + Gen2Framing.headerSize
            guard total > 0, rxBuffer.count >= total else {
                // Half a frame: keep it, but not forever — see `reassemblyStall`.
                if rxStallTimer == nil {
                    let work = DispatchWorkItem { [weak self] in
                        guard let self, !self.rxBuffer.isEmpty else { return }
                        NSLog("pw2-ble rx buffer stalled at %d bytes: resynchronising", self.rxBuffer.count)
                        self.rxBuffer.removeAll()
                    }
                    rxStallTimer = work
                    queue.asyncAfter(deadline: .now() + Self.reassemblyStall, execute: work)
                }
                return
            }
            let frame = Array(rxBuffer[..<total])
            rxBuffer.removeFirst(total)
            handleFrame(frame)
        }
    }

    private func handleFrame(_ frame: [UInt8]) {
        guard let context = inFlight, let collector else {
            NSLog("pw2-ble unsolicited frame: %@", Self.hex(frame))
            // The watch retransmits any frame it has not heard an ACK for and drops
            // the link about 10 s later (`didDisconnect: The specified device has
            // disconnected from us`, observed on real hardware after pairing: the
            // `E200` completion frame for `9010` arrived, was not ACKed because no
            // command was in flight any more, and arrived again 10 s later). ACK
            // everything we accept, in-flight or not; the same rules as the
            // collector decide Good vs. CRC-invalid.
            unsolicitedCollector.reset()
            _ = unsolicitedCollector.ingest(frame)
            onUnsolicitedFrame?(frame)
            return
        }
        switch collector.ingest(frame) {
        case .ignored, .controlResend:
            break
        case .watchAckReceived:
            NSLog("pw2-ble rx ack for %@", context.opcode)
            // Fire-and-forget commands are done once the watch acknowledges.
            if !context.expectsResponse { completeInFlight([]) }
        case .complete(let body):
            NSLog("pw2-ble rx complete %@ body=%@", context.opcode, Self.hex(body))
            completeInFlight(body)
        case .failed(let error):
            NSLog("pw2-ble frame rejected for %@: %@", context.opcode, error.localizedDescription)
            failInFlight(error)
        }
    }

    // MARK: - Device info & heart rate

    func readDeviceInfo() async throws -> WatchDeviceInfo {
        try await withCheckedThrowingContinuation { (continuation: CheckedContinuation<WatchDeviceInfo, Error>) in
            queue.async { [weak self] in
                guard let self, let peripheral = self.peripheral, peripheral.state == .connected else {
                    continuation.resume(throwing: TransportError.notConnected); return
                }
                self.deviceInfo = WatchDeviceInfo()
                self.deviceInfoReadsRemaining = [PWUUID.firmwareRevision, PWUUID.serialNumber, PWUUID.modelNumber]
                self.deviceInfoContinuation = continuation
                self.readNextDeviceInfoCharacteristic()
            }
        }
    }

    private func readNextDeviceInfoCharacteristic() {
        guard !deviceInfoReadsRemaining.isEmpty else {
            let info = deviceInfo
            deviceInfoContinuation?.resume(returning: info)
            deviceInfoContinuation = nil
            return
        }
        guard let peripheral,
              let characteristic = characteristicTable[deviceInfoReadsRemaining[0]] else {
            deviceInfoReadsRemaining.removeFirst()
            readNextDeviceInfoCharacteristic()
            return
        }
        peripheral.readValue(for: characteristic)
    }

    // MARK: - Realtime & settings reads (`Gen2ProtocolBasics`)

    func readRealtimePayload() async throws -> [UInt8] {
        try await readValue(for: PWUUID.realtimeInfo)
    }

    func readSettingsPayload() async throws -> [UInt8] {
        try await readValue(for: PWUUID.settingsInfo)
    }

    /// `Gen2ProtocolBasics.sendMessage`'s other branch: the message type selects a
    /// characteristic from `characteristicTypeMap` and the payload comes back from
    /// `channel.read(it)`, so these two "commands" are GATT reads with nothing written
    /// first. The deadline mirrors `SettingsDataProvider.loadSettingsFromWatch`, which puts
    /// `.timeout(10, TimeUnit.SECONDS)` on the read's observable.
    private func readValue(for uuid: CBUUID, timeout: TimeInterval = 10) async throws -> [UInt8] {
        try await withCheckedThrowingContinuation { (continuation: CheckedContinuation<[UInt8], Error>) in
            queue.async { [weak self] in
                guard let self, let peripheral = self.peripheral, peripheral.state == .connected else {
                    continuation.resume(throwing: TransportError.notConnected); return
                }
                guard let characteristic = self.characteristicTable[uuid] else {
                    continuation.resume(throwing: TransportError.characteristicMissing(uuid.uuidString)); return
                }
                let token = self.nextPendingReadToken
                self.nextPendingReadToken += 1
                self.pendingValueReads.append(
                    PendingValueRead(token: token, uuid: uuid) { continuation.resume(with: $0) }
                )
                self.queue.asyncAfter(deadline: .now() + timeout) { [weak self] in
                    guard let self,
                          let index = self.pendingValueReads.firstIndex(where: { $0.token == token }) else { return }
                    NSLog("pw2-ble read of %@ timed out after %.0fs", uuid.uuidString, timeout)
                    let stale = self.pendingValueReads.remove(at: index)
                    stale.completion(.failure(TransportError.readTimeout(uuid.uuidString)))
                }
                peripheral.readValue(for: characteristic)
            }
        }
    }

    /// Completes the oldest waiting read for this characteristic, if any.
    private func completePendingValueRead(uuid: CBUUID, bytes: [UInt8]) {
        guard let index = pendingValueReads.firstIndex(where: { $0.uuid == uuid }) else { return }
        pendingValueReads.remove(at: index).completion(.success(bytes))
    }

    private func failPendingValueReads(_ error: Error) {
        guard !pendingValueReads.isEmpty else { return }
        let reads = pendingValueReads
        pendingValueReads.removeAll()
        reads.forEach { $0.completion(.failure(error)) }
    }

    func subscribeHeartRate() async throws {
        try await withCheckedThrowingContinuation { (continuation: CheckedContinuation<Void, Error>) in
            queue.async { [weak self] in
                guard let self, let peripheral = self.peripheral, peripheral.state == .connected else {
                    continuation.resume(throwing: TransportError.notConnected); return
                }
                guard let characteristic = self.characteristicTable[PWUUID.heartRateMeasurement] else {
                    continuation.resume(throwing: TransportError.characteristicMissing("2A37")); return
                }
                self.subscribeContinuation = continuation
                peripheral.setNotifyValue(true, for: characteristic)
            }
        }
    }

    func unsubscribeHeartRate() async {
        await withCheckedContinuation { (continuation: CheckedContinuation<Void, Never>) in
            queue.async { [weak self] in
                guard let self, let peripheral = self.peripheral,
                      let characteristic = self.characteristicTable[PWUUID.heartRateMeasurement] else {
                    continuation.resume(); return
                }
                peripheral.setNotifyValue(false, for: characteristic)
                continuation.resume()
            }
        }
    }

    private func publish(_ newState: TransportState) {
        state = newState
        onState?(newState)
    }
}

// MARK: - CBCentralManagerDelegate

extension BLETransport: CBCentralManagerDelegate {
    func centralManagerDidUpdateState(_ central: CBCentralManager) {
        NSLog("pw2-ble central state: %@ (authorization %@)",
              Self.describe(central.state), Self.describe(CBManager.authorization))
        resumePowerWaiters()
        switch central.state {
        case .poweredOn: publish(.idle)
        case .unauthorized: publish(.unauthorized)
        case .unsupported: publish(.unsupported)
        case .poweredOff: publish(.failed("Bluetooth is off on this iPhone. Turn it on and try again."))
        default: publish(.poweringOn)
        }
    }

    func centralManager(_ central: CBCentralManager, didDiscover peripheral: CBPeripheral,
                        advertisementData: [String: Any], rssi RSSI: NSNumber) {
        let advertisedName = advertisementData[CBAdvertisementDataLocalNameKey] as? String
        let name = peripheral.name ?? advertisedName
        let serviceUUIDs = (advertisementData[CBAdvertisementDataServiceUUIDsKey] as? [CBUUID]) ?? []

        sawAnyAdvertisements += 1
        let advertising = Gen2Advertisement(manufacturerData: advertisementData[CBAdvertisementDataManufacturerDataKey] as? Data)
        let byName = PWUUID.isPowerWatchName(name)
        let byService = PWUUID.isPowerWatchService(serviceUUIDs)
        // The APK's pairing screen accepts a device only when the advertisement's
        // pairing code equals the number scanned from the watch's QR code, so a
        // code we already have is a better identity signal than a broadcast name:
        // it also finds a watch that puts its name in GATT instead of the
        // advertisement, where CoreBluetooth reports `peripheral.name` as nil.
        let byPairCode = expectedPairingCode.map { advertising.pairingCode == $0 } ?? false
        let accepted = byName || byService || byPairCode
        let label = name ?? advertisedName ?? (advertising.hasManufacturerData
            ? "code \(advertising.pairingCode)" : "(no name)")
        if accepted || advertising.hasManufacturerData || scanSamples.count < 12 {
            let services = serviceUUIDs.map(\.uuidString).joined(separator: ",")
            NSLog("pw2-ble advert: name=%@ advertised=%@ services=%@ mfg=%@ code=%d pv=%d rssi=%d accepted=%d",
                  name ?? "-", advertisedName ?? "-", services.isEmpty ? "-" : services,
                  advertising.raw.map { String(format: "%02x", $0) }.joined(),
                  advertising.pairingCode, Int(advertising.protocolVersion),
                  RSSI.intValue, accepted ? 1 : 0)
        }
        guard accepted else {
            if scanSamples.count < 12, !scanSamples.contains(label) { scanSamples.append(label) }
            return
        }
        scanResults[peripheral.identifier.uuidString] = DiscoveredWatch(
            identifier: peripheral.identifier.uuidString,
            name: name ?? "Powerwatch",   // `BleScanningTechnology`'s own fallback
            rssi: RSSI.intValue,
            pairingCode: advertising.hasManufacturerData ? advertising.pairingCode : nil,
            protocolVersion: advertising.hasManufacturerData ? advertising.protocolVersion : nil,
            manufacturerData: advertising.raw
        )
        CBPeripheralsRegistry.remember(peripheral)
    }

    func centralManager(_ central: CBCentralManager, didConnect peripheral: CBPeripheral) {
        NSLog("pw2-ble didConnect %@ → discovering services", peripheral.identifier.uuidString)
        autoConnectDeadline?.cancel()
        autoConnectDeadline = nil
        if let continuation = autoConnectContinuation {
            autoConnectContinuation = nil
            continuation.resume(returning: true)
        }
        peripheral.discoverServices([
            PWUUID.dtpService, PWUUID.otaService,
            PWUUID.deviceInfoService, PWUUID.heartRateService
        ])
    }

    func centralManager(_ central: CBCentralManager, didFailToConnect peripheral: CBPeripheral, error: Error?) {
        NSLog("pw2-ble didFailToConnect: %@", error?.localizedDescription ?? "no error")
        autoConnectDeadline?.cancel()
        autoConnectDeadline = nil
        if let continuation = autoConnectContinuation {
            autoConnectContinuation = nil
            continuation.resume(returning: false)
        }
        let cont = connectContinuation
        connectContinuation = nil
        cont?.resume(throwing: error ?? TransportError.connectionFailed)
    }

    func centralManager(_ central: CBCentralManager, didDisconnectPeripheral peripheral: CBPeripheral, error: Error?) {
        NSLog("pw2-ble didDisconnect: %@", error?.localizedDescription ?? "clean")
        characteristicTable.removeAll()
        pendingServiceEnumerations = 0
        rxBuffer.removeAll()
        if let context = inFlight {
            inFlight = nil
            watchdog?.cancel()
            watchdog = nil
            context.completion(.failure(TransportError.disconnected))
        }
        failPendingValueReads(TransportError.disconnected)
        publish(.disconnected(error?.localizedDescription))
        let cont = connectContinuation
        connectContinuation = nil
        cont?.resume(throwing: error ?? TransportError.disconnected)
    }
}

// MARK: - CBPeripheralDelegate

extension BLETransport: CBPeripheralDelegate {
    func peripheral(_ peripheral: CBPeripheral, didDiscoverServices error: Error?) {
        if let error {
            NSLog("pw2-ble discoverServices failed: %@", error.localizedDescription)
            failConnect(error)
            return
        }
        guard let services = peripheral.services, !services.isEmpty else {
            NSLog("pw2-ble discoverServices returned no services")
            failConnect(TransportError.serviceNotFound)
            return
        }
        // Characteristics are *not* populated here: they arrive one callback per
        // service in `didDiscoverCharacteristicsFor`, so the connect continuation
        // has to wait for that countdown. Reading `service.characteristics` at this
        // point yields nil on a first connect, which previously made every real
        // pairing fail with "service not found".
        NSLog("pw2-ble services: %@ — enumerating characteristics",
              services.map { $0.uuid.uuidString }.joined(separator: ","))
        pendingServiceEnumerations = services.count
        for service in services {
            peripheral.discoverCharacteristics(nil, for: service)
        }
    }

    func peripheral(_ peripheral: CBPeripheral, didDiscoverCharacteristicsFor service: CBService, error: Error?) {
        if let error {
            NSLog("pw2-ble discoverCharacteristics(%@) failed: %@", service.uuid.uuidString, error.localizedDescription)
        }
        for characteristic in service.characteristics ?? [] {
            characteristicTable[characteristic.uuid] = characteristic
        }
        // Subscribe to everything we will need in one pass — but only to
        // characteristics that can actually notify: the PWX event characteristic is
        // write-only and `setNotifyValue` on it is an error.
        let wanted: [CBUUID] = [PWUUID.dtpNotify, PWUUID.dtpEventWrite, PWUUID.heartRateMeasurement]
        for characteristic in service.characteristics ?? [] where wanted.contains(characteristic.uuid) {
            if characteristic.properties.contains(.notify) || characteristic.properties.contains(.indicate) {
                peripheral.setNotifyValue(true, for: characteristic)
            }
        }
        NSLog("pw2-ble characteristics of %@: %@", service.uuid.uuidString,
              (service.characteristics ?? []).map { $0.uuid.uuidString }.joined(separator: ","))
        pendingServiceEnumerations = max(0, pendingServiceEnumerations - 1)
        if pendingServiceEnumerations == 0 { finishServiceDiscovery(peripheral) }
    }

    /// `ProtocolCreatorImpl` picks the protocol purely from the discovered
    /// service/characteristic set, so the DTP notify characteristic is the gate.
    private func finishServiceDiscovery(_ peripheral: CBPeripheral) {
        guard characteristicTable[PWUUID.dtpNotify] != nil else {
            NSLog("pw2-ble missing DTP notify %@ — have %@", PWUUID.dtpNotify.uuidString,
                  characteristicTable.keys.map(\.uuidString).sorted().joined(separator: ","))
            failConnect(TransportError.serviceNotFound)
            return
        }
        NSLog("pw2-ble connected and ready (%d characteristics)", characteristicTable.count)
        let cont = connectContinuation
        connectContinuation = nil
        cont?.resume(returning: ())
        // Device info is read opportunistically; `readDeviceInfo()` re-reads on demand.
        for uuid in [PWUUID.firmwareRevision, PWUUID.serialNumber, PWUUID.modelNumber] {
            if let c = characteristicTable[uuid] { peripheral.readValue(for: c) }
        }
    }

    private func failConnect(_ error: Error) {
        let cont = connectContinuation
        connectContinuation = nil
        cont?.resume(throwing: error)
    }

    func peripheral(_ peripheral: CBPeripheral, didUpdateValueFor characteristic: CBCharacteristic, error: Error?) {
        guard let value = characteristic.value else { return }
        if let error {
            NSLog("pw2-ble read/notify error on %@: %@", characteristic.uuid.uuidString, error.localizedDescription)
            return
        }
        let bytes = [UInt8](value)

        // Reads issued by `readValue(for:)` are answered here; the device-info and DTP
        // branches below still run so a read that happens to coincide with connect-time
        // enumeration is not lost.
        completePendingValueRead(uuid: characteristic.uuid, bytes: bytes)

        if characteristic.uuid == PWUUID.heartRateMeasurement {
            if let bpm = HeartRateParser.parse(bytes) { onHeartRate?(bpm) }
            return
        }
        if characteristic.uuid == PWUUID.realtimeInfo {
            // The APK's own `println` for this payload; kept so the console shows what the
            // realtime poll is reading back.
            let data = Gen2InfoRecords.parseRealtime(bytes)
            NSLog("pw2-ble realtime %@ (%d bytes): steps=%d active=%d sleep=%d dist=%.0f thermal=%d solar=%d skin=%@ battery=%d",
                  characteristic.uuid.uuidString, bytes.count, data.totalSteps,
                  data.totalActiveCalories, data.totalSleepMinutes, data.totalDistanceKilometres,
                  data.totalThermalPower, data.totalSolarPower,
                  data.skinTemp.map(String.init) ?? "-",
                  Int(data.batteryPercent ?? -1))
        }
        if characteristic.uuid == PWUUID.settingsInfo {
            let data = Gen2InfoRecords.parseSettings(bytes)
            NSLog("pw2-ble settings %@ (%d bytes): clock=%d units=%d lang=%d tz=%d gender=%d age=%d weight=%d height=%d steps=%d dist=%d kcal=%d sleep=%d",
                  characteristic.uuid.uuidString, bytes.count, data.clockFormatSelection,
                  data.unitSelection, data.languageSelection, data.timeZone, data.gender, data.age,
                  data.weight, data.height, data.stepGoal, data.distanceGoal,
                  data.caloriesGoal, data.sleepGoal)
        }
        if [PWUUID.firmwareRevision, PWUUID.serialNumber, PWUUID.modelNumber].contains(characteristic.uuid) {
            NSLog("pw2-ble device info %@ = %@", characteristic.uuid.uuidString,
                  String(bytes: bytes.filter { $0 != 0 }, encoding: .ascii) ?? Self.hex(bytes))
            applyDeviceInfo(uuid: characteristic.uuid, value: bytes)
            return
        }
        NSLog("pw2-ble rx %@ (%d bytes): %@", characteristic.uuid.uuidString, bytes.count, Self.hex(bytes))
        consumeNotification(bytes)
    }

    func peripheral(_ peripheral: CBPeripheral, didUpdateNotificationStateFor characteristic: CBCharacteristic, error: Error?) {
        guard characteristic.uuid == PWUUID.heartRateMeasurement, let cont = subscribeContinuation else { return }
        subscribeContinuation = nil
        if let error { cont.resume(throwing: error) } else { cont.resume(returning: ()) }
    }

    /// `Gen2DataFormatter.extractFirmwareInfo`: ASCII, NUL-stripped. Short
    /// buffers are tolerated.
    ///
    /// The real watch pads these string characteristics with a binary block
    /// (`2A26` = `56 32 2e 38 2e 34 72 32` = `"V2.8.4r2"` followed by
    /// `02 04 04 00 …`; `2A25` and `2A24` are *entirely* binary records), so the
    /// value is the printable prefix only, and a field with no printable prefix is
    /// left unset instead of being filled with mojibake.
    private func applyDeviceInfo(uuid: CBUUID, value: [UInt8]) {
        var bytes: [UInt8] = []
        for byte in value {
            if byte == 0 { continue }
            guard byte >= 0x20, byte <= 0x7E else { break }
            bytes.append(byte)
        }
        let text = String(bytes: bytes, encoding: .ascii)?
            .trimmingCharacters(in: .whitespacesAndNewlines) ?? ""
        switch uuid {
        case PWUUID.firmwareRevision: deviceInfo.firmware = text
        case PWUUID.serialNumber: deviceInfo.serialNumber = text
        case PWUUID.modelNumber: deviceInfo.modelNumber = text
        default: break
        }
        if deviceInfoReadsRemaining.first == uuid {
            deviceInfoReadsRemaining.removeFirst()
            readNextDeviceInfoCharacteristic()
        }
    }
}

/// CoreBluetooth hands out new `CBPeripheral` objects per discovery, so a weak
/// registry keeps the discovered instance alive for `connect(_:)`.
enum CBPeripheralsRegistry {
    private static var storage: [String: CBPeripheral] = [:]
    private static let lock = NSLock()

    static func remember(_ peripheral: CBPeripheral) {
        lock.lock(); defer { lock.unlock() }
        storage[peripheral.identifier.uuidString] = peripheral
    }

    static func peripheral(for identifier: String) -> CBPeripheral? {
        lock.lock(); defer { lock.unlock() }
        return storage[identifier]
    }
}
