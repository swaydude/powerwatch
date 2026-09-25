package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjo implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjn> {
    private static com.google.android.gms.internal.measurement.zzjo zza = new com.google.android.gms.internal.measurement.zzjo();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjn> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzjn) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((com.google.android.gms.internal.measurement.zzjn) zza.zza()).zzb();
    }

    private zzjo(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjn> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzjo() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzjq()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzjn zza() {
        return this.zzb.zza();
    }
}
