package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class v implements java.util.concurrent.Callable<java.lang.Boolean> {
    private final com.bugfender.sdk.r1 a;

    public v(com.bugfender.sdk.r1 r1Var) {
        this.a = r1Var;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean call() {
        return java.lang.Boolean.valueOf(this.a.d().d());
    }
}
