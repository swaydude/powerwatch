package com.baidu.platform.comjni.map.cloud;

/* JADX INFO: loaded from: classes.dex */
class c implements java.lang.Runnable {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ com.baidu.platform.comjni.map.cloud.b b;

    c(com.baidu.platform.comjni.map.cloud.b bVar, java.lang.String str) {
        this.b = bVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.a.f(this.a);
    }
}
