package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgd implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgo zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzfk zzb;

    zzgd(com.google.android.gms.measurement.internal.zzge zzgeVar, com.google.android.gms.measurement.internal.zzgo zzgoVar, com.google.android.gms.measurement.internal.zzfk zzfkVar) {
        this.zza = zzgoVar;
        this.zzb = zzfkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.zzf() == null) {
            this.zzb.zzf().zza("Install Referrer Reporter is null");
        } else {
            this.zza.zzf().zza();
        }
    }
}
