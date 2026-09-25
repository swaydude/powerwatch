---
name: reverse-engineer
description: Reverse engineer the Matrix PowerWatch 2 Android app by removing external API dependencies for offline/local-only operation. Covers APK decompilation, smali patching, BLE communication analysis, and cloud service removal.
---

## Reverse Engineering Matrix PowerWatch 2 App

This skill covers the process of reverse engineering the Matrix PowerWatch 2 Android companion app (`powerwatch.matrix.com.pwgen2android`, v1.5.6) to remove external API dependencies and enable fully offline/local operation.

### Project Structure

```
powerwatch/
├── powerwatch.matrix.com.pwgen2android_1.5.6.apk   # Original APK (77MB)
├── apktool-output/                                  # apktool decompilation
│   ├── AndroidManifest.xml
│   ├── apktool.yml
│   ├── assets/
│   ├── res/
│   ├── smali/                                       # Primary dex smali
│   ├── smali_classes2/                              # Secondary dex (Kotlin stdlib, framework)
│   └── smali_classes3/                              # Tertiary dex (cloud, core)
├── jadx-output/
│   ├── sources/                                     # Decompiled Java sources
│   └── resources/
├── patched/                                         # Patched APK build directory
│   ├── LoginCloudServiceImpl*.smali                 # Already-patched login service
│   ├── debug.keystore                               # Debug signing key
│   └── powerwatch-patched*.apk                      # Various patch attempts
├── tools/
│   ├── apktool_2.9.3.jar                            # Smali assembler (2.9.3)
│   └── apktool.jar                                  # Main apktool (2.9.3)
└── powerwatch-patched.apk                           # Latest patched APK
```

### App Architecture

**Package**: `powerwatch.matrix.com.pwgen2android`
**Min SDK**: 21 (Android 5.0)
**Target SDK**: 31 (Android 12)
**Dex files**: 3 (classes.dex, classes2.dex, classes3.dex)

The app follows an MVVM architecture with dependency injection via Koin:

