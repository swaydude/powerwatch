package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableMergeWithSingle<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.SingleSource<? extends T> other;

    public ObservableMergeWithSingle(io.reactivex.Observable<T> observable, io.reactivex.SingleSource<? extends T> singleSource) {
        super(observable);
        this.other = singleSource;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableMergeWithSingle.MergeWithObserver mergeWithObserver = new io.reactivex.internal.operators.observable.ObservableMergeWithSingle.MergeWithObserver(observer);
        observer.onSubscribe(mergeWithObserver);
        this.source.subscribe(mergeWithObserver);
        this.other.subscribe(mergeWithObserver.otherObserver);
    }

    static final class MergeWithObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean disposed;
        final io.reactivex.Observer<? super T> downstream;
        volatile boolean mainDone;
        volatile int otherState;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<T> queue;
        T singleItem;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> mainDisposable = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.internal.operators.observable.ObservableMergeWithSingle.MergeWithObserver.OtherObserver<T> otherObserver = new io.reactivex.internal.operators.observable.ObservableMergeWithSingle.MergeWithObserver.OtherObserver<>(this);
        final io.reactivex.internal.util.AtomicThrowable error = new io.reactivex.internal.util.AtomicThrowable();

        MergeWithObserver(io.reactivex.Observer<? super T> observer) {
            this.downstream = observer;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.mainDisposable, disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.error.addThrowable(th)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.mainDisposable);
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.mainDone = true;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.mainDisposable.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.mainDisposable);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.otherObserver);
            if (getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }

        void otherSuccess(T t) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t);
                this.otherState = 2;
            } else {
                this.singleItem = t;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        void otherError(java.lang.Throwable th) {
            if (this.error.addThrowable(th)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.mainDisposable);
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        io.reactivex.internal.fuseable.SimplePlainQueue<T> getOrCreateQueue() {
            io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                return simplePlainQueue;
            }
            io.reactivex.internal.queue.SpscLinkedArrayQueue spscLinkedArrayQueue = new io.reactivex.internal.queue.SpscLinkedArrayQueue(io.reactivex.Observable.bufferSize());
            this.queue = spscLinkedArrayQueue;
            return spscLinkedArrayQueue;
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        void drainLoop() {
            io.reactivex.Observer<? super T> observer = this.downstream;
            int iAddAndGet = 1;
            while (!this.disposed) {
                if (this.error.get() != null) {
                    this.singleItem = null;
                    this.queue = null;
                    observer.onError(this.error.terminate());
                    return;
                }
                int i = this.otherState;
                if (i == 1) {
                    T t = this.singleItem;
                    this.singleItem = null;
                    this.otherState = 2;
                    observer.onNext(t);
                    i = 2;
                }
                boolean z = this.mainDone;
                io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.queue;
                android.R.color colorVarPoll = simplePlainQueue != null ? simplePlainQueue.poll() : null;
                boolean z2 = colorVarPoll == null;
                if (z && z2 && i == 2) {
                    this.queue = null;
                    observer.onComplete();
                    return;
                } else if (!z2) {
                    observer.onNext(colorVarPoll);
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            this.singleItem = null;
            this.queue = null;
        }

        static final class OtherObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final io.reactivex.internal.operators.observable.ObservableMergeWithSingle.MergeWithObserver<T> parent;

            OtherObserver(io.reactivex.internal.operators.observable.ObservableMergeWithSingle.MergeWithObserver<T> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t) {
                this.parent.otherSuccess(t);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(java.lang.Throwable th) {
                this.parent.otherError(th);
            }
        }
    }
}
