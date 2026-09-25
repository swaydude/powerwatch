package kotlinx.coroutines;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\r\u0010\u001c\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001dJ\u001c\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\b2\n\u0010!\u001a\u00060\u0002j\u0002`\u0003H\u0016J\b\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020\u001aH\u0016J\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0004R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopImplBase;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "()V", "ACTIVE", "", "DEFAULT_KEEP_ALIVE", "", "FRESH", "KEEP_ALIVE_NANOS", "SHUTDOWN_ACK", "SHUTDOWN_REQ", "THREAD_NAME", "", "_thread", "Ljava/lang/Thread;", "_thread$annotations", "debugStatus", "isShutdownRequested", "", "()Z", "thread", "getThread", "()Ljava/lang/Thread;", "acknowledgeShutdownIfNeeded", "", "createThreadSync", "ensureStarted", "ensureStarted$kotlinx_coroutines_core", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "block", "notifyStartup", "run", "shutdown", com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT, "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class DefaultExecutor extends kotlinx.coroutines.EventLoopImplBase implements java.lang.Runnable {
    private static final int ACTIVE = 1;
    private static final long DEFAULT_KEEP_ALIVE = 1000;
    private static final int FRESH = 0;
    public static final kotlinx.coroutines.DefaultExecutor INSTANCE;
    private static final long KEEP_ALIVE_NANOS;
    private static final int SHUTDOWN_ACK = 3;
    private static final int SHUTDOWN_REQ = 2;
    public static final java.lang.String THREAD_NAME = "kotlinx.coroutines.DefaultExecutor";
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;

    private static /* synthetic */ void _thread$annotations() {
    }

    static {
        java.lang.Long lValueOf;
        kotlinx.coroutines.DefaultExecutor defaultExecutor = new kotlinx.coroutines.DefaultExecutor();
        INSTANCE = defaultExecutor;
        kotlinx.coroutines.EventLoop.incrementUseCount$default(defaultExecutor, false, 1, null);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        try {
            lValueOf = java.lang.Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", DEFAULT_KEEP_ALIVE);
        } catch (java.lang.SecurityException unused) {
            lValueOf = java.lang.Long.valueOf(DEFAULT_KEEP_ALIVE);
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lValueOf, "try {\n            java.l…AULT_KEEP_ALIVE\n        }");
        KEEP_ALIVE_NANOS = timeUnit.toNanos(lValueOf.longValue());
    }

    private DefaultExecutor() {
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    protected java.lang.Thread getThread() {
        java.lang.Thread thread = _thread;
        return thread != null ? thread : createThreadSync();
    }

    private final boolean isShutdownRequested() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.Delay
    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long timeMillis, java.lang.Runnable block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        kotlinx.coroutines.EventLoopImplBase.DelayedRunnableTask delayedRunnableTask = new kotlinx.coroutines.EventLoopImplBase.DelayedRunnableTask(timeMillis, block);
        INSTANCE.schedule$kotlinx_coroutines_core(delayedRunnableTask);
        return delayedRunnableTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zIsEmpty;
        kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.setEventLoop$kotlinx_coroutines_core(this);
        kotlinx.coroutines.TimeSourceKt.getTimeSource().registerTimeLoopThread();
        try {
            if (!notifyStartup()) {
                if (zIsEmpty) {
                    return;
                } else {
                    return;
                }
            }
            long j = Long.MAX_VALUE;
            while (true) {
                java.lang.Thread.interrupted();
                long jProcessNextEvent = processNextEvent();
                if (jProcessNextEvent == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                    if (j == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                        long jNanoTime = kotlinx.coroutines.TimeSourceKt.getTimeSource().nanoTime();
                        if (j == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                            j = KEEP_ALIVE_NANOS + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            if (zIsEmpty) {
                                return;
                            } else {
                                return;
                            }
                        }
                        jProcessNextEvent = kotlin.ranges.RangesKt.coerceAtMost(jProcessNextEvent, j2);
                    } else {
                        jProcessNextEvent = kotlin.ranges.RangesKt.coerceAtMost(jProcessNextEvent, KEEP_ALIVE_NANOS);
                    }
                }
                if (jProcessNextEvent > 0) {
                    if (isShutdownRequested()) {
                        if (zIsEmpty) {
                            return;
                        } else {
                            return;
                        }
                    }
                    kotlinx.coroutines.TimeSourceKt.getTimeSource().parkNanos(this, jProcessNextEvent);
                }
            }
        } finally {
            _thread = (java.lang.Thread) null;
            acknowledgeShutdownIfNeeded();
            kotlinx.coroutines.TimeSourceKt.getTimeSource().unregisterTimeLoopThread();
            if (!isEmpty()) {
                getThread();
            }
        }
    }

    private final synchronized java.lang.Thread createThreadSync() {
        java.lang.Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new java.lang.Thread(this, THREAD_NAME);
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final synchronized void ensureStarted$kotlinx_coroutines_core() {
        java.lang.Thread thread = _thread;
        if (debugStatus != 0) {
            int i = debugStatus;
        }
        debugStatus = 0;
        createThreadSync();
        while (debugStatus == 0) {
            wait();
        }
    }

    private final synchronized boolean notifyStartup() {
        if (isShutdownRequested()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    public final synchronized void shutdown(long timeout) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() + timeout;
        if (!isShutdownRequested()) {
            debugStatus = 2;
        }
        while (debugStatus != 3 && _thread != null) {
            java.lang.Thread thread = _thread;
            if (thread != null) {
                kotlinx.coroutines.TimeSourceKt.getTimeSource().unpark(thread);
            }
            if (jCurrentTimeMillis - java.lang.System.currentTimeMillis() <= 0) {
                break;
            } else {
                wait(timeout);
            }
        }
        debugStatus = 0;
    }

    private final synchronized void acknowledgeShutdownIfNeeded() {
        if (isShutdownRequested()) {
            debugStatus = 3;
            resetAll();
            notifyAll();
        }
    }
}
