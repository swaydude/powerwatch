package com.baidu.mapsdkplatform.comapi.map;

/* JADX INFO: loaded from: classes.dex */
class i extends com.baidu.mapapi.http.HttpClient.ProtoResultCallback {
    final /* synthetic */ android.content.Context a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ com.baidu.mapsdkplatform.comapi.map.h.a c;
    final /* synthetic */ com.baidu.mapsdkplatform.comapi.map.h d;

    i(com.baidu.mapsdkplatform.comapi.map.h hVar, android.content.Context context, java.lang.String str, com.baidu.mapsdkplatform.comapi.map.h.a aVar) {
        this.d = hVar;
        this.a = context;
        this.b = str;
        this.c = aVar;
    }

    @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
    public void onFailed(com.baidu.mapapi.http.HttpClient.HttpStateError httpStateError) {
        java.lang.String strB = this.d.b(this.a, this.b);
        if (!this.d.a(strB)) {
            strB = null;
        }
        com.baidu.mapsdkplatform.comapi.map.h.a aVar = this.c;
        if (aVar != null) {
            aVar.a(httpStateError.ordinal(), httpStateError.name(), strB);
        }
        android.util.Log.e(com.baidu.mapsdkplatform.comapi.map.h.a, "sendRequest onFailed error = " + httpStateError);
    }

    @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
    public void onSuccess(java.lang.String str) {
        this.d.b(this.a, str, this.b, this.c);
    }
}
