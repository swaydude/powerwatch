package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zad<A extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Api.AnyClient>> extends com.google.android.gms.common.api.internal.zac {
    private final A zacp;

    public zad(int i, A a) {
        super(i);
        this.zacp = a;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final void zac(com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar) throws android.os.DeadObjectException {
        try {
            this.zacp.run(zaaVar.zaad());
        } catch (java.lang.RuntimeException e) {
            zaa(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final void zaa(com.google.android.gms.common.api.Status status) {
        this.zacp.setFailedResult(status);
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final void zaa(java.lang.RuntimeException runtimeException) {
        java.lang.String simpleName = runtimeException.getClass().getSimpleName();
        java.lang.String localizedMessage = runtimeException.getLocalizedMessage();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(simpleName).length() + 2 + java.lang.String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.zacp.setFailedResult(new com.google.android.gms.common.api.Status(10, sb.toString()));
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final void zaa(com.google.android.gms.common.api.internal.zaz zazVar, boolean z) {
        zazVar.zaa(this.zacp, z);
    }
}
