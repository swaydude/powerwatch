package com.baidu.mapapi.http;

/* JADX INFO: loaded from: classes.dex */
class b implements javax.net.ssl.HostnameVerifier {
    final /* synthetic */ com.baidu.mapapi.http.HttpClient a;

    b(com.baidu.mapapi.http.HttpClient httpClient) {
        this.a = httpClient;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
        return javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
    }
}
