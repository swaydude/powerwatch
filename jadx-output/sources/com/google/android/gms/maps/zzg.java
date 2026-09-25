package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzg extends com.google.android.gms.maps.internal.zzi {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.InfoWindowAdapter zzo;

    zzg(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.InfoWindowAdapter infoWindowAdapter) {
        this.zzo = infoWindowAdapter;
    }

    @Override // com.google.android.gms.maps.internal.zzh
    public final com.google.android.gms.dynamic.IObjectWrapper zzh(com.google.android.gms.internal.maps.zzt zztVar) {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzo.getInfoWindow(new com.google.android.gms.maps.model.Marker(zztVar)));
    }

    @Override // com.google.android.gms.maps.internal.zzh
    public final com.google.android.gms.dynamic.IObjectWrapper zzi(com.google.android.gms.internal.maps.zzt zztVar) {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzo.getInfoContents(new com.google.android.gms.maps.model.Marker(zztVar)));
    }
}
