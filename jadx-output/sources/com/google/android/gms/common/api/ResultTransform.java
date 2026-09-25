package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ResultTransform<R extends com.google.android.gms.common.api.Result, S extends com.google.android.gms.common.api.Result> {
    public com.google.android.gms.common.api.Status onFailure(com.google.android.gms.common.api.Status status) {
        return status;
    }

    public abstract com.google.android.gms.common.api.PendingResult<S> onSuccess(R r);

    public final com.google.android.gms.common.api.PendingResult<S> createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.common.api.internal.zacc(status);
    }
}
