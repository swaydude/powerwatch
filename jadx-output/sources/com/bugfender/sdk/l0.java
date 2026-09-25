package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class l0 implements com.bugfender.sdk.k0<com.bugfender.sdk.u0> {
    @Override // com.bugfender.sdk.k0
    public com.bugfender.sdk.u0 a(com.bugfender.sdk.u0 u0Var) {
        if (!com.bugfender.sdk.f0.a(u0Var.e())) {
            return u0Var;
        }
        com.bugfender.sdk.d1.a(com.bugfender.sdk.k1.G, "Issue reached maximum string size and it was trimmed");
        return com.bugfender.sdk.u0.a().b(com.bugfender.sdk.f0.b(u0Var.e())).a(u0Var.b()).a(u0Var.c()).a(u0Var.d().longValue()).c(u0Var.f()).d(u0Var.g()).a(u0Var.h()).a();
    }
}
