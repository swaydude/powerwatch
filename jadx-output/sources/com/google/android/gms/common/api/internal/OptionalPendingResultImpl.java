package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class OptionalPendingResultImpl<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.OptionalPendingResult<R> {
    private final com.google.android.gms.common.api.internal.BasePendingResult<R> zajt;

    public OptionalPendingResultImpl(com.google.android.gms.common.api.PendingResult<R> pendingResult) {
        this.zajt = (com.google.android.gms.common.api.internal.BasePendingResult) pendingResult;
    }

    @Override // com.google.android.gms.common.api.OptionalPendingResult
    public final boolean isDone() {
        return this.zajt.isReady();
    }

    @Override // com.google.android.gms.common.api.OptionalPendingResult
    public final R get() {
        if (isDone()) {
            return await(0L, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        throw new java.lang.IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final R await() {
        return this.zajt.await();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final R await(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.zajt.await(j, timeUnit);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void cancel() {
        this.zajt.cancel();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        return this.zajt.isCanceled();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> resultCallback) {
        this.zajt.setResultCallback(resultCallback);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> resultCallback, long j, java.util.concurrent.TimeUnit timeUnit) {
        this.zajt.setResultCallback(resultCallback, j, timeUnit);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(com.google.android.gms.common.api.PendingResult.StatusListener statusListener) {
        this.zajt.addStatusListener(statusListener);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> resultTransform) {
        return this.zajt.then(resultTransform);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final java.lang.Integer zal() {
        return this.zajt.zal();
    }
}
