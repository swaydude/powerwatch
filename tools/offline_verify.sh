#!/bin/bash
# Offline runtime verification: cut the emulator's network, launch the app,
# and prove it works (no crash, renders) with zero Matrix-powerwatch API calls.
cd /Users/swanky/powerwatch
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
PKG=powerwatch.matrix.com.pwgen2android
OUT=verify_shots
mkdir -p "$OUT"

echo "### 1. cut network"
adb shell svc wifi disable 2>&1
adb shell svc data disable 2>&1
adb shell settings put global airplane_mode_on 1 2>&1
adb shell am broadcast -a android.intent.action.AIRPLANE_MODE --ez state true >/dev/null 2>&1
sleep 2

echo "### 2. clear logcat + force-stop"
adb logcat -c 2>&1
adb shell am force-stop "$PKG"
sleep 2

echo "### 3. launch app (LAUNCHER -> SplashScreenActivity)"
adb shell monkey -p "$PKG" -c android.intent.category.LAUNCHER 1 2>/dev/null

echo "### 4. wait for splash -> main"
sleep 10

echo "### 5. focused activity"
adb shell dumpsys window 2>/dev/null | grep -iE 'mCurrentFocus|mFocusedApp' | head

echo "### 6. screenshot"
adb exec-out screencap -p > "$OUT/01_main.png" 2>/dev/null
ls -la "$OUT/01_main.png"

echo "### 7. dump logcat"
adb logcat -d > "$OUT/logcat.txt" 2>&1
echo "FATAL / crash:"; grep -iE "FATAL EXCEPTION|AndroidRuntime: FATAL" "$OUT/logcat.txt" | head
echo "offline-canary count (cloud calls actually attempted & blocked):"; grep -c "powerwatch offline" "$OUT/logcat.txt"
echo "any 'powerwatch' string in log:"; grep -icE "powerwatch" "$OUT/logcat.txt"
echo "any api.prod/dev powerwatch network attempt:"; grep -icE "api\.(prod|dev)\.powerwatch" "$OUT/logcat.txt"

echo "DONE"
