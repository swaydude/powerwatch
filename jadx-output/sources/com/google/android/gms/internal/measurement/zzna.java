package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzna implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmz> {
    private static com.google.android.gms.internal.measurement.zzna zza = new com.google.android.gms.internal.measurement.zzna();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmz> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzmz) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((com.google.android.gms.internal.measurement.zzmz) zza.zza()).zzb();
    }

    public static boolean zzd() {
        return ((com.google.android.gms.internal.measurement.zzmz) zza.zza()).zzc();
    }

    private zzna(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzmz> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzna() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zznc()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzmz zza() {
        return this.zzb.zza();
    }
}
