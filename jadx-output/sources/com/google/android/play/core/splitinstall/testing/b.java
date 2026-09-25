package com.google.android.play.core.splitinstall.testing;

/* JADX INFO: loaded from: classes2.dex */
final class b implements java.lang.Runnable {
    private final /* synthetic */ java.util.List a;
    private final /* synthetic */ com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager b;

    b(com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager fakeSplitInstallManager, java.util.List list) {
        this.b = fakeSplitInstallManager;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a((java.util.List<java.io.File>) this.a);
    }
}
