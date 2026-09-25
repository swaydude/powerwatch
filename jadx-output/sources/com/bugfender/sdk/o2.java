package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class o2<T> implements java.lang.Runnable {
    private final com.bugfender.sdk.x<java.lang.String> a;
    private final com.bugfender.sdk.z0<T> b;
    private final com.bugfender.sdk.q<java.lang.Boolean> c;

    public o2(com.bugfender.sdk.x<java.lang.String> xVar, com.bugfender.sdk.z0<T> z0Var, com.bugfender.sdk.q<java.lang.Boolean> qVar) {
        this.a = xVar;
        this.b = z0Var;
        this.c = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zA;
        try {
            if (this.b.b() instanceof java.lang.Float) {
                zA = this.a.a(this.b.a(), (java.lang.Float) this.b.b());
            } else if (this.b.b() instanceof java.lang.Integer) {
                zA = this.a.a(this.b.a(), (java.lang.Integer) this.b.b());
            } else if (this.b.b() instanceof java.lang.String) {
                zA = this.a.a(this.b.a(), (java.lang.String) this.b.b());
            } else {
                zA = this.b.b() instanceof java.lang.Boolean ? this.a.a(this.b.a(), (java.lang.Boolean) this.b.b()) : false;
            }
            this.c.a(java.lang.Boolean.valueOf(zA));
        } catch (java.lang.Throwable th) {
            this.c.a(th);
        }
    }
}
