package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class ManifestUnityVersionProvider implements com.crashlytics.android.core.UnityVersionProvider {
    static final java.lang.String FABRIC_UNITY_CRASHLYTICS_VERSION_KEY = "io.fabric.unity.crashlytics.version";
    private final android.content.Context context;
    private final java.lang.String packageName;

    public ManifestUnityVersionProvider(android.content.Context context, java.lang.String str) {
        this.context = context;
        this.packageName = str;
    }

    @Override // com.crashlytics.android.core.UnityVersionProvider
    public java.lang.String getUnityVersion() {
        try {
            android.os.Bundle bundle = this.context.getPackageManager().getApplicationInfo(this.packageName, 128).metaData;
            if (bundle != null) {
                return bundle.getString(FABRIC_UNITY_CRASHLYTICS_VERSION_KEY);
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
