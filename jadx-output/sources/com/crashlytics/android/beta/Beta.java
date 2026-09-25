package com.crashlytics.android.beta;

/* JADX INFO: loaded from: classes.dex */
public class Beta extends io.fabric.sdk.android.Kit<java.lang.Boolean> implements io.fabric.sdk.android.services.common.DeviceIdentifierProvider {
    public static final java.lang.String TAG = "Beta";

    @Override // io.fabric.sdk.android.Kit
    public java.lang.String getIdentifier() {
        return "com.crashlytics.sdk.android:beta";
    }

    @Override // io.fabric.sdk.android.Kit
    public java.lang.String getVersion() {
        return "1.2.10.27";
    }

    public static com.crashlytics.android.beta.Beta getInstance() {
        return (com.crashlytics.android.beta.Beta) io.fabric.sdk.android.Fabric.getKit(com.crashlytics.android.beta.Beta.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.fabric.sdk.android.Kit
    public java.lang.Boolean doInBackground() {
        io.fabric.sdk.android.Fabric.getLogger().d(TAG, "Beta kit initializing...");
        return true;
    }

    @Override // io.fabric.sdk.android.services.common.DeviceIdentifierProvider
    public java.util.Map<io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType, java.lang.String> getDeviceIdentifiers() {
        return java.util.Collections.emptyMap();
    }
}
