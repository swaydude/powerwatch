package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleApi<O extends com.google.android.gms.common.api.Api.ApiOptions> implements com.google.android.gms.common.api.HasApiKey<O> {
    private final com.google.android.gms.common.api.Api<O> mApi;
    private final android.content.Context mContext;
    private final int mId;
    private final O zabj;
    private final com.google.android.gms.common.api.internal.ApiKey<O> zabk;
    private final android.os.Looper zabl;
    private final com.google.android.gms.common.api.GoogleApiClient zabm;
    private final com.google.android.gms.common.api.internal.StatusExceptionMapper zabn;
    protected final com.google.android.gms.common.api.internal.GoogleApiManager zabo;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class Settings {
        public static final com.google.android.gms.common.api.GoogleApi.Settings DEFAULT_SETTINGS = new com.google.android.gms.common.api.GoogleApi.Settings.Builder().build();
        public final com.google.android.gms.common.api.internal.StatusExceptionMapper zabp;
        public final android.os.Looper zabq;

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public static class Builder {
            private android.os.Looper zabl;
            private com.google.android.gms.common.api.internal.StatusExceptionMapper zabn;

            public com.google.android.gms.common.api.GoogleApi.Settings.Builder setMapper(com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.zabn = statusExceptionMapper;
                return this;
            }

            public com.google.android.gms.common.api.GoogleApi.Settings.Builder setLooper(android.os.Looper looper) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "Looper must not be null.");
                this.zabl = looper;
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public com.google.android.gms.common.api.GoogleApi.Settings build() {
                if (this.zabn == null) {
                    this.zabn = new com.google.android.gms.common.api.internal.ApiExceptionMapper();
                }
                if (this.zabl == null) {
                    this.zabl = android.os.Looper.getMainLooper();
                }
                return new com.google.android.gms.common.api.GoogleApi.Settings(this.zabn, this.zabl);
            }
        }

        private Settings(com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper, android.accounts.Account account, android.os.Looper looper) {
            this.zabp = statusExceptionMapper;
            this.zabq = looper;
        }
    }

    protected GoogleApi(android.content.Context context, com.google.android.gms.common.api.Api<O> api, android.os.Looper looper) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Null context is not permitted.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(api, "Api must not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "Looper must not be null.");
        android.content.Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mApi = api;
        this.zabj = null;
        this.zabl = looper;
        this.zabk = com.google.android.gms.common.api.internal.ApiKey.getUniqueApiKey(api);
        this.zabm = new com.google.android.gms.common.api.internal.zabn(this);
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManagerZab = com.google.android.gms.common.api.internal.GoogleApiManager.zab(applicationContext);
        this.zabo = googleApiManagerZab;
        this.mId = googleApiManagerZab.zabb();
        this.zabn = new com.google.android.gms.common.api.internal.ApiExceptionMapper();
    }

    @java.lang.Deprecated
    public GoogleApi(android.content.Context context, com.google.android.gms.common.api.Api<O> api, O o, android.os.Looper looper, com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper) {
        this(context, api, o, new com.google.android.gms.common.api.GoogleApi.Settings.Builder().setLooper(looper).setMapper(statusExceptionMapper).build());
    }

    public GoogleApi(android.app.Activity activity, com.google.android.gms.common.api.Api<O> api, O o, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity, "Null activity is not permitted.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(api, "Api must not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        android.content.Context applicationContext = activity.getApplicationContext();
        this.mContext = applicationContext;
        this.mApi = api;
        this.zabj = o;
        this.zabl = settings.zabq;
        com.google.android.gms.common.api.internal.ApiKey<O> sharedApiKey = com.google.android.gms.common.api.internal.ApiKey.getSharedApiKey(api, o);
        this.zabk = sharedApiKey;
        this.zabm = new com.google.android.gms.common.api.internal.zabn(this);
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManagerZab = com.google.android.gms.common.api.internal.GoogleApiManager.zab(applicationContext);
        this.zabo = googleApiManagerZab;
        this.mId = googleApiManagerZab.zabb();
        this.zabn = settings.zabp;
        if (!(activity instanceof com.google.android.gms.common.api.GoogleApiActivity)) {
            com.google.android.gms.common.api.internal.zaad.zaa(activity, googleApiManagerZab, sharedApiKey);
        }
        googleApiManagerZab.zaa((com.google.android.gms.common.api.GoogleApi<?>) this);
    }

    public GoogleApi(android.content.Context context, com.google.android.gms.common.api.Api<O> api, O o, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Null context is not permitted.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(api, "Api must not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        android.content.Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mApi = api;
        this.zabj = o;
        this.zabl = settings.zabq;
        this.zabk = com.google.android.gms.common.api.internal.ApiKey.getSharedApiKey(api, o);
        this.zabm = new com.google.android.gms.common.api.internal.zabn(this);
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManagerZab = com.google.android.gms.common.api.internal.GoogleApiManager.zab(applicationContext);
        this.zabo = googleApiManagerZab;
        this.mId = googleApiManagerZab.zabb();
        this.zabn = settings.zabp;
        googleApiManagerZab.zaa((com.google.android.gms.common.api.GoogleApi<?>) this);
    }

    @java.lang.Deprecated
    public GoogleApi(android.app.Activity activity, com.google.android.gms.common.api.Api<O> api, O o, com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper) {
        this(activity, (com.google.android.gms.common.api.Api) api, (com.google.android.gms.common.api.Api.ApiOptions) o, new com.google.android.gms.common.api.GoogleApi.Settings.Builder().setMapper(statusExceptionMapper).setLooper(activity.getMainLooper()).build());
    }

    @java.lang.Deprecated
    public GoogleApi(android.content.Context context, com.google.android.gms.common.api.Api<O> api, O o, com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper) {
        this(context, api, o, new com.google.android.gms.common.api.GoogleApi.Settings.Builder().setMapper(statusExceptionMapper).build());
    }

    private final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T zaa(int i, T t) {
        t.zar();
        this.zabo.zaa(this, i, (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Api.AnyClient>) t);
        return t;
    }

    private final <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> zaa(int i, com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> taskApiCall) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zabo.zaa(this, i, taskApiCall, taskCompletionSource, this.zabn);
        return taskCompletionSource.getTask();
    }

    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T doRead(T t) {
        return (T) zaa(0, t);
    }

    public <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> doRead(com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> taskApiCall) {
        return zaa(0, taskApiCall);
    }

    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T doWrite(T t) {
        return (T) zaa(1, t);
    }

    public <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> doWrite(com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> taskApiCall) {
        return zaa(1, taskApiCall);
    }

    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T doBestEffortWrite(T t) {
        return (T) zaa(2, t);
    }

    public <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> doBestEffortWrite(com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> taskApiCall) {
        return zaa(2, taskApiCall);
    }

    @java.lang.Deprecated
    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.RegisterListenerMethod<A, ?>, U extends com.google.android.gms.common.api.internal.UnregisterListenerMethod<A, ?>> com.google.android.gms.tasks.Task<java.lang.Void> doRegisterEventListener(T t, U u) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(t);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(u);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(t.getListenerKey(), "Listener has already been released.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(u.getListenerKey(), "Listener has already been released.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(t.getListenerKey().equals(u.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zabo.zaa(this, (com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.common.api.Api.AnyClient, ?>) t, (com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.common.api.Api.AnyClient, ?>) u);
    }

    public <A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<java.lang.Void> doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods<A, ?> registrationMethods) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(registrationMethods);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(registrationMethods.zaka.getListenerKey(), "Listener has already been released.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(registrationMethods.zakb.getListenerKey(), "Listener has already been released.");
        return this.zabo.zaa(this, registrationMethods.zaka, registrationMethods.zakb);
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> listenerKey) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerKey, "Listener key cannot be null.");
        return this.zabo.zaa(this, listenerKey);
    }

    public <L> com.google.android.gms.common.api.internal.ListenerHolder<L> registerListener(L l, java.lang.String str) {
        return com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(l, this.zabl, str);
    }

    protected com.google.android.gms.tasks.Task<java.lang.Boolean> disconnectService() {
        return this.zabo.zac((com.google.android.gms.common.api.GoogleApi<?>) this);
    }

    public com.google.android.gms.common.api.Api.Client zaa(android.os.Looper looper, com.google.android.gms.common.api.internal.GoogleApiManager.zaa<O> zaaVar) {
        return this.mApi.zai().buildClient(this.mContext, looper, createClientSettingsBuilder().build(), this.zabj, (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) zaaVar, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) zaaVar);
    }

    public final com.google.android.gms.common.api.Api<O> getApi() {
        return this.mApi;
    }

    public O getApiOptions() {
        return this.zabj;
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    public com.google.android.gms.common.api.internal.ApiKey<O> getApiKey() {
        return this.zabk;
    }

    public final int getInstanceId() {
        return this.mId;
    }

    public com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient() {
        return this.zabm;
    }

    public android.os.Looper getLooper() {
        return this.zabl;
    }

    public android.content.Context getApplicationContext() {
        return this.mContext;
    }

    protected com.google.android.gms.common.internal.ClientSettings.Builder createClientSettingsBuilder() {
        android.accounts.Account account;
        java.util.Set<com.google.android.gms.common.api.Scope> setEmptySet;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount2;
        com.google.android.gms.common.internal.ClientSettings.Builder builder = new com.google.android.gms.common.internal.ClientSettings.Builder();
        O o = this.zabj;
        if ((o instanceof com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) && (googleSignInAccount2 = ((com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) o).getGoogleSignInAccount()) != null) {
            account = googleSignInAccount2.getAccount();
        } else {
            O o2 = this.zabj;
            account = o2 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions ? ((com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions) o2).getAccount() : null;
        }
        com.google.android.gms.common.internal.ClientSettings.Builder account2 = builder.setAccount(account);
        O o3 = this.zabj;
        if ((o3 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) && (googleSignInAccount = ((com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) o3).getGoogleSignInAccount()) != null) {
            setEmptySet = googleSignInAccount.getRequestedScopes();
        } else {
            setEmptySet = java.util.Collections.emptySet();
        }
        return account2.addAllRequiredScopes(setEmptySet).setRealClientClassName(this.mContext.getClass().getName()).setRealClientPackageName(this.mContext.getPackageName());
    }

    public com.google.android.gms.common.api.internal.zace zaa(android.content.Context context, android.os.Handler handler) {
        return new com.google.android.gms.common.api.internal.zace(context, handler, createClientSettingsBuilder().build());
    }
}
