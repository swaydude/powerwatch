package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class GmsClient<T extends android.os.IInterface> extends com.google.android.gms.common.internal.BaseGmsClient<T> implements com.google.android.gms.common.api.Api.Client, com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState {
    private final java.util.Set<com.google.android.gms.common.api.Scope> mScopes;
    private final com.google.android.gms.common.internal.ClientSettings zafa;
    private final android.accounts.Account zax;

    @Override // com.google.android.gms.common.api.Api.Client
    public com.google.android.gms.common.Feature[] getRequiredFeatures() {
        return new com.google.android.gms.common.Feature[0];
    }

    protected java.util.Set<com.google.android.gms.common.api.Scope> validateScopes(java.util.Set<com.google.android.gms.common.api.Scope> set) {
        return set;
    }

    protected GmsClient(android.content.Context context, android.os.Handler handler, int i, com.google.android.gms.common.internal.ClientSettings clientSettings) {
        this(context, handler, com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(context), com.google.android.gms.common.GoogleApiAvailability.getInstance(), i, clientSettings, (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) null, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) null);
    }

    protected GmsClient(android.content.Context context, android.os.Looper looper, int i, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(context), com.google.android.gms.common.GoogleApiAvailability.getInstance(), i, clientSettings, (com.google.android.gms.common.api.internal.ConnectionCallbacks) com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionCallbacks), (com.google.android.gms.common.api.internal.OnConnectionFailedListener) com.google.android.gms.common.internal.Preconditions.checkNotNull(onConnectionFailedListener));
    }

    @java.lang.Deprecated
    protected GmsClient(android.content.Context context, android.os.Looper looper, int i, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, i, clientSettings, (com.google.android.gms.common.api.internal.ConnectionCallbacks) connectionCallbacks, (com.google.android.gms.common.api.internal.OnConnectionFailedListener) onConnectionFailedListener);
    }

    protected GmsClient(android.content.Context context, android.os.Looper looper, int i, com.google.android.gms.common.internal.ClientSettings clientSettings) {
        this(context, looper, com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(context), com.google.android.gms.common.GoogleApiAvailability.getInstance(), i, clientSettings, (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) null, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) null);
    }

    protected GmsClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability, int i, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, gmsClientSupervisor, googleApiAvailability, i, zaa(connectionCallbacks), zaa(onConnectionFailedListener), clientSettings.getRealClientClassName());
        this.zafa = clientSettings;
        this.zax = clientSettings.getAccount();
        this.mScopes = zaa(clientSettings.getAllRequestedScopes());
    }

    protected GmsClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability, int i, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, gmsClientSupervisor, googleApiAvailability, i, clientSettings, (com.google.android.gms.common.api.internal.ConnectionCallbacks) connectionCallbacks, (com.google.android.gms.common.api.internal.OnConnectionFailedListener) onConnectionFailedListener);
    }

    protected GmsClient(android.content.Context context, android.os.Handler handler, com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability, int i, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, handler, gmsClientSupervisor, googleApiAvailability, i, zaa(connectionCallbacks), zaa(onConnectionFailedListener));
        this.zafa = (com.google.android.gms.common.internal.ClientSettings) com.google.android.gms.common.internal.Preconditions.checkNotNull(clientSettings);
        this.zax = clientSettings.getAccount();
        this.mScopes = zaa(clientSettings.getAllRequestedScopes());
    }

    @java.lang.Deprecated
    protected GmsClient(android.content.Context context, android.os.Handler handler, com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability, int i, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, handler, gmsClientSupervisor, googleApiAvailability, i, clientSettings, (com.google.android.gms.common.api.internal.ConnectionCallbacks) connectionCallbacks, (com.google.android.gms.common.api.internal.OnConnectionFailedListener) onConnectionFailedListener);
    }

    private final java.util.Set<com.google.android.gms.common.api.Scope> zaa(java.util.Set<com.google.android.gms.common.api.Scope> set) {
        java.util.Set<com.google.android.gms.common.api.Scope> setValidateScopes = validateScopes(set);
        java.util.Iterator<com.google.android.gms.common.api.Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new java.lang.IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setValidateScopes;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final android.accounts.Account getAccount() {
        return this.zax;
    }

    protected final com.google.android.gms.common.internal.ClientSettings getClientSettings() {
        return this.zafa;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
        return this.mScopes;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public java.util.Set<com.google.android.gms.common.api.Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.mScopes : java.util.Collections.emptySet();
    }

    private static com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks zaa(com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks) {
        if (connectionCallbacks == null) {
            return null;
        }
        return new com.google.android.gms.common.internal.zaf(connectionCallbacks);
    }

    private static com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener zaa(com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        if (onConnectionFailedListener == null) {
            return null;
        }
        return new com.google.android.gms.common.internal.zag(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }
}
