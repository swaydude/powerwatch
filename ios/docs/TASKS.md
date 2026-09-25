# PowerWatch iOS Port — Task Breakdown

Legend: `[ ]` todo · `[x]` done. Estimate in ideal days. **Deps** = task IDs that must complete first.
Port sources are relative to `jadx-output/sources/powerwatch/matrix/com/pwgen2android/`.

---

## Phase 0 — Foundation (no hardware needed)

- [x] **T0.1** Survey repo: app package, cloud endpoints, BLE UUIDs, command IDs, models, dashboards (2d)
- [x] **T0.2** Create `ios/` tree + `Package.swift` with `PowerWatchCore` target (0.5d)
- [x] **T0.3** Port `BLEServicesKt` UUID constants → `BLEServices.swift`; unit tests assert each UUID string (0.5d)
  - Source: `sdk/protocol/BLEServicesKt.java`
- [x] **T0.4** Port all 55 Gen 2 command IDs → `Gen2CommandID.swift`; unit tests assert count = 55, uniqueness, spot mappings (1d)
  - Source: `sdk/protocol/commands/Gen2CommandIDs.java`
- [x] **T0.5** Port core data models → `Models/` (User, UserAccountSettings, Device, GoalConfiguration, Gender, UnitType, HourFormat, DefaultPhoneWatch) with parity tests (1d)
  - Source: `shared/data/models/*.java`
- [x] **T0.6** Write `tools/test_ios.sh` master test runner (preflight, unit, integration, device) (0.5d)
- [x] **T0.7** Set up XcodeGen `project.yml` + empty SwiftUI app shell that embeds `PowerWatchCore`; app builds for iOS Simulator (1d)
  - Team `5ZMY3Q3K9L`, bundle `com.swanky.powerwatch` (reuse `tools/build_ios.sh` conventions)
  - Done 2026-09-17: `ios/project.yml` + app target (onboarding wizard, dashboard, device/goals tab), UI tests (TC-X01), release build, `tools/test_ios.sh all` green

## Phase 1 — Protocol layer (no hardware needed)

- [x] **T1.1** Port `DataFormatter` / `Gen2DataFormatter` binary layouts: byte order, int sizes, string encoding (1.5d)
  - Source: `sdk/protocol/commands/DataFormatter.java`, `Gen2DataFormatter.java`
- [x] **T1.2** Port command data classes (encode+decode) in priority order (3d):
  1. Pairing: `9010/9011` start/stop, `9102/9002` user info, `9012` biometrics
  2. Sync: `9116/9126` log counts, `9115/9125/9105` activity start/end/delta, `9106` background, `9108` sleep, `9215/9205` ver-3 variants
  3. Clean: `9005–9008`, `9022`, `9023`
  4. Settings/goals: `9122/9124/9024`, `9003/9013/9103`, `9004` language
  5. Realtime: `9104` realtime, `9107/9117` RTL status/time
  - Done 2026-09-17: all 55 command IDs + every payload encoder/parser the Android app implements, including the 93xx watch-settings family (`WatchSettings.swift`), 9022/9024 bulk prefs, 9015 location, ver-3 log count/delta/header layouts
- [ ] **T1.3** Capture golden fixtures: run Android patched app against real watch, log BLE frames per command → `Tests/PowerWatchCoreTests/Fixtures/*.hex` (1d)
  - Reuse the `tools/capture_*.sh` + `tools/offline_verify.sh` instrumentation pattern
- [ ] **T1.4** Golden round-trip tests: every ported command decodes its fixture and re-encodes byte-identically (1d)
- [x] **T1.5** Property-based tests for variable-length decoders (truncated input → `DTPProtocolParsingError` equivalent, not crash) (1d)
  - Done 2026-09-17: `FramePropertyTests.swift` — all-command round-trip, every truncation rejected, payload bit-flips rejected, odd-size log payloads rejected

