package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/scheduling/GlobalQueue;", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "Lkotlinx/coroutines/scheduling/Task;", "()V", "removeFirstWithModeOrNull", "mode", "Lkotlinx/coroutines/scheduling/TaskMode;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public class GlobalQueue extends kotlinx.coroutines.internal.LockFreeTaskQueue<kotlinx.coroutines.scheduling.Task> {
    public GlobalQueue() {
        super(false);
    }

    public final kotlinx.coroutines.scheduling.Task removeFirstWithModeOrNull(kotlinx.coroutines.scheduling.TaskMode mode) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(mode, "mode");
        while (true) {
            kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) this._cur$internal;
            while (true) {
                long j = lockFreeTaskQueueCore._state$internal;
                obj = null;
                if ((kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK & j) != 0) {
                    obj = kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN;
                    break;
                }
                kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion companion = kotlinx.coroutines.internal.LockFreeTaskQueueCore.INSTANCE;
                int i = (int) ((kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK & j) >> 0);
                if ((lockFreeTaskQueueCore.mask & ((int) ((kotlinx.coroutines.internal.LockFreeTaskQueueCore.TAIL_MASK & j) >> 30))) == (lockFreeTaskQueueCore.mask & i)) {
                    break;
                }
                java.lang.Object obj2 = lockFreeTaskQueueCore.array.get(lockFreeTaskQueueCore.mask & i);
                if (obj2 == null) {
                    if (lockFreeTaskQueueCore.singleConsumer) {
                        break;
                    }
                } else {
                    if (!(obj2 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder)) {
                        if (!(((kotlinx.coroutines.scheduling.Task) obj2).getMode() == mode)) {
                            break;
                        }
                        int i2 = (i + 1) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                        if (kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU$internal.compareAndSet(lockFreeTaskQueueCore, j, kotlinx.coroutines.internal.LockFreeTaskQueueCore.INSTANCE.updateHead(j, i2))) {
                            lockFreeTaskQueueCore.array.set(lockFreeTaskQueueCore.mask & i, null);
                        } else if (lockFreeTaskQueueCore.singleConsumer) {
                            kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCoreRemoveSlowPath = lockFreeTaskQueueCore;
                            do {
                                lockFreeTaskQueueCoreRemoveSlowPath = lockFreeTaskQueueCoreRemoveSlowPath.removeSlowPath(i, i2);
                            } while (lockFreeTaskQueueCoreRemoveSlowPath != null);
                        }
                        obj = obj2;
                        break;
                    }
                    break;
                }
            }
            if (obj != kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN) {
                return (kotlinx.coroutines.scheduling.Task) obj;
            }
            kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU$internal.compareAndSet(this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.next());
        }
    }
}
