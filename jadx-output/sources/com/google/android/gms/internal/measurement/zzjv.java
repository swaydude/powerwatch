package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjv implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjy> {
    private static com.google.android.gms.internal.measurement.zzjv zza = new com.google.android.gms.internal.measurement.zzjv();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjy> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzjy) zza.zza()).zza();
    }

    private zzjv(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjy> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzjv() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzjx()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzjy zza() {
        return this.zzb.zza();
    }
}
