package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzjf implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzit zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzix zzb;

    zzjf(com.google.android.gms.measurement.internal.zzix zzixVar, com.google.android.gms.measurement.internal.zzit zzitVar) {
        this.zzb = zzixVar;
        this.zza = zzitVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzfc zzfcVar = this.zzb.zzb;
        if (zzfcVar == null) {
            this.zzb.zzr().zzf().zza("Failed to send current screen to service");
            return;
        }
        try {
            com.google.android.gms.measurement.internal.zzit zzitVar = this.zza;
            if (zzitVar == null) {
                zzfcVar.zza(0L, (java.lang.String) null, (java.lang.String) null, this.zzb.zzn().getPackageName());
            } else {
                zzfcVar.zza(zzitVar.zzc, this.zza.zza, this.zza.zzb, this.zzb.zzn().getPackageName());
            }
            this.zzb.zzaj();
        } catch (android.os.RemoteException e) {
            this.zzb.zzr().zzf().zza("Failed to send current screen to the service", e);
        }
    }
}
