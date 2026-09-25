package io.reactivex.internal.schedulers;

/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorScheduler extends io.reactivex.Scheduler {
    static final io.reactivex.Scheduler HELPER = io.reactivex.schedulers.Schedulers.single();
    final java.util.concurrent.Executor executor;
    final boolean interruptibleWorker;

    public ExecutorScheduler(java.util.concurrent.Executor executor, boolean z) {
        this.executor = executor;
        this.interruptibleWorker = z;
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
        return new io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker(this.executor, this.interruptibleWorker);
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable) {
        java.lang.Runnable runnableOnSchedule = io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable);
        try {
            if (this.executor instanceof java.util.concurrent.ExecutorService) {
                io.reactivex.internal.schedulers.ScheduledDirectTask scheduledDirectTask = new io.reactivex.internal.schedulers.ScheduledDirectTask(runnableOnSchedule);
                scheduledDirectTask.setFuture(((java.util.concurrent.ExecutorService) this.executor).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            if (this.interruptibleWorker) {
                io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.InterruptibleRunnable interruptibleRunnable = new io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.InterruptibleRunnable(runnableOnSchedule, null);
                this.executor.execute(interruptibleRunnable);
                return interruptibleRunnable;
            }
            io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.BooleanRunnable booleanRunnable = new io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.BooleanRunnable(runnableOnSchedule);
            this.executor.execute(booleanRunnable);
            return booleanRunnable;
        } catch (java.util.concurrent.RejectedExecutionException e) {
            io.reactivex.plugins.RxJavaPlugins.onError(e);
            return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        java.lang.Runnable runnableOnSchedule = io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable);
        if (this.executor instanceof java.util.concurrent.ScheduledExecutorService) {
            try {
                io.reactivex.internal.schedulers.ScheduledDirectTask scheduledDirectTask = new io.reactivex.internal.schedulers.ScheduledDirectTask(runnableOnSchedule);
                scheduledDirectTask.setFuture(((java.util.concurrent.ScheduledExecutorService) this.executor).schedule(scheduledDirectTask, j, timeUnit));
                return scheduledDirectTask;
            } catch (java.util.concurrent.RejectedExecutionException e) {
                io.reactivex.plugins.RxJavaPlugins.onError(e);
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
        }
        io.reactivex.internal.schedulers.ExecutorScheduler.DelayedRunnable delayedRunnable = new io.reactivex.internal.schedulers.ExecutorScheduler.DelayedRunnable(runnableOnSchedule);
        delayedRunnable.timed.replace(HELPER.scheduleDirect(new io.reactivex.internal.schedulers.ExecutorScheduler.DelayedDispose(delayedRunnable), j, timeUnit));
        return delayedRunnable;
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        if (this.executor instanceof java.util.concurrent.ScheduledExecutorService) {
            try {
                io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask(io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable));
                scheduledDirectPeriodicTask.setFuture(((java.util.concurrent.ScheduledExecutorService) this.executor).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (java.util.concurrent.RejectedExecutionException e) {
                io.reactivex.plugins.RxJavaPlugins.onError(e);
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
        }
        return super.schedulePeriodicallyDirect(runnable, j, j2, timeUnit);
    }

    public static final class ExecutorWorker extends io.reactivex.Scheduler.Worker implements java.lang.Runnable {
        volatile boolean disposed;
        final java.util.concurrent.Executor executor;
        final boolean interruptibleWorker;
        final java.util.concurrent.atomic.AtomicInteger wip = new java.util.concurrent.atomic.AtomicInteger();
        final io.reactivex.disposables.CompositeDisposable tasks = new io.reactivex.disposables.CompositeDisposable();
        final io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Runnable> queue = new io.reactivex.internal.queue.MpscLinkedQueue<>();

        public ExecutorWorker(java.util.concurrent.Executor executor, boolean z) {
            this.executor = executor;
            this.interruptibleWorker = z;
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable) {
            io.reactivex.disposables.Disposable booleanRunnable;
            if (this.disposed) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            java.lang.Runnable runnableOnSchedule = io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable);
            if (this.interruptibleWorker) {
                booleanRunnable = new io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.InterruptibleRunnable(runnableOnSchedule, this.tasks);
                this.tasks.add(booleanRunnable);
            } else {
                booleanRunnable = new io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.BooleanRunnable(runnableOnSchedule);
            }
            this.queue.offer(booleanRunnable);
            if (this.wip.getAndIncrement() == 0) {
                try {
                    this.executor.execute(this);
                } catch (java.util.concurrent.RejectedExecutionException e) {
                    this.disposed = true;
                    this.queue.clear();
                    io.reactivex.plugins.RxJavaPlugins.onError(e);
                    return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
                }
            }
            return booleanRunnable;
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            if (j <= 0) {
                return schedule(runnable);
            }
            if (this.disposed) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
            io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable2 = new io.reactivex.internal.disposables.SequentialDisposable(sequentialDisposable);
            io.reactivex.internal.schedulers.ScheduledRunnable scheduledRunnable = new io.reactivex.internal.schedulers.ScheduledRunnable(new io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.SequentialDispose(sequentialDisposable2, io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable)), this.tasks);
            this.tasks.add(scheduledRunnable);
            java.util.concurrent.Executor executor = this.executor;
            if (executor instanceof java.util.concurrent.ScheduledExecutorService) {
                try {
                    scheduledRunnable.setFuture(((java.util.concurrent.ScheduledExecutorService) executor).schedule((java.util.concurrent.Callable) scheduledRunnable, j, timeUnit));
                } catch (java.util.concurrent.RejectedExecutionException e) {
                    this.disposed = true;
                    io.reactivex.plugins.RxJavaPlugins.onError(e);
                    return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
                }
            } else {
                scheduledRunnable.setFuture(new io.reactivex.internal.schedulers.DisposeOnCancel(io.reactivex.internal.schedulers.ExecutorScheduler.HELPER.scheduleDirect(scheduledRunnable, j, timeUnit)));
            }
            sequentialDisposable.replace(scheduledRunnable);
            return sequentialDisposable2;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.tasks.dispose();
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // java.lang.Runnable
        public void run() {
            io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Runnable> mpscLinkedQueue = this.queue;
            int iAddAndGet = 1;
            while (!this.disposed) {
                while (true) {
                    java.lang.Runnable runnablePoll = mpscLinkedQueue.poll();
                    if (runnablePoll == null) {
                        break;
                    }
                    runnablePoll.run();
                    if (this.disposed) {
                        mpscLinkedQueue.clear();
                        return;
                    }
                }
                if (this.disposed) {
                    mpscLinkedQueue.clear();
                    return;
                } else {
                    iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            mpscLinkedQueue.clear();
        }

        static final class BooleanRunnable extends java.util.concurrent.atomic.AtomicBoolean implements java.lang.Runnable, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = -2421395018820541164L;
            final java.lang.Runnable actual;

            BooleanRunnable(java.lang.Runnable runnable) {
                this.actual = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.actual.run();
                } finally {
                    lazySet(true);
                }
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                lazySet(true);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return get();
            }
        }

        final class SequentialDispose implements java.lang.Runnable {
            private final java.lang.Runnable decoratedRun;
            private final io.reactivex.internal.disposables.SequentialDisposable mar;

            SequentialDispose(io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable, java.lang.Runnable runnable) {
                this.mar = sequentialDisposable;
                this.decoratedRun = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.mar.replace(io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.this.schedule(this.decoratedRun));
            }
        }

        static final class InterruptibleRunnable extends java.util.concurrent.atomic.AtomicInteger implements java.lang.Runnable, io.reactivex.disposables.Disposable {
            static final int FINISHED = 2;
            static final int INTERRUPTED = 4;
            static final int INTERRUPTING = 3;
            static final int READY = 0;
            static final int RUNNING = 1;
            private static final long serialVersionUID = -3603436687413320876L;
            final java.lang.Runnable run;
            final io.reactivex.internal.disposables.DisposableContainer tasks;
            volatile java.lang.Thread thread;

            InterruptibleRunnable(java.lang.Runnable runnable, io.reactivex.internal.disposables.DisposableContainer disposableContainer) {
                this.run = runnable;
                this.tasks = disposableContainer;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.thread = java.lang.Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.run.run();
                            this.thread = null;
                            if (compareAndSet(1, 2)) {
                                return;
                            } else {
                                return;
                            }
                        } finally {
                            this.thread = null;
                            if (compareAndSet(1, 2)) {
                                cleanup();
                            } else {
                                while (get() == 3) {
                                    java.lang.Thread.yield();
                                }
                                java.lang.Thread.interrupted();
                            }
                        }
                    }
                    this.thread = null;
                }
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            cleanup();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        java.lang.Thread thread = this.thread;
                        if (thread != null) {
                            thread.interrupt();
                            this.thread = null;
                        }
                        set(4);
                        cleanup();
                        return;
                    }
                }
            }

            void cleanup() {
                io.reactivex.internal.disposables.DisposableContainer disposableContainer = this.tasks;
                if (disposableContainer != null) {
                    disposableContainer.delete(this);
                }
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return get() >= 2;
            }
        }
    }

    static final class DelayedRunnable extends java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> implements java.lang.Runnable, io.reactivex.disposables.Disposable, io.reactivex.schedulers.SchedulerRunnableIntrospection {
        private static final long serialVersionUID = -4101336210206799084L;
        final io.reactivex.internal.disposables.SequentialDisposable direct;
        final io.reactivex.internal.disposables.SequentialDisposable timed;

        DelayedRunnable(java.lang.Runnable runnable) {
            super(runnable);
            this.timed = new io.reactivex.internal.disposables.SequentialDisposable();
            this.direct = new io.reactivex.internal.disposables.SequentialDisposable();
        }

        @Override // java.lang.Runnable
        public void run() {
            java.lang.Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    this.timed.lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                    this.direct.lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == null;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (getAndSet(null) != null) {
                this.timed.dispose();
                this.direct.dispose();
            }
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public java.lang.Runnable getWrappedRunnable() {
            java.lang.Runnable runnable = get();
            return runnable != null ? runnable : io.reactivex.internal.functions.Functions.EMPTY_RUNNABLE;
        }
    }

    final class DelayedDispose implements java.lang.Runnable {
        private final io.reactivex.internal.schedulers.ExecutorScheduler.DelayedRunnable dr;

        DelayedDispose(io.reactivex.internal.schedulers.ExecutorScheduler.DelayedRunnable delayedRunnable) {
            this.dr = delayedRunnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.dr.direct.replace(io.reactivex.internal.schedulers.ExecutorScheduler.this.scheduleDirect(this.dr));
        }
    }
}
