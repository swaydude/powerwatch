#!/bin/bash
# Tail capture: NO relaunch - the app keeps running and the sync round
# continues in the background. Streams 300s and reports the RTL day-index
# progression plus round-completion markers (formatting/persistence).
# Run while the app is open on the dashboard:
#   ! bash /Users/swanky/powerwatch/tools/capture_sync5.sh
# Writes: sync5.log (full), sync5_summary.txt (focused).
set -uo pipefail
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
export ANDROID_SERIAL=46061FDAS009Z0
OUT="${CLAUDE_JOB_DIR:-/Users/swanky/.claude/jobs/dea0ad30}/tmp"
mkdir -p "$OUT"
cd "$OUT"

echo "streaming logcat for 300s (no relaunch)..."
adb logcat > sync5.log 2>&1 &
LPID=$!
sleep 300
kill "$LPID" 2>/dev/null
wait "$LPID" 2>/dev/null

{
echo "### RTL day-index progression (one line per distinct (time,index))"
grep -a "RTL Index" sync5.log | awk '{print $2, "index="$9}' | awk '{if ($2 != prev) {print; prev=$2}}' | head -40
echo "  total RTL lines: $(grep -ac 'RTL Index' sync5.log)"
echo
echo "### round completion / persistence markers"
grep -aE "Sync data for formatting arrived|Data successfully formatted|Error occurred while formatting|SyncStart|SyncEnd|sync.*completed|Sync.*completed" sync5.log | tail -15 || echo "  (none)"
echo
echo "### sync errors / user-data null"
grep -aE "User data value is null|Sync error|Device Not Connected" sync5.log | tail -8 || echo "  (none)"
echo
echo "### PW_OFFLINE canaries (count)"
echo "  $(grep -ac 'PW_OFFLINE' sync5.log) lines: $(grep -a 'PW_OFFLINE' sync5.log | awk '{$1=$2=$3=$4=$5=$6=""; print}' | sort | uniq -c | sort -rn | head -5 | tr '\n' '|')"
echo
echo "### FATAL / VerifyError / NPE"
grep -aE "FATAL EXCEPTION|VerifyError|NullPointerException" sync5.log | head -5 || echo "  (none)"
} > sync5_summary.txt 2>&1

echo "==================== SUMMARY ===================="
cat sync5_summary.txt
echo "=================================================="
echo "LOG: $OUT/sync5.log   SUMMARY: $OUT/sync5_summary.txt"
