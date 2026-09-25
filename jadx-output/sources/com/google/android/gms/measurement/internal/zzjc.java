package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzjc implements java.lang.Runnable {
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzix zzd;

    zzjc(com.google.android.gms.measurement.internal.zzix zzixVar, java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.measurement.internal.zzm zzmVar, boolean z) {
        this.zzd = zzixVar;
        this.zza = atomicReference;
        this.zzb = zzmVar;
        this.zzc = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            try {
                try {
                    com.google.android.gms.measurement.internal.zzfc zzfcVar = this.zzd.zzb;
                    if (zzfcVar == null) {
                        this.zzd.zzr().zzf().zza("Failed to get all user properties; not connected to service");
                        this.zza.notify();
                    } else {
                        this.zza.set(zzfcVar.zza(this.zzb, this.zzc));
                        this.zzd.zzaj();
                        this.zza.notify();
                    }
                } catch (android.os.RemoteException e) {
                    this.zzd.zzr().zzf().zza("Failed to get all user properties; remote exception", e);
                    this.zza.notify();
                }
            } catch (java.lang.Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
