package com.baidu.mapapi.search.busline;

/* JADX INFO: loaded from: classes.dex */
public class BusLineSearchOption {
    public java.lang.String mUid = null;
    public java.lang.String mCity = null;

    public com.baidu.mapapi.search.busline.BusLineSearchOption city(java.lang.String str) {
        this.mCity = str;
        return this;
    }

    public com.baidu.mapapi.search.busline.BusLineSearchOption uid(java.lang.String str) {
        this.mUid = str;
        return this;
    }
}
