package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zznh implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zznk> {
    private static com.google.android.gms.internal.measurement.zznh zza = new com.google.android.gms.internal.measurement.zznh();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zznk> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zznk) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((com.google.android.gms.internal.measurement.zznk) zza.zza()).zzb();
    }

    private zznh(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zznk> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zznh() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zznj()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zznk zza() {
        return this.zzb.zza();
    }
}
