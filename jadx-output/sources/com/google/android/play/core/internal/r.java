package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r implements java.lang.Runnable {
    private final com.google.android.play.core.tasks.h<?> a;

    r() {
        this.a = null;
    }

    public r(com.google.android.play.core.tasks.h<?> hVar) {
        this.a = hVar;
    }

    protected abstract void a();

    final com.google.android.play.core.tasks.h<?> b() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (java.lang.Exception e) {
            if (this.a != null) {
                this.a.a(e);
            }
        }
    }
}
