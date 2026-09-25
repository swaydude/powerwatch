#!/bin/bash
# Phase B only: force-stop + fresh launch + 80s capture of the cold-start
# connection bootstrap. Device row now exists in the Room DB, so this shows
# whether DeviceManagerImpl.startConnection() -> communicator.startConnection()
# -> BleCommunicationTechnology.startMonitoring() -> readInfo() completes.
set -uo pipefail
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
export ANDROID_SERIAL=46061FDAS009Z0
OUT="/Users/swanky/.claude/jobs/dea0ad30/tmp"
PKG=powerwatch.matrix.com.pwgen2android
MAC="06:05:04:BB:7A:2E"
cd "$OUT"

echo "force-stop + relaunch..."
adb shell am force-stop "$PKG"
adb logcat -c
adb shell monkey -p "$PKG" -c android.intent.category.LAUNCHER 1 > /dev/null 2>&1
echo "launched $(date). capturing 80s..."
sleep 80
adb logcat -d > sync2_relaunch.log 2>&1
adb shell dumpsys bluetooth_manager 2>/dev/null | grep -iE -A 45 "$MAC" > sync2_bt.txt
echo "captured $(date)"
echo "log lines: $(wc -l < sync2_relaunch.log)   bt lines: $(wc -l < sync2_bt.txt)"
