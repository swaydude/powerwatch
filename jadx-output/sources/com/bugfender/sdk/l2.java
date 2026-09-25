package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class l2 implements com.bugfender.sdk.a<java.io.File, com.bugfender.sdk.k2> {
    private com.bugfender.sdk.a<com.bugfender.sdk.k2, java.lang.String> a;

    public l2(com.bugfender.sdk.a<com.bugfender.sdk.k2, java.lang.String> aVar) {
        this.a = aVar;
    }

    @Override // com.bugfender.sdk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.bugfender.sdk.k2 b(java.io.File file) {
        try {
            return this.a.a(com.bugfender.sdk.h0.a(file));
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // com.bugfender.sdk.a
    public java.io.File a(com.bugfender.sdk.k2 k2Var) {
        throw new java.lang.UnsupportedOperationException("from(Session value) not supported");
    }
}
