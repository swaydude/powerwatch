package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzlf implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzli> {
    private static com.google.android.gms.internal.measurement.zzlf zza = new com.google.android.gms.internal.measurement.zzlf();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzli> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzli) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((com.google.android.gms.internal.measurement.zzli) zza.zza()).zzb();
    }

    private zzlf(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzli> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzlf() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzlh()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzli zza() {
        return this.zzb.zza();
    }
}
