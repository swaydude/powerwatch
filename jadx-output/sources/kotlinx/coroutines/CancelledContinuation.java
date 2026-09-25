package kotlinx.coroutines;

/* JADX INFO: compiled from: CompletedExceptionally.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/CancelledContinuation;", "Lkotlinx/coroutines/CompletedExceptionally;", "continuation", "Lkotlin/coroutines/Continuation;", "cause", "", "handled", "", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;Z)V", "Lkotlinx/atomicfu/AtomicBoolean;", "resumed", "makeHandled", "makeResumed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class CancelledContinuation extends kotlinx.coroutines.CompletedExceptionally {
    private volatile int handled;
    private volatile int resumed;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater resumed$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.CancelledContinuation.class, "resumed");
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater handled$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.CancelledContinuation.class, "handled");

    public CancelledContinuation(kotlin.coroutines.Continuation<?> continuation, java.lang.Throwable th, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(continuation, "continuation");
        if (th == null) {
            th = new java.util.concurrent.CancellationException("Continuation " + continuation + " was cancelled normally");
        }
        super(th);
        this.resumed = 0;
        this.handled = z ? 1 : 0;
    }

    public final boolean makeResumed() {
        return resumed$FU.compareAndSet(this, 0, 1);
    }

    public final boolean makeHandled() {
        return handled$FU.compareAndSet(this, 0, 1);
    }
}
