package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzhg implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzv zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zzb;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgp zzc;

    zzhg(com.google.android.gms.measurement.internal.zzgp zzgpVar, com.google.android.gms.measurement.internal.zzv zzvVar, com.google.android.gms.measurement.internal.zzm zzmVar) {
        this.zzc = zzgpVar;
        this.zza = zzvVar;
        this.zzb = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzo();
        if (this.zza.zzc.zza() == null) {
            this.zzc.zza.zzb(this.zza, this.zzb);
        } else {
            this.zzc.zza.zza(this.zza, this.zzb);
        }
    }
}
