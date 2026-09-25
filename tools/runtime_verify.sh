#!/bin/bash
# One-shot runtime offline verification.
#
# Installs the verified offline APK, cuts the emulator's network, launches the
# app, and proves it reaches a functional screen with ZERO Matrix PowerWatch
# cloud API calls.
#
# ANDROID_SERIAL pins every `adb` call to the emulator so the script ignores
# the physical Pixel that is also connected.
set -uo pipefail
export PATH="$HOME/Library/Android/sdk/platform-tools:$HOME/Library/Android/sdk/build-tools/36.1.0:$PATH"
# Honor an externally-set ANDROID_SERIAL (e.g. the physical phone), else default to the emulator.
export ANDROID_SERIAL="${ANDROID_SERIAL:-emulator-5554}"
PKG=powerwatch.matrix.com.pwgen2android
APK=/Users/swanky/powerwatch/patched/powerwatch-offline-signed2.apk
cd /Users/swanky/powerwatch
OUT=verify_shots
mkdir -p "$OUT"

echo "### 0. devices (expect emulator-5554)"
adb devices

echo "### 1. install verified APK (reinstall in place)"
adb install -r "$APK"
echo "install rc=$?"

echo "### 2. confirm installed version"
adb shell dumpsys package "$PKG" 2>/dev/null | grep -E "versionName|lastUpdateTime"

echo "### 3. cut network"
adb shell svc wifi disable 2>&1
adb shell svc data disable 2>&1
adb shell settings put global airplane_mode_on 1 2>&1
adb shell am broadcast -a android.intent.action.AIRPLANE_MODE --ez state true >/dev/null 2>&1
sleep 2

echo "### 4. clear logcat + force-stop"
adb logcat -c 2>&1
adb shell am force-stop "$PKG"
sleep 2

echo "### 5. launch (LAUNCHER -> SplashScreenActivity)"
adb shell monkey -p "$PKG" -c android.intent.category.LAUNCHER 1 2>/dev/null

echo "### 6. wait for splash -> main screen"
sleep 12

echo "### 7. focused activity"
adb shell dumpsys window 2>/dev/null | grep -iE 'mCurrentFocus|mFocusedApp' | head

echo "### 8. screenshot"
adb exec-out screencap -p > "$OUT/01_main.png" 2>/dev/null
ls -la "$OUT/01_main.png"

echo "### 9. logcat dump + analysis"
adb logcat -d > "$OUT/logcat.txt" 2>&1
echo "--- FATAL / crash (expect none) ---"
grep -iE "FATAL EXCEPTION|AndroidRuntime: FATAL" "$OUT/logcat.txt" | head
echo "--- offline-canary: choke-point blocks actually logged (informational) ---"
grep -c "powerwatch offline" "$OUT/logcat.txt"
echo "--- any 'powerwatch' string in log ---"
grep -icE "powerwatch" "$OUT/logcat.txt"
echo "--- any api.prod/dev.powerwatch network attempt (expect 0) ---"
grep -icE "api\.(prod|dev)\.powerwatch" "$OUT/logcat.txt"

echo "### 10. restore network (turn airplane mode OFF again)"
adb shell settings put global airplane_mode_on 0 2>&1
adb shell am broadcast -a android.intent.action.AIRPLANE_MODE --ez state false >/dev/null 2>&1
adb shell svc wifi enable 2>/dev/null
adb shell svc data enable 2>/dev/null

echo "DONE"
