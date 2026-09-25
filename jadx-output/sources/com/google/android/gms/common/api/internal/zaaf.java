package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zaaf implements com.google.android.gms.common.api.internal.zabb {
    private final com.google.android.gms.common.api.internal.zabe zafv;
    private boolean zafw = false;

    public zaaf(com.google.android.gms.common.api.internal.zabe zabeVar) {
        this.zafv = zabeVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void begin() {
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void onConnected(android.os.Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api<?> api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        return (T) execute(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(T t) {
        try {
            this.zafv.zaeh.zahj.zac(t);
            com.google.android.gms.common.api.internal.zaaw zaawVar = this.zafv.zaeh;
            com.google.android.gms.common.api.Api.Client client = zaawVar.zahd.get(t.getClientKey());
            com.google.android.gms.common.internal.Preconditions.checkNotNull(client, "Appropriate Api was not requested.");
            if (!client.isConnected() && this.zafv.zaht.containsKey(t.getClientKey())) {
                t.setFailedResult(new com.google.android.gms.common.api.Status(17));
            } else {
                boolean z = client instanceof com.google.android.gms.common.internal.SimpleClientAdapter;
                A client2 = client;
                if (z) {
                    client2 = ((com.google.android.gms.common.internal.SimpleClientAdapter) client).getClient();
                }
                t.run(client2);
            }
        } catch (android.os.DeadObjectException unused) {
            this.zafv.zaa(new com.google.android.gms.common.api.internal.zaai(this, this));
        }
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final boolean disconnect() {
        if (this.zafw) {
            return false;
        }
        if (this.zafv.zaeh.zaav()) {
            this.zafw = true;
            java.util.Iterator<com.google.android.gms.common.api.internal.zack> it = this.zafv.zaeh.zahi.iterator();
            while (it.hasNext()) {
                it.next().zabt();
            }
            return false;
        }
        this.zafv.zaf(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void connect() {
        if (this.zafw) {
            this.zafw = false;
            this.zafv.zaa(new com.google.android.gms.common.api.internal.zaah(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabb
    public final void onConnectionSuspended(int i) {
        this.zafv.zaf(null);
        this.zafv.zahx.zab(i, this.zafw);
    }

    final void zaak() {
        if (this.zafw) {
            this.zafw = false;
            this.zafv.zaeh.zahj.release();
            disconnect();
        }
    }
}
