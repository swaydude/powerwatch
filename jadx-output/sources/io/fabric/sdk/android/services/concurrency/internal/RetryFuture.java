package io.fabric.sdk.android.services.concurrency.internal;

/* JADX INFO: loaded from: classes2.dex */
class RetryFuture<T> extends io.fabric.sdk.android.services.concurrency.internal.AbstractFuture<T> implements java.lang.Runnable {
    private final io.fabric.sdk.android.services.concurrency.internal.RetryThreadPoolExecutor executor;
    io.fabric.sdk.android.services.concurrency.internal.RetryState retryState;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Thread> runner = new java.util.concurrent.atomic.AtomicReference<>();
    private final java.util.concurrent.Callable<T> task;

    RetryFuture(java.util.concurrent.Callable<T> callable, io.fabric.sdk.android.services.concurrency.internal.RetryState retryState, io.fabric.sdk.android.services.concurrency.internal.RetryThreadPoolExecutor retryThreadPoolExecutor) {
        this.task = callable;
        this.retryState = retryState;
        this.executor = retryThreadPoolExecutor;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isDone()) {
            return;
        }
        if (this.runner.compareAndSet(null, java.lang.Thread.currentThread())) {
            try {
                set(this.task.call());
            } catch (java.lang.Throwable th) {
                try {
                    if (getRetryPolicy().shouldRetry(getRetryCount(), th)) {
                        long delayMillis = getBackoff().getDelayMillis(getRetryCount());
                        this.retryState = this.retryState.nextRetryState();
                        this.executor.schedule(this, delayMillis, java.util.concurrent.TimeUnit.MILLISECONDS);
                    } else {
                        setException(th);
                    }
                } finally {
                    this.runner.getAndSet(null);
                }
            }
        }
    }

    private io.fabric.sdk.android.services.concurrency.internal.RetryPolicy getRetryPolicy() {
        return this.retryState.getRetryPolicy();
    }

    private io.fabric.sdk.android.services.concurrency.internal.Backoff getBackoff() {
        return this.retryState.getBackoff();
    }

    private int getRetryCount() {
        return this.retryState.getRetryCount();
    }

    @Override // io.fabric.sdk.android.services.concurrency.internal.AbstractFuture
    protected void interruptTask() {
        java.lang.Thread andSet = this.runner.getAndSet(null);
        if (andSet != null) {
            andSet.interrupt();
        }
    }
}
