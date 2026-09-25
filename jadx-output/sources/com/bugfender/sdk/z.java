package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class z implements java.util.concurrent.Callable<com.bugfender.sdk.y> {
    private final com.bugfender.sdk.o1 a;
    private final com.bugfender.sdk.x<java.lang.String> b;
    private final com.bugfender.sdk.w c;

    public z(com.bugfender.sdk.o1 o1Var, com.bugfender.sdk.w wVar, com.bugfender.sdk.x<java.lang.String> xVar) {
        this.a = o1Var;
        this.c = wVar;
        this.b = xVar;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.bugfender.sdk.y call() throws java.lang.Exception {
        try {
            return this.a.a(this.c.a(), this.c, this.b.a(true));
        } catch (com.bugfender.sdk.h e) {
            if (e instanceof com.bugfender.sdk.g) {
                throw e;
            }
            return com.bugfender.sdk.y.d;
        }
    }
}
