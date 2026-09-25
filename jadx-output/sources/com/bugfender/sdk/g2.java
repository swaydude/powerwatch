package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class g2 implements java.util.concurrent.Callable<com.bugfender.sdk.q1<java.lang.Integer>> {
    private final com.bugfender.sdk.r1 a;
    private final com.bugfender.sdk.o1 b;
    private final java.lang.String c;
    private final com.bugfender.sdk.y d;
    private final com.bugfender.sdk.x2 e;

    public g2(com.bugfender.sdk.r1 r1Var, com.bugfender.sdk.o1 o1Var, java.lang.String str, com.bugfender.sdk.x2 x2Var, com.bugfender.sdk.y yVar) {
        this.a = r1Var;
        this.b = o1Var;
        this.c = str;
        this.d = yVar;
        this.e = x2Var;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.bugfender.sdk.q1<java.lang.Integer> call() throws java.lang.Exception {
        int iIntValue = 0;
        if (this.d.b()) {
            for (com.bugfender.sdk.k2 k2Var : this.a.a()) {
                try {
                    com.bugfender.sdk.q1<java.lang.Integer> q1VarA = a(k2Var, this.a.c(k2Var).b().a());
                    if (q1VarA.a().intValue() > 0) {
                        new com.bugfender.sdk.j2(this.b, this.a, this.c, (java.util.List<com.bugfender.sdk.k2>) java.util.Collections.singletonList(k2Var)).call();
                    }
                    iIntValue += q1VarA.a().intValue();
                } catch (com.bugfender.sdk.u1 unused) {
                }
            }
        }
        return new com.bugfender.sdk.q1<>(java.lang.Integer.valueOf(iIntValue));
    }

    public com.bugfender.sdk.q1<java.lang.Integer> a(com.bugfender.sdk.k2 k2Var, java.util.List<java.lang.String> list) throws java.lang.Exception {
        int i = 0;
        if (list.size() > 0) {
            if (k2Var.k() <= 0) {
                try {
                    long jA = this.b.a(k2Var);
                    k2Var.a(jA);
                    this.a.a(k2Var.f(), jA);
                } catch (com.bugfender.sdk.h unused) {
                    return new com.bugfender.sdk.q1<>(0);
                }
            }
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                try {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(it.next());
                        java.lang.String strOptString = jSONObject.optString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "Crash Report");
                        java.lang.String strOptString2 = jSONObject.optString("raw", "{}");
                        java.lang.String strOptString3 = jSONObject.optString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "");
                        long jOptLong = jSONObject.optLong("date", new java.util.Date().getTime());
                        java.util.UUID uuidA = com.bugfender.sdk.d3.a(this.e.e());
                        this.b.a(java.util.Collections.singletonList(new com.bugfender.sdk.e1.b().a(com.bugfender.sdk.e1.c.D.a()).c("bf_issue").d(uuidA.toString()).a(new java.util.Date(jOptLong)).a()), k2Var);
                        this.b.a(com.bugfender.sdk.u0.a().a(uuidA).c(strOptString).a(strOptString2).b(strOptString3).a(k2Var.k()).a(new com.bugfender.sdk.e(this.c)).d("crash").a(), k2Var);
                        i++;
                    } catch (org.json.JSONException e) {
                        com.bugfender.sdk.d1.a(e);
                    }
                    this.a.b(k2Var.f());
                } catch (java.lang.Throwable th) {
                    this.a.b(k2Var.f());
                    throw th;
                }
            }
        }
        return new com.bugfender.sdk.q1<>(java.lang.Integer.valueOf(i));
    }
}
