import Foundation

/// English user-facing strings copied verbatim from the APK's `resources.arsc`
/// (default configuration), named after their `R.string` ids, so the port's copy
/// can be checked against the original screen for screen. Only strings the port
/// reproduces are listed.
///
/// Verified with
/// `aapt2 dump resources powerwatch.matrix.com.pwgen2android_1.5.6.apk`.
enum R {
    /// `string/scan_title` — `QRPairingFragment` header.
    static let scanTitle = "Scan your PowerWatch"
    /// `string/place_watch` — shown under the camera preview.
    static let placeWatch = "Place your PowerWatch in the circle to scan qr code"
    /// `string/cant_see_qr_code` — link to `QRCodeTutorialFragment`.
    static let cantSeeQRCode = "Can't see QR code?"
    /// `string/unable_to_enter_pairing_code_manually` — link to `EnterPinCodeFragment`.
    static let unableToScanQR = "Unable to scan QR code?"
    /// `string/enter_pairing_code` — `EnterPinCodeFragment` action.
    static let enterPairingCode = "Enter Pairing Code"
    /// `string/pairing_code_title` — `EnterPinCodeFragment` / `FragmentEnterPinCodeBinding`.
    static let pairingCodeTitle = "Pairing Code"
    /// `string/showing_qr_title` — `QRCodeTutorialFragment` header.
    static let showingQRTitle = "Showing the QR Code"
    /// `string/tutorial_step` — `"Step %d"` per tutorial step title.
    static let tutorialStepFormat = "Step %d"
    /// `string/tutorial_step_one_text`, with `{stepOne}` substituted by the
    /// artwork the layout puts in its place.
    static let tutorialStepOne = "Press {stepOne} button on the watch and keep pressing until you see Settings, displayed on the watch screen."
    /// `string/tutorial_step_two_text`
    static let tutorialStepTwo = "Press {stepTwo} button to enter Settings.\nShow QR option will be presented."
    /// `string/tutorial_step_three_text`
    static let tutorialStepThree = "Press {stepThree} button again to enter the Show QR option.\nThe QR code will now be displayed on the watch."
    /// `string/pairing_failed_hint` — `PairingFailedFragment` hint.
    static let pairingFailedHint = "Make sure your Powerwatch is powered on and displaying QR code"
    /// `R.string.searching_for_single_device`, formatted with the pairing code.
    static let searchingForSingleDevice = "Searching for %s"
    /// `R.string.searching_for_devices`
    static let searchingForDevices = "Searching for devices…"
    /// `R.string.connecting_to_device`
    static let connectingToDevice = "Connecting…"
    /// `R.string.saving_info`
    static let savingInfo = "Saving information…"
    /// `R.string.success`
    static let success = "Success"
    /// `R.string.pairing_success`
    static let pairingSuccess = "Pairing Success!"

    /// Java's `String.format` takes any object for `%s`; Foundation's `%s` wants a
    /// `char *`. Handing it a Swift `String` makes `__CFStringAppendFormatCore` run
    /// `strlen` on an Objective-C pointer, which segfaults the process — see the
    /// `PowerWatch2-2026-10-24-1316*` crash reports, main thread in
    /// `_platform_strlen` under `PairingViewModel.scan`. Anything formatted into an
    /// APK string that still carries `%s` goes through here.
    static func format(_ format: String, _ argument: String) -> String {
        argument.withCString { String(format: format, $0) }
    }

    /// The APK leaves the `{stepOne}`/`{stepTwo}`/`{stepThree}` placeholders in the
    /// text and overlays button artwork at runtime (`insertImageIntoText`). All three
    /// are the same control: the PowerWatch 2 has one side button, so the port names
    /// it instead of drawing it.
    static func tutorialStep(index: Int, text: String) -> String {
        let filled = ["{stepOne}", "{stepTwo}", "{stepThree}"]
            .reduce(text) { $0.replacingOccurrences(of: $1, with: "the side") }
        return String(format: tutorialStepFormat, index) + " — " + filled
    }
}
