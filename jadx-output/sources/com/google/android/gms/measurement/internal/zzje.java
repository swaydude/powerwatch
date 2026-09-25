package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzje implements java.lang.Runnable {
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zzb;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzix zzc;

    zzje(com.google.android.gms.measurement.internal.zzix zzixVar, java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.measurement.internal.zzm zzmVar) {
        this.zzc = zzixVar;
        this.zza = atomicReference;
        this.zzb = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            try {
                try {
                    com.google.android.gms.measurement.internal.zzfc zzfcVar = this.zzc.zzb;
                    if (zzfcVar == null) {
                        this.zzc.zzr().zzf().zza("Failed to get app instance id");
                        this.zza.notify();
                        return;
                    }
                    this.zza.set(zzfcVar.zzc(this.zzb));
                    java.lang.String str = (java.lang.String) this.zza.get();
                    if (str != null) {
                        this.zzc.zzf().zza(str);
                        this.zzc.zzs().zzj.zza(str);
                    }
                    this.zzc.zzaj();
                    this.zza.notify();
                } catch (android.os.RemoteException e) {
                    this.zzc.zzr().zzf().zza("Failed to get app instance id", e);
                    this.zza.notify();
                }
            } catch (java.lang.Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
