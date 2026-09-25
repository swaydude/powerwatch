# PowerWatch 2 — Android → iOS Conversion Project Plan

**Date:** 2026-09-17
**Status:** Planning complete, implementation not started (from scratch)
**Source of truth:** Decompiled PowerWatch 2 Android app v1.5.6 (`powerwatch.matrix.com.pwgen2android`)

---

## 1. Objective

Port the Matrix PowerWatch 2 Android companion app to a native iOS app with **zero cloud dependencies** — a fully offline, local-first app that:

1. Pairs with the PowerWatch 2 (Gen 2) watch over BLE.
2. Syncs walking / resting / sleep / activity data into a local database.
3. Shows a health dashboard with realtime watch data.
4. Manages watch settings (goals, language, units, alerts, etc.).
5. Makes **no network calls** (auth, sync, telemetry, OTA, fonts, Strava, FCM are all out of scope — deliberately removed).

This mirrors the offline goal already achieved on Android by patching the APK (verified 2026-08-22: full BLE pairing with a real watch, zero cloud API calls). The iOS port bakes that offline behavior in by construction rather than by patching.

## 2. Source material reviewed (repo inventory)

| Path | Contents | Role in the port |
|---|---|---|
| `powerwatch.matrix.com.pwgen2android_1.5.6.apk` | Original APK (77 MB) | Reference binary |
| `apktool-output/` | apktool decode (smali, res, manifest) | Behavior ground truth for patch verification |
| `jadx-output/sources/` | Decompiled Java/Kotlin sources | **Primary port source** — 1,431 files in the app package alone |
| `patched/` | Patched smali + debug keystore | Documents the Android offline patch |
| `tools/` | Build/patch/verify scripts (incl. prior `build_ios.sh`) | Reuse conventions (team, bundle id, install flow) |
| `verify_shots/` | Android + prior iOS screenshots | UI parity reference |
| `.claude/skills/reverse-engineer.md` | Full architecture/API docs | The distilled knowledge base for this plan |

Key app-layer packages under `jadx-output/sources/powerwatch/matrix/com/pwgen2android/`:

- `sdk/` — BLE stack: scanning, connection, channels, DTP protocol, 55 Gen 2 commands
- `shared/data/` — Room DB, entities, DAOs, repositories, derived-metric calculations
- `shared/cloud/` — Retrofit/OkHttp cloud services (**removed on iOS**)
- `main/dashboard/` — health dashboard UI (charts, realtime, running)
- `pair/` — pairing flow (Gen 1 + Gen 2)
- `setup/` — onboarding wizards (goals, language, units, biometrics, permissions)
- `fcm/`, `report/`, `strava/` — cloud-only features (**removed on iOS**)

## 3. Architecture mapping (Android → iOS)

| Android (Kotlin/Java) | iOS (Swift) | Notes |
|---|---|---|
| RxJava 2 (`Single`/`Observable`/`Completable`) | Combine (`Future`/`Publisher`/`AnyPublisher<Never>` + `async/await` bridges) | Adopt async/await internally; Combine for UI binding |
| RxAndroidBle 2 | **CoreBluetooth** (`CBCentralManager`, `CBPeripheral`) | Largest rewrite; channel/notification model ports directly |
| Room + SQLCipher | **GRDB.swift** (or SwiftData) on-device | Schema ported from Room entities/DAOs; no SQLCipher needed (local-only) |
| Koin DI | Swift explicit composition root / `@MainActor` environment | No DI framework; a single `AppContainer` |
| Retrofit + OkHttp cloud layer | **Deleted** | Offline by construction; `CloudSynchronizer` becomes a no-op |
| MVVM + AndroidX fragments | **SwiftUI + `@Observable` view models** | Screen-for-screen parity (see `verify_shots/`) |
| Firebase / FCM / Crashlytics / Bugfender | Deleted | No analytics or push |
| Android foreground service (BLE connection) | Background BLE + `BGTaskScheduler` for sync; state restoration | iOS background limits are a key risk (§8) |
| MPAndroidChart (dashboard charts) | Swift Charts | Same periods: hour / day / week / month |
| Room data calculation (`dataCalculation/`) | Ported pure-Swift calculators | Highly unit-testable — port first |

## 4. Target architecture (iOS)

