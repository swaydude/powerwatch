import SwiftUI
import Charts
import CoreLocation
import MapKit
import PowerWatchCore

/// History/report screens (T5.7): a day list (local rendering only — the
/// Android `report/` package renders locally too) with per-day drill-down.
struct HistoryView: View {
    @Environment(AppModel.self) private var model

    /// Days to list. Loaded on appear; empty until the DB has periods.
    @State private var days: [HistoryDay] = []

    var body: some View {
        NavigationStack {
            Group {
                if days.isEmpty {
                    ContentUnavailableView(
                        "No History",
                        systemImage: "calendar",
                        description: Text("Sync a watch to build history."))
                } else {
                    List(days) { day in
                        NavigationLink {
                            HistoryDayView(day: day)
                        } label: {
                            row(day)
                        }
                    }
                }
            }
            .navigationTitle("History")
            .toolbar {
                ToolbarItem(placement: .topBarTrailing) {
                    NavigationLink {
                        HistoryCalendarView()
                    } label: {
                        Image(systemName: "calendar")
                    }
                    .accessibilityIdentifier("history.calendar")
                }
            }
            .onAppear(perform: load)
        }
    }

    private func row(_ day: HistoryDay) -> some View {
        HStack {
            VStack(alignment: .leading, spacing: 2) {
                Text(day.title)
                    .font(.subheadline.weight(.medium))
                Text(day.subtitle)
                    .font(.caption)
                    .foregroundStyle(.secondary)
            }
            Spacer()
            VStack(alignment: .trailing, spacing: 2) {
                Text("\(day.steps) steps")
                    .font(.subheadline.weight(.semibold))
                    .monospacedDigit()
                Text(String(format: "%dh%02d sleep", day.sleepMinutes / 60, day.sleepMinutes % 60))
                    .font(.caption)
                    .foregroundStyle(.secondary)
                    .monospacedDigit()
            }
        }
        .accessibilityIdentifier("history.row")
    }

    private func load() {
        days = HistoryDay.loadDays(database: model.database, calendar: .current)
    }
}

/// One day of aggregated history (built from the stored hour periods).
struct HistoryDay: Identifiable, Equatable {
    let start: Int64
    let steps: Int
    let activeCalories: Int
    let distance: Double
    let sleepMinutes: Int
    let sleepByType: [SleepType: Int]
    let stepsByHour: [Int]
    let title: String
    let subtitle: String

    var id: Int64 { start }

    /// Last `count` days, newest first, that have any stored periods.
    static func loadDays(database: PowerWatchDatabase, calendar: Calendar,
                         now: Date = .now, count: Int = 28) -> [HistoryDay] {
        var result: [HistoryDay] = []
        for offset in 0..<count {
            guard let day = calendar.date(byAdding: .day, value: -offset, to: now) else { continue }
            if let loaded = load(day: day, database: database, calendar: calendar) {
                result.append(offset == 0
                    ? HistoryDay(start: loaded.start, steps: loaded.steps,
                                 activeCalories: loaded.activeCalories, distance: loaded.distance,
                                 sleepMinutes: loaded.sleepMinutes, sleepByType: loaded.sleepByType,
                                 stepsByHour: loaded.stepsByHour, title: "Today",
                                 subtitle: loaded.subtitle)
                    : loaded)
            }
        }
        return result
    }

    /// One day's summary, or nil when the database holds nothing for it.
    static func load(day: Date, database: PowerWatchDatabase,
                     calendar: Calendar) -> HistoryDay? {
        let start = calendar.startOfDay(for: day)
        guard let end = calendar.date(byAdding: .day, value: 1, to: start) else { return nil }
        let from = Int64(start.timeIntervalSince1970 * 1000)
        let to = Int64(end.timeIntervalSince1970 * 1000)

        guard let walking = try? database.fetchWalkingPeriods(from: from, to: to),
              let sleep = try? database.fetchSleepPeriods(from: from, to: to),
              walking.isEmpty == false || sleep.isEmpty == false else { return nil }

        let summary = DashboardSummary(goals: GoalConfiguration(),
                                       database: database, calendar: calendar, now: day)
        return HistoryDay(
            start: from,
            steps: summary.steps,
            activeCalories: summary.activeCalories,
            distance: summary.distance,
            sleepMinutes: summary.sleepMinutes,
            sleepByType: summary.sleepByType,
            stepsByHour: summary.stepsByHour,
            title: start.formatted(date: .abbreviated, time: .omitted),
            subtitle: "\(summary.walkingMinutes) min walking · \(summary.restingMinutes) min resting")
    }
}

