package com.baidu.platform.core.d;

/* JADX INFO: loaded from: classes.dex */
public class g extends com.baidu.platform.base.e {
    g(com.baidu.mapapi.search.route.IndoorRoutePlanOption indoorRoutePlanOption) {
        a(indoorRoutePlanOption);
    }

    private void a(com.baidu.mapapi.search.route.IndoorRoutePlanOption indoorRoutePlanOption) {
        this.a.a("qt", "indoornavi");
        this.a.a("rp_format", "json");
        this.a.a("version", "1");
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(indoorRoutePlanOption.mFrom.getLocation());
        if (geoPointLl2mc != null) {
            this.a.a("sn", (java.lang.String.format("%f,%f", java.lang.Double.valueOf(geoPointLl2mc.getLongitudeE6()), java.lang.Double.valueOf(geoPointLl2mc.getLatitudeE6())) + "|" + indoorRoutePlanOption.mFrom.getFloor()).replaceAll(" ", ""));
        }
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc2 = com.baidu.mapapi.model.CoordUtil.ll2mc(indoorRoutePlanOption.mTo.getLocation());
        if (geoPointLl2mc2 != null) {
            this.a.a("en", (java.lang.String.format("%f,%f", java.lang.Double.valueOf(geoPointLl2mc2.getLongitudeE6()), java.lang.Double.valueOf(geoPointLl2mc2.getLatitudeE6())) + "|" + indoorRoutePlanOption.mTo.getFloor()).replaceAll(" ", ""));
        }
    }

    @Override // com.baidu.platform.base.e
    public java.lang.String a(com.baidu.platform.domain.c cVar) {
        return cVar.l();
    }
}
