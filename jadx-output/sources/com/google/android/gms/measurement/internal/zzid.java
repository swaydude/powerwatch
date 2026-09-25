package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzid implements java.lang.Runnable {
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhp zzb;

    zzid(com.google.android.gms.measurement.internal.zzhp zzhpVar, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.zzb = zzhpVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            try {
                this.zza.set(java.lang.Long.valueOf(this.zzb.zzt().zza(this.zzb.zzg().zzab(), com.google.android.gms.measurement.internal.zzap.zzak)));
                this.zza.notify();
            } catch (java.lang.Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
