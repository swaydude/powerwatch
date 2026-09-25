package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class PendingResult<R extends com.google.android.gms.common.api.Result> {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface StatusListener {
        void onComplete(com.google.android.gms.common.api.Status status);
    }

    public abstract R await();

    public abstract R await(long j, java.util.concurrent.TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> resultCallback);

    public abstract void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> resultCallback, long j, java.util.concurrent.TimeUnit timeUnit);

    public void addStatusListener(com.google.android.gms.common.api.PendingResult.StatusListener statusListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    public <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> resultTransform) {
        throw new java.lang.UnsupportedOperationException();
    }

    public java.lang.Integer zal() {
        throw new java.lang.UnsupportedOperationException();
    }
}
