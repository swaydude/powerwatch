#!/bin/bash
# Capture the current watch-connection/sync state after pairing:
# focused activity, BT adapter + bonded devices, app's own PWLogger lines,
# GATT connect/disconnect (rxandroidble2), BLE scan activity, sync events,
# PW_OFFLINE canaries, crashes. Writes sync.log (full) + sync_summary.txt.
set -uo pipefail
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
export ANDROID_SERIAL=46061FDAS009Z0
cd /Users/swanky/.claude/jobs/dea0ad30/tmp
adb logcat -d > sync.log 2>&1
{
echo "### focused activity (should be MainActivity)"
adb shell dumpsys window 2>/dev/null | grep -iE 'mCurrentFocus|mFocusedApp' | head
echo
echo "### bluetooth adapter + bonded/connected devices"
adb shell dumpsys bluetooth_manager 2>/dev/null | grep -iE "Name:|Address:|Bond state|Connected|ACL" | head -30
echo
echo "### app PWLogger lines (sync/connect flow) - last 60"
grep -aE "PWLogger" sync.log | tail -60 || echo "  (none)"
echo
echo "### GATT connect/disconnect + rxandroidble2"
grep -ainE "onConnectionStateChange|ConnectOperation|connectGatt|GATT_CLIENT|BleConnection|connection state" sync.log | tail -30 || echo "  (none)"
echo
echo "### BLE scan activity"
grep -ainE "onScanResult|ScanResult|startScan|stopScan|ScanRecord" sync.log | tail -25 || echo "  (none)"
echo
echo "### sync events (SyncStart/End, DeviceNotConnected, AGPS, user-data-null)"
grep -ainE "SyncStart|SyncEnd|DeviceNotConnected|AGPS|User data value is null|wtfError|transferData" sync.log | tail -25 || echo "  (none)"
echo
echo "### PW_OFFLINE canary - last 20"
grep -aE "PW_OFFLINE" sync.log | tail -20 || echo "  (none)"
echo
echo "### FATAL"
grep -aE "FATAL EXCEPTION" sync.log || echo "  (none)"
echo
echo "### counts"
echo "  total lines: $(wc -l < sync.log)"
echo "  PWLogger lines: $(grep -acE 'PWLogger' sync.log)"
echo "  PW_OFFLINE lines: $(grep -acE 'PW_OFFLINE' sync.log)"
} > sync_summary.txt 2>&1
echo "==================== SUMMARY (sync_summary.txt) ===================="
cat sync_summary.txt
echo "====================================================================="
echo "FULL LOG: $PWD/sync.log   SUMMARY: $PWD/sync_summary.txt"
