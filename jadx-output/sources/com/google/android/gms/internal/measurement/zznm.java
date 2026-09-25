package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zznm implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zznl> {
    private static com.google.android.gms.internal.measurement.zznm zza = new com.google.android.gms.internal.measurement.zznm();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zznl> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zznl) zza.zza()).zza();
    }

    private zznm(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zznl> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zznm() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzno()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zznl zza() {
        return this.zzb.zza();
    }
}
