package com.baidu.mapapi.common;

/* JADX INFO: loaded from: classes.dex */
public class EnvironmentUtilities {
    static java.lang.String a;
    static java.lang.String b;
    static java.lang.String c;
    static int d;
    static int e;
    static int f;
    private static com.baidu.mapsdkplatform.comapi.util.g g;

    public static java.lang.String getAppCachePath() {
        return b;
    }

    public static java.lang.String getAppSDCardPath() {
        java.lang.String str = a + "/BaiduMapSDKNew";
        if (str.length() != 0) {
            java.io.File file = new java.io.File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return str;
    }

    public static java.lang.String getAppSecondCachePath() {
        return c;
    }

    public static int getDomTmpStgMax() {
        return e;
    }

    public static int getItsTmpStgMax() {
        return f;
    }

    public static int getMapTmpStgMax() {
        return d;
    }

    public static java.lang.String getSDCardPath() {
        return a;
    }

    public static void initAppDirectory(android.content.Context context) throws java.lang.Throwable {
        java.lang.String strC;
        if (g == null) {
            com.baidu.mapsdkplatform.comapi.util.g gVarA = com.baidu.mapsdkplatform.comapi.util.g.a();
            g = gVarA;
            gVarA.a(context);
        }
        java.lang.String str = a;
        if (str == null || str.length() <= 0) {
            a = g.b().a();
            strC = g.b().c();
        } else {
            strC = a + java.io.File.separator + "BaiduMapSDKNew" + java.io.File.separator + "cache";
        }
        b = strC;
        c = g.b().d();
        d = 20971520;
        e = 52428800;
        f = 5242880;
    }

    public static void setSDCardPath(java.lang.String str) {
        a = str;
    }
}
