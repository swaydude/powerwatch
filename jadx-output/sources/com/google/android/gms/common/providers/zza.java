package com.google.android.gms.common.providers;

/* JADX INFO: loaded from: classes.dex */
final class zza implements com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory {
    zza() {
    }

    @Override // com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory
    public final java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor() {
        return java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
    }
}
