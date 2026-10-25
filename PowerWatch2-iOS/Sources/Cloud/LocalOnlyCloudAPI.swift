import Foundation

// ============================================================================
// REMOVED EXTERNAL API SURFACE
// ============================================================================
//
// The shipped Android APK talks to `https://api.prod.powerwatch.com`
// (and `https://api.dev.powerwatch.com` when the secret-screen
// `PRODUCTION_ENABLED` flag is off). Root of truth:
// `powerwatch.matrix.com.pwgen2android/EnvironmentKt.java`
//   PROD_BASE_URL = "https://api.prod.powerwatch.com"
//   DEV_BASE_URL  = "https://api.dev.powerwatch.com"
//   OAuth2Config("/oauth/token","password","read write",
//                <hardcoded client id>,<hardcoded client secret>,"Basic",
//                <base64 of "id:secret">)   // values deliberately not transcribed
//
// Every call goes through the single Retrofit interface
// `shared/cloud/http/HTTP.java` with @Url-injected absolute paths, wrapped by
// `HttpClientImpl` (which prefixes baseURL and installs
// `CloudErrorHandlerImpl`).
//
// The complete endpoint list that this iOS build does NOT implement:
//
//   POST /oauth/token                       OAuth2 password + refresh grant
//   POST /pwuser/add                        create account
//   GET  /pwuser/get                        fetch user
//   POST /pwuser/update                     update user
//   POST /pwuser/forgotPassword
//   POST /pwuser/changePassword
//   POST /pwuser/verify
//   POST /pwuser/resendEmail
//   POST /pwuser/fcmToken?token=...         FCM token registration
//   POST /host/pairDevice
//   POST /host/updateDevice
//   GET  /pwuser/devices
//   POST /host/unpairDevice?deviceSerial=
//   POST /pwuser/goal/addForUser
//   GET  /pwuser/goal/getByUser
//   POST /pwuser/walking/add | resting/add | sleep/add
//   GET  /pwuser/{walking,resting,sleep}/hour
//   GET  /pwuser/{walking,resting,sleep}/dayHours|weekHours|monthHours
//   GET  /pwuser/{walking,resting,sleep}/day|week|month
//   POST /pwuser/activitySession/addWithData | update | delete?id=
//   GET  /pwuser/activitySession/day?timezone&offset&limit
//   GET  /pwuser/activitySession/month/activityDates?timezone&offset&limit
//   GET  /pwuser/update/latest?pid&language        firmware metadata
//   GET  <UpdateInfo.downloadUrl>                  firmware binary
//   GET  /pwuser/update/fonts                      font component manifest
//   GET  <FontComponent.downloadURL>               font binaries
//   POST /metrics/events/device/add                SYNC/PAIR/OTA analytics
//   POST /metrics/events/app                       (dead in the APK too)
//   POST /reports/addAttachment?attachmentType=    multipart log/screenshot upload
//
// Other outbound dependencies also removed: Firebase (App/InstanceId/Messaging,
// project matrix-powerwatch-2), Crashlytics + Fabric api key, Bugfender
// (app key doUHqHUAhouAncAdrQHvO2SVw3ZGwg28), Strava OAuth + TCX upload,
// Google Fit, Google Maps / Baidu Maps tiles,
// https://s3.us-west-1.amazonaws.com/powerwatch-gps/gpsAssistantFile.bin,
// https://powerwatch-fonts.s3-us-west-1.amazonaws.com/font_update.json,
// https://report.powerwatch.com (WebView + JS bridge), Google Play in-app
// update, and the EULA link https://www.powerwatch.com/pages/eula.
//
// This file keeps the *shape* of the old interface so the view models stay
// recognisable against the Android original, and
// `LocalOnlyCloudAPI` below supplies the data from the device instead.
// ============================================================================

/// The former cloud contract. `CloudImpl` + the per-feature `*CloudServiceImpl`
/// classes in `shared/cloud/` implemented this against api.prod.powerwatch.com.
protocol CloudAPI {
    // auth
    func login(email: String, password: String, hostUUID: String) async throws -> KeychainStore.LocalSession
    func signUp(user: UserAccount) async throws -> UserAccount
    func fetchUser() async throws -> UserAccount
    func updateUser(_ user: UserAccount) async throws
    func verifyAccount() async throws
    func resendVerificationEmail(email: String) async throws
    func forgotPassword(email: String) async throws
    func changePassword(old: String, new: String) async throws
    func logout() async

