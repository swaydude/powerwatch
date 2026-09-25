package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzlz implements com.google.android.gms.internal.measurement.zzma {
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Long> zza;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Long> zzb;

    @Override // com.google.android.gms.internal.measurement.zzma
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final long zzb() {
        return zzb.zzc().longValue();
    }

    static {
        com.google.android.gms.internal.measurement.zzcr zzcrVar = new com.google.android.gms.internal.measurement.zzcr(com.google.android.gms.internal.measurement.zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.id.max_bundles_per_iteration", 0L);
        zzb = zzcrVar.zza("measurement.max_bundles_per_iteration", 1L);
    }
}
