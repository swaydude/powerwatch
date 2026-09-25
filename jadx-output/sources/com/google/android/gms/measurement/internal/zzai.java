package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzai implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhh zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzaf zzb;

    zzai(com.google.android.gms.measurement.internal.zzaf zzafVar, com.google.android.gms.measurement.internal.zzhh zzhhVar) {
        this.zzb = zzafVar;
        this.zza = zzhhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzu();
        if (com.google.android.gms.measurement.internal.zzw.zza()) {
            this.zza.zzq().zza(this);
            return;
        }
        boolean zZzb = this.zzb.zzb();
        com.google.android.gms.measurement.internal.zzaf.zza(this.zzb, 0L);
        if (zZzb) {
            this.zzb.zza();
        }
    }
}
