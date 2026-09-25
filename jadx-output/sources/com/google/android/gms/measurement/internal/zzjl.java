package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzjl implements java.lang.Runnable {
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    private final /* synthetic */ java.lang.String zzb;
    private final /* synthetic */ java.lang.String zzc;
    private final /* synthetic */ java.lang.String zzd;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zze;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzix zzf;

    zzjl(com.google.android.gms.measurement.internal.zzix zzixVar, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.measurement.internal.zzm zzmVar) {
        this.zzf = zzixVar;
        this.zza = atomicReference;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            try {
                try {
                    com.google.android.gms.measurement.internal.zzfc zzfcVar = this.zzf.zzb;
                    if (zzfcVar == null) {
                        this.zzf.zzr().zzf().zza("(legacy) Failed to get conditional properties; not connected to service", com.google.android.gms.measurement.internal.zzfk.zza(this.zzb), this.zzc, this.zzd);
                        this.zza.set(java.util.Collections.emptyList());
                        this.zza.notify();
                    } else {
                        if (android.text.TextUtils.isEmpty(this.zzb)) {
                            this.zza.set(zzfcVar.zza(this.zzc, this.zzd, this.zze));
                        } else {
                            this.zza.set(zzfcVar.zza(this.zzb, this.zzc, this.zzd));
                        }
                        this.zzf.zzaj();
                        this.zza.notify();
                    }
                } catch (android.os.RemoteException e) {
                    this.zzf.zzr().zzf().zza("(legacy) Failed to get conditional properties; remote exception", com.google.android.gms.measurement.internal.zzfk.zza(this.zzb), this.zzc, e);
                    this.zza.set(java.util.Collections.emptyList());
                    this.zza.notify();
                }
            } catch (java.lang.Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
