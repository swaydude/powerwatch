package com.baidu.platform.core.c;

/* JADX INFO: loaded from: classes.dex */
public class i extends com.baidu.platform.base.e {
    i(com.baidu.mapapi.search.poi.PoiBoundSearchOption poiBoundSearchOption) {
        a(poiBoundSearchOption);
    }

    i(com.baidu.mapapi.search.poi.PoiCitySearchOption poiCitySearchOption) {
        a(poiCitySearchOption);
    }

    i(com.baidu.mapapi.search.poi.PoiNearbySearchOption poiNearbySearchOption) {
        a(poiNearbySearchOption);
    }

    private void a(com.baidu.mapapi.search.poi.PoiBoundSearchOption poiBoundSearchOption) {
        this.a.a(com.google.android.gms.actions.SearchIntents.EXTRA_QUERY, poiBoundSearchOption.mKeyword);
        this.a.a("tag", poiBoundSearchOption.mTag);
        this.a.a("bounds", poiBoundSearchOption.mBound.southwest.latitude + "," + poiBoundSearchOption.mBound.southwest.longitude + "," + poiBoundSearchOption.mBound.northeast.latitude + "," + poiBoundSearchOption.mBound.northeast.longitude);
        this.a.a("output", "json");
        com.baidu.platform.util.a aVar = this.a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(poiBoundSearchOption.mScope);
        sb.append("");
        aVar.a("scope", sb.toString());
        this.a.a("page_num", poiBoundSearchOption.mPageNum + "");
        this.a.a("page_size", poiBoundSearchOption.mPageCapacity + "");
        if (poiBoundSearchOption.mScope != 2 || poiBoundSearchOption.mPoiFilter == null || android.text.TextUtils.isEmpty(poiBoundSearchOption.mPoiFilter.toString())) {
            return;
        }
        this.a.a("filter", poiBoundSearchOption.mPoiFilter.toString());
    }

    private void a(com.baidu.mapapi.search.poi.PoiCitySearchOption poiCitySearchOption) {
        com.baidu.platform.util.a aVar;
        java.lang.String str;
        this.a.a(com.google.android.gms.actions.SearchIntents.EXTRA_QUERY, poiCitySearchOption.mKeyword);
        this.a.a("region", poiCitySearchOption.mCity);
        this.a.a("output", "json");
        this.a.a("page_num", poiCitySearchOption.mPageNum + "");
        this.a.a("page_size", poiCitySearchOption.mPageCapacity + "");
        this.a.a("scope", poiCitySearchOption.mScope + "");
        this.a.a("tag", poiCitySearchOption.mTag);
        if (poiCitySearchOption.mIsCityLimit) {
            aVar = this.a;
            str = "true";
        } else {
            aVar = this.a;
            str = "false";
        }
        aVar.a("city_limit", str);
        if (poiCitySearchOption.mScope != 2 || poiCitySearchOption.mPoiFilter == null || android.text.TextUtils.isEmpty(poiCitySearchOption.mPoiFilter.toString())) {
            return;
        }
        this.a.a("filter", poiCitySearchOption.mPoiFilter.toString());
    }

    private void a(com.baidu.mapapi.search.poi.PoiNearbySearchOption poiNearbySearchOption) {
        com.baidu.platform.util.a aVar;
        java.lang.String str;
        this.a.a(com.google.android.gms.actions.SearchIntents.EXTRA_QUERY, poiNearbySearchOption.mKeyword);
        this.a.a(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION, poiNearbySearchOption.mLocation.latitude + "," + poiNearbySearchOption.mLocation.longitude);
        this.a.a("radius", poiNearbySearchOption.mRadius + "");
        this.a.a("output", "json");
        this.a.a("page_num", poiNearbySearchOption.mPageNum + "");
        this.a.a("page_size", poiNearbySearchOption.mPageCapacity + "");
        this.a.a("scope", poiNearbySearchOption.mScope + "");
        this.a.a("tag", poiNearbySearchOption.mTag);
        if (poiNearbySearchOption.mRadiusLimit) {
            aVar = this.a;
            str = "true";
        } else {
            aVar = this.a;
            str = "false";
        }
        aVar.a("radius_limit", str);
        if (poiNearbySearchOption.mScope != 2 || poiNearbySearchOption.mPoiFilter == null || android.text.TextUtils.isEmpty(poiNearbySearchOption.mPoiFilter.toString())) {
            return;
        }
        this.a.a("filter", poiNearbySearchOption.mPoiFilter.toString());
    }

    @Override // com.baidu.platform.base.e
    public java.lang.String a(com.baidu.platform.domain.c cVar) {
        return cVar.a();
    }
}
