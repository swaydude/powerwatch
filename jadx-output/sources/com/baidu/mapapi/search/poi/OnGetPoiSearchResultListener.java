package com.baidu.mapapi.search.poi;

/* JADX INFO: loaded from: classes.dex */
public interface OnGetPoiSearchResultListener {
    void onGetPoiDetailResult(com.baidu.mapapi.search.poi.PoiDetailResult poiDetailResult);

    void onGetPoiDetailResult(com.baidu.mapapi.search.poi.PoiDetailSearchResult poiDetailSearchResult);

    void onGetPoiIndoorResult(com.baidu.mapapi.search.poi.PoiIndoorResult poiIndoorResult);

    void onGetPoiResult(com.baidu.mapapi.search.poi.PoiResult poiResult);
}
