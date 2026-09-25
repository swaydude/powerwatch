#!/bin/bash
# Rebuild the offline-patched PowerWatch APK and install it on the Pixel 9.
# Usage: bash tools/rebuild_install.sh [SERIAL]
#   SERIAL defaults to the Pixel 9 (46061FDAS009Z0) where the real watch pairs.
set -uo pipefail
cd /Users/swanky/powerwatch
BT="$HOME/Library/Android/sdk/build-tools/36.1.0"
ADB="$HOME/Library/Android/sdk/platform-tools/adb"
SERIAL="${1:-46061FDAS009Z0}"
PKG=powerwatch.matrix.com.pwgen2android

echo "== [1/5] apktool build =="
java -jar tools/apktool.jar b apktool-output -o patched/powerwatch-offline.apk --force 2>&1 | tail -4 || { echo "BUILD_FAIL"; exit 1; }
[ -f patched/powerwatch-offline.apk ] || { echo "BUILD_FAIL: no output apk"; exit 1; }

echo "== [2/5] zipalign =="
"$BT/zipalign" -p -f 4 patched/powerwatch-offline.apk patched/powerwatch-offline-aligned.apk || { echo "ALIGN_FAIL"; exit 1; }

echo "== [3/5] apksigner sign =="
"$BT/apksigner" sign --ks patched/debug.keystore --ks-pass pass:android \
  --ks-key-alias androiddebugkey \
  --out patched/powerwatch-offline-signed.apk patched/powerwatch-offline-aligned.apk || { echo "SIGN_FAIL"; exit 1; }

echo "== [4/5] apksigner verify =="
"$BT/apksigner" verify --print-certs patched/powerwatch-offline-signed.apk 2>&1 | head -3

echo "== [5/5] install on $SERIAL =="
"$ADB" -s "$SERIAL" install -r -t patched/powerwatch-offline-signed.apk 2>&1 | tail -3 \
  || { echo "reinstall failed -> uninstall then install"; \
       "$ADB" -s "$SERIAL" uninstall "$PKG" >/dev/null 2>&1; \
       "$ADB" -s "$SERIAL" install -t patched/powerwatch-offline-signed.apk 2>&1 | tail -3; }

echo "== DONE =="
ls -la patched/powerwatch-offline-signed.apk
