import SwiftUI

/// Mirrors `pair/PairingActivity` + `PairingActivityViewModel` and the fragment
/// chain under `pair/ui/gen2/`:
///
/// `QRPairingFragment` (camera, `pair/camera/`) → `QRPairingViewModel.onQRCodeResolved`
/// → `extractQRCode` → `Gen2PairingProgressFragment.newInstance(code)` →
/// `communicator.startScanning([ScanFilter(name = "PowerWatch 2")])` →
/// `foundDevicesChange().filter { it.pairingCode == code }` → `startConnection` →
/// `Gen2DeviceInfoCommand` (the `2a26` characteristic read) →
/// `ExecutorsFactory.createPairExecutor(...).transferData` — `9010 9124 9024 9011`
/// for a protocol-version-4 watch — → `deviceProtocolStorage.save` →
/// `onPairingSuccess` → `deviceRepository.save`, served locally by
/// `LocalOnlyCloudAPI.pairDevice`.
/// `EnterPinCodeFragment` is the manual-code fallback and `QRCodeTutorialFragment`
/// the "Can't see QR code?" instructions.
@MainActor
final class PairingViewModel: ObservableObject {
    enum Stage { case intro, awaitingQR, enteringCode, tutorial, scanning, found, connecting, paired, failed }

    @Published var stage: Stage = .intro
    @Published var discovered: [DiscoveredWatch] = []
    @Published var statusText: String = ""
    /// Pairing progress, weighted by the `power` each executor step passes to
    /// `SyncProgressChannel` (0.1 / 0.1 / 0.3 / 0.4 / 0.1 for a version-4 watch).
    @Published var progress: Double = 0
    @Published var errorText: String?
    @Published var scanDiagnostics: String = ""
    @Published var firmwareVersion: String = ""
    /// The code from the watch's QR display, once scanned or typed.
    @Published var pairCode: Int?
    @Published var codeDraft: String = ""
    @Published var cameraNotice: String?

    private let environment: AppEnvironment

    init(environment: AppEnvironment) {
        self.environment = environment
    }

    var usesSimulatedTransport: Bool { environment.transportKind == .simulated }

    // MARK: - Pairing code (`QRPairingViewModel` / `EnterPinCodeViewModel`)

    func startQRScan() {
        errorText = nil
        cameraNotice = nil
        stage = .awaitingQR
    }

    /// `QRPairingViewModel.onQRCodeResolved`
    func qrTextResolved(_ text: String) {
        if let code = PairCode.extract(text) {
            pairCode = code
            scan()
        } else {
            errorText = "That QR code did not contain a pairing code."
            codeDraft = ""
            stage = .enteringCode
        }
    }

    /// `EnterPinCodeViewModel.onCodeEntered`. The original hands the raw string to
    /// `Short.parseShort`, so an unparseable code ends on the failure screen.
    func enterCode() {
        let trimmed = codeDraft.trimmingCharacters(in: .whitespacesAndNewlines)
        guard let code = Int(trimmed), code >= Int(Int16.min), code <= Int(Int16.max) else {
            stage = .failed
            errorText = R.pairingFailedHint
            statusText = "Pairing failed"
            return
        }
        pairCode = code
        scan()
    }

    func showTutorial() { stage = .tutorial }
    func enterCodeManually() { errorText = nil; stage = .enteringCode }
    func backToIntro() { errorText = nil; cameraNotice = nil; stage = .intro }

