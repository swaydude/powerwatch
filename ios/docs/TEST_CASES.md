# PowerWatch iOS Port — Test Cases

IDs group by layer: **U**nit · **P**rotocol · **D**ata · **B**LE integration · **S**ync integration · **X** UI · **R**elease/regression.
`How to run` refers to `tools/test_ios.sh` stages or Xcode test targets.

---

## Unit tests — `PowerWatchCoreTests` (run: `tools/test_ios.sh unit` → `swift test`)

| ID | Test case | Expected result |
|---|---|---|
| TC-U01 | BLE service UUIDs match jadx `BLEServicesKt` | All 7 UUID constants equal the Android values (DTP/OTA service + RX/TX chars + PWX RX) |
| TC-U02 | UUIDs are uppercase-normalized | Accepting lowercase input still matches the same CBUUID |
| TC-U03 | Command ID catalog completeness | `Gen2CommandID.allCases.count == 55` |
| TC-U04 | Command ID uniqueness | No two cases share a raw value |
| TC-U05 | Spot-check wire mappings | e.g. `9000`=startAmDTP, `9010`=startPairing, `9104`=receiveRealTime, `9107`=rtlStatus, `9117`=rtlTime, `9116`=getLogCount, `9309`=reset |
| TC-U06 | Model parity — `User` | Field set/types match Android `User` (uid: Int64, enabled: Bool, name/email/password: String, age/height: Int, weight: Float, gender, shouldSync, accountSettings) |
| TC-U07 | Model parity — `Device`, `GoalConfiguration`, `UserAccountSettings` | Fields match `shared/data/models` (Device: bluetoothAddress, serialNumber, firmwareVersion, productName, pid, 5 notification bools…; Goal: steps, calories, sleep, power, distance, createdAt, shouldSync) |
| TC-U08 | Enum parity | `Gender` male/female, `UnitType` metric/imperial, `HourFormat` 12/24 round-trip through their raw representations |

## Protocol tests — golden fixtures (run: `tools/test_ios.sh unit` → `swift test` with `Tests/…/Fixtures/`)

| ID | Test case | Expected result |
|---|---|---|
| TC-P01 | Fixture decode | Each `Fixtures/*.hex` frame (captured from real watch) decodes to the expected typed command |
| TC-P02 | Round-trip byte equality | `encode(decode(fixture)) == fixture` byte-for-byte for every fixture |
| TC-P03 | User info command | `9002`/`9102` encode matches a known-good Android-produced frame (age/height/weight/gender) |
| TC-P04 | Biometrics command | `9012` payload layout matches fixture byte-for-byte |
| TC-P05 | Log-count parse | `9116`/`9126` responses decode counts for activity/background/sleep/RTL |
| TC-P06 | Sleep log decode | `9108` payload → `SleepFiveMinPeriod` entries with correct types (deep/light/awake) |
| TC-P07 | Truncated input safety | Every decoder, fed fixtures cut at each byte position, throws a parse error — never crashes |
| TC-P08 | Clean commands | `9005–9008`, `9022`, `9023` encode to expected byte sequences (they carry no payload) |

## Data layer tests (run: `tools/test_ios.sh unit` → `swift test`)

| ID | Test case | Expected result |
|---|---|---|
| TC-D01 | Period upsert idempotency | Writing the same walking/sleep/rest period twice creates one row |
| TC-D02 | DST boundary aggregation | A day spanning a DST change aggregates to 23/25 hours without dropped or duplicated periods |
| TC-D03 | Week/month rollover | Queries for "last week"/"last month" return exactly the Room-converted ranges |
| TC-D04 | Empty-range queries | Querying a range with no data returns empty, not error |
| TC-D05 | Derived metrics | `dataCalculation` ports produce identical daily steps/calories/distance for a seeded week vs expected values computed from the Android code |
| TC-D06 | Sync flags | Records pulled from watch start "dirty"; marking synced clears; re-pull of same log does not resurrect dirty state |

## BLE integration tests — real watch + iPhone (run: `tools/test_ios.sh device`)

| ID | Test case | Expected result |
|---|---|---|
| TC-B01 | Scan discovery | Watch in pairing mode is discovered advertising the DTP service UUID |
| TC-B02 | Connect + discover services | DTP service + RX/TX characteristics discovered within 10 s |
| TC-B03 | Subscribe notifications | Notification subscription on RX char succeeds; CCCD write verified |
| TC-B04 | RTL status exchange | Send `9107`, receive parseable status response |
| TC-B05 | Pairing sequence | `9010` start pairing → watch shows pairing state → `9011` stop; watch UI confirms paired |

## Sync integration tests — real watch + iPhone (run: `tools/test_ios.sh device`)

| ID | Test case | Expected result |
|---|---|---|
| TC-S01 | Full pull cycle | AmDTP start → counts → logs → DB rows appear for activity/background/sleep |
| TC-S02 | Clean after commit | Clean commands (`90xx`) are sent only after DB transaction commits; a forced DB failure must prevent cleaning |
| TC-S03 | Interruption recovery | Airplane-mode mid-sync → app reconnects and completes without duplicates |
| TC-S04 | Idempotent re-sync | Running sync twice yields identical dashboard aggregates |
| TC-S05 | Overnight capture | After wearing the watch overnight, morning sync produces a plausible sleep-period chart |
| TC-S06 | Realtime stream | `9104` stream updates live tiles within ~1 s of watch display change |

## UI tests — simulator (run: `tools/test_ios.sh ui` → `xcodebuild test`)

| ID | Test case | Expected result |
|---|---|---|
| TC-X01 | Onboarding completion | Wizard (goals, language, units, biometrics) completes with no account screens, lands on dashboard |
| TC-X02 | Pairing flow UI | Product select → pairing progress states render; cancel path works |
| TC-X03 | Dashboard periods | Day/week/month switcher changes chart ranges and labels correctly |
| TC-X04 | Dashboard rendering with seeded data | Seeded fixture data produces non-empty charts with correct totals |
| TC-X05 | Watch settings round-trip | Change a goal → settings command constructed with new value → UI reflects it |
| TC-X06 | Unit switch | Metric↔imperial toggles distance/height units across all screens |
| TC-X07 | Watch disconnect state | Lost connection shows clear state and reconnect affordance, no crash. Software side: transport auto-retries a dropped link (1/2/5/10/30 s, capped) then scans; `device.stopReconnect` cancels; `ReconnectPlannerTests` pins the schedule. On-watch verification (watch reboot mid-session) hardware-gated. |
| TC-X08 | Empty state | Fresh install with no watch shows onboarding/pair prompt |
| TC-X09 | Accessibility spot check | Dashboard tiles have labels; dynamic type does not truncate critical values |
| TC-X10 | Screenshot parity | Key screens compared side-by-side with `verify_shots/screens/` — layout/parity review |

## Release / regression (run: `tools/test_ios.sh all`)

| ID | Test case | Expected result |
|---|---|---|
| TC-R01 | Clean build | `xcodebuild` Debug + Release build succeeds with no warnings-as-errors failures |
| TC-R02 | Zero-network audit | App binary contains no active network client usage at runtime; with the device in airplane mode, full user journey works |
| TC-R03 | Device smoke | Install + launch on iPhone17,5 via `tools/build_ios.sh` flow; cold start < 2 s to onboarding/dashboard |
