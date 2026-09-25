package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005:\u0003DEFB\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0002J'\u0010\u001f\u001a\u00020\u001c2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0!H\u0082\bJ\n\u0010#\u001a\u0004\u0018\u00010\nH\u0001J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0001J\b\u0010'\u001a\u00020\u001cH\u0002J6\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*2\u001c\u0010\"\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0+H\u0016ø\u0001\u0000¢\u0006\u0002\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020&H\u0016J\u001e\u00103\u001a\u00020\u001c2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0016ø\u0001\u0000¢\u0006\u0002\u00106J\u0012\u00107\u001a\u00020\u00142\b\u00108\u001a\u0004\u0018\u00010\nH\u0016J3\u00109\u001a\u00020\u001c*\u00020:2\u001c\u0010\"\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0+H\u0096\u0002ø\u0001\u0000¢\u0006\u0002\u0010;JE\u00109\u001a\u00020\u001c\"\u0004\b\u0001\u0010<*\b\u0012\u0004\u0012\u0002H<0=2\"\u0010\"\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H<\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0>H\u0096\u0002ø\u0001\u0000¢\u0006\u0002\u0010?JY\u00109\u001a\u00020\u001c\"\u0004\b\u0001\u0010@\"\u0004\b\u0002\u0010<*\u000e\u0012\u0004\u0012\u0002H@\u0012\u0004\u0012\u0002H<0A2\u0006\u0010B\u001a\u0002H@2\"\u0010\"\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H<\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0>H\u0096\u0002ø\u0001\u0000¢\u0006\u0002\u0010CR\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl;", "R", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/coroutines/Continuation;", "uCont", "(Lkotlin/coroutines/Continuation;)V", "_result", "Lkotlinx/atomicfu/AtomicRef;", "", "_state", "completion", "getCompletion", "()Lkotlin/coroutines/Continuation;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "isSelected", "", "()Z", "parentHandle", "Lkotlinx/coroutines/DisposableHandle;", "state", "getState", "()Ljava/lang/Object;", "disposeOnSelect", "", "handle", "doAfterSelect", "doResume", "value", "Lkotlin/Function0;", "block", "getResult", "handleBuilderException", com.baidu.mapsdkplatform.comapi.e.a, "", "initCancellability", "onTimeout", "timeMillis", "", "Lkotlin/Function1;", "(JLkotlin/jvm/functions/Function1;)V", "performAtomicIfNotSelected", "desc", "Lkotlinx/coroutines/internal/AtomicDesc;", "performAtomicTrySelect", "resumeSelectCancellableWithException", "exception", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "trySelect", "idempotent", "invoke", "Lkotlinx/coroutines/selects/SelectClause0;", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "AtomicSelectOp", "DisposeNode", "SelectOnCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class SelectBuilderImpl<R> extends kotlinx.coroutines.internal.LockFreeLinkedListHead implements kotlinx.coroutines.selects.SelectBuilder<R>, kotlinx.coroutines.selects.SelectInstance<R>, kotlin.coroutines.Continuation<R> {
    volatile java.lang.Object _result;
    volatile java.lang.Object _state;
    private volatile kotlinx.coroutines.DisposableHandle parentHandle;
    private final kotlin.coroutines.Continuation<R> uCont;
    static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.selects.SelectBuilderImpl.class, java.lang.Object.class, "_state");
    static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _result$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.selects.SelectBuilderImpl.class, java.lang.Object.class, "_result");

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> receiver$0, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        kotlinx.coroutines.selects.SelectBuilder.DefaultImpls.invoke(this, receiver$0, block);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectBuilderImpl(kotlin.coroutines.Continuation<? super R> uCont) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(uCont, "uCont");
        this.uCont = uCont;
        this._state = this;
        this._result = kotlinx.coroutines.selects.SelectKt.UNDECIDED;
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
        return this.uCont.getContext();
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public kotlin.coroutines.Continuation<R> getCompletion() {
        return this;
    }

    private final void doResume(kotlin.jvm.functions.Function0<? extends java.lang.Object> value, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        if (!isSelected()) {
            throw new java.lang.IllegalStateException("Must be selected first".toString());
        }
        while (true) {
            java.lang.Object obj = this._result;
            if (obj == kotlinx.coroutines.selects.SelectKt.UNDECIDED) {
                if (_result$FU.compareAndSet(this, kotlinx.coroutines.selects.SelectKt.UNDECIDED, value.invoke())) {
                    return;
                }
            } else if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                if (_result$FU.compareAndSet(this, kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED(), kotlinx.coroutines.selects.SelectKt.RESUMED)) {
                    block.invoke();
                    return;
                }
            } else {
                throw new java.lang.IllegalStateException("Already resumed");
            }
        }
    }

    public final java.lang.Object getResult() {
        if (!isSelected()) {
            initCancellability();
        }
        java.lang.Object obj = this._result;
        if (obj == kotlinx.coroutines.selects.SelectKt.UNDECIDED) {
            if (_result$FU.compareAndSet(this, kotlinx.coroutines.selects.SelectKt.UNDECIDED, kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED())) {
                return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
            obj = this._result;
        }
        if (obj == kotlinx.coroutines.selects.SelectKt.RESUMED) {
            throw new java.lang.IllegalStateException("Already resumed");
        }
        if (obj instanceof kotlinx.coroutines.CompletedExceptionally) {
            throw ((kotlinx.coroutines.CompletedExceptionally) obj).cause;
        }
        return obj;
    }

    private final void initCancellability() {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) getContext().get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            kotlinx.coroutines.DisposableHandle disposableHandleInvokeOnCompletion$default = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(job, true, false, new kotlinx.coroutines.selects.SelectBuilderImpl.SelectOnCancelling(this, job), 2, null);
            this.parentHandle = disposableHandleInvokeOnCompletion$default;
            if (isSelected()) {
                disposableHandleInvokeOnCompletion$default.dispose();
            }
        }
    }

    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$SelectOnCancelling;", "Lkotlinx/coroutines/JobCancellingNode;", "Lkotlinx/coroutines/Job;", "job", "(Lkotlinx/coroutines/selects/SelectBuilderImpl;Lkotlinx/coroutines/Job;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private final class SelectOnCancelling extends kotlinx.coroutines.JobCancellingNode<kotlinx.coroutines.Job> {
        final /* synthetic */ kotlinx.coroutines.selects.SelectBuilderImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectOnCancelling(kotlinx.coroutines.selects.SelectBuilderImpl selectBuilderImpl, kotlinx.coroutines.Job job) {
            super(job);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(job, "job");
            this.this$0 = selectBuilderImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            invoke2(th);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable cause) {
            if (this.this$0.trySelect(null)) {
                this.this$0.resumeSelectCancellableWithException(this.job.getCancellationException());
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
            return "SelectOnCancelling[" + this.this$0 + ']';
        }
    }

    public final void handleBuilderException(java.lang.Throwable e) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(e, "e");
        if (trySelect(null)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(e)));
        } else {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException$default(getContext(), e, null, 4, null);
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean isSelected() {
        return getState() != this;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnSelect(kotlinx.coroutines.DisposableHandle handle) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(handle, "handle");
        kotlinx.coroutines.selects.SelectBuilderImpl.DisposeNode disposeNode = new kotlinx.coroutines.selects.SelectBuilderImpl.DisposeNode(handle);
        while (getState() == this) {
            final kotlinx.coroutines.selects.SelectBuilderImpl.DisposeNode disposeNode2 = disposeNode;
            kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp condAddOp = new kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp(disposeNode2) { // from class: kotlinx.coroutines.selects.SelectBuilderImpl$disposeOnSelect$$inlined$addLastIf$1
                @Override // kotlinx.coroutines.internal.AtomicOp
                public java.lang.Object prepare(kotlinx.coroutines.internal.LockFreeLinkedListNode affected) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
                    if (this.getState() == this) {
                        return null;
                    }
                    return kotlinx.coroutines.internal.LockFreeLinkedListKt.getCONDITION_FALSE();
                }
            };
            while (true) {
                java.lang.Object prev = getPrev();
                if (prev == null) {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                }
                int iTryCondAddNext = ((kotlinx.coroutines.internal.LockFreeLinkedListNode) prev).tryCondAddNext(disposeNode2, this, condAddOp);
                z = true;
                if (iTryCondAddNext != 1) {
                    if (iTryCondAddNext == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                return;
            }
        }
        handle.dispose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doAfterSelect() {
        kotlinx.coroutines.DisposableHandle disposableHandle = this.parentHandle;
        if (disposableHandle != null) {
            disposableHandle.dispose();
        }
        java.lang.Object next = getNext();
        if (next == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        }
        for (kotlinx.coroutines.internal.LockFreeLinkedListNode nextNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(nextNode, this); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof kotlinx.coroutines.selects.SelectBuilderImpl.DisposeNode) {
                ((kotlinx.coroutines.selects.SelectBuilderImpl.DisposeNode) nextNode).handle.dispose();
            }
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect(java.lang.Object idempotent) {
        if (!(!(idempotent instanceof kotlinx.coroutines.internal.OpDescriptor))) {
            throw new java.lang.IllegalStateException("cannot use OpDescriptor as idempotent marker".toString());
        }
        do {
            java.lang.Object state = getState();
            if (state != this) {
                return idempotent != null && state == idempotent;
            }
        } while (!_state$FU.compareAndSet(this, this, idempotent));
        doAfterSelect();
        return true;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public java.lang.Object performAtomicTrySelect(kotlinx.coroutines.internal.AtomicDesc desc) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(desc, "desc");
        return new kotlinx.coroutines.selects.SelectBuilderImpl.AtomicSelectOp(this, desc, true).perform(null);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public java.lang.Object performAtomicIfNotSelected(kotlinx.coroutines.internal.AtomicDesc desc) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(desc, "desc");
        return new kotlinx.coroutines.selects.SelectBuilderImpl.AtomicSelectOp(this, desc, false).perform(null);
    }

    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$AtomicSelectOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "", "desc", "Lkotlinx/coroutines/internal/AtomicDesc;", "select", "", "(Lkotlinx/coroutines/selects/SelectBuilderImpl;Lkotlinx/coroutines/internal/AtomicDesc;Z)V", "complete", "", "affected", "failure", "completeSelect", "prepare", "prepareIfNotSelected", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private final class AtomicSelectOp extends kotlinx.coroutines.internal.AtomicOp<java.lang.Object> {
        public final kotlinx.coroutines.internal.AtomicDesc desc;
        public final boolean select;
        final /* synthetic */ kotlinx.coroutines.selects.SelectBuilderImpl this$0;

        public AtomicSelectOp(kotlinx.coroutines.selects.SelectBuilderImpl selectBuilderImpl, kotlinx.coroutines.internal.AtomicDesc desc, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(desc, "desc");
            this.this$0 = selectBuilderImpl;
            this.desc = desc;
            this.select = z;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public java.lang.Object prepare(java.lang.Object affected) {
            java.lang.Object objPrepareIfNotSelected;
            return (affected != null || (objPrepareIfNotSelected = prepareIfNotSelected()) == null) ? this.desc.prepare(this) : objPrepareIfNotSelected;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public void complete(java.lang.Object affected, java.lang.Object failure) {
            completeSelect(failure);
            this.desc.complete(this, failure);
        }

        public final java.lang.Object prepareIfNotSelected() {
            kotlinx.coroutines.selects.SelectBuilderImpl selectBuilderImpl = this.this$0;
            while (true) {
                java.lang.Object obj = selectBuilderImpl._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof kotlinx.coroutines.internal.OpDescriptor) {
                    ((kotlinx.coroutines.internal.OpDescriptor) obj).perform(this.this$0);
                } else {
                    kotlinx.coroutines.selects.SelectBuilderImpl selectBuilderImpl2 = this.this$0;
                    if (obj == selectBuilderImpl2) {
                        if (kotlinx.coroutines.selects.SelectBuilderImpl._state$FU.compareAndSet(selectBuilderImpl2, this.this$0, this)) {
                            return null;
                        }
                    } else {
                        return kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED();
                    }
                }
            }
        }

        private final void completeSelect(java.lang.Object failure) {
            boolean z = this.select && failure == null;
            if (kotlinx.coroutines.selects.SelectBuilderImpl._state$FU.compareAndSet(this.this$0, this, z ? null : this.this$0) && z) {
                this.this$0.doAfterSelect();
            }
        }
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(kotlinx.coroutines.selects.SelectClause0 receiver$0, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        receiver$0.registerSelectClause0(this, block);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(kotlinx.coroutines.selects.SelectClause1<? extends Q> receiver$0, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        receiver$0.registerSelectClause1(this, block);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> receiver$0, P p, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        receiver$0.registerSelectClause2(this, p, block);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void onTimeout(long timeMillis, final kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        if (timeMillis <= 0) {
            if (trySelect(null)) {
                kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(block, getCompletion());
            }
        } else {
            disposeOnSelect(kotlinx.coroutines.DelayKt.getDelay(getContext()).invokeOnTimeout(timeMillis, new java.lang.Runnable() { // from class: kotlinx.coroutines.selects.SelectBuilderImpl$onTimeout$$inlined$Runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (this.this$0.trySelect(null)) {
                        kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(block, this.this$0.getCompletion());
                    }
                }
            }));
        }
    }

    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$DisposeNode;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "handle", "Lkotlinx/coroutines/DisposableHandle;", "(Lkotlinx/coroutines/DisposableHandle;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class DisposeNode extends kotlinx.coroutines.internal.LockFreeLinkedListNode {
        public final kotlinx.coroutines.DisposableHandle handle;

        public DisposeNode(kotlinx.coroutines.DisposableHandle handle) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(handle, "handle");
            this.handle = handle;
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object result) {
        if (!isSelected()) {
            throw new java.lang.IllegalStateException("Must be selected first".toString());
        }
        while (true) {
            java.lang.Object obj = this._result;
            if (obj == kotlinx.coroutines.selects.SelectKt.UNDECIDED) {
                if (_result$FU.compareAndSet(this, kotlinx.coroutines.selects.SelectKt.UNDECIDED, kotlinx.coroutines.CompletedExceptionallyKt.toState(result))) {
                    return;
                }
            } else if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                if (_result$FU.compareAndSet(this, kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED(), kotlinx.coroutines.selects.SelectKt.RESUMED)) {
                    this.uCont.resumeWith(result);
                    return;
                }
            } else {
                throw new java.lang.IllegalStateException("Already resumed");
            }
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void resumeSelectCancellableWithException(java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        if (!isSelected()) {
            throw new java.lang.IllegalStateException("Must be selected first".toString());
        }
        while (true) {
            java.lang.Object obj = this._result;
            if (obj == kotlinx.coroutines.selects.SelectKt.UNDECIDED) {
                if (_result$FU.compareAndSet(this, kotlinx.coroutines.selects.SelectKt.UNDECIDED, new kotlinx.coroutines.CompletedExceptionally(exception))) {
                    return;
                }
            } else if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                if (_result$FU.compareAndSet(this, kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED(), kotlinx.coroutines.selects.SelectKt.RESUMED)) {
                    kotlinx.coroutines.DispatchedKt.resumeCancellableWithException(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(this.uCont), exception);
                    return;
                }
            } else {
                throw new java.lang.IllegalStateException("Already resumed");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getState() {
        while (true) {
            java.lang.Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.OpDescriptor)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.OpDescriptor) obj).perform(this);
        }
    }
}