/// Drill-down for one day: totals, sleep split, hour-of-day charts.
/// Toolbar chevrons step between days (Android's ‹ › date navigation).
struct HistoryDayView: View {
    @Environment(AppModel.self) private var model
    @State private var current: HistoryDay
    /// Neighbouring days for arrow navigation (newest first, like the list).
    @State private var days: [HistoryDay] = []
    /// The day's recorded activity sessions (Android lists these under totals).
    @State private var sessions: [HistorySession] = []

    init(day: HistoryDay) {
        _current = State(initialValue: day)
    }

    private var index: Int? { days.firstIndex(where: { $0.id == current.id }) }

    var body: some View {
        ScrollView {
            VStack(spacing: 16) {
                LazyVGrid(columns: [GridItem(.flexible()), GridItem(.flexible())], spacing: 12) {
                    Tile(title: "Steps", value: "\(current.steps)")
                    Tile(title: "Active Calories", value: "\(current.activeCalories) kcal")
                    Tile(title: "Distance", value: String(format: "%.2f km", current.distance / 1000))
                    Tile(title: "Sleep", value: String(format: "%dh%02d", current.sleepMinutes / 60, current.sleepMinutes % 60))
                }
                sleepSplit
                HistorySessionList(sessions: sessions)
                ChartPanel(title: "Steps by Hour") {
                    Chart(0..<24, id: \.self) { hour in
                        BarMark(
                            x: .value("Hour", hour),
                            y: .value("Steps", current.stepsByHour[hour]))
                    }
                    .foregroundStyle(Color.pwGreen)
                }
            }
            .padding()
        }
        .background(Color.pwBackground)
        .navigationBarTitleDisplayMode(.inline)
        .toolbar {
            ToolbarItem(placement: .principal) {
                HStack(spacing: 20) {
                    Button {
                        step(1)      // older day
                    } label: {
                        Image(systemName: "chevron.left")
                    }
                    .disabled(index == nil || index! == 0)
                    .accessibilityIdentifier("history.prev")
                    Text(current.title)
                        .font(.headline)
                    Button {
                        step(-1)     // newer day
                    } label: {
                        Image(systemName: "chevron.right")
                    }
                    .disabled(index == nil || index! >= days.count - 1)
                    .accessibilityIdentifier("history.next")
                }
            }
        }
        .onAppear {
            days = HistoryDay.loadDays(database: model.database, calendar: .current)
            loadSessions()
        }
        .onChange(of: current.id) { _, _ in loadSessions() }
    }

    private func loadSessions() {
        let calendar = Calendar.current
        let day = Date(timeIntervalSince1970: Double(current.start) / 1000)
        guard let start = calendar.startOfDay(for: day) as Date?,
              let end = calendar.date(byAdding: .day, value: 1, to: start) else {
            sessions = []
            return
        }
        sessions = HistorySession.load(
            database: model.database,
            from: Int64(start.timeIntervalSince1970 * 1000),
            to: Int64(end.timeIntervalSince1970 * 1000))
    }

    private func step(_ delta: Int) {
        guard let index else { return }
        let next = index + delta
        guard days.indices.contains(next) else { return }
        withAnimation { current = days[next] }
    }

