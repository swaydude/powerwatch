package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzlw implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzlv> {
    private static com.google.android.gms.internal.measurement.zzlw zza = new com.google.android.gms.internal.measurement.zzlw();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzlv> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzlv) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((com.google.android.gms.internal.measurement.zzlv) zza.zza()).zzb();
    }

    public static boolean zzd() {
        return ((com.google.android.gms.internal.measurement.zzlv) zza.zza()).zzc();
    }

    private zzlw(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzlv> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzlw() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzly()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzlv zza() {
        return this.zzb.zza();
    }
}
