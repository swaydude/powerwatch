package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfa {
    private static final java.lang.Class<?> zzrm = zzv("libcore.io.Memory");
    private static final boolean zzrn;

    static boolean zzdr() {
        return (zzrm == null || zzrn) ? false : true;
    }

    static java.lang.Class<?> zzds() {
        return zzrm;
    }

    private static <T> java.lang.Class<T> zzv(java.lang.String str) {
        try {
            return (java.lang.Class<T>) java.lang.Class.forName(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static {
        zzrn = zzv("org.robolectric.Robolectric") != null;
    }
}
