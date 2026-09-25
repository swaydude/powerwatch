package kotlinx.coroutines;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\n\u001a\u00028\u0000¢\u0006\u0002\u0010\u000bJ'\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0010¢\u0006\u0002\b\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/BlockingCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "blockedThread", "Ljava/lang/Thread;", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/EventLoop;)V", "joinBlocking", "()Ljava/lang/Object;", "onCompletionInternal", "", "state", "", "mode", "", "suppressed", "", "onCompletionInternal$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
final class BlockingCoroutine<T> extends kotlinx.coroutines.AbstractCoroutine<T> {
    private final java.lang.Thread blockedThread;
    private final kotlinx.coroutines.EventLoop eventLoop;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockingCoroutine(kotlin.coroutines.CoroutineContext parentContext, java.lang.Thread blockedThread, kotlinx.coroutines.EventLoop eventLoop) {
        super(parentContext, true);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parentContext, "parentContext");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(blockedThread, "blockedThread");
        this.blockedThread = blockedThread;
        this.eventLoop = eventLoop;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport
    public void onCompletionInternal$kotlinx_coroutines_core(java.lang.Object state, int mode, boolean suppressed) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Thread.currentThread(), this.blockedThread)) {
            java.util.concurrent.locks.LockSupport.unpark(this.blockedThread);
        }
    }

    public final T joinBlocking() throws java.lang.Throwable {
        kotlinx.coroutines.TimeSourceKt.getTimeSource().registerTimeLoopThread();
        try {
            kotlinx.coroutines.EventLoop eventLoop = this.eventLoop;
            if (eventLoop != null) {
                kotlinx.coroutines.EventLoop.incrementUseCount$default(eventLoop, false, 1, null);
            }
            while (!java.lang.Thread.interrupted()) {
                try {
                    kotlinx.coroutines.EventLoop eventLoop2 = this.eventLoop;
                    long jProcessNextEvent = eventLoop2 != null ? eventLoop2.processNextEvent() : kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
                    if (!isCompleted()) {
                        kotlinx.coroutines.TimeSourceKt.getTimeSource().parkNanos(this, jProcessNextEvent);
                    } else {
                        kotlinx.coroutines.EventLoop eventLoop3 = this.eventLoop;
                        if (eventLoop3 != null) {
                            kotlinx.coroutines.EventLoop.decrementUseCount$default(eventLoop3, false, 1, null);
                        }
                        kotlinx.coroutines.TimeSourceKt.getTimeSource().unregisterTimeLoopThread();
                        T t = (T) kotlinx.coroutines.JobSupportKt.unboxState(getState$kotlinx_coroutines_core());
                        kotlinx.coroutines.CompletedExceptionally completedExceptionally = (kotlinx.coroutines.CompletedExceptionally) (t instanceof kotlinx.coroutines.CompletedExceptionally ? t : null);
                        if (completedExceptionally == null) {
                            return t;
                        }
                        throw completedExceptionally.cause;
                    }
                } catch (java.lang.Throwable th) {
                    kotlinx.coroutines.EventLoop eventLoop4 = this.eventLoop;
                    if (eventLoop4 != null) {
                        kotlinx.coroutines.EventLoop.decrementUseCount$default(eventLoop4, false, 1, null);
                    }
                    throw th;
                }
            }
            java.lang.InterruptedException interruptedException = new java.lang.InterruptedException();
            cancel(interruptedException);
            throw interruptedException;
        } catch (java.lang.Throwable th2) {
            kotlinx.coroutines.TimeSourceKt.getTimeSource().unregisterTimeLoopThread();
            throw th2;
        }
    }
}
