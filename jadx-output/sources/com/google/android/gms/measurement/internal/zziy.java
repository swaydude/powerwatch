package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zziy implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzit zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zziw zzc;

    zziy(com.google.android.gms.measurement.internal.zziw zziwVar, com.google.android.gms.measurement.internal.zzit zzitVar, long j) {
        this.zzc = zziwVar;
        this.zza = zzitVar;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza(this.zza, false, this.zzb);
        this.zzc.zza = null;
        this.zzc.zzh().zza((com.google.android.gms.measurement.internal.zzit) null);
    }
}
