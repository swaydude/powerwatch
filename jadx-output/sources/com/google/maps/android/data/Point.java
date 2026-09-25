package com.google.maps.android.data;

/* JADX INFO: loaded from: classes2.dex */
public class Point implements com.google.maps.android.data.Geometry {
    private static final java.lang.String GEOMETRY_TYPE = "Point";
    private final com.google.android.gms.maps.model.LatLng mCoordinates;

    @Override // com.google.maps.android.data.Geometry
    public java.lang.String getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public Point(com.google.android.gms.maps.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("Coordinates cannot be null");
        }
        this.mCoordinates = latLng;
    }

    @Override // com.google.maps.android.data.Geometry
    public com.google.android.gms.maps.model.LatLng getGeometryObject() {
        return this.mCoordinates;
    }

    public java.lang.String toString() {
        return GEOMETRY_TYPE + "{\n coordinates=" + this.mCoordinates + "\n}\n";
    }
}
