import SwiftUI

/// Design tokens for the PowerWatch app.
extension Color {
    /// Brand red (CTA buttons, accents) — the reference app's signature color.
    static let pwRed = Color(red: 0.91, green: 0.15, blue: 0.17)
    static let pwGreen = Color(red: 0.20, green: 0.72, blue: 0.35)
    static let pwCyan = Color(red: 0.13, green: 0.65, blue: 0.86)
    static let pwBlue = Color(red: 0.22, green: 0.39, blue: 0.90)
    static let pwYellow = Color(red: 0.95, green: 0.75, blue: 0.11)
    /// Android `temperature_color` (#ff9500).
    static let pwOrange = Color(red: 1.0, green: 0.58, blue: 0.0)
    /// Android `activity_heart_rate_color` (#ff2d55).
    static let pwPink = Color(red: 1.0, green: 0.18, blue: 0.33)
    static let pwBackground = Color(uiColor: .systemGroupedBackground)
}
