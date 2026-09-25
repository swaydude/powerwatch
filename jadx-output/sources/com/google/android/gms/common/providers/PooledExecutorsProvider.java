package com.google.android.gms.common.providers;

/* JADX INFO: loaded from: classes.dex */
public class PooledExecutorsProvider {
    private static com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory zzey;

    public interface PooledExecutorFactory {
        java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    public static synchronized com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory getInstance() {
        if (zzey == null) {
            zzey = new com.google.android.gms.common.providers.zza();
        }
        return zzey;
    }

    private PooledExecutorsProvider() {
    }
}
