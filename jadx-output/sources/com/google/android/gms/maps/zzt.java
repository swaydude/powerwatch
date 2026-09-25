package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzt extends com.google.android.gms.maps.internal.zzm {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnCameraChangeListener zzab;

    zzt(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnCameraChangeListener onCameraChangeListener) {
        this.zzab = onCameraChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzl
    public final void onCameraChange(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
        this.zzab.onCameraChange(cameraPosition);
    }
}
