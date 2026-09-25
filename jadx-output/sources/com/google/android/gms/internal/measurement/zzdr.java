package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzdr {
    private static final java.lang.Class<?> zza = zza("libcore.io.Memory");
    private static final boolean zzb;

    static boolean zza() {
        return (zza == null || zzb) ? false : true;
    }

    static java.lang.Class<?> zzb() {
        return zza;
    }

    private static <T> java.lang.Class<T> zza(java.lang.String str) {
        try {
            return (java.lang.Class<T>) java.lang.Class.forName(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static {
        zzb = zza("org.robolectric.Robolectric") != null;
    }
}
