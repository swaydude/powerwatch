import SwiftUI

/// Mirrors the History feature (`main/dashboard` day drill-down +
/// `UserActivitySession` screens): a per-day list, a detail page, an editor and
/// GPX/TCX export.
struct HistoryView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @State var day: Date
    @State private var sessions: [UserActivitySession] = []
    @State private var isLoading = false

    init(day: Date = Date()) {
        _day = State(initialValue: Calendar.current.startOfDay(for: day))
    }

    var body: some View {
        List {
            Section {
                DayStrip(selected: $day) { _ = $0; Task { await load() } }
                    .listRowInsets(EdgeInsets())
                    .listRowBackground(Color.clear)
            }
            Section("Sessions · \(Formatters.dayLabel(day))") {
                if isLoading {
                    HStack { ProgressView(); Spacer() }
                } else if sessions.isEmpty {
                    Text("No sessions for this day.")
                        .foregroundStyle(.secondary)
                } else {
                    ForEach(sessions) { session in
                        NavigationLink(value: Route.activityDetail(session.id)) {
                            SessionRow(session: session, unit: environment.user?.unitType ?? .metric,
                                       hourFormat: environment.user?.timeFormatType ?? .twentyFour)
                        }
                    }
                    .onDelete(perform: delete)
                }
            }
        }
        .navigationTitle("History")
        .task { await load() }
        .navigationDestination(for: Route.self) { route in
            switch route {
            case .activityDetail(let id): ActivityDetailView(sessionID: id)
            case .history: HistoryView(day: day)
            }
        }
    }

    private func load() async {
        isLoading = true
        defer { isLoading = false }
        sessions = await environment.store.activitySessions(on: day, calendar: .current)
    }

    private func delete(at offsets: IndexSet) {
        Task {
            for index in offsets {
                try? await environment.cloud.deleteSession(id: sessions[index].id)
            }
            await load()
        }
    }
}

private struct SessionRow: View {
    let session: UserActivitySession
    let unit: UnitType
    let hourFormat: HourFormat

    var body: some View {
        HStack(spacing: 12) {
            Image(systemName: icon)
                .font(.title3)
                .foregroundStyle(Color.accentColor)
                .frame(width: 28)
            VStack(alignment: .leading, spacing: 3) {
                Text(session.name).font(.headline)
                Text("\(Formatters.clock(session.startTime, format: hourFormat)) · "
                        + Formatters.distance(session.distance, unit: unit)
                        + " · " + Formatters.duration(session.duration))
                    .font(.caption).foregroundStyle(.secondary)
            }
            Spacer()
        }
        .padding(.vertical, 2)
    }

    private var icon: String {
        switch session.activityType {
        case .outdoorWalk, .indoorWalk: return "figure.walk"
        case .outdoorJog, .indoorJog, .outdoorRun, .indoorRun: return "figure.run"
        case .outdoorCycle, .indoorCycle: return "figure.outdoor.cycle"
        case .intervalTraining: return "figure.highintensity.intervaltraining"
        case .driving: return "car.fill"
        case .stationary: return "figure.mind.and.body"
        case .unknown: return "questionmark.circle"
        }
    }
}

/// `UserActivitySessionActivity` detail: date/time, distance, pace, speed,
/// elevation, calories, heart rate and location, plus export/edit/delete.
struct ActivityDetailView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @Environment(\.dismiss) private var dismiss
    let sessionID: String

    @State private var session: UserActivitySession?
    @State private var showEditor = false
    @State private var showDeleteConfirmation = false

    var body: some View {
        Group {
            if let session {
                DetailContent(session: session,
                              unit: environment.user?.unitType ?? .metric,
                              hourFormat: environment.user?.timeFormatType ?? .twentyFour)
                    .navigationTitle(session.name)
                    .toolbar {
                        ToolbarItem(placement: .topBarTrailing) {
                            Menu {
                                NavigationLink {
                                    EditActivityView(session: session) {
                                        Task { self.session = await environment.store.activitySession(id: sessionID) }
                                    }
                                } label: {
                                    Label("Edit", systemImage: "pencil")
                                }
                                ActivityShareButton(session: session)
                                Button("Delete", role: .destructive) { showDeleteConfirmation = true }
                            } label: {
                                Image(systemName: "ellipsis.circle")
                            }
                        }
                    }
            } else {
                ProgressView()
            }
        }
        .task { session = await environment.store.activitySession(id: sessionID) }
        .confirmationDialog("Delete this activity?", isPresented: $showDeleteConfirmation, titleVisibility: .visible) {
            Button("Delete", role: .destructive) {
                Task {
                    // Was `GET /pwuser/activitySession/delete?id=` in the cloud build.
                    try? await environment.cloud.deleteSession(id: sessionID)
                    dismiss()
                }
            }
        }
    }
}

