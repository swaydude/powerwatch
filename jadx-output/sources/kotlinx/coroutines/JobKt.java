package kotlinx.coroutines;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"kotlinx/coroutines/JobKt__FutureKt", "kotlinx/coroutines/JobKt__JobKt"}, k = 4, mv = {1, 1, 13})
public final class JobKt {
    public static final kotlinx.coroutines.DisposableHandle DisposableHandle(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        return kotlinx.coroutines.JobKt__JobKt.DisposableHandle(function0);
    }

    public static final kotlinx.coroutines.Job Job(kotlinx.coroutines.Job job) {
        return kotlinx.coroutines.JobKt__JobKt.Job(job);
    }

    public static final void cancel(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.JobKt__JobKt.cancel(coroutineContext);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use cancel() without cause", replaceWith = @kotlin.ReplaceWith(expression = "cancel()", imports = {}))
    public static final boolean cancel(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th) {
        return kotlinx.coroutines.JobKt__JobKt.cancel(coroutineContext, th);
    }

    public static final java.lang.Object cancelAndJoin(kotlinx.coroutines.Job job, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlinx.coroutines.JobKt__JobKt.cancelAndJoin(job, continuation);
    }

    public static final void cancelChildren(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.JobKt__JobKt.cancelChildren(coroutineContext);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use cancelChildren() without cause", replaceWith = @kotlin.ReplaceWith(expression = "cancelChildren()", imports = {}))
    public static final void cancelChildren(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th) {
        kotlinx.coroutines.JobKt__JobKt.cancelChildren(coroutineContext, th);
    }

    public static final void cancelChildren(kotlinx.coroutines.Job job) {
        kotlinx.coroutines.JobKt__JobKt.cancelChildren(job);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use cancelChildren() without cause", replaceWith = @kotlin.ReplaceWith(expression = "cancelChildren()", imports = {}))
    public static final void cancelChildren(kotlinx.coroutines.Job job, java.lang.Throwable th) {
        kotlinx.coroutines.JobKt__JobKt.cancelChildren(job, th);
    }

    public static final void cancelFutureOnCancellation(kotlinx.coroutines.CancellableContinuation<?> cancellableContinuation, java.util.concurrent.Future<?> future) {
        kotlinx.coroutines.JobKt__FutureKt.cancelFutureOnCancellation(cancellableContinuation, future);
    }

    public static final kotlinx.coroutines.DisposableHandle cancelFutureOnCompletion(kotlinx.coroutines.Job job, java.util.concurrent.Future<?> future) {
        return kotlinx.coroutines.JobKt__FutureKt.cancelFutureOnCompletion(job, future);
    }

    public static final kotlinx.coroutines.DisposableHandle disposeOnCompletion(kotlinx.coroutines.Job job, kotlinx.coroutines.DisposableHandle disposableHandle) {
        return kotlinx.coroutines.JobKt__JobKt.disposeOnCompletion(job, disposableHandle);
    }

    public static final boolean isActive(kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.JobKt__JobKt.isActive(coroutineContext);
    }
}
