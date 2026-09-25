import SwiftUI
import Charts
import PowerWatchCore

/// Dashboard (T5.4/T5.5): period switcher, goal rings fed by synced log
/// data, live realtime card, and hour-of-day charts. Data comes from the
/// local period tables; realtime values stream from the watch (9104).
struct DashboardView: View {
    @Environment(AppModel.self) private var model
    @Environment(SyncController.self) private var sync

    /// Pairing sheet (Android `PairCodeEntry`: QR camera + manual code).
    @State private var showingPairSheet = false
    /// Which companion series the day view shows next to the steps chart —
    /// Android's chart tabs are `steps_calories` and `sleep_heartrate`.
    @State private var dayChart: DayChart = .stepsCalories

    enum DayChart: String, CaseIterable, Identifiable {
        case stepsCalories = "Steps + Calories"
        case sleepHeartRate = "Sleep + Heartrate"
        var id: String { rawValue }
    }

    var body: some View {
        NavigationStack {
            ScrollView {
                VStack(spacing: 20) {
                    connectionBanner
                    realtimeCard
                    goalRings
                    summaryTiles
                    stepsChart
                    combinedCharts
                    heartRateCard
                    heartRateChart
                    sleepChart
                    powerCard
                    powerChart
                    temperatureCard
                    temperatureChart
                }
                .padding()
            }
            .refreshable {
                await sync.refreshSync()
                model.loadDashboard()
            }
            .background(Color.pwBackground)
            .navigationTitle("MATRIX")
            .onAppear { model.loadDashboard() }
            .sheet(isPresented: $showingPairSheet) {
                QRScannerView()
            }
        }
    }

    @ViewBuilder
    private var connectionBanner: some View {
        if model.device == nil {
            HStack(spacing: 10) {
                Image(systemName: "applewatch")
                    .foregroundStyle(.secondary)
                Text("No watch connected")
                    .font(.subheadline)
                Spacer()
                Button {
                    showingPairSheet = true
                } label: {
                    Text("Pair")
                        .font(.subheadline.weight(.semibold))
                }
                .accessibilityIdentifier("dashboard.pairLink")
            }
            .padding(12)
            .background(.fill, in: RoundedRectangle(cornerRadius: 12))
            .accessibilityIdentifier("dashboard.noWatch")
        } else if let error = sync.lastError {
            Label(error, systemImage: "exclamationmark.triangle")
                .font(.subheadline)
                .foregroundStyle(.orange)
                .padding(12)
                .frame(maxWidth: .infinity, alignment: .leading)
                .background(.fill, in: RoundedRectangle(cornerRadius: 12))
        }
    }

    /// Live values from the watch's realtime command (9104), T5.5.
    @ViewBuilder
    private var realtimeCard: some View {
        if let realtime = sync.liveData {
            HStack {
                RealtimeStat(title: "Steps", value: "\(realtime.currentSteps)", icon: "figure.walk")
                RealtimeStat(title: "Calories", value: "\(realtime.currentCalories)", icon: "flame")
                RealtimeStat(title: "Distance", value: realtimeDistance(realtime), icon: "point.topleft.down.curvedto.point.bottomright.up")
            }
            .padding(12)
            .background(.fill, in: RoundedRectangle(cornerRadius: 12))
            .accessibilityIdentifier("dashboard.realtime")
        }
    }

    /// The watch's own day totals (`00002a25`), preferred over the sum of dated
    /// log minutes. Android does the same (`RealTimeDataProviderImpl` serves
    /// live values while the link is up), and the logs can only lag: a block the
    /// watch gave no RTL time for is deliberately left on the watch rather than
    /// guessed at.
    private var liveTotals: LiveTotals? {
        sync.liveTotals
    }

