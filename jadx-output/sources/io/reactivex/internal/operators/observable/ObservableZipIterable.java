package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableZipIterable<T, U, V> extends io.reactivex.Observable<V> {
    final java.lang.Iterable<U> other;
    final io.reactivex.Observable<? extends T> source;
    final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> zipper;

    public ObservableZipIterable(io.reactivex.Observable<? extends T> observable, java.lang.Iterable<U> iterable, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> biFunction) {
        this.source = observable;
        this.other = iterable;
        this.zipper = biFunction;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super V> observer) {
        try {
            java.util.Iterator it = (java.util.Iterator) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.other.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    io.reactivex.internal.disposables.EmptyDisposable.complete(observer);
                } else {
                    this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableZipIterable.ZipIterableObserver(observer, it, this.zipper));
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
            }
        } catch (java.lang.Throwable th2) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            io.reactivex.internal.disposables.EmptyDisposable.error(th2, observer);
        }
    }

    static final class ZipIterableObserver<T, U, V> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        boolean done;
        final io.reactivex.Observer<? super V> downstream;
        final java.util.Iterator<U> iterator;
        io.reactivex.disposables.Disposable upstream;
        final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> zipper;

        ZipIterableObserver(io.reactivex.Observer<? super V> observer, java.util.Iterator<U> it, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.downstream = observer;
            this.iterator = it;
            this.zipper = biFunction;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                try {
                    this.downstream.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.zipper.apply(t, io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.iterator.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (this.iterator.hasNext()) {
                            return;
                        }
                        this.done = true;
                        this.upstream.dispose();
                        this.downstream.onComplete();
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        error(th);
                    }
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    error(th2);
                }
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                error(th3);
            }
        }

        void error(java.lang.Throwable th) {
            this.done = true;
            this.upstream.dispose();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }
    }
}
