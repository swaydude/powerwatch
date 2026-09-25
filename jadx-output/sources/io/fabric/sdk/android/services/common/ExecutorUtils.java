package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorUtils {
    private static final long DEFAULT_TERMINATION_TIMEOUT = 2;

    private ExecutorUtils() {
    }

    public static java.util.concurrent.ExecutorService buildSingleThreadExecutorService(java.lang.String str) {
        java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor(getNamedThreadFactory(str));
        addDelayedShutdownHook(str, executorServiceNewSingleThreadExecutor);
        return executorServiceNewSingleThreadExecutor;
    }

    public static io.fabric.sdk.android.services.concurrency.internal.RetryThreadPoolExecutor buildRetryThreadPoolExecutor(java.lang.String str, int i, io.fabric.sdk.android.services.concurrency.internal.RetryPolicy retryPolicy, io.fabric.sdk.android.services.concurrency.internal.Backoff backoff) {
        io.fabric.sdk.android.services.concurrency.internal.RetryThreadPoolExecutor retryThreadPoolExecutor = new io.fabric.sdk.android.services.concurrency.internal.RetryThreadPoolExecutor(i, getNamedThreadFactory(str), retryPolicy, backoff);
        addDelayedShutdownHook(str, retryThreadPoolExecutor);
        return retryThreadPoolExecutor;
    }

    public static java.util.concurrent.ScheduledExecutorService buildSingleThreadScheduledExecutorService(java.lang.String str) {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(getNamedThreadFactory(str));
        addDelayedShutdownHook(str, scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    public static final java.util.concurrent.ThreadFactory getNamedThreadFactory(final java.lang.String str) {
        final java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong(1L);
        return new java.util.concurrent.ThreadFactory() { // from class: io.fabric.sdk.android.services.common.ExecutorUtils.1
            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(final java.lang.Runnable runnable) {
                java.lang.Thread threadNewThread = java.util.concurrent.Executors.defaultThreadFactory().newThread(new io.fabric.sdk.android.services.common.BackgroundPriorityRunnable() { // from class: io.fabric.sdk.android.services.common.ExecutorUtils.1.1
                    @Override // io.fabric.sdk.android.services.common.BackgroundPriorityRunnable
                    public void onRun() {
                        runnable.run();
                    }
                });
                threadNewThread.setName(str + atomicLong.getAndIncrement());
                return threadNewThread;
            }
        };
    }

    private static final void addDelayedShutdownHook(java.lang.String str, java.util.concurrent.ExecutorService executorService) {
        addDelayedShutdownHook(str, executorService, 2L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public static final void addDelayedShutdownHook(final java.lang.String str, final java.util.concurrent.ExecutorService executorService, final long j, final java.util.concurrent.TimeUnit timeUnit) {
        java.lang.Runtime.getRuntime().addShutdownHook(new java.lang.Thread(new io.fabric.sdk.android.services.common.BackgroundPriorityRunnable() { // from class: io.fabric.sdk.android.services.common.ExecutorUtils.2
            @Override // io.fabric.sdk.android.services.common.BackgroundPriorityRunnable
            public void onRun() {
                try {
                    io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Executing shutdown hook for " + str);
                    executorService.shutdown();
                    if (executorService.awaitTermination(j, timeUnit)) {
                        return;
                    }
                    io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, str + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    executorService.shutdownNow();
                } catch (java.lang.InterruptedException unused) {
                    io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, java.lang.String.format(java.util.Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str));
                    executorService.shutdownNow();
                }
            }
        }, "Crashlytics Shutdown Hook for " + str));
    }
}
