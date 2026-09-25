package com.baidu.platform.core.b;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.baidu.platform.base.e {
    public c(com.baidu.mapapi.search.geocode.GeoCodeOption geoCodeOption) {
        a(geoCodeOption);
    }

    private void a(com.baidu.mapapi.search.geocode.GeoCodeOption geoCodeOption) {
        this.a.a("city", geoCodeOption.mCity);
        this.a.a("address", geoCodeOption.mAddress);
        this.a.a("output", "json");
        this.a.a("ret_coordtype", com.baidu.mapsdkplatform.comapi.location.CoordinateType.BD09LL);
        this.a.a("from", "android_map_sdk");
    }

    @Override // com.baidu.platform.base.e
    public java.lang.String a(com.baidu.platform.domain.c cVar) {
        return cVar.f();
    }
}
