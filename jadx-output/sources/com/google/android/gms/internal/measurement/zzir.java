package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzir implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zziu> {
    private static com.google.android.gms.internal.measurement.zzir zza = new com.google.android.gms.internal.measurement.zzir();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zziu> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zziu) zza.zza()).zza();
    }

    private zzir(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zziu> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzir() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzit()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zziu zza() {
        return this.zzb.zza();
    }
}
