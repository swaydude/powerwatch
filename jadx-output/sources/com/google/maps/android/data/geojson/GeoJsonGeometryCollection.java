package com.google.maps.android.data.geojson;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonGeometryCollection extends com.google.maps.android.data.MultiGeometry {
    public GeoJsonGeometryCollection(java.util.List<com.google.maps.android.data.Geometry> list) {
        super(list);
        setGeometryType("GeometryCollection");
    }

    public java.lang.String getType() {
        return getGeometryType();
    }

    public java.util.List<com.google.maps.android.data.Geometry> getGeometries() {
        return getGeometryObject();
    }
}
