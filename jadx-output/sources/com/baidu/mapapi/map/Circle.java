package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class Circle extends com.baidu.mapapi.map.Overlay {
    com.baidu.mapapi.model.LatLng a;
    int b;
    int c;
    com.baidu.mapapi.map.Stroke d;
    boolean e;
    int f = 0;
    java.util.List<com.baidu.mapapi.map.HoleOptions> g;
    com.baidu.mapapi.map.HoleOptions h;

    Circle() {
        this.type = com.baidu.mapsdkplatform.comapi.map.j.circle;
    }

    private void b(android.os.Bundle bundle) {
        com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorFromAsset = com.baidu.mapapi.map.BitmapDescriptorFactory.fromAsset(this.f == 1 ? "CircleDashTexture.png" : "lineDashTexture.png");
        if (bitmapDescriptorFromAsset != null) {
            bundle.putBundle("image_info", bitmapDescriptorFromAsset.b());
        }
    }

    private void c(java.util.List<com.baidu.mapapi.map.HoleOptions> list, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        boolean zB = com.baidu.mapapi.map.Overlay.b(list, bundle2);
        bundle.putInt("has_holes", zB ? 1 : 0);
        if (zB) {
            bundle.putBundle("holes", bundle2);
        }
    }

    @Override // com.baidu.mapapi.map.Overlay
    android.os.Bundle a(android.os.Bundle bundle) {
        java.util.List<com.baidu.mapapi.map.HoleOptions> arrayList;
        super.a(bundle);
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(this.a);
        bundle.putDouble("location_x", geoPointLl2mc.getLongitudeE6());
        bundle.putDouble("location_y", geoPointLl2mc.getLatitudeE6());
        if (this.e) {
            bundle.putDouble("dotted_stroke_location_x", geoPointLl2mc.getLongitudeE6());
            bundle.putDouble("dotted_stroke_location_y", geoPointLl2mc.getLatitudeE6());
            bundle.putInt("has_dotted_stroke", 1);
            b(bundle);
        } else {
            bundle.putInt("has_dotted_stroke", 0);
        }
        bundle.putInt("radius", com.baidu.mapapi.model.CoordUtil.getMCDistanceByOneLatLngAndRadius(this.a, this.c));
        com.baidu.mapapi.map.Overlay.a(this.b, bundle);
        if (this.d == null) {
            bundle.putInt("has_stroke", 0);
        } else {
            bundle.putInt("has_stroke", 1);
            bundle.putBundle("stroke", this.d.a(new android.os.Bundle()));
        }
        java.util.List<com.baidu.mapapi.map.HoleOptions> list = this.g;
        if (list == null || list.size() == 0) {
            if (this.h != null) {
                arrayList = new java.util.ArrayList<>();
                arrayList.add(this.h);
            } else {
                bundle.putInt("has_holes", 0);
            }
            return bundle;
        }
        arrayList = this.g;
        c(arrayList, bundle);
        return bundle;
    }

    public com.baidu.mapapi.model.LatLng getCenter() {
        return this.a;
    }

    public int getDottedStrokeType() {
        return this.f;
    }

    public int getFillColor() {
        return this.b;
    }

    public com.baidu.mapapi.map.HoleOptions getHoleOption() {
        return this.h;
    }

    public java.util.List<com.baidu.mapapi.map.HoleOptions> getHoleOptions() {
        return this.g;
    }

    public int getRadius() {
        return this.c;
    }

    public com.baidu.mapapi.map.Stroke getStroke() {
        return this.d;
    }

    public boolean isDottedStroke() {
        return this.e;
    }

    public void setCenter(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: circle center can not be null");
        }
        this.a = latLng;
        this.listener.b(this);
    }

    public void setDottedStroke(boolean z) {
        this.e = z;
        this.listener.b(this);
    }

    public void setDottedStrokeType(com.baidu.mapapi.map.CircleDottedStrokeType circleDottedStrokeType) {
        this.f = circleDottedStrokeType.ordinal();
        this.listener.b(this);
    }

    public void setFillColor(int i) {
        this.b = i;
        this.listener.b(this);
    }

    public void setHoleOption(com.baidu.mapapi.map.HoleOptions holeOptions) {
        this.h = holeOptions;
        this.g = null;
        this.listener.b(this);
    }

    public void setHoleOptions(java.util.List<com.baidu.mapapi.map.HoleOptions> list) {
        this.g = list;
        this.h = null;
        this.listener.b(this);
    }

    public void setRadius(int i) {
        this.c = i;
        this.listener.b(this);
    }

    public void setStroke(com.baidu.mapapi.map.Stroke stroke) {
        this.d = stroke;
        this.listener.b(this);
    }
}
