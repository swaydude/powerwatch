#!/bin/bash
# walk.sh "label|gesture" "label2|gesture2" ...
# wakes, then for each step: runs the gesture (chain with ';'), waits 4s, screencaps to screens/<label>.png
ADB=~/Library/Android/sdk/platform-tools/adb
DEV=46061FDAS009Z0
OUT=/Users/swanky/powerwatch/verify_shots/screens
mkdir -p "$OUT"
$ADB -s $DEV shell input keyevent 224 >/dev/null
for step in "$@"; do
  L="${step%%|*}"; G="${step#*|}"
  [ -n "$G" ] && $ADB -s $DEV shell "$G" >/dev/null 2>&1
  sleep 4
  $ADB -s $DEV exec-out screencap -p > "$OUT/$L.png" 2>/dev/null
  echo "SAVED: $OUT/$L.png ($(wc -c < "$OUT/$L.png") b)"
  $ADB -s $DEV shell dumpsys activity activities 2>/dev/null | grep -iE "topResumedActivity" | head -1
done
