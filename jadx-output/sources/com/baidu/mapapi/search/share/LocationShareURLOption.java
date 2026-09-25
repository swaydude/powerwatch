package com.baidu.mapapi.search.share;

/* JADX INFO: loaded from: classes.dex */
public class LocationShareURLOption {
    public com.baidu.mapapi.model.LatLng mLocation = null;
    public java.lang.String mName = null;
    public java.lang.String mSnippet = null;

    public com.baidu.mapapi.search.share.LocationShareURLOption location(com.baidu.mapapi.model.LatLng latLng) {
        this.mLocation = latLng;
        return this;
    }

    public com.baidu.mapapi.search.share.LocationShareURLOption name(java.lang.String str) {
        this.mName = str;
        return this;
    }

    public com.baidu.mapapi.search.share.LocationShareURLOption snippet(java.lang.String str) {
        this.mSnippet = str;
        return this;
    }
}
