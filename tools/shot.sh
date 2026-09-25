#!/bin/bash
# Usage: shot.sh <label> "cmd;cmd;..."
#  - runs the given adb shell gesture commands (semicolon-separated)
#  - waits for the UI to settle, then screencaps to verify_shots/screens/<label>.png
#  - prints the top resumed activity
ADB=~/Library/Android/sdk/platform-tools/adb
DEV=46061FDAS009Z0
OUT=/Users/swanky/powerwatch/verify_shots/screens
mkdir -p "$OUT"
LABEL="$1"
GESTURES="$2"
$ADB -s $DEV shell input keyevent 224 >/dev/null   # wake
[ -n "$GESTURES" ] && $ADB -s $DEV shell "$GESTURES" >/dev/null 2>&1
sleep 4
$ADB -s $DEV exec-out screencap -p > "$OUT/$LABEL.png" 2>/dev/null
echo "SAVED: $OUT/$LABEL.png ($(wc -c < "$OUT/$LABEL.png") bytes)"
echo "--- top activity ---"
$ADB -s $DEV shell dumpsys activity activities 2>/dev/null | grep -iE "ResumedActivity|topResumedActivity" | head -2