    // devices
    func pairDevice(_ device: PairedDevice) async throws
    func updateDevice(_ device: PairedDevice) async throws
    func fetchDevices() async throws -> [PairedDevice]
    func unpairDevice(serial: String) async throws

    // goals
    func fetchGoals() async throws -> GoalConfiguration
    func saveGoals(_ goals: GoalConfiguration) async throws

    // logs + periods
    func uploadActivityLogs(_ logs: [ActivityLogEntry]) async throws
    func fetchDayPeriods(state: ActivityLogEntry.State, dayOffset: Int) async throws -> [HourPeriod]

    // activity sessions
    func uploadSessions(_ sessions: [UserActivitySession]) async throws
    func deleteSession(id: String) async throws
    func fetchSessions(dayOffset: Int) async throws -> [UserActivitySession]

    // firmware / fonts
    func fetchUpdateInfo(pid: Int, language: String) async throws -> FirmwareUpdateInfo
    func downloadFirmware(_ info: FirmwareUpdateInfo) async throws -> Data
    func checkFontUpdates() async throws -> [FontComponent]

    // analytics / reporting
    func logDeviceEvents(_ events: [DeviceMetricEvent], device: PairedDevice?) async throws
    func uploadReport(attachment: Data, type: String) async throws

    /// Was `CloudSynchronizer.syncAllDataToCloud()`; triggered on network
    /// restore, after every BLE sync, and from `MainActivityViewModel.onResume`.
    func syncAllDataToCloud() async
    var hasDataToSync: Bool { get async }
}

/// Font manifest entry from `GET /pwuser/update/fonts`
/// (`FontUpdateInfo.components`). `downloadURL` is replaced by a bundled
/// resource name.
struct FontComponent: Codable, Equatable {
    enum Kind: String, Codable {
        case fontCoreLib = "FontCoreLib"
        case clockFonts = "ClockFonts"
        case gauges = "Gauges"
        case icons = "Icons"
        case userLocation1 = "UserLocation1"
        case userLocation2 = "UserLocation2"
        case userLocation3 = "UserLocation3"
        case fontLookupTable = "FontLookupTable"
    }
    var type: Kind
    var timestamp: Int
    var version: Int
    var localBundleResource: String
}

/// Offline implementation. No network, no Firebase, no telemetry.
///
/// Design note taken from the APK's own behaviour: Room was never a mere cache.
/// Reads were `cloudService.getAllUserActivities(page).flatMap { dao
/// .saveCompletable(it) }.onErrorResumeNext { dao.allActivities() }` — the cloud
/// answer was mirrored into Room and a dead network fell back to Room — and
/// writes were `cloudService.save(item).andThen(dao.addCompletable(item))`.
/// Everything the UI rendered came out of Room, and the upload queue was only a
/// `shouldSend` flag: `UserActivitySessionRepositoryImpl` sets it true on local
/// change, selects pending rows with `notSyncedSessions()` / `notSyncedCount` and
/// clears it after a successful upload. The app was therefore already built to
/// survive a dead network; this class makes that path the only path, and
/// `syncAllDataToCloud()` merely clears the flags nobody will ever read.
struct LocalOnlyCloudAPI: CloudAPI {
    private let store: LocalStore
    private let keychain: KeychainStore

    init(store: LocalStore = .shared, keychain: KeychainStore = .shared) {
        self.store = store
        self.keychain = keychain
    }

    enum CloudError: LocalizedError {
        case notSignedIn
        case noUser
        case invalidCredentials
        case weakPassword
        case emailTaken
        case oldPasswordMismatch
        case firmwareUnavailable

        var errorDescription: String? {
            switch self {
            // Message strings are the exact default-locale texts the cloud build
            // surfaced through CloudErrorResolverKt.
            case .notSignedIn: return "Your account is not validated yet."
            case .noUser: return "Email and password do not match."
            case .invalidCredentials: return "Email and password do not match."
            case .weakPassword: return "The password must be a minimum of 8 characters."
            case .emailTaken: return "User with provided email already exists."
            case .oldPasswordMismatch: return "Provided old password does not match."
            case .firmwareUnavailable: return "Your device is up to date"
            }
        }
    }

    // MARK: Auth  (was POST /oauth/token with the APK's hardcoded Basic client credentials)

    func login(email: String, password: String, hostUUID: String) async throws -> KeychainStore.LocalSession {
        guard let user = await store.user(), user.email.lowercased() == email.lowercased() else {
            throw CloudError.noUser
        }
        // The cloud verified against the OAuth2 password grant; here we compare
        // against the locally stored credential, which is what Room's
        // `PasswordCredentials.password` column existed for — except it is in the
        // keychain now, not in the snapshot.
        guard let stored = keychain.password(for: user.email), stored == password else {
            throw CloudError.invalidCredentials
        }
        guard user.enabled else { throw CloudError.notSignedIn }
        let session = KeychainStore.LocalSession.issue(email: email)
        keychain.save(session)
        return session
    }