    private var goalRings: some View {
        let summary = model.summary
        let live = liveTotals
        let steps = live?.totalSteps ?? summary?.steps ?? 0
        let activeCalories = live?.activeCalories ?? summary?.activeCalories ?? 0
        let sleepMinutes = live?.sleepMinutes ?? summary?.sleepMinutes ?? 0
        return HStack(spacing: 8) {
            GoalRing(
                title: "STEPS", value: Double(steps),
                goal: max(Double(model.goals.steps), 1),
                color: .pwGreen, valueText: "\(steps)",
                diameter: 78)
            GoalRing(
                title: "CALORIES", value: Double(activeCalories),
                goal: max(Double(model.goals.calories), 1),
                color: .pwCyan, valueText: "\(activeCalories)",
                diameter: 78)
            GoalRing(
                title: "SLEEP", value: Double(sleepMinutes),
                goal: max(Double(model.goals.sleep), 1),
                color: .pwBlue, valueText: sleepText(sleepMinutes),
                diameter: 78)
            // The one ring that cannot be live: `00002a25` reports solar/thermal
            // generation as an instantaneous µW rate, while this ring (and the
            // goal) is accumulated µWh over the day — Android has no live power
            // figure on its dashboard either.
            GoalRing(
                title: "POWER", value: summary?.generatedPowerMWh ?? 0,
                goal: max(Double(model.goals.power), 1),
                color: .pwYellow, valueText: "\(Int(summary?.generatedPowerMWh ?? 0))",
                diameter: 78)
        }
        .frame(maxWidth: .infinity)
        .accessibilityIdentifier("dashboard.rings")
    }

    private var summaryTiles: some View {
        let summary = model.summary
        let distance = Double(liveTotals?.distanceMetres ?? Int(summary?.distance ?? 0))
        return LazyVGrid(columns: [GridItem(.flexible()), GridItem(.flexible())], spacing: 12) {
            Tile(title: "Distance", value: distanceText(distance))
            Tile(title: "Walking Time", value: minutesText(summary?.walkingMinutes ?? 0))
            Tile(title: "Resting HR", value: summary.map { $0.heartRate > 0 ? String(format: "%.0f bpm", $0.heartRate) : "—" } ?? "—")
            Tile(title: "Deep Sleep", value: minutesText(summary?.sleepByType[.deep] ?? 0))
            // Android's calories card splits active vs BMR — show both.
            Tile(title: "BMR Calories", value: "\(summary?.bmrCalories ?? 0) kcal")
            Tile(title: "Max HR", value: summary.map { $0.maxHeartRate > 0 ? "\($0.maxHeartRate) bpm" : "—" } ?? "—")
        }
    }

    @ViewBuilder
    private var stepsChart: some View {
        if let summary = model.summary {
            ChartPanel(title: "Steps by Hour") {
                Chart(0..<24, id: \.self) { hour in
                    BarMark(
                        x: .value("Hour", hour),
                        y: .value("Steps", summary.stepsByHour[hour]))
                }
                .foregroundStyle(Color.pwGreen)
            }
        }
    }

    /// The companion half of Android's combined day charts. Each series keeps
    /// its own axis (steps and calories are different orders of magnitude), so
    /// the two bands sit under one toggle instead of sharing a scale.
    @ViewBuilder
    private var combinedCharts: some View {
        if let summary = model.summary {
            VStack(spacing: 12) {
                Picker("Chart", selection: $dayChart) {
                    ForEach(DayChart.allCases) { chart in
                        Text(chart.rawValue).tag(chart)
                    }
                }
                .pickerStyle(.segmented)
                .accessibilityIdentifier("dashboard.dayChart")

                if dayChart == .stepsCalories {
                    ChartPanel(title: "Calories by Hour") {
                        Chart(0..<24, id: \.self) { hour in
                            BarMark(
                                x: .value("Hour", hour),
                                y: .value("Calories", summary.caloriesByHour[hour]))
                        }
                        .foregroundStyle(Color.pwCyan)
                    }
                } else {
                    ChartPanel(title: "Sleep + Heart Rate") {
                        Chart {
                            ForEach(0..<24, id: \.self) { hour in
                                BarMark(
                                    x: .value("Hour", hour),
                                    y: .value("Minutes", summary.sleepByHour[hour]))
                                    .foregroundStyle(Color.pwBlue)
                            }
                            ForEach(0..<24, id: \.self) { hour in
                                LineMark(
                                    x: .value("Hour", hour),
                                    y: .value("Heart Rate", summary.heartRateByHour[hour]))
                                    .foregroundStyle(Color.pwGreen)
                            }
                        }
                    }
                }
            }
        }
    }

