package com.google.maps.android.data.geojson;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonMultiPolygon extends com.google.maps.android.data.MultiGeometry {
    public GeoJsonMultiPolygon(java.util.List<com.google.maps.android.data.geojson.GeoJsonPolygon> list) {
        super(list);
        setGeometryType("MultiPolygon");
    }

    public java.lang.String getType() {
        return getGeometryType();
    }

    public java.util.List<com.google.maps.android.data.geojson.GeoJsonPolygon> getPolygons() {
        java.util.List geometryObject = getGeometryObject();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = geometryObject.iterator();
        while (it.hasNext()) {
            arrayList.add((com.google.maps.android.data.geojson.GeoJsonPolygon) ((com.google.maps.android.data.Geometry) it.next()));
        }
        return arrayList;
    }
}
