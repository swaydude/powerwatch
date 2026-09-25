package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zaw<O extends com.google.android.gms.common.api.Api.ApiOptions> extends com.google.android.gms.common.api.GoogleApi<O> {
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> zacf;
    private final com.google.android.gms.common.internal.ClientSettings zafa;
    private final com.google.android.gms.common.api.Api.Client zafj;
    private final com.google.android.gms.common.api.internal.zap zafk;

    public zaw(android.content.Context context, com.google.android.gms.common.api.Api<O> api, android.os.Looper looper, com.google.android.gms.common.api.Api.Client client, com.google.android.gms.common.api.internal.zap zapVar, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zac, com.google.android.gms.signin.SignInOptions> abstractClientBuilder) {
        super(context, api, looper);
        this.zafj = client;
        this.zafk = zapVar;
        this.zafa = clientSettings;
        this.zacf = abstractClientBuilder;
        this.zabo.zaa(this);
    }

    public final com.google.android.gms.common.api.Api.Client zaad() {
        return this.zafj;
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    public final com.google.android.gms.common.api.Api.Client zaa(android.os.Looper looper, com.google.android.gms.common.api.internal.GoogleApiManager.zaa<O> zaaVar) {
        this.zafk.zaa(zaaVar);
        return this.zafj;
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    public final com.google.android.gms.common.api.internal.zace zaa(android.content.Context context, android.os.Handler handler) {
        return new com.google.android.gms.common.api.internal.zace(context, handler, this.zafa, this.zacf);
    }
}
