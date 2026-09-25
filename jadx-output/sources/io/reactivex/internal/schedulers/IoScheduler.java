package io.reactivex.internal.schedulers;

/* JADX INFO: loaded from: classes2.dex */
public final class IoScheduler extends io.reactivex.Scheduler {
    static final io.reactivex.internal.schedulers.RxThreadFactory EVICTOR_THREAD_FACTORY;
    private static final java.lang.String EVICTOR_THREAD_NAME_PREFIX = "RxCachedWorkerPoolEvictor";
    public static final long KEEP_ALIVE_TIME_DEFAULT = 60;
    private static final java.lang.String KEY_IO_PRIORITY = "rx2.io-priority";
    static final io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool NONE;
    static final io.reactivex.internal.schedulers.IoScheduler.ThreadWorker SHUTDOWN_THREAD_WORKER;
    static final io.reactivex.internal.schedulers.RxThreadFactory WORKER_THREAD_FACTORY;
    private static final java.lang.String WORKER_THREAD_NAME_PREFIX = "RxCachedThreadScheduler";
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool> pool;
    final java.util.concurrent.ThreadFactory threadFactory;
    private static final java.util.concurrent.TimeUnit KEEP_ALIVE_UNIT = java.util.concurrent.TimeUnit.SECONDS;
    private static final java.lang.String KEY_KEEP_ALIVE_TIME = "rx2.io-keep-alive-time";
    private static final long KEEP_ALIVE_TIME = java.lang.Long.getLong(KEY_KEEP_ALIVE_TIME, 60).longValue();

