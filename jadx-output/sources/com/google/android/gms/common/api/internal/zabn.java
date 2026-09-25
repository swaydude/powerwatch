package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zabn<O extends com.google.android.gms.common.api.Api.ApiOptions> extends com.google.android.gms.common.api.internal.zaag {
    private final com.google.android.gms.common.api.GoogleApi<O> zajj;

    public zabn(com.google.android.gms.common.api.GoogleApi<O> googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.zajj = googleApi;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zaa(com.google.android.gms.common.api.internal.zack zackVar) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zab(com.google.android.gms.common.api.internal.zack zackVar) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        return (T) this.zajj.doRead(t);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(T t) {
        return (T) this.zajj.doWrite(t);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.os.Looper getLooper() {
        return this.zajj.getLooper();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.content.Context getContext() {
        return this.zajj.getApplicationContext();
    }
}
