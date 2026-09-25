package com.baidu.platform.core.a;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.baidu.platform.base.e {
    public c(java.lang.String str) {
        a(str);
    }

    private void a(java.lang.String str) {
        this.a.a("qt", "ext");
        this.a.a("num", "1000");
        this.a.a("l", "10");
        this.a.a("ie", "utf-8");
        this.a.a("oue", "1");
        this.a.a("res", "api");
        this.a.a("fromproduct", "android_map_sdk");
        this.a.a("uid", str);
    }

    @Override // com.baidu.platform.base.e
    public java.lang.String a(com.baidu.platform.domain.c cVar) {
        return cVar.o();
    }
}
