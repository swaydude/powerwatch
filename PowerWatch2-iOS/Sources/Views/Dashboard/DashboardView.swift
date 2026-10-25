import SwiftUI

/// Mirrors `main/dashboard/DashboardFragment` + its `DashboardViewModel`s:
/// a realtime header, a day selector strip, then hour-resolution charts for
/// steps, calories, sleep, heart rate, power and temperature.
@MainActor
final class DashboardViewModel: ObservableObject {
    @Published var selectedDay: Date = Calendar.current.startOfDay(for: Date())
    @Published private(set) var day: DayPeriod?
    @Published private(set) var hours: [HourPeriod] = []
    @Published private(set) var sessions: [UserActivitySession] = []
    @Published private(set) var isLoading = false
    @Published var notice: String?

    private let environment: AppEnvironment

    init(environment: AppEnvironment) {
        self.environment = environment
    }

    var synchronizer: WatchSynchronizer { environment.synchronizer }
    var isSyncing: Bool { synchronizer.isSyncing }
    var realtimeHeartRate: Int? { environment.heartRate }
    var batteryPercent: Int? { synchronizer.batteryPercent }
    var isConnected: Bool { environment.activeTransport.isConnected }
    var lastSyncDate: Date? { synchronizer.lastSyncDate }

    var unit: UnitType { environment.user?.unitType ?? .metric }
    var hourFormat: HourFormat { environment.user?.timeFormatType ?? .twentyFour }
    var goals: GoalConfiguration { environment.goals }

    func load() async {
        isLoading = true
        defer { isLoading = false }
        let calendar = Calendar.current
        let start = calendar.startOfDay(for: selectedDay)
        let end = calendar.date(byAdding: .day, value: 1, to: start) ?? start
        let all = await environment.store.hourPeriods()
        let dayHours = all.filter { $0.startTime >= start && $0.startTime < end }
        hours = dayHours
        day = dayHours.isEmpty ? nil : PeriodAggregator.dayPeriod(from: dayHours)
        sessions = await environment.store.activitySessions(on: start, calendar: calendar)
    }

    func select(_ date: Date) {
        selectedDay = Calendar.current.startOfDay(for: date)
        Task { await load() }
    }

    func sync() async {
        await synchronizer.sync()
        await load()
        if let error = synchronizer.lastError {
            notice = error
        }
    }

    // MARK: Chart series (hour-of-day buckets, index == hour)

    func hourlySeries(keyPath: KeyPath<HourPeriod, Double>) -> [Double] {
        var series = [Double](repeating: 0, count: 24)
        for hour in hours where hour.hourInDay >= 0 && hour.hourInDay < 24 {
            series[hour.hourInDay] += hour[keyPath: keyPath]
        }
        return series
    }

    func hourlySeries(keyPath: KeyPath<HourPeriod, Int>) -> [Double] {
        var series = [Double](repeating: 0, count: 24)
        for hour in hours where hour.hourInDay >= 0 && hour.hourInDay < 24 {
            series[hour.hourInDay] += Double(hour[keyPath: keyPath])
        }
        return series
    }

    func hourlyAverages(keyPath: KeyPath<HourPeriod, Double>) -> [Double] {
        var totals = [Double](repeating: 0, count: 24)
        var counts = [Double](repeating: 0, count: 24)
        for hour in hours where hour.hourInDay >= 0 && hour.hourInDay < 24 {
            totals[hour.hourInDay] += hour[keyPath: keyPath]
            counts[hour.hourInDay] += Double(hour.minsInPeriod)
        }
        return (0..<24).map { counts[$0] > 0 ? totals[$0] / counts[$0] : 0 }
    }

    var walkingSteps: [Double] {
        var series = [Double](repeating: 0, count: 24)
        for hour in hours where hour.state == .walking {
            if hour.hourInDay >= 0 && hour.hourInDay < 24 { series[hour.hourInDay] += Double(hour.steps) }
        }
        return series
    }

    var restingSteps: [Double] {
        var series = [Double](repeating: 0, count: 24)
        for hour in hours where hour.state != .walking {
            if hour.hourInDay >= 0 && hour.hourInDay < 24 { series[hour.hourInDay] += Double(hour.steps) }
        }
        return series
    }

