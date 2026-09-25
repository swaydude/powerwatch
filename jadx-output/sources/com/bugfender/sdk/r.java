package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class r implements java.util.concurrent.Callable<java.lang.Boolean> {
    public static final java.util.regex.Pattern f = java.util.regex.Pattern.compile("\\{\"bf_start_date\":(\\d+),\"bf_end_date\":(\\d+)\\}");
    private final com.bugfender.sdk.r1 a;
    private final com.bugfender.sdk.c0 b;
    private final long c;
    private final com.bugfender.sdk.g1 d = new com.bugfender.sdk.g1();
    private final java.util.concurrent.atomic.AtomicLong e;

    public r(com.bugfender.sdk.r1 r1Var, com.bugfender.sdk.c0 c0Var, long j, java.util.concurrent.atomic.AtomicLong atomicLong) {
        this.a = r1Var;
        this.b = c0Var;
        this.c = j;
        this.e = atomicLong;
    }

    private void a(java.io.File file, java.lang.String str, java.lang.Long l) throws org.json.JSONException, java.io.IOException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
        java.lang.String line = bufferedReader.readLine();
        bufferedReader.close();
        if (l == null) {
            l = java.lang.Long.valueOf(this.d.a(line).b().getTime());
        }
        long time = this.d.a(str).b().getTime();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("bf_start_date", l);
        jSONObject.put("bf_end_date", time);
        java.lang.String strB = this.d.b(new com.bugfender.sdk.e1.b().a(this.e.getAndIncrement()).a(new java.util.Date()).a(com.bugfender.sdk.e1.c.D.a()).b(0).e("").f("").c("bf_gap_log").a("").d(jSONObject.toString()).a());
        this.b.c(file.length());
        this.b.a(com.bugfender.sdk.r2.b(strB));
        java.io.PrintWriter printWriter = new java.io.PrintWriter(file);
        printWriter.println(strB);
        printWriter.close();
    }

    private boolean a(com.bugfender.sdk.k2 k2Var, java.util.List<com.bugfender.sdk.k2> list) throws org.json.JSONException, java.io.IOException {
        com.bugfender.sdk.e1 e1VarA;
        for (com.bugfender.sdk.k2 k2Var2 : list) {
            long jF = k2Var2.f();
            java.util.List<java.io.File> listA = this.a.a(jF, com.bugfender.sdk.r1.a);
            if (!listA.isEmpty()) {
                java.io.File file = listA.get(0);
                com.bugfender.sdk.d2 d2Var = new com.bugfender.sdk.d2(file, com.bugfender.sdk.t2.a);
                java.lang.String strB = d2Var.b();
                d2Var.close();
                if (strB != null) {
                    if (!strB.equals("") && (e1VarA = this.d.a(strB)) != null) {
                        java.util.regex.Matcher matcher = f.matcher(e1VarA.h() != null ? e1VarA.h() : "");
                        if (!matcher.matches()) {
                            a(file, strB, null);
                            return true;
                        }
                        if (listA.size() > 1) {
                            a(listA.get(1), strB, java.lang.Long.valueOf(new java.util.Date(java.lang.Long.valueOf(matcher.group(1)).longValue()).getTime()));
                        } else {
                            try {
                                this.a.a(k2Var2).a();
                            } catch (com.bugfender.sdk.u1 unused) {
                            }
                            try {
                                this.a.c(k2Var2).a();
                            } catch (com.bugfender.sdk.u1 unused2) {
                            }
                        }
                    }
                }
                return this.a.a(file);
            }
            if (jF != k2Var.f()) {
                this.a.a(jF);
            }
        }
        b();
        return true;
    }

    private void b() {
        java.util.List<com.bugfender.sdk.k2> listA = this.a.a();
        if (listA.isEmpty()) {
            return;
        }
        this.a.a(listA.get(0).f());
    }

    private boolean c() {
        return this.a.g() >= this.c;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean call() throws java.lang.Exception {
        while (c()) {
            a(this.a.c(), this.a.b());
        }
        return java.lang.Boolean.TRUE;
    }
}
