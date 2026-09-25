import SwiftUI
import PowerWatchCore

/// "My PowerWatch" tab (T5.3 software half): device info, scan/pair UI
/// driving the BLE transport, sync trigger with live phase, goal editing.
struct DeviceView: View {
    @Environment(AppModel.self) private var model
    @Environment(SyncController.self) private var sync

    /// Pairing sheet (camera QR scan — Android `pair/` flow).
    @State private var showingPairSheet = false
    /// Unpair confirmation (Android `UnpairDialogFragment`).
    @State private var showingUnpairDialog = false

    var body: some View {
        NavigationStack {
            Form {
                syncSection
                deviceSection
                goalsSection
                settingsSection
                notificationsSection
            }
            .navigationTitle("My PowerWatch")
            .sheet(isPresented: $showingPairSheet) {
                QRScannerView()
            }
            .confirmationDialog(
                "Unpair Watch", isPresented: $showingUnpairDialog, titleVisibility: .visible
            ) {
                Button("Unpair") { unpair(factoryReset: false) }
                Button("Unpair & Factory Reset", role: .destructive) { unpair(factoryReset: true) }
                Button("Cancel", role: .cancel) {}
            } message: {
                Text("The watch forgets this phone. Also forget it in Settings ▸ Bluetooth.")
            }
        }
    }

    // MARK: Pairing / sync (T5.3 + T4.x surface)

    private var syncSection: some View {
        Section {
            switch sync.transportState {
            case .connected:
                LabeledRow("Connection", "Connected")
                LabeledRow("Sync", phaseText)
                Button("Sync Now") {
                    Task { await sync.syncNow() }
                }
                .disabled(sync.isSyncing)
                Button("Disconnect", role: .destructive) {
                    sync.disconnect()
                }
                Button("Unpair Watch", role: .destructive) {
                    showingUnpairDialog = true
                }
                .accessibilityIdentifier("device.unpair")
            case .scanning:
                ForEach(sync.discovered) { watch in
                    Button {
                        sync.connect(to: watch)
                    } label: {
                        HStack {
                            VStack(alignment: .leading, spacing: 2) {
                                Text(watch.name.isEmpty ? "MATRIX Watch" : watch.name)
                                if let code = watch.pairingCode {
                                    Text("Pair code \(code)")
                                        .font(.caption)
                                        .foregroundStyle(.secondary)
                                        .monospacedDigit()
                                }
                            }
                            Spacer()
                            Text("\(watch.rssi) dBm")
                                .foregroundStyle(.secondary)
                                .monospacedDigit()
                        }
                    }
                    .accessibilityIdentifier("device.discovered.\(watch.id.uuidString)")
                }
                if sync.discovered.isEmpty {
                    Text(sync.isPairing
                         ? "Looking for the watch with pair code \(sync.pairCode ?? 0)…"
                         : "Searching for watches…")
                        .foregroundStyle(.secondary)
                }
                Button("Stop Scanning") { sync.stopScan() }
            case .connecting(let id):
                LabeledRow("Connecting", id.uuidString)
                // The transport retries on its own after a drop, so the user
                // needs a way to say "stop trying" without unpairing.
                Button("Stop Reconnecting") { sync.disconnect() }
                    .accessibilityIdentifier("device.stopReconnect")
            case .unavailable(let reason):
                Label(unavailableText(reason), systemImage: "exclamationmark.triangle")
                    .foregroundStyle(.orange)
            case .idle:
                Button("Pair Watch") {
                    showingPairSheet = true
                }
                .accessibilityIdentifier("device.pair")
                Button("Scan for Watch") {
                    sync.startScan()
                }
                .accessibilityIdentifier("device.scan")
            }
            if let outcome = sync.lastOutcome {
                LabeledRow("Last sync",
                           "walk \(outcome.savedWalking) · rest \(outcome.savedResting) · sleep \(outcome.savedSleep)")
            }
            if let error = sync.lastError {
                Text(error)
                    .font(.footnote)
                    .foregroundStyle(.orange)
            }
        } header: {
            Text("Watch")
        }
    }

    private var deviceSection: some View {
        Section("Device") {
            if let device = model.device {
                LabeledRow("Name", device.productName)
                LabeledRow("Serial", device.serialNumber)
                LabeledRow("Firmware", device.firmwareVersion)
                if case .idle = sync.transportState,
                   let uuid = UUID(uuidString: device.bluetoothAddress) {
                    Button("Reconnect to Watch") {
                        sync.reconnect(to: uuid)
                    }
                    .accessibilityIdentifier("device.reconnect")
                }
            } else {
                Text("No watch paired yet")
                    .foregroundStyle(.secondary)
                    .accessibilityIdentifier("device.noWatch")
            }
        }
    }

    private var goalsSection: some View {
        Section("Daily Goals") {
            Stepper(
                "Steps: \(model.goals.steps)",
                value: Binding(
                    get: { model.goals.steps },
                    set: { model.updateGoals(model.goals.with(steps: $0)) }),
                in: 0...50_000, step: 500)
            Stepper(
                "Calories: \(model.goals.calories) kcal",
                value: Binding(
                    get: { model.goals.calories },
                    set: { model.updateGoals(model.goals.with(calories: $0)) }),
                in: 0...5_000, step: 50)
            Stepper(
                "Sleep: \(model.sleepGoalText)",
                value: Binding(
                    get: { model.goals.sleep },
                    set: { model.updateGoals(model.goals.with(sleep: $0)) }),
                in: 0...840, step: 30)
            Stepper(
                "Power: \(model.goals.power) µWh",
                value: Binding(
                    get: { model.goals.power },
                    set: { model.updateGoals(model.goals.with(power: $0)) }),
                in: 0...100, step: 5)
                .monospacedDigit()
            Stepper(
                "Distance: \(distanceGoalText)",
                value: Binding(
                    get: { Double(model.goals.distance) / 1000 },
                    set: { model.updateGoals(model.goals.with(distance: Float($0 * 1000))) }),
                in: 0...50, step: 0.1)
                .monospacedDigit()
                .accessibilityIdentifier("device.goal.distance")
        }
    }

