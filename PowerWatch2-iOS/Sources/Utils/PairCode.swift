import Foundation

/// Extracts the numeric pairing code from the text encoded in the watch's QR
/// code, mirroring `pair/ui/gen2/QRPairingViewModel.extractQRCode`.
///
/// The PowerWatch 2 shows a multi-line text block as its QR code (see
/// `QRCodeTutorialFragment`: button ▸ Settings ▸ "Show QR"). The original parses
/// it as:
///
/// ```kotlin
/// val lines = qrCodeData.split("\n")
/// val pairCodeLine = lines.firstOrNull { it.contains("Pair code", true) }
/// if (pairCodeLine != null) return pairCodeLine.split(" ").last().toIntOrNull()
/// val urlLine = lines.firstOrNull { it.contains("open?", true) } ?: return null
/// return urlLine.split("?").getOrNull(1)?.split("=")?.getOrNull(1)?.toIntOrNull()
/// ```
///
/// Note the two behaviours that are easy to get wrong and are reproduced here: a
/// line mentioning "Pair code" that does not end in a number yields *no* code (the
/// `open?` fallback is only reached when no such line exists at all), and the
/// keyword matches case-insensitively while the `" "` split does not.
enum PairCode {

    static func extract(_ qrText: String) -> Int? {
        let lines = qrText.components(separatedBy: "\n")

        if let line = lines.first(where: { containsCaseInsensitive($0, "Pair code") }) {
            let parts = line.components(separatedBy: " ")
            return parts.last.flatMap { Int($0) }
        }

        guard let line = lines.first(where: { containsCaseInsensitive($0, "open?") }) else { return nil }
        let afterQuestion = line.components(separatedBy: "?").dropFirst().first
        guard let parameter = afterQuestion?.components(separatedBy: "=").dropFirst().first else { return nil }
        return Int(parameter)
    }

    /// `String.contains(other, ignoreCase = true)` as used by both keyword checks.
    private static func containsCaseInsensitive(_ haystack: String, _ needle: String) -> Bool {
        haystack.range(of: needle, options: .caseInsensitive) != nil
    }
}
