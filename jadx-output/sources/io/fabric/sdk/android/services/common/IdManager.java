package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
public class IdManager {
    private static final java.lang.String BAD_ANDROID_ID = "9774d56d682e549c";
    public static final java.lang.String COLLECT_DEVICE_IDENTIFIERS = "com.crashlytics.CollectDeviceIdentifiers";
    public static final java.lang.String COLLECT_USER_IDENTIFIERS = "com.crashlytics.CollectUserIdentifiers";
    public static final java.lang.String DEFAULT_VERSION_NAME = "0.0";
    static final java.lang.String PREFKEY_ADVERTISING_ID = "crashlytics.advertising.id";
    private static final java.lang.String PREFKEY_INSTALLATION_UUID = "crashlytics.installation.id";
    io.fabric.sdk.android.services.common.AdvertisingInfo advertisingInfo;
    io.fabric.sdk.android.services.common.AdvertisingInfoProvider advertisingInfoProvider;
    private final android.content.Context appContext;
    private final java.lang.String appIdentifier;
    private final java.lang.String appInstallIdentifier;
    private final boolean collectHardwareIds;
    private final boolean collectUserIds;
    boolean fetchedAdvertisingInfo;
    io.fabric.sdk.android.services.common.FirebaseInfo firebaseInfo;
    private final java.util.concurrent.locks.ReentrantLock installationIdLock = new java.util.concurrent.locks.ReentrantLock();
    private final io.fabric.sdk.android.services.common.InstallerPackageNameProvider installerPackageNameProvider;
    private final java.util.Collection<io.fabric.sdk.android.Kit> kits;
    private static final java.util.regex.Pattern ID_PATTERN = java.util.regex.Pattern.compile("[^\\p{Alnum}]");
    private static final java.lang.String FORWARD_SLASH_REGEX = java.util.regex.Pattern.quote("/");

    @java.lang.Deprecated
    public java.lang.String createIdHeaderValue(java.lang.String str, java.lang.String str2) {
        return "";
    }

    @java.lang.Deprecated
    public java.lang.String getAdvertisingId() {
        return null;
    }

    @java.lang.Deprecated
    public java.lang.String getAndroidId() {
        return null;
    }

    @java.lang.Deprecated
    public java.lang.String getBluetoothMacAddress() {
        return null;
    }

    @java.lang.Deprecated
    public java.lang.String getSerialNumber() {
        return null;
    }

    @java.lang.Deprecated
    public java.lang.String getTelephonyId() {
        return null;
    }

    @java.lang.Deprecated
    public java.lang.String getWifiMacAddress() {
        return null;
    }

    public enum DeviceIdentifierType {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);

        public final int protobufIndex;

