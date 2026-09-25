package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgx implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzan zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zzb;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgp zzc;

    zzgx(com.google.android.gms.measurement.internal.zzgp zzgpVar, com.google.android.gms.measurement.internal.zzan zzanVar, com.google.android.gms.measurement.internal.zzm zzmVar) {
        this.zzc = zzgpVar;
        this.zza = zzanVar;
        this.zzb = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzan zzanVarZzb = this.zzc.zzb(this.zza, this.zzb);
        this.zzc.zza.zzo();
        this.zzc.zza.zza(zzanVarZzb, this.zzb);
    }
}
