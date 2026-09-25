package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zaak implements com.google.android.gms.common.api.internal.zabb {
    private final android.content.Context mContext;
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> zacf;
    private final java.util.concurrent.locks.Lock zaer;
    private final java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> zaew;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zaey;
    private final com.google.android.gms.common.internal.ClientSettings zafa;
    private com.google.android.gms.common.ConnectionResult zafi;
    private final com.google.android.gms.common.api.internal.zabe zafv;
    private int zaga;
    private int zagc;
    private com.google.android.gms.signin.zac zagf;
    private boolean zagg;
    private boolean zagh;
    private boolean zagi;
    private com.google.android.gms.common.internal.IAccountAccessor zagj;
    private boolean zagk;
    private boolean zagl;
    private int zagb = 0;
    private final android.os.Bundle zagd = new android.os.Bundle();
    private final java.util.Set<com.google.android.gms.common.api.Api.AnyClientKey> zage = new java.util.HashSet();
    private java.util.ArrayList<java.util.concurrent.Future<?>> zagm = new java.util.ArrayList<>();

    public zaak(com.google.android.gms.common.api.internal.zabe zabeVar, com.google.android.gms.common.internal.ClientSettings clientSettings, java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> map, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> abstractClientBuilder, java.util.concurrent.locks.Lock lock, android.content.Context context) {
        this.zafv = zabeVar;
        this.zafa = clientSettings;
        this.zaew = map;
        this.zaey = googleApiAvailabilityLight;
        this.zacf = abstractClientBuilder;
        this.zaer = lock;
        this.mContext = context;
    }

    private static java.lang.String zad(int i) {
        if (i != 0) {
            return i != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE";
        }
        return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void connect() {
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void begin() {
        this.zafv.zaht.clear();
        this.zagh = false;
        com.google.android.gms.common.api.internal.zaaj zaajVar = null;
        this.zafi = null;
        this.zagb = 0;
        this.zagg = true;
        this.zagi = false;
        this.zagk = false;
        java.util.HashMap map = new java.util.HashMap();
        boolean z = false;
        for (com.google.android.gms.common.api.Api<?> api : this.zaew.keySet()) {
            com.google.android.gms.common.api.Api.Client client = this.zafv.zahd.get(api.getClientKey());
            z |= api.zah().getPriority() == 1;
            boolean zBooleanValue = this.zaew.get(api).booleanValue();
            if (client.requiresSignIn()) {
                this.zagh = true;
                if (zBooleanValue) {
                    this.zage.add(api.getClientKey());
                } else {
                    this.zagg = false;
                }
            }
            map.put(client, new com.google.android.gms.common.api.internal.zaam(this, api, zBooleanValue));
        }
        if (z) {
            this.zagh = false;
        }
        if (this.zagh) {
            this.zafa.setClientSessionId(java.lang.Integer.valueOf(java.lang.System.identityHashCode(this.zafv.zaeh)));
            com.google.android.gms.common.api.internal.zaar zaarVar = new com.google.android.gms.common.api.internal.zaar(this, zaajVar);
            com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> abstractClientBuilder = this.zacf;
            android.content.Context context = this.mContext;
            android.os.Looper looper = this.zafv.zaeh.getLooper();
            com.google.android.gms.common.internal.ClientSettings clientSettings = this.zafa;
            this.zagf = (com.google.android.gms.signin.zac) abstractClientBuilder.buildClient(context, looper, clientSettings, clientSettings.getSignInOptions(), (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) zaarVar, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) zaarVar);
        }
        this.zagc = this.zafv.zahd.size();
        this.zagm.add(com.google.android.gms.common.api.internal.zabf.zaaz().submit(new com.google.android.gms.common.api.internal.zaal(this, map)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaam() {
        int i = this.zagc - 1;
        this.zagc = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            android.util.Log.w("GACConnecting", this.zafv.zaeh.zaaw());
            android.util.Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new java.lang.Exception());
            zae(new com.google.android.gms.common.ConnectionResult(8, null));
            return false;
        }
        if (this.zafi == null) {
            return true;
        }
        this.zafv.zahw = this.zaga;
        zae(this.zafi);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaa(com.google.android.gms.signin.internal.zak zakVar) {
        if (zac(0)) {
            com.google.android.gms.common.ConnectionResult connectionResult = zakVar.getConnectionResult();
            if (connectionResult.isSuccess()) {
                com.google.android.gms.common.internal.ResolveAccountResponse resolveAccountResponseZacv = zakVar.zacv();
                com.google.android.gms.common.ConnectionResult connectionResult2 = resolveAccountResponseZacv.getConnectionResult();
                if (!connectionResult2.isSuccess()) {
                    java.lang.String strValueOf = java.lang.String.valueOf(connectionResult2);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(strValueOf);
                    android.util.Log.wtf("GACConnecting", sb.toString(), new java.lang.Exception());
                    zae(connectionResult2);
                    return;
                }
                this.zagi = true;
                this.zagj = resolveAccountResponseZacv.getAccountAccessor();
                this.zagk = resolveAccountResponseZacv.getSaveDefaultAccount();
                this.zagl = resolveAccountResponseZacv.isFromCrossClientAuth();
                zaan();
                return;
            }
            if (zad(connectionResult)) {
                zaap();
                zaan();
            } else {
                zae(connectionResult);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaan() {
        if (this.zagc != 0) {
            return;
        }
        if (!this.zagh || this.zagi) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.zagb = 1;
            this.zagc = this.zafv.zahd.size();
            for (com.google.android.gms.common.api.Api.AnyClientKey<?> anyClientKey : this.zafv.zahd.keySet()) {
                if (this.zafv.zaht.containsKey(anyClientKey)) {
                    if (zaam()) {
                        zaao();
                    }
                } else {
                    arrayList.add(this.zafv.zahd.get(anyClientKey));
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.zagm.add(com.google.android.gms.common.api.internal.zabf.zaaz().submit(new com.google.android.gms.common.api.internal.zaaq(this, arrayList)));
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void onConnected(android.os.Bundle bundle) {
        if (zac(1)) {
            if (bundle != null) {
                this.zagd.putAll(bundle);
            }
            if (zaam()) {
                zaao();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api<?> api, boolean z) {
        if (zac(1)) {
            zab(connectionResult, api, z);
            if (zaam()) {
                zaao();
            }
        }
    }

    private final void zaao() {
        this.zafv.zaay();
        com.google.android.gms.common.api.internal.zabf.zaaz().execute(new com.google.android.gms.common.api.internal.zaaj(this));
        com.google.android.gms.signin.zac zacVar = this.zagf;
        if (zacVar != null) {
            if (this.zagk) {
                zacVar.zaa(this.zagj, this.zagl);
            }
            zab(false);
        }
        java.util.Iterator<com.google.android.gms.common.api.Api.AnyClientKey<?>> it = this.zafv.zaht.keySet().iterator();
        while (it.hasNext()) {
            this.zafv.zahd.get(it.next()).disconnect();
        }
        this.zafv.zahx.zab(this.zagd.isEmpty() ? null : this.zagd);
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        this.zafv.zaeh.zafd.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(T t) {
        throw new java.lang.IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final boolean disconnect() {
        zaaq();
        zab(true);
        this.zafv.zaf(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void onConnectionSuspended(int i) {
        zae(new com.google.android.gms.common.ConnectionResult(8, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    public final void zab(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api<?> api, boolean z) {
        int priority = api.zah().getPriority();
        boolean z2 = false;
        if (z) {
            if (connectionResult.hasResolution() || this.zaey.getErrorResolutionIntent(connectionResult.getErrorCode()) != null) {
                if (this.zafi != null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
            }
        } else if (this.zafi != null || priority < this.zaga) {
            z2 = true;
        }
        if (z2) {
            this.zafi = connectionResult;
            this.zaga = priority;
        }
        this.zafv.zaht.put(api.getClientKey(), connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaap() {
        this.zagh = false;
        this.zafv.zaeh.zahe = java.util.Collections.emptySet();
        for (com.google.android.gms.common.api.Api.AnyClientKey<?> anyClientKey : this.zage) {
            if (!this.zafv.zaht.containsKey(anyClientKey)) {
                this.zafv.zaht.put(anyClientKey, new com.google.android.gms.common.ConnectionResult(17, null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zad(com.google.android.gms.common.ConnectionResult connectionResult) {
        return this.zagg && !connectionResult.hasResolution();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zae(com.google.android.gms.common.ConnectionResult connectionResult) {
        zaaq();
        zab(!connectionResult.hasResolution());
        this.zafv.zaf(connectionResult);
        this.zafv.zahx.zac(connectionResult);
    }

    private final void zab(boolean z) {
        com.google.android.gms.signin.zac zacVar = this.zagf;
        if (zacVar != null) {
            if (zacVar.isConnected() && z) {
                this.zagf.zacu();
            }
            this.zagf.disconnect();
            if (this.zafa.isSignInClientDisconnectFixEnabled()) {
                this.zagf = null;
            }
            this.zagj = null;
        }
    }

    private final void zaaq() {
        java.util.ArrayList<java.util.concurrent.Future<?>> arrayList = this.zagm;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.util.concurrent.Future<?> future = arrayList.get(i);
            i++;
            future.cancel(true);
        }
        this.zagm.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Set<com.google.android.gms.common.api.Scope> zaar() {
        if (this.zafa == null) {
            return java.util.Collections.emptySet();
        }
        java.util.HashSet hashSet = new java.util.HashSet(this.zafa.getRequiredScopes());
        java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings> optionalApiSettings = this.zafa.getOptionalApiSettings();
        for (com.google.android.gms.common.api.Api<?> api : optionalApiSettings.keySet()) {
            if (!this.zafv.zaht.containsKey(api.getClientKey())) {
                hashSet.addAll(optionalApiSettings.get(api).mScopes);
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zac(int i) {
        if (this.zagb == i) {
            return true;
        }
        android.util.Log.w("GACConnecting", this.zafv.zaeh.zaaw());
        java.lang.String strValueOf = java.lang.String.valueOf(this);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(strValueOf);
        android.util.Log.w("GACConnecting", sb.toString());
        int i2 = this.zagc;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        android.util.Log.w("GACConnecting", sb2.toString());
        java.lang.String strZad = zad(this.zagb);
        java.lang.String strZad2 = zad(i);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(strZad).length() + 70 + java.lang.String.valueOf(strZad2).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(strZad);
        sb3.append(" but received callback for step ");
        sb3.append(strZad2);
        android.util.Log.e("GACConnecting", sb3.toString(), new java.lang.Exception());
        zae(new com.google.android.gms.common.ConnectionResult(8, null));
        return false;
    }
}
