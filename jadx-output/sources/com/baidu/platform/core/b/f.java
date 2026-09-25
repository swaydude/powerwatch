package com.baidu.platform.core.b;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.baidu.platform.base.e {
    public f(com.baidu.mapapi.search.geocode.ReverseGeoCodeOption reverseGeoCodeOption) {
        a(reverseGeoCodeOption);
    }

    private void a(com.baidu.mapapi.search.geocode.ReverseGeoCodeOption reverseGeoCodeOption) {
        if (reverseGeoCodeOption.getLocation() != null) {
            com.baidu.mapapi.model.LatLng latLng = new com.baidu.mapapi.model.LatLng(reverseGeoCodeOption.getLocation().latitude, reverseGeoCodeOption.getLocation().longitude);
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                latLng = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(latLng);
            }
            this.a.a(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION, latLng.latitude + "," + latLng.longitude);
        }
        this.a.a("coordtype", com.baidu.mapsdkplatform.comapi.location.CoordinateType.BD09LL);
        this.a.a("page_index", java.lang.String.valueOf(reverseGeoCodeOption.getPageNum()));
        this.a.a("page_size", java.lang.String.valueOf(reverseGeoCodeOption.getPageSize()));
        this.a.a("pois", "1");
        this.a.a("output", "jsonaes");
        this.a.a("from", "android_map_sdk");
        this.a.a("latest_admin", java.lang.String.valueOf(reverseGeoCodeOption.getLatestAdmin()));
        this.a.a("radius", java.lang.String.valueOf(reverseGeoCodeOption.getRadius()));
    }

    @Override // com.baidu.platform.base.e
    public java.lang.String a(com.baidu.platform.domain.c cVar) {
        return cVar.e();
    }
}
