package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class q1<T> {
    private final T a;
    private final java.lang.Throwable b;

    public q1(T t) {
        this.a = t;
        this.b = null;
    }

    public q1(T t, java.lang.Throwable th) {
        this.a = t;
        this.b = th;
    }

    public T a() {
        return this.a;
    }

    public java.lang.Throwable b() {
        return this.b;
    }
}
