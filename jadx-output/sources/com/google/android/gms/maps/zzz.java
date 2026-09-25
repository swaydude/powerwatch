package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzz extends com.google.android.gms.maps.internal.zzao {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMapLongClickListener zzah;

    zzz(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        this.zzah = onMapLongClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzan
    public final void onMapLongClick(com.google.android.gms.maps.model.LatLng latLng) {
        this.zzah.onMapLongClick(latLng);
    }
}
