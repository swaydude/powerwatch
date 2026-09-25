package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class Batch extends com.google.android.gms.common.api.internal.BasePendingResult<com.google.android.gms.common.api.BatchResult> {
    private final java.lang.Object mLock;
    private int zabc;
    private boolean zabd;
    private boolean zabe;
    private final com.google.android.gms.common.api.PendingResult<?>[] zabf;

    private Batch(java.util.List<com.google.android.gms.common.api.PendingResult<?>> list, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.mLock = new java.lang.Object();
        int size = list.size();
        this.zabc = size;
        com.google.android.gms.common.api.PendingResult<?>[] pendingResultArr = new com.google.android.gms.common.api.PendingResult[size];
        this.zabf = pendingResultArr;
        if (list.isEmpty()) {
            setResult(new com.google.android.gms.common.api.BatchResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS, pendingResultArr));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            com.google.android.gms.common.api.PendingResult<?> pendingResult = list.get(i);
            this.zabf[i] = pendingResult;
            pendingResult.addStatusListener(new com.google.android.gms.common.api.zaa(this));
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class Builder {
        private java.util.List<com.google.android.gms.common.api.PendingResult<?>> zabg = new java.util.ArrayList();
        private com.google.android.gms.common.api.GoogleApiClient zabh;

        public Builder(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
            this.zabh = googleApiClient;
        }

        public final <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.BatchResultToken<R> add(com.google.android.gms.common.api.PendingResult<R> pendingResult) {
            com.google.android.gms.common.api.BatchResultToken<R> batchResultToken = new com.google.android.gms.common.api.BatchResultToken<>(this.zabg.size());
            this.zabg.add(pendingResult);
            return batchResultToken;
        }

        public final com.google.android.gms.common.api.Batch build() {
            return new com.google.android.gms.common.api.Batch(this.zabg, this.zabh, null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.PendingResult
    public final void cancel() {
        super.cancel();
        for (com.google.android.gms.common.api.PendingResult<?> pendingResult : this.zabf) {
            pendingResult.cancel();
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final com.google.android.gms.common.api.BatchResult createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.common.api.BatchResult(status, this.zabf);
    }

    /* synthetic */ Batch(java.util.List list, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.common.api.zaa zaaVar) {
        this(list, googleApiClient);
    }

    static /* synthetic */ boolean zaa(com.google.android.gms.common.api.Batch batch, boolean z) {
        batch.zabe = true;
        return true;
    }

    static /* synthetic */ boolean zab(com.google.android.gms.common.api.Batch batch, boolean z) {
        batch.zabd = true;
        return true;
    }

    static /* synthetic */ int zab(com.google.android.gms.common.api.Batch batch) {
        int i = batch.zabc;
        batch.zabc = i - 1;
        return i;
    }
}
