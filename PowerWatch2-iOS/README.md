# PowerWatch 2 for iOS

A feature port of the Android companion app **`powerwatch.matrix.com.pwgen2android` v1.5.6
(versionCode 197)** to native SwiftUI/iOS, with **every outbound network call removed** while the
app stays fully functional.

The original app is local-first: it syncs over Bluetooth LE and merely *mirrors* its database to
Matrix's cloud. This port keeps the Bluetooth half (real Gen2 DTP protocol over CoreBluetooth) and
replaces the cloud half with local implementations, so the app makes **zero network requests** — it
does not even link a networking framework.

| | |
|---|---|
| Reverse-engineered from | `powerwatch.matrix.com.pwgen2android_1.5.6.apk` |
| Size / SHA-256 | 77,761,153 bytes / `2a90ae8919a4ff4e95f7c43790e4bdbeb13c14f99d0492c822751b48c7dc4af3` |
| Original SDK | minSdk 21, targetSdk 31, `BuildEnvironment.PRODUCTION_ENABLED = true` |
| iOS deployment target | 17.0 |
| Language | Swift 5, SwiftUI, MVVM + actors |
| Third-party dependencies | **none** (no SPM/CocoaPods packages at all) |
| Sources | 7,792 lines app code + 717 lines tests |

The full evidence trail — what was read out of the binary, what was inferred, and what remains
unknown — is in [`EVIDENCE.md`](EVIDENCE.md).

---

## Removed: the external API

`shared/cloud/http/HTTP.java` is a **single Retrofit interface** addressed with `@Url`, and every
absolute URL is built in `shared/cloud/EnvironmentKt.java`. That made removal tractable: one class
(`Sources/Cloud/LocalOnlyCloudAPI.swift`) implements the same call sites without a socket.

Removed outbound dependencies:

- `https://api.prod.powerwatch.com`, `https://api.dev.powerwatch.com`
  - OAuth2 `POST /oauth/token` with a hardcoded `Authorization: Basic <client-id:client-secret>`
    (both values deliberately not transcribed here)
  - `/pwuser/*` (create, update, login, activity sessions, walking/resting/sleep day|week|month,
    goals, updates, firmware), `/host/*` (pair, unpair, device list), `/metrics/*` (events),
    `/reports/*` (attachments/logs)
- Firebase — project `matrix-powerwatch-2` (FCM messaging, Analytics, Crashlytics/Fabric key)
- Bugfender log upload (app key `doUHqHUAhouAncAdrQHvO2SVw3ZGwg28`)
- `https://report.powerwatch.com` WebView + JS bridge
- Strava OAuth + TCX upload, Google Fit
- Google Maps / Baidu Maps tiles
- S3 downloads for firmware, fonts and AGPS (`ota_gps.bin`)
- Google Play in-app update check, hosted EULA page

### Proof there is no network path left

Verified against the freshly built `.app`:

```text
$ otool -L PowerWatch2.app/PowerWatch2.debug.dylib
  Foundation, Combine, CoreBluetooth, CoreFoundation,
  DeveloperToolsSupport, Security, UIKit, SwiftUI, AVFoundation

  # AVFoundation is the only addition beyond the sync stack: it is the QR reader on
  # the pairing screen (E-50), the iOS counterpart of the APK's ML Kit barcode
  # scanner. It is a system framework, so what *it* loads internally is Apple's
  # business; nothing in this binary asks it for anything but still-image metadata.

$ nm -u PowerWatch2.app/PowerWatch2.debug.dylib | grep -ciE 'urlsession|cfnetwork|nwconnection|_CFStream'
0

$ strings PowerWatch2.app/PowerWatch2.debug.dylib | grep -i http
   # 3 hits, all `xmlns=` URIs (GPX 1.1, XMLSchema-instance, TrainingCenterDatabase v2)
   # i.e. no host string survives in the binary at all

$ grep -rniE 'urlsession|nwconnection|okhttp|retrofit|firebase|crashlytics|bugfender' Sources/
   # hits only inside comments and the "Data & privacy" screen that lists removals

$ codesign -d --entitlements - PowerWatch2.app   # none
$ plutil -extract NSAppTransportSecurity …       # key absent: no ATS exceptions
```

