package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgt implements java.util.concurrent.Callable<java.util.List<com.google.android.gms.measurement.internal.zzlb>> {
    private final /* synthetic */ java.lang.String zza;
    private final /* synthetic */ java.lang.String zzb;
    private final /* synthetic */ java.lang.String zzc;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgp zzd;

    zzgt(com.google.android.gms.measurement.internal.zzgp zzgpVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zzd = zzgpVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.util.List<com.google.android.gms.measurement.internal.zzlb> call() throws java.lang.Exception {
        this.zzd.zza.zzo();
        return this.zzd.zza.zze().zza(this.zza, this.zzb, this.zzc);
    }
}
