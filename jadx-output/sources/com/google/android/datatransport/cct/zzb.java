package com.google.android.datatransport.cct;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzb implements com.google.android.datatransport.runtime.retries.RetryStrategy {
    private static final com.google.android.datatransport.cct.zzb zza = new com.google.android.datatransport.cct.zzb();

    private zzb() {
    }

    public static com.google.android.datatransport.runtime.retries.RetryStrategy zza() {
        return zza;
    }

    @Override // com.google.android.datatransport.runtime.retries.RetryStrategy
    public java.lang.Object shouldRetry(java.lang.Object obj, java.lang.Object obj2) {
        return com.google.android.datatransport.cct.zzc.zza((com.google.android.datatransport.cct.zzc.zza) obj, (com.google.android.datatransport.cct.zzc.zzb) obj2);
    }
}
