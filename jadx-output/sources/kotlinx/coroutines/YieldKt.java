package kotlinx.coroutines;

/* JADX INFO: compiled from: Yield.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"yield", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkCompletion", "Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class YieldKt {
    public static final java.lang.Object yield(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutine_suspended;
        kotlin.coroutines.CoroutineContext context = continuation.get$context();
        checkCompletion(context);
        kotlin.coroutines.Continuation continuationIntercepted = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation);
        if (!(continuationIntercepted instanceof kotlinx.coroutines.DispatchedContinuation)) {
            continuationIntercepted = null;
        }
        kotlinx.coroutines.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.DispatchedContinuation) continuationIntercepted;
        if (dispatchedContinuation == null) {
            coroutine_suspended = kotlin.Unit.INSTANCE;
        } else if (!dispatchedContinuation.dispatcher.isDispatchNeeded(context)) {
            coroutine_suspended = kotlinx.coroutines.DispatchedKt.yieldUndispatched(dispatchedContinuation) ? kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() : kotlin.Unit.INSTANCE;
        } else {
            dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(kotlin.Unit.INSTANCE);
            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }

    public static final void checkCompletion(kotlin.coroutines.CoroutineContext receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) receiver$0.get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null && !job.isActive()) {
            throw job.getCancellationException();
        }
    }
}