    var heartRateSeries: [Double] { hourlyAverages(keyPath: \.heartRate) }
    var skinTempSeries: [Double] { hourlyAverages(keyPath: \.skinTemp) }
    var caseTempSeries: [Double] { hourlyAverages(keyPath: \.caseTemp) }
    var bodyPowerSeries: [Double] { hourlySeries(keyPath: \.bodyPower) }
    var solarPowerSeries: [Double] { hourlySeries(keyPath: \.solarPower) }

    var stepProgress: Double {
        max(0, Double(day?.steps ?? 0) / Double(max(1, goals.steps)))
    }
}

struct DashboardRootView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @StateObject private var model: DashboardViewModel

    init() {
        _model = StateObject(wrappedValue: DashboardViewModel(environment: AppEnvironment.shared))
    }

    var body: some View {
        NavigationStack {
            DashboardView(model: model)
                .navigationTitle("Dashboard")
                .toolbar {
                    ToolbarItem(placement: .topBarTrailing) {
                        ConnectionBadge(environment: environment)
                    }
                }
                .refreshable { await model.sync() }
                .task { await model.load() }
        }
    }
}

private struct ConnectionBadge: View {
    @ObservedObject var environment: AppEnvironment

    var body: some View {
        HStack(spacing: 5) {
            Circle()
                .fill(environment.activeTransport.isConnected ? Color.green : Color.secondary)
                .frame(width: 8, height: 8)
            Text(environment.activeTransport.isConnected
                    ? (environment.transportKind == .simulated ? "Sim" : "Connected")
                    : "Offline")
                .font(.caption)
        }
        .padding(.horizontal, 8)
        .padding(.vertical, 4)
        .background(Color(.secondarySystemGroupedBackground), in: Capsule())
    }
}

private struct DashboardView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @ObservedObject var model: DashboardViewModel

    var body: some View {
        ScrollView {
            VStack(spacing: 14) {
                RealtimeCard(model: model)
                DayStrip(selected: $model.selectedDay) { model.select($0) }

                if let day = model.day {
                    SummaryGrid(model: model, day: day)
                    StepsCard(model: model, day: day)
                    CaloriesCard(model: model, day: day)
                    SleepCard(day: day, hourFormat: model.hourFormat)
                    HeartRateCard(model: model, day: day)
                    PowerCard(model: model, day: day)
                    TemperatureCard(model: model, day: day)
                    ActivitiesCard(model: model)
                } else {
                    Card {
                        EmptyStateView(
                            title: model.isSyncing ? "Syncing…" : "No data for \(Formatters.dayLabel(model.selectedDay))",
                            message: "Pull to sync, or keep the simulated watch connected to collect data.",
                            systemImage: "clock.arrow.circlepath",
                            actionTitle: model.isSyncing ? nil : "Sync now",
                            action: { Task { await model.sync() } }
                        )
                    }
                }
            }
            .padding(.horizontal)
            .padding(.bottom, 20)
        }
        .background(Color(.systemGroupedBackground))
        .toolbarRole(.automatic)
    }
}

// MARK: - Header

private struct RealtimeCard: View {
    @ObservedObject var model: DashboardViewModel
    /// The live values are published by the environment (`RealtimeDataProvider`'s 20 s tick),
    /// not by the model, so the card observes both.
    @EnvironmentObject private var environment: AppEnvironment

    /// `mapToRealTimeData` uses `periodsContainer.realtimeWatchData` when it is present and
    /// only otherwise falls back to the stored day periods — same rule here.
    private var live: Gen2InfoRecords.RealtimeData? {
        model.isConnected ? environment.realtimeData : nil
    }

