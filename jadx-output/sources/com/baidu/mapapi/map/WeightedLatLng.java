package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class WeightedLatLng extends com.baidu.mapapi.map.p.a {
    public static final double DEFAULT_INTENSITY = 1.0d;
    private android.graphics.Point a;
    public final double intensity;
    public final com.baidu.mapapi.model.LatLng latLng;

    public WeightedLatLng(com.baidu.mapapi.model.LatLng latLng) {
        this(latLng, 1.0d);
    }

    public WeightedLatLng(com.baidu.mapapi.model.LatLng latLng, double d) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: latLng can not be null");
        }
        this.latLng = latLng;
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(latLng);
        this.a = new android.graphics.Point((int) geoPointLl2mc.getLongitudeE6(), (int) geoPointLl2mc.getLatitudeE6());
        if (d > 0.0d) {
            this.intensity = d;
        } else {
            this.intensity = 1.0d;
        }
    }

    @Override // com.baidu.mapapi.map.p.a
    android.graphics.Point a() {
        return this.a;
    }
}
