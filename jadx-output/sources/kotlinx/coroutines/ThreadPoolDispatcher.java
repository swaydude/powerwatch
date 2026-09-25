package kotlinx.coroutines;

/* JADX INFO: compiled from: ThreadPoolDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/ThreadPoolDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcherBase;", "nThreads", "", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "(ILjava/lang/String;)V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "threadNo", "Ljava/util/concurrent/atomic/AtomicInteger;", "close", "", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class ThreadPoolDispatcher extends kotlinx.coroutines.ExecutorCoroutineDispatcherBase {
    private final java.util.concurrent.Executor executor;
    private final int nThreads;
    private final java.lang.String name;
    private final java.util.concurrent.atomic.AtomicInteger threadNo;

    public ThreadPoolDispatcher(int i, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        this.nThreads = i;
        this.name = name;
        this.threadNo = new java.util.concurrent.atomic.AtomicInteger();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(i, new java.util.concurrent.ThreadFactory() { // from class: kotlinx.coroutines.ThreadPoolDispatcher$executor$1
            @Override // java.util.concurrent.ThreadFactory
            public final kotlinx.coroutines.PoolThread newThread(java.lang.Runnable target) {
                java.lang.String str;
                kotlinx.coroutines.ThreadPoolDispatcher threadPoolDispatcher = this.this$0;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(target, "target");
                if (this.this$0.nThreads == 1) {
                    str = this.this$0.name;
                } else {
                    str = this.this$0.name + "-" + this.this$0.threadNo.incrementAndGet();
                }
                return new kotlinx.coroutines.PoolThread(threadPoolDispatcher, target, str);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(scheduledExecutorServiceNewScheduledThreadPool, "Executors.newScheduledTh….incrementAndGet())\n    }");
        this.executor = scheduledExecutorServiceNewScheduledThreadPool;
        initFutureCancellation$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public java.util.concurrent.Executor getExecutor() {
        return this.executor;
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcherBase, kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.util.concurrent.Executor executor = getExecutor();
        if (executor == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type java.util.concurrent.ExecutorService");
        }
        ((java.util.concurrent.ExecutorService) executor).shutdown();
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcherBase, kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
        return "ThreadPoolDispatcher[" + this.nThreads + ", " + this.name + ']';
    }
}
