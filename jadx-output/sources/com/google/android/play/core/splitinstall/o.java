package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
final class o implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.play.core.splitinstall.SplitInstallRequest a;
    private final /* synthetic */ com.google.android.play.core.splitinstall.p b;

    o(com.google.android.play.core.splitinstall.p pVar, com.google.android.play.core.splitinstall.SplitInstallRequest splitInstallRequest) {
        this.b = pVar;
        this.a = splitInstallRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.a(com.google.android.play.core.splitinstall.SplitInstallSessionState.a(com.google.android.play.core.internal.ag.a(this.a.getModuleNames(), (java.util.List<java.lang.String>) com.google.android.play.core.splitinstall.p.b(this.a.getLanguages()))));
    }
}
