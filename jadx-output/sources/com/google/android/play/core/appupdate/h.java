package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes2.dex */
final class h extends com.google.android.play.core.internal.r {
    private final /* synthetic */ com.google.android.play.core.tasks.h a;
    private final /* synthetic */ java.lang.String b;
    private final /* synthetic */ com.google.android.play.core.appupdate.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(com.google.android.play.core.appupdate.c cVar, com.google.android.play.core.tasks.h hVar, com.google.android.play.core.tasks.h hVar2, java.lang.String str) {
        super(hVar);
        this.c = cVar;
        this.a = hVar2;
        this.b = str;
    }

    @Override // com.google.android.play.core.internal.r
    protected final void a() {
        try {
            ((com.google.android.play.core.internal.l) this.c.a.b()).b(this.c.d, com.google.android.play.core.appupdate.c.c(), new com.google.android.play.core.appupdate.j(this.c, this.a));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.appupdate.c.b.a(e, "completeUpdate(%s)", this.b);
            this.a.a((java.lang.Exception) new java.lang.RuntimeException(e));
        }
    }
}
