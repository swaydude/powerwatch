package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class p1 extends java.io.IOException {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = -1004;
    public static final int g = -1017;
    public static final int h = -1007;
    private int a;
    private java.lang.String b;

    public p1() {
    }

    public p1(int i, java.lang.String str) {
        this.a = i;
        this.b = str;
    }

    public int a() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.b;
    }
}
