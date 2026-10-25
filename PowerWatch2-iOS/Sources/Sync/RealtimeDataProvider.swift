import Foundation

/// Mirrors `shared/data/providers/RealTimeDataProviderImpl`.
///
/// That class's constructor builds
/// `deviceManager.connect().switchMap { deviceInfo -> … }.retry().repeat().replay(1)` and
/// immediately `connect()`s it, so from the moment a Gen2 watch is connected the APK runs
///
/// ```
/// combineLatest(
///     Observable.interval(0, 20, TimeUnit.SECONDS)
///         .flatMap { deviceCommunicationQueuer.queue(realtimeDataExecutor.readData(uid)) },
///     heartRateDataExecutor.receiveData(uid).startWith(0))
/// ```
///
/// — and `readData` is **not** a DTP command. `Gen2ProtocolBasics.sendMessage` maps
/// `GEN2_SERIAL_REQUEST` to `channel.read(characteristicTypeMap[SERIAL])`, i.e. a GATT read
/// of `2A25` whose record list `RealtimeDataParser` decodes, and `Gen2RealtimeDataExecutor`
/// follows it with `SettingsDataProvider.loadSettingsFromWatch`, a `channel.read` of `2A24`
/// decoded by `SettingsDataParser`. So the APK performs two characteristic reads every 20
/// seconds — which is also what keeps the link alive: a PowerWatch 2 drops an idle iPhone
/// after a handful of seconds with `didDisconnect: The connection has timed out
/// unexpectedly.`, which is exactly the flapping this provider exists to stop.
///
/// Heart rate is deliberately not polled: the APK combines it from the `2A37` notification
/// stream (`Gen2RealtimeHeartRateExecutor.receiveData` just filters `communicator
/// .messageOutput()`), which `BLETransport` already enables during service enumeration and
/// reports through `onHeartRate`.
///
/// `.retry().repeat()` in the APK means one failed tick is logged ("Realtime data obs error,
/// will retry subscription") and the stream continues; here a failing read is logged and the
/// next tick runs on schedule.
@MainActor
final class RealtimeDataProvider {
    /// Decoded `2A25`, the value `mapToRealTimeData` turns into the dashboard's realtime card.
    private(set) var realtime: Gen2InfoRecords.RealtimeData?
    /// Decoded `2A24`, the value `SettingsDataProvider` would save to `SettingsDataRepository`.
    private(set) var settings: Gen2InfoRecords.SettingsData?

    /// `AppEnvironment` republishes these, which is the stand-in for the `replay(1)` the
    /// dashboard subscribes to.
    var onUpdate: ((Gen2InfoRecords.RealtimeData?, Gen2InfoRecords.SettingsData?) -> Void)?

    private let transportProvider: () -> WatchTransport?
    private let interval: TimeInterval
    private var task: Task<Void, Never>?

    /// `transportProvider` is a closure rather than a `WatchTransport` because
    /// `AppEnvironment` can swap between the radio and the simulator at any time; passing the
    /// object would pin the old one.
    init(transportProvider: @escaping () -> WatchTransport?, interval: TimeInterval = 20) {
        self.transportProvider = transportProvider
        self.interval = interval
    }

    var isRunning: Bool { task != nil }

    /// The equivalent of `connectableObservableReplay.connect()`. `Observable.interval(0, 20, …)`
    /// fires immediately, so the first read is not delayed by the period.
    func start() {
        guard task == nil else { return }
        let period = interval
        task = Task { [weak self] in
            while !Task.isCancelled {
                await self?.tick()
                try? await Task.sleep(nanoseconds: UInt64(period * 1_000_000_000))
            }
        }
    }

    func stop() {
        task?.cancel()
        task = nil
    }

    /// One tick of the interval: both reads, in the APK's order. Skipped while disconnected —
    /// the APK's `switchMap` returns `Observable.empty()` unless `deviceInfo.isConnected`.
    private func tick() async {
        guard let transport = transportProvider(), transport.isConnected else { return }
        var updated = false
        do {
            realtime = Gen2InfoRecords.parseRealtime(try await transport.readRealtimePayload())
            updated = true
        } catch {
            NSLog("pw2-realtime realtime data read failed: %@", error.localizedDescription)
        }
        do {
            settings = Gen2InfoRecords.parseSettings(try await transport.readSettingsPayload())
            updated = true
        } catch {
            NSLog("pw2-realtime settings read failed: %@", error.localizedDescription)
        }
        if updated { onUpdate?(realtime, settings) }
    }
}
