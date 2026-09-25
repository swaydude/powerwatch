package kotlinx.coroutines;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u000f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u0011\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\r\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJH\u0010\u001b\u001a\u00020\u001c\"\u0004\b\u0001\u0010\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001f2\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001d0\"\u0012\u0006\u0012\u0004\u0018\u00010#0!H\u0016ø\u0001\u0000¢\u0006\u0002\u0010$R\u0014\u0010\b\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lkotlinx/coroutines/CompletableDeferredImpl;", "T", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/selects/SelectClause1;", "parent", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "cancelsParent", "", "getCancelsParent", "()Z", "onAwait", "getOnAwait", "()Lkotlinx/coroutines/selects/SelectClause1;", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "value", "(Ljava/lang/Object;)Z", "completeExceptionally", "exception", "", "getCompleted", "()Ljava/lang/Object;", "registerSelectClause1", "", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
final class CompletableDeferredImpl<T> extends kotlinx.coroutines.JobSupport implements kotlinx.coroutines.CompletableDeferred<T>, kotlinx.coroutines.selects.SelectClause1<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.CompletableDeferredImpl$await$1, reason: invalid class name */
    /* JADX INFO: compiled from: CompletableDeferred.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0096@ø\u0001\u0000"}, d2 = {"await", "", "T", "continuation", "Lkotlin/coroutines/Continuation;"}, k = 3, mv = {1, 1, 13})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.CompletableDeferredImpl", f = "CompletableDeferred.kt", i = {0}, l = {64}, m = "await", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.CompletableDeferredImpl.this.await(this);
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    protected boolean getCancelsParent() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return true;
    }

    public CompletableDeferredImpl(kotlinx.coroutines.Job job) {
        super(true);
        initParentJobInternal$kotlinx_coroutines_core(job);
    }

    @Override // kotlinx.coroutines.Deferred
    public T getCompleted() {
        return (T) getCompletedInternal$kotlinx_coroutines_core();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // kotlinx.coroutines.Deferred
    public java.lang.Object await(kotlin.coroutines.Continuation<? super T> continuation) throws java.lang.Throwable {
        kotlinx.coroutines.CompletableDeferredImpl.AnonymousClass1 anonymousClass1;
        if (continuation instanceof kotlinx.coroutines.CompletableDeferredImpl.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.CompletableDeferredImpl.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new kotlinx.coroutines.CompletableDeferredImpl.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new kotlinx.coroutines.CompletableDeferredImpl.AnonymousClass1(continuation);
        }
        java.lang.Object objAwaitInternal$kotlinx_coroutines_core = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (objAwaitInternal$kotlinx_coroutines_core instanceof kotlin.Result.Failure) {
                throw ((kotlin.Result.Failure) objAwaitInternal$kotlinx_coroutines_core).exception;
            }
        } else {
            if (objAwaitInternal$kotlinx_coroutines_core instanceof kotlin.Result.Failure) {
                throw ((kotlin.Result.Failure) objAwaitInternal$kotlinx_coroutines_core).exception;
            }
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objAwaitInternal$kotlinx_coroutines_core = awaitInternal$kotlinx_coroutines_core(anonymousClass1);
            if (objAwaitInternal$kotlinx_coroutines_core == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return objAwaitInternal$kotlinx_coroutines_core;
    }

    @Override // kotlinx.coroutines.Deferred
    public kotlinx.coroutines.selects.SelectClause1<T> getOnAwait() {
        return this;
    }

    @Override // kotlinx.coroutines.selects.SelectClause1
    public <R> void registerSelectClause1(kotlinx.coroutines.selects.SelectInstance<? super R> select, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        registerSelectClause1Internal$kotlinx_coroutines_core(select, block);
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public boolean complete(T value) {
        return makeCompleting$kotlinx_coroutines_core(value);
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public boolean completeExceptionally(java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        return makeCompleting$kotlinx_coroutines_core(new kotlinx.coroutines.CompletedExceptionally(exception));
    }
}
