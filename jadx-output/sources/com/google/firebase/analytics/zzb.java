package com.google.firebase.analytics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@17.2.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzb implements java.util.concurrent.Callable<java.lang.String> {
    private final /* synthetic */ com.google.firebase.analytics.FirebaseAnalytics zza;

    zzb(com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.String call() throws java.lang.Exception {
        java.lang.String strZzc;
        java.lang.String strZzb = this.zza.zzb();
        if (strZzb != null) {
            return strZzb;
        }
        if (this.zza.zzd) {
            strZzc = this.zza.zzc.zzh();
        } else {
            strZzc = this.zza.zzb.zzh().zzc(120000L);
        }
        if (strZzc == null) {
            throw new java.util.concurrent.TimeoutException();
        }
        this.zza.zza(strZzc);
        return strZzc;
    }
}
