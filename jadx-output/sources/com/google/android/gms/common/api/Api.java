package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class Api<O extends com.google.android.gms.common.api.Api.ApiOptions> {
    private final java.lang.String mName;
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder<?, O> zaaw;
    private final com.google.android.gms.common.api.Api.zaa<?, O> zaax;
    private final com.google.android.gms.common.api.Api.ClientKey<?> zaay;
    private final com.google.android.gms.common.api.Api.zab<?> zaaz;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class AbstractClientBuilder<T extends com.google.android.gms.common.api.Api.Client, O> extends com.google.android.gms.common.api.Api.BaseClientBuilder<T, O> {
        @java.lang.Deprecated
        public T buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, O o, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return (T) buildClient(context, looper, clientSettings, (java.lang.Object) o, (com.google.android.gms.common.api.internal.ConnectionCallbacks) connectionCallbacks, (com.google.android.gms.common.api.internal.OnConnectionFailedListener) onConnectionFailedListener);
        }

        public T buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, O o, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
            throw new java.lang.UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface AnyClient {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class AnyClientKey<C extends com.google.android.gms.common.api.Api.AnyClient> {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface ApiOptions {

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface HasAccountOptions extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions, com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions {
            android.accounts.Account getAccount();
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface HasGoogleSignInAccountOptions extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions {
            com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleSignInAccount();
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface HasOptions extends com.google.android.gms.common.api.Api.ApiOptions {
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public static final class NoOptions implements com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions {
            private NoOptions() {
            }
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface NotRequiredOptions extends com.google.android.gms.common.api.Api.ApiOptions {
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface Optional extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions, com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions {
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface Client extends com.google.android.gms.common.api.Api.AnyClient {
        void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        void disconnect();

        void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

        com.google.android.gms.common.Feature[] getAvailableFeatures();

        java.lang.String getEndpointPackageName();

        int getMinApkVersion();

        void getRemoteService(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, java.util.Set<com.google.android.gms.common.api.Scope> set);

        com.google.android.gms.common.Feature[] getRequiredFeatures();

        java.util.Set<com.google.android.gms.common.api.Scope> getScopesForConnectionlessNonSignIn();

        android.os.IBinder getServiceBrokerBinder();

        android.content.Intent getSignInIntent();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks signOutCallbacks);

        boolean providesSignIn();

        boolean requiresAccount();

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class ClientKey<C extends com.google.android.gms.common.api.Api.Client> extends com.google.android.gms.common.api.Api.AnyClientKey<C> {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface SimpleClient<T extends android.os.IInterface> extends com.google.android.gms.common.api.Api.AnyClient {
        T createServiceInterface(android.os.IBinder iBinder);

        android.content.Context getContext();

        java.lang.String getServiceDescriptor();

        java.lang.String getStartServiceAction();

        void setState(int i, T t);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class zaa<T extends com.google.android.gms.common.api.Api.SimpleClient<? extends android.os.IInterface>, O> extends com.google.android.gms.common.api.Api.BaseClientBuilder<T, O> {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class zab<C extends com.google.android.gms.common.api.Api.SimpleClient<? extends android.os.IInterface>> extends com.google.android.gms.common.api.Api.AnyClientKey<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends com.google.android.gms.common.api.Api.Client> Api(java.lang.String str, com.google.android.gms.common.api.Api.AbstractClientBuilder<C, O> abstractClientBuilder, com.google.android.gms.common.api.Api.ClientKey<C> clientKey) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(abstractClientBuilder, "Cannot construct an Api with a null ClientBuilder");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(clientKey, "Cannot construct an Api with a null ClientKey");
        this.mName = str;
        this.zaaw = abstractClientBuilder;
        this.zaax = null;
        this.zaay = clientKey;
        this.zaaz = null;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class BaseClientBuilder<T extends com.google.android.gms.common.api.Api.AnyClient, O> {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public int getPriority() {
            return Integer.MAX_VALUE;
        }

        public java.util.List<com.google.android.gms.common.api.Scope> getImpliedScopes(O o) {
            return java.util.Collections.emptyList();
        }
    }

    public final com.google.android.gms.common.api.Api.BaseClientBuilder<?, O> zah() {
        return this.zaaw;
    }

    public final com.google.android.gms.common.api.Api.AbstractClientBuilder<?, O> zai() {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zaaw != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.zaaw;
    }

    public final com.google.android.gms.common.api.Api.AnyClientKey<?> getClientKey() {
        com.google.android.gms.common.api.Api.ClientKey<?> clientKey = this.zaay;
        if (clientKey != null) {
            return clientKey;
        }
        throw new java.lang.IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    public final java.lang.String getName() {
        return this.mName;
    }
}
