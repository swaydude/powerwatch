package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzfy {
    private static final com.google.android.gms.internal.measurement.zzfy zza;
    private static final com.google.android.gms.internal.measurement.zzfy zzb;

    private zzfy() {
    }

    abstract <L> java.util.List<L> zza(java.lang.Object obj, long j);

    abstract <L> void zza(java.lang.Object obj, java.lang.Object obj2, long j);

    abstract void zzb(java.lang.Object obj, long j);

    static com.google.android.gms.internal.measurement.zzfy zza() {
        return zza;
    }

    static com.google.android.gms.internal.measurement.zzfy zzb() {
        return zzb;
    }

    static {
        com.google.android.gms.internal.measurement.zzfx zzfxVar = null;
        zza = new com.google.android.gms.internal.measurement.zzga();
        zzb = new com.google.android.gms.internal.measurement.zzfz();
    }
}
