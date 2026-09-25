package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableRetryBiPredicate<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> predicate;

    public ObservableRetryBiPredicate(io.reactivex.Observable<T> observable, io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> biPredicate) {
        super(observable);
        this.predicate = biPredicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        new io.reactivex.internal.operators.observable.ObservableRetryBiPredicate.RetryBiObserver(observer, this.predicate, sequentialDisposable, this.source).subscribeNext();
    }

    static final class RetryBiObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.Observer<? super T> downstream;
        final io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> predicate;
        int retries;
        final io.reactivex.ObservableSource<? extends T> source;
        final io.reactivex.internal.disposables.SequentialDisposable upstream;

        RetryBiObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> biPredicate, io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable, io.reactivex.ObservableSource<? extends T> observableSource) {
            this.downstream = observer;
            this.upstream = sequentialDisposable;
            this.source = observableSource;
            this.predicate = biPredicate;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.upstream.replace(disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            try {
                io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> biPredicate = this.predicate;
                int i = this.retries + 1;
                this.retries = i;
                if (!biPredicate.test(java.lang.Integer.valueOf(i), th)) {
                    this.downstream.onError(th);
                } else {
                    subscribeNext();
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.downstream.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.downstream.onComplete();
        }

        void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.upstream.isDisposed()) {
                    this.source.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }
}
