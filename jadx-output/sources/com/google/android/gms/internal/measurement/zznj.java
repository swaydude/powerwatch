package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zznj implements com.google.android.gms.internal.measurement.zznk {
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zza = new com.google.android.gms.internal.measurement.zzcr(com.google.android.gms.internal.measurement.zzcm.zza("com.google.android.gms.measurement")).zza("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.zznk
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }
}
