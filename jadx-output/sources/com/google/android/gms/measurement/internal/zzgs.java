package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgs implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgp zzb;

    zzgs(com.google.android.gms.measurement.internal.zzgp zzgpVar, com.google.android.gms.measurement.internal.zzm zzmVar) {
        this.zzb = zzgpVar;
        this.zza = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzo();
        com.google.android.gms.measurement.internal.zzks zzksVar = this.zzb.zza;
        com.google.android.gms.measurement.internal.zzm zzmVar = this.zza;
        zzksVar.zzq().zzd();
        zzksVar.zzk();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzmVar.zza);
        zzksVar.zzc(zzmVar);
    }
}
