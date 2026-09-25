package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgq implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhq zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgo zzb;

    zzgq(com.google.android.gms.measurement.internal.zzgo zzgoVar, com.google.android.gms.measurement.internal.zzhq zzhqVar) {
        this.zzb = zzgoVar;
        this.zza = zzhqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza(this.zza);
        this.zzb.zza();
    }
}
