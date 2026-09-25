#!/bin/bash
# Today-data test: after the user wears + walks, relaunch the app to trigger
# a FRESH sync round (fast now — only new entries transfer). Records the new
# backlog size, ALL RTL lines untruncated (fresh backlog is small), any
# non-zero step deltas, save markers, and the full "RTL timestamps" line
# (epoch range of the new entries — today 2026-08-23 = 1787443200..1787529599).
# Run AFTER the user has worn the watch and walked 200+ steps:
#   ! bash /Users/swanky/powerwatch/tools/capture_sync6.sh
# Writes: sync6.log (full), sync6_summary.txt (focused).
set -uo pipefail
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
export ANDROID_SERIAL=46061FDAS009Z0
OUT="${CLAUDE_JOB_DIR:-/Users/swanky/.claude/jobs/dea0ad30}/tmp"
PKG=powerwatch.matrix.com.pwgen2android
mkdir -p "$OUT"
cd "$OUT"

adb logcat -c
adb logcat > sync6.log 2>&1 &
LPID=$!
sleep 3
adb shell am force-stop "$PKG"
sleep 1
adb shell monkey -p "$PKG" -c android.intent.category.LAUNCHER 1 >/dev/null 2>&1
echo "relaunched at $(date '+%H:%M:%S'); waiting 240s for connect + fresh sync round..."
sleep 240
kill "$LPID" 2>/dev/null
wait "$LPID" 2>/dev/null

{
echo "### fresh backlog size (Realtime logs: N — small means round is fast)"
grep -aE "Realtime logs:" sync6.log | head -4 || echo "  (none)"
echo
echo "### ALL RTL lines, untruncated (fresh entries only)"
grep -a "RTL Index" sync6.log || echo "  (none — round did not read any RTL entries)"
echo
echo "### NON-ZERO step deltas (THE key check: watch is recording NOW)"
grep -aE "Delta (Walk|Run) Steps: [1-9]" sync6.log | head -20 || echo "  (none — watch recorded no steps in the new entries)"
echo
echo "### totals + save markers"
grep -aE "Total log entries|Total steps retrieved|Sleep log entries|logs saved|Data successfully formatted|Error occurred while formatting" sync6.log | head -12 || echo "  (none)"
echo
echo "### full RTL timestamps line (epoch range of new entries)"
grep -a "RTL timestamps" sync6.log | head -2 || echo "  (none)"
echo
echo "### sync errors / FATAL"
grep -aE "User data value is null|Sync error|FATAL EXCEPTION|VerifyError|NullPointerException" sync6.log | head -6 || echo "  (none)"
echo
echo "### PW_OFFLINE canaries (count)"
echo "  $(grep -ac 'PW_OFFLINE' sync6.log) lines: $(grep -a 'PW_OFFLINE' sync6.log | awk '{$1=$2=$3=$4=$5=$6=""; print}' | sort | uniq -c | sort -rn | head -5 | tr '\n' '|')"
} > sync6_summary.txt 2>&1

echo "==================== SUMMARY ===================="
cat sync6_summary.txt
echo "=================================================="
echo "LOG: $OUT/sync6.log   SUMMARY: $OUT/sync6_summary.txt"
