package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzjk implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzix zzb;

    zzjk(com.google.android.gms.measurement.internal.zzix zzixVar, com.google.android.gms.measurement.internal.zzm zzmVar) {
        this.zzb = zzixVar;
        this.zza = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzfc zzfcVar = this.zzb.zzb;
        if (zzfcVar == null) {
            this.zzb.zzr().zzf().zza("Failed to send measurementEnabled to service");
            return;
        }
        try {
            zzfcVar.zzb(this.zza);
            this.zzb.zzaj();
        } catch (android.os.RemoteException e) {
            this.zzb.zzr().zzf().zza("Failed to send measurementEnabled to the service", e);
        }
    }
}