    func scan() {
        stage = .scanning
        errorText = nil
        discovered = []
        scanDiagnostics = ""
        // `Gen2PairingProgressViewModel` shows `searching_for_single_device`
        // formatted with the pairing code once it knows one, `searching_for_devices`
        // while it is still waiting for the QR scan.
        statusText = pairCode.map { R.format(R.searchingForSingleDevice, "\($0)") }
            ?? R.searchingForDevices
        Task { @MainActor in
            // `Gen2PairingProgressViewModel` only accepts the watch whose advertised
            // pairing code equals the scanned one, so hand the code to the radio and
            // let it match on the advertisement rather than on a broadcast name.
            environment.bleTransport.expectedPairingCode = usesSimulatedTransport ? nil : pairCode
            // 11.5 s: the window `BluetoothScannerImpl.scan` gives classic
            // discovery before it retries.
            let heard = await environment.activeTransport.scan(duration: 11.5)
            // `Gen2PairingProgressViewModel`: `foundDevicesChange().filter {
            // it.pairingCode == Short.parseShort(pairingCode) }` — once the code is
            // known, every other watch is dropped before it reaches the list.
            let found: [DiscoveredWatch]
            if let code = pairCode, !usesSimulatedTransport {
                found = heard.filter { $0.pairingCode == code }
            } else {
                found = heard
            }
            let rejectedByCode = heard.count - found.count
            discovered = found
            if found.isEmpty {
                if environment.transportKind == .simulated {
                    stage = .intro
                    statusText = "The simulated watch did not answer."
                    return
                }
                stage = pairCode == nil ? .intro : .enteringCode
                codeDraft = pairCode.map(String.init) ?? ""
                let report = environment.bleTransport.lastScanReport
                scanDiagnostics = Self.describe(report)
                    + (rejectedByCode > 0 ? " · \(rejectedByCode) rejected for a different pairing code" : "")
                if report.bluetoothState == "poweredOn" && report.peripheralsSeen > 0 {
                    statusText = rejectedByCode > 0
                        ? "A watch answered, but it is showing a different pairing code than \(pairCode.map(String.init) ?? ""). Put it in Show QR mode and scan again."
                        : "Bluetooth heard \(report.peripheralsSeen) device"
                            + (report.peripheralsSeen == 1 ? "" : "s")
                            + ", but none of them was a PowerWatch."
                } else {
                    statusText = environment.isBluetoothUsable
                        ? "No PowerWatch found. Bring the watch close and make sure it is charged."
                        : "Bluetooth is unavailable here, so no real watch can be reached."
                }
            } else {
                stage = .found
                statusText = "Select the watch to pair."
            }
        }
    }

    /// Turns a `ScanReport` into one line the user can act on.
    static func describe(_ report: ScanReport) -> String {
        var parts: [String] = ["Bluetooth: \(report.bluetoothState)", "permission: \(report.authorization)"]
        parts.append("heard \(report.peripheralsSeen), matched \(report.matched)")
        if !report.samples.isEmpty {
            parts.append("nearby: " + report.samples.joined(separator: ", "))
        }
        if !report.hint.isEmpty { parts.append(report.hint) }
        if report.waitedForPower { parts.append("the radio never switched on") }
        return parts.joined(separator: " · ")
    }

    /// `Gen2PairingProgressViewModel` wraps the whole pipeline in
    /// `.timeout(60, TimeUnit.SECONDS)`; individual commands also carry their own
    /// 15 s executor timeout, so this is the outer bound only.
    static let pairingTimeout: TimeInterval = 60

    enum PairingError: LocalizedError {
        /// `ConnectionTimedOutError` in the APK.
        case timedOut
        /// The APK reads the profile from `UserAccountRepository.first` before it
        /// starts; without a signed-in user there is nothing to write to the watch.
        case noUser

        var errorDescription: String? {
            switch self {
            case .timedOut: return "Pairing timed out: the watch did not answer the pairing chain."
            case .noUser: return "Sign in before pairing a watch."
            }
        }
    }

