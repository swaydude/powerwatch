package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaam implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks {
    private final com.google.android.gms.common.api.Api<?> mApi;
    private final boolean zaee;
    private final java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zaak> zago;

    public zaam(com.google.android.gms.common.api.internal.zaak zaakVar, com.google.android.gms.common.api.Api<?> api, boolean z) {
        this.zago = new java.lang.ref.WeakReference<>(zaakVar);
        this.mApi = api;
        this.zaee = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.common.api.internal.zaak zaakVar = this.zago.get();
        if (zaakVar == null) {
            return;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(android.os.Looper.myLooper() == zaakVar.zafv.zaeh.getLooper(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        zaakVar.zaer.lock();
        try {
            if (zaakVar.zac(0)) {
                if (!connectionResult.isSuccess()) {
                    zaakVar.zab(connectionResult, this.mApi, this.zaee);
                }
                if (zaakVar.zaam()) {
                    zaakVar.zaan();
                }
            }
        } finally {
            zaakVar.zaer.unlock();
        }
    }
}
