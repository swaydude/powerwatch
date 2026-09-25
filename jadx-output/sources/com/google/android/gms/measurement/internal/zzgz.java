package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgz implements java.util.concurrent.Callable<byte[]> {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzan zza;
    private final /* synthetic */ java.lang.String zzb;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgp zzc;

    zzgz(com.google.android.gms.measurement.internal.zzgp zzgpVar, com.google.android.gms.measurement.internal.zzan zzanVar, java.lang.String str) {
        this.zzc = zzgpVar;
        this.zza = zzanVar;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws java.lang.Exception {
        this.zzc.zza.zzo();
        return this.zzc.zza.zzg().zza(this.zza, this.zzb);
    }
}
