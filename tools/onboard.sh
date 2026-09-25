#!/bin/bash
# onboard.sh — fresh-reset onboarding capture.
# Step 1: clear app data (destructive, authorized) -> relaunch cold -> capture first screen.
ADB=~/Library/Android/sdk/platform-tools/adb
DEV=46061FDAS009Z0
PKG=powerwatch.matrix.com.pwgen2android
OUT=/Users/swanky/powerwatch/verify_shots/screens
mkdir -p "$OUT"
echo "== clearing app data =="
$ADB -s $DEV shell pm clear $PKG
$ADB -s $DEV shell am force-stop $PKG >/dev/null 2>&1
$ADB -s $DEV shell input keyevent 224 >/dev/null 2>&1
echo "== launching cold (Splash) =="
$ADB -s $DEV shell am start -n $PKG/.splash.SplashScreenActivity >/dev/null 2>&1
sleep 8
$ADB -s $DEV exec-out screencap -p > "$OUT/onboarding_01.png" 2>/dev/null
echo "SAVED: $OUT/onboarding_01.png ($(wc -c < "$OUT/onboarding_01.png") bytes)"
echo "== top activity =="
$ADB -s $DEV shell dumpsys activity activities 2>/dev/null | grep -iE "topResumedActivity" | head -1
