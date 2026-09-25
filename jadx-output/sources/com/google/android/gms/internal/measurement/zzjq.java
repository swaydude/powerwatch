package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjq implements com.google.android.gms.internal.measurement.zzjn {
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zza;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zzb;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zzc;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Long> zzd;

    @Override // com.google.android.gms.internal.measurement.zzjn
    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjn
    public final boolean zzb() {
        return zzc.zzc().booleanValue();
    }

    static {
        com.google.android.gms.internal.measurement.zzcr zzcrVar = new com.google.android.gms.internal.measurement.zzcr(com.google.android.gms.internal.measurement.zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.sdk.dynamite.allow_remote_dynamite", false);
        zzb = zzcrVar.zza("measurement.collection.init_params_control_enabled", true);
        zzc = zzcrVar.zza("measurement.sdk.dynamite.use_dynamite2", false);
        zzd = zzcrVar.zza("measurement.id.sdk.dynamite.use_dynamite", 0L);
    }
}
