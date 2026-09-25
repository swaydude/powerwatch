package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleApiManager implements android.os.Handler.Callback {
    private static com.google.android.gms.common.api.internal.GoogleApiManager zaig;
    private final android.os.Handler handler;
    private final android.content.Context zaih;
    private final com.google.android.gms.common.GoogleApiAvailability zaii;
    private final com.google.android.gms.common.internal.GoogleApiAvailabilityCache zaij;
    public static final com.google.android.gms.common.api.Status zaib = new com.google.android.gms.common.api.Status(4, "Sign-out occurred while this API call was in progress.");
    private static final com.google.android.gms.common.api.Status zaic = new com.google.android.gms.common.api.Status(4, "The user must be signed in to make this API call.");
    private static final java.lang.Object lock = new java.lang.Object();
    private long zaid = 5000;
    private long zaie = 120000;
    private long zaif = 10000;
    private final java.util.concurrent.atomic.AtomicInteger zaik = new java.util.concurrent.atomic.AtomicInteger(1);
    private final java.util.concurrent.atomic.AtomicInteger zail = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?>> zaim = new java.util.concurrent.ConcurrentHashMap(5, 0.75f, 1);
    private com.google.android.gms.common.api.internal.zaad zain = null;
    private final java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>> zaio = new androidx.collection.ArraySet();
    private final java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>> zaip = new androidx.collection.ArraySet();

    public static com.google.android.gms.common.api.internal.GoogleApiManager zab(android.content.Context context) {
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager;
        synchronized (lock) {
            if (zaig == null) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                zaig = new com.google.android.gms.common.api.internal.GoogleApiManager(context.getApplicationContext(), handlerThread.getLooper(), com.google.android.gms.common.GoogleApiAvailability.getInstance());
            }
            googleApiManager = zaig;
        }
        return googleApiManager;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private static class zac {
        private final com.google.android.gms.common.api.internal.ApiKey<?> zajh;
        private final com.google.android.gms.common.Feature zaji;

        private zac(com.google.android.gms.common.api.internal.ApiKey<?> apiKey, com.google.android.gms.common.Feature feature) {
            this.zajh = apiKey;
            this.zaji = feature;
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj != null && (obj instanceof com.google.android.gms.common.api.internal.GoogleApiManager.zac)) {
                com.google.android.gms.common.api.internal.GoogleApiManager.zac zacVar = (com.google.android.gms.common.api.internal.GoogleApiManager.zac) obj;
                if (com.google.android.gms.common.internal.Objects.equal(this.zajh, zacVar.zajh) && com.google.android.gms.common.internal.Objects.equal(this.zaji, zacVar.zaji)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return com.google.android.gms.common.internal.Objects.hashCode(this.zajh, this.zaji);
        }

        public final java.lang.String toString() {
            return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("key", this.zajh).add("feature", this.zaji).toString();
        }

        /* synthetic */ zac(com.google.android.gms.common.api.internal.ApiKey apiKey, com.google.android.gms.common.Feature feature, com.google.android.gms.common.api.internal.zabh zabhVar) {
            this(apiKey, feature);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    class zab implements com.google.android.gms.common.api.internal.zacf, com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks {
        private final com.google.android.gms.common.api.internal.ApiKey<?> zaft;
        private final com.google.android.gms.common.api.Api.Client zais;
        private com.google.android.gms.common.internal.IAccountAccessor zaje = null;
        private java.util.Set<com.google.android.gms.common.api.Scope> zajf = null;
        private boolean zajg = false;

        public zab(com.google.android.gms.common.api.Api.Client client, com.google.android.gms.common.api.internal.ApiKey<?> apiKey) {
            this.zais = client;
            this.zaft = apiKey;
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult) {
            com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.post(new com.google.android.gms.common.api.internal.zabo(this, connectionResult));
        }

        @Override // com.google.android.gms.common.api.internal.zacf
        public final void zag(com.google.android.gms.common.ConnectionResult connectionResult) {
            ((com.google.android.gms.common.api.internal.GoogleApiManager.zaa) com.google.android.gms.common.api.internal.GoogleApiManager.this.zaim.get(this.zaft)).zag(connectionResult);
        }

        @Override // com.google.android.gms.common.api.internal.zacf
        public final void zaa(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, java.util.Set<com.google.android.gms.common.api.Scope> set) {
            if (iAccountAccessor == null || set == null) {
                android.util.Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new java.lang.Exception());
                zag(new com.google.android.gms.common.ConnectionResult(4));
            } else {
                this.zaje = iAccountAccessor;
                this.zajf = set;
                zabp();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zabp() {
            com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor;
            if (!this.zajg || (iAccountAccessor = this.zaje) == null) {
                return;
            }
            this.zais.getRemoteService(iAccountAccessor, this.zajf);
        }

        static /* synthetic */ boolean zaa(com.google.android.gms.common.api.internal.GoogleApiManager.zab zabVar, boolean z) {
            zabVar.zajg = true;
            return true;
        }
    }

    public static com.google.android.gms.common.api.internal.GoogleApiManager zaba() {
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager;
        synchronized (lock) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zaig, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zaig;
        }
        return googleApiManager;
    }

    public static void reportSignOut() {
        synchronized (lock) {
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = zaig;
            if (googleApiManager != null) {
                googleApiManager.zail.incrementAndGet();
                android.os.Handler handler = googleApiManager.handler;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public class zaa<O extends com.google.android.gms.common.api.Api.ApiOptions> implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.common.api.internal.zar {
        private final com.google.android.gms.common.api.internal.ApiKey<O> zaft;
        private final com.google.android.gms.common.api.Api.Client zais;
        private final com.google.android.gms.common.api.Api.AnyClient zait;
        private final com.google.android.gms.common.api.internal.zaz zaiu;
        private final int zaix;
        private final com.google.android.gms.common.api.internal.zace zaiy;
        private boolean zaiz;
        private final java.util.Queue<com.google.android.gms.common.api.internal.zac> zair = new java.util.LinkedList();
        private final java.util.Set<com.google.android.gms.common.api.internal.zaj> zaiv = new java.util.HashSet();
        private final java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?>, com.google.android.gms.common.api.internal.zabv> zaiw = new java.util.HashMap();
        private final java.util.List<com.google.android.gms.common.api.internal.GoogleApiManager.zac> zaja = new java.util.ArrayList();
        private com.google.android.gms.common.ConnectionResult zajb = null;

        public zaa(com.google.android.gms.common.api.GoogleApi<O> googleApi) {
            com.google.android.gms.common.api.Api.Client clientZaa = googleApi.zaa(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.getLooper(), this);
            this.zais = clientZaa;
            if (clientZaa instanceof com.google.android.gms.common.internal.SimpleClientAdapter) {
                this.zait = ((com.google.android.gms.common.internal.SimpleClientAdapter) clientZaa).getClient();
            } else {
                this.zait = clientZaa;
            }
            this.zaft = googleApi.getApiKey();
            this.zaiu = new com.google.android.gms.common.api.internal.zaz();
            this.zaix = googleApi.getInstanceId();
            if (clientZaa.requiresSignIn()) {
                this.zaiy = googleApi.zaa(com.google.android.gms.common.api.internal.GoogleApiManager.this.zaih, com.google.android.gms.common.api.internal.GoogleApiManager.this.handler);
            } else {
                this.zaiy = null;
            }
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public final void onConnected(android.os.Bundle bundle) {
            if (android.os.Looper.myLooper() == com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.getLooper()) {
                zabe();
            } else {
                com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.post(new com.google.android.gms.common.api.internal.zabi(this));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zabe() {
            zabj();
            zai(com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS);
            zabl();
            java.util.Iterator<com.google.android.gms.common.api.internal.zabv> it = this.zaiw.values().iterator();
            while (it.hasNext()) {
                com.google.android.gms.common.api.internal.zabv next = it.next();
                if (zaa(next.zakc.getRequiredFeatures()) != null) {
                    it.remove();
                } else {
                    try {
                        next.zakc.registerListener(this.zait, new com.google.android.gms.tasks.TaskCompletionSource<>());
                    } catch (android.os.DeadObjectException unused) {
                        onConnectionSuspended(1);
                        this.zais.disconnect();
                    } catch (android.os.RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            zabg();
            zabm();
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public final void onConnectionSuspended(int i) {
            if (android.os.Looper.myLooper() == com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.getLooper()) {
                zabf();
            } else {
                com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.post(new com.google.android.gms.common.api.internal.zabk(this));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zabf() {
            zabj();
            this.zaiz = true;
            this.zaiu.zaag();
            com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.sendMessageDelayed(android.os.Message.obtain(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler, 9, this.zaft), com.google.android.gms.common.api.internal.GoogleApiManager.this.zaid);
            com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.sendMessageDelayed(android.os.Message.obtain(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler, 11, this.zaft), com.google.android.gms.common.api.internal.GoogleApiManager.this.zaie);
            com.google.android.gms.common.api.internal.GoogleApiManager.this.zaij.flush();
        }

        public final void zag(com.google.android.gms.common.ConnectionResult connectionResult) {
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler);
            this.zais.disconnect();
            onConnectionFailed(connectionResult);
        }

        private final boolean zah(com.google.android.gms.common.ConnectionResult connectionResult) {
            synchronized (com.google.android.gms.common.api.internal.GoogleApiManager.lock) {
                if (com.google.android.gms.common.api.internal.GoogleApiManager.this.zain == null || !com.google.android.gms.common.api.internal.GoogleApiManager.this.zaio.contains(this.zaft)) {
                    return false;
                }
                com.google.android.gms.common.api.internal.GoogleApiManager.this.zain.zab(connectionResult, this.zaix);
                return true;
            }
        }

        @Override // com.google.android.gms.common.api.internal.zar
        public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api<?> api, boolean z) {
            if (android.os.Looper.myLooper() == com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.getLooper()) {
                onConnectionFailed(connectionResult);
            } else {
                com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.post(new com.google.android.gms.common.api.internal.zabj(this, connectionResult));
            }
        }

        @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
        public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler);
            com.google.android.gms.common.api.internal.zace zaceVar = this.zaiy;
            if (zaceVar != null) {
                zaceVar.zabq();
            }
            zabj();
            com.google.android.gms.common.api.internal.GoogleApiManager.this.zaij.flush();
            zai(connectionResult);
            if (connectionResult.getErrorCode() != 4) {
                if (this.zair.isEmpty()) {
                    this.zajb = connectionResult;
                    return;
                }
                if (zah(connectionResult) || com.google.android.gms.common.api.internal.GoogleApiManager.this.zac(connectionResult, this.zaix)) {
                    return;
                }
                if (connectionResult.getErrorCode() == 18) {
                    this.zaiz = true;
                }
                if (this.zaiz) {
                    com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.sendMessageDelayed(android.os.Message.obtain(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler, 9, this.zaft), com.google.android.gms.common.api.internal.GoogleApiManager.this.zaid);
                    return;
                }
                java.lang.String apiName = this.zaft.getApiName();
                java.lang.String strValueOf = java.lang.String.valueOf(connectionResult);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(apiName).length() + 63 + java.lang.String.valueOf(strValueOf).length());
                sb.append("API: ");
                sb.append(apiName);
                sb.append(" is not available on this device. Connection failed with: ");
                sb.append(strValueOf);
                zac(new com.google.android.gms.common.api.Status(17, sb.toString()));
                return;
            }
            zac(com.google.android.gms.common.api.internal.GoogleApiManager.zaic);
        }

        private final void zabg() {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.zair);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj = arrayList.get(i);
                i++;
                com.google.android.gms.common.api.internal.zac zacVar = (com.google.android.gms.common.api.internal.zac) obj;
                if (!this.zais.isConnected()) {
                    return;
                }
                if (zab(zacVar)) {
                    this.zair.remove(zacVar);
                }
            }
        }

        public final void zaa(com.google.android.gms.common.api.internal.zac zacVar) {
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler);
            if (this.zais.isConnected()) {
                if (zab(zacVar)) {
                    zabm();
                    return;
                } else {
                    this.zair.add(zacVar);
                    return;
                }
            }
            this.zair.add(zacVar);
            com.google.android.gms.common.ConnectionResult connectionResult = this.zajb;
            if (connectionResult != null && connectionResult.hasResolution()) {
                onConnectionFailed(this.zajb);
            } else {
                connect();
            }
        }

        public final void zabh() {
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler);
            zac(com.google.android.gms.common.api.internal.GoogleApiManager.zaib);
            this.zaiu.zaaf();
            for (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey : (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey[]) this.zaiw.keySet().toArray(new com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey[this.zaiw.size()])) {
                zaa(new com.google.android.gms.common.api.internal.zah(listenerKey, new com.google.android.gms.tasks.TaskCompletionSource()));
            }
            zai(new com.google.android.gms.common.ConnectionResult(4));
            if (this.zais.isConnected()) {
                this.zais.onUserSignOut(new com.google.android.gms.common.api.internal.zabm(this));
            }
        }

        public final com.google.android.gms.common.api.Api.Client zaad() {
            return this.zais;
        }

        public final java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?>, com.google.android.gms.common.api.internal.zabv> zabi() {
            return this.zaiw;
        }

        public final void zabj() {
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler);
            this.zajb = null;
        }

        public final com.google.android.gms.common.ConnectionResult zabk() {
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler);
            return this.zajb;
        }

        private final boolean zab(com.google.android.gms.common.api.internal.zac zacVar) {
            if (!(zacVar instanceof com.google.android.gms.common.api.internal.zab)) {
                zac(zacVar);
                return true;
            }
            com.google.android.gms.common.api.internal.zab zabVar = (com.google.android.gms.common.api.internal.zab) zacVar;
            com.google.android.gms.common.Feature featureZaa = zaa(zabVar.zaa((com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?>) this));
            if (featureZaa == null) {
                zac(zacVar);
                return true;
            }
            if (zabVar.zab((com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?>) this)) {
                com.google.android.gms.common.api.internal.GoogleApiManager.zac zacVar2 = new com.google.android.gms.common.api.internal.GoogleApiManager.zac(this.zaft, featureZaa, null);
                int iIndexOf = this.zaja.indexOf(zacVar2);
                if (iIndexOf >= 0) {
                    com.google.android.gms.common.api.internal.GoogleApiManager.zac zacVar3 = this.zaja.get(iIndexOf);
                    com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.removeMessages(15, zacVar3);
                    com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.sendMessageDelayed(android.os.Message.obtain(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler, 15, zacVar3), com.google.android.gms.common.api.internal.GoogleApiManager.this.zaid);
                    return false;
                }
                this.zaja.add(zacVar2);
                com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.sendMessageDelayed(android.os.Message.obtain(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler, 15, zacVar2), com.google.android.gms.common.api.internal.GoogleApiManager.this.zaid);
                com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.sendMessageDelayed(android.os.Message.obtain(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler, 16, zacVar2), com.google.android.gms.common.api.internal.GoogleApiManager.this.zaie);
                com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(2, null);
                if (zah(connectionResult)) {
                    return false;
                }
                com.google.android.gms.common.api.internal.GoogleApiManager.this.zac(connectionResult, this.zaix);
                return false;
            }
            zabVar.zaa(new com.google.android.gms.common.api.UnsupportedApiCallException(featureZaa));
            return false;
        }

        private final void zac(com.google.android.gms.common.api.internal.zac zacVar) {
            zacVar.zaa(this.zaiu, requiresSignIn());
            try {
                zacVar.zac(this);
            } catch (android.os.DeadObjectException unused) {
                onConnectionSuspended(1);
                this.zais.disconnect();
            }
        }

        public final void zac(com.google.android.gms.common.api.Status status) {
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler);
            java.util.Iterator<com.google.android.gms.common.api.internal.zac> it = this.zair.iterator();
            while (it.hasNext()) {
                it.next().zaa(status);
            }
            this.zair.clear();
        }

        public final void resume() {
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler);
            if (this.zaiz) {
                connect();
            }
        }

        private final void zabl() {
            if (this.zaiz) {
                com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.removeMessages(11, this.zaft);
                com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.removeMessages(9, this.zaft);
                this.zaiz = false;
            }
        }

        public final void zaat() {
            com.google.android.gms.common.api.Status status;
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler);
            if (this.zaiz) {
                zabl();
                if (com.google.android.gms.common.api.internal.GoogleApiManager.this.zaii.isGooglePlayServicesAvailable(com.google.android.gms.common.api.internal.GoogleApiManager.this.zaih) == 18) {
                    status = new com.google.android.gms.common.api.Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                } else {
                    status = new com.google.android.gms.common.api.Status(8, "API failed to connect while resuming due to an unknown error.");
                }
                zac(status);
                this.zais.disconnect();
            }
        }

        private final void zabm() {
            com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.removeMessages(12, this.zaft);
            com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.sendMessageDelayed(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.obtainMessage(12, this.zaft), com.google.android.gms.common.api.internal.GoogleApiManager.this.zaif);
        }

        public final boolean zabn() {
            return zac(true);
        }

        private final boolean zac(boolean z) {
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler);
            if (!this.zais.isConnected() || this.zaiw.size() != 0) {
                return false;
            }
            if (!this.zaiu.zaae()) {
                this.zais.disconnect();
                return true;
            }
            if (z) {
                zabm();
            }
            return false;
        }

        public final void connect() {
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler);
            if (this.zais.isConnected() || this.zais.isConnecting()) {
                return;
            }
            int clientAvailability = com.google.android.gms.common.api.internal.GoogleApiManager.this.zaij.getClientAvailability(com.google.android.gms.common.api.internal.GoogleApiManager.this.zaih, this.zais);
            if (clientAvailability != 0) {
                onConnectionFailed(new com.google.android.gms.common.ConnectionResult(clientAvailability, null));
                return;
            }
            com.google.android.gms.common.api.internal.GoogleApiManager.zab zabVar = com.google.android.gms.common.api.internal.GoogleApiManager.this.new zab(this.zais, this.zaft);
            if (this.zais.requiresSignIn()) {
                this.zaiy.zaa(zabVar);
            }
            this.zais.connect(zabVar);
        }

        public final void zaa(com.google.android.gms.common.api.internal.zaj zajVar) {
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(com.google.android.gms.common.api.internal.GoogleApiManager.this.handler);
            this.zaiv.add(zajVar);
        }

        private final void zai(com.google.android.gms.common.ConnectionResult connectionResult) {
            for (com.google.android.gms.common.api.internal.zaj zajVar : this.zaiv) {
                java.lang.String endpointPackageName = null;
                if (com.google.android.gms.common.internal.Objects.equal(connectionResult, com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS)) {
                    endpointPackageName = this.zais.getEndpointPackageName();
                }
                zajVar.zaa(this.zaft, connectionResult, endpointPackageName);
            }
            this.zaiv.clear();
        }

        final boolean isConnected() {
            return this.zais.isConnected();
        }

        public final boolean requiresSignIn() {
            return this.zais.requiresSignIn();
        }

        public final int getInstanceId() {
            return this.zaix;
        }

        final com.google.android.gms.signin.zac zabo() {
            com.google.android.gms.common.api.internal.zace zaceVar = this.zaiy;
            if (zaceVar == null) {
                return null;
            }
            return zaceVar.zabo();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final com.google.android.gms.common.Feature zaa(com.google.android.gms.common.Feature[] featureArr) {
            if (featureArr != null && featureArr.length != 0) {
                com.google.android.gms.common.Feature[] availableFeatures = this.zais.getAvailableFeatures();
                if (availableFeatures == null) {
                    availableFeatures = new com.google.android.gms.common.Feature[0];
                }
                androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap(availableFeatures.length);
                for (com.google.android.gms.common.Feature feature : availableFeatures) {
                    arrayMap.put(feature.getName(), java.lang.Long.valueOf(feature.getVersion()));
                }
                for (com.google.android.gms.common.Feature feature2 : featureArr) {
                    if (!arrayMap.containsKey(feature2.getName()) || ((java.lang.Long) arrayMap.get(feature2.getName())).longValue() < feature2.getVersion()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zaa(com.google.android.gms.common.api.internal.GoogleApiManager.zac zacVar) {
            if (this.zaja.contains(zacVar) && !this.zaiz) {
                if (!this.zais.isConnected()) {
                    connect();
                } else {
                    zabg();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zab(com.google.android.gms.common.api.internal.GoogleApiManager.zac zacVar) {
            com.google.android.gms.common.Feature[] featureArrZaa;
            if (this.zaja.remove(zacVar)) {
                com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.removeMessages(15, zacVar);
                com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.removeMessages(16, zacVar);
                com.google.android.gms.common.Feature feature = zacVar.zaji;
                java.util.ArrayList arrayList = new java.util.ArrayList(this.zair.size());
                for (com.google.android.gms.common.api.internal.zac zacVar2 : this.zair) {
                    if ((zacVar2 instanceof com.google.android.gms.common.api.internal.zab) && (featureArrZaa = ((com.google.android.gms.common.api.internal.zab) zacVar2).zaa((com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?>) this)) != null && com.google.android.gms.common.util.ArrayUtils.contains(featureArrZaa, feature)) {
                        arrayList.add(zacVar2);
                    }
                }
                java.util.ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    java.lang.Object obj = arrayList2.get(i);
                    i++;
                    com.google.android.gms.common.api.internal.zac zacVar3 = (com.google.android.gms.common.api.internal.zac) obj;
                    this.zair.remove(zacVar3);
                    zacVar3.zaa(new com.google.android.gms.common.api.UnsupportedApiCallException(feature));
                }
            }
        }

        static /* synthetic */ boolean zaa(com.google.android.gms.common.api.internal.GoogleApiManager.zaa zaaVar, boolean z) {
            return zaaVar.zac(false);
        }
    }

    private GoogleApiManager(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability) {
        this.zaih = context;
        com.google.android.gms.internal.base.zar zarVar = new com.google.android.gms.internal.base.zar(looper, this);
        this.handler = zarVar;
        this.zaii = googleApiAvailability;
        this.zaij = new com.google.android.gms.common.internal.GoogleApiAvailabilityCache(googleApiAvailability);
        zarVar.sendMessage(zarVar.obtainMessage(6));
    }

    public final int zabb() {
        return this.zaik.getAndIncrement();
    }

    public final void zaa(com.google.android.gms.common.api.GoogleApi<?> googleApi) {
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    private final void zab(com.google.android.gms.common.api.GoogleApi<?> googleApi) {
        java.lang.Object apiKey = googleApi.getApiKey();
        com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar = this.zaim.get(apiKey);
        if (zaaVar == null) {
            zaaVar = new com.google.android.gms.common.api.internal.GoogleApiManager.zaa<>(googleApi);
            this.zaim.put((com.google.android.gms.common.api.internal.ApiKey<?>) apiKey, zaaVar);
        }
        if (zaaVar.requiresSignIn()) {
            this.zaip.add((com.google.android.gms.common.api.internal.ApiKey<?>) apiKey);
        }
        zaaVar.connect();
    }

    public final void zaa(com.google.android.gms.common.api.internal.zaad zaadVar) {
        synchronized (lock) {
            if (this.zain != zaadVar) {
                this.zain = zaadVar;
                this.zaio.clear();
            }
            this.zaio.addAll(zaadVar.zaah());
        }
    }

    final void zab(com.google.android.gms.common.api.internal.zaad zaadVar) {
        synchronized (lock) {
            if (this.zain == zaadVar) {
                this.zain = null;
                this.zaio.clear();
            }
        }
    }

    public final com.google.android.gms.tasks.Task<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> zaa(java.lang.Iterable<? extends com.google.android.gms.common.api.HasApiKey<?>> iterable) {
        com.google.android.gms.common.api.internal.zaj zajVar = new com.google.android.gms.common.api.internal.zaj(iterable);
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(2, zajVar));
        return zajVar.getTask();
    }

    public final void zam() {
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(3));
    }

    final void maybeSignOut() {
        this.zail.incrementAndGet();
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(10));
    }

    public final com.google.android.gms.tasks.Task<java.lang.Boolean> zac(com.google.android.gms.common.api.GoogleApi<?> googleApi) {
        com.google.android.gms.common.api.internal.zaae zaaeVar = new com.google.android.gms.common.api.internal.zaae(googleApi.getApiKey());
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(14, zaaeVar));
        return zaaeVar.zaaj().getTask();
    }

    public final <O extends com.google.android.gms.common.api.Api.ApiOptions> void zaa(com.google.android.gms.common.api.GoogleApi<O> googleApi, int i, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Api.AnyClient> apiMethodImpl) {
        com.google.android.gms.common.api.internal.zad zadVar = new com.google.android.gms.common.api.internal.zad(i, apiMethodImpl);
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(4, new com.google.android.gms.common.api.internal.zabu(zadVar, this.zail.get(), googleApi)));
    }

    public final <O extends com.google.android.gms.common.api.Api.ApiOptions, ResultT> void zaa(com.google.android.gms.common.api.GoogleApi<O> googleApi, int i, com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.common.api.Api.AnyClient, ResultT> taskApiCall, com.google.android.gms.tasks.TaskCompletionSource<ResultT> taskCompletionSource, com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper) {
        com.google.android.gms.common.api.internal.zaf zafVar = new com.google.android.gms.common.api.internal.zaf(i, taskApiCall, taskCompletionSource, statusExceptionMapper);
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(4, new com.google.android.gms.common.api.internal.zabu(zafVar, this.zail.get(), googleApi)));
    }

    public final <O extends com.google.android.gms.common.api.Api.ApiOptions> com.google.android.gms.tasks.Task<java.lang.Void> zaa(com.google.android.gms.common.api.GoogleApi<O> googleApi, com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.common.api.Api.AnyClient, ?> registerListenerMethod, com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.common.api.Api.AnyClient, ?> unregisterListenerMethod) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        com.google.android.gms.common.api.internal.zag zagVar = new com.google.android.gms.common.api.internal.zag(new com.google.android.gms.common.api.internal.zabv(registerListenerMethod, unregisterListenerMethod), taskCompletionSource);
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(8, new com.google.android.gms.common.api.internal.zabu(zagVar, this.zail.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final <O extends com.google.android.gms.common.api.Api.ApiOptions> com.google.android.gms.tasks.Task<java.lang.Boolean> zaa(com.google.android.gms.common.api.GoogleApi<O> googleApi, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> listenerKey) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        com.google.android.gms.common.api.internal.zah zahVar = new com.google.android.gms.common.api.internal.zah(listenerKey, taskCompletionSource);
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(13, new com.google.android.gms.common.api.internal.zabu(zahVar, this.zail.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0171  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b7  */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar = null;
        switch (message.what) {
            case 1:
                this.zaif = ((java.lang.Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.handler.removeMessages(12);
                for (com.google.android.gms.common.api.internal.ApiKey<?> apiKey : this.zaim.keySet()) {
                    android.os.Handler handler = this.handler;
                    handler.sendMessageDelayed(handler.obtainMessage(12, apiKey), this.zaif);
                }
                return true;
            case 2:
                com.google.android.gms.common.api.internal.zaj zajVar = (com.google.android.gms.common.api.internal.zaj) message.obj;
                for (com.google.android.gms.common.api.internal.ApiKey<?> apiKey2 : zajVar.zan()) {
                    com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar2 = this.zaim.get(apiKey2);
                    if (zaaVar2 == null) {
                        zajVar.zaa(apiKey2, new com.google.android.gms.common.ConnectionResult(13), null);
                        return true;
                    }
                    if (zaaVar2.isConnected()) {
                        zajVar.zaa(apiKey2, com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS, zaaVar2.zaad().getEndpointPackageName());
                    } else if (zaaVar2.zabk() != null) {
                        zajVar.zaa(apiKey2, zaaVar2.zabk(), null);
                    } else {
                        zaaVar2.zaa(zajVar);
                        zaaVar2.connect();
                    }
                }
                return true;
            case 3:
                for (com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar3 : this.zaim.values()) {
                    zaaVar3.zabj();
                    zaaVar3.connect();
                }
                return true;
            case 4:
            case 8:
            case 13:
                com.google.android.gms.common.api.internal.zabu zabuVar = (com.google.android.gms.common.api.internal.zabu) message.obj;
                com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar4 = this.zaim.get(zabuVar.zajz.getApiKey());
                if (zaaVar4 == null) {
                    zab(zabuVar.zajz);
                    zaaVar4 = this.zaim.get(zabuVar.zajz.getApiKey());
                }
                if (zaaVar4.requiresSignIn() && this.zail.get() != zabuVar.zajy) {
                    zabuVar.zajx.zaa(zaib);
                    zaaVar4.zabh();
                } else {
                    zaaVar4.zaa(zabuVar.zajx);
                }
                return true;
            case 5:
                int i = message.arg1;
                com.google.android.gms.common.ConnectionResult connectionResult = (com.google.android.gms.common.ConnectionResult) message.obj;
                for (com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar5 : this.zaim.values()) {
                    if (zaaVar5.getInstanceId() == i) {
                        zaaVar = zaaVar5;
                        if (zaaVar != null) {
                            java.lang.String errorString = this.zaii.getErrorString(connectionResult.getErrorCode());
                            java.lang.String errorMessage = connectionResult.getErrorMessage();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(errorString).length() + 69 + java.lang.String.valueOf(errorMessage).length());
                            sb.append("Error resolution was canceled by the user, original error message: ");
                            sb.append(errorString);
                            sb.append(": ");
                            sb.append(errorMessage);
                            zaaVar.zac(new com.google.android.gms.common.api.Status(17, sb.toString()));
                        } else {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(76);
                            sb2.append("Could not find API instance ");
                            sb2.append(i);
                            sb2.append(" while trying to fail enqueued calls.");
                            android.util.Log.wtf("GoogleApiManager", sb2.toString(), new java.lang.Exception());
                        }
                        return true;
                    }
                }
                if (zaaVar != null) {
                    java.lang.String errorString2 = this.zaii.getErrorString(connectionResult.getErrorCode());
                    java.lang.String errorMessage2 = connectionResult.getErrorMessage();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(errorString2).length() + 69 + java.lang.String.valueOf(errorMessage2).length());
                    sb3.append("Error resolution was canceled by the user, original error message: ");
                    sb3.append(errorString2);
                    sb3.append(": ");
                    sb3.append(errorMessage2);
                    zaaVar.zac(new com.google.android.gms.common.api.Status(17, sb3.toString()));
                } else {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder(76);
                    sb4.append("Could not find API instance ");
                    sb4.append(i);
                    sb4.append(" while trying to fail enqueued calls.");
                    android.util.Log.wtf("GoogleApiManager", sb4.toString(), new java.lang.Exception());
                }
                return true;
            case 6:
                if (com.google.android.gms.common.util.PlatformVersion.isAtLeastIceCreamSandwich() && (this.zaih.getApplicationContext() instanceof android.app.Application)) {
                    com.google.android.gms.common.api.internal.BackgroundDetector.initialize((android.app.Application) this.zaih.getApplicationContext());
                    com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().addListener(new com.google.android.gms.common.api.internal.zabh(this));
                    if (!com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zaif = 300000L;
                    }
                }
                return true;
            case 7:
                zab((com.google.android.gms.common.api.GoogleApi<?>) message.obj);
                return true;
            case 9:
                if (this.zaim.containsKey(message.obj)) {
                    this.zaim.get(message.obj).resume();
                }
                return true;
            case 10:
                java.util.Iterator<com.google.android.gms.common.api.internal.ApiKey<?>> it = this.zaip.iterator();
                while (it.hasNext()) {
                    this.zaim.remove(it.next()).zabh();
                }
                this.zaip.clear();
                return true;
            case 11:
                if (this.zaim.containsKey(message.obj)) {
                    this.zaim.get(message.obj).zaat();
                }
                return true;
            case 12:
                if (this.zaim.containsKey(message.obj)) {
                    this.zaim.get(message.obj).zabn();
                }
                return true;
            case 14:
                com.google.android.gms.common.api.internal.zaae zaaeVar = (com.google.android.gms.common.api.internal.zaae) message.obj;
                com.google.android.gms.common.api.internal.ApiKey<?> apiKey3 = zaaeVar.getApiKey();
                if (!this.zaim.containsKey(apiKey3)) {
                    zaaeVar.zaaj().setResult(false);
                } else {
                    zaaeVar.zaaj().setResult(java.lang.Boolean.valueOf(com.google.android.gms.common.api.internal.GoogleApiManager.zaa.zaa((com.google.android.gms.common.api.internal.GoogleApiManager.zaa) this.zaim.get(apiKey3), false)));
                }
                return true;
            case 15:
                com.google.android.gms.common.api.internal.GoogleApiManager.zac zacVar = (com.google.android.gms.common.api.internal.GoogleApiManager.zac) message.obj;
                if (this.zaim.containsKey(zacVar.zajh)) {
                    this.zaim.get(zacVar.zajh).zaa(zacVar);
                }
                return true;
            case 16:
                com.google.android.gms.common.api.internal.GoogleApiManager.zac zacVar2 = (com.google.android.gms.common.api.internal.GoogleApiManager.zac) message.obj;
                if (this.zaim.containsKey(zacVar2.zajh)) {
                    this.zaim.get(zacVar2.zajh).zab(zacVar2);
                }
                return true;
            default:
                int i2 = message.what;
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder(31);
                sb5.append("Unknown message id: ");
                sb5.append(i2);
                android.util.Log.w("GoogleApiManager", sb5.toString());
                return false;
        }
    }

    final android.app.PendingIntent zaa(com.google.android.gms.common.api.internal.ApiKey<?> apiKey, int i) {
        com.google.android.gms.signin.zac zacVarZabo;
        com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar = this.zaim.get(apiKey);
        if (zaaVar == null || (zacVarZabo = zaaVar.zabo()) == null) {
            return null;
        }
        return android.app.PendingIntent.getActivity(this.zaih, i, zacVarZabo.getSignInIntent(), 134217728);
    }

    final boolean zac(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        return this.zaii.zaa(this.zaih, connectionResult, i);
    }

    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        if (zac(connectionResult, i)) {
            return;
        }
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }
}