private struct DetailContent: View {
    let session: UserActivitySession
    let unit: UnitType
    let hourFormat: HourFormat

    var body: some View {
        ScrollView {
            VStack(spacing: 14) {
                Card {
                    VStack(alignment: .leading, spacing: 12) {
                        HStack {
                            VStack(alignment: .leading) {
                                Text(Formatters.fullDate(session.startTime)).font(.headline)
                                Text("\(Formatters.clock(session.startTime, format: hourFormat)) – "
                                        + Formatters.clock(session.endTime, format: hourFormat))
                                    .font(.caption).foregroundStyle(.secondary)
                            }
                            Spacer()
                            Image(systemName: "mappin.circle")
                                .font(.title2).foregroundStyle(.secondary)
                        }
                        HStack(spacing: 10) {
                            MetricTile(title: "Distance",
                                       value: String(format: "%.2f", Formatters.distanceValue(session.distance, unit: unit)),
                                       unit: Formatters.distanceUnit(unit), icon: "road.lanes")
                            MetricTile(title: "Duration", value: Formatters.duration(session.duration),
                                       icon: "clock")
                            MetricTile(title: "Steps", value: Formatters.count(session.steps), icon: "figure.walk")
                        }
                    }
                }

                Card {
                    VStack(alignment: .leading, spacing: 2) {
                        SectionHeader(title: "Summary").padding(.bottom, 4)
                        StatRow(label: "Activity type", value: session.activityType.displayName)
                        StatRow(label: "Avg pace",
                                value: Formatters.pace(distance: session.distance, duration: session.duration, unit: unit))
                        StatRow(label: "Avg speed",
                                value: Formatters.speed(distance: session.distance, duration: session.duration, unit: unit)
                                    + " " + Formatters.speedUnit(unit))
                        StatRow(label: "Elevation gain", value: String(format: "%.0f m", session.totalAscended))
                        StatRow(label: "Elevation loss", value: String(format: "%.0f m", session.totalDescended))
                        StatRow(label: "Active calories", value: Formatters.calories(session.activeCalories))
                        StatRow(label: "BMR calories", value: Formatters.calories(session.bmrCalories))
                        StatRow(label: "Avg heart rate",
                                value: session.heartRates.isEmpty ? "--"
                                    : "\(Int(Double(session.heartRates.reduce(0) { $0 + $1.value }) / Double(session.heartRates.count))) bpm")
                        StatRow(label: "Max heart rate",
                                value: session.heartRates.map(\.value).max().map { "\($0) bpm" } ?? "--")
                        StatRow(label: "Location", value: session.locationName.isEmpty
                                ? (session.gpsPositions.first.map { String(format: "%.5f, %.5f", $0.latitude, $0.longitude) } ?? "None")
                                : session.locationName)
                    }
                }

                if !session.heartRates.isEmpty {
                    Card {
                        VStack(alignment: .leading, spacing: 8) {
                            SectionHeader(title: "Heart rate")
                            LineChartView(values: session.heartRates.map { Double($0.value) },
                                          range: 40...200, tint: .pink)
                        }
                    }
                }

                if !session.splits.isEmpty {
                    Card {
                        VStack(alignment: .leading, spacing: 2) {
                            SectionHeader(title: "Splits").padding(.bottom, 4)
                            ForEach(session.splits.indices, id: \.self) { index in
                                StatRow(label: "Split \(index + 1)",
                                        value: Formatters.duration(session.splits[index].splitDuration))
                            }
                        }
                    }
                }

                Card {
                    VStack(alignment: .leading, spacing: 6) {
                        SectionHeader(title: "Notes")
                        Text(session.notes.isEmpty ? "No notes." : session.notes)
                            .font(.subheadline)
                            .foregroundStyle(session.notes.isEmpty ? .secondary : .primary)
                    }
                }

                // Google Maps / Baidu Maps are removed from this build, so the
                // track is summarised numerically instead of rendered as tiles.
                Card {
                    VStack(alignment: .leading, spacing: 6) {
                        SectionHeader(title: "Track", subtitle: "Map tiles removed with the network layer")
                        Text("\(session.gpsPositions.count) positions")
                            .font(.caption).foregroundStyle(.secondary)
                        if let first = session.gpsPositions.first, let last = session.gpsPositions.last {
                            Text("Start \(String(format: "%.5f, %.5f", first.latitude, first.longitude)) → End \(String(format: "%.5f, %.5f", last.latitude, last.longitude))")
                                .font(.caption2).foregroundStyle(.secondary)
                        }
                        TrackPreview(positions: session.gpsPositions)
                            .frame(height: 140)
                    }
                }
            }
            .padding()
        }
        .background(Color(.systemGroupedBackground))
    }
}

