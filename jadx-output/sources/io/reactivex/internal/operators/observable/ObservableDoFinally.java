package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableDoFinally<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Action onFinally;

    public ObservableDoFinally(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Action action) {
        super(observableSource);
        this.onFinally = action;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDoFinally.DoFinallyObserver(observer, this.onFinally));
    }

    static final class DoFinallyObserver<T> extends io.reactivex.internal.observers.BasicIntQueueDisposable<T> implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.Observer<? super T> downstream;
        final io.reactivex.functions.Action onFinally;
        io.reactivex.internal.fuseable.QueueDisposable<T> qd;
        boolean syncFused;
        io.reactivex.disposables.Disposable upstream;

        DoFinallyObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Action action) {
            this.downstream = observer;
            this.onFinally = action;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                if (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable) {
                    this.qd = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            runFinally();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            io.reactivex.internal.fuseable.QueueDisposable<T> queueDisposable = this.qd;
            if (queueDisposable == null || (i & 4) != 0) {
                return 0;
            }
            int iRequestFusion = queueDisposable.requestFusion(i);
            if (iRequestFusion != 0) {
                this.syncFused = iRequestFusion == 1;
            }
            return iRequestFusion;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.qd.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.qd.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
            T tPoll = this.qd.poll();
            if (tPoll == null && this.syncFused) {
                runFinally();
            }
            return tPoll;
        }

        void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }
    }
}
