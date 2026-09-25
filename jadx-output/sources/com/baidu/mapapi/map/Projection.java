package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class Projection {
    private com.baidu.mapsdkplatform.comapi.map.e a;

    Projection(com.baidu.mapsdkplatform.comapi.map.e eVar) {
        this.a = eVar;
    }

    public com.baidu.mapapi.model.LatLng fromScreenLocation(android.graphics.Point point) {
        com.baidu.mapsdkplatform.comapi.map.e eVar;
        if (point == null || (eVar = this.a) == null) {
            return null;
        }
        return com.baidu.mapapi.model.CoordUtil.mc2ll(eVar.b(point.x, point.y));
    }

    public float metersToEquatorPixels(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        return (float) (((double) f) / this.a.K());
    }

    public android.graphics.PointF toOpenGLLocation(com.baidu.mapapi.model.LatLng latLng, com.baidu.mapapi.map.MapStatus mapStatus) {
        if (latLng == null || mapStatus == null) {
            return null;
        }
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(latLng);
        com.baidu.mapsdkplatform.comapi.map.ad adVar = mapStatus.a;
        return new android.graphics.PointF((float) (geoPointLl2mc.getLongitudeE6() - adVar.d), (float) (geoPointLl2mc.getLatitudeE6() - adVar.e));
    }

    public android.graphics.PointF toOpenGLNormalization(com.baidu.mapapi.model.LatLng latLng, com.baidu.mapapi.map.MapStatus mapStatus) {
        if (latLng == null || mapStatus == null) {
            return null;
        }
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(latLng);
        com.baidu.mapsdkplatform.comapi.map.ad.a aVar = mapStatus.a.k;
        return new android.graphics.PointF((float) ((((geoPointLl2mc.getLongitudeE6() - aVar.a) * 2.0d) / java.lang.Math.abs(aVar.b - aVar.a)) - 1.0d), (float) ((((geoPointLl2mc.getLatitudeE6() - aVar.d) * 2.0d) / java.lang.Math.abs(aVar.c - aVar.d)) - 1.0d));
    }

    public android.graphics.Point toScreenLocation(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null || this.a == null) {
            return null;
        }
        return this.a.a(com.baidu.mapapi.model.CoordUtil.ll2mc(latLng));
    }
}
