package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzfp implements java.lang.Runnable {
    private final com.google.android.gms.measurement.internal.zzfq zza;
    private final int zzb;
    private final java.lang.Throwable zzc;
    private final byte[] zzd;
    private final java.lang.String zze;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> zzf;

    private zzfp(java.lang.String str, com.google.android.gms.measurement.internal.zzfq zzfqVar, int i, java.lang.Throwable th, byte[] bArr, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzfqVar);
        this.zza = zzfqVar;
        this.zzb = i;
        this.zzc = th;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}