    func signUp(user: UserAccount) async throws -> UserAccount {
        let secret = user.password
        guard secret.count >= 8 else { throw CloudError.weakPassword }
        guard user.email.isValidEmail else { throw CloudError.noUser }
        if let existing = await store.user(),
           existing.email.lowercased() == user.email.lowercased() {
            throw CloudError.emailTaken
        }
        var created = user
        created.enabled = true          // no e-mail round trip any more
        created.shouldSync = false
        created.password = ""           // keychain only; never reaches the snapshot
        keychain.savePassword(secret, for: created.email)
        await store.save(user: created)
        keychain.save(.issue(email: created.email))
        return created
    }

    func fetchUser() async throws -> UserAccount {
        guard let u = await store.user() else { throw CloudError.noUser }
        return u
    }

    func updateUser(_ user: UserAccount) async throws {
        await store.save(user: user)
    }

    /// The cloud build opened a browser to an e-mail link and the deep-link
    /// action `com.matrixpowerwatch.verify` re-entered `SetupActivity`.
    /// Nothing to verify locally.
    func verifyAccount() async throws {}

    func resendVerificationEmail(email: String) async throws {}

    func forgotPassword(email: String) async throws {}

    func changePassword(old: String, new: String) async throws {
        guard let user = await store.user() else { throw CloudError.noUser }
        guard let stored = keychain.password(for: user.email), stored == old else {
            throw CloudError.oldPasswordMismatch
        }
        guard new.count >= 8 else { throw CloudError.weakPassword }
        keychain.savePassword(new, for: user.email)
        var updated = user
        updated.password = ""
        await store.save(user: updated)
        // Cloud build called `tokenProvider.updatePassword(newPassword)` so the
        // stored credential could re-authorize; refresh the local session too.
        keychain.save(.issue(email: updated.email))
    }

    func logout() async {
        // `delete()` alone left every `password:*` item behind, so a "logged out"
        // install kept its secret in the keychain indefinitely (M1). Clearing the whole
        // service catches items under any account, including ones an older build wrote
        // under a different accessibility class.
        keychain.deleteAll()
        await store.logout()
    }

    // MARK: Devices  (was /host/pairDevice, /host/updateDevice, /pwuser/devices,
    //                  /host/unpairDevice)

    func pairDevice(_ device: PairedDevice) async throws {
        await store.save(device: device)
    }

    func updateDevice(_ device: PairedDevice) async throws {
        await store.save(device: device)
    }

    func fetchDevices() async throws -> [PairedDevice] {
        (await store.device()).map { [$0] } ?? []
    }

    func unpairDevice(serial: String) async throws {
        await store.unpairDevice(clearLogs: false)
    }

    // MARK: Goals  (was /pwuser/goal/getByUser + addForUser)

    func fetchGoals() async throws -> GoalConfiguration { await store.goals() }
    func saveGoals(_ goals: GoalConfiguration) async throws { await store.save(goals: goals) }

    // MARK: Logs / periods  (was /pwuser/{walking,resting,sleep}/add and the
    //                        /day, /week, /month aggregations)

    func uploadActivityLogs(_ logs: [ActivityLogEntry]) async throws {
        // Rows stay in the local store; there is no server to acknowledge them,
        // so mark them synced to keep any shouldSend-driven UI quiet.
        var synced = logs
        for i in synced.indices { synced[i].shouldSend = false }
        await store.appendActivityLogs(synced)
    }

    /// The cloud returned pre-aggregated hour rows. Locally we derive them the
    /// same way `LogToHourGrouper1` does.
    func fetchDayPeriods(state: ActivityLogEntry.State, dayOffset: Int) async throws -> [HourPeriod] {
        let cal = Calendar.current
        guard let day = cal.date(byAdding: .day, value: -dayOffset, to: Date()) else { return [] }
        let start = cal.startOfDay(for: day)
        return await store.hourPeriods().filter {
            $0.state == state && $0.startTime >= start && $0.startTime < cal.date(byAdding: .day, value: 1, to: start)!
        }
    }

    // MARK: Sessions  (was /pwuser/activitySession/*)

    func uploadSessions(_ sessions: [UserActivitySession]) async throws {
        var synced = sessions
        for i in synced.indices { synced[i].shouldSend = false }
        await store.saveActivitySessions(synced)
    }

