package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzlt implements com.google.android.gms.internal.measurement.zzlu {
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zza;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zzb;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zzc;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zzd;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zze;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Long> zzf;

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzc() {
        return zzb.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzd() {
        return zzc.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zze() {
        return zzd.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzf() {
        return zze.zzc().booleanValue();
    }

    static {
        com.google.android.gms.internal.measurement.zzcr zzcrVar = new com.google.android.gms.internal.measurement.zzcr(com.google.android.gms.internal.measurement.zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.sdk.collection.enable_extend_user_property_size", true);
        zzb = zzcrVar.zza("measurement.sdk.collection.last_deep_link_referrer2", true);
        zzc = zzcrVar.zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzd = zzcrVar.zza("measurement.sdk.collection.last_gclid_from_referrer2", false);
        zze = zzcrVar.zza("measurement.sdk.collection.worker_thread_referrer", true);
        zzf = zzcrVar.zza("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }
}
