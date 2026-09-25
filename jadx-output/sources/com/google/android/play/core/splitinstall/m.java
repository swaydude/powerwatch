package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
final class m implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.play.core.splitinstall.SplitInstallSessionState a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;
    private final /* synthetic */ com.google.android.play.core.splitinstall.n d;

    m(com.google.android.play.core.splitinstall.n nVar, com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, int i, int i2) {
        this.d = nVar;
        this.a = splitInstallSessionState;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.play.core.splitinstall.n nVar = this.d;
        com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState = this.a;
        nVar.a(new com.google.android.play.core.splitinstall.b(splitInstallSessionState.sessionId(), this.b, this.c, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.a(), splitInstallSessionState.b(), splitInstallSessionState.resolutionIntent(), splitInstallSessionState.c()));
    }
}
