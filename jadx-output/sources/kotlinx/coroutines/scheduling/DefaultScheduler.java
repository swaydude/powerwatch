package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/scheduling/DefaultScheduler;", "Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "()V", "IO", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIO", "()Lkotlinx/coroutines/CoroutineDispatcher;", "close", "", "toDebugString", "", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class DefaultScheduler extends kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher {
    public static final kotlinx.coroutines.scheduling.DefaultScheduler INSTANCE;
    private static final kotlinx.coroutines.CoroutineDispatcher IO;

    @Override // kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
        return kotlinx.coroutines.scheduling.TasksKt.DEFAULT_SCHEDULER_NAME;
    }

    static {
        kotlinx.coroutines.scheduling.DefaultScheduler defaultScheduler = new kotlinx.coroutines.scheduling.DefaultScheduler();
        INSTANCE = defaultScheduler;
        IO = defaultScheduler.blocking(kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(kotlinx.coroutines.DispatchersKt.IO_PARALLELISM_PROPERTY_NAME, kotlin.ranges.RangesKt.coerceAtLeast(64, kotlinx.coroutines.internal.SystemPropsKt.getAVAILABLE_PROCESSORS()), 0, 0, 12, (java.lang.Object) null));
    }

    private DefaultScheduler() {
        super(0, 0, null, 7, null);
    }

    public final kotlinx.coroutines.CoroutineDispatcher getIO() {
        return IO;
    }

    @Override // kotlinx.coroutines.scheduling.ExperimentalCoroutineDispatcher, kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new java.lang.UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }

    public final java.lang.String toDebugString() {
        return super.toString();
    }
}
