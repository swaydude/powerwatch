package com.baidu.mapapi.utils;

/* JADX INFO: loaded from: classes.dex */
final class f implements java.lang.Runnable {
    final /* synthetic */ android.content.Context a;
    final /* synthetic */ int b;

    f(android.content.Context context, int i) {
        this.a = context;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        do {
            if (java.lang.System.currentTimeMillis() - jCurrentTimeMillis > 3000) {
                com.baidu.mapapi.utils.b.a(this.a);
                com.baidu.mapapi.utils.b.a(this.b, this.a);
            }
        } while (!com.baidu.mapapi.utils.b.v.isInterrupted());
    }
}
