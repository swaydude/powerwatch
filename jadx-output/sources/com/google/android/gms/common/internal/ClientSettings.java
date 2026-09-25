package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ClientSettings {
    public static final java.lang.String KEY_CLIENT_SESSION_ID = "com.google.android.gms.common.internal.ClientSettings.sessionId";
    private final android.accounts.Account account;
    private final java.util.Set<com.google.android.gms.common.api.Scope> zaof;
    private final java.util.Set<com.google.android.gms.common.api.Scope> zaog;
    private final java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings> zaoh;
    private final int zaoi;
    private final android.view.View zaoj;
    private final java.lang.String zaok;
    private final java.lang.String zaol;
    private final com.google.android.gms.signin.SignInOptions zaom;
    private final boolean zaon;
    private java.lang.Integer zaoo;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class OptionalApiSettings {
        public final java.util.Set<com.google.android.gms.common.api.Scope> mScopes;

        public OptionalApiSettings(java.util.Set<com.google.android.gms.common.api.Scope> set) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(set);
            this.mScopes = java.util.Collections.unmodifiableSet(set);
        }
    }

    public static com.google.android.gms.common.internal.ClientSettings createDefault(android.content.Context context) {
        return new com.google.android.gms.common.api.GoogleApiClient.Builder(context).buildClientSettings();
    }

    public ClientSettings(android.accounts.Account account, java.util.Set<com.google.android.gms.common.api.Scope> set, java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings> map, int i, android.view.View view, java.lang.String str, java.lang.String str2, com.google.android.gms.signin.SignInOptions signInOptions) {
        this(account, set, map, i, view, str, str2, signInOptions, false);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class Builder {
        private android.accounts.Account account;
        private java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings> zaoh;
        private android.view.View zaoj;
        private java.lang.String zaok;
        private java.lang.String zaol;
        private androidx.collection.ArraySet<com.google.android.gms.common.api.Scope> zaop;
        private boolean zaoq;
        private int zaoi = 0;
        private com.google.android.gms.signin.SignInOptions zaom = com.google.android.gms.signin.SignInOptions.DEFAULT;

        public final com.google.android.gms.common.internal.ClientSettings.Builder setAccount(android.accounts.Account account) {
            this.account = account;
            return this;
        }

        public final com.google.android.gms.common.internal.ClientSettings.Builder addRequiredScope(com.google.android.gms.common.api.Scope scope) {
            if (this.zaop == null) {
                this.zaop = new androidx.collection.ArraySet<>();
            }
            this.zaop.add(scope);
            return this;
        }

        public final com.google.android.gms.common.internal.ClientSettings.Builder addAllRequiredScopes(java.util.Collection<com.google.android.gms.common.api.Scope> collection) {
            if (this.zaop == null) {
                this.zaop = new androidx.collection.ArraySet<>();
            }
            this.zaop.addAll(collection);
            return this;
        }

        public final com.google.android.gms.common.internal.ClientSettings.Builder setOptionalApiSettingsMap(java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings> map) {
            this.zaoh = map;
            return this;
        }

        public final com.google.android.gms.common.internal.ClientSettings.Builder setGravityForPopups(int i) {
            this.zaoi = i;
            return this;
        }

        public final com.google.android.gms.common.internal.ClientSettings.Builder setViewForPopups(android.view.View view) {
            this.zaoj = view;
            return this;
        }

        public final com.google.android.gms.common.internal.ClientSettings.Builder setRealClientPackageName(java.lang.String str) {
            this.zaok = str;
            return this;
        }

        public final com.google.android.gms.common.internal.ClientSettings.Builder setRealClientClassName(java.lang.String str) {
            this.zaol = str;
            return this;
        }

        public final com.google.android.gms.common.internal.ClientSettings.Builder setSignInOptions(com.google.android.gms.signin.SignInOptions signInOptions) {
            this.zaom = signInOptions;
            return this;
        }

        public final com.google.android.gms.common.internal.ClientSettings.Builder enableSignInClientDisconnectFix() {
            this.zaoq = true;
            return this;
        }

        public final com.google.android.gms.common.internal.ClientSettings build() {
            return new com.google.android.gms.common.internal.ClientSettings(this.account, this.zaop, this.zaoh, this.zaoi, this.zaoj, this.zaok, this.zaol, this.zaom, this.zaoq);
        }
    }

    public ClientSettings(android.accounts.Account account, java.util.Set<com.google.android.gms.common.api.Scope> set, java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings> map, int i, android.view.View view, java.lang.String str, java.lang.String str2, com.google.android.gms.signin.SignInOptions signInOptions, boolean z) {
        this.account = account;
        java.util.Set<com.google.android.gms.common.api.Scope> setEmptySet = set == null ? java.util.Collections.emptySet() : java.util.Collections.unmodifiableSet(set);
        this.zaof = setEmptySet;
        map = map == null ? java.util.Collections.emptyMap() : map;
        this.zaoh = map;
        this.zaoj = view;
        this.zaoi = i;
        this.zaok = str;
        this.zaol = str2;
        this.zaom = signInOptions;
        this.zaon = z;
        java.util.HashSet hashSet = new java.util.HashSet(setEmptySet);
        java.util.Iterator<com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings> it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().mScopes);
        }
        this.zaog = java.util.Collections.unmodifiableSet(hashSet);
    }

    @javax.annotation.Nullable
    @java.lang.Deprecated
    public final java.lang.String getAccountName() {
        android.accounts.Account account = this.account;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @javax.annotation.Nullable
    public final android.accounts.Account getAccount() {
        return this.account;
    }

    public final android.accounts.Account getAccountOrDefault() {
        android.accounts.Account account = this.account;
        return account != null ? account : new android.accounts.Account("<<default account>>", "com.google");
    }

    public final int getGravityForPopups() {
        return this.zaoi;
    }

    public final java.util.Set<com.google.android.gms.common.api.Scope> getRequiredScopes() {
        return this.zaof;
    }

    public final java.util.Set<com.google.android.gms.common.api.Scope> getAllRequestedScopes() {
        return this.zaog;
    }

    public final java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings> getOptionalApiSettings() {
        return this.zaoh;
    }

    @javax.annotation.Nullable
    public final java.lang.String getRealClientPackageName() {
        return this.zaok;
    }

    @javax.annotation.Nullable
    public final java.lang.String getRealClientClassName() {
        return this.zaol;
    }

    @javax.annotation.Nullable
    public final android.view.View getViewForPopups() {
        return this.zaoj;
    }

    @javax.annotation.Nullable
    public final com.google.android.gms.signin.SignInOptions getSignInOptions() {
        return this.zaom;
    }

    @javax.annotation.Nullable
    public final java.lang.Integer getClientSessionId() {
        return this.zaoo;
    }

    public final void setClientSessionId(java.lang.Integer num) {
        this.zaoo = num;
    }

    public final java.util.Set<com.google.android.gms.common.api.Scope> getApplicableScopes(com.google.android.gms.common.api.Api<?> api) {
        com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings optionalApiSettings = this.zaoh.get(api);
        if (optionalApiSettings == null || optionalApiSettings.mScopes.isEmpty()) {
            return this.zaof;
        }
        java.util.HashSet hashSet = new java.util.HashSet(this.zaof);
        hashSet.addAll(optionalApiSettings.mScopes);
        return hashSet;
    }

    public final boolean isSignInClientDisconnectFixEnabled() {
        return this.zaon;
    }
}
