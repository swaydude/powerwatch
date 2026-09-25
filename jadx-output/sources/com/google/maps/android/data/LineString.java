package com.google.maps.android.data;

/* JADX INFO: loaded from: classes2.dex */
public class LineString implements com.google.maps.android.data.Geometry<java.util.List<com.google.android.gms.maps.model.LatLng>> {
    private static final java.lang.String GEOMETRY_TYPE = "LineString";
    private final java.util.List<com.google.android.gms.maps.model.LatLng> mCoordinates;

    @Override // com.google.maps.android.data.Geometry
    public java.lang.String getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public LineString(java.util.List<com.google.android.gms.maps.model.LatLng> list) {
        if (list == null) {
            throw new java.lang.IllegalArgumentException("Coordinates cannot be null");
        }
        this.mCoordinates = list;
    }

    @Override // com.google.maps.android.data.Geometry
    public java.util.List<com.google.android.gms.maps.model.LatLng> getGeometryObject() {
        return this.mCoordinates;
    }

    public java.lang.String toString() {
        return GEOMETRY_TYPE + "{\n coordinates=" + this.mCoordinates + "\n}\n";
    }
}
