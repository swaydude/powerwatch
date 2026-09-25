package io.fabric.sdk.android.services.concurrency.internal;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultRetryPolicy implements io.fabric.sdk.android.services.concurrency.internal.RetryPolicy {
    private final int maxRetries;

    public DefaultRetryPolicy() {
        this(1);
    }

    public DefaultRetryPolicy(int i) {
        this.maxRetries = i;
    }

    @Override // io.fabric.sdk.android.services.concurrency.internal.RetryPolicy
    public boolean shouldRetry(int i, java.lang.Throwable th) {
        return i < this.maxRetries;
    }
}
