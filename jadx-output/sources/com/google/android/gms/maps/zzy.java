package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzy extends com.google.android.gms.maps.internal.zzak {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMapClickListener zzag;

    zzy(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMapClickListener onMapClickListener) {
        this.zzag = onMapClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzaj
    public final void onMapClick(com.google.android.gms.maps.model.LatLng latLng) {
        this.zzag.onMapClick(latLng);
    }
}
