#!/bin/bash
# Build the PowerWatch iOS app and install it on the connected iPhone.
# Usage: bash build_ios.sh [Debug|Release]
set -uo pipefail

CONFIG="${1:-Debug}"
PROJ=/Users/swanky/powerwatch/ios/PowerWatch.xcodeproj
DERIVED=/Users/swanky/powerwatch/ios/build
TEAM=5ZMY3Q3K9L
BUNDLE=com.swanky.powerwatch
# Auto-detect the connected physical iPhone (first paired/available device),
# or use the UDID passed as the second argument.
DEVICE_ID="${2:-}"
if [ -z "$DEVICE_ID" ]; then
    DEVICE_ID=$(xcrun devicectl list devices 2>/dev/null | awk '/physical/ {print $2; exit}')
fi
if [ -z "$DEVICE_ID" ]; then
    echo "NO CONNECTED IPHONE FOUND (xcrun devicectl list devices)"
    exit 1
fi
echo "Device: $DEVICE_ID"

echo "=== Building $CONFIG ==="
xcodebuild -project "$PROJ" -scheme PowerWatch -configuration "$CONFIG" \
    -derivedDataPath "$DERIVED" \
    -destination "generic/platform=iOS" \
    -allowProvisioningUpdates \
    DEVELOPMENT_TEAM="$TEAM" \
    CODE_SIGN_IDENTITY="Apple Development" \
    build 2>&1 | tail -30

RC=${PIPESTATUS[0]}
if [ "$RC" -ne 0 ]; then
    echo "BUILD FAILED (rc=$RC)"
    exit 1
fi

APP="$DERIVED/Build/Products/$CONFIG-iphoneos/PowerWatch.app"
if [ ! -d "$APP" ]; then
    echo "APP PRODUCT NOT FOUND at $APP"
    ls -la "$DERIVED/Build/Products/" 2>/dev/null
    exit 1
fi
echo "=== Built: $APP ==="

echo "=== Device check ==="
xcrun devicectl list devices 2>&1 | grep -E 'available|iPhone' | head -3

echo "=== Installing on device ==="
xcrun devicectl device install app --device "$DEVICE_ID" "$APP" 2>&1 | tail -8
RC=$?
if [ "$RC" -ne 0 ]; then
    echo "INSTALL FAILED (rc=$RC)"
    exit 1
fi

echo "=== Launching ==="
xcrun devicectl device process launch --device "$DEVICE_ID" "$BUNDLE" 2>&1 | tail -3
echo "=== DONE ==="
