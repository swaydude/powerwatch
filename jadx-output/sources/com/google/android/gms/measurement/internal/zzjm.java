package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzjm implements java.lang.Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzv zzc;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zzd;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzv zze;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzix zzf;

    zzjm(com.google.android.gms.measurement.internal.zzix zzixVar, boolean z, boolean z2, com.google.android.gms.measurement.internal.zzv zzvVar, com.google.android.gms.measurement.internal.zzm zzmVar, com.google.android.gms.measurement.internal.zzv zzvVar2) {
        this.zzf = zzixVar;
        this.zza = z;
        this.zzb = z2;
        this.zzc = zzvVar;
        this.zzd = zzmVar;
        this.zze = zzvVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzfc zzfcVar = this.zzf.zzb;
        if (zzfcVar == null) {
            this.zzf.zzr().zzf().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.zza) {
            this.zzf.zza(zzfcVar, this.zzb ? null : this.zzc, this.zzd);
        } else {
            try {
                if (android.text.TextUtils.isEmpty(this.zze.zza)) {
                    zzfcVar.zza(this.zzc, this.zzd);
                } else {
                    zzfcVar.zza(this.zzc);
                }
            } catch (android.os.RemoteException e) {
                this.zzf.zzr().zzf().zza("Failed to send conditional user property to the service", e);
            }
        }
        this.zzf.zzaj();
    }
}