Two call sites in the APK were *cloud-first* and are now local-first, which is what makes the app
work with no server at all:

| APK | Before | After |
|---|---|---|
| `GoalConfigurationRepositoryImpl.all` | `goalConfigService.getAllConfigurations().flatMap { … }.onErrorResumeNext { goalConfigDao.all() }`; it also seeds `listOf(GoalConfiguration())` when `dao.count() == 0`, which is why the entity's default arguments are what the user sees | `LocalStore.goals()` |
| `UserAccountRepositoryImpl.getFirst` | `userAccountService.getUser().onErrorResumeNext { userDao.getUser().toSingle() }` | `LocalStore.user()` |

Room was never a mere cache in the original: reads were
`cloudService.getAll…().flatMap { dao.saveCompletable(it) }.onErrorResumeNext { dao.all…() }` and
writes were `cloudService.save(item).andThen(dao.addCompletable(item))`, so everything the UI
rendered came from Room and the upload queue was just a `shouldSend` flag
(`notSyncedSessions()` selected the pending rows). Deleting the mirror therefore loses nothing.
The APK kept the login secret **in plaintext in SQLite** — `User.password TEXT`, and
again in `PasswordCredentials.password`, so `CloudErrorHandlerImpl` could re-run the OAuth2 password
grant after a 401. There is no server to re-authorize against, so the secret now lives only in the
**Keychain** (`KeychainStore.savePassword(_:for:)`): `UserAccount.password` remains as a schema-shaped
property but is excluded from `CodingKeys`, and `LocalStore.save(user:)` blanks it defensively.
`testPasswordNeverReachesDisk` asserts the snapshot never contains it while login still works.

---

## Build and run

