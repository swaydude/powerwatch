package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class a0 implements java.lang.Runnable {
    private com.bugfender.sdk.o1 a;
    private com.bugfender.sdk.w b;
    private final com.bugfender.sdk.x<java.lang.String> c;
    private com.bugfender.sdk.q<com.bugfender.sdk.y> d;

    public a0(com.bugfender.sdk.o1 o1Var, com.bugfender.sdk.w wVar, com.bugfender.sdk.x<java.lang.String> xVar, com.bugfender.sdk.q<com.bugfender.sdk.y> qVar) {
        this.a = o1Var;
        this.b = wVar;
        this.c = xVar;
        this.d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.bugfender.sdk.y yVarA = this.a.a(this.b.a(), this.b, this.c.a(true));
            com.bugfender.sdk.q<com.bugfender.sdk.y> qVar = this.d;
            if (qVar != null) {
                qVar.a(yVarA);
            }
        } catch (com.bugfender.sdk.h e) {
            com.bugfender.sdk.q<com.bugfender.sdk.y> qVar2 = this.d;
            if (qVar2 != null) {
                qVar2.a(e);
            }
        }
    }
}
