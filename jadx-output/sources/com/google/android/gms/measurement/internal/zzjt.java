package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzjt implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zza;

    zzjt(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        this.zza = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzix zzixVar = this.zza.zza;
        android.content.Context contextZzn = this.zza.zza.zzn();
        this.zza.zza.zzu();
        zzixVar.zza(new android.content.ComponentName(contextZzn, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
