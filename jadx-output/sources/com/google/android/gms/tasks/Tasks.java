package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
public final class Tasks {

    interface zzb extends com.google.android.gms.tasks.OnCanceledListener, com.google.android.gms.tasks.OnFailureListener, com.google.android.gms.tasks.OnSuccessListener<java.lang.Object> {
    }

    public static <TResult> com.google.android.gms.tasks.Task<TResult> forResult(TResult tresult) {
        com.google.android.gms.tasks.zzu zzuVar = new com.google.android.gms.tasks.zzu();
        zzuVar.setResult(tresult);
        return zzuVar;
    }

    private static final class zza implements com.google.android.gms.tasks.Tasks.zzb {
        private final java.util.concurrent.CountDownLatch zzaf;

        private zza() {
            this.zzaf = new java.util.concurrent.CountDownLatch(1);
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(java.lang.Object obj) {
            this.zzaf.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(java.lang.Exception exc) {
            this.zzaf.countDown();
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
            this.zzaf.countDown();
        }

        public final void await() throws java.lang.InterruptedException {
            this.zzaf.await();
        }

        public final boolean await(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
            return this.zzaf.await(j, timeUnit);
        }

        /* synthetic */ zza(com.google.android.gms.tasks.zzv zzvVar) {
            this();
        }
    }

    public static <TResult> com.google.android.gms.tasks.Task<TResult> forException(java.lang.Exception exc) {
        com.google.android.gms.tasks.zzu zzuVar = new com.google.android.gms.tasks.zzu();
        zzuVar.setException(exc);
        return zzuVar;
    }

    private static final class zzc implements com.google.android.gms.tasks.Tasks.zzb {
        private final java.lang.Object mLock = new java.lang.Object();
        private final com.google.android.gms.tasks.zzu<java.lang.Void> zza;
        private java.lang.Exception zzab;
        private final int zzag;
        private int zzah;
        private int zzai;
        private int zzaj;
        private boolean zzak;

        public zzc(int i, com.google.android.gms.tasks.zzu<java.lang.Void> zzuVar) {
            this.zzag = i;
            this.zza = zzuVar;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(java.lang.Exception exc) {
            synchronized (this.mLock) {
                this.zzai++;
                this.zzab = exc;
                zzf();
            }
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(java.lang.Object obj) {
            synchronized (this.mLock) {
                this.zzah++;
                zzf();
            }
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
            synchronized (this.mLock) {
                this.zzaj++;
                this.zzak = true;
                zzf();
            }
        }

        private final void zzf() {
            if (this.zzah + this.zzai + this.zzaj == this.zzag) {
                if (this.zzab != null) {
                    com.google.android.gms.tasks.zzu<java.lang.Void> zzuVar = this.zza;
                    int i = this.zzai;
                    int i2 = this.zzag;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(54);
                    sb.append(i);
                    sb.append(" out of ");
                    sb.append(i2);
                    sb.append(" underlying tasks failed");
                    zzuVar.setException(new java.util.concurrent.ExecutionException(sb.toString(), this.zzab));
                    return;
                }
                if (this.zzak) {
                    this.zza.zza();
                } else {
                    this.zza.setResult(null);
                }
            }
        }
    }

    public static <TResult> com.google.android.gms.tasks.Task<TResult> forCanceled() {
        com.google.android.gms.tasks.zzu zzuVar = new com.google.android.gms.tasks.zzu();
        zzuVar.zza();
        return zzuVar;
    }

    public static <TResult> com.google.android.gms.tasks.Task<TResult> call(java.util.concurrent.Callable<TResult> callable) {
        return call(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, callable);
    }

    public static <TResult> com.google.android.gms.tasks.Task<TResult> call(java.util.concurrent.Executor executor, java.util.concurrent.Callable<TResult> callable) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(executor, "Executor must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(callable, "Callback must not be null");
        com.google.android.gms.tasks.zzu zzuVar = new com.google.android.gms.tasks.zzu();
        executor.execute(new com.google.android.gms.tasks.zzv(zzuVar, callable));
        return zzuVar;
    }

    public static <TResult> TResult await(com.google.android.gms.tasks.Task<TResult> task) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(task, "Task must not be null");
        if (task.isComplete()) {
            return (TResult) zzb(task);
        }
        com.google.android.gms.tasks.Tasks.zza zzaVar = new com.google.android.gms.tasks.Tasks.zza(null);
        zza(task, zzaVar);
        zzaVar.await();
        return (TResult) zzb(task);
    }

    public static <TResult> TResult await(com.google.android.gms.tasks.Task<TResult> task, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(task, "Task must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return (TResult) zzb(task);
        }
        com.google.android.gms.tasks.Tasks.zza zzaVar = new com.google.android.gms.tasks.Tasks.zza(null);
        zza(task, zzaVar);
        if (!zzaVar.await(j, timeUnit)) {
            throw new java.util.concurrent.TimeoutException("Timed out waiting for Task");
        }
        return (TResult) zzb(task);
    }

    public static com.google.android.gms.tasks.Task<java.lang.Void> whenAll(java.util.Collection<? extends com.google.android.gms.tasks.Task<?>> collection) {
        if (collection.isEmpty()) {
            return forResult(null);
        }
        java.util.Iterator<? extends com.google.android.gms.tasks.Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            java.util.Objects.requireNonNull(it.next(), "null tasks are not accepted");
        }
        com.google.android.gms.tasks.zzu zzuVar = new com.google.android.gms.tasks.zzu();
        com.google.android.gms.tasks.Tasks.zzc zzcVar = new com.google.android.gms.tasks.Tasks.zzc(collection.size(), zzuVar);
        java.util.Iterator<? extends com.google.android.gms.tasks.Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            zza(it2.next(), zzcVar);
        }
        return zzuVar;
    }