    var body: some View {
        Card {
            VStack(alignment: .leading, spacing: 12) {
                HStack(alignment: .top) {
                    VStack(alignment: .leading, spacing: 4) {
                        Text(Formatters.fullDate(model.selectedDay))
                            .font(.headline)
                        if let last = model.synchronizer.lastSyncDate {
                            Text("Last sync \(Formatters.clock(last, format: model.hourFormat))")
                                .font(.caption).foregroundStyle(.secondary)
                        } else {
                            Text("Never synced").font(.caption).foregroundStyle(.secondary)
                        }
                    }
                    Spacer()
                    Button {
                        Task { await model.sync() }
                    } label: {
                        if model.isSyncing {
                            ProgressView().controlSize(.small)
                        } else {
                            Image(systemName: "arrow.clockwise")
                        }
                    }
                    .buttonStyle(.bordered)
                }

                if model.isSyncing {
                    VStack(alignment: .leading, spacing: 4) {
                        ProgressView(value: model.synchronizer.progress)
                        Text(model.synchronizer.statusMessage)
                            .font(.caption).foregroundStyle(.secondary)
                    }
                }

                HStack(spacing: 10) {
                    MiniStat(icon: "heart.fill", tint: .pink,
                             value: model.realtimeHeartRate.map(String.init) ?? "--",
                             caption: "BPM now")
                    MiniStat(icon: "bolt.fill", tint: .green,
                             value: live?.batteryPercent.map { "\(Int($0))%" }
                                ?? (model.batteryPercent.map { "\($0)%" } ?? "--"),
                             caption: "Battery")
                    MiniStat(icon: "figure.walk", tint: .blue,
                             value: Formatters.count(live?.totalSteps ?? model.day?.steps ?? 0),
                             caption: "Steps")
                    MiniStat(icon: "flame.fill", tint: .orange,
                             value: Formatters.count(live?.totalActiveCalories
                                ?? ((model.day?.activeCalories ?? 0) + (model.day?.bmrCalories ?? 0))),
                             caption: "kcal")
                }

                if let notice = model.notice {
                    Text(notice).font(.caption).foregroundStyle(.orange)
                }
            }
        }
    }
}

private struct MiniStat: View {
    let icon: String
    let tint: Color
    let value: String
    let caption: String

    var body: some View {
        VStack(spacing: 3) {
            Image(systemName: icon).font(.caption).foregroundStyle(tint)
            Text(value).font(.subheadline.weight(.semibold)).monospacedDigit()
            Text(caption).font(.caption2).foregroundStyle(.secondary)
        }
        .frame(maxWidth: .infinity)
        .padding(.vertical, 8)
        .background(Color(.tertiarySystemGroupedBackground), in: RoundedRectangle(cornerRadius: 12, style: .continuous))
    }
}

// MARK: - Day selector

struct DayStrip: View {
    @Binding var selected: Date
    var onSelect: (Date) -> Void

    private let calendar = Calendar.current

    var days: [Date] {
        let start = calendar.startOfDay(for: selected)
        return (-3...3).compactMap { calendar.date(byAdding: .day, value: $0, to: start) }
    }

    var body: some View {
        HStack(spacing: 0) {
            ForEach(days, id: \.self) { date in
                Button { onSelect(date) } label: {
                    VStack(spacing: 5) {
                        Text(Formatters.weekdayShort(date))
                            .font(.caption2)
                            .foregroundStyle(.secondary)
                        Text("\(calendar.component(.day, from: date))")
                            .font(.subheadline.weight(.semibold))
                            .monospacedDigit()
                        Circle()
                            .fill(calendar.isDate(date, inSameDayAs: selected) ? Color.accentColor : Color.clear)
                            .frame(width: 6, height: 6)
                    }
                    .frame(maxWidth: .infinity)
                    .padding(.vertical, 8)
                }
                .buttonStyle(.plain)
            }
        }
        .background(Color(.secondarySystemGroupedBackground), in: RoundedRectangle(cornerRadius: 14, style: .continuous))
    }
}

// MARK: - Metric cards

private struct SummaryGrid: View {
    @ObservedObject var model: DashboardViewModel
    let day: DayPeriod

    var body: some View {
        HStack(spacing: 10) {
            RingProgress(progress: model.stepProgress, tint: .blue, lineWidth: 8, diameter: 68)
                .overlay {
                    VStack(spacing: 0) {
                        Text(Formatters.count(day.steps)).font(.footnote.weight(.semibold)).monospacedDigit()
                        Text("steps").font(.caption2).foregroundStyle(.secondary)
                    }
                }
            VStack(spacing: 8) {
                MetricTile(title: "Distance",
                           value: String(format: "%.2f", Formatters.distanceValue(day.distance, unit: model.unit)),
                           unit: Formatters.distanceUnit(model.unit), icon: "location", tint: .blue)
                MetricTile(title: "Active minutes",
                           value: "\(day.hours.filter { $0.steps > 0 }.count)",
                           unit: "h", icon: "figure.mind.and.body", tint: .purple)
            }
        }
    }
}

