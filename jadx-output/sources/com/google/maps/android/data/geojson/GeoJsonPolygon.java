package com.google.maps.android.data.geojson;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonPolygon implements com.google.maps.android.data.DataPolygon {
    private static final java.lang.String GEOMETRY_TYPE = "Polygon";
    private static final int POLYGON_INNER_COORDINATE_INDEX = 1;
    private static final int POLYGON_OUTER_COORDINATE_INDEX = 0;
    private final java.util.List<? extends java.util.List<com.google.android.gms.maps.model.LatLng>> mCoordinates;

    public java.lang.String getType() {
        return "Polygon";
    }

    public GeoJsonPolygon(java.util.List<? extends java.util.List<com.google.android.gms.maps.model.LatLng>> list) {
        if (list == null) {
            throw new java.lang.IllegalArgumentException("Coordinates cannot be null");
        }
        this.mCoordinates = list;
    }

    public java.util.List<? extends java.util.List<com.google.android.gms.maps.model.LatLng>> getCoordinates() {
        return this.mCoordinates;
    }

    @Override // com.google.maps.android.data.Geometry
    public java.util.List<? extends java.util.List<com.google.android.gms.maps.model.LatLng>> getGeometryObject() {
        return getCoordinates();
    }

    @Override // com.google.maps.android.data.Geometry
    public java.lang.String getGeometryType() {
        return getType();
    }

    @Override // com.google.maps.android.data.DataPolygon
    public java.util.ArrayList<com.google.android.gms.maps.model.LatLng> getOuterBoundaryCoordinates() {
        return (java.util.ArrayList) getCoordinates().get(0);
    }

    @Override // com.google.maps.android.data.DataPolygon
    public java.util.ArrayList<java.util.ArrayList<com.google.android.gms.maps.model.LatLng>> getInnerBoundaryCoordinates() {
        java.util.ArrayList<java.util.ArrayList<com.google.android.gms.maps.model.LatLng>> arrayList = new java.util.ArrayList<>();
        for (int i = 1; i < getCoordinates().size(); i++) {
            arrayList.add((java.util.ArrayList) getCoordinates().get(i));
        }
        return arrayList;
    }

    public java.lang.String toString() {
        return "Polygon{\n coordinates=" + this.mCoordinates + "\n}\n";
    }
}
