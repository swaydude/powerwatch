package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzkr implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzkx zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzks zzb;

    zzkr(com.google.android.gms.measurement.internal.zzks zzksVar, com.google.android.gms.measurement.internal.zzkx zzkxVar) {
        this.zzb = zzksVar;
        this.zza = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza(this.zza);
        this.zzb.zza();
    }
}
