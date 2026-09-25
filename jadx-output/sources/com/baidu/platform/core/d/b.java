package com.baidu.platform.core.d;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.baidu.platform.base.e {
    public b(com.baidu.mapapi.search.route.BikingRoutePlanOption bikingRoutePlanOption) {
        a(bikingRoutePlanOption);
    }

    private void a(com.baidu.mapapi.search.route.BikingRoutePlanOption bikingRoutePlanOption) {
        this.a.a("mode", "riding");
        com.baidu.mapapi.model.LatLng location = bikingRoutePlanOption.mFrom.getLocation();
        if (location != null) {
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                location = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(location);
            }
            this.a.a("origin", location.latitude + "," + location.longitude);
        } else {
            this.a.a("origin", bikingRoutePlanOption.mFrom.getName());
        }
        com.baidu.mapapi.model.LatLng location2 = bikingRoutePlanOption.mTo.getLocation();
        if (location2 != null) {
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                location2 = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(location2);
            }
            this.a.a(com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, location2.latitude + "," + location2.longitude);
        } else {
            this.a.a(com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, bikingRoutePlanOption.mTo.getName());
        }
        this.a.a("origin_region", bikingRoutePlanOption.mFrom.getCity());
        this.a.a("destination_region", bikingRoutePlanOption.mTo.getCity());
        if (bikingRoutePlanOption.mRidingType == 1) {
            this.a.a("riding_type", java.lang.String.valueOf(bikingRoutePlanOption.mRidingType));
        }
        this.a.a("output", "json");
        this.a.a("from", "android_map_sdk");
    }

    @Override // com.baidu.platform.base.e
    public java.lang.String a(com.baidu.platform.domain.c cVar) {
        return cVar.j();
    }
}
