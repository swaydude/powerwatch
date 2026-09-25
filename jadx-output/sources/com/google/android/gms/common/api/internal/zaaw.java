package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zaaw extends com.google.android.gms.common.api.GoogleApiClient implements com.google.android.gms.common.api.internal.zabs {
    private final android.content.Context mContext;
    private final android.os.Looper zabl;
    private final int zacc;
    private final com.google.android.gms.common.GoogleApiAvailability zace;
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> zacf;
    private boolean zaci;
    private final java.util.concurrent.locks.Lock zaer;
    private final java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> zaew;
    private final com.google.android.gms.common.internal.ClientSettings zafa;
    private final com.google.android.gms.common.internal.GmsClientEventManager zagw;
    private volatile boolean zagy;
    private long zagz;
    private long zaha;
    private final com.google.android.gms.common.api.internal.zaaz zahb;
    private com.google.android.gms.common.api.internal.zabq zahc;
    final java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> zahd;
    java.util.Set<com.google.android.gms.common.api.Scope> zahe;
    private final com.google.android.gms.common.api.internal.ListenerHolders zahf;
    private final java.util.ArrayList<com.google.android.gms.common.api.internal.zap> zahg;
    private java.lang.Integer zahh;
    java.util.Set<com.google.android.gms.common.api.internal.zack> zahi;
    final com.google.android.gms.common.api.internal.zacp zahj;
    private final com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState zahk;
    private com.google.android.gms.common.api.internal.zabr zagx = null;
    final java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<?, ?>> zafd = new java.util.LinkedList();

    public zaaw(android.content.Context context, java.util.concurrent.locks.Lock lock, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability, com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> abstractClientBuilder, java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> map, java.util.List<com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks> list, java.util.List<com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener> list2, java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> map2, int i, int i2, java.util.ArrayList<com.google.android.gms.common.api.internal.zap> arrayList, boolean z) {
        this.zagz = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() ? 10000L : 120000L;
        this.zaha = 5000L;
        this.zahe = new java.util.HashSet();
        this.zahf = new com.google.android.gms.common.api.internal.ListenerHolders();
        this.zahh = null;
        this.zahi = null;
        com.google.android.gms.common.api.internal.zaav zaavVar = new com.google.android.gms.common.api.internal.zaav(this);
        this.zahk = zaavVar;
        this.mContext = context;
        this.zaer = lock;
        this.zaci = false;
        this.zagw = new com.google.android.gms.common.internal.GmsClientEventManager(looper, zaavVar);
        this.zabl = looper;
        this.zahb = new com.google.android.gms.common.api.internal.zaaz(this, looper);
        this.zace = googleApiAvailability;
        this.zacc = i;
        if (i >= 0) {
            this.zahh = java.lang.Integer.valueOf(i2);
        }
        this.zaew = map;
        this.zahd = map2;
        this.zahg = arrayList;
        this.zahj = new com.google.android.gms.common.api.internal.zacp(map2);
        java.util.Iterator<com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks> it = list.iterator();
        while (it.hasNext()) {
            this.zagw.registerConnectionCallbacks(it.next());
        }
        java.util.Iterator<com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.zagw.registerConnectionFailedListener(it2.next());
        }
        this.zafa = clientSettings;
        this.zacf = abstractClientBuilder;
    }

    private static java.lang.String zaf(int i) {
        if (i == 1) {
            return "SIGN_IN_MODE_REQUIRED";
        }
        if (i != 2) {
            return i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE";
        }
        return "SIGN_IN_MODE_OPTIONAL";
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(t.getClientKey() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean zContainsKey = this.zahd.containsKey(t.getClientKey());
        java.lang.String name = t.getApi() != null ? t.getApi().getName() : "the API";
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(name);
        sb.append(" required for this call.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(zContainsKey, sb.toString());
        this.zaer.lock();
        try {
            com.google.android.gms.common.api.internal.zabr zabrVar = this.zagx;
            if (zabrVar == null) {
                this.zafd.add(t);
                return t;
            }
            return (T) zabrVar.enqueue(t);
        } finally {
            this.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(T t) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(t.getClientKey() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean zContainsKey = this.zahd.containsKey(t.getClientKey());
        java.lang.String name = t.getApi() != null ? t.getApi().getName() : "the API";
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(name);
        sb.append(" required for this call.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(zContainsKey, sb.toString());
        this.zaer.lock();
        try {
            if (this.zagx == null) {
                throw new java.lang.IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.zagy) {
                this.zafd.add(t);
                while (!this.zafd.isEmpty()) {
                    com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<?, ?> apiMethodImplRemove = this.zafd.remove();
                    this.zahj.zac(apiMethodImplRemove);
                    apiMethodImplRemove.setFailedResult(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
                }
                this.zaer.unlock();
                return t;
            }
            T t2 = (T) this.zagx.execute(t);
            this.zaer.unlock();
            return t2;
        } catch (java.lang.Throwable th) {
            this.zaer.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> com.google.android.gms.common.api.internal.ListenerHolder<L> registerListener(L l) {
        this.zaer.lock();
        try {
            return this.zahf.zaa(l, this.zabl, "NO_TYPE");
        } finally {
            this.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <C extends com.google.android.gms.common.api.Api.Client> C getClient(com.google.android.gms.common.api.Api.AnyClientKey<C> anyClientKey) {
        C c = (C) this.zahd.get(anyClientKey);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(com.google.android.gms.common.api.Api<?> api) {
        return this.zahd.containsKey(api.getClientKey());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(com.google.android.gms.common.api.Api<?> api) {
        com.google.android.gms.common.api.Api.Client client;
        return isConnected() && (client = this.zahd.get(api.getClientKey())) != null && client.isConnected();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.Api<?> api) {
        this.zaer.lock();
        try {
            if (!isConnected() && !this.zagy) {
                throw new java.lang.IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (this.zahd.containsKey(api.getClientKey())) {
                com.google.android.gms.common.ConnectionResult connectionResult = this.zagx.getConnectionResult(api);
                if (connectionResult == null) {
                    if (this.zagy) {
                        com.google.android.gms.common.ConnectionResult connectionResult2 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
                        this.zaer.unlock();
                        return connectionResult2;
                    }
                    android.util.Log.w("GoogleApiClientImpl", zaaw());
                    android.util.Log.wtf("GoogleApiClientImpl", java.lang.String.valueOf(api.getName()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new java.lang.Exception());
                    com.google.android.gms.common.ConnectionResult connectionResult3 = new com.google.android.gms.common.ConnectionResult(8, null);
                    this.zaer.unlock();
                    return connectionResult3;
                }
                this.zaer.unlock();
                return connectionResult;
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(api.getName()).concat(" was never registered with GoogleApiClient"));
        } catch (java.lang.Throwable th) {
            this.zaer.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        this.zaer.lock();
        try {
            if (this.zacc >= 0) {
                com.google.android.gms.common.internal.Preconditions.checkState(this.zahh != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                java.lang.Integer num = this.zahh;
                if (num == null) {
                    this.zahh = java.lang.Integer.valueOf(zaa(this.zahd.values(), false));
                } else if (num.intValue() == 2) {
                    throw new java.lang.IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            connect(this.zahh.intValue());
            this.zaer.unlock();
        } catch (java.lang.Throwable th) {
            this.zaer.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int i) {
        this.zaer.lock();
        boolean z = true;
        if (i != 3 && i != 1 && i != 2) {
            z = false;
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, sb.toString());
            zae(i);
            zaas();
        } finally {
            this.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult blockingConnect() {
        boolean z = true;
        com.google.android.gms.common.internal.Preconditions.checkState(android.os.Looper.myLooper() != android.os.Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.zaer.lock();
        try {
            if (this.zacc >= 0) {
                if (this.zahh == null) {
                    z = false;
                }
                com.google.android.gms.common.internal.Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                java.lang.Integer num = this.zahh;
                if (num == null) {
                    this.zahh = java.lang.Integer.valueOf(zaa(this.zahd.values(), false));
                } else if (num.intValue() == 2) {
                    throw new java.lang.IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            zae(this.zahh.intValue());
            this.zagw.enableCallbacks();
            com.google.android.gms.common.ConnectionResult connectionResultBlockingConnect = this.zagx.blockingConnect();
            this.zaer.unlock();
            return connectionResultBlockingConnect;
        } catch (java.lang.Throwable th) {
            this.zaer.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult blockingConnect(long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.common.internal.Preconditions.checkState(android.os.Looper.myLooper() != android.os.Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        this.zaer.lock();
        try {
            java.lang.Integer num = this.zahh;
            if (num == null) {
                this.zahh = java.lang.Integer.valueOf(zaa(this.zahd.values(), false));
            } else if (num.intValue() == 2) {
                throw new java.lang.IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zae(this.zahh.intValue());
            this.zagw.enableCallbacks();
            com.google.android.gms.common.ConnectionResult connectionResultBlockingConnect = this.zagx.blockingConnect(j, timeUnit);
            this.zaer.unlock();
            return connectionResultBlockingConnect;
        } catch (java.lang.Throwable th) {
            this.zaer.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        this.zaer.lock();
        try {
            this.zahj.release();
            com.google.android.gms.common.api.internal.zabr zabrVar = this.zagx;
            if (zabrVar != null) {
                zabrVar.disconnect();
            }
            this.zahf.release();
            for (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<?, ?> apiMethodImpl : this.zafd) {
                apiMethodImpl.zaa((com.google.android.gms.common.api.internal.zacq) null);
                apiMethodImpl.cancel();
            }
            this.zafd.clear();
            if (this.zagx == null) {
                return;
            }
            zaau();
            this.zagw.disableCallbacks();
        } finally {
            this.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        disconnect();
        connect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> clearDefaultAccountAndReconnect() {
        com.google.android.gms.common.internal.Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        com.google.android.gms.common.internal.Preconditions.checkState(this.zahh.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult = new com.google.android.gms.common.api.internal.StatusPendingResult(this);
        if (this.zahd.containsKey(com.google.android.gms.common.internal.service.Common.CLIENT_KEY)) {
            zaa(this, statusPendingResult, false);
        } else {
            java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            com.google.android.gms.common.api.GoogleApiClient googleApiClientBuild = new com.google.android.gms.common.api.GoogleApiClient.Builder(this.mContext).addApi(com.google.android.gms.common.internal.service.Common.API).addConnectionCallbacks(new com.google.android.gms.common.api.internal.zaay(this, atomicReference, statusPendingResult)).addOnConnectionFailedListener(new com.google.android.gms.common.api.internal.zaax(this, statusPendingResult)).setHandler(this.zahb).build();
            atomicReference.set(googleApiClientBuild);
            googleApiClientBuild.connect();
        }
        return statusPendingResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaa(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult, boolean z) {
        com.google.android.gms.common.internal.service.Common.zapw.zaa(googleApiClient).setResultCallback(new com.google.android.gms.common.api.internal.zaba(this, statusPendingResult, z, googleApiClient));
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(androidx.fragment.app.FragmentActivity fragmentActivity) {
        com.google.android.gms.common.api.internal.LifecycleActivity lifecycleActivity = new com.google.android.gms.common.api.internal.LifecycleActivity((android.app.Activity) fragmentActivity);
        if (this.zacc >= 0) {
            com.google.android.gms.common.api.internal.zai.zaa(lifecycleActivity).zaa(this.zacc);
            return;
        }
        throw new java.lang.IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        com.google.android.gms.common.api.internal.zabr zabrVar = this.zagx;
        return zabrVar != null && zabrVar.isConnected();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        com.google.android.gms.common.api.internal.zabr zabrVar = this.zagx;
        return zabrVar != null && zabrVar.isConnecting();
    }

    private final void zae(int i) {
        java.lang.Integer num = this.zahh;
        if (num == null) {
            this.zahh = java.lang.Integer.valueOf(i);
        } else if (num.intValue() != i) {
            java.lang.String strZaf = zaf(i);
            java.lang.String strZaf2 = zaf(this.zahh.intValue());
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strZaf).length() + 51 + java.lang.String.valueOf(strZaf2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(strZaf);
            sb.append(". Mode was already set to ");
            sb.append(strZaf2);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (this.zagx != null) {
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (com.google.android.gms.common.api.Api.Client client : this.zahd.values()) {
            if (client.requiresSignIn()) {
                z = true;
            }
            if (client.providesSignIn()) {
                z2 = true;
            }
        }
        int iIntValue = this.zahh.intValue();
        if (iIntValue == 1) {
            if (!z) {
                throw new java.lang.IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z2) {
                throw new java.lang.IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else if (iIntValue == 2 && z) {
            if (this.zaci) {
                this.zagx = new com.google.android.gms.common.api.internal.zav(this.mContext, this.zaer, this.zabl, this.zace, this.zahd, this.zafa, this.zaew, this.zacf, this.zahg, this, true);
                return;
            } else {
                this.zagx = com.google.android.gms.common.api.internal.zaq.zaa(this.mContext, this, this.zaer, this.zabl, this.zace, this.zahd, this.zafa, this.zaew, this.zacf, this.zahg);
                return;
            }
        }
        if (this.zaci && !z2) {
            this.zagx = new com.google.android.gms.common.api.internal.zav(this.mContext, this.zaer, this.zabl, this.zace, this.zahd, this.zafa, this.zaew, this.zacf, this.zahg, this, false);
        } else {
            this.zagx = new com.google.android.gms.common.api.internal.zabe(this.mContext, this, this.zaer, this.zabl, this.zace, this.zahd, this.zafa, this.zaew, this.zacf, this.zahg, this);
        }
    }

    private final void zaas() {
        this.zagw.enableCallbacks();
        this.zagx.connect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resume() {
        this.zaer.lock();
        try {
            if (this.zagy) {
                zaas();
            }
        } finally {
            this.zaer.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaat() {
        this.zaer.lock();
        try {
            if (zaau()) {
                zaas();
            }
        } finally {
            this.zaer.unlock();
        }
    }

    final boolean zaau() {
        if (!this.zagy) {
            return false;
        }
        this.zagy = false;
        this.zahb.removeMessages(2);
        this.zahb.removeMessages(1);
        com.google.android.gms.common.api.internal.zabq zabqVar = this.zahc;
        if (zabqVar != null) {
            zabqVar.unregister();
            this.zahc = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zagw.registerConnectionCallbacks(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zagw.isConnectionCallbacksRegistered(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zagw.unregisterConnectionCallbacks(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zagw.registerConnectionFailedListener(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zagw.isConnectionFailedListenerRegistered(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zagw.unregisterConnectionFailedListener(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void zab(android.os.Bundle bundle) {
        while (!this.zafd.isEmpty()) {
            execute(this.zafd.remove());
        }
        this.zagw.onConnectionSuccess(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void zac(com.google.android.gms.common.ConnectionResult connectionResult) {
        if (!this.zace.isPlayServicesPossiblyUpdating(this.mContext, connectionResult.getErrorCode())) {
            zaau();
        }
        if (this.zagy) {
            return;
        }
        this.zagw.onConnectionFailure(connectionResult);
        this.zagw.disableCallbacks();
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void zab(int i, boolean z) {
        if (i == 1 && !z && !this.zagy) {
            this.zagy = true;
            if (this.zahc == null && !com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                try {
                    this.zahc = this.zace.zaa(this.mContext.getApplicationContext(), new com.google.android.gms.common.api.internal.zabc(this));
                } catch (java.lang.SecurityException unused) {
                }
            }
            com.google.android.gms.common.api.internal.zaaz zaazVar = this.zahb;
            zaazVar.sendMessageDelayed(zaazVar.obtainMessage(1), this.zagz);
            com.google.android.gms.common.api.internal.zaaz zaazVar2 = this.zahb;
            zaazVar2.sendMessageDelayed(zaazVar2.obtainMessage(2), this.zaha);
        }
        this.zahj.zabv();
        this.zagw.onUnintentionalDisconnection(i);
        this.zagw.disableCallbacks();
        if (i == 2) {
            zaas();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.content.Context getContext() {
        return this.mContext;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.os.Looper getLooper() {
        return this.zabl;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(com.google.android.gms.common.api.internal.SignInConnectionListener signInConnectionListener) {
        com.google.android.gms.common.api.internal.zabr zabrVar = this.zagx;
        return zabrVar != null && zabrVar.maybeSignIn(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        com.google.android.gms.common.api.internal.zabr zabrVar = this.zagx;
        if (zabrVar != null) {
            zabrVar.maybeSignOut();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zaa(com.google.android.gms.common.api.internal.zack zackVar) {
        this.zaer.lock();
        try {
            if (this.zahi == null) {
                this.zahi = new java.util.HashSet();
            }
            this.zahi.add(zackVar);
        } finally {
            this.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zab(com.google.android.gms.common.api.internal.zack zackVar) {
        this.zaer.lock();
        try {
            java.util.Set<com.google.android.gms.common.api.internal.zack> set = this.zahi;
            if (set == null) {
                android.util.Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new java.lang.Exception());
            } else if (!set.remove(zackVar)) {
                android.util.Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new java.lang.Exception());
            } else if (!zaav()) {
                this.zagx.zau();
            }
        } finally {
            this.zaer.unlock();
        }
    }

    final boolean zaav() {
        java.util.concurrent.locks.Lock lock;
        this.zaer.lock();
        try {
            java.util.Set<com.google.android.gms.common.api.internal.zack> set = this.zahi;
            if (set == null) {
                return false;
            }
            return !set.isEmpty();
        } finally {
            this.zaer.unlock();
        }
    }

    final java.lang.String zaaw() {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        dump("", null, new java.io.PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.append((java.lang.CharSequence) str).append("mContext=").println(this.mContext);
        printWriter.append((java.lang.CharSequence) str).append("mResuming=").print(this.zagy);
        printWriter.append(" mWorkQueue.size()=").print(this.zafd.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zahj.zald.size());
        com.google.android.gms.common.api.internal.zabr zabrVar = this.zagx;
        if (zabrVar != null) {
            zabrVar.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public static int zaa(java.lang.Iterable<com.google.android.gms.common.api.Api.Client> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (com.google.android.gms.common.api.Api.Client client : iterable) {
            if (client.requiresSignIn()) {
                z2 = true;
            }
            if (client.providesSignIn()) {
                z3 = true;
            }
        }
        if (z2) {
            return (z3 && z) ? 2 : 1;
        }
        return 3;
    }
}
