import SwiftUI

// MARK: - Layout primitives

struct Card<Content: View>: View {
    let content: Content
    var padding: CGFloat = 16

    init(padding: CGFloat = 16, @ViewBuilder content: () -> Content) {
        self.padding = padding
        self.content = content()
    }

    var body: some View {
        content
            .padding(padding)
            .frame(maxWidth: .infinity, alignment: .leading)
            .background(Color(.secondarySystemGroupedBackground), in: RoundedRectangle(cornerRadius: 16, style: .continuous))
    }
}

struct SectionHeader: View {
    let title: String
    var subtitle: String? = nil

    var body: some View {
        VStack(alignment: .leading, spacing: 2) {
            Text(title).font(.headline)
            if let subtitle {
                Text(subtitle).font(.caption).foregroundStyle(.secondary)
            }
        }
    }
}

struct MetricTile: View {
    let title: String
    let value: String
    var unit: String? = nil
    var icon: String? = nil
    var tint: Color = .accentColor

    var body: some View {
        VStack(alignment: .leading, spacing: 6) {
            HStack(spacing: 5) {
                if let icon { Image(systemName: icon).font(.caption).foregroundStyle(tint) }
                Text(title).font(.caption).foregroundStyle(.secondary)
            }
            HStack(alignment: .firstTextBaseline, spacing: 3) {
                Text(value).font(.title3.weight(.semibold)).monospacedDigit()
                if let unit { Text(unit).font(.caption).foregroundStyle(.secondary) }
            }
        }
        .frame(maxWidth: .infinity, alignment: .leading)
        .padding(12)
        .background(Color(.secondarySystemGroupedBackground), in: RoundedRectangle(cornerRadius: 14, style: .continuous))
    }
}

struct StatRow: View {
    let label: String
    let value: String

    var body: some View {
        HStack {
            Text(label).foregroundStyle(.secondary)
            Spacer()
            Text(value).monospacedDigit()
        }
        .font(.subheadline)
        .padding(.vertical, 4)
    }
}

struct CheckmarkRow: View {
    let title: String
    var subtitle: String? = nil
    var isOn: Binding<Bool>

    init(_ title: String, subtitle: String? = nil, isOn: Binding<Bool>) {
        self.title = title
        self.subtitle = subtitle
        self.isOn = isOn
    }

    var body: some View {
        Toggle(isOn: isOn) {
            VStack(alignment: .leading, spacing: 2) {
                Text(title)
                if let subtitle {
                    Text(subtitle).font(.caption).foregroundStyle(.secondary)
                }
            }
        }
    }
}

// MARK: - Charts
//
// The Android Dashboard draws hour-of-day bar charts for steps, calories,
// heart rate, temperature and power plus a stacked sleep bar. These are
// dependency-free SwiftUI equivalents so the build has no third-party inputs.

struct BarChartView: View {
    let values: [Double]
    var goal: Double? = nil
    var tint: Color = .accentColor
    var height: CGFloat = 132
    var showsBaselineGrid: Bool = true

    var body: some View {
        GeometryReader { proxy in
            let maxValue = max((values.max() ?? 1), goal ?? 0, 1)
            let count = max(values.count, 1)
            let slot = proxy.size.width / CGFloat(count)
            let barWidth = max(2, slot * 0.62)

            ZStack(alignment: .bottom) {
                if showsBaselineGrid {
                    ForEach(0..<4) { index in
                        Rectangle()
                            .fill(Color.gray.opacity(0.12))
                            .frame(height: 1)
                            .offset(y: -proxy.size.height * CGFloat(index) / 3)
                            .frame(maxHeight: .infinity, alignment: .bottom)
                    }
                }
                if let goal, goal > 0 {
                    Rectangle()
                        .fill(Color.orange.opacity(0.6))
                        .frame(height: 1)
                        .offset(y: -proxy.size.height * CGFloat(goal / maxValue))
                        .frame(maxHeight: .infinity, alignment: .bottom)
                }
                HStack(alignment: .bottom, spacing: slot - barWidth) {
                    ForEach(values.indices, id: \.self) { index in
                        RoundedRectangle(cornerRadius: 2, style: .continuous)
                            .fill(values[index] > 0 ? tint : Color.gray.opacity(0.18))
                            .frame(
                                width: barWidth,
                                height: max(2, proxy.size.height * CGFloat(values[index] / maxValue))
                            )
                    }
                }
            }
        }
        .frame(height: height)
    }
}

