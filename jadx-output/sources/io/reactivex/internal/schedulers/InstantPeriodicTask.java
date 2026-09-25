package io.reactivex.internal.schedulers;

/* JADX INFO: loaded from: classes2.dex */
final class InstantPeriodicTask implements java.util.concurrent.Callable<java.lang.Void>, io.reactivex.disposables.Disposable {
    static final java.util.concurrent.FutureTask<java.lang.Void> CANCELLED = new java.util.concurrent.FutureTask<>(io.reactivex.internal.functions.Functions.EMPTY_RUNNABLE, null);
    final java.util.concurrent.ExecutorService executor;
    final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> first = new java.util.concurrent.atomic.AtomicReference<>();
    final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> rest = new java.util.concurrent.atomic.AtomicReference<>();
    java.lang.Thread runner;
    final java.lang.Runnable task;

    InstantPeriodicTask(java.lang.Runnable runnable, java.util.concurrent.ExecutorService executorService) {
        this.task = runnable;
        this.executor = executorService;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Void call() throws java.lang.Exception {
        this.runner = java.lang.Thread.currentThread();
        try {
            this.task.run();
            setRest(this.executor.submit(this));
            this.runner = null;
        } catch (java.lang.Throwable th) {
            this.runner = null;
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
        return null;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> atomicReference = this.first;
        java.util.concurrent.FutureTask<java.lang.Void> futureTask = CANCELLED;
        java.util.concurrent.Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.runner != java.lang.Thread.currentThread());
        }
        java.util.concurrent.Future<?> andSet2 = this.rest.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.runner != java.lang.Thread.currentThread());
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.first.get() == CANCELLED;
    }

    void setFirst(java.util.concurrent.Future<?> future) {
        java.util.concurrent.Future<?> future2;
        do {
            future2 = this.first.get();
            if (future2 == CANCELLED) {
                future.cancel(this.runner != java.lang.Thread.currentThread());
                return;
            }
        } while (!this.first.compareAndSet(future2, future));
    }

    void setRest(java.util.concurrent.Future<?> future) {
        java.util.concurrent.Future<?> future2;
        do {
            future2 = this.rest.get();
            if (future2 == CANCELLED) {
                future.cancel(this.runner != java.lang.Thread.currentThread());
                return;
            }
        } while (!this.rest.compareAndSet(future2, future));
    }
}
