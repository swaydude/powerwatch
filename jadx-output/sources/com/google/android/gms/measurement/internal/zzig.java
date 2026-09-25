package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzig implements java.lang.Runnable {
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhp zzb;

    zzig(com.google.android.gms.measurement.internal.zzhp zzhpVar, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.zzb = zzhpVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            try {
                this.zza.set(java.lang.Integer.valueOf(this.zzb.zzt().zzb(this.zzb.zzg().zzab(), com.google.android.gms.measurement.internal.zzap.zzal)));
                this.zza.notify();
            } catch (java.lang.Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
