package io.reactivex.internal.schedulers;

/* JADX INFO: loaded from: classes2.dex */
public final class SchedulerPoolFactory {
    public static final boolean PURGE_ENABLED;
    static final java.lang.String PURGE_ENABLED_KEY = "rx2.purge-enabled";
    public static final int PURGE_PERIOD_SECONDS;
    static final java.lang.String PURGE_PERIOD_SECONDS_KEY = "rx2.purge-period-seconds";
    static final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> PURGE_THREAD = new java.util.concurrent.atomic.AtomicReference<>();
    static final java.util.Map<java.util.concurrent.ScheduledThreadPoolExecutor, java.lang.Object> POOLS = new java.util.concurrent.ConcurrentHashMap();

    private SchedulerPoolFactory() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    static {
        java.util.Properties properties = java.lang.System.getProperties();
        io.reactivex.internal.schedulers.SchedulerPoolFactory.PurgeProperties purgeProperties = new io.reactivex.internal.schedulers.SchedulerPoolFactory.PurgeProperties();
        purgeProperties.load(properties);
        PURGE_ENABLED = purgeProperties.purgeEnable;
        PURGE_PERIOD_SECONDS = purgeProperties.purgePeriod;
        start();
    }

    public static void start() {
        tryStart(PURGE_ENABLED);
    }

    static void tryStart(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> atomicReference = PURGE_THREAD;
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1, new io.reactivex.internal.schedulers.RxThreadFactory("RxSchedulerPurge"));
            if (atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                io.reactivex.internal.schedulers.SchedulerPoolFactory.ScheduledTask scheduledTask = new io.reactivex.internal.schedulers.SchedulerPoolFactory.ScheduledTask();
                int i = PURGE_PERIOD_SECONDS;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(scheduledTask, i, i, java.util.concurrent.TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }

    public static void shutdown() {
        java.util.concurrent.ScheduledExecutorService andSet = PURGE_THREAD.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        POOLS.clear();
    }

    static final class PurgeProperties {
        boolean purgeEnable;
        int purgePeriod;

        PurgeProperties() {
        }

        void load(java.util.Properties properties) {
            if (properties.containsKey(io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_ENABLED_KEY)) {
                this.purgeEnable = java.lang.Boolean.parseBoolean(properties.getProperty(io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_ENABLED_KEY));
            } else {
                this.purgeEnable = true;
            }
            if (this.purgeEnable && properties.containsKey(io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_PERIOD_SECONDS_KEY)) {
                try {
                    this.purgePeriod = java.lang.Integer.parseInt(properties.getProperty(io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_PERIOD_SECONDS_KEY));
                    return;
                } catch (java.lang.NumberFormatException unused) {
                    this.purgePeriod = 1;
                    return;
                }
            }
            this.purgePeriod = 1;
        }
    }

    public static java.util.concurrent.ScheduledExecutorService create(java.util.concurrent.ThreadFactory threadFactory) {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1, threadFactory);
        tryPutIntoPool(PURGE_ENABLED, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    static void tryPutIntoPool(boolean z, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof java.util.concurrent.ScheduledThreadPoolExecutor)) {
            POOLS.put((java.util.concurrent.ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    static final class ScheduledTask implements java.lang.Runnable {
        ScheduledTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new java.util.ArrayList(io.reactivex.internal.schedulers.SchedulerPoolFactory.POOLS.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    io.reactivex.internal.schedulers.SchedulerPoolFactory.POOLS.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }
}
