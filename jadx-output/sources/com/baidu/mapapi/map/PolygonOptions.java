package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class PolygonOptions extends com.baidu.mapapi.map.OverlayOptions {
    int a;
    android.os.Bundle c;
    private com.baidu.mapapi.map.Stroke d;
    private java.util.List<com.baidu.mapapi.model.LatLng> f;
    private java.util.List<com.baidu.mapapi.map.HoleOptions> g;
    private com.baidu.mapapi.map.HoleOptions h;
    private int e = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
    boolean b = true;

    @Override // com.baidu.mapapi.map.OverlayOptions
    com.baidu.mapapi.map.Overlay a() {
        com.baidu.mapapi.map.Polygon polygon = new com.baidu.mapapi.map.Polygon();
        polygon.B = this.b;
        polygon.A = this.a;
        polygon.C = this.c;
        java.util.List<com.baidu.mapapi.model.LatLng> list = this.f;
        if (list == null || list.size() < 2) {
            throw new java.lang.IllegalStateException("BDMapSDKException: when you add polyline, you must at least supply 2 points");
        }
        polygon.c = this.f;
        polygon.b = this.e;
        polygon.a = this.d;
        polygon.d = this.g;
        polygon.e = this.h;
        return polygon;
    }

    public com.baidu.mapapi.map.PolygonOptions addHoleOption(com.baidu.mapapi.map.HoleOptions holeOptions) {
        this.h = holeOptions;
        return this;
    }

    public com.baidu.mapapi.map.PolygonOptions addHoleOptions(java.util.List<com.baidu.mapapi.map.HoleOptions> list) {
        this.g = list;
        return this;
    }

    public com.baidu.mapapi.map.PolygonOptions extraInfo(android.os.Bundle bundle) {
        this.c = bundle;
        return this;
    }

    public com.baidu.mapapi.map.PolygonOptions fillColor(int i) {
        this.e = i;
        return this;
    }

    public android.os.Bundle getExtraInfo() {
        return this.c;
    }

    public int getFillColor() {
        return this.e;
    }

    public java.util.List<com.baidu.mapapi.model.LatLng> getPoints() {
        return this.f;
    }

    public com.baidu.mapapi.map.Stroke getStroke() {
        return this.d;
    }

    public int getZIndex() {
        return this.a;
    }

    public boolean isVisible() {
        return this.b;
    }

    public com.baidu.mapapi.map.PolygonOptions points(java.util.List<com.baidu.mapapi.model.LatLng> list) {
        if (list == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: points list can not be null");
        }
        if (list.size() <= 2) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: points count can not less than three");
        }
        if (list.contains(null)) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: points list can not contains null");
        }
        int i = 0;
        while (i < list.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < list.size(); i3++) {
                if (list.get(i) == list.get(i3)) {
                    throw new java.lang.IllegalArgumentException("BDMapSDKException: points list can not has same points");
                }
            }
            i = i2;
        }
        this.f = list;
        return this;
    }

    public com.baidu.mapapi.map.PolygonOptions stroke(com.baidu.mapapi.map.Stroke stroke) {
        this.d = stroke;
        return this;
    }

    public com.baidu.mapapi.map.PolygonOptions visible(boolean z) {
        this.b = z;
        return this;
    }

    public com.baidu.mapapi.map.PolygonOptions zIndex(int i) {
        this.a = i;
        return this;
    }
}
