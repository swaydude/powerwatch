package kotlinx.coroutines;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\u0018\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/DefaultTimeSource;", "Lkotlinx/coroutines/TimeSource;", "()V", "currentTimeMillis", "", "nanoTime", "parkNanos", "", "blocker", "", "nanos", "registerTimeLoopThread", "trackTask", "unTrackTask", "unpark", "thread", "Ljava/lang/Thread;", "unregisterTimeLoopThread", "wrapTask", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class DefaultTimeSource implements kotlinx.coroutines.TimeSource {
    public static final kotlinx.coroutines.DefaultTimeSource INSTANCE = new kotlinx.coroutines.DefaultTimeSource();

    @Override // kotlinx.coroutines.TimeSource
    public void registerTimeLoopThread() {
    }

    @Override // kotlinx.coroutines.TimeSource
    public void trackTask() {
    }

    @Override // kotlinx.coroutines.TimeSource
    public void unTrackTask() {
    }

    @Override // kotlinx.coroutines.TimeSource
    public void unregisterTimeLoopThread() {
    }

    @Override // kotlinx.coroutines.TimeSource
    public java.lang.Runnable wrapTask(java.lang.Runnable block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        return block;
    }

    private DefaultTimeSource() {
    }

    @Override // kotlinx.coroutines.TimeSource
    public long currentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // kotlinx.coroutines.TimeSource
    public long nanoTime() {
        return java.lang.System.nanoTime();
    }

    @Override // kotlinx.coroutines.TimeSource
    public void parkNanos(java.lang.Object blocker, long nanos) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(blocker, "blocker");
        java.util.concurrent.locks.LockSupport.parkNanos(blocker, nanos);
    }

    @Override // kotlinx.coroutines.TimeSource
    public void unpark(java.lang.Thread thread) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(thread, "thread");
        java.util.concurrent.locks.LockSupport.unpark(thread);
    }
}
