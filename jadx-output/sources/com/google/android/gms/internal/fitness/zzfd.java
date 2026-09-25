package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfd {
    private static final java.lang.Class<?> zzrf = zzk("libcore.io.Memory");
    private static final boolean zzrg;

    static boolean zzan() {
        return (zzrf == null || zzrg) ? false : true;
    }

    static java.lang.Class<?> zzao() {
        return zzrf;
    }

    private static <T> java.lang.Class<T> zzk(java.lang.String str) {
        try {
            return (java.lang.Class<T>) java.lang.Class.forName(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static {
        zzrg = zzk("org.robolectric.Robolectric") != null;
    }
}
