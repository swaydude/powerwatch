package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class z implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.play.core.internal.t a;

    private z(com.google.android.play.core.internal.t tVar) {
        this.a = tVar;
    }

    /* synthetic */ z(com.google.android.play.core.internal.t tVar, byte b) {
        this(tVar);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.a.c.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.c(new com.google.android.play.core.internal.y(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.a.c.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.c(new com.google.android.play.core.internal.ab(this));
    }
}
