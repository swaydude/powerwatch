package com.baidu.platform.core.c;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.baidu.platform.base.e {
    public c(com.baidu.mapapi.search.poi.PoiIndoorOption poiIndoorOption) {
        a(poiIndoorOption);
    }

    private void a(com.baidu.mapapi.search.poi.PoiIndoorOption poiIndoorOption) {
        this.a.a("qt", "indoor_s");
        this.a.a("x", "0");
        this.a.a("y", "0");
        this.a.a("from", "android_map_sdk");
        java.lang.String str = poiIndoorOption.bid;
        if (str != null && !str.equals("")) {
            this.a.a("bid", str);
        }
        java.lang.String str2 = poiIndoorOption.wd;
        if (str2 != null && !str2.equals("")) {
            this.a.a("wd", str2);
        }
        java.lang.String str3 = poiIndoorOption.floor;
        if (str3 != null && !str3.equals("")) {
            this.a.a("floor", str3);
        }
        this.a.a("current", poiIndoorOption.currentPage + "");
        this.a.a("pageSize", poiIndoorOption.pageSize + "");
    }

    @Override // com.baidu.platform.base.e
    public java.lang.String a(com.baidu.platform.domain.c cVar) {
        return cVar.c();
    }
}
