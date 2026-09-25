package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableRepeat<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long count;

    public ObservableRepeat(io.reactivex.Observable<T> observable, long j) {
        super(observable);
        this.count = j;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        long j = this.count;
        long j2 = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
            j2 = j - 1;
        }
        new io.reactivex.internal.operators.observable.ObservableRepeat.RepeatObserver(observer, j2, sequentialDisposable, this.source).subscribeNext();
    }

    static final class RepeatObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.Observer<? super T> downstream;
        long remaining;
        final io.reactivex.internal.disposables.SequentialDisposable sd;
        final io.reactivex.ObservableSource<? extends T> source;

        RepeatObserver(io.reactivex.Observer<? super T> observer, long j, io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable, io.reactivex.ObservableSource<? extends T> observableSource) {
            this.downstream = observer;
            this.sd = sequentialDisposable;
            this.source = observableSource;
            this.remaining = j;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.sd.replace(disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            long j = this.remaining;
            if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.sd.isDisposed()) {
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
