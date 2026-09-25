package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements com.bugfender.sdk.f3 {
    public static final java.lang.String d = "Interaction";
    private final boolean a;
    private final boolean b;
    private com.bugfender.sdk.k1 c;

    public n(com.bugfender.sdk.k1 k1Var, boolean z, boolean z2) {
        this.c = k1Var;
        this.a = z;
        this.b = z2;
    }

    @Override // com.bugfender.sdk.f3
    public void a() {
        this.c = null;
    }

    public void a(java.lang.String str) {
        if (c()) {
            com.bugfender.sdk.d1.a(d, str);
        }
        if (this.b) {
            b().a(d, str);
        }
    }

    public com.bugfender.sdk.k1 b() {
        return this.c;
    }

    public boolean c() {
        return this.a;
    }
}
