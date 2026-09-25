package com.baidu.mapapi.search.poi;

/* JADX INFO: loaded from: classes.dex */
public class PoiSearch extends com.baidu.mapapi.search.core.l {
    private boolean b = false;
    private com.baidu.platform.core.c.a a = new com.baidu.platform.core.c.f();

    PoiSearch() {
    }

    public static com.baidu.mapapi.search.poi.PoiSearch newInstance() {
        com.baidu.mapapi.BMapManager.init();
        return new com.baidu.mapapi.search.poi.PoiSearch();
    }

    public void destroy() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a();
        com.baidu.mapapi.BMapManager.destroy();
    }

    public boolean searchInBound(com.baidu.mapapi.search.poi.PoiBoundSearchOption poiBoundSearchOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (poiBoundSearchOption == null || poiBoundSearchOption.mBound == null || poiBoundSearchOption.mKeyword == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: option or bound or keyworld can not be null");
        }
        return this.a.a(poiBoundSearchOption);
    }

    public boolean searchInCity(com.baidu.mapapi.search.poi.PoiCitySearchOption poiCitySearchOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (poiCitySearchOption == null || poiCitySearchOption.mCity == null || poiCitySearchOption.mKeyword == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: option or city or keyworld can not be null");
        }
        return this.a.a(poiCitySearchOption);
    }

    public boolean searchNearby(com.baidu.mapapi.search.poi.PoiNearbySearchOption poiNearbySearchOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (poiNearbySearchOption == null || poiNearbySearchOption.mLocation == null || poiNearbySearchOption.mKeyword == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: option or location or keyworld can not be null");
        }
        if (poiNearbySearchOption.mRadius <= 0) {
            return false;
        }
        return this.a.a(poiNearbySearchOption);
    }

    public boolean searchPoiDetail(com.baidu.mapapi.search.poi.PoiDetailSearchOption poiDetailSearchOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (poiDetailSearchOption == null || poiDetailSearchOption.getUid() == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: option or uid can not be null");
        }
        return this.a.a(poiDetailSearchOption);
    }

    public boolean searchPoiIndoor(com.baidu.mapapi.search.poi.PoiIndoorOption poiIndoorOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (poiIndoorOption == null || poiIndoorOption.bid == null || poiIndoorOption.wd == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: option or indoor bid or keyword can not be null");
        }
        return this.a.a(poiIndoorOption);
    }

    public void setOnGetPoiSearchResultListener(com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener onGetPoiSearchResultListener) {
        com.baidu.platform.core.c.a aVar = this.a;
        if (aVar == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (onGetPoiSearchResultListener == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        aVar.a(onGetPoiSearchResultListener);
    }
}
