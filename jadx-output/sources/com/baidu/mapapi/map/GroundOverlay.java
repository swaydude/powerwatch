package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class GroundOverlay extends com.baidu.mapapi.map.Overlay {
    private static final java.lang.String j = "GroundOverlay";
    int a;
    com.baidu.mapapi.map.BitmapDescriptor b;
    com.baidu.mapapi.model.LatLng c;
    double d;
    double e;
    float f;
    float g;
    com.baidu.mapapi.model.LatLngBounds h;
    float i;

    GroundOverlay() {
        this.type = com.baidu.mapsdkplatform.comapi.map.j.ground;
    }

    @Override // com.baidu.mapapi.map.Overlay
    android.os.Bundle a(android.os.Bundle bundle) {
        super.a(bundle);
        bundle.putBundle("image_info", this.b.b());
        if (this.a == 1) {
            com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(this.h.southwest);
            double longitudeE6 = geoPointLl2mc.getLongitudeE6();
            double latitudeE6 = geoPointLl2mc.getLatitudeE6();
            com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc2 = com.baidu.mapapi.model.CoordUtil.ll2mc(this.h.northeast);
            double longitudeE7 = geoPointLl2mc2.getLongitudeE6();
            double latitudeE7 = geoPointLl2mc2.getLatitudeE6();
            double d = longitudeE7 - longitudeE6;
            this.d = d;
            double d2 = latitudeE7 - latitudeE6;
            this.e = d2;
            this.c = com.baidu.mapapi.model.CoordUtil.mc2ll(new com.baidu.mapapi.model.inner.GeoPoint(latitudeE6 + (d2 / 2.0d), longitudeE6 + (d / 2.0d)));
            this.f = 0.5f;
            this.g = 0.5f;
        }
        double d3 = this.d;
        if (d3 <= 0.0d || this.e <= 0.0d) {
            throw new java.lang.IllegalStateException("BDMapSDKException: when you add ground overlay, the width and height must greater than 0");
        }
        bundle.putDouble("x_distance", d3);
        if (this.e == 2.147483647E9d) {
            this.e = (int) ((this.d * ((double) this.b.a.getHeight())) / ((double) this.b.a.getWidth()));
        }
        bundle.putDouble("y_distance", this.e);
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc3 = com.baidu.mapapi.model.CoordUtil.ll2mc(this.c);
        bundle.putDouble("location_x", geoPointLl2mc3.getLongitudeE6());
        bundle.putDouble("location_y", geoPointLl2mc3.getLatitudeE6());
        bundle.putFloat("anchor_x", this.f);
        bundle.putFloat("anchor_y", this.g);
        bundle.putFloat("transparency", this.i);
        return bundle;
    }

    public float getAnchorX() {
        return this.f;
    }

    public float getAnchorY() {
        return this.g;
    }

    public com.baidu.mapapi.model.LatLngBounds getBounds() {
        return this.h;
    }

    public double getHeight() {
        return this.e;
    }

    public com.baidu.mapapi.map.BitmapDescriptor getImage() {
        return this.b;
    }

    public com.baidu.mapapi.model.LatLng getPosition() {
        return this.c;
    }

    public float getTransparency() {
        return this.i;
    }

    public double getWidth() {
        return this.d;
    }

    public void setAnchor(float f, float f2) {
        if (f < 0.0f || f > 1.0f || f2 < 0.0f || f2 > 1.0f) {
            return;
        }
        this.f = f;
        this.g = f2;
        this.listener.b(this);
    }

    public void setDimensions(int i) {
        this.d = i;
        this.e = 2.147483647E9d;
        this.listener.b(this);
    }

    public void setDimensions(int i, int i2) {
        this.d = i;
        this.e = i2;
        this.listener.b(this);
    }

    public void setImage(com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: image can not be null");
        }
        this.b = bitmapDescriptor;
        this.listener.b(this);
    }

    public void setPosition(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: position can not be null");
        }
        this.a = 2;
        this.c = latLng;
        this.listener.b(this);
    }

    public void setPositionFromBounds(com.baidu.mapapi.model.LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: bounds can not be null");
        }
        this.a = 1;
        this.h = latLngBounds;
        this.listener.b(this);
    }

    public void setTransparency(float f) {
        if (f > 1.0f || f < 0.0f) {
            return;
        }
        this.i = f;
        this.listener.b(this);
    }
}
