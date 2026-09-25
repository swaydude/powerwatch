package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zav implements com.google.android.gms.common.api.internal.zabr {
    private final android.os.Looper zabl;
    private final com.google.android.gms.common.api.internal.GoogleApiManager zabo;
    private final java.util.concurrent.locks.Lock zaer;
    private final java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> zaew;
    private final com.google.android.gms.common.api.internal.zaaw zaex;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zaey;
    private final java.util.concurrent.locks.Condition zaez;
    private final com.google.android.gms.common.internal.ClientSettings zafa;
    private final boolean zafb;
    private final boolean zafc;
    private boolean zafe;
    private java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> zaff;
    private java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> zafg;
    private com.google.android.gms.common.api.internal.zaaa zafh;
    private com.google.android.gms.common.ConnectionResult zafi;
    private final java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.internal.zaw<?>> zaeu = new java.util.HashMap();
    private final java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.internal.zaw<?>> zaev = new java.util.HashMap();
    private final java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<?, ?>> zafd = new java.util.LinkedList();

    public zav(android.content.Context context, java.util.concurrent.locks.Lock lock, android.os.Looper looper, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> map, com.google.android.gms.common.internal.ClientSettings clientSettings, java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> map2, com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> abstractClientBuilder, java.util.ArrayList<com.google.android.gms.common.api.internal.zap> arrayList, com.google.android.gms.common.api.internal.zaaw zaawVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.zaer = lock;
        this.zabl = looper;
        this.zaez = lock.newCondition();
        this.zaey = googleApiAvailabilityLight;
        this.zaex = zaawVar;
        this.zaew = map2;
        this.zafa = clientSettings;
        this.zafb = z;
        java.util.HashMap map3 = new java.util.HashMap();
        for (com.google.android.gms.common.api.Api<?> api : map2.keySet()) {
            map3.put(api.getClientKey(), api);
        }
        java.util.HashMap map4 = new java.util.HashMap();
        java.util.ArrayList<com.google.android.gms.common.api.internal.zap> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            com.google.android.gms.common.api.internal.zap zapVar = arrayList2.get(i);
            i++;
            com.google.android.gms.common.api.internal.zap zapVar2 = zapVar;
            map4.put(zapVar2.mApi, zapVar2);
        }
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = false;
        for (java.util.Map.Entry<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> entry : map.entrySet()) {
            com.google.android.gms.common.api.Api api2 = (com.google.android.gms.common.api.Api) map3.get(entry.getKey());
            com.google.android.gms.common.api.Api.Client value = entry.getValue();
            if (value.requiresGooglePlayServices()) {
                z4 = z6;
                if (this.zaew.get(api2).booleanValue()) {
                    z3 = z7;
                    z2 = true;
                } else {
                    z2 = true;
                    z3 = true;
                }
            } else {
                z2 = z5;
                z3 = z7;
                z4 = false;
            }
            com.google.android.gms.common.api.internal.zaw<?> zawVar = new com.google.android.gms.common.api.internal.zaw<>(context, api2, looper, value, (com.google.android.gms.common.api.internal.zap) map4.get(api2), clientSettings, abstractClientBuilder);
            this.zaeu.put(entry.getKey(), zawVar);
            if (value.requiresSignIn()) {
                this.zaev.put(entry.getKey(), zawVar);
            }
            z5 = z2;
            z6 = z4;
            z7 = z3;
        }
        this.zafc = (!z5 || z6 || z7) ? false : true;
        this.zabo = com.google.android.gms.common.api.internal.GoogleApiManager.zaba();
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void zau() {
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        if (this.zafb && zab(t)) {
            return t;
        }
        if (!isConnected()) {
            this.zafd.add(t);
            return t;
        }
        this.zaex.zahj.zac(t);
        return (T) this.zaeu.get(t.getClientKey()).doRead(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(T t) {
        com.google.android.gms.common.api.Api.AnyClientKey<A> clientKey = t.getClientKey();
        if (this.zafb && zab(t)) {
            return t;
        }
        this.zaex.zahj.zac(t);
        return (T) this.zaeu.get(clientKey).doWrite(t);
    }

    private final <T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, ? extends com.google.android.gms.common.api.Api.AnyClient>> boolean zab(T t) {
        com.google.android.gms.common.api.Api.AnyClientKey<?> clientKey = t.getClientKey();
        com.google.android.gms.common.ConnectionResult connectionResultZaa = zaa(clientKey);
        if (connectionResultZaa == null || connectionResultZaa.getErrorCode() != 4) {
            return false;
        }
        t.setFailedResult(new com.google.android.gms.common.api.Status(4, null, this.zabo.zaa(this.zaeu.get(clientKey).getApiKey(), java.lang.System.identityHashCode(this.zaex))));
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void connect() {
        this.zaer.lock();
        try {
            if (this.zafe) {
                return;
            }
            this.zafe = true;
            this.zaff = null;
            this.zafg = null;
            this.zafh = null;
            this.zafi = null;
            this.zabo.zam();
            this.zabo.zaa(this.zaeu.values()).addOnCompleteListener(new com.google.android.gms.common.util.concurrent.HandlerExecutor(this.zabl), new com.google.android.gms.common.api.internal.zax(this));
        } finally {
            this.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final com.google.android.gms.common.ConnectionResult blockingConnect() {
        connect();
        while (isConnecting()) {
            try {
                this.zaez.await();
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                return new com.google.android.gms.common.ConnectionResult(15, null);
            }
        }
        if (isConnected()) {
            return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
        }
        com.google.android.gms.common.ConnectionResult connectionResult = this.zafi;
        return connectionResult != null ? connectionResult : new com.google.android.gms.common.ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final com.google.android.gms.common.ConnectionResult blockingConnect(long j, java.util.concurrent.TimeUnit timeUnit) {
        connect();
        long nanos = timeUnit.toNanos(j);
        while (isConnecting()) {
            if (nanos <= 0) {
                disconnect();
                return new com.google.android.gms.common.ConnectionResult(14, null);
            }
            try {
                nanos = this.zaez.awaitNanos(nanos);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                return new com.google.android.gms.common.ConnectionResult(15, null);
            }
            java.lang.Thread.currentThread().interrupt();
            return new com.google.android.gms.common.ConnectionResult(15, null);
        }
        if (isConnected()) {
            return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
        }
        com.google.android.gms.common.ConnectionResult connectionResult = this.zafi;
        return connectionResult != null ? connectionResult : new com.google.android.gms.common.ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void disconnect() {
        this.zaer.lock();
        try {
            this.zafe = false;
            this.zaff = null;
            this.zafg = null;
            com.google.android.gms.common.api.internal.zaaa zaaaVar = this.zafh;
            if (zaaaVar != null) {
                zaaaVar.cancel();
                this.zafh = null;
            }
            this.zafi = null;
            while (!this.zafd.isEmpty()) {
                com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<?, ?> apiMethodImplRemove = this.zafd.remove();
                apiMethodImplRemove.zaa((com.google.android.gms.common.api.internal.zacq) null);
                apiMethodImplRemove.cancel();
            }
            this.zaez.signalAll();
        } finally {
            this.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.Api<?> api) {
        return zaa(api.getClientKey());
    }

    private final com.google.android.gms.common.ConnectionResult zaa(com.google.android.gms.common.api.Api.AnyClientKey<?> anyClientKey) {
        this.zaer.lock();
        try {
            com.google.android.gms.common.api.internal.zaw<?> zawVar = this.zaeu.get(anyClientKey);
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> map = this.zaff;
            if (map != null && zawVar != null) {
                return map.get(zawVar.getApiKey());
            }
            return null;
        } finally {
            this.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final boolean isConnected() {
        this.zaer.lock();
        try {
            return this.zaff != null && this.zafi == null;
        } finally {
            this.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final boolean isConnecting() {
        this.zaer.lock();
        try {
            return this.zaff == null && this.zafe;
        } finally {
            this.zaer.unlock();
        }
    }

    private final boolean zaz() {
        this.zaer.lock();
        try {
            if (this.zafe && this.zafb) {
                java.util.Iterator<com.google.android.gms.common.api.Api.AnyClientKey<?>> it = this.zaev.keySet().iterator();
                while (it.hasNext()) {
                    com.google.android.gms.common.ConnectionResult connectionResultZaa = zaa(it.next());
                    if (connectionResultZaa == null || !connectionResultZaa.isSuccess()) {
                        this.zaer.unlock();
                        return false;
                    }
                }
                this.zaer.unlock();
                return true;
            }
            this.zaer.unlock();
            return false;
        } catch (java.lang.Throwable th) {
            this.zaer.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final boolean maybeSignIn(com.google.android.gms.common.api.internal.SignInConnectionListener signInConnectionListener) {
        java.util.concurrent.locks.Lock lock;
        this.zaer.lock();
        try {
            if (this.zafe && !zaz()) {
                this.zabo.zam();
                this.zafh = new com.google.android.gms.common.api.internal.zaaa(this, signInConnectionListener);
                this.zabo.zaa(this.zaev.values()).addOnCompleteListener(new com.google.android.gms.common.util.concurrent.HandlerExecutor(this.zabl), this.zafh);
                return true;
            }
            return false;
        } finally {
            this.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void maybeSignOut() {
        this.zaer.lock();
        try {
            this.zabo.maybeSignOut();
            com.google.android.gms.common.api.internal.zaaa zaaaVar = this.zafh;
            if (zaaaVar != null) {
                zaaaVar.cancel();
                this.zafh = null;
            }
            if (this.zafg == null) {
                this.zafg = new androidx.collection.ArrayMap(this.zaev.size());
            }
            com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(4);
            java.util.Iterator<com.google.android.gms.common.api.internal.zaw<?>> it = this.zaev.values().iterator();
            while (it.hasNext()) {
                this.zafg.put(it.next().getApiKey(), connectionResult);
            }
            java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> map = this.zaff;
            if (map != null) {
                map.putAll(this.zafg);
            }
        } finally {
            this.zaer.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaaa() {
        if (this.zafa == null) {
            this.zaex.zahe = java.util.Collections.emptySet();
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet(this.zafa.getRequiredScopes());
        java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings> optionalApiSettings = this.zafa.getOptionalApiSettings();
        for (com.google.android.gms.common.api.Api<?> api : optionalApiSettings.keySet()) {
            com.google.android.gms.common.ConnectionResult connectionResult = getConnectionResult(api);
            if (connectionResult != null && connectionResult.isSuccess()) {
                hashSet.addAll(optionalApiSettings.get(api).mScopes);
            }
        }
        this.zaex.zahe = hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaab() {
        while (!this.zafd.isEmpty()) {
            execute(this.zafd.remove());
        }
        this.zaex.zab((android.os.Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaa(com.google.android.gms.common.api.internal.zaw<?> zawVar, com.google.android.gms.common.ConnectionResult connectionResult) {
        return !connectionResult.isSuccess() && !connectionResult.hasResolution() && this.zaew.get(zawVar.getApi()).booleanValue() && zawVar.zaad().requiresGooglePlayServices() && this.zaey.isUserResolvableError(connectionResult.getErrorCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.gms.common.ConnectionResult zaac() {
        int i = 0;
        com.google.android.gms.common.ConnectionResult connectionResult = null;
        com.google.android.gms.common.ConnectionResult connectionResult2 = null;
        int i2 = 0;
        for (com.google.android.gms.common.api.internal.zaw<?> zawVar : this.zaeu.values()) {
            com.google.android.gms.common.api.Api<?> api = zawVar.getApi();
            com.google.android.gms.common.ConnectionResult connectionResult3 = this.zaff.get(zawVar.getApiKey());
            if (!connectionResult3.isSuccess() && (!this.zaew.get(api).booleanValue() || connectionResult3.hasResolution() || this.zaey.isUserResolvableError(connectionResult3.getErrorCode()))) {
                if (connectionResult3.getErrorCode() == 4 && this.zafb) {
                    int priority = api.zah().getPriority();
                    if (connectionResult2 == null || i2 > priority) {
                        connectionResult2 = connectionResult3;
                        i2 = priority;
                    }
                } else {
                    int priority2 = api.zah().getPriority();
                    if (connectionResult == null || i > priority2) {
                        connectionResult = connectionResult3;
                        i = priority2;
                    }
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i <= i2) ? connectionResult : connectionResult2;
    }

    static /* synthetic */ boolean zaa(com.google.android.gms.common.api.internal.zav zavVar, boolean z) {
        zavVar.zafe = false;
        return false;
    }
}
