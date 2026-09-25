package com.google.maps.android.data.kml;

/* JADX INFO: loaded from: classes2.dex */
public class KmlMultiGeometry extends com.google.maps.android.data.MultiGeometry {
    public KmlMultiGeometry(java.util.ArrayList<com.google.maps.android.data.Geometry> arrayList) {
        super(arrayList);
    }

    @Override // com.google.maps.android.data.MultiGeometry, com.google.maps.android.data.Geometry
    public java.util.ArrayList<com.google.maps.android.data.Geometry> getGeometryObject() {
        return new java.util.ArrayList<>(super.getGeometryObject());
    }

    @Override // com.google.maps.android.data.MultiGeometry
    public java.lang.String toString() {
        return getGeometryType() + "{\n geometries=" + getGeometryObject() + "\n}\n";
    }
}
