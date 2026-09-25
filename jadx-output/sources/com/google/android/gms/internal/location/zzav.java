package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzav implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<com.google.android.gms.location.LocationCallback> {
    private final /* synthetic */ com.google.android.gms.location.LocationAvailability zzdc;

    zzav(com.google.android.gms.internal.location.zzat zzatVar, com.google.android.gms.location.LocationAvailability locationAvailability) {
        this.zzdc = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(com.google.android.gms.location.LocationCallback locationCallback) {
        locationCallback.onLocationAvailability(this.zzdc);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