    public static com.google.android.gms.tasks.Task<java.lang.Void> whenAll(com.google.android.gms.tasks.Task<?>... taskArr) {
        if (taskArr.length == 0) {
            return forResult(null);
        }
        return whenAll(java.util.Arrays.asList(taskArr));
    }

    public static <TResult> com.google.android.gms.tasks.Task<java.util.List<TResult>> whenAllSuccess(java.util.Collection<? extends com.google.android.gms.tasks.Task<?>> collection) {
        return (com.google.android.gms.tasks.Task<java.util.List<TResult>>) whenAll(collection).continueWith(new com.google.android.gms.tasks.zzw(collection));
    }

    public static <TResult> com.google.android.gms.tasks.Task<java.util.List<TResult>> whenAllSuccess(com.google.android.gms.tasks.Task<?>... taskArr) {
        return whenAllSuccess(java.util.Arrays.asList(taskArr));
    }

    public static com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tasks.Task<?>>> whenAllComplete(java.util.Collection<? extends com.google.android.gms.tasks.Task<?>> collection) {
        return whenAll(collection).continueWithTask(new com.google.android.gms.tasks.zzx(collection));
    }

    public static com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tasks.Task<?>>> whenAllComplete(com.google.android.gms.tasks.Task<?>... taskArr) {
        return whenAllComplete(java.util.Arrays.asList(taskArr));
    }

    private static <TResult> TResult zzb(com.google.android.gms.tasks.Task<TResult> task) throws java.util.concurrent.ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new java.util.concurrent.CancellationException("Task is already canceled");
        }
        throw new java.util.concurrent.ExecutionException(task.getException());
    }

    private static void zza(com.google.android.gms.tasks.Task<?> task, com.google.android.gms.tasks.Tasks.zzb zzbVar) {
        task.addOnSuccessListener(com.google.android.gms.tasks.TaskExecutors.zzw, zzbVar);
        task.addOnFailureListener(com.google.android.gms.tasks.TaskExecutors.zzw, zzbVar);
        task.addOnCanceledListener(com.google.android.gms.tasks.TaskExecutors.zzw, zzbVar);
    }

    private Tasks() {
    }
}
