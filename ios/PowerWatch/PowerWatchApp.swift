import SwiftUI
import PowerWatchCore

@main
struct PowerWatchApp: App {
    @State private var model: AppModel
    @State private var sync: SyncController

    init() {
        // Diagnostics: mirror the trace log into the app container so it can
        // be pulled off the device (`devicectl device copy from`).
        let trace = FileManager.default
            .urls(for: .documentDirectory, in: .userDomainMask)[0]
            .appendingPathComponent("pw_trace.log")
        try? FileManager.default.removeItem(at: trace)
        PowerWatchLog.fileURL = trace

        let model = AppModel()
        let sync = SyncController(database: model.database)
        sync.onSyncCompleted = { [weak model] in model?.loadDashboard() }
        sync.onWatchConnected = { [weak model] watch in model?.attachDevice(watch) }
        sync.notifications = model.notifications
        sync.pairingPayloadProvider = { [weak model] in
            model?.userPrefsAndGoalsPayload() ?? []
        }
        _model = State(initialValue: model)
        _sync = State(initialValue: sync)
    }

    var body: some Scene {
        WindowGroup {
            if model.isOnboarded {
                MainTabView()
                    .environment(model)
                    .environment(sync)
            } else {
                OnboardingView()
                    .environment(model)
            }
        }
    }
}

struct MainTabView: View {
    @Environment(AppModel.self) private var model
    @Environment(SyncController.self) private var sync
    @Environment(\.scenePhase) private var scenePhase

    var body: some View {
        TabView {
            DashboardView()
                .tabItem { Label("Dashboard", systemImage: "circle.dotted") }
            HistoryView()
                .tabItem { Label("History", systemImage: "calendar") }
            DeviceView()
                .tabItem { Label("My PowerWatch", systemImage: "bolt") }
            WatchSettingsView()
                .tabItem { Label("Watch Settings", systemImage: "gearshape") }
        }
        .tint(.pwRed)
        .task {
            // Auto-reconnect to the bonded watch on launch (a bonded
            // PowerWatch2 does not advertise; retrieval is by UUID).
            if let device = model.device,
               let uuid = UUID(uuidString: device.bluetoothAddress) {
                sync.reconnect(to: uuid)
            }
        }
        .task(id: Calendar.current.startOfDay(for: .now)) {
            // The dashboard's day period is `startOfDay(now)…+1d`, so the
            // moment the clock rolls over the numbers on screen belong to
            // yesterday. Sleep to that boundary and recompute; recomputing
            // re-renders the tabs, which changes this task's id and re-arms it
            // for the next midnight.
            let calendar = Calendar.current
            let midnight = calendar.date(byAdding: .day, value: 1,
                                         to: calendar.startOfDay(for: .now))
                ?? .now.addingTimeInterval(60)
            let nanoseconds = UInt64(max(midnight.timeIntervalSinceNow, 1) * 1_000_000_000)
            try? await Task.sleep(nanoseconds: nanoseconds)
            guard !Task.isCancelled else { return }
            model.loadDashboard()
        }
        .onChange(of: scenePhase) { _, phase in
            // A foreground resume can also land on a new day (or on a day the
            // app never synced while backgrounded).
            if phase == .active { model.loadDashboard() }
        }
    }
}
