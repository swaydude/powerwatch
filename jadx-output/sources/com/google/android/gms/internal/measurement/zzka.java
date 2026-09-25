package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzka implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjz> {
    private static com.google.android.gms.internal.measurement.zzka zza = new com.google.android.gms.internal.measurement.zzka();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjz> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzjz) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((com.google.android.gms.internal.measurement.zzjz) zza.zza()).zzb();
    }

    private zzka(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjz> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzka() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzkc()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzjz zza() {
        return this.zzb.zza();
    }
}
