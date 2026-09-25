package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzlk implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzlj> {
    private static com.google.android.gms.internal.measurement.zzlk zza = new com.google.android.gms.internal.measurement.zzlk();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzlj> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzlj) zza.zza()).zza();
    }

    private zzlk(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzlj> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzlk() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzlm()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzlj zza() {
        return this.zzb.zza();
    }
}
