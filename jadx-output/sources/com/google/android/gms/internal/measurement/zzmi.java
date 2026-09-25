package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmi implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmh> {
    private static com.google.android.gms.internal.measurement.zzmi zza = new com.google.android.gms.internal.measurement.zzmi();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmh> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzmh) zza.zza()).zza();
    }

    private zzmi(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmh> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzmi() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzmk()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzmh zza() {
        return this.zzb.zza();
    }
}
