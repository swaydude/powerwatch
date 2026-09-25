package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaax implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    private final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zahl;

    zaax(com.google.android.gms.common.api.internal.zaaw zaawVar, com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult) {
        this.zahl = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zahl.setResult(new com.google.android.gms.common.api.Status(8));
    }
}
