package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzjw implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zza;

    zzjw(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        this.zza = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzix.zza(this.zza.zza, (com.google.android.gms.measurement.internal.zzfc) null);
        this.zza.zza.zzal();
    }
}