    /// From `foundDevicesChange()` on, this mirrors the APK's pipeline:
    /// `startConnection` → `Gen2DeviceInfoCommand` (the `2a26` characteristic read,
    /// run *before* `9010`, which is also what sets `pid = 4`) →
    /// `ExecutorsFactory.createPairExecutor(...).transferData` → save protocol
    /// version → `onPairingSuccess` → `deviceRepository.save` → `PairingSuccessFragment`.
    ///
    /// Before this mirrors was two commands (`9010` + `9011`); the chain the APK
    /// actually runs for a protocol-version-4 watch is `9010 9124 9024 9011`, so the
    /// watch did not receive its units, biometrics, goals or language until the
    /// first sync.
    func pair(_ watch: DiscoveredWatch) {
        stage = .connecting
        statusText = R.connectingToDevice
        errorText = nil
        progress = 0
        Task { @MainActor in
            let deadline = Date().addingTimeInterval(Self.pairingTimeout)
            func checkDeadline() throws {
                if Date() >= deadline { throw PairingError.timedOut }
            }
            do {
                try await environment.activeTransport.connect(watch)
                let info = try await environment.activeTransport.readDeviceInfo()
                firmwareVersion = info.firmware
                progress = 0.1
                try checkDeadline()

                guard let user = await environment.store.user() else { throw PairingError.noUser }
                let steps = Gen2Command.pairingChain(
                    protocolVersion: Int(watch.protocolVersion ?? 4),
                    user: user,
                    goals: await environment.store.goals(),
                    settings: await environment.store.watchSettings()
                )
                for step in steps {
                    try checkDeadline()
                    _ = try await environment.activeTransport.perform(step.command)
                    progress = min(1, progress + step.power)
                }

                statusText = R.savingInfo
                let device = PairedDevice(
                    uid: watch.identifier,
                    serialNumber: info.serialNumber.isEmpty ? watch.identifier : info.serialNumber,
                    bluetoothAddress: watch.bluetoothAddress,
                    pid: 4,
                    firmwareVersion: info.firmware,
                    productName: watch.name,
                    protocolVersion: Int(watch.protocolVersion ?? 4)
                )
                try await environment.cloud.pairDevice(device)
                // Heart rate streaming is best-effort: a failure here must not
                // abort pairing.
                do { try await environment.activeTransport.subscribeHeartRate() } catch {}
                await environment.reload()
                progress = 1
                statusText = R.success
                stage = .paired
            } catch {
                // `onErrorResumeNext` turns a timeout into `ConnectionTimedOutError`
                // and everything else into `ConnectionFailedError`; both land on
                // `PairingFailedFragment`, which shows `pairing_failed_hint`.
                stage = .failed
                errorText = "\(error.localizedDescription) — \(R.pairingFailedHint)"
                statusText = "Pairing failed"
                // `onDestroyView` calls `stopConnection()` when the watch never
                // paired; don't leave the link half-open.
                environment.activeTransport.disconnect()
                NSLog("pw2-pair failed: %@", error.localizedDescription)
            }
        }
    }

    /// Enables the built-in simulated watch so the whole app is usable with no
    /// hardware on the wrist.
    func useSimulatedWatch() {
        errorText = nil
        stage = .connecting
        statusText = "Starting simulated watch…"
        progress = 0
        Task { @MainActor in
            environment.transportKind = .simulated
            let watch = environment.simulatedTransport.simulatedDevice
            do {
                try await environment.simulatedTransport.connect(watch)
                let info = try await environment.simulatedTransport.readDeviceInfo()
                firmwareVersion = info.firmware
                progress = 0.1
                // Same chain as real hardware, so the simulated watch has to answer
                // `9124`/`9024` too; a profile-less demo still works.
                let user = await environment.store.user()
                    ?? UserAccount(uid: "simulated", name: "Simulated user", email: "simulated@localhost")
                let steps = Gen2Command.pairingChain(
                    protocolVersion: Int(watch.protocolVersion ?? 4),
                    user: user,
                    goals: await environment.store.goals(),
                    settings: await environment.store.watchSettings()
                )
                for step in steps {
                    _ = try await environment.simulatedTransport.perform(step.command)
                    progress = min(1, progress + step.power)
                }
                statusText = R.savingInfo
                let device = PairedDevice(
                    uid: watch.identifier,
                    serialNumber: info.serialNumber,
                    bluetoothAddress: watch.bluetoothAddress,
                    pid: 4,
                    firmwareVersion: info.firmware,
                    productName: watch.name,
                    protocolVersion: Int(watch.protocolVersion ?? 4)
                )
                try await environment.cloud.pairDevice(device)
                try? await environment.simulatedTransport.subscribeHeartRate()
                await environment.reload()
                progress = 1
                stage = .paired
                statusText = "Simulated watch connected"
            } catch {
                stage = .failed
                errorText = error.localizedDescription
                environment.simulatedTransport.disconnect()
            }
        }
    }
}

struct PairingFlow: View {
    @EnvironmentObject private var environment: AppEnvironment
    @StateObject private var model: PairingViewModel

    init() {
        _model = StateObject(wrappedValue: PairingViewModel(environment: AppEnvironment.shared))
    }

