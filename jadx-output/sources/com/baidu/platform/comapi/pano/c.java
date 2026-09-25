package com.baidu.platform.comapi.pano;

/* JADX INFO: loaded from: classes.dex */
public class c {
    java.lang.String a;
    com.baidu.platform.comapi.pano.PanoStateError b;
    int c;

    public c() {
    }

    public c(com.baidu.platform.comapi.pano.PanoStateError panoStateError) {
        this.b = panoStateError;
    }

    public com.baidu.platform.comapi.pano.PanoStateError a() {
        return this.b;
    }

    public void a(int i) {
        this.c = i;
    }

    public void a(java.lang.String str) {
        this.a = str;
    }

    public java.lang.String b() {
        return this.a;
    }

    public int c() {
        return this.c;
    }
}
