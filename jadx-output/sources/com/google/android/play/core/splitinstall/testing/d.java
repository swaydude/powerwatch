package com.google.android.play.core.splitinstall.testing;

/* JADX INFO: loaded from: classes2.dex */
final class d implements java.lang.Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ java.util.List b;
    private final /* synthetic */ java.util.List c;
    private final /* synthetic */ com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager d;

    d(com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager fakeSplitInstallManager, long j, java.util.List list, java.util.List list2) {
        this.d = fakeSplitInstallManager;
        this.a = j;
        this.b = list;
        this.c = list2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.a / 3;
        long jMin = 0;
        for (int i = 0; i < 3; i++) {
            jMin = java.lang.Math.min(this.a, jMin + j);
            this.d.b(2, 0, java.lang.Long.valueOf(jMin), null, null, null);
            this.d.i.a();
        }
        if (this.d.n.get()) {
            this.d.b(6, -6);
            return;
        }
        this.d.a((java.util.List<android.content.Intent>) this.b, (java.util.List<java.lang.String>) this.c, this.a);
    }
}
