package com.crashlytics.android;

/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsInitProvider extends android.content.ContentProvider {
    private static final java.lang.String NDK_MANIFEST_FLAG = "firebase_crashlytics_ndk_enabled";
    private static final java.lang.String TAG = "CrashlyticsInitProvider";

    interface EnabledCheckStrategy {
        boolean isCrashlyticsEnabled(android.content.Context context);
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        android.content.Context context = getContext();
        if (shouldInitializeFabric(context, new io.fabric.sdk.android.services.common.FirebaseInfo(), new com.crashlytics.android.ManifestEnabledCheckStrategy())) {
            try {
                io.fabric.sdk.android.Fabric.with(context, createCrashlyticsKits(context.getApplicationContext()));
                io.fabric.sdk.android.Fabric.getLogger().i(TAG, "CrashlyticsInitProvider initialization successful");
                return true;
            } catch (java.lang.IllegalStateException unused) {
                io.fabric.sdk.android.Fabric.getLogger().i(TAG, "CrashlyticsInitProvider initialization unsuccessful");
                return false;
            }
        }
        io.fabric.sdk.android.Fabric.getLogger().i(TAG, "CrashlyticsInitProvider skipping initialization");
        return true;
    }

    private io.fabric.sdk.android.Kit[] createCrashlyticsKits(android.content.Context context) {
        boolean z;
        try {
            android.os.Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            z = bundle != null && bundle.getBoolean(NDK_MANIFEST_FLAG, false);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Unable to get PackageManager while determining if Crashlytics NDK should be initialized", e);
        }
        com.crashlytics.android.Crashlytics crashlytics = new com.crashlytics.android.Crashlytics();
        if (z) {
            try {
                io.fabric.sdk.android.Fabric.getLogger().i(io.fabric.sdk.android.Fabric.TAG, "Crashlytics is initializing NDK crash reporter.");
                return new io.fabric.sdk.android.Kit[]{crashlytics, new com.crashlytics.android.ndk.CrashlyticsNdk()};
            } catch (java.lang.Throwable th) {
                io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Crashlytics failed to initialize NDK crash reporting. Attempting to intialize SDK...", th);
            }
        }
        return new io.fabric.sdk.android.Kit[]{crashlytics};
    }

    boolean shouldInitializeFabric(android.content.Context context, io.fabric.sdk.android.services.common.FirebaseInfo firebaseInfo, com.crashlytics.android.CrashlyticsInitProvider.EnabledCheckStrategy enabledCheckStrategy) {
        if (firebaseInfo.isFirebaseCrashlyticsEnabled(context)) {
            return enabledCheckStrategy.isCrashlyticsEnabled(context);
        }
        return firebaseInfo.isAutoInitializeFlagEnabled(context);
    }
}
