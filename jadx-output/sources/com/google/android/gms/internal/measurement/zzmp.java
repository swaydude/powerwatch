package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmp implements com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzms> {
    private static com.google.android.gms.internal.measurement.zzmp zza = new com.google.android.gms.internal.measurement.zzmp();
    private final com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzms> zzb;

    public static boolean zzb() {
        return ((com.google.android.gms.internal.measurement.zzms) zza.zza()).zza();
    }

    private zzmp(com.google.android.gms.internal.measurement.zzcz<com.google.android.gms.internal.measurement.zzms> zzczVar) {
        this.zzb = com.google.android.gms.internal.measurement.zzdc.zza((com.google.android.gms.internal.measurement.zzcz) zzczVar);
    }

    public zzmp() {
        this(com.google.android.gms.internal.measurement.zzdc.zza(new com.google.android.gms.internal.measurement.zzmr()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzms zza() {
        return this.zzb.zza();
    }
}
