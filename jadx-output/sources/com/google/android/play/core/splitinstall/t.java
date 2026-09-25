package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
final class t extends com.google.android.play.core.internal.r {
    private final /* synthetic */ java.util.Collection a;
    private final /* synthetic */ java.util.Collection b;
    private final /* synthetic */ com.google.android.play.core.tasks.h c;
    private final /* synthetic */ com.google.android.play.core.splitinstall.r d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(com.google.android.play.core.splitinstall.r rVar, com.google.android.play.core.tasks.h hVar, java.util.Collection collection, java.util.Collection collection2, com.google.android.play.core.tasks.h hVar2) {
        super(hVar);
        this.d = rVar;
        this.a = collection;
        this.b = collection2;
        this.c = hVar2;
    }

    @Override // com.google.android.play.core.internal.r
    protected final void a() {
        java.util.ArrayList arrayListD = com.google.android.play.core.splitinstall.r.d((java.util.Collection<java.lang.String>) this.a);
        arrayListD.addAll(com.google.android.play.core.splitinstall.r.c((java.util.Collection<java.lang.String>) this.b));
        try {
            ((com.google.android.play.core.internal.bc) this.d.a.b()).a(this.d.d, arrayListD, com.google.android.play.core.splitinstall.r.d(), new com.google.android.play.core.splitinstall.ag(this.d, this.c));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.splitinstall.r.b.a(e, "startInstall(%s,%s)", this.a, this.b);
            this.c.a((java.lang.Exception) new java.lang.RuntimeException(e));
        }
    }
}
