package com.baidu.mapapi.favorite;

/* JADX INFO: loaded from: classes.dex */
public class FavoritePoiInfo {
    java.lang.String a;
    java.lang.String b;
    com.baidu.mapapi.model.LatLng c;
    java.lang.String d;
    java.lang.String e;
    java.lang.String f;
    long g;

    public com.baidu.mapapi.favorite.FavoritePoiInfo addr(java.lang.String str) {
        this.d = str;
        return this;
    }

    public com.baidu.mapapi.favorite.FavoritePoiInfo cityName(java.lang.String str) {
        this.e = str;
        return this;
    }

    public java.lang.String getAddr() {
        return this.d;
    }

    public java.lang.String getCityName() {
        return this.e;
    }

    public java.lang.String getID() {
        return this.a;
    }

    public java.lang.String getPoiName() {
        return this.b;
    }

    public com.baidu.mapapi.model.LatLng getPt() {
        return this.c;
    }

    public long getTimeStamp() {
        return this.g;
    }

    public java.lang.String getUid() {
        return this.f;
    }

    public com.baidu.mapapi.favorite.FavoritePoiInfo poiName(java.lang.String str) {
        this.b = str;
        return this;
    }

    public com.baidu.mapapi.favorite.FavoritePoiInfo pt(com.baidu.mapapi.model.LatLng latLng) {
        this.c = latLng;
        return this;
    }

    public com.baidu.mapapi.favorite.FavoritePoiInfo uid(java.lang.String str) {
        this.f = str;
        return this;
    }
}
