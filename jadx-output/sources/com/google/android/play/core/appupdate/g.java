package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes2.dex */
class g<T> extends com.google.android.play.core.internal.o {
    final com.google.android.play.core.tasks.h<T> a;
    private final com.google.android.play.core.splitcompat.a b;
    private final /* synthetic */ com.google.android.play.core.appupdate.c c;

    g(com.google.android.play.core.appupdate.c cVar, com.google.android.play.core.splitcompat.a aVar, com.google.android.play.core.tasks.h<T> hVar) {
        this.c = cVar;
        this.b = aVar;
        this.a = hVar;
    }

    @Override // com.google.android.play.core.internal.p
    public void a(android.os.Bundle bundle) throws android.os.RemoteException {
        this.c.a.a();
        this.b.a("onRequestInfo", new java.lang.Object[0]);
    }

    @Override // com.google.android.play.core.internal.p
    public void b(android.os.Bundle bundle) throws android.os.RemoteException {
        this.c.a.a();
        this.b.a("onCompleteUpdate", new java.lang.Object[0]);
    }
}
