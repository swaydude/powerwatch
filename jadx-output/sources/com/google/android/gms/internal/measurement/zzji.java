package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzji implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjh> {
    private static com.google.android.gms.internal.measurement.zzji zza = new com.google.android.gms.internal.measurement.zzji();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjh> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzjh) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((com.google.android.gms.internal.measurement.zzjh) zza.zza()).zzb();
    }

    private zzji(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjh> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzji() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzjk()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzjh zza() {
        return this.zzb.zza();
    }
}
