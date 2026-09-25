package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzka implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzks zza;
    private final /* synthetic */ java.lang.Runnable zzb;

    zzka(com.google.android.gms.measurement.internal.zzjv zzjvVar, com.google.android.gms.measurement.internal.zzks zzksVar, java.lang.Runnable runnable) {
        this.zza = zzksVar;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzo();
        this.zza.zza(this.zzb);
        this.zza.zzl();
    }
}
