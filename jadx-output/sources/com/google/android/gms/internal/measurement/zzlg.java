package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzlg implements com.google.android.gms.internal.measurement.zzld {
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zza;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zzb;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zzc;

    @Override // com.google.android.gms.internal.measurement.zzld
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final boolean zzc() {
        return zzb.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final boolean zzd() {
        return zzc.zzc().booleanValue();
    }

    static {
        com.google.android.gms.internal.measurement.zzcr zzcrVar = new com.google.android.gms.internal.measurement.zzcr(com.google.android.gms.internal.measurement.zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.client.sessions.check_on_reset_and_enable", false);
        zzb = zzcrVar.zza("measurement.client.sessions.check_on_startup", true);
        zzc = zzcrVar.zza("measurement.client.sessions.start_session_before_view_screen", true);
    }
}
