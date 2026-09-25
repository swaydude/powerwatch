package com.google.maps.android.projection;

/* JADX INFO: loaded from: classes2.dex */
public class SphericalMercatorProjection {
    final double mWorldWidth;

    public SphericalMercatorProjection(double d) {
        this.mWorldWidth = d;
    }

    public com.google.maps.android.projection.Point toPoint(com.google.android.gms.maps.model.LatLng latLng) {
        double d = (latLng.longitude / 360.0d) + 0.5d;
        double dSin = java.lang.Math.sin(java.lang.Math.toRadians(latLng.latitude));
        double dLog = ((java.lang.Math.log((dSin + 1.0d) / (1.0d - dSin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d2 = this.mWorldWidth;
        return new com.google.maps.android.projection.Point(d * d2, dLog * d2);
    }

    public com.google.android.gms.maps.model.LatLng toLatLng(com.google.maps.android.geometry.Point point) {
        return new com.google.android.gms.maps.model.LatLng(90.0d - java.lang.Math.toDegrees(java.lang.Math.atan(java.lang.Math.exp(((-(0.5d - (point.y / this.mWorldWidth))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((point.x / this.mWorldWidth) - 0.5d) * 360.0d);
    }
}
