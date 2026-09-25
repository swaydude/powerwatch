package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class e0<T> {
    private java.util.List<T> a;
    private java.util.List<java.io.File> b;

    public e0(java.util.List<T> list, java.util.List<java.io.File> list2) {
        this.a = list;
        this.b = list2;
    }

    public java.util.List<T> a() {
        return this.a;
    }

    public java.util.List<java.io.File> b() {
        return this.b;
    }

    public boolean c() {
        return !this.a.isEmpty();
    }
}
