package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzle implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzld> {
    private static com.google.android.gms.internal.measurement.zzle zza = new com.google.android.gms.internal.measurement.zzle();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzld> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzld) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((com.google.android.gms.internal.measurement.zzld) zza.zza()).zzb();
    }

    public static boolean zzd() {
        return ((com.google.android.gms.internal.measurement.zzld) zza.zza()).zzc();
    }

    public static boolean zze() {
        return ((com.google.android.gms.internal.measurement.zzld) zza.zza()).zzd();
    }

    private zzle(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzld> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzle() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzlg()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzld zza() {
        return this.zzb.zza();
    }
}
