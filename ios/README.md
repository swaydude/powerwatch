# PowerWatch iOS Port

Offline-first native iOS port of the Matrix PowerWatch 2 Android companion app
(v1.5.6). Built from scratch; zero cloud dependencies by construction.

## Layout

```
ios/
├── Package.swift              # PowerWatchCore — pure-logic SPM package
├── Sources/PowerWatchCore/
│   ├── BLEServices.swift      # GATT service/characteristic UUIDs (wire constants)
│   ├── Gen2CommandID.swift    # all 55 Gen 2 watch command IDs
│   └── Models.swift           # ported data models (User, Device, GoalConfiguration, …)
├── Tests/PowerWatchCoreTests/ # unit + golden-fixture protocol tests
│   └── Fixtures/              # BLE frames captured from the real watch (task T1.3)
└── docs/
    ├── PROJECT_PLAN.md       # architecture mapping, phases, risks
    ├── TASKS.md               # phased task breakdown (P0–P6)
    └── TEST_CASES.md         # full test-case catalog (TC-U/P/D/B/S/X/R)
```

The SwiftUI app target (XcodeGen `project.yml`) is task **T0.7** in
`docs/TASKS.md` — not created yet.

## Running tests

```bash
bash tools/test_ios.sh        # unit tests (swift test)
bash tools/test_ios.sh all    # unit + UI + device + release (later phases)
```

Requires an accepted Xcode license (`sudo xcodebuild -license`).
