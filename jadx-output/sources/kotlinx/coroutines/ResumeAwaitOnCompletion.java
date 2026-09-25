package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/ResumeAwaitOnCompletion;", "T", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/JobSupport;", "job", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/CancellableContinuationImpl;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
final class ResumeAwaitOnCompletion<T> extends kotlinx.coroutines.JobNode<kotlinx.coroutines.JobSupport> {
    private final kotlinx.coroutines.CancellableContinuationImpl<T> continuation;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
        invoke2(th);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ResumeAwaitOnCompletion(kotlinx.coroutines.JobSupport job, kotlinx.coroutines.CancellableContinuationImpl<? super T> continuation) {
        super(job);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(job, "job");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(continuation, "continuation");
        this.continuation = continuation;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(java.lang.Throwable cause) {
        java.lang.Object state$kotlinx_coroutines_core = ((kotlinx.coroutines.JobSupport) this.job).getState$kotlinx_coroutines_core();
        if (!(!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete))) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
            this.continuation.resumeWithExceptionMode$kotlinx_coroutines_core(((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause, 0);
            return;
        }
        kotlinx.coroutines.CancellableContinuationImpl<T> cancellableContinuationImpl = this.continuation;
        java.lang.Object objUnboxState = kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        cancellableContinuationImpl.resumeWith(kotlin.Result.m13constructorimpl(objUnboxState));
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public java.lang.String toString() {
        return "ResumeAwaitOnCompletion[" + this.continuation + ']';
    }
}
