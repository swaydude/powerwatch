package com.google.android.gms.internal.base;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zap implements com.google.android.gms.internal.base.zal {
    private zap() {
    }

    @Override // com.google.android.gms.internal.base.zal
    public final java.util.concurrent.ExecutorService zaa(int i, int i2) {
        return zaa(4, java.util.concurrent.Executors.defaultThreadFactory(), i2);
    }

    @Override // com.google.android.gms.internal.base.zal
    public final java.util.concurrent.ExecutorService zaa(int i, java.util.concurrent.ThreadFactory threadFactory, int i2) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(i, i, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