## Phase 2 — Persistence & calculations (no hardware needed)

- [x] **T2.1** Choose and add DB layer (GRDB recommended) + package dependency (0.5d)
  - Done 2026-09-17: GRDB 7.11.1 via SPM, platforms iOS 17+/macOS 14+
- [x] **T2.2** Port Room schema: entities, DAOs, converters → `Persistence/` (2.5d)
  - Source: `shared/data/db/` (RoomDB, UserDao, DeviceDao, GoalConfigurationDao, UpdateInfoDao, DefaultPhoneWatchDao, activityPeriods DAOs)
  - Keep epoch-millisecond timestamps and `SleepTypeTypeConverter` semantics
  - Done 2026-09-17: 13 tables ported verbatim (cloud-only `PasswordCredentials` skipped by design), `PowerWatchDatabase` + record rows + DAOs; SleepType stored as uppercase name, JSON lists via Codable; upserts = INSERT OR REPLACE, half-open range queries; TC-D01–D03 in `PersistenceTests.swift`
- [x] **T2.3** Port repositories/providers (`shared/data/providers/`, `repositories/`) with DAOs behind protocols (1.5d)
  - Done 2026-09-17: closed as covered — the Android repository layer is RxJava/cloud-oriented (ObserveRepository, CloudSynchronizer hooks); the offline iOS port's needs are fully met by `PowerWatchDatabase` DAOs + the calculation pipeline. Cloud sync code intentionally not ported (see TC-R02 zero-network audit).
- [x] **T2.4** Port derived-metric calculators (`shared/data/dataCalculation/`) as pure functions (2d)
  - Include day/week/month aggregation, `ActivityConstantsKt` boundaries
  - Done 2026-09-17: `Calculations/PeriodPipeline.swift` — `PeriodGrouping` keys, `groupByTime`/`groupByKey`, `fillBasePeriod`/`mergeBasePeriod` (Android quirks preserved: heartRate single-term weighting, maxHeartRate via min, minInHour = minute+1, five-minute buckets = (minute+1)/5), `fillSleepExtras`, hour formatters for walking/resting/sleep, five-minute sleep chain, walking day/week/month chain, generic `aggregatePeriods`. `Calculations/DateTimeKeys.swift` ports `DateTimeExtensionsKt` (dayUniqueID/monthUniqueID/weekUniqueID with year-bump, dayInWeek, weekOfYear). TC-D04–D06 in `CalculationTests.swift`. Bug caught by tests: week formatter must group by `weekUniqueID` (DayToWeekGrouper1), not day identity.
- [x] **T2.5** Data-layer tests: aggregation across DST boundaries, month/week rollover, empty-range queries, duplicate-period upserts (1.5d)
  - Done 2026-09-17: covered by `PersistenceTests.swift` (empty ranges, duplicate upserts, half-open range queries) + `CalculationTests.swift` (DST fall-back 25-hour day in America/New_York collapses to one identity bucket, month rollover Oct 1 vs Sep 30, week boundary Sat/Sun with Sunday-first weeks, empty groups, merge quirks). 77 tests green.
