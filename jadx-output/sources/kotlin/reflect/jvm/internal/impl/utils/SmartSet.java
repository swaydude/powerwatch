package kotlin.reflect.jvm.internal.impl.utils;

/* JADX INFO: compiled from: SmartSet.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SmartSet<T> extends java.util.AbstractSet<T> {
    public static final kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion Companion = new kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion(null);
    private java.lang.Object data;
    private int size;

    @kotlin.jvm.JvmStatic
    public static final <T> kotlin.reflect.jvm.internal.impl.utils.SmartSet<T> create() {
        return Companion.create();
    }

    /* JADX INFO: compiled from: SmartSet.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final <T> kotlin.reflect.jvm.internal.impl.utils.SmartSet<T> create() {
            return new kotlin.reflect.jvm.internal.impl.utils.SmartSet<>(null);
        }

        @kotlin.jvm.JvmStatic
        public final <T> kotlin.reflect.jvm.internal.impl.utils.SmartSet<T> create(java.util.Collection<? extends T> set) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(set, "set");
            kotlin.reflect.jvm.internal.impl.utils.SmartSet<T> smartSet = new kotlin.reflect.jvm.internal.impl.utils.SmartSet<>(null);
            smartSet.addAll(set);
            return smartSet;
        }
    }

    private SmartSet() {
    }

    public /* synthetic */ SmartSet(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int i) {
        this.size = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<T> iterator() {
        if (size() == 0) {
            return java.util.Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new kotlin.reflect.jvm.internal.impl.utils.SmartSet.SingletonIterator(this.data);
        }
        if (size() < 5) {
            java.lang.Object obj = this.data;
            if (obj != null) {
                return new kotlin.reflect.jvm.internal.impl.utils.SmartSet.ArrayIterator((java.lang.Object[]) obj);
            }
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        java.lang.Object obj2 = this.data;
        if (obj2 != null) {
            return kotlin.jvm.internal.TypeIntrinsics.asMutableSet(obj2).iterator();
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        java.lang.Object obj;
        if (size() == 0) {
            this.data = t;
        } else if (size() == 1) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.data, t)) {
                return false;
            }
            this.data = new java.lang.Object[]{this.data, t};
        } else if (size() < 5) {
            java.lang.Object obj2 = this.data;
            if (obj2 == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            java.lang.Object[] objArr = (java.lang.Object[]) obj2;
            if (kotlin.collections.ArraysKt.contains(objArr, t)) {
                return false;
            }
            if (size() == 4) {
                java.util.LinkedHashSet linkedHashSetLinkedSetOf = kotlin.collections.SetsKt.linkedSetOf(java.util.Arrays.copyOf(objArr, objArr.length));
                linkedHashSetLinkedSetOf.add(t);
                obj = linkedHashSetLinkedSetOf;
            } else {
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, size() + 1);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
                objArrCopyOf[objArrCopyOf.length - 1] = t;
                obj = objArrCopyOf;
            }
            this.data = obj;
        } else {
            java.lang.Object obj3 = this.data;
            if (obj3 == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
            }
            if (!kotlin.jvm.internal.TypeIntrinsics.asMutableSet(obj3).add(t)) {
                return false;
            }
        }
        setSize(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.data = null;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, obj);
        }
        if (size() < 5) {
            java.lang.Object obj2 = this.data;
            if (obj2 != null) {
                return kotlin.collections.ArraysKt.contains((java.lang.Object[]) obj2, obj);
            }
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        java.lang.Object obj3 = this.data;
        if (obj3 != null) {
            return ((java.util.Set) obj3).contains(obj);
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.collections.Set<T>");
    }

    /* JADX INFO: compiled from: SmartSet.kt */
    private static final class SingletonIterator<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMutableIterator {
        private final T element;
        private boolean hasNext = true;

        public SingletonIterator(T t) {
            this.element = t;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.hasNext) {
                this.hasNext = false;
                return this.element;
            }
            throw new java.util.NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.util.Iterator
        public java.lang.Void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: SmartSet.kt */
    private static final class ArrayIterator<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMutableIterator {
        private final java.util.Iterator<T> arrayIterator;

        public ArrayIterator(T[] array) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(array, "array");
            this.arrayIterator = kotlin.jvm.internal.ArrayIteratorKt.iterator(array);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.arrayIterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.arrayIterator.next();
        }

        @Override // java.util.Iterator
        public java.lang.Void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}
