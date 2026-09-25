package com.google.maps.android.data;

/* JADX INFO: loaded from: classes2.dex */
public interface DataPolygon<T> extends com.google.maps.android.data.Geometry {
    java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> getInnerBoundaryCoordinates();

    java.util.List<com.google.android.gms.maps.model.LatLng> getOuterBoundaryCoordinates();
}
