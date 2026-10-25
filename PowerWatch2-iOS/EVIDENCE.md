# Evidence and unknowns ledger

Everything claimed about the original app is tagged with a confidence level and, where possible, a
byte-level check that can be re-run. Nothing in the iOS port was guessed where the binary could
answer the question.

**OBSERVED** — read directly out of the decompiled APK (byte constants, method bodies, resources).
**INFERRED** — the only model consistent with several independent observations; stated as such.
**UNKNOWN** — could not be decided from static analysis; needs a BLE capture against hardware.

---

## Target identity

| Field | Value | Level |
|---|---|---|
| Path | `powerwatch.matrix.com.pwgen2android_1.5.6.apk` | OBSERVED |
| SHA-256 | `2a90ae8919a4ff4e95f7c43790e4bdbeb13c14f99d0492c822751b48c7dc4af3` | OBSERVED |
| Size | 77,761,153 bytes | OBSERVED |
| Package | `powerwatch.matrix.com.pwgen2android` | OBSERVED |
| versionName / versionCode | `1.5.6` / `197` | OBSERVED |
| minSdk / targetSdk | 21 / 31 | OBSERVED |
| Environment | `BuildEnvironment.PRODUCTION_ENABLED = true` | OBSERVED |
| Decompiled Java | 10,383 files under `work/jadx-out/sources/` | OBSERVED |

## Tooling note

REA's JADX provider was unusable in this environment (`REA_JADX_MCP_JAR` unset; the only JDK on
`JAVA_HOME` was a broken x86_64 JDK 15). Resource/manifest decoding used REA's
`decode_android_resources` (apktool route, worked); Java decompilation used the already-installed
`jadx` 1.5.6 CLI. No new toolchain was installed.

---

## BLE transport

| ID | Claim | Level | Source | iOS |
|---|---|---|---|---|
| E-01 | DTP service `00002760-08C2-11E1-9073-0E8AC72E1011`; write `…0011`, notify `…0012`, ACK/event `…0013` | OBSERVED | literal UUID strings in `sdk/protocol/BLEServicesKt` | `BLETransport.swift` |
| E-02 | OTA service `…E1001` with characteristics `…0001`/`…0002` | OBSERVED | same file (all seven UUIDs are string literals there) | `BLETransport.swift` |
| E-03 | Device Information `180A` (`2A26` firmware, `2A25` serial, `2A24` model); Heart Rate `180D`/`2A37` | OBSERVED | `Gen2ProtocolBasics` reads | `BLETransport.readDeviceInfo`, `HeartRateParser` |
| E-04 | Peripheral name filter accepts `PowerWatch`, `Powerwatch`, `powerwatch`, `PW_X` | OBSERVED | `isPowerWatchDevice` | `BLETransport` scan filter, `SimulatedTransport.simulatedName` |
| E-05 | Stream reassembly: total frame length = LE u16 at `[0]` **+ 4**; declare `0x9242` (37442) to drop a buffer | OBSERVED | `ChannelStreamImpl` | `BLETransport.consumeNotification`, asserted in `testRequestFrameLengthFieldMatchesStreamReassembly` |

## Framing, CRC and ACKs

| ID | Claim | Level | Source | iOS |
|---|---|---|---|---|
| E-06 | Request frame `[len u16 LE = payload + 6][40 10][opcode hi][opcode lo][payload][CRC32 u32 LE]` | OBSERVED | `Gen2Command.getHeader` | `Gen2Framing.encode` |
| E-07 | CRC is `java.util.zip.CRC32` (reflected, poly `0xEDB88320`, init/final xor `0xFFFFFFFF`) | OBSERVED | field type in the command header builder | `CRC32` in `Gen2Framing.swift` |
| E-08 | `CRC32([0x00]) == 0xD202EF8D`, `CRC32([0x01]) == 0xA505DF1B` | OBSERVED | derived from the DEX's own ACK constants, cross-checked against `zlib.crc32` | `testCRC32MatchesAckGoodConstant`, `testCRC32MatchesAckCRCInvalidConstant` |
| E-09 | `AckGood = 05 00 00 20 00 8D EF 02 D2`, `AckCRCInvalid = 05 00 00 20 01 1B DF 05 A5` | OBSERVED | `DTPAckType` enum | `Gen2Framing.ackGood` / `ackCRCInvalid` |
| E-10 | Control-package mark `06 00 00 30`; receiving it re-triggers the ACK write | OBSERVED | `Gen2ExecutorImpl` control listener | `Gen2ResponseCollector.ingest → .controlResend` |
| E-11 | Status codes read from `body[0..1]` **big endian**, from `ResponseType`: `SUCCESS` E200 and `PROCESSING` E202 continue, `WAIT` E102 aborts with "Watch is busy, sync not available", `LOCKED` E423 with "Error: activity is in progress", `ERROR` E404 with "Error: Unknown" | OBSERVED | `sdk/protocol/commands/ResponseType` (hex + string codes), dispatched in `Gen2Command`, messages in `DTPProtocolError` | `Gen2ResponseCode` in `Gen2Framing.swift` (`success 0xE200`, `processing 0xE202`, `watchBusy 0xE102`, `error 0xE404`, `syncLocked 0xE423`); the user-facing busy text uses the `resources.arsc` string "Watch is busy, please try later." |
| E-12 | 15 s ACK timeout, 15 s response timeout, 200 ms delay before writing our ACK | OBSERVED | `Gen2ExecutorImpl.sendSingleCommandWithAck` | `Gen2ResponseCollector` / `BLETransport` |
| E-13 | `sendWithAck` = `zip(readWithAck, sendWithAck + controlListener).firstOrError()` | OBSERVED | same | `BLETransport.perform` |
| E-14 | **Responses carry no opcode field**: `[len u16 LE][kind 0x1040][body][CRC32 u32 LE]` | **INFERRED** | Only layout satisfying both `extractPayload`'s `len == body.count + 4` and the background-log guard `count % 16 == 0` (a 2-byte opcode slot makes both unsatisfiable simultaneously) | `Gen2Framing.encodeResponse` / `extractPayload` |

## Bit extraction and record layouts

| ID | Claim | Level | Source | iOS |
|---|---|---|---|---|
| E-15 | `extractNumber(word, low, high, useSign)` = `(word & (mask << low)) >>> low`, with sign extension when `useSign` | OBSERVED | `shared/extensions/NumberExtensionsKt` (`createMask` builds `(1<<width)-1` then shifts left) | `BitReader.extract` |
| E-16 | Background log `9106`: 16-byte records read as four **little-endian** words; temps are raw ¼-degree units divided by `4.0f` at display time, with the 9-bit `> 255 → −512` (also `> 512 → −512` in the period aggregators) sign correction | OBSERVED | `Gen2BackgroundLogCommand.parseSingleLog` (`ByteBuffer.order(LITTLE_ENDIAN)` + four `getInt`), `UserPrefsUtilsKt` `getSkinTemp() / 4.0f`, `TemperatureDataContainer` min/avg/max handling | `BackgroundLogDecoder` |
| E-16a | Exact field map — w0: logTimeIndex`[0,6]`, walkStepDelta`[7,14]`, runningStepDelta`[15,22]`, distanceDelta`[23,31]`; w1: activeCalories`[0,14]`, bmrCalories`[15,25]`, thermalGen`[26,31]`→`generationArray`; w2: caseTemp`[0,8]`, powerConsumed`[9,16]`→`consumptionArray`, heartRate`[17,24]`, hrv`[25,31]`; w3: battery`[0,6]`, solarGen`[7,12]`→`generationArray`, skinTemp`[13,21]` signed, logType`[22,25]` | OBSERVED | `parseSingleLog`'s 15 `extractNumber` calls and the `Gen2BackgroundLog(logType, logTimeIndex, logTableTime, walkStepDelta, runningStepDelta, distanceDelta, battery, activeCalories, bmrCalories, heartRate, powerLog, hrv)` / `WatchPowerLog(caseTemp, skinTemp, thermalGen, solarGen, powerConsumed)` constructor orders | `BackgroundLogDecoder.RawRecord` — byte-for-byte agreement, asserted by `testBackgroundLogRoundTrip` |
| E-16b | `LogType.enumValue`: DevOffWrist 0, SleepDeep 1, SleepLight 2, SleepRestless 3, AwakeStill 4, AwakeWalking 5, AwakeRunning 6, AwakeBike 7, AwakeVehicle 8, StateUnknown 9 — the 4-bit wire value maps by equality against these, falling back to `StateUnknown` | OBSERVED | `sdk/protocol/commands/LogType` sealed subclasses (`super(n, null)`), dispatch in `parseSingleLog` | `WatchLogType` raw values match exactly |
| E-17 | Thermal/solar/consumption fields are **indices**, resolved through lookup tables | OBSERVED | `Gen2BackgroundLogCommand.extractResponse` + the arrays in `Gen2BackgroundLogCommandKt` | `LogTables.generation/consumption` |
| E-18 | `generationArray` has 64 entries, `consumptionArray` 256; `consumptionArray[69]` is literally `ActivityConstantsKt.WEEK_HOURS_PAGE_LIMIT` = 168 | OBSERVED | `Gen2BackgroundLogCommandKt` (both arrays are `private static final int[]` literals there) | `testGenerationAndConsumptionTables` |
| E-19 | Entries grouped by `logTimeIndex`; each group seeded from `timestampData[index]` (itself RTL index → timestamp), `roundMillisToSeconds` then +60 000 ms per entry, and the advanced value is written back; out-of-range index → `InvalidBackLogTimestampIndex` | OBSERVED | `Gen2BackgroundLogCommand.extractResponse`'s `timestampData` loop | `BackgroundLogDecoder.parse`, `testLogTimeIndexOutOfRangeIsDropped` |
| E-20 | `isSleep` = logType ∈ {Deep, Light, Restless}; the stored `WatchLogEntry.state` is Deep→**5**, Light→**3**, Restless→**1**, else **0** — and `WatchEntryToSleepFormatter` maps 1→RESTLESS, 3→LIGHT, 5→DEEP, else SLEEP_AWAKE | OBSERVED | `Gen2BackgroundLogCommand.extractResponse` (the `i = 5 / 3 / 1 / 0` chain before `new WatchLogEntry(...)`), `shared/data/logPeriodsFormatters/WatchEntryToSleepFormatter` | `WatchLogType.isSleep` / `sleepClassification` |
| E-21 | `9126 GetLogCountVer3`: six **big-endian** u32 — realtimeStatus, realtime, activityHeader, activityDelta, background, sleep | OBSERVED | `Gen2Ver3GetLogCountCommand` | `Gen2LogsCount.parseVer3`, `testLogCountVer3IsBigEndian` |
| E-22 | RTL pairing: `9107 RTLStatus` then `9117 RTLTime`, and RTLTime reverses the payload, reads BE u32s and reverses the list | OBSERVED | `RTLTimeCommand.extractResponse` | `SimulatedTransport.rtlTimeBody`, `RTLTable.parseTime` |
| E-23 | `9205` delta record: type `[0,3]`, step `[4,9]`, calsBMR `[10,15]`, calsActive `[16,21]`, power `[22,29]`; gpsLat `[0,7]`, gpsLong `[8,15]`; heartRate `[0,7]`, hrv `[8,14]`, distance `[15,23]`, caseTemp `[24,27]`, skinTemp `[28,31]` | OBSERVED | `Gen2Ver3ActivityDeltaCommand` extractNumber bounds | `ActivityDeltaDecoder`, `testActivityDeltaDecode` |
| E-24 | `9215` header record (48 B): isEnd `[0,5]`, activityId `[6,13]`, startStepsWalk `[14,31]`, startLogIndex u32, time u32, lat/lon as IEEE-754 floats (`Float.intBitsToFloat`), altitude `[0,15]`, activeCals `[0,23]`+heartRate `[24,31]`, caseTemp `[0,8]`+skinTemp `[9,17]`+activityType `[18,25]`, logDistance `[0,18]`, then thermal/solar/power u32 | OBSERVED | `Gen2Ver3ActivityHeaderCommand` | `ActivityHeaderDecoder`, `testActivityHeaderDecode` |
| E-25 | Heart Rate measurement: flags byte, 8-bit or **big-endian** 16-bit value | OBSERVED (16-bit endianness **UNKNOWN**, see U-02) | `Gen2ProtocolBasics` HR notification handler | `HeartRateParser`, `testHeartRateParserEightAndSixteenBit` |
| E-26 | `9024 SendUserPrefsAndGoalsVer3` payload is 32 bytes, big endian: 24h flag, metric flag, u32 epoch, i16 tz-minutes, `!male`, age, u16 weight, u16 height×10, u32 steps, u32 distance, u32 calories, u32 sleep, language, sleep-time selection | OBSERVED | `Gen2SendUserPrefsAndGoalsVer3Command` | `Gen2Command.sendUserPrefsAndGoalsVer3`, `testSendUserPrefsAndGoalsPayloadIs32BytesBigEndian` |

