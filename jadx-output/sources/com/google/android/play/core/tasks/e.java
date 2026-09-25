package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class e implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.play.core.tasks.Task a;
    private final /* synthetic */ com.google.android.play.core.tasks.f b;

    e(com.google.android.play.core.tasks.f fVar, com.google.android.play.core.tasks.Task task) {
        this.b = fVar;
        this.a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.onSuccess(this.a.getResult());
            }
        }
    }
}
