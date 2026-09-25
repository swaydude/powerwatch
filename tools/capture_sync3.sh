#!/bin/bash
# Sync-verification capture for the offline sync fix (fix #1 bootstrap
# re-trigger + fix #2 userData seed). Device row already exists in Room,
# so a fresh launch should: seed userData (canary), connect + read firmware,
# create sync executors WITHOUT "User data value is null", and format data.
# Run AFTER tools/build_fix.sh has installed + launched the new APK:
#   ! bash /Users/swanky/powerwatch/tools/capture_sync3.sh
# Writes: sync3.log (full), sync3_summary.txt (focused).
set -uo pipefail
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
export ANDROID_SERIAL=46061FDAS009Z0
OUT="${CLAUDE_JOB_DIR:-/Users/swanky/.claude/jobs/dea0ad30}/tmp"
PKG=powerwatch.matrix.com.pwgen2android
MAC="06:05:04:BB:7A:2E"
mkdir -p "$OUT"
cd "$OUT"

# STREAM logcat live to a file (device main buffer is only 256 KiB, so a
# post-hoc `logcat -d` loses the early lines). Capture ~90s of post-launch
# state: splash -> dashboard -> connect -> sync.
echo "streaming logcat for 90s..."
adb logcat > sync3.log 2>&1 &
LPID=$!
sleep 90
kill "$LPID" 2>/dev/null
wait "$LPID" 2>/dev/null

{
echo "### focused activity (expect MainActivity)"
adb shell dumpsys window 2>/dev/null | grep -iE 'mCurrentFocus|mFocusedApp' | head -5
echo
echo "### PW_OFFLINE canaries (seed + bootstrap re-trigger + BLOCKED)"
grep -aE "PW_OFFLINE" sync3.log | tail -40 || echo "  (none)"
echo
echo "### bootstrap (monitoring / device / firmware)"
grep -aE "Start monitoring|Starting connection with auto-enabled|Device created|Device saved|Firmware version successfully read|reading info from watch" sync3.log | tail -15 || echo "  (none)"
echo
echo "### stream death / re-trigger"
grep -aE "observable died|re-triggering startConnection|retry limit" sync3.log | tail -10 || echo "  (none)"
echo
echo "### sync executors + user-data null"
grep -aE "Created sync executor|User data value is null|User data null|Sync error|SyncStart|SyncEnd" sync3.log | tail -25 || echo "  (none)"
echo
echo "### data formatting / persistence"
grep -aE "Sync data for formatting arrived|Data successfully formatted|Error occurred while formatting" sync3.log | tail -10 || echo "  (none)"
echo
echo "### GATT / protocol errors"
grep -aE "onConnectionStateChange|Give up|WatchBusy|resubscribe" sync3.log | tail -10 || echo "  (none)"
echo
echo "### FATAL / VerifyError / NPE"
grep -aE "FATAL EXCEPTION|VerifyError|NullPointerException" sync3.log | head -10 || echo "  (none)"
echo
echo "### counts"
echo "  total lines: $(wc -l < sync3.log)"
echo "  PW_OFFLINE: $(grep -ac 'PW_OFFLINE' sync3.log)"
echo "  sync executors created: $(grep -ac 'Created sync executor' sync3.log)"
echo "  user-data-null: $(grep -ac 'User data value is null' sync3.log)"
} > sync3_summary.txt 2>&1

echo "==================== SUMMARY ===================="
cat sync3_summary.txt
echo "=================================================="
echo "LOG: $OUT/sync3.log   SUMMARY: $OUT/sync3_summary.txt"
