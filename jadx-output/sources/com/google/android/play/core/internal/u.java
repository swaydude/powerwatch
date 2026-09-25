package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class u extends com.google.android.play.core.internal.r {
    private final /* synthetic */ com.google.android.play.core.internal.t a;

    u(com.google.android.play.core.internal.t tVar) {
        this.a = tVar;
    }

    @Override // com.google.android.play.core.internal.r
    public final void a() {
        if (this.a.l != null) {
            this.a.c.a("Unbind from service.", new java.lang.Object[0]);
            this.a.b.unbindService(this.a.k);
            com.google.android.play.core.internal.t.a(this.a, false);
            this.a.l = null;
            com.google.android.play.core.internal.t.a(this.a, (android.content.ServiceConnection) null);
        }
    }
}
