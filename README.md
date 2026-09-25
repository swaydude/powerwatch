# PowerWatch 2 — offline companion app

A from-scratch **iOS port of the official Matrix PowerWatch 2 Android companion
app (v1.5.6)**, plus the reverse-engineering material that port was derived
from. The whole point of the project is that it works with **no network at all**:
the phone talks to the watch over Bluetooth LE and stores everything locally.
Nothing is uploaded to a cloud account, and no network entitlement is used by
the app target.

The watch itself is a **PowerWatch 2 (Gen 2, "MATRIX")**, firmware `v3.01.00`.
Everything the iOS app does is a port of behaviour observed in the decompiled
Android app, cross-checked against wire traces captured from the real watch.

## Where the two apps live

| App | Location | What it is |
| --- | --- | --- |
| **iOS app** (the product) | [`ios/`](ios/) | Native SwiftUI app + `PowerWatchCore` Swift package. Bundle id `com.swanky.powerwatch`. |
| **Android app** (reference) | [`powerwatch.matrix.com.pwgen2android_1.5.6.apk`](powerwatch.matrix.com.pwgen2android_1.5.6.apk) | The original vendor APK, decompiled and (for on-device comparison) re-signed with the cloud calls patched out. |

The Android app is **not** a source project — there is no Gradle build here. It
exists as the reference implementation and as a patched APK used to compare
pairing/sync behaviour on a real Android phone.

## Folder structure

```
powerwatch/
├── ios/                        # ← the iOS app
│   ├── Package.swift           # PowerWatchCore: pure logic, no UI, no CoreBluetooth
│   ├── Sources/PowerWatchCore/ # protocol, persistence, sync engine, transport
│   ├── PowerWatch/             # SwiftUI app target (views, view models)
│   ├── PowerWatchUITests/      # XCUITest suite (dashboard, pairing, settings…)
│   ├── Tests/PowerWatchCoreTests/ # 144 unit/protocol/sync tests + watch fixtures
│   ├── project.yml             # XcodeGen spec → PowerWatch.xcodeproj
│   ├── docs/                   # PROJECT_PLAN.md, TASKS.md, TEST_CASES.md, UI_PARITY.md
│   └── build/                  # build products (generated, safe to delete)
├── powerwatch.matrix.com.pwgen2android_1.5.6.apk   # original vendor APK
├── jadx-output/                # APK decompiled to Java — the reference source
├── apktool-output/             # APK decoded (smali + resources), rebuildable
├── patched/                    # offline-patched APK + debug.keystore
├── verify_shots/               # screenshots from Android ↔ iOS parity checks
└── tools/                      # build / install / trace-capture scripts
```

## Important files

### iOS — protocol and sync (the hard part)

| File | Why it matters |
| --- | --- |
| [`ios/Sources/PowerWatchCore/BLEServices.swift`](ios/Sources/PowerWatchCore/BLEServices.swift) | GATT constants: DTP service `0x2760` (chars `…0011`/`…0012`/`…0013`) and the Device Information service `0x180a` / `0x2a25` used for live totals. |
| [`…/Protocol/DTPFrame.swift`](ios/Sources/PowerWatchCore/Protocol/DTPFrame.swift) | Frame encode/decode, CRC32, flow-control ACKs, `DTPSetting` raw writes. |
| [`…/Protocol/DTPStreamFramer.swift`](ios/Sources/PowerWatchCore/Protocol/DTPStreamFramer.swift) | Re-assembles MTU-split notifications back into whole frames. |
| [`…/Protocol/LogParsers.swift`](ios/Sources/PowerWatchCore/Protocol/LogParsers.swift) | Every payload parser: background records (exact bit layout), RTL times, activity/sleep logs, `parseLiveTotals` for the watch's day totals. |
| [`…/Gen2CommandID.swift`](ios/Sources/PowerWatchCore/Gen2CommandID.swift) | All ~55 Gen 2 command IDs (`9000`…`930a`). |
| [`…/Sync/WatchSyncEngine.swift`](ios/Sources/PowerWatchCore/Sync/WatchSyncEngine.swift) | The sync state machine: `9000 → 9126 → 9124 → 9024 → 9107 → 9117 → 9215 → 9205 → 9106 → persist → 9023 → 9226 → 9001`, per-command watchdog, auto-reconnect. |
| [`…/Transport/CoreBluetoothTransport.swift`](ios/Sources/PowerWatchCore/Transport/CoreBluetoothTransport.swift) | Central manager, discovery, writes, ACK routing, `readLiveData()`, state restoration. |
| [`…/Persistence/PowerWatchDatabase.swift`](ios/Sources/PowerWatchCore/Persistence/PowerWatchDatabase.swift) | Local SQLite store (log tables + hour/day/week/month period tables). |

