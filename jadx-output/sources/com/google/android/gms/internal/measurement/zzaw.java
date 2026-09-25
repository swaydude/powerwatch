package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzaw extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhn zzc;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaw(com.google.android.gms.internal.measurement.zzx zzxVar, com.google.android.gms.measurement.internal.zzhn zzhnVar) {
        super(zzxVar);
        this.zzd = zzxVar;
        this.zzc = zzhnVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws android.os.RemoteException {
        for (int i = 0; i < this.zzd.zzf.size(); i++) {
            if (this.zzc.equals(((android.util.Pair) this.zzd.zzf.get(i)).first)) {
                android.util.Log.w(this.zzd.zzc, "OnEventListener already registered.");
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzx.zzb zzbVar = new com.google.android.gms.internal.measurement.zzx.zzb(this.zzc);
        this.zzd.zzf.add(new android.util.Pair(this.zzc, zzbVar));
        this.zzd.zzr.registerOnMeasurementEventListener(zzbVar);
    }
}
