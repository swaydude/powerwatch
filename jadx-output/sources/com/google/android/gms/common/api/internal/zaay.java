package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaay implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zagv;
    private final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zahl;
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference zahm;

    zaay(com.google.android.gms.common.api.internal.zaaw zaawVar, java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult) {
        this.zagv = zaawVar;
        this.zahm = atomicReference;
        this.zahl = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        this.zagv.zaa((com.google.android.gms.common.api.GoogleApiClient) this.zahm.get(), this.zahl, true);
    }
}
