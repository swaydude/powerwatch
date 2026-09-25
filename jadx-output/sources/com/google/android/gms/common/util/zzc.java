package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class zzc {
    public static boolean isMainThread() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper();
    }
}
