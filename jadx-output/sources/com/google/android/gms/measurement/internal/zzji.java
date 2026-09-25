package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzji implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzan zza;
    private final /* synthetic */ java.lang.String zzb;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzn zzc;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzix zzd;

    zzji(com.google.android.gms.measurement.internal.zzix zzixVar, com.google.android.gms.measurement.internal.zzan zzanVar, java.lang.String str, com.google.android.gms.internal.measurement.zzn zznVar) {
        this.zzd = zzixVar;
        this.zza = zzanVar;
        this.zzb = str;
        this.zzc = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                com.google.android.gms.measurement.internal.zzfc zzfcVar = this.zzd.zzb;
                if (zzfcVar == null) {
                    this.zzd.zzr().zzf().zza("Discarding data. Failed to send event to service to bundle");
                    this.zzd.zzp().zza(this.zzc, (byte[]) null);
                } else {
                    byte[] bArrZza = zzfcVar.zza(this.zza, this.zzb);
                    this.zzd.zzaj();
                    this.zzd.zzp().zza(this.zzc, bArrZza);
                }
            } catch (android.os.RemoteException e) {
                this.zzd.zzr().zzf().zza("Failed to send event to the service to bundle", e);
                this.zzd.zzp().zza(this.zzc, (byte[]) null);
            }
        } catch (java.lang.Throwable th) {
            this.zzd.zzp().zza(this.zzc, (byte[]) null);
            throw th;
        }
    }
}
