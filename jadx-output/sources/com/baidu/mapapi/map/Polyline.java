package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class Polyline extends com.baidu.mapapi.map.Overlay {
    int a;
    java.util.List<com.baidu.mapapi.model.LatLng> b;
    int[] c;
    int[] d;
    com.baidu.mapapi.map.BitmapDescriptor j;
    java.util.List<com.baidu.mapapi.map.BitmapDescriptor> k;
    int e = 5;
    boolean f = false;
    boolean g = false;
    boolean h = true;
    boolean i = true;
    int l = 0;

    Polyline() {
        this.type = com.baidu.mapsdkplatform.comapi.map.j.polyline;
    }

    private android.os.Bundle a(boolean z) {
        if (z) {
            com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorFromAsset = com.baidu.mapapi.map.BitmapDescriptorFactory.fromAsset(this.l == 1 ? "CircleDashTexture.png" : "lineDashTexture.png");
            if (bitmapDescriptorFromAsset != null) {
                return bitmapDescriptorFromAsset.b();
            }
        }
        return this.j.b();
    }

    private static void a(int[] iArr, android.os.Bundle bundle) {
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        bundle.putIntArray("traffic_array", iArr);
    }

    private android.os.Bundle b(boolean z) {
        if (z) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("total", 1);
            com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorFromAsset = com.baidu.mapapi.map.BitmapDescriptorFactory.fromAsset("lineDashTexture.png");
            if (bitmapDescriptorFromAsset != null) {
                bundle.putBundle("texture_0", bitmapDescriptorFromAsset.b());
            }
            return bundle;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        int i = 0;
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            if (this.k.get(i2) != null) {
                bundle2.putBundle("texture_" + java.lang.String.valueOf(i), this.k.get(i2).b());
                i++;
            }
        }
        bundle2.putInt("total", i);
        return bundle2;
    }

    private static void b(int[] iArr, android.os.Bundle bundle) {
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        bundle.putIntArray("color_array", iArr);
        bundle.putInt("total", 1);
    }

    @Override // com.baidu.mapapi.map.Overlay
    android.os.Bundle a(android.os.Bundle bundle) {
        int[] iArr;
        int[] iArr2;
        super.a(bundle);
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(this.b.get(0));
        bundle.putDouble("location_x", geoPointLl2mc.getLongitudeE6());
        bundle.putDouble("location_y", geoPointLl2mc.getLatitudeE6());
        bundle.putInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_WIDTH_KEY, this.e);
        com.baidu.mapapi.map.Overlay.a(this.b, bundle);
        com.baidu.mapapi.map.Overlay.a(this.a, bundle);
        a(this.c, bundle);
        b(this.d, bundle);
        int[] iArr3 = this.c;
        int i = 1;
        if (iArr3 != null && iArr3.length > 0 && iArr3.length > this.b.size() - 1) {
            android.util.Log.e("baidumapsdk", "the size of textureIndexs is larger than the size of points");
        }
        bundle.putInt("dotline", this.f ? 1 : 0);
        bundle.putInt("focus", this.g ? 1 : 0);
        bundle.putInt("isClickable", this.i ? 1 : 0);
        try {
            if (this.j != null) {
                bundle.putInt(io.reactivex.annotations.SchedulerSupport.CUSTOM, 1);
                bundle.putBundle("image_info", a(false));
            } else {
                if (this.f) {
                    bundle.putBundle("image_info", a(true));
                    bundle.putInt("dotted_line_type", this.l);
                }
                bundle.putInt(io.reactivex.annotations.SchedulerSupport.CUSTOM, 0);
            }
            if (this.k != null) {
                bundle.putInt("customlist", 1);
                bundle.putBundle("image_info_list", b(false));
            } else {
                if (this.f && (((iArr = this.c) != null && iArr.length > 0) || ((iArr2 = this.d) != null && iArr2.length > 0))) {
                    bundle.putBundle("image_info_list", b(true));
                }
                bundle.putInt("customlist", 0);
            }
            if (!this.h) {
                i = 0;
            }
            bundle.putInt("keep", i);
        } catch (java.lang.Exception unused) {
            android.util.Log.e("baidumapsdk", "load texture resource failed!");
            bundle.putInt("dotline", 0);
        }
        return bundle;
    }

    public int getColor() {
        return this.a;
    }

    public int[] getColorList() {
        return this.d;
    }

    public int getDottedLineType() {
        return this.l;
    }

    public java.util.List<com.baidu.mapapi.model.LatLng> getPoints() {
        return this.b;
    }

    public com.baidu.mapapi.map.BitmapDescriptor getTexture() {
        return this.j;
    }

    public int getWidth() {
        return this.e;
    }

    public boolean isClickable() {
        return this.i;
    }

    public boolean isDottedLine() {
        return this.f;
    }

    public boolean isFocus() {
        return this.g;
    }

    public boolean isIsKeepScale() {
        return this.h;
    }

    public void setClickable(boolean z) {
        this.i = z;
        this.listener.b(this);
    }

    public void setColor(int i) {
        this.a = i;
        this.listener.b(this);
    }

    public void setColorList(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: colorList can not empty");
        }
        this.d = iArr;
    }

    public void setDottedLine(boolean z) {
        this.f = z;
        this.listener.b(this);
    }

    public void setDottedLineType(com.baidu.mapapi.map.PolylineDottedLineType polylineDottedLineType) {
        this.l = polylineDottedLineType.ordinal();
        this.listener.b(this);
    }

    public void setFocus(boolean z) {
        this.g = z;
        this.listener.b(this);
    }

    public void setIndexs(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: indexList can not empty");
        }
        this.c = iArr;
    }

    public void setIsKeepScale(boolean z) {
        this.h = z;
    }

    public void setPoints(java.util.List<com.baidu.mapapi.model.LatLng> list) {
        if (list == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: points list can not be null");
        }
        if (list.size() < 2) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: points count can not less than 2 or more than 10000");
        }
        if (list.contains(null)) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: points list can not contains null");
        }
        this.b = list;
        this.listener.b(this);
    }

    public void setTexture(com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptor) {
        this.j = bitmapDescriptor;
        this.listener.b(this);
    }

    public void setTextureList(java.util.List<com.baidu.mapapi.map.BitmapDescriptor> list) {
        if (list == null || list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: textureList can not empty");
        }
        this.k = list;
    }

    public void setWidth(int i) {
        if (i > 0) {
            this.e = i;
            this.listener.b(this);
        }
    }
}
