package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class Arc extends com.baidu.mapapi.map.Overlay {
    private static final java.lang.String f = "Arc";
    int a;
    int b;
    com.baidu.mapapi.model.LatLng c;
    com.baidu.mapapi.model.LatLng d;
    com.baidu.mapapi.model.LatLng e;

    Arc() {
        this.type = com.baidu.mapsdkplatform.comapi.map.j.arc;
    }

    @Override // com.baidu.mapapi.map.Overlay
    android.os.Bundle a(android.os.Bundle bundle) {
        super.a(bundle);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.clear();
        arrayList.add(this.c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc((com.baidu.mapapi.model.LatLng) arrayList.get(0));
        bundle.putDouble("location_x", geoPointLl2mc.getLongitudeE6());
        bundle.putDouble("location_y", geoPointLl2mc.getLatitudeE6());
        bundle.putInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_WIDTH_KEY, this.b);
        com.baidu.mapapi.map.Overlay.a(arrayList, bundle);
        com.baidu.mapapi.map.Overlay.a(this.a, bundle);
        return bundle;
    }

    public int getColor() {
        return this.a;
    }

    public com.baidu.mapapi.model.LatLng getEndPoint() {
        return this.e;
    }

    public com.baidu.mapapi.model.LatLng getMiddlePoint() {
        return this.d;
    }

    public com.baidu.mapapi.model.LatLng getStartPoint() {
        return this.c;
    }

    public int getWidth() {
        return this.b;
    }

    public void setColor(int i) {
        this.a = i;
        this.listener.b(this);
    }

    public void setPoints(com.baidu.mapapi.model.LatLng latLng, com.baidu.mapapi.model.LatLng latLng2, com.baidu.mapapi.model.LatLng latLng3) {
        if (latLng == null || latLng2 == null || latLng3 == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException:start and middle and end points can not be null");
        }
        if (latLng == latLng2 || latLng == latLng3 || latLng2 == latLng3) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: start and middle and end points can not be same");
        }
        this.c = latLng;
        this.d = latLng2;
        this.e = latLng3;
        this.listener.b(this);
    }

    public void setWidth(int i) {
        if (i > 0) {
            this.b = i;
            this.listener.b(this);
        }
    }
}
