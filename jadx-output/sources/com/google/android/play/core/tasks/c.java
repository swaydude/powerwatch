package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class c<ResultT> implements com.google.android.play.core.tasks.g<ResultT> {
    private final java.util.concurrent.Executor a;
    private final java.lang.Object b = new java.lang.Object();
    private com.google.android.play.core.tasks.OnFailureListener c;

    public c(java.util.concurrent.Executor executor, com.google.android.play.core.tasks.OnFailureListener onFailureListener) {
        this.a = executor;
        this.c = onFailureListener;
    }

    @Override // com.google.android.play.core.tasks.g
    public final void a(com.google.android.play.core.tasks.Task<ResultT> task) {
        if (task.isSuccessful()) {
            return;
        }
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new com.google.android.play.core.tasks.d(this, task));
        }
    }
}
