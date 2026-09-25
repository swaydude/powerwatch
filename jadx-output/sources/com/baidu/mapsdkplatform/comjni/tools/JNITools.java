package com.baidu.mapsdkplatform.comjni.tools;

/* JADX INFO: loaded from: classes.dex */
public class JNITools {
    public static native boolean CoordinateEncryptEx(float f, float f2, java.lang.String str, java.lang.Object obj);

    public static native boolean CoordinateEncryptMc(float f, float f2, java.lang.Object obj);

    public static native void GetDistanceByMC(java.lang.Object obj);

    public static native java.lang.String GetToken();

    public static native boolean TransGeoStr2ComplexPt(java.lang.Object obj);

    public static native boolean TransGeoStr2Pt(java.lang.Object obj);

    public static native void TransNodeStr2Pt(java.lang.Object obj);

    public static native double[] baiduToGcj(double d, double d2);

    public static native double[] gcjToBaidu(double d, double d2);

    public static native int initClass(java.lang.Object obj, int i);

    public static native void openLogEnable(boolean z, int i);

    public static native double[] wgsToBaidu(double d, double d2);
}
