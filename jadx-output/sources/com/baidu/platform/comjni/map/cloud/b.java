package com.baidu.platform.comjni.map.cloud;

/* JADX INFO: loaded from: classes.dex */
class b extends com.baidu.mapapi.http.HttpClient.ProtoResultCallback {
    final /* synthetic */ com.baidu.platform.comjni.map.cloud.a a;

    b(com.baidu.platform.comjni.map.cloud.a aVar) {
        this.a = aVar;
    }

    @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
    public void onFailed(com.baidu.mapapi.http.HttpClient.HttpStateError httpStateError) {
        com.baidu.platform.comjni.map.cloud.a aVar;
        int i;
        if (httpStateError == com.baidu.mapapi.http.HttpClient.HttpStateError.NETWORK_ERROR) {
            aVar = this.a;
            i = -3;
        } else {
            aVar = this.a;
            i = 1;
        }
        aVar.a(i);
    }

    @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
    public void onSuccess(java.lang.String str) {
        this.a.h = str;
        if (this.a.a()) {
            this.a.f(str);
        } else {
            this.a.g.post(new com.baidu.platform.comjni.map.cloud.c(this, str));
        }
    }
}