    /// Android's "Settings" rows on the watch page.
    private var settingsSection: some View {
        Section("Settings") {
            NavigationLink {
                PersonalSettingsView()
            } label: {
                Text("Personal Settings")
            }
            .accessibilityIdentifier("device.personalSettings")
        }
    }

    /// Android `NotificationSettingsFragment`: the three phone-side switches.
    /// Turning one on asks for notification permission (Android asks during
    /// onboarding; iOS prompts on the enabling action).
    private var notificationsSection: some View {
        Section {
            Toggle("Enable Connection Notifications", isOn: Binding(
                get: { model.notifications.connectionEnabled },
                set: { enable($0, apply: model.notifications.setConnectionEnabled) }))
                .accessibilityIdentifier("device.notify.connection")
            Toggle("Enable Battery notifications", isOn: Binding(
                get: { model.notifications.batteryEnabled },
                set: { enable($0, apply: model.notifications.setBatteryEnabled) }))
                .accessibilityIdentifier("device.notify.battery")
            Toggle("Enable Goals notifications", isOn: Binding(
                get: { model.notifications.goalsEnabled },
                set: { enable($0, apply: model.notifications.setGoalsEnabled) }))
                .accessibilityIdentifier("device.notify.goals")
            if model.notifications.hasRequestedAuthorization,
               !model.notifications.isAuthorized,
               model.notifications.connectionEnabled
                || model.notifications.batteryEnabled
                || model.notifications.goalsEnabled {
                Text("Allow notifications in Settings ▸ PowerWatch.")
                    .font(.footnote)
                    .foregroundStyle(.secondary)
            }
        } header: {
            Text("Notifications")
        }
    }

    /// Switch write + permission prompt on enable (Android asks during
    /// onboarding; iOS prompts on the enabling action).
    private func enable(_ on: Bool, apply: @escaping (Bool) -> Void) {
        apply(on)
        if on {
            Task { await model.notifications.requestAuthorization() }
        }
    }





    /// Unpair = clear the local pairing (and optionally factory-reset the
    /// watch via 9309 first, like Android's "Unpair and Factory Reset").
    private func unpair(factoryReset: Bool) {
        let mode: ResetMode = factoryReset ? .factoryReset : .reset
        Task {
            if case .connected = sync.transportState {
                _ = await sync.applySetting(command: .reset,
                                            payload: WatchSettingsPayloads.reset(mode))
            }
            sync.disconnect()
            model.removeDevice()
        }
    }

    private var distanceGoalText: String {
        let km = Double(model.goals.distance) / 1000
        if model.user?.accountSettings.unitType == .imperial {
            return String(format: "%.1f mi", km * 0.621371)
        }
        return String(format: "%.1f km", km)
    }

    // MARK: Formatting

    private var phaseText: String {
        switch sync.syncPhase {
        case .idle: return "—"
        case .starting: return "Syncing Data…"
        case .countingLogs: return "Counting logs…"
        case .readingRTL: return "Reading timestamps…"
        case .pullingActivity: return "Pulling activities…"
        case .pullingBackground: return "Pulling background logs…"
        case .persisting: return "Saving…"
        case .cleaning: return "Clearing watch logs…"
        case .stopping: return "Finishing…"
        case .finished: return "Up to date"
        case .failed(let message): return "Failed: \(SyncCopy.failure(message))"
        }
    }

    /// Failure wording the watch user recognises — Android's strings for the
    /// same protocol states (`watch_busy_text`, `sync_timeout`,
    /// `device_not_connected`).
    enum SyncCopy {
        static func failure(_ message: String) -> String {
            let lowered = message.lowercased()
            if lowered.contains("locked") || lowered.contains("busy") {
                return "Watch is busy, please try later."
            }
            if lowered.contains("timeout") || lowered.contains("timed out") {
                return "Communication Timeout"
            }
            if lowered.contains("notconnected") || lowered.contains("not connected") {
                return "Your watch is not connected."
            }
            if lowered.contains("badplacement") || lowered.contains("placement") {
                return "Sync not available while watch has bad placement."
            }
            if lowered.contains("alreadyrunning") {
                return "Syncing Data…"
            }
            return message
        }
    }

    private func unavailableText(_ reason: TransportState.UnavailableReason) -> String {
        switch reason {
        case .poweredOff: return "Bluetooth is turned off"
        case .unauthorized: return "Bluetooth permission denied — enable it in Settings"
        case .unsupported: return "Bluetooth LE is not available on this device"
        }
    }
}

struct LabeledRow: View {
    let label: String
    let value: String

    init(_ label: String, _ value: String) {
        self.label = label
        self.value = value
    }

    var body: some View {
        HStack {
            Text(label)
            Spacer()
            Text(value)
                .foregroundStyle(.secondary)
                .monospacedDigit()
        }
    }
}
