package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzag extends com.google.android.gms.maps.internal.zzbo {
    private final /* synthetic */ com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener zzbs;

    zzag(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama, com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener) {
        this.zzbs = onStreetViewPanoramaLongClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbn
    public final void onStreetViewPanoramaLongClick(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.zzbs.onStreetViewPanoramaLongClick(streetViewPanoramaOrientation);
    }
}
