package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableRetryPredicate<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long count;
    final io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate;

    public ObservableRetryPredicate(io.reactivex.Observable<T> observable, long j, io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate) {
        super(observable);
        this.predicate = predicate;
        this.count = j;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        new io.reactivex.internal.operators.observable.ObservableRetryPredicate.RepeatObserver(observer, this.count, this.predicate, sequentialDisposable, this.source).subscribeNext();
    }

    static final class RepeatObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.Observer<? super T> downstream;
        final io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate;
        long remaining;
        final io.reactivex.ObservableSource<? extends T> source;
        final io.reactivex.internal.disposables.SequentialDisposable upstream;

        RepeatObserver(io.reactivex.Observer<? super T> observer, long j, io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate, io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable, io.reactivex.ObservableSource<? extends T> observableSource) {
            this.downstream = observer;
            this.upstream = sequentialDisposable;
            this.source = observableSource;
            this.predicate = predicate;
            this.remaining = j;
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
            long j = this.remaining;
            if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (!this.predicate.test(th)) {
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
