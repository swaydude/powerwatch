package com.baidu.mapapi.search.share;

/* JADX INFO: loaded from: classes.dex */
public class ShareUrlSearch extends com.baidu.mapapi.search.core.l {
    private boolean b = false;
    com.baidu.platform.core.e.a a = new com.baidu.platform.core.e.h();

    ShareUrlSearch() {
    }

    private boolean a(java.lang.String str) {
        try {
            java.lang.Integer.parseInt(str);
            return true;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }

    public static com.baidu.mapapi.search.share.ShareUrlSearch newInstance() {
        com.baidu.mapapi.BMapManager.init();
        return new com.baidu.mapapi.search.share.ShareUrlSearch();
    }

    public void destroy() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a();
        com.baidu.mapapi.BMapManager.destroy();
    }

    public boolean requestLocationShareUrl(com.baidu.mapapi.search.share.LocationShareURLOption locationShareURLOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: searcher has been destroyed");
        }
        if (locationShareURLOption == null || locationShareURLOption.mLocation == null || locationShareURLOption.mName == null || locationShareURLOption.mSnippet == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: option or name or snippet  can not be null");
        }
        return this.a.a(locationShareURLOption);
    }

    public boolean requestPoiDetailShareUrl(com.baidu.mapapi.search.share.PoiDetailShareURLOption poiDetailShareURLOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: searcher has been destroyed");
        }
        if (poiDetailShareURLOption == null || poiDetailShareURLOption.mUid == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: option or uid can not be null");
        }
        return this.a.a(poiDetailShareURLOption);
    }

    public boolean requestRouteShareUrl(com.baidu.mapapi.search.share.RouteShareURLOption routeShareURLOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: searcher has been destroyed");
        }
        if (routeShareURLOption == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: option is null");
        }
        if (routeShareURLOption.getmMode().ordinal() < 0) {
            return false;
        }
        if (routeShareURLOption.mFrom == null || routeShareURLOption.mTo == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: start or end point can not be null");
        }
        if (routeShareURLOption.mMode == com.baidu.mapapi.search.share.RouteShareURLOption.RouteShareMode.BUS_ROUTE_SHARE_MODE) {
            if ((routeShareURLOption.mFrom.getLocation() == null || routeShareURLOption.mTo.getLocation() == null) && routeShareURLOption.mCityCode < 0) {
                throw new java.lang.IllegalArgumentException("BDMapSDKException: city code can not be null if don't set start or end point");
            }
        } else {
            if (routeShareURLOption.mFrom.getLocation() == null && !a(routeShareURLOption.mFrom.getCity())) {
                throw new java.lang.IllegalArgumentException("BDMapSDKException: start cityCode must be set if not set start location");
            }
            if (routeShareURLOption.mTo.getLocation() == null && !a(routeShareURLOption.mTo.getCity())) {
                throw new java.lang.IllegalArgumentException("BDMapSDKException: end cityCode must be set if not set end location");
            }
        }
        return this.a.a(routeShareURLOption);
    }

    public void setOnGetShareUrlResultListener(com.baidu.mapapi.search.share.OnGetShareUrlResultListener onGetShareUrlResultListener) {
        com.baidu.platform.core.e.a aVar = this.a;
        if (aVar == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: searcher has been destroyed");
        }
        if (onGetShareUrlResultListener == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        aVar.a(onGetShareUrlResultListener);
    }
}
