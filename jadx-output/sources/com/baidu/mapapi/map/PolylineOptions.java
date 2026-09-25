package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class PolylineOptions extends com.baidu.mapapi.map.OverlayOptions {
    int a;
    android.os.Bundle c;
    private java.util.List<com.baidu.mapapi.model.LatLng> e;
    private java.util.List<java.lang.Integer> f;
    private java.util.List<java.lang.Integer> g;
    private com.baidu.mapapi.map.BitmapDescriptor i;
    private java.util.List<com.baidu.mapapi.map.BitmapDescriptor> j;
    private int d = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
    private int h = 5;
    private boolean k = true;
    private boolean l = false;
    boolean b = true;
    private boolean m = false;
    private boolean n = true;
    private int o = 0;

    @Override // com.baidu.mapapi.map.OverlayOptions
    com.baidu.mapapi.map.Overlay a() {
        com.baidu.mapapi.map.Polyline polyline = new com.baidu.mapapi.map.Polyline();
        polyline.B = this.b;
        polyline.f = this.m;
        polyline.A = this.a;
        polyline.C = this.c;
        java.util.List<com.baidu.mapapi.model.LatLng> list = this.e;
        if (list == null || list.size() < 2) {
            throw new java.lang.IllegalStateException("BDMapSDKException: when you add polyline, you must at least supply 2 points");
        }
        polyline.b = this.e;
        polyline.a = this.d;
        polyline.e = this.h;
        polyline.j = this.i;
        polyline.k = this.j;
        polyline.g = this.k;
        polyline.h = this.l;
        polyline.i = this.n;
        polyline.l = this.o;
        java.util.List<java.lang.Integer> list2 = this.f;
        if (list2 != null && list2.size() < this.e.size() - 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList((this.e.size() - 1) - this.f.size());
            java.util.List<java.lang.Integer> list3 = this.f;
            list3.addAll(list3.size(), arrayList);
        }
        java.util.List<java.lang.Integer> list4 = this.f;
        int i = 0;
        if (list4 != null && list4.size() > 0) {
            int[] iArr = new int[this.f.size()];
            java.util.Iterator<java.lang.Integer> it = this.f.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                iArr[i2] = it.next().intValue();
                i2++;
            }
            polyline.c = iArr;
        }
        java.util.List<java.lang.Integer> list5 = this.g;
        if (list5 != null && list5.size() < this.e.size() - 1) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList((this.e.size() - 1) - this.g.size());
            java.util.List<java.lang.Integer> list6 = this.g;
            list6.addAll(list6.size(), arrayList2);
        }
        java.util.List<java.lang.Integer> list7 = this.g;
        if (list7 != null && list7.size() > 0) {
            int[] iArr2 = new int[this.g.size()];
            java.util.Iterator<java.lang.Integer> it2 = this.g.iterator();
            while (it2.hasNext()) {
                iArr2[i] = it2.next().intValue();
                i++;
            }
            polyline.d = iArr2;
        }
        return polyline;
    }

    public com.baidu.mapapi.map.PolylineOptions clickable(boolean z) {
        this.n = z;
        return this;
    }

    public com.baidu.mapapi.map.PolylineOptions color(int i) {
        this.d = i;
        return this;
    }

    public com.baidu.mapapi.map.PolylineOptions colorsValues(java.util.List<java.lang.Integer> list) {
        if (list == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: colors list can not be null");
        }
        if (list.contains(null)) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: colors list can not contains null");
        }
        this.g = list;
        return this;
    }

    public com.baidu.mapapi.map.PolylineOptions customTexture(com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptor) {
        this.i = bitmapDescriptor;
        return this;
    }

    public com.baidu.mapapi.map.PolylineOptions customTextureList(java.util.List<com.baidu.mapapi.map.BitmapDescriptor> list) {
        if (list == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: customTexture list can not be null");
        }
        if (list.size() == 0) {
            android.util.Log.e("baidumapsdk", "custom texture list is empty,the texture will not work");
        }
        java.util.Iterator<com.baidu.mapapi.map.BitmapDescriptor> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                android.util.Log.e("baidumapsdk", "the custom texture item is null,it will be discard");
            }
        }
        this.j = list;
        return this;
    }

    public com.baidu.mapapi.map.PolylineOptions dottedLine(boolean z) {
        this.m = z;
        return this;
    }

    public com.baidu.mapapi.map.PolylineOptions dottedLineType(com.baidu.mapapi.map.PolylineDottedLineType polylineDottedLineType) {
        this.o = polylineDottedLineType.ordinal();
        return this;
    }

    public com.baidu.mapapi.map.PolylineOptions extraInfo(android.os.Bundle bundle) {
        this.c = bundle;
        return this;
    }

    public com.baidu.mapapi.map.PolylineOptions focus(boolean z) {
        this.k = z;
        return this;
    }

    public int getColor() {
        return this.d;
    }

    public com.baidu.mapapi.map.BitmapDescriptor getCustomTexture() {
        return this.i;
    }

    public java.util.List<com.baidu.mapapi.map.BitmapDescriptor> getCustomTextureList() {
        return this.j;
    }

    public android.os.Bundle getExtraInfo() {
        return this.c;
    }

    public java.util.List<com.baidu.mapapi.model.LatLng> getPoints() {
        return this.e;
    }

    public java.util.List<java.lang.Integer> getTextureIndexs() {
        return this.f;
    }

    public int getWidth() {
        return this.h;
    }

    public int getZIndex() {
        return this.a;
    }

    public boolean isDottedLine() {
        return this.m;
    }

    public boolean isFocus() {
        return this.k;
    }

    public boolean isVisible() {
        return this.b;
    }

    public com.baidu.mapapi.map.PolylineOptions keepScale(boolean z) {
        this.l = z;
        return this;
    }

    public com.baidu.mapapi.map.PolylineOptions points(java.util.List<com.baidu.mapapi.model.LatLng> list) {
        if (list == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: points list can not be null");
        }
        if (list.size() < 2) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: points count can not less than 2");
        }
        if (list.contains(null)) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: points list can not contains null");
        }
        this.e = list;
        return this;
    }

    public com.baidu.mapapi.map.PolylineOptions textureIndex(java.util.List<java.lang.Integer> list) {
        if (list == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: indexs list can not be null");
        }
        if (list.contains(null)) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: index list can not contains null");
        }
        this.f = list;
        return this;
    }

    public com.baidu.mapapi.map.PolylineOptions visible(boolean z) {
        this.b = z;
        return this;
    }

    public com.baidu.mapapi.map.PolylineOptions width(int i) {
        if (i > 0) {
            this.h = i;
        }
        return this;
    }

    public com.baidu.mapapi.map.PolylineOptions zIndex(int i) {
        this.a = i;
        return this;
    }
}
