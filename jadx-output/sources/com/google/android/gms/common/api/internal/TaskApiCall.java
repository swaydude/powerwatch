package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TaskApiCall<A extends com.google.android.gms.common.api.Api.AnyClient, ResultT> {
    private final com.google.android.gms.common.Feature[] zakh;
    private final boolean zako;

    @java.lang.Deprecated
    public TaskApiCall() {
        this.zakh = null;
        this.zako = false;
    }

    protected abstract void doExecute(A a, com.google.android.gms.tasks.TaskCompletionSource<ResultT> taskCompletionSource) throws android.os.RemoteException;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class Builder<A extends com.google.android.gms.common.api.Api.AnyClient, ResultT> {
        private com.google.android.gms.common.Feature[] zakh;
        private boolean zako;
        private com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<ResultT>> zakp;

        private Builder() {
            this.zako = true;
        }

        @java.lang.Deprecated
        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> execute(final com.google.android.gms.common.util.BiConsumer<A, com.google.android.gms.tasks.TaskCompletionSource<ResultT>> biConsumer) {
            this.zakp = new com.google.android.gms.common.api.internal.RemoteCall(biConsumer) { // from class: com.google.android.gms.common.api.internal.zaci
                private final com.google.android.gms.common.util.BiConsumer zakj;

                {
                    this.zakj = biConsumer;
                }

                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                    this.zakj.accept((com.google.android.gms.common.api.Api.AnyClient) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
                }
            };
            return this;
        }

        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> run(com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<ResultT>> remoteCall) {
            this.zakp = remoteCall;
            return this;
        }

        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> setFeatures(com.google.android.gms.common.Feature... featureArr) {
            this.zakh = featureArr;
            return this;
        }

        public com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z) {
            this.zako = z;
            return this;
        }

        public com.google.android.gms.common.api.internal.TaskApiCall<A, ResultT> build() {
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zakp != null, "execute parameter required");
            return new com.google.android.gms.common.api.internal.zacj(this, this.zakh, this.zako);
        }
    }

    private TaskApiCall(com.google.android.gms.common.Feature[] featureArr, boolean z) {
        this.zakh = featureArr;
        this.zako = z;
    }

    public final com.google.android.gms.common.Feature[] zabr() {
        return this.zakh;
    }

    public boolean shouldAutoResolveMissingFeatures() {
        return this.zako;
    }

    public static <A extends com.google.android.gms.common.api.Api.AnyClient, ResultT> com.google.android.gms.common.api.internal.TaskApiCall.Builder<A, ResultT> builder() {
        return new com.google.android.gms.common.api.internal.TaskApiCall.Builder<>();
    }
}