## Sync sequence

| ID | Claim | Level | Source | iOS |
|---|---|---|---|---|
| E-27 | The sync chain is `Gen2Ver4SyncExecutorImpl.create` — chosen by `ExecutorsFactory` when `protocolVersion != 3` — and runs: Device Info → `9000` → [`9011` SendUserLocation] → `9126` → `9124` → `9024`+`93xx` → `9107` → `9117` → `9215` → `9205` → `9106` → [`9120`,`9121`,`9226`] → `9023` → `9001` | OBSERVED | Kotlin source retained in the `checkNotNullExpressionValue` string of `Gen2Ver4SyncExecutorImpl` | `WatchSynchronizer.runSync`, pinned by `testSyncCommandOrderMatchesVer4Executor` |
| E-27a | `9024` is sent **before** the log reads, not after | OBSERVED | same chain: `9024` sits between `9124` and `9107` | it carries the epoch + timezone the RTL decode is anchored to, so the order is load-bearing |
| E-28 | On failure the executor still runs `stopSync()` (`onErrorResumeNext(handleSyncError)`), and `9001` is also on the success path | OBSERVED | same chain | `runSync`: success-path send + `catch` block |
| E-28a | `9124 GetUserAndGoalsVer3` has no payload and no `extractResponse` — an ack-only exchange | OBSERVED | `Gen2GetUserAndGoalsCommandVer3 extends Gen2AbstractCommand` with no overrides; id from `Gen2CommandIDs` | `Gen2Command.getUserAndGoalsVer3` |
| E-29 | Queue semantics: one operation in flight; `Blocker` operations make `Discard` operations complete immediately | OBSERVED | `DeviceCommunicationQueuerImpl` | `OperationQueuer` |
| E-30 | `9023 CleanAllLogs` is issued **unconditionally** at the end of the Ver4 chain (not only from a reset action), at `power = 0.025 × power` | OBSERVED | same chain | sent only when `clearsWatchLogsAfterSync` is on: it destroys the watch-side copy, and de-duplication by entry id makes re-reads idempotent, so keeping it opt-in is strictly safer |
| E-31 | Hour-period tables **are** stored and read (`getRestingHourPeriods(start,end)`, `lastRestingHour()`); the three formatters write them in one `Completable.mergeArray`. There is **no** day/week/month table — those figures are computed | OBSERVED | `RestingHourPeriodDao`, `WatchSynchronizerImpl` formatter block | `HourPeriod` + `PeriodAggregator`; day rollup computed on demand |
| E-31a | Logs are split three ways by state (`WalkingLog`/`SleepLog`/`RestingLog`) from one decoded container; sleep hour periods go through `SleepFiveMinsPeriodFormatterImpl` **then** `SleepHourPeriodFormatterImpl` | OBSERVED | `WatchSynchronizerImpl.m3382_init_$lambda27`, `LogsContainer`, formatter chain | one `backgroundLogs` collection with a `logType` discriminator; hour sleep type is the per-hour majority (an approximation of the two-stage five-minute → hourly formatter) |

## Storage and defaults

| ID | Claim | Level | Source | iOS |
|---|---|---|---|---|
| E-32 | Room `PowerWatchDB`, schema version 23, identityHash `7eea0e60d59cd2ba54d78e05b0b90fa3`, with 14 entities: `User`, `PasswordCredentials`, `Device`, `DefaultPhoneWatch`, `GoalConfiguration`, `UpdateInfo`, `UserActivityDate`, `UserActivitySession`, `WalkingLog`, `RestingLog`, `SleepLog`, `WalkingHourPeriod`, `RestingHourPeriod`, `SleepHourPeriod` | OBSERVED | `@Database` annotation + the `CREATE TABLE` statements in `RoomDB_Impl.java` | `LocalStore.Snapshot` — **one** `snapshot.json` in Application Support holding one collection per entity, with the three log tables and the three hour-period tables each consolidated behind a `state`/`logType` discriminator |
| E-32a | `User` has a `password TEXT` column and `PasswordCredentials` holds `accessToken/tokenType/refreshToken/expiresIn/scope/tokenValidUntil/email/password` — i.e. the APK stored the login secret **in plaintext in SQLite** | OBSERVED | `CREATE TABLE \`User\``, `CREATE TABLE \`PasswordCredentials\`` | kept as a transient property: absent from `UserAccount.CodingKeys`, `LocalStore.save(user:)` blanks it, and the secret lives in `KeychainStore` (`password:<email>` item). Pinned by `testPasswordNeverReachesDisk` |
| E-32b | `User.height` is `INTEGER`, `weight REAL`, `timeFormatType INTEGER` | OBSERVED | same | `UserAccount.height` is a `Double` because the wire value is height×10; the on-disk column type is not reproduced |
| E-32c | The `notSyncedLogs` / `notSyncedSessions` columns exist only to select rows for upload (`notSyncedLogs()`, `notSyncedLogsCount()`, `notSyncedSessions()`) | OBSERVED | the four activity DAOs | dropped with the uploader |
| E-33 | `GoalConfiguration`'s Kotlin default arguments are calories **2000**, distance **5000.0f**, power **6000**, sleep **480** min, steps **5000**, id 0, `shouldSync` false, `createdAt = System.currentTimeMillis()`. Separately, `SingleGoalEditViewModel` substitutes **10000** steps / **2000** calories when the edit field is empty, which is where the "10 000 steps" figure comes from | OBSERVED | the synthetic `GoalConfiguration(… int i5, DefaultConstructorMarker)` constructor's `i5 & n` ternaries in `shared/data/models/GoalConfiguration.java`; `setup/goals/SingleGoalEditViewModel` | `GoalConfiguration()` uses the entity values; `OnboardingFlow.stepsGoal` starts at 10 000 like the edit screen |
| E-34 | Battery levels are three singletons with thresholds `Critical` 5.0f, `Low` 10.0f, `Normal` 100.0f, selected with `<=`, and the notification texts are `String.format`ed from `battery_critical` / `battery_low` ("Your PowerWatch 2 battery is critical - %s%%" / "…is low - %s%%") under the title "Battery Status" | OBSERVED | `main/battery/BatteryChangeLevel` (+ `getLevel`), `BatteryNotificationCenter`, `main/battery/ResourcesKt`, the literals in `resources.arsc` | `Formatters.batteryLevel(_:charging:)` / `batteryMessage(for:percent:)` |
| E-35 | Age bounds `ageMin = 13`, `ageMax = 120`, `ageDefault = 25` | OBSERVED | `utils/UserPrefsUtilsKt` | `OnboardingViewModel`, `PersonalSettingsView` |
| E-35a | The language picker is a 13-entry `List<LanguageInfo>` (Locale-based); Chinese is resolved by country match — `hk`, `tw` and `mo` all select Traditional, matching this port's single `zh_TW` case | OBSERVED | `utils/LanguageControllerImpl.languageInfos` (13 `LanguageInfo(...)` entries) and its `StringsKt.contains(country, "hk"/"tw"/"mo", true)` chain | `AppLanguage` (13 cases, `zh_CN`/`zh_TW` → `zh-Hans`/`zh-Hant`) |
| E-36 | Power unit string is `" µWh"` (leading space) | OBSERVED | `UserPrefsUtilsKt.powerUnit` | `Formatters.powerUnit` |
| E-37 | TCX export uses the TrainingCenterDatabase **v2** namespace | OBSERVED | literal string in the DEX | `ActivityExport.tcx`, asserted in `testGPXAndTCXExportProduceValidDocuments` |

