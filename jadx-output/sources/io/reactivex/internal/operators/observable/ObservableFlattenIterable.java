package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableFlattenIterable<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> mapper;

    public ObservableFlattenIterable(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function) {
        super(observableSource);
        this.mapper = function;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableFlattenIterable.FlattenIterableObserver(observer, this.mapper));
    }

    static final class FlattenIterableObserver<T, R> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super R> downstream;
        final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> mapper;
        io.reactivex.disposables.Disposable upstream;

        FlattenIterableObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function) {
            this.downstream = observer;
            this.mapper = function;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.upstream == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return;
            }
            try {
                java.util.Iterator<? extends R> it = this.mapper.apply(t).iterator();
                io.reactivex.Observer<? super R> observer = this.downstream;
                while (it.hasNext()) {
                    try {
                        try {
                            observer.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            this.upstream.dispose();
                            onError(th);
                            return;
                        }
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        this.upstream.dispose();
                        onError(th2);
                        return;
                    }
                }
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                this.upstream.dispose();
                onError(th3);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.upstream == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.upstream == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return;
            }
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }
    }
}
