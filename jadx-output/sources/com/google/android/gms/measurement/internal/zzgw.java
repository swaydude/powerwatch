package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgw implements java.util.concurrent.Callable<java.util.List<com.google.android.gms.measurement.internal.zzv>> {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzm zza;
    private final /* synthetic */ java.lang.String zzb;
    private final /* synthetic */ java.lang.String zzc;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgp zzd;

    zzgw(com.google.android.gms.measurement.internal.zzgp zzgpVar, com.google.android.gms.measurement.internal.zzm zzmVar, java.lang.String str, java.lang.String str2) {
        this.zzd = zzgpVar;
        this.zza = zzmVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.util.List<com.google.android.gms.measurement.internal.zzv> call() throws java.lang.Exception {
        this.zzd.zza.zzo();
        return this.zzd.zza.zze().zzb(this.zza.zza, this.zzb, this.zzc);
    }
}
