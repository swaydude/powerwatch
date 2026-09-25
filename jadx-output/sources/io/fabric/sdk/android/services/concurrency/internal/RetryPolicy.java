package io.fabric.sdk.android.services.concurrency.internal;

/* JADX INFO: loaded from: classes2.dex */
public interface RetryPolicy {
    boolean shouldRetry(int i, java.lang.Throwable th);
}
