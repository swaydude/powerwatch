package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\f\u001a\u00020\rH\u0000\u001a\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0000\u001a\b\u0010\u0012\u001a\u00020\u0006H\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000*\u001e\b\u0002\u0010\u0013\u001a\u0004\b\u0000\u0010\u0014\"\b\u0012\u0004\u0012\u0002H\u00140\u00152\b\u0012\u0004\u0012\u0002H\u00140\u0015¨\u0006\u0016"}, d2 = {"CLOSED_EMPTY", "Lkotlinx/coroutines/internal/Symbol;", "CLOSED_EMPTY$annotations", "()V", "DISPOSED_TASK", "MAX_MS", "", "MS_TO_NS", "SCHEDULE_COMPLETED", "", "SCHEDULE_DISPOSED", "SCHEDULE_OK", "createEventLoop", "Lkotlinx/coroutines/EventLoop;", "delayNanosToMillis", "timeNanos", "delayToNanos", "timeMillis", "processNextEventInCurrentThread", "Queue", "T", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class EventLoopKt {
    private static final long MAX_MS = 9223372036854L;
    private static final long MS_TO_NS = 1000000;
    private static final int SCHEDULE_COMPLETED = 1;
    private static final int SCHEDULE_DISPOSED = 2;
    private static final int SCHEDULE_OK = 0;
    private static final kotlinx.coroutines.internal.Symbol DISPOSED_TASK = new kotlinx.coroutines.internal.Symbol("REMOVED_TASK");
    private static final kotlinx.coroutines.internal.Symbol CLOSED_EMPTY = new kotlinx.coroutines.internal.Symbol("CLOSED_EMPTY");

    private static /* synthetic */ void CLOSED_EMPTY$annotations() {
    }

    public static final long delayToNanos(long j) {
        if (j <= 0) {
            return 0L;
        }
        return j >= MAX_MS ? kotlin.jvm.internal.LongCompanionObject.MAX_VALUE : MS_TO_NS * j;
    }

    public static final long delayNanosToMillis(long j) {
        return j / MS_TO_NS;
    }

    public static final kotlinx.coroutines.EventLoop createEventLoop() {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(threadCurrentThread, "Thread.currentThread()");
        return new kotlinx.coroutines.BlockingEventLoop(threadCurrentThread);
    }

    public static final long processNextEventInCurrentThread() {
        kotlinx.coroutines.EventLoop eventLoopCurrentOrNull$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
        return eventLoopCurrentOrNull$kotlinx_coroutines_core != null ? eventLoopCurrentOrNull$kotlinx_coroutines_core.processNextEvent() : kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
    }
}
