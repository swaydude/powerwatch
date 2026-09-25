package com.baidu.mapapi.search.poi;

/* JADX INFO: loaded from: classes.dex */
public class PoiBoundSearchOption {
    public com.baidu.mapapi.model.LatLngBounds mBound = null;
    public java.lang.String mKeyword = null;
    public int mPageNum = 0;
    public int mPageCapacity = 10;
    public java.lang.String mTag = "";
    public int mScope = 1;
    public com.baidu.mapapi.search.poi.PoiFilter mPoiFilter = null;

    public com.baidu.mapapi.search.poi.PoiBoundSearchOption bound(com.baidu.mapapi.model.LatLngBounds latLngBounds) {
        this.mBound = latLngBounds;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiBoundSearchOption keyword(java.lang.String str) {
        this.mKeyword = str;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiBoundSearchOption pageCapacity(int i) {
        this.mPageCapacity = i;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiBoundSearchOption pageNum(int i) {
        this.mPageNum = i;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiBoundSearchOption poiFilter(com.baidu.mapapi.search.poi.PoiFilter poiFilter) {
        this.mPoiFilter = poiFilter;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiBoundSearchOption scope(int i) {
        this.mScope = i;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiBoundSearchOption tag(java.lang.String str) {
        this.mTag = str;
        return this;
    }
}
