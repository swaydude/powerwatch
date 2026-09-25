package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public interface zabb {
    void begin();

    void connect();

    boolean disconnect();

    <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t);

    <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(T t);

    void onConnected(android.os.Bundle bundle);

    void onConnectionSuspended(int i);

    void zaa(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api<?> api, boolean z);
}
