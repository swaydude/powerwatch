package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class RetryManager {
    private static final long NANOSECONDS_IN_MS = 1000000;
    long lastRetry;
    private io.fabric.sdk.android.services.concurrency.internal.RetryState retryState;

    public RetryManager(io.fabric.sdk.android.services.concurrency.internal.RetryState retryState) {
        java.util.Objects.requireNonNull(retryState, "retryState must not be null");
        this.retryState = retryState;
    }

    public boolean canRetry(long j) {
        return j - this.lastRetry >= this.retryState.getRetryDelay() * NANOSECONDS_IN_MS;
    }

    public void recordRetry(long j) {
        this.lastRetry = j;
        this.retryState = this.retryState.nextRetryState();
    }

    public void reset() {
        this.lastRetry = 0L;
        this.retryState = this.retryState.initialRetryState();
    }
}
