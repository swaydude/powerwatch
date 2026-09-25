# UI Parity Review — iOS Port vs Android Screenshots (T5.8)

Reviewed 2026-09-17, updated 2026-09-24 (activity sessions, calendar grid,
combined day charts, pairing-failed state), against every screen in
`verify_shots/screens/` (Android v1.5.6 on-device captures). Each row records
the port's state and the delta; "dropped by design" = the offline-first
boundary (no cloud module, TC-R02).

| Android screenshot | iOS port | Delta & resolution |
|---|---|---|
| `onboarding_01`–`06` | `OnboardingView` (profile → goals wizard) | Parity for the offline steps; goal row set matches Android's. |
| `onboarding_07`/`08` (create account / sign-in) | — | **Dropped by design** — account screens are cloud-only; the port is local-only (no `createaccount`/`signin` packages ported, per plan T5.2). |
| `dashboard_today` | `DashboardView` | Parity: STEPS/CALORIES/SLEEP/**POWER** goal rings, tiles (incl. BMR calories and max HR), "your day" totals, hour charts. Live card (`RealtimeStat`) covers Android's today screen; live values need the watch (TC-S06). |
| `dashboard_sections` | `DashboardView` + `MainTabView` | Android uses 2 tabs with collapsible sections; the port uses 4 tabs (Dashboard / History / My PowerWatch / Watch Settings) — iOS idiom, same content reachable. Accepted deviation. The heart-rate (avg / range / HRV), temperature (current / average / hourly range) and power (From Body / From Light) cards are now on the dashboard. |
| `period_chart` | `DashboardView` period picker + `HistoryDayView` | Day/week/month periods and hour charts match; the day drill-down toolbar steps between days with ‹ › arrows (Android's date navigation). |
| `dashboard_today` charts (`steps_calories`, `sleep_heartrate`) | `DashboardView` `combinedCharts` | Closed: a segmented control under the steps chart swaps the companion band between **Steps + Calories** and **Sleep + Heartrate**, using Android's own labels. Each band keeps its own axis (steps and calories are different orders of magnitude) instead of Android's dual-axis overlay. |
| `fragment_activity_periods` / `fragment_user_activity` / `fragment_maps` (activity sessions) | `HistorySessionList` + `SessionDetailView` | Closed: v4 sessions are now real. `9215` carries interleaved session start/end markers (paired by activity id) and `9205` the per-minute deltas between their log indexes; `ActivitySessionBuilder` ports `exportPaired` + `reformatDataLogs` + `RunningSessionActivityFormatter` and stores `UserActivitySession` rows. They are listed under the day's totals (name, time, duration, distance, steps, calories) and open a report with the metrics, the per-minute splits and the GPS track over MapKit. Sessions on this firmware are rare (`activityHeaderLogs: 0` on the v3.01.00 watch), so the path is covered by unit tests on synthetic log blocks. |
| `calendar` | `HistoryCalendarView` (History ▸ calendar toolbar item) | Closed: month grid with ‹ › month stepping, weekday header and a green marker on every day that holds data; tapping a marked day opens the same per-day report Android opens. The day list remains as the fast path. |
| `daily_goals` | `DeviceView` goals steppers | Goals editable inline rather than a separate screen — steps, calories, sleep, power **and distance**. Android's **Power** goal row (μWh) is the thermoelectric gauge — see `current_state` below. |
| `current_state` (FROM BODY / FROM LIGHT gauge) | `DashboardView` power card | Closed: the "Power Generation" card renders FROM BODY / FROM LIGHT / total in μWh from the synced hour-period tables, plus an hourly generation chart. The live instantaneous μW needle still needs a connected watch (9104 carries no power fields; hardware-gated polish). |
| `watch_device_top` | `DeviceView` scan/connect/sync | Parity for scan/pair/sync. **Dropped by design:** Google Fit / Strava toggles (cloud integrations). Delta: no firmware-version / connection-optimization rows — firmware version needs a connected watch (TC-B02 session). |
| `watch_device_mid` | `DeviceView` device section | Device name/address shown after pairing; firmware + battery rows are hardware-gated (needs a live watch). |
| `watch_settings` | `WatchSettingsView` | "Watch + App" section (Clock 12h/24h, Units Metric/Imperial, Language) sent as the `9024` bulk-prefs command plus `9004` language, alongside the 93xx "watch only" family. Per-setting **send-on-edit** while connected (Android `WatchSettingsExecutor` semantics; "Send All" kept for reconnects). The Android **Alarm** (`930A`, `AlarmSettingFragment`) and **Timer** (`930B`, `TimerSettingFragment`) screens are deliberately not part of this app — the encoders stay in core (`WatchSettingsPayloads.alarm` / `.timer`, still unit-tested) but nothing sends them. Sleep start time stays firmware-gated (Android shows "Needs firmware upgrade"). "Send All to Watch" (9024 + 9004 + the nine 93xx settings on the screen) is acked `E200` by the real watch; the button is disabled with no link, an edit made while offline says "Saved — sends when the watch connects.", and a press during an auto-sync waits for the transfer instead of failing all eleven. |
| `notification_settings` | `DeviceView` Notifications section | Closed: the three Android switches (**Enable Connection Notifications / Enable Battery notifications / Enable Goals notifications**, on by default) persist locally and drive `UNUserNotificationCenter` local notifications with Android's exact strings — Connected/Disconnected bodies, "Battery Status" low ≤10 % / critical ≤5 % (fires when the reading drops to a worse band, Android `BatteryChangeLevel`), and "Goal achieved!" steps/calorie/sleep/power messages notified once per day per goal (Android `GoalsNotificationPersistence`). Event sources: transport connect/disconnect edges, the battery field of each sync pull (new `WatchSyncEngine.onBattery`), and the day-summary goal comparison on dashboard load. Permission is requested on the enabling toggle. Watch-forwarding stays **dropped by design** (cloud/permission-gated service, zero-network port). |
| `personal_settings` | `PersonalSettingsView` | Closed: a real personal-settings screen (My PowerWatch ▸ Settings) edits name/age/height/weight/gender after onboarding with unit-aware display, persists locally and pushes the `9012` biometrics command when connected (Android `PersonalSettingsFragment`). Account rows remain dropped by design. |
| `unpair_dialog` | `DeviceView` Unpair | Unpair confirmation with Android's two actions: **Unpair** (`9309 reset`) and **Unpair & Factory Reset** (`9309 factory-reset`), then disconnect + local device removal. iOS exposes no API to remove a Bluetooth bond — device-side forget (iOS Settings ▸ Bluetooth) is the documented equivalent. |

**Result:** all non-cloud screens have a functional counterpart. Remaining
deltas are hardware-gated (live μW needle, firmware/battery rows, sleep start
time), platform-gated (per-app notification forwarding has no iOS equivalent
to Android's notification-listener service), dropped by design (account/cloud,
Google Fit/Strava), or OTA (firmware-available + update progress screens).

Closed in this pass: activity sessions (protocol parsing through the session
report with GPS track), the calendar month grid, the combined day-chart
toggle, Android's sync-progress copy ("Syncing Data…", "Watch is busy, please
try later.", "Communication Timeout", "Your watch is not connected.") and the
pair-failed state with its retry. Verified: 128 core unit tests, 11 UI tests,
and a real-watch sync (64 background entries, `savedSessions: 0` because the
watch held no activity logs, no failures).