### iOS — app layer

| File | Why it matters |
| --- | --- |
| [`ios/PowerWatch/PowerWatchApp.swift`](ios/PowerWatch/PowerWatchApp.swift) | App entry, wires `SyncController` → `AppModel`, foreground/midnight refresh. |
| [`ios/PowerWatch/SyncController.swift`](ios/PowerWatch/SyncController.swift) | BLE + sync surface: pairing, auto-sync, `refreshSync()` (pull-to-refresh), live totals. |
| [`ios/PowerWatch/AppModel.swift`](ios/PowerWatch/AppModel.swift) | User profile, goals, dashboard aggregates, settings. |
| [`ios/PowerWatch/DashboardView.swift`](ios/PowerWatch/DashboardView.swift) | Dashboard: goal rings, hour charts, live card. |
| [`ios/PowerWatch/DeviceView.swift`](ios/PowerWatch/DeviceView.swift), [`WatchSettingsView.swift`](ios/PowerWatch/WatchSettingsView.swift) | Pairing flow, device info, `93xx` settings writes. |

### Android reference (read-only)

| Path | Why it matters |
| --- | --- |
| `jadx-output/sources/powerwatch/matrix/com/pwgen2android/sdk/protocol/` | Command/frame definitions the port is based on. |
| `…/sdk/protocol/commands/Gen2BackgroundLogCommand.java` | Authoritative bit layout of a background log record. |
| `…/sdk/protocol/executors/SyncXExecutor.java`, `Gen2RealtimeDataExecutor.java` | Sync order, sync-animation commands, live-totals polling. |
| `…/sdk/RealtimeDataParser.java`, `…/sdk/HSMTable.java` | Tag/value format of the `0x2a25` live totals. |
| `tools/patch_httpclient_offline.py` | How the APK was stripped of its cloud traffic. |

### Docs

[`ios/docs/PROJECT_PLAN.md`](ios/docs/PROJECT_PLAN.md) is the authoritative
record of wire-protocol facts proven on real hardware (start here). Also
[`TASKS.md`](ios/docs/TASKS.md), [`TEST_CASES.md`](ios/docs/TEST_CASES.md),
[`UI_PARITY.md`](ios/docs/UI_PARITY.md).

## Installing the iOS app on an iPhone

Prerequisites: Xcode with an accepted license (`sudo xcodebuild -license`),
[XcodeGen](https://github.com/yonaskolb/XcodeGen) (`brew install xcodegen`),
the iPhone unlocked with a developer profile installed.

```bash
cd /Users/swanky/powerwatch

# 1. (re)generate the Xcode project — only needed after adding/renaming files
cd ios && xcodegen generate && cd ..

# 2. build, install and launch on the connected iPhone (auto-detects the device)
bash tools/build_ios.sh                      # Debug
bash tools/build_ios.sh Debug <DEVICE_UDID>  # explicit device
```

The device UDID can be found with `xcrun devicectl list devices`. The script
signs with team `5ZMY3Q3K9L`, installs
`ios/build/Build/Products/Debug-iphoneos/PowerWatch.app`, and launches it as
`com.swanky.powerwatch`.

Useful follow-ups:

```bash
# Unit / protocol tests (fast, no device needed)
cd ios && swift test

# Force a fresh sync — relaunch alone does NOT re-sync, the process must die
xcrun devicectl device info processes --device <UDID> | grep -i powerwatch
xcrun devicectl device process terminate --device <UDID> --pid <PID> --kill
xcrun devicectl device process launch --device <UDID> com.swanky.powerwatch

# Pull the wire trace and the local database off the phone
xcrun devicectl device copy from --device <UDID> \
  --domain-type appDataContainer --domain-identifier com.swanky.powerwatch \
  --source Documents/pw_trace.log --destination /tmp/pw_trace.log
```

Gotchas: install/launch fails with `FBSOpenApplicationErrorDomain error 7` if
the phone is locked; the app truncates `pw_trace.log` at launch, so copy it
before restarting the app.

## Installing the (offline-patched) Android app on an Android phone

Requires the Android SDK (`platform-tools`, `build-tools`) and a phone with USB
debugging enabled.

```bash
cd /Users/swanky/powerwatch
bash tools/rebuild_install.sh            # default serial 46061FDAS009Z0 (Pixel 9)
bash tools/rebuild_install.sh <SERIAL>   # another device
```

That rebuilds `apktool-output` into `patched/powerwatch-offline.apk`, zipaligns
and signs it with `patched/debug.keystore`, then `adb install`s it as
`powerwatch.matrix.com.pwgen2android`. `tools/sign_install.sh` does just the
sign-and-install step for an APK that is already built.