private struct StepsCard: View {
    @ObservedObject var model: DashboardViewModel
    let day: DayPeriod

    var body: some View {
        Card {
            VStack(alignment: .leading, spacing: 10) {
                HStack {
                    SectionHeader(title: "Pedometer",
                                  subtitle: "\(Formatters.count(day.steps)) / \(Formatters.count(model.goals.steps))")
                    Spacer()
                    Text("by hour").font(.caption2).foregroundStyle(.tertiary)
                }
                BarChartView(values: model.walkingSteps, goal: Double(model.goals.steps) / 24, tint: .blue)
                ChartAxisLabels()
            }
        }
    }
}

private struct CaloriesCard: View {
    @ObservedObject var model: DashboardViewModel
    let day: DayPeriod

    var body: some View {
        Card {
            VStack(alignment: .leading, spacing: 10) {
                SectionHeader(title: "Calories",
                              subtitle: "Active \(Formatters.count(day.activeCalories)) · BMR \(Formatters.count(day.bmrCalories)) kcal")
                BarChartView(values: model.hourlySeries(keyPath: \.activeCalories), tint: .orange)
                HStack(spacing: 16) {
                    LegendDot(color: .orange, text: "Active")
                    LegendDot(color: .orange.opacity(0.4), text: "BMR")
                    Spacer()
                    Text("Goal \(Formatters.count(model.goals.calories)) kcal")
                        .font(.caption2).foregroundStyle(.secondary)
                }
            }
        }
    }
}

private struct SleepCard: View {
    let day: DayPeriod
    let hourFormat: HourFormat

    var body: some View {
        Card {
            VStack(alignment: .leading, spacing: 12) {
                SectionHeader(
                    title: "Sleep",
                    subtitle: "\(day.sleepingMinutes / 60)h \(day.sleepingMinutes % 60)m"
                )
                SleepStageBar(awake: day.awakeMinutes, restless: day.restlessMinutes,
                              light: day.lightMinutes, deep: day.deepMinutes)
                HStack {
                    LegendDot(color: Color(.systemGray3), text: "Awake \(day.awakeMinutes)m")
                    LegendDot(color: .orange, text: "Restless \(day.restlessMinutes)m")
                    LegendDot(color: Color.accentColor.opacity(0.55), text: "Light \(day.lightMinutes)m")
                    LegendDot(color: Color.accentColor, text: "Deep \(day.deepMinutes)m")
                }
                .font(.caption2)
                HStack {
                    if let bed = day.wentToBed {
                        Label(Formatters.clock(bed, format: hourFormat), systemImage: "moon.fill")
                    }
                    Spacer()
                    if let up = day.wokeUp {
                        Label(Formatters.clock(up, format: hourFormat), systemImage: "sun.max.fill")
                    }
                }
                .font(.caption).foregroundStyle(.secondary)
                LabeledContent("Sleep goal", value: Formatters.sleepGoal(8 * 60))
                    .font(.caption)
            }
        }
    }
}

private struct HeartRateCard: View {
    @ObservedObject var model: DashboardViewModel
    let day: DayPeriod

    var body: some View {
        Card {
            VStack(alignment: .leading, spacing: 10) {
                SectionHeader(title: "Heart rate",
                              subtitle: "Avg \(Int(day.avgHeartRate.rounded())) · Min \(day.minHeartRate) · Max \(day.maxHeartRate) bpm")
                LineChartView(values: model.heartRateSeries, range: 30...200, tint: .pink)
                ChartAxisLabels()
                LabeledContent("HRV", value: "\(Int(day.avgHRV.rounded())) ms")
                    .font(.caption)
            }
        }
    }
}

private struct PowerCard: View {
    @ObservedObject var model: DashboardViewModel
    let day: DayPeriod

