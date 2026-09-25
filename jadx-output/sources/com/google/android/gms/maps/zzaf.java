package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzaf extends com.google.android.gms.maps.internal.zzbm {
    private final /* synthetic */ com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener zzbr;

    zzaf(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama, com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener) {
        this.zzbr = onStreetViewPanoramaClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbl
    public final void onStreetViewPanoramaClick(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.zzbr.onStreetViewPanoramaClick(streetViewPanoramaOrientation);
    }
}
