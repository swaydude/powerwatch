package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes2.dex */
final class i extends com.google.android.play.core.appupdate.g<com.google.android.play.core.appupdate.AppUpdateInfo> {
    private final java.lang.String b;

    i(com.google.android.play.core.appupdate.c cVar, com.google.android.play.core.tasks.h<com.google.android.play.core.appupdate.AppUpdateInfo> hVar, java.lang.String str) {
        super(cVar, new com.google.android.play.core.splitcompat.a("OnRequestInstallCallback"), hVar);
        this.b = str;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.play.core.appupdate.g, com.google.android.play.core.internal.p
    public final void a(android.os.Bundle bundle) throws android.os.RemoteException {
        super.a(bundle);
        if (com.google.android.play.core.appupdate.c.b(bundle) == 0 || com.google.android.play.core.appupdate.c.b(bundle) == 1) {
            this.a.a((T) com.google.android.play.core.appupdate.c.b(bundle, this.b));
        } else {
            this.a.a(new com.google.android.play.core.install.InstallException(com.google.android.play.core.appupdate.c.b(bundle)));
        }
    }
}
