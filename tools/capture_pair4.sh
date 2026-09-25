#!/bin/bash
# Dump the current logcat buffer + focused activity after the userData-fix pairing attempt.
# Runs under the user's session (bypasses the down classifier). Writes pair4.log
# (full) and a rich filtered summary to pair4_summary.txt.
set -uo pipefail
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
export ANDROID_SERIAL=46061FDAS009Z0
cd /Users/swanky/.claude/jobs/dea0ad30/tmp
adb logcat -d > pair4.log 2>&1
{
echo "### focused activity (is it still on the scan screen?)"
adb shell dumpsys window 2>/dev/null | grep -iE 'mCurrentFocus|mFocusedApp' | head
echo
echo "### PW_OFFLINE canary (blocked cloud calls + 'userData: built offline default' = fix is live)"
grep -nE "PW_OFFLINE" pair4.log || echo "  (NONE)"
echo
echo "### FATAL / crash"
grep -nE "FATAL EXCEPTION|AndroidRuntime: FATAL" pair4.log || echo "  (none)"
echo
echo "### NPE / withLatestFrom / ConnectionFailed (did the old crash come back?)"
grep -nE "NullPointerException|withLatestFrom|ConnectionFailedError|ConnectionTimedOutError|PairingFailedError|TimeoutException" pair4.log | head -40 || echo "  (none)"
echo
echo "### pairing progress (PairEnd / PairingCode / transferData / onPairingSuccess / Device saved / GATT)"
grep -inE "PairEnd|PairingCode|transferData|onPairingSuccess|Device saved|GATT|BluetoothLeScanner|onScanResult|pairing" pair4.log | head -100 || echo "  (none)"
echo
echo "### app's own log lines (package pwgen2android)"
grep -nE "pwgen2android" pair4.log | head -150 || echo "  (none)"
echo
echo "### errors / exceptions / failures (WiFi/network spam filtered out)"
grep -inE "exception|error|failed|fail:|denied|refused|permission|timeout|canceled|cancelled|unauthorized" pair4.log \
  | grep -ivE "wificond|netd|dns|ConnectivityService|NetworkMonitor|dhcp|ipconfig|wpa_supplicant|EAP|WifiNative|HalDeviceManager|NetworkAgent|SmartPower|IpReachability|Tethering" \
  | head -80 || echo "  (none)"
echo
echo "### quick counts"
echo "  total logcat lines: $(wc -l < pair4.log)"
echo "  BLE/scan/GATT lines: $(grep -icE 'BluetoothLeScanner|ScanResult|startScan|GATT|bleScanner' pair4.log)"
echo "  app package lines:   $(grep -icE 'pwgen2android' pair4.log)"
} > pair4_summary.txt 2>&1
echo "==================== SUMMARY (pair4_summary.txt) ===================="
cat pair4_summary.txt
echo "======================================================================="
echo "FULL LOG: $PWD/pair4.log   SUMMARY: $PWD/pair4_summary.txt"
