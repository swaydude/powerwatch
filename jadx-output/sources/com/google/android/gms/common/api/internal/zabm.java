package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zabm implements com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks {
    final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager.zaa zaiq;

    zabm(com.google.android.gms.common.api.internal.GoogleApiManager.zaa zaaVar) {
        this.zaiq = zaaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void onSignOutComplete() {
        com.google.android.gms.common.api.internal.GoogleApiManager.this.handler.post(new com.google.android.gms.common.api.internal.zabl(this));
    }
}
