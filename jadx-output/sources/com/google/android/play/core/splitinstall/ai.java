package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
class ai<T> extends com.google.android.play.core.internal.bf {
    final com.google.android.play.core.tasks.h<T> a;
    private final /* synthetic */ com.google.android.play.core.splitinstall.r b;

    ai(com.google.android.play.core.splitinstall.r rVar, com.google.android.play.core.tasks.h<T> hVar) {
        this.b = rVar;
        this.a = hVar;
    }

    @Override // com.google.android.play.core.internal.bd
    public final void a() throws android.os.RemoteException {
        this.b.a.a();
        com.google.android.play.core.splitinstall.r.b.a("onCompleteInstallForAppUpdate", new java.lang.Object[0]);
    }

    @Override // com.google.android.play.core.internal.bd
    public final void a(int i) throws android.os.RemoteException {
        this.b.a.a();
        com.google.android.play.core.splitinstall.r.b.a("onCompleteInstall(%d)", java.lang.Integer.valueOf(i));
    }

    public void a(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        this.b.a.a();
        com.google.android.play.core.splitinstall.r.b.a("onCancelInstall(%d)", java.lang.Integer.valueOf(i));
    }

    public void a(android.os.Bundle bundle) throws android.os.RemoteException {
        this.b.a.a();
        com.google.android.play.core.splitinstall.r.b.a("onDeferredInstall", new java.lang.Object[0]);
    }

    public void a(java.util.List<android.os.Bundle> list) throws android.os.RemoteException {
        this.b.a.a();
        com.google.android.play.core.splitinstall.r.b.a("onGetSessionStates", new java.lang.Object[0]);
    }

    @Override // com.google.android.play.core.internal.bd
    public final void b() throws android.os.RemoteException {
        this.b.a.a();
        com.google.android.play.core.splitinstall.r.b.a("onGetSplitsForAppUpdate", new java.lang.Object[0]);
    }

    public void b(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        this.b.a.a();
        com.google.android.play.core.splitinstall.r.b.a("onGetSession(%d)", java.lang.Integer.valueOf(i));
    }

    public void b(android.os.Bundle bundle) throws android.os.RemoteException {
        this.b.a.a();
        com.google.android.play.core.splitinstall.r.b.a("onDeferredLanguageUninstall", new java.lang.Object[0]);
    }

    public void c(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        this.b.a.a();
        com.google.android.play.core.splitinstall.r.b.a("onStartInstall(%d)", java.lang.Integer.valueOf(i));
    }

    public void c(android.os.Bundle bundle) throws android.os.RemoteException {
        this.b.a.a();
        com.google.android.play.core.splitinstall.r.b.a("onDeferredLanguageInstall", new java.lang.Object[0]);
    }

    public void d(android.os.Bundle bundle) throws android.os.RemoteException {
        this.b.a.a();
        com.google.android.play.core.splitinstall.r.b.a("onDeferredUninstall", new java.lang.Object[0]);
    }

    @Override // com.google.android.play.core.internal.bd
    public final void e(android.os.Bundle bundle) throws android.os.RemoteException {
        this.b.a.a();
        int i = bundle.getInt(com.baidu.mapapi.SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE);
        com.google.android.play.core.splitinstall.r.b.d("onError(%d)", java.lang.Integer.valueOf(i));
        this.a.a(new com.google.android.play.core.splitinstall.SplitInstallException(i));
    }
}
