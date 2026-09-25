package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
class AdvertisingInfoReflectionStrategy implements io.fabric.sdk.android.services.common.AdvertisingInfoStrategy {
    private static final java.lang.String CLASS_NAME_ADVERTISING_ID_CLIENT = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
    private static final java.lang.String CLASS_NAME_ADVERTISING_ID_CLIENT_INFO = "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info";
    private static final java.lang.String CLASS_NAME_GOOGLE_PLAY_SERVICES_UTILS = "com.google.android.gms.common.GooglePlayServicesUtil";
    private static final int GOOGLE_PLAY_SERVICES_SUCCESS_CODE = 0;
    private static final java.lang.String METHOD_NAME_GET_ADVERTISING_ID_INFO = "getAdvertisingIdInfo";
    private static final java.lang.String METHOD_NAME_GET_ID = "getId";
    private static final java.lang.String METHOD_NAME_IS_GOOGLE_PLAY_SERVICES_AVAILABLE = "isGooglePlayServicesAvailable";
    private static final java.lang.String METHOD_NAME_IS_LIMITED_AD_TRACKING_ENABLED = "isLimitAdTrackingEnabled";
    private final android.content.Context context;

    public AdvertisingInfoReflectionStrategy(android.content.Context context) {
        this.context = context.getApplicationContext();
    }

    boolean isGooglePlayServiceAvailable(android.content.Context context) {
        try {
            return ((java.lang.Integer) java.lang.Class.forName(CLASS_NAME_GOOGLE_PLAY_SERVICES_UTILS).getMethod(METHOD_NAME_IS_GOOGLE_PLAY_SERVICES_AVAILABLE, android.content.Context.class).invoke(null, context)).intValue() == 0;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // io.fabric.sdk.android.services.common.AdvertisingInfoStrategy
    public io.fabric.sdk.android.services.common.AdvertisingInfo getAdvertisingInfo() {
        if (isGooglePlayServiceAvailable(this.context)) {
            return new io.fabric.sdk.android.services.common.AdvertisingInfo(getAdvertisingId(), isLimitAdTrackingEnabled());
        }
        return null;
    }

    private java.lang.String getAdvertisingId() {
        try {
            return (java.lang.String) java.lang.Class.forName(CLASS_NAME_ADVERTISING_ID_CLIENT_INFO).getMethod(METHOD_NAME_GET_ID, new java.lang.Class[0]).invoke(getInfo(), new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            io.fabric.sdk.android.Fabric.getLogger().w(io.fabric.sdk.android.Fabric.TAG, "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return null;
        }
    }

    private boolean isLimitAdTrackingEnabled() {
        try {
            return ((java.lang.Boolean) java.lang.Class.forName(CLASS_NAME_ADVERTISING_ID_CLIENT_INFO).getMethod(METHOD_NAME_IS_LIMITED_AD_TRACKING_ENABLED, new java.lang.Class[0]).invoke(getInfo(), new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Exception unused) {
            io.fabric.sdk.android.Fabric.getLogger().w(io.fabric.sdk.android.Fabric.TAG, "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return false;
        }
    }

    private java.lang.Object getInfo() {
        try {
            return java.lang.Class.forName(CLASS_NAME_ADVERTISING_ID_CLIENT).getMethod(METHOD_NAME_GET_ADVERTISING_ID_INFO, android.content.Context.class).invoke(null, this.context);
        } catch (java.lang.Exception unused) {
            io.fabric.sdk.android.Fabric.getLogger().w(io.fabric.sdk.android.Fabric.TAG, "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
            return null;
        }
    }
}
