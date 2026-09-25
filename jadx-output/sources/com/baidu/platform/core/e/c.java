package com.baidu.platform.core.e;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.baidu.platform.base.e {
    public c(com.baidu.mapapi.search.share.PoiDetailShareURLOption poiDetailShareURLOption) {
        a(poiDetailShareURLOption);
    }

    private void a(com.baidu.mapapi.search.share.PoiDetailShareURLOption poiDetailShareURLOption) {
        this.a.a("url", ("http://wapmap.baidu.com/s?tn=Detail&pid=" + poiDetailShareURLOption.mUid + "&smsf=3") + com.baidu.mapapi.http.HttpClient.getPhoneInfo());
        b(false);
        a(false);
    }

    @Override // com.baidu.platform.base.e
    public java.lang.String a(com.baidu.platform.domain.c cVar) {
        return cVar.p();
    }
}
