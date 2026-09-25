#!/bin/bash
# Build the FIX APK (canary + Gen2 scan fix + PairingBaseViewModel.userData fix),
# install on the physical Pixel, and launch it.
#
# The `toyota` auto-mode classifier is down, so this runs under the user's
# session via the `!` prefix (which bypasses the classifier).
set -uo pipefail
export PATH="$HOME/Library/Android/sdk/platform-tools:$HOME/Library/Android/sdk/build-tools/36.1.0:$PATH"
export ANDROID_SERIAL=46061FDAS009Z0   # physical Pixel 9 Pro XL
cd /Users/swanky/powerwatch
OUT=/Users/swanky/.claude/jobs/dea0ad30/tmp/fix_build.txt
FIX=patched/powerwatch-offline-fix-signed.apk
PKG=powerwatch.matrix.com.pwgen2android

{
echo "=== fix build start $(date) ==="
echo "--- apktool build ---"
java -jar tools/apktool.jar b apktool-output -o patched/powerwatch-offline-fix.apk --force 2>&1 | tail -6
apktool_rc=${PIPESTATUS[0]}
echo "apktool rc=$apktool_rc"
if [ "$apktool_rc" -ne 0 ]; then
  echo "FATAL: apktool build failed - ABORTING before zipalign/sign/install (refusing to ship a stale APK)"
  exit 1
fi
echo "--- zipalign ---"
# -f: overwrite any stale aligned APK left by a previous run (zipalign rc=1
# otherwise, and apksigner would then sign the OLD apk - silent stale build!)
zipalign -f -p 4 patched/powerwatch-offline-fix.apk patched/powerwatch-offline-fix-aligned.apk
za_rc=$?
echo "zipalign rc=$za_rc"
[ "$za_rc" -ne 0 ] && { echo "FATAL: zipalign failed - ABORTING"; exit 1; }
echo "--- apksigner sign ---"
apksigner sign --ks patched/debug.keystore --ks-pass pass:android --key-pass pass:android \
  --ks-key-alias androiddebugkey --out "$FIX" patched/powerwatch-offline-fix-aligned.apk
sign_rc=$?
echo "sign rc=$sign_rc"
[ "$sign_rc" -ne 0 ] && { echo "FATAL: sign failed - ABORTING"; exit 1; }
echo "--- apksigner verify ---"
apksigner verify "$FIX" 2>&1 | head -6
verify_rc=${PIPESTATUS[0]}
echo "verify rc=$verify_rc"
[ "$verify_rc" -ne 0 ] && { echo "FATAL: verify failed - ABORTING"; exit 1; }
echo "--- artifact ---"
ls -la "$FIX"

echo "=== install $(date) ==="
adb install -r "$FIX" 2>&1 | tail -5
install_rc=${PIPESTATUS[0]}
echo "install rc=$install_rc"
[ "$install_rc" -ne 0 ] && { echo "FATAL: install failed - ABORTING (not launching a stale build)"; exit 1; }

echo "=== launch $(date) ==="
adb shell am force-stop "$PKG"
adb logcat -c
adb shell monkey -p "$PKG" -c android.intent.category.LAUNCHER 1 2>/dev/null
echo "launched. Wait ~15s for splash->PairingActivity, then start pairing on the watch."
echo "=== DONE $(date) ==="
} > "$OUT" 2>&1

# Also echo a one-line summary to stdout (in case the user glances at it).
grep -E "rc=|DONE|Verif|FAILED|Error|error:" "$OUT" | tail -10
echo "STATUS FILE: $OUT"
