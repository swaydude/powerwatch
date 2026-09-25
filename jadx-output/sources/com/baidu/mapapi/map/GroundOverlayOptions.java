package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class GroundOverlayOptions extends com.baidu.mapapi.map.OverlayOptions {
    int a;
    android.os.Bundle c;
    private com.baidu.mapapi.map.BitmapDescriptor d;
    private com.baidu.mapapi.model.LatLng e;
    private int f;
    private int g;
    private com.baidu.mapapi.model.LatLngBounds j;
    private float h = 0.5f;
    private float i = 0.5f;
    private float k = 1.0f;
    boolean b = true;

    @Override // com.baidu.mapapi.map.OverlayOptions
    com.baidu.mapapi.map.Overlay a() {
        int i;
        com.baidu.mapapi.model.LatLng latLng;
        com.baidu.mapapi.map.GroundOverlay groundOverlay = new com.baidu.mapapi.map.GroundOverlay();
        groundOverlay.B = this.b;
        groundOverlay.A = this.a;
        groundOverlay.C = this.c;
        com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptor = this.d;
        if (bitmapDescriptor == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: when you add ground overlay, you must set the image");
        }
        groundOverlay.b = bitmapDescriptor;
        com.baidu.mapapi.model.LatLngBounds latLngBounds = this.j;
        if (latLngBounds != null || (latLng = this.e) == null) {
            if (this.e != null || latLngBounds == null) {
                throw new java.lang.IllegalStateException("BDMapSDKException: when you add ground overlay, you must set one of position or bounds");
            }
            groundOverlay.h = latLngBounds;
            i = 1;
        } else {
            if (this.f <= 0 || this.g <= 0) {
                throw new java.lang.IllegalArgumentException("BDMapSDKException: when you add ground overlay, the width and height must greater than 0");
            }
            groundOverlay.c = latLng;
            groundOverlay.f = this.h;
            groundOverlay.g = this.i;
            groundOverlay.d = this.f;
            groundOverlay.e = this.g;
            i = 2;
        }
        groundOverlay.a = i;
        groundOverlay.i = this.k;
        return groundOverlay;
    }

    public com.baidu.mapapi.map.GroundOverlayOptions anchor(float f, float f2) {
        if (f >= 0.0f && f <= 1.0f && f2 >= 0.0f && f2 <= 1.0f) {
            this.h = f;
            this.i = f2;
        }
        return this;
    }

    public com.baidu.mapapi.map.GroundOverlayOptions dimensions(int i) {
        this.f = i;
        this.g = Integer.MAX_VALUE;
        return this;
    }

    public com.baidu.mapapi.map.GroundOverlayOptions dimensions(int i, int i2) {
        this.f = i;
        this.g = i2;
        return this;
    }

    public com.baidu.mapapi.map.GroundOverlayOptions extraInfo(android.os.Bundle bundle) {
        this.c = bundle;
        return this;
    }

    public float getAnchorX() {
        return this.h;
    }

    public float getAnchorY() {
        return this.i;
    }

    public com.baidu.mapapi.model.LatLngBounds getBounds() {
        return this.j;
    }

    public android.os.Bundle getExtraInfo() {
        return this.c;
    }

    public int getHeight() {
        int i = this.g;
        return i == Integer.MAX_VALUE ? (int) ((this.f * this.d.a.getHeight()) / this.d.a.getWidth()) : i;
    }

    public com.baidu.mapapi.map.BitmapDescriptor getImage() {
        return this.d;
    }

    public com.baidu.mapapi.model.LatLng getPosition() {
        return this.e;
    }

    public float getTransparency() {
        return this.k;
    }

    public int getWidth() {
        return this.f;
    }

    public int getZIndex() {
        return this.a;
    }

    public com.baidu.mapapi.map.GroundOverlayOptions image(com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: image can not be null");
        }
        this.d = bitmapDescriptor;
        return this;
    }

    public boolean isVisible() {
        return this.b;
    }

    public com.baidu.mapapi.map.GroundOverlayOptions position(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: position can not be null");
        }
        this.e = latLng;
        return this;
    }

    public com.baidu.mapapi.map.GroundOverlayOptions positionFromBounds(com.baidu.mapapi.model.LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: bounds can not be null");
        }
        this.j = latLngBounds;
        return this;
    }

    public com.baidu.mapapi.map.GroundOverlayOptions transparency(float f) {
        if (f <= 1.0f && f >= 0.0f) {
            this.k = f;
        }
        return this;
    }

    public com.baidu.mapapi.map.GroundOverlayOptions visible(boolean z) {
        this.b = z;
        return this;
    }

    public com.baidu.mapapi.map.GroundOverlayOptions zIndex(int i) {
        this.a = i;
        return this;
    }
}
