import Foundation
import UserNotifications
import Observation
import PowerWatchCore

/// Phone-side local notifications (Android `shared/localNotifications` +
/// `main/battery/BatteryNotificationCenter`): the three switches of
/// `NotificationSettingsFragment` (connection / battery / goals), plus the
/// per-day goal-hit marker. Offline by construction — UNUserNotificationCenter
/// never leaves the device.
@MainActor
@Observable
final class NotificationController {

    private let defaults: UserDefaults
    private(set) var isAuthorized = false
    /// True once the permission prompt has been shown (so the UI can show a
    /// "enable in Settings" hint instead of prompting again).
    private(set) var hasRequestedAuthorization = false

    // MARK: Switches (Android connection/battery/goals persistence)
    // Plain stored properties (the `@Observable` macro's accessors must own
    // the write path — a custom `didSet` interferes with change tracking);
    // persistence goes through the explicit setters below.

    private(set) var connectionEnabled = true
    private(set) var batteryEnabled = true
    private(set) var goalsEnabled = true

    func setConnectionEnabled(_ enabled: Bool) {
        connectionEnabled = enabled
        defaults.set(enabled, forKey: Self.connectionKey)
    }
    func setBatteryEnabled(_ enabled: Bool) {
        batteryEnabled = enabled
        defaults.set(enabled, forKey: Self.batteryKey)
    }
    func setGoalsEnabled(_ enabled: Bool) {
        goalsEnabled = enabled
        defaults.set(enabled, forKey: Self.goalsKey)
    }

    init(defaults: UserDefaults = .standard) {
        self.defaults = defaults
        self.connectionEnabled = defaults.object(forKey: Self.connectionKey) as? Bool ?? true
        self.batteryEnabled = defaults.object(forKey: Self.batteryKey) as? Bool ?? true
        self.goalsEnabled = defaults.object(forKey: Self.goalsKey) as? Bool ?? true
    }

    private static let connectionKey = "pw.notify.connection"
    private static let batteryKey = "pw.notify.battery"
    private static let goalsKey = "pw.notify.goals"
    private static let batteryLevelKey = "pw.notify.batteryLevel"
    private static let goalHitPrefix = "pw.notify.hit."

    /// Asked once when a switch is first turned on (Android asks during
    /// onboarding; iOS idiom is to prompt on the enabling action).
    func requestAuthorization() async {
        hasRequestedAuthorization = true
        let center = UNUserNotificationCenter.current()
        isAuthorized = (try? await center.requestAuthorization(options: [.alert, .sound])) ?? false
    }

    // MARK: Events (strings ported from Android strings.xml)

    func watchConnected() {
        guard connectionEnabled else { return }
        post(title: "Connected", body: "Your watch is now connected. Enjoy your PW2!")
    }

    func watchDisconnected() {
        guard connectionEnabled else { return }
        post(title: "Disconnected",
             body: "Your watch has been disconnected. Please check airplane mode on your watch and Bluetooth status on your phone")
    }

    /// Watch battery percent from the sync pull. Notifies only when the
    /// reading drops to a worse band than the last stored one (Android
    /// `BatteryChangeLevel`: critical ≤ 5 %, low ≤ 10 %).
    func batteryLevel(_ percent: Int) {
        guard batteryEnabled, percent > 0 else { return }
        let previous = band(for: defaults.object(forKey: Self.batteryLevelKey) as? Int ?? 100)
        defaults.set(percent, forKey: Self.batteryLevelKey)
        let current = band(for: percent)
        guard current.rank > previous.rank else { return }
        switch current {
        case .low:
            post(title: "Battery Status",
                 body: "Your PowerWatch 2 battery is low - \(percent)%")
        case .critical:
            post(title: "Battery Status",
                 body: "Your PowerWatch 2 battery is critical - \(percent)%")
        case .normal:
            break
        }
    }

    /// Compares the day's totals with the goals; each achievement notifies
    /// once per day (Android `GoalsNotificationPersistence.isGoalsHit`).
    func goalsAchieved(summary: DashboardSummary, goals: GoalConfiguration,
                       imperialUnits: Bool, calendar: Calendar = .current) {
        guard goalsEnabled else { return }
        let today = Self.dayKey(calendar: calendar)
        func fireOnce(_ type: String, _ body: String) {
            let key = Self.goalHitPrefix + type
            guard defaults.string(forKey: key) != today else { return }
            defaults.set(today, forKey: key)
            post(title: "Goal achieved!", body: body)
        }
        if goals.steps > 0, summary.steps >= goals.steps {
            fireOnce("steps", "Daily target of \(goals.steps) steps reached!")
        }
        if goals.calories > 0, summary.activeCalories >= goals.calories {
            fireOnce("calories",
                     "Daily target of \(goals.calories)\(imperialUnits ? " Cal" : " kcal") reached!")
        }
        if goals.sleep > 0, summary.sleepMinutes >= goals.sleep {
            fireOnce("sleep",
                     String(format: "Daily target of %dh%02dm sleep reached!",
                            goals.sleep / 60, goals.sleep % 60))
        }
        if goals.power > 0, summary.generatedPowerMWh >= Double(goals.power) {
            fireOnce("power", "Daily target of \(goals.power)µWh reached!")
        }
    }

    // MARK: Private

    private enum Band: Int {
        case normal = 0, low, critical

        var rank: Int { rawValue }
    }

    private func band(for percent: Int) -> Band {
        if percent <= 5 { return .critical }
        if percent <= 10 { return .low }
        return .normal
    }

    private static func dayKey(calendar: Calendar) -> String {
        let c = calendar.dateComponents([.year, .month, .day], from: .now)
        return "\(c.year ?? 0)-\(c.month ?? 0)-\(c.day ?? 0)"
    }

    private func post(title: String, body: String) {
        guard isAuthorized else { return }
        let content = UNMutableNotificationContent()
        content.title = title
        content.body = body
        let request = UNNotificationRequest(identifier: UUID().uuidString,
                                            content: content, trigger: nil)
        UNUserNotificationCenter.current().add(request)
    }
}