```
powerwatch/matrix/com/pwgen2android/
├── PowerWatchApp.java              # Application class — Koin setup, Firebase, Bugfender
├── AppConfigPreferences.kt         # Build flavor toggle (prod/dev) via SharedPreferences
├── BuildEnvironment.kt             # Build-time configuration
├── EnvironmentKt.kt                # Cloud config factory — PROD/DEV base URLs and API endpoints
│
├── sdk/                            # Bluetooth LE communication layer
│   ├── DeviceManager.kt            # Entry point for BLE watch communication
│   ├── RealtimeWatchData.kt        # Real-time health data streaming
│   ├── ConnectionForegroundService.kt
│   ├── protocol/                   # BLE command protocol
│   │   ├── commands/               # Individual watch commands
│   │   ├── executors/              # Command execution framework
│   │   └── commands/watchsettings/ # Watch configuration commands
│   ├── highlevel/                  # High-level watch settings API
│   │   ├── SettingsExecutor.kt
│   │   ├── SettingsLiteCommunicator.kt
│   │   └── WatchSettingsExecutor.kt
│   ├── technologies/               # BLE technology implementations
│   ├── connection/                 # BLE connection management
│   └── channels/stream/            # Data stream channels
│
├── shared/
│   ├── cloud/                      # Cloud API services (THE TARGET FOR REMOVAL)
│   │   ├── CloudConfig.kt          # All API endpoint paths
│   │   ├── CloudImpl.kt            # Main cloud service facade — delegates to sub-services
│   │   ├── CloudSynchronizer.kt    # Sync coordinator between local DB and cloud
│   │   ├── LoginCloudService.kt    # Auth/login interface
│   │   ├── LoginCloudServiceImpl.kt
│   │   ├── auth/                   # OAuth2 authentication
│   │   │   ├── AuthService.kt
│   │   │   ├── OAuth2ServiceImpl.kt
│   │   │   ├── TokenProvider.kt
│   │   │   ├── TokenStorage.kt
│   │   │   └── PasswordCredentials.kt
│   │   ├── http/                   # HTTP client layer (Retrofit + OkHttp)
│   │   │   ├── HTTP.kt             # Retrofit interface definition
│   │   │   ├── HttpClient.kt
│   │   │   ├── HttpClientImpl.kt
│   │   │   ├── HttpConfig.kt       # Base URL and timeouts
│   │   │   └── AppInfoInterceptor.kt
│   │   ├── crudServices/           # Generic CRUD operations for each entity
│   │   │   ├── AddService.kt
│   │   │   ├── GetAllService.kt
│   │   │   ├── GetService.kt
│   │   │   ├── UpdateService.kt
│   │   │   ├── DeleteService.kt
│   │   │   ├── DeviceService.kt
│   │   │   ├── UserAccountService.kt
│   │   │   ├── UserActivityService.kt
│   │   │   └── ... (walking/sleeping/resting period services)
│   │   ├── userAccount/
│   │   ├── userActivities/
│   │   ├── device/
│   │   ├── activityPeriods/         # Walking, Resting, Sleep data
│   │   ├── activityLogs/
│   │   ├── updateInfo/              # OTA update checks
│   │   ├── goalConfiguration/
│   │   ├── fonts/                   # Watch font updates
│   │   ├── metrics/                 # Analytics telemetry
│   │   ├── strava/                  # Strava integration
│   │   ├── activityLogs/
│   │   └── cloud/
│   ├── data/                       # Local data layer (Room DB)
│   │   ├── db/                     # Room database entities and DAOs
│   │   ├── providers/              # Data providers (repositories)
│   │   ├── repositories/           # Data repositories
│   │   ├── models/                 # Data models
│   │   └── dataCalculation/        # Derived health metrics calculations
│   ├── sync/                       # Sync orchestration
│   ├── logger/                     # Logging infrastructure
│   └── host/                       # Host/device info provider
│
├── main/                           # UI layer
│   ├── MainActivity.kt
│   ├── dashboard/                  # Health dashboard (charts, realtime, running)
│   ├── watch/                      # Watch settings UI
│   ├── notification/               # Notification handling
│   ├── ota/                        # OTA update UI
│   └── appupdate/                  # App update checks
│
├── pair/                           # Device pairing flow
│   ├── PairingActivity.kt
│   ├── camera/                     # Camera-based pairing
│   └── ui/
│       ├── chooseProduct/
│       ├── gen1/                   # Gen 1 watch pairing
│       └── gen2/                   # Gen 2 watch pairing
│
├── setup/                          # Setup wizards
│   ├── getstarted/
│   ├── createaccount/              # Account creation
│   ├── signin/                     # Sign in flow
│   ├── verifyaccount/              # Email verification
│   ├── forgotpassword/
│   ├── changepassword/
│   ├── goals/
│   ├── language/
│   ├── units/
│   ├── notifications/
│   ├── biometrics/
│   ├── editBiometrics/
│   └── permissions/
│
├── fcm/                            # Firebase Cloud Messaging
│   ├── FirebaseMessagingService.kt
│   ├── FCMModule.kt
│   └── messages/
│
├── report/                         # Activity reports
│   ├── model/
│   ├── provider/
│   └── ui/
│
└── shared/
    ├── watchNotification/           # Notification listener services
    └── localNotifications/
```

### Cloud API Endpoints (from EnvironmentKt)

The app targets two environments:
- **Production**: `https://api.prod.powerwatch.com`
- **Development**: `https://api.dev.powerwatch.com`

OAuth2 client: `consumer_android` / `handball2015` (Basic auth: `Y29uc3VtZXJfYW5kcm9pZDpoYW5kYmFsbDIwMTU=`)

**All endpoints are relative to the base URL:**