## Cloud surface (what had to go)

| ID | Claim | Level | Source | iOS |
|---|---|---|---|---|
| E-38 | Single Retrofit interface `shared/cloud/http/HTTP.java`, all endpoints via `@Url` | OBSERVED | class body | — (deleted) |
| E-39 | `PROD_BASE_URL = https://api.prod.powerwatch.com`, `DEV_BASE_URL = https://api.dev.powerwatch.com` | OBSERVED | `shared/cloud/EnvironmentKt` | documented in `LocalOnlyCloudAPI` header |
| E-40 | OAuth2 `POST /oauth/token` carried a hardcoded `Authorization: Basic <client-id:client-secret>`; the pair is in the DEX and is deliberately not transcribed here | OBSERVED | interceptor constant | `LocalOnlyCloudAPI.login` issues a local token instead, and no copy of the credential is kept in this repository |
| E-41 | Firebase project `matrix-powerwatch-2`; Bugfender key `doUHqHUAhouAncAdrQHvO2SVw3ZGwg28`; Fabric/Crashlytics key | OBSERVED | `AndroidManifest.xml` metadata + `google-services.xml` | removed |
| E-42 | Account verification via browser deep link `com.matrixpowerwatch.verify`, EULA at `https://www.powerwatch.com/pages/eula`, support at `https://report.powerwatch.com` | OBSERVED | manifest intent filters + string resources | steps collapse; screens stay with local content |
| E-43 | Writes were **Room-first with the cloud as a separate step**: `BaseLogRepositoryImpl.save(items, toCacheOnly)` maps `copyItem(it, true)` (the `shouldSend` flag) and runs `getSaveLogsCompletable` → `walkingLogDao.saveCompletable(logs)`; the upload is a different chain, `getSaveCloudCompletable` → `walkingLogCloudService.saveAllWalkingLogs(logs)`, whose failure lands in the empty `logUploadFailedError()` override. Only 5 of the 68 `*Impl` repositories use `onErrorResumeNext` at all | OBSERVED | `shared/data/repositories/activityLogs/BaseLogRepositoryImpl.java`, `WalkingLogRepositoryImpl.java` | `LocalStore` is the only tier; `shouldSend`/`notSynced*` dropped with the uploader |
| E-43a | Two read paths were cloud-first: `GoalConfigurationRepositoryImpl.all` (`goalConfigService.getAllConfigurations() … .onErrorResumeNext { goalConfigDao.all() }`) and `UserAccountRepositoryImpl.getFirst` (`userAccountService.getUser().onErrorResumeNext { userDao.getUser().toSingle() }`). The goals repository also seeds `listOf(GoalConfiguration())` when `dao.count() == 0`, so the entity defaults are what a fresh install shows. The lone "be sure to store it in local cache even if error occurs" comment is in `DeviceRepositoryImpl` | OBSERVED | `shared/data/repositories/GoalConfigurationRepositoryImpl.java`, `UserAccountRepositoryImpl.java`, `DeviceRepositoryImpl.java` (retained Kotlin source in the `checkNotNullExpressionValue` strings) | those two flipped to local-first; `LocalStore` seeds the same default `GoalConfiguration()` |
| E-44 | Firmware/font/AGPS downloads come from the API host/S3; `ota_gps.bin` is the AGPS payload | OBSERVED | update repository + `assets/ota_gps.bin` (70 736 bytes) | bundled verbatim; `downloadFirmware` reads `Bundle.main` |
| E-45 | `9120 HeaderTraceLog`, `9121 AccelDataTraceLog` and `9226 ErrorLog` are read at the end of every sync and handed to `TraceLogger`/`BugfenderConfig` — device-side diagnostics for log upload | OBSERVED | the Ver4 chain + `TraceLogger`, `BugfenderConfig` | not sent: with no log service there is no consumer. The opcodes are still defined in `Gen2Opcode` |
| E-46 | `9011 SendUserLocationCommand` is sent mid-sync only when `LocationInfoProvider` has a valid fix, i.e. from the Play-Services location client | OBSERVED | the Ver4 chain's `locationInfoProvider.getLastStoredLocation()` branch | not sent — that provider was one of the removed outbound dependencies |
| E-47 | The only URL-shaped literals left in the shipped binary are the GPX 1.1, XMLSchema-instance and TrainingCenterDatabase v2 **namespace** URIs; there is no host string at all | OBSERVED | `strings PowerWatch2.debug.dylib \| grep -i http` → 3 hits, all `xmlns=` | asserted in the README audit block |
| E-48 | The pairing screen's BLE scan filters on the **advertised name `PowerWatch 2`**: `communicator.startScanning(listOf(ScanFilter.Builder().setDeviceName("PowerWatch 2").build()))`, logged as "Device PW2 found, extracting advertising information...". So `isPowerWatchDevice`'s four exact names (E-04) are the *classic*-BT rule, not the Gen2 LE one — a real watch's name would have failed that predicate | OBSERVED | `pair/ui/gen2/Gen2PairingProgressViewModel.java` (`lambda-20$lambda-15`), `sdk/technologies/BleScanningTechnology.java` (`startMonitoring`, `startMonitoring$lambda2`) | `PWUUID.isPowerWatchName` matches as a **prefix**, so it covers `PowerWatch 2` plus both rules; `didDiscover` also accepts an unnamed peripheral that advertises the DTP or OTA service, the signal `ProtocolCreatorImpl` really keys on |
| E-49 | Discovery tuning: `BleScannerConfiguration` defaults to `ScanMode.SCAN_MODE_LOW_LATENCY`, empty filters and **no** timeout; the classic scanner wraps discovery in `timeout(11500, MILLISECONDS).retryWhen`, and the whole Gen2 pairing step in `timeout(60, SECONDS)` | OBSERVED | `sdk/core/BleScannerConfiguration.java` (default-arg bitmask → `SCAN_MODE_LOW_LATENCY`/`emptyList()`/`null`), `sdk/core/BluetoothScannerImpl.java`, `Gen2PairingProgressViewModel.java` | `PairingViewModel.scan` uses an 11.5 s window (the classic scanner's), `BLETransport` waits up to 10 s for `.poweredOn` before scanning, and the pairing flow starts the scan itself on appear |
| E-50 | Gen2 pairing **starts with a QR code on the watch**, not with a device list: `QRPairingFragment` (camera, `pair/camera/BarcodeTrackerFactory`+`MyTracker` on ML Kit) → `QRPairingViewModel.onQRCodeResolved(rawText)` → `extractQRCode` → `Gen2PairingProgressFragment.newInstance(code)`. `EnterPinCodeFragment.onCodeEntered` is the typed fallback and `QRCodeTutorialFragment` the "Can't see QR code?" steps, which say how the code is produced: press the watch button until **Settings**, open Settings, press again on **Show QR** | OBSERVED | `pair/ui/gen2/QRPairingViewModel.java` (`extractQRCode`, `onQRCodeResolved`, `onPinCodeClicked`), `EnterPinCodeViewModel.java`, `QRCodeTutorialFragment.java`, `R.string.tutorial_step_{one,two,three}_text`, `R.string.scan_title`/`place_watch`/`cant_see_qr_code`/`enter_pairing_code`/`showing_qr_title`/`pairing_failed_hint` | `Sources/Views/Pairing/QRScannerView.swift` (AVFoundation `.qr` metadata reader), `Sources/Utils/PairCode.swift` (byte-for-byte port of `extractQRCode`, incl. "no `Pair code` line ⇒ only then try the `open?…=` URL form"), `R` in `Sources/Utils/ApkStrings.swift` holds the English copy; `PairingViewModel` gained `awaitingQR`/`enteringCode`/`tutorial` stages |
| E-51 | The pairing code is read **out of the advertisement**, before connecting: `BleScanningTechnology.startMonitoring` rebuilds every manufacturer-specific record as `[companyId and 0xff, (companyId shr 8) and 0xff] + data`, then `ByteBuffer.wrap(it).short` → `pairingCode` and `.get()` → `protocolVersion` (defaults `-1` and `1` when the record is absent) and builds `DeviceInfo(mac, pairingCode, protocolVersion, …)`; the log strings are `Data: `, `PairingCode: `, `ProtocolVersion: `, `Device PW2 found, extracting advertising information...` | OBSERVED | `sdk/technologies/BleScanningTechnology.java` (`startMonitoring$lambda2/lambda4`), `sdk/model/DeviceInfo.java` (`pairingCode`, `protocolVersion`), `sdk/communicator/DeviceImpl.java` (`copy(…pairingCode…)`) | `Gen2Advertisement` in `Sources/BLE/Gen2Framing.swift` decodes `CBAdvertisementDataManufacturerDataKey` the same way (CoreBluetooth's company id is already little endian, so `getShort()` = big-endian over the first two bytes); `DiscoveredWatch` carries `pairingCode`/`protocolVersion`/`manufacturerData`, and `BLETransport` logs `mfg=… code=… pv=…` per advertisement |
| E-52 | Once the code is known it is the *only* acceptance rule: `communicator.foundDevicesChange().filter { it.pairingCode != null && it.pairingCode == Short.parseShort(pairingCode) }`, on top of the `ScanFilter(name = "PowerWatch 2")` the same screen installs. The code is never sent to the watch — `Gen2StartPairingCommand` (`9010`) extends `Gen2AbstractCommand` with no payload at all | OBSERVED | `pair/ui/gen2/Gen2PairingProgressViewModel.java` (`lambda-20$lambda-14/15`, `startScanning` call), `sdk/protocol/commands/Gen2StartPairingCommand.java` | `BLETransport.expectedPairingCode` lets an unnamed advertisement in on its code alone (the case CoreBluetooth reports `peripheral.name` as nil), `PairingViewModel.scan` then keeps only matching watches and reports how many were rejected for another code; `perform(.startPairing)` stays payload-free |
| E-53 | **Captured from the real watch** (`PowerWatch 2`, RSSI −57): advertisement carries the complete local name `PowerWatch 2`, service UUIDs `180A` + `180D` only (the proprietary DTP/OTA services are *not* advertised), and manufacturer data `04 fe 04 5f 00` → pairing code `1278`, protocol version `4` under the E-51 decode | OBSERVED (on device) | `pw2-ble advert: name=PowerWatch 2 advertised=PowerWatch 2 services=180D,180A mfg=04fe045f00 code=1278 pv=4 rssi=-57 accepted=1` from the device console | confirms E-48's name, E-51's byte order, and the `protocolVersion != 3 → Ver4` executor choice (E-26); it also means a service-UUID scan filter would never find the watch and that the GATT services must be enumerated after connecting, not filtered from the advertisement |
| E-54 | **Device-info payloads from the real watch.** `2A26` = `56 32 2e 38 2e 34 72 32 02 04 04 00 …` → ASCII `V2.8.4r2` followed by a binary block; `2A25` = `28 00 00 00 28 00 00 01 …` and `2A24` = `00 00 00 00 00 00 01 00 …` are **pure binary records**, not the UTF-8 strings the GATT spec defines | OBSERVED (on device) | `pw2-ble device info 2A26 = …` / `2A25 = …` / `2A24 = …` from the device console | firmware version is the printable prefix only; the other two characteristics carry no text, so `applyDeviceInfo` cuts at the first non-printable byte and leaves the field empty rather than storing mojibake |
| E-55 | **Framing, CRC and status decode confirmed on air.** The watch ACKs every command we write with `05 00 00 20 00 8d ef 02 d2` on `…0013` — byte-identical to `DTPAckType.AckGood`, which is what the port writes back — and answers `9010` with `06 00 40 10 e2 00 91 83 91 2d` on `…0012`: length `0x0006`+4, kind `0x1040`, body `E200`, CRC32 trailer | OBSERVED (on device) | `pw2-ble rx … 0013 (9 bytes): 05000020008def02d2` and `… 0012 (10 bytes): 06004010e2009183912d` | closes U-01 for the status-only case: `E200` is the success status word and `body[0..1]` big endian is the right read; also proves the LE length and CRC32 layout against live traffic, not just DEX constants |
| E-56 | **Unanswered frames are retransmitted, then the link is dropped.** The `E200` frame above arrived again exactly 10.3 s later (nothing had ACKed it, because the command had already completed on its ACK); 10 s after the next command (`9000`) the watch disconnected | OBSERVED (on device) | two identical `06004010e2009183912d` lines at 08:20:34 and 08:20:44, then `pw2-ble didDisconnect: The specified device has disconnected from us.` at 08:21:03 | the phone must ACK frames even when no command is in flight; `Gen2ExecutorImpl` only ACKs inside `readWithAck`, which is safe there because that pipeline is what waits for the frame — see bug 9 |
| E-57 | The pairing chain for a **protocol-version 0 or 1** watch is **ten commands**, not two: `Gen2PairExecutorImpl.transferData` runs `Gen2DeviceInfoCommand` → `Gen2StartPairingCommand` → `Gen2ReceiveUserInformationCommand` → `Gen2SendUserInformationCommand(units)` → `Gen2SendBiometricsCommand(user)` → `Gen2SendLanguageCommand(locale)` → `Gen2ReceiveStepsDistanceGoals` → `Gen2SendStepsDistanceGoal(goals)` → `Gen2SendCaloriesSleepGoal(goals)` → `Gen2StopPairingCommand`, every one of them `sendSingleCommandWithAck` and every one passing `f * 0.1f` as its progress power | OBSERVED | `sdk/protocol/executors/Gen2PairExecutorImpl.java` (`m2497transferData$lambda12` and its `lambda1`…`lambda10` chain) | `Gen2Command.pairingChain(protocolVersion:)` case `0, 1`, pinned by `testPairingChainFollowsExecutorsFactory`; the port used to pair with `9010` + `9011` only (bug 11) |
| E-58 | **The chain is version-routed.** `ExecutorsFactory.createPairExecutor(deviceInfo, communicator, logger, protocolVersion)` picks `Gen2PairExecutorImpl` for version 0/1 (E-57), `Gen2Version2PairExecutorImpl` for 2 — `9010` → `9122 GetUserAndGoals` → `9022 SendUserPrefsAndGoals` → `9011` — and `Gen2Version3PairExecutorImpl` for **≥ 3** — `9010` → `9124 GetUserAndGoalsVer3` → `9024 SendUserPrefsAndGoalsVer3(pairingConfig)` → `9011`. The two config steps pass powers `0.3f` and `0.4f` (`getPairConfigPowers2` / `getPairConfigPowers2Ver3`), the rest `0.1f`. The observed watch advertises version **4**, so the five-command Ver3 chain is the one that matters on air | OBSERVED | `sdk/protocol/executors/ExecutorsFactory.java` (version switch), `Gen2Version2PairExecutorImpl.java` / `Gen2Version3PairExecutorImpl.java` (`transferData$lambda6$lambda1…lambda4` + `setTempPowersConfig`), E-53 for `pv=4` | `Gen2Command.pairingChain(protocolVersion:user:goals:settings:)` returns the steps with their powers; `PairingViewModel.pair` walks it and drives the progress bar from the powers, so a version-4 watch now gets `9010 9124 9024 9011` |
| E-59 | **The device-info step of every pairing chain is not a DTP command.** `Gen2DeviceInfoCommand` has `getSendingData() = new byte[0]` and `getCommandType() = GEN2_FIRMWARE_REQUEST`, and `Gen2ProtocolBasics` resolves that message type to `characteristicTypeMap[CharacteristicType.FIRMWARE]` — i.e. a GATT **read** of `2a26` (`GEN2_FIRMWARE_INFO`) on the `180A` device-info service. It runs *before* `9010`, and its `parseReceivedData` is what sets `firmwareVersion`, `disTableVersion` and **`pid = 4`** on the record that later reaches `deviceRepository.save`. The sibling requests are `GEN2_SERIAL_REQUEST` → `2a25` and `SETTINGS_INFO` → `2a24`, so the port's "model number" label on `2A24` is a misnomer | OBSERVED | `sdk/protocol/commands/Gen2DeviceInfoCommand.java`, `sdk/protocol/Gen2ProtocolBasics.java` (`iArr[GEN2_FIRMWARE_REQUEST.ordinal()] = 1`, `characteristicTypeMap.get(FIRMWARE)`, the `channel.read` in `just(message).map`), `sdk/protocol/BLEServicesKt.java` (`GEN2_FIRMWARE_INFO = "2a26"`, `GEN2_SERIAL_INFO = "2a25"`, `GEN2_SETTINGS_INFO = "2a24"`) | `WatchTransport.readDeviceInfo()` **is** that read; it now runs before the chain and `PairedDevice` is saved with `pid: 4` instead of `0`. `BLETransport.applyDeviceInfo` keeps the `2A24`/`2A25` binary blobs out of the text fields (E-54) |
| E-60 | The `2a26` value is a **structured record**, which explains the "binary tail" of E-54: `Gen2DataFormatter.extractFirmwareInfo` requires ≥ 8 bytes, takes `firmwareVersion` as UTF-8 of bytes `0..<8` with NULs removed (`formatFwVersion`), then — if ≥ 3 bytes remain — `DISTableVersion(ota, mtp, dis)` from bytes `8..<11`, then a big-endian `int` timestamp, then skips 4 bytes and reads **8 big-endian ints** of font-table section sizes (`FontCoreLib`, `ClockFonts`, `Gauges`, `Icons`, `UserLocation1..3`, `FontLookupTable`) | OBSERVED | `sdk/protocol/commands/Gen2DataFormatter.java` (`extractFirmwareInfo`, `formatFwVersion`) | the observed `56 32 2e 38 2e 34 72 32 02 04 04 00 …` decodes as `V2.8.4r2` + DI table `2.4.4`, timestamp 0 — the port's printable-prefix cut reproduces the version string exactly; the table/version tail is decoded only as far as the string (logged raw) |
| E-61 | The `9024`/`9022` write at pair time carries the **phone's** profile, assembled by `PairingBaseViewModel.userData` from `UserAccountRepository.first` + the **last** `GoalConfiguration` (all-zero defaults when absent): `UnitsInfoData(timeFormatType == Twelve, unitType == METRIC)`, `UserInfoData(gender == Male, age, height, weight, email)` with `sleepTimeSelection` injected from `SleepTimeStorage` just before the executor runs, `GoalInfoData(steps, distance, calories, sleep)` and `LanguageInfoData(locale of the user's language key)` — byte-identical to what sync writes, so pairing is what puts the units, biometrics, goals and language on the watch | OBSERVED | `pair/ui/PairingBaseViewModel.java` (`m2022userData$lambda1`), `pair/ui/gen2/Gen2PairingProgressViewModel.java` (`m2081lambda20$lambda15$lambda8` sets `sleepTimeSelection`) | `PairingViewModel.pair` builds the chain from `store.user()`/`store.goals()`/`store.watchSettings()` through the same `Gen2Command.sendUserPrefsAndGoalsVer3` the sync path uses; `testLegacyPairingPayloadLayouts` pins the Ver1 `9022` as `9024` minus `sleepTimeSelection` and `testSimulatedWatchAnswersTheWholePairingChain` proves the simulator answers it |
| E-62 | Surrounding pipeline: `enableAutoConnect(false)` when the watch is found and `restoreLastState()` once connected; the whole flow wrapped in `.timeout(60, SECONDS)` with `PairingFailedError` propagated, `TimeoutException` → `ConnectionTimedOutError` and anything else → `ConnectionFailedError`, all landing on `PairingFailedFragment` (`pairing_failed_hint`); success sets the progress text to `success`, persists the protocol version per uid (`DeviceProtocolStorage.saveDeviceProtocolVersion`), then `onPairingSuccess` shows `saving_info` and saves `Device(serialNumber ?: uid, uid, pid, firmwareVersion, deviceName, shouldSync = null, notifications = true)`; leaving the screen unpaired calls `stopConnection()`, and Bluetooth going off calls `stopPairing()` (disconnect + dispose) | OBSERVED | `pair/ui/gen2/Gen2PairingProgressViewModel.java` (`lambda4`, `lambda6`, `lambda14`, `lambda16`, `lambda18`, `onDestroyView`), `pair/ui/PairingBaseViewModel.java` (`onPairingSuccess`, `stopPairing`), `resources.arsc` (`searching_for_single_device` "Searching for %s", `connecting_to_device` "Connecting…", `saving_info` "Saving information…", `success` "Success", `pairing_success` "Pairing Success!") | `PairingViewModel.pair` mirrors it: `R` strings for each state, `Self.pairingTimeout = 60` checked between steps, `PairingError.timedOut` for the timeout, `disconnect()` on the failure path, and `protocolVersion` persisted on `PairedDevice`. The `auto_connect_enabled` preference itself has no user-facing switch here — Android only writes it from this flow — and the reconnect it enables is covered by E-65 |
| E-63 | Body metrics are stored **metric-only** and converted for display. `PersonalSettingsVM` never shows `User.height`/`User.weight` directly: it renders `UserPrefsUtils.getValue(value, MetricsConvertType.HEIGHT/WEIGHT)` as `roundToInt(pair.first) + pair.second`, and the wheel pickers get their bounds from `minUnitValue`/`maxUnitValue`/`defaultUnitValue`, which are expressed in the *display* unit. The converters are `utils/HeightConverter` (cm → `cm / 2.54` with `" in"`, back with `× 2.54`), `utils/WeightConverter` (kg → `kg × 2.2046` with `" lb"`, back with `/ 2.2046`), `DistanceConverter` (`× 0.621371` `" mi"`), `TemperatureConverter` (`× 1.8 + 32` `"°F"`) and `CaloriesConverter` (identity, `" kcal"` vs `" Cal"`); `UserPrefsUtilsKt` holds the bounds — height 100/270/180 cm and 40/330/200 in, weight 29/150/80 kg and 65/330/70 lb — and every unit string carries a leading space. Because Room keeps cm and kg, the factors never touch the wire format: `9012`/`9024` always encode height×10 (mm) and kg | OBSERVED | `main/watch/settings/personal/PersonalSettingsVM.java` (`m1984onCreateView$lambda2`, `onHeightClicked`, `onWeightClicked`), `utils/UserPrefsUtils.java` (`getValue`, `getMetricValue`, `min/max/defaultUnitValue`), `utils/{Height,Weight,Distance,Temperature,Calories}Converter.java`, `utils/UserPrefsUtilsKt.java` (the constants), `utils/MetricsConvertType.java` | `Formatters.heightValue/centimetres/heightSuffix/height`, `weightValue/kilograms/weightSuffix/weight`, `heightRange`/`weightRange` (same factors, same bounds, same suffixes); `PersonalSettingsView` edits in the display unit and converts on save, and `testBodyMetricsFollowTheUsersUnits` proves that an imperial user typing 70 in / 155 lb still puts `1778` and `70` into `9024` |
| E-64 | The **launcher icon** the APK actually ships is `res/mipmap-xxxhdpi-v4/app_icon.png` (192×192, colour type 2 — RGB with no alpha): the Matrix mark in white on a maroon→red→orange glow whose brightest point sits below the glyph. `aapt2 dump badging` says so directly — `application-icon-640:'res/mipmap-xxxhdpi-v4/app_icon.png'` and `application: label='PowerWatch2' icon='res/mipmap-hdpi-v4/app_icon.png'` — and there is **no `ic_launcher.png` in any density**: `res/mipmap-anydpi-v26/ic_launcher.xml` is the untouched Android Studio template, its layers resolving to `@drawable/ic_launcher_foreground` (`#ffffffff` bugdroid paths over a `@0x7f070006` shadow) and `@drawable/ic_launcher_background` (a `#ff26a69a` rectangle with `#33ffffff` grid strokes). The largest copy of the mark itself is `res/mipmap-xxhdpi-v4/splash_icon.png` (237×444, RGBA), the same shape 1.4× taller than the tile's glyph | OBSERVED | `aapt2 dump badging`, `aapt2 dump xmltree` over `res/mipmap-anydpi-v26/ic_launcher.xml`, `res/drawable/ic_launcher_background.xml` and `res/drawable-anydpi-v24/ic_launcher_foreground.xml`, PNG headers of every `res/mipmap-*/{app_icon,splash_icon,app_icon_notif}.png` | `Tools/make-app-icon.swift <apk>` rebuilds `Assets.xcassets/AppIcon.appiconset/appicon-1024.png` from those two files: it keeps the tile's own background pixels, fills the glyph and the tile's dark rounded edge by Gauss-Seidel diffusion from the surrounding ring (so the glow is reproduced, not invented), upscales that, and stamps the `splash_icon` shape recoloured white at the tile's measured glyph box (x 57…136, y 22…171 of 192). Output is 1024×1024 opaque RGB — Xcode and the App Store want an alpha-free square, and the tile's own rounded border must not travel with it |
| E-65 | **The APK connects by itself; there is no Connect button.** `MainDashboardViewModel`'s constructor calls `deviceManager.init()`, which subscribes to `bluetoothProvider.getChangeState(Enabled, Disabled)`; every Enabled event runs `startConnection()` — `deviceRepository.defaultDevice()`, then a bail-out when `communicator.connectedDevices().firstOrNull()` is non-null, otherwise `communicator.startConnection(listOf(device.bluetoothAddress))` plus `monitoringEvent.onNext(observingStarted)` — and Disabled runs `stopConnection()` (`connectionCompositeDisposable.clear()` + `communicator.stopConnection()` + `observingEnded`). The connect itself waits in `BleConnectionWithRetryOperation`'s `device.establishConnection(connectionPreference.isAutoConnectEnabled())`, i.e. a **pending** request that completes whenever the watch advertises; `ConnectionPreference` keeps `auto_connect_enabled` in the default SharedPreferences with default **true** (pairing flips it off with `enableAutoConnect(false)`, E-62, and puts it back with `restoreLastState()`). Sync is separate and never automatic: `WatchSynchronizerImpl`'s trigger pipeline starts with `deviceManager.connect(true).firstOrError()` combined with the Bluetooth state and fails with `SyncError.DeviceNotConnected`, and the only caller of `startSync()` is `MainDashboardViewModel.onRefresh()` — pull to refresh. The dashboard's `Timer.schedule(…, 0, 500)` only cycles the toolbar icon through `R.mipmap.connectivity_searching_0/1/2` | OBSERVED | `main/dashboard/maindashboard/MainDashboardViewModel.java` (constructor, `startSync`, `onRefresh`, `triggerAnimation`, `AnonymousClass1`), `sdk/DeviceManagerImpl.java` (`init`, `init$lambda0`, `startConnection`, `startConnection$lambda2`, `stopConnection`), `sdk/communicator/CommunicatorImpl.java` (`startConnection`, `stopConnection`), `sdk/technologies/operations/{ConnectionPreference,BleConnectionWithRetryOperation}.java`, `shared/sync/WatchSynchronizerImpl.java` | `AppEnvironment.startConnection()`/`stopConnection()` mirror `init`/`startConnection`/`stopConnection` and are driven from `MainTabView`'s `.task` (the moment the APK constructs its dashboard VM), re-arming on `.disconnected`; `BLETransport.startConnection(to:)` is the `startConnection(listOf(…))` counterpart — registry/`retrievePeripherals` lookup, an optional scan only when CoreBluetooth has no handle, then `connect(_:options:)` left **pending** for the `autoConnect = true` semantics — and sync stays manual, matching `onRefresh()` |
| E-66 | **The realtime poll is two GATT reads, not a DTP command — and it is the keep-alive.** `RealTimeDataProviderImpl`'s constructor builds `deviceManager.connect().switchMap { deviceInfo -> … }.doOnError(…).retry().repeat().replay(1)` and calls `connect()` on it; when `deviceInfo.isConnected && isGen2` the `switchMap` returns `combineLatest(Observable.interval(0L, 20L, TimeUnit.SECONDS).flatMap { deviceCommunicationQueuer.queue(DeviceCommunicationOperation(realtimeDataExecutor.readData(uid))) }, heartRateDataExecutor.receiveData(uid).startWith(0L))`. `Gen2RealtimeDataExecutor.readData` sends `CommunicationMessage(uid, ProtocolMessage(ProtocolPayload(new byte[0]), null, GEN2_SERIAL_REQUEST, 2, null), BLE_COMMUNICATION, GEN2_STANDARD_BASICS)` — and `Gen2ProtocolBasics.sendMessage` does not write anything: it maps the message type through `characteristicTypeMap` (`GEN2_FIRMWARE_REQUEST→FIRMWARE`, `GEN2_SERIAL_REQUEST→SERIAL`, `GEN2_SETTINGS_REQUEST→SETTINGS_INFO`, `else -> TODO`) and finishes with `channel!!.read(it)`. `ProtocolCreatorImpl` fills that map by matching characteristic UUIDs against `BLEServicesKt` (`GEN2_SERIAL_INFO = "2a25"`, `GEN2_SETTINGS_INFO = "2a24"`, `GEN2_FIRMWARE_INFO = "2a26"`). `readData` then runs `parser.extractData(payload)` and chains `readSettingsData(uid)` → `SettingsDataProvider.loadSettingsFromWatch`, which is the same shape with `GEN2_SETTINGS_REQUEST`, `.timeout(10L, TimeUnit.SECONDS)`, and a save to `SettingsDataRepository` when the value changed. `Gen2RealtimeHeartRateExecutor.receiveData` only filters `communicator.messageOutput()` for `GEN2_HEART_RATE`, so heart rate is a notification stream, not a poll. Decoded result feeds `mapToRealTimeData`, i.e. the dashboard's realtime card: `RealTimeValue(totalThermalPower, goals.power)`, `(totalSolarPower, goals.power)`, `(totalSteps, goals.steps)`, `(totalDistance, goals.distance)`, `(heartRate, 0f)`, `(totalActiveCalories, goals.calories)`, `(totalSleep, goals.sleep)`, and when `realtimeWatchData == null` it falls back to the last walking/resting/sleep day periods | OBSERVED | `shared/data/providers/RealTimeDataProviderImpl.java` (constructor line 52-64, `currentStatusDataObservable$lambda6` line 113-129, `…$lambda6$lambda0` line 154, `mapToRealTimeData`), `sdk/protocol/executors/Gen2RealtimeDataExecutor.java`, `sdk/protocol/executors/Gen2RealtimeHeartRateExecutor.java`, `sdk/protocol/Gen2ProtocolBasics.java` line 135, `sdk/protocol/ProtocolCreatorImpl.java`, `sdk/protocol/BLEServicesKt.java`, `shared/data/providers/SettingsDataProvider.java`, `sdk/channels/CharacteristicType.java`, `sdk/protocol/ProtocolMessageType.java` | `Sync/RealtimeDataProvider.swift` runs the same two reads every 20 s (`interval(0, 20, SECONDS)` included) while the active transport is connected and is started/stopped with the link; `BLETransport.readRealtimePayload()`/`readSettingsPayload()` are the `channel.read` counterpart with the APK's 10 s timeout; `BLE/Gen2InfoRecords.swift` is `RealtimeDataParser` + `SettingsDataParser`; heart rate stays on the `2A37` notification stream |
| E-67 | **Record layout of `2A25`/`2A24`, confirmed against bytes from the real watch.** `RealtimeDataParser.extractData` and `SettingsDataParser.extractData` share it: `chunked(4)` keeping only full groups, then per group `reversed()` → `first` is the table id (the fourth byte) and `subList(1, size)` is the value tail; `extractInt` does `ByteBuffer.allocate(4).put(0).put(tail).getInt()`, which evaluates to `b0 + (b1 << 8) + (b2 << 16)` — a little-endian 24-bit integer — and subtracts `2^24` when the field is signed. `extractData` has eight branches: `HSMTable.TotalSteps` (0), `TotalCurrentCaloriesActive` (18, `/1000`), `TotalSleep` (32), `TotalDistance` (48, `/1000` with integer arithmetic, so under a kilometre reads 0 km), `TotalThermalPower` (65), `TotalSolarPower` (64), `TotalSkinTemp` (80, the only signed field), `BatteryPercentage` (66); `batteryPercent` starts at `Float.MIN_VALUE` (`isBatteryValid()` false) and the ids present on air but unread (`TotalCurrentStepsWalk` 1, `TotalCurrentStepsRun` 2, `TotalCalories` 16, `TotalCurrentCaloriesBRM` 17) stay 0. `SettingsDataParser` looks every id up in `SettingTable.array` (ids 0…20 = ClockFormatSelection, UnitSelection, LanguageSelection, TimeZone, Gender, Age, Weight, Height, StepGoal, DistanceGoal, CaloriesGoal, SleepGoal, DND, BackLight, BackLightDuration, PopupDuration, GPSUpdateRate, HomeScreen, BLEDisconnect, Ringtone, Alert), each `extractInt(list, signed = false)`; `alert` defaults to `2097151`. Real watch, `2A25` = `12 04 00 00 · 12 04 00 01 · 00 00 00 02 · 4B 23 02 10 · 07 2F 01 11 · 44 F4 00 12 · 00 00 00 20 · 58 03 00 30 · 50 00 00 40 · 15 00 00 41 · 78 00 00 50 · 75 00 00 51 …` → 1042 steps, 62 active kcal, 0 min sleep, 856 m, 80 solar, 21 thermal, raw skin-temp 120; `2A24` = `00 00 00 00 · 00 00 00 01 · 00 00 00 02 · D4 FE FF 03 · 00 00 00 04 · 19 00 00 05 · 4B 00 00 06 · D6 06 00 07 · 88 13 00 08 · 88 13 00 09 …` → metric, 24 h, English, 25 y, 75 kg, 1750 mm, 5000 steps. `75 00 00 51` is an id `HSMTable` does not define and both parsers ignore — `TimeZone` (id 3) shows the effect of the APK's `signed = false`: the watch sends `D4 FE FF 03`, so the APK reads 16776916, whereas sign-extending the same 24 bits gives −300, i.e. a signed offset (minutes, UTC−5 for this watch). A later capture of the same watch decodes `2A25` as `steps=1350 active=125 sleep=0 dist=1 thermal=23 solar=1559 skin=105 battery=71`, which also confirms `BatteryPercentage` (66) is on the wire; the same watch read back after the app edited the profile gives `35 00 00 05 · 46 00 00 06 · D6 06 00 07 · 40 1F 00 08` → age 53, 70 kg, 175 cm, 8000-step goal, which is the `9022`/`9024` write path verified on hardware; no unit is established for the skin-temperature raw value, because the APK's realtime path never displays it | OBSERVED | `sdk/RealtimeDataParser.java`, `sdk/RealtimeWatchData.java`, `sdk/SettingsDataParser.java`, `sdk/SettingsDataParserKt.java`, `sdk/SettingTable.java`, `sdk/HSMTable.java`, plus the `pw2-ble device info 2A25/2A24 = …` console lines from the paired watch | `Gen2InfoRecords` (`groups`/`value`/`parseRealtime`/`parseSettings`/`encode`) and `testRealtimeAndSettingsCharacteristicsDecode`, whose vectors are those bytes; the simulator answers the same characteristics through `encode` |

---

## Verification log

**Build:** `** BUILD SUCCEEDED **` for `generic/platform=iOS Simulator`, **zero warnings**.

**Tests:** `./Tools/run-logic-tests.sh` → **56 tests, 0 failures, 1 skipped** (the skip asserts the
app-bundle firmware resource, absent outside the app host). Coverage:

- CRC32 against two ACK constants lifted from the DEX (E-08)
- request/response framing, declared-length invariant over payload sizes 0…640
- CRC tamper rejection, completion-frame decoding, busy/locked → error mapping, control-mark compare
- collector state machine: accumulate → complete, bad CRC → `AckCRCInvalid` write-back,
  control mark → ACK resend, `E102` → abort
- bit extraction at non-zero field offsets, including sign extension (regression, see below)
- background log round trip through encoder *and* decoder: steps, distance, calories, µWh table
  indices resolving back to exact values, temps at ¼°, negative skin temp, per-minute clock
- delta and header record round trips at the exact field widths of E-23/E-24, including the
  truncation behaviour Java's `createMask` produces for over-width input
- `9024` payload: 32 bytes, big-endian epoch/steps/calories, flag bytes
- aggregation: hour grouping, majority sleep type, day rollup, weighted averages
- **sync command order** against the trace the simulated watch records (E-27/E-27a/E-28a/E-30/E-45)
- offline end-to-end: sign-up/login without a server, weak-password rejection, **password absent
  from the on-disk snapshot while login still works** (E-32a), local goals, inert analytics, and a
  **full sync against the simulated watch** that populates the store (background logs, hour periods,
  two activity sessions with GPS trails, calendar index) and ends with nothing queued for upload

**Offline audit** (see README): linked frameworks contain no CFNetwork/Network.framework,
`nm -u` finds zero `URLSession`/CFNetwork symbols, no entitlements, no ATS exceptions, and the only
URL-shaped strings in the shipped binary are the three GPX/TCX/XMLSchema **namespace** URIs — no
host string survives in the binary at all (E-47).

### Bugs the tests caught

1. **`BitReader.extract` masked with an unshifted `(1 << width) - 1`** — every field whose `low`
   was not zero lost its low bits, so the whole background/delta/header log decoded as zeros. The
   first BitReader tests all used `low: 0` and passed; `testBitReaderExtractsPositionedFields` now
   pins the shifted-mask semantics. *Would have zeroed every metric on the first sync.*
2. **`be32` built bytes with `UInt8(v >> 16)`** — a fatal trap (`Not enough bits to represent the
   passed value`) for any value with bits above the low byte, i.e. every `9024`/`9015` payload. Each
   byte is now masked. *Trapped on the first sync.*
3. **`9001 StopAmDTP` was only sent in the error path** — a successful sync left the watch inside a
   DTP session. Now sent on both paths, as the executor chain does (E-28).
4. **`9024` was sent after the log reads.** Because it carries the epoch and timezone the RTL
   decode is anchored to, reading logs first would decode timestamps against a stale watch clock on
   real hardware. Moved to position 5 in the chain (E-27a), and `9124 GetUserAndGoalsVer3` was
   missing entirely.
5. **The login secret was being persisted.** `UserAccount.password` mirrored Room's `User.password`
   column and was therefore written into `snapshot.json` in the clear — the same thing the APK did
   in SQLite, and the opposite of what this port's docs claimed. It is now excluded from
   `CodingKeys`, blanked by the store, and read from the keychain.

The simulated watch is deliberately *not* privileged: it feeds real frames through the same
`Gen2ResponseCollector` and decoders, which is what made 1–4 visible without hardware. It also
records the opcodes it was sent, which is what made 3–4 testable.

### Bugs a real watch and a real iPhone caught

The simulator shares no code with the CoreBluetooth layer, so nothing above could see these two.

6. **`scan()` returned an empty list whenever the radio was not yet `.poweredOn`.** On a first
   launch CoreBluetooth reports `.unknown` until the user answers "Would Like to Use Bluetooth",
   so pairing said "No PowerWatch found" without ever starting a scan; `.poweredOff` was published
   as `.poweringOn`, so a dead radio looked like a starting one; and an advertisement with no name
   was dropped even when it carried the pairing code the pairing screen itself keys on (E-51).
   `waitForPoweredOn(timeout:)`, an accurate `.failed("Bluetooth is off…")` and code/service
   acceptance fix this, and `ScanReport` now says which of the four causes it was. Confirmed on
   device: `scan done: saw=17 matched=0 state=poweredOn authorization=allowedAlways` — the radio
   was fine, the watch simply was not advertising (see 8).
7. **`peripheral(_:didDiscoverServices:)` read `service.characteristics` before asking CoreBluetooth
   to enumerate them.** Characteristics only arrive in `didDiscoverCharacteristicsFor:`, so the
   characteristic table was empty on a first connect and `connect()` threw `.serviceNotFound` — the
   real watch paired as far as the list, then said **"Pairing failed"**. It now calls
   `discoverCharacteristics(nil, for:)` per service and completes the connect continuation on a
   countdown; `setNotifyValue` is also restricted to characteristics that actually advertise
   `.notify`/`.indicate`, which the write-only PWX event characteristic does not.
8. **A PowerWatch 2 only advertises while it is on the Show QR screen** — with the watch idle, three
   11.5 s scans heard 13–20 peripherals and never a PowerWatch; after pressing the side button to
   Settings ▸ Show QR the same scan found it immediately (`matched=1`). The port had no QR step at
   all, which is why this looked like a broken scanner; the tutorial strings (E-50) are the evidence
   for the procedure.
9. **Frames were only ACKed while a command was in flight.** `9010` and `9011` were modelled as
   fire-and-forget (`expectsResponse: false`), so the command completed on the watch's `AckGood` and
   its `E200` completion frame then arrived with nothing in flight and was never ACKed. The watch
   retransmitted it 10 s later (E-56) and disconnected 10 s after the next command — which surfaced
   as *"pairing failed"* followed by a sync that died at `9000`. Both commands now wait for the
   completion frame, as `sendSingleCommandWithAck` does (E-57), and every accepted frame is ACKed
   through `unsolicitedCollector` whether or not a command owns it. The unit tests could not see
   this: the simulated watch does not retransmit, and `Gen2Command.startPairing.expectsResponse`
   was only pinned after the capture (`testPairingCommandsWaitForTheCompletionFrame`).
10. **Device-info strings were decoded by filtering NULs out of the whole buffer.** Two of the three
    characteristics (`2A25`, `2A24`) carry binary records, so the watch info card showed replacement
    characters; `2A26` is `V2.8.4r2` followed by a binary block (E-54). The decode now stops at the
    first non-printable byte.

### Bugs the pairing review caught

11. **Pairing ran two of the four DTP commands the APK runs.** `pair()` sent `9010`, read the device-info
    characteristics, then `9011`, so the watch received no units, biometrics, goals or language until the
    first sync, and the device row was saved with `pid: 0` and a throwaway `UUID().uuidString` uid. Reading
    the pairing path against the APK (E-58…E-62) showed that `ExecutorsFactory.createPairExecutor` routes the
    chain by the advertised protocol version — a version-4 watch gets `9010 9124 9024 9011`, not the
    ten-command chain the port had modelled it on (E-57) — that the device-info step is a `2a26` GATT read run
    *before* `9010` and is what sets `pid = 4` (E-59), and that the pipeline carries a 60 s overall timeout, a
    three-way error taxonomy and its own progress strings (E-62). The chain now comes from
    `Gen2Command.pairingChain(protocolVersion:)` with the executors' progress powers, the device-info read
    happens first, and the row is saved with `pid: 4`, `protocolVersion` and the peripheral identifier as uid.
    The unit tests had missed it because the simulated watch answers whatever it is handed;
    `testPairingChainFollowsExecutorsFactory` and `testSimulatedWatchAnswersTheWholePairingChain` pin it now.

### Bugs the crash reports caught

12. **The APK's `%s` placeholders segfaulted the app as soon as a QR code resolved.** Matching the pairing
    progress copy meant formatting `R.string.searching_for_single_device` ("Searching for %s", E-62) with the
    code, and Java's `String.format` accepts any object for `%s` while Foundation's wants a `char *` — handing
    it a Swift `String` makes `__CFStringAppendFormatCore` call `strlen` on an Objective-C pointer. The device
    died in three consecutive launches with `EXC_BAD_ACCESS / KERN_INVALID_ADDRESS at 0xb944fb2164bbfdd0`,
    main thread `_platform_strlen` ← `__CFStringAppendFormatCore` ← `String.init(format:_:)` ←
    `PairingViewModel.scan()` ← `qrTextResolved(_:)` ← `QRScannerView.Coordinator.metadataOutput`
    (`PowerWatch2-2026-10-24-131607/-131614/-131642.ips`, pulled with
    `devicectl device copy from --domain-type systemCrashLogs`). The strings themselves stay byte-identical to
    `resources.arsc`; the argument now goes through `R.format`, which bridges it with `withCString`, and
    `testAPKFormatStringsAcceptStringArguments` pins it. Everything else in the port formats numbers (`%d`,
    `%f`, `%02x`), which is why this was the only live instance — and why neither the unit tests nor the
    simulator saw it: the crash needed a real camera frame to reach the line.

### Bugs found by using the app on the phone

13. **Personal Settings ignored the unit system.** Height was always a 120–220 slider labelled `cm` and weight
    always a 30–180 slider labelled `kg`, so an imperial user who picked Imperial under Units still saw
    centimetres and kilograms — and after visiting Personal Settings once, whatever they typed there was stored
    as if it were metric. The APK never renders `User.height`/`User.weight` directly: `PersonalSettingsVM`
    shows `UserPrefsUtils.getValue(value, HEIGHT/WEIGHT)` and takes its bounds from `min/maxUnitValue`, so the
    screen is inches-and-pounds with 40–330 / 65–330 bounds while Room and the `9012`/`9024` payloads keep cm
    and kg (E-63). `Formatters` gained the APK's converters (`÷2.54`, `×2.2046`, unit strings with their
    leading spaces) and bounds, `PersonalSettingsView` now edits in the display unit and converts on save, and
    `testBodyMetricsFollowTheUsersUnits` proves that 70 in / 155 lb still reaches the watch as `1778` and `70`.
    The same edit aligned onboarding's height/weight sliders to `UserPrefsUtilsKt`'s 100–270 cm / 29–150 kg and
    180 / 80 defaults; it stays metric-only on purpose, because `Step.profile` runs before `Step.units` and the
    APK's biometrics screens ask `isMetricsUsed()`, which has no user to ask yet.

