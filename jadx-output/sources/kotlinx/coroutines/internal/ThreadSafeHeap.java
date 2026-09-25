package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ThreadSafeHeap.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0012\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0002\u0010\u0013J$\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H\u0086\b¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0011J\u000f\u0010\u001a\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0002\u0010\u001bJ\r\u0010\u001c\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001bJ\u0015\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\bH\u0002¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0002\u0010 J\u0015\u0010!\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010#J$\u0010$\u001a\u0004\u0018\u00018\u00002\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0&H\u0086\b¢\u0006\u0002\u0010'J\r\u0010(\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001bJ\u0011\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u000eH\u0082\u0010J\u0011\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u000eH\u0082\u0010J\u0018\u0010,\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000eH\u0002R\u001a\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0018\u0010\r\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0006¨\u0006."}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "T", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "()V", "a", "", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "isEmpty", "", "()Z", "size", "", "size$annotations", "addImpl", "", "node", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "addLast", "addLastIf", "cond", "Lkotlin/Function0;", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function0;)Z", "clear", "firstImpl", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "removeAtImpl", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstIf", "predicate", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstOrNull", "siftDownFrom", "i", "siftUpFrom", "swap", "j", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class ThreadSafeHeap<T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>> {
    private T[] a;
    public volatile int size;

    public static /* synthetic */ void size$annotations() {
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final synchronized void clear() {
        java.util.Arrays.fill(this.a, 0, this.size, (java.lang.Object) null);
        this.size = 0;
    }

    public final synchronized T peek() {
        return (T) firstImpl();
    }

    public final synchronized T removeFirstOrNull() {
        return this.size > 0 ? (T) removeAtImpl(0) : null;
    }

    public final synchronized void addLast(T node) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
        addImpl(node);
    }

    public final synchronized boolean remove(T node) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
        z = true;
        if (node.getHeap() == null) {
            z = false;
        } else {
            int index = node.getIndex();
            if (!(index >= 0)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            removeAtImpl(index);
        }
        return z;
    }

    public final T firstImpl() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    public final T removeAtImpl(int index) {
        if (!(this.size > 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        T[] tArr = this.a;
        if (tArr == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        this.size--;
        if (index < this.size) {
            swap(index, this.size);
            int i = (index - 1) / 2;
            if (index > 0) {
                java.lang.Object obj = tArr[index];
                if (obj == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                java.lang.Comparable comparable = (java.lang.Comparable) obj;
                java.lang.Object obj2 = tArr[i];
                if (obj2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                if (comparable.compareTo(obj2) < 0) {
                    swap(index, i);
                    siftUpFrom(i);
                } else {
                    siftDownFrom(index);
                }
            } else {
                siftDownFrom(index);
            }
        }
        T t = (T) tArr[this.size];
        if (t == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        if (!(t.getHeap() == this)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        t.setHeap((kotlinx.coroutines.internal.ThreadSafeHeap) null);
        t.setIndex(-1);
        tArr[this.size] = (kotlinx.coroutines.internal.ThreadSafeHeapNode) null;
        return t;
    }

    public final void addImpl(T node) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
        if (!(node.getHeap() == null)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        node.setHeap(this);
        kotlinx.coroutines.internal.ThreadSafeHeapNode[] threadSafeHeapNodeArrRealloc = realloc();
        int i = this.size;
        this.size = i + 1;
        threadSafeHeapNodeArrRealloc[i] = node;
        node.setIndex(i);
        siftUpFrom(i);
    }

    private final void siftUpFrom(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            if (tArr == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            if (t == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            java.lang.Comparable comparable = (java.lang.Comparable) t;
            T t2 = tArr[i];
            if (t2 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            if (comparable.compareTo(t2) <= 0) {
                return;
            }
            swap(i, i2);
            i = i2;
        }
    }

    private final void siftDownFrom(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 >= this.size) {
                return;
            }
            T[] tArr = this.a;
            if (tArr == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            int i3 = i2 + 1;
            if (i3 < this.size) {
                T t = tArr[i3];
                if (t == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                java.lang.Comparable comparable = (java.lang.Comparable) t;
                T t2 = tArr[i2];
                if (t2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                if (comparable.compareTo(t2) < 0) {
                    i2 = i3;
                }
            }
            T t3 = tArr[i];
            if (t3 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            java.lang.Comparable comparable2 = (java.lang.Comparable) t3;
            T t4 = tArr[i2];
            if (t4 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            if (comparable2.compareTo(t4) <= 0) {
                return;
            }
            swap(i, i2);
            i = i2;
        }
    }

    private final T[] realloc() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new kotlinx.coroutines.internal.ThreadSafeHeapNode[4];
            this.a = tArr2;
            return tArr2;
        }
        if (this.size < tArr.length) {
            return tArr;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(tArr, this.size * 2);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((kotlinx.coroutines.internal.ThreadSafeHeapNode[]) objArrCopyOf);
        this.a = tArr3;
        return tArr3;
    }

    private final void swap(int i, int j) {
        T[] tArr = this.a;
        if (tArr == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        T t = tArr[j];
        if (t == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        T t2 = tArr[i];
        if (t2 == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        tArr[i] = t;
        tArr[j] = t2;
        t.setIndex(i);
        t2.setIndex(j);
    }

    public final T removeFirstIf(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        synchronized (this) {
            int i = 1;
            try {
                kotlinx.coroutines.internal.ThreadSafeHeapNode threadSafeHeapNodeFirstImpl = firstImpl();
                T t = null;
                if (threadSafeHeapNodeFirstImpl == null) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(2);
                    return null;
                }
                if (predicate.invoke(threadSafeHeapNodeFirstImpl).booleanValue()) {
                    t = (T) removeAtImpl(0);
                }
                kotlin.jvm.internal.InlineMarker.finallyStart(i);
                return t;
            } finally {
                kotlin.jvm.internal.InlineMarker.finallyStart(i);
                kotlin.jvm.internal.InlineMarker.finallyEnd(i);
            }
        }
    }

    public final boolean addLastIf(T node, kotlin.jvm.functions.Function0<java.lang.Boolean> cond) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cond, "cond");
        synchronized (this) {
            try {
                if (cond.invoke().booleanValue()) {
                    addImpl(node);
                    z = true;
                } else {
                    z = false;
                }
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
            } catch (java.lang.Throwable th) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        return z;
    }
}
