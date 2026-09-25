package com.baidu.platform.comapi.pano;

/* JADX INFO: loaded from: classes.dex */
class b extends com.baidu.mapapi.http.HttpClient.ProtoResultCallback {
    final /* synthetic */ com.baidu.platform.comapi.pano.a.InterfaceC0014a a;
    final /* synthetic */ com.baidu.platform.comapi.pano.a b;

    b(com.baidu.platform.comapi.pano.a aVar, com.baidu.platform.comapi.pano.a.InterfaceC0014a interfaceC0014a) {
        this.b = aVar;
        this.a = interfaceC0014a;
    }

    @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
    public void onFailed(com.baidu.mapapi.http.HttpClient.HttpStateError httpStateError) {
        this.a.a(httpStateError);
    }

    @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
    public void onSuccess(java.lang.String str) {
        this.a.a(this.b.a(str));
    }
}
