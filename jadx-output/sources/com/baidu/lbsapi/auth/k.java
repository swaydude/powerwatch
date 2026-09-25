package com.baidu.lbsapi.auth;

/* JADX INFO: loaded from: classes.dex */
class k implements com.baidu.lbsapi.auth.c.a<java.lang.String> {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ com.baidu.lbsapi.auth.LBSAuthManager b;

    k(com.baidu.lbsapi.auth.LBSAuthManager lBSAuthManager, java.lang.String str) {
        this.b = lBSAuthManager;
        this.a = str;
    }

    @Override // com.baidu.lbsapi.auth.c.a
    public void a(java.lang.String str) {
        this.b.a(str, this.a);
    }
}
