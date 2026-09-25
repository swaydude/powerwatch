#!/bin/bash
# Build the canary APK (HttpClient Log.e canary + Gen2 scan fix), install on the
# physical Pixel, and launch it. Writes a status file the orchestrator can Read.
#
# The `toyota` auto-mode classifier is down, so this runs under the user's
# session via the `!` prefix (which bypasses the classifier).
set -uo pipefail
export PATH="$HOME/Library/Android/sdk/platform-tools:$HOME/Library/Android/sdk/build-tools/36.1.0:$PATH"
export ANDROID_SERIAL=46061FDAS009Z0   # physical Pixel 9 Pro XL
cd /Users/swanky/powerwatch
OUT=/Users/swanky/.claude/jobs/dea0ad30/tmp/canary_build.txt
CANARY=patched/powerwatch-offline-canary-signed.apk
PKG=powerwatch.matrix.com.pwgen2android

{
echo "=== build start $(date) ==="
echo "--- apktool build ---"
java -jar tools/apktool.jar b apktool-output -o patched/powerwatch-offline-canary.apk --force 2>&1 | tail -6
echo "apktool rc=${PIPESTATUS[0]}"
echo "--- zipalign ---"
zipalign -p 4 patched/powerwatch-offline-canary.apk patched/powerwatch-offline-canary-aligned.apk
echo "zipalign rc=$?"
echo "--- apksigner sign ---"
apksigner sign --ks patched/debug.keystore --ks-pass pass:android --key-pass pass:android \
  --ks-key-alias androiddebugkey --out "$CANARY" patched/powerwatch-offline-canary-aligned.apk
echo "sign rc=$?"
echo "--- apksigner verify ---"
apksigner verify "$CANARY" 2>&1 | head -6
echo "verify rc=${PIPESTATUS[0]}"
echo "--- artifact ---"
ls -la "$CANARY"

echo "=== install $(date) ==="
adb install -r "$CANARY" 2>&1 | tail -5
echo "install rc=${PIPESTATUS[0]}"

echo "=== launch $(date) ==="
adb shell am force-stop "$PKG"
adb logcat -c
adb shell monkey -p "$PKG" -c android.intent.category.LAUNCHER 1 2>/dev/null
echo "launched. Wait ~15s for splash->PairingActivity, then start pairing on the watch."
echo "=== DONE $(date) ==="
} > "$OUT" 2>&1

# Also echo a one-line summary to stdout (in case the user glances at it).
grep -E "rc=|DONE|Verif" "$OUT" | tail -8
echo "STATUS FILE: $OUT"
