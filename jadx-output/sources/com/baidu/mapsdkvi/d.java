package com.baidu.mapsdkvi;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class d {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[android.net.NetworkInfo.State.values().length];
        a = iArr;
        try {
            iArr[android.net.NetworkInfo.State.CONNECTED.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[android.net.NetworkInfo.State.CONNECTING.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            a[android.net.NetworkInfo.State.DISCONNECTED.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            a[android.net.NetworkInfo.State.DISCONNECTING.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            a[android.net.NetworkInfo.State.SUSPENDED.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
    }
}
