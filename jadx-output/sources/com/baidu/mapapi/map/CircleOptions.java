package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class CircleOptions extends com.baidu.mapapi.map.OverlayOptions {
    private static final java.lang.String d = "CircleOptions";
    int a;
    android.os.Bundle c;
    private com.baidu.mapapi.model.LatLng e;
    private int g;
    private com.baidu.mapapi.map.Stroke h;
    private java.util.List<com.baidu.mapapi.map.HoleOptions> k;
    private com.baidu.mapapi.map.HoleOptions l;
    private int f = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
    private boolean i = false;
    private int j = 0;
    boolean b = true;

    @Override // com.baidu.mapapi.map.OverlayOptions
    com.baidu.mapapi.map.Overlay a() {
        com.baidu.mapapi.map.Circle circle = new com.baidu.mapapi.map.Circle();
        circle.B = this.b;
        circle.A = this.a;
        circle.C = this.c;
        circle.b = this.f;
        circle.a = this.e;
        circle.c = this.g;
        circle.d = this.h;
        circle.e = this.i;
        circle.f = this.j;
        circle.g = this.k;
        circle.h = this.l;
        return circle;
    }

    public com.baidu.mapapi.map.CircleOptions addHoleOption(com.baidu.mapapi.map.HoleOptions holeOptions) {
        this.l = holeOptions;
        return this;
    }

    public com.baidu.mapapi.map.CircleOptions addHoleOptions(java.util.List<com.baidu.mapapi.map.HoleOptions> list) {
        this.k = list;
        return this;
    }

    public com.baidu.mapapi.map.CircleOptions center(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: circle center can not be null");
        }
        this.e = latLng;
        return this;
    }

    public com.baidu.mapapi.map.CircleOptions dottedStroke(boolean z) {
        this.i = z;
        return this;
    }

    public com.baidu.mapapi.map.CircleOptions dottedStrokeType(com.baidu.mapapi.map.CircleDottedStrokeType circleDottedStrokeType) {
        this.j = circleDottedStrokeType.ordinal();
        return this;
    }

    public com.baidu.mapapi.map.CircleOptions extraInfo(android.os.Bundle bundle) {
        this.c = bundle;
        return this;
    }

    public com.baidu.mapapi.map.CircleOptions fillColor(int i) {
        this.f = i;
        return this;
    }

    public com.baidu.mapapi.model.LatLng getCenter() {
        return this.e;
    }

    public android.os.Bundle getExtraInfo() {
        return this.c;
    }

    public int getFillColor() {
        return this.f;
    }

    public int getRadius() {
        return this.g;
    }

    public com.baidu.mapapi.map.Stroke getStroke() {
        return this.h;
    }

    public int getZIndex() {
        return this.a;
    }

    public boolean isVisible() {
        return this.b;
    }

    public com.baidu.mapapi.map.CircleOptions radius(int i) {
        this.g = i;
        return this;
    }

    public com.baidu.mapapi.map.CircleOptions stroke(com.baidu.mapapi.map.Stroke stroke) {
        this.h = stroke;
        return this;
    }

    public com.baidu.mapapi.map.CircleOptions visible(boolean z) {
        this.b = z;
        return this;
    }

    public com.baidu.mapapi.map.CircleOptions zIndex(int i) {
        this.a = i;
        return this;
    }
}
