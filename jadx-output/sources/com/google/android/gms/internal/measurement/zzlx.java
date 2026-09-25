package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzlx implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzma> {
    private static com.google.android.gms.internal.measurement.zzlx zza = new com.google.android.gms.internal.measurement.zzlx();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzma> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzma) zza.zza()).zza();
    }

    public static long zzc() {
        return ((com.google.android.gms.internal.measurement.zzma) zza.zza()).zzb();
    }

    private zzlx(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzma> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzlx() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzlz()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzma zza() {
        return this.zzb.zza();
    }
}
