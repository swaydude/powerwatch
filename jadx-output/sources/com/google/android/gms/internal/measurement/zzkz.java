package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkz implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzlc> {
    private static com.google.android.gms.internal.measurement.zzkz zza = new com.google.android.gms.internal.measurement.zzkz();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzlc> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzlc) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((com.google.android.gms.internal.measurement.zzlc) zza.zza()).zzb();
    }

    private zzkz(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzlc> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzkz() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzlb()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzlc zza() {
        return this.zzb.zza();
    }
}
