package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaf implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ com.google.android.gms.common.api.internal.ConnectionCallbacks zaou;

    zaf(com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks) {
        this.zaou = connectionCallbacks;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        this.zaou.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zaou.onConnectionSuspended(i);
    }
}
