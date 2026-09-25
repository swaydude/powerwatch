package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zabe implements com.google.android.gms.common.api.internal.zabr, com.google.android.gms.common.api.internal.zar {
    private final android.content.Context mContext;
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> zacf;
    final com.google.android.gms.common.api.internal.zaaw zaeh;
    private final java.util.concurrent.locks.Lock zaer;
    private final java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> zaew;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zaey;
    private final com.google.android.gms.common.internal.ClientSettings zafa;
    final java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> zahd;
    private final java.util.concurrent.locks.Condition zahr;
    private final com.google.android.gms.common.api.internal.zabg zahs;
    private volatile com.google.android.gms.common.api.internal.zabb zahu;
    int zahw;
    final com.google.android.gms.common.api.internal.zabs zahx;
    final java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.ConnectionResult> zaht = new java.util.HashMap();
    private com.google.android.gms.common.ConnectionResult zahv = null;

    public zabe(android.content.Context context, com.google.android.gms.common.api.internal.zaaw zaawVar, java.util.concurrent.locks.Lock lock, android.os.Looper looper, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, java.util.Map<com.google.android.gms.common.api.Api.AnyClientKey<?>, com.google.android.gms.common.api.Api.Client> map, com.google.android.gms.common.internal.ClientSettings clientSettings, java.util.Map<com.google.android.gms.common.api.Api<?>, java.lang.Boolean> map2, com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> abstractClientBuilder, java.util.ArrayList<com.google.android.gms.common.api.internal.zap> arrayList, com.google.android.gms.common.api.internal.zabs zabsVar) {
        this.mContext = context;
        this.zaer = lock;
        this.zaey = googleApiAvailabilityLight;
        this.zahd = map;
        this.zafa = clientSettings;
        this.zaew = map2;
        this.zacf = abstractClientBuilder;
        this.zaeh = zaawVar;
        this.zahx = zabsVar;
        java.util.ArrayList<com.google.android.gms.common.api.internal.zap> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            com.google.android.gms.common.api.internal.zap zapVar = arrayList2.get(i);
            i++;
            zapVar.zaa(this);
        }
        this.zahs = new com.google.android.gms.common.api.internal.zabg(this, looper);
        this.zahr = lock.newCondition();
        this.zahu = new com.google.android.gms.common.api.internal.zaat(this);
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final boolean maybeSignIn(com.google.android.gms.common.api.internal.SignInConnectionListener signInConnectionListener) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void maybeSignOut() {
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        t.zar();
        return (T) this.zahu.enqueue(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(T t) {
        t.zar();
        return (T) this.zahu.execute(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void connect() {
        this.zahu.connect();
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final com.google.android.gms.common.ConnectionResult blockingConnect() {
        connect();
        while (isConnecting()) {
            try {
                this.zahr.await();
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                return new com.google.android.gms.common.ConnectionResult(15, null);
            }
        }
        if (isConnected()) {
            return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
        }
        com.google.android.gms.common.ConnectionResult connectionResult = this.zahv;
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
                nanos = this.zahr.awaitNanos(nanos);
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
        com.google.android.gms.common.ConnectionResult connectionResult = this.zahv;
        return connectionResult != null ? connectionResult : new com.google.android.gms.common.ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void disconnect() {
        if (this.zahu.disconnect()) {
            this.zaht.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.Api<?> api) {
        com.google.android.gms.common.api.Api.AnyClientKey<?> clientKey = api.getClientKey();
        if (!this.zahd.containsKey(clientKey)) {
            return null;
        }
        if (this.zahd.get(clientKey).isConnected()) {
            return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
        }
        if (this.zaht.containsKey(clientKey)) {
            return this.zaht.get(clientKey);
        }
        return null;
    }

    final void zaax() {
        this.zaer.lock();
        try {
            this.zahu = new com.google.android.gms.common.api.internal.zaak(this, this.zafa, this.zaew, this.zaey, this.zacf, this.zaer, this.mContext);
            this.zahu.begin();
            this.zahr.signalAll();
        } finally {
            this.zaer.unlock();
        }
    }

    final void zaay() {
        this.zaer.lock();
        try {
            this.zaeh.zaau();
            this.zahu = new com.google.android.gms.common.api.internal.zaaf(this);
            this.zahu.begin();
            this.zahr.signalAll();
        } finally {
            this.zaer.unlock();
        }
    }

    final void zaf(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zaer.lock();
        try {
            this.zahv = connectionResult;
            this.zahu = new com.google.android.gms.common.api.internal.zaat(this);
            this.zahu.begin();
            this.zahr.signalAll();
        } finally {
            this.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final boolean isConnected() {
        return this.zahu instanceof com.google.android.gms.common.api.internal.zaaf;
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final boolean isConnecting() {
        return this.zahu instanceof com.google.android.gms.common.api.internal.zaak;
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void zau() {
        if (isConnected()) {
            ((com.google.android.gms.common.api.internal.zaaf) this.zahu).zaak();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zar
    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api<?> api, boolean z) {
        this.zaer.lock();
        try {
            this.zahu.zaa(connectionResult, api, z);
        } finally {
            this.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        this.zaer.lock();
        try {
            this.zahu.onConnected(bundle);
        } finally {
            this.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zaer.lock();
        try {
            this.zahu.onConnectionSuspended(i);
        } finally {
            this.zaer.unlock();
        }
    }

    final void zaa(com.google.android.gms.common.api.internal.zabd zabdVar) {
        this.zahs.sendMessage(this.zahs.obtainMessage(1, zabdVar));
    }

    final void zab(java.lang.RuntimeException runtimeException) {
        this.zahs.sendMessage(this.zahs.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.lang.String strConcat = java.lang.String.valueOf(str).concat("  ");
        printWriter.append((java.lang.CharSequence) str).append("mState=").println(this.zahu);
        for (com.google.android.gms.common.api.Api<?> api : this.zaew.keySet()) {
            printWriter.append((java.lang.CharSequence) str).append((java.lang.CharSequence) api.getName()).println(":");
            this.zahd.get(api.getClientKey()).dump(strConcat, fileDescriptor, printWriter, strArr);
        }
    }
}
