package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgr implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzv zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgp zzb;

    zzgr(com.google.android.gms.measurement.internal.zzgp zzgpVar, com.google.android.gms.measurement.internal.zzv zzvVar) {
        this.zzb = zzgpVar;
        this.zza = zzvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzo();
        if (this.zza.zzc.zza() == null) {
            this.zzb.zza.zzb(this.zza);
        } else {
            this.zzb.zza.zza(this.zza);
        }
    }
}
