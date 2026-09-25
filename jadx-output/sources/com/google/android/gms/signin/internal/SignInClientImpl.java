package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class SignInClientImpl extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.signin.internal.zae> implements com.google.android.gms.signin.zac {
    private final com.google.android.gms.common.internal.ClientSettings zafa;
    private java.lang.Integer zaoo;
    private final boolean zasx;
    private final android.os.Bundle zasy;

    private SignInClientImpl(android.content.Context context, android.os.Looper looper, boolean z, com.google.android.gms.common.internal.ClientSettings clientSettings, android.os.Bundle bundle, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zasx = true;
        this.zafa = clientSettings;
        this.zasy = bundle;
        this.zaoo = clientSettings.getClientSessionId();
    }

    @Override // com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected java.lang.String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public SignInClientImpl(android.content.Context context, android.os.Looper looper, boolean z, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.signin.SignInOptions signInOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, true, clientSettings, createBundleFromClientSettings(clientSettings), connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public boolean requiresSignIn() {
        return this.zasx;
    }

    @Override // com.google.android.gms.signin.zac
    public final void zaa(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((com.google.android.gms.signin.internal.zae) getService()).zaa(iAccountAccessor, this.zaoo.intValue(), z);
        } catch (android.os.RemoteException unused) {
            android.util.Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // com.google.android.gms.signin.zac
    public final void zacu() {
        try {
            ((com.google.android.gms.signin.internal.zae) getService()).zam(this.zaoo.intValue());
        } catch (android.os.RemoteException unused) {
            android.util.Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // com.google.android.gms.signin.zac
    public final void zaa(com.google.android.gms.signin.internal.zac zacVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zacVar, "Expecting a valid ISignInCallbacks");
        try {
            android.accounts.Account accountOrDefault = this.zafa.getAccountOrDefault();
            ((com.google.android.gms.signin.internal.zae) getService()).zaa(new com.google.android.gms.signin.internal.zai(new com.google.android.gms.common.internal.ResolveAccountRequest(accountOrDefault, this.zaoo.intValue(), "<<default account>>".equals(accountOrDefault.name) ? com.google.android.gms.auth.api.signin.internal.Storage.getInstance(getContext()).getSavedDefaultGoogleSignInAccount() : null)), zacVar);
        } catch (android.os.RemoteException e) {
            android.util.Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zacVar.zab(new com.google.android.gms.signin.internal.zak(8));
            } catch (android.os.RemoteException unused) {
                android.util.Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected android.os.Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.zafa.getRealClientPackageName())) {
            this.zasy.putString("com.google.android.gms.signin.internal.realClientPackageName", this.zafa.getRealClientPackageName());
        }
        return this.zasy;
    }

    @Override // com.google.android.gms.signin.zac
    public final void connect() {
        connect(new com.google.android.gms.common.internal.BaseGmsClient.LegacyClientCallbackAdapter());
    }

    public static android.os.Bundle createBundleFromClientSettings(com.google.android.gms.common.internal.ClientSettings clientSettings) {
        com.google.android.gms.signin.SignInOptions signInOptions = clientSettings.getSignInOptions();
        java.lang.Integer clientSessionId = clientSettings.getClientSessionId();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.getAccount());
        if (clientSessionId != null) {
            bundle.putInt(com.google.android.gms.common.internal.ClientSettings.KEY_CLIENT_SESSION_ID, clientSessionId.intValue());
        }
        if (signInOptions != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", signInOptions.isOfflineAccessRequested());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", signInOptions.isIdTokenRequested());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", signInOptions.getServerClientId());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", signInOptions.isForceCodeForRefreshToken());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", signInOptions.getHostedDomain());
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", signInOptions.getLogSessionId());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", signInOptions.waitForAccessTokenRefresh());
            if (signInOptions.getAuthApiSignInModuleVersion() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", signInOptions.getAuthApiSignInModuleVersion().longValue());
            }
            if (signInOptions.getRealClientLibraryVersion() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", signInOptions.getRealClientLibraryVersion().longValue());
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.signin.internal.zae) {
            return (com.google.android.gms.signin.internal.zae) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.signin.internal.zag(iBinder);
    }
}
