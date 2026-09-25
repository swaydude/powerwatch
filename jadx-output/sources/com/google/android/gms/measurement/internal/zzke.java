package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzke implements java.lang.Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzkc zzb;

    zzke(com.google.android.gms.measurement.internal.zzkc zzkcVar, long j) {
        this.zzb = zzkcVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
