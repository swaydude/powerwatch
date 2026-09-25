package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class d<T> implements java.util.concurrent.Callable<java.lang.Boolean> {
    private final com.bugfender.sdk.r1 a;
    private final com.bugfender.sdk.k0<T> b;
    private final com.bugfender.sdk.p0<T> c;
    private final com.bugfender.sdk.o1 d;
    private final java.util.concurrent.atomic.AtomicLong e;
    private final com.bugfender.sdk.y f;
    private final T g;

    public d(com.bugfender.sdk.r1 r1Var, com.bugfender.sdk.p0<T> p0Var, T t, com.bugfender.sdk.o1 o1Var, com.bugfender.sdk.k0<T> k0Var, java.util.concurrent.atomic.AtomicLong atomicLong, com.bugfender.sdk.y yVar) {
        this.a = r1Var;
        this.c = p0Var;
        this.g = t;
        this.d = o1Var;
        this.b = k0Var;
        this.e = atomicLong;
        this.f = yVar;
    }

    private com.bugfender.sdk.e1 a(java.lang.String str) {
        return new com.bugfender.sdk.e1.b().b(0).a(com.bugfender.sdk.e1.c.E.a()).a(this.e.getAndIncrement()).a(new java.util.Date(java.lang.System.currentTimeMillis())).c("bf_disk_error").b("").a("").d(str).f("").e("").a();
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean call() throws java.lang.Exception {
        boolean zA = this.c.a().a(this.b.a(this.g));
        if (!zA) {
            com.bugfender.sdk.d1.b(com.bugfender.sdk.k1.G, "Bugfender couldn't store the log on disk due to an error.");
            if (this.f.c()) {
                new com.bugfender.sdk.i2(this.a, this.d, a("Bugfender couldn't store the log on disk due to an error.")).call();
            }
        }
        return java.lang.Boolean.valueOf(zA);
    }
}
