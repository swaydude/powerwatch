package kotlin.reflect.jvm.internal.pcollections;

/* JADX INFO: loaded from: classes2.dex */
final class ConsPStack<E> implements java.lang.Iterable<E> {
    private static final kotlin.reflect.jvm.internal.pcollections.ConsPStack<java.lang.Object> EMPTY = new kotlin.reflect.jvm.internal.pcollections.ConsPStack<>();
    final E first;
    final kotlin.reflect.jvm.internal.pcollections.ConsPStack<E> rest;
    private final int size;

    public static <E> kotlin.reflect.jvm.internal.pcollections.ConsPStack<E> empty() {
        return (kotlin.reflect.jvm.internal.pcollections.ConsPStack<E>) EMPTY;
    }

    private ConsPStack() {
        this.size = 0;
        this.first = null;
        this.rest = null;
    }

    private ConsPStack(E e, kotlin.reflect.jvm.internal.pcollections.ConsPStack<E> consPStack) {
        this.first = e;
        this.rest = consPStack;
        this.size = consPStack.size + 1;
    }

    public E get(int i) {
        if (i < 0 || i > this.size) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        try {
            return iterator(i).next();
        } catch (java.util.NoSuchElementException unused) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i);
        }
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return iterator(0);
    }

    public int size() {
        return this.size;
    }

    private java.util.Iterator<E> iterator(int i) {
        return new kotlin.reflect.jvm.internal.pcollections.ConsPStack.Itr(subList(i));
    }

    private static class Itr<E> implements java.util.Iterator<E> {
        private kotlin.reflect.jvm.internal.pcollections.ConsPStack<E> next;

        public Itr(kotlin.reflect.jvm.internal.pcollections.ConsPStack<E> consPStack) {
            this.next = consPStack;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return ((kotlin.reflect.jvm.internal.pcollections.ConsPStack) this.next).size > 0;
        }

        @Override // java.util.Iterator
        public E next() {
            E e = this.next.first;
            this.next = this.next.rest;
            return e;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public kotlin.reflect.jvm.internal.pcollections.ConsPStack<E> plus(E e) {
        return new kotlin.reflect.jvm.internal.pcollections.ConsPStack<>(e, this);
    }

    private kotlin.reflect.jvm.internal.pcollections.ConsPStack<E> minus(java.lang.Object obj) {
        if (this.size == 0) {
            return this;
        }
        if (this.first.equals(obj)) {
            return this.rest;
        }
        kotlin.reflect.jvm.internal.pcollections.ConsPStack<E> consPStackMinus = this.rest.minus(obj);
        return consPStackMinus == this.rest ? this : new kotlin.reflect.jvm.internal.pcollections.ConsPStack<>(this.first, consPStackMinus);
    }

    public kotlin.reflect.jvm.internal.pcollections.ConsPStack<E> minus(int i) {
        return minus(get(i));
    }

    private kotlin.reflect.jvm.internal.pcollections.ConsPStack<E> subList(int i) {
        if (i < 0 || i > this.size) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return i == 0 ? this : this.rest.subList(i - 1);
    }
}
