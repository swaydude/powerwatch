package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzat extends com.google.android.gms.location.zzv {
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationCallback> zzda;

    zzat(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationCallback> listenerHolder) {
        this.zzda = listenerHolder;
    }

    @Override // com.google.android.gms.location.zzu
    public final void onLocationAvailability(com.google.android.gms.location.LocationAvailability locationAvailability) {
        this.zzda.notifyListener(new com.google.android.gms.internal.location.zzav(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.zzu
    public final void onLocationResult(com.google.android.gms.location.LocationResult locationResult) {
        this.zzda.notifyListener(new com.google.android.gms.internal.location.zzau(this, locationResult));
    }

    public final synchronized void release() {
        this.zzda.clear();
    }
}