Requires Xcode 16+ and [XcodeGen](https://github.com/yonaskolb/XcodeGen) (`brew install xcodegen`).

```sh
cd PowerWatch2-iOS
xcodegen generate                                    # writes PowerWatch2.xcodeproj
xcodebuild -project PowerWatch2.xcodeproj -scheme PowerWatch2 \
  -sdk iphonesimulator -destination 'generic/platform=iOS Simulator' \
  -configuration Debug build                           # ** BUILD SUCCEEDED **
```

Run the app from Xcode after the generate step, or install the built
`.app` with `xcrun simctl install booted <path>`.

### Tests

```sh
# Protocol + storage + sync + offline-API tests, no simulator required (~2 s)
./Tools/run-logic-tests.sh

# Full suite inside the app host (also checks app-bundle resources)
xcodebuild test -project PowerWatch2.xcodeproj -scheme PowerWatch2 \
  -destination 'platform=iOS Simulator,name=iPhone 15'
```

`Tools/run-logic-tests.sh` compiles the Foundation-only slice of the *same* sources as a temporary
SwiftPM package, so the wire-protocol and sync layers are testable even when no simulator runtime
is available. Current status: **56 tests, 0 failures, 1 skipped** (the skipped test asserts
`ota_gps.bin` is present in the app bundle, which only holds inside the app host).

### App icon

The icon is the PowerWatch mark from the APK, regenerated rather than screenshotted:

```sh
swift Tools/make-app-icon.swift ../powerwatch.matrix.com.pwgen2android_1.5.6.apk
```

It reads `res/mipmap-xxxhdpi-v4/app_icon.png` (what `aapt2 dump badging` reports as the launcher
icon — white mark on the maroon→red→orange glow) and `res/mipmap-xxhdpi-v4/splash_icon.png` (the
same mark at 237×444, the largest copy in the APK), keeps the tile's own background pixels, fills
the glyph area by diffusion so the glow is reproduced and not invented, and stamps the mark —
recoloured white — at the tile's measured glyph box. The output is the alpha-free 1024×1024 square
`Assets.xcassets/AppIcon.appiconset/appicon-1024.png` that iOS and the App Store require. The
APK's adaptive icon is *not* used: `mipmap/ic_launcher` is the stock Android Studio bugdroid on the
`#26a69a` grid, which Matrix never replaced (E-64). Re-run the tool after changing the asset
catalog, then `xcodegen generate`.

---

## Screens

Two tabs, matching the APK (History is reached from the Dashboard, as in the original):

- **Onboarding** — welcome, sign in / create account, profile (age 13–120, height, weight, gender),
  language (13 locales from `LanguageControllerImpl`), units, daily goals, clock format, permissions
- **Pairing** — the APK's own order: scan the watch's **QR code** with the camera (or type the
  pairing code, `EnterPinCodeFragment`) → BLE scan accepting the pairing screen's advertised name
  (`PowerWatch 2`, E-48) or the DTP/OTA service UUID, and once a code is known, the
  manufacturer-data pairing code (E-51, E-52) → 11.5 s window (E-49) → "Searching for %s" /
  "Connecting…" / "Saving information…" / "Success" exactly as `R.string` has them → connect →
  the `2a26` device-info read that `Gen2DeviceInfoCommand` really is (E-59) → the
  protocol-version pairing chain from `ExecutorsFactory` — for the observed version-4 watch that
  means `9010` StartPairing, `9124` GetUserAndGoalsVer3, `9024` SendUserPrefsAndGoalsVer3 (units,
  biometrics, goals, language, sleep-time selection), `9011` StopPairing (E-58) — under the APK's
  60 s window, then a local pair with `pid: 4` and the advertised protocol version;
  **simulated watch** button runs the same chain. "Can't see QR
  code?" reproduces `QRCodeTutorialFragment`'s three button presses that make the watch display
  the code. An empty scan prints
  why (radio state, Bluetooth authorization, how many advertisements were heard vs matched, and the
  names of the nearest neighbours) instead of a generic "no devices" line, because on iOS those
  causes need four different fixes on the phone.
- **Dashboard** — realtime header (heart rate, battery, sync state), day strip, pedometer chart,
  calories, sleep-stage bar, heart rate/HRV, body+solar generation vs consumption in µWh,
  skin/case temperature, activity list
- **History** — sessions per day, detail (pace, speed, elevation, calories, HR series, splits,
  track preview), edit, delete, **GPX/TCX export** via the share sheet
- **My PowerWatch** — personal settings (height and weight follow the chosen unit system:
  cm/kg or in/lb, editing converts back, so the model and the `9012`/`9024` payloads stay metric, E-63),
  daily goals, watch settings (the `93xx` block),
  notifications + app allow-list, alarm, timer, language, units, clock,
  "Data & privacy" (what was removed), contact support, about. No firmware row: that screen's only
  action could not flash a watch, so the entry is gone (EVIDENCE 17) and the version stays on the
  watch card and the pairing screen

---

## How it maps to the APK

| APK package / class | iOS file | Notes |
|---|---|---|
| `sdk/device/channel/*`, `ChannelStreamImpl` | `Sources/BLE/BLETransport.swift` | frame reassembly, `len + 4`, `0x9242` overflow guard |
| `sdk/protocol/DTPCommand` + `Gen2Command` | `Sources/BLE/Gen2Framing.swift` | request/response framing, CRC32, ACK constants |
| `sdk/protocol/commands/Gen2*Command` | `Sources/BLE/Gen2Commands.swift` | opcode table, payload builders, log decoders |
| `sdk/protocol/Gen2ExecutorImpl` | `Sources/BLE/Gen2ResponseCollector.swift` | ACK/response state machine, shared by both transports |
| `shared/extensions/NumberExtensionsKt.extractNumber` | `BitReader.extract` in `Gen2Framing.swift` | `(word & (mask << low)) >>> low` |
| `Gen2BackgroundLogCommandKt` (`generationArray` / `consumptionArray`) | `Sources/BLE/LogTables.swift` | transcribed verbatim, 64 + 256 entries, asserted by `testGenerationAndConsumptionTables` |
| `sdk/protocol/executors/Gen2Ver4SyncExecutorImpl` (chosen by `ExecutorsFactory` when `protocolVersion != 3`) + `shared/sync/WatchSynchronizerImpl` | `Sources/Sync/WatchSynchronizer.swift` | the command chain, then the formatter/save stage |
| `LogToHourGrouper1` / `HourToDayGrouper1` | `Sources/Sync/PeriodAggregator.swift` | hour rows → day rollup |
| `DeviceCommunicationQueuerImpl` | `OperationQueuer` in `WatchTransport.swift` | Blocker vs Discard operations |
| Room `PowerWatchDB` (schema 23, 14 tables) | `Sources/Store/LocalStore.swift` | actor; one `snapshot.json` covering all 14 entities, the three log tables and three hour-period tables consolidated behind a state discriminator |
| `shared/cloud/http/HTTP.java` + `EnvironmentKt` | `Sources/Cloud/LocalOnlyCloudAPI.swift` | every removed endpoint documented inline |
| Koin/Dagger modules: `AppModuleKt`, `DBModuleKt` (kept as `AppEnvironment` + `LocalStore`), `CloudModuleKt`, `HttpModuleKt`, `FCMModuleKt`, `LoggerModuleKt`, `ReportingModuleKt` (all five deleted with their bindings) | `Sources/App/AppEnvironment.swift` | DI container + observable store mirror |
| RxJava `ObservableField` view models | `ObservableObject` view models in `Sources/Views/**` | MVVM |
| `shared/extensions/UserPrefsUtilsKt` | `Sources/Utils/Formatters.swift` | unit strings incl. `powerUnit == " µWh"` |
| `GenericFileProvider` share + TCX namespace | `Sources/Utils/ActivityExport.swift`, `ShareSheet.swift` | GPX/TCX |
| `splash` / `setup` / `pair` / `main` activities & fragments | `Sources/App/RootView.swift`, `Sources/Views/**` | routing mirrors `SplashViewModel` |
| `pair/ui/gen2/QRPairingFragment`, `QRPairingViewModel.extractQRCode`, `EnterPinCodeFragment`, `QRCodeTutorialFragment` | `Sources/Views/Pairing/QRScannerView.swift`, `Sources/Utils/PairCode.swift`, `PairingViewModel` | ML Kit ▸ AVFoundation `.qr`; same "Pair code"/`open?…=` parsing (E-50) |
| `sdk/technologies/BleScanningTechnology.startMonitoring` (manufacturer-data ▸ pairing code) | `Gen2Advertisement` in `Sources/BLE/Gen2Framing.swift`, `DiscoveredWatch` | same byte order, same `-1`/`1` defaults (E-51) |
| `pair/ui/gen2/Gen2PairingProgressViewModel` (scan ▸ connect ▸ pair ▸ save pipeline, 60 s `timeout`, `ConnectionTimedOutError`/`ConnectionFailedError`, `searching_for_single_device`/`connecting_to_device`/`saving_info`/`success`) | `PairingViewModel.pair`/`scan`, `PairingError`, `R` in `Sources/Utils/ApkStrings.swift` | same order and same strings; `pairingTimeout = 60` checked between steps; failure disconnects as `onDestroyView` ▸ `stopConnection` does (E-62) |
| `sdk/protocol/executors/ExecutorsFactory.createPairExecutor` + `Gen2PairExecutorImpl` / `Gen2Version2PairExecutorImpl` / `Gen2Version3PairExecutorImpl` | `Gen2Command.pairingChain(protocolVersion:user:goals:settings:)` → `Gen2PairingStep` | same three chains and same `sendSingleCommandWithAck` semantics, with the executors' `0.1`/`0.3`/`0.4` progress powers driving the bar (E-57, E-58) |
| `sdk/protocol/commands/Gen2DeviceInfoCommand` (`GEN2_FIRMWARE_REQUEST` ▸ `read(CharacteristicType.FIRMWARE)`) + `Gen2DataFormatter.extractFirmwareInfo` | `WatchTransport.readDeviceInfo()` (GATT read of `2A26`), `BLETransport.applyDeviceInfo` | run before `9010` like the APK, and the saved device gets `pid: 4`; the DI-table/font tail is decoded only as far as the version string (E-59, E-60) |
| `pair/ui/PairingBaseViewModel.userData` ▸ `PairingConfig(UnitsInfoData, UserInfoData, GoalInfoData, LanguageInfoData)` | same store objects feed `Gen2Command.sendUserPrefsAndGoalsVer3`/`sendUserPrefsAndGoals` at pair time | the pair-time write is byte-identical to the sync one (E-61) |
| `main/watch/settings/personal/PersonalSettingsVM` + `utils/UserPrefsUtils.getValue` + `utils/{Height,Weight,Distance,Temperature,Calories}Converter` + `utils/UserPrefsUtilsKt` bounds | `Formatters.heightValue/centimetres/heightSuffix/height/heightRange`, `weightValue/kilograms/weightSuffix/weight/weightRange`, `PersonalSettingsView` | same factors (`÷2.54`, `×2.2046`, `×0.621371`, `×1.8+32`), same bounds and unit suffixes; the model keeps cm/kg so the wire format never sees an imperial number (E-63) |
| `aapt2 dump badging` ▸ `application-icon-640` = `res/mipmap-xxxhdpi-v4/app_icon.png`, `res/mipmap-xxhdpi-v4/splash_icon.png` | `Tools/make-app-icon.swift` ▸ `Assets.xcassets/AppIcon.appiconset/appicon-1024.png` | the launcher tile's white mark on the glow, rebuilt at 1024 from the APK's own pixels; `mipmap/ic_launcher` is the untouched Android Studio template and is ignored (E-64) |

There is no code and no data flow that survives from `shared/cloud/http`, Firebase, Bugfender,
Strava or Fit — those packages were deleted outright rather than stubbed at the call sites.

---

## The wire protocol (what was reverse-engineered)

DTP GATT service `00002760-08C2-11E1-9073-0E8AC72E1011` with write `…0011`, notify `…0012` and
ACK/event write `…0013`; OTA service `…1001` with `…0001`/`…0002`; plus the standard Device
Information (`180A`: `2A26`/`2A25`/`2A24`) and Heart Rate (`180D`: `2A37`) services.

Request frame (byte-exact from `Gen2Command.getHeader`):

```text
[len u16 LE = payload + 6][40 10][opcode hi][opcode lo][payload][CRC32 u32 LE over opcode+payload]
```

`CRC32` is `java.util.zip.CRC32` (reflected, poly `0xEDB88320`). The ACK constants embedded in the
DEX give free test vectors: `AckGood = 05 00 00 20 00 | 8D EF 02 D2` implies
`CRC32([0x00]) == 0xD202EF8D`, and `AckCRCInvalid` implies `CRC32([0x01]) == 0xA505DF1B`. Both are
asserted in `Tests/Gen2ProtocolTests.swift`. The control-package mark `06 00 00 30` re-triggers the
ACK write, exactly as `Gen2ExecutorImpl` does.

Responses carry **no opcode field** — `[len u16 LE][kind 0x1040][body][CRC32 u32 LE]`, with the
status in `body[0..1]` big-endian (`E200`/`E202` complete, `E102` busy, `E423` sync-locked). That
shape is the only one that satisfies both `extractPayload`'s `len == body.count + 4` and the
background log's `count % 16 == 0` guard; see EVIDENCE E-14.

Endianness is mixed by design, and each case is deliberate: frame length and CRC are little endian;
response type, log counts and the `9104` total are big endian; background/sleep/delta/header record
fields are little endian.

The sync itself replays the chain in `Gen2Ver4SyncExecutorImpl.create` (picked by `ExecutorsFactory`
whenever `protocolVersion != 3`):

```text
Device Info (2a26/2a25/2a24) → 9000 → 9126 → 9124 → 9024 + 93xx → 9107 → 9117
                             → 9215 → 9205 → 9106 → 9001
```

Position matters in two places: `9024 SendUserPrefsAndGoalsVer3` carries the epoch and timezone the
watch sets its clock from — and the background log's timestamps are RTL-anchored — so it has to
precede the log reads; and `9001 StopAmDTP` closes the session on the success path as well as the
error path. `9108 SleepLog` is **not** in the chain (it has no call site anywhere in the DEX and the
executor carries a literal `//TODO sleep log command`); sleep rows come from `9106`. `9120`/`9121`/
`9226` trace reads and the conditional `9011` location write are dropped with the services that
consumed them, and `9023 CleanAllLogs` — unconditional in the APK — is opt-in here. `Tools/run-logic-tests.sh`
pins all of this against the opcode trace the simulated watch records.

See [`EVIDENCE.md`](EVIDENCE.md) for the per-record bit layouts and their evidence level.

---

### Connecting

There is no Connect button, on iOS or on Android: `MainDashboardViewModel`'s constructor calls
`deviceManager.init()`, whose Bluetooth subscription runs `startConnection()` →
`communicator.startConnection(listOf(device.bluetoothAddress))`, and the connect then waits in
`establishConnection(autoConnect = true)` so it completes whenever the watch advertises (E-65).
`MainTabView`'s `.task` does the iOS half of that through `AppEnvironment.startConnection()`, which
re-arms after a dropped link and retries every 20 s while the dashboard is on screen;
`BLETransport.startConnection(to:)` resolves the paired peripheral from
`CBPeripheralsRegistry`/`retrievePeripherals(withIdentifiers:)`, scans only when CoreBluetooth has
no handle for it, and then leaves `connect(_:options:)` pending — CoreBluetooth's equivalent of
Android's `autoConnect = true`. Sync stays manual (pull to refresh), because in the APK the only
caller of `startSync()` is `onRefresh()`.

One hardware quirk makes the retry essential: a PowerWatch 2 advertises **only** while it sits on
Settings ▸ Show QR. A launch with the watch back on its dial is therefore expected to find nothing
and keep trying; put it on the QR screen and the pending request completes on its own.

### Realtime data

`Sync/RealtimeDataProvider.swift` mirrors `shared/data/providers/RealTimeDataProviderImpl`, whose
connected-device branch is `combineLatest(Observable.interval(0, 20, TimeUnit.SECONDS).flatMap {
queue(realtimeDataExecutor.readData(uid)) }, heartRateDataExecutor.receiveData(uid).startWith(0))`.
`readData` is not a DTP command: `Gen2ProtocolBasics.sendMessage` maps `GEN2_SERIAL_REQUEST` to
`channel.read(characteristicTypeMap[SERIAL])`, a GATT read of `2A25`, and follows it with
`SettingsDataProvider.loadSettingsFromWatch`, a read of `2A24`. Both payloads are lists of 4-byte
records — three little-endian value bytes plus a table id, `HSMTable` for `2A25` and `SettingTable`
for `2A24` — decoded by `Gen2InfoRecords`. Heart rate is not polled: it arrives on the `2A37`
notification stream, which is enabled during service enumeration.

Those two reads every 20 s are also what keeps the link alive. Without them a PowerWatch 2 drops an
idle iPhone after a handful of seconds (`didDisconnect: The connection has timed out unexpectedly.`),
which looks exactly like a broken auto-connect. The decoded `2A25` feeds the dashboard's realtime
card — steps, active calories, battery — while the stored day periods remain the fallback once the
values stop arriving, matching `mapToRealTimeData`'s `realtimeWatchData == null` branch.

---

## Working without a watch

`Sources/BLE/SimulatedTransport.swift` implements the same `WatchTransport` protocol, but instead of
returning canned Swift structs it **emits real wire frames** (`SyntheticEncoder.pack`, `packDelta`,
`packHeader`, `packSleep` → `Gen2Framing.encodeResponse`) and feeds them through the production
`Gen2ResponseCollector` and decoders. The simulator therefore has to satisfy the same CRC, framing
and record-alignment rules as real hardware — it cannot pass by faking results.

Selection lives in `AppEnvironment`: automatic (CoreBluetooth if authorised, otherwise simulated),
or forced from the pairing screen's Source picker. A synthetic day (sleep, idle, a lunchtime walk,
an evening ride, deterministic per-minute samples) is generated once per launch, so numbers are
stable across syncs.

