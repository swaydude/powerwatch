package com.baidu.mapapi.search.poi;

/* JADX INFO: loaded from: classes.dex */
public class PoiCitySearchOption {
    public java.lang.String mCity = null;
    public java.lang.String mKeyword = null;
    public int mPageNum = 0;
    public int mPageCapacity = 10;
    public boolean mIsReturnAddr = true;
    public java.lang.String mTag = "";
    public int mScope = 1;
    public boolean mIsCityLimit = true;
    public com.baidu.mapapi.search.poi.PoiFilter mPoiFilter = null;

    public com.baidu.mapapi.search.poi.PoiCitySearchOption city(java.lang.String str) {
        this.mCity = str;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiCitySearchOption cityLimit(boolean z) {
        this.mIsCityLimit = z;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiCitySearchOption isReturnAddr(boolean z) {
        this.mIsReturnAddr = z;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiCitySearchOption keyword(java.lang.String str) {
        this.mKeyword = str;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiCitySearchOption pageCapacity(int i) {
        this.mPageCapacity = i;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiCitySearchOption pageNum(int i) {
        this.mPageNum = i;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiCitySearchOption poiFilter(com.baidu.mapapi.search.poi.PoiFilter poiFilter) {
        this.mPoiFilter = poiFilter;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiCitySearchOption scope(int i) {
        this.mScope = i;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiCitySearchOption tag(java.lang.String str) {
        this.mTag = str;
        return this;
    }
}