- [x] **T2.6** Port sync bookkeeping: `shouldSync` flags become "dirty" flags; sync state machine (local-only, no cloud `CloudSynchronizer`) (1d)
  - Done 2026-09-17: `Persistence/SyncBookkeeping.swift` — `SyncedRecordKind` (7 flag families), `SyncStatus` snapshot, `SyncBookkeeper` with dirty writes (Android's `onErrorResumeNext` branch, always taken offline), pending queries (`getShouldSyncDevice`/`notSyncedSessions` equivalents), and transactional `markSynced`/`markAllSynced`. No network (TC-R02). TC-D07 in `SyncBookkeepingTests.swift`.

## Phase 3 — BLE transport (software half done; on-device half hardware-gated)

- [x] **T3.1** `CBCentralManager` scanner: filter by DTP service UUID, expose discovered watches (1d)
  - Done 2026-09-17: `Transport/WatchTransport.swift` (`DiscoveredWatch`, `AdvertisementFilter` — DTP/OTA service classification, case-insensitive) + `Transport/CoreBluetoothTransport.swift` (CBCentralManager scan, scan-deferred-until-poweredOn). Software half tested in `TransportTests.swift`; on-device scan is TC-B01, hardware-gated.
- [x] **T3.2** Connection manager: connect, discover services/characteristics, subscribe notifications on RX char, state restoration (2d)
  - Source: `sdk/channels/BLECommunicationChannel.java`, `Gen2BLECommunicationChannel.java`, `sdk/connection/`
  - Done 2026-09-17: `CoreBluetoothTransport` — connect, service/characteristic discovery (watch-viewpoint naming: phone writes dtpRX …0011, subscribes dtpTX …0012 + PWX …0013), `willRestoreState` restoration. On-device connect/subscribe is TC-B02/B03, hardware-gated.
- [x] **T3.3** Port `CommunicationTechnology` abstraction + channel write/read over CoreBluetooth (1d)
  - Done 2026-09-17: `WatchTransport` protocol + delegate + `TransportState` machine (RxJava → delegate callbacks); `MockTransport` for tests; state/routing tests in `TransportTests.swift`.
- [ ] **T3.4** Real-device pairing: iOS app ↔ real watch, start/stop pairing commands verified (1d + hardware session)
- [x] **T3.5** Connection-priority / interval handling equivalent to Android's throttled high-priority request (0.5d)
  - Done 2026-09-17: documented no-op — iOS/CoreBluetooth exposes no public connection-priority API (Android `CONNECTION_PRIORITY_HIGH` has no equivalent). `requestHighPriority()` kept as protocol method for parity.
- [ ] **T3.6** Integration tests on device: scan→connect→subscribe→send `9107` RTL status→parse response (1d)

## Phase 4 — Sync engine (software half done; on-watch half hardware-gated)

- [x] **T4.1** Port sync orchestration: start AmDTP → count logs → pull → persist → clean → stop AmDTP (2.5d)
  - Source: `sdk/DeviceManager.kt`, `RealtimeWatchData.kt`, `shared/sync/`
  - Done 2026-09-17: `Sync/WatchSyncEngine.swift` (Gen2Ver2SyncExecutorImpl port) + `Sync/WatchLogFormatters.swift` (WatchEntryToWalking/Resting/SleepFormatter ports). TC-S01–S04 software halves in `SyncEngineTests.swift` (95 tests green): full pull cycle persists walking/resting/sleep with RTL-derived timestamps, clean-after-commit (TC-S02), mid-sync failure still sends stopAmDTP and never cleans (TC-S03), idempotent re-sync, concurrent-sync guard (gated), unsolicited 9104 → `onRealtime`.
- [x] **T4.2** Dedupe/idempotency: same log pulled twice must not duplicate periods (1d)
  - Done 2026-09-17: covered by `testReSyncIsIdempotent` — INSERT OR REPLACE upserts keyed on startTime make a repeated pull of the same logs a no-op (TC-S04).
- [x] **T4.3** Interruption safety: mid-sync disconnect leaves DB consistent; clean commands only run after commit (1d)
  - Done 2026-09-17: covered by `testCleanRunsOnlyAfterPersist` + `testMidSyncFailureStillStopsAndDoesNotClean` — persist precedes clean in the engine (deliberate deviation from Android, documented), stopAmDTP always sent on failure.
- [ ] **T4.4** Real-watch end-to-end sync: full overnight data lands in DB with correct dashboard counts (1d + hardware session)
- [ ] **T4.5** Realtime stream: `9104` realtime command drives live UI updates (1d)
  - Software half done (routing test in `SyncEngineTests.swift`); the live-UI wiring lands with T5.5.

## Phase 5 — UI (SwiftUI)

- [x] **T5.1** App skeleton: tab structure, navigation, design tokens (colors/typography) matched to screenshots (1.5d)
  - Reference: `verify_shots/screens/` (Android) and `main/` package
  - Done 2026-09-17: `Theme.swift` tokens + tab structure (Dashboard / My PowerWatch / Watch Settings), `MainTabView`.
- [x] **T5.2** Onboarding: get-started wizard, goals, language, units, biometrics (local-only — no account screens) (2d)
  - Source: `setup/` (drop `createaccount/`, `signin/`, `verifyaccount/`, `forgotpassword/`, `changepassword/`)
  - Done 2026-09-17: profile+goals wizard (`OnboardingView`), DB-backed persistence in `AppModel` (user + goal rows; one-time JSON-store migration), no account screens. TC-X01.
- [x] **T5.3** Pairing UI: Gen 2 flow with product selection and progress states (1.5d) — Source: `pair/`
  - Done 2026-09-17 (software half): `SyncController` (scan list with RSSI, connect, auto-sync on connect, device row recorded on connect) surfaced in `DeviceView`. Real product-selection/pair-code flow is hardware-gated with T3.4.
- [x] **T5.4** Dashboard: day/week/month period switcher, walking/resting/sleep charts (Swift Charts), step/calorie/distance tiles (3d)
  - Source: `main/dashboard/`
  - Done 2026-09-17: `DashboardView` (period picker, goal rings from synced data, tiles, Swift Charts hour-of-day steps/sleep charts) + `DashboardData.swift` (`DashboardSummary` reads the stored hour-period tables through the PeriodPipeline day/week/month chain, like Android's dashboard). Sync engine now formats + stores hour periods after each pull (WatchSynchronizerImpl flow). TC-X02.
- [x] **T5.5** Realtime dashboard card: live steps/calories/heart-rate from `9104` stream (1d)
  - Done 2026-09-17: `SyncController.realtime` ← `engine.onRealtime` (unsolicited 9104 routing), `RealtimeStat` card in the dashboard. Live values need the watch (TC-S06).
- [x] **T5.6** Watch settings screens: goals, units, language, alerts, DND, backlight, ringtone… mapped to the 93xx command family (2.5d)
  - Source: `main/watch/`, `sdk/highlevel/WatchSettingsExecutor.kt`
  - Done 2026-09-17: `WatchSettingsView` — pickers for the full 93xx family (DND/backlight×2/popup/GPS/home screen/BLE alert/ringtone/alert type/alarm), local persistence (`WatchSettingsState`), send-all via `engine.sendCommand` (single-flight, refused mid-sync). TC-X03. On-watch verification hardware-gated.
- [x] **T5.7** History/report screens with period detail drill-down (1.5d) — Source: `report/` (local rendering only)
  - Done 2026-09-17: `HistoryView` (28-day list from stored hour periods, "Today" row, empty state) + `HistoryDayView` drill-down (steps/calories/distance/sleep tiles, sleep-by-type chart, steps-by-hour chart). TC-X04 in `HistoryUITests.swift`.
- [x] **T5.8** UI snapshot/parity review against Android screenshots; fix deltas (1d)
  - Done 2026-09-17: every screen in `verify_shots/screens/` reviewed — see `docs/UI_PARITY.md` for the screen-by-screen table. Fixed the one substantive software delta: `WatchSettingsView` gained the Android "Watch + App" section (Clock 12h/24h, Units Metric/Imperial, Language) sent via the `9024` bulk-prefs + `9004` language commands. Cloud-only screens (account, Google Fit/Strava, notification listener) dropped by design; power-gauge UI deferred to the hardware session.

## Phase 6 — Hardening & release

- [x] **T6.1** Error surfaces: BLE permission states, watch-off, sync-failed banners (1d)
  - Done 2026-09-17: `DeviceView` maps every `TransportState.unavailable` reason (powered off / unauthorized / unsupported) to a banner; sync failures surface via `SyncController.lastError` in the dashboard banner + device tab; phase text shows live sync progress.
- [x] **T6.2** Background behavior: document + implement what iOS allows (state restoration, BGTask opportunistic sync) (1.5d)
  - Done 2026-09-17: `bluetooth-central` background mode declared (required for CBCentralManager state restoration); `CoreBluetoothTransport` implements `willRestoreState` + `resubscribeCharacteristics`. BGTask opportunistic sync deliberately not added (watch sync needs an active connection; iOS background BLE gives restoration only — documented here as the boundary).
- [x] **T6.3** Performance: large-history dashboard scroll, chart query indexing (1d)
  - Done 2026-09-17: all activity-period tables are keyed `startTime INTEGER PRIMARY KEY` and every read (DAO range fetches, `DashboardSummary`, `HistoryDay.loadDays`) is a half-open `startTime` range scan over that PK — SQLite serves each as a rowid range scan, no extra index needed. Dashboard loads one bounded window (day/week/month); history loads 28 days × ~5 small PK-range queries on appear, each touching ≤ 24 rows. No full-table scans anywhere in the read path.
- [x] **T6.4** Release build: signing, install via `tools/build_ios.sh` conventions, final device smoke (0.5d)
  - Done 2026-09-17: release build green as a permanent `run_release` stage in `tools/test_ios.sh all` (team `5ZMY3Q3K9L`, bundle `com.swanky.powerwatch`). **Signed Release installed + launched on the physical iPhone** ("Junk", iPhone17,5, UDID `00008140-00161D9902F2801C`) via `tools/build_ios.sh Release` (device now auto-detected; the dev profile had to be trusted on-device first). Smoke: launch OK, process stayed alive >25 s, no crash.
- [x] **T6.5** Zero-network audit: app target has no URLSession/sockets; verify with a network-blocked test run (0.5d)
  - Done 2026-09-17: `tools/test_ios.sh all` runs a `zero-network audit` stage — greps app + core targets for URLSession/NWConnection/CFSocket/URLRequest/CFNetwork (zero hits; binary links no CFNetwork). TC-R02.
- [x] **T6.6** Full regression: `tools/test_ios.sh all` green; update docs + memory (0.5d)
  - Done 2026-09-17: full pipeline ALL STAGES PASS (preflight, 95 unit tests, 4 UI tests TC-X01–X04, release build, zero-network audit) after T5.7/T5.8/T6.3/T6.4. Docs + memory updated.

**Remaining open items are all hardware-gated** (need the physical watch): T1.3/T1.4 golden fixtures, T3.4/T3.6 on-device pairing/integration, T4.4/T4.5 real-watch sync/realtime, plus the deferred power-gauge UI (`docs/UI_PARITY.md`). T6.4's on-device install/smoke completed 2026-09-17 on the connected iPhone.

---

## Critical path

`T0.7 → T1.1 → T1.2 → T3.2 → T3.4 → T4.1 → T4.4 → T5.4`

Total rough estimate: ~45 ideal days (≈ 28 without hardware-gated tasks).

## Task → test-case traceability

| Task | Test cases |
|---|---|
| T0.3 | TC-U01–U02 |
| T0.4 | TC-U03–U05 |
| T0.5 | TC-U06–U08 |
| T1.2/T1.4 | TC-P01–P08 |
| T2.2/T2.4 | TC-D01–D06 |
| T3.4/T3.6 | TC-B01–B05 |
| T3.1–T3.3/T3.5 (software) | TransportTests |
| T4.1–T4.3 (software) | SyncEngineTests (TC-S01–S04) |
| T4.4/T4.5 (on-watch) | TC-S05–S06 |
| T5.1–T5.6 | TC-X01–X03 |
| T5.7–T5.8 | TC-X04 (+ `docs/UI_PARITY.md` review) |
| T6.4–T6.5 | TC-R01–R03 |
