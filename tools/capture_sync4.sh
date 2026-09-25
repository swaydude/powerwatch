#!/bin/bash
# Seed-proof capture: streaming starts BEFORE the relaunch, so the fresh
# startup (Koin graph -> WatchSynchronizerImpl ctor -> seed canary) is fully
# inside the stream. Then wait ~2 min for connect + sync-executor creation.
# Run after tools/build_fix.sh (APK already installed):
#   ! bash /Users/swanky/powerwatch/tools/capture_sync4.sh
# Writes: sync4.log (full), sync4_summary.txt (focused).
set -uo pipefail
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
export ANDROID_SERIAL=46061FDAS009Z0
OUT="${CLAUDE_JOB_DIR:-/Users/swanky/.claude/jobs/dea0ad30}/tmp"
PKG=powerwatch.matrix.com.pwgen2android
mkdir -p "$OUT"
cd "$OUT"

adb logcat -c
adb logcat > sync4.log 2>&1 &
LPID=$!
sleep 3
adb shell am force-stop "$PKG"
sleep 1
adb shell monkey -p "$PKG" -c android.intent.category.LAUNCHER 1 >/dev/null 2>&1
echo "relaunched at $(date '+%H:%M:%S'); waiting 120s for connect + sync..."
sleep 120
kill "$LPID" 2>/dev/null
wait "$LPID" 2>/dev/null

{
echo "### focused activity (expect MainActivity)"
adb shell dumpsys window 2>/dev/null | grep -iE 'mCurrentFocus' | head -2
echo
echo "### seed canary (MUST appear - proves new ctor code is live)"
grep -a "seeded default offline PairingConfig" sync4.log | head -3 || echo "  MISSING"
echo
echo "### all PW_OFFLINE canaries"
grep -aE "PW_OFFLINE" sync4.log | head -20 || echo "  (none)"
echo
echo "### bootstrap + executor"
grep -aE "Start monitoring|Device created|Firmware version successfully read|Created sync executor" sync4.log | tail -8 || echo "  (none)"
echo
echo "### user-data null / sync errors"
grep -aE "User data value is null|User data null|Sync error" sync4.log | tail -8 || echo "  (none)"
echo
echo "### data formatting / persistence"
grep -aE "Sync data for formatting arrived|Data successfully formatted|Error occurred while formatting" sync4.log | tail -8 || echo "  (none)"
echo
echo "### FATAL / VerifyError / NPE"
grep -aE "FATAL EXCEPTION|VerifyError|NullPointerException" sync4.log | head -8 || echo "  (none)"
} > sync4_summary.txt 2>&1

echo "==================== SUMMARY ===================="
cat sync4_summary.txt
echo "=================================================="
echo "LOG: $OUT/sync4.log   SUMMARY: $OUT/sync4_summary.txt"
