package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzll implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzlo> {
    private static com.google.android.gms.internal.measurement.zzll zza = new com.google.android.gms.internal.measurement.zzll();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzlo> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzlo) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((com.google.android.gms.internal.measurement.zzlo) zza.zza()).zzb();
    }

    private zzll(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzlo> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzll() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzln()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzlo zza() {
        return this.zzb.zza();
    }
}
