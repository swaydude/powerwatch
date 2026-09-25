package kotlinx.coroutines;

/* JADX INFO: compiled from: CommonPool.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0011\u001a\u0004\u0018\u0001H\u0012\"\u0004\b\u0000\u0010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0014H\u0082\b¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u001c\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\n\u0010\u0013\u001a\u00060\u001ej\u0002`\u001fH\u0016J\b\u0010 \u001a\u00020\u0006H\u0002J!\u0010!\u001a\u00020\u00102\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#2\u0006\u0010\u0005\u001a\u00020\u0019H\u0000¢\u0006\u0002\b$J\r\u0010%\u001a\u00020\u0017H\u0000¢\u0006\u0002\b&J\u0015\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)H\u0000¢\u0006\u0002\b*J\b\u0010+\u001a\u00020\u0004H\u0016J\r\u0010\u000f\u001a\u00020\u0017H\u0000¢\u0006\u0002\b,R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lkotlinx/coroutines/CommonPool;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "()V", "DEFAULT_PARALLELISM_PROPERTY_NAME", "", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "parallelism", "", "getParallelism", "()I", "pool", "requestedParallelism", "usePrivatePool", "", "Try", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "close", "", "createPlainPool", "Ljava/util/concurrent/ExecutorService;", "createPool", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "getOrCreatePoolSync", "isGoodCommonPool", "fjpClass", "Ljava/lang/Class;", "isGoodCommonPool$kotlinx_coroutines_core", "restore", "restore$kotlinx_coroutines_core", "shutdown", com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT, "", "shutdown$kotlinx_coroutines_core", "toString", "usePrivatePool$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class CommonPool extends kotlinx.coroutines.ExecutorCoroutineDispatcher {
    public static final java.lang.String DEFAULT_PARALLELISM_PROPERTY_NAME = "kotlinx.coroutines.default.parallelism";
    public static final kotlinx.coroutines.CommonPool INSTANCE = new kotlinx.coroutines.CommonPool();
    private static volatile java.util.concurrent.Executor pool;
    private static final int requestedParallelism;
    private static boolean usePrivatePool;

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
        return "CommonPool";
    }

    static {
        java.lang.String property;
        int iIntValue;
        try {
            property = java.lang.System.getProperty(DEFAULT_PARALLELISM_PROPERTY_NAME);
        } catch (java.lang.Throwable unused) {
            property = null;
        }
        if (property != null) {
            java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(property);
            if (intOrNull == null || intOrNull.intValue() < 1) {
                throw new java.lang.IllegalStateException(("Expected positive number in kotlinx.coroutines.default.parallelism, but has " + property).toString());
            }
            iIntValue = intOrNull.intValue();
        } else {
            iIntValue = -1;
        }
        requestedParallelism = iIntValue;
    }

    private CommonPool() {
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public java.util.concurrent.Executor getExecutor() {
        java.util.concurrent.Executor executor = pool;
        return executor != null ? executor : getOrCreatePoolSync();
    }

    private final int getParallelism() {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(requestedParallelism);
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : kotlin.ranges.RangesKt.coerceAtLeast(java.lang.Runtime.getRuntime().availableProcessors() - 1, 1);
    }

    private final <T> T Try(kotlin.jvm.functions.Function0<? extends T> block) {
        try {
            return block.invoke();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private final java.util.concurrent.ExecutorService createPool() {
        java.lang.Class<?> cls;
        java.util.concurrent.ExecutorService executorService;
        if (java.lang.System.getSecurityManager() != null) {
            return createPlainPool();
        }
        java.util.concurrent.ExecutorService executorService2 = null;
        try {
            cls = java.lang.Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return createPlainPool();
        }
        if (!usePrivatePool && requestedParallelism < 0) {
            try {
                java.lang.reflect.Method method = cls.getMethod("commonPool", new java.lang.Class[0]);
                java.lang.Object objInvoke = method != null ? method.invoke(null, new java.lang.Object[0]) : null;
                if (!(objInvoke instanceof java.util.concurrent.ExecutorService)) {
                    objInvoke = null;
                }
                executorService = (java.util.concurrent.ExecutorService) objInvoke;
            } catch (java.lang.Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                if (!INSTANCE.isGoodCommonPool$kotlinx_coroutines_core(cls, executorService)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            java.lang.Object objNewInstance = cls.getConstructor(java.lang.Integer.TYPE).newInstance(java.lang.Integer.valueOf(INSTANCE.getParallelism()));
            if (!(objNewInstance instanceof java.util.concurrent.ExecutorService)) {
                objNewInstance = null;
            }
            executorService2 = (java.util.concurrent.ExecutorService) objNewInstance;
        } catch (java.lang.Throwable unused3) {
        }
        return executorService2 != null ? executorService2 : createPlainPool();
    }

    public final boolean isGoodCommonPool$kotlinx_coroutines_core(java.lang.Class<?> fjpClass, java.util.concurrent.ExecutorService executor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fjpClass, "fjpClass");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(executor, "executor");
        executor.submit(new java.lang.Runnable() { // from class: kotlinx.coroutines.CommonPool$isGoodCommonPool$1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        java.lang.Integer num = null;
        try {
            java.lang.Object objInvoke = fjpClass.getMethod("getPoolSize", new java.lang.Class[0]).invoke(executor, new java.lang.Object[0]);
            if (!(objInvoke instanceof java.lang.Integer)) {
                objInvoke = null;
            }
            num = (java.lang.Integer) objInvoke;
        } catch (java.lang.Throwable unused) {
        }
        return num != null && num.intValue() >= 1;
    }

    private final java.util.concurrent.ExecutorService createPlainPool() {
        final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
        java.util.concurrent.ExecutorService executorServiceNewFixedThreadPool = java.util.concurrent.Executors.newFixedThreadPool(getParallelism(), new java.util.concurrent.ThreadFactory() { // from class: kotlinx.coroutines.CommonPool.createPlainPool.1
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                java.lang.Thread thread = new java.lang.Thread(runnable, "CommonPool-worker-" + atomicInteger.incrementAndGet());
                thread.setDaemon(true);
                return thread;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(executorServiceNewFixedThreadPool, "Executors.newFixedThread…Daemon = true }\n        }");
        return executorServiceNewFixedThreadPool;
    }

    private final synchronized java.util.concurrent.Executor getOrCreatePoolSync() {
        java.util.concurrent.ExecutorService executorService;
        executorService = pool;
        if (executorService == null) {
            java.util.concurrent.ExecutorService executorServiceCreatePool = createPool();
            pool = executorServiceCreatePool;
            executorService = executorServiceCreatePool;
        }
        return executorService;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo1406dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        try {
            java.util.concurrent.Executor orCreatePoolSync = pool;
            if (orCreatePoolSync == null) {
                orCreatePoolSync = getOrCreatePoolSync();
            }
            orCreatePoolSync.execute(kotlinx.coroutines.TimeSourceKt.getTimeSource().wrapTask(block));
        } catch (java.util.concurrent.RejectedExecutionException unused) {
            kotlinx.coroutines.TimeSourceKt.getTimeSource().unTrackTask();
            kotlinx.coroutines.DefaultExecutor.INSTANCE.enqueue(block);
        }
    }

    public final synchronized void usePrivatePool$kotlinx_coroutines_core() {
        shutdown$kotlinx_coroutines_core(0L);
        usePrivatePool = true;
        pool = (java.util.concurrent.Executor) null;
    }

    public final synchronized void shutdown$kotlinx_coroutines_core(long timeout) {
        java.util.concurrent.Executor executor = pool;
        if (!(executor instanceof java.util.concurrent.ExecutorService)) {
            executor = null;
        }
        java.util.concurrent.ExecutorService executorService = (java.util.concurrent.ExecutorService) executor;
        if (executorService != null) {
            executorService.shutdown();
            if (timeout > 0) {
                executorService.awaitTermination(timeout, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            java.util.List<java.lang.Runnable> listShutdownNow = executorService.shutdownNow();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(listShutdownNow, "shutdownNow()");
            for (java.lang.Runnable it : listShutdownNow) {
                kotlinx.coroutines.DefaultExecutor defaultExecutor = kotlinx.coroutines.DefaultExecutor.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                defaultExecutor.enqueue(it);
            }
        }
        pool = new java.util.concurrent.Executor() { // from class: kotlinx.coroutines.CommonPool$shutdown$2
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                throw new java.util.concurrent.RejectedExecutionException("CommonPool was shutdown");
            }
        };
    }

    public final synchronized void restore$kotlinx_coroutines_core() {
        shutdown$kotlinx_coroutines_core(0L);
        usePrivatePool = false;
        pool = (java.util.concurrent.Executor) null;
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new java.lang.IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }
}
