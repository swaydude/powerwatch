#!/bin/bash
# Dump the current logcat buffer + focused activity after a pairing attempt.
# Runs under the user's session (bypasses the down classifier). Writes pair3.log
# (full) and a rich filtered summary to pair3_summary.txt.
set -uo pipefail
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
export ANDROID_SERIAL=46061FDAS009Z0
cd /Users/swanky/.claude/jobs/dea0ad30/tmp
adb logcat -d > pair3.log 2>&1
{
echo "### focused activity (is it still on the scan screen?)"
adb shell dumpsys window 2>/dev/null | grep -iE 'mCurrentFocus|mFocusedApp' | head
echo
echo "### PW_OFFLINE canary (which blocked cloud methods fired during pairing?)"
grep -nE "PW_OFFLINE" pair3.log || echo "  (NONE - no cloud method was invoked)"
echo
echo "### FATAL / crash"
grep -nE "FATAL EXCEPTION|AndroidRuntime: FATAL" pair3.log || echo "  (none)"
echo
echo "### ACTUAL BLE / scan / GATT activity (BluetoothLeScanner, ScanResult, GATT, pairingCode)"
grep -inE "BluetoothLeScanner|ScanResult|onScanResult|startScan|stopScan|GATT|BleScan|pairingCode|ManufacturerSpecific|bleScanner" pair3.log | head -80 || echo "  (none)"
echo
echo "### app's own log lines (package pwgen2android)"
grep -nE "pwgen2android" pair3.log | head -120 || echo "  (none)"
echo
echo "### errors / exceptions / failures / permissions (WiFi/network spam filtered out)"
grep -inE "exception|error|failed|fail:|denied|refused|permission|timeout|canceled|cancelled|unauthorized" pair3.log \
  | grep -ivE "wificond|netd|dns|ConnectivityService|NetworkMonitor|dhcp|ipconfig|wpa_supplicant|EAP|WifiNative|HalDeviceManager|NetworkAgent|SmartPower|IpReachability|Tethering" \
  | head -80 || echo "  (none)"
echo
echo "### quick counts"
echo "  total logcat lines: $(wc -l < pair3.log)"
echo "  BLE/scan/GATT lines: $(grep -icE 'BluetoothLeScanner|ScanResult|startScan|GATT|bleScanner' pair3.log)"
echo "  app package lines:   $(grep -icE 'pwgen2android' pair3.log)"
} > pair3_summary.txt 2>&1
echo "==================== SUMMARY (pair3_summary.txt) ===================="
cat pair3_summary.txt
echo "======================================================================="
echo "FULL LOG: $PWD/pair3.log   SUMMARY: $PWD/pair3_summary.txt"
