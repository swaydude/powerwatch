#!/bin/bash
# Master test runner for the PowerWatch iOS port.
#
# Usage:
#   bash tools/test_ios.sh          # unit tests (PowerWatchCore, swift test)
#   bash tools/test_ios.sh unit     # same as above
#   bash tools/test_ios.sh ui       # app UI tests on simulator (needs app target, task T0.7)
#   bash tools/test_ios.sh device   # device integration tests (needs real watch, phase 3+)
#   bash tools/test_ios.sh all      # unit + ui + device + release build
#
# Exits non-zero on the first failing stage. Every stage prints a PASS/FAIL
# summary line so the result is greppable from CI or cron.
set -uo pipefail

ROOT="/Users/swanky/powerwatch"
IOS="$ROOT/ios"
STAGE="${1:-unit}"

RED=$'\033[31m'; GREEN=$'\033[32m'; YELLOW=$'\033[33m'
RESET=$'\033[0m'

say()  { printf '%s\n' "$*"; }
fail() { printf '%s[FAIL]%s %s\n' "$RED" "$RESET" "$1"; exit 1; }
pass() { printf '%s[PASS]%s %s\n' "$GREEN" "$RESET" "$1"; }
warn() { printf '%s[WARN]%s %s\n' "$YELLOW" "$RESET" "$1"; }

# ---------------------------------------------------------------- preflight
preflight() {
    say "=== Preflight ==="

    # Xcode license (xcodebuild -version exits 0 even without it; xcrun does not)
    if ! xcrun --show-sdk-path >/dev/null 2>&1; then
        fail "Xcode license not accepted. Run: sudo xcodebuild -license"
    fi

    if ! command -v swift >/dev/null 2>&1; then
        fail "swift toolchain not found in PATH"
    fi

    if [ ! -f "$IOS/Package.swift" ]; then
        fail "missing $IOS/Package.swift — is the iOS scaffold created?"
    fi
    pass "preflight (toolchain OK)"
}

# ---------------------------------------------------------------- unit tests
run_unit() {
    say "=== Unit tests: PowerWatchCore (swift test) ==="
    cd "$IOS" || fail "cannot cd to $IOS"
    if swift test 2>&1 | tee /tmp/pw_ios_unit.log | tail -25; then
        local passed failed
        passed=$(grep -cE 'Test [Cc]ase .* passed' /tmp/pw_ios_unit.log || true)
        failed=$(grep -cE 'Test [Cc]ase .* failed' /tmp/pw_ios_unit.log || true)
        pass "unit tests ($passed passed, $failed failed)"
    else
        fail "unit tests — see /tmp/pw_ios_unit.log"
    fi
}

# ---------------------------------------------------------------- UI tests
run_ui() {
    say "=== UI tests (xcodebuild test, simulator) ==="
    local PROJ="$IOS/PowerWatch.xcodeproj"
    if [ ! -d "$PROJ" ]; then
        warn "app project not created yet (task T0.7) — skipping UI stage"
        return 0
    fi
    # xcodebuild's name-based matching is unreliable across installed runtimes;
    # resolve a concrete simulator UDID instead.
    local SIM_UDID
    SIM_UDID=$(xcrun simctl list devices available | grep "iPhone 16 (" | head -1 | sed -E 's/.*\(([0-9A-F-]{36})\).*/\1/')
    if [ -z "$SIM_UDID" ]; then
        warn "no available iPhone 16 simulator — skipping UI stage"
        return 0
    fi
    say "simulator: $SIM_UDID"
    if ! xcodebuild test -project "$PROJ" -scheme PowerWatch \
        -destination "platform=iOS Simulator,id=$SIM_UDID" \
        2>&1 | tee /tmp/pw_ios_ui.log | tail -25; then
        fail "UI tests — see /tmp/pw_ios_ui.log"
    fi
    pass "UI tests"
}

# ---------------------------------------------------------------- device tests
run_device() {
    say "=== Device integration tests (real iPhone + watch) ==="
    local PROJ="$IOS/PowerWatch.xcodeproj"
    if [ ! -d "$PROJ" ]; then
        warn "app project not created yet (task T0.7) — skipping device stage"
        return 0
    fi
    local DEVICE_ID="03C2400C-84A8-591B-B84A-CE6D1DBCC9AB"   # connected iPhone (iPhone17,5)
    if ! xcrun devicectl list devices 2>/dev/null | grep -q "$DEVICE_ID"; then
        warn "iPhone $DEVICE_ID not attached — skipping device stage"
        return 0
    fi
    # Build + install + launch, then run the on-device test plan (phase 3+).
    if ! bash "$ROOT/tools/build_ios.sh" Debug 2>&1 | tee /tmp/pw_ios_device.log | tail -15; then
        fail "device build/install — see /tmp/pw_ios_device.log"
    fi
    pass "device smoke (build + install + launch)"
}

# ---------------------------------------------------------------- release build
run_release() {
    say "=== Release build ==="
    local PROJ="$IOS/PowerWatch.xcodeproj"
    if [ ! -d "$PROJ" ]; then
        warn "app project not created yet (task T0.7) — skipping release build"
        return 0
    fi
    if xcodebuild -project "$PROJ" -scheme PowerWatch -configuration Release \
        -destination 'generic/platform=iOS' build \
        2>&1 | tee /tmp/pw_ios_release.log | tail -10; then
        pass "release build"
    else
        fail "release build — see /tmp/pw_ios_release.log"
    fi
}

# ---------------------------------------------------------------- zero-network audit (T6.5 / TC-R02)
run_network_audit() {
    say "=== Zero-network audit (TC-R02) ==="
    local hits=0
    hits=$(grep -rE "URLSession|NWConnection|CFSocket|URLRequest|CFNetwork" \
        "$IOS/PowerWatch" "$IOS/Sources" 2>/dev/null | wc -l | tr -d ' ')
    if [ "$hits" -eq 0 ]; then
        pass "zero-network audit (no URLSession/sockets/CFNetwork in app or core)"
    else
        fail "zero-network audit — $hits networking references found"
        grep -rE "URLSession|NWConnection|CFSocket|URLRequest|CFNetwork" \
            "$IOS/PowerWatch" "$IOS/Sources" | head -5
    fi
}

case "$STAGE" in
    unit)   preflight; run_unit ;;
    ui)     preflight; run_ui ;;
    device) preflight; run_device ;;
    all)    preflight; run_unit; run_ui; run_device; run_release; run_network_audit
            pass "ALL STAGES" ;;
    *) say "usage: $0 [unit|ui|device|all]"; exit 2 ;;
esac
