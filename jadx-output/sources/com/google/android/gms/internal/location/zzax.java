package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzax extends com.google.android.gms.location.zzy {
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationListener> zzda;

    zzax(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationListener> listenerHolder) {
        this.zzda = listenerHolder;
    }

    @Override // com.google.android.gms.location.zzx
    public final synchronized void onLocationChanged(android.location.Location location) {
        this.zzda.notifyListener(new com.google.android.gms.internal.location.zzay(this, location));
    }

    public final synchronized void release() {
        this.zzda.clear();
    }
}
