package com.baidu.lbsapi.auth;

/* JADX INFO: loaded from: classes.dex */
class l implements com.baidu.lbsapi.auth.e.a<java.lang.String> {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ com.baidu.lbsapi.auth.LBSAuthManager b;

    l(com.baidu.lbsapi.auth.LBSAuthManager lBSAuthManager, java.lang.String str) {
        this.b = lBSAuthManager;
        this.a = str;
    }

    @Override // com.baidu.lbsapi.auth.e.a
    public void a(java.lang.String str) {
        this.b.a(str, this.a);
    }
}
