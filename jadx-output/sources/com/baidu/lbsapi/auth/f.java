package com.baidu.lbsapi.auth;

/* JADX INFO: loaded from: classes.dex */
class f implements java.lang.Runnable {
    final /* synthetic */ com.baidu.lbsapi.auth.e a;

    f(com.baidu.lbsapi.auth.e eVar) {
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() throws java.lang.Throwable {
        com.baidu.lbsapi.auth.e eVar = this.a;
        eVar.a((java.util.List<java.util.HashMap<java.lang.String, java.lang.String>>) eVar.b);
    }
}
