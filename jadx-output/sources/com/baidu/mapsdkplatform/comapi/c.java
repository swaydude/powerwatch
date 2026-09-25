package com.baidu.mapsdkplatform.comapi;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static boolean a;

    public static void a(android.content.Context context, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (a) {
            return;
        }
        if (context == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: context can not be null");
        }
        if (!(context instanceof android.app.Application)) {
            throw new java.lang.RuntimeException("BDMapSDKException: context must be an ApplicationContext");
        }
        com.baidu.mapsdkplatform.comapi.NativeLoader.setContext(context);
        com.baidu.mapsdkplatform.comapi.NativeLoader.a(z, str);
        com.baidu.mapsdkplatform.comapi.a.a().a(context);
        com.baidu.mapsdkplatform.comapi.a.a().c();
        com.baidu.mapsdkplatform.comapi.a.a().a(str3);
        com.baidu.mapapi.JNIInitializer.setContext((android.app.Application) context);
        if (a(str2)) {
            com.baidu.mapapi.common.EnvironmentUtilities.setSDCardPath(str2);
        }
        com.baidu.mapapi.common.EnvironmentUtilities.initAppDirectory(context);
        com.baidu.mapsdkplatform.comapi.b.a.c.a().a(context);
        a = true;
    }

    private static boolean a(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            java.io.File file = new java.io.File(str + "/check.0");
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            if (!file.exists()) {
                return true;
            }
            file.delete();
            return true;
        } catch (java.io.IOException e) {
            android.util.Log.e("SDKInitializer", "SDCard cache path invalid", e);
            throw new java.lang.IllegalArgumentException("BDMapSDKException: Provided sdcard cache path invalid can not used.");
        }
    }
}
