package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzls implements com.google.android.gms.internal.measurement.zzlp {
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zza;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Long> zzb;

    @Override // com.google.android.gms.internal.measurement.zzlp
    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    static {
        com.google.android.gms.internal.measurement.zzcr zzcrVar = new com.google.android.gms.internal.measurement.zzcr(com.google.android.gms.internal.measurement.zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", false);
        zzb = zzcrVar.zza("measurement.id.referrer.enable_logging_install_referrer_cmp_from_apk", 0L);
    }
}
