package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class CrashlyticsBackgroundWorker {
    private final java.util.concurrent.ExecutorService executorService;

    public CrashlyticsBackgroundWorker(java.util.concurrent.ExecutorService executorService) {
        this.executorService = executorService;
    }

    <T> T submitAndWait(java.util.concurrent.Callable<T> callable) {
        try {
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                return this.executorService.submit(callable).get(4L, java.util.concurrent.TimeUnit.SECONDS);
            }
            return this.executorService.submit(callable).get();
        } catch (java.util.concurrent.RejectedExecutionException unused) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Executor is shut down because we're handling a fatal crash.");
            return null;
        } catch (java.lang.Exception e) {
            io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Failed to execute task.", e);
            return null;
        }
    }

    java.util.concurrent.Future<?> submit(final java.lang.Runnable runnable) {
        try {
            return this.executorService.submit(new java.lang.Runnable() { // from class: com.crashlytics.android.core.CrashlyticsBackgroundWorker.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } catch (java.lang.Exception e) {
                        io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Failed to execute task.", e);
                    }
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException unused) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }

    <T> java.util.concurrent.Future<T> submit(final java.util.concurrent.Callable<T> callable) {
        try {
            return this.executorService.submit(new java.util.concurrent.Callable<T>() { // from class: com.crashlytics.android.core.CrashlyticsBackgroundWorker.2
                @Override // java.util.concurrent.Callable
                public T call() throws java.lang.Exception {
                    try {
                        return (T) callable.call();
                    } catch (java.lang.Exception e) {
                        io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Failed to execute task.", e);
                        return null;
                    }
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException unused) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }
}