```
ios/
├── Package.swift                  # PowerWatchCore SPM package (no UI dependencies)
├── Sources/PowerWatchCore/
│   ├── BLEServices.swift          # GATT service/characteristic UUIDs
│   ├── Gen2CommandID.swift        # 55 watch command IDs (wire constants)
│   ├── Models/                    # User, Device, GoalConfiguration, periods…
│   ├── Protocol/                  # DTP protocol, command framing, DataFormatters
│   ├── Persistence/               # GRDB database, DAOs, migrations
│   ├── Calculations/              # Derived health metrics (pure functions)
│   └── Sync/                      # Watch sync orchestration (local only)
└── PowerWatch/                    # XcodeGen-generated app target
    ├── PowerWatchApp.swift        # Composition root (offline by default)
    ├── Pairing/                   # Gen 2 pairing flow
    ├── Dashboard/                 # Charts, realtime, running
    ├── WatchSettings/             # Goals, units, language, alerts
    └── Onboarding/                # Get-started wizard (no account)
```

**Why a separate `PowerWatchCore` package:** the BLE protocol, data models, persistence, and metric calculations are pure logic with no UI or cloud dependency. Keeping them in an SPM package makes them testable from the CLI (`swift test`) without a simulator, and testable against golden fixtures captured from the real watch.

## 5. Wire protocol facts (already extracted from the decompiled app)

**GATT UUIDs** (from `sdk/protocol/BLEServicesKt.java`):

| Constant | UUID |
|---|---|
| DTP service | `00002760-08C2-11E1-9073-0E8AC72E1011` |
| DTP RX characteristic | `00002760-08C2-11E1-9073-0E8AC72E0011` |
| DTP TX characteristic | `00002760-08C2-11E1-9073-0E8AC72E0012` |
| OTA service | `00002760-08C2-11E1-9073-0E8AC72E1001` |
| OTA RX | `00002760-08C2-11E1-9073-0E8AC72E0001` |
| OTA TX | `00002760-08C2-11E1-9073-0E8AC72E0002` |

**Framing:** `DTPProtocol` is a pass-through — `ProtocolParserImpl.parseMessage()` returns the payload bytes verbatim; binary framing lives in each command's `DataFormatter` (`sdk/protocol/commands/DataFormatter.java`, `Gen2DataFormatter.java`, `Gen1DataFormatter.java`). Each command carries a 2-byte ID (hex strings like `"9000"`); all 55 IDs are enumerated in `ios/Sources/PowerWatchCore/Gen2CommandID.swift`.

**Sync flow (Gen 2):** connect → subscribe notifications (RX char) → start AmDTP (`9000`) → get log counts (`9116` / `9126`) → pull activity/background/sleep logs (91xx family) → clean pulled logs (90xx family) → stop AmDTP (`9001`).

**Sync flow (v3/v4, the one this watch speaks):** `9000` → `9126` log counts →
`9124`/`9024` user+goals (this handshake is what arms the RTL table) → `9107`/`9117`
RTL → `9215` activity headers + `9205` activity deltas → `9106` background →
persist → `9023` clean → `9226` error log (v4 only) → `9001`. `ExecutorsFactory`
picks the flow from `deviceInfo.protocolVersion`, which iOS cannot read (it lives on
the OTA channel), so the version comes from the pairing advertisement and a
`9126`-payload probe that can only separate v2 from v3+.

**Real-hardware facts (v3.01.00 watch, proven by trace, not by reading code):**
- Every received frame must be ACKed on the event characteristic `…0013`
  (`05000020008DEF02D2`), or the watch stalls ~10 s and drops the link
  (`CBErrorDomain Code=7`). Nothing in the first port wrote that characteristic.
- Responses carry **no command ID** and their header word varies (`4010`…`4014`,
  low nibble ≈ frame counter). Correlate by "one outstanding request", never by ID.
- CRC32 is IEEE over `frame[4 ..< len-4]`, stored little-endian; the payload is
  everything after the 4-byte header, and a status-only body is a `ResponseType`
  word (`E200`/`E202`/`E102`/`E404`/`E423`) meaning "done, zero records".
- Big responses are fragmented across notifications and reassembled by the
  self-describing size field (`DTPStreamFramer`); a status frame closes the transfer.
- A state-restored CoreBluetooth link can be a **phantom** — cached services and
  notification state replay, so "channel ready" fires while writes go nowhere.
  The transport tears the restored link down and reconnects before trusting it.
- A **dropped link does not come back by itself** the way it does on Android
  (`DeviceManagerImpl` re-issues `startConnection`, and the OS reconnects
  transparently). The transport now owns that: after any teardown it did not ask
  for it retries on `ReconnectPlanner`'s schedule (1, 2, 5, 10, 30 s … capped at
  8 attempts), `central.connect` gets a 12 s deadline because CoreBluetooth
  never fails an unanswered connect, and when the budget is spent it leaves a
  scan running (a rebooted watch advertises again). A user disconnect, or
  "Stop Reconnecting", clears it.
