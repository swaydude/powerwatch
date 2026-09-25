package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class MarkerOptions extends com.baidu.mapapi.map.OverlayOptions {
    int a;
    android.os.Bundle c;
    private com.baidu.mapapi.model.LatLng d;
    private com.baidu.mapapi.map.BitmapDescriptor e;
    private float j;
    private java.lang.String k;
    private int l;
    private java.util.ArrayList<com.baidu.mapapi.map.BitmapDescriptor> n;
    private android.graphics.Point u;
    private com.baidu.mapapi.map.InfoWindow w;
    private float f = 0.5f;
    private float g = 1.0f;
    private boolean h = true;
    private boolean i = false;
    private boolean m = false;
    private int o = 20;
    private float p = 1.0f;
    private float q = 1.0f;
    private float r = 1.0f;
    private int s = com.baidu.mapapi.map.MarkerOptions.MarkerAnimateType.none.ordinal();
    private boolean t = false;
    private boolean v = true;
    boolean b = true;

    public enum MarkerAnimateType {
        none,
        drop,
        grow,
        jump
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    com.baidu.mapapi.map.Overlay a() {
        com.baidu.mapapi.map.Marker marker = new com.baidu.mapapi.map.Marker();
        marker.B = this.b;
        marker.A = this.a;
        marker.C = this.c;
        com.baidu.mapapi.model.LatLng latLng = this.d;
        if (latLng == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: when you add marker, you must set the position");
        }
        marker.a = latLng;
        com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptor = this.e;
        if (bitmapDescriptor == null && this.n == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: when you add marker, you must set the icon or icons");
        }
        marker.b = bitmapDescriptor;
        marker.c = this.f;
        marker.d = this.g;
        marker.e = this.h;
        marker.f = this.i;
        marker.g = this.j;
        marker.h = this.k;
        marker.i = this.l;
        marker.j = this.m;
        marker.p = this.n;
        marker.q = this.o;
        marker.l = this.r;
        marker.s = this.p;
        marker.t = this.q;
        marker.m = this.s;
        marker.n = this.t;
        marker.w = this.w;
        marker.o = this.v;
        android.graphics.Point point = this.u;
        if (point != null) {
            marker.v = point;
        }
        return marker;
    }

    public com.baidu.mapapi.map.MarkerOptions alpha(float f) {
        if (f < 0.0f || f > 1.0f) {
            this.r = 1.0f;
            return this;
        }
        this.r = f;
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions anchor(float f, float f2) {
        if (f >= 0.0f && f <= 1.0f && f2 >= 0.0f && f2 <= 1.0f) {
            this.f = f;
            this.g = f2;
        }
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions animateType(com.baidu.mapapi.map.MarkerOptions.MarkerAnimateType markerAnimateType) {
        if (markerAnimateType == null) {
            markerAnimateType = com.baidu.mapapi.map.MarkerOptions.MarkerAnimateType.none;
        }
        this.s = markerAnimateType.ordinal();
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions clickable(boolean z) {
        this.v = z;
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions draggable(boolean z) {
        this.i = z;
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions extraInfo(android.os.Bundle bundle) {
        this.c = bundle;
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions fixedScreenPosition(android.graphics.Point point) {
        this.u = point;
        this.t = true;
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions flat(boolean z) {
        this.m = z;
        return this;
    }

    public float getAlpha() {
        return this.r;
    }

    public float getAnchorX() {
        return this.f;
    }

    public float getAnchorY() {
        return this.g;
    }

    public com.baidu.mapapi.map.MarkerOptions.MarkerAnimateType getAnimateType() {
        int i = this.s;
        if (i == 1) {
            return com.baidu.mapapi.map.MarkerOptions.MarkerAnimateType.drop;
        }
        if (i != 2) {
            return i != 3 ? com.baidu.mapapi.map.MarkerOptions.MarkerAnimateType.none : com.baidu.mapapi.map.MarkerOptions.MarkerAnimateType.jump;
        }
        return com.baidu.mapapi.map.MarkerOptions.MarkerAnimateType.grow;
    }

    public android.os.Bundle getExtraInfo() {
        return this.c;
    }

    public com.baidu.mapapi.map.BitmapDescriptor getIcon() {
        return this.e;
    }

    public java.util.ArrayList<com.baidu.mapapi.map.BitmapDescriptor> getIcons() {
        return this.n;
    }

    public int getPeriod() {
        return this.o;
    }

    public com.baidu.mapapi.model.LatLng getPosition() {
        return this.d;
    }

    public float getRotate() {
        return this.j;
    }

    @java.lang.Deprecated
    public java.lang.String getTitle() {
        return this.k;
    }

    public int getZIndex() {
        return this.a;
    }

    public com.baidu.mapapi.map.MarkerOptions icon(com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: marker's icon can not be null");
        }
        this.e = bitmapDescriptor;
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions icons(java.util.ArrayList<com.baidu.mapapi.map.BitmapDescriptor> arrayList) {
        if (arrayList == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: marker's icons can not be null");
        }
        if (arrayList.size() == 0) {
            return this;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == null || arrayList.get(i).a == null) {
                return this;
            }
        }
        this.n = arrayList;
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions infoWindow(com.baidu.mapapi.map.InfoWindow infoWindow) {
        this.w = infoWindow;
        return this;
    }

    public boolean isDraggable() {
        return this.i;
    }

    public boolean isFlat() {
        return this.m;
    }

    public boolean isPerspective() {
        return this.h;
    }

    public boolean isVisible() {
        return this.b;
    }

    public com.baidu.mapapi.map.MarkerOptions period(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: marker's period must be greater than zero ");
        }
        this.o = i;
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions perspective(boolean z) {
        this.h = z;
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions position(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: marker's position can not be null");
        }
        this.d = latLng;
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions rotate(float f) {
        while (f < 0.0f) {
            f += 360.0f;
        }
        this.j = f % 360.0f;
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions scaleX(float f) {
        if (f < 0.0f) {
            return this;
        }
        this.p = f;
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions scaleY(float f) {
        if (f < 0.0f) {
            return this;
        }
        this.q = f;
        return this;
    }

    @java.lang.Deprecated
    public com.baidu.mapapi.map.MarkerOptions title(java.lang.String str) {
        this.k = str;
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions visible(boolean z) {
        this.b = z;
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions yOffset(int i) {
        this.l = i;
        return this;
    }

    public com.baidu.mapapi.map.MarkerOptions zIndex(int i) {
        this.a = i;
        return this;
    }
}
