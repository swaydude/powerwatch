package com.baidu.mapapi.search.poi;

/* JADX INFO: loaded from: classes.dex */
public class PoiIndoorOption {
    public java.lang.String bid;
    public java.lang.String floor;
    public java.lang.String wd;
    public int currentPage = 0;
    public int pageSize = 10;

    public com.baidu.mapapi.search.poi.PoiIndoorOption poiCurrentPage(int i) {
        this.currentPage = i;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiIndoorOption poiFloor(java.lang.String str) {
        this.floor = str;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiIndoorOption poiIndoorBid(java.lang.String str) {
        this.bid = str;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiIndoorOption poiIndoorWd(java.lang.String str) {
        this.wd = str;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiIndoorOption poiPageSize(int i) {
        this.pageSize = i;
        return this;
    }
}
