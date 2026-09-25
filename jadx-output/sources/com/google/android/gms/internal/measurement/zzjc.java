package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjc implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjb> {
    private static com.google.android.gms.internal.measurement.zzjc zza = new com.google.android.gms.internal.measurement.zzjc();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjb> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzjb) zza.zza()).zza();
    }

    private zzjc(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzjb> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzjc() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzje()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzjb zza() {
        return this.zzb.zza();
    }
}
