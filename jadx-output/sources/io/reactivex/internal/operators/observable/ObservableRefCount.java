package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableRefCount<T> extends io.reactivex.Observable<T> {
    io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection connection;
    final int n;
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.observables.ConnectableObservable<T> source;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    public ObservableRefCount(io.reactivex.observables.ConnectableObservable<T> connectableObservable) {
        this(connectableObservable, 1, 0L, java.util.concurrent.TimeUnit.NANOSECONDS, null);
    }

    public ObservableRefCount(io.reactivex.observables.ConnectableObservable<T> connectableObservable, int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.source = connectableObservable;
        this.n = i;
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection refConnection;
        boolean z;
        synchronized (this) {
            refConnection = this.connection;
            if (refConnection == null) {
                refConnection = new io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection(this);
                this.connection = refConnection;
            }
            long j = refConnection.subscriberCount;
            if (j == 0 && refConnection.timer != null) {
                refConnection.timer.dispose();
            }
            long j2 = j + 1;
            refConnection.subscriberCount = j2;
            z = true;
            if (refConnection.connected || j2 != this.n) {
                z = false;
            } else {
                refConnection.connected = true;
            }
        }
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableRefCount.RefCountObserver(observer, this, refConnection));
        if (z) {
            this.source.connect(refConnection);
        }
    }

    void cancel(io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection refConnection) {
        synchronized (this) {
            io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection refConnection2 = this.connection;
            if (refConnection2 != null && refConnection2 == refConnection) {
                long j = refConnection.subscriberCount - 1;
                refConnection.subscriberCount = j;
                if (j == 0 && refConnection.connected) {
                    if (this.timeout == 0) {
                        timeout(refConnection);
                        return;
                    }
                    io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
                    refConnection.timer = sequentialDisposable;
                    sequentialDisposable.replace(this.scheduler.scheduleDirect(refConnection, this.timeout, this.unit));
                }
            }
        }
    }

    void terminated(io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection refConnection) {
        synchronized (this) {
            io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection refConnection2 = this.connection;
            if (refConnection2 != null && refConnection2 == refConnection) {
                this.connection = null;
                if (refConnection.timer != null) {
                    refConnection.timer.dispose();
                }
            }
            long j = refConnection.subscriberCount - 1;
            refConnection.subscriberCount = j;
            if (j == 0) {
                io.reactivex.observables.ConnectableObservable<T> connectableObservable = this.source;
                if (connectableObservable instanceof io.reactivex.disposables.Disposable) {
                    ((io.reactivex.disposables.Disposable) connectableObservable).dispose();
                } else if (connectableObservable instanceof io.reactivex.internal.disposables.ResettableConnectable) {
                    ((io.reactivex.internal.disposables.ResettableConnectable) connectableObservable).resetIf(refConnection.get());
                }
            }
        }
    }

    void timeout(io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection refConnection) {
        synchronized (this) {
            if (refConnection.subscriberCount == 0 && refConnection == this.connection) {
                this.connection = null;
                io.reactivex.disposables.Disposable disposable = refConnection.get();
                io.reactivex.internal.disposables.DisposableHelper.dispose(refConnection);
                io.reactivex.observables.ConnectableObservable<T> connectableObservable = this.source;
                if (connectableObservable instanceof io.reactivex.disposables.Disposable) {
                    ((io.reactivex.disposables.Disposable) connectableObservable).dispose();
                } else if (connectableObservable instanceof io.reactivex.internal.disposables.ResettableConnectable) {
                    if (disposable == null) {
                        refConnection.disconnectedEarly = true;
                    } else {
                        ((io.reactivex.internal.disposables.ResettableConnectable) connectableObservable).resetIf(disposable);
                    }
                }
            }
        }
    }

    static final class RefConnection extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements java.lang.Runnable, io.reactivex.functions.Consumer<io.reactivex.disposables.Disposable> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final io.reactivex.internal.operators.observable.ObservableRefCount<?> parent;
        long subscriberCount;
        io.reactivex.disposables.Disposable timer;

        RefConnection(io.reactivex.internal.operators.observable.ObservableRefCount<?> observableRefCount) {
            this.parent = observableRefCount;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.timeout(this);
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(io.reactivex.disposables.Disposable disposable) throws java.lang.Exception {
            io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
            synchronized (this.parent) {
                if (this.disconnectedEarly) {
                    ((io.reactivex.internal.disposables.ResettableConnectable) this.parent.source).resetIf(disposable);
                }
            }
        }
    }

    static final class RefCountObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -7419642935409022375L;
        final io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection connection;
        final io.reactivex.Observer<? super T> downstream;
        final io.reactivex.internal.operators.observable.ObservableRefCount<T> parent;
        io.reactivex.disposables.Disposable upstream;

        RefCountObserver(io.reactivex.Observer<? super T> observer, io.reactivex.internal.operators.observable.ObservableRefCount<T> observableRefCount, io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection refConnection) {
            this.downstream = observer;
            this.parent = observableRefCount;
            this.connection = refConnection;
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (compareAndSet(false, true)) {
                this.parent.terminated(this.connection);
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.terminated(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                this.parent.cancel(this.connection);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }
}