        DeviceIdentifierType(int i) {
            this.protobufIndex = i;
        }
    }

    public IdManager(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.Collection<io.fabric.sdk.android.Kit> collection) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new java.lang.IllegalArgumentException("appIdentifier must not be null");
        }
        if (collection == null) {
            throw new java.lang.IllegalArgumentException("kits must not be null");
        }
        this.appContext = context;
        this.appIdentifier = str;
        this.appInstallIdentifier = str2;
        this.kits = collection;
        this.installerPackageNameProvider = new io.fabric.sdk.android.services.common.InstallerPackageNameProvider();
        this.advertisingInfoProvider = new io.fabric.sdk.android.services.common.AdvertisingInfoProvider(context);
        this.firebaseInfo = new io.fabric.sdk.android.services.common.FirebaseInfo();
        boolean booleanResourceValue = io.fabric.sdk.android.services.common.CommonUtils.getBooleanResourceValue(context, COLLECT_DEVICE_IDENTIFIERS, true);
        this.collectHardwareIds = booleanResourceValue;
        if (!booleanResourceValue) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Device ID collection disabled for " + context.getPackageName());
        }
        boolean booleanResourceValue2 = io.fabric.sdk.android.services.common.CommonUtils.getBooleanResourceValue(context, COLLECT_USER_IDENTIFIERS, true);
        this.collectUserIds = booleanResourceValue2;
        if (booleanResourceValue2) {
            return;
        }
        io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "User information collection disabled for " + context.getPackageName());
    }

    public boolean canCollectUserIds() {
        return this.collectUserIds;
    }

    private java.lang.String formatId(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return ID_PATTERN.matcher(str).replaceAll("").toLowerCase(java.util.Locale.US);
    }

    public java.lang.String getAppInstallIdentifier() {
        java.lang.String str = this.appInstallIdentifier;
        if (str != null) {
            return str;
        }
        android.content.SharedPreferences sharedPrefs = io.fabric.sdk.android.services.common.CommonUtils.getSharedPrefs(this.appContext);
        checkAdvertisingIdRotation(sharedPrefs);
        java.lang.String string = sharedPrefs.getString(PREFKEY_INSTALLATION_UUID, null);
        return string == null ? createInstallationUUID(sharedPrefs) : string;
    }

    public java.lang.String getAppIdentifier() {
        return this.appIdentifier;
    }

    public java.lang.String getOsVersionString() {
        return getOsDisplayVersionString() + "/" + getOsBuildVersionString();
    }

    public java.lang.String getOsDisplayVersionString() {
        return removeForwardSlashesIn(android.os.Build.VERSION.RELEASE);
    }

    public java.lang.String getOsBuildVersionString() {
        return removeForwardSlashesIn(android.os.Build.VERSION.INCREMENTAL);
    }

    public java.lang.String getModelName() {
        return java.lang.String.format(java.util.Locale.US, "%s/%s", removeForwardSlashesIn(android.os.Build.MANUFACTURER), removeForwardSlashesIn(android.os.Build.MODEL));
    }

    private java.lang.String removeForwardSlashesIn(java.lang.String str) {
        return str.replaceAll(FORWARD_SLASH_REGEX, "");
    }

    private java.lang.String createInstallationUUID(android.content.SharedPreferences sharedPreferences) {
        this.installationIdLock.lock();
        try {
            java.lang.String string = sharedPreferences.getString(PREFKEY_INSTALLATION_UUID, null);
            if (string == null) {
                string = formatId(java.util.UUID.randomUUID().toString());
                sharedPreferences.edit().putString(PREFKEY_INSTALLATION_UUID, string).commit();
            }
            return string;
        } finally {
            this.installationIdLock.unlock();
        }
    }

    private void checkAdvertisingIdRotation(android.content.SharedPreferences sharedPreferences) {
        io.fabric.sdk.android.services.common.AdvertisingInfo advertisingInfo = getAdvertisingInfo();
        if (advertisingInfo != null) {
            flushInstallationIdIfNecessary(sharedPreferences, advertisingInfo.advertisingId);
        }
    }

    private void flushInstallationIdIfNecessary(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        this.installationIdLock.lock();
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            java.lang.String string = sharedPreferences.getString(PREFKEY_ADVERTISING_ID, null);
            if (android.text.TextUtils.isEmpty(string)) {
                sharedPreferences.edit().putString(PREFKEY_ADVERTISING_ID, str).commit();
            } else if (!string.equals(str)) {
                sharedPreferences.edit().remove(PREFKEY_INSTALLATION_UUID).putString(PREFKEY_ADVERTISING_ID, str).commit();
            }
        } finally {
            this.installationIdLock.unlock();
        }
    }

    public java.util.Map<io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType, java.lang.String> getDeviceIdentifiers() {
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.Object obj : this.kits) {
            if (obj instanceof io.fabric.sdk.android.services.common.DeviceIdentifierProvider) {
                for (java.util.Map.Entry<io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType, java.lang.String> entry : ((io.fabric.sdk.android.services.common.DeviceIdentifierProvider) obj).getDeviceIdentifiers().entrySet()) {
                    putNonNullIdInto(map, entry.getKey(), entry.getValue());
                }
            }
        }
        return java.util.Collections.unmodifiableMap(map);
    }

    public java.lang.String getInstallerPackageName() {
        return this.installerPackageNameProvider.getInstallerPackageName(this.appContext);
    }

    public java.lang.Boolean isLimitAdTrackingEnabled() {
        if (shouldCollectHardwareIds()) {
            return explicitCheckLimitAdTracking();
        }
        return null;
    }

    private void putNonNullIdInto(java.util.Map<io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType, java.lang.String> map, io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType deviceIdentifierType, java.lang.String str) {
        if (str != null) {
            map.put(deviceIdentifierType, str);
        }
    }

    protected boolean shouldCollectHardwareIds() {
        return this.collectHardwareIds && !this.firebaseInfo.isFirebaseCrashlyticsEnabled(this.appContext);
    }

    synchronized io.fabric.sdk.android.services.common.AdvertisingInfo getAdvertisingInfo() {
        if (!this.fetchedAdvertisingInfo) {
            this.advertisingInfo = this.advertisingInfoProvider.getAdvertisingInfo();
            this.fetchedAdvertisingInfo = true;
        }
        return this.advertisingInfo;
    }

    private java.lang.Boolean explicitCheckLimitAdTracking() {
        io.fabric.sdk.android.services.common.AdvertisingInfo advertisingInfo = getAdvertisingInfo();
        if (advertisingInfo != null) {
            return java.lang.Boolean.valueOf(advertisingInfo.limitAdTrackingEnabled);
        }
        return null;
    }
}
