package com.baidu.platform.core.e;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.baidu.platform.base.e {
    public e(com.baidu.mapapi.search.share.RouteShareURLOption routeShareURLOption) {
        a(routeShareURLOption);
    }

    private int a(java.lang.String str) {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    private void a(com.baidu.mapapi.search.share.RouteShareURLOption routeShareURLOption) {
        java.lang.String str;
        java.lang.String str2;
        com.baidu.platform.util.a aVar = new com.baidu.platform.util.a();
        com.baidu.mapapi.model.inner.Point pointLl2point = com.baidu.mapapi.model.CoordUtil.ll2point(routeShareURLOption.mFrom.getLocation());
        com.baidu.mapapi.model.inner.Point pointLl2point2 = com.baidu.mapapi.model.CoordUtil.ll2point(routeShareURLOption.mTo.getLocation());
        java.lang.String str3 = "2$$$$$$";
        if (pointLl2point != null) {
            str = "1$$$$" + pointLl2point.x + "," + pointLl2point.y + "$$";
        } else {
            str = "2$$$$$$";
        }
        java.lang.String name = routeShareURLOption.mFrom.getName();
        java.lang.String str4 = "";
        if (name == null || name.equals("")) {
            name = "起点";
        }
        java.lang.String str5 = str + name + "$$0$$$$";
        if (pointLl2point2 != null) {
            str3 = "1$$$$" + pointLl2point2.x + "," + pointLl2point2.y + "$$";
        }
        java.lang.String name2 = routeShareURLOption.mTo.getName();
        if (name2 == null || name2.equals("")) {
            name2 = "终点";
        }
        java.lang.String str6 = str3 + name2 + "$$0$$$$";
        int iOrdinal = routeShareURLOption.mMode.ordinal();
        if (iOrdinal == 0) {
            aVar.a("sc", a(routeShareURLOption.mFrom.getCity()) + "");
            aVar.a("ec", a(routeShareURLOption.mTo.getCity()) + "");
            str4 = "&sharecallbackflag=carRoute";
            str2 = "nav";
        } else if (iOrdinal == 1) {
            aVar.a("sc", a(routeShareURLOption.mFrom.getCity()) + "");
            aVar.a("ec", a(routeShareURLOption.mTo.getCity()) + "");
            str4 = "&sharecallbackflag=footRoute";
            str2 = "walk";
        } else if (iOrdinal == 2) {
            aVar.a("sc", a(routeShareURLOption.mFrom.getCity()) + "");
            aVar.a("ec", a(routeShareURLOption.mTo.getCity()) + "");
            str4 = "&sharecallbackflag=cycleRoute";
            str2 = "cycle";
        } else if (iOrdinal != 3) {
            str2 = "";
        } else {
            java.lang.String str7 = "&i=" + routeShareURLOption.mPn + ",1,1&sharecallbackflag=busRoute";
            aVar.a("c", routeShareURLOption.mCityCode + "");
            str2 = "bt";
            str4 = str7;
        }
        aVar.a("sn", str5);
        aVar.a("en", str6);
        this.a.a("url", "http://map.baidu.com/?newmap=1&s=" + str2 + (com.baidu.mapsdkplatform.comjni.util.AppMD5.encodeUrlParamsValue("&" + aVar.a() + ("&start=" + name + "&end=" + name2)) + str4));
        this.a.a("from", "android_map_sdk");
    }

    @Override // com.baidu.platform.base.e
    public java.lang.String a(com.baidu.platform.domain.c cVar) {
        return cVar.r();
    }
}
