package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements com.bugfender.sdk.g0<com.bugfender.sdk.p1> {
    @Override // com.bugfender.sdk.g0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.bugfender.sdk.h of(com.bugfender.sdk.p1 p1Var) {
        try {
            int iA = p1Var.a();
            if (iA != -1007) {
                return iA != -1004 ? new com.bugfender.sdk.k(p1Var) : new com.bugfender.sdk.g(p1Var.getMessage());
            }
            return new com.bugfender.sdk.j(p1Var.getMessage());
        } catch (java.lang.Exception e) {
            return new com.bugfender.sdk.l(e);
        }
    }
}
