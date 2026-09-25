package com.google.maps.android.data;

/* JADX INFO: loaded from: classes2.dex */
public class MultiGeometry implements com.google.maps.android.data.Geometry {
    private java.lang.String geometryType = "MultiGeometry";
    private java.util.List<com.google.maps.android.data.Geometry> mGeometries;

    public MultiGeometry(java.util.List<? extends com.google.maps.android.data.Geometry> list) {
        if (list == null) {
            throw new java.lang.IllegalArgumentException("Geometries cannot be null");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<? extends com.google.maps.android.data.Geometry> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.mGeometries = arrayList;
    }

    @Override // com.google.maps.android.data.Geometry
    public java.lang.String getGeometryType() {
        return this.geometryType;
    }

    @Override // com.google.maps.android.data.Geometry
    public java.util.List<com.google.maps.android.data.Geometry> getGeometryObject() {
        return this.mGeometries;
    }

    public void setGeometryType(java.lang.String str) {
        this.geometryType = str;
    }

    public java.lang.String toString() {
        java.lang.String str = this.geometryType.equals("MultiPoint") ? "LineStrings=" : "Geometries=";
        if (this.geometryType.equals("MultiLineString")) {
            str = "points=";
        }
        if (this.geometryType.equals("MultiPolygon")) {
            str = "Polygons=";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(getGeometryType());
        sb.append("{");
        sb.append("\n " + str);
        sb.append(getGeometryObject());
        sb.append("\n}\n");
        return sb.toString();
    }
}
