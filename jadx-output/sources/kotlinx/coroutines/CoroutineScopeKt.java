package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineScope.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\b\u0010\t\u001a\u00020\u0002H\u0007\u001a@\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0013*\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002\"\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"isActive", "", "Lkotlinx/coroutines/CoroutineScope;", "isActive$annotations", "(Lkotlinx/coroutines/CoroutineScope;)V", "(Lkotlinx/coroutines/CoroutineScope;)Z", "CoroutineScope", "context", "Lkotlin/coroutines/CoroutineContext;", "MainScope", "coroutineScope", "R", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "", "plus", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class CoroutineScopeKt {
    public static /* synthetic */ void isActive$annotations(kotlinx.coroutines.CoroutineScope coroutineScope) {
    }

    public static final kotlinx.coroutines.CoroutineScope plus(kotlinx.coroutines.CoroutineScope receiver$0, kotlin.coroutines.CoroutineContext context) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        return new kotlinx.coroutines.internal.ContextScope(receiver$0.getCoroutineContext().plus(context));
    }

    public static final kotlinx.coroutines.CoroutineScope MainScope() {
        return new kotlinx.coroutines.internal.ContextScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default(null, 1, null).plus(kotlinx.coroutines.Dispatchers.getMain()));
    }

    public static final boolean isActive(kotlinx.coroutines.CoroutineScope receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) receiver$0.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    public static final <R> java.lang.Object coroutineScope(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) throws java.lang.Throwable {
        kotlinx.coroutines.internal.ScopeCoroutine scopeCoroutine = new kotlinx.coroutines.internal.ScopeCoroutine(continuation.get$context(), continuation);
        java.lang.Object objStartUndispatchedOrReturn = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine, scopeCoroutine, function2);
        if (objStartUndispatchedOrReturn == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objStartUndispatchedOrReturn;
    }

    public static final kotlinx.coroutines.CoroutineScope CoroutineScope(kotlin.coroutines.CoroutineContext context) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        if (context.get(kotlinx.coroutines.Job.INSTANCE) == null) {
            context = context.plus(kotlinx.coroutines.JobKt__JobKt.Job$default(null, 1, null));
        }
        return new kotlinx.coroutines.internal.ContextScope(context);
    }

    public static final void cancel(kotlinx.coroutines.CoroutineScope receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) receiver$0.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
        if (job == null) {
            throw new java.lang.IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + receiver$0).toString());
        }
        job.cancel();
    }
}
