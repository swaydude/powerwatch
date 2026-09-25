package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
public class DataCollectionArbiter {
    private static final java.lang.String FIREBASE_CRASHLYTICS_COLLECTION_ENABLED = "firebase_crashlytics_collection_enabled";
    private static final java.lang.String FIREBASE_CRASHLYTICS_PREFS = "com.google.firebase.crashlytics.prefs";
    private static io.fabric.sdk.android.services.common.DataCollectionArbiter instance;
    private static java.lang.Object instanceLock = new java.lang.Object();
    private volatile boolean crashlyticsDataCollectionEnabled;
    private volatile boolean crashlyticsDataCollectionExplicitlySet;
    private final io.fabric.sdk.android.services.common.FirebaseApp firebaseApp;
    private boolean isUnity;
    private final android.content.SharedPreferences sharedPreferences;

    public static io.fabric.sdk.android.services.common.DataCollectionArbiter getInstance(android.content.Context context) {
        io.fabric.sdk.android.services.common.DataCollectionArbiter dataCollectionArbiter;
        synchronized (instanceLock) {
            if (instance == null) {
                instance = new io.fabric.sdk.android.services.common.DataCollectionArbiter(context);
            }
            dataCollectionArbiter = instance;
        }
        return dataCollectionArbiter;
    }

    public static void resetForTesting(android.content.Context context) {
        synchronized (instanceLock) {
            instance = new io.fabric.sdk.android.services.common.DataCollectionArbiter(context);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    private DataCollectionArbiter(android.content.Context context) {
        boolean z;
        boolean z2;
        android.content.pm.ApplicationInfo applicationInfo;
        this.isUnity = false;
        if (context == null) {
            throw new java.lang.RuntimeException("null context");
        }
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(FIREBASE_CRASHLYTICS_PREFS, 0);
        this.sharedPreferences = sharedPreferences;
        this.firebaseApp = io.fabric.sdk.android.services.common.FirebaseAppImpl.getInstance(context);
        if (sharedPreferences.contains(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED)) {
            z = sharedPreferences.getBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED, true);
        } else {
            try {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED)) {
                    z = true;
                    z2 = false;
                } else {
                    z = applicationInfo.metaData.getBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED);
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Unable to get PackageManager. Falling through", e);
            }
            this.crashlyticsDataCollectionEnabled = z;
            this.crashlyticsDataCollectionExplicitlySet = z2;
            this.isUnity = io.fabric.sdk.android.services.common.CommonUtils.resolveUnityEditorVersion(context) != null;
        }
        z2 = true;
        this.crashlyticsDataCollectionEnabled = z;
        this.crashlyticsDataCollectionExplicitlySet = z2;
        this.isUnity = io.fabric.sdk.android.services.common.CommonUtils.resolveUnityEditorVersion(context) != null;
    }

    public boolean isDataCollectionEnabled() {
        if (this.isUnity && this.crashlyticsDataCollectionExplicitlySet) {
            return this.crashlyticsDataCollectionEnabled;
        }
        io.fabric.sdk.android.services.common.FirebaseApp firebaseApp = this.firebaseApp;
        if (firebaseApp != null) {
            return firebaseApp.isDataCollectionDefaultEnabled();
        }
        return true;
    }

    public boolean shouldAutoInitialize() {
        return this.crashlyticsDataCollectionEnabled;
    }

    public void setCrashlyticsDataCollectionEnabled(boolean z) {
        this.crashlyticsDataCollectionEnabled = z;
        this.crashlyticsDataCollectionExplicitlySet = true;
        this.sharedPreferences.edit().putBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED, z).commit();
    }
}