14. **Nothing ever reconnected.** Pairing worked and the dashboard looked right, but after that first
    session the app was permanently offline: the only `connect()` call sites in the whole port were in
    `PairingViewModel`, and `ConnectionBadge` was a coloured dot with no behaviour behind it, so a
    relaunch — or a watch that fell out of range — left the user with no way back online short of
    unpairing and pairing again. The APK has no Connect button either, which is the point: the
    dashboard's view model starts the connection itself (E-65). The port now does the same from
    `MainTabView`'s `.task` → `AppEnvironment.startConnection()`, which re-arms on `.disconnected`,
    retries every 20 s while the dashboard is up, and is stopped by `stopConnection()` (dashboard gone,
    watch unpaired). `BLETransport.startConnection(to:)` looks the peripheral up in
    `CBPeripheralsRegistry`/`retrievePeripherals(withIdentifiers:)`, scans only when there is no handle
    — the watch advertises solely while it sits on Settings ▸ Show QR — and then leaves
    `connect(_:options:)` pending, which is CoreBluetooth's equivalent of the APK's
    `establishConnection(autoConnect = true)`. `testTransportReconnectsToThePairedWatch` pins the
    contract the headless way: the stored identifier reconnects, a stranger's identifier is refused.

15. **A connected watch fell over within seconds.** With auto-connect in place the link came up and then
    died 6–30 s later, repeatedly (`didDisconnect: The connection has timed out unexpectedly.`, occasionally
    `didFailToConnect: Failed to encrypt the connection, …`), so the badge flapped between Connected and
    Disconnected. The port had no traffic of its own after connect — sync is manual and nothing else polled
    the watch — so an idle peripheral timed out its supervision timer. The APK keeps the link busy without
    anyone asking: `RealTimeDataProviderImpl`'s connected-device branch reads `2A25` and `2A24` every
    20 s (E-66), which is a keep-alive as a side effect of drawing the realtime card. The port now does the
    same from `Sync/RealtimeDataProvider.swift`, started and stopped with the link rather than with a
    screen, and the decoded `2A25` (steps, active calories, sleep, distance, thermal/solar, skin temperature,
    battery — E-67) drives the dashboard's realtime card the way `mapToRealTimeData` drives the APK's, with
    the stored day periods as the fallback once the values stop arriving. Two tests cover it headlessly:
    `testRealtimeAndSettingsCharacteristicsDecode` (real bytes from the watch) and
    `testRealtimeProviderPollsBothCharacteristics` (polls while connected, stays silent while not).

