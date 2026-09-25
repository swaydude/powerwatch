package com.baidu.lbsapi.auth;

/* JADX INFO: loaded from: classes.dex */
class h implements javax.net.ssl.HostnameVerifier {
    final /* synthetic */ com.baidu.lbsapi.auth.g a;

    h(com.baidu.lbsapi.auth.g gVar) {
        this.a = gVar;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
        if ("api.map.baidu.com".equals(str)) {
            return true;
        }
        return javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
    }
}
