import Foundation
import SwiftUI
import CoreBluetooth

/// Dependency container and observable mirror of the local store.
///
/// Replaces the Dagger/Hilt graph (`AppModuleKt`, `CloudModuleKt`,
/// `RoomModuleKt`, `SDKModuleKt`). Views never talk to the `LocalStore` actor
/// directly; they read the published snapshot below and call mutators, which
/// keeps the view layer off the actor hop.
@MainActor
final class AppEnvironment: ObservableObject {
    enum TransportKind: String, CaseIterable, Identifiable {
        case bluetooth
        case simulated
        var id: String { rawValue }
        var title: String {
            switch self {
            case .bluetooth: return "Real watch"
            case .simulated: return "Simulated watch"
            }
        }
    }

    static let shared = AppEnvironment()

    // MARK: Published session state

    @Published private(set) var user: UserAccount?
    @Published private(set) var device: PairedDevice?
    @Published private(set) var goals = GoalConfiguration()
    @Published private(set) var watchSettings = WatchSettings()
    @Published private(set) var notificationPrefs = NotificationPreferences()
    @Published private(set) var allowList = NotificationAllowList()
    @Published private(set) var onboardingComplete = false
    @Published private(set) var updateInfo: FirmwareUpdateInfo?
    @Published private(set) var transportState: TransportState = .idle
    @Published private(set) var heartRate: Int?
    /// Decoded `2A25` from the realtime poll; nil while disconnected, the way the APK's
    /// `mapToRealTimeData` falls back to the day periods once `realtimeWatchData` is null.
    @Published private(set) var realtimeData: Gen2InfoRecords.RealtimeData?
    /// Decoded `2A24`, i.e. what the watch itself says its settings are — read-only mirror of
    /// `store.watchSettings()`, which stays the value the app writes.
    @Published private(set) var reportedSettings: Gen2InfoRecords.SettingsData?

    let store: LocalStore
    let keychain: KeychainStore
    let cloud: LocalOnlyCloudAPI

    let bleTransport = BLETransport()
    let simulatedTransport = SimulatedTransport()

    /// Persisted preference so a developer without hardware keeps the simulator.
    @Published var transportKind: TransportKind {
        didSet {
            guard transportKind != oldValue else { return }
            UserDefaults.standard.set(transportKind.rawValue, forKey: Self.transportKindKey)
            bindTransportCallbacks()
        }
    }

    private static let transportKindKey = "pw2.transportKind"

    private var synchronizers: [TransportKind: WatchSynchronizer] = [:]
    private var connectionTask: Task<Bool, Never>?
    /// True while the dashboard wants the watch connected; gates the reconnect that
    /// `onState` runs after a dropped link.
    private var connectionDesired = false
    /// The APK's 20 s realtime/settings poll (`RealTimeDataProviderImpl`). Reads whichever
    /// transport is active at tick time, so switching to the simulator needs no re-arming.
    private lazy var realtimeProvider = RealtimeDataProvider(transportProvider: { [weak self] in
        self?.activeTransport
    })

    init(store: LocalStore = .shared, keychain: KeychainStore = .shared) {
        self.store = store
        self.keychain = keychain
        self.cloud = LocalOnlyCloudAPI(store: store, keychain: keychain)
        let raw = UserDefaults.standard.string(forKey: Self.transportKindKey)
        self.transportKind = TransportKind(rawValue: raw ?? "") ?? .automaticDefault
        bindTransportCallbacks()
    }

    // MARK: Routing state

    var isLoggedIn: Bool { user != nil && keychain.hasToken }
    var hasPairedDevice: Bool { device != nil }
    var hasProfile: Bool { user != nil }

    func reload() async {
        user = await store.user()
        device = await store.device()
        goals = await store.goals()
        watchSettings = await store.watchSettings()
        notificationPrefs = await store.notifications()
        allowList = await store.allowList()
        onboardingComplete = await store.isOnboardingComplete
        updateInfo = await store.updateInfo()
    }

    // MARK: Transport selection

    var isBluetoothUsable: Bool { CBManager.authorization == .allowedAlways }

    var activeTransport: WatchTransport {
        transportKind == .bluetooth ? bleTransport : simulatedTransport
    }

