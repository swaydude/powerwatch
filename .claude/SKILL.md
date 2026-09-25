# PowerWatch2 APK Patching Skill

## Overview
Reverse engineering and patching the PowerWatch2 Android APK (v1.5.6, build 197) to:
- Bypass cloud authentication
- Disable all external API calls during sync
- Operate fully offline with local data storage

## Project Structure

```
/Users/swanky/powerwatch/
├── powerwatch.matrix.com.pwgen2android_1.5.6.apk    # Original APK
├── apktool-output/                                    # Decompiled smali
│   └── smali_classes3/powerwatch/matrix/com/pwgen2android/
│       └── shared/cloud/
│           ├── LoginCloudServiceImpl.smali            # ** PRIMARY PATCH **
│           └── CloudSynchronizerImpl.smali            # ** PRIMARY PATCH **
│       └── shared/data/repositories/
│           └── UserAccountRepositoryImpl.smali        # ** PRIMARY PATCH **
│       └── shared/cloud/metrics/
│           └── MetricsRepositoryImpl.smali            # ** PRIMARY PATCH **
├── jadx-output/sources/                              # Java source reference
└── patched/                                          # Build output
    ├── debug.keystore                                # Debug signing key
    └── powerwatch-patched-signed-aligned.apk  # Final installed APK (working)
```

## Key Files Patched

### 1. LoginCloudServiceImpl.smali (Primary)
**Location:** `apktool-output/smali_classes3/.../cloud/LoginCloudServiceImpl.smali`

**Methods Patched:**
- `isLoggedIn()` - Returns `const/4 v0, 0x1` (always true)
- `login()` - Returns null (bypasses cloud auth)

**Patch Pattern (Recommended - Simple & Reliable):**
```smali
.method public login(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;
    .locals 1

    # PATCHED: bypass login API, return null
    const/4 v0, 0x0
    return-object v0
.end method
```

**Patch Pattern (Advanced - Returns hardcoded User):**
⚠️ **NOT RECOMMENDED** - Register allocation issues make this unreliable. The compiler may place `this` in v13 (not v0), causing type conflicts when constructing User objects. If you must construct a User, use `.locals 16` and carefully manage register types.

**⚠️ CRITICAL REGISTERS RULE:**
- The compiler may place `this` in a **high register** (v13+), NOT v0 in Kotlin/Smali
- **NEVER** overwrite registers used for `this` with String constants
- **Safe approach:** Return null immediately from patched methods instead of constructing objects
- If constructing objects, use `.locals 16` and track register types carefully
- **Common error:** `VerifyError: register vX has type Reference: X but expected Reference: Y` - caused by register type conflicts

### 2. CloudSynchronizerImpl.smali (Primary)
**Location:** `apktool-output/smali_classes3/.../cloud/CloudSynchronizerImpl.smali`

**Method Patched:**
- `syncData()` - Returns immediately without triggering cloud sync

**Patch Pattern:**
```smali
.method public syncData()V
    .locals 0
    # PATCHED: bypass cloud sync
    return-void
.end method
```

### 3. UserAccountRepositoryImpl.smali (Primary)
**Location:** `apktool-output/smali_classes3/.../data/repositories/UserAccountRepositoryImpl.smali`

**Method Patched:**
- `getFirst(ZZ)` - Returns null (bypasses user fetch)

**Patch Pattern (Recommended - Simple & Reliable):**
```smali
.method public getFirst(ZZ)Lio/reactivex/Single;
    .locals 1

    # PATCHED: bypass API, return null
    const/4 v0, 0x0
    return-object v0
.end method
```

**Note:** Same register allocation issues as LoginCloudServiceImpl.login(). Returning null is the safest approach.

### 4. MetricsRepositoryImpl.smali (Secondary)
**Location:** `apktool-output/smali_classes3/.../cloud/metrics/MetricsRepositoryImpl.smali`

**Methods Patched:**
- `logEvent(LogEvent)` - Returns immediately
- `logOTAEvent(DeviceOTALogEvent)` - Returns immediately

**Patch Pattern:**
```smali
.method public logEvent(L...LogEvent;)V
    .locals 0
    return-void
.end method
```

## Build & Deploy Workflow

### 1. Decompile APK
```bash
cd /Users/swanky/powerwatch
java -jar tools/apktool.jar d -f powerwatch.matrix.com.pwgen2android_1.5.6.apk -o apktool-output
```

### 2. Apply Patches
Edit smali files in `apktool-output/smali_classes3/`

### 3. Recompile APK
```bash
java -jar tools/apktool.jar b apktool-output -o patched/powerwatch-patched.apk
```

### 4. Sign APK
```bash
/Users/swanky/Library/Android/sdk/build-tools/31.0.0/apksigner sign \
  --ks patched/debug.keystore \
  --ks-key-alias androiddebugkey \
  --ks-pass pass:android \
  --key-pass pass:android \
  --in patched/powerwatch-patched.apk \
  --out patched/powerwatch-patched-signed.apk
```

### 5. Align APK
```bash
/Users/swanky/Library/Android/sdk/build-tools/31.0.0/zipalign \
  -p -v 4 \
  patched/powerwatch-patched-signed.apk \
  patched/powerwatch-patched-aligned.apk
```

### 6. Re-sign Aligned APK
```bash
/Users/swanky/Library/Android/sdk/build-tools/31.0.0/apksigner sign \
  --ks patched/debug.keystore \
  --ks-key-alias androiddebugkey \
  --ks-pass pass:android \
  --key-pass pass:android \
  --in patched/powerwatch-patched-aligned.apk \
  --out patched/powerwatch-patched-signed-aligned.apk
```

