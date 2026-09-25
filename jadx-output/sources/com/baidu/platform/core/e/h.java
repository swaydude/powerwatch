package com.baidu.platform.core.e;

/* JADX INFO: loaded from: classes.dex */
public class h extends com.baidu.platform.base.a implements com.baidu.platform.core.e.a {
    com.baidu.mapapi.search.share.OnGetShareUrlResultListener b = null;

    @Override // com.baidu.platform.core.e.a
    public void a() {
        this.a.lock();
        this.b = null;
        this.a.unlock();
    }

    @Override // com.baidu.platform.core.e.a
    public void a(com.baidu.mapapi.search.share.OnGetShareUrlResultListener onGetShareUrlResultListener) {
        this.a.lock();
        this.b = onGetShareUrlResultListener;
        this.a.unlock();
    }

    @Override // com.baidu.platform.core.e.a
    public boolean a(com.baidu.mapapi.search.share.LocationShareURLOption locationShareURLOption) {
        com.baidu.platform.core.e.f fVar = new com.baidu.platform.core.e.f();
        fVar.a(com.baidu.platform.base.SearchType.LOCATION_SEARCH_SHARE);
        return a(new com.baidu.platform.core.e.b(locationShareURLOption), this.b, fVar);
    }

    @Override // com.baidu.platform.core.e.a
    public boolean a(com.baidu.mapapi.search.share.PoiDetailShareURLOption poiDetailShareURLOption) {
        com.baidu.platform.core.e.f fVar = new com.baidu.platform.core.e.f();
        fVar.a(com.baidu.platform.base.SearchType.POI_DETAIL_SHARE);
        return a(new com.baidu.platform.core.e.c(poiDetailShareURLOption), this.b, fVar);
    }

    @Override // com.baidu.platform.core.e.a
    public boolean a(com.baidu.mapapi.search.share.RouteShareURLOption routeShareURLOption) {
        com.baidu.platform.core.e.d dVar = new com.baidu.platform.core.e.d();
        dVar.a(com.baidu.platform.base.SearchType.ROUTE_PLAN_SHARE);
        return a(new com.baidu.platform.core.e.e(routeShareURLOption), this.b, dVar);
    }
}
