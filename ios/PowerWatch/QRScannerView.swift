import SwiftUI
import AVFoundation

/// Camera QR scanner (T3.4/T5.3 pairing, port of the Android `pair/camera`
/// flow): AVCaptureSession with a QR metadata output. The resolved payload is
/// handed to `SyncController.startPairing(qrText:)`.
struct QRScannerView: View {
    @Environment(SyncController.self) private var sync
    @Environment(\.dismiss) private var dismiss

    /// Set once the camera resolved a QR payload.
    @State private var resolved = false
    /// Camera unavailable (denied permission, simulator, etc.) → manual entry.
    @State private var cameraUnavailable = false
    /// Manual pair-code entry (Android `EnterPinCodeFragment`).
    @State private var manualCode = ""
    /// A pairing attempt that reached the watch and was dropped
    /// (Android shows `fragment_pair_failed` for this case).
    @State private var pairingFailed = false
    /// The link was actually attempted (as opposed to still scanning for the
    /// watch) — that is what distinguishes a failed pairing from a slow scan.
    @State private var didAttemptConnect = false

    var body: some View {
        NavigationStack {
            VStack(spacing: 16) {
                if resolved, pairingFailed {
                    ContentUnavailableView(
                        "Pairing Failed",
                        systemImage: "exclamationmark.triangle",
                        description: Text("Make sure your Powerwatch is powered on and displaying QR code"))
                    Button("Try Again") {
                        pairingFailed = false
                        resolved = sync.startPairing(code: sync.pairCode)
                    }
                    .buttonStyle(.borderedProminent)
                    .accessibilityIdentifier("pair.retry")
                } else if resolved {
                    ProgressView("Scanning for your watch…")
                } else {
                    scannerArea
                }
                manualEntry
            }
            .padding()
            .navigationTitle("Pair Watch")
            .navigationBarTitleDisplayMode(.inline)
            .toolbar {
                ToolbarItem(placement: .cancellationAction) {
                    Button("Cancel") {
                        sync.cancelPairing()
                        dismiss()
                    }
                }
            }
            .onChange(of: sync.transportState) { _, state in
                // The pairing sheet closes itself once the watch connects —
                // the sync runs under it and surfaces on the device tab.
                if case .connected = state { dismiss() }
                // A dropped connection after a failed pairing attempt frees
                // the sheet (the pair code stays armed for a retry).
                if case .connecting = state { didAttemptConnect = true }
                if case .idle = state, resolved {
                    if didAttemptConnect {
                        // Reached the watch and lost it — Android's pair-failed
                        // screen, with the code left armed for a retry.
                        pairingFailed = true
                        didAttemptConnect = false
                    } else {
                        sync.startPairing(code: sync.pairCode)
                    }
                }
            }
        }
        .interactiveDismissDisabled(resolved && sync.isScanning)
    }

    private var scannerArea: some View {
        ZStack {
            if cameraUnavailable {
                ContentUnavailableView(
                    "Camera Unavailable",
                    systemImage: "camera",
                    description: Text("Allow camera access in Settings, or enter the pair code below."))
            } else {
                CameraPreview(onQR: handleQR, onUnavailable: { cameraUnavailable = true })
                    .aspectRatio(3.0 / 4.0, contentMode: .fit)
                    .clipShape(RoundedRectangle(cornerRadius: 12))
                Text("Point the camera at the QR code on the watch")
                    .font(.footnote)
                    .foregroundStyle(.secondary)
            }
        }
    }

    private var manualEntry: some View {
        HStack {
            TextField("Pair code", text: $manualCode)
                .keyboardType(.numberPad)
                .textFieldStyle(.roundedBorder)
                .accessibilityIdentifier("pair.codeField")
            Button("Pair") {
                if sync.startPairing(code: Int16(manualCode)) {
                    resolved = true
                }
            }
            .disabled(Int16(manualCode) == nil)
            .buttonStyle(.borderedProminent)
        }
    }

    private func handleQR(_ text: String) {
        guard !resolved else { return }
        if sync.startPairing(qrText: text) {
            resolved = true
        }
    }
}

/// AVCaptureSession wrapper: preview layer + QR metadata output. Calls
/// `onQR` on the main thread once per distinct payload.
private struct CameraPreview: UIViewRepresentable {
    var onQR: (String) -> Void
    var onUnavailable: () -> Void

    func makeUIView(context: Context) -> PreviewView {
        let view = PreviewView()
        view.onQR = onQR
        view.onUnavailable = onUnavailable
        context.coordinator.attach(to: view)
        return view
    }

    func updateUIView(_ view: PreviewView, context: Context) {}

    func makeCoordinator() -> Coordinator { Coordinator() }

    final class Coordinator {
        var view: PreviewView?

        func attach(to view: PreviewView) {
            self.view = view
        }
    }

    final class PreviewView: UIView, AVCaptureMetadataOutputObjectsDelegate {
        var onQR: ((String) -> Void)?
        var onUnavailable: (() -> Void)?

        private let session = AVCaptureSession()
        private var lastPayload: String?
        private var isConfigured = false

        override init(frame: CGRect) {
            super.init(frame: frame)
            configure()
        }

        required init?(coder: NSCoder) {
            super.init(coder: coder)
            configure()
        }

        private func configure() {
            guard !isConfigured else { return }
            isConfigured = true
            session.beginConfiguration()
            session.sessionPreset = .high
            guard let device = AVCaptureDevice.default(for: .video),
                  let input = try? AVCaptureDeviceInput(device: device),
                  session.canAddInput(input) else {
                session.commitConfiguration()
                DispatchQueue.main.async { self.onUnavailable?() }
                return
            }
            session.addInput(input)
            let output = AVCaptureMetadataOutput()
            guard session.canAddOutput(output) else {
                session.commitConfiguration()
                DispatchQueue.main.async { self.onUnavailable?() }
                return
            }
            session.addOutput(output)
            output.setMetadataObjectsDelegate(self, queue: .main)
            output.metadataObjectTypes = [.qr]
            session.commitConfiguration()
        }

        override class var layerClass: AnyClass { AVCaptureVideoPreviewLayer.self }
        private var previewLayer: AVCaptureVideoPreviewLayer { layer as! AVCaptureVideoPreviewLayer }

        override func didMoveToWindow() {
            super.didMoveToWindow()
            if window != nil {
                previewLayer.session = session
                if !session.isRunning {
                    DispatchQueue.global(qos: .userInitiated).async { self.session.startRunning() }
                }
            } else {
                if session.isRunning {
                    DispatchQueue.global(qos: .userInitiated).async { self.session.stopRunning() }
                }
            }
        }

        func metadataOutput(_ output: AVCaptureMetadataOutput,
                            didOutput metadataObjects: [AVMetadataObject],
                            from connection: AVCaptureConnection) {
            guard let object = metadataObjects.first(where: { $0 is AVMetadataMachineReadableCodeObject }),
                  let code = object as? AVMetadataMachineReadableCodeObject,
                  let value = code.stringValue,
                  value != lastPayload else { return }
            lastPayload = value
            onQR?(value)
        }
    }
}