    static {
        io.reactivex.internal.schedulers.IoScheduler.ThreadWorker threadWorker = new io.reactivex.internal.schedulers.IoScheduler.ThreadWorker(new io.reactivex.internal.schedulers.RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        SHUTDOWN_THREAD_WORKER = threadWorker;
        threadWorker.dispose();
        int iMax = java.lang.Math.max(1, java.lang.Math.min(10, java.lang.Integer.getInteger(KEY_IO_PRIORITY, 5).intValue()));
        io.reactivex.internal.schedulers.RxThreadFactory rxThreadFactory = new io.reactivex.internal.schedulers.RxThreadFactory(WORKER_THREAD_NAME_PREFIX, iMax);
        WORKER_THREAD_FACTORY = rxThreadFactory;
        EVICTOR_THREAD_FACTORY = new io.reactivex.internal.schedulers.RxThreadFactory(EVICTOR_THREAD_NAME_PREFIX, iMax);
        io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool cachedWorkerPool = new io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool(0L, null, rxThreadFactory);
        NONE = cachedWorkerPool;
        cachedWorkerPool.shutdown();
    }

    static final class CachedWorkerPool implements java.lang.Runnable {
        final io.reactivex.disposables.CompositeDisposable allWorkers;
        private final java.util.concurrent.ScheduledExecutorService evictorService;
        private final java.util.concurrent.Future<?> evictorTask;
        private final java.util.concurrent.ConcurrentLinkedQueue<io.reactivex.internal.schedulers.IoScheduler.ThreadWorker> expiringWorkerQueue;
        private final long keepAliveTime;
        private final java.util.concurrent.ThreadFactory threadFactory;

        CachedWorkerPool(long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ThreadFactory threadFactory) {
            java.util.concurrent.ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.keepAliveTime = nanos;
            this.expiringWorkerQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();
            this.allWorkers = new io.reactivex.disposables.CompositeDisposable();
            this.threadFactory = threadFactory;
            java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = null;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1, io.reactivex.internal.schedulers.IoScheduler.EVICTOR_THREAD_FACTORY);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
            } else {
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.evictorService = scheduledExecutorServiceNewScheduledThreadPool;
            this.evictorTask = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public void run() {
            evictExpiredWorkers();
        }

        io.reactivex.internal.schedulers.IoScheduler.ThreadWorker get() {
            if (this.allWorkers.isDisposed()) {
                return io.reactivex.internal.schedulers.IoScheduler.SHUTDOWN_THREAD_WORKER;
            }
            while (!this.expiringWorkerQueue.isEmpty()) {
                io.reactivex.internal.schedulers.IoScheduler.ThreadWorker threadWorkerPoll = this.expiringWorkerQueue.poll();
                if (threadWorkerPoll != null) {
                    return threadWorkerPoll;
                }
            }
            io.reactivex.internal.schedulers.IoScheduler.ThreadWorker threadWorker = new io.reactivex.internal.schedulers.IoScheduler.ThreadWorker(this.threadFactory);
            this.allWorkers.add(threadWorker);
            return threadWorker;
        }

        void release(io.reactivex.internal.schedulers.IoScheduler.ThreadWorker threadWorker) {
            threadWorker.setExpirationTime(now() + this.keepAliveTime);
            this.expiringWorkerQueue.offer(threadWorker);
        }

        void evictExpiredWorkers() {
            if (this.expiringWorkerQueue.isEmpty()) {
                return;
            }
            long jNow = now();
            for (io.reactivex.internal.schedulers.IoScheduler.ThreadWorker threadWorker : this.expiringWorkerQueue) {
                if (threadWorker.getExpirationTime() > jNow) {
                    return;
                }
                if (this.expiringWorkerQueue.remove(threadWorker)) {
                    this.allWorkers.remove(threadWorker);
                }
            }
        }

        long now() {
            return java.lang.System.nanoTime();
        }

        void shutdown() {
            this.allWorkers.dispose();
            java.util.concurrent.Future<?> future = this.evictorTask;
            if (future != null) {
                future.cancel(true);
            }
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.evictorService;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    public IoScheduler() {
        this(WORKER_THREAD_FACTORY);
    }

    public IoScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        this.threadFactory = threadFactory;
        this.pool = new java.util.concurrent.atomic.AtomicReference<>(NONE);
        start();
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool cachedWorkerPool = new io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool(KEEP_ALIVE_TIME, KEEP_ALIVE_UNIT, this.threadFactory);
        if (this.pool.compareAndSet(NONE, cachedWorkerPool)) {
            return;
        }
        cachedWorkerPool.shutdown();
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool cachedWorkerPool;
        io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool cachedWorkerPool2;
        do {
            cachedWorkerPool = this.pool.get();
            cachedWorkerPool2 = NONE;
            if (cachedWorkerPool == cachedWorkerPool2) {
                return;
            }
        } while (!this.pool.compareAndSet(cachedWorkerPool, cachedWorkerPool2));
        cachedWorkerPool.shutdown();
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
        return new io.reactivex.internal.schedulers.IoScheduler.EventLoopWorker(this.pool.get());
    }

    public int size() {
        return this.pool.get().allWorkers.size();
    }

    static final class EventLoopWorker extends io.reactivex.Scheduler.Worker {
        private final io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool pool;
        private final io.reactivex.internal.schedulers.IoScheduler.ThreadWorker threadWorker;
        final java.util.concurrent.atomic.AtomicBoolean once = new java.util.concurrent.atomic.AtomicBoolean();
        private final io.reactivex.disposables.CompositeDisposable tasks = new io.reactivex.disposables.CompositeDisposable();

        EventLoopWorker(io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool cachedWorkerPool) {
            this.pool = cachedWorkerPool;
            this.threadWorker = cachedWorkerPool.get();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.once.compareAndSet(false, true)) {
                this.tasks.dispose();
                this.pool.release(this.threadWorker);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.once.get();
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            if (this.tasks.isDisposed()) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            return this.threadWorker.scheduleActual(runnable, j, timeUnit, this.tasks);
        }
    }

    static final class ThreadWorker extends io.reactivex.internal.schedulers.NewThreadWorker {
        private long expirationTime;

        ThreadWorker(java.util.concurrent.ThreadFactory threadFactory) {
            super(threadFactory);
            this.expirationTime = 0L;
        }

        public long getExpirationTime() {
            return this.expirationTime;
        }

        public void setExpirationTime(long j) {
            this.expirationTime = j;
        }
    }
}
