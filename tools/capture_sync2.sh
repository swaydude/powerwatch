#!/bin/bash
# Sync diagnosis capture — TWO phases:
#   Phase A (live):    ~100s capture of the CURRENT steady state (no restart),
#                      + dumpsys bluetooth_manager for the watch MAC.
#   Phase B (relaunch): force-stop + fresh launch + ~75s capture of the
#                      cold-start connection bootstrap (device row now exists in DB).
# Writes to $CLAUDE_JOB_DIR/tmp: sync2_live.log/.summary, sync2_relaunch.log/.summary,
# sync2_bt.txt. Extractors cover the full sdk connection chain:
# startMonitoring, accessory/Device creation, connection add/remove/subscribe,
# sendAndWait ("Sending command"/"Command complete"), readInfo ("Firmware version",
# "Unexpected error"), stream death ("Connection observable died"), sync errors.
set -uo pipefail
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
export ANDROID_SERIAL=46061FDAS009Z0
OUT="${CLAUDE_JOB_DIR:-/Users/swanky/.claude/jobs/dea0ad30}/tmp"
PKG=powerwatch.matrix.com.pwgen2android
MAC="06:05:04:BB:7A:2E"
mkdir -p "$OUT"
cd "$OUT"

extract() { # $1=log  $2=summary-file
{
echo "### focused activity"
adb shell dumpsys window 2>/dev/null | grep -iE 'mCurrentFocus|mFocusedApp' | head -5
echo
echo "### START-MONITORING / connection bootstrap"
grep -aE "Start monitoring|auto-enabled|triggering connection" "$1" | tail -10 || echo "  (none)"
echo
echo "### DEVICE/ACCESSORY creation + connection add/remove/subscribe"
grep -aE "Device created|Adding new connection|Removing connections|Subscribing to connection|Device saved|Device not initialized" "$1" | tail -20 || echo "  (none)"
echo
echo "### PROTOCOL traffic (sendAndWait / readInfo)"
grep -aE "Sending command|Command complete|Firmware version|Give up|reading info from watch|storing read info|InvalidVersion|datainfo - " "$1" | tail -30 || echo "  (none)"
echo
echo "### STREAM DEATH / sync errors"
grep -aE "observable died|Device Not Connected|Sync error|WatchBusy|wtfError" "$1" | tail -25 || echo "  (none)"
echo
echo "### GATT client events (state change / priority / writes / reads / notifications)"
grep -aE "onConnectionStateChange|requestConnectionPriority|onConnectionUpdated|writeCharacteristic|readCharacteristic|onCharacteristicChanged|onConnectionUpdated|GATT" "$1" | tail -40 || echo "  (none)"
echo
echo "### BLE scan activity"
grep -aE "onScanResult|startScan|stopScan" "$1" | tail -10 || echo "  (none)"
echo
echo "### FATAL"
grep -aE "FATAL EXCEPTION" "$1" | head -5 || echo "  (none)"
echo
echo "### counts"
echo "  total lines: $(wc -l < "$1")"
echo "  PWLogger lines: $(grep -acE 'PWLogger' "$1")"
} 2>&1
}

echo "================ PHASE A: live steady state (~100s) ================"
adb logcat -c
echo "capturing 100s of current state..."
sleep 100
adb logcat -d > sync2_live.log 2>&1
adb shell dumpsys bluetooth_manager 2>/dev/null | grep -iE -A 45 "$MAC" > sync2_bt.txt
echo "watch BT dump: $(wc -l < sync2_bt.txt) lines -> sync2_bt.txt"
extract sync2_live.log sync2_live_summary.txt > /dev/null
cat sync2_live_summary.txt

echo
echo "================ PHASE B: clean relaunch (~75s) ===================="
adb shell am force-stop "$PKG"
adb logcat -c
adb shell monkey -p "$PKG" -c android.intent.category.LAUNCHER 1 > /dev/null 2>&1
echo "launched. capturing 75s of cold-start bootstrap..."
sleep 75
adb logcat -d > sync2_relaunch.log 2>&1
extract sync2_relaunch.log sync2_relaunch_summary.txt > /dev/null
cat sync2_relaunch_summary.txt

echo "================= DONE ================"
echo "logs: $OUT/sync2_live.log  $OUT/sync2_relaunch.log"
echo "summaries: sync2_live_summary.txt  sync2_relaunch_summary.txt"
echo "bt:      sync2_bt.txt"
