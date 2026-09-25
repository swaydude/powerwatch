package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
final class w extends com.google.android.play.core.internal.r {
    private final /* synthetic */ int a;
    private final /* synthetic */ com.google.android.play.core.tasks.h b;
    private final /* synthetic */ com.google.android.play.core.splitinstall.r c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(com.google.android.play.core.splitinstall.r rVar, com.google.android.play.core.tasks.h hVar, int i, com.google.android.play.core.tasks.h hVar2) {
        super(hVar);
        this.c = rVar;
        this.a = i;
        this.b = hVar2;
    }

    @Override // com.google.android.play.core.internal.r
    protected final void a() {
        try {
            ((com.google.android.play.core.internal.bc) this.c.a.b()).a(this.c.d, this.a, new com.google.android.play.core.splitinstall.ae(this.c, this.b));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.splitinstall.r.b.a(e, "getSessionState(%d)", java.lang.Integer.valueOf(this.a));
            this.b.a((java.lang.Exception) new java.lang.RuntimeException(e));
        }
    }
}
