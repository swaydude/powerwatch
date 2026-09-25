package com.google.maps.android.data.geojson;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonMultiPoint extends com.google.maps.android.data.MultiGeometry {
    public GeoJsonMultiPoint(java.util.List<com.google.maps.android.data.geojson.GeoJsonPoint> list) {
        super(list);
        setGeometryType("MultiPoint");
    }

    public java.lang.String getType() {
        return getGeometryType();
    }

    public java.util.List<com.google.maps.android.data.geojson.GeoJsonPoint> getPoints() {
        java.util.List geometryObject = getGeometryObject();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = geometryObject.iterator();
        while (it.hasNext()) {
            arrayList.add((com.google.maps.android.data.geojson.GeoJsonPoint) ((com.google.maps.android.data.Geometry) it.next()));
        }
        return arrayList;
    }
}
