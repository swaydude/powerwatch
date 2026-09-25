package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zznb implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzne> {
    private static com.google.android.gms.internal.measurement.zznb zza = new com.google.android.gms.internal.measurement.zznb();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzne> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzne) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((com.google.android.gms.internal.measurement.zzne) zza.zza()).zzb();
    }

    public static boolean zzd() {
        return ((com.google.android.gms.internal.measurement.zzne) zza.zza()).zzc();
    }

    private zznb(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzne> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zznb() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zznd()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzne zza() {
        return this.zzb.zza();
    }
}
