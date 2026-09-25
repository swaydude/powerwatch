package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class i2 implements java.util.concurrent.Callable<com.bugfender.sdk.q1<java.lang.Boolean>> {
    private final com.bugfender.sdk.r1 a;
    private final com.bugfender.sdk.o1 b;
    private final com.bugfender.sdk.e1 c;

    public i2(com.bugfender.sdk.r1 r1Var, com.bugfender.sdk.o1 o1Var) {
        this.a = r1Var;
        this.b = o1Var;
        this.c = null;
    }

    public i2(com.bugfender.sdk.r1 r1Var, com.bugfender.sdk.o1 o1Var, com.bugfender.sdk.e1 e1Var) {
        this.c = e1Var;
        this.a = r1Var;
        this.b = o1Var;
    }

    private com.bugfender.sdk.e0<com.bugfender.sdk.e1> a(com.bugfender.sdk.t1<com.bugfender.sdk.e1> t1Var) {
        return t1Var.b(1);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.bugfender.sdk.q1<java.lang.Boolean> call() {
        try {
            com.bugfender.sdk.k2 k2VarC = this.a.c();
            if (k2VarC.k() <= 0) {
                try {
                    long jA = this.b.a(k2VarC);
                    k2VarC.a(jA);
                    this.a.d(jA);
                } catch (com.bugfender.sdk.h e) {
                    if (!(e instanceof com.bugfender.sdk.k)) {
                        com.bugfender.sdk.d1.a(e);
                    }
                    return new com.bugfender.sdk.q1<>(java.lang.Boolean.FALSE, e);
                }
            }
            com.bugfender.sdk.t1<com.bugfender.sdk.e1> t1VarD = this.a.d();
            com.bugfender.sdk.e0<com.bugfender.sdk.e1> e0VarA = a(t1VarD);
            if (this.c != null) {
                e0VarA.a().add(this.c);
            }
            if (!e0VarA.c() && e0VarA.b().size() > 0) {
                java.util.Iterator<java.io.File> it = e0VarA.b().iterator();
                while (it.hasNext()) {
                    t1VarD.a(it.next());
                }
                return new com.bugfender.sdk.q1<>(java.lang.Boolean.TRUE, null);
            }
            boolean zA = true;
            while (e0VarA.c()) {
                try {
                    this.b.a(e0VarA.a(), k2VarC);
                    zA &= t1VarD.a(e0VarA.b());
                    e0VarA = a(t1VarD);
                } catch (com.bugfender.sdk.h e2) {
                    if (!(e2 instanceof com.bugfender.sdk.k)) {
                        com.bugfender.sdk.d1.a(e2);
                    }
                    return new com.bugfender.sdk.q1<>(java.lang.Boolean.FALSE, e2);
                }
            }
            return new com.bugfender.sdk.q1<>(java.lang.Boolean.valueOf(zA));
        } catch (java.lang.Throwable th) {
            if (!(th instanceof com.bugfender.sdk.k) || !(th instanceof com.bugfender.sdk.p1)) {
                com.bugfender.sdk.d1.a(th);
            }
            return new com.bugfender.sdk.q1<>(java.lang.Boolean.FALSE, th);
        }
    }
}
