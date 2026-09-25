package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzjg implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzix zzc;

    zzjg(com.google.android.gms.measurement.internal.zzix zzixVar, com.google.android.gms.measurement.internal.zzm zzmVar, boolean z) {
        this.zzc = zzixVar;
        this.zza = zzmVar;
        this.zzb = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzfc zzfcVar = this.zzc.zzb;
        if (zzfcVar == null) {
            this.zzc.zzr().zzf().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzfcVar.zza(this.zza);
            if (this.zzb) {
                this.zzc.zzj().zzad();
            }
            this.zzc.zza(zzfcVar, (com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable) null, this.zza);
            this.zzc.zzaj();
        } catch (android.os.RemoteException e) {
            this.zzc.zzr().zzf().zza("Failed to send app launch to the service", e);
        }
    }
}
