package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class j implements java.lang.Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ com.baidu.mapapi.map.HeatMap d;

    j(com.baidu.mapapi.map.HeatMap heatMap, int i, int i2, int i3) {
        this.d = heatMap;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.d.b(this.a, this.b, this.c);
    }
}