    /// Android's heart-rate card: average, range and HRV.
    @ViewBuilder
    private var heartRateCard: some View {
        if let summary = model.summary, summary.maxHeartRate > 0 {
            VStack(alignment: .leading, spacing: 8) {
                Text("Heart Rate")
                    .font(.caption.weight(.semibold))
                    .foregroundStyle(.secondary)
                HStack {
                    StatColumn(title: "Avg HR",
                               value: String(format: "%.0f bpm", summary.heartRate))
                    StatColumn(title: "Range",
                               value: summary.minHeartRate > 0
                                    ? "\(summary.minHeartRate)–\(summary.maxHeartRate)"
                                    : "\(summary.maxHeartRate)")
                    StatColumn(title: "HRV",
                               value: summary.hrv > 0
                                    ? String(format: "%.0f", summary.hrv) : "—")
                }
            }
            .padding(12)
            .frame(maxWidth: .infinity, alignment: .leading)
            .background(.fill, in: RoundedRectangle(cornerRadius: 12))
            .accessibilityIdentifier("dashboard.heartRate")
        }
    }

    @ViewBuilder
    private var heartRateChart: some View {
        if let summary = model.summary,
           !summary.hrRangeByHour.isEmpty {
            ChartPanel(title: "Heart Rate by Hour") {
                Chart(summary.hrRangeByHour) { range in
                    BarMark(
                        x: .value("Hour", range.hour),
                        yStart: .value("Min", range.low),
                        yEnd: .value("Max", range.high))
                }
                .foregroundStyle(Color.pwPink)
            }
        }
    }

    /// Android's power card — thermoelectric generation "FROM BODY / FROM
    /// LIGHT" in µWh over the selected period (current_state screen).
    @ViewBuilder
    private var powerCard: some View {
        if let summary = model.summary {
            VStack(alignment: .leading, spacing: 8) {
                Text("Power Generation")
                    .font(.caption.weight(.semibold))
                    .foregroundStyle(.secondary)
                HStack {
                    StatColumn(title: "From Body", value: powerText(summary.bodyPowerMWh))
                    StatColumn(title: "From Light", value: powerText(summary.solarPowerMWh))
                    StatColumn(title: "Generated", value: powerText(summary.generatedPowerMWh))
                }
            }
            .padding(12)
            .frame(maxWidth: .infinity, alignment: .leading)
            .background(.fill, in: RoundedRectangle(cornerRadius: 12))
            .accessibilityIdentifier("dashboard.power")
        }
    }

    @ViewBuilder
    private var powerChart: some View {
        if let summary = model.summary,
           summary.generatedPowerMWh > 0 {
            ChartPanel(title: "Power by Hour") {
                Chart(0..<24, id: \.self) { hour in
                    BarMark(
                        x: .value("Hour", hour),
                        y: .value("µWh", summary.powerMWhByHour[hour]))
                }
                .foregroundStyle(Color.pwYellow)
            }
        }
    }

    /// Android's temperature card: current, average and min–max skin temp.
    @ViewBuilder
    private var temperatureCard: some View {
        if let summary = model.summary, summary.maxSkinTemp > 0 {
            VStack(alignment: .leading, spacing: 8) {
                Text("Temperature")
                    .font(.caption.weight(.semibold))
                    .foregroundStyle(.secondary)
                HStack {
                    StatColumn(title: "Current",
                               value: summary.currentSkinTemp > 0
                                    ? tempText(summary.currentSkinTemp) : "—")
                    StatColumn(title: "Average",
                               value: summary.avgSkinTemp > 0
                                    ? tempText(summary.avgSkinTemp) : "—")
                    StatColumn(title: "Range",
                               value: summary.minSkinTemp > 0 && summary.maxSkinTemp > 0
                                    ? "\(tempText(summary.minSkinTemp))–\(tempText(summary.maxSkinTemp))"
                                    : "—")
                }
            }
            .padding(12)
            .frame(maxWidth: .infinity, alignment: .leading)
            .background(.fill, in: RoundedRectangle(cornerRadius: 12))
            .accessibilityIdentifier("dashboard.temperature")
        }
    }

    @ViewBuilder
    private var temperatureChart: some View {
        if let summary = model.summary,
           !summary.tempRangeByHour.isEmpty {
            ChartPanel(title: "Hourly Temperature Range") {
                Chart(summary.tempRangeByHour) { range in
                    BarMark(
                        x: .value("Hour", range.hour),
                        yStart: .value("Min", range.low),
                        yEnd: .value("Max", range.high))
                }
                .foregroundStyle(Color.pwOrange)
            }
        }
    }

