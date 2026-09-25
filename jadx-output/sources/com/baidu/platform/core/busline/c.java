package com.baidu.platform.core.busline;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.baidu.platform.base.a implements com.baidu.platform.core.busline.IBusLineSearch {
    com.baidu.mapapi.search.busline.OnGetBusLineSearchResultListener b = null;

    @Override // com.baidu.platform.core.busline.IBusLineSearch
    public void a() {
        this.a.lock();
        this.b = null;
        this.a.unlock();
    }

    @Override // com.baidu.platform.core.busline.IBusLineSearch
    public void a(com.baidu.mapapi.search.busline.OnGetBusLineSearchResultListener onGetBusLineSearchResultListener) {
        this.a.lock();
        this.b = onGetBusLineSearchResultListener;
        this.a.unlock();
    }

    @Override // com.baidu.platform.core.busline.IBusLineSearch
    public boolean a(com.baidu.mapapi.search.busline.BusLineSearchOption busLineSearchOption) {
        com.baidu.platform.core.busline.a aVar = new com.baidu.platform.core.busline.a();
        aVar.a(com.baidu.platform.base.SearchType.BUS_LINE_DETAIL);
        return a(new com.baidu.platform.core.busline.b(busLineSearchOption), this.b, aVar);
    }
}
