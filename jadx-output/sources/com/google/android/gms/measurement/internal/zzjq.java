package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzjq implements java.lang.Runnable {
    private final /* synthetic */ java.lang.String zza;
    private final /* synthetic */ java.lang.String zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zzd;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzn zze;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzix zzf;

    zzjq(com.google.android.gms.measurement.internal.zzix zzixVar, java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.measurement.internal.zzm zzmVar, com.google.android.gms.internal.measurement.zzn zznVar) {
        this.zzf = zzixVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = zzmVar;
        this.zze = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            try {
                com.google.android.gms.measurement.internal.zzfc zzfcVar = this.zzf.zzb;
                if (zzfcVar == null) {
                    this.zzf.zzr().zzf().zza("Failed to get user properties; not connected to service", this.zza, this.zzb);
                    this.zzf.zzp().zza(this.zze, bundle);
                } else {
                    android.os.Bundle bundleZza = com.google.android.gms.measurement.internal.zzla.zza(zzfcVar.zza(this.zza, this.zzb, this.zzc, this.zzd));
                    this.zzf.zzaj();
                    this.zzf.zzp().zza(this.zze, bundleZza);
                }
            } catch (android.os.RemoteException e) {
                this.zzf.zzr().zzf().zza("Failed to get user properties; remote exception", this.zza, e);
                this.zzf.zzp().zza(this.zze, bundle);
            }
        } catch (java.lang.Throwable th) {
            this.zzf.zzp().zza(this.zze, bundle);
            throw th;
        }
    }
}
