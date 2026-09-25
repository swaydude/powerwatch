package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class DotOptions extends com.baidu.mapapi.map.OverlayOptions {
    int a;
    android.os.Bundle c;
    private com.baidu.mapapi.model.LatLng d;
    private int e = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
    private int f = 5;
    boolean b = true;

    @Override // com.baidu.mapapi.map.OverlayOptions
    com.baidu.mapapi.map.Overlay a() {
        com.baidu.mapapi.map.Dot dot = new com.baidu.mapapi.map.Dot();
        dot.B = this.b;
        dot.A = this.a;
        dot.C = this.c;
        dot.b = this.e;
        dot.a = this.d;
        dot.c = this.f;
        return dot;
    }

    public com.baidu.mapapi.map.DotOptions center(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: dot center can not be null");
        }
        this.d = latLng;
        return this;
    }

    public com.baidu.mapapi.map.DotOptions color(int i) {
        this.e = i;
        return this;
    }

    public com.baidu.mapapi.map.DotOptions extraInfo(android.os.Bundle bundle) {
        this.c = bundle;
        return this;
    }

    public com.baidu.mapapi.model.LatLng getCenter() {
        return this.d;
    }

    public int getColor() {
        return this.e;
    }

    public android.os.Bundle getExtraInfo() {
        return this.c;
    }

    public int getRadius() {
        return this.f;
    }

    public int getZIndex() {
        return this.a;
    }

    public boolean isVisible() {
        return this.b;
    }

    public com.baidu.mapapi.map.DotOptions radius(int i) {
        if (i > 0) {
            this.f = i;
        }
        return this;
    }

    public com.baidu.mapapi.map.DotOptions visible(boolean z) {
        this.b = z;
        return this;
    }

    public com.baidu.mapapi.map.DotOptions zIndex(int i) {
        this.a = i;
        return this;
    }
}
