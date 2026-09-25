package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmd implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmg> {
    private static com.google.android.gms.internal.measurement.zzmd zza = new com.google.android.gms.internal.measurement.zzmd();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmg> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzmg) zza.zza()).zza();
    }

    private zzmd(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmg> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzmd() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzmf()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzmg zza() {
        return this.zzb.zza();
    }
}
