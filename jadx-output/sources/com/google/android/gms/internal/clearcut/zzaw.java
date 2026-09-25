package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzaw {
    private static final java.lang.Class<?> zzfb = zze("libcore.io.Memory");
    private static final boolean zzfc;

    static {
        zzfc = zze("org.robolectric.Robolectric") != null;
    }

    private static <T> java.lang.Class<T> zze(java.lang.String str) {
        try {
            return (java.lang.Class<T>) java.lang.Class.forName(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static boolean zzx() {
        return (zzfb == null || zzfc) ? false : true;
    }

    static java.lang.Class<?> zzy() {
        return zzfb;
    }
}
