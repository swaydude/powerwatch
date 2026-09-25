package io.reactivex.internal.schedulers;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleScheduler extends io.reactivex.Scheduler {
    private static final java.lang.String KEY_SINGLE_PRIORITY = "rx2.single-priority";
    static final java.util.concurrent.ScheduledExecutorService SHUTDOWN;
    static final io.reactivex.internal.schedulers.RxThreadFactory SINGLE_THREAD_FACTORY;
    private static final java.lang.String THREAD_NAME_PREFIX = "RxSingleScheduler";
    final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> executor;
    final java.util.concurrent.ThreadFactory threadFactory;

    static {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(0);
        SHUTDOWN = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        SINGLE_THREAD_FACTORY = new io.reactivex.internal.schedulers.RxThreadFactory(THREAD_NAME_PREFIX, java.lang.Math.max(1, java.lang.Math.min(10, java.lang.Integer.getInteger(KEY_SINGLE_PRIORITY, 5).intValue())), true);
    }

    public SingleScheduler() {
        this(SINGLE_THREAD_FACTORY);
    }

    public SingleScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> atomicReference = new java.util.concurrent.atomic.AtomicReference<>();
        this.executor = atomicReference;
        this.threadFactory = threadFactory;
        atomicReference.lazySet(createExecutor(threadFactory));
    }

    static java.util.concurrent.ScheduledExecutorService createExecutor(java.util.concurrent.ThreadFactory threadFactory) {
        return io.reactivex.internal.schedulers.SchedulerPoolFactory.create(threadFactory);
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceCreateExecutor = null;
        do {
            scheduledExecutorService = this.executor.get();
            if (scheduledExecutorService != SHUTDOWN) {
                if (scheduledExecutorServiceCreateExecutor != null) {
                    scheduledExecutorServiceCreateExecutor.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorServiceCreateExecutor == null) {
                scheduledExecutorServiceCreateExecutor = createExecutor(this.threadFactory);
            }
        } while (!this.executor.compareAndSet(scheduledExecutorService, scheduledExecutorServiceCreateExecutor));
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        java.util.concurrent.ScheduledExecutorService andSet;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.executor.get();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = SHUTDOWN;
        if (scheduledExecutorService == scheduledExecutorService2 || (andSet = this.executor.getAndSet(scheduledExecutorService2)) == scheduledExecutorService2) {
            return;
        }
        andSet.shutdownNow();
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
        return new io.reactivex.internal.schedulers.SingleScheduler.ScheduledWorker(this.executor.get());
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.Future<?> futureSchedule;
        io.reactivex.internal.schedulers.ScheduledDirectTask scheduledDirectTask = new io.reactivex.internal.schedulers.ScheduledDirectTask(io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable));
        try {
            if (j <= 0) {
                futureSchedule = this.executor.get().submit(scheduledDirectTask);
            } else {
                futureSchedule = this.executor.get().schedule(scheduledDirectTask, j, timeUnit);
            }
            scheduledDirectTask.setFuture(futureSchedule);
            return scheduledDirectTask;
        } catch (java.util.concurrent.RejectedExecutionException e) {
            io.reactivex.plugins.RxJavaPlugins.onError(e);
            return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.Future<?> futureSchedule;
        java.lang.Runnable runnableOnSchedule = io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable);
        if (j2 <= 0) {
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.executor.get();
            io.reactivex.internal.schedulers.InstantPeriodicTask instantPeriodicTask = new io.reactivex.internal.schedulers.InstantPeriodicTask(runnableOnSchedule, scheduledExecutorService);
            try {
                if (j <= 0) {
                    futureSchedule = scheduledExecutorService.submit(instantPeriodicTask);
                } else {
                    futureSchedule = scheduledExecutorService.schedule(instantPeriodicTask, j, timeUnit);
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
            scheduledDirectPeriodicTask.setFuture(this.executor.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (java.util.concurrent.RejectedExecutionException e2) {
            io.reactivex.plugins.RxJavaPlugins.onError(e2);
            return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
        }
    }

    static final class ScheduledWorker extends io.reactivex.Scheduler.Worker {
        volatile boolean disposed;
        final java.util.concurrent.ScheduledExecutorService executor;
        final io.reactivex.disposables.CompositeDisposable tasks = new io.reactivex.disposables.CompositeDisposable();

        ScheduledWorker(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
            this.executor = scheduledExecutorService;
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            java.util.concurrent.Future<?> futureSchedule;
            if (this.disposed) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            io.reactivex.internal.schedulers.ScheduledRunnable scheduledRunnable = new io.reactivex.internal.schedulers.ScheduledRunnable(io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable), this.tasks);
            this.tasks.add(scheduledRunnable);
            try {
                if (j <= 0) {
                    futureSchedule = this.executor.submit((java.util.concurrent.Callable) scheduledRunnable);
                } else {
                    futureSchedule = this.executor.schedule((java.util.concurrent.Callable) scheduledRunnable, j, timeUnit);
                }
                scheduledRunnable.setFuture(futureSchedule);
                return scheduledRunnable;
            } catch (java.util.concurrent.RejectedExecutionException e) {
                dispose();
                io.reactivex.plugins.RxJavaPlugins.onError(e);
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.tasks.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }
    }
}
