package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleInternalHelper {
    private SingleInternalHelper() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    enum NoSuchElementCallable implements java.util.concurrent.Callable<java.util.NoSuchElementException> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public java.util.NoSuchElementException call() throws java.lang.Exception {
            return new java.util.NoSuchElementException();
        }
    }

    public static <T> java.util.concurrent.Callable<java.util.NoSuchElementException> emptyThrower() {
        return io.reactivex.internal.operators.single.SingleInternalHelper.NoSuchElementCallable.INSTANCE;
    }

    enum ToFlowable implements io.reactivex.functions.Function<io.reactivex.SingleSource, org.reactivestreams.Publisher> {
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public org.reactivestreams.Publisher apply(io.reactivex.SingleSource singleSource) {
            return new io.reactivex.internal.operators.single.SingleToFlowable(singleSource);
        }
    }

    public static <T> io.reactivex.functions.Function<io.reactivex.SingleSource<? extends T>, org.reactivestreams.Publisher<? extends T>> toFlowable() {
        return io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowable.INSTANCE;
    }

    static final class ToFlowableIterator<T> implements java.util.Iterator<io.reactivex.Flowable<T>> {
        private final java.util.Iterator<? extends io.reactivex.SingleSource<? extends T>> sit;

        ToFlowableIterator(java.util.Iterator<? extends io.reactivex.SingleSource<? extends T>> it) {
            this.sit = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.sit.hasNext();
        }

        @Override // java.util.Iterator
        public io.reactivex.Flowable<T> next() {
            return new io.reactivex.internal.operators.single.SingleToFlowable(this.sit.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    static final class ToFlowableIterable<T> implements java.lang.Iterable<io.reactivex.Flowable<T>> {
        private final java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> sources;

        ToFlowableIterable(java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> iterable) {
            this.sources = iterable;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<io.reactivex.Flowable<T>> iterator() {
            return new io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowableIterator(this.sources.iterator());
        }
    }

    public static <T> java.lang.Iterable<? extends io.reactivex.Flowable<T>> iterableToFlowable(java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> iterable) {
        return new io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowableIterable(iterable);
    }

    enum ToObservable implements io.reactivex.functions.Function<io.reactivex.SingleSource, io.reactivex.Observable> {
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public io.reactivex.Observable apply(io.reactivex.SingleSource singleSource) {
            return new io.reactivex.internal.operators.single.SingleToObservable(singleSource);
        }
    }

    public static <T> io.reactivex.functions.Function<io.reactivex.SingleSource<? extends T>, io.reactivex.Observable<? extends T>> toObservable() {
        return io.reactivex.internal.operators.single.SingleInternalHelper.ToObservable.INSTANCE;
    }
}
