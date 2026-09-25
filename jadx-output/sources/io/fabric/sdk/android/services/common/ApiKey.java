package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
public class ApiKey {
    static final java.lang.String CRASHLYTICS_API_KEY = "com.crashlytics.ApiKey";
    static final java.lang.String FABRIC_API_KEY = "io.fabric.ApiKey";
    static final java.lang.String STRING_TWITTER_CONSUMER_SECRET = "@string/twitter_consumer_secret";

    protected java.lang.String buildApiKeyInstructions() {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    @java.lang.Deprecated
    public static java.lang.String getApiKey(android.content.Context context) {
        io.fabric.sdk.android.Fabric.getLogger().w(io.fabric.sdk.android.Fabric.TAG, "getApiKey(context) is deprecated, please upgrade kit(s) to the latest version.");
        return new io.fabric.sdk.android.services.common.ApiKey().getValue(context);
    }

    @java.lang.Deprecated
    public static java.lang.String getApiKey(android.content.Context context, boolean z) {
        io.fabric.sdk.android.Fabric.getLogger().w(io.fabric.sdk.android.Fabric.TAG, "getApiKey(context, debug) is deprecated, please upgrade kit(s) to the latest version.");
        return new io.fabric.sdk.android.services.common.ApiKey().getValue(context);
    }

    public java.lang.String getValue(android.content.Context context) {
        java.lang.String apiKeyFromManifest = getApiKeyFromManifest(context);
        if (android.text.TextUtils.isEmpty(apiKeyFromManifest)) {
            apiKeyFromManifest = getApiKeyFromStrings(context);
        }
        if (android.text.TextUtils.isEmpty(apiKeyFromManifest)) {
            apiKeyFromManifest = getApiKeyFromFirebaseAppId(context);
        }
        if (android.text.TextUtils.isEmpty(apiKeyFromManifest)) {
            logErrorOrThrowException(context);
        }
        return apiKeyFromManifest;
    }

    protected java.lang.String getApiKeyFromFirebaseAppId(android.content.Context context) {
        return new io.fabric.sdk.android.services.common.FirebaseInfo().getApiKeyFromFirebaseAppId(context);
    }

    protected java.lang.String getApiKeyFromManifest(android.content.Context context) {
        java.lang.String str = null;
        try {
            android.os.Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            java.lang.String string = bundle.getString(FABRIC_API_KEY);
            try {
                if (STRING_TWITTER_CONSUMER_SECRET.equals(string)) {
                    io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");
                } else {
                    str = string;
                }
                if (str != null) {
                    return str;
                }
                io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Falling back to Crashlytics key lookup from Manifest");
                return bundle.getString(CRASHLYTICS_API_KEY);
            } catch (java.lang.Exception e) {
                e = e;
                str = string;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
        io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Caught non-fatal exception while retrieving apiKey: " + e);
        return str;
    }

    protected java.lang.String getApiKeyFromStrings(android.content.Context context) {
        int resourcesIdentifier = io.fabric.sdk.android.services.common.CommonUtils.getResourcesIdentifier(context, FABRIC_API_KEY, "string");
        if (resourcesIdentifier == 0) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Falling back to Crashlytics key lookup from Strings");
            resourcesIdentifier = io.fabric.sdk.android.services.common.CommonUtils.getResourcesIdentifier(context, CRASHLYTICS_API_KEY, "string");
        }
        if (resourcesIdentifier != 0) {
            return context.getResources().getString(resourcesIdentifier);
        }
        return null;
    }

    protected void logErrorOrThrowException(android.content.Context context) {
        if (io.fabric.sdk.android.Fabric.isDebuggable() || io.fabric.sdk.android.services.common.CommonUtils.isAppDebuggable(context)) {
            throw new java.lang.IllegalArgumentException(buildApiKeyInstructions());
        }
        io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, buildApiKeyInstructions());
    }
}
