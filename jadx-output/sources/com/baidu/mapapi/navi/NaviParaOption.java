package com.baidu.mapapi.navi;

/* JADX INFO: loaded from: classes.dex */
public class NaviParaOption {
    com.baidu.mapapi.model.LatLng a;
    java.lang.String b;
    com.baidu.mapapi.model.LatLng c;
    java.lang.String d;

    public com.baidu.mapapi.navi.NaviParaOption endName(java.lang.String str) {
        this.d = str;
        return this;
    }

    public com.baidu.mapapi.navi.NaviParaOption endPoint(com.baidu.mapapi.model.LatLng latLng) {
        this.c = latLng;
        return this;
    }

    public java.lang.String getEndName() {
        return this.d;
    }

    public com.baidu.mapapi.model.LatLng getEndPoint() {
        return this.c;
    }

    public java.lang.String getStartName() {
        return this.b;
    }

    public com.baidu.mapapi.model.LatLng getStartPoint() {
        return this.a;
    }

    public com.baidu.mapapi.navi.NaviParaOption startName(java.lang.String str) {
        this.b = str;
        return this;
    }

    public com.baidu.mapapi.navi.NaviParaOption startPoint(com.baidu.mapapi.model.LatLng latLng) {
        this.a = latLng;
        return this;
    }
}
