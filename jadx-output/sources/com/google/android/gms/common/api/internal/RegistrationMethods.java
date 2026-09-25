package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class RegistrationMethods<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
    public final com.google.android.gms.common.api.internal.RegisterListenerMethod<A, L> zaka;
    public final com.google.android.gms.common.api.internal.UnregisterListenerMethod<A, L> zakb;

    private RegistrationMethods(com.google.android.gms.common.api.internal.RegisterListenerMethod<A, L> registerListenerMethod, com.google.android.gms.common.api.internal.UnregisterListenerMethod<A, L> unregisterListenerMethod) {
        this.zaka = registerListenerMethod;
        this.zakb = unregisterListenerMethod;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class Builder<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
        private boolean zajw;
        private com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> zake;
        private com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean>> zakf;
        private com.google.android.gms.common.api.internal.ListenerHolder<L> zakg;
        private com.google.android.gms.common.Feature[] zakh;

        private Builder() {
            this.zajw = true;
        }

        @java.lang.Deprecated
        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> register(final com.google.android.gms.common.util.BiConsumer<A, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> biConsumer) {
            this.zake = new com.google.android.gms.common.api.internal.RemoteCall(biConsumer) { // from class: com.google.android.gms.common.api.internal.zaby
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

        @java.lang.Deprecated
        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> unregister(com.google.android.gms.common.util.BiConsumer<A, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean>> biConsumer) {
            this.zake = new com.google.android.gms.common.api.internal.RemoteCall(this) { // from class: com.google.android.gms.common.api.internal.zabx
                private final com.google.android.gms.common.api.internal.RegistrationMethods.Builder zaki;

                {
                    this.zaki = this;
                }

                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                    this.zaki.zaa((com.google.android.gms.common.api.Api.AnyClient) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
                }
            };
            return this;
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> register(com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> remoteCall) {
            this.zake = remoteCall;
            return this;
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> unregister(com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean>> remoteCall) {
            this.zakf = remoteCall;
            return this;
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> withHolder(com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolder) {
            this.zakg = listenerHolder;
            return this;
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> setFeatures(com.google.android.gms.common.Feature... featureArr) {
            this.zakh = featureArr;
            return this;
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> setAutoResolveMissingFeatures(boolean z) {
            this.zajw = z;
            return this;
        }

        public com.google.android.gms.common.api.internal.RegistrationMethods<A, L> build() {
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zake != null, "Must set register function");
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zakf != null, "Must set unregister function");
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zakg != null, "Must set holder");
            return new com.google.android.gms.common.api.internal.RegistrationMethods<>(new com.google.android.gms.common.api.internal.zaca(this, this.zakg, this.zakh, this.zajw), new com.google.android.gms.common.api.internal.zabz(this, this.zakg.getListenerKey()));
        }

        final /* synthetic */ void zaa(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
            this.zake.accept(anyClient, taskCompletionSource);
        }
    }

    public static <A extends com.google.android.gms.common.api.Api.AnyClient, L> com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> builder() {
        return new com.google.android.gms.common.api.internal.RegistrationMethods.Builder<>();
    }
}
