package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzku implements com.google.android.gms.measurement.internal.zzfq {
    private final /* synthetic */ java.lang.String zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzks zzb;

    zzku(com.google.android.gms.measurement.internal.zzks zzksVar, java.lang.String str) {
        this.zzb = zzksVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzfq
    public final void zza(java.lang.String str, int i, java.lang.Throwable th, byte[] bArr, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        this.zzb.zza(i, th, bArr, this.zza);
    }
}
