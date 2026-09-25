package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class s {
    private final com.bugfender.sdk.t1<java.lang.String> a;

    public s(com.bugfender.sdk.t1<java.lang.String> t1Var) {
        com.bugfender.sdk.o oVarA = a(this, java.lang.Thread.getDefaultUncaughtExceptionHandler());
        this.a = t1Var;
        a(oVarA);
    }

    private static com.bugfender.sdk.o a(com.bugfender.sdk.s sVar, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        return new com.bugfender.sdk.o(sVar, uncaughtExceptionHandler);
    }

    public static com.bugfender.sdk.s a(com.bugfender.sdk.t1<java.lang.String> t1Var) {
        return new com.bugfender.sdk.s(t1Var);
    }

    private static void a(com.bugfender.sdk.o oVar) {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(oVar);
    }

    public void a(com.bugfender.sdk.t tVar) {
        this.a.a(tVar.e());
        this.a.d();
    }
}
