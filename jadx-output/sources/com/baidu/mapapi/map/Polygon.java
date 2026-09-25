package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class Polygon extends com.baidu.mapapi.map.Overlay {
    com.baidu.mapapi.map.Stroke a;
    int b;
    java.util.List<com.baidu.mapapi.model.LatLng> c;
    java.util.List<com.baidu.mapapi.map.HoleOptions> d;
    com.baidu.mapapi.map.HoleOptions e;

    Polygon() {
        this.type = com.baidu.mapsdkplatform.comapi.map.j.polygon;
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
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(this.c.get(0));
        bundle.putDouble("location_x", geoPointLl2mc.getLongitudeE6());
        bundle.putDouble("location_y", geoPointLl2mc.getLatitudeE6());
        com.baidu.mapapi.map.Overlay.a(this.c, bundle);
        com.baidu.mapapi.map.Overlay.a(this.b, bundle);
        if (this.a == null) {
            bundle.putInt("has_stroke", 0);
        } else {
            bundle.putInt("has_stroke", 1);
            bundle.putBundle("stroke", this.a.a(new android.os.Bundle()));
        }
        java.util.List<com.baidu.mapapi.map.HoleOptions> list = this.d;
        if (list == null || list.size() == 0) {
            if (this.e != null) {
                arrayList = new java.util.ArrayList<>();
                arrayList.add(this.e);
            } else {
                bundle.putInt("has_holes", 0);
            }
            return bundle;
        }
        arrayList = this.d;
        c(arrayList, bundle);
        return bundle;
    }

    public int getFillColor() {
        return this.b;
    }

    public com.baidu.mapapi.map.HoleOptions getHoleOption() {
        return this.e;
    }

    public java.util.List<com.baidu.mapapi.map.HoleOptions> getHoleOptions() {
        return this.d;
    }

    public java.util.List<com.baidu.mapapi.model.LatLng> getPoints() {
        return this.c;
    }

    public com.baidu.mapapi.map.Stroke getStroke() {
        return this.a;
    }

    public void setFillColor(int i) {
        this.b = i;
        this.listener.b(this);
    }

    public void setHoleOption(com.baidu.mapapi.map.HoleOptions holeOptions) {
        this.e = holeOptions;
        this.d = null;
        this.listener.b(this);
    }

    public void setHoleOptions(java.util.List<com.baidu.mapapi.map.HoleOptions> list) {
        this.d = list;
        this.e = null;
        this.listener.b(this);
    }

    public void setPoints(java.util.List<com.baidu.mapapi.model.LatLng> list) {
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
        this.c = list;
        this.listener.b(this);
    }

    public void setStroke(com.baidu.mapapi.map.Stroke stroke) {
        this.a = stroke;
        this.listener.b(this);
    }
}
