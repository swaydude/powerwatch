package kotlinx.coroutines;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0016J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\r\u0010\u0013\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0014J\u001c\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0016J*\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a2\n\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0016J\b\u0010!\u001a\u00020\"H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcherBase;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "()V", "removesFutureOnCancellation", "", "close", "", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "initFutureCancellation", "initFutureCancellation$kotlinx_coroutines_core", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "scheduleBlock", "Ljava/util/concurrent/ScheduledFuture;", "time", "unit", "Ljava/util/concurrent/TimeUnit;", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public abstract class ExecutorCoroutineDispatcherBase extends kotlinx.coroutines.ExecutorCoroutineDispatcher implements kotlinx.coroutines.Delay {
    private boolean removesFutureOnCancellation;

    @Override // kotlinx.coroutines.Delay
    public java.lang.Object delay(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlinx.coroutines.Delay.DefaultImpls.delay(this, j, continuation);
    }

    public final void initFutureCancellation$kotlinx_coroutines_core() {
        this.removesFutureOnCancellation = kotlinx.coroutines.internal.ConcurrentKt.removeFutureOnCancel(getExecutor());
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo1406dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        try {
            getExecutor().execute(kotlinx.coroutines.TimeSourceKt.getTimeSource().wrapTask(block));
        } catch (java.util.concurrent.RejectedExecutionException unused) {
            kotlinx.coroutines.TimeSourceKt.getTimeSource().unTrackTask();
            kotlinx.coroutines.DefaultExecutor.INSTANCE.enqueue(block);
        }
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo1407scheduleResumeAfterDelay(long timeMillis, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(continuation, "continuation");
        java.util.concurrent.ScheduledFuture<?> scheduledFutureScheduleBlock = this.removesFutureOnCancellation ? scheduleBlock(new kotlinx.coroutines.ResumeUndispatchedRunnable(this, continuation), timeMillis, java.util.concurrent.TimeUnit.MILLISECONDS) : null;
        if (scheduledFutureScheduleBlock != null) {
            kotlinx.coroutines.JobKt.cancelFutureOnCancellation(continuation, scheduledFutureScheduleBlock);
        } else {
            kotlinx.coroutines.DefaultExecutor.INSTANCE.mo1407scheduleResumeAfterDelay(timeMillis, continuation);
        }
    }

    @Override // kotlinx.coroutines.Delay
    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long timeMillis, java.lang.Runnable block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        java.util.concurrent.ScheduledFuture<?> scheduledFutureScheduleBlock = this.removesFutureOnCancellation ? scheduleBlock(block, timeMillis, java.util.concurrent.TimeUnit.MILLISECONDS) : null;
        return scheduledFutureScheduleBlock != null ? new kotlinx.coroutines.DisposableFutureHandle(scheduledFutureScheduleBlock) : kotlinx.coroutines.DefaultExecutor.INSTANCE.invokeOnTimeout(timeMillis, block);
    }

    private final java.util.concurrent.ScheduledFuture<?> scheduleBlock(java.lang.Runnable block, long time, java.util.concurrent.TimeUnit unit) {
        try {
            java.util.concurrent.Executor executor = getExecutor();
            if (!(executor instanceof java.util.concurrent.ScheduledExecutorService)) {
                executor = null;
            }
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) executor;
            if (scheduledExecutorService != null) {
                return scheduledExecutorService.schedule(block, time, unit);
            }
            return null;
        } catch (java.util.concurrent.RejectedExecutionException unused) {
            return null;
        }
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.util.concurrent.Executor executor = getExecutor();
        if (!(executor instanceof java.util.concurrent.ExecutorService)) {
            executor = null;
        }
        java.util.concurrent.ExecutorService executorService = (java.util.concurrent.ExecutorService) executor;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
        return getExecutor().toString();
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof kotlinx.coroutines.ExecutorCoroutineDispatcherBase) && ((kotlinx.coroutines.ExecutorCoroutineDispatcherBase) other).getExecutor() == getExecutor();
    }

    public int hashCode() {
        return java.lang.System.identityHashCode(getExecutor());
    }
}
