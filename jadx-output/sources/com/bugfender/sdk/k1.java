package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class k1 {
    public static final long A = 5242880;
    private static final int B = 0;
    private static final int C = 1;
    private static final int D = 2;
    public static final java.lang.String E = "$package_id";
    public static final java.lang.String F = "$android_id";
    public static final java.lang.String G = "Bugfender-SDK";
    private static final java.lang.Runnable H = new com.bugfender.sdk.k1.e();
    private static final long y = 1048576;
    private static final long z = 52428800;
    private final java.lang.String a;
    private final com.bugfender.sdk.b1 c;
    private final java.util.concurrent.ExecutorService d;
    private final java.util.concurrent.ExecutorService e;
    private final com.bugfender.sdk.z2 f;
    private final java.lang.String g;
    private final java.lang.String h;
    private final com.bugfender.sdk.r1 i;
    private final com.bugfender.sdk.c0 j;
    private final com.bugfender.sdk.x<java.lang.String> k;
    private final com.bugfender.sdk.a2 l;
    private final com.bugfender.sdk.x2 m;
    private final com.bugfender.sdk.o1 n;
    private final com.bugfender.sdk.e3 o;
    private com.bugfender.sdk.s p;
    private volatile com.bugfender.sdk.y q;
    private com.bugfender.sdk.k2 r;
    private final java.util.List<java.util.concurrent.Callable<?>> v;
    private volatile boolean s = false;
    private volatile boolean t = false;
    private volatile boolean u = false;
    private long w = A;
    private java.util.concurrent.atomic.AtomicLong x = new java.util.concurrent.atomic.AtomicLong();
    private final java.util.concurrent.ScheduledExecutorService b = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();

    class a implements com.bugfender.sdk.b1.c {
        a() {
        }

        @Override // com.bugfender.sdk.b1.c
        public void a(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor, boolean z) {
            com.bugfender.sdk.k1 k1Var = com.bugfender.sdk.k1.this;
            threadPoolExecutor.submit(k1Var.a(k1Var.b(com.bugfender.sdk.e1.c.D, "bf_log_memory_pressure", "Bugfender received a memory warning. New incoming logs will be discarded until the logs pending to be processed are reduced.")));
        }
    }

    class b implements com.bugfender.sdk.q<java.lang.Boolean> {
        final /* synthetic */ com.bugfender.sdk.z0 a;

        b(com.bugfender.sdk.z0 z0Var) {
            this.a = z0Var;
        }

        @Override // com.bugfender.sdk.q
        public void a(java.lang.Boolean bool) {
            if (bool.booleanValue()) {
                com.bugfender.sdk.k1.this.a((java.util.concurrent.Callable<?>) com.bugfender.sdk.k1.this.a(new com.bugfender.sdk.e1.b().c("bf_key_value").d("Set device data \"" + this.a.a() + "\"=\"" + this.a.b() + "\"").b("").a(new java.util.Date()).a(com.bugfender.sdk.k1.this.x.getAndIncrement()).a("").a(com.bugfender.sdk.e1.c.D.a()).b(0).a()));
            }
        }

        @Override // com.bugfender.sdk.q
        public void a(java.lang.Throwable th) {
            com.bugfender.sdk.d1.a(com.bugfender.sdk.k1.G, "Set device data \"" + this.a.a() + "\"=\"" + this.a.b() + "\" failed", th);
        }
    }

    class c implements java.lang.Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bugfender.sdk.k1.this.p == null) {
                com.bugfender.sdk.t1<java.lang.String> t1VarF = com.bugfender.sdk.k1.this.i.f();
                com.bugfender.sdk.k1.this.p = com.bugfender.sdk.s.a(t1VarF);
            }
        }
    }

    class d implements com.bugfender.sdk.q<com.bugfender.sdk.y> {
        d() {
        }

        @Override // com.bugfender.sdk.q
        public void a(com.bugfender.sdk.y yVar) {
            com.bugfender.sdk.k1.this.q = new com.bugfender.sdk.y.b(yVar).a();
        }

        @Override // com.bugfender.sdk.q
        public void a(java.lang.Throwable th) {
            if (th instanceof com.bugfender.sdk.g) {
                com.bugfender.sdk.k1.this.n();
            } else if (com.bugfender.sdk.k1.this.q == null) {
                com.bugfender.sdk.k1.this.q = com.bugfender.sdk.y.d;
            }
        }
    }

    class e implements java.lang.Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    class f implements java.lang.Runnable {
        final /* synthetic */ com.bugfender.sdk.k2 a;

        class a extends com.bugfender.sdk.z2.b {
            a() {
            }

            private void a(com.bugfender.sdk.q1<?> q1Var) throws com.bugfender.sdk.p1 {
                if (q1Var.b() instanceof com.bugfender.sdk.j) {
                    com.bugfender.sdk.k1.this.q = com.bugfender.sdk.y.d;
                } else if (q1Var.b() instanceof com.bugfender.sdk.k) {
                    throw new com.bugfender.sdk.p1();
                }
            }

            @Override // com.bugfender.sdk.z2.b
            protected void a(long j) {
                com.bugfender.sdk.k1.this.f.a();
                com.bugfender.sdk.k1.this.f.a(j, new com.bugfender.sdk.z2.a(this));
            }

            @Override // com.bugfender.sdk.z2.b
            public void b() throws java.lang.Exception {
                boolean z = com.bugfender.sdk.k1.this.q != null && com.bugfender.sdk.k1.this.q.c();
                boolean zA = com.bugfender.sdk.k1.this.l.a();
                if ((zA && z) || (zA && com.bugfender.sdk.k1.this.t)) {
                    a((com.bugfender.sdk.q1<?>) com.bugfender.sdk.k1.this.l().get());
                    a((com.bugfender.sdk.q1<?>) com.bugfender.sdk.k1.this.m().get());
                }
                if (zA) {
                    a((com.bugfender.sdk.q1<?>) com.bugfender.sdk.k1.this.k().get());
                    a((com.bugfender.sdk.q1<?>) com.bugfender.sdk.k1.this.j().get());
                    a((com.bugfender.sdk.q1<?>) com.bugfender.sdk.k1.this.i().get());
                }
            }
        }

        class b implements java.lang.Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.bugfender.sdk.k1.this.h();
            }
        }

        class c implements java.lang.Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.bugfender.sdk.k1.this.a();
            }
        }

        f(com.bugfender.sdk.k2 k2Var) {
            this.a = k2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                java.util.concurrent.Future futureG = com.bugfender.sdk.k1.this.g();
                com.bugfender.sdk.k1.this.q = (com.bugfender.sdk.y) futureG.get(60L, java.util.concurrent.TimeUnit.SECONDS);
            } catch (com.bugfender.sdk.g | java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
                if (e.getCause() instanceof com.bugfender.sdk.g) {
                    com.bugfender.sdk.k1.this.n();
                } else {
                    com.bugfender.sdk.k1.this.q = com.bugfender.sdk.y.d;
                }
            }
            try {
                zBooleanValue = ((java.lang.Boolean) com.bugfender.sdk.k1.this.b(this.a).get()).booleanValue();
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e2) {
                com.bugfender.sdk.d1.a(e2);
                zBooleanValue = false;
            }
            if (20221114 < com.bugfender.sdk.k1.this.q.a()) {
                com.bugfender.sdk.d1.a(com.bugfender.sdk.k1.G, "There's a new Bugfender SDK version. Please check bugfender.com.");
            }
            if (!zBooleanValue) {
                com.bugfender.sdk.k1.this.s = false;
                com.bugfender.sdk.d1.b(com.bugfender.sdk.k1.G, "Bugfender SDK initialization has failed.");
                return;
            }
            try {
                com.bugfender.sdk.k1.this.j().get();
                com.bugfender.sdk.k1.this.c().get();
                if (com.bugfender.sdk.k1.this.l.a() && com.bugfender.sdk.k1.this.q.c()) {
                    com.bugfender.sdk.k1.this.m().get();
                }
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e3) {
                com.bugfender.sdk.d1.a(e3);
            }
            com.bugfender.sdk.k1.this.f.a(com.bugfender.sdk.z2.b, new com.bugfender.sdk.k1.f.a());
            com.bugfender.sdk.k1.this.b.scheduleWithFixedDelay(new com.bugfender.sdk.k1.f.b(), 5L, 10L, java.util.concurrent.TimeUnit.SECONDS);
            com.bugfender.sdk.k1.this.b.scheduleWithFixedDelay(new com.bugfender.sdk.k1.f.c(), 0L, 5L, java.util.concurrent.TimeUnit.MINUTES);
            com.bugfender.sdk.k1.this.a(new com.bugfender.sdk.z0(com.bugfender.sdk.k1.E, com.bugfender.sdk.k1.this.m.n()));
            com.bugfender.sdk.k1.this.a(new com.bugfender.sdk.z0(com.bugfender.sdk.k1.F, com.bugfender.sdk.k1.this.m.j()));
            com.bugfender.sdk.k1.this.s = true;
        }
    }

    public k1(java.lang.String str, com.bugfender.sdk.r1 r1Var, com.bugfender.sdk.c0 c0Var, com.bugfender.sdk.o1 o1Var, com.bugfender.sdk.x<java.lang.String> xVar, com.bugfender.sdk.a2 a2Var, com.bugfender.sdk.x2 x2Var, com.bugfender.sdk.e3 e3Var, java.lang.String str2) {
        this.g = str;
        this.i = r1Var;
        this.j = c0Var;
        this.k = xVar;
        this.l = a2Var;
        this.m = x2Var;
        this.n = o1Var;
        this.o = e3Var;
        this.h = str2;
        java.util.concurrent.ExecutorService executorServiceNewFixedThreadPool = java.util.concurrent.Executors.newFixedThreadPool(1);
        this.d = executorServiceNewFixedThreadPool;
        this.c = new com.bugfender.sdk.b1((java.util.concurrent.ThreadPoolExecutor) executorServiceNewFixedThreadPool, 5000, 20, new com.bugfender.sdk.k1.a());
        this.e = java.util.concurrent.Executors.newFixedThreadPool(1);
        this.f = new com.bugfender.sdk.z2();
        this.v = new java.util.concurrent.CopyOnWriteArrayList();
        this.a = u();
        a(str);
    }

    private com.bugfender.sdk.k2 a(java.lang.String str, long j) {
        return new com.bugfender.sdk.k2.a().b(j).a(new com.bugfender.sdk.f(new com.bugfender.sdk.e(str), this.m.a(), this.m.h())).a(this.m.d()).a(q()).a(this.m.o()).a(this.m.m()).a(this.m.b()).b(this.m.q()).c(this.m.f()).c(this.m.g()).e(this.m.s()).e(this.m.l()).a(new java.util.Date()).d(com.bugfender.sdk.c3.b(java.util.UUID.fromString(r())).toString()).a();
    }

    private java.lang.StackTraceElement a(java.lang.StackTraceElement[] stackTraceElementArr) {
        if (this.a != null) {
            if (stackTraceElementArr.length > 4) {
                for (int i = 4; i < stackTraceElementArr.length; i++) {
                    java.lang.StackTraceElement stackTraceElement = stackTraceElementArr[i];
                    if (!stackTraceElement.getClassName().startsWith(this.a)) {
                        return stackTraceElement;
                    }
                }
            }
        }
        return null;
    }

    private java.util.UUID a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.util.UUID uuidA = com.bugfender.sdk.d3.a(r());
        com.bugfender.sdk.u0 u0VarA = com.bugfender.sdk.u0.a().a(uuidA).c(str).b(str2).d(str3).a();
        a(new com.bugfender.sdk.d(this.i, new com.bugfender.sdk.m0(this.i), u0VarA, this.n, new com.bugfender.sdk.l0(), this.x, this.q));
        a(com.bugfender.sdk.e1.c.F, str4, uuidA.toString());
        return uuidA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.concurrent.Callable<java.lang.Boolean> a(com.bugfender.sdk.e1 e1Var) {
        return new com.bugfender.sdk.d(this.i, new com.bugfender.sdk.n0(this.i), e1Var, this.n, new com.bugfender.sdk.o0(), this.x, this.q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.e.submit(new com.bugfender.sdk.a0(this.n, q(), this.k, new com.bugfender.sdk.k1.d()));
    }

    private void a(com.bugfender.sdk.e1.c cVar, java.lang.String str, java.lang.String str2) {
        a(a(b(cVar, str, str2)));
    }

    private void a(com.bugfender.sdk.k2 k2Var) {
        java.util.concurrent.ThreadPoolExecutor.DiscardPolicy discardPolicy = new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy();
        ((java.util.concurrent.ThreadPoolExecutor) this.e).setRejectedExecutionHandler(discardPolicy);
        ((java.util.concurrent.ThreadPoolExecutor) this.d).setRejectedExecutionHandler(discardPolicy);
        this.b.execute(new com.bugfender.sdk.k1.f(k2Var));
    }

    private void a(java.lang.String str) {
        com.bugfender.sdk.k2 k2VarA = a(str, java.lang.System.currentTimeMillis());
        this.r = k2VarA;
        a(k2VarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.util.concurrent.Callable<?> callable) {
        if (this.s) {
            if (this.v.size() > 0) {
                x();
            }
            this.c.a(callable);
        } else {
            this.v.add(callable);
            if (this.v.size() > 500) {
                this.v.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bugfender.sdk.e1 b(com.bugfender.sdk.e1.c cVar, java.lang.String str, java.lang.String str2) {
        java.util.Map<java.lang.Integer, java.lang.String> mapT = t();
        java.util.Date date = new java.util.Date(java.lang.System.currentTimeMillis());
        java.lang.String name = java.lang.Thread.currentThread().getName();
        return new com.bugfender.sdk.e1.b().c(str).d(str2).b(mapT.get(0)).a(date).a(this.x.getAndIncrement()).a(mapT.get(1)).a(cVar.a()).b(java.lang.Integer.valueOf(mapT.get(2)).intValue()).f(name).e(java.lang.String.valueOf(java.lang.Thread.currentThread().getId())).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.concurrent.Future<java.lang.Boolean> b(com.bugfender.sdk.k2 k2Var) {
        return this.c.a(new com.bugfender.sdk.t0(this.i, k2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.concurrent.Future<java.lang.Boolean> c() {
        return this.e.submit(new com.bugfender.sdk.r(this.i, this.j, this.w, this.x));
    }

    private void d() {
        f();
        e();
    }

    private void e() {
        this.c.a(new com.bugfender.sdk.u(this.i));
    }

    private void f() {
        this.c.a(new com.bugfender.sdk.v(this.i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.concurrent.Future<com.bugfender.sdk.y> g() {
        return this.e.submit(new com.bugfender.sdk.z(this.n, q(), this.k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.v.size() > 0) {
            x();
        }
        d();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.concurrent.Future<com.bugfender.sdk.q1<java.lang.Boolean>> i() {
        return this.e.submit(new com.bugfender.sdk.f2(this.n, this.k, q()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.concurrent.Future<com.bugfender.sdk.q1<java.lang.Integer>> j() {
        return this.e.submit(new com.bugfender.sdk.g2(this.i, this.n, this.g, this.m, this.q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.concurrent.Future<com.bugfender.sdk.q1<java.lang.Boolean>> k() {
        return this.e.submit(new com.bugfender.sdk.h2(this.i, this.n, this.g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.concurrent.Future<com.bugfender.sdk.q1<java.lang.Boolean>> l() {
        return this.e.submit(new com.bugfender.sdk.i2(this.i, this.n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.concurrent.Future<com.bugfender.sdk.q1<java.lang.Boolean>> m() {
        return this.e.submit(new com.bugfender.sdk.j2(this.n, this.i, this.g, new com.bugfender.sdk.g2(this.i, this.n, this.g, this.m, this.q)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.c.b();
        this.e.shutdown();
        this.b.shutdown();
    }

    private void o() {
        this.q = new com.bugfender.sdk.y.b(this.q).a(true).a();
        if (this.s) {
            d();
            l();
            k();
            j();
        }
    }

    private com.bugfender.sdk.w q() {
        return new com.bugfender.sdk.w.b().j(this.m.e()).e(this.m.a(this.h)).c(this.m.i()).f(this.m.q()).k(this.m.a()).b(this.m.h()).d(this.m.m()).i(this.m.l()).g(this.m.g()).b(this.m.p()).a(this.m.c()).a(this.g).h(java.lang.String.valueOf(com.bugfender.android.BuildConfig.VERSION_CODE)).a(this.m.k()).a();
    }

    private java.util.Map<java.lang.Integer, java.lang.String> t() {
        java.lang.StackTraceElement[] stackTrace;
        java.lang.StackTraceElement stackTraceElementA;
        java.util.HashMap map = new java.util.HashMap(3);
        map.put(0, "");
        map.put(1, "");
        map.put(2, java.lang.String.valueOf(0));
        if (!this.u && ((stackTraceElementA = a((stackTrace = java.lang.Thread.currentThread().getStackTrace()))) != null || stackTrace.length >= 6)) {
            if (stackTraceElementA == null) {
                stackTraceElementA = stackTrace[6];
            }
            java.lang.String fileName = stackTraceElementA.getFileName();
            map.put(0, stackTraceElementA.getClassName() + "." + stackTraceElementA.getMethodName());
            map.put(1, fileName);
            map.put(2, java.lang.String.valueOf(stackTraceElementA.getLineNumber()));
        }
        return map;
    }

    private java.lang.String u() {
        if (getClass().getPackage() == null) {
            return null;
        }
        java.lang.String[] strArrSplit = getClass().getPackage().getName().split(java.util.regex.Pattern.quote("."));
        if (strArrSplit.length <= 1) {
            return strArrSplit[0];
        }
        return strArrSplit[0] + "." + strArrSplit[1];
    }

    private void x() {
        java.util.Iterator<java.util.concurrent.Callable<?>> it = this.v.iterator();
        while (it.hasNext()) {
            this.c.a(it.next());
        }
        this.v.clear();
    }

    public void a(int i, java.lang.String str, java.lang.String str2, com.bugfender.sdk.e1.c cVar, java.lang.String str3, java.lang.String str4) {
        a(a(new com.bugfender.sdk.e1.b().c(str3).d(str4).b(str).a(new java.util.Date()).a(this.x.getAndIncrement()).a(str2).a(cVar.a()).b(i).e(java.lang.String.valueOf(java.lang.Thread.currentThread().getId())).f(java.lang.Thread.currentThread().getName()).a()));
    }

    public void a(long j) {
        long j2 = z;
        if (j <= z) {
            j2 = 1048576;
            if (j >= 1048576) {
                this.w = j;
                return;
            }
        }
        this.w = j2;
    }

    public <T> void a(com.bugfender.sdk.z0<T> z0Var) {
        this.e.submit(new com.bugfender.sdk.o2(this.k, z0Var, new com.bugfender.sdk.k1.b(z0Var)));
    }

    public void a(java.lang.String str, java.lang.String str2) {
        a(com.bugfender.sdk.e1.c.D, str, str2);
    }

    public void a(boolean z2) {
        this.u = z2;
    }

    public void b() {
        this.b.submit(new com.bugfender.sdk.k1.c());
    }

    public void b(java.lang.String str) {
        this.e.submit(new com.bugfender.sdk.c2(this.k, this.n, q(), str));
    }

    public void b(java.lang.String str, java.lang.String str2) {
        a(com.bugfender.sdk.e1.c.E, str, str2);
    }

    public void b(boolean z2) {
        this.t = z2;
        if (z2 && this.l.a()) {
            o();
        }
    }

    public void c(java.lang.String str, java.lang.String str2) {
        a(com.bugfender.sdk.e1.c.F, str, str2);
    }

    public void d(java.lang.String str, java.lang.String str2) {
        a(com.bugfender.sdk.e1.c.I, str, str2);
    }

    public java.net.URL e(java.lang.String str, java.lang.String str2) {
        return this.o.b(a(str, str2, "crash", "bf_issue").toString());
    }

    public java.util.UUID f(java.lang.String str, java.lang.String str2) {
        return a(str, str2, (java.lang.String) null, "bf_issue");
    }

    public java.net.URL g(java.lang.String str, java.lang.String str2) {
        return this.o.b(f(str, str2).toString());
    }

    public java.util.UUID h(java.lang.String str, java.lang.String str2) {
        return a(str, str2, "user-feedback", "bf_issue");
    }

    public java.net.URL i(java.lang.String str, java.lang.String str2) {
        return this.o.b(h(str, str2).toString());
    }

    public void j(java.lang.String str, java.lang.String str2) {
        a(com.bugfender.sdk.e1.c.T, str, str2);
    }

    public void k(java.lang.String str, java.lang.String str2) {
        a(com.bugfender.sdk.e1.c.W, str, str2);
    }

    public void p() {
        if (this.l.a()) {
            o();
        }
    }

    public java.lang.String r() {
        return this.m.e();
    }

    public java.net.URL s() {
        return this.o.a(r());
    }

    public java.lang.String v() {
        com.bugfender.sdk.k2 k2Var = this.r;
        if (k2Var != null) {
            return k2Var.l();
        }
        return null;
    }

    public java.net.URL w() {
        java.lang.String strV = v();
        if (strV != null) {
            return this.o.c(strV);
        }
        return null;
    }
}
