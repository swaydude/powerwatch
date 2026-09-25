package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 .*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002./B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001c\u001a\u00020\u0006J1\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020\u0006J&\u0010!\u001a\b\u0012\u0004\u0012\u0002H#0\"\"\u0004\b\u0001\u0010#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H#0%J\b\u0010&\u001a\u00020\u001aH\u0002J\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\b\u0010(\u001a\u0004\u0018\u00010\u0002J\u001f\u0010)\u001a\u0004\u0018\u00010\u00022\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060%H\u0086\bJ,\u0010+\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0002R(\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u00060"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "E", "", "capacity", "", "singleConsumer", "", "(IZ)V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/Core;", "_state", "Lkotlinx/atomicfu/AtomicLong;", "array", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "isEmpty", "()Z", "mask", "size", "getSize", "()I", "addLast", "element", "(Ljava/lang/Object;)I", "allocateNextCopy", "state", "", "allocateOrGetNextCopy", "close", "fillPlaceholder", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "isClosed", "map", "", "R", "transform", "Lkotlin/Function1;", "markFrozen", "next", "removeFirstOrNull", "removeFirstOrNullIf", "predicate", "removeSlowPath", "oldHead", "newHead", "Companion", "Placeholder", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class LockFreeTaskQueueCore<E> {
    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    public static final int CAPACITY_BITS = 30;
    public static final long CLOSED_MASK = 2305843009213693952L;
    public static final int CLOSED_SHIFT = 61;
    public static final long FROZEN_MASK = 1152921504606846976L;
    public static final int FROZEN_SHIFT = 60;
    public static final long HEAD_MASK = 1073741823;
    public static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    public static final int MAX_CAPACITY_MASK = 1073741823;
    public static final int MIN_ADD_SPIN_CAPACITY = 1024;
    public static final long TAIL_MASK = 1152921503533105152L;
    public static final int TAIL_SHIFT = 30;
    private volatile java.lang.Object _next = null;
    public volatile /* synthetic */ long _state$internal = 0;
    private final java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> array;
    private final int capacity;
    private final int mask;
    private final boolean singleConsumer;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion INSTANCE = new kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion(null);
    public static final kotlinx.coroutines.internal.Symbol REMOVE_FROZEN = new kotlinx.coroutines.internal.Symbol("REMOVE_FROZEN");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.LockFreeTaskQueueCore.class, java.lang.Object.class, "_next");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater _state$FU$internal = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.internal.LockFreeTaskQueueCore.class, "_state$internal");

    public LockFreeTaskQueueCore(int i, boolean z) {
        this.capacity = i;
        this.singleConsumer = z;
        int i2 = i - 1;
        this.mask = i2;
        this.array = new java.util.concurrent.atomic.AtomicReferenceArray<>(i);
        if (!(i2 <= 1073741823)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (!((i & i2) == 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    public final boolean isEmpty() {
        long j = this._state$internal;
        return ((int) ((HEAD_MASK & j) >> 0)) == ((int) ((j & TAIL_MASK) >> 30));
    }

    public final int getSize() {
        long j = this._state$internal;
        return 1073741823 & (((int) ((j & TAIL_MASK) >> 30)) - ((int) ((HEAD_MASK & j) >> 0)));
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> fillPlaceholder(int index, E element) {
        java.lang.Object obj = this.array.get(this.mask & index);
        if (!(obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder) || ((kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder) obj).index != index) {
            return null;
        }
        this.array.set(index & this.mask, element);
        return this;
    }

    public final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> next() {
        return allocateOrGetNextCopy(markFrozen());
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> allocateNextCopy(long state) {
        kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = new kotlinx.coroutines.internal.LockFreeTaskQueueCore<>(this.capacity * 2, this.singleConsumer);
        int i = (int) ((HEAD_MASK & state) >> 0);
        int i2 = (int) ((TAIL_MASK & state) >> 30);
        while (true) {
            int i3 = this.mask;
            if ((i & i3) != (i2 & i3)) {
                java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = lockFreeTaskQueueCore.array;
                int i4 = lockFreeTaskQueueCore.mask & i;
                java.lang.Object placeholder = this.array.get(i3 & i);
                if (placeholder == null) {
                    placeholder = new kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder(i);
                }
                atomicReferenceArray.set(i4, placeholder);
                i++;
            } else {
                lockFreeTaskQueueCore._state$internal = INSTANCE.wo(state, FROZEN_MASK);
                return lockFreeTaskQueueCore;
            }
        }
    }

    public final <R> java.util.List<R> map(kotlin.jvm.functions.Function1<? super E, ? extends R> transform) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(transform, "transform");
        java.util.ArrayList arrayList = new java.util.ArrayList(this.array.length());
        long j = this._state$internal;
        int i = (int) ((HEAD_MASK & j) >> 0);
        int i2 = (int) ((j & TAIL_MASK) >> 30);
        while (true) {
            int i3 = this.mask;
            if ((i & i3) != (i2 & i3)) {
                java.lang.Object obj = this.array.get(i3 & i);
                if (obj != null && !(obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder)) {
                    arrayList.add(transform.invoke(obj));
                }
                i++;
            } else {
                return arrayList;
            }
        }
    }

    public final boolean isClosed() {
        return (this._state$internal & CLOSED_MASK) != 0;
    }

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static final class Placeholder {
        public final int index;

        public Placeholder(int i) {
            this.index = i;
        }
    }

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0016\u001a\u00020\u0004*\u00020\tJ\u0012\u0010\u0017\u001a\u00020\t*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004J\u0012\u0010\u0019\u001a\u00020\t*\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0004JP\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0001\u0010\u001c*\u00020\t26\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0086\b¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\t*\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0086\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "()V", "ADD_CLOSED", "", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "TAIL_MASK", "TAIL_SHIFT", "addFailReason", "updateHead", "newHead", "updateTail", "newTail", "withState", "T", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "head", "tail", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "wo", com.google.android.gms.fitness.FitnessActivities.OTHER, "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static final class Companion {
        public final int addFailReason(long j) {
            return (j & kotlinx.coroutines.internal.LockFreeTaskQueueCore.CLOSED_MASK) != 0 ? 2 : 1;
        }

        public final long wo(long j, long j2) {
            return j & (~j2);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long updateHead(long j, int i) {
            return wo(j, kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK) | (((long) i) << 0);
        }

        public final long updateTail(long j, int i) {
            return wo(j, kotlinx.coroutines.internal.LockFreeTaskQueueCore.TAIL_MASK) | (((long) i) << 30);
        }

        public final <T> T withState(long j, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, ? extends T> block) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
            return block.invoke(java.lang.Integer.valueOf((int) ((kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK & j) >> 0)), java.lang.Integer.valueOf((int) ((j & kotlinx.coroutines.internal.LockFreeTaskQueueCore.TAIL_MASK) >> 30)));
        }
    }

    public final boolean close() {
        long j;
        do {
            j = this._state$internal;
            if ((j & CLOSED_MASK) != 0) {
                return true;
            }
            if ((FROZEN_MASK & j) != 0) {
                return false;
            }
        } while (!_state$FU$internal.compareAndSet(this, j, j | CLOSED_MASK));
        return true;
    }

    public final int addLast(E element) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(element, "element");
        while (true) {
            long j = this._state$internal;
            if ((3458764513820540928L & j) != 0) {
                return INSTANCE.addFailReason(j);
            }
            kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion companion = INSTANCE;
            int i = (int) ((HEAD_MASK & j) >> 0);
            int i2 = (int) ((TAIL_MASK & j) >> 30);
            int i3 = this.mask;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.singleConsumer && this.array.get(i2 & i3) != null) {
                int i4 = this.capacity;
                if (i4 < 1024 || ((i2 - i) & MAX_CAPACITY_MASK) > (i4 >> 1)) {
                    return 1;
                }
            } else if (_state$FU$internal.compareAndSet(this, j, companion.updateTail(j, (i2 + 1) & MAX_CAPACITY_MASK))) {
                this.array.set(i2 & i3, element);
                kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreFillPlaceholder = this;
                while ((lockFreeTaskQueueCoreFillPlaceholder._state$internal & FROZEN_MASK) != 0 && (lockFreeTaskQueueCoreFillPlaceholder = lockFreeTaskQueueCoreFillPlaceholder.next().fillPlaceholder(i2, element)) != null) {
                }
                return 0;
            }
        }
    }

    public final java.lang.Object removeFirstOrNull() {
        while (true) {
            long j = this._state$internal;
            if ((FROZEN_MASK & j) != 0) {
                return REMOVE_FROZEN;
            }
            kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion companion = INSTANCE;
            int i = (int) ((HEAD_MASK & j) >> 0);
            if ((((int) ((TAIL_MASK & j) >> 30)) & this.mask) == (this.mask & i)) {
                return null;
            }
            java.lang.Object obj = this.array.get(this.mask & i);
            if (obj == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if (obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder) {
                    return null;
                }
                int i2 = (i + 1) & MAX_CAPACITY_MASK;
                if (_state$FU$internal.compareAndSet(this, j, companion.updateHead(j, i2))) {
                    this.array.set(this.mask & i, null);
                } else if (this.singleConsumer) {
                    kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreRemoveSlowPath = this;
                    do {
                        lockFreeTaskQueueCoreRemoveSlowPath = lockFreeTaskQueueCoreRemoveSlowPath.removeSlowPath(i, i2);
                    } while (lockFreeTaskQueueCoreRemoveSlowPath != null);
                }
                return obj;
            }
        }
    }

    public final java.lang.Object removeFirstOrNullIf(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        while (true) {
            long j = this._state$internal;
            if ((FROZEN_MASK & j) != 0) {
                return REMOVE_FROZEN;
            }
            kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion companion = INSTANCE;
            int i = (int) ((HEAD_MASK & j) >> 0);
            if ((this.mask & ((int) ((TAIL_MASK & j) >> 30))) == (this.mask & i)) {
                return null;
            }
            android.R.bool boolVar = (java.lang.Object) this.array.get(this.mask & i);
            if (boolVar == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if ((boolVar instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder) || !predicate.invoke(boolVar).booleanValue()) {
                    return null;
                }
                int i2 = (i + 1) & MAX_CAPACITY_MASK;
                if (_state$FU$internal.compareAndSet(this, j, companion.updateHead(j, i2))) {
                    this.array.set(this.mask & i, null);
                    return boolVar;
                }
                if (this.singleConsumer) {
                    kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreRemoveSlowPath = this;
                    do {
                        lockFreeTaskQueueCoreRemoveSlowPath = lockFreeTaskQueueCoreRemoveSlowPath.removeSlowPath(i, i2);
                    } while (lockFreeTaskQueueCoreRemoveSlowPath != null);
                    return boolVar;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> removeSlowPath(int oldHead, int newHead) {
        long j;
        kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion companion;
        int i;
        do {
            j = this._state$internal;
            companion = INSTANCE;
            i = (int) ((HEAD_MASK & j) >> 0);
            if (!(i == oldHead)) {
                throw new java.lang.IllegalStateException("This queue can have only one consumer".toString());
            }
            if ((FROZEN_MASK & j) != 0) {
                return next();
            }
        } while (!_state$FU$internal.compareAndSet(this, j, companion.updateHead(j, newHead)));
        this.array.set(this.mask & i, null);
        return null;
    }

    private final long markFrozen() {
        long j;
        long j2;
        do {
            j = this._state$internal;
            if ((j & FROZEN_MASK) != 0) {
                return j;
            }
            j2 = j | FROZEN_MASK;
        } while (!_state$FU$internal.compareAndSet(this, j, j2));
        return j2;
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> allocateOrGetNextCopy(long state) {
        while (true) {
            kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) this._next;
            if (lockFreeTaskQueueCore != null) {
                return lockFreeTaskQueueCore;
            }
            _next$FU.compareAndSet(this, null, allocateNextCopy(state));
        }
    }
}
