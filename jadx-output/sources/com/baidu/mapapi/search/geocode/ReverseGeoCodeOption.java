package com.baidu.mapapi.search.geocode;

/* JADX INFO: loaded from: classes.dex */
public class ReverseGeoCodeOption {
    private int a = 10;
    private int b = 0;
    private com.baidu.mapapi.model.LatLng c = null;
    private int d = 0;
    private int e = 1000;

    public int getLatestAdmin() {
        return this.d;
    }

    public com.baidu.mapapi.model.LatLng getLocation() {
        return this.c;
    }

    public int getPageNum() {
        return this.b;
    }

    public int getPageSize() {
        return this.a;
    }

    public int getRadius() {
        return this.e;
    }

    public com.baidu.mapapi.search.geocode.ReverseGeoCodeOption location(com.baidu.mapapi.model.LatLng latLng) {
        this.c = latLng;
        return this;
    }

    public com.baidu.mapapi.search.geocode.ReverseGeoCodeOption newVersion(int i) {
        this.d = i;
        return this;
    }

    public com.baidu.mapapi.search.geocode.ReverseGeoCodeOption pageNum(int i) {
        if (i < 0) {
            i = 0;
        }
        this.b = i;
        return this;
    }

    public com.baidu.mapapi.search.geocode.ReverseGeoCodeOption pageSize(int i) {
        if (i > 0) {
            if (i > 100) {
                this.a = 100;
            }
            return this;
        }
        i = 10;
        this.a = i;
        return this;
    }

    public com.baidu.mapapi.search.geocode.ReverseGeoCodeOption radius(int i) {
        if (i >= 0) {
            if (i > 1000) {
                this.e = 1000;
            }
            return this;
        }
        i = 0;
        this.e = i;
        return this;
    }
}
