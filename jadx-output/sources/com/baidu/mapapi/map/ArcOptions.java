package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class ArcOptions extends com.baidu.mapapi.map.OverlayOptions {
    private static final java.lang.String d = "ArcOptions";
    int a;
    android.os.Bundle c;
    private com.baidu.mapapi.model.LatLng g;
    private com.baidu.mapapi.model.LatLng h;
    private com.baidu.mapapi.model.LatLng i;
    private int e = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
    private int f = 5;
    boolean b = true;

    @Override // com.baidu.mapapi.map.OverlayOptions
    com.baidu.mapapi.map.Overlay a() {
        com.baidu.mapapi.map.Arc arc = new com.baidu.mapapi.map.Arc();
        arc.B = this.b;
        arc.A = this.a;
        arc.C = this.c;
        arc.a = this.e;
        arc.b = this.f;
        arc.c = this.g;
        arc.d = this.h;
        arc.e = this.i;
        return arc;
    }

    public com.baidu.mapapi.map.ArcOptions color(int i) {
        this.e = i;
        return this;
    }

    public com.baidu.mapapi.map.ArcOptions extraInfo(android.os.Bundle bundle) {
        this.c = bundle;
        return this;
    }

    public int getColor() {
        return this.e;
    }

    public com.baidu.mapapi.model.LatLng getEndPoint() {
        return this.i;
    }

    public android.os.Bundle getExtraInfo() {
        return this.c;
    }

    public com.baidu.mapapi.model.LatLng getMiddlePoint() {
        return this.h;
    }

    public com.baidu.mapapi.model.LatLng getStartPoint() {
        return this.g;
    }

    public int getWidth() {
        return this.f;
    }

    public int getZIndex() {
        return this.a;
    }

    public boolean isVisible() {
        return this.b;
    }

    public com.baidu.mapapi.map.ArcOptions points(com.baidu.mapapi.model.LatLng latLng, com.baidu.mapapi.model.LatLng latLng2, com.baidu.mapapi.model.LatLng latLng3) {
        if (latLng == null || latLng2 == null || latLng3 == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: start and middle and end points can not be null");
        }
        if (latLng == latLng2 || latLng == latLng3 || latLng2 == latLng3) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: start and middle and end points can not be same");
        }
        this.g = latLng;
        this.h = latLng2;
        this.i = latLng3;
        return this;
    }

    public com.baidu.mapapi.map.ArcOptions visible(boolean z) {
        this.b = z;
        return this;
    }

    public com.baidu.mapapi.map.ArcOptions width(int i) {
        if (i > 0) {
            this.f = i;
        }
        return this;
    }

    public com.baidu.mapapi.map.ArcOptions zIndex(int i) {
        this.a = i;
        return this;
    }
}
