package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzjo implements java.lang.Runnable {
    private final /* synthetic */ java.lang.String zza;
    private final /* synthetic */ java.lang.String zzb;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zzc;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzn zzd;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzix zze;

    zzjo(com.google.android.gms.measurement.internal.zzix zzixVar, java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.zzm zzmVar, com.google.android.gms.internal.measurement.zzn zznVar) {
        this.zze = zzixVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzmVar;
        this.zzd = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList<android.os.Bundle> arrayList = new java.util.ArrayList<>();
        try {
            try {
                com.google.android.gms.measurement.internal.zzfc zzfcVar = this.zze.zzb;
                if (zzfcVar == null) {
                    this.zze.zzr().zzf().zza("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                    this.zze.zzp().zza(this.zzd, arrayList);
                } else {
                    java.util.ArrayList<android.os.Bundle> arrayListZzb = com.google.android.gms.measurement.internal.zzla.zzb(zzfcVar.zza(this.zza, this.zzb, this.zzc));
                    this.zze.zzaj();
                    this.zze.zzp().zza(this.zzd, arrayListZzb);
                }
            } catch (android.os.RemoteException e) {
                this.zze.zzr().zzf().zza("Failed to get conditional properties; remote exception", this.zza, this.zzb, e);
                this.zze.zzp().zza(this.zzd, arrayList);
            }
        } catch (java.lang.Throwable th) {
            this.zze.zzp().zza(this.zzd, arrayList);
            throw th;
        }
    }
}