- The RTL table (log index → wall clock) is the only thing that dates a
  background log, and on v3.01.00 it is **incomplete or delivered one exchange
  late** rather than merely empty. `9107` (one byte per slot) and `9117` (one
  epoch dword per slot) disagree in both directions on the same watch: size 0
  with one real time arriving, or 3 slots with `E200`-only and the 3 times then
  arriving on the `9215` exchange. Two consequences, both verified on hardware
  (2026-09-25 13:17 — one late time was the whole difference between a dashboard
  at zero and 88 real steps dated 13:14/13:15):
  - the engine trusts the **time list**, not `9107`'s slot byte (Android caps the
    zip at the slot count, which discards the only timestamp it has);
  - `LogParsers.parseLateRTLTimes` re-homes an answer on the `9215` exchange that
    is exactly `4 × slots` bytes, not a whole number of 48-byte header records,
    and whose every word is a plausible epoch second. Epoch-range-checked, so
    junk bytes can never be laundered into dates.
  Anything still undateable is **dropped** rather than guessed: spacing a block
  "60 s back from now" was tried first and filed other days' activity under
  today, so the day view only ever shows logs the watch actually timestamped.
- A background record's **RTL index is dword 0 bits 0–6** — the *first* field
  (`Gen2BackgroundLogCommand.parseSingleLog`), with walk 7–14, run 15–22 and
  distance 23–31 after it. Reading it from the far end instead rotates all four
  fields and silently destroys the interesting half of the data: every record
  carrying steps resolved a bogus RTL index, so the pull was dropped as
  undateable (real watch 2026-09-25: a 32-record block with 419 steps). Skin and
  case temperature are likewise w3 bits 0–8 and w4 bits 13–21 respectively.
- `9215`/`9205` can answer with a few **junk bytes while their announced count is
  0** (real device 2026-09-25: `9215` answered 3 bytes with
  `activityHeaderLogs == 0`). The ver-3 parsers read the whole records they got
  and trace the remainder instead of failing the sync — Android's
  `LogsCountChecker` only *logs* a count/record mismatch and discards the result,
  so aborting there was a port invention that hid every other result.
- `9023` wipes the watch's **entire** log buffer, so it now runs only when the
  pull was dated in full. Earlier builds cleaned unconditionally, which meant
  every undated block was deleted from the only place it still existed — the
  419-step pull of 2026-09-25 10:56 was dropped as undateable, cleaned, and the
  watch face kept its 606 for a day the app could never show. Re-pulling an
  undated block is cheap (and idempotent through the upserts); losing it is not.
  Related: `LogParsers.assignTimestampsSkippingUndateable` dates the records whose
  RTL index resolved instead of abandoning the block at the first miss, which is
  what Android does. Cleaning is therefore also skipped when a *partial* pull left
  some records unanswered.
- `9126` is read **big-endian** (unlike the 16-byte background records), six
  dwords: realtimeStatus, realtime, activityHeader, activityDelta, background,
  sleep — the same field mapping as Android's eight-argument `Gen2LogsCount`
  constructor with the two start/end slots forced to zero. Current watch:
  `[3, 3, 0, 0, 3, 0]`.
  A one-time launch repair (`AppModel.purgeInventedLogRowsIfNeeded`, UserDefaults
  key `db.purge.emptyRTLLogs.v1`) clears the rows the old fallback already wrote;
  `PowerWatchDatabase.purgeLogTables()` empties the six log/hour-period tables
  and leaves the profile, goals, device row and activity sessions alone.
- A command can also be answered by **nothing at all**. The engine now aborts a
  request after 10 s of total silence (`SyncError.responseTimeout`): while a
  request hung, the engine's busy flag stayed set and every later
  watch-settings write was refused, which looked like "Send All to Watch fails".
  The UI likewise waits out a running sync (up to 10 s) before sending a setting
  instead of dropping it.
- **The watch's day totals do not come from DTP at all.** `9104` (realtime) was
  never observed answering on this firmware; the numbers the watch face shows are
  published on the standard Device Information service (`180a`), characteristic
  `2a25` — Android's `GEN2_SERIAL_REQUEST` is literally a GATT *read* of it
  (`Gen2ProtocolBasics`), polled by `RealTimeDataProviderImpl` on
  `interval(0, 20, SECONDS)`. The value is consecutive 4-byte groups of
  `[v0, v1, v2, tag]`, value = 24-bit little-endian `v2<<16|v1<<8|v0`, a trailing
  partial group discarded (`RealtimeDataParser.extractData` reads each group
  reversed); tags are `HSMTable`: `0` total steps, `1` current walk steps,
  `2` current run steps, `16` calories, `17` BMR, `18` active calories
  (thousandths → ÷1000), `32` sleep minutes, `48` distance **in metres** (Android
  keeps `metres/1000` as km), `64` solar µW, `65` thermal µW, `66` battery %,
  `80` skin temp (24-bit signed), plus an unlisted tag `81`. Verified on-device
  2026-09-25: `5e020000 5e020001 …  56000042` → 606 steps / 448 m / 134 kcal /
  87 %, identical to the watch face, while the log-derived dashboard still read
  88 steps (DTP logs cannot be dated without an RTL time). iOS got this as
  `CoreBluetoothTransport.readLiveData()` + `LogParsers.parseLiveTotals` + the
  engine's 20 s poll, feeding `SyncController.liveTotals` and the dashboard's live
  card. Note the stack reports the service/characteristic in **short form**
  (`"180A"`, `"2A25"`), so they must be matched with `CBUUID` equality, never by
  `uuidString` against the long spelling.

