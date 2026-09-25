#!/bin/bash
# Runtime verification for the offline-patched PowerWatch app.
# Usage: ./tools/verify_runtime.sh [airplane]
#   (no arg)  -> install, launch, settle, screenshot, logcat
#   airplane  -> additionally toggle airplane mode ON before launch (zero-network proof)
set -uo pipefail
cd /Users/swanky/powerwatch
ADB=$HOME/Library/Android/sdk/platform-tools/adb
PKG=powerwatch.matrix.com.pwgen2android
APK=patched/powerwatch-offline-signed.apk
SHOTS=/Users/swanky/.claude/jobs/4987b421/tmp
mkdir -p "$SHOTS"

AIRPLANE="${1:-}"
if [ "$AIRPLANE" = "airplane" ]; then
  echo "== enabling airplane mode (zero network) =="
  $ADB shell settings put global airplane_mode_on 1
  $ADB shell am broadcast -a android.intent.action.AIRPLANE_MODE --ez state true >/dev/null 2>&1
  $ADB shell svc wifi disable >/dev/null 2>&1
  $ADB shell svc data disable >/dev/null 2>&1
  $ADB shell svc bluetooth disable >/dev/null 2>&1
fi

echo "== device =="; $ADB devices
echo "== install =="
$ADB uninstall "$PKG" >/dev/null 2>&1
$ADB install -r "$APK" 2>&1 | tail -3
echo "== launch =="
$ADB logcat -c 2>/dev/null
$ADB shell am start -n "$PKG/$PKG.splash.SplashScreenActivity" 2>&1 | tail -3

# Settle: poll top activity via adb round-trips (no foreground sleep); wait past splash.
FOCUS=""
for i in $(seq 1 45); do
  FOCUS=$($ADB shell dumpsys activity activities 2>/dev/null | grep -m1 -E 'topResumedActivity|ResumedActivity')
  case "$FOCUS" in
    *pwgen2android*SplashScreen*) : ;;      # still on splash; keep waiting
    *pwgen2android*) break ;;               # reached a target screen
    *) : ;;
  esac
done
echo "== top activity after settle: ${FOCUS:-<none>}"

echo "== current focus =="
$ADB shell dumpsys window 2>/dev/null | grep -m2 -E 'mCurrentFocus|mFocusedApp'

echo "== screenshot =="
$ADB exec-out screencap -p > "$SHOTS/pw_main.png" 2>/dev/null
ls -la "$SHOTS/pw_main.png" 2>/dev/null

echo "== logcat: crashes / offline marker / network errors =="
$ADB logcat -d 2>&1 | grep -iE 'AndroidRuntime: FATAL|FATAL EXCEPTION|powerwatch offline|Could not resolve|UnknownHost|ConnectException|java\.net\.|SecurityException' | tail -50

echo "== activity transitions for our pkg =="
$ADB logcat -d 2>&1 | grep -iE 'ActivityTaskManager: START|Displayed [^:]*pwgen' | tail -20
