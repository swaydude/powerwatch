package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkg implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzkf> {
    private static com.google.android.gms.internal.measurement.zzkg zza = new com.google.android.gms.internal.measurement.zzkg();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzkf> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzkf) zza.zza()).zza();
    }

    private zzkg(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzkf> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzkg() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzki()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzkf zza() {
        return this.zzb.zza();
    }
}
