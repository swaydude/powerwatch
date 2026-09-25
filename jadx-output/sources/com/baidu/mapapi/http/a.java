package com.baidu.mapapi.http;

/* JADX INFO: loaded from: classes.dex */
class a extends com.baidu.mapapi.http.AsyncHttpClient.a {
    final /* synthetic */ com.baidu.mapapi.http.HttpClient.ProtoResultCallback a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ com.baidu.mapapi.http.AsyncHttpClient c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(com.baidu.mapapi.http.AsyncHttpClient asyncHttpClient, com.baidu.mapapi.http.HttpClient.ProtoResultCallback protoResultCallback, java.lang.String str) {
        super(null);
        this.c = asyncHttpClient;
        this.a = protoResultCallback;
        this.b = str;
    }

    @Override // com.baidu.mapapi.http.AsyncHttpClient.a
    public void a() throws java.lang.Throwable {
        com.baidu.mapapi.http.HttpClient httpClient = new com.baidu.mapapi.http.HttpClient(io.fabric.sdk.android.services.network.HttpRequest.METHOD_GET, this.a);
        httpClient.setMaxTimeOut(this.c.a);
        httpClient.setReadTimeOut(this.c.b);
        httpClient.request(this.b);
    }
}
