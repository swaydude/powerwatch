package com.google.maps.android.data.kml;

/* JADX INFO: loaded from: classes2.dex */
public class KmlPolygon implements com.google.maps.android.data.DataPolygon<java.util.ArrayList<java.util.ArrayList<com.google.android.gms.maps.model.LatLng>>> {
    public static final java.lang.String GEOMETRY_TYPE = "Polygon";
    private final java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> mInnerBoundaryCoordinates;
    private final java.util.List<com.google.android.gms.maps.model.LatLng> mOuterBoundaryCoordinates;

    @Override // com.google.maps.android.data.Geometry
    public java.lang.String getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public KmlPolygon(java.util.List<com.google.android.gms.maps.model.LatLng> list, java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> list2) {
        if (list == null) {
            throw new java.lang.IllegalArgumentException("Outer boundary coordinates cannot be null");
        }
        this.mOuterBoundaryCoordinates = list;
        this.mInnerBoundaryCoordinates = list2;
    }

    @Override // com.google.maps.android.data.Geometry
    public java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> getGeometryObject() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.mOuterBoundaryCoordinates);
        java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> list = this.mInnerBoundaryCoordinates;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @Override // com.google.maps.android.data.DataPolygon
    public java.util.List<com.google.android.gms.maps.model.LatLng> getOuterBoundaryCoordinates() {
        return this.mOuterBoundaryCoordinates;
    }

    @Override // com.google.maps.android.data.DataPolygon
    public java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> getInnerBoundaryCoordinates() {
        return this.mInnerBoundaryCoordinates;
    }

    public java.lang.String toString() {
        return GEOMETRY_TYPE + "{\n outer coordinates=" + this.mOuterBoundaryCoordinates + ",\n inner coordinates=" + this.mInnerBoundaryCoordinates + "\n}\n";
    }
}