    var body: some View {
        Card {
            VStack(alignment: .leading, spacing: 10) {
                SectionHeader(title: "Power", subtitle: "Generation vs consumption")
                HStack(spacing: 10) {
                    MetricTile(title: "From body", value: Formatters.powerValue(day.bodyPower),
                               unit: "µWh", icon: "bolt.heart.fill", tint: .green)
                    MetricTile(title: "From light", value: Formatters.powerValue(day.solarPower),
                               unit: "µWh", icon: "sun.max.fill", tint: .yellow)
                    MetricTile(title: "Consumed", value: Formatters.powerValue(day.bodyPower / 3 + day.solarPower / 4),
                               unit: "µWh", icon: "battery.50", tint: .red)
                }
                BarChartView(values: model.bodyPowerSeries, tint: .green, height: 96)
                BarChartView(values: model.solarPowerSeries, tint: .yellow, height: 96)
                HStack(spacing: 16) {
                    LegendDot(color: .green, text: "Thermal")
                    LegendDot(color: .yellow, text: "Solar")
                    Spacer()
                    Text("Goal \(Formatters.count(model.goals.power)) µWh")
                        .font(.caption2).foregroundStyle(.secondary)
                }
                .font(.caption2)
            }
        }
    }
}

private struct TemperatureCard: View {
    @ObservedObject var model: DashboardViewModel
    let day: DayPeriod

    var body: some View {
        Card {
            VStack(alignment: .leading, spacing: 10) {
                SectionHeader(title: "Temperature",
                              subtitle: "Skin \(Formatters.temperature(celsius: day.avgSkinTemp, unit: model.unit)) · "
                                + "Min \(Formatters.temperature(celsius: day.minSkinTemp, unit: model.unit)) · "
                                + "Max \(Formatters.temperature(celsius: day.maxSkinTemp, unit: model.unit))")
                LineChartView(values: model.skinTempSeries, range: 25...42, tint: .red)
                LineChartView(values: model.caseTempSeries, range: 25...42, tint: .teal)
                HStack(spacing: 16) {
                    LegendDot(color: .red, text: "Skin")
                    LegendDot(color: .teal, text: "Case")
                }
                .font(.caption2)
            }
        }
    }
}

private struct ActivitiesCard: View {
    @ObservedObject var model: DashboardViewModel

    var body: some View {
        Card(padding: 4) {
            VStack(alignment: .leading, spacing: 0) {
                HStack {
                    SectionHeader(title: "Activities")
                        .padding(.horizontal, 12)
                        .padding(.top, 10)
                    Spacer()
                }
                if model.sessions.isEmpty {
                    Text("No activity sessions recorded for this day.")
                        .font(.caption).foregroundStyle(.secondary)
                        .padding(12)
                } else {
                    ForEach(model.sessions) { session in
                        NavigationLink(value: Route.activityDetail(session.id)) {
                            HStack {
                                VStack(alignment: .leading, spacing: 2) {
                                    Text(session.name)
                                    Text(Formatters.clock(session.startTime, format: model.hourFormat)
                                        + " · " + Formatters.distance(session.distance, unit: model.unit)
                                        + " · " + Formatters.duration(session.duration))
                                        .font(.caption).foregroundStyle(.secondary)
                                }
                                Spacer()
                                Image(systemName: "chevron.right").font(.caption).foregroundStyle(.tertiary)
                            }
                            .padding(12)
                        }
                        Divider()
                    }
                }
            }
        }
        .navigationDestination(for: Route.self) { route in
            switch route {
            case .activityDetail(let id):
                ActivityDetailView(sessionID: id)
            case .history:
                HistoryView(day: model.selectedDay)
            }
        }
    }
}

// MARK: - Small chart helpers

private struct LegendDot: View {
    let color: Color
    let text: String

    var body: some View {
        HStack(spacing: 4) {
            Circle().fill(color).frame(width: 7, height: 7)
            Text(text).foregroundStyle(.secondary)
        }
    }
}

private struct ChartAxisLabels: View {
    var body: some View {
        HStack {
            ForEach(["00", "06", "12", "18", "24"], id: \.self) { label in
                Text(label).font(.caption2).foregroundStyle(.tertiary)
                if label != "24" { Spacer() }
            }
        }
    }
}

enum Route: Hashable {
    case activityDetail(String)
    case history
}
