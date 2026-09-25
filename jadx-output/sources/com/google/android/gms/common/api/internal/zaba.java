package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaba implements com.google.android.gms.common.api.ResultCallback<com.google.android.gms.common.api.Status> {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zagv;
    private final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zahl;
    private final /* synthetic */ boolean zahn;
    private final /* synthetic */ com.google.android.gms.common.api.GoogleApiClient zaho;

    zaba(com.google.android.gms.common.api.internal.zaaw zaawVar, com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult, boolean z, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        this.zagv = zaawVar;
        this.zahl = statusPendingResult;
        this.zahn = z;
        this.zaho = googleApiClient;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* synthetic */ void onResult(com.google.android.gms.common.api.Result result) {
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) result;
        com.google.android.gms.auth.api.signin.internal.Storage.getInstance(this.zagv.mContext).zaf();
        if (status.isSuccess() && this.zagv.isConnected()) {
            this.zagv.reconnect();
        }
        this.zahl.setResult(status);
        if (this.zahn) {
            this.zaho.disconnect();
        }
    }
}
