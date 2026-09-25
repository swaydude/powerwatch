package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zace extends com.google.android.gms.signin.internal.zad implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    private static com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> zakm = com.google.android.gms.signin.zab.zapv;
    private final android.content.Context mContext;
    private final android.os.Handler mHandler;
    private java.util.Set<com.google.android.gms.common.api.Scope> mScopes;
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> zaaw;
    private com.google.android.gms.common.internal.ClientSettings zafa;
    private com.google.android.gms.signin.zac zagf;
    private com.google.android.gms.common.api.internal.zacf zakn;

    public zace(android.content.Context context, android.os.Handler handler, com.google.android.gms.common.internal.ClientSettings clientSettings) {
        this(context, handler, clientSettings, zakm);
    }

    public zace(android.content.Context context, android.os.Handler handler, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> abstractClientBuilder) {
        this.mContext = context;
        this.mHandler = handler;
        this.zafa = (com.google.android.gms.common.internal.ClientSettings) com.google.android.gms.common.internal.Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.mScopes = clientSettings.getRequiredScopes();
        this.zaaw = abstractClientBuilder;
    }

    public final void zaa(com.google.android.gms.common.api.internal.zacf zacfVar) {
        com.google.android.gms.signin.zac zacVar = this.zagf;
        if (zacVar != null) {
            zacVar.disconnect();
        }
        this.zafa.setClientSessionId(java.lang.Integer.valueOf(java.lang.System.identityHashCode(this)));
        com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> abstractClientBuilder = this.zaaw;
        android.content.Context context = this.mContext;
        android.os.Looper looper = this.mHandler.getLooper();
        com.google.android.gms.common.internal.ClientSettings clientSettings = this.zafa;
        this.zagf = (com.google.android.gms.signin.zac) abstractClientBuilder.buildClient(context, looper, clientSettings, clientSettings.getSignInOptions(), (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) this, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) this);
        this.zakn = zacfVar;
        java.util.Set<com.google.android.gms.common.api.Scope> set = this.mScopes;
        if (set == null || set.isEmpty()) {
            this.mHandler.post(new com.google.android.gms.common.api.internal.zacd(this));
        } else {
            this.zagf.connect();
        }
    }

    public final com.google.android.gms.signin.zac zabo() {
        return this.zagf;
    }

    public final void zabq() {
        com.google.android.gms.signin.zac zacVar = this.zagf;
        if (zacVar != null) {
            zacVar.disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        this.zagf.zaa(this);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zagf.disconnect();
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zakn.zag(connectionResult);
    }

    @Override // com.google.android.gms.signin.internal.zad, com.google.android.gms.signin.internal.zac
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        this.mHandler.post(new com.google.android.gms.common.api.internal.zacg(this, zakVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zac(com.google.android.gms.signin.internal.zak zakVar) {
        com.google.android.gms.common.ConnectionResult connectionResult = zakVar.getConnectionResult();
        if (connectionResult.isSuccess()) {
            com.google.android.gms.common.internal.ResolveAccountResponse resolveAccountResponseZacv = zakVar.zacv();
            com.google.android.gms.common.ConnectionResult connectionResult2 = resolveAccountResponseZacv.getConnectionResult();
            if (!connectionResult2.isSuccess()) {
                java.lang.String strValueOf = java.lang.String.valueOf(connectionResult2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(strValueOf);
                android.util.Log.wtf("SignInCoordinator", sb.toString(), new java.lang.Exception());
                this.zakn.zag(connectionResult2);
                this.zagf.disconnect();
                return;
            }
            this.zakn.zaa(resolveAccountResponseZacv.getAccountAccessor(), this.mScopes);
        } else {
            this.zakn.zag(connectionResult);
        }
        this.zagf.disconnect();
    }
}