    @ViewBuilder
    private var sleepChart: some View {
        if let summary = model.summary {
            ChartPanel(title: "Sleep by Hour") {
                Chart(0..<24, id: \.self) { hour in
                    BarMark(
                        x: .value("Hour", hour),
                        y: .value("Minutes", summary.sleepByHour[hour]))
                }
                .foregroundStyle(Color.pwBlue)
            }
        }
    }

    // MARK: Formatting

    private func realtimeDistance(_ realtime: RealtimeData) -> String {
        distanceText(Double(realtime.currentDistance))
    }

    private func distanceText(_ meters: Double) -> String {
        if model.user?.accountSettings.unitType == .imperial {
            return String(format: "%.2f mi", meters / 1000 * 0.621371)
        }
        return String(format: "%.2f km", meters / 1000)
    }

    private func sleepText(_ minutes: Int) -> String {
        String(format: "%dh%02d", minutes / 60, minutes % 60)
    }

    private func powerText(_ mWh: Double) -> String {
        mWh >= 1000 ? String(format: "%.2f mWh", mWh / 1000)
                    : String(format: "%.0f µWh", mWh)
    }

    private func tempText(_ celsius: Float) -> String {
        if model.user?.accountSettings.unitType == .imperial {
            return String(format: "%.1f°F", celsius * 9 / 5 + 32)
        }
        return String(format: "%.1f°C", celsius)
    }

    private func minutesText(_ minutes: Int) -> String {
        minutes >= 60 ? String(format: "%dh %02dm", minutes / 60, minutes % 60) : "\(minutes)m"
    }
}

/// One live value in the realtime card.
struct RealtimeStat: View {
    let title: String
    let value: String
    let icon: String

    var body: some View {
        VStack(spacing: 4) {
            Image(systemName: icon)
                .foregroundStyle(.secondary)
            Text(value)
                .font(.headline.weight(.semibold))
                .monospacedDigit()
                .minimumScaleFactor(0.6)
                .lineLimit(1)
            Text(title)
                .font(.caption2)
                .foregroundStyle(.secondary)
        }
        .frame(maxWidth: .infinity)
    }
}

/// One labelled value in a metric card row (HR / temperature / power cards).
struct StatColumn: View {
    let title: String
    let value: String

    var body: some View {
        VStack(spacing: 4) {
            Text(value)
                .font(.headline.weight(.semibold))
                .monospacedDigit()
                .minimumScaleFactor(0.6)
                .lineLimit(1)
            Text(title)
                .font(.caption2)
                .foregroundStyle(.secondary)
        }
        .frame(maxWidth: .infinity)
    }
}

/// A titled card wrapping a Swift Charts view.
struct ChartPanel<Content: View>: View {
    let title: String
    @ViewBuilder var content: Content

    var body: some View {
        VStack(alignment: .leading, spacing: 8) {
            Text(title)
                .font(.caption.weight(.semibold))
                .foregroundStyle(.secondary)
            content
                .frame(height: 140)
        }
        .padding(12)
        .background(.fill, in: RoundedRectangle(cornerRadius: 12))
        .frame(maxWidth: .infinity, alignment: .leading)
    }
}

/// Circular progress ring around a value.
struct GoalRing: View {
    let title: String
    let value: Double
    let goal: Double
    let color: Color
    let valueText: String
    var diameter: CGFloat = 104

    private var fraction: Double { min(value / goal, 1) }

    var body: some View {
        VStack(spacing: 6) {
            ZStack {
                Circle()
                    .stroke(color.opacity(0.2), lineWidth: 8)
                Circle()
                    .trim(from: 0, to: fraction)
                    .stroke(color, style: StrokeStyle(lineWidth: 8, lineCap: .round))
                    .rotationEffect(.degrees(-90))
                Text(valueText)
                    .font(.title3.weight(.semibold))
                    .monospacedDigit()
                    .minimumScaleFactor(0.6)
                    .lineLimit(1)
            }
            .frame(width: diameter, height: diameter)
            Text(title)
                .font(.caption.weight(.semibold))
                .foregroundStyle(.secondary)
        }
    }
}

struct Tile: View {
    let title: String
    let value: String

    var body: some View {
        VStack(alignment: .leading, spacing: 4) {
            Text(title)
                .font(.caption)
                .foregroundStyle(.secondary)
            Text(value)
                .font(.title3.weight(.semibold))
                .monospacedDigit()
        }
        .frame(maxWidth: .infinity, alignment: .leading)
        .padding(12)
        .background(.fill, in: RoundedRectangle(cornerRadius: 12))
    }
}
