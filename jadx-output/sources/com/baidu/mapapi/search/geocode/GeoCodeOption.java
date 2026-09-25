package com.baidu.mapapi.search.geocode;

/* JADX INFO: loaded from: classes.dex */
public class GeoCodeOption {
    public java.lang.String mCity = null;
    public java.lang.String mAddress = null;

    public com.baidu.mapapi.search.geocode.GeoCodeOption address(java.lang.String str) {
        this.mAddress = str;
        return this;
    }

    public com.baidu.mapapi.search.geocode.GeoCodeOption city(java.lang.String str) {
        this.mCity = str;
        return this;
    }

    public java.lang.String getAddress() {
        return this.mAddress;
    }
}
