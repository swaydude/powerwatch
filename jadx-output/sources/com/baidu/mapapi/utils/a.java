package com.baidu.mapapi.utils;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class a {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.baidu.mapapi.utils.CoordinateConverter.CoordType.values().length];
        a = iArr;
        try {
            iArr[com.baidu.mapapi.utils.CoordinateConverter.CoordType.COMMON.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[com.baidu.mapapi.utils.CoordinateConverter.CoordType.GPS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            a[com.baidu.mapapi.utils.CoordinateConverter.CoordType.BD09LL.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            a[com.baidu.mapapi.utils.CoordinateConverter.CoordType.BD09MC.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
    }
}