---

## Security posture

The radio is the only reachable input: there is no network stack, no WebView, no URL scheme,
no entitlements file and no third-party dependency, so the review treated *a nearby peripheral*
as the attacker — anyone can advertise `PowerWatch 2` plus the DTP service UUIDs.

Verified absent by scan rather than by assumption: `URLSession`, `Socket`, `NWConnection`,
`WKWebView`, `evaluateJavaScript`; ATS exceptions and `CFBundleURLSchemes` in
`Support/Info.plist`; any `.entitlements`; any telemetry payload (`logDeviceEvents` and
`uploadReport` are empty bodies); any writer to the OTA characteristics. Every DTP payload
builder clamps with `UInt8(clamping:)`, every log decoder is length-guarded, `BitReader` is
only ever called with literal bit positions, and a frame's body is CRC-checked before it is
accepted or ACKed.

Hardened as a result of that review, each pinned by a test in
`Tests/OfflineFunctionalityTests.swift`:

| ID | Untrusted input | What it does now |
|---|---|---|
| H1 | `9215` marker timestamps (`u32` epochs) sized the split array | sessions beyond ±1 year of the phone clock, longer than 24 h, or ending before they start are dropped — `testSpoofedSessionWindowIsRejected` |
| H2 | frame flood, or a phantom `len` that never arrives | `Gen2ResponseCollector.maxAccumulatedBytes` (512 KB) fails the command, `BLETransport` drops `rxBuffer` past 256 KB and abandons a stalled partial frame after 5 s — `testCollectorRefusesAnUnboundedResponse` |
| M1 | keychain after Log Out | `logout()` clears the whole keychain service, so no `password:*` item outlives the account |
| M2 | health data at rest | `snapshot.json` and its directory carry `completeUnlessOpen`; an unreadable snapshot pauses persistence instead of being replaced by an empty one, and wipe paths delete it — `testUnreadableSnapshotIsNeitherLostNorOverwritten` |
| L1 | keychain item class | writes request `AfterFirstUnlockThisDeviceOnly`, kept out of read/delete queries so items from older builds stay deletable |
| L2 | History ▸ Edit session name became the export filename | charset and length cap, plus a containment check on the finished path — `testExportFileNameCannotChooseWhereTheFileLands` |
| L4 | `9205` GPS delta bytes | the running coordinate saturates at ±90 / ±180 — `testGPSDeltaStreamSaturatesInsteadOfDiverging` |
| L6 | snapshot write | failures are recorded in `lastPersistenceError` and logged instead of swallowed by `try?` |

