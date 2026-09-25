package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ApiKey<O extends com.google.android.gms.common.api.Api.ApiOptions> {
    private final com.google.android.gms.common.api.Api<O> mApi;
    private final O zabj;
    private final boolean zacx;
    private final int zacy;

    private ApiKey(com.google.android.gms.common.api.Api<O> api, O o) {
        this.zacx = false;
        this.mApi = api;
        this.zabj = o;
        this.zacy = com.google.android.gms.common.internal.Objects.hashCode(api, o);
    }

    private ApiKey(com.google.android.gms.common.api.Api<O> api) {
        this.zacx = true;
        this.mApi = api;
        this.zabj = null;
        this.zacy = java.lang.System.identityHashCode(this);
    }

    public static <O extends com.google.android.gms.common.api.Api.ApiOptions> com.google.android.gms.common.api.internal.ApiKey<O> getSharedApiKey(com.google.android.gms.common.api.Api<O> api, O o) {
        return new com.google.android.gms.common.api.internal.ApiKey<>(api, o);
    }

    public static <O extends com.google.android.gms.common.api.Api.ApiOptions> com.google.android.gms.common.api.internal.ApiKey<O> getUniqueApiKey(com.google.android.gms.common.api.Api<O> api) {
        return new com.google.android.gms.common.api.internal.ApiKey<>(api);
    }

    public final com.google.android.gms.common.api.Api.AnyClientKey<?> getClientKey() {
        return this.mApi.getClientKey();
    }

    public final boolean isUnique() {
        return this.zacx;
    }

    public final java.lang.String getApiName() {
        return this.mApi.getName();
    }

    public final int hashCode() {
        return this.zacy;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.api.internal.ApiKey)) {
            return false;
        }
        com.google.android.gms.common.api.internal.ApiKey apiKey = (com.google.android.gms.common.api.internal.ApiKey) obj;
        return !this.zacx && !apiKey.zacx && com.google.android.gms.common.internal.Objects.equal(this.mApi, apiKey.mApi) && com.google.android.gms.common.internal.Objects.equal(this.zabj, apiKey.zabj);
    }
}