16. **My PowerWatch read `0%` while the watch reported 71 %.** `WatchHeaderCard` printed
    `environment.synchronizer.batteryPercent ?? 0`, and that property is only ever set by a completed
    sync, from the battery bits of the `9000` background-log records and only when the value is `> 0`
    (`WatchSynchronizer`). Before the first sync — or after one whose log records carried 0 — it was
    `nil`, and "the watch never told us" was drawn as `0%` beside an icon and colour that had instead
    defaulted to 100, which is why the card showed a full green glyph and `0%` at once. In the APK the
    battery on this screen is not the log value at all: `BatteryNotificationCenter` reads
    `RealtimeWatchData.batteryPercent` behind `isBatteryValid()`, i.e. the `HSMTable.BatteryPercentage`
    (66) record of the `2A25` read (E-66, E-67). The card now prefers the live poll, falls back to the
    synced value, and renders `--` with a greyed outline when neither exists, so an unknown is never a
    zero; `pw2-ble realtime 2A25 … battery=71` on the device console is the same number the card shows.

17. **A firmware screen that cannot update firmware.** The `Watch` section ended in a Firmware row
    opening a screen whose only action was *Install update*: with the network gone it read the manifest
    `LocalOnlyCloudAPI` invents, "downloaded" `ota_gps.bin` from the app bundle and declared the image
    staged without writing a byte to the OTA characteristic (E-44). The row and `FirmwareView` are
    removed — an entry that offers to flash a watch and does not is worse than no entry, and the version
    it displayed was already on the watch card and on the pairing screen from the `2A26` read (E-59,
    E-60). `fetchUpdateInfo`/`downloadFirmware` stay as the documented local substitute, still pinned by
    `testFirmwareComesFromBundleNotURL`.

