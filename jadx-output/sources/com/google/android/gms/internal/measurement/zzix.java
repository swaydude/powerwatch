package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzix implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzja> {
    private static com.google.android.gms.internal.measurement.zzix zza = new com.google.android.gms.internal.measurement.zzix();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzja> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzja) zza.zza()).zza();
    }

    private zzix(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzja> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzix() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zziz()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzja zza() {
        return this.zzb.zza();
    }
}
