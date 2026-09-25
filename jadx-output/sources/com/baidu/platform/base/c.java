package com.baidu.platform.base;

/* JADX INFO: loaded from: classes.dex */
class c implements java.lang.Runnable {
    final /* synthetic */ com.baidu.platform.base.d a;
    final /* synthetic */ com.baidu.mapapi.search.core.SearchResult b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ com.baidu.platform.base.a d;

    c(com.baidu.platform.base.a aVar, com.baidu.platform.base.d dVar, com.baidu.mapapi.search.core.SearchResult searchResult, java.lang.Object obj) {
        this.d = aVar;
        this.a = dVar;
        this.b = searchResult;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a != null) {
            this.d.a.lock();
            try {
                this.a.a(this.b, this.c);
            } finally {
                this.d.a.unlock();
            }
        }
    }
}
