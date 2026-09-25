package kotlinx.coroutines;

/* JADX INFO: compiled from: Dispatched.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\tJ\u0017\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` H\u0016J\u0016\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0086\b¢\u0006\u0002\u0010\u001dJ\u0011\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0086\bJ\t\u0010%\u001a\u00020&H\u0086\bJ\u0016\u0010'\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0086\b¢\u0006\u0002\u0010\u001dJ\u0011\u0010(\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0086\bJ\u001e\u0010)\u001a\u00020\u001a2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\n\u0010,\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010-\u001a\u00020.H\u0016R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lkotlinx/coroutines/DispatchedContinuation;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "continuation", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "_state", "", "_state$annotations", "()V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "countOrElement", "delegate", "getDelegate", "()Lkotlin/coroutines/Continuation;", "dispatchYield", "", "value", "dispatchYield$kotlinx_coroutines_core", "(Ljava/lang/Object;)V", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "resumeCancellable", "resumeCancellableWithException", "exception", "", "resumeCancelled", "", "resumeUndispatched", "resumeUndispatchedWithException", "resumeWith", "result", "Lkotlin/Result;", "takeState", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class DispatchedContinuation<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.Continuation<T> {
    public java.lang.Object _state;
    private final kotlin.coroutines.jvm.internal.CoroutineStackFrame callerFrame;
    public final kotlin.coroutines.Continuation<T> continuation;
    public final java.lang.Object countOrElement;
    public final kotlinx.coroutines.CoroutineDispatcher dispatcher;

    public static /* synthetic */ void _state$annotations() {
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public kotlin.coroutines.CoroutineContext get$context() {
        return this.continuation.get$context();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.coroutines.Continuation<? super T>, kotlin.coroutines.Continuation<T>] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation<? super T> to ?? for r3v0 'continuation'  ??
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:139)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.inline(CodeShrinkVisitor.java:212)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:143)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:68)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:48)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:359)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:284)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:82)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public DispatchedContinuation(kotlinx.coroutines.CoroutineDispatcher r2, kotlin.coroutines.Continuation<? super T> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "dispatcher"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = "continuation"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            r0 = 0
            r1.<init>(r0)
            r1.dispatcher = r2
            r1.continuation = r3
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.DispatchedKt.access$getUNDEFINED$p()
            r1._state = r2
            boolean r2 = r3 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r2 != 0) goto L1d
            r3 = 0
        L1d:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r3 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r3
            r1.callerFrame = r3
            kotlin.coroutines.CoroutineContext r2 = r1.get$context()
            java.lang.Object r2 = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(r2)
            r1.countOrElement = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.DispatchedContinuation.<init>(kotlinx.coroutines.CoroutineDispatcher, kotlin.coroutines.Continuation):void");
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
        return this.callerFrame;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Object takeState() {
        java.lang.Object obj = this._state;
        if (obj != kotlinx.coroutines.DispatchedKt.UNDEFINED) {
            this._state = kotlinx.coroutines.DispatchedKt.UNDEFINED;
            return obj;
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public kotlin.coroutines.Continuation<T> getDelegate() {
        return this;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object result) {
        kotlin.coroutines.CoroutineContext context = this.continuation.get$context();
        java.lang.Object state = kotlinx.coroutines.CompletedExceptionallyKt.toState(result);
        if (this.dispatcher.isDispatchNeeded(context)) {
            this._state = state;
            this.resumeMode = 0;
            this.dispatcher.mo1406dispatch(context, this);
            return;
        }
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            this._state = state;
            this.resumeMode = 0;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            kotlin.coroutines.CoroutineContext context2 = get$context();
            java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context2, this.countOrElement);
            try {
                this.continuation.resumeWith(result);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
                while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
                }
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            } catch (java.lang.Throwable th) {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            try {
                throw new kotlinx.coroutines.DispatchException("Unexpected exception in unconfined event loop", th2);
            } catch (java.lang.Throwable th3) {
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                throw th3;
            }
        }
    }

    public final void resumeCancellable(T value) {
        boolean z;
        if (this.dispatcher.isDispatchNeeded(get$context())) {
            this._state = value;
            this.resumeMode = 1;
            this.dispatcher.mo1406dispatch(get$context(), this);
            return;
        }
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            this._state = value;
            this.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) get$context().get(kotlinx.coroutines.Job.INSTANCE);
            if (job == null || job.isActive()) {
                z = false;
            } else {
                java.util.concurrent.CancellationException cancellationException = job.getCancellationException();
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(cancellationException)));
                z = true;
            }
            if (!z) {
                kotlin.coroutines.CoroutineContext context = get$context();
                java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, this.countOrElement);
                try {
                    kotlin.coroutines.Continuation<T> continuation = this.continuation;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m13constructorimpl(value));
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                } finally {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                }
            }
            while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
            }
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
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

    public final void resumeCancellableWithException(java.lang.Throwable exception) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        kotlin.coroutines.CoroutineContext context = this.continuation.get$context();
        kotlinx.coroutines.CompletedExceptionally completedExceptionally = new kotlinx.coroutines.CompletedExceptionally(exception);
        if (this.dispatcher.isDispatchNeeded(context)) {
            this._state = new kotlinx.coroutines.CompletedExceptionally(exception);
            this.resumeMode = 1;
            this.dispatcher.mo1406dispatch(context, this);
            return;
        }
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            this._state = completedExceptionally;
            this.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) get$context().get(kotlinx.coroutines.Job.INSTANCE);
            if (job == null || job.isActive()) {
                z = false;
            } else {
                java.util.concurrent.CancellationException cancellationException = job.getCancellationException();
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(cancellationException)));
                z = true;
            }
            if (!z) {
                kotlin.coroutines.CoroutineContext context2 = get$context();
                java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context2, this.countOrElement);
                try {
                    kotlin.coroutines.Continuation<T> continuation = this.continuation;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(exception, continuation))));
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                } finally {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                }
            }
            while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
            }
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
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

    public final boolean resumeCancelled() {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) get$context().get(kotlinx.coroutines.Job.INSTANCE);
        if (job == null || job.isActive()) {
            return false;
        }
        java.util.concurrent.CancellationException cancellationException = job.getCancellationException();
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(cancellationException)));
        return true;
    }

    public final void resumeUndispatched(T value) {
        kotlin.coroutines.CoroutineContext context = get$context();
        java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, this.countOrElement);
        try {
            kotlin.coroutines.Continuation<T> continuation = this.continuation;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m13constructorimpl(value));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public final void resumeUndispatchedWithException(java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        kotlin.coroutines.CoroutineContext context = get$context();
        java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, this.countOrElement);
        try {
            kotlin.coroutines.Continuation<T> continuation = this.continuation;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(exception, continuation))));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public final void dispatchYield$kotlinx_coroutines_core(T value) {
        kotlin.coroutines.CoroutineContext context = this.continuation.get$context();
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.dispatchYield(context, this);
    }

    public java.lang.String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + kotlinx.coroutines.DebugKt.toDebugString(this.continuation) + ']';
    }
}
