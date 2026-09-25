package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class BaseImplementation {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface ResultHolder<R> {
        void setFailedResult(com.google.android.gms.common.api.Status status);

        void setResult(R r);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class ApiMethodImpl<R extends com.google.android.gms.common.api.Result, A extends com.google.android.gms.common.api.Api.AnyClient> extends com.google.android.gms.common.api.internal.BasePendingResult<R> implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<R> {
        private final com.google.android.gms.common.api.Api<?> mApi;
        private final com.google.android.gms.common.api.Api.AnyClientKey<A> mClientKey;

        @java.lang.Deprecated
        protected ApiMethodImpl(com.google.android.gms.common.api.Api.AnyClientKey<A> anyClientKey, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
            super((com.google.android.gms.common.api.GoogleApiClient) com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            this.mClientKey = (com.google.android.gms.common.api.Api.AnyClientKey) com.google.android.gms.common.internal.Preconditions.checkNotNull(anyClientKey);
            this.mApi = null;
        }

        protected abstract void doExecute(A a) throws android.os.RemoteException;

        protected void onSetFailedResult(R r) {
        }

        protected ApiMethodImpl(com.google.android.gms.common.api.Api<?> api, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
            super((com.google.android.gms.common.api.GoogleApiClient) com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            com.google.android.gms.common.internal.Preconditions.checkNotNull(api, "Api must not be null");
            this.mClientKey = (com.google.android.gms.common.api.Api.AnyClientKey<A>) api.getClientKey();
            this.mApi = api;
        }

        protected ApiMethodImpl(com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler<R> callbackHandler) {
            super(callbackHandler);
            this.mClientKey = null;
            this.mApi = null;
        }

        public final com.google.android.gms.common.api.Api.AnyClientKey<A> getClientKey() {
            return this.mClientKey;
        }

        public final com.google.android.gms.common.api.Api<?> getApi() {
            return this.mApi;
        }

        public final void run(A a) throws android.os.DeadObjectException {
            if (a instanceof com.google.android.gms.common.internal.SimpleClientAdapter) {
                a = ((com.google.android.gms.common.internal.SimpleClientAdapter) a).getClient();
            }
            try {
                doExecute(a);
            } catch (android.os.DeadObjectException e) {
                setFailedResult(e);
                throw e;
            } catch (android.os.RemoteException e2) {
                setFailedResult(e2);
            }
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        public final void setFailedResult(com.google.android.gms.common.api.Status status) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(!status.isSuccess(), "Failed result must not be success");
            R rCreateFailedResult = createFailedResult(status);
            setResult((com.google.android.gms.common.api.Result) rCreateFailedResult);
            onSetFailedResult(rCreateFailedResult);
        }

        private void setFailedResult(android.os.RemoteException remoteException) {
            setFailedResult(new com.google.android.gms.common.api.Status(8, remoteException.getLocalizedMessage(), null));
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        public /* bridge */ /* synthetic */ void setResult(java.lang.Object obj) {
            super.setResult((com.google.android.gms.common.api.Result) obj);
        }
    }
}
