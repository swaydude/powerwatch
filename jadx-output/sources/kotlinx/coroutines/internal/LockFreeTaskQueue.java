package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0004J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0017\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00180\u001aJ\r\u0010\u001b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001cJ$\u0010\u001d\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u001aH\u0086\b¢\u0006\u0002\u0010\u001fR$\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "E", "", "singleConsumer", "", "(Z)V", "_cur", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Lkotlinx/coroutines/internal/Core;", "isEmpty", "()Z", "size", "", "getSize", "()I", "addLast", "element", "(Ljava/lang/Object;)Z", "close", "", "isClosed", "map", "", "R", "transform", "Lkotlin/Function1;", "removeFirstOrNull", "()Ljava/lang/Object;", "removeFirstOrNullIf", "predicate", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public class LockFreeTaskQueue<E> {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _cur$FU$internal = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.LockFreeTaskQueue.class, java.lang.Object.class, "_cur$internal");
    public volatile /* synthetic */ java.lang.Object _cur$internal;

    public LockFreeTaskQueue(boolean z) {
        this._cur$internal = new kotlinx.coroutines.internal.LockFreeTaskQueueCore(8, z);
    }

    public final boolean isEmpty() {
        return ((kotlinx.coroutines.internal.LockFreeTaskQueueCore) this._cur$internal).isEmpty();
    }

    public final int getSize() {
        return ((kotlinx.coroutines.internal.LockFreeTaskQueueCore) this._cur$internal).getSize();
    }

    public final <R> java.util.List<R> map(kotlin.jvm.functions.Function1<? super E, ? extends R> transform) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(transform, "transform");
        return ((kotlinx.coroutines.internal.LockFreeTaskQueueCore) this._cur$internal).map(transform);
    }

    public final boolean isClosed() {
        return ((kotlinx.coroutines.internal.LockFreeTaskQueueCore) this._cur$internal).isClosed();
    }

    public final void close() {
        while (true) {
            kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) this._cur$internal;
            if (lockFreeTaskQueueCore.close()) {
                return;
            } else {
                _cur$FU$internal.compareAndSet(this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.next());
            }
        }
    }

    public final boolean addLast(E element) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(element, "element");
        while (true) {
            kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) this._cur$internal;
            int iAddLast = lockFreeTaskQueueCore.addLast(element);
            if (iAddLast == 0) {
                return true;
            }
            if (iAddLast == 1) {
                _cur$FU$internal.compareAndSet(this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.next());
            } else if (iAddLast == 2) {
                return false;
            }
        }
    }

    public final E removeFirstOrNull() {
        E e;
        while (true) {
            kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) this._cur$internal;
            while (true) {
                long j = lockFreeTaskQueueCore._state$internal;
                e = null;
                if ((kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK & j) != 0) {
                    e = (E) kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN;
                    break;
                }
                kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion companion = kotlinx.coroutines.internal.LockFreeTaskQueueCore.INSTANCE;
                int i = (int) ((kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK & j) >> 0);
                if ((lockFreeTaskQueueCore.mask & ((int) ((kotlinx.coroutines.internal.LockFreeTaskQueueCore.TAIL_MASK & j) >> 30))) == (lockFreeTaskQueueCore.mask & i)) {
                    break;
                }
                java.lang.Object obj = lockFreeTaskQueueCore.array.get(lockFreeTaskQueueCore.mask & i);
                if (obj == null) {
                    if (lockFreeTaskQueueCore.singleConsumer) {
                        break;
                    }
                } else {
                    if (!(obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder)) {
                        int i2 = (i + 1) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                        if (kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU$internal.compareAndSet(lockFreeTaskQueueCore, j, kotlinx.coroutines.internal.LockFreeTaskQueueCore.INSTANCE.updateHead(j, i2))) {
                            lockFreeTaskQueueCore.array.set(lockFreeTaskQueueCore.mask & i, null);
                        } else if (lockFreeTaskQueueCore.singleConsumer) {
                            kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCoreRemoveSlowPath = lockFreeTaskQueueCore;
                            do {
                                lockFreeTaskQueueCoreRemoveSlowPath = lockFreeTaskQueueCoreRemoveSlowPath.removeSlowPath(i, i2);
                            } while (lockFreeTaskQueueCoreRemoveSlowPath != null);
                        }
                        e = (E) obj;
                        break;
                    }
                    break;
                }
            }
            if (e != kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN) {
                return e;
            }
            _cur$FU$internal.compareAndSet(this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.next());
        }
    }

    public final E removeFirstOrNullIf(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        E e;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        while (true) {
            kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) this._cur$internal;
            while (true) {
                long j = lockFreeTaskQueueCore._state$internal;
                e = null;
                if ((kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK & j) != 0) {
                    e = (E) kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN;
                    break;
                }
                kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion companion = kotlinx.coroutines.internal.LockFreeTaskQueueCore.INSTANCE;
                int i = (int) ((kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK & j) >> 0);
                if ((lockFreeTaskQueueCore.mask & ((int) ((kotlinx.coroutines.internal.LockFreeTaskQueueCore.TAIL_MASK & j) >> 30))) == (lockFreeTaskQueueCore.mask & i)) {
                    break;
                }
                java.lang.Object obj = (java.lang.Object) lockFreeTaskQueueCore.array.get(lockFreeTaskQueueCore.mask & i);
                if (obj == null) {
                    if (lockFreeTaskQueueCore.singleConsumer) {
                        break;
                    }
                } else {
                    if ((obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder) || !predicate.invoke(obj).booleanValue()) {
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
                    e = (E) obj;
                    break;
                }
            }
            if (e != kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN) {
                return e;
            }
            _cur$FU$internal.compareAndSet(this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.next());
        }
    }
}
