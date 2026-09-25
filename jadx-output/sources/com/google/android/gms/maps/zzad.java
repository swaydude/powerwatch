package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzad extends com.google.android.gms.maps.internal.zzbk {
    private final /* synthetic */ com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener zzbp;

    zzad(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama, com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
        this.zzbp = onStreetViewPanoramaChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbj
    public final void onStreetViewPanoramaChange(com.google.android.gms.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation) {
        this.zzbp.onStreetViewPanoramaChange(streetViewPanoramaLocation);
    }
}
