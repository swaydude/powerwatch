package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class c2 implements java.util.concurrent.Callable<java.lang.Boolean> {
    private final com.bugfender.sdk.x<java.lang.String> a;
    private final com.bugfender.sdk.o1 b;
    private final com.bugfender.sdk.w c;
    private java.lang.String d;

    public c2(com.bugfender.sdk.x<java.lang.String> xVar, com.bugfender.sdk.o1 o1Var, com.bugfender.sdk.w wVar, java.lang.String str) {
        this.a = xVar;
        this.b = o1Var;
        this.c = wVar;
        this.d = str;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean call() throws java.lang.Exception {
        try {
            this.b.a(this.c.a(), this.c.l(), new com.bugfender.sdk.z0<>(this.d, null));
            return java.lang.Boolean.valueOf(this.a.a(this.d));
        } catch (com.bugfender.sdk.h unused) {
            return java.lang.Boolean.FALSE;
        }
    }
}
