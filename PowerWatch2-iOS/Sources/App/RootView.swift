import SwiftUI

@main
struct PowerWatch2App: App {
    @StateObject private var environment = AppEnvironment.shared

    var body: some Scene {
        WindowGroup {
            RootView()
                .environmentObject(environment)
                .task { await environment.reload() }
                .tint(.accentColor)
        }
    }
}

/// Routing mirror of `splash.SplashScreenActivity` + `SplashViewModel`:
///   logged in + device  -> Main
///   logged in, no device -> Pairing
///   otherwise            -> Setup
struct RootView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @State private var phase: Phase = .splash

    enum Phase { case splash, onboarding, pairing, main }

    var body: some View {
        Group {
            switch phase {
            case .splash:
                SplashView { advance() }
            case .onboarding:
                OnboardingFlow()
            case .pairing:
                PairingFlow()
            case .main:
                MainTabView()
            }
        }
        .animation(.easeInOut(duration: 0.25), value: routeKey)
        .onChange(of: environment.isLoggedIn) { _, _ in advance() }
        .onChange(of: environment.hasPairedDevice) { _, _ in advance() }
        .onReceive(environment.$onboardingComplete.removeDuplicates()) { _ in advance() }
    }

    private var routeKey: String {
        "\(phase)"
    }

    private func advance() {
        // Never yank the user out of a flow they are actively in.
        if case .splash = phase {
            DispatchQueue.main.asyncAfter(deadline: .now() + 0.9) {
                routeBySession()
            }
            return
        }
        routeBySession()
    }

    private func routeBySession() {
        if !environment.isLoggedIn {
            if case .onboarding = phase { return }
            phase = .onboarding
        } else if !environment.hasPairedDevice {
            if case .pairing = phase { return }
            phase = .pairing
        } else {
            if case .main = phase { return }
            phase = .main
        }
    }
}

struct SplashView: View {
    var onFinished: () -> Void

    var body: some View {
        VStack(spacing: 20) {
            Spacer()
            ZStack {
                Circle()
                    .fill(Color.accentColor.opacity(0.15))
                    .frame(width: 160, height: 160)
                Image(systemName: "applewatch.radiowaves.left.and.right")
                    .font(.system(size: 64, weight: .light))
                    .foregroundStyle(Color.accentColor)
            }
            Text("PowerWatch2")
                .font(.system(size: 34, weight: .semibold, design: .rounded))
            Text("Matrix PowerWatch 2")
                .font(.subheadline)
                .foregroundStyle(.secondary)
            Spacer()
            ProgressView()
            Text("Offline build — no network access")
                .font(.footnote)
                .foregroundStyle(.tertiary)
                .padding(.bottom, 8)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
        .background(Color(.systemGroupedBackground))
        .onAppear {
            DispatchQueue.main.asyncAfter(deadline: .now() + 0.9, execute: onFinished)
        }
    }
}

struct MainTabView: View {
    @EnvironmentObject private var environment: AppEnvironment
    @Environment(\.scenePhase) private var scenePhase

    var body: some View {
        TabView {
            DashboardRootView()
                .tabItem { Label("Dashboard", systemImage: "square.grid.2x2") }
            MyPowerWatchRootView()
                .tabItem { Label("My PowerWatch", systemImage: "applewatch") }
        }
        // This is the moment `MainDashboardViewModel` is constructed on Android, which is
        // where `deviceManager.init()` — and therefore the whole auto-connect — starts.
        // Leaving the view cancels the task, which is what stops the retry loop, the way
        // `DeviceManagerImpl.stopConnection()` clears its disposables.
        .task { await environment.startConnection() }
        .onChange(of: scenePhase) { _, phase in
            // Coming back to the foreground: cheap, because `startConnection()` returns
            // at once when the link is already up.
            if phase == .active { Task { await environment.startConnection() } }
        }
    }
}
