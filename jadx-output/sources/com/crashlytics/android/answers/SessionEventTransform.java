package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class SessionEventTransform implements io.fabric.sdk.android.services.events.EventTransform<com.crashlytics.android.answers.SessionEvent> {
    static final java.lang.String APP_BUNDLE_ID_KEY = "appBundleId";
    static final java.lang.String APP_VERSION_CODE_KEY = "appVersionCode";
    static final java.lang.String APP_VERSION_NAME_KEY = "appVersionName";
    static final java.lang.String BETA_DEVICE_TOKEN_KEY = "betaDeviceToken";
    static final java.lang.String BUILD_ID_KEY = "buildId";
    static final java.lang.String CUSTOM_ATTRIBUTES = "customAttributes";
    static final java.lang.String CUSTOM_TYPE = "customType";
    static final java.lang.String DETAILS_KEY = "details";
    static final java.lang.String DEVICE_MODEL_KEY = "deviceModel";
    static final java.lang.String EXECUTION_ID_KEY = "executionId";
    static final java.lang.String INSTALLATION_ID_KEY = "installationId";
    static final java.lang.String LIMIT_AD_TRACKING_ENABLED_KEY = "limitAdTrackingEnabled";
    static final java.lang.String OS_VERSION_KEY = "osVersion";
    static final java.lang.String PREDEFINED_ATTRIBUTES = "predefinedAttributes";
    static final java.lang.String PREDEFINED_TYPE = "predefinedType";
    static final java.lang.String TIMESTAMP_KEY = "timestamp";
    static final java.lang.String TYPE_KEY = "type";

    SessionEventTransform() {
    }

    @Override // io.fabric.sdk.android.services.events.EventTransform
    public byte[] toBytes(com.crashlytics.android.answers.SessionEvent sessionEvent) throws java.io.IOException {
        return buildJsonForEvent(sessionEvent).toString().getBytes(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
    }

    public org.json.JSONObject buildJsonForEvent(com.crashlytics.android.answers.SessionEvent sessionEvent) throws java.io.IOException {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.crashlytics.android.answers.SessionEventMetadata sessionEventMetadata = sessionEvent.sessionEventMetadata;
            jSONObject.put(APP_BUNDLE_ID_KEY, sessionEventMetadata.appBundleId);
            jSONObject.put(EXECUTION_ID_KEY, sessionEventMetadata.executionId);
            jSONObject.put(INSTALLATION_ID_KEY, sessionEventMetadata.installationId);
            jSONObject.put(LIMIT_AD_TRACKING_ENABLED_KEY, sessionEventMetadata.limitAdTrackingEnabled);
            jSONObject.put(BETA_DEVICE_TOKEN_KEY, sessionEventMetadata.betaDeviceToken);
            jSONObject.put(BUILD_ID_KEY, sessionEventMetadata.buildId);
            jSONObject.put(OS_VERSION_KEY, sessionEventMetadata.osVersion);
            jSONObject.put(DEVICE_MODEL_KEY, sessionEventMetadata.deviceModel);
            jSONObject.put(APP_VERSION_CODE_KEY, sessionEventMetadata.appVersionCode);
            jSONObject.put(APP_VERSION_NAME_KEY, sessionEventMetadata.appVersionName);
            jSONObject.put("timestamp", sessionEvent.timestamp);
            jSONObject.put("type", sessionEvent.type.toString());
            if (sessionEvent.details != null) {
                jSONObject.put(DETAILS_KEY, new org.json.JSONObject(sessionEvent.details));
            }
            jSONObject.put(CUSTOM_TYPE, sessionEvent.customType);
            if (sessionEvent.customAttributes != null) {
                jSONObject.put(CUSTOM_ATTRIBUTES, new org.json.JSONObject(sessionEvent.customAttributes));
            }
            jSONObject.put(PREDEFINED_TYPE, sessionEvent.predefinedType);
            if (sessionEvent.predefinedAttributes != null) {
                jSONObject.put(PREDEFINED_ATTRIBUTES, new org.json.JSONObject(sessionEvent.predefinedAttributes));
            }
            return jSONObject;
        } catch (org.json.JSONException e) {
            if (android.os.Build.VERSION.SDK_INT >= 9) {
                throw new java.io.IOException(e.getMessage(), e);
            }
            throw new java.io.IOException(e.getMessage());
        }
    }
}
