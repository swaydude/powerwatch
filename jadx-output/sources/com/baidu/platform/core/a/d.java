package com.baidu.platform.core.a;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.baidu.platform.base.a implements com.baidu.platform.core.a.e {
    private com.baidu.mapapi.search.district.OnGetDistricSearchResultListener b = null;

    @Override // com.baidu.platform.core.a.e
    public void a() {
        this.a.lock();
        this.b = null;
        this.a.unlock();
    }

    @Override // com.baidu.platform.core.a.e
    public void a(com.baidu.mapapi.search.district.OnGetDistricSearchResultListener onGetDistricSearchResultListener) {
        this.a.lock();
        this.b = onGetDistricSearchResultListener;
        this.a.unlock();
    }

    @Override // com.baidu.platform.core.a.e
    public boolean a(com.baidu.mapapi.search.district.DistrictSearchOption districtSearchOption) {
        com.baidu.platform.core.a.b bVar = new com.baidu.platform.core.a.b();
        bVar.a(com.baidu.platform.base.SearchType.DISTRICT_SEARCH);
        return a(new com.baidu.platform.core.a.a(districtSearchOption), this.b, bVar);
    }
}