    func deleteSession(id: String) async throws {
        await store.deleteActivitySession(id: id)
    }

    func fetchSessions(dayOffset: Int) async throws -> [UserActivitySession] {
        let cal = Calendar.current
        guard let day = cal.date(byAdding: .day, value: -dayOffset, to: Date()) else { return [] }
        return await store.activitySessions(on: day, calendar: cal)
    }

    // MARK: Firmware / fonts  (were /pwuser/update/latest and /pwuser/update/fonts)

    /// `UpdateInfoRepositoryImpl` was already `Observable.concat(dao.get(),
    /// cloud.getUpdateInfo(...))` and `load()` was purely local, so a
    /// bundled manifest is a drop-in replacement. No screen calls these any more — the
    /// Firmware entry was removed because its install action could not reach the OTA
    /// characteristic (EVIDENCE 17) — but the substitute stays here, documented and
    /// covered by `testFirmwareComesFromBundleNotURL`, because that is what replaced
    /// `/pwuser/update/latest` and the S3 download.
    func fetchUpdateInfo(pid: Int, language: String) async throws -> FirmwareUpdateInfo {
        if let local = await store.updateInfo() { return local }
        let bundled = FirmwareUpdateInfo(
            uid: "local-\(pid)",
            pid: pid,
            releaseNotes: "Firmware is served from the app bundle. The cloud "
                + "endpoint /pwuser/update/latest has been removed.",
            language: language,
            releaseVersion: "1.5.6",
            localBundleResource: "ota_gps",
            mandatory: false,
            forced: false,
            releaseDate: Date()
        )
        await store.save(updateInfo: bundled)
        return bundled
    }

    /// Replaces `GET <UpdateInfo.downloadUrl>`. Reads from the bundle instead of
    /// S3/the API host.
    func downloadFirmware(_ info: FirmwareUpdateInfo) async throws -> Data {
        guard let url = Bundle.main.url(forResource: info.localBundleResource, withExtension: "bin"),
              let data = try? Data(contentsOf: url), !data.isEmpty else {
            throw CloudError.firmwareUnavailable
        }
        return data
    }

    func checkFontUpdates() async throws -> [FontComponent] { [] }

    // MARK: Analytics / reporting  (were /metrics/events/device/add and
    //                              /reports/addAttachment)

    func logDeviceEvents(_ events: [DeviceMetricEvent], device: PairedDevice?) async throws {
        // Intentionally empty. The cloud build queued these through a
        // `PublishSubject` with `.retry().repeat()` to
        // POST /metrics/events/device/add. Nothing is reported.
    }

    func uploadReport(attachment: Data, type: String) async throws {
        // Intentionally empty. Was multipart POST /reports/addAttachment, and
        // `report.powerwatch.com` WebView bridge.
    }

    // MARK: Sync

    /// Was `CloudSynchronizerImpl.syncAllDataToCloud()` =
    /// `mergeArray(deviceRepository.sync(), syncWatchLogsToCloud())`.
    /// Locally there is nothing to push; mark rows synced so the UI state
    /// matches a completed cloud sync.
    func syncAllDataToCloud() async {
        let logs = await store.activityLogs()
        if logs.contains(where: { $0.shouldSend }) {
            var cleared = logs
            for i in cleared.indices { cleared[i].shouldSend = false }
            await store.replaceActivityLogs(cleared)
        }
        let sessions = await store.activitySessions()
        if sessions.contains(where: { $0.shouldSend }) {
            var cleared = sessions
            for i in cleared.indices { cleared[i].shouldSend = false }
            await store.saveActivitySessions(cleared)
        }
    }

    /// `MainActivityViewModel` / the activity data providers use
    /// `hasBackgroundLogsToSync()` to force cache-bypass. Returning false keeps
    /// the local cache authoritative.
    var hasDataToSync: Bool {
        get async {
            let logs = await store.activityLogs()
            let sessions = await store.activitySessions()
            return logs.contains { $0.shouldSend } || sessions.contains { $0.shouldSend }
        }
    }

    var isLoggedIn: Bool { keychain.hasToken }
}

private extension String {
    var isValidEmail: Bool {
        // Same practical check the Android UI applied via
        // R.string.enter_valid_email ("Please enter a valid email address.").
        let parts = split(separator: "@", omittingEmptySubsequences: true)
        guard parts.count == 2, let domain = parts.last else { return false }
        return !parts[0].isEmpty && domain.contains(".") && domain.count > 2
    }
}
