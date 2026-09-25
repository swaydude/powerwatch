package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseInfo {
    static final java.lang.String AUTO_INITIALIZE = "io.fabric.auto_initialize";
    static final java.lang.String FIREBASE_FEATURE_SWITCH = "com.crashlytics.useFirebaseAppId";
    static final java.lang.String GOOGLE_APP_ID = "google_app_id";

    java.lang.String getApiKeyFromFirebaseAppId(android.content.Context context) {
        int resourcesIdentifier = io.fabric.sdk.android.services.common.CommonUtils.getResourcesIdentifier(context, GOOGLE_APP_ID, "string");
        if (resourcesIdentifier == 0) {
            return null;
        }
        io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Generating Crashlytics ApiKey from google_app_id in Strings");
        return createApiKeyFromFirebaseAppId(context.getResources().getString(resourcesIdentifier));
    }

    java.lang.String createApiKeyFromFirebaseAppId(java.lang.String str) {
        return io.fabric.sdk.android.services.common.CommonUtils.sha256(str).substring(0, 40);
    }

    public boolean isFirebaseCrashlyticsEnabled(android.content.Context context) {
        if (io.fabric.sdk.android.services.common.CommonUtils.getBooleanResourceValue(context, FIREBASE_FEATURE_SWITCH, false)) {
            return true;
        }
        return hasGoogleAppId(context) && !hasApiKey(context);
    }

    boolean hasApiKey(android.content.Context context) {
        if (android.text.TextUtils.isEmpty(new io.fabric.sdk.android.services.common.ApiKey().getApiKeyFromManifest(context))) {
            return !android.text.TextUtils.isEmpty(new io.fabric.sdk.android.services.common.ApiKey().getApiKeyFromStrings(context));
        }
        return true;
    }

    public boolean isAutoInitializeFlagEnabled(android.content.Context context) {
        int resourcesIdentifier = io.fabric.sdk.android.services.common.CommonUtils.getResourcesIdentifier(context, AUTO_INITIALIZE, "bool");
        if (resourcesIdentifier == 0) {
            return false;
        }
        boolean z = context.getResources().getBoolean(resourcesIdentifier);
        if (z) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Found Fabric auto-initialization flag for joint Firebase/Fabric customers");
        }
        return z;
    }

    boolean hasGoogleAppId(android.content.Context context) {
        int resourcesIdentifier = io.fabric.sdk.android.services.common.CommonUtils.getResourcesIdentifier(context, GOOGLE_APP_ID, "string");
        if (resourcesIdentifier == 0) {
            return false;
        }
        return !android.text.TextUtils.isEmpty(context.getResources().getString(resourcesIdentifier));
    }
}
