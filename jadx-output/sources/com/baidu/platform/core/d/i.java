package com.baidu.platform.core.d;

/* JADX INFO: loaded from: classes.dex */
public class i extends com.baidu.platform.base.e {
    public i(com.baidu.mapapi.search.route.MassTransitRoutePlanOption massTransitRoutePlanOption) {
        a(massTransitRoutePlanOption);
    }

    private void a(com.baidu.mapapi.search.route.MassTransitRoutePlanOption massTransitRoutePlanOption) {
        com.baidu.mapapi.model.LatLng location = massTransitRoutePlanOption.mFrom.getLocation();
        if (location != null) {
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                location = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(location);
            }
            this.a.a("origin", location.latitude + "," + location.longitude);
        } else {
            this.a.a("origin", massTransitRoutePlanOption.mFrom.getName());
        }
        if (massTransitRoutePlanOption.mFrom.getCity() != null) {
            this.a.a("origin_region", massTransitRoutePlanOption.mFrom.getCity());
        }
        com.baidu.mapapi.model.LatLng location2 = massTransitRoutePlanOption.mTo.getLocation();
        if (location2 != null) {
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                location2 = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(location2);
            }
            this.a.a(com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, location2.latitude + "," + location2.longitude);
        } else {
            this.a.a(com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, massTransitRoutePlanOption.mTo.getName());
        }
        if (massTransitRoutePlanOption.mTo.getCity() != null) {
            this.a.a("destination_region", massTransitRoutePlanOption.mTo.getCity());
        }
        this.a.a("tactics_incity", massTransitRoutePlanOption.mTacticsIncity.getInt() + "");
        this.a.a("tactics_intercity", massTransitRoutePlanOption.mTacticsIntercity.getInt() + "");
        this.a.a("trans_type_intercity", massTransitRoutePlanOption.mTransTypeIntercity.getInt() + "");
        this.a.a("page_index", massTransitRoutePlanOption.mPageIndex + "");
        this.a.a("page_size", massTransitRoutePlanOption.mPageSize + "");
        this.a.a("coord_type", massTransitRoutePlanOption.mCoordType);
        this.a.a("output", "json");
        this.a.a("from", "android_map_sdk");
    }

    @Override // com.baidu.platform.base.e
    public java.lang.String a(com.baidu.platform.domain.c cVar) {
        return cVar.g();
    }
}