/// Dependency-free polyline preview (the Maps SDK replacement).
struct TrackPreview: View {
    let positions: [GPSPosition]

    var body: some View {
        GeometryReader { proxy in
            Path { path in
                guard positions.count > 1,
                      let minLat = positions.map(\.latitude).min(),
                      let maxLat = positions.map(\.latitude).max(),
                      let minLon = positions.map(\.longitude).min(),
                      let maxLon = positions.map(\.longitude).max() else { return }
                let latSpan = max(maxLat - minLat, 0.0001)
                let lonSpan = max(maxLon - minLon, 0.0001)
                for (index, position) in positions.enumerated() {
                    let x = proxy.size.width * CGFloat((position.longitude - minLon) / lonSpan)
                    let y = proxy.size.height * (1 - CGFloat((position.latitude - minLat) / latSpan))
                    let point = CGPoint(x: x, y: y)
                    if index == 0 { path.move(to: point) } else { path.addLine(to: point) }
                }
            }
            .stroke(Color.accentColor, style: StrokeStyle(lineWidth: 2, lineJoin: .round))
        }
        .background(Color(.tertiarySystemGroupedBackground), in: RoundedRectangle(cornerRadius: 12))
    }
}

struct EditActivityView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @Environment(\.dismiss) private var dismiss

    @State var session: UserActivitySession
    var onSaved: () -> Void

    var body: some View {
        Form {
            Section("Activity") {
                TextField("Name", text: $session.name)
                Picker("Type", selection: $session.activityType) {
                    ForEach(UserActivityType.allCases) { Text($0.displayName).tag($0) }
                }
                TextField("Location", text: $session.locationName)
            }
            Section("Metrics") {
                Stepper(value: $session.distance, in: 0...100_000, step: 100) {
                    Text("Distance: \(String(format: "%.2f", session.distance / 1000)) km")
                        .monospacedDigit()
                }
                Stepper(value: $session.steps, in: 0...200_000, step: 100) {
                    Text("Steps: \(Formatters.count(session.steps))").monospacedDigit()
                }
                Stepper(value: $session.activeCalories, in: 0...10_000, step: 10) {
                    Text("Active kcal: \(session.activeCalories)").monospacedDigit()
                }
            }
            Section("Notes") {
                TextField("Notes", text: $session.notes, axis: .vertical)
                    .lineLimit(3...6)
            }
            Button("Save") {
                Task {
                    // Cloud build: POST /pwuser/activitySession/update
                    await environment.store.updateActivitySession(session)
                    onSaved()
                    dismiss()
                }
            }
            .buttonStyle(.borderedProminent)
        }
        .navigationTitle("Edit Activity")
    }
}
