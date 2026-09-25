package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class j2 implements java.util.concurrent.Callable<com.bugfender.sdk.q1<java.lang.Boolean>> {
    private final com.bugfender.sdk.o1 a;
    private final com.bugfender.sdk.r1 b;
    private final java.lang.String c;
    private final com.bugfender.sdk.g2 d;
    private final java.util.List<com.bugfender.sdk.k2> e;

    public j2(com.bugfender.sdk.o1 o1Var, com.bugfender.sdk.r1 r1Var, java.lang.String str, com.bugfender.sdk.g2 g2Var) {
        this.a = o1Var;
        this.b = r1Var;
        this.c = str;
        this.d = g2Var;
        this.e = null;
    }

    public j2(com.bugfender.sdk.o1 o1Var, com.bugfender.sdk.r1 r1Var, java.lang.String str, java.util.List<com.bugfender.sdk.k2> list) {
        this.a = o1Var;
        this.b = r1Var;
        this.c = str;
        this.d = null;
        this.e = list;
    }

    private com.bugfender.sdk.e0<java.lang.String> a(com.bugfender.sdk.k2 k2Var) {
        try {
            return this.b.c(k2Var).b();
        } catch (com.bugfender.sdk.u1 unused) {
            return new com.bugfender.sdk.e0<>(java.util.Collections.emptyList(), java.util.Collections.emptyList());
        }
    }

    private static boolean a(com.bugfender.sdk.k2 k2Var, int i) {
        return new java.util.Date().getTime() - k2Var.m().getTime() >= java.util.concurrent.TimeUnit.DAYS.toMillis((long) i);
    }

    private com.bugfender.sdk.e0<com.bugfender.sdk.u0> b(com.bugfender.sdk.k2 k2Var) {
        try {
            return this.b.a(k2Var).b();
        } catch (com.bugfender.sdk.u1 unused) {
            return new com.bugfender.sdk.e0<>(java.util.Collections.emptyList(), java.util.Collections.emptyList());
        }
    }

    private java.util.List<com.bugfender.sdk.k2> b() {
        java.util.List<com.bugfender.sdk.k2> list = this.e;
        return (list == null || list.size() <= 0) ? this.b.a() : this.e;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.bugfender.sdk.q1<java.lang.Boolean> call() {
        com.bugfender.sdk.r1 r1Var;
        com.bugfender.sdk.g2 g2Var;
        try {
            java.util.List<com.bugfender.sdk.k2> listB = b();
            int i = 0;
            for (com.bugfender.sdk.k2 k2Var : listB) {
                try {
                    if (a(k2Var, 30)) {
                        r1Var = this.b;
                    } else {
                        com.bugfender.sdk.t1<com.bugfender.sdk.e1> t1VarB = this.b.b(k2Var);
                        com.bugfender.sdk.e0<com.bugfender.sdk.e1> e0VarA = t1VarB.a(1);
                        com.bugfender.sdk.e0<com.bugfender.sdk.u0> e0VarB = b(k2Var);
                        com.bugfender.sdk.e0<java.lang.String> e0VarA2 = a(k2Var);
                        if (e0VarA.c() || e0VarB.c() || e0VarA2.c()) {
                            if (k2Var.k() <= 0) {
                                long jA = this.a.a(k2Var);
                                k2Var.a(jA);
                                this.b.a(k2Var.f(), jA);
                            }
                            if (e0VarB.c()) {
                                for (com.bugfender.sdk.u0 u0Var : e0VarB.a()) {
                                    u0Var.a(k2Var.k());
                                    u0Var.a(new com.bugfender.sdk.e(this.c));
                                    this.a.a(u0Var, k2Var);
                                }
                            }
                            while (e0VarA.c()) {
                                this.a.a(e0VarA.a(), k2Var);
                                t1VarB.a(e0VarA.b());
                                e0VarA = t1VarB.a(1);
                            }
                            if (e0VarA2.c() && (g2Var = this.d) != null) {
                                g2Var.a(k2Var, e0VarA2.a());
                            }
                            this.b.a(k2Var.f());
                            i++;
                        } else {
                            r1Var = this.b;
                        }
                    }
                    r1Var.a(k2Var.f());
                } catch (java.lang.Exception e) {
                    com.bugfender.sdk.d1.b(com.bugfender.sdk.k1.G, "There was a problem sending the old session " + k2Var.f());
                    if (!(e instanceof com.bugfender.sdk.k) && !(e instanceof com.bugfender.sdk.p1)) {
                        this.b.a(k2Var.f());
                    }
                }
            }
            return new com.bugfender.sdk.q1<>(java.lang.Boolean.valueOf(listB.size() == 0 || i > 0));
        } catch (java.lang.Exception e2) {
            return new com.bugfender.sdk.q1<>(java.lang.Boolean.FALSE, e2);
        }
    }
}
