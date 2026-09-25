package com.google.maps.android.heatmaps;

/* JADX INFO: loaded from: classes2.dex */
public class WeightedLatLng implements com.google.maps.android.quadtree.PointQuadTree.Item {
    public static final double DEFAULT_INTENSITY = 1.0d;
    private static final com.google.maps.android.projection.SphericalMercatorProjection sProjection = new com.google.maps.android.projection.SphericalMercatorProjection(1.0d);
    private double mIntensity;
    private com.google.maps.android.geometry.Point mPoint;

    public WeightedLatLng(com.google.android.gms.maps.model.LatLng latLng, double d) {
        this.mPoint = sProjection.toPoint(latLng);
        if (d >= 0.0d) {
            this.mIntensity = d;
        } else {
            this.mIntensity = 1.0d;
        }
    }

    public WeightedLatLng(com.google.android.gms.maps.model.LatLng latLng) {
        this(latLng, 1.0d);
    }

    @Override // com.google.maps.android.quadtree.PointQuadTree.Item
    public com.google.maps.android.geometry.Point getPoint() {
        return this.mPoint;
    }

    public double getIntensity() {
        return this.mIntensity;
    }
}
