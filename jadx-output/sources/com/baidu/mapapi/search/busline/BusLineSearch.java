package com.baidu.mapapi.search.busline;

/* JADX INFO: loaded from: classes.dex */
public class BusLineSearch extends com.baidu.mapapi.search.core.l {
    private boolean b = false;
    com.baidu.platform.core.busline.IBusLineSearch a = new com.baidu.platform.core.busline.c();

    BusLineSearch() {
    }

    public static com.baidu.mapapi.search.busline.BusLineSearch newInstance() {
        com.baidu.mapapi.BMapManager.init();
        return new com.baidu.mapapi.search.busline.BusLineSearch();
    }

    public void destroy() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a();
        com.baidu.mapapi.BMapManager.destroy();
    }

    public boolean searchBusLine(com.baidu.mapapi.search.busline.BusLineSearchOption busLineSearchOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (busLineSearchOption == null || busLineSearchOption.mCity == null || busLineSearchOption.mUid == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: option or city or uid can not be null");
        }
        return this.a.a(busLineSearchOption);
    }

    public void setOnGetBusLineSearchResultListener(com.baidu.mapapi.search.busline.OnGetBusLineSearchResultListener onGetBusLineSearchResultListener) {
        com.baidu.platform.core.busline.IBusLineSearch iBusLineSearch = this.a;
        if (iBusLineSearch == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (onGetBusLineSearchResultListener == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        iBusLineSearch.a(onGetBusLineSearchResultListener);
    }
}
