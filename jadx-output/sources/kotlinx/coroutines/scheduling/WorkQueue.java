package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: WorkQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0018J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005J!\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u001dH\u0082\bJ\r\u0010\u001e\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0016\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J \u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "()V", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Lkotlinx/coroutines/scheduling/Task;", "bufferSize", "", "getBufferSize$kotlinx_coroutines_core", "()I", "consumerIndex", "Lkotlinx/atomicfu/AtomicInt;", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicRef;", "producerIndex", "add", "", "task", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "addLast", "addToGlobalQueue", "", "offloadAllWork", "offloadAllWork$kotlinx_coroutines_core", "offloadWork", "poll", "pollExternal", "predicate", "Lkotlin/Function1;", "size", "size$kotlinx_coroutines_core", "tryAddLast", "trySteal", "victim", "tryStealLastScheduled", "time", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class WorkQueue {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater lastScheduledTask$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.WorkQueue.class, java.lang.Object.class, "lastScheduledTask");
    static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater producerIndex$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.WorkQueue.class, "producerIndex");
    static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater consumerIndex$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.WorkQueue.class, "consumerIndex");
    private final java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> buffer = new java.util.concurrent.atomic.AtomicReferenceArray<>(128);
    private volatile java.lang.Object lastScheduledTask = null;
    volatile int producerIndex = 0;
    volatile int consumerIndex = 0;

    public final int getBufferSize$kotlinx_coroutines_core() {
        return this.producerIndex - this.consumerIndex;
    }

    public final kotlinx.coroutines.scheduling.Task poll() {
        kotlinx.coroutines.scheduling.Task task = (kotlinx.coroutines.scheduling.Task) lastScheduledTask$FU.getAndSet(this, null);
        if (task != null) {
            return task;
        }
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
            if (((kotlinx.coroutines.scheduling.Task) this.buffer.get(i2)) != null && consumerIndex$FU.compareAndSet(this, i, i + 1)) {
                return (kotlinx.coroutines.scheduling.Task) this.buffer.getAndSet(i2, null);
            }
        }
    }

    public final boolean add(kotlinx.coroutines.scheduling.Task task, kotlinx.coroutines.scheduling.GlobalQueue globalQueue) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(globalQueue, "globalQueue");
        kotlinx.coroutines.scheduling.Task task2 = (kotlinx.coroutines.scheduling.Task) lastScheduledTask$FU.getAndSet(this, task);
        if (task2 != null) {
            return addLast(task2, globalQueue);
        }
        return true;
    }

    public final boolean addLast(kotlinx.coroutines.scheduling.Task task, kotlinx.coroutines.scheduling.GlobalQueue globalQueue) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(globalQueue, "globalQueue");
        boolean z = true;
        while (!tryAddLast(task)) {
            offloadWork(globalQueue);
            z = false;
        }
        return z;
    }

    public final boolean trySteal(kotlinx.coroutines.scheduling.WorkQueue victim, kotlinx.coroutines.scheduling.GlobalQueue globalQueue) {
        kotlinx.coroutines.scheduling.Task task;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(victim, "victim");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(globalQueue, "globalQueue");
        long jNanoTime = kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource.nanoTime();
        int bufferSize$kotlinx_coroutines_core = victim.getBufferSize$kotlinx_coroutines_core();
        if (bufferSize$kotlinx_coroutines_core == 0) {
            return tryStealLastScheduled(jNanoTime, victim, globalQueue);
        }
        int iCoerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(bufferSize$kotlinx_coroutines_core / 2, 1);
        int i = 0;
        boolean z = false;
        while (i < iCoerceAtLeast) {
            while (true) {
                int i2 = victim.consumerIndex;
                task = null;
                if (i2 - victim.producerIndex != 0) {
                    int i3 = i2 & kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
                    kotlinx.coroutines.scheduling.Task task2 = (kotlinx.coroutines.scheduling.Task) victim.buffer.get(i3);
                    if (task2 != null) {
                        if (!(jNanoTime - task2.submissionTime >= kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS || victim.getBufferSize$kotlinx_coroutines_core() > kotlinx.coroutines.scheduling.TasksKt.QUEUE_SIZE_OFFLOAD_THRESHOLD)) {
                            break;
                        }
                        if (consumerIndex$FU.compareAndSet(victim, i2, i2 + 1)) {
                            task = (kotlinx.coroutines.scheduling.Task) victim.buffer.getAndSet(i3, null);
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            if (task == null) {
                break;
            }
            add(task, globalQueue);
            i++;
            z = true;
        }
        return z;
    }

    private final boolean tryStealLastScheduled(long time, kotlinx.coroutines.scheduling.WorkQueue victim, kotlinx.coroutines.scheduling.GlobalQueue globalQueue) {
        kotlinx.coroutines.scheduling.Task task = (kotlinx.coroutines.scheduling.Task) victim.lastScheduledTask;
        if (task == null || time - task.submissionTime < kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS || !lastScheduledTask$FU.compareAndSet(victim, task, null)) {
            return false;
        }
        add(task, globalQueue);
        return true;
    }

    public final int size$kotlinx_coroutines_core() {
        return this.lastScheduledTask != null ? getBufferSize$kotlinx_coroutines_core() + 1 : getBufferSize$kotlinx_coroutines_core();
    }

    private final void offloadWork(kotlinx.coroutines.scheduling.GlobalQueue globalQueue) {
        kotlinx.coroutines.scheduling.Task task;
        int iCoerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(getBufferSize$kotlinx_coroutines_core() / 2, 1);
        for (int i = 0; i < iCoerceAtLeast; i++) {
            while (true) {
                int i2 = this.consumerIndex;
                task = null;
                if (i2 - this.producerIndex == 0) {
                    break;
                }
                int i3 = i2 & kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
                if (((kotlinx.coroutines.scheduling.Task) this.buffer.get(i3)) != null && consumerIndex$FU.compareAndSet(this, i2, i2 + 1)) {
                    task = (kotlinx.coroutines.scheduling.Task) this.buffer.getAndSet(i3, null);
                    break;
                }
            }
            if (task == null) {
                return;
            }
            addToGlobalQueue(globalQueue, task);
        }
    }

    private final void addToGlobalQueue(kotlinx.coroutines.scheduling.GlobalQueue globalQueue, kotlinx.coroutines.scheduling.Task task) {
        if (!globalQueue.addLast(task)) {
            throw new java.lang.IllegalStateException("GlobalQueue could not be closed yet".toString());
        }
    }

    public final void offloadAllWork$kotlinx_coroutines_core(kotlinx.coroutines.scheduling.GlobalQueue globalQueue) {
        kotlinx.coroutines.scheduling.Task task;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(globalQueue, "globalQueue");
        kotlinx.coroutines.scheduling.Task task2 = (kotlinx.coroutines.scheduling.Task) lastScheduledTask$FU.getAndSet(this, null);
        if (task2 != null) {
            addToGlobalQueue(globalQueue, task2);
        }
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                task = null;
            } else {
                int i2 = i & kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
                if (((kotlinx.coroutines.scheduling.Task) this.buffer.get(i2)) != null && consumerIndex$FU.compareAndSet(this, i, i + 1)) {
                    task = (kotlinx.coroutines.scheduling.Task) this.buffer.getAndSet(i2, null);
                }
            }
            if (task == null) {
                return;
            } else {
                addToGlobalQueue(globalQueue, task);
            }
        }
    }

    static /* synthetic */ kotlinx.coroutines.scheduling.Task pollExternal$default(kotlinx.coroutines.scheduling.WorkQueue workQueue, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1<kotlinx.coroutines.scheduling.Task, java.lang.Boolean>() { // from class: kotlinx.coroutines.scheduling.WorkQueue.pollExternal.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2(kotlinx.coroutines.scheduling.Task it) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                    return true;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlinx.coroutines.scheduling.Task task) {
                    return java.lang.Boolean.valueOf(invoke2(task));
                }
            };
        }
        while (true) {
            int i2 = workQueue.consumerIndex;
            if (i2 - workQueue.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
            kotlinx.coroutines.scheduling.Task task = (kotlinx.coroutines.scheduling.Task) workQueue.buffer.get(i3);
            if (task != null) {
                if (!((java.lang.Boolean) function1.invoke(task)).booleanValue()) {
                    return null;
                }
                if (consumerIndex$FU.compareAndSet(workQueue, i2, i2 + 1)) {
                    return (kotlinx.coroutines.scheduling.Task) workQueue.buffer.getAndSet(i3, null);
                }
            }
        }
    }

    private final kotlinx.coroutines.scheduling.Task pollExternal(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.scheduling.Task, java.lang.Boolean> predicate) {
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
            kotlinx.coroutines.scheduling.Task task = (kotlinx.coroutines.scheduling.Task) this.buffer.get(i2);
            if (task != null) {
                if (!predicate.invoke(task).booleanValue()) {
                    return null;
                }
                if (consumerIndex$FU.compareAndSet(this, i, i + 1)) {
                    return (kotlinx.coroutines.scheduling.Task) this.buffer.getAndSet(i2, null);
                }
            }
        }
    }

    private final boolean tryAddLast(kotlinx.coroutines.scheduling.Task task) {
        if (getBufferSize$kotlinx_coroutines_core() == 127) {
            return false;
        }
        int i = this.producerIndex & kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
        if (this.buffer.get(i) != null) {
            return false;
        }
        this.buffer.lazySet(i, task);
        producerIndex$FU.incrementAndGet(this);
        return true;
    }
}