    private var sleepSplit: some View {
        VStack(alignment: .leading, spacing: 8) {
            Text("Sleep by Type")
                .font(.caption.weight(.semibold))
                .foregroundStyle(.secondary)
            let types: [SleepType] = [.deep, .light, .restless, .awake]
            Chart(types, id: \.self) { type in
                BarMark(
                    x: .value("Type", type.displayTitle),
                    y: .value("Minutes", current.sleepByType[type] ?? 0))
            }
            .foregroundStyle(Color.pwBlue)
            .frame(height: 120)
        }
        .padding(12)
        .background(.fill, in: RoundedRectangle(cornerRadius: 12))
        .frame(maxWidth: .infinity, alignment: .leading)
    }
}

extension SleepType {
    var displayTitle: String {
        switch self {
        case .deep: return "Deep"
        case .light: return "Light"
        case .restless: return "Restless"
        case .awake: return "Awake"
        }
    }
}

// MARK: - Activity sessions

/// One stored activity session, formatted for the day list
/// (Android `fragment_activity_period_item`).
struct HistorySession: Identifiable, Equatable {
    let record: UserActivitySessionRecord

    var id: String { record.id }

    static func load(database: PowerWatchDatabase, from: Int64, to: Int64) -> [HistorySession] {
        guard let stored = try? database.fetchActivitySessions(from: from, to: to) else { return [] }
        return stored.sorted { $0.startTime < $1.startTime }.map(HistorySession.init(record:))
    }

    var start: Date { Date(timeIntervalSince1970: Double(record.startTime) / 1000) }
    var end: Date { Date(timeIntervalSince1970: Double(record.endTime) / 1000) }

    var title: String { record.name.isEmpty ? "Activity" : record.name }

    var timeText: String { start.formatted(date: .omitted, time: .shortened) }

    var durationText: String {
        let minutes = max(0, Int(record.endTime - record.startTime) / 60_000)
        return minutes >= 60 ? String(format: "%dh%02d", minutes / 60, minutes % 60) : "\(minutes) min"
    }

    var distanceText: String { String(format: "%.2f km", record.distance / 1000) }

    /// Android shows pace as minutes per kilometre; the watch leaves the stored
    /// pace at zero, so it is derived here the way the Android list does.
    var paceText: String {
        guard record.distance > 0 else { return "--" }
        let seconds = max(1, Int(record.endTime - record.startTime) / 1000)
        let perKm = Double(seconds) / (record.distance / 1000)
        return String(format: "%d'%02d'' /km", Int(perKm) / 60, Int(perKm) % 60)
    }

    var coordinates: [CLLocationCoordinate2D] {
        record.positions.map { CLLocationCoordinate2D(latitude: $0.latitude, longitude: $0.longitude) }
            .filter { CLLocationCoordinate2DIsValid($0) }
    }
}

/// Session list for one day, plus the row that opens the detail
/// (Android lists these under the day's totals).
struct HistorySessionList: View {
    let sessions: [HistorySession]

    var body: some View {
        if !sessions.isEmpty {
            VStack(alignment: .leading, spacing: 8) {
                Text("Activity")
                    .font(.caption.weight(.semibold))
                    .foregroundStyle(.secondary)
                ForEach(sessions) { session in
                    NavigationLink {
                        SessionDetailView(session: session)
                    } label: {
                        HStack {
                            VStack(alignment: .leading, spacing: 2) {
                                Text(session.title)
                                    .font(.subheadline.weight(.medium))
                                Text("\(session.timeText) · \(session.durationText)")
                                    .font(.caption)
                                    .foregroundStyle(.secondary)
                            }
                            Spacer()
                            VStack(alignment: .trailing, spacing: 2) {
                                Text(session.distanceText)
                                    .font(.subheadline.weight(.semibold))
                                    .monospacedDigit()
                                Text("\(session.record.steps) steps · \(session.record.activeCalories) kcal")
                                    .font(.caption)
                                    .foregroundStyle(.secondary)
                                    .monospacedDigit()
                            }
                        }
                        .padding(.vertical, 4)
                    }
                    .buttonStyle(.plain)
                    .accessibilityIdentifier("history.sessionRow")
                }
            }
            .padding(12)
            .background(.fill, in: RoundedRectangle(cornerRadius: 12))
            .frame(maxWidth: .infinity, alignment: .leading)
            .accessibilityIdentifier("history.sessions")
        }
    }
}

