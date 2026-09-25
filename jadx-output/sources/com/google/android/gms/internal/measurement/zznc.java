package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zznc implements com.google.android.gms.internal.measurement.zzmz {
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zza;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zzb;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zzc;

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final boolean zzb() {
        return zzb.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final boolean zzc() {
        return zzc.zzc().booleanValue();
    }

    static {
        com.google.android.gms.internal.measurement.zzcr zzcrVar = new com.google.android.gms.internal.measurement.zzcr(com.google.android.gms.internal.measurement.zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.service.sessions.remove_disabled_session_number", true);
        zzb = zzcrVar.zza("measurement.service.sessions.session_number_enabled", true);
        zzc = zzcrVar.zza("measurement.service.sessions.session_number_backfill_enabled", true);
    }
}