The APK's hardcoded OAuth2 client id, secret and their base64 are no longer quoted anywhere in
this repository.

## Known gaps

- **No push notifications.** The APK used a `NotificationListenerService` to forward calls/messages
  over `9009`/`9019`/`9029`/`9039`/`9049`; iOS exposes no equivalent API, so only the allow-list is
  kept and the watch-side alert settings still work.
- **No map tiles.** Google/Baidu Maps were network providers; tracks render as a local polyline
  preview and export to GPX/TCX instead.
- **No firmware update screen.** The APK's row opened a download flow; the port removed the entry
  (EVIDENCE 17). `LocalOnlyCloudAPI` still answers the manifest request locally and serves the bundled
  `ota_gps.bin` instead of S3 (E-44), which is what the offline audit checks, but a real OTA would still
  need the chunked write to the OTA service, so nothing pretends to install.
- **Unverifiable field semantics.** A handful of scale factors could not be recovered from the DEX
  alone and are flagged in code and in `EVIDENCE.md` (U-02…U-07). The per-frame status word (U-01) is
  no longer one of them: a real watch sent `06 00 40 10 e2 00 91 83 91 2d`, which confirms the LE
  length, `0x1040` kind, `E200` status and CRC32 trailer, and its ACK matched `DTPAckType.AckGood`
  byte for byte (E-55).
