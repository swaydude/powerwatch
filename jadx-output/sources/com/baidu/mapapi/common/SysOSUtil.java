package com.baidu.mapapi.common;

/* JADX INFO: loaded from: classes.dex */
public class SysOSUtil {
    public static float getDensity() {
        return com.baidu.mapsdkplatform.comapi.util.h.c;
    }

    public static int getDensityDpi() {
        return com.baidu.mapsdkplatform.comapi.util.h.l();
    }

    public static java.lang.String getDeviceID() {
        java.lang.String strP = com.baidu.mapsdkplatform.comapi.util.h.p();
        return android.text.TextUtils.isEmpty(strP) ? strP : strP.substring(0, strP.indexOf("|"));
    }

    public static java.lang.String getModuleFileName() {
        return com.baidu.mapsdkplatform.comapi.util.h.o();
    }

    public static java.lang.String getPhoneType() {
        return com.baidu.mapsdkplatform.comapi.util.h.g();
    }

    public static int getScreenSizeX() {
        return com.baidu.mapsdkplatform.comapi.util.h.h();
    }

    public static int getScreenSizeY() {
        return com.baidu.mapsdkplatform.comapi.util.h.j();
    }
}
