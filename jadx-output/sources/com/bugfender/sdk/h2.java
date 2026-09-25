package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class h2 implements java.util.concurrent.Callable<com.bugfender.sdk.q1<java.lang.Boolean>> {
    private final com.bugfender.sdk.r1 a;
    private final com.bugfender.sdk.o1 b;
    private final java.lang.String c;

    public h2(com.bugfender.sdk.r1 r1Var, com.bugfender.sdk.o1 o1Var, java.lang.String str) {
        this.a = r1Var;
        this.b = o1Var;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.bugfender.sdk.q1<java.lang.Boolean> call() {
        com.bugfender.sdk.k2 k2VarC = this.a.c();
        com.bugfender.sdk.t1<com.bugfender.sdk.u0> t1VarE = this.a.e();
        com.bugfender.sdk.e0<com.bugfender.sdk.u0> e0VarC = t1VarE.c();
        if (!e0VarC.c()) {
            if (e0VarC.b().size() > 0) {
                java.util.Iterator<java.io.File> it = e0VarC.b().iterator();
                while (it.hasNext()) {
                    t1VarE.a(it.next());
                }
            }
            return new com.bugfender.sdk.q1<>(java.lang.Boolean.TRUE);
        }
        if (k2VarC.k() <= 0) {
            try {
                long jA = this.b.a(k2VarC);
                k2VarC.a(jA);
                this.a.d(jA);
            } catch (com.bugfender.sdk.h e) {
                return new com.bugfender.sdk.q1<>(java.lang.Boolean.FALSE, e);
            }
        }
        boolean z = false;
        for (com.bugfender.sdk.u0 u0Var : e0VarC.a()) {
            u0Var.a((int) k2VarC.k());
            u0Var.a(new com.bugfender.sdk.e(this.c));
            try {
                this.b.a(u0Var, k2VarC);
                z = true;
            } catch (com.bugfender.sdk.h e2) {
                return new com.bugfender.sdk.q1<>(java.lang.Boolean.FALSE, e2);
            }
        }
        if (z) {
            t1VarE.a(e0VarC.b());
        }
        return new com.bugfender.sdk.q1<>(java.lang.Boolean.valueOf(z));
    }
}
