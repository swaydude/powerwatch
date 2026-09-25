package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class Dot extends com.baidu.mapapi.map.Overlay {
    com.baidu.mapapi.model.LatLng a;
    int b;
    int c;

    Dot() {
        this.type = com.baidu.mapsdkplatform.comapi.map.j.dot;
    }

    @Override // com.baidu.mapapi.map.Overlay
    android.os.Bundle a(android.os.Bundle bundle) {
        super.a(bundle);
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(this.a);
        bundle.putDouble("location_x", geoPointLl2mc.getLongitudeE6());
        bundle.putDouble("location_y", geoPointLl2mc.getLatitudeE6());
        bundle.putInt("radius", this.c);
        com.baidu.mapapi.map.Overlay.a(this.b, bundle);
        return bundle;
    }

    public com.baidu.mapapi.model.LatLng getCenter() {
        return this.a;
    }

    public int getColor() {
        return this.b;
    }

    public int getRadius() {
        return this.c;
    }

    public void setCenter(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: dot center can not be null");
        }
        this.a = latLng;
        this.listener.b(this);
    }

    public void setColor(int i) {
        this.b = i;
        this.listener.b(this);
    }

    public void setRadius(int i) {
        if (i > 0) {
            this.c = i;
            this.listener.b(this);
        }
    }
}
