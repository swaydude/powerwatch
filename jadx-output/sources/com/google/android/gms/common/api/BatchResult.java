package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BatchResult implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status mStatus;
    private final com.google.android.gms.common.api.PendingResult<?>[] zabf;

    BatchResult(com.google.android.gms.common.api.Status status, com.google.android.gms.common.api.PendingResult<?>[] pendingResultArr) {
        this.mStatus = status;
        this.zabf = pendingResultArr;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }

    public final <R extends com.google.android.gms.common.api.Result> R take(com.google.android.gms.common.api.BatchResultToken<R> batchResultToken) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(batchResultToken.mId < this.zabf.length, "The result token does not belong to this batch");
        return (R) this.zabf[batchResultToken.mId].await(0L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
