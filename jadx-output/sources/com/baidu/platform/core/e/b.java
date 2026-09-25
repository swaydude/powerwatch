package com.baidu.platform.core.e;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.baidu.platform.base.e {
    public b(com.baidu.mapapi.search.share.LocationShareURLOption locationShareURLOption) {
        a(locationShareURLOption);
    }

    private void a(com.baidu.mapapi.search.share.LocationShareURLOption locationShareURLOption) {
        this.a.a("qt", "cs");
        com.baidu.mapapi.model.inner.Point pointLl2point = com.baidu.mapapi.model.CoordUtil.ll2point(locationShareURLOption.mLocation);
        this.a.a("geo", pointLl2point.x + "|" + pointLl2point.y);
        this.a.a("t", locationShareURLOption.mName);
        this.a.a("cnt", locationShareURLOption.mSnippet);
        b(false);
        a(false);
    }

    @Override // com.baidu.platform.base.e
    public java.lang.String a(com.baidu.platform.domain.c cVar) {
        return cVar.q();
    }
}
