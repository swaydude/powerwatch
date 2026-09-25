package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaav implements com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zagv;

    zaav(com.google.android.gms.common.api.internal.zaaw zaawVar) {
        this.zagv = zaawVar;
    }

    @Override // com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState
    public final android.os.Bundle getConnectionHint() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState
    public final boolean isConnected() {
        return this.zagv.isConnected();
    }
}
