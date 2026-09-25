package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class d implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.play.core.tasks.Task a;
    private final /* synthetic */ com.google.android.play.core.tasks.c b;

    d(com.google.android.play.core.tasks.c cVar, com.google.android.play.core.tasks.Task task) {
        this.b = cVar;
        this.a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.onFailure(this.a.getException());
            }
        }
    }
}
