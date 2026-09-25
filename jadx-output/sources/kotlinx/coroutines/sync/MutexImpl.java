package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0007\"#$%&'(B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u001b\u0010\u0012\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0014JR\u0010\u0016\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\"\u0010\u001a\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001bH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010!\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0016R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\"\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/selects/SelectClause2;", "", "locked", "", "(Z)V", "_state", "Lkotlinx/atomicfu/AtomicRef;", "isLocked", "()Z", "isLockedEmptyQueueState", "isLockedEmptyQueueState$kotlinx_coroutines_core", "onLock", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "holdsLock", "owner", "lock", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lockSuspend", "registerSelectClause2", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "toString", "", "tryLock", "unlock", "LockCont", "LockSelect", "LockWaiter", "LockedQueue", "TryEnqueueLockDesc", "TryLockDesc", "UnlockOp", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class MutexImpl implements kotlinx.coroutines.sync.Mutex, kotlinx.coroutines.selects.SelectClause2<java.lang.Object, kotlinx.coroutines.sync.Mutex> {
    static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.sync.MutexImpl.class, java.lang.Object.class, "_state");
    volatile java.lang.Object _state;

    public MutexImpl(boolean z) {
        this._state = z ? kotlinx.coroutines.sync.MutexKt.EMPTY_LOCKED : kotlinx.coroutines.sync.MutexKt.EMPTY_UNLOCKED;
    }

    public final boolean isLockedEmptyQueueState$kotlinx_coroutines_core() {
        java.lang.Object obj = this._state;
        return (obj instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue) && ((kotlinx.coroutines.sync.MutexImpl.LockedQueue) obj).isEmpty();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public java.lang.Object lock(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return tryLock(obj) ? kotlin.Unit.INSTANCE : lockSuspend(obj, continuation);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public kotlinx.coroutines.selects.SelectClause2<java.lang.Object, kotlinx.coroutines.sync.Mutex> getOnLock() {
        return this;
    }

    @Override // kotlinx.coroutines.selects.SelectClause2
    public <R> void registerSelectClause2(kotlinx.coroutines.selects.SelectInstance<? super R> select, java.lang.Object owner, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.sync.Mutex, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        while (!select.isSelected()) {
            java.lang.Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.Empty) {
                kotlinx.coroutines.sync.Empty empty = (kotlinx.coroutines.sync.Empty) obj;
                if (empty.locked != kotlinx.coroutines.sync.MutexKt.UNLOCKED) {
                    _state$FU.compareAndSet(this, obj, new kotlinx.coroutines.sync.MutexImpl.LockedQueue(empty.locked));
                } else {
                    java.lang.Object objPerformAtomicTrySelect = select.performAtomicTrySelect(new kotlinx.coroutines.sync.MutexImpl.TryLockDesc(this, owner));
                    if (objPerformAtomicTrySelect == null) {
                        kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(block, this, select.getCompletion());
                        return;
                    } else {
                        if (objPerformAtomicTrySelect == kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()) {
                            return;
                        }
                        if (objPerformAtomicTrySelect != kotlinx.coroutines.sync.MutexKt.LOCK_FAIL) {
                            throw new java.lang.IllegalStateException(("performAtomicTrySelect(TryLockDesc) returned " + objPerformAtomicTrySelect).toString());
                        }
                    }
                }
            } else if (obj instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue) {
                kotlinx.coroutines.sync.MutexImpl.LockedQueue lockedQueue = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) obj;
                if (!(lockedQueue.owner != owner)) {
                    throw new java.lang.IllegalStateException(("Already locked by " + owner).toString());
                }
                kotlinx.coroutines.sync.MutexImpl.TryEnqueueLockDesc tryEnqueueLockDesc = new kotlinx.coroutines.sync.MutexImpl.TryEnqueueLockDesc(this, owner, lockedQueue, select, block);
                java.lang.Object objPerformAtomicIfNotSelected = select.performAtomicIfNotSelected(tryEnqueueLockDesc);
                if (objPerformAtomicIfNotSelected == null) {
                    select.disposeOnSelect((kotlinx.coroutines.DisposableHandle) tryEnqueueLockDesc.node);
                    return;
                } else {
                    if (objPerformAtomicIfNotSelected == kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()) {
                        return;
                    }
                    if (objPerformAtomicIfNotSelected != kotlinx.coroutines.sync.MutexKt.ENQUEUE_FAIL) {
                        throw new java.lang.IllegalStateException(("performAtomicIfNotSelected(TryEnqueueLockDesc) returned " + objPerformAtomicIfNotSelected).toString());
                    }
                }
            } else {
                if (!(obj instanceof kotlinx.coroutines.internal.OpDescriptor)) {
                    throw new java.lang.IllegalStateException(("Illegal state " + obj).toString());
                }
                ((kotlinx.coroutines.internal.OpDescriptor) obj).perform(this);
            }
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00052\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc;", "Lkotlinx/coroutines/internal/AtomicDesc;", "mutex", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", "complete", "", "op", "Lkotlinx/coroutines/internal/AtomicOp;", "failure", "prepare", "PrepareOp", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class TryLockDesc extends kotlinx.coroutines.internal.AtomicDesc {
        public final kotlinx.coroutines.sync.MutexImpl mutex;
        public final java.lang.Object owner;

        public TryLockDesc(kotlinx.coroutines.sync.MutexImpl mutex, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(mutex, "mutex");
            this.mutex = mutex;
            this.owner = obj;
        }

        /* JADX INFO: compiled from: Mutex.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc$PrepareOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "op", "Lkotlinx/coroutines/internal/AtomicOp;", "(Lkotlinx/coroutines/sync/MutexImpl$TryLockDesc;Lkotlinx/coroutines/internal/AtomicOp;)V", "perform", "", "affected", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
        private final class PrepareOp extends kotlinx.coroutines.internal.OpDescriptor {
            private final kotlinx.coroutines.internal.AtomicOp<?> op;
            final /* synthetic */ kotlinx.coroutines.sync.MutexImpl.TryLockDesc this$0;

            public PrepareOp(kotlinx.coroutines.sync.MutexImpl.TryLockDesc tryLockDesc, kotlinx.coroutines.internal.AtomicOp<?> op) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(op, "op");
                this.this$0 = tryLockDesc;
                this.op = op;
            }

            @Override // kotlinx.coroutines.internal.OpDescriptor
            public java.lang.Object perform(java.lang.Object affected) {
                java.lang.Object obj = this.op.isDecided() ? kotlinx.coroutines.sync.MutexKt.EMPTY_UNLOCKED : this.op;
                if (affected == null) {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
                }
                kotlinx.coroutines.sync.MutexImpl._state$FU.compareAndSet((kotlinx.coroutines.sync.MutexImpl) affected, this, obj);
                return null;
            }
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        public java.lang.Object prepare(kotlinx.coroutines.internal.AtomicOp<?> op) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(op, "op");
            kotlinx.coroutines.sync.MutexImpl.TryLockDesc.PrepareOp prepareOp = new kotlinx.coroutines.sync.MutexImpl.TryLockDesc.PrepareOp(this, op);
            if (!kotlinx.coroutines.sync.MutexImpl._state$FU.compareAndSet(this.mutex, kotlinx.coroutines.sync.MutexKt.EMPTY_UNLOCKED, prepareOp)) {
                return kotlinx.coroutines.sync.MutexKt.LOCK_FAIL;
            }
            return prepareOp.perform(this.mutex);
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        public void complete(kotlinx.coroutines.internal.AtomicOp<?> op, java.lang.Object failure) {
            kotlinx.coroutines.sync.Empty empty;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(op, "op");
            if (failure != null) {
                empty = kotlinx.coroutines.sync.MutexKt.EMPTY_UNLOCKED;
            } else {
                java.lang.Object obj = this.owner;
                empty = obj == null ? kotlinx.coroutines.sync.MutexKt.EMPTY_LOCKED : new kotlinx.coroutines.sync.Empty(obj);
            }
            kotlinx.coroutines.sync.MutexImpl._state$FU.compareAndSet(this.mutex, op, empty);
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003`\u0004BT\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000eø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0014R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$TryEnqueueLockDesc;", "R", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/sync/MutexImpl$LockSelect;", "Lkotlinx/coroutines/internal/AddLastDesc;", "mutex", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", "", "queue", "Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "onPrepare", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "next", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class TryEnqueueLockDesc<R> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc<kotlinx.coroutines.sync.MutexImpl.LockSelect<R>> {
        public final kotlinx.coroutines.sync.MutexImpl mutex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TryEnqueueLockDesc(kotlinx.coroutines.sync.MutexImpl mutex, java.lang.Object obj, kotlinx.coroutines.sync.MutexImpl.LockedQueue queue, kotlinx.coroutines.selects.SelectInstance<? super R> select, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.sync.Mutex, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) {
            super(queue, new kotlinx.coroutines.sync.MutexImpl.LockSelect(obj, mutex, select, block));
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(mutex, "mutex");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(queue, "queue");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
            this.mutex = mutex;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object onPrepare(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            if (this.mutex._state != this.queue) {
                return kotlinx.coroutines.sync.MutexKt.ENQUEUE_FAIL;
            }
            return super.onPrepare(affected, next);
        }
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(java.lang.Object owner) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(owner, "owner");
        java.lang.Object obj = this._state;
        if (obj instanceof kotlinx.coroutines.sync.Empty) {
            if (((kotlinx.coroutines.sync.Empty) obj).locked == owner) {
                return true;
            }
        } else if ((obj instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue) && ((kotlinx.coroutines.sync.MutexImpl.LockedQueue) obj).owner == owner) {
            return true;
        }
        return false;
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "owner", "", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class LockedQueue extends kotlinx.coroutines.internal.LockFreeLinkedListHead {
        public java.lang.Object owner;

        public LockedQueue(java.lang.Object owner) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(owner, "owner");
            this.owner = owner;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H&J\u0006\u0010\t\u001a\u00020\u0007J\n\u0010\n\u001a\u0004\u0018\u00010\u0004H&R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;", "owner", "", "(Ljava/lang/Object;)V", "completeResumeLockWaiter", "", "token", "dispose", "tryResumeLockWaiter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static abstract class LockWaiter extends kotlinx.coroutines.internal.LockFreeLinkedListNode implements kotlinx.coroutines.DisposableHandle {
        public final java.lang.Object owner;

        public abstract void completeResumeLockWaiter(java.lang.Object token);

        public abstract java.lang.Object tryResumeLockWaiter();

        public LockWaiter(java.lang.Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockCont;", "Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "owner", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "completeResumeLockWaiter", "token", "toString", "", "tryResumeLockWaiter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    static final class LockCont extends kotlinx.coroutines.sync.MutexImpl.LockWaiter {
        public final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cont;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LockCont(java.lang.Object obj, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cont) {
            super(obj);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cont, "cont");
            this.cont = cont;
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public java.lang.Object tryResumeLockWaiter() {
            return kotlinx.coroutines.CancellableContinuation.DefaultImpls.tryResume$default(this.cont, kotlin.Unit.INSTANCE, null, 2, null);
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public void completeResumeLockWaiter(java.lang.Object token) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(token, "token");
            this.cont.completeResume(token);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
            return "LockCont[" + this.owner + ", " + this.cont + ']';
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BL\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0016R1\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockSelect;", "R", "Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "owner", "", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlinx/coroutines/sync/Mutex;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "completeResumeLockWaiter", "", "token", "toString", "", "tryResumeLockWaiter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class LockSelect<R> extends kotlinx.coroutines.sync.MutexImpl.LockWaiter {
        public final kotlin.jvm.functions.Function2<kotlinx.coroutines.sync.Mutex, kotlin.coroutines.Continuation<? super R>, java.lang.Object> block;
        public final kotlinx.coroutines.sync.Mutex mutex;
        public final kotlinx.coroutines.selects.SelectInstance<R> select;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LockSelect(java.lang.Object obj, kotlinx.coroutines.sync.Mutex mutex, kotlinx.coroutines.selects.SelectInstance<? super R> select, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.sync.Mutex, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) {
            super(obj);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(mutex, "mutex");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
            this.mutex = mutex;
            this.select = select;
            this.block = block;
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public java.lang.Object tryResumeLockWaiter() {
            if (this.select.trySelect(null)) {
                return kotlinx.coroutines.sync.MutexKt.SELECT_SUCCESS;
            }
            return null;
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.LockWaiter
        public void completeResumeLockWaiter(java.lang.Object token) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(token, "token");
            if (!(token == kotlinx.coroutines.sync.MutexKt.SELECT_SUCCESS)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            kotlin.coroutines.ContinuationKt.startCoroutine(this.block, this.mutex, this.select.getCompletion());
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
            return "LockSelect[" + this.owner + ", " + this.mutex + ", " + this.select + ']';
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$UnlockOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "queue", "Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;", "(Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;)V", "perform", "", "affected", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class UnlockOp extends kotlinx.coroutines.internal.OpDescriptor {
        public final kotlinx.coroutines.sync.MutexImpl.LockedQueue queue;

        public UnlockOp(kotlinx.coroutines.sync.MutexImpl.LockedQueue queue) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(queue, "queue");
            this.queue = queue;
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        public java.lang.Object perform(java.lang.Object affected) {
            java.lang.Object obj = this.queue.isEmpty() ? kotlinx.coroutines.sync.MutexKt.EMPTY_UNLOCKED : this.queue;
            if (affected != null) {
                kotlinx.coroutines.sync.MutexImpl mutexImpl = (kotlinx.coroutines.sync.MutexImpl) affected;
                kotlinx.coroutines.sync.MutexImpl._state$FU.compareAndSet(mutexImpl, this, obj);
                if (mutexImpl._state == this.queue) {
                    return kotlinx.coroutines.sync.MutexKt.UNLOCK_FAIL;
                }
                return null;
            }
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
        }
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        while (true) {
            java.lang.Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.Empty) {
                return ((kotlinx.coroutines.sync.Empty) obj).locked != kotlinx.coroutines.sync.MutexKt.UNLOCKED;
            }
            if (obj instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue) {
                return true;
            }
            if (!(obj instanceof kotlinx.coroutines.internal.OpDescriptor)) {
                throw new java.lang.IllegalStateException(("Illegal state " + obj).toString());
            }
            ((kotlinx.coroutines.internal.OpDescriptor) obj).perform(this);
        }
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(java.lang.Object owner) {
        while (true) {
            java.lang.Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.Empty) {
                if (((kotlinx.coroutines.sync.Empty) obj).locked != kotlinx.coroutines.sync.MutexKt.UNLOCKED) {
                    return false;
                }
                if (_state$FU.compareAndSet(this, obj, owner == null ? kotlinx.coroutines.sync.MutexKt.EMPTY_LOCKED : new kotlinx.coroutines.sync.Empty(owner))) {
                    return true;
                }
            } else {
                if (obj instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue) {
                    if (((kotlinx.coroutines.sync.MutexImpl.LockedQueue) obj).owner != owner) {
                        return false;
                    }
                    throw new java.lang.IllegalStateException(("Already locked by " + owner).toString());
                }
                if (!(obj instanceof kotlinx.coroutines.internal.OpDescriptor)) {
                    throw new java.lang.IllegalStateException(("Illegal state " + obj).toString());
                }
                ((kotlinx.coroutines.internal.OpDescriptor) obj).perform(this);
            }
        }
    }

    final /* synthetic */ java.lang.Object lockSuspend(final java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 0);
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final kotlinx.coroutines.sync.MutexImpl.LockCont lockCont = new kotlinx.coroutines.sync.MutexImpl.LockCont(obj, cancellableContinuationImpl2);
        while (true) {
            final java.lang.Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.Empty) {
                kotlinx.coroutines.sync.Empty empty = (kotlinx.coroutines.sync.Empty) obj2;
                if (empty.locked != kotlinx.coroutines.sync.MutexKt.UNLOCKED) {
                    _state$FU.compareAndSet(this, obj2, new kotlinx.coroutines.sync.MutexImpl.LockedQueue(empty.locked));
                } else {
                    if (_state$FU.compareAndSet(this, obj2, obj == null ? kotlinx.coroutines.sync.MutexKt.EMPTY_LOCKED : new kotlinx.coroutines.sync.Empty(obj))) {
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        cancellableContinuationImpl2.resumeWith(kotlin.Result.m13constructorimpl(unit));
                        break;
                    }
                }
            } else if (obj2 instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue) {
                kotlinx.coroutines.sync.MutexImpl.LockedQueue lockedQueue = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) obj2;
                boolean z = true;
                if (!(lockedQueue.owner != obj)) {
                    throw new java.lang.IllegalStateException(("Already locked by " + obj).toString());
                }
                final kotlinx.coroutines.sync.MutexImpl.LockCont lockCont2 = lockCont;
                kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp condAddOp = new kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp(lockCont2) { // from class: kotlinx.coroutines.sync.MutexImpl$lockSuspend$$inlined$suspendAtomicCancellableCoroutine$lambda$1
                    @Override // kotlinx.coroutines.internal.AtomicOp
                    public java.lang.Object prepare(kotlinx.coroutines.internal.LockFreeLinkedListNode affected) {
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
                        if (this._state == obj2) {
                            return null;
                        }
                        return kotlinx.coroutines.internal.LockFreeLinkedListKt.getCONDITION_FALSE();
                    }
                };
                while (true) {
                    java.lang.Object prev = lockedQueue.getPrev();
                    if (prev == null) {
                        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                    }
                    int iTryCondAddNext = ((kotlinx.coroutines.internal.LockFreeLinkedListNode) prev).tryCondAddNext(lockCont2, lockedQueue, condAddOp);
                    if (iTryCondAddNext != 1) {
                        if (iTryCondAddNext == 2) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    kotlinx.coroutines.CancellableContinuationKt.removeOnCancellation(cancellableContinuationImpl2, lockCont2);
                    break;
                }
            } else {
                if (!(obj2 instanceof kotlinx.coroutines.internal.OpDescriptor)) {
                    throw new java.lang.IllegalStateException(("Illegal state " + obj2).toString());
                }
                ((kotlinx.coroutines.internal.OpDescriptor) obj2).perform(this);
            }
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(java.lang.Object owner) {
        while (true) {
            java.lang.Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.Empty) {
                if (owner == null) {
                    if (!(((kotlinx.coroutines.sync.Empty) obj).locked != kotlinx.coroutines.sync.MutexKt.UNLOCKED)) {
                        throw new java.lang.IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    kotlinx.coroutines.sync.Empty empty = (kotlinx.coroutines.sync.Empty) obj;
                    if (!(empty.locked == owner)) {
                        throw new java.lang.IllegalStateException(("Mutex is locked by " + empty.locked + " but expected " + owner).toString());
                    }
                }
                if (_state$FU.compareAndSet(this, obj, kotlinx.coroutines.sync.MutexKt.EMPTY_UNLOCKED)) {
                    return;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.OpDescriptor) {
                ((kotlinx.coroutines.internal.OpDescriptor) obj).perform(this);
            } else if (obj instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue) {
                if (owner != null) {
                    kotlinx.coroutines.sync.MutexImpl.LockedQueue lockedQueue = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) obj;
                    if (!(lockedQueue.owner == owner)) {
                        throw new java.lang.IllegalStateException(("Mutex is locked by " + lockedQueue.owner + " but expected " + owner).toString());
                    }
                }
                kotlinx.coroutines.sync.MutexImpl.LockedQueue lockedQueue2 = (kotlinx.coroutines.sync.MutexImpl.LockedQueue) obj;
                kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNodeRemoveFirstOrNull = lockedQueue2.removeFirstOrNull();
                if (lockFreeLinkedListNodeRemoveFirstOrNull == null) {
                    kotlinx.coroutines.sync.MutexImpl.UnlockOp unlockOp = new kotlinx.coroutines.sync.MutexImpl.UnlockOp(lockedQueue2);
                    if (_state$FU.compareAndSet(this, obj, unlockOp) && unlockOp.perform(this) == null) {
                        return;
                    }
                } else {
                    kotlinx.coroutines.sync.MutexImpl.LockWaiter lockWaiter = (kotlinx.coroutines.sync.MutexImpl.LockWaiter) lockFreeLinkedListNodeRemoveFirstOrNull;
                    java.lang.Object objTryResumeLockWaiter = lockWaiter.tryResumeLockWaiter();
                    if (objTryResumeLockWaiter != null) {
                        java.lang.Object obj2 = lockWaiter.owner;
                        if (obj2 == null) {
                            obj2 = kotlinx.coroutines.sync.MutexKt.LOCKED;
                        }
                        lockedQueue2.owner = obj2;
                        lockWaiter.completeResumeLockWaiter(objTryResumeLockWaiter);
                        return;
                    }
                }
            } else {
                throw new java.lang.IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }

    public java.lang.String toString() {
        while (true) {
            java.lang.Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.Empty) {
                return "Mutex[" + ((kotlinx.coroutines.sync.Empty) obj).locked + ']';
            }
            if (!(obj instanceof kotlinx.coroutines.internal.OpDescriptor)) {
                if (!(obj instanceof kotlinx.coroutines.sync.MutexImpl.LockedQueue)) {
                    throw new java.lang.IllegalStateException(("Illegal state " + obj).toString());
                }
                return "Mutex[" + ((kotlinx.coroutines.sync.MutexImpl.LockedQueue) obj).owner + ']';
            }
            ((kotlinx.coroutines.internal.OpDescriptor) obj).perform(this);
        }
    }
}
