package com.baidu.mapapi;

/* JADX INFO: loaded from: classes.dex */
public class SDKInitializer {
    public static final java.lang.String SDK_BROADCAST_ACTION_STRING_NETWORK_ERROR = "network error";
    public static final java.lang.String SDK_BROADTCAST_ACTION_STRING_PERMISSION_CHECK_ERROR = "permission check error";
    public static final java.lang.String SDK_BROADTCAST_ACTION_STRING_PERMISSION_CHECK_OK = "permission check ok";
    public static final java.lang.String SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE = "error_code";
    public static final java.lang.String SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_MESSAGE = "error_message";
    private static com.baidu.mapapi.CoordType a = com.baidu.mapapi.CoordType.BD09LL;

    private SDKInitializer() {
    }

    public static com.baidu.mapapi.CoordType getCoordType() {
        return a;
    }

    public static void initialize(android.content.Context context) {
        com.baidu.mapsdkplatform.comapi.c.a(context, false, null, null, null);
    }

    public static void initialize(android.content.Context context, boolean z, java.lang.String str, java.lang.String str2) {
        com.baidu.mapsdkplatform.comapi.c.a(context, z, str, str2, null);
    }

    public static void initialize(java.lang.String str, android.content.Context context) {
        com.baidu.mapsdkplatform.comapi.c.a(context, false, null, str, null);
    }

    public static boolean isHttpsEnable() {
        return com.baidu.mapapi.http.HttpClient.isHttpsEnable;
    }

    public static void setCoordType(com.baidu.mapapi.CoordType coordType) {
        a = coordType;
    }

    public static void setHttpsEnable(boolean z) {
        com.baidu.mapapi.http.HttpClient.isHttpsEnable = z;
    }
}