- **BLE authentication is whatever the watch firmware offers, which is none.** DTP has no
  encryption, bonding or replay protection: integrity is a CRC32 and the pairing code is a
  16-bit number printed on the watch face. Reconnect is by the stored CoreBluetooth identifier
  rather than by name, so an impostor has to answer to that identifier, but the app does not
  then re-verify the advertisement's pairing code before writing the profile — and
  `PairedDevice` does not retain that code, so it could not. Left open deliberately; see the
  ledger's S-03.
- **The realtime poll logs the profile it reads** (`NSLog` in `BLETransport`, every ~20 s),
  which puts age, weight, height, goals and battery in the system log. It is what made the
  hardware verification in *Verified against real hardware* possible, so it is still on; a
  release that ships to more than one device should gate it (ledger S-04).
- **Denying Bluetooth falls back to the simulator** rather than to an error, so a phone without
  permission shows invented activity as if it were measured (ledger S-05).
- **The local account stores the password rather than a hash**, in the keychain, because the
  APK kept it in plaintext in Room and `isLoggedIn` has to survive relaunch. A salted hash would
  do the same job with less exposure (ledger S-06).
- **Only the version-4 pairing chain has been exercised on hardware.** `Gen2Command.pairingChain`
  implements all three routes `ExecutorsFactory` picks between — `9010 9102 9002 9012 9004 9103 9003 9013
  9011` for protocol version 0/1, `9010 9122 9022 9011` for 2, `9010 9124 9024 9011` for ≥ 3 (E-58) — but the
  only watch available for testing advertises version 4, so the older two chains are pinned by unit tests
  against the decompiled executors rather than by air traffic. Sync likewise stays on the Ver4 executor for
  every version, as the APK's `ExecutorsFactory` does for `protocolVersion != 3` (E-26, E-27).

