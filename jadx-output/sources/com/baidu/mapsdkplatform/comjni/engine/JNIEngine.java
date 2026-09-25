package com.baidu.mapsdkplatform.comjni.engine;

/* JADX INFO: loaded from: classes.dex */
public class JNIEngine {
    public static native boolean InitEngine(android.content.Context context);

    public static native void SetProxyInfo(java.lang.String str, int i);

    public static native boolean StartSocketProc();

    public static native boolean UnInitEngine();

    public static native int initClass(java.lang.Object obj, int i);
}