    var body: some View {
        NavigationStack {
            ScrollView {
                VStack(spacing: 16) {
                    header
                    statusCard
                    if model.stage == .awaitingQR { qrScanner }
                    if model.stage == .enteringCode { codeEntry }
                    if model.stage == .tutorial { tutorialCard }
                    if model.stage == .found { deviceList }
                    actions
                }
                .padding()
            }
            .background(Color(.systemGroupedBackground))
            .navigationTitle("Pair Watch")
            .task {
                // With a code already in hand, scanning is the next step, and on a
                // fresh install the "Would Like to Use Bluetooth" prompt is still
                // being answered when the user arrives — `BLETransport.scan` now
                // waits for the radio instead of returning an empty list. Without a
                // code the screen opens on the QR step, as `PairingActivity` does.
                if model.stage == .intro, model.pairCode != nil, !model.usesSimulatedTransport {
                    model.scan()
                }
            }
            .toolbar {
                ToolbarItem(placement: .topBarTrailing) {
                    Picker("Source", selection: $environment.transportKind) {
                        ForEach(AppEnvironment.TransportKind.allCases) { Text($0.title).tag($0) }
                    }
                    .pickerStyle(.menu)
                }
            }
        }
    }

    private var header: some View {
        Card {
            VStack(alignment: .leading, spacing: 10) {
                Image(systemName: "qrcode.viewfinder")
                    .font(.largeTitle)
                    .foregroundStyle(Color.accentColor)
                Text(R.scanTitle)
                    .font(.headline)
                Text("Make sure your PowerWatch 2 is charged and within 1 m of this phone, then put it in Show QR mode: press the side button until Settings appears, open Settings and press again on Show QR.")
                    .font(.subheadline)
                Text("Pairing writes no account data anywhere: the watch identity is stored in the local database only. The camera is used only to read the pairing code and nothing is recorded.")
                    .font(.caption)
                    .foregroundStyle(.secondary)
            }
        }
    }

    // MARK: - QR + code entry (`QRPairingFragment` / `EnterPinCodeFragment`)

    private var qrScanner: some View {
        Card(padding: 0) {
            ZStack {
                QRScannerView(
                    onText: { model.qrTextResolved($0) },
                    onUnavailable: { model.cameraNotice = $0 }
                )
                .frame(height: 280)
                .clipped()
                VStack {
                    Spacer()
                    Text(model.cameraNotice ?? R.placeWatch)
                        .font(.caption)
                        .padding(8)
                        .background(.ultraThinMaterial, in: Capsule())
                        .padding(.bottom, 12)
                }
            }
        }
    }

    private var codeEntry: some View {
        Card {
            VStack(alignment: .leading, spacing: 10) {
                Text(R.pairingCodeTitle).font(.headline)
                TextField("1234", text: $model.codeDraft)
                    .keyboardType(.numberPad)
                    .textInputAutocapitalization(.never)
                    .textFieldStyle(.roundedBorder)
                Text("The number shown under the QR code on your watch.")
                    .font(.caption).foregroundStyle(.secondary)
            }
        }
    }

    private var tutorialCard: some View {
        Card {
            VStack(alignment: .leading, spacing: 12) {
                Text(R.showingQRTitle).font(.headline)
                let steps = [R.tutorialStepOne, R.tutorialStepTwo, R.tutorialStepThree]
                ForEach(steps.indices, id: \.self) { index in
                    HStack(alignment: .top, spacing: 10) {
                        Text("\(index + 1)")
                            .font(.caption.bold())
                            .frame(width: 22, height: 22)
                            .background(Circle().fill(Color.accentColor.opacity(0.18)))
                            .foregroundStyle(Color.accentColor)
                        Text(R.tutorialStep(index: index + 1, text: steps[index]))
                            .font(.subheadline)
                    }
                }
            }
        }
    }

