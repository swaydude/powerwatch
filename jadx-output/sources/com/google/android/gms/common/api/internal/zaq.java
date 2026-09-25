package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaq implements com.google.android.gms.common.api.internal.zabr {
    private final android.content.Context mContext;
    private final android.os.Looper zabl;
    private final com.google.android.gms.common.api.internal.zaaw zaeh;
    private final com.google.android.gms.common.api.internal.zabe zaei;
    private final com.google.android.gms.common.api.internal.zabe zaej;
    private final java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.internal.zabe> zaek;
    private final com.google.android.gms.common.api.Api.Client zaem;
    private android.os.Bundle zaen;
    private final java.util.concurrent.locks.Lock zaer;
    private final java.util.Set<com.google.android.gms.common.api.internal.SignInConnectionListener> zael = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
    private com.google.android.gms.common.ConnectionResult zaeo = null;
    private com.google.android.gms.common.ConnectionResult zaep = null;
    private boolean zaeq = false;
    private int zaes = 0;

    public static com.google.android.gms.common.api.internal.zaq zaa(android.content.Context context, com.google.android.gms.common.api.internal.zaaw zaawVar, java.util.concurrent.locks.Lock lock, android.os.Looper looper, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> map, com.google.android.gms.common.internal.ClientSettings clientSettings, java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> map2, com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> abstractClientBuilder, java.util.ArrayList<com.google.android.gms.common.api.internal.zap> arrayList) {
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        androidx.collection.ArrayMap arrayMap2 = new androidx.collection.ArrayMap();
        com.google.android.gms.common.api.Api.Client client = null;
        for (java.util.Map.Entry<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> entry : map.entrySet()) {
            com.google.android.gms.common.api.Api.Client value = entry.getValue();
            if (value.providesSignIn()) {
                client = value;
            }
            if (value.requiresSignIn()) {
                arrayMap.put(entry.getKey(), value);
            } else {
                arrayMap2.put(entry.getKey(), value);
            }
        }
        com.google.android.gms.common.internal.Preconditions.checkState(!arrayMap.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        androidx.collection.ArrayMap arrayMap3 = new androidx.collection.ArrayMap();
        androidx.collection.ArrayMap arrayMap4 = new androidx.collection.ArrayMap();
        for (com.google.android.gms.common.api.Api<?> api : map2.keySet()) {
            com.google.android.gms.common.api.Api.AnyClientKey<?> clientKey = api.getClientKey();
            if (arrayMap.containsKey(clientKey)) {
                arrayMap3.put(api, map2.get(api));
            } else {
                if (!arrayMap2.containsKey(clientKey)) {
                    throw new java.lang.IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                arrayMap4.put(api, map2.get(api));
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList<com.google.android.gms.common.api.internal.zap> arrayList4 = arrayList;
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            com.google.android.gms.common.api.internal.zap zapVar = arrayList4.get(i);
            i++;
            com.google.android.gms.common.api.internal.zap zapVar2 = zapVar;
            if (arrayMap3.containsKey(zapVar2.mApi)) {
                arrayList2.add(zapVar2);
            } else {
                if (!arrayMap4.containsKey(zapVar2.mApi)) {
                    throw new java.lang.IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(zapVar2);
            }
        }
        return new com.google.android.gms.common.api.internal.zaq(context, zaawVar, lock, looper, googleApiAvailabilityLight, arrayMap, arrayMap2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, arrayMap3, arrayMap4);
    }

    private zaq(android.content.Context context, com.google.android.gms.common.api.internal.zaaw zaawVar, java.util.concurrent.locks.Lock lock, android.os.Looper looper, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> map, java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> map2, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> abstractClientBuilder, com.google.android.gms.common.api.Api.Client client, java.util.ArrayList<com.google.android.gms.common.api.internal.zap> arrayList, java.util.ArrayList<com.google.android.gms.common.api.internal.zap> arrayList2, java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> map3, java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> map4) {
        this.mContext = context;
        this.zaeh = zaawVar;
        this.zaer = lock;
        this.zabl = looper;
        this.zaem = client;
        this.zaei = new com.google.android.gms.common.api.internal.zabe(context, zaawVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new com.google.android.gms.common.api.internal.zas(this, null));
        this.zaej = new com.google.android.gms.common.api.internal.zabe(context, zaawVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new com.google.android.gms.common.api.internal.zau(this, null));
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        java.util.Iterator<com.google.android.gms.common.api.Api.AnyClientKey<?>> it = map2.keySet().iterator();
        while (it.hasNext()) {
            arrayMap.put(it.next(), this.zaei);
        }
        java.util.Iterator<com.google.android.gms.common.api.Api.AnyClientKey<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            arrayMap.put(it2.next(), this.zaej);
        }
        this.zaek = java.util.Collections.unmodifiableMap(arrayMap);
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        if (zaa((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, ? extends com.google.android.gms.common.api.Api.AnyClient>) t)) {
            if (zax()) {
                t.setFailedResult(new com.google.android.gms.common.api.Status(4, null, zay()));
                return t;
            }
            return (T) this.zaej.enqueue(t);
        }
        return (T) this.zaei.enqueue(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(T t) {
        if (zaa((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, ? extends com.google.android.gms.common.api.Api.AnyClient>) t)) {
            if (zax()) {
                t.setFailedResult(new com.google.android.gms.common.api.Status(4, null, zay()));
                return t;
            }
            return (T) this.zaej.execute(t);
        }
        return (T) this.zaei.execute(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.Api<?> api) {
        if (this.zaek.get(api.getClientKey()).equals(this.zaej)) {
            if (zax()) {
                return new com.google.android.gms.common.ConnectionResult(4, zay());
            }
            return this.zaej.getConnectionResult(api);
        }
        return this.zaei.getConnectionResult(api);
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void connect() {
        this.zaes = 2;
        this.zaeq = false;
        this.zaep = null;
        this.zaeo = null;
        this.zaei.connect();
        this.zaej.connect();
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final com.google.android.gms.common.ConnectionResult blockingConnect() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final com.google.android.gms.common.ConnectionResult blockingConnect(long j, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void disconnect() {
        this.zaep = null;
        this.zaeo = null;
        this.zaes = 0;
        this.zaei.disconnect();
        this.zaej.disconnect();
        zaw();
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final boolean isConnected() {
        this.zaer.lock();
        try {
            boolean z = true;
            if (!this.zaei.isConnected() || (!this.zaej.isConnected() && !zax() && this.zaes != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final boolean isConnecting() {
        this.zaer.lock();
        try {
            return this.zaes == 2;
        } finally {
            this.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final boolean maybeSignIn(com.google.android.gms.common.api.internal.SignInConnectionListener signInConnectionListener) {
        this.zaer.lock();
        try {
            if ((isConnecting() || isConnected()) && !this.zaej.isConnected()) {
                this.zael.add(signInConnectionListener);
                if (this.zaes == 0) {
                    this.zaes = 1;
                }
                this.zaep = null;
                this.zaej.connect();
                return true;
            }
            return false;
        } finally {
            this.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void zau() {
        this.zaei.zau();
        this.zaej.zau();
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void maybeSignOut() {
        this.zaer.lock();
        try {
            boolean zIsConnecting = isConnecting();
            this.zaej.disconnect();
            this.zaep = new com.google.android.gms.common.ConnectionResult(4);
            if (zIsConnecting) {
                new com.google.android.gms.internal.base.zar(this.zabl).post(new com.google.android.gms.common.api.internal.zat(this));
            } else {
                zaw();
            }
        } finally {
            this.zaer.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zav() {
        if (zab(this.zaeo)) {
            if (zab(this.zaep) || zax()) {
                int i = this.zaes;
                if (i == 1) {
                    zaw();
                } else if (i == 2) {
                    this.zaeh.zab(this.zaen);
                    zaw();
                } else {
                    android.util.Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new java.lang.AssertionError());
                }
                this.zaes = 0;
                return;
            }
            com.google.android.gms.common.ConnectionResult connectionResult = this.zaep;
            if (connectionResult != null) {
                if (this.zaes == 1) {
                    zaw();
                    return;
                } else {
                    zaa(connectionResult);
                    this.zaei.disconnect();
                    return;
                }
            }
            return;
        }
        if (this.zaeo != null && zab(this.zaep)) {
            this.zaej.disconnect();
            zaa(this.zaeo);
            return;
        }
        com.google.android.gms.common.ConnectionResult connectionResult2 = this.zaeo;
        if (connectionResult2 == null || this.zaep == null) {
            return;
        }
        if (this.zaej.zahw < this.zaei.zahw) {
            connectionResult2 = this.zaep;
        }
        zaa(connectionResult2);
    }

    private final void zaa(com.google.android.gms.common.ConnectionResult connectionResult) {
        int i = this.zaes;
        if (i == 1) {
            zaw();
        } else if (i == 2) {
            this.zaeh.zac(connectionResult);
            zaw();
        } else {
            android.util.Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new java.lang.Exception());
        }
        this.zaes = 0;
    }

    private final void zaw() {
        java.util.Iterator<com.google.android.gms.common.api.internal.SignInConnectionListener> it = this.zael.iterator();
        while (it.hasNext()) {
            it.next().onComplete();
        }
        this.zael.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaa(int i, boolean z) {
        this.zaeh.zab(i, z);
        this.zaep = null;
        this.zaeo = null;
    }

    private final boolean zax() {
        com.google.android.gms.common.ConnectionResult connectionResult = this.zaep;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    private final boolean zaa(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, ? extends com.google.android.gms.common.api.Api.AnyClient> apiMethodImpl) {
        java.lang.Object clientKey = apiMethodImpl.getClientKey();
        com.google.android.gms.common.internal.Preconditions.checkArgument(this.zaek.containsKey(clientKey), "GoogleApiClient is not configured to use the API required for this call.");
        return this.zaek.get(clientKey).equals(this.zaej);
    }

    private final android.app.PendingIntent zay() {
        if (this.zaem == null) {
            return null;
        }
        return android.app.PendingIntent.getActivity(this.mContext, java.lang.System.identityHashCode(this.zaeh), this.zaem.getSignInIntent(), 134217728);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaa(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = this.zaen;
        if (bundle2 == null) {
            this.zaen = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    private static boolean zab(com.google.android.gms.common.ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.append((java.lang.CharSequence) str).append("authClient").println(":");
        this.zaej.dump(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((java.lang.CharSequence) str).append("anonClient").println(":");
        this.zaei.dump(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}