---


## Offline security review

| ID | Finding (threat model: a nearby peripheral that advertises `PowerWatch 2` and the DTP service UUIDs) | Status | Evidence | Fix |
|---|---|---|---|---|
| S-01 | **Unbounded allocation from `9215` marker timestamps.** `PeriodAggregator.sessions` took `end.time - start.time` — both a `u32` epoch read at `Gen2Commands` `w[2]` — and used it as the bound of `stride(from: 0, to: duration, by: 600)`, so one spoofed marker pair 4e9 s apart meant ~7 M `RunningSplit` values: a remote kill from BLE range | FIXED | `PeriodAggregator.sessions` before the fix; `ActivityHeaderDecoder.Marker.time` has no sanity window | sessions beyond ±1 year of the phone clock, over 24 h, or ending before they start are dropped; `testSpoofedSessionWindowIsRejected` |
| S-02 | **Unbounded frame accumulation.** `Gen2ResponseCollector.accumulated` had no ceiling, and `BLETransport.consumeNotification` grew `rxBuffer` without one and never abandoned a phantom partial frame, so a valid-CRC deluge grew memory until jetsam and one bogus `len` desynchronised the session permanently | FIXED | `Gen2ResponseCollector.ingest`, `consumeNotification` | 512 KB response ceiling returns `.failed(.parsing)`; 256 KB reassembly ceiling drops the buffer; a partial frame older than 5 s is discarded; `testCollectorRefusesAnUnboundedResponse` |
| S-03 | **No peer authentication before writes.** DTP offers no encryption, bonding or freshness check — integrity is CRC32 and the pairing code is a 16-bit value printed on the watch — and `PairedDevice` never kept `pairingCode`, so after reconnecting by CoreBluetooth identifier the app writes `9022`/`9024` (age, weight, height, goals) to whatever answers | OPEN (inherited) | `Gen2Framing.compareCRC` as the only integrity check; `BLETransport.startConnection(to:)` matches identifier only; `DomainModels.PairedDevice` has no `pairingCode` | mitigation would be to persist the paired code and refuse sync/writes when the advertisement disagrees; not implemented by request |
| S-04 | **Profile data in the system log.** `BLETransport` logs the decoded `2A24`/`2A25` (age, weight, height, gender, goals, battery, steps) via `NSLog` every ~20 s; `os_log` persists and is readable over USB without consent | OPEN (deliberate) | `BLETransport` realtime/settings log lines, which are also the evidence for E-66/E-67 | should become opt-in (`#if DEBUG` or a launch flag) before a wider release |
| S-05 | **Silent simulator on a real phone.** `TransportKind.automaticDefault` is `.simulated` unless `CBManager.authorization == .allowedAlways`, so denying Bluetooth presents invented activity as measured | OPEN | `AppEnvironment.automaticDefault` | should prompt for permission and say so instead; the manual picker stays |
| S-06 | **Local login keeps the password in the clear** in the keychain (the APK kept it in Room) with a min-length check and no attempt limit, although no server needs it | OPEN | `KeychainStore.savePassword`, `LocalOnlyCloudAPI.signUp`/`login` | a salted hash would satisfy `isLoggedIn` with less exposure |
| S-07 | **Credentials outlived Log Out.** `logout()` deleted only the session item; `deletePassword(for:)` had no call site, so `password:<email>` stayed in the keychain forever | FIXED | `LocalOnlyCloudAPI.logout` before the fix; zero references to `deletePassword` | `KeychainStore.deleteAll()` clears the whole service (any account, any accessibility class) and the memory vault |
| S-08 | **Health data at rest was unprotected and an unreadable snapshot could be replaced by an empty one.** `snapshot.json` kept the default protection class, `init` mapped a failed read to `Snapshot()`, and `persist()` swallowed every error with `try?` | FIXED | `LocalStore.init`/`load`/`persist` before the fix | directory and file carry `completeUnlessOpen`; a present-but-unreadable file sets `persistenceBlocked` (wipes still delete it); writes record `lastPersistenceError`; `testUnreadableSnapshotIsNeitherLostNorOverwritten` |
| S-09 | **Export filename came from user text.** `ActivityExport.write` put the editable `session.name` into `appendingPathComponent`, and that API does not interpret `..`, so the name chose where in the sandbox the file landed | FIXED | `ActivityExport.write` before the fix | `safeFileName` charset/length rules plus a `standardizedFileURL` containment check; `testExportFileNameCannotChooseWhereTheFileLands` |
| S-10 | **GPS deltas were summed without bounds.** A stream of `9205` delta bytes walked the coordinate to ±inf, into the map preview and into the exported GPX | FIXED | `PeriodAggregator.gpsTrail` before the fix | the running total saturates at ±90 / ±180; `testGPSDeltaStreamSaturatesInsteadOfDiverging` |
| S-11 | **Keychain class was left to the default**, which is backup-eligible, and an accessibility attribute in a query filters by class | FIXED | `KeychainStore.baseQuery`/`passwordQuery` | `AfterFirstUnlockThisDeviceOnly` on writes only, so items an older build wrote remain readable and deletable |
| S-12 | **No network, WebView or telemetry to attack** — the surface the review was about | VERIFIED | scan of `Sources` for `URLSession`/`Socket`/`NWConnection`/`WKWebView`/`evaluateJavaScript` (zero), `Support/Info.plist` (no ATS exceptions, no `CFBundleURLSchemes`, `bluetooth-central` the only background mode), no `.entitlements`, empty `logDeviceEvents`/`uploadReport`, no `otaWrite` writer | none needed |
| S-13 | **The APK's OAuth2 client id/secret was transcribed into this repository's comments and docs** | FIXED | header comment of `LocalOnlyCloudAPI`, E-40, README's removed-API list | replaced with a description of the constant rather than its value |

