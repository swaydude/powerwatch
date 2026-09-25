#!/bin/bash
# Full offline pipeline: rebuild (apktool) -> zipalign -> apksigner -> verify -> install on emulator.
set -uo pipefail
cd /Users/swanky/powerwatch
export PATH="$HOME/Library/Android/sdk/platform-tools:$HOME/Library/Android/sdk/build-tools/36.1.0:$PATH"
PKG=powerwatch.matrix.com.pwgen2android

echo "### apktool build"
java -jar tools/apktool.jar b apktool-output -o patched/powerwatch-offline.apk 2>&1 | tail -6
echo "build exit=${PIPESTATUS[0]}"

echo "### zipalign"
zipalign -p 4 patched/powerwatch-offline.apk patched/powerwatch-offline-aligned.apk
zipalign -c -p 4 patched/powerwatch-offline-aligned.apk && echo "ALIGNED OK"

echo "### sign (v1+v2)"
apksigner sign \
  --ks patched/debug.keystore --ks-pass pass:android \
  --ks-key-alias androiddebugkey --key-pass pass:android \
  --out patched/powerwatch-offline-signed.apk patched/powerwatch-offline-aligned.apk
echo "sign exit=$?"

echo "### verify"
apksigner verify --print-certs patched/powerwatch-offline-signed.apk 2>&1 | head

echo "### adb devices"
adb devices

echo "### uninstall old (ignore failure)"
adb uninstall "$PKG" 2>/dev/null || true

echo "### install"
adb install -r patched/powerwatch-offline-signed.apk
echo "install exit=$?"

echo "ALL DONE"
