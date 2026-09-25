package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zaat implements com.google.android.gms.common.api.internal.zabb {
    private final com.google.android.gms.common.api.internal.zabe zafv;

    public zaat(com.google.android.gms.common.api.internal.zabe zabeVar) {
        this.zafv = zabeVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final boolean disconnect() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void onConnected(android.os.Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api<?> api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void begin() {
        java.util.Iterator<com.google.android.gms.common.api.Api.Client> it = this.zafv.zahd.values().iterator();
        while (it.hasNext()) {
            it.next().disconnect();
        }
        this.zafv.zaeh.zahe = java.util.Collections.emptySet();
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
    public final void connect() {
        this.zafv.zaax();
    }
}
