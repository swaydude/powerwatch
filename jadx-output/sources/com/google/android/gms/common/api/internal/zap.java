package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zap implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    public final com.google.android.gms.common.api.Api<?> mApi;
    private final boolean zaee;
    private com.google.android.gms.common.api.internal.zar zaef;

    public zap(com.google.android.gms.common.api.Api<?> api, boolean z) {
        this.mApi = api;
        this.zaee = z;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        zat();
        this.zaef.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zat();
        this.zaef.onConnectionSuspended(i);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        zat();
        this.zaef.zaa(connectionResult, this.mApi, this.zaee);
    }

    public final void zaa(com.google.android.gms.common.api.internal.zar zarVar) {
        this.zaef = zarVar;
    }

    private final void zat() {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaef, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }
}
