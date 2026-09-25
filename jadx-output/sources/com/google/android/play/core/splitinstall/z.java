package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
final class z extends com.google.android.play.core.internal.r {
    private final /* synthetic */ com.google.android.play.core.tasks.h a;
    private final /* synthetic */ com.google.android.play.core.splitinstall.r b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(com.google.android.play.core.splitinstall.r rVar, com.google.android.play.core.tasks.h hVar, com.google.android.play.core.tasks.h hVar2) {
        super(hVar);
        this.b = rVar;
        this.a = hVar2;
    }

    @Override // com.google.android.play.core.internal.r
    protected final void a() {
        try {
            ((com.google.android.play.core.internal.bc) this.b.a.b()).a(this.b.d, new com.google.android.play.core.splitinstall.ah(this.b, this.a));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.splitinstall.r.b.a(e, "getSessionStates", new java.lang.Object[0]);
            this.a.a((java.lang.Exception) new java.lang.RuntimeException(e));
        }
    }
}
