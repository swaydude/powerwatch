package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class l<ResultT> extends com.google.android.play.core.tasks.Task<ResultT> {
    private final java.lang.Object a = new java.lang.Object();
    private final com.google.android.play.core.tasks.i<ResultT> b = new com.google.android.play.core.tasks.i<>();
    private boolean c;
    private ResultT d;
    private java.lang.Exception e;

    l() {
    }

    private final void a() {
        com.google.android.play.core.internal.ag.a(this.c, "Task is not yet complete");
    }

    private final void b() {
        com.google.android.play.core.internal.ag.a(!this.c, "Task is already complete");
    }

    private final void c() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a(this);
            }
        }
    }

    public final void a(java.lang.Exception exc) {
        com.google.android.play.core.internal.ag.a(exc, "Exception must not be null");
        synchronized (this.a) {
            b();
            this.c = true;
            this.e = exc;
        }
        this.b.a(this);
    }

    public final void a(ResultT resultt) {
        synchronized (this.a) {
            b();
            this.c = true;
            this.d = resultt;
        }
        this.b.a(this);
    }

    @Override // com.google.android.play.core.tasks.Task
    public final com.google.android.play.core.tasks.Task<ResultT> addOnCompleteListener(com.google.android.play.core.tasks.OnCompleteListener<ResultT> onCompleteListener) {
        return addOnCompleteListener(com.google.android.play.core.tasks.TaskExecutors.MAIN_THREAD, onCompleteListener);
    }

    @Override // com.google.android.play.core.tasks.Task
    public final com.google.android.play.core.tasks.Task<ResultT> addOnCompleteListener(java.util.concurrent.Executor executor, com.google.android.play.core.tasks.OnCompleteListener<ResultT> onCompleteListener) {
        this.b.a(new com.google.android.play.core.tasks.b(executor, onCompleteListener));
        c();
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final com.google.android.play.core.tasks.Task<ResultT> addOnFailureListener(com.google.android.play.core.tasks.OnFailureListener onFailureListener) {
        return addOnFailureListener(com.google.android.play.core.tasks.TaskExecutors.MAIN_THREAD, onFailureListener);
    }

    @Override // com.google.android.play.core.tasks.Task
    public final com.google.android.play.core.tasks.Task<ResultT> addOnFailureListener(java.util.concurrent.Executor executor, com.google.android.play.core.tasks.OnFailureListener onFailureListener) {
        this.b.a(new com.google.android.play.core.tasks.c(executor, onFailureListener));
        c();
        return this;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final com.google.android.play.core.tasks.Task<ResultT> addOnSuccessListener(com.google.android.play.core.tasks.OnSuccessListener<? super ResultT> onSuccessListener) {
        return addOnSuccessListener(com.google.android.play.core.tasks.TaskExecutors.MAIN_THREAD, onSuccessListener);
    }

    @Override // com.google.android.play.core.tasks.Task
    public final com.google.android.play.core.tasks.Task<ResultT> addOnSuccessListener(java.util.concurrent.Executor executor, com.google.android.play.core.tasks.OnSuccessListener<? super ResultT> onSuccessListener) {
        this.b.a(new com.google.android.play.core.tasks.f(executor, onSuccessListener));
        c();
        return this;
    }

    public final boolean b(java.lang.Exception exc) {
        com.google.android.play.core.internal.ag.a(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = exc;
            this.b.a(this);
            return true;
        }
    }

    public final boolean b(ResultT resultt) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = resultt;
            this.b.a(this);
            return true;
        }
    }

    @Override // com.google.android.play.core.tasks.Task
    public final java.lang.Exception getException() {
        java.lang.Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final ResultT getResult() {
        ResultT resultt;
        synchronized (this.a) {
            a();
            if (this.e != null) {
                throw new com.google.android.play.core.tasks.RuntimeExecutionException(this.e);
            }
            resultt = this.d;
        }
        return resultt;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final <X extends java.lang.Throwable> ResultT getResult(java.lang.Class<X> cls) throws java.lang.Throwable {
        ResultT resultt;
        synchronized (this.a) {
            a();
            if (cls.isInstance(this.e)) {
                throw cls.cast(this.e);
            }
            if (this.e != null) {
                throw new com.google.android.play.core.tasks.RuntimeExecutionException(this.e);
            }
            resultt = this.d;
        }
        return resultt;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final boolean isComplete() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.play.core.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.a) {
            z = this.c && this.e == null;
        }
        return z;
    }
}
