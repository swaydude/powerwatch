package com.baidu.platform.core.f;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.baidu.platform.base.e {
    public d(com.baidu.mapapi.search.sug.SuggestionSearchOption suggestionSearchOption) {
        a(suggestionSearchOption);
    }

    private void a(com.baidu.mapapi.search.sug.SuggestionSearchOption suggestionSearchOption) {
        com.baidu.platform.util.a aVar;
        java.lang.String str;
        this.a.a("q", suggestionSearchOption.mKeyword);
        this.a.a("region", suggestionSearchOption.mCity);
        if (suggestionSearchOption.mLocation != null) {
            com.baidu.mapapi.model.LatLng latLng = new com.baidu.mapapi.model.LatLng(suggestionSearchOption.mLocation.latitude, suggestionSearchOption.mLocation.longitude);
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                latLng = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(latLng);
            }
            this.a.a(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION, latLng.latitude + "," + latLng.longitude);
        }
        if (suggestionSearchOption.mCityLimit.booleanValue()) {
            aVar = this.a;
            str = "true";
        } else {
            aVar = this.a;
            str = "false";
        }
        aVar.a("city_limit", str);
        this.a.a("from", "android_map_sdk");
        this.a.a("output", "json");
    }

    @Override // com.baidu.platform.base.e
    public java.lang.String a(com.baidu.platform.domain.c cVar) {
        return cVar.d();
    }
}
