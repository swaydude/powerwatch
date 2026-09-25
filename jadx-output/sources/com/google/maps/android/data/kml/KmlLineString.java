package com.google.maps.android.data.kml;

/* JADX INFO: loaded from: classes2.dex */
public class KmlLineString extends com.google.maps.android.data.LineString {
    public KmlLineString(java.util.ArrayList<com.google.android.gms.maps.model.LatLng> arrayList) {
        super(arrayList);
    }

    @Override // com.google.maps.android.data.LineString, com.google.maps.android.data.Geometry
    public java.util.List<com.google.android.gms.maps.model.LatLng> getGeometryObject() {
        return new java.util.ArrayList(super.getGeometryObject());
    }
}
