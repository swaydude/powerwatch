package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class j0 {
    public com.bugfender.sdk.e3 a(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = com.bugfender.android.BuildConfig.BUGFENDER_BASE_URL;
        }
        return new com.bugfender.sdk.e3(str, str2);
    }

    public com.bugfender.sdk.f1 a(com.bugfender.sdk.g1 g1Var) {
        return new com.bugfender.sdk.f1(g1Var);
    }

    public com.bugfender.sdk.l2 a(com.bugfender.sdk.n2 n2Var) {
        return new com.bugfender.sdk.l2(n2Var);
    }

    public com.bugfender.sdk.r1 a(android.content.Context context, com.bugfender.sdk.g1 g1Var, com.bugfender.sdk.f1 f1Var, com.bugfender.sdk.n2 n2Var, com.bugfender.sdk.l2 l2Var, com.bugfender.sdk.x0 x0Var, com.bugfender.sdk.v0 v0Var, com.bugfender.sdk.c0 c0Var) {
        return new com.bugfender.sdk.s1(context, n2Var, l2Var, g1Var, f1Var, x0Var, v0Var, c0Var);
    }

    public com.bugfender.sdk.v0 a(com.bugfender.sdk.x0 x0Var) {
        return new com.bugfender.sdk.v0(x0Var);
    }

    public com.bugfender.sdk.x0 a() {
        return new com.bugfender.sdk.x0();
    }

    public com.bugfender.sdk.x2 a(android.content.Context context, com.bugfender.sdk.z1 z1Var, android.content.SharedPreferences sharedPreferences) {
        return new com.bugfender.sdk.y2(context, z1Var, sharedPreferences);
    }

    public com.bugfender.sdk.x<java.lang.String> a(android.content.Context context) {
        return new com.bugfender.sdk.p2(context);
    }

    public com.bugfender.sdk.g1 b() {
        return new com.bugfender.sdk.g1();
    }

    public com.bugfender.sdk.z1 b(android.content.Context context) {
        return new com.bugfender.sdk.z1(context);
    }

    public com.bugfender.sdk.a2 c(android.content.Context context) {
        return new com.bugfender.sdk.b2(context);
    }

    public com.bugfender.sdk.m1 c() {
        return new com.bugfender.sdk.n1();
    }

    public android.content.SharedPreferences d(android.content.Context context) {
        return context.getSharedPreferences("bugfender.preferences", 0);
    }

    public com.bugfender.sdk.c0 d() {
        return new com.bugfender.sdk.c0();
    }

    public com.bugfender.sdk.n2 e() {
        return new com.bugfender.sdk.n2();
    }
}
