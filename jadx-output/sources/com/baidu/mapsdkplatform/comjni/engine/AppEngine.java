package com.baidu.mapsdkplatform.comjni.engine;

/* JADX INFO: loaded from: classes.dex */
public class AppEngine {
    public static void InitClass() {
        com.baidu.mapsdkplatform.comjni.engine.JNIEngine.initClass(new android.os.Bundle(), 0);
    }

    public static boolean InitEngine(android.content.Context context) {
        return com.baidu.mapsdkplatform.comjni.engine.JNIEngine.InitEngine(context);
    }

    public static void SetProxyInfo(java.lang.String str, int i) {
        com.baidu.mapsdkplatform.comjni.engine.JNIEngine.SetProxyInfo(str, i);
    }

    public static boolean StartSocketProc() {
        return com.baidu.mapsdkplatform.comjni.engine.JNIEngine.StartSocketProc();
    }

    public static boolean UnInitEngine() {
        return com.baidu.mapsdkplatform.comjni.engine.JNIEngine.UnInitEngine();
    }

    public static void despatchMessage(int i, int i2, int i3, long j) {
        com.baidu.mapsdkplatform.comjni.engine.a.a(i, i2, i3, j);
    }
}