struct LineChartView: View {
    let values: [Double]
    var range: ClosedRange<Double>? = nil
    var tint: Color = .accentColor
    var height: CGFloat = 132
    var showsFill: Bool = true

    var body: some View {
        GeometryReader { proxy in
            let lower = range?.lowerBound ?? (values.min() ?? 0)
            let upper = range?.upperBound ?? (values.max() ?? 1)
            let span = max(upper - lower, 1)
            let count = max(values.count, 1)

            ZStack {
                if showsFill {
                    path(in: proxy.size, lower: lower, span: span, count: count)
                        .fill(
                            LinearGradient(
                                colors: [tint.opacity(0.35), tint.opacity(0.02)],
                                startPoint: .top, endPoint: .bottom
                            )
                        )
                }
                path(in: proxy.size, lower: lower, span: span, count: count)
                    .stroke(tint, style: StrokeStyle(lineWidth: 2, lineJoin: .round))
            }
        }
        .frame(height: height)
    }

    private func path(in size: CGSize, lower: Double, span: Double, count: Int) -> Path {
        var path = Path()
        guard count > 1 else { return path }
        let stepX = size.width / CGFloat(count - 1)
        for (index, value) in values.enumerated() {
            let x = stepX * CGFloat(index)
            let y = size.height * (1 - CGFloat((value - lower) / span))
            let point = CGPoint(x: x, y: min(max(y, 0), size.height))
            if index == 0 { path.move(to: point) } else { path.addLine(to: point) }
        }
        path.addLine(to: CGPoint(x: size.width, y: size.height))
        path.addLine(to: CGPoint(x: 0, y: size.height))
        path.closeSubpath()
        return path
    }
}

/// Stacked awake / restless / light / deep bar, the iOS counterpart of the
/// `sleep_chart` breakdown.
struct SleepStageBar: View {
    let awake: Int
    let restless: Int
    let light: Int
    let deep: Int

    private var total: Int { max(1, awake + restless + light + deep) }

    var body: some View {
        GeometryReader { proxy in
            HStack(spacing: 1) {
                segment(awake, color: Color(.systemGray3), width: proxy.size.width)
                segment(restless, color: .orange, width: proxy.size.width)
                segment(light, color: Color.accentColor.opacity(0.55), width: proxy.size.width)
                segment(deep, color: Color.accentColor, width: proxy.size.width)
            }
            .clipShape(Capsule())
        }
        .frame(height: 14)
    }

    private func segment(_ minutes: Int, color: Color, width: CGFloat) -> some View {
        Rectangle()
            .fill(color)
            .frame(width: max(0, width * CGFloat(minutes) / CGFloat(total)))
    }
}

struct RingProgress: View {
    var progress: Double
    var tint: Color = .accentColor
    var lineWidth: CGFloat = 10
    var diameter: CGFloat = 76

    var body: some View {
        ZStack {
            Circle().stroke(Color.gray.opacity(0.18), lineWidth: lineWidth)
            Circle()
                .trim(from: 0, to: min(max(progress, 0), 1))
                .stroke(tint, style: StrokeStyle(lineWidth: lineWidth, lineCap: .round))
                .rotationEffect(.degrees(-90))
        }
        .frame(width: diameter, height: diameter)
    }
}

// MARK: - Misc

struct EmptyStateView: View {
    let title: String
    let message: String
    var systemImage: String = "tray"
    var actionTitle: String? = nil
    var action: (() -> Void)? = nil

    var body: some View {
        ContentUnavailableView {
            Label(title, systemImage: systemImage)
        } description: {
            Text(message)
        } actions: {
            if let actionTitle, let action {
                Button(actionTitle, action: action)
                    .buttonStyle(.borderedProminent)
            }
        }
    }
}
