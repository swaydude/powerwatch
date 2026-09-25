package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzik implements java.lang.Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhp zzb;

    zzik(com.google.android.gms.measurement.internal.zzhp zzhpVar, long j) {
        this.zzb = zzhpVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs().zzk.zza(this.zza);
        this.zzb.zzr().zzw().zza("Minimum session duration set", java.lang.Long.valueOf(this.zza));
    }
}
