package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzau implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<com.google.android.gms.location.LocationCallback> {
    private final /* synthetic */ com.google.android.gms.location.LocationResult zzdb;

    zzau(com.google.android.gms.internal.location.zzat zzatVar, com.google.android.gms.location.LocationResult locationResult) {
        this.zzdb = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(com.google.android.gms.location.LocationCallback locationCallback) {
        locationCallback.onLocationResult(this.zzdb);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
