package io.fabric.sdk.android.services.concurrency.internal;

/* JADX INFO: loaded from: classes2.dex */
public class RetryState {
    private final io.fabric.sdk.android.services.concurrency.internal.Backoff backoff;
    private final int retryCount;
    private final io.fabric.sdk.android.services.concurrency.internal.RetryPolicy retryPolicy;

    public RetryState(io.fabric.sdk.android.services.concurrency.internal.Backoff backoff, io.fabric.sdk.android.services.concurrency.internal.RetryPolicy retryPolicy) {
        this(0, backoff, retryPolicy);
    }

    public RetryState(int i, io.fabric.sdk.android.services.concurrency.internal.Backoff backoff, io.fabric.sdk.android.services.concurrency.internal.RetryPolicy retryPolicy) {
        this.retryCount = i;
        this.backoff = backoff;
        this.retryPolicy = retryPolicy;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public long getRetryDelay() {
        return this.backoff.getDelayMillis(this.retryCount);
    }

    public io.fabric.sdk.android.services.concurrency.internal.Backoff getBackoff() {
        return this.backoff;
    }

    public io.fabric.sdk.android.services.concurrency.internal.RetryPolicy getRetryPolicy() {
        return this.retryPolicy;
    }

    public io.fabric.sdk.android.services.concurrency.internal.RetryState nextRetryState() {
        return new io.fabric.sdk.android.services.concurrency.internal.RetryState(this.retryCount + 1, this.backoff, this.retryPolicy);
    }

    public io.fabric.sdk.android.services.concurrency.internal.RetryState initialRetryState() {
        return new io.fabric.sdk.android.services.concurrency.internal.RetryState(this.backoff, this.retryPolicy);
    }
}
