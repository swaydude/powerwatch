package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzjr implements java.lang.Runnable {
    private final /* synthetic */ android.content.ComponentName zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzb;

    zzjr(com.google.android.gms.measurement.internal.zzjp zzjpVar, android.content.ComponentName componentName) {
        this.zzb = zzjpVar;
        this.zza = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zza(this.zza);
    }
}
