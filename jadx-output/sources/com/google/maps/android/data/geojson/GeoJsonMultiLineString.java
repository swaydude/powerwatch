package com.google.maps.android.data.geojson;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonMultiLineString extends com.google.maps.android.data.MultiGeometry {
    public GeoJsonMultiLineString(java.util.List<com.google.maps.android.data.geojson.GeoJsonLineString> list) {
        super(list);
        setGeometryType("MultiLineString");
    }

    public java.lang.String getType() {
        return getGeometryType();
    }

    public java.util.List<com.google.maps.android.data.geojson.GeoJsonLineString> getLineStrings() {
        java.util.List geometryObject = getGeometryObject();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = geometryObject.iterator();
        while (it.hasNext()) {
            arrayList.add((com.google.maps.android.data.geojson.GeoJsonLineString) ((com.google.maps.android.data.Geometry) it.next()));
        }
        return arrayList;
    }
}
