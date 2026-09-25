package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkn implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzkq> {
    private static com.google.android.gms.internal.measurement.zzkn zza = new com.google.android.gms.internal.measurement.zzkn();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzkq> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzkq) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((com.google.android.gms.internal.measurement.zzkq) zza.zza()).zzb();
    }

    private zzkn(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzkq> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzkn() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzkp()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzkq zza() {
        return this.zzb.zza();
    }
}
