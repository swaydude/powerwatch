package com.baidu.platform.base;

/* JADX INFO: loaded from: classes.dex */
class b extends com.baidu.mapapi.http.HttpClient.ProtoResultCallback {
    final /* synthetic */ com.baidu.platform.base.d a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ com.baidu.platform.base.a c;

    b(com.baidu.platform.base.a aVar, com.baidu.platform.base.d dVar, java.lang.Object obj) {
        this.c = aVar;
        this.a = dVar;
        this.b = obj;
    }

    @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
    public void onFailed(com.baidu.mapapi.http.HttpClient.HttpStateError httpStateError) {
        this.c.a(httpStateError, this.a, this.b);
    }

    @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
    public void onSuccess(java.lang.String str) {
        java.lang.String strA = this.a instanceof com.baidu.platform.core.b.e ? this.c.a(str) : "";
        java.lang.String str2 = !android.text.TextUtils.isEmpty(strA) ? strA : str;
        this.c.c(str2);
        com.baidu.platform.base.a aVar = this.c;
        aVar.a(str2, this.a, this.b, aVar.b, this);
    }
}
