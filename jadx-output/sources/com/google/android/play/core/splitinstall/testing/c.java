package com.google.android.play.core.splitinstall.testing;

/* JADX INFO: loaded from: classes2.dex */
final class c implements com.google.android.play.core.splitinstall.d {
    private final /* synthetic */ java.util.List a;
    private final /* synthetic */ long b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ java.util.List d;
    private final /* synthetic */ com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager e;

    c(com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager fakeSplitInstallManager, java.util.List list, long j, boolean z, java.util.List list2) {
        this.e = fakeSplitInstallManager;
        this.a = list;
        this.b = j;
        this.c = z;
        this.d = list2;
    }

    @Override // com.google.android.play.core.splitinstall.d
    public final void a() {
        this.e.l.addAll(this.a);
        this.e.b(5, 0, java.lang.Long.valueOf(this.b), null, null, null);
    }

    @Override // com.google.android.play.core.splitinstall.d
    public final void a(int i) {
        this.e.b(6, i);
    }

    @Override // com.google.android.play.core.splitinstall.d
    public final void b() {
        if (this.c) {
            return;
        }
        this.e.a((java.util.List<android.content.Intent>) this.d, (java.util.List<java.lang.String>) this.a, this.b, true);
    }
}
