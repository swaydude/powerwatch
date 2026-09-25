package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzjd implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zza;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzn zzb;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzix zzc;

    zzjd(com.google.android.gms.measurement.internal.zzix zzixVar, com.google.android.gms.measurement.internal.zzm zzmVar, com.google.android.gms.internal.measurement.zzn zznVar) {
        this.zzc = zzixVar;
        this.zza = zzmVar;
        this.zzb = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                com.google.android.gms.measurement.internal.zzfc zzfcVar = this.zzc.zzb;
                if (zzfcVar == null) {
                    this.zzc.zzr().zzf().zza("Failed to get app instance id");
                    this.zzc.zzp().zza(this.zzb, (java.lang.String) null);
                    return;
                }
                java.lang.String strZzc = zzfcVar.zzc(this.zza);
                if (strZzc != null) {
                    this.zzc.zzf().zza(strZzc);
                    this.zzc.zzs().zzj.zza(strZzc);
                }
                this.zzc.zzaj();
                this.zzc.zzp().zza(this.zzb, strZzc);
            } catch (android.os.RemoteException e) {
                this.zzc.zzr().zzf().zza("Failed to get app instance id", e);
                this.zzc.zzp().zza(this.zzb, (java.lang.String) null);
            }
        } catch (java.lang.Throwable th) {
            this.zzc.zzp().zza(this.zzb, (java.lang.String) null);
            throw th;
        }
    }
}
