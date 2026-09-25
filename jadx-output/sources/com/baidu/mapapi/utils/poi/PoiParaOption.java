package com.baidu.mapapi.utils.poi;

/* JADX INFO: loaded from: classes.dex */
public class PoiParaOption {
    java.lang.String a;
    java.lang.String b;
    com.baidu.mapapi.model.LatLng c;
    int d;

    public com.baidu.mapapi.utils.poi.PoiParaOption center(com.baidu.mapapi.model.LatLng latLng) {
        this.c = latLng;
        return this;
    }

    public com.baidu.mapapi.model.LatLng getCenter() {
        return this.c;
    }

    public java.lang.String getKey() {
        return this.b;
    }

    public int getRadius() {
        return this.d;
    }

    public java.lang.String getUid() {
        return this.a;
    }

    public com.baidu.mapapi.utils.poi.PoiParaOption key(java.lang.String str) {
        this.b = str;
        return this;
    }

    public com.baidu.mapapi.utils.poi.PoiParaOption radius(int i) {
        this.d = i;
        return this;
    }

    public com.baidu.mapapi.utils.poi.PoiParaOption uid(java.lang.String str) {
        this.a = str;
        return this;
    }
}
