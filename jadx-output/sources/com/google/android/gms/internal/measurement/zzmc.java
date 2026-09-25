package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmc implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmb> {
    private static com.google.android.gms.internal.measurement.zzmc zza = new com.google.android.gms.internal.measurement.zzmc();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmb> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzmb) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((com.google.android.gms.internal.measurement.zzmb) zza.zza()).zzb();
    }

    private zzmc(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmb> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzmc() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzme()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzmb zza() {
        return this.zzb.zza();
    }
}
