package com.google.android.play.core.splitinstall.testing;

/* JADX INFO: loaded from: classes2.dex */
final class a implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager a;

    a(com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager fakeSplitInstallManager) {
        this.a = fakeSplitInstallManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g.a((com.google.android.play.core.splitinstall.SplitInstallSessionState) com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.k.get());
    }
}
