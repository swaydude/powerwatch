package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkt implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzkw> {
    private static com.google.android.gms.internal.measurement.zzkt zza = new com.google.android.gms.internal.measurement.zzkt();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzkw> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzkw) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((com.google.android.gms.internal.measurement.zzkw) zza.zza()).zzb();
    }

    private zzkt(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzkw> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzkt() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzkv()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzkw zza() {
        return this.zzb.zza();
    }
}