## 6. Phases & milestones

| Phase | Deliverable | Milestone criterion |
|---|---|---|
| **P0 — Foundation** | `PowerWatchCore` SPM package: UUIDs, command IDs, models; test harness | `swift test` green; 55 command IDs verified against jadx source |
| **P1 — Protocol** | DTP framing + Gen 2 command encode/decode (DataFormatter ports); golden fixtures from real watch | Round-trip tests green; real-watch fixture capture scripted |
| **P2 — Persistence** | GRDB schema + DAOs ported from Room entities; metric calculators | Data-layer unit tests green (incl. boundary dates, DST edges) |
| **P3 — BLE** | CoreBluetooth central manager, scanner, connection, channels | Pairs with real watch in foreground; realtime data flows |
| **P4 — Sync engine** | Sync orchestration (pull logs, clean, dedupe) end-to-end | Overnight real-watch sync populates DB; no duplicates |
| **P5 — UI** | SwiftUI app: onboarding, pairing, dashboard, watch settings, history | Screen-for-screen parity vs `verify_shots/screens/` |
| **P6 — Hardening** | Background scheduling, error handling, performance, release build | `tools/test_ios.sh all` green; device smoke pass |

Sequencing is deliberate: P0–P2 are pure logic testable headlessly (fast, no hardware), P3–P4 need a real watch, P5 needs the data from P4 to be meaningful. The existing iPhone (iPhone17,5, UDID `03C2400C-84A8-591B-B84A-CE6D1DBCC9AB`) and team `5ZMY3Q3K9L` from `tools/build_ios.sh` are reused for device installs.

## 7. Out of scope (by design)

- Any cloud endpoint (auth, user accounts, upload, OTA, fonts, metrics, Strava, FCM)
- Gen 1 watch support (Gen 2 only first; Gen 1 framing is a later increment)
- Watch firmware OTA on iOS
- App Store distribution (personal/sideloading build)

## 8. Risks & mitigations

| Risk | Impact | Mitigation |
|---|---|---|
| iOS background BLE restrictions break long syncs | Sync stalls when backgrounded | Document foreground-sync requirement; `BGTaskScheduler` for opportunistic continuation; connection-priority handling mirrors Android's throttle logic |
| Decompiled Java misleads on binary formats (jadx artifacts) | Wrong bytes on the wire | Golden-fixture tests: capture real watch frames with the Android app + `tools/capture_*.sh` flow, then assert byte-for-byte in Swift |
| Room → GRDB schema drift (date/timezone semantics) | Duplicate or missing periods at boundaries | Port `ActivityDayDataConverter` / DST-sensitive logic with dedicated test cases; store epoch millis exactly like Room |
| Real watch unavailable during development | P3/P4 stall | P0–P2 + UI skeleton are hardware-free; fixtures captured ahead of time |
| Xcode license/toolchain not accepted yet | Builds blocked | `tools/test_ios.sh` preflight detects and reports it before any build |
| Watch clean-commands fired at wrong time | Data loss on the watch | Clean commands only after successful DB commit (same ordering the Android app uses) |

## 9. Toolchain

- Xcode 27.0 (build 27A266a) — **license not yet accepted**; run `sudo xcodebuild -license` before building
- `xcodegen` (Homebrew) — generates the app project from `project.yml`
- Swift Package Manager — `PowerWatchCore`
- `swift test` — protocol/model/calculation tests (no simulator needed)
- `tools/test_ios.sh` — master test runner (see `TEST_CASES.md`)
- Real hardware: PowerWatch 2 watch + iPhone (for P3+ integration and device smoke tests)

## 10. Definition of done

1. All P0–P6 milestone criteria met.
2. `tools/test_ios.sh all` exits 0 (unit + integration + build + device smoke).
3. Full user journey on device: onboard → pair → realtime → overnight sync → dashboard history — with **no network entitlement used** (verified by absence of any network client in the app target).
