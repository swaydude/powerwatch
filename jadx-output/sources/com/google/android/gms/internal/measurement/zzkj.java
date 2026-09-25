package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkj implements com.google.android.gms.internal.measurement.zzkk {
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zza;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Long> zzb;

    @Override // com.google.android.gms.internal.measurement.zzkk
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzkk
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    static {
        com.google.android.gms.internal.measurement.zzcr zzcrVar = new com.google.android.gms.internal.measurement.zzcr(com.google.android.gms.internal.measurement.zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.sdk.referrer.delayed_install_referrer_api", false);
        zzb = zzcrVar.zza("measurement.id.sdk.referrer.delayed_install_referrer_api", 0L);
    }
}
