package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzu extends com.google.android.gms.maps.internal.zzu {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener zzac;

    zzu(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.zzac = onCameraMoveStartedListener;
    }

    @Override // com.google.android.gms.maps.internal.zzt
    public final void onCameraMoveStarted(int i) {
        this.zzac.onCameraMoveStarted(i);
    }
}
