package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zziw implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zziv> {
    private static com.google.android.gms.internal.measurement.zziw zza = new com.google.android.gms.internal.measurement.zziw();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zziv> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zziv) zza.zza()).zza();
    }

    private zziw(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zziv> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zziw() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zziy()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zziv zza() {
        return this.zzb.zza();
    }
}
