package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzy {
    private static java.lang.ref.WeakReference<com.google.firebase.messaging.zzy> zza;
    private final android.content.SharedPreferences zzb;
    private com.google.firebase.messaging.zzx zzc;
    private final java.util.concurrent.Executor zzd;

    private zzy(android.content.SharedPreferences sharedPreferences, java.util.concurrent.Executor executor) {
        this.zzd = executor;
        this.zzb = sharedPreferences;
    }

    private final synchronized void zzb() {
        this.zzc = com.google.firebase.messaging.zzx.zza(this.zzb, "topic_operation_queue", ",", this.zzd);
    }

    public static synchronized com.google.firebase.messaging.zzy zza(android.content.Context context, java.util.concurrent.Executor executor) {
        com.google.firebase.messaging.zzy zzyVar;
        java.lang.ref.WeakReference<com.google.firebase.messaging.zzy> weakReference = zza;
        zzyVar = weakReference != null ? weakReference.get() : null;
        if (zzyVar == null) {
            zzyVar = new com.google.firebase.messaging.zzy(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
            zzyVar.zzb();
            zza = new java.lang.ref.WeakReference<>(zzyVar);
        }
        return zzyVar;
    }

    final synchronized com.google.firebase.messaging.zzz zza() {
        return com.google.firebase.messaging.zzz.zzc(this.zzc.zza());
    }

    final synchronized boolean zza(com.google.firebase.messaging.zzz zzzVar) {
        return this.zzc.zza(zzzVar.zzc());
    }

    final synchronized boolean zzb(com.google.firebase.messaging.zzz zzzVar) {
        return this.zzc.zza((java.lang.Object) zzzVar.zzc());
    }
}
