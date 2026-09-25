package io.reactivex.internal.schedulers;

/* JADX INFO: loaded from: classes2.dex */
public class NewThreadWorker extends io.reactivex.Scheduler.Worker implements io.reactivex.disposables.Disposable {
    volatile boolean disposed;
    private final java.util.concurrent.ScheduledExecutorService executor;

    public NewThreadWorker(java.util.concurrent.ThreadFactory threadFactory) {
        this.executor = io.reactivex.internal.schedulers.SchedulerPoolFactory.create(threadFactory);
    }

    @Override // io.reactivex.Scheduler.Worker
    public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable) {
        return schedule(runnable, 0L, null);
    }

    @Override // io.reactivex.Scheduler.Worker
    public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        if (this.disposed) {
            return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
        }
        return scheduleActual(runnable, j, timeUnit, null);
    }

    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.Future<?> futureSchedule;
        io.reactivex.internal.schedulers.ScheduledDirectTask scheduledDirectTask = new io.reactivex.internal.schedulers.ScheduledDirectTask(io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable));
        try {
            if (j <= 0) {
                futureSchedule = this.executor.submit(scheduledDirectTask);
            } else {
                futureSchedule = this.executor.schedule(scheduledDirectTask, j, timeUnit);
            }
            scheduledDirectTask.setFuture(futureSchedule);
            return scheduledDirectTask;
        } catch (java.util.concurrent.RejectedExecutionException e) {
            io.reactivex.plugins.RxJavaPlugins.onError(e);
            return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
        }
    }

    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.Future<?> futureSchedule;
        java.lang.Runnable runnableOnSchedule = io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable);
        if (j2 <= 0) {
            io.reactivex.internal.schedulers.InstantPeriodicTask instantPeriodicTask = new io.reactivex.internal.schedulers.InstantPeriodicTask(runnableOnSchedule, this.executor);
            try {
                if (j <= 0) {
                    futureSchedule = this.executor.submit(instantPeriodicTask);
                } else {
                    futureSchedule = this.executor.schedule(instantPeriodicTask, j, timeUnit);
                }
                instantPeriodicTask.setFirst(futureSchedule);
                return instantPeriodicTask;
            } catch (java.util.concurrent.RejectedExecutionException e) {
                io.reactivex.plugins.RxJavaPlugins.onError(e);
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
        }
        io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask(runnableOnSchedule);
        try {
            scheduledDirectPeriodicTask.setFuture(this.executor.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (java.util.concurrent.RejectedExecutionException e2) {
            io.reactivex.plugins.RxJavaPlugins.onError(e2);
            return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
        }
    }

    public io.reactivex.internal.schedulers.ScheduledRunnable scheduleActual(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.internal.disposables.DisposableContainer disposableContainer) {
        java.util.concurrent.Future<?> futureSchedule;
        io.reactivex.internal.schedulers.ScheduledRunnable scheduledRunnable = new io.reactivex.internal.schedulers.ScheduledRunnable(io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable), disposableContainer);
        if (disposableContainer != null && !disposableContainer.add(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            if (j <= 0) {
                futureSchedule = this.executor.submit((java.util.concurrent.Callable) scheduledRunnable);
            } else {
                futureSchedule = this.executor.schedule((java.util.concurrent.Callable) scheduledRunnable, j, timeUnit);
            }
            scheduledRunnable.setFuture(futureSchedule);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            if (disposableContainer != null) {
                disposableContainer.remove(scheduledRunnable);
            }
            io.reactivex.plugins.RxJavaPlugins.onError(e);
        }
        return scheduledRunnable;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        if (this.disposed) {
            return;
        }
        this.disposed = true;
        this.executor.shutdownNow();
    }

    public void shutdown() {
        if (this.disposed) {
            return;
        }
        this.disposed = true;
        this.executor.shutdown();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.disposed;
    }
}
