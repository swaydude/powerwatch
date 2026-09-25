package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class f2 implements java.util.concurrent.Callable<com.bugfender.sdk.q1<java.lang.Boolean>> {
    private final com.bugfender.sdk.o1 a;
    private final com.bugfender.sdk.x<java.lang.String> b;
    private final com.bugfender.sdk.w c;

    public f2(com.bugfender.sdk.o1 o1Var, com.bugfender.sdk.x<java.lang.String> xVar, com.bugfender.sdk.w wVar) {
        this.a = o1Var;
        this.b = xVar;
        this.c = wVar;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.bugfender.sdk.q1<java.lang.Boolean> call() throws java.lang.Exception {
        java.util.Map<java.lang.String, ?> all = this.b.getAll();
        for (java.lang.String str : all.keySet()) {
            try {
                this.a.a(this.c.a(), this.c.l(), new com.bugfender.sdk.z0<>(str, all.get(str)));
                this.b.remove(str);
            } catch (com.bugfender.sdk.h e) {
                return new com.bugfender.sdk.q1<>(java.lang.Boolean.FALSE, e);
            }
        }
        return new com.bugfender.sdk.q1<>(java.lang.Boolean.TRUE);
    }
}
