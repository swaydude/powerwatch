package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeFlatMapIterableObservable<T, R> extends io.reactivex.Observable<R> {
    final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> mapper;
    final io.reactivex.MaybeSource<T> source;

    public MaybeFlatMapIterableObservable(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function) {
        this.source = maybeSource;
        this.mapper = function;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeFlatMapIterableObservable.FlatMapIterableObserver(observer, this.mapper));
    }

    static final class FlatMapIterableObserver<T, R> extends io.reactivex.internal.observers.BasicQueueDisposable<R> implements io.reactivex.MaybeObserver<T> {
        volatile boolean cancelled;
        final io.reactivex.Observer<? super R> downstream;
        volatile java.util.Iterator<? extends R> it;
        final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> mapper;
        boolean outputFused;
        io.reactivex.disposables.Disposable upstream;

        FlatMapIterableObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function) {
            this.downstream = observer;
            this.mapper = function;
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            io.reactivex.Observer<? super R> observer = this.downstream;
            try {
                java.util.Iterator<? extends R> it = this.mapper.apply(t).iterator();
                if (!it.hasNext()) {
                    observer.onComplete();
                    return;
                }
                this.it = it;
                if (this.outputFused) {
                    observer.onNext(null);
                    observer.onComplete();
                    return;
                }
                while (!this.cancelled) {
                    try {
                        observer.onNext(it.next());
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                observer.onComplete();
                                return;
                            }
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            observer.onError(th);
                            return;
                        }
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        observer.onError(th2);
                        return;
                    }
                }
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                observer.onError(th3);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.it = null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.it == null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public R poll() throws java.lang.Exception {
            java.util.Iterator<? extends R> it = this.it;
            if (it == null) {
                return null;
            }
            R r = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.it = null;
            }
            return r;
        }
    }
}
