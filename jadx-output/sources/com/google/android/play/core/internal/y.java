package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class y extends com.google.android.play.core.internal.r {
    private final /* synthetic */ android.os.IBinder a;
    private final /* synthetic */ com.google.android.play.core.internal.z b;

    y(com.google.android.play.core.internal.z zVar, android.os.IBinder iBinder) {
        this.b = zVar;
        this.a = iBinder;
    }

    @Override // com.google.android.play.core.internal.r
    public final void a() {
        this.b.a.l = (android.os.IInterface) this.b.a.h.a(this.a);
        this.b.a.e();
        com.google.android.play.core.internal.t.a(this.b.a, false);
        java.util.Iterator it = this.b.a.e.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        this.b.a.e.clear();
    }
}
