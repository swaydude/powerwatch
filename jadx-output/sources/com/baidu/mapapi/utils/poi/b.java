package com.baidu.mapapi.utils.poi;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class b {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[com.baidu.mapapi.http.HttpClient.HttpStateError.values().length];
        b = iArr;
        try {
            iArr[com.baidu.mapapi.http.HttpClient.HttpStateError.NETWORK_ERROR.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            b[com.baidu.mapapi.http.HttpClient.HttpStateError.INNER_ERROR.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[com.baidu.platform.comapi.pano.PanoStateError.values().length];
        a = iArr2;
        try {
            iArr2[com.baidu.platform.comapi.pano.PanoStateError.PANO_UID_ERROR.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            a[com.baidu.platform.comapi.pano.PanoStateError.PANO_NOT_FOUND.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            a[com.baidu.platform.comapi.pano.PanoStateError.PANO_NO_TOKEN.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            a[com.baidu.platform.comapi.pano.PanoStateError.PANO_NO_ERROR.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
    }
}
