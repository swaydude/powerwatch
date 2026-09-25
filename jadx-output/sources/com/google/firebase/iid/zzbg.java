package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbg {
    final android.content.Intent zza;
    private final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> zzb = new com.google.android.gms.tasks.TaskCompletionSource<>();

    zzbg(android.content.Intent intent) {
        this.zza = intent;
    }

    final com.google.android.gms.tasks.Task<java.lang.Void> zza() {
        return this.zzb.getTask();
    }

    final void zzb() {
        this.zzb.trySetResult(null);
    }

    final /* synthetic */ void zzc() {
        java.lang.String action = this.zza.getAction();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        android.util.Log.w("FirebaseInstanceId", sb.toString());
        zzb();
    }
}
