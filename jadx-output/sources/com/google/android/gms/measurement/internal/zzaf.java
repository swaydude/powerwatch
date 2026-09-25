package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzaf {
    private static volatile android.os.Handler zzb;
    private final com.google.android.gms.measurement.internal.zzhh zza;
    private final java.lang.Runnable zzc;
    private volatile long zzd;

    zzaf(com.google.android.gms.measurement.internal.zzhh zzhhVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhhVar);
        this.zza = zzhhVar;
        this.zzc = new com.google.android.gms.measurement.internal.zzai(this, zzhhVar);
    }

    public abstract void zza();

    public final void zza(long j) {
        zzc();
        if (j >= 0) {
            this.zzd = this.zza.zzm().currentTimeMillis();
            if (zzd().postDelayed(this.zzc, j)) {
                return;
            }
            this.zza.zzr().zzf().zza("Failed to schedule delayed post. time", java.lang.Long.valueOf(j));
        }
    }

    public final boolean zzb() {
        return this.zzd != 0;
    }

    final void zzc() {
        this.zzd = 0L;
        zzd().removeCallbacks(this.zzc);
    }

    private final android.os.Handler zzd() {
        android.os.Handler handler;
        if (zzb != null) {
            return zzb;
        }
        synchronized (com.google.android.gms.measurement.internal.zzaf.class) {
            if (zzb == null) {
                zzb = new com.google.android.gms.internal.measurement.zzj(this.zza.zzn().getMainLooper());
            }
            handler = zzb;
        }
        return handler;
    }

    static /* synthetic */ long zza(com.google.android.gms.measurement.internal.zzaf zzafVar, long j) {
        zzafVar.zzd = 0L;
        return 0L;
    }
}