### 7. Install on Device
```bash
/Users/swanky/Library/Android/sdk/platform-tools/adb uninstall powerwatch.matrix.com.pwgen2android
/Users/swanky/Library/Android/sdk/platform-tools/adb install patched/powerwatch-patched-signed-aligned.apk
```

## Smali Patching Patterns

### Pattern 1: Simple Bypass (return void)
```smali
.method public someMethod()V
    .locals 0
    return-void
.end method
```

### Pattern 2: Return Boolean
```smali
.method public isLoggedIn()Z
    .locals 1
    const/4 v0, 0x1    # true
    return v0
.end method
```

### Pattern 3: Return Single<Object>
```smali
.method public someMethod()Lio/reactivex/Single;
    .locals 1
    # ... construct object ...
    invoke-static {v0}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;
    move-result-object v0
    return-object v0
.end method
```

### Pattern 4: Return Single with Object Construction
See LoginCloudServiceImpl.smali login() method for full pattern with register allocation.

## Common Issues & Solutions

### Issue: VerifyError register type mismatch
**Symptom:** `register v12 has type Reference: X but expected Reference: Y`

**Cause:** In Kotlin/Smali, the compiler may place `this` in a **high register** (v13+), not v0. When you use `const-string v13, "en_US"`, you overwrite `this`. Then when the constructor uses v13 as a parameter, it still holds LoginCloudServiceImpl instead of the expected String.

**Solution (Recommended):** Return null immediately from patched methods instead of constructing objects:
```smali
.method public someMethod()Lio/reactivex/Single;
    .locals 1
    const/4 v0, 0x0
    return-object v0
.end method
```

**Solution (Advanced):** If you must construct objects, use `.locals 16` and carefully track register types. The compiler's register allocation may differ from your expectations.

### Issue: APK install fails with "INSTALL_FAILED_UPDATE_INCOMPATIBLE"
**Cause:** Signature mismatch between installed APK and new APK

**Solution:**
```bash
/Users/swanky/Library/Android/sdk/platform-tools/adb uninstall powerwatch.matrix.com.pwgen2android
```

### Issue: APK install fails with alignment error
**Cause:** resources.arsc not compressed and aligned on 4-byte boundary

**Solution:** Use zipalign before final signing
```bash
/Users/swanky/Library/Android/sdk/build-tools/31.0.0/zipalign -p -v 4 input.apk output.apk
```

### Issue: App crashes on startup after patch
**Cause:** Register allocation issues in User constructor

**Solution:** Follow the register layout pattern exactly:
- v0 = this (NEVER overwrite)
- v1-v2 = long (uid)
- v3-v11 = constructor parameters
- v12 = UserAccountSettings
- v13-v15 = temporary strings

## Architecture Reference

### Sync Flow (Bypassed)
```
User taps Sync
  → SyncFragment
  → SyncViewModel
  → WatchSynchronizerImpl.startSync()
    → BLE DataTransferExecutor.transferData()
    → Save to Room DB (toCacheOnly=false)
    → CloudSynchronizer.syncData()     ← PATCHED: NO-OP
      → deviceRepository.sync()         ← Would call DeviceCloudService.registerDevice()
      → syncWatchLogsToCloud()          ← Would upload walking/resting/sleep/activity logs
        → WalkingLogRepository.sync()
        → RestingLogRepository.sync()
        → SleepLogRepository.sync()
        → UserActivitySessionRepository.sync()
```

### Login Flow (Bypassed)
```
User enters credentials
  → LoginViewModel.login(email, password)
  → LoginCloudServiceImpl.login(email, password)  ← PATCHED: Returns hardcoded User
    → (Original) TokenProvider.add()
    → (Original) AuthService.login()
    → (Original) UserAccountCloudService.getUser()
```

## Testing Checklist

- [x] App opens without crash ✅
- [x] Login screen bypasses to pairing ✅
- [ ] Can pair with watch via BLE
- [ ] Data syncs locally (walking/resting/sleep logs)
- [ ] Dashboard displays synced data
- [ ] No network traffic during sync (check with Wireshark/Charles)
- [x] App doesn't crash on startup ✅

**Status:** App successfully patches and launches to PairingActivity. Login and cloud sync are bypassed.

## Credentials (Hardcoded)
- Email: `test@test.com`
- Password: `test1234`
- User Name: `Test`
- Age: 25
- Height: 180 cm
- Weight: 80.0 kg
- Gender: Male

## Debugging Tips

1. **Check crash logs:**
   ```bash
   /Users/swanky/Library/Android/sdk/platform-tools/adb logcat -d -s AndroidRuntime:E
   ```

2. **Verify patch is in APK:**
   ```bash
   unzip -p <apk>.apk classes3.dex | strings | grep "PATCHED"
   ```

3. **Test register layout:**
   Use baksmali to disassemble and verify the bytecode
   ```bash
   /Users/swanky/Library/Android/sdk/build-tools/31.0.0/baksmali \
     -c "classes.dex:classes2.dex:classes3.dex" \
     input.apk -o output/
   ```

## Notes

- All patches are in `apktool-output/smali_classes3/` directory
- The patched APK is signed with `debug.keystore` (password: android)
- Original API endpoints:
  - Login: `POST /oauth2/token` (Password Credentials Grant)
  - Device: `POST /devices`, `GET /devices`
  - Logs: `POST /walking-logs`, `POST /resting-logs`, `POST /sleep-logs`, `POST /user-activities`
  - Metrics: `POST /metrics/events` (Bugfender)