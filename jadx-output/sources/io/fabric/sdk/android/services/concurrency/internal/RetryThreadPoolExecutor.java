package io.fabric.sdk.android.services.concurrency.internal;

/* JADX INFO: loaded from: classes2.dex */
public class RetryThreadPoolExecutor extends java.util.concurrent.ScheduledThreadPoolExecutor {
    private final io.fabric.sdk.android.services.concurrency.internal.Backoff backoff;
    private final io.fabric.sdk.android.services.concurrency.internal.RetryPolicy retryPolicy;

    public RetryThreadPoolExecutor(int i, io.fabric.sdk.android.services.concurrency.internal.RetryPolicy retryPolicy, io.fabric.sdk.android.services.concurrency.internal.Backoff backoff) {
        this(i, java.util.concurrent.Executors.defaultThreadFactory(), retryPolicy, backoff);
    }

    public RetryThreadPoolExecutor(int i, java.util.concurrent.ThreadFactory threadFactory, io.fabric.sdk.android.services.concurrency.internal.RetryPolicy retryPolicy, io.fabric.sdk.android.services.concurrency.internal.Backoff backoff) {
        super(i, threadFactory);
        java.util.Objects.requireNonNull(retryPolicy, "retry policy must not be null");
        java.util.Objects.requireNonNull(backoff, "backoff must not be null");
        this.retryPolicy = retryPolicy;
        this.backoff = backoff;
    }

    public java.util.concurrent.Future<?> scheduleWithRetry(java.lang.Runnable runnable) {
        return scheduleWithRetryInternal(java.util.concurrent.Executors.callable(runnable));
    }

    public <T> java.util.concurrent.Future<T> scheduleWithRetry(java.lang.Runnable runnable, T t) {
        return scheduleWithRetryInternal(java.util.concurrent.Executors.callable(runnable, t));
    }

    public <T> java.util.concurrent.Future<T> scheduleWithRetry(java.util.concurrent.Callable<T> callable) {
        return scheduleWithRetryInternal(callable);
    }

    private <T> java.util.concurrent.Future<T> scheduleWithRetryInternal(java.util.concurrent.Callable<T> callable) {
        java.util.Objects.requireNonNull(callable);
        io.fabric.sdk.android.services.concurrency.internal.RetryFuture retryFuture = new io.fabric.sdk.android.services.concurrency.internal.RetryFuture(callable, new io.fabric.sdk.android.services.concurrency.internal.RetryState(this.backoff, this.retryPolicy), this);
        execute(retryFuture);
        return retryFuture;
    }

    public io.fabric.sdk.android.services.concurrency.internal.RetryPolicy getRetryPolicy() {
        return this.retryPolicy;
    }

    public io.fabric.sdk.android.services.concurrency.internal.Backoff getBackoff() {
        return this.backoff;
    }
}
