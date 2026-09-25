package com.google.maps.android.data.geojson;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonPoint extends com.google.maps.android.data.Point {
    public GeoJsonPoint(com.google.android.gms.maps.model.LatLng latLng) {
        super(latLng);
    }

    public java.lang.String getType() {
        return getGeometryType();
    }

    public com.google.android.gms.maps.model.LatLng getCoordinates() {
        return getGeometryObject();
    }
}
