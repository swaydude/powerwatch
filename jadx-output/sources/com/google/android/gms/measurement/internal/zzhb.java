package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzhb implements java.util.concurrent.Callable<java.util.List<com.google.android.gms.measurement.internal.zzlb>> {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgp zzb;

    zzhb(com.google.android.gms.measurement.internal.zzgp zzgpVar, com.google.android.gms.measurement.internal.zzm zzmVar) {
        this.zzb = zzgpVar;
        this.zza = zzmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.util.List<com.google.android.gms.measurement.internal.zzlb> call() throws java.lang.Exception {
        this.zzb.zza.zzo();
        return this.zzb.zza.zze().zza(this.zza.zza);
    }
}
