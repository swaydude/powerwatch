package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class PendingResults {
    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> immediatePendingResult(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(status, "Result must not be null");
        com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult = new com.google.android.gms.common.api.internal.StatusPendingResult(android.os.Looper.getMainLooper());
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private static final class zab<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BasePendingResult<R> {
        public zab(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        protected final R createFailedResult(com.google.android.gms.common.api.Status status) {
            throw new java.lang.UnsupportedOperationException("Creating failed results is not supported");
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private static final class zaa<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BasePendingResult<R> {
        private final R zack;

        public zaa(R r) {
            super(android.os.Looper.getMainLooper());
            this.zack = r;
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        protected final R createFailedResult(com.google.android.gms.common.api.Status status) {
            if (status.getStatusCode() != this.zack.getStatus().getStatusCode()) {
                throw new java.lang.UnsupportedOperationException("Creating failed results is not supported");
            }
            return this.zack;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private static final class zac<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BasePendingResult<R> {
        private final R zacl;

        public zac(com.google.android.gms.common.api.GoogleApiClient googleApiClient, R r) {
            super(googleApiClient);
            this.zacl = r;
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        protected final R createFailedResult(com.google.android.gms.common.api.Status status) {
            return this.zacl;
        }
    }

    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> immediatePendingResult(com.google.android.gms.common.api.Status status, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(status, "Result must not be null");
        com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult = new com.google.android.gms.common.api.internal.StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.PendingResult<R> immediateFailedResult(R r, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r, "Result must not be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(!r.getStatus().isSuccess(), "Status code must not be SUCCESS");
        com.google.android.gms.common.api.PendingResults.zac zacVar = new com.google.android.gms.common.api.PendingResults.zac(googleApiClient, r);
        zacVar.setResult(r);
        return zacVar;
    }

    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.OptionalPendingResult<R> immediatePendingResult(R r) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r, "Result must not be null");
        com.google.android.gms.common.api.PendingResults.zab zabVar = new com.google.android.gms.common.api.PendingResults.zab(null);
        zabVar.setResult(r);
        return new com.google.android.gms.common.api.internal.OptionalPendingResultImpl(zabVar);
    }

    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.OptionalPendingResult<R> immediatePendingResult(R r, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r, "Result must not be null");
        com.google.android.gms.common.api.PendingResults.zab zabVar = new com.google.android.gms.common.api.PendingResults.zab(googleApiClient);
        zabVar.setResult(r);
        return new com.google.android.gms.common.api.internal.OptionalPendingResultImpl(zabVar);
    }

    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> canceledPendingResult() {
        com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult = new com.google.android.gms.common.api.internal.StatusPendingResult(android.os.Looper.getMainLooper());
        statusPendingResult.cancel();
        return statusPendingResult;
    }

    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.PendingResult<R> canceledPendingResult(R r) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r, "Result must not be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(r.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        com.google.android.gms.common.api.PendingResults.zaa zaaVar = new com.google.android.gms.common.api.PendingResults.zaa(r);
        zaaVar.cancel();
        return zaaVar;
    }

    private PendingResults() {
    }
}
