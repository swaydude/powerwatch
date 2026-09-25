#!/bin/bash
# Extract the Gen2PairingProgressViewModel code around the withLatestFrom NPE (kt:88).
# Runs under the user's session (bypasses the down classifier). Tries jadx for a
# readable decompile; always also dumps smali context around withLatestFrom sites.
set -uo pipefail
cd /Users/swanky/powerwatch
OUT=/Users/swanky/.claude/jobs/dea0ad30/tmp/gen2
mkdir -p "$OUT"
SM=apktool-output/smali_classes2/powerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel.smali

{
echo "=== jadx jar hunt ==="
JADX=$(find . -maxdepth 3 -iname 'jadx*.jar' 2>/dev/null | head -1)
if [ -z "$JADX" ]; then JADX=$(find "$HOME" -maxdepth 4 -iname 'jadx*.jar' 2>/dev/null | grep -v '\.m2' | head -1); fi
echo "JADX=$JADX"

if [ -n "$JADX" ] && [ -f "$JADX" ]; then
  echo "=== jadx decompile (may take 1-3 min) ==="
  java -jar "$JADX" -d "$OUT/jadx" --no-res patched/powerwatch-offline-canary-signed.apk >/dev/null 2>&1
  echo "jadx rc=$?"
  F="$OUT/jadx/sources/powerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel.java"
  if [ -f "$F" ]; then
    cp "$F" "$OUT/Gen2PairingProgressViewModel.java"
    echo "wrote $OUT/Gen2PairingProgressViewModel.java ($(wc -l < "$F") lines)"
  else
    # search for it wherever jadx put it
    find "$OUT/jadx" -name 'Gen2PairingProgressViewModel.java' 2>/dev/null | head
  fi
fi

echo "=== smali: withLatestFrom sites (+/- 20 lines) ==="
grep -n "withLatestFrom" "$SM"
echo "--- context ---"
grep -n -B20 -A20 "withLatestFrom" "$SM"

echo "=== smali: the scan-entry method (startScanning call site) for reference ==="
grep -n "startScanning" "$SM"
} > /Users/swanky/.claude/jobs/dea0ad30/tmp/gen2_decompile.txt 2>&1

echo "=== quick status ==="
grep -E "JADX=|jadx rc=|wrote |withLatestFrom" /Users/swanky/.claude/jobs/dea0ad30/tmp/gen2_decompile.txt | head -30
echo "OUT DIR: $OUT"
