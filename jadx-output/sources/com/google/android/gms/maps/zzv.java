package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzv extends com.google.android.gms.maps.internal.zzs {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnCameraMoveListener zzad;

    zzv(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnCameraMoveListener onCameraMoveListener) {
        this.zzad = onCameraMoveListener;
    }

    @Override // com.google.android.gms.maps.internal.zzr
    public final void onCameraMove() {
        this.zzad.onCameraMove();
    }
}