    var synchronizer: WatchSynchronizer {
        if let existing = synchronizers[transportKind] { return existing }
        let created = WatchSynchronizer(transport: activeTransport, store: store, cloud: cloud)
        synchronizers[transportKind] = created
        return created
    }

    /// `ChannelStreamImpl`/`Gen2ExecutorImpl` expose exactly one callback each,
    /// so fan-out has to live here rather than in the synchronizer.
    private func bindTransportCallbacks() {
        // The provider is `@MainActor` and calls back on the main actor, so this is a plain
        // assignment rather than another hop.
        realtimeProvider.onUpdate = { [weak self] realtime, settings in
            self?.realtimeData = realtime
            if let settings { self?.reportedSettings = settings }
        }
        for transport in [bleTransport as WatchTransport, simulatedTransport as WatchTransport] {
            // Weak capture: the closures are stored *on* the transport.
            transport.onState = { [weak self, weak transport] state in
                guard let self, let transport else { return }
                Task { @MainActor in
                    let isActive = transport === self.activeTransport
                    if isActive {
                        self.transportState = state
                        switch state {
                        case .connected:
                            // `connectableObservableReplay.connect()`: the poll belongs to the
                            // connection, not to a screen.
                            self.realtimeProvider.start()
                        case .disconnected, .failed:
                            // Live numbers stop; `mapToRealTimeData` shows the stored day
                            // periods once `realtimeWatchData` is null, so clear them here too.
                            self.realtimeProvider.stop()
                            self.realtimeData = nil
                        default:
                            break
                        }
                    }
                    self.synchronizers.values.forEach { $0.ingest(state: state) }
                    // `DeviceManagerImpl.init()` keeps its Bluetooth subscription alive,
                    // so a link that drops is re-established by the same machinery that
                    // started it. Re-arm only while something is actually asking for the
                    // watch (the dashboard), never after `stopConnection()`.
                    if isActive, self.connectionDesired, self.device != nil,
                       case .disconnected = state {
                        await self.startConnection()
                    }
                }
            }
            transport.onHeartRate = { [weak self, weak transport] bpm in
                guard let self, let transport else { return }
                Task { @MainActor in
                    if transport === self.activeTransport { self.heartRate = bpm }
                    self.synchronizers.values.forEach { $0.ingest(heartRate: bpm) }
                }
            }
        }
        bleTransport.prepare()
        simulatedTransport.prepare()
    }

    // MARK: Mutators

    /// Reconnect to the paired watch, the counterpart of `sdk/DeviceManagerImpl`.
    ///
    /// In the APK there is no Connect button: `MainDashboardViewModel`'s constructor
    /// calls `deviceManager.init()`, which subscribes to the Bluetooth state, and each
    /// Enabled event runs `startConnection()` — read the stored device from Room,
    /// bail out if `communicator.connectedDevices()` is already non-empty, otherwise
    /// `communicator.startConnection(listOf(device.bluetoothAddress))`. The connect then
    /// waits inside `establishConnection(autoConnect = true)`, so it completes whenever
    /// the watch next advertises.
    ///
    /// iOS gets the same "pending request" behaviour from
    /// `CBCentralManager.connect(_:options:)`, but only once CoreBluetooth holds a
    /// `CBPeripheral` for that identifier, so the attempt is repeated on a slow clock
    /// while the dashboard is on screen. The retry matters more here than on Android:
    /// a PowerWatch 2 only advertises while it sits on Settings ▸ Show QR, so a launch
    /// with the watch back on its dial is expected to fail and try again.
    ///
    /// `device.uid` is the reconnect key: iOS publishes no MAC address, so the
    /// peripheral identifier recorded at pairing time stands in for the APK's
    /// `Device.bluetoothAddress`.
    @discardableResult
    func startConnection() async -> Bool {
        guard let paired = device else { return false }
        guard !activeTransport.isConnected else { return true }
        let identifier = paired.uid
        connectionDesired = true
        // `RealTimeDataProviderImpl`'s pipeline is live from construction and simply emits
        // nothing until the device reports connected, so starting it here (rather than only
        // in `didConnect`) is the faithful order; `tick()` skips while the link is down.
        realtimeProvider.start()
        connectionTask?.cancel()
        connectionTask = Task { [weak self] in
            while !Task.isCancelled {
                // Re-read the stored device on every attempt, the way the APK's
                // `startConnection()` goes through `deviceRepository.defaultDevice()`:
                // unpairing, or switching transport, while we are retrying has to stop it.
                guard let self, connectionDesired, device?.uid == identifier else { return false }
                if await activeTransport.startConnection(to: identifier) { return true }
                try? await Task.sleep(nanoseconds: 20_000_000_000)
            }
            return false
        }
        return await connectionTask?.value ?? false
    }

