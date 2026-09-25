package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class i<ResultT> {
    private final java.lang.Object a = new java.lang.Object();
    private java.util.Queue<com.google.android.play.core.tasks.g<ResultT>> b;
    private boolean c;

    i() {
    }

    public final void a(com.google.android.play.core.tasks.Task<ResultT> task) {
        com.google.android.play.core.tasks.g<ResultT> gVarPoll;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        gVarPoll = this.b.poll();
                        if (gVarPoll == null) {
                            this.c = false;
                            return;
                        }
                    }
                    gVarPoll.a(task);
                }
            }
        }
    }

    public final void a(com.google.android.play.core.tasks.g<ResultT> gVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new java.util.ArrayDeque();
            }
            this.b.add(gVar);
        }
    }
}
