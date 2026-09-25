package kotlinx.coroutines;

/* JADX INFO: compiled from: Dispatched.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u001d\u0010\u000f\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\n\u0010\u0013\u001a\u0004\u0018\u00010\u000eH&R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/DispatchedTask;", "T", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "resumeMode", "", "(I)V", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate", "()Lkotlin/coroutines/Continuation;", "getExceptionalResult", "", "state", "", "getSuccessfulResult", "(Ljava/lang/Object;)Ljava/lang/Object;", "run", "", "takeState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public abstract class DispatchedTask<T> extends kotlinx.coroutines.scheduling.Task {
    public int resumeMode;

    public abstract kotlin.coroutines.Continuation<T> getDelegate();

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getSuccessfulResult(java.lang.Object state) {
        return state;
    }

    public abstract java.lang.Object takeState();

    public DispatchedTask(int i) {
        this.resumeMode = i;
    }

    public final java.lang.Throwable getExceptionalResult(java.lang.Object state) {
        if (!(state instanceof kotlinx.coroutines.CompletedExceptionally)) {
            state = null;
        }
        kotlinx.coroutines.CompletedExceptionally completedExceptionally = (kotlinx.coroutines.CompletedExceptionally) state;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:11:0x0030, B:13:0x0036, B:18:0x006f, B:14:0x004a, B:16:0x0050, B:17:0x0062), top: B:34:0x0030, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0050 A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:11:0x0030, B:13:0x0036, B:18:0x006f, B:14:0x004a, B:16:0x0050, B:17:0x0062), top: B:34:0x0030, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0062 A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:11:0x0030, B:13:0x0036, B:18:0x006f, B:14:0x004a, B:16:0x0050, B:17:0x0062), top: B:34:0x0030, outer: #0 }] */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Throwable exceptionalResult;
        kotlinx.coroutines.scheduling.TaskContext taskContext = this.taskContext;
        try {
            kotlin.coroutines.Continuation<T> delegate = getDelegate();
            if (delegate == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
            }
            kotlinx.coroutines.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.DispatchedContinuation) delegate;
            kotlin.coroutines.Continuation<T> continuation = dispatchedContinuation.continuation;
            kotlin.coroutines.CoroutineContext context = continuation.get$context();
            kotlinx.coroutines.Job job = kotlinx.coroutines.ResumeModeKt.isCancellableMode(this.resumeMode) ? (kotlinx.coroutines.Job) context.get(kotlinx.coroutines.Job.INSTANCE) : null;
            java.lang.Object objTakeState = takeState();
            java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, dispatchedContinuation.countOrElement);
            if (job != null) {
                try {
                    if (!job.isActive()) {
                        java.util.concurrent.CancellationException cancellationException = job.getCancellationException();
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        continuation.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(cancellationException)));
                    } else {
                        exceptionalResult = getExceptionalResult(objTakeState);
                        if (exceptionalResult != null) {
                            T successfulResult = getSuccessfulResult(objTakeState);
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            continuation.resumeWith(kotlin.Result.m13constructorimpl(successfulResult));
                        } else {
                            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                            continuation.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(exceptionalResult, continuation))));
                        }
                    }
                } catch (java.lang.Throwable th) {
                    kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                    throw th;
                }
            } else {
                exceptionalResult = getExceptionalResult(objTakeState);
                if (exceptionalResult != null) {
                    T successfulResult2 = getSuccessfulResult(objTakeState);
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m13constructorimpl(successfulResult2));
                } else {
                    kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(exceptionalResult, continuation))));
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            taskContext.afterTask();
        } catch (java.lang.Throwable th2) {
            try {
                throw new kotlinx.coroutines.DispatchException("Unexpected exception running " + this, th2);
            } catch (java.lang.Throwable th3) {
                taskContext.afterTask();
                throw th3;
            }
        }
    }
}
