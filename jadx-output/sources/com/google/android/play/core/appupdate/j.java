package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes2.dex */
final class j extends com.google.android.play.core.appupdate.g<java.lang.Void> {
    j(com.google.android.play.core.appupdate.c cVar, com.google.android.play.core.tasks.h<java.lang.Void> hVar) {
        super(cVar, new com.google.android.play.core.splitcompat.a("OnCompleteUpdateCallback"), hVar);
    }

    @Override // com.google.android.play.core.appupdate.g, com.google.android.play.core.internal.p
    public final void b(android.os.Bundle bundle) throws android.os.RemoteException {
        super.b(bundle);
        if (com.google.android.play.core.appupdate.c.b(bundle) != 0) {
            this.a.a(new com.google.android.play.core.install.InstallException(com.google.android.play.core.appupdate.c.b(bundle)));
        } else {
            this.a.a((java.lang.Object) null);
        }
    }
}
