package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzjj implements java.lang.Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzan zzc;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zzd;
    private final /* synthetic */ java.lang.String zze;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzix zzf;

    zzjj(com.google.android.gms.measurement.internal.zzix zzixVar, boolean z, boolean z2, com.google.android.gms.measurement.internal.zzan zzanVar, com.google.android.gms.measurement.internal.zzm zzmVar, java.lang.String str) {
        this.zzf = zzixVar;
        this.zza = z;
        this.zzb = z2;
        this.zzc = zzanVar;
        this.zzd = zzmVar;
        this.zze = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzfc zzfcVar = this.zzf.zzb;
        if (zzfcVar == null) {
            this.zzf.zzr().zzf().zza("Discarding data. Failed to send event to service");
            return;
        }
        if (this.zza) {
            this.zzf.zza(zzfcVar, this.zzb ? null : this.zzc, this.zzd);
        } else {
            try {
                if (android.text.TextUtils.isEmpty(this.zze)) {
                    zzfcVar.zza(this.zzc, this.zzd);
                } else {
                    zzfcVar.zza(this.zzc, this.zze, this.zzf.zzr().zzy());
                }
            } catch (android.os.RemoteException e) {
                this.zzf.zzr().zzf().zza("Failed to send event to the service", e);
            }
        }
        this.zzf.zzaj();
    }
}
