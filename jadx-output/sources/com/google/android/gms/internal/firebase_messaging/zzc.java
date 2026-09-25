package com.google.android.gms.internal.firebase_messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzc implements com.google.android.gms.internal.firebase_messaging.zzb {
    private zzc() {
    }

    @Override // com.google.android.gms.internal.firebase_messaging.zzb
    public final java.util.concurrent.ExecutorService zza(java.util.concurrent.ThreadFactory threadFactory, int i) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.firebase_messaging.zzb
    public final java.util.concurrent.ScheduledExecutorService zza(int i, java.util.concurrent.ThreadFactory threadFactory, int i2) {
        return java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(1, threadFactory));
    }
}
