#!/bin/zsh
# Runs the protocol + offline tests without a booted simulator.
#
# `xcodebuild test` needs a simulator runtime, which is slow to enumerate on
# some machines. The protocol, storage and sync layers are Foundation-only, so
# the same test files can run as a macOS SwiftPM package built from the exact
# same sources. Use this in CI or when `simctl` is unavailable; use
# `xcodebuild test` for the view-layer and app-bundle assertions.
#
#   ./Tools/run-logic-tests.sh
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
WORK="${TMPDIR:-/tmp}/powerwatch2-logic-tests"

# Foundation-only slice: protocol, models, store, sync, offline cloud, utils.
# Excluded on purpose: CoreBluetooth transport, SwiftUI views, app entry point.
SOURCES=(
  Sources/BLE/Gen2Framing.swift
  Sources/BLE/Gen2Commands.swift
  Sources/BLE/Gen2InfoRecords.swift
  Sources/BLE/Gen2ResponseCollector.swift
  Sources/BLE/LogTables.swift
  Sources/BLE/SyntheticWatchData.swift
  Sources/BLE/WatchTransport.swift
  Sources/BLE/SimulatedTransport.swift
  Sources/Models/DomainModels.swift
  Sources/Models/WatchSettings.swift
  Sources/Store/LocalStore.swift
  Sources/Store/KeychainStore.swift
  Sources/Sync/PeriodAggregator.swift
  Sources/Sync/RealtimeDataProvider.swift
  Sources/Sync/WatchSynchronizer.swift
  Sources/Cloud/LocalOnlyCloudAPI.swift
  Sources/Utils/Formatters.swift
  Sources/Utils/ActivityExport.swift
  Sources/Utils/ApkStrings.swift
  Sources/Utils/PairCode.swift
)

rm -rf "$WORK"
mkdir -p "$WORK/Sources/PowerWatch2" "$WORK/Tests/PowerWatch2Tests"

for file in "${SOURCES[@]}"; do
  [[ -f "$ROOT/$file" ]] || { echo "missing source: $file" >&2; exit 1; }
  cp "$ROOT/$file" "$WORK/Sources/PowerWatch2/$(basename "$file")"
done
cp "$ROOT"/Tests/Gen2ProtocolTests.swift "$ROOT"/Tests/OfflineFunctionalityTests.swift \
   "$WORK/Tests/PowerWatch2Tests/"

cat > "$WORK/Package.swift" <<'EOF'
// swift-tools-version:5.9
import PackageDescription

// Mirrors the app module name so the shared test files import unchanged.
let package = Package(
    name: "PowerWatch2",
    platforms: [.macOS(.v13)],
    targets: [
        .target(name: "PowerWatch2"),
        .testTarget(name: "PowerWatch2Tests", dependencies: ["PowerWatch2"])
    ]
)
EOF

echo "Headless logic tests -> $WORK"
swift test --package-path "$WORK" "$@"
