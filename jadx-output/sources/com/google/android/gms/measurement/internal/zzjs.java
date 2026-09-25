package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzjs implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzfc zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzb;

    zzjs(com.google.android.gms.measurement.internal.zzjp zzjpVar, com.google.android.gms.measurement.internal.zzfc zzfcVar) {
        this.zzb = zzjpVar;
        this.zza = zzfcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            com.google.android.gms.measurement.internal.zzjp.zza(this.zzb, false);
            if (!this.zzb.zza.zzab()) {
                this.zzb.zza.zzr().zzx().zza("Connected to service");
                this.zzb.zza.zza(this.zza);
            }
        }
    }
}