/// One session in full (Android `fragment_user_activity`): totals, the GPS
/// track when the watch reported one, and the per-minute splits.
struct SessionDetailView: View {
    let session: HistorySession

    var body: some View {
        ScrollView {
            VStack(spacing: 16) {
                LazyVGrid(columns: [GridItem(.flexible()), GridItem(.flexible())], spacing: 12) {
                    Tile(title: "Distance", value: session.distanceText)
                    Tile(title: "Time", value: session.durationText)
                    Tile(title: "Steps", value: "\(session.record.steps)")
                    Tile(title: "Calories", value: "\(session.record.activeCalories) kcal")
                    Tile(title: "Pace", value: session.paceText)
                    Tile(title: "Type", value: session.title)
                }
                if !session.coordinates.isEmpty {
                    TrackMap(coordinates: session.coordinates)
                        .frame(height: 220)
                        .clipShape(RoundedRectangle(cornerRadius: 12))
                }
                splits
            }
            .padding()
        }
        .background(Color.pwBackground)
        .navigationTitle(session.title)
        .navigationBarTitleDisplayMode(.inline)
    }

    @ViewBuilder private var splits: some View {
        let stored = session.record.runningSplits
        if !stored.isEmpty {
            VStack(alignment: .leading, spacing: 8) {
                Text("Splits")
                    .font(.caption.weight(.semibold))
                    .foregroundStyle(.secondary)
                ForEach(Array(stored.enumerated()), id: \.offset) { index, split in
                    HStack {
                        Text("#\(index + 1)")
                            .font(.caption)
                            .foregroundStyle(.secondary)
                        Spacer()
                        Text(String(format: "%.2f km", split.distance / 1000))
                            .font(.caption)
                            .monospacedDigit()
                    }
                    .accessibilityIdentifier("session.split")
                }
            }
            .padding(12)
            .background(.fill, in: RoundedRectangle(cornerRadius: 12))
            .frame(maxWidth: .infinity, alignment: .leading)
        }
    }
}

/// The recorded GPS track, drawn over the map (Android's Google/Baidu map view).
struct TrackMap: View {
    let coordinates: [CLLocationCoordinate2D]

    private var region: MapCameraPosition {
        guard coordinates.count > 1, let first = coordinates.first else { return .automatic }
        let latitudes = coordinates.map(\.latitude)
        let longitudes = coordinates.map(\.longitude)
        let center = CLLocationCoordinate2D(
            latitude: (latitudes.min()! + latitudes.max()!) / 2,
            longitude: (longitudes.min()! + longitudes.max()!) / 2)
        let span = MKCoordinateSpan(
            latitudeDelta: max(0.001, (latitudes.max()! - latitudes.min()!) * 1.4),
            longitudeDelta: max(0.001, (longitudes.max()! - longitudes.min()!) * 1.4))
        return .region(MKCoordinateRegion(center: center, span: span))
    }

    var body: some View {
        Map(position: .constant(region)) {
            MapPolyline(coordinates: coordinates)
                .stroke(Color.pwGreen, lineWidth: 3)
            if let start = coordinates.first {
                Marker("Start", coordinate: start).tint(Color.pwGreen)
            }
            if let end = coordinates.last, coordinates.count > 1 {
                Marker("End", coordinate: end).tint(Color.pwBlue)
            }
        }
    }
}

/// Month grid with a marker on every day that holds data (Android's
/// `CalendarFragment` + `MonthCellRecyclerAdapter`).
struct HistoryCalendarView: View {
    @Environment(AppModel.self) private var model

    @State private var month: Date = .now
    @State private var daysByStart: [Int64: HistoryDay] = [:]

    private let columns = Array(repeating: GridItem(.flexible(), spacing: 4), count: 7)

    private struct Cell: Identifiable {
        /// nil for the blank cells that line the month up with its first weekday.
        let date: Date?
        let day: HistoryDay?
        let id: Int
    }

