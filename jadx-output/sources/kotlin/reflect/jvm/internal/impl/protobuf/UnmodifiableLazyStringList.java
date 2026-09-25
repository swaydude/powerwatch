package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class UnmodifiableLazyStringList extends java.util.AbstractList<java.lang.String> implements java.util.RandomAccess, kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList {
    private final kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList list;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList getUnmodifiableView() {
        return this;
    }

    public UnmodifiableLazyStringList(kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList lazyStringList) {
        this.list = lazyStringList;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int i) {
        return (java.lang.String) this.list.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public kotlin.reflect.jvm.internal.impl.protobuf.ByteString getByteString(int i) {
        return this.list.getByteString(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public void add(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<java.lang.String> listIterator(int i) {
        return new java.util.ListIterator<java.lang.String>(i) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList.1
            java.util.ListIterator<java.lang.String> iter;
            final /* synthetic */ int val$index;

            {
                this.val$index = i;
                this.iter = kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList.this.list.listIterator(i);
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.iter.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public java.lang.String next() {
                return this.iter.next();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.iter.hasPrevious();
            }

            @Override // java.util.ListIterator
            public java.lang.String previous() {
                return this.iter.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.iter.nextIndex();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.iter.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            public void set(java.lang.String str) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            public void add(java.lang.String str) {
                throw new java.lang.UnsupportedOperationException();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<java.lang.String> iterator() {
        return new java.util.Iterator<java.lang.String>() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList.2
            java.util.Iterator<java.lang.String> iter;

            {
                this.iter = kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList.this.list.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iter.hasNext();
            }

            @Override // java.util.Iterator
            public java.lang.String next() {
                return this.iter.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException();
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public java.util.List<?> getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }
}
