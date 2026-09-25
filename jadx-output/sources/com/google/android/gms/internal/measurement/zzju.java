package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzju implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjt> {
    private static com.google.android.gms.internal.measurement.zzju zza = new com.google.android.gms.internal.measurement.zzju();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjt> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzjt) zza.zza()).zza();
    }

    private zzju(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjt> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzju() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzjw()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzjt zza() {
        return this.zzb.zza();
    }
}
