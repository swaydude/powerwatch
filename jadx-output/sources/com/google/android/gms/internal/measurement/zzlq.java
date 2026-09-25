package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzlq implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzlp> {
    private static com.google.android.gms.internal.measurement.zzlq zza = new com.google.android.gms.internal.measurement.zzlq();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzlp> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzlp) zza.zza()).zza();
    }

    private zzlq(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzlp> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzlq() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzls()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzlp zza() {
        return this.zzb.zza();
    }
}