| Category | Endpoint | Method | Purpose |
|----------|----------|--------|---------|
| Auth | `/oauth/token` | POST | OAuth2 password grant |
| User Account | `/pwuser/get` | GET | Fetch user profile |
| User Account | `/pwuser/add` | POST | Create user |
| User Account | `/pwuser/update` | PUT | Update user |
| User Account | `/pwuser/forgotPassword` | POST | Password reset |
| User Account | `/pwuser/changePassword` | POST | Change password |
| User Account | `/pwuser/verify` | POST | Email verification |
| User Account | `/pwuser/resendEmail` | POST | Resend verification |
| User Account | `/pwuser/fcmToken` | POST | Register push token |
| User Account | `/pwuser/devices` | GET | List paired devices |
| Device | `/host/pairDevice` | POST | Register new device |
| Device | `/host/updateDevice` | PUT | Update device info |
| Device | `/host/unpairDevice` | DELETE | Unpair device |
| Walking | `/pwuser/walking/hour` | GET | Hourly walking data |
| Walking | `/pwuser/walking/dayHours` | GET | Day hour walking data |
| Walking | `/pwuser/walking/weekHours` | GET | Week hour walking data |
| Walking | `/pwuser/walking/monthHours` | GET | Month hour walking data |
| Walking | `/pwuser/walking/day` | GET | Daily walking logs |
| Walking | `/pwuser/walking/week` | GET | Weekly walking logs |
| Walking | `/pwuser/walking/month` | GET | Monthly walking logs |
| Walking | `/pwuser/walking/add` | POST | Upload walking log |
| Resting | `/pwuser/resting/hour` | GET | Hourly resting data |
| Resting | `/pwuser/resting/dayHours` | GET | Day hour resting data |
| Resting | `/pwuser/resting/weekHours` | GET | Week hour resting data |
| Resting | `/pwuser/resting/monthHours` | GET | Month hour resting data |
| Resting | `/pwuser/resting/day` | GET | Daily resting logs |
| Resting | `/pwuser/resting/week` | GET | Weekly resting logs |
| Resting | `/pwuser/resting/month` | GET | Monthly resting logs |
| Resting | `/pwuser/resting/add` | POST | Upload resting log |
| Sleep | `/pwuser/sleep/hour` | GET | Hourly sleep data |
| Sleep | `/pwuser/sleep/dayHours` | GET | Day hour sleep data |
| Sleep | `/pwuser/sleep/weekHours` | GET | Week hour sleep data |
| Sleep | `/pwuser/sleep/monthHours` | GET | Month hour sleep data |
| Sleep | `/pwuser/sleep/day` | GET | Daily sleep logs |
| Sleep | `/pwuser/sleep/week` | GET | Weekly sleep logs |
| Sleep | `/pwuser/sleep/month` | GET | Monthly sleep logs |
| Sleep | `/pwuser/sleep/add` | POST | Upload sleep log |
| Activity Sessions | `/pwuser/activitySession/addWithData` | POST | Add activity session |
| Activity Sessions | `/pwuser/activitySession/update` | PUT | Update session |
| Activity Sessions | `/pwuser/activitySession/delete` | DELETE | Delete session |
| Activity Sessions | `/pwuser/activitySession/day` | GET | Daily sessions |
| Activity Sessions | `/pwuser/activitySession/month/activityDates` | GET | Monthly activity dates |
| Goal Config | `/pwuser/goal/addForUser` | POST | Set user goals |
| Goal Config | `/pwuser/goal/getByUser` | GET | Get user goals |
| OTA | `/pwuser/update/latest` | GET | Check for updates |
| Fonts | `/pwuser/update/fonts` | GET | Get available fonts |
| Metrics | `/metrics/events/device/add` | POST | Device telemetry |
| Metrics | `/metrics/events/app` | POST | App telemetry |
| Logs Upload | `/reports/addAttachment` | POST | Upload report attachments |

### Key Files for Cloud Removal

To strip external API dependencies, focus on these files:

1. **`EnvironmentKt.kt`** — Determines whether to use prod or dev API. Controlled by `AppConfigPreferences.PROD_ENABLED` flag in SharedPreferences (default: `true`). Setting to `false` switches to dev server.

2. **`CloudImpl.kt`** — The main cloud facade. Every public method delegates to sub-services. The constructor sets up the auth token pipeline via `httpClient.setHeadersProvider()`.

3. **`LoginCloudServiceImpl.kt`** — Already patched in this project (see `patched/LoginCloudServiceImpl_login.patched.smali`). Contains `login()`, `logout()`, `isLoggedIn()`.

4. **`CloudSynchronizer.kt` / `CloudSynchronizerImpl.kt`** — Orchestrates sync between local Room database and cloud API. This is likely the biggest integration point to redirect.

5. **`CloudModule.kt`** — Koin dependency injection module that wires all cloud services together.

6. **`setup/signin/`, `setup/createaccount/`, `setup/verifyaccount/`** — Account creation and sign-in flows that require cloud auth.

### Patching Strategy

**Already done in this project:**
- `LoginCloudServiceImpl` was patched (clean version, original backup, and patched version exist in `patched/`). The patch bypasses cloud login.
- APK was re-signed with debug keystore (`debug.keystore` in `patched/`).
- Multiple alignment/signing attempts are tracked via the `.idsig` files.

**To fully remove cloud dependencies:**

1. **Bypass authentication flows**:
   - Patch `LoginCloudServiceImpl.isLoggedIn()` to always return `true`
   - Patch `LoginCloudServiceImpl.login()` to return a mock/stored user
   - Bypass or stub the account creation/verification/setup flows

