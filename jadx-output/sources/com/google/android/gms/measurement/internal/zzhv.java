package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzhv implements java.lang.Runnable {
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhp zzb;

    zzhv(com.google.android.gms.measurement.internal.zzhp zzhpVar, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.zzb = zzhpVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzh().zza(this.zza);
    }
}