    var body: some View {
        ScrollView {
            VStack(spacing: 12) {
                header
                weekdayHeader
                LazyVGrid(columns: columns, spacing: 4) {
                    ForEach(cells) { cell in
                        dayCell(cell)
                    }
                }
            }
            .padding()
        }
        .background(Color.pwBackground)
        .navigationTitle("Calendar")
        .navigationBarTitleDisplayMode(.inline)
        .onAppear(perform: load)
        .onChange(of: month) { _, _ in load() }
    }

    private var header: some View {
        HStack {
            Button {
                shiftMonth(-1)
            } label: {
                Image(systemName: "chevron.left")
            }
            .accessibilityIdentifier("history.calendarPrev")
            Spacer()
            Text(month.formatted(.dateTime.month(.wide).year()))
                .font(.headline)
            Spacer()
            Button {
                shiftMonth(1)
            } label: {
                Image(systemName: "chevron.right")
            }
            .accessibilityIdentifier("history.calendarNext")
        }
    }

    private var weekdayHeader: some View {
        let symbols = Calendar.current.veryShortWeekdaySymbols
        return HStack {
            ForEach(symbols, id: \.self) { symbol in
                Text(symbol)
                    .font(.caption2.weight(.semibold))
                    .foregroundStyle(.secondary)
                    .frame(maxWidth: .infinity)
            }
        }
    }

    /// Leading blanks line the month up with the week's first column.
    private var cells: [Cell] {
        let calendar = Calendar.current
        guard let first = calendar.date(from: calendar.dateComponents([.year, .month], from: month)) else {
            return []
        }
        let range = calendar.range(of: .day, in: .month, for: first)?.count ?? 30
        let firstWeekday = calendar.component(.weekday, from: first)
        let leading = (firstWeekday - calendar.firstWeekday + 7) % 7

        var result: [Cell] = (0..<leading).map { Cell(date: nil, day: nil, id: $0) }
        for day in 0..<range {
            guard let date = calendar.date(byAdding: .day, value: day, to: first) else { continue }
            let start = calendar.startOfDay(for: date)
            let key = Int64(start.timeIntervalSince1970 * 1000)
            result.append(Cell(date: start, day: daysByStart[key], id: leading + day))
        }
        return result
    }

    @ViewBuilder private func dayCell(_ cell: Cell) -> some View {
        if cell.date == nil {
            Color.clear.frame(height: 40)
        } else if let day = cell.day {
            NavigationLink {
                HistoryDayView(day: day)
            } label: {
                cellLabel(for: cell, marked: true)
            }
            .buttonStyle(.plain)
            .accessibilityIdentifier("history.calendarDay")
        } else {
            cellLabel(for: cell, marked: false)
        }
    }

    private func cellLabel(for cell: Cell, marked: Bool) -> some View {
        VStack(spacing: 3) {
            Text("\(Calendar.current.component(.day, from: cell.date ?? .now))")
                .font(.callout)
                .monospacedDigit()
            Circle()
                .fill(marked ? Color.pwGreen : Color.clear)
                .frame(width: 5, height: 5)
        }
        .frame(maxWidth: .infinity)
        .padding(.vertical, 6)
        .background(marked ? Color.pwGreen.opacity(0.12) : Color.clear,
                    in: RoundedRectangle(cornerRadius: 8))
    }

    private func shiftMonth(_ delta: Int) {
        guard let next = Calendar.current.date(byAdding: .month, value: delta, to: month) else { return }
        withAnimation { month = next }
    }

    private func load() {
        let calendar = Calendar.current
        guard let first = calendar.date(from: calendar.dateComponents([.year, .month], from: month)),
              let nextMonth = calendar.date(byAdding: .month, value: 1, to: first) else { return }
        var collected: [Int64: HistoryDay] = [:]
        var cursor = first
        while cursor < nextMonth {
            if let day = HistoryDay.load(day: cursor, database: model.database, calendar: calendar) {
                collected[day.start] = day
            }
            guard let advanced = calendar.date(byAdding: .day, value: 1, to: cursor) else { break }
            cursor = advanced
        }
        daysByStart = collected
    }
}


