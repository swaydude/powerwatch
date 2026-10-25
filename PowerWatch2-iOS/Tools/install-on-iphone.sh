#!/bin/zsh
# Build PowerWatch2 for a connected physical iPhone and install it.
#
# project.yml deliberately builds *unsigned* (CODE_SIGNING_ALLOWED: NO) so the
# simulator audit in README.md — no CFNetwork, no entitlements, no ATS
# exceptions — describes the same artifact the app target produces. Real
# hardware needs a real signature, so the signing settings are injected here on
# the xcodebuild command line instead of being baked into the project.
#
#   ./Tools/install-on-iphone.sh                      # first paired iPhone
#   ./Tools/install-on-iphone.sh <UDID>               # specific device
#   DEVELOPMENT_TEAM=XXXXXX ./Tools/install-on-iphone.sh
#
# Requires: an "Apple Development" identity in the keychain and an Apple ID
# signed in to Xcode (Settings ▸ Accounts) so -allowProvisioningUpdates can
# register the device and create the App ID/profile.
set -euo pipefail
cd "$(dirname "$0")/.."

# Personal Team of the Apple ID signed in to Xcode ▸ Accounts. "Apple Development"
# certificates may exist for other teams in the keychain, but xcodebuild can only
# create profiles for a team an account is actually configured for.
TEAM="${DEVELOPMENT_TEAM:-5ZMY3Q3K9L}"
UDID="${1:-00008140-00161D9902F2801C}"
DERIVED="$(pwd)/build/iphone"
BUNDLE="com.matrixindustries.powerwatch2.ios"

echo "==> signing with team $TEAM for device $UDID"

xcodebuild \
  -project PowerWatch2.xcodeproj \
  -scheme PowerWatch2 \
  -sdk iphoneos \
  -destination "id=$UDID" \
  -configuration Debug \
  -allowProvisioningUpdates \
  -derivedDataPath "$DERIVED" \
  DEVELOPMENT_TEAM="$TEAM" \
  CODE_SIGN_STYLE=Automatic \
  CODE_SIGN_IDENTITY="Apple Development" \
  CODE_SIGNING_ALLOWED=YES \
  build

APP="$DERIVED/Build/Products/Debug-iphoneos/PowerWatch2.app"
[[ -d "$APP" ]] || { echo "!! expected $APP"; exit 1; }

echo "==> signature"
codesign -dvv "$APP" 2>&1 | grep -iE "^Authority|TeamIdentifier|Identifier=" | head -5

echo "==> installing"
xcrun devicectl device install app --device "$UDID" "$APP"

echo "==> launching"
xcrun devicectl device process launch --device "$UDID" "$BUNDLE" || \
  echo "   (install succeeded; open PowerWatch2 on the phone if launch was refused)"
