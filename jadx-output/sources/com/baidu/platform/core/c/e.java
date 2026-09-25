package com.baidu.platform.core.c;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.baidu.platform.base.e {
    e(com.baidu.mapapi.search.poi.PoiDetailSearchOption poiDetailSearchOption) {
        a(poiDetailSearchOption);
    }

    private void a(com.baidu.mapapi.search.poi.PoiDetailSearchOption poiDetailSearchOption) {
        if (poiDetailSearchOption == null) {
            android.util.Log.e(com.baidu.platform.core.c.e.class.getSimpleName(), "Option is null");
            return;
        }
        if (!poiDetailSearchOption.isSearchByUids()) {
            poiDetailSearchOption.poiUids(poiDetailSearchOption.getUid());
        }
        this.a.a("uids", poiDetailSearchOption.getUids());
        this.a.a("output", "json");
        this.a.a("scope", "2");
    }

    @Override // com.baidu.platform.base.e
    public java.lang.String a(com.baidu.platform.domain.c cVar) {
        return cVar.b();
    }
}