## Unknowns

These are documented at their use sites in code and need a BLE capture against a real watch.

| ID | Unknown | Why it matters | Current handling |
|---|---|---|---|
| U-01 | Whether a per-frame status word really precedes record-aligned bodies | Decides if the first two bytes of a multi-record frame are data or status; E-14 chose "data" | Decoder treats them as data; `count % 16 == 0` guard still enforced |
| U-02 | Heart Rate 16-bit endianness — spec says little endian, the APK reads big endian | HR values above 255 would be byte-swapped | Follows the APK (big endian), flagged in `HeartRateParser` |
| U-03 | Whether `9104 ReceiveRealTime` and `9108 SleepLog` are dead on all firmwares | They are absent from the Ver4 chain (E-45, and the `//TODO sleep log command` in the executor), but a firmware could still expect them | Neither is sent; `9108` is answered by the simulator for completeness, sleep rows derive from `9106` as in `WatchSynchronizerImpl` |
| U-04 | Distance and calorie field scale factors (meters vs ½ m; kcal vs 0.1 kcal) | Absolute distance/calorie figures on the Dashboard | Treated as metres and kcal; synthetic data calibrated to plausible daily totals |
| U-05 | `LocaleCommandValue` byte ordering for the `9024` language byte | Watch UI language could be wrong | Index into the supported language list, English default |
| U-06 | Real firmware image + OTA chunking/verify step | A real update needs the vendor image and the OTA write sequence | Bundled `ota_gps.bin` staged locally; chunked OTA write is stubbed |
| U-07 | Whether `9126` counts must be honoured exactly before issuing log reads | Some firmwares may reject reads that ignore counts | Counts are read and reported in the UI, reads are issued unconditionally |
| U-08 | What the five manufacturer-data bytes beyond the pairing code and protocol version mean (`04 fe 04 5f 00` on the observed watch: company id `0xFE04`, version `4`, then `5f 00`) | E-51 proves how the APK parses the first three bytes — and E-53 confirms that on air — but the trailing two are unused by both, so a firmware that changes their meaning would go unnoticed | Decoded as `[cid lo, cid hi, protocolVersion, …]` with the APK's byte order; the raw record is kept on `DiscoveredWatch.manufacturerData` and logged as `mfg=…` so a capture settles it |
| U-09 | **Settled by the pairing review.** The question was whether a watch needs the writes `Gen2PairExecutorImpl` performs between `9010` and `9011`. It does not gate DTP on them — but that executor is not even the one the observed watch gets: `ExecutorsFactory` routes a version-4 advertisement to `Gen2Version3PairExecutorImpl`, whose chain is `9010 9124 9024 9011` (E-58), so the profile write belongs at pair time after all | While the port paired with `9010` + `9011` only, a freshly paired watch kept whatever profile it held until the first sync's `9024` — wrong step goal and units on the watch face in between | Closed: `Gen2Command.pairingChain(protocolVersion:)` + `PairingViewModel.pair` run the version-appropriate chain with the executors' weights (bug 11). What remains genuinely unknown is cosmetic: whether the `2a26` DI-table/font tail (E-60) should be surfaced anywhere in the UI |
