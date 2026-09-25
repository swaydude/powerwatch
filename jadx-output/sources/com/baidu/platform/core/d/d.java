package com.baidu.platform.core.d;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.baidu.platform.base.e {
    d(com.baidu.mapapi.search.route.DrivingRoutePlanOption drivingRoutePlanOption) {
        a(drivingRoutePlanOption);
    }

    private void a(com.baidu.mapapi.search.route.DrivingRoutePlanOption drivingRoutePlanOption) {
        this.a.a("qt", "cars");
        this.a.a("sy", drivingRoutePlanOption.mPolicy.getInt() + "");
        this.a.a("ie", "utf-8");
        this.a.a("lrn", "20");
        this.a.a("version", "6");
        this.a.a("extinfo", "32");
        this.a.a("mrs", "1");
        this.a.a("rp_format", "json");
        this.a.a("rp_filter", "mobile");
        this.a.a("route_traffic", drivingRoutePlanOption.mtrafficPolicy.getInt() + "");
        this.a.a("sn", a(drivingRoutePlanOption.mFrom));
        this.a.a("en", a(drivingRoutePlanOption.mTo));
        if (drivingRoutePlanOption.mCityName != null) {
            this.a.a("c", drivingRoutePlanOption.mCityName);
        }
        if (drivingRoutePlanOption.mFrom != null) {
            this.a.a("sc", drivingRoutePlanOption.mFrom.getCity());
        }
        if (drivingRoutePlanOption.mTo != null) {
            this.a.a("ec", drivingRoutePlanOption.mTo.getCity());
        }
        java.util.List<com.baidu.mapapi.search.route.PlanNode> list = drivingRoutePlanOption.mWayPoints;
        java.lang.String str = new java.lang.String();
        java.lang.String str2 = new java.lang.String();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                com.baidu.mapapi.search.route.PlanNode planNode = list.get(i);
                if (planNode != null) {
                    str = str + a(planNode);
                    str2 = str2 + planNode.getCity();
                    if (i != list.size() - 1) {
                        str2 = str2 + "|";
                        str = str + "|";
                    }
                }
            }
            this.a.a("wp", str);
            this.a.a("wpc", str2);
        }
    }

    @Override // com.baidu.platform.base.e
    public java.lang.String a(com.baidu.platform.domain.c cVar) {
        return cVar.i();
    }
}
