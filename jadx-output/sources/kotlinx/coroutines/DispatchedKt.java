package kotlinx.coroutines;

/* JADX INFO: compiled from: Dispatched.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0082\b\u001a\"\u0010\n\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000\u001a;\u0010\u000f\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0082\b\u001a.\u0010\u0015\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0000\u001a%\u0010\u0019\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00172\u0006\u0010\u001a\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\u001b\u001a \u0010\u001c\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0000\u001a%\u0010\u001f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00172\u0006\u0010\u001a\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\u001b\u001a \u0010 \u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0000\u001a\u0010\u0010!\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\fH\u0002\u001a\u0019\u0010\"\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0080\b\u001a\u0012\u0010#\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006$"}, d2 = {"UNDEFINED", "Lkotlinx/coroutines/internal/Symbol;", "UNDEFINED$annotations", "()V", "runUnconfinedEventLoop", "", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "block", "Lkotlin/Function0;", "dispatch", "T", "Lkotlinx/coroutines/DispatchedTask;", "mode", "", "executeUnconfined", "", "Lkotlinx/coroutines/DispatchedContinuation;", "contState", "", "doYield", "resume", "delegate", "Lkotlin/coroutines/Continuation;", "useMode", "resumeCancellable", "value", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "resumeCancellableWithException", "exception", "", "resumeDirect", "resumeDirectWithException", "resumeUnconfined", "resumeWithStackTrace", "yieldUndispatched", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class DispatchedKt {
    private static final kotlinx.coroutines.internal.Symbol UNDEFINED = new kotlinx.coroutines.internal.Symbol("UNDEFINED");

    private static /* synthetic */ void UNDEFINED$annotations() {
    }

    private static final boolean executeUnconfined(kotlinx.coroutines.DispatchedContinuation<?> dispatchedContinuation, java.lang.Object obj, int i, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (z && eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            dispatchedContinuation._state = obj;
            dispatchedContinuation.resumeMode = i;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            function0.invoke();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return false;
        } catch (java.lang.Throwable th) {
            try {
                throw new kotlinx.coroutines.DispatchException("Unexpected exception in unconfined event loop", th);
            } catch (java.lang.Throwable th2) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    private static final void resumeUnconfined(kotlinx.coroutines.DispatchedTask<?> dispatchedTask) {
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedTask);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            resume(dispatchedTask, dispatchedTask.getDelegate(), 3);
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
            eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
        } catch (java.lang.Throwable th) {
            try {
                throw new kotlinx.coroutines.DispatchException("Unexpected exception in unconfined event loop", th);
            } catch (java.lang.Throwable th2) {
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runUnconfinedEventLoop(kotlinx.coroutines.EventLoop eventLoop, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        eventLoop.incrementUseCount(true);
        try {
            function0.invoke();
            do {
            } while (eventLoop.processUnconfinedEvent());
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            eventLoop.decrementUseCount(true);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        } catch (java.lang.Throwable th) {
            try {
                throw new kotlinx.coroutines.DispatchException("Unexpected exception in unconfined event loop", th);
            } catch (java.lang.Throwable th2) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                eventLoop.decrementUseCount(true);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    public static final <T> void resumeCancellable(kotlin.coroutines.Continuation<? super T> receiver$0, T t) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        if (!(receiver$0 instanceof kotlinx.coroutines.DispatchedContinuation)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            receiver$0.resumeWith(kotlin.Result.m13constructorimpl(t));
            return;
        }
        kotlinx.coroutines.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.DispatchedContinuation) receiver$0;
        if (dispatchedContinuation.dispatcher.isDispatchNeeded(dispatchedContinuation.get$context())) {
            dispatchedContinuation._state = t;
            dispatchedContinuation.resumeMode = 1;
            dispatchedContinuation.dispatcher.mo1406dispatch(dispatchedContinuation.get$context(), dispatchedContinuation);
            return;
        }
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            dispatchedContinuation._state = t;
            dispatchedContinuation.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) dispatchedContinuation.get$context().get(kotlinx.coroutines.Job.INSTANCE);
            if (job == null || job.isActive()) {
                z = false;
            } else {
                java.util.concurrent.CancellationException cancellationException = job.getCancellationException();
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                dispatchedContinuation.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(cancellationException)));
                z = true;
            }
            if (!z) {
                kotlin.coroutines.CoroutineContext context = dispatchedContinuation.get$context();
                java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, dispatchedContinuation.countOrElement);
                try {
                    kotlin.coroutines.Continuation<T> continuation = dispatchedContinuation.continuation;
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m13constructorimpl(t));
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                } catch (java.lang.Throwable th) {
                    kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                    throw th;
                }
            }
            while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
            }
            eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
        } catch (java.lang.Throwable th2) {
            try {
                throw new kotlinx.coroutines.DispatchException("Unexpected exception in unconfined event loop", th2);
            } catch (java.lang.Throwable th3) {
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                throw th3;
            }
        }
    }

    public static final <T> void resumeCancellableWithException(kotlin.coroutines.Continuation<? super T> receiver$0, java.lang.Throwable exception) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        if (receiver$0 instanceof kotlinx.coroutines.DispatchedContinuation) {
            kotlinx.coroutines.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.DispatchedContinuation) receiver$0;
            kotlin.coroutines.CoroutineContext context = dispatchedContinuation.continuation.get$context();
            kotlinx.coroutines.CompletedExceptionally completedExceptionally = new kotlinx.coroutines.CompletedExceptionally(exception);
            if (dispatchedContinuation.dispatcher.isDispatchNeeded(context)) {
                dispatchedContinuation._state = new kotlinx.coroutines.CompletedExceptionally(exception);
                dispatchedContinuation.resumeMode = 1;
                dispatchedContinuation.dispatcher.mo1406dispatch(context, dispatchedContinuation);
                return;
            }
            kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
            if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
                dispatchedContinuation._state = completedExceptionally;
                dispatchedContinuation.resumeMode = 1;
                eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
                return;
            }
            eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
            try {
                kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) dispatchedContinuation.get$context().get(kotlinx.coroutines.Job.INSTANCE);
                if (job == null || job.isActive()) {
                    z = false;
                } else {
                    java.util.concurrent.CancellationException cancellationException = job.getCancellationException();
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    dispatchedContinuation.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(cancellationException)));
                    z = true;
                }
                if (!z) {
                    kotlin.coroutines.CoroutineContext context2 = dispatchedContinuation.get$context();
                    java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context2, dispatchedContinuation.countOrElement);
                    try {
                        kotlin.coroutines.Continuation<T> continuation = dispatchedContinuation.continuation;
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        continuation.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(exception, continuation))));
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
                    } catch (java.lang.Throwable th) {
                        kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
                        throw th;
                    }
                }
                while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
                }
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                return;
            } catch (java.lang.Throwable th2) {
                try {
                    throw new kotlinx.coroutines.DispatchException("Unexpected exception in unconfined event loop", th2);
                } catch (java.lang.Throwable th3) {
                    eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                    throw th3;
                }
            }
        }
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        receiver$0.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(exception, receiver$0))));
    }

    public static final <T> void resumeDirect(kotlin.coroutines.Continuation<? super T> receiver$0, T t) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        if (!(receiver$0 instanceof kotlinx.coroutines.DispatchedContinuation)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            receiver$0.resumeWith(kotlin.Result.m13constructorimpl(t));
        } else {
            kotlin.coroutines.Continuation<T> continuation = ((kotlinx.coroutines.DispatchedContinuation) receiver$0).continuation;
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m13constructorimpl(t));
        }
    }

    public static final <T> void resumeDirectWithException(kotlin.coroutines.Continuation<? super T> receiver$0, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        if (receiver$0 instanceof kotlinx.coroutines.DispatchedContinuation) {
            kotlin.coroutines.Continuation<T> continuation = ((kotlinx.coroutines.DispatchedContinuation) receiver$0).continuation;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(exception, continuation))));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            receiver$0.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(exception, receiver$0))));
        }
    }

    public static final boolean yieldUndispatched(kotlinx.coroutines.DispatchedContinuation<? super kotlin.Unit> receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            receiver$0._state = unit;
            receiver$0.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(receiver$0);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            receiver$0.run();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
            eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            return false;
        } catch (java.lang.Throwable th) {
            try {
                throw new kotlinx.coroutines.DispatchException("Unexpected exception in unconfined event loop", th);
            } catch (java.lang.Throwable th2) {
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void dispatch$default(kotlinx.coroutines.DispatchedTask dispatchedTask, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        dispatch(dispatchedTask, i);
    }

    public static final <T> void dispatch(kotlinx.coroutines.DispatchedTask<? super T> receiver$0, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.coroutines.Continuation<? super T> delegate = receiver$0.getDelegate();
        if (kotlinx.coroutines.ResumeModeKt.isDispatchedMode(i) && (delegate instanceof kotlinx.coroutines.DispatchedContinuation) && kotlinx.coroutines.ResumeModeKt.isCancellableMode(i) == kotlinx.coroutines.ResumeModeKt.isCancellableMode(receiver$0.resumeMode)) {
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = ((kotlinx.coroutines.DispatchedContinuation) delegate).dispatcher;
            kotlin.coroutines.CoroutineContext context = delegate.get$context();
            if (coroutineDispatcher.isDispatchNeeded(context)) {
                coroutineDispatcher.mo1406dispatch(context, receiver$0);
                return;
            } else {
                resumeUnconfined(receiver$0);
                return;
            }
        }
        resume(receiver$0, delegate, i);
    }

    public static final <T> void resume(kotlinx.coroutines.DispatchedTask<? super T> receiver$0, kotlin.coroutines.Continuation<? super T> delegate, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(delegate, "delegate");
        java.lang.Object objTakeState = receiver$0.takeState();
        java.lang.Throwable exceptionalResult = receiver$0.getExceptionalResult(objTakeState);
        if (exceptionalResult != null) {
            kotlinx.coroutines.ResumeModeKt.resumeWithExceptionMode(delegate, exceptionalResult, i);
        } else {
            kotlinx.coroutines.ResumeModeKt.resumeMode(delegate, receiver$0.getSuccessfulResult(objTakeState), i);
        }
    }

    public static final void resumeWithStackTrace(kotlin.coroutines.Continuation<?> receiver$0, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        receiver$0.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(exception, receiver$0))));
    }

    static /* synthetic */ boolean executeUnconfined$default(kotlinx.coroutines.DispatchedContinuation dispatchedContinuation, java.lang.Object obj, int i, boolean z, kotlin.jvm.functions.Function0 function0, int i2, java.lang.Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (z && eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            dispatchedContinuation._state = obj;
            dispatchedContinuation.resumeMode = i;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            function0.invoke();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return false;
        } catch (java.lang.Throwable th) {
            try {
                throw new kotlinx.coroutines.DispatchException("Unexpected exception in unconfined event loop", th);
            } catch (java.lang.Throwable th2) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }
}
