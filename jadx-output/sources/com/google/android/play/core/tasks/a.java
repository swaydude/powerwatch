package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class a implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.play.core.tasks.Task a;
    private final /* synthetic */ com.google.android.play.core.tasks.b b;

    a(com.google.android.play.core.tasks.b bVar, com.google.android.play.core.tasks.Task task) {
        this.b = bVar;
        this.a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.onComplete(this.a);
            }
        }
    }
}
