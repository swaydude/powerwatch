package com.baidu.lbsapi.auth;

/* JADX INFO: loaded from: classes.dex */
class d implements java.lang.Runnable {
    final /* synthetic */ com.baidu.lbsapi.auth.c a;

    d(com.baidu.lbsapi.auth.c cVar) {
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() throws java.lang.Throwable {
        com.baidu.lbsapi.auth.a.a("postWithHttps start Thread id = " + java.lang.String.valueOf(java.lang.Thread.currentThread().getId()));
        this.a.a(new com.baidu.lbsapi.auth.g(this.a.a).a(this.a.b));
    }
}
