package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class f {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[com.baidu.mapsdkplatform.comapi.map.ac.values().length];
        b = iArr;
        try {
            iArr[com.baidu.mapsdkplatform.comapi.map.ac.TextureView.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            b[com.baidu.mapsdkplatform.comapi.map.ac.GLSurfaceView.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[com.baidu.mapapi.map.MyLocationConfiguration.LocationMode.values().length];
        a = iArr2;
        try {
            iArr2[com.baidu.mapapi.map.MyLocationConfiguration.LocationMode.COMPASS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            a[com.baidu.mapapi.map.MyLocationConfiguration.LocationMode.FOLLOWING.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            a[com.baidu.mapapi.map.MyLocationConfiguration.LocationMode.NORMAL.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
    }
}
