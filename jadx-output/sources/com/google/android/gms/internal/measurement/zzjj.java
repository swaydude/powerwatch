package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjj implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjm> {
    private static com.google.android.gms.internal.measurement.zzjj zza = new com.google.android.gms.internal.measurement.zzjj();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjm> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzjm) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((com.google.android.gms.internal.measurement.zzjm) zza.zza()).zzb();
    }

    private zzjj(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjm> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzjj() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzjl()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzjm zza() {
        return this.zzb.zza();
    }
}