    /// `DeviceManagerImpl.stopConnection()`: clear the subscription, stop the pending
    /// request and drop the link. Called when the dashboard goes away or Bluetooth is
    /// switched off.
    func stopConnection() {
        connectionDesired = false
        connectionTask?.cancel()
        connectionTask = nil
        realtimeProvider.stop()
        realtimeData = nil
        activeTransport.stopConnection()
    }

    func setUser(_ user: UserAccount) async {
        await store.save(user: user)
        await reload()
    }

    func setGoals(_ goals: GoalConfiguration) async {
        await store.save(goals: goals)
        await reload()
        // Goal edits are pushed to the watch immediately, as the Android
        // `SaveGoalsSettingsVM` does via 9003/9013.
        if hasPairedDevice, activeTransport.isConnected {
            try? await synchronizer.apply(Gen2Command.sendStepsDistanceGoal(
                steps: goals.steps, distance: goals.distance))
            try? await synchronizer.apply(Gen2Command.sendCaloriesSleepGoal(
                calories: goals.calories, sleepMinutes: goals.sleep))
        }
    }

    func updateGoals(_ transform: (inout GoalConfiguration) -> Void) async {
        var copy = goals
        transform(&copy)
        await setGoals(copy)
    }

    func updateWatchSettings(_ transform: (inout WatchSettings) -> Void) async {
        var copy = watchSettings
        transform(&copy)
        await store.updateWatchSettings { $0 = copy }
        await reload()
    }

    func updateNotifications(_ transform: (inout NotificationPreferences) -> Void) async {
        var copy = notificationPrefs
        transform(&copy)
        await store.updateNotifications { $0 = copy }
        await reload()
    }

    func updateAllowList(_ transform: (inout NotificationAllowList) -> Void) async {
        var copy = allowList
        transform(&copy)
        await store.updateAllowList { $0 = copy }
        await reload()
    }

    func completeOnboarding() async {
        await store.setOnboardingComplete(true)
        await reload()
    }

    func updateDevice(_ transform: (inout PairedDevice) -> Void) async {
        await store.updateDevice(transform)
        await reload()
    }

    // MARK: Auth / pairing lifecycle

    func signIn(email: String, password: String) async throws {
        _ = try await cloud.login(email: email, password: password, hostUUID: UIDevice.current.identifierForVendor?.uuidString ?? "")
        await reload()
    }

    func signUp(name: String, email: String, password: String,
                age: Int, height: Double, weight: Double,
                gender: Gender, unit: UnitType, hourFormat: HourFormat,
                language: AppLanguage) async throws {
        let user = UserAccount(
            uid: UUID().uuidString,
            enabled: true,
            name: name,
            email: email,
            password: password,
            age: age,
            height: height,
            weight: weight,
            gender: gender,
            shouldSync: false,
            language: language,
            unitType: unit,
            timeFormatType: hourFormat
        )
        _ = try await cloud.signUp(user: user)
        await completeOnboarding()
        await reload()
    }

    func signOut() async {
        await cloud.logout()
        synchronizers.removeAll()
        activeTransport.disconnect()
        await reload()
    }

    func unpairDevice() async {
        if let device { try? await cloud.unpairDevice(serial: device.serialNumber) }
        // Clears the retry loop too: with no stored device there is nothing to
        // reconnect to, and `DeviceManagerImpl` has no subscription left either.
        stopConnection()
        synchronizers.removeAll()
        await reload()
    }
}

private extension AppEnvironment.TransportKind {
    /// Pick real Bluetooth when CoreBluetooth can actually use it, otherwise the
    /// simulator, so a fresh install on a Mac/simulator is still fully usable.
    static var automaticDefault: AppEnvironment.TransportKind {
        CBManager.authorization == .allowedAlways ? .bluetooth : .simulated
    }
}
