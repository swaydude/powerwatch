package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class InfoWindow {
    com.baidu.mapapi.map.BitmapDescriptor a;
    android.view.View b;
    com.baidu.mapapi.model.LatLng c;
    com.baidu.mapapi.map.InfoWindow.OnInfoWindowClickListener d;
    com.baidu.mapapi.map.InfoWindow.a e;
    int f;
    boolean g;
    int h;
    boolean i;
    boolean j;
    boolean k;
    private java.lang.String l;

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick();
    }

    interface a {
        void a(com.baidu.mapapi.map.InfoWindow infoWindow);

        void b(com.baidu.mapapi.map.InfoWindow infoWindow);
    }

    public InfoWindow(android.view.View view, com.baidu.mapapi.model.LatLng latLng, int i) {
        this.l = "";
        this.g = false;
        this.h = com.baidu.mapapi.common.SysOSUtil.getDensityDpi();
        this.i = false;
        this.j = false;
        this.k = false;
        if (view == null || latLng == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: view and position can not be null");
        }
        this.b = view;
        this.c = latLng;
        this.f = i;
        this.j = true;
    }

    public InfoWindow(android.view.View view, com.baidu.mapapi.model.LatLng latLng, int i, boolean z, int i2) {
        this.l = "";
        this.g = false;
        this.h = com.baidu.mapapi.common.SysOSUtil.getDensityDpi();
        this.i = false;
        this.j = false;
        this.k = false;
        if (view == null || latLng == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: view and position can not be null");
        }
        this.b = view;
        this.c = latLng;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.j = true;
    }

    public InfoWindow(com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptor, com.baidu.mapapi.model.LatLng latLng, int i, com.baidu.mapapi.map.InfoWindow.OnInfoWindowClickListener onInfoWindowClickListener) {
        this.l = "";
        this.g = false;
        this.h = com.baidu.mapapi.common.SysOSUtil.getDensityDpi();
        this.i = false;
        this.j = false;
        this.k = false;
        if (bitmapDescriptor == null || latLng == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: bitmapDescriptor and position can not be null");
        }
        this.a = bitmapDescriptor;
        this.c = latLng;
        this.d = onInfoWindowClickListener;
        this.f = i;
        this.k = true;
    }

    public com.baidu.mapapi.map.BitmapDescriptor getBitmapDescriptor() {
        return this.a;
    }

    public com.baidu.mapapi.model.LatLng getPosition() {
        return this.c;
    }

    public java.lang.String getTag() {
        return this.l;
    }

    public android.view.View getView() {
        return this.b;
    }

    public int getYOffset() {
        return this.f;
    }

    public void setBitmapDescriptor(com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            return;
        }
        this.a = bitmapDescriptor;
        this.e.b(this);
    }

    public void setPosition(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            return;
        }
        this.c = latLng;
        this.e.b(this);
    }

    public void setTag(java.lang.String str) {
        this.l = str;
    }

    public void setView(android.view.View view) {
        if (view == null) {
            return;
        }
        this.b = view;
        this.e.b(this);
    }

    public void setYOffset(int i) {
        this.f = i;
        this.e.b(this);
    }
}
