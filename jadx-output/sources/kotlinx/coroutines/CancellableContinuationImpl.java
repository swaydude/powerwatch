package kotlinx.coroutines;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001b\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010&\u001a\u00020\u001a2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u000fH\u0016J\u0010\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\tH\u0002J\b\u0010-\u001a\u00020$H\u0002J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u000200H\u0016J\n\u00101\u001a\u0004\u0018\u00010\u000fH\u0001J\u0010\u00102\u001a\n\u0018\u000103j\u0004\u0018\u0001`4H\u0016J\u001d\u00105\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010 \u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u00106J\b\u00107\u001a\u00020$H\u0016J\b\u00108\u001a\u00020$H\u0002J\u0017\u00109\u001a\u00020$2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020$0;H\u0082\bJ1\u0010<\u001a\u00020$2'\u0010=\u001a#\u0012\u0015\u0012\u0013\u0018\u00010(¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b('\u0012\u0004\u0012\u00020$0>j\u0002`AH\u0016J1\u0010B\u001a\u00020C2'\u0010=\u001a#\u0012\u0015\u0012\u0013\u0018\u00010(¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b('\u0012\u0004\u0012\u00020$0>j\u0002`AH\u0002J;\u0010D\u001a\u00020$2'\u0010=\u001a#\u0012\u0015\u0012\u0013\u0018\u00010(¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b('\u0012\u0004\u0012\u00020$0>j\u0002`A2\b\u0010 \u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010E\u001a\u00020FH\u0014J\u001a\u0010G\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002J\u001e\u0010H\u001a\u00020$2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000JH\u0016ø\u0001\u0000¢\u0006\u0002\u0010KJ\u001d\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020(2\u0006\u0010,\u001a\u00020\tH\u0000¢\u0006\u0002\bNJ\n\u0010O\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010P\u001a\u00020FH\u0016J\b\u0010Q\u001a\u00020\u001aH\u0002J!\u0010Q\u001a\u0004\u0018\u00010\u000f2\u0006\u0010R\u001a\u00028\u00002\b\u0010S\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010\u000f2\u0006\u0010M\u001a\u00020(H\u0016J\b\u0010V\u001a\u00020\u001aH\u0002J\u0019\u0010W\u001a\u00020$*\u00020X2\u0006\u0010R\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010YJ\u0014\u0010Z\u001a\u00020$*\u00020X2\u0006\u0010M\u001a\u00020(H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u0004\u0018\u00010\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006["}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "delegate", "Lkotlin/coroutines/Continuation;", "resumeMode", "", "(Lkotlin/coroutines/Continuation;I)V", "_decision", "Lkotlinx/atomicfu/AtomicInt;", "_state", "Lkotlinx/atomicfu/AtomicRef;", "", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getDelegate", "()Lkotlin/coroutines/Continuation;", "isActive", "", "()Z", "isCancelled", "isCompleted", "parentHandle", "Lkotlinx/coroutines/DisposableHandle;", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "alreadyResumedError", "", "proposedUpdate", "cancel", "cause", "", "completeResume", "token", "dispatchResume", "mode", "disposeParentHandle", "getContinuationCancellationCause", "parent", "Lkotlinx/coroutines/Job;", "getResult", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getSuccessfulResult", "(Ljava/lang/Object;)Ljava/lang/Object;", "initCancellability", "installParentCancellationHandler", "invokeHandlerSafely", "block", "Lkotlin/Function0;", "invokeOnCancellation", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlinx/coroutines/CompletionHandler;", "makeHandler", "Lkotlinx/coroutines/CancelHandler;", "multipleHandlersError", "nameString", "", "resumeImpl", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "resumeWithExceptionMode", "exception", "resumeWithExceptionMode$kotlinx_coroutines_core", "takeState", "toString", "tryResume", "value", "idempotent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "tryResumeWithException", "trySuspend", "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public class CancellableContinuationImpl<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlinx.coroutines.CancellableContinuation<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _decision$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.CancellableContinuationImpl.class, "_decision");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.CancellableContinuationImpl.class, java.lang.Object.class, "_state");
    private volatile int _decision;
    private volatile java.lang.Object _state;
    private final kotlin.coroutines.CoroutineContext context;
    private final kotlin.coroutines.Continuation<T> delegate;
    private volatile kotlinx.coroutines.DisposableHandle parentHandle;

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public /* synthetic */ void initCancellability() {
    }

    protected java.lang.String nameString() {
        return "CancellableContinuation";
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final kotlin.coroutines.Continuation<T> getDelegate() {
        return this.delegate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl(kotlin.coroutines.Continuation<? super T> delegate, int i) {
        super(i);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(delegate, "delegate");
        this.delegate = delegate;
        this.context = delegate.getContext();
        this._decision = 0;
        this._state = kotlinx.coroutines.Active.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: getState$kotlinx_coroutines_core, reason: from getter */
    public final java.lang.Object get_state() {
        return this._state;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
        return get_state() instanceof kotlinx.coroutines.NotCompleted;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCompleted() {
        return !(get_state() instanceof kotlinx.coroutines.NotCompleted);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCancelled() {
        return get_state() instanceof kotlinx.coroutines.CancelledContinuation;
    }

    private final void installParentCancellationHandler() {
        kotlinx.coroutines.Job job;
        if (isCompleted() || (job = (kotlinx.coroutines.Job) this.delegate.getContext().get(kotlinx.coroutines.Job.INSTANCE)) == null) {
            return;
        }
        job.start();
        kotlinx.coroutines.DisposableHandle disposableHandleInvokeOnCompletion$default = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(job, true, false, new kotlinx.coroutines.ChildContinuation(job, this), 2, null);
        this.parentHandle = disposableHandleInvokeOnCompletion$default;
        if (isCompleted()) {
            disposableHandleInvokeOnCompletion$default.dispose();
            this.parentHandle = kotlinx.coroutines.NonDisposableHandle.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
        kotlin.coroutines.Continuation<T> continuation = this.delegate;
        if (!(continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
            continuation = null;
        }
        return (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Object takeState() {
        return get_state();
    }

    private final void invokeHandlerSafely(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        try {
            block.invoke();
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException$default(getContext(), new kotlinx.coroutines.CompletionHandlerException("Exception in cancellation handler for " + this, th), null, 4, null);
        }
    }

    public java.lang.Throwable getContinuationCancellationCause(kotlinx.coroutines.Job parent) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parent, "parent");
        return parent.getCancellationException();
    }

    public final java.lang.Object getResult() {
        installParentCancellationHandler();
        if (trySuspend()) {
            return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        java.lang.Object obj = get_state();
        if (obj instanceof kotlinx.coroutines.CompletedExceptionally) {
            throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(((kotlinx.coroutines.CompletedExceptionally) obj).cause, this);
        }
        return getSuccessfulResult(obj);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object result) {
        resumeImpl(kotlinx.coroutines.CompletedExceptionallyKt.toState(result), this.resumeMode);
    }

    public final void resumeWithExceptionMode$kotlinx_coroutines_core(java.lang.Throwable exception, int mode) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        resumeImpl(new kotlinx.coroutines.CompletedExceptionally(exception), mode);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(handler, "handler");
        kotlinx.coroutines.CancelHandler cancelHandlerMakeHandler = (kotlinx.coroutines.CancelHandler) null;
        while (true) {
            java.lang.Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.Active) {
                if (cancelHandlerMakeHandler == null) {
                    cancelHandlerMakeHandler = makeHandler(handler);
                }
                if (_state$FU.compareAndSet(this, obj, cancelHandlerMakeHandler)) {
                    return;
                }
            } else {
                if (!(obj instanceof kotlinx.coroutines.CancelHandler)) {
                    if (obj instanceof kotlinx.coroutines.CancelledContinuation) {
                        if (!((kotlinx.coroutines.CancelledContinuation) obj).makeHandled()) {
                            multipleHandlersError(handler, obj);
                        }
                        try {
                            if (!(obj instanceof kotlinx.coroutines.CompletedExceptionally)) {
                                obj = null;
                            }
                            kotlinx.coroutines.CompletedExceptionally completedExceptionally = (kotlinx.coroutines.CompletedExceptionally) obj;
                            handler.invoke(completedExceptionally != null ? completedExceptionally.cause : null);
                            return;
                        } catch (java.lang.Throwable th) {
                            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException$default(getContext(), new kotlinx.coroutines.CompletionHandlerException("Exception in cancellation handler for " + this, th), null, 4, null);
                            return;
                        }
                    }
                    return;
                }
                multipleHandlersError(handler, obj);
            }
        }
    }

    private final void multipleHandlersError(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler, java.lang.Object state) {
        throw new java.lang.IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    private final kotlinx.coroutines.CancelHandler makeHandler(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        return handler instanceof kotlinx.coroutines.CancelHandler ? (kotlinx.coroutines.CancelHandler) handler : new kotlinx.coroutines.InvokeOnCancel(handler);
    }

    private final void dispatchResume(int mode) {
        if (tryResume()) {
            return;
        }
        kotlinx.coroutines.DispatchedKt.dispatch(this, mode);
    }

    private final void alreadyResumedError(java.lang.Object proposedUpdate) {
        throw new java.lang.IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    private final void disposeParentHandle() {
        kotlinx.coroutines.DisposableHandle disposableHandle = this.parentHandle;
        if (disposableHandle != null) {
            disposableHandle.dispose();
            this.parentHandle = kotlinx.coroutines.NonDisposableHandle.INSTANCE;
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(java.lang.Object token) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(token, "token");
        dispatchResume(this.resumeMode);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(kotlinx.coroutines.CoroutineDispatcher receiver$0, T t) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.coroutines.Continuation<T> continuation = this.delegate;
        if (!(continuation instanceof kotlinx.coroutines.DispatchedContinuation)) {
            continuation = null;
        }
        kotlinx.coroutines.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.DispatchedContinuation) continuation;
        resumeImpl(t, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == receiver$0 ? 3 : this.resumeMode);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(kotlinx.coroutines.CoroutineDispatcher receiver$0, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        kotlin.coroutines.Continuation<T> continuation = this.delegate;
        if (!(continuation instanceof kotlinx.coroutines.DispatchedContinuation)) {
            continuation = null;
        }
        kotlinx.coroutines.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.DispatchedContinuation) continuation;
        resumeImpl(new kotlinx.coroutines.CompletedExceptionally(exception), (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == receiver$0 ? 3 : this.resumeMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult(java.lang.Object state) {
        return state instanceof kotlinx.coroutines.CompletedIdempotentResult ? (T) ((kotlinx.coroutines.CompletedIdempotentResult) state).result : state;
    }

    public java.lang.String toString() {
        return nameString() + '(' + kotlinx.coroutines.DebugKt.toDebugString(this.delegate) + "){" + get_state() + "}@" + kotlinx.coroutines.DebugKt.getHexAddress(this);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(java.lang.Throwable cause) {
        java.lang.Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.NotCompleted)) {
                return false;
            }
            z = obj instanceof kotlinx.coroutines.CancelHandler;
        } while (!_state$FU.compareAndSet(this, obj, new kotlinx.coroutines.CancelledContinuation(this, cause, z)));
        if (z) {
            try {
                ((kotlinx.coroutines.CancelHandler) obj).invoke(cause);
            } catch (java.lang.Throwable th) {
                kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException$default(getContext(), new kotlinx.coroutines.CompletionHandlerException("Exception in cancellation handler for " + this, th), null, 4, null);
            }
        }
        disposeParentHandle();
        dispatchResume(0);
        return true;
    }

    private final boolean trySuspend() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new java.lang.IllegalStateException("Already suspended".toString());
            }
        } while (!_decision$FU.compareAndSet(this, 0, 1));
        return true;
    }

    private final boolean tryResume() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new java.lang.IllegalStateException("Already resumed".toString());
            }
        } while (!_decision$FU.compareAndSet(this, 0, 2));
        return true;
    }

    private final void resumeImpl(java.lang.Object proposedUpdate, int resumeMode) {
        while (true) {
            java.lang.Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.NotCompleted) {
                if (_state$FU.compareAndSet(this, obj, proposedUpdate)) {
                    disposeParentHandle();
                    dispatchResume(resumeMode);
                    return;
                }
            } else if ((obj instanceof kotlinx.coroutines.CancelledContinuation) && ((kotlinx.coroutines.CancelledContinuation) obj).makeResumed()) {
                return;
            } else {
                alreadyResumedError(proposedUpdate);
            }
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResume(T value, java.lang.Object idempotent) {
        java.lang.Object obj;
        do {
            obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.NotCompleted)) {
                if (!(obj instanceof kotlinx.coroutines.CompletedIdempotentResult)) {
                    return null;
                }
                kotlinx.coroutines.CompletedIdempotentResult completedIdempotentResult = (kotlinx.coroutines.CompletedIdempotentResult) obj;
                if (completedIdempotentResult.idempotentResume != idempotent) {
                    return null;
                }
                if (!(completedIdempotentResult.result == value)) {
                    throw new java.lang.IllegalStateException("Non-idempotent resume".toString());
                }
                return completedIdempotentResult.token;
            }
        } while (!_state$FU.compareAndSet(this, obj, idempotent == null ? value : new kotlinx.coroutines.CompletedIdempotentResult(idempotent, value, (kotlinx.coroutines.NotCompleted) obj)));
        disposeParentHandle();
        return obj;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResumeWithException(java.lang.Throwable exception) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        do {
            obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.NotCompleted)) {
                return null;
            }
        } while (!_state$FU.compareAndSet(this, obj, new kotlinx.coroutines.CompletedExceptionally(exception)));
        disposeParentHandle();
        return obj;
    }
}
