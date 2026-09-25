package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0003EFGB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\r\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007H\u0082\bJ\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0002J!\u0010&\u001a\u00020'2\n\u0010(\u001a\u00060)j\u0002`*2\u0006\u0010+\u001a\u00020,H\u0000¢\u0006\u0002\b-J\u0011\u0010\u0014\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007H\u0082\bJ\t\u0010.\u001a\u00020$H\u0082\bJ\t\u0010/\u001a\u00020\u0004H\u0082\bJ&\u00100\u001a\u00020$2\n\u0010(\u001a\u00060)j\u0002`*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u00101\u001a\u00020\u0019J\u0014\u00102\u001a\u00020$2\n\u00103\u001a\u00060)j\u0002`*H\u0016J\t\u00104\u001a\u00020$H\u0082\bJ\t\u00105\u001a\u00020\u0004H\u0082\bJ\u0014\u00106\u001a\u00020\u00042\n\u00107\u001a\u00060 R\u00020\u0000H\u0002J\u000e\u00108\u001a\b\u0018\u00010 R\u00020\u0000H\u0002J\u0014\u00109\u001a\u00020$2\n\u00107\u001a\u00060 R\u00020\u0000H\u0002J$\u0010:\u001a\u00020$2\n\u00107\u001a\u00060 R\u00020\u00002\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0004H\u0002J\b\u0010=\u001a\u00020$H\u0002J\u0010\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020'H\u0002J\u000e\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020\u0007J\u0018\u0010B\u001a\u00020\u00042\u0006\u0010?\u001a\u00020'2\u0006\u00101\u001a\u00020\u0019H\u0002J\b\u0010C\u001a\u00020\tH\u0016J\b\u0010D\u001a\u00020\u0019H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\r\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0014\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0018\u00010 R\u00020\u00000\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!¨\u0006H"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "corePoolSize", "", "maxPoolSize", "idleWorkerKeepAliveNs", "", "schedulerName", "", "(IIJLjava/lang/String;)V", "_isTerminated", "Lkotlinx/atomicfu/AtomicInt;", "blockingWorkers", "getBlockingWorkers", "()I", "controlState", "Lkotlinx/atomicfu/AtomicLong;", "cpuPermits", "Ljava/util/concurrent/Semaphore;", "createdWorkers", "getCreatedWorkers", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "isTerminated", "", "()Z", "parkedWorkersStack", "random", "Ljava/util/Random;", "workers", "", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "state", "close", "", "createNewWorker", "createTask", "Lkotlinx/coroutines/scheduling/Task;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "createTask$kotlinx_coroutines_core", "decrementBlockingWorkers", "decrementCreatedWorkers", "dispatch", "fair", "execute", "command", "incrementBlockingWorkers", "incrementCreatedWorkers", "parkedWorkersStackNextIndex", "worker", "parkedWorkersStackPop", "parkedWorkersStackPush", "parkedWorkersStackTopUpdate", "oldIndex", "newIndex", "requestCpuWorker", "runSafely", "task", "shutdown", com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT, "submitToLocalQueue", "toString", "tryUnpark", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class CoroutineScheduler implements java.util.concurrent.Executor, java.io.Closeable {
    private static final int ADDED = -1;
    private static final int ADDED_REQUIRES_HELP = 0;
    private static final int ALLOWED = 0;
    private static final long BLOCKING_MASK = 4398044413952L;
    private static final int BLOCKING_SHIFT = 21;
    private static final long CREATED_MASK = 2097151;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.coroutines.scheduling.CoroutineScheduler.Companion INSTANCE = new kotlinx.coroutines.scheduling.CoroutineScheduler.Companion(null);
    private static final int FORBIDDEN = -1;
    private static final int MAX_PARK_TIME_NS;
    private static final int MAX_SPINS;
    public static final int MAX_SUPPORTED_POOL_SIZE = 2097150;
    private static final int MAX_YIELDS;
    private static final int MIN_PARK_TIME_NS;
    public static final int MIN_SUPPORTED_POOL_SIZE = 1;
    private static final int NOT_ADDED = 1;
    private static final kotlinx.coroutines.internal.Symbol NOT_IN_STACK;
    private static final long PARKED_INDEX_MASK = 2097151;
    private static final long PARKED_VERSION_INC = 2097152;
    private static final long PARKED_VERSION_MASK = -2097152;
    private static final int TERMINATED = 1;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _isTerminated$FU;
    static final java.util.concurrent.atomic.AtomicLongFieldUpdater controlState$FU;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater parkedWorkersStack$FU;
    private volatile int _isTerminated;
    volatile long controlState;
    private final int corePoolSize;
    private final java.util.concurrent.Semaphore cpuPermits;
    private final kotlinx.coroutines.scheduling.GlobalQueue globalQueue;
    private final long idleWorkerKeepAliveNs;
    private final int maxPoolSize;
    private volatile long parkedWorkersStack;
    private final java.util.Random random;
    private final java.lang.String schedulerName;
    private final kotlinx.coroutines.scheduling.CoroutineScheduler.Worker[] workers;

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING.ordinal()] = 1;
            iArr[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING.ordinal()] = 2;
            iArr[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            iArr[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.RETIRING.ordinal()] = 4;
            iArr[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED.ordinal()] = 5;
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "RETIRING", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        RETIRING,
        TERMINATED
    }

    private final int blockingWorkers(long state) {
        return (int) ((state & BLOCKING_MASK) >> 21);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int createdWorkers(long state) {
        return (int) (state & 2097151);
    }

    public CoroutineScheduler(int i, int i2, long j, java.lang.String schedulerName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(schedulerName, "schedulerName");
        this.corePoolSize = i;
        this.maxPoolSize = i2;
        this.idleWorkerKeepAliveNs = j;
        this.schedulerName = schedulerName;
        if (!(i >= 1)) {
            throw new java.lang.IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (!(i2 >= i)) {
            throw new java.lang.IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (!(i2 <= 2097150)) {
            throw new java.lang.IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j > 0)) {
            throw new java.lang.IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.globalQueue = new kotlinx.coroutines.scheduling.GlobalQueue();
        this.cpuPermits = new java.util.concurrent.Semaphore(i, false);
        this.parkedWorkersStack = 0L;
        this.workers = new kotlinx.coroutines.scheduling.CoroutineScheduler.Worker[i2 + 1];
        this.controlState = 0L;
        this.random = new java.util.Random();
        this._isTerminated = 0;
    }

    public /* synthetic */ CoroutineScheduler(int i, int i2, long j, java.lang.String str, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS : j, (i3 & 8) != 0 ? kotlinx.coroutines.scheduling.TasksKt.DEFAULT_SCHEDULER_NAME : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parkedWorkersStackPush(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker) {
        long j;
        long j2;
        int indexInArray;
        if (worker.getNextParkedWorker() != NOT_IN_STACK) {
            return;
        }
        do {
            j = this.parkedWorkersStack;
            j2 = (2097152 + j) & PARKED_VERSION_MASK;
            indexInArray = worker.getIndexInArray();
            worker.setNextParkedWorker(this.workers[(int) (2097151 & j)]);
        } while (!parkedWorkersStack$FU.compareAndSet(this, j, ((long) indexInArray) | j2));
    }

    private final int parkedWorkersStackNextIndex(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker) {
        java.lang.Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != NOT_IN_STACK) {
            if (nextParkedWorker == null) {
                return 0;
            }
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker2 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) nextParkedWorker;
            int indexInArray = worker2.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = worker2.getNextParkedWorker();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCreatedWorkers() {
        return (int) (this.controlState & 2097151);
    }

    private final int getBlockingWorkers() {
        return (int) ((this.controlState & BLOCKING_MASK) >> 21);
    }

    private final int incrementCreatedWorkers() {
        return (int) (controlState$FU.incrementAndGet(this) & 2097151);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int decrementCreatedWorkers() {
        return (int) (controlState$FU.getAndDecrement(this) & 2097151);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementBlockingWorkers() {
        controlState$FU.addAndGet(this, 2097152L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void decrementBlockingWorkers() {
        controlState$FU.addAndGet(this, PARKED_VERSION_MASK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isTerminated() {
        return this._isTerminated != 0;
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0002R\u000e\u0010\u0013\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "()V", "ADDED", "", "ADDED_REQUIRES_HELP", "ALLOWED", "BLOCKING_MASK", "", "BLOCKING_SHIFT", "CREATED_MASK", "FORBIDDEN", "MAX_PARK_TIME_NS", "MAX_PARK_TIME_NS$annotations", "MAX_SPINS", "MAX_SUPPORTED_POOL_SIZE", "MAX_YIELDS", "MIN_PARK_TIME_NS", "MIN_PARK_TIME_NS$annotations", "MIN_SUPPORTED_POOL_SIZE", "NOT_ADDED", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static final class Companion {
        @kotlin.jvm.JvmStatic
        private static /* synthetic */ void MAX_PARK_TIME_NS$annotations() {
        }

        @kotlin.jvm.JvmStatic
        private static /* synthetic */ void MIN_PARK_TIME_NS$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int iSystemProp$default = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default("kotlinx.coroutines.scheduler.spins", 1000, 1, 0, 8, (java.lang.Object) null);
        MAX_SPINS = iSystemProp$default;
        MAX_YIELDS = iSystemProp$default + kotlinx.coroutines.internal.SystemPropsKt.systemProp$default("kotlinx.coroutines.scheduler.yields", 0, 0, 0, 8, (java.lang.Object) null);
        int nanos = (int) java.util.concurrent.TimeUnit.SECONDS.toNanos(1L);
        MAX_PARK_TIME_NS = nanos;
        MIN_PARK_TIME_NS = (int) kotlin.ranges.RangesKt.coerceAtMost(kotlin.ranges.RangesKt.coerceAtLeast(kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS / ((long) 4), 10L), nanos);
        NOT_IN_STACK = new kotlinx.coroutines.internal.Symbol("NOT_IN_STACK");
        parkedWorkersStack$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.CoroutineScheduler.class, "parkedWorkersStack");
        controlState$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.CoroutineScheduler.class, "controlState");
        _isTerminated$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.CoroutineScheduler.class, "_isTerminated");
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(command, "command");
        dispatch$default(this, command, null, false, 6, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown(10000L);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    public final void shutdown(long timeout) {
        int i;
        kotlinx.coroutines.scheduling.Task taskRemoveFirstOrNull;
        if (_isTerminated$FU.compareAndSet(this, 0, 1)) {
            java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
            if (!(threadCurrentThread instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker)) {
                threadCurrentThread = null;
            }
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) threadCurrentThread;
            synchronized (this.workers) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker2 = this.workers[i2];
                    if (worker2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwNpe();
                    }
                    if (worker2 != worker) {
                        while (worker2.isAlive()) {
                            java.util.concurrent.locks.LockSupport.unpark(worker2);
                            worker2.join(timeout);
                        }
                        kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState state = worker2.getState();
                        if (!(state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED)) {
                            throw new java.lang.IllegalStateException(("Expected TERMINATED state, but found " + state).toString());
                        }
                        worker2.getLocalQueue().offloadAllWork$kotlinx_coroutines_core(this.globalQueue);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.globalQueue.close();
            while (true) {
                if (worker == null) {
                    taskRemoveFirstOrNull = this.globalQueue.removeFirstOrNull();
                } else {
                    taskRemoveFirstOrNull = worker.findTask$kotlinx_coroutines_core();
                    if (taskRemoveFirstOrNull == null) {
                        taskRemoveFirstOrNull = this.globalQueue.removeFirstOrNull();
                    }
                }
                if (taskRemoveFirstOrNull == null) {
                    break;
                } else {
                    runSafely(taskRemoveFirstOrNull);
                }
            }
            if (worker != null) {
                worker.tryReleaseCpu$kotlinx_coroutines_core(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED);
            }
            this.cpuPermits.availablePermits();
            int i3 = this.corePoolSize;
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public static /* synthetic */ void dispatch$default(kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler, java.lang.Runnable runnable, kotlinx.coroutines.scheduling.TaskContext taskContext, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            taskContext = kotlinx.coroutines.scheduling.NonBlockingContext.INSTANCE;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        coroutineScheduler.dispatch(runnable, taskContext, z);
    }

    public final void dispatch(java.lang.Runnable block, kotlinx.coroutines.scheduling.TaskContext taskContext, boolean fair) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(taskContext, "taskContext");
        kotlinx.coroutines.TimeSourceKt.getTimeSource().trackTask();
        kotlinx.coroutines.scheduling.Task taskCreateTask$kotlinx_coroutines_core = createTask$kotlinx_coroutines_core(block, taskContext);
        int iSubmitToLocalQueue = submitToLocalQueue(taskCreateTask$kotlinx_coroutines_core, fair);
        if (iSubmitToLocalQueue != -1) {
            if (iSubmitToLocalQueue == 1) {
                if (!this.globalQueue.addLast(taskCreateTask$kotlinx_coroutines_core)) {
                    throw new java.util.concurrent.RejectedExecutionException(this.schedulerName + " was terminated");
                }
                requestCpuWorker();
                return;
            }
            requestCpuWorker();
        }
    }

    public final kotlinx.coroutines.scheduling.Task createTask$kotlinx_coroutines_core(java.lang.Runnable block, kotlinx.coroutines.scheduling.TaskContext taskContext) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(taskContext, "taskContext");
        long jNanoTime = kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource.nanoTime();
        if (block instanceof kotlinx.coroutines.scheduling.Task) {
            kotlinx.coroutines.scheduling.Task task = (kotlinx.coroutines.scheduling.Task) block;
            task.submissionTime = jNanoTime;
            task.taskContext = taskContext;
            return task;
        }
        return new kotlinx.coroutines.scheduling.TaskImpl(block, jNanoTime, taskContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestCpuWorker() {
        if (this.cpuPermits.availablePermits() == 0) {
            tryUnpark();
            return;
        }
        if (tryUnpark()) {
            return;
        }
        long j = this.controlState;
        if (((int) (2097151 & j)) - ((int) ((j & BLOCKING_MASK) >> 21)) < this.corePoolSize) {
            int iCreateNewWorker = createNewWorker();
            if (iCreateNewWorker == 1 && this.corePoolSize > 1) {
                createNewWorker();
            }
            if (iCreateNewWorker > 0) {
                return;
            }
        }
        tryUnpark();
    }

    private final boolean tryUnpark() {
        while (true) {
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker workerParkedWorkersStackPop = parkedWorkersStackPop();
            if (workerParkedWorkersStackPop == null) {
                return false;
            }
            workerParkedWorkersStackPop.idleResetBeforeUnpark();
            boolean zIsParking = workerParkedWorkersStackPop.isParking();
            java.util.concurrent.locks.LockSupport.unpark(workerParkedWorkersStackPop);
            if (zIsParking && workerParkedWorkersStackPop.tryForbidTermination()) {
                return true;
            }
        }
    }

    private final int createNewWorker() {
        synchronized (this.workers) {
            if (isTerminated()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & BLOCKING_MASK) >> 21));
            if (i2 >= this.corePoolSize) {
                return 0;
            }
            if (i < this.maxPoolSize && this.cpuPermits.availablePermits() != 0) {
                int i3 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i3 > 0 && this.workers[i3] == null)) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = new kotlinx.coroutines.scheduling.CoroutineScheduler.Worker(this, i3);
                worker.start();
                if (!(i3 == ((int) (2097151 & controlState$FU.incrementAndGet(this))))) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                this.workers[i3] = worker;
                return i2 + 1;
            }
            return 0;
        }
    }

    private final int submitToLocalQueue(kotlinx.coroutines.scheduling.Task task, boolean fair) {
        boolean zAdd;
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        if (!(threadCurrentThread instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker)) {
            threadCurrentThread = null;
        }
        kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) threadCurrentThread;
        if (worker == null || worker.getThis$0() != this || worker.getState() == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED) {
            return 1;
        }
        int i = -1;
        if (task.getMode() == kotlinx.coroutines.scheduling.TaskMode.NON_BLOCKING) {
            if (worker.isBlocking()) {
                i = 0;
            } else if (!worker.tryAcquireCpuPermit()) {
                return 1;
            }
        }
        if (fair) {
            zAdd = worker.getLocalQueue().addLast(task, this.globalQueue);
        } else {
            zAdd = worker.getLocalQueue().add(task, this.globalQueue);
        }
        if (!zAdd || worker.getLocalQueue().getBufferSize$kotlinx_coroutines_core() > kotlinx.coroutines.scheduling.TasksKt.QUEUE_SIZE_OFFLOAD_THRESHOLD) {
            return 0;
        }
        return i;
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker : this.workers) {
            if (worker != null) {
                int iSize$kotlinx_coroutines_core = worker.getLocalQueue().size$kotlinx_coroutines_core();
                int i6 = kotlinx.coroutines.scheduling.CoroutineScheduler.WhenMappings.$EnumSwitchMapping$0[worker.getState().ordinal()];
                if (i6 == 1) {
                    i3++;
                } else if (i6 == 2) {
                    i2++;
                    arrayList.add(java.lang.String.valueOf(iSize$kotlinx_coroutines_core) + "b");
                } else if (i6 == 3) {
                    i++;
                    arrayList.add(java.lang.String.valueOf(iSize$kotlinx_coroutines_core) + "c");
                } else if (i6 == 4) {
                    i4++;
                    if (iSize$kotlinx_coroutines_core > 0) {
                        arrayList.add(java.lang.String.valueOf(iSize$kotlinx_coroutines_core) + "r");
                    }
                } else if (i6 == 5) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        return this.schedulerName + '@' + kotlinx.coroutines.DebugKt.getHexAddress(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", retired = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global queue size = " + this.globalQueue.getSize() + ", Control State Workers {created = " + ((int) (2097151 & j)) + ", blocking = " + ((int) ((j & BLOCKING_MASK) >> 21)) + "}]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runSafely(kotlinx.coroutines.scheduling.Task task) {
        try {
            task.run();
        } catch (java.lang.Throwable th) {
            try {
                java.lang.Thread thread = java.lang.Thread.currentThread();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(thread, "thread");
                thread.getUncaughtExceptionHandler().uncaughtException(thread, th);
            } finally {
                kotlinx.coroutines.TimeSourceKt.getTimeSource().unTrackTask();
            }
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0018\u00100\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00101\u001a\u00020\u0010H\u0002J\b\u00102\u001a\u00020\fH\u0002J\b\u00103\u001a\u00020-H\u0002J\b\u00104\u001a\u00020-H\u0002J\u0010\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0010H\u0002J\u000f\u00107\u001a\u0004\u0018\u000108H\u0000¢\u0006\u0002\b9J\n\u0010:\u001a\u0004\u0018\u000108H\u0002J\u0010\u0010;\u001a\u00020-2\u0006\u0010<\u001a\u00020/H\u0002J\u0006\u0010=\u001a\u00020-J\u0015\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0003H\u0000¢\u0006\u0002\b@J\b\u0010A\u001a\u00020-H\u0016J\u0006\u0010B\u001a\u00020\fJ\u0006\u0010C\u001a\u00020\fJ\u0015\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020$H\u0000¢\u0006\u0002\bFJ\n\u0010G\u001a\u0004\u0018\u000108H\u0002J\b\u0010H\u001a\u00020-H\u0002R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "indexInArray", "getIndexInArray", "()I", "setIndexInArray", "(I)V", "isBlocking", "", "()Z", "isParking", "lastExhaustionTime", "", "lastStealIndex", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "getLocalQueue", "()Lkotlinx/coroutines/scheduling/WorkQueue;", "nextParkedWorker", "", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "parkTimeNs", "rngState", "scheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "spins", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "getState", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "setState", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)V", "terminationDeadline", "terminationState", "Lkotlinx/atomicfu/AtomicInt;", "afterTask", "", "taskMode", "Lkotlinx/coroutines/scheduling/TaskMode;", "beforeTask", "taskSubmissionTime", "blockingQuiescence", "blockingWorkerIdle", "cpuWorkerIdle", "doPark", "nanos", "findTask", "Lkotlinx/coroutines/scheduling/Task;", "findTask$kotlinx_coroutines_core", "findTaskWithCpuPermit", "idleReset", "mode", "idleResetBeforeUnpark", "nextInt", "upperBound", "nextInt$kotlinx_coroutines_core", "run", "tryAcquireCpuPermit", "tryForbidTermination", "tryReleaseCpu", "newState", "tryReleaseCpu$kotlinx_coroutines_core", "trySteal", "tryTerminateWorker", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public final class Worker extends java.lang.Thread {
        private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater terminationState$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.class, "terminationState");
        private volatile int indexInArray;
        private long lastExhaustionTime;
        private int lastStealIndex;
        private final kotlinx.coroutines.scheduling.WorkQueue localQueue;
        private volatile java.lang.Object nextParkedWorker;
        private int parkTimeNs;
        private int rngState;
        private volatile int spins;
        private volatile kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState state;
        private long terminationDeadline;
        private volatile int terminationState;

        private Worker() {
            setDaemon(true);
            this.localQueue = new kotlinx.coroutines.scheduling.WorkQueue();
            this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.RETIRING;
            this.terminationState = 0;
            this.nextParkedWorker = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK;
            this.parkTimeNs = kotlinx.coroutines.scheduling.CoroutineScheduler.MIN_PARK_TIME_NS;
            this.rngState = kotlinx.coroutines.scheduling.CoroutineScheduler.this.random.nextInt();
        }

        public final int getIndexInArray() {
            return this.indexInArray;
        }

        public final void setIndexInArray(int i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(kotlinx.coroutines.scheduling.CoroutineScheduler.this.schedulerName);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : java.lang.String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public Worker(kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler, int i) {
            this();
            setIndexInArray(i);
        }

        /* JADX INFO: renamed from: getScheduler, reason: from getter */
        public final kotlinx.coroutines.scheduling.CoroutineScheduler getThis$0() {
            return kotlinx.coroutines.scheduling.CoroutineScheduler.this;
        }

        public final kotlinx.coroutines.scheduling.WorkQueue getLocalQueue() {
            return this.localQueue;
        }

        @Override // java.lang.Thread
        public final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState getState() {
            return this.state;
        }

        public final void setState(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(workerState, "<set-?>");
            this.state = workerState;
        }

        public final boolean isParking() {
            return this.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING;
        }

        public final boolean isBlocking() {
            return this.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING;
        }

        public final java.lang.Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final void setNextParkedWorker(java.lang.Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean tryForbidTermination() {
            int i = this.terminationState;
            if (i == -1) {
                return false;
            }
            if (i == 0) {
                return terminationState$FU.compareAndSet(this, 0, -1);
            }
            if (i == 1) {
                return false;
            }
            throw new java.lang.IllegalStateException(("Invalid terminationState = " + i).toString());
        }

        public final boolean tryAcquireCpuPermit() {
            if (this.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED) {
                return true;
            }
            if (!kotlinx.coroutines.scheduling.CoroutineScheduler.this.cpuPermits.tryAcquire()) {
                return false;
            }
            this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED;
            return true;
        }

        public final boolean tryReleaseCpu$kotlinx_coroutines_core(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState newState) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newState, "newState");
            kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState = this.state;
            boolean z = workerState == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED;
            if (z) {
                kotlinx.coroutines.scheduling.CoroutineScheduler.this.cpuPermits.release();
            }
            if (workerState != newState) {
                this.state = newState;
            }
            return z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z = false;
            while (!kotlinx.coroutines.scheduling.CoroutineScheduler.this.isTerminated() && this.state != kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED) {
                kotlinx.coroutines.scheduling.Task taskFindTask$kotlinx_coroutines_core = findTask$kotlinx_coroutines_core();
                if (taskFindTask$kotlinx_coroutines_core == null) {
                    if (this.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED) {
                        cpuWorkerIdle();
                    } else {
                        blockingWorkerIdle();
                    }
                    z = true;
                } else {
                    kotlinx.coroutines.scheduling.TaskMode mode = taskFindTask$kotlinx_coroutines_core.getMode();
                    if (z) {
                        idleReset(mode);
                        z = false;
                    }
                    beforeTask(mode, taskFindTask$kotlinx_coroutines_core.submissionTime);
                    kotlinx.coroutines.scheduling.CoroutineScheduler.this.runSafely(taskFindTask$kotlinx_coroutines_core);
                    afterTask(mode);
                }
            }
            tryReleaseCpu$kotlinx_coroutines_core(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED);
        }

        private final void beforeTask(kotlinx.coroutines.scheduling.TaskMode taskMode, long taskSubmissionTime) {
            if (taskMode == kotlinx.coroutines.scheduling.TaskMode.NON_BLOCKING) {
                if (kotlinx.coroutines.scheduling.CoroutineScheduler.this.cpuPermits.availablePermits() == 0) {
                    return;
                }
                long jNanoTime = kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource.nanoTime();
                if (jNanoTime - taskSubmissionTime < kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS || jNanoTime - this.lastExhaustionTime < kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS * ((long) 5)) {
                    return;
                }
                this.lastExhaustionTime = jNanoTime;
                kotlinx.coroutines.scheduling.CoroutineScheduler.this.requestCpuWorker();
                return;
            }
            kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU.addAndGet(kotlinx.coroutines.scheduling.CoroutineScheduler.this, 2097152L);
            if (tryReleaseCpu$kotlinx_coroutines_core(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING)) {
                kotlinx.coroutines.scheduling.CoroutineScheduler.this.requestCpuWorker();
            }
        }

        private final void afterTask(kotlinx.coroutines.scheduling.TaskMode taskMode) {
            if (taskMode != kotlinx.coroutines.scheduling.TaskMode.NON_BLOCKING) {
                kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU.addAndGet(kotlinx.coroutines.scheduling.CoroutineScheduler.this, kotlinx.coroutines.scheduling.CoroutineScheduler.PARKED_VERSION_MASK);
                if (this.state != kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED) {
                    kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING;
                    this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.RETIRING;
                }
            }
        }

        public final int nextInt$kotlinx_coroutines_core(int upperBound) {
            int i = this.rngState;
            int i2 = i ^ (i << 13);
            this.rngState = i2;
            int i3 = i2 ^ (i2 >> 17);
            this.rngState = i3;
            int i4 = i3 ^ (i3 << 5);
            this.rngState = i4;
            int i5 = upperBound - 1;
            return (i5 & upperBound) == 0 ? i4 & i5 : (i4 & Integer.MAX_VALUE) % upperBound;
        }

        private final void cpuWorkerIdle() {
            int i = this.spins;
            if (i > kotlinx.coroutines.scheduling.CoroutineScheduler.MAX_YIELDS) {
                if (this.parkTimeNs < kotlinx.coroutines.scheduling.CoroutineScheduler.MAX_PARK_TIME_NS) {
                    this.parkTimeNs = kotlin.ranges.RangesKt.coerceAtMost((this.parkTimeNs * 3) >>> 1, kotlinx.coroutines.scheduling.CoroutineScheduler.MAX_PARK_TIME_NS);
                }
                tryReleaseCpu$kotlinx_coroutines_core(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING);
                doPark(this.parkTimeNs);
                return;
            }
            this.spins = i + 1;
            if (i >= kotlinx.coroutines.scheduling.CoroutineScheduler.MAX_SPINS) {
                java.lang.Thread.yield();
            }
        }

        private final void blockingWorkerIdle() {
            tryReleaseCpu$kotlinx_coroutines_core(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING);
            if (blockingQuiescence()) {
                this.terminationState = 0;
                if (this.terminationDeadline == 0) {
                    this.terminationDeadline = java.lang.System.nanoTime() + kotlinx.coroutines.scheduling.CoroutineScheduler.this.idleWorkerKeepAliveNs;
                }
                if (doPark(kotlinx.coroutines.scheduling.CoroutineScheduler.this.idleWorkerKeepAliveNs) && java.lang.System.nanoTime() - this.terminationDeadline >= 0) {
                    this.terminationDeadline = 0L;
                    tryTerminateWorker();
                }
            }
        }

        private final boolean doPark(long nanos) {
            kotlinx.coroutines.scheduling.CoroutineScheduler.this.parkedWorkersStackPush(this);
            if (!blockingQuiescence()) {
                return false;
            }
            java.util.concurrent.locks.LockSupport.parkNanos(nanos);
            return true;
        }

        private final void tryTerminateWorker() {
            synchronized (kotlinx.coroutines.scheduling.CoroutineScheduler.this.workers) {
                if (kotlinx.coroutines.scheduling.CoroutineScheduler.this.isTerminated()) {
                    return;
                }
                if (kotlinx.coroutines.scheduling.CoroutineScheduler.this.getCreatedWorkers() <= kotlinx.coroutines.scheduling.CoroutineScheduler.this.corePoolSize) {
                    return;
                }
                if (blockingQuiescence()) {
                    if (terminationState$FU.compareAndSet(this, 0, 1)) {
                        int i = this.indexInArray;
                        setIndexInArray(0);
                        kotlinx.coroutines.scheduling.CoroutineScheduler.this.parkedWorkersStackTopUpdate(this, i, 0);
                        int andDecrement = (int) (kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU.getAndDecrement(kotlinx.coroutines.scheduling.CoroutineScheduler.this) & 2097151);
                        if (andDecrement != i) {
                            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = kotlinx.coroutines.scheduling.CoroutineScheduler.this.workers[andDecrement];
                            if (worker == null) {
                                kotlin.jvm.internal.Intrinsics.throwNpe();
                            }
                            kotlinx.coroutines.scheduling.CoroutineScheduler.this.workers[i] = worker;
                            worker.setIndexInArray(i);
                            kotlinx.coroutines.scheduling.CoroutineScheduler.this.parkedWorkersStackTopUpdate(worker, andDecrement, i);
                        }
                        kotlinx.coroutines.scheduling.CoroutineScheduler.this.workers[andDecrement] = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) null;
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED;
                    }
                }
            }
        }

        private final boolean blockingQuiescence() {
            kotlinx.coroutines.scheduling.Task taskRemoveFirstWithModeOrNull = kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalQueue.removeFirstWithModeOrNull(kotlinx.coroutines.scheduling.TaskMode.PROBABLY_BLOCKING);
            if (taskRemoveFirstWithModeOrNull == null) {
                return true;
            }
            this.localQueue.add(taskRemoveFirstWithModeOrNull, kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalQueue);
            return false;
        }

        private final void idleReset(kotlinx.coroutines.scheduling.TaskMode mode) {
            this.terminationDeadline = 0L;
            this.lastStealIndex = 0;
            if (this.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING) {
                kotlinx.coroutines.scheduling.TaskMode taskMode = kotlinx.coroutines.scheduling.TaskMode.PROBABLY_BLOCKING;
                this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING;
                this.parkTimeNs = kotlinx.coroutines.scheduling.CoroutineScheduler.MIN_PARK_TIME_NS;
            }
            this.spins = 0;
        }

        public final void idleResetBeforeUnpark() {
            this.parkTimeNs = kotlinx.coroutines.scheduling.CoroutineScheduler.MIN_PARK_TIME_NS;
            this.spins = 0;
        }

        public final kotlinx.coroutines.scheduling.Task findTask$kotlinx_coroutines_core() {
            if (tryAcquireCpuPermit()) {
                return findTaskWithCpuPermit();
            }
            kotlinx.coroutines.scheduling.Task taskPoll = this.localQueue.poll();
            return taskPoll != null ? taskPoll : kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalQueue.removeFirstWithModeOrNull(kotlinx.coroutines.scheduling.TaskMode.PROBABLY_BLOCKING);
        }

        private final kotlinx.coroutines.scheduling.Task findTaskWithCpuPermit() {
            kotlinx.coroutines.scheduling.Task taskRemoveFirstOrNull;
            kotlinx.coroutines.scheduling.Task taskRemoveFirstWithModeOrNull;
            boolean z = nextInt$kotlinx_coroutines_core(kotlinx.coroutines.scheduling.CoroutineScheduler.this.corePoolSize * 2) == 0;
            if (z && (taskRemoveFirstWithModeOrNull = kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalQueue.removeFirstWithModeOrNull(kotlinx.coroutines.scheduling.TaskMode.NON_BLOCKING)) != null) {
                return taskRemoveFirstWithModeOrNull;
            }
            kotlinx.coroutines.scheduling.Task taskPoll = this.localQueue.poll();
            if (taskPoll != null) {
                return taskPoll;
            }
            return (z || (taskRemoveFirstOrNull = kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalQueue.removeFirstOrNull()) == null) ? trySteal() : taskRemoveFirstOrNull;
        }

        private final kotlinx.coroutines.scheduling.Task trySteal() {
            int createdWorkers = kotlinx.coroutines.scheduling.CoroutineScheduler.this.getCreatedWorkers();
            if (createdWorkers < 2) {
                return null;
            }
            int iNextInt$kotlinx_coroutines_core = this.lastStealIndex;
            if (iNextInt$kotlinx_coroutines_core == 0) {
                iNextInt$kotlinx_coroutines_core = nextInt$kotlinx_coroutines_core(createdWorkers);
            }
            int i = iNextInt$kotlinx_coroutines_core + 1;
            int i2 = i <= createdWorkers ? i : 1;
            this.lastStealIndex = i2;
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = kotlinx.coroutines.scheduling.CoroutineScheduler.this.workers[i2];
            if (worker == null || worker == this || !this.localQueue.trySteal(worker.localQueue, kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalQueue)) {
                return null;
            }
            return this.localQueue.poll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parkedWorkersStackTopUpdate(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker, int oldIndex, int newIndex) {
        while (true) {
            long j = this.parkedWorkersStack;
            int iParkedWorkersStackNextIndex = (int) (2097151 & j);
            long j2 = (2097152 + j) & PARKED_VERSION_MASK;
            if (iParkedWorkersStackNextIndex == oldIndex) {
                iParkedWorkersStackNextIndex = newIndex == 0 ? parkedWorkersStackNextIndex(worker) : newIndex;
            }
            if (iParkedWorkersStackNextIndex >= 0 && parkedWorkersStack$FU.compareAndSet(this, j, j2 | ((long) iParkedWorkersStackNextIndex))) {
                return;
            }
        }
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler.Worker parkedWorkersStackPop() {
        while (true) {
            long j = this.parkedWorkersStack;
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = this.workers[(int) (2097151 & j)];
            if (worker == null) {
                return null;
            }
            long j2 = (2097152 + j) & PARKED_VERSION_MASK;
            int iParkedWorkersStackNextIndex = parkedWorkersStackNextIndex(worker);
            if (iParkedWorkersStackNextIndex >= 0 && parkedWorkersStack$FU.compareAndSet(this, j, ((long) iParkedWorkersStackNextIndex) | j2)) {
                worker.setNextParkedWorker(NOT_IN_STACK);
                return worker;
            }
        }
    }
}