2. **Redirect sync to local-only**:
   - Patch `CloudSynchronizer` to skip cloud sync steps
   - Or stub the cloud services to return empty/local data

3. **Handle BLE communication independently**:
   - The SDK layer (`sdk/`) communicates with the watch via BLE and stores data in Room DB
   - Data flows: BLE → SDK → local DB → cloud upload
   - Removing cloud means keeping the BLE → local DB path intact

4. **Disable features that require cloud**:
   - OTA updates (`main/ota/`)
   - Font downloads (`shared/cloud/fonts/`)
   - Strava integration (`shared/cloud/strava/`)
   - Push notifications (`fcm/`)
   - Metrics/telemetry (`shared/cloud/metrics/`)
   - Activity sharing/reporting (`report/`)

### Toolchain

- **apktool 2.9.3** (`tools/apktool.jar`): Decode/rebuild APK (smali + resources)
- **apktool_2.9.3.jar** (`tools/apktool_2.9.3.jar`): Smali bytecode assembler
- **jadx**: Decompiles to Java sources (used for reading/understanding, not patching)
- **Keytool/ jarsigner**: Sign the rebuilt APK
- **zipalign**: Align APK before signing

**Rebuild pipeline:**
```bash
# 1. Decode
java -jar tools/apktool.jar d powerwatch.matrix.com.pwgen2android_1.5.6.apk -o apktool-output/

# 2. Patch smali files in apktool-output/smali*/ and apktool-output/smali_classes*/

# 3. Rebuild
java -jar tools/apktool.jar b apktool-output/ -o powerwatch-patched.apk

# 4. Align
zipalign -v 4 powerwatch-patched.apk powerwatch-patched-aligned.apk

# 5. Sign
jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 \
  -keystore patched/debug.keystore \
  powerwatch-patched-aligned.apk androiddebugkey

# 6. Verify with apksigner
apksigner verify --print-certs powerwatch-patched-aligned.apk
```

### Patched Files Already in Repo

| File | Description |
|------|-------------|
| `patched/LoginCloudServiceImpl.original.backup.smali` | Original LoginCloudServiceImpl before patching |
| `patched/LoginCloudServiceImpl.clean.smali` | Clean decompiled LoginCloudServiceImpl |
| `patched/LoginCloudServiceImpl_login.patched.smali` | Patched version — login bypass |

### Key Technical Notes

- **Build flavor toggle**: `AppConfigPreferences.PROD_ENABLED` controls prod vs dev API. Default is `true` (production). This can be set via SharedPreferences or patched in smali.
- **OAuth2 Basic token**: `Y29uc3VtZXJfYW5kcm9pZDpoYW5kYmFsbDIwMTU=` decodes to `consumer_android:handball2015`. This is the API client credentials for the password grant flow.
- **Token refresh**: `CloudImpl` sets up a continuous `PublishSubject` pipeline that refreshes tokens, handles `InvalidGrant` errors, and injects `Authorization` headers into all HTTP requests.
- **Retrofit interface**: `HTTP.kt` defines the raw HTTP methods (GET, POST, GET stream, multipart upload). Higher-level services compose these with specific endpoints.
- **RxJava everywhere**: All async operations use RxJava (`Single`, `Completable`, `Observable`, `PublishSubject`). Patching smali for these requires understanding the reactive chain.
- **Room database**: Local persistence via Room. Data models are in `shared/data/models/`. The database persists health data (walking, resting, sleep logs) regardless of cloud sync.
- **Koin DI**: All services are wired via Koin modules (`AppModuleKt`, `CloudModuleKt`, `HttpModuleKt`, `DBModuleKt`, `FCMModuleKt`). Removing cloud services requires updating these module definitions.
- **Firebase**: The app uses Firebase Cloud Messaging for push notifications and Crashlytics for crash reporting. These can be stubbed or removed.

### GMS / Google Services

The app depends on Google Play Services for:
- Firebase (FCM push notifications, analytics)
- Google Sign-In (`com.google.android.gms.auth.api.signin`)
- Google Maps API keys (both Google and Baidu)
- Play Core (dynamic feature modules)

These can be disabled by removing their manifest entries or stubbing the services.

### Strava Integration

`shared/cloud/strava/` contains a secondary OAuth2 flow for Strava (fitness platform). The Strava config endpoints:
- Token: `/oauth/token`
- Deauthorize: `/oauth/deauthorize`
- Upload: `/api/v3/uploads`

This is independent of the main Matrix cloud auth.