package com.google.android.play.core.splitcompat;

/* JADX INFO: loaded from: classes2.dex */
final class o implements java.lang.Runnable {
    private final /* synthetic */ android.content.Context a;

    o(android.content.Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.play.core.splitinstall.n.a(this.a).a(true);
    }
}
