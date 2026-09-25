package io.reactivex.internal.schedulers;

/* JADX INFO: loaded from: classes2.dex */
public final class ComputationScheduler extends io.reactivex.Scheduler implements io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport {
    private static final java.lang.String KEY_COMPUTATION_PRIORITY = "rx2.computation-priority";
    static final java.lang.String KEY_MAX_THREADS = "rx2.computation-threads";
    static final int MAX_THREADS = cap(java.lang.Runtime.getRuntime().availableProcessors(), java.lang.Integer.getInteger(KEY_MAX_THREADS, 0).intValue());
    static final io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool NONE;
    static final io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker SHUTDOWN_WORKER;
    static final io.reactivex.internal.schedulers.RxThreadFactory THREAD_FACTORY;
    private static final java.lang.String THREAD_NAME_PREFIX = "RxComputationThreadPool";
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool> pool;
    final java.util.concurrent.ThreadFactory threadFactory;

    static int cap(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    static {
        io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker poolWorker = new io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker(new io.reactivex.internal.schedulers.RxThreadFactory("RxComputationShutdown"));
        SHUTDOWN_WORKER = poolWorker;
        poolWorker.dispose();
        io.reactivex.internal.schedulers.RxThreadFactory rxThreadFactory = new io.reactivex.internal.schedulers.RxThreadFactory(THREAD_NAME_PREFIX, java.lang.Math.max(1, java.lang.Math.min(10, java.lang.Integer.getInteger(KEY_COMPUTATION_PRIORITY, 5).intValue())), true);
        THREAD_FACTORY = rxThreadFactory;
        io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool fixedSchedulerPool = new io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool(0, rxThreadFactory);
        NONE = fixedSchedulerPool;
        fixedSchedulerPool.shutdown();
    }

    static final class FixedSchedulerPool implements io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport {
        final int cores;
        final io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker[] eventLoops;
        long n;

        FixedSchedulerPool(int i, java.util.concurrent.ThreadFactory threadFactory) {
            this.cores = i;
            this.eventLoops = new io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.eventLoops[i2] = new io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker(threadFactory);
            }
        }

        public io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker getEventLoop() {
            int i = this.cores;
            if (i == 0) {
                return io.reactivex.internal.schedulers.ComputationScheduler.SHUTDOWN_WORKER;
            }
            io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker[] poolWorkerArr = this.eventLoops;
            long j = this.n;
            this.n = 1 + j;
            return poolWorkerArr[(int) (j % ((long) i))];
        }

        public void shutdown() {
            for (io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker poolWorker : this.eventLoops) {
                poolWorker.dispose();
            }
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
        public void createWorkers(int i, io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
            int i2 = this.cores;
            if (i2 == 0) {
                for (int i3 = 0; i3 < i; i3++) {
                    workerCallback.onWorker(i3, io.reactivex.internal.schedulers.ComputationScheduler.SHUTDOWN_WORKER);
                }
                return;
            }
            int i4 = ((int) this.n) % i2;
            for (int i5 = 0; i5 < i; i5++) {
                workerCallback.onWorker(i5, new io.reactivex.internal.schedulers.ComputationScheduler.EventLoopWorker(this.eventLoops[i4]));
                i4++;
                if (i4 == i2) {
                    i4 = 0;
                }
            }
            this.n = i4;
        }
    }

    public ComputationScheduler() {
        this(THREAD_FACTORY);
    }

    public ComputationScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        this.threadFactory = threadFactory;
        this.pool = new java.util.concurrent.atomic.AtomicReference<>(NONE);
        start();
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
        return new io.reactivex.internal.schedulers.ComputationScheduler.EventLoopWorker(this.pool.get().getEventLoop());
    }

    @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
    public void createWorkers(int i, io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
        io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "number > 0 required");
        this.pool.get().createWorkers(i, workerCallback);
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.pool.get().getEventLoop().scheduleDirect(runnable, j, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return this.pool.get().getEventLoop().schedulePeriodicallyDirect(runnable, j, j2, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool fixedSchedulerPool = new io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool(MAX_THREADS, this.threadFactory);
        if (this.pool.compareAndSet(NONE, fixedSchedulerPool)) {
            return;
        }
        fixedSchedulerPool.shutdown();
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool fixedSchedulerPool;
        io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool fixedSchedulerPool2;
        do {
            fixedSchedulerPool = this.pool.get();
            fixedSchedulerPool2 = NONE;
            if (fixedSchedulerPool == fixedSchedulerPool2) {
                return;
            }
        } while (!this.pool.compareAndSet(fixedSchedulerPool, fixedSchedulerPool2));
        fixedSchedulerPool.shutdown();
    }

    static final class EventLoopWorker extends io.reactivex.Scheduler.Worker {
        private final io.reactivex.internal.disposables.ListCompositeDisposable both;
        volatile boolean disposed;
        private final io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker poolWorker;
        private final io.reactivex.internal.disposables.ListCompositeDisposable serial;
        private final io.reactivex.disposables.CompositeDisposable timed;

        EventLoopWorker(io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker poolWorker) {
            this.poolWorker = poolWorker;
            io.reactivex.internal.disposables.ListCompositeDisposable listCompositeDisposable = new io.reactivex.internal.disposables.ListCompositeDisposable();
            this.serial = listCompositeDisposable;
            io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
            this.timed = compositeDisposable;
            io.reactivex.internal.disposables.ListCompositeDisposable listCompositeDisposable2 = new io.reactivex.internal.disposables.ListCompositeDisposable();
            this.both = listCompositeDisposable2;
            listCompositeDisposable2.add(listCompositeDisposable);
            listCompositeDisposable2.add(compositeDisposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.both.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable) {
            if (this.disposed) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            return this.poolWorker.scheduleActual(runnable, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, this.serial);
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            if (this.disposed) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            return this.poolWorker.scheduleActual(runnable, j, timeUnit, this.timed);
        }
    }

    static final class PoolWorker extends io.reactivex.internal.schedulers.NewThreadWorker {
        PoolWorker(java.util.concurrent.ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
