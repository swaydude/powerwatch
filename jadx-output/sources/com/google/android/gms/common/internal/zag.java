package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zag implements com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ com.google.android.gms.common.api.internal.OnConnectionFailedListener zapc;

    zag(com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        this.zapc = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zapc.onConnectionFailed(connectionResult);
    }
}
