package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class ae implements java.lang.Runnable {
    private final /* synthetic */ java.util.List a;
    private final /* synthetic */ com.google.android.play.core.splitinstall.d b;
    private final /* synthetic */ com.google.android.play.core.internal.ac c;

    ae(com.google.android.play.core.internal.ac acVar, java.util.List list, com.google.android.play.core.splitinstall.d dVar) {
        this.c = acVar;
        this.a = list;
        this.b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.c.c.a(this.a)) {
                this.c.a(this.b);
            } else {
                this.c.c(this.a, this.b);
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e("SplitCompat", "Error checking verified files.", e);
            this.b.a(-11);
        }
    }
}
