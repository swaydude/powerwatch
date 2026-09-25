package com.google.maps.android.data.geojson;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonLineString extends com.google.maps.android.data.LineString {
    public GeoJsonLineString(java.util.List<com.google.android.gms.maps.model.LatLng> list) {
        super(list);
    }

    public java.lang.String getType() {
        return getGeometryType();
    }

    public java.util.List<com.google.android.gms.maps.model.LatLng> getCoordinates() {
        return getGeometryObject();
    }
}
