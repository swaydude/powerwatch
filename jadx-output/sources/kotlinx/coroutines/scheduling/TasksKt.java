package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0012\u0010\n\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"BLOCKING_DEFAULT_PARALLELISM", "", "CORE_POOL_SIZE", "DEFAULT_SCHEDULER_NAME", "", "IDLE_WORKER_KEEP_ALIVE_NS", "", "MAX_POOL_SIZE", "QUEUE_SIZE_OFFLOAD_THRESHOLD", "WORK_STEALING_TIME_RESOLUTION_NS", "schedulerTimeSource", "Lkotlinx/coroutines/scheduling/TimeSource;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class TasksKt {
    public static final int CORE_POOL_SIZE;
    public static final java.lang.String DEFAULT_SCHEDULER_NAME = "DefaultDispatcher";
    public static final long IDLE_WORKER_KEEP_ALIVE_NS;
    public static final int MAX_POOL_SIZE;
    public static kotlinx.coroutines.scheduling.TimeSource schedulerTimeSource;
    public static final long WORK_STEALING_TIME_RESOLUTION_NS = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, (java.lang.Object) null);
    public static final int QUEUE_SIZE_OFFLOAD_THRESHOLD = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default("kotlinx.coroutines.scheduler.offload.threshold", 96, 0, 128, 4, (java.lang.Object) null);
    public static final int BLOCKING_DEFAULT_PARALLELISM = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (java.lang.Object) null);

    static {
        int iSystemProp$default = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default("kotlinx.coroutines.scheduler.core.pool.size", kotlin.ranges.RangesKt.coerceAtLeast(kotlinx.coroutines.internal.SystemPropsKt.getAVAILABLE_PROCESSORS(), 2), 1, 0, 8, (java.lang.Object) null);
        CORE_POOL_SIZE = iSystemProp$default;
        MAX_POOL_SIZE = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default("kotlinx.coroutines.scheduler.max.pool.size", kotlin.ranges.RangesKt.coerceIn(kotlinx.coroutines.internal.SystemPropsKt.getAVAILABLE_PROCESSORS() * 128, iSystemProp$default, kotlinx.coroutines.scheduling.CoroutineScheduler.MAX_SUPPORTED_POOL_SIZE), 0, kotlinx.coroutines.scheduling.CoroutineScheduler.MAX_SUPPORTED_POOL_SIZE, 4, (java.lang.Object) null);
        IDLE_WORKER_KEEP_ALIVE_NS = java.util.concurrent.TimeUnit.SECONDS.toNanos(kotlinx.coroutines.internal.SystemPropsKt.systemProp$default("kotlinx.coroutines.scheduler.keep.alive.sec", 5L, 0L, 0L, 12, (java.lang.Object) null));
        schedulerTimeSource = kotlinx.coroutines.scheduling.NanoTimeSource.INSTANCE;
    }
}
