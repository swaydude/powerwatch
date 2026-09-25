package kotlinx.coroutines.intrinsics;

/* JADX INFO: compiled from: Undispatched.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0082\b\u001a>\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aR\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0002*\u001e\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\f\u001a\u0002H\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a>\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aR\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0002*\u001e\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\f\u001a\u0002H\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\r\u001aY\u0010\u000f\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\f\u001a\u0002H\n2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0002\b\u0011H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aY\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\f\u001a\u0002H\n2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0002\b\u0011H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a?\u0010\u0014\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00062\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0019H\u0082\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"startDirect", "", "T", "completion", "Lkotlin/coroutines/Continuation;", "block", "Lkotlin/Function1;", "", "startCoroutineUndispatched", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "startCoroutineUnintercepted", "startUndispatchedOrReturn", "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/AbstractCoroutine;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "startUndispatchedOrReturnIgnoreTimeout", "undispatchedResult", "shouldThrow", "", "", "startBlock", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class UndispatchedKt {
    public static final <T, R> java.lang.Object startUndispatchedOrReturn(kotlinx.coroutines.AbstractCoroutine<? super T> receiver$0, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block) throws java.lang.Throwable {
        java.lang.Object completedExceptionally;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        receiver$0.initParentJob$kotlinx_coroutines_core();
        try {
            completedExceptionally = ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(block, 2)).invoke(r, receiver$0);
        } catch (java.lang.Throwable th) {
            completedExceptionally = new kotlinx.coroutines.CompletedExceptionally(th);
        }
        if (completedExceptionally == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (receiver$0.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally, 4)) {
            java.lang.Object state$kotlinx_coroutines_core = receiver$0.getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
                kotlinx.coroutines.CompletedExceptionally completedExceptionally2 = (kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core;
                java.lang.Throwable th2 = completedExceptionally2.cause;
                throw kotlinx.coroutines.internal.ScopesKt.tryRecover(receiver$0, completedExceptionally2.cause);
            }
            return kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
        }
        return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public static final <T, R> java.lang.Object startUndispatchedOrReturnIgnoreTimeout(kotlinx.coroutines.AbstractCoroutine<? super T> receiver$0, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block) throws java.lang.Throwable {
        java.lang.Object completedExceptionally;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        receiver$0.initParentJob$kotlinx_coroutines_core();
        try {
            completedExceptionally = ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(block, 2)).invoke(r, receiver$0);
        } catch (java.lang.Throwable th) {
            completedExceptionally = new kotlinx.coroutines.CompletedExceptionally(th);
        }
        if (completedExceptionally == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (receiver$0.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally, 4)) {
            java.lang.Object state$kotlinx_coroutines_core = receiver$0.getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
                kotlinx.coroutines.CompletedExceptionally completedExceptionally2 = (kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core;
                java.lang.Throwable th2 = completedExceptionally2.cause;
                if (((th2 instanceof kotlinx.coroutines.TimeoutCancellationException) && ((kotlinx.coroutines.TimeoutCancellationException) th2).coroutine == receiver$0) ? false : true) {
                    throw kotlinx.coroutines.internal.ScopesKt.tryRecover(receiver$0, completedExceptionally2.cause);
                }
                if (completedExceptionally instanceof kotlinx.coroutines.CompletedExceptionally) {
                    throw kotlinx.coroutines.internal.ScopesKt.tryRecover(receiver$0, ((kotlinx.coroutines.CompletedExceptionally) completedExceptionally).cause);
                }
                return completedExceptionally;
            }
            return kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
        }
        return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    private static final <T> java.lang.Object undispatchedResult(kotlinx.coroutines.AbstractCoroutine<? super T> abstractCoroutine, kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> function1, kotlin.jvm.functions.Function0<? extends java.lang.Object> function0) throws java.lang.Throwable {
        java.lang.Object completedExceptionally;
        try {
            completedExceptionally = function0.invoke();
        } catch (java.lang.Throwable th) {
            completedExceptionally = new kotlinx.coroutines.CompletedExceptionally(th);
        }
        if (completedExceptionally == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (abstractCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally, 4)) {
            java.lang.Object state$kotlinx_coroutines_core = abstractCoroutine.getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
                kotlinx.coroutines.CompletedExceptionally completedExceptionally2 = (kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core;
                if (function1.invoke(completedExceptionally2.cause).booleanValue()) {
                    throw kotlinx.coroutines.internal.ScopesKt.tryRecover(abstractCoroutine, completedExceptionally2.cause);
                }
                if (completedExceptionally instanceof kotlinx.coroutines.CompletedExceptionally) {
                    throw kotlinx.coroutines.internal.ScopesKt.tryRecover(abstractCoroutine, ((kotlinx.coroutines.CompletedExceptionally) completedExceptionally).cause);
                }
                return completedExceptionally;
            }
            return kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
        }
        return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public static final <T> void startCoroutineUnintercepted(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> receiver$0, kotlin.coroutines.Continuation<? super T> completion) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(completion, "completion");
        kotlin.coroutines.Continuation continuationProbeCoroutineCreated = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(completion);
        try {
            java.lang.Object objInvoke = ((kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(receiver$0, 1)).invoke(continuationProbeCoroutineCreated);
            if (objInvoke != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuationProbeCoroutineCreated.resumeWith(kotlin.Result.m13constructorimpl(objInvoke));
            }
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuationProbeCoroutineCreated.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(th)));
        }
    }

    public static final <R, T> void startCoroutineUnintercepted(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> receiver$0, R r, kotlin.coroutines.Continuation<? super T> completion) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(completion, "completion");
        kotlin.coroutines.Continuation continuationProbeCoroutineCreated = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(completion);
        try {
            java.lang.Object objInvoke = ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(receiver$0, 2)).invoke(r, continuationProbeCoroutineCreated);
            if (objInvoke != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuationProbeCoroutineCreated.resumeWith(kotlin.Result.m13constructorimpl(objInvoke));
            }
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuationProbeCoroutineCreated.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(th)));
        }
    }

    public static final <T> void startCoroutineUndispatched(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> receiver$0, kotlin.coroutines.Continuation<? super T> completion) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(completion, "completion");
        kotlin.coroutines.Continuation continuationProbeCoroutineCreated = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(completion);
        try {
            kotlin.coroutines.CoroutineContext context = completion.getContext();
            java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, null);
            try {
                java.lang.Object objInvoke = ((kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(receiver$0, 1)).invoke(continuationProbeCoroutineCreated);
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                if (objInvoke != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuationProbeCoroutineCreated.resumeWith(kotlin.Result.m13constructorimpl(objInvoke));
                }
            } catch (java.lang.Throwable th) {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuationProbeCoroutineCreated.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(th2)));
        }
    }

    public static final <R, T> void startCoroutineUndispatched(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> receiver$0, R r, kotlin.coroutines.Continuation<? super T> completion) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(completion, "completion");
        kotlin.coroutines.Continuation continuationProbeCoroutineCreated = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(completion);
        try {
            kotlin.coroutines.CoroutineContext context = completion.getContext();
            java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, null);
            try {
                java.lang.Object objInvoke = ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(receiver$0, 2)).invoke(r, continuationProbeCoroutineCreated);
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                if (objInvoke != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuationProbeCoroutineCreated.resumeWith(kotlin.Result.m13constructorimpl(objInvoke));
                }
            } catch (java.lang.Throwable th) {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuationProbeCoroutineCreated.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(th2)));
        }
    }

    private static final <T> void startDirect(kotlin.coroutines.Continuation<? super T> continuation, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1) {
        kotlin.coroutines.Continuation continuationProbeCoroutineCreated = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            java.lang.Object objInvoke = function1.invoke(continuationProbeCoroutineCreated);
            if (objInvoke != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuationProbeCoroutineCreated.resumeWith(kotlin.Result.m13constructorimpl(objInvoke));
            }
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuationProbeCoroutineCreated.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(th)));
        }
    }
}
