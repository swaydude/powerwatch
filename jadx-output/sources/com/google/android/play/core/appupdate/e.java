package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes2.dex */
final class e extends com.google.android.play.core.internal.r {
    private final /* synthetic */ java.lang.String a;
    private final /* synthetic */ com.google.android.play.core.tasks.h b;
    private final /* synthetic */ com.google.android.play.core.appupdate.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(com.google.android.play.core.appupdate.c cVar, com.google.android.play.core.tasks.h hVar, java.lang.String str, com.google.android.play.core.tasks.h hVar2) {
        super(hVar);
        this.c = cVar;
        this.a = str;
        this.b = hVar2;
    }

    @Override // com.google.android.play.core.internal.r
    protected final void a() {
        try {
            ((com.google.android.play.core.internal.l) this.c.a.b()).a(this.c.d, this.c.c(this.a), new com.google.android.play.core.appupdate.i(this.c, this.b, this.a));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.appupdate.c.b.a(e, "requestUpdateInfo(%s)", this.a);
            this.b.a((java.lang.Exception) new java.lang.RuntimeException(e));
        }
    }
}
