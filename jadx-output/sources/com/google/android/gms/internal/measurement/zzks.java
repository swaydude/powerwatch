package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzks implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzkr> {
    private static com.google.android.gms.internal.measurement.zzks zza = new com.google.android.gms.internal.measurement.zzks();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzkr> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzkr) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((com.google.android.gms.internal.measurement.zzkr) zza.zza()).zzb();
    }

    private zzks(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzkr> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzks() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzku()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzkr zza() {
        return this.zzb.zza();
    }
}
