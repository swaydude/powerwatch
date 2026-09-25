#!/bin/bash
# AGPS-toast patch verification: after build_fix.sh installs the patched APK,
# stream a fresh startup + sync round. MUST see the new canary
# "PW_OFFLINE: AGPS update error (cloud download blocked) - reported as skip"
# (proves new lambda-6 code is live), the BLOCKED download (round still attempts
# the cloud step and is blocked by design), save markers (round succeeds), and
# NO FATAL/VerifyError (verifier clean after the .locals + goto edits).
# ALSO completes the steps test: WALK 200+ steps with the watch ON BEFORE
# running this — non-zero deltas + today's timestamps = full end-to-end proof.
# Run after the user has worn the watch and walked:
#   ! bash /Users/swanky/powerwatch/tools/capture_sync7.sh
# Writes: sync7.log (full), sync7_summary.txt (focused).
set -uo pipefail
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
export ANDROID_SERIAL=46061FDAS009Z0
OUT="${CLAUDE_JOB_DIR:-/Users/swanky/.claude/jobs/dea0ad30}/tmp"
PKG=powerwatch.matrix.com.pwgen2android
mkdir -p "$OUT"
cd "$OUT"

adb logcat -c
adb logcat > sync7.log 2>&1 &
LPID=$!
sleep 3
adb shell am force-stop "$PKG"
sleep 1
adb shell monkey -p "$PKG" -c android.intent.category.LAUNCHER 1 >/dev/null 2>&1
echo "relaunched at $(date '+%H:%M:%S'); waiting 240s for connect + sync round..."
sleep 240
kill "$LPID" 2>/dev/null
wait "$LPID" 2>/dev/null

{
echo "### NEW AGPS skip canary (MUST appear - proves new lambda-6 is live)"
grep -a "AGPS update error (cloud download blocked)" sync7.log | head -3 || echo "  MISSING"
echo
echo "### BLOCKED canaries (cloud still blocked by design)"
echo "  $(grep -ac 'PW_OFFLINE: BLOCKED' sync7.log) lines: $(grep -a 'PW_OFFLINE: BLOCKED' sync7.log | awk '{$1=$2=$3=$4=$5=$6=""; print}' | sort | uniq -c | sort -rn | head -5 | tr '\n' '|')"
echo
echo "### round completion (data sync still succeeds)"
grep -aE "All messages sent|Starting data save|logs saved|Data successfully formatted|Total log entries|Total steps retrieved|RTL timestamps" sync7.log | head -14 || echo "  (none)"
echo
echo "### NON-ZERO step deltas (walk test: watch ON + 200 steps BEFORE run)"
grep -aE "Delta (Walk|Run) Steps: [1-9]" sync7.log | head -10 || echo "  (none — watch recorded no steps)"
echo
echo "### per-minute activity classification (LogType: 0=off-wrist 1-3=sleep 4=AWAKE_STILL 5=WALKING 6=RUNNING 7=BIKE 8=VEHICLE 9=unknown)"
grep -a "RTL Index" sync7.log | grep -oa "Activity: [0-9]*" | sort | uniq -c | sort -rn | sed 's/^/  /' || echo "  (no per-minute lines)"
echo
echo "### sync errors / FATAL (verifier check after .locals+goto edits)"
grep -aE "User data value is null|FATAL EXCEPTION|VerifyError|NullPointerException" sync7.log | head -6 || echo "  (none)"
} > sync7_summary.txt 2>&1

echo "==================== SUMMARY ===================="
cat sync7_summary.txt
echo "=================================================="
echo "LOG: $OUT/sync7.log   SUMMARY: $OUT/sync7_summary.txt"
