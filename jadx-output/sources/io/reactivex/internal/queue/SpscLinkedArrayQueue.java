package io.reactivex.internal.queue;

/* JADX INFO: loaded from: classes2.dex */
public final class SpscLinkedArrayQueue<T> implements io.reactivex.internal.fuseable.SimplePlainQueue<T> {
    java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> consumerBuffer;
    final int consumerMask;
    java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> producerBuffer;
    long producerLookAhead;
    int producerLookAheadStep;
    final int producerMask;
    static final int MAX_LOOK_AHEAD_STEP = java.lang.Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final java.lang.Object HAS_NEXT = new java.lang.Object();
    final java.util.concurrent.atomic.AtomicLong producerIndex = new java.util.concurrent.atomic.AtomicLong();
    final java.util.concurrent.atomic.AtomicLong consumerIndex = new java.util.concurrent.atomic.AtomicLong();

    private static int calcDirectOffset(int i) {
        return i;
    }

    public SpscLinkedArrayQueue(int i) {
        int iRoundToPowerOfTwo = io.reactivex.internal.util.Pow2.roundToPowerOfTwo(java.lang.Math.max(8, i));
        int i2 = iRoundToPowerOfTwo - 1;
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = new java.util.concurrent.atomic.AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.producerBuffer = atomicReferenceArray;
        this.producerMask = i2;
        adjustLookAheadStep(iRoundToPowerOfTwo);
        this.consumerBuffer = atomicReferenceArray;
        this.consumerMask = i2;
        this.producerLookAhead = i2 - 1;
        soProducerIndex(0L);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t) {
        java.util.Objects.requireNonNull(t, "Null is not a valid element");
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.producerBuffer;
        long jLpProducerIndex = lpProducerIndex();
        int i = this.producerMask;
        int iCalcWrappedOffset = calcWrappedOffset(jLpProducerIndex, i);
        if (jLpProducerIndex < this.producerLookAhead) {
            return writeToQueue(atomicReferenceArray, t, jLpProducerIndex, iCalcWrappedOffset);
        }
        long j = ((long) this.producerLookAheadStep) + jLpProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j, i)) == null) {
            this.producerLookAhead = j - 1;
            return writeToQueue(atomicReferenceArray, t, jLpProducerIndex, iCalcWrappedOffset);
        }
        if (lvElement(atomicReferenceArray, calcWrappedOffset(1 + jLpProducerIndex, i)) == null) {
            return writeToQueue(atomicReferenceArray, t, jLpProducerIndex, iCalcWrappedOffset);
        }
        resize(atomicReferenceArray, jLpProducerIndex, iCalcWrappedOffset, t, i);
        return true;
    }

    private boolean writeToQueue(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray, T t, long j, int i) {
        soElement(atomicReferenceArray, i, t);
        soProducerIndex(j + 1);
        return true;
    }

    private void resize(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray, long j, int i, T t, long j2) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(atomicReferenceArray.length());
        this.producerBuffer = atomicReferenceArray2;
        this.producerLookAhead = (j2 + j) - 1;
        soElement(atomicReferenceArray2, i, t);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, i, HAS_NEXT);
        soProducerIndex(j + 1);
    }

    private void soNext(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray, java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2) {
        soElement(atomicReferenceArray, calcDirectOffset(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> lvNextBufferAndUnlink(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray, int i) {
        int iCalcDirectOffset = calcDirectOffset(i);
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = (java.util.concurrent.atomic.AtomicReferenceArray) lvElement(atomicReferenceArray, iCalcDirectOffset);
        soElement(atomicReferenceArray, iCalcDirectOffset, null);
        return atomicReferenceArray2;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    public T poll() {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.consumerBuffer;
        long jLpConsumerIndex = lpConsumerIndex();
        int i = this.consumerMask;
        int iCalcWrappedOffset = calcWrappedOffset(jLpConsumerIndex, i);
        T t = (T) lvElement(atomicReferenceArray, iCalcWrappedOffset);
        boolean z = t == HAS_NEXT;
        if (t == null || z) {
            if (z) {
                return newBufferPoll(lvNextBufferAndUnlink(atomicReferenceArray, i + 1), jLpConsumerIndex, i);
            }
            return null;
        }
        soElement(atomicReferenceArray, iCalcWrappedOffset, null);
        soConsumerIndex(jLpConsumerIndex + 1);
        return t;
    }

    private T newBufferPoll(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray, long j, int i) {
        this.consumerBuffer = atomicReferenceArray;
        int iCalcWrappedOffset = calcWrappedOffset(j, i);
        T t = (T) lvElement(atomicReferenceArray, iCalcWrappedOffset);
        if (t != null) {
            soElement(atomicReferenceArray, iCalcWrappedOffset, null);
            soConsumerIndex(j + 1);
        }
        return t;
    }

    public T peek() {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.consumerBuffer;
        long jLpConsumerIndex = lpConsumerIndex();
        int i = this.consumerMask;
        T t = (T) lvElement(atomicReferenceArray, calcWrappedOffset(jLpConsumerIndex, i));
        return t == HAS_NEXT ? newBufferPeek(lvNextBufferAndUnlink(atomicReferenceArray, i + 1), jLpConsumerIndex, i) : t;
    }

    private T newBufferPeek(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray, long j, int i) {
        this.consumerBuffer = atomicReferenceArray;
        return (T) lvElement(atomicReferenceArray, calcWrappedOffset(j, i));
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public int size() {
        long jLvConsumerIndex = lvConsumerIndex();
        while (true) {
            long jLvProducerIndex = lvProducerIndex();
            long jLvConsumerIndex2 = lvConsumerIndex();
            if (jLvConsumerIndex == jLvConsumerIndex2) {
                return (int) (jLvProducerIndex - jLvConsumerIndex2);
            }
            jLvConsumerIndex = jLvConsumerIndex2;
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return lvProducerIndex() == lvConsumerIndex();
    }

    private void adjustLookAheadStep(int i) {
        this.producerLookAheadStep = java.lang.Math.min(i / 4, MAX_LOOK_AHEAD_STEP);
    }

    private long lvProducerIndex() {
        return this.producerIndex.get();
    }

    private long lvConsumerIndex() {
        return this.consumerIndex.get();
    }

    private long lpProducerIndex() {
        return this.producerIndex.get();
    }

    private long lpConsumerIndex() {
        return this.consumerIndex.get();
    }

    private void soProducerIndex(long j) {
        this.producerIndex.lazySet(j);
    }

    private void soConsumerIndex(long j) {
        this.consumerIndex.lazySet(j);
    }

    private static int calcWrappedOffset(long j, int i) {
        return calcDirectOffset(((int) j) & i);
    }

    private static void soElement(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray, int i, java.lang.Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    private static <E> java.lang.Object lvElement(java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t, T t2) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.producerBuffer;
        long jLvProducerIndex = lvProducerIndex();
        int i = this.producerMask;
        long j = 2 + jLvProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j, i)) == null) {
            int iCalcWrappedOffset = calcWrappedOffset(jLvProducerIndex, i);
            soElement(atomicReferenceArray, iCalcWrappedOffset + 1, t2);
            soElement(atomicReferenceArray, iCalcWrappedOffset, t);
            soProducerIndex(j);
            return true;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(atomicReferenceArray.length());
        this.producerBuffer = atomicReferenceArray2;
        int iCalcWrappedOffset2 = calcWrappedOffset(jLvProducerIndex, i);
        soElement(atomicReferenceArray2, iCalcWrappedOffset2 + 1, t2);
        soElement(atomicReferenceArray2, iCalcWrappedOffset2, t);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, iCalcWrappedOffset2, HAS_NEXT);
        soProducerIndex(j);
        return true;
    }
}
