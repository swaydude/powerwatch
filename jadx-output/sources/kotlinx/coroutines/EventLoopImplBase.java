package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0003123B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0002J\u001a\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0019j\u0002`\u001aJ\u0012\u0010\u001f\u001a\u00020\u00172\n\u0010 \u001a\u00060\u0019j\u0002`\u001aJ\u0014\u0010!\u001a\u00020\u000b2\n\u0010 \u001a\u00060\u0019j\u0002`\u001aH\u0002J\b\u0010\"\u001a\u00020\u000fH\u0016J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0004J\u0015\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0007H\u0000¢\u0006\u0002\b'J\u0010\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020\u0007H\u0002J\u001e\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u000f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170-H\u0016J\u0010\u0010.\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0007H\u0002J\b\u0010/\u001a\u00020\u0017H\u0014J\b\u00100\u001a\u00020\u0017H\u0002R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u00064"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/Delay;", "()V", "_delayed", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "_queue", "", "isCompleted", "", "isEmpty", "()Z", "nextTime", "", "getNextTime", "()J", "thread", "Ljava/lang/Thread;", "getThread", "()Ljava/lang/Thread;", "closeQueue", "", "dequeue", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "enqueue", "task", "enqueueImpl", "processNextEvent", "rescheduleAllDelayed", "resetAll", "schedule", "delayedTask", "schedule$kotlinx_coroutines_core", "scheduleImpl", "", "scheduleResumeAfterDelay", "timeMillis", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "shouldUnpark", "shutdown", "unpark", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public abstract class EventLoopImplBase extends kotlinx.coroutines.EventLoop implements kotlinx.coroutines.Delay {
    private volatile boolean isCompleted;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _queue$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.EventLoopImplBase.class, java.lang.Object.class, "_queue");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _delayed$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.EventLoopImplBase.class, java.lang.Object.class, "_delayed");
    private volatile java.lang.Object _queue = null;
    private volatile java.lang.Object _delayed = null;

    protected abstract java.lang.Thread getThread();

    @Override // kotlinx.coroutines.Delay
    public java.lang.Object delay(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlinx.coroutines.Delay.DefaultImpls.delay(this, j, continuation);
    }

    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long j, java.lang.Runnable block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        return kotlinx.coroutines.Delay.DefaultImpls.invokeOnTimeout(this, j, block);
    }

    @Override // kotlinx.coroutines.EventLoop
    protected boolean isEmpty() {
        if (!isUnconfinedQueueEmpty()) {
            return false;
        }
        kotlinx.coroutines.internal.ThreadSafeHeap threadSafeHeap = (kotlinx.coroutines.internal.ThreadSafeHeap) this._delayed;
        if (threadSafeHeap != null && !threadSafeHeap.isEmpty()) {
            return false;
        }
        java.lang.Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore) {
                return ((kotlinx.coroutines.internal.LockFreeTaskQueueCore) obj).isEmpty();
            }
            if (obj != kotlinx.coroutines.EventLoopKt.CLOSED_EMPTY) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.EventLoop
    protected long getNextTime() {
        kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTask;
        if (super.getNextTime() == 0) {
            return 0L;
        }
        java.lang.Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore)) {
                if (obj == kotlinx.coroutines.EventLoopKt.CLOSED_EMPTY) {
                    return kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
                }
                return 0L;
            }
            if (!((kotlinx.coroutines.internal.LockFreeTaskQueueCore) obj).isEmpty()) {
                return 0L;
            }
        }
        kotlinx.coroutines.internal.ThreadSafeHeap threadSafeHeap = (kotlinx.coroutines.internal.ThreadSafeHeap) this._delayed;
        return (threadSafeHeap == null || (delayedTask = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) threadSafeHeap.peek()) == null) ? kotlin.jvm.internal.LongCompanionObject.MAX_VALUE : kotlin.ranges.RangesKt.coerceAtLeast(delayedTask.nanoTime - kotlinx.coroutines.TimeSourceKt.getTimeSource().nanoTime(), 0L);
    }

    private final void unpark() {
        java.lang.Thread thread = getThread();
        if (java.lang.Thread.currentThread() != thread) {
            kotlinx.coroutines.TimeSourceKt.getTimeSource().unpark(thread);
        }
    }

    @Override // kotlinx.coroutines.EventLoop
    protected void shutdown() {
        kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.resetEventLoop$kotlinx_coroutines_core();
        this.isCompleted = true;
        closeQueue();
        while (processNextEvent() <= 0) {
        }
        rescheduleAllDelayed();
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo1407scheduleResumeAfterDelay(long timeMillis, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(continuation, "continuation");
        schedule$kotlinx_coroutines_core(new kotlinx.coroutines.EventLoopImplBase.DelayedResumeTask(this, timeMillis, continuation));
    }

    @Override // kotlinx.coroutines.EventLoop
    public long processNextEvent() {
        kotlinx.coroutines.internal.ThreadSafeHeapNode threadSafeHeapNodeRemoveAtImpl;
        if (processUnconfinedEvent()) {
            return getNextTime();
        }
        kotlinx.coroutines.internal.ThreadSafeHeap threadSafeHeap = (kotlinx.coroutines.internal.ThreadSafeHeap) this._delayed;
        if (threadSafeHeap != null && !threadSafeHeap.isEmpty()) {
            long jNanoTime = kotlinx.coroutines.TimeSourceKt.getTimeSource().nanoTime();
            do {
                synchronized (threadSafeHeap) {
                    kotlinx.coroutines.internal.ThreadSafeHeapNode threadSafeHeapNodeFirstImpl = threadSafeHeap.firstImpl();
                    threadSafeHeapNodeRemoveAtImpl = null;
                    if (threadSafeHeapNodeFirstImpl != null) {
                        kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTask = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) threadSafeHeapNodeFirstImpl;
                        threadSafeHeapNodeRemoveAtImpl = delayedTask.timeToExecute(jNanoTime) ? enqueueImpl(delayedTask) : false ? threadSafeHeap.removeAtImpl(0) : null;
                    }
                }
            } while (((kotlinx.coroutines.EventLoopImplBase.DelayedTask) threadSafeHeapNodeRemoveAtImpl) != null);
        }
        java.lang.Runnable runnableDequeue = dequeue();
        if (runnableDequeue != null) {
            runnableDequeue.run();
        }
        return getNextTime();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public final void mo1406dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        enqueue(block);
    }

    public final void enqueue(java.lang.Runnable task) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
        if (enqueueImpl(task)) {
            unpark();
        } else {
            kotlinx.coroutines.DefaultExecutor.INSTANCE.enqueue(task);
        }
    }

    public final void schedule$kotlinx_coroutines_core(kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTask) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(delayedTask, "delayedTask");
        int iScheduleImpl = scheduleImpl(delayedTask);
        if (iScheduleImpl == 0) {
            if (shouldUnpark(delayedTask)) {
                unpark();
            }
        } else if (iScheduleImpl == 1) {
            kotlinx.coroutines.DefaultExecutor.INSTANCE.schedule$kotlinx_coroutines_core(delayedTask);
        } else if (iScheduleImpl != 2) {
            throw new java.lang.IllegalStateException("unexpected result".toString());
        }
    }

    private final boolean shouldUnpark(kotlinx.coroutines.EventLoopImplBase.DelayedTask task) {
        kotlinx.coroutines.internal.ThreadSafeHeap threadSafeHeap = (kotlinx.coroutines.internal.ThreadSafeHeap) this._delayed;
        return (threadSafeHeap != null ? (kotlinx.coroutines.EventLoopImplBase.DelayedTask) threadSafeHeap.peek() : null) == task;
    }

    private final int scheduleImpl(kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTask) {
        if (this.isCompleted) {
            return 1;
        }
        kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.EventLoopImplBase.DelayedTask> threadSafeHeap = (kotlinx.coroutines.internal.ThreadSafeHeap) this._delayed;
        if (threadSafeHeap == null) {
            kotlinx.coroutines.EventLoopImplBase eventLoopImplBase = this;
            _delayed$FU.compareAndSet(eventLoopImplBase, null, new kotlinx.coroutines.internal.ThreadSafeHeap());
            java.lang.Object obj = eventLoopImplBase._delayed;
            if (obj == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            threadSafeHeap = (kotlinx.coroutines.internal.ThreadSafeHeap) obj;
        }
        return delayedTask.schedule(threadSafeHeap, this);
    }

    protected final void resetAll() {
        this._queue = null;
        this._delayed = null;
    }

    private final void rescheduleAllDelayed() {
        kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTask;
        while (true) {
            kotlinx.coroutines.internal.ThreadSafeHeap threadSafeHeap = (kotlinx.coroutines.internal.ThreadSafeHeap) this._delayed;
            if (threadSafeHeap == null || (delayedTask = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) threadSafeHeap.removeFirstOrNull()) == null) {
                return;
            } else {
                delayedTask.rescheduleOnShutdown();
            }
        }
    }

    /* JADX INFO: compiled from: EventLoop.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u001c\u0010\u001e\u001a\u00020\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0007J\b\u0010%\u001a\u00020&H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "timeMillis", "", "(J)V", "_heap", "", "value", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "getIndex", "()I", "setIndex", "(I)V", "nanoTime", "compareTo", com.google.android.gms.fitness.FitnessActivities.OTHER, "dispose", "", "rescheduleOnShutdown", "schedule", "delayed", "eventLoop", "Lkotlinx/coroutines/EventLoopImplBase;", "timeToExecute", "", "now", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static abstract class DelayedTask implements java.lang.Runnable, java.lang.Comparable<kotlinx.coroutines.EventLoopImplBase.DelayedTask>, kotlinx.coroutines.DisposableHandle, kotlinx.coroutines.internal.ThreadSafeHeapNode {
        private java.lang.Object _heap;
        private int index = -1;
        public final long nanoTime;

        public DelayedTask(long j) {
            this.nanoTime = kotlinx.coroutines.TimeSourceKt.getTimeSource().nanoTime() + kotlinx.coroutines.EventLoopKt.delayToNanos(j);
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public kotlinx.coroutines.internal.ThreadSafeHeap<?> getHeap() {
            java.lang.Object obj = this._heap;
            if (!(obj instanceof kotlinx.coroutines.internal.ThreadSafeHeap)) {
                obj = null;
            }
            return (kotlinx.coroutines.internal.ThreadSafeHeap) obj;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setHeap(kotlinx.coroutines.internal.ThreadSafeHeap<?> threadSafeHeap) {
            if (!(this._heap != kotlinx.coroutines.EventLoopKt.DISPOSED_TASK)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = threadSafeHeap;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public int getIndex() {
            return this.index;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setIndex(int i) {
            this.index = i;
        }

        @Override // java.lang.Comparable
        public int compareTo(kotlinx.coroutines.EventLoopImplBase.DelayedTask other) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(other, "other");
            long j = this.nanoTime - other.nanoTime;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        public final boolean timeToExecute(long now) {
            return now - this.nanoTime >= 0;
        }

        public final synchronized int schedule(kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.EventLoopImplBase.DelayedTask> delayed, kotlinx.coroutines.EventLoopImplBase eventLoop) {
            int i;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(delayed, "delayed");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(eventLoop, "eventLoop");
            if (this._heap == kotlinx.coroutines.EventLoopKt.DISPOSED_TASK) {
                return 2;
            }
            kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTask = this;
            synchronized (delayed) {
                if (!eventLoop.isCompleted) {
                    delayed.addImpl(delayedTask);
                    i = 1;
                } else {
                    i = 0;
                }
            }
            return i ^ 1;
        }

        public final void rescheduleOnShutdown() {
            kotlinx.coroutines.DefaultExecutor.INSTANCE.schedule$kotlinx_coroutines_core(this);
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final synchronized void dispose() {
            java.lang.Object obj = this._heap;
            if (obj == kotlinx.coroutines.EventLoopKt.DISPOSED_TASK) {
                return;
            }
            if (!(obj instanceof kotlinx.coroutines.internal.ThreadSafeHeap)) {
                obj = null;
            }
            kotlinx.coroutines.internal.ThreadSafeHeap threadSafeHeap = (kotlinx.coroutines.internal.ThreadSafeHeap) obj;
            if (threadSafeHeap != null) {
                threadSafeHeap.remove(this);
            }
            this._heap = kotlinx.coroutines.EventLoopKt.DISPOSED_TASK;
        }

        public java.lang.String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }
    }

    /* JADX INFO: compiled from: EventLoop.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "timeMillis", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/EventLoopImplBase;JLkotlinx/coroutines/CancellableContinuation;)V", "run", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private final class DelayedResumeTask extends kotlinx.coroutines.EventLoopImplBase.DelayedTask {
        private final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cont;
        final /* synthetic */ kotlinx.coroutines.EventLoopImplBase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DelayedResumeTask(kotlinx.coroutines.EventLoopImplBase eventLoopImplBase, long j, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cont) {
            super(j);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cont, "cont");
            this.this$0 = eventLoopImplBase;
            this.cont = cont;
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(cont, this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.resumeUndispatched(this.this$0, kotlin.Unit.INSTANCE);
        }
    }

    /* JADX INFO: compiled from: EventLoop.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedRunnableTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "time", "", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "(JLjava/lang/Runnable;)V", "run", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static final class DelayedRunnableTask extends kotlinx.coroutines.EventLoopImplBase.DelayedTask {
        private final java.lang.Runnable block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DelayedRunnableTask(long j, java.lang.Runnable block) {
            super(j);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
            this.block = block;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public java.lang.String toString() {
            return super.toString() + this.block.toString();
        }
    }

    private final boolean enqueueImpl(java.lang.Runnable task) {
        while (true) {
            java.lang.Object obj = this._queue;
            if (this.isCompleted) {
                return false;
            }
            if (obj == null) {
                if (_queue$FU.compareAndSet(this, null, task)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore) {
                if (obj != null) {
                    kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) obj;
                    int iAddLast = lockFreeTaskQueueCore.addLast(task);
                    if (iAddLast == 0) {
                        return true;
                    }
                    if (iAddLast == 1) {
                        _queue$FU.compareAndSet(this, obj, lockFreeTaskQueueCore.next());
                    } else if (iAddLast == 2) {
                        return false;
                    }
                } else {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else {
                if (obj == kotlinx.coroutines.EventLoopKt.CLOSED_EMPTY) {
                    return false;
                }
                kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore2 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore(8, true);
                if (obj != null) {
                    lockFreeTaskQueueCore2.addLast((java.lang.Runnable) obj);
                    lockFreeTaskQueueCore2.addLast(task);
                    if (_queue$FU.compareAndSet(this, obj, lockFreeTaskQueueCore2)) {
                        return true;
                    }
                } else {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    private final java.lang.Runnable dequeue() {
        while (true) {
            java.lang.Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore) {
                if (obj != null) {
                    kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) obj;
                    java.lang.Object objRemoveFirstOrNull = lockFreeTaskQueueCore.removeFirstOrNull();
                    if (objRemoveFirstOrNull != kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN) {
                        return (java.lang.Runnable) objRemoveFirstOrNull;
                    }
                    _queue$FU.compareAndSet(this, obj, lockFreeTaskQueueCore.next());
                } else {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else {
                if (obj == kotlinx.coroutines.EventLoopKt.CLOSED_EMPTY) {
                    return null;
                }
                if (_queue$FU.compareAndSet(this, obj, null)) {
                    if (obj != null) {
                        return (java.lang.Runnable) obj;
                    }
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    private final void closeQueue() {
        while (true) {
            java.lang.Object obj = this._queue;
            if (obj == null) {
                if (_queue$FU.compareAndSet(this, null, kotlinx.coroutines.EventLoopKt.CLOSED_EMPTY)) {
                    return;
                }
            } else if (!(obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore)) {
                if (obj == kotlinx.coroutines.EventLoopKt.CLOSED_EMPTY) {
                    return;
                }
                kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore = new kotlinx.coroutines.internal.LockFreeTaskQueueCore(8, true);
                if (obj != null) {
                    lockFreeTaskQueueCore.addLast((java.lang.Runnable) obj);
                    if (_queue$FU.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                        return;
                    }
                } else {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            } else {
                ((kotlinx.coroutines.internal.LockFreeTaskQueueCore) obj).close();
                return;
            }
        }
    }
}