## Verified against real hardware

A PowerWatch 2 (firmware `V2.8.4r2`) was driven from a physical iPhone; `EVIDENCE.md` E-53…E-57 are
the captures. Notable behaviours a simulator cannot teach:

- The watch **only advertises while the Show QR screen is up** — press the side button, Settings ▸
  Show QR. With an idle watch, 13–20 peripherals are heard per scan and none is a PowerWatch.
- The advertisement carries the name, `180A`/`180D` and the manufacturer-data pairing code, but **not**
  the proprietary DTP/OTA services, so those are discovered after connecting, not filtered at scan.
- The watch **retransmits any frame it has not heard an ACK for**, roughly every 10 s, and drops the
  link shortly after. Frames are therefore ACKed whether or not a command is in flight (E-56, bug 9).
- `2A24`/`2A25` return binary records rather than the strings the GATT spec promises (E-54).

To watch a live session, keep the phone wired and unlocked, then run

```sh
Tools/install-on-iphone.sh
xcrun devicectl device process launch --console --terminate-existing \
  --device <UDID> com.matrixindustries.powerwatch2.ios
```

and every scan, connection, GATT enumeration, transmitted opcode, received frame and ACK is printed
as `pw2-ble …`.

## Legal

Clean-room feature port for interoperability purposes, built from decompiled bytecode of a publicly
distributed APK. Firmware, trademarks and the PowerWatch name belong to Matrix Industries. This
build contains no Matrix or Google server endpoints.
