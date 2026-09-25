package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzfu implements java.lang.Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzfr zzb;

    zzfu(com.google.android.gms.measurement.internal.zzfr zzfrVar, boolean z) {
        this.zzb = zzfrVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zza(this.zza);
    }
}
