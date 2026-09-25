package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzae extends com.google.android.gms.maps.internal.zzbi {
    private final /* synthetic */ com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener zzbq;

    zzae(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama, com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener) {
        this.zzbq = onStreetViewPanoramaCameraChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbh
    public final void onStreetViewPanoramaCameraChange(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.zzbq.onStreetViewPanoramaCameraChange(streetViewPanoramaCamera);
    }
}
