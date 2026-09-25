package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzng implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zznf> {
    private static com.google.android.gms.internal.measurement.zzng zza = new com.google.android.gms.internal.measurement.zzng();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zznf> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zznf) zza.zza()).zza();
    }

    private zzng(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zznf> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzng() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzni()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zznf zza() {
        return this.zzb.zza();
    }
}
