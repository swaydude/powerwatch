package com.baidu.platform.core.b;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.baidu.platform.base.a implements com.baidu.platform.core.b.d {
    com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener b = null;

    @Override // com.baidu.platform.core.b.d
    public void a() {
        this.a.lock();
        this.b = null;
        this.a.unlock();
    }

    @Override // com.baidu.platform.core.b.d
    public void a(com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener onGetGeoCoderResultListener) {
        this.a.lock();
        this.b = onGetGeoCoderResultListener;
        this.a.unlock();
    }

    @Override // com.baidu.platform.core.b.d
    public boolean a(com.baidu.mapapi.search.geocode.GeoCodeOption geoCodeOption) {
        com.baidu.platform.core.b.b bVar = new com.baidu.platform.core.b.b();
        com.baidu.platform.base.e cVar = new com.baidu.platform.core.b.c(geoCodeOption);
        bVar.a(com.baidu.platform.base.SearchType.GEO_CODER);
        if (geoCodeOption != null) {
            bVar.b(geoCodeOption.getAddress());
        }
        return a(cVar, this.b, bVar);
    }

    @Override // com.baidu.platform.core.b.d
    public boolean a(com.baidu.mapapi.search.geocode.ReverseGeoCodeOption reverseGeoCodeOption) {
        com.baidu.platform.core.b.e eVar = new com.baidu.platform.core.b.e();
        com.baidu.platform.core.b.f fVar = new com.baidu.platform.core.b.f(reverseGeoCodeOption);
        eVar.a(com.baidu.platform.base.SearchType.REVERSE_GEO_CODER);
        return a(fVar, this.b, eVar);
    }
}
