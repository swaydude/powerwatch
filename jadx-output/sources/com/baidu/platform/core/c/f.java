package com.baidu.platform.core.c;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.baidu.platform.base.a implements com.baidu.platform.core.c.a {
    private com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener b = null;

    @Override // com.baidu.platform.core.c.a
    public void a() {
        this.a.lock();
        this.b = null;
        this.a.unlock();
    }

    @Override // com.baidu.platform.core.c.a
    public void a(com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener onGetPoiSearchResultListener) {
        this.a.lock();
        this.b = onGetPoiSearchResultListener;
        this.a.unlock();
    }

    @Override // com.baidu.platform.core.c.a
    public boolean a(com.baidu.mapapi.search.poi.PoiBoundSearchOption poiBoundSearchOption) {
        com.baidu.platform.core.c.g gVar = new com.baidu.platform.core.c.g(poiBoundSearchOption.mPageNum, poiBoundSearchOption.mPageCapacity);
        gVar.a(com.baidu.platform.base.SearchType.POI_IN_BOUND_SEARCH);
        return a(new com.baidu.platform.core.c.i(poiBoundSearchOption), this.b, gVar);
    }

    @Override // com.baidu.platform.core.c.a
    public boolean a(com.baidu.mapapi.search.poi.PoiCitySearchOption poiCitySearchOption) {
        com.baidu.platform.core.c.g gVar = new com.baidu.platform.core.c.g(poiCitySearchOption.mPageNum, poiCitySearchOption.mPageCapacity);
        gVar.a(com.baidu.platform.base.SearchType.POI_IN_CITY_SEARCH);
        return a(new com.baidu.platform.core.c.i(poiCitySearchOption), this.b, gVar);
    }

    @Override // com.baidu.platform.core.c.a
    public boolean a(com.baidu.mapapi.search.poi.PoiDetailSearchOption poiDetailSearchOption) {
        com.baidu.platform.core.c.d dVar = new com.baidu.platform.core.c.d();
        if (poiDetailSearchOption != null) {
            dVar.a(poiDetailSearchOption.isSearchByUids());
        }
        dVar.a(com.baidu.platform.base.SearchType.POI_DETAIL_SEARCH);
        return a(new com.baidu.platform.core.c.e(poiDetailSearchOption), this.b, dVar);
    }

    @Override // com.baidu.platform.core.c.a
    public boolean a(com.baidu.mapapi.search.poi.PoiIndoorOption poiIndoorOption) {
        com.baidu.platform.core.c.b bVar = new com.baidu.platform.core.c.b();
        bVar.a(com.baidu.platform.base.SearchType.INDOOR_POI_SEARCH);
        return a(new com.baidu.platform.core.c.c(poiIndoorOption), this.b, bVar);
    }

    @Override // com.baidu.platform.core.c.a
    public boolean a(com.baidu.mapapi.search.poi.PoiNearbySearchOption poiNearbySearchOption) {
        com.baidu.platform.core.c.g gVar = new com.baidu.platform.core.c.g(poiNearbySearchOption.mPageNum, poiNearbySearchOption.mPageCapacity);
        gVar.a(com.baidu.platform.base.SearchType.POI_NEAR_BY_SEARCH);
        return a(new com.baidu.platform.core.c.i(poiNearbySearchOption), this.b, gVar);
    }
}
