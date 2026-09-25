package io.fabric.sdk.android.services.concurrency;

/* JADX INFO: loaded from: classes2.dex */
public class PriorityThreadPoolExecutor extends java.util.concurrent.ThreadPoolExecutor {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final long KEEP_ALIVE = 1;
    private static final int MAXIMUM_POOL_SIZE;

    static {
        int iAvailableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        CORE_POOL_SIZE = iAvailableProcessors + 1;
        MAXIMUM_POOL_SIZE = (iAvailableProcessors * 2) + 1;
    }

    <T extends java.lang.Runnable & io.fabric.sdk.android.services.concurrency.Dependency & io.fabric.sdk.android.services.concurrency.Task & io.fabric.sdk.android.services.concurrency.PriorityProvider> PriorityThreadPoolExecutor(int i, int i2, long j, java.util.concurrent.TimeUnit timeUnit, io.fabric.sdk.android.services.concurrency.DependencyPriorityBlockingQueue<T> dependencyPriorityBlockingQueue, java.util.concurrent.ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, dependencyPriorityBlockingQueue, threadFactory);
        prestartAllCoreThreads();
    }

    public static <T extends java.lang.Runnable & io.fabric.sdk.android.services.concurrency.Dependency & io.fabric.sdk.android.services.concurrency.Task & io.fabric.sdk.android.services.concurrency.PriorityProvider> io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor create(int i, int i2) {
        return new io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor(i, i2, 1L, java.util.concurrent.TimeUnit.SECONDS, new io.fabric.sdk.android.services.concurrency.DependencyPriorityBlockingQueue(), new io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor.PriorityThreadFactory(10));
    }

    public static io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor create(int i) {
        return create(i, i);
    }

    public static io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor create() {
        return create(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected <T> java.util.concurrent.RunnableFuture<T> newTaskFor(java.lang.Runnable runnable, T t) {
        return new io.fabric.sdk.android.services.concurrency.PriorityFutureTask(runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected <T> java.util.concurrent.RunnableFuture<T> newTaskFor(java.util.concurrent.Callable<T> callable) {
        return new io.fabric.sdk.android.services.concurrency.PriorityFutureTask(callable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        if (io.fabric.sdk.android.services.concurrency.PriorityTask.isProperDelegate(runnable)) {
            super.execute(runnable);
        } else {
            super.execute(newTaskFor(runnable, null));
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(java.lang.Runnable runnable, java.lang.Throwable th) {
        io.fabric.sdk.android.services.concurrency.Task task = (io.fabric.sdk.android.services.concurrency.Task) runnable;
        task.setFinished(true);
        task.setError(th);
        getQueue().recycleBlockedQueue();
        super.afterExecute(runnable, th);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public io.fabric.sdk.android.services.concurrency.DependencyPriorityBlockingQueue getQueue() {
        return (io.fabric.sdk.android.services.concurrency.DependencyPriorityBlockingQueue) super.getQueue();
    }

    protected static final class PriorityThreadFactory implements java.util.concurrent.ThreadFactory {
        private final int threadPriority;

        public PriorityThreadFactory(int i) {
            this.threadPriority = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable);
            thread.setPriority(this.threadPriority);
            thread.setName("Queue");
            return thread;
        }
    }
}
