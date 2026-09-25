package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzay implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<com.google.android.gms.location.LocationListener> {
    private final /* synthetic */ android.location.Location zzdd;

    zzay(com.google.android.gms.internal.location.zzax zzaxVar, android.location.Location location) {
        this.zzdd = location;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(com.google.android.gms.location.LocationListener locationListener) {
        locationListener.onLocationChanged(this.zzdd);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
