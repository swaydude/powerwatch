import SwiftUI
import AVFoundation

/// Camera QR reader for the watch's pairing code.
///
/// The iOS counterpart of `pair/camera/` (`BarcodeTrackerFactory` + `MyTracker` on
/// top of the ML Kit barcode scanner) driven by `pair/ui/gen2/QRPairingFragment`.
/// The APK's `QRPairingViewModel.onQRCodeResolved(rawText)` is the callback here:
/// the *whole* QR text is handed back and `PairCode.extract` pulls the number out,
/// exactly as the original does.
///
/// Permission model: the camera is used only here, only while this view is on
/// screen, and nothing is recorded or stored — the frame never leaves the process.
struct QRScannerView: UIViewRepresentable {
    var onText: (String) -> Void
    var onUnavailable: (String) -> Void

    func makeCoordinator() -> Coordinator { Coordinator(onText: onText, onUnavailable: onUnavailable) }

    func makeUIView(context: Context) -> PreviewView {
        let view = PreviewView()
        view.previewLayer = context.coordinator.previewLayer
        view.layer.addSublayer(context.coordinator.previewLayer)
        context.coordinator.start()
        return view
    }

    func updateUIView(_ uiView: PreviewView, context: Context) {}

    static func dismantleUIView(_ uiView: PreviewView, coordinator: Coordinator) {
        coordinator.stop()
    }

    /// Draws the dimmed frame the APK shows ("Place your PowerWatch in the circle
    /// to scan qr code", `R.string.place_watch`).
    final class PreviewView: UIView {
        var previewLayer: AVCaptureVideoPreviewLayer?
        override func layoutSubviews() {
            super.layoutSubviews()
            previewLayer?.frame = bounds
            previewLayer?.videoGravity = .resizeAspectFill
        }
    }

    final class Coordinator: NSObject, AVCaptureMetadataOutputObjectsDelegate {
        private let session = AVCaptureSession()
        private let queue = DispatchQueue(label: "com.matrixindustries.powerwatch2.qr")
        let previewLayer: AVCaptureVideoPreviewLayer
        private let onText: (String) -> Void
        private let onUnavailable: (String) -> Void
        private var running = false

        init(onText: @escaping (String) -> Void, onUnavailable: @escaping (String) -> Void) {
            self.onText = onText
            self.onUnavailable = onUnavailable
            self.previewLayer = AVCaptureVideoPreviewLayer(session: session)
            super.init()
        }

        func start() {
            switch AVCaptureDevice.authorizationStatus(for: .video) {
            case .authorized: begin()
            case .notDetermined:
                AVCaptureDevice.requestAccess(for: .video) { granted in
                    DispatchQueue.main.async { granted ? self.begin() : self.onUnavailable("Camera access was declined.") }
                }
            case .denied, .restricted:
                onUnavailable("Camera access is off for PowerWatch2 (Settings ▸ Privacy & Security ▸ Camera), or this device has no back camera. Type the pairing code instead.")
            @unknown default:
                onUnavailable("The camera cannot be used here. Type the pairing code instead.")
            }
        }

        private func begin() {
            queue.async { [weak self] in
                guard let self, !self.running else { return }
                guard let device = AVCaptureDevice.default(.builtInWideAngleCamera, for: .video, position: .back),
                      let input = try? AVCaptureDeviceInput(device: device),
                      self.session.canAddInput(input) else {
                    DispatchQueue.main.async {
                        self.onUnavailable("No back camera is available. Type the pairing code instead.")
                    }
                    return
                }
                self.session.beginConfiguration()
                self.session.addInput(input)
                let output = AVCaptureMetadataOutput()
                if self.session.canAddOutput(output) {
                    self.session.addOutput(output)
                    output.setMetadataObjectsDelegate(self, queue: self.queue)
                    if output.availableMetadataObjectTypes.contains(.qr) {
                        output.metadataObjectTypes = [.qr]
                    }
                }
                self.session.commitConfiguration()
                self.running = true
                self.session.startRunning()   // blocking; off the main thread by design
            }
        }

        func stop() {
            queue.async { [weak self] in
                guard let self, self.running else { return }
                self.running = false
                self.session.stopRunning()
            }
        }

        func metadataOutput(_ output: AVCaptureMetadataOutput,
                            didOutput metadataObjects: [AVMetadataObject],
                            from connection: AVCaptureConnection) {
            guard let object = metadataObjects.first as? AVMetadataMachineReadableCodeObject,
                  let text = object.stringValue else { return }
            stop()
            DispatchQueue.main.async { self.onText(text) }
        }
    }
}
