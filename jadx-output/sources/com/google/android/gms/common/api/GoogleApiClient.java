package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class GoogleApiClient {
    public static final java.lang.String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    private static final java.util.Set<com.google.android.gms.common.api.GoogleApiClient> zacj = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    @java.lang.Deprecated
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    @java.lang.Deprecated
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public abstract com.google.android.gms.common.ConnectionResult blockingConnect();

    public abstract com.google.android.gms.common.ConnectionResult blockingConnect(long j, java.util.concurrent.TimeUnit timeUnit);

    public abstract com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public abstract void disconnect();

    public abstract void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

    public abstract com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.Api<?> api);

    public abstract boolean hasConnectedApi(com.google.android.gms.common.api.Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener);

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener);

    public abstract void stopAutoManage(androidx.fragment.app.FragmentActivity fragmentActivity);

    public abstract void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener);

    public static void dumpAll(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.util.Set<com.google.android.gms.common.api.GoogleApiClient> set = zacj;
        synchronized (set) {
            int i = 0;
            java.lang.String strConcat = java.lang.String.valueOf(str).concat("  ");
            for (com.google.android.gms.common.api.GoogleApiClient googleApiClient : set) {
                printWriter.append((java.lang.CharSequence) str).append("GoogleApiClient#").println(i);
                googleApiClient.dump(strConcat, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    public static java.util.Set<com.google.android.gms.common.api.GoogleApiClient> getAllClients() {
        java.util.Set<com.google.android.gms.common.api.GoogleApiClient> set = zacj;
        synchronized (set) {
        }
        return set;
    }

    public <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        throw new java.lang.UnsupportedOperationException();
    }

    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(T t) {
        throw new java.lang.UnsupportedOperationException();
    }

    public <L> com.google.android.gms.common.api.internal.ListenerHolder<L> registerListener(L l) {
        throw new java.lang.UnsupportedOperationException();
    }

    public <C extends com.google.android.gms.common.api.Api.Client> C getClient(com.google.android.gms.common.api.Api.AnyClientKey<C> anyClientKey) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    @java.lang.Deprecated
    public static final class Builder {
        private final android.content.Context mContext;
        private android.os.Looper zabl;
        private final java.util.Set<com.google.android.gms.common.api.Scope> zabs;
        private final java.util.Set<com.google.android.gms.common.api.Scope> zabt;
        private int zabu;
        private android.view.View zabv;
        private java.lang.String zabw;
        private java.lang.String zabx;
        private final java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings> zaby;
        private boolean zabz;
        private final java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.api.Api.ApiOptions> zaca;
        private com.google.android.gms.common.api.internal.LifecycleActivity zacb;
        private int zacc;
        private com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener zacd;
        private com.google.android.gms.common.GoogleApiAvailability zace;
        private com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> zacf;
        private final java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks> zacg;
        private final java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener> zach;
        private boolean zaci;
        private android.accounts.Account zax;

        public Builder(android.content.Context context) {
            this.zabs = new java.util.HashSet();
            this.zabt = new java.util.HashSet();
            this.zaby = new androidx.collection.ArrayMap();
            this.zabz = false;
            this.zaca = new androidx.collection.ArrayMap();
            this.zacc = -1;
            this.zace = com.google.android.gms.common.GoogleApiAvailability.getInstance();
            this.zacf = com.google.android.gms.signin.zab.zapv;
            this.zacg = new java.util.ArrayList<>();
            this.zach = new java.util.ArrayList<>();
            this.zaci = false;
            this.mContext = context;
            this.zabl = context.getMainLooper();
            this.zabw = context.getPackageName();
            this.zabx = context.getClass().getName();
        }

        public Builder(android.content.Context context, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.zacg.add(connectionCallbacks);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.zach.add(onConnectionFailedListener);
        }

        public final com.google.android.gms.common.api.GoogleApiClient.Builder setHandler(android.os.Handler handler) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(handler, "Handler must not be null");
            this.zabl = handler.getLooper();
            return this;
        }

        public final com.google.android.gms.common.api.GoogleApiClient.Builder addConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.zacg.add(connectionCallbacks);
            return this;
        }

        public final com.google.android.gms.common.api.GoogleApiClient.Builder addOnConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.zach.add(onConnectionFailedListener);
            return this;
        }

        public final com.google.android.gms.common.api.GoogleApiClient.Builder setViewForPopups(android.view.View view) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(view, "View must not be null");
            this.zabv = view;
            return this;
        }

        public final com.google.android.gms.common.api.GoogleApiClient.Builder addScope(com.google.android.gms.common.api.Scope scope) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(scope, "Scope must not be null");
            this.zabs.add(scope);
            return this;
        }

        public final com.google.android.gms.common.api.GoogleApiClient.Builder addScopeNames(java.lang.String[] strArr) {
            for (java.lang.String str : strArr) {
                this.zabs.add(new com.google.android.gms.common.api.Scope(str));
            }
            return this;
        }

        public final com.google.android.gms.common.api.GoogleApiClient.Builder addApi(com.google.android.gms.common.api.Api<? extends com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions> api) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(api, "Api must not be null");
            this.zaca.put(api, null);
            java.util.List<com.google.android.gms.common.api.Scope> impliedScopes = api.zah().getImpliedScopes(null);
            this.zabt.addAll(impliedScopes);
            this.zabs.addAll(impliedScopes);
            return this;
        }

        public final com.google.android.gms.common.api.GoogleApiClient.Builder addApiIfAvailable(com.google.android.gms.common.api.Api<? extends com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions> api, com.google.android.gms.common.api.Scope... scopeArr) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(api, "Api must not be null");
            this.zaca.put(api, null);
            zaa(api, null, scopeArr);
            return this;
        }

        public final <O extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions> com.google.android.gms.common.api.GoogleApiClient.Builder addApi(com.google.android.gms.common.api.Api<O> api, O o) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(api, "Api must not be null");
            com.google.android.gms.common.internal.Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zaca.put(api, o);
            java.util.List<com.google.android.gms.common.api.Scope> impliedScopes = api.zah().getImpliedScopes(o);
            this.zabt.addAll(impliedScopes);
            this.zabs.addAll(impliedScopes);
            return this;
        }

        public final <O extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions> com.google.android.gms.common.api.GoogleApiClient.Builder addApiIfAvailable(com.google.android.gms.common.api.Api<O> api, O o, com.google.android.gms.common.api.Scope... scopeArr) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(api, "Api must not be null");
            com.google.android.gms.common.internal.Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zaca.put(api, o);
            zaa(api, o, scopeArr);
            return this;
        }

        public final com.google.android.gms.common.api.GoogleApiClient.Builder setAccountName(java.lang.String str) {
            this.zax = str == null ? null : new android.accounts.Account(str, "com.google");
            return this;
        }

        public final com.google.android.gms.common.api.GoogleApiClient.Builder useDefaultAccount() {
            return setAccountName("<<default account>>");
        }

        public final com.google.android.gms.common.api.GoogleApiClient.Builder setGravityForPopups(int i) {
            this.zabu = i;
            return this;
        }

        public final com.google.android.gms.common.api.GoogleApiClient.Builder enableAutoManage(androidx.fragment.app.FragmentActivity fragmentActivity, int i, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            com.google.android.gms.common.api.internal.LifecycleActivity lifecycleActivity = new com.google.android.gms.common.api.internal.LifecycleActivity((android.app.Activity) fragmentActivity);
            com.google.android.gms.common.internal.Preconditions.checkArgument(i >= 0, "clientId must be non-negative");
            this.zacc = i;
            this.zacd = onConnectionFailedListener;
            this.zacb = lifecycleActivity;
            return this;
        }

        public final com.google.android.gms.common.api.GoogleApiClient.Builder enableAutoManage(androidx.fragment.app.FragmentActivity fragmentActivity, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return enableAutoManage(fragmentActivity, 0, onConnectionFailedListener);
        }

        public final com.google.android.gms.common.internal.ClientSettings buildClientSettings() {
            com.google.android.gms.signin.SignInOptions signInOptions = com.google.android.gms.signin.SignInOptions.DEFAULT;
            if (this.zaca.containsKey(com.google.android.gms.signin.zab.API)) {
                signInOptions = (com.google.android.gms.signin.SignInOptions) this.zaca.get(com.google.android.gms.signin.zab.API);
            }
            return new com.google.android.gms.common.internal.ClientSettings(this.zax, this.zabs, this.zaby, this.zabu, this.zabv, this.zabw, this.zabx, signInOptions, false);
        }

        public final com.google.android.gms.common.api.GoogleApiClient build() {
            com.google.android.gms.common.internal.Preconditions.checkArgument(!this.zaca.isEmpty(), "must call addApi() to add at least one API");
            com.google.android.gms.common.internal.ClientSettings clientSettingsBuildClientSettings = buildClientSettings();
            com.google.android.gms.common.api.Api<?> api = null;
            java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings> optionalApiSettings = clientSettingsBuildClientSettings.getOptionalApiSettings();
            androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
            androidx.collection.ArrayMap arrayMap2 = new androidx.collection.ArrayMap();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            boolean z = false;
            for (com.google.android.gms.common.api.Api<?> api2 : this.zaca.keySet()) {
                com.google.android.gms.common.api.Api.ApiOptions apiOptions = this.zaca.get(api2);
                boolean z2 = optionalApiSettings.get(api2) != null;
                arrayMap.put(api2, java.lang.Boolean.valueOf(z2));
                com.google.android.gms.common.api.internal.zap zapVar = new com.google.android.gms.common.api.internal.zap(api2, z2);
                arrayList.add(zapVar);
                com.google.android.gms.common.api.Api.AbstractClientBuilder<?, O> abstractClientBuilderZai = api2.zai();
                com.google.android.gms.common.api.Api.Client clientBuildClient = abstractClientBuilderZai.buildClient(this.mContext, this.zabl, clientSettingsBuildClientSettings, apiOptions, (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) zapVar, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) zapVar);
                arrayMap2.put(api2.getClientKey(), clientBuildClient);
                if (abstractClientBuilderZai.getPriority() == 1) {
                    z = apiOptions != null;
                }
                if (clientBuildClient.providesSignIn()) {
                    if (api != null) {
                        java.lang.String name = api2.getName();
                        java.lang.String name2 = api.getName();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 21 + java.lang.String.valueOf(name2).length());
                        sb.append(name);
                        sb.append(" cannot be used with ");
                        sb.append(name2);
                        throw new java.lang.IllegalStateException(sb.toString());
                    }
                    api = api2;
                }
            }
            if (api != null) {
                if (z) {
                    java.lang.String name3 = api.getName();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(name3).length() + 82);
                    sb2.append("With using ");
                    sb2.append(name3);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new java.lang.IllegalStateException(sb2.toString());
                }
                com.google.android.gms.common.internal.Preconditions.checkState(this.zax == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.getName());
                com.google.android.gms.common.internal.Preconditions.checkState(this.zabs.equals(this.zabt), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.getName());
            }
            com.google.android.gms.common.api.internal.zaaw zaawVar = new com.google.android.gms.common.api.internal.zaaw(this.mContext, new java.util.concurrent.locks.ReentrantLock(), this.zabl, clientSettingsBuildClientSettings, this.zace, this.zacf, arrayMap, this.zacg, this.zach, arrayMap2, this.zacc, com.google.android.gms.common.api.internal.zaaw.zaa(arrayMap2.values(), true), arrayList, false);
            synchronized (com.google.android.gms.common.api.GoogleApiClient.zacj) {
                com.google.android.gms.common.api.GoogleApiClient.zacj.add(zaawVar);
            }
            if (this.zacc >= 0) {
                com.google.android.gms.common.api.internal.zai.zaa(this.zacb).zaa(this.zacc, zaawVar, this.zacd);
            }
            return zaawVar;
        }

        private final <O extends com.google.android.gms.common.api.Api.ApiOptions> void zaa(com.google.android.gms.common.api.Api<O> api, O o, com.google.android.gms.common.api.Scope... scopeArr) {
            java.util.HashSet hashSet = new java.util.HashSet(api.zah().getImpliedScopes(o));
            for (com.google.android.gms.common.api.Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.zaby.put(api, new com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings(hashSet));
        }
    }

    public boolean hasApi(com.google.android.gms.common.api.Api<?> api) {
        throw new java.lang.UnsupportedOperationException();
    }

    public android.content.Context getContext() {
        throw new java.lang.UnsupportedOperationException();
    }

    public android.os.Looper getLooper() {
        throw new java.lang.UnsupportedOperationException();
    }

    public boolean maybeSignIn(com.google.android.gms.common.api.internal.SignInConnectionListener signInConnectionListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void maybeSignOut() {
        throw new java.lang.UnsupportedOperationException();
    }

    public void connect(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void zaa(com.google.android.gms.common.api.internal.zack zackVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void zab(com.google.android.gms.common.api.internal.zack zackVar) {
        throw new java.lang.UnsupportedOperationException();
    }
}
