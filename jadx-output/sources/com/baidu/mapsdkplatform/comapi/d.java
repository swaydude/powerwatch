package com.baidu.mapsdkplatform.comapi;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class d {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.baidu.mapsdkplatform.comapi.NativeLoader.a.values().length];
        a = iArr;
        try {
            iArr[com.baidu.mapsdkplatform.comapi.NativeLoader.a.ARM64.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[com.baidu.mapsdkplatform.comapi.NativeLoader.a.ARMV7.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            a[com.baidu.mapsdkplatform.comapi.NativeLoader.a.ARMEABI.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            a[com.baidu.mapsdkplatform.comapi.NativeLoader.a.X86_64.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            a[com.baidu.mapsdkplatform.comapi.NativeLoader.a.X86.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
    }
}
