package com.baidu.mapapi.search.poi;

/* JADX INFO: loaded from: classes.dex */
public class PoiNearbySearchOption {
    public java.lang.String mKeyword = null;
    public com.baidu.mapapi.model.LatLng mLocation = null;
    public int mRadius = -1;
    public int mPageNum = 0;
    public int mPageCapacity = 10;
    public com.baidu.mapapi.search.poi.PoiSortType sortType = com.baidu.mapapi.search.poi.PoiSortType.comprehensive;
    public java.lang.String mTag = "";
    public int mScope = 1;
    public boolean mRadiusLimit = false;
    public com.baidu.mapapi.search.poi.PoiFilter mPoiFilter = null;

    public com.baidu.mapapi.search.poi.PoiNearbySearchOption keyword(java.lang.String str) {
        this.mKeyword = str;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiNearbySearchOption location(com.baidu.mapapi.model.LatLng latLng) {
        this.mLocation = latLng;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiNearbySearchOption pageCapacity(int i) {
        this.mPageCapacity = i;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiNearbySearchOption pageNum(int i) {
        this.mPageNum = i;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiNearbySearchOption poiFilter(com.baidu.mapapi.search.poi.PoiFilter poiFilter) {
        this.mPoiFilter = poiFilter;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiNearbySearchOption radius(int i) {
        this.mRadius = i;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiNearbySearchOption radiusLimit(boolean z) {
        this.mRadiusLimit = z;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiNearbySearchOption scope(int i) {
        this.mScope = i;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiNearbySearchOption sortType(com.baidu.mapapi.search.poi.PoiSortType poiSortType) {
        if (poiSortType != null) {
            this.sortType = poiSortType;
        }
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiNearbySearchOption tag(java.lang.String str) {
        this.mTag = str;
        return this;
    }
}