    private var statusCard: some View {
        Card {
            VStack(spacing: 10) {
                switch model.stage {
                case .scanning:
                    ProgressView()
                case .connecting:
                    // The APK's `SyncProgressChannel` shows the same weighted bar:
                    // each pairing executor step adds the `power` it passes.
                    ProgressView(value: model.progress)
                        .progressViewStyle(.linear)
                        .frame(maxWidth: 180)
                case .awaitingQR:
                    Image(systemName: "camera.viewfinder")
                        .foregroundStyle(Color.accentColor).font(.title2)
                case .enteringCode:
                    Image(systemName: "number")
                        .foregroundStyle(Color.accentColor).font(.title2)
                case .tutorial:
                    Image(systemName: "questionmark.circle")
                        .foregroundStyle(.secondary).font(.title2)
                case .failed:
                    Image(systemName: "exclamationmark.triangle.fill")
                        .foregroundStyle(.orange).font(.title2)
                case .paired:
                    Image(systemName: "checkmark.circle.fill")
                        .foregroundStyle(.green).font(.title2)
                default:
                    Image(systemName: "antenna.radiowaves.left.and.right")
                        .foregroundStyle(.secondary).font(.title2)
                }
                Text(model.statusText)
                    .font(.subheadline)
                    .multilineTextAlignment(.center)
                if !model.firmwareVersion.isEmpty {
                    Text("Firmware \(model.firmwareVersion)")
                        .font(.caption).foregroundStyle(.secondary)
                }
                if let error = model.errorText {
                    Text(error).font(.caption).foregroundStyle(.red)
                }
                if !model.scanDiagnostics.isEmpty {
                    Text(model.scanDiagnostics)
                        .font(.caption2)
                        .monospaced()
                        .foregroundStyle(.secondary)
                        .frame(maxWidth: .infinity, alignment: .leading)
                        .textSelection(.enabled)
                }
            }
            .frame(maxWidth: .infinity)
        }
    }

    private var deviceList: some View {
        Card(padding: 4) {
            VStack(spacing: 0) {
                ForEach(model.discovered) { watch in
                    Button {
                        model.pair(watch)
                    } label: {
                        HStack {
                            VStack(alignment: .leading) {
                                Text(watch.name).foregroundStyle(.primary)
                                Text(watch.identifier + (watch.pairingCode.map { " · code \($0)" } ?? ""))
                                    .font(.caption2).foregroundStyle(.secondary)
                                    .lineLimit(1)
                                    .truncationMode(.middle)
                            }
                            Spacer()
                            Text("\(watch.rssi) dBm")
                                .font(.caption).foregroundStyle(.secondary)
                            Image(systemName: "chevron.right").font(.caption).foregroundStyle(.tertiary)
                        }
                        .padding(12)
                    }
                    Divider()
                }
            }
        }
    }

    private var actions: some View {
        VStack(spacing: 10) {
            switch model.stage {
            case .intro:
                primary(model.pairCode == nil ? R.scanTitle : "Scan with the camera again") { model.startQRScan() }
                secondary(R.enterPairingCode) { model.enterCodeManually() }
                secondary(model.pairCode == nil ? "Scan without a code" : "Scan for watches") { model.scan() }
            case .awaitingQR:
                secondary(R.cantSeeQRCode) { model.showTutorial() }
                secondary(R.unableToScanQR) { model.enterCodeManually() }
            case .enteringCode:
                primary(R.enterPairingCode) { model.enterCode() }
                secondary("Scan the QR code instead") { model.startQRScan() }
                secondary(R.cantSeeQRCode) { model.showTutorial() }
            case .tutorial:
                primary("Got it") { model.backToIntro() }
            case .scanning, .connecting:
                primary(model.stage == .scanning ? "Searching…" : "Connecting…") { }
                    .disabled(true)
            case .found, .failed, .paired:
                primary("Scan for watches") { model.scan() }
                    .disabled(model.stage == .connecting)
            }

            if model.usesSimulatedTransport || model.stage == .intro || model.stage == .failed {
                secondary("Continue with the simulated watch") { model.useSimulatedWatch() }
            }
        }
    }

    private func primary(_ title: String, _ action: @escaping () -> Void) -> some View {
        Button(action: action) {
            Text(title)
                .font(.headline)
                .frame(maxWidth: .infinity)
                .padding(.vertical, 6)
        }
        .buttonStyle(.borderedProminent)
    }

    private func secondary(_ title: String, _ action: @escaping () -> Void) -> some View {
        Button(action: action) {
            Text(title)
                .font(.subheadline)
                .frame(maxWidth: .infinity)
        }
        .buttonStyle(.bordered)
    }
}
