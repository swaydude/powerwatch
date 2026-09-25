package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzc implements java.lang.Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzb zzb;

    zzc(com.google.android.gms.measurement.internal.zzb zzbVar, long j) {
        this.zzb = zzbVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
