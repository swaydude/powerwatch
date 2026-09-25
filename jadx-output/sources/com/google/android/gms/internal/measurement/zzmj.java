package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmj implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmm> {
    private static com.google.android.gms.internal.measurement.zzmj zza = new com.google.android.gms.internal.measurement.zzmj();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmm> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzmm) zza.zza()).zza();
    }

    public static double zzc() {
        return ((com.google.android.gms.internal.measurement.zzmm) zza.zza()).zzb();
    }

    public static long zzd() {
        return ((com.google.android.gms.internal.measurement.zzmm) zza.zza()).zzc();
    }

    public static long zze() {
        return ((com.google.android.gms.internal.measurement.zzmm) zza.zza()).zzd();
    }

    public static java.lang.String zzf() {
        return ((com.google.android.gms.internal.measurement.zzmm) zza.zza()).zze();
    }

    private zzmj(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmm> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzmj() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzml()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzmm zza() {
        return this.zzb.zza();
    }
}
