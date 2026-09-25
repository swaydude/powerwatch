package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmo implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmn> {
    private static com.google.android.gms.internal.measurement.zzmo zza = new com.google.android.gms.internal.measurement.zzmo();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmn> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzmn) zza.zza()).zza();
    }

    private zzmo(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmn> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzmo() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzmq()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzmn zza() {
        return this.zzb.zza();
    }
}
