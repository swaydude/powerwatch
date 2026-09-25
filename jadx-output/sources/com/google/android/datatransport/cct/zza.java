package com.google.android.datatransport.cct;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zza implements com.google.android.datatransport.runtime.retries.Function {
    private final com.google.android.datatransport.cct.zzc zza;

    private zza(com.google.android.datatransport.cct.zzc zzcVar) {
        this.zza = zzcVar;
    }

    public static com.google.android.datatransport.runtime.retries.Function zza(com.google.android.datatransport.cct.zzc zzcVar) {
        return new com.google.android.datatransport.cct.zza(zzcVar);
    }

    @Override // com.google.android.datatransport.runtime.retries.Function
    public java.lang.Object apply(java.lang.Object obj) {
        return this.zza.zza((com.google.android.datatransport.cct.zzc.zza) obj);
    }
}
