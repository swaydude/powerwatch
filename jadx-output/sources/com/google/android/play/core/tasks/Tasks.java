package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes2.dex */
public final class Tasks {

    interface a extends com.google.android.play.core.tasks.OnFailureListener, com.google.android.play.core.tasks.OnSuccessListener<java.lang.Object> {
    }

    static final class b implements com.google.android.play.core.tasks.Tasks.a {
        private final java.util.concurrent.CountDownLatch a;

        private b() {
            this.a = new java.util.concurrent.CountDownLatch(1);
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final void a() throws java.lang.InterruptedException {
            this.a.await();
        }

        public final boolean a(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
            return this.a.await(j, timeUnit);
        }

        @Override // com.google.android.play.core.tasks.OnFailureListener
        public final void onFailure(java.lang.Exception exc) {
            this.a.countDown();
        }

        @Override // com.google.android.play.core.tasks.OnSuccessListener
        public final void onSuccess(java.lang.Object obj) {
            this.a.countDown();
        }
    }

    private Tasks() {
    }

    public static <ResultT> com.google.android.play.core.tasks.Task<ResultT> a(java.lang.Exception exc) {
        com.google.android.play.core.tasks.l lVar = new com.google.android.play.core.tasks.l();
        lVar.a(exc);
        return lVar;
    }

    public static <ResultT> com.google.android.play.core.tasks.Task<ResultT> a(ResultT resultt) {
        com.google.android.play.core.tasks.l lVar = new com.google.android.play.core.tasks.l();
        lVar.a(resultt);
        return lVar;
    }

    private static <ResultT> ResultT a(com.google.android.play.core.tasks.Task<ResultT> task) throws java.util.concurrent.ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new java.util.concurrent.ExecutionException(task.getException());
    }

    private static void a(com.google.android.play.core.tasks.Task<?> task, com.google.android.play.core.tasks.Tasks.a aVar) {
        task.addOnSuccessListener(com.google.android.play.core.tasks.TaskExecutors.a, aVar);
        task.addOnFailureListener(com.google.android.play.core.tasks.TaskExecutors.a, aVar);
    }

    public static <ResultT> ResultT await(com.google.android.play.core.tasks.Task<ResultT> task) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        com.google.android.play.core.internal.ag.a(task, "Task must not be null");
        if (task.isComplete()) {
            return (ResultT) a((com.google.android.play.core.tasks.Task) task);
        }
        com.google.android.play.core.tasks.Tasks.b bVar = new com.google.android.play.core.tasks.Tasks.b((byte) 0);
        a(task, bVar);
        bVar.a();
        return (ResultT) a((com.google.android.play.core.tasks.Task) task);
    }

    public static <ResultT> ResultT await(com.google.android.play.core.tasks.Task<ResultT> task, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        com.google.android.play.core.internal.ag.a(task, "Task must not be null");
        com.google.android.play.core.internal.ag.a(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return (ResultT) a((com.google.android.play.core.tasks.Task) task);
        }
        com.google.android.play.core.tasks.Tasks.b bVar = new com.google.android.play.core.tasks.Tasks.b((byte) 0);
        a(task, bVar);
        if (bVar.a(j, timeUnit)) {
            return (ResultT) a((com.google.android.play.core.tasks.Task) task);
        }
        throw new java.util.concurrent.TimeoutException("Timed out waiting for Task");
    }
}
