package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzx extends com.google.android.gms.maps.internal.zzo {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnCameraIdleListener zzaf;

    zzx(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnCameraIdleListener onCameraIdleListener) {
        this.zzaf = onCameraIdleListener;
    }

    @Override // com.google.android.gms.maps.internal.zzn
    public final void onCameraIdle() {
        this.zzaf.onCameraIdle();
    }
}
