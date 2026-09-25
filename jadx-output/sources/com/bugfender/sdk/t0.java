package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class t0 implements java.util.concurrent.Callable<java.lang.Boolean> {
    private final com.bugfender.sdk.r1 a;
    private final com.bugfender.sdk.k2 b;

    public t0(com.bugfender.sdk.r1 r1Var, com.bugfender.sdk.k2 k2Var) {
        this.a = r1Var;
        this.b = k2Var;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean call() throws java.lang.Exception {
        try {
            this.a.d(this.b);
            return java.lang.Boolean.TRUE;
        } catch (com.bugfender.sdk.i e) {
            com.bugfender.sdk.d1.b(com.bugfender.sdk.k1.G, e.getMessage());
            return java.lang.Boolean.FALSE;
        }
    }
}
