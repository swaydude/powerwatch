package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class f {
    private com.bugfender.sdk.e a;
    private java.lang.String b;
    private java.lang.String c;

    public f(com.bugfender.sdk.e eVar, java.lang.String str, java.lang.String str2) {
        a(eVar, str, str2);
        this.a = eVar;
        this.b = str;
        this.c = str2;
    }

    private void a(com.bugfender.sdk.e eVar, java.lang.String str, java.lang.String str2) {
        com.bugfender.sdk.w1.a(eVar, "Application must be not null");
        com.bugfender.sdk.w1.a(str, "Version name must be not null");
        com.bugfender.sdk.w1.a(str2, "Version code must be not null");
    }

    public static com.bugfender.sdk.f b(com.bugfender.sdk.e eVar, java.lang.String str, java.lang.String str2) {
        return new com.bugfender.sdk.f(eVar, str, str2);
    }

    public com.bugfender.sdk.e a() {
        return this.a;
    }

    public java.lang.String b() {
        return this.c;
    }

    public java.lang.String c() {
        return this.b;
    }
}
