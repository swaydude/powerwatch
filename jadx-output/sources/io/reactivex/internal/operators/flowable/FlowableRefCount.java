package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableRefCount<T> extends io.reactivex.Flowable<T> {
    io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection connection;
    final int n;
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.flowables.ConnectableFlowable<T> source;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    public FlowableRefCount(io.reactivex.flowables.ConnectableFlowable<T> connectableFlowable) {
        this(connectableFlowable, 1, 0L, java.util.concurrent.TimeUnit.NANOSECONDS, null);
    }

    public FlowableRefCount(io.reactivex.flowables.ConnectableFlowable<T> connectableFlowable, int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.source = connectableFlowable;
        this.n = i;
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection refConnection;
        boolean z;
        synchronized (this) {
            refConnection = this.connection;
            if (refConnection == null) {
                refConnection = new io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection(this);
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
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableRefCount.RefCountSubscriber(subscriber, this, refConnection));
        if (z) {
            this.source.connect(refConnection);
        }
    }

    void cancel(io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection refConnection) {
        synchronized (this) {
            io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection refConnection2 = this.connection;
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

    void terminated(io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection refConnection) {
        synchronized (this) {
            io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection refConnection2 = this.connection;
            if (refConnection2 != null && refConnection2 == refConnection) {
                this.connection = null;
                if (refConnection.timer != null) {
                    refConnection.timer.dispose();
                }
            }
            long j = refConnection.subscriberCount - 1;
            refConnection.subscriberCount = j;
            if (j == 0) {
                io.reactivex.flowables.ConnectableFlowable<T> connectableFlowable = this.source;
                if (connectableFlowable instanceof io.reactivex.disposables.Disposable) {
                    ((io.reactivex.disposables.Disposable) connectableFlowable).dispose();
                } else if (connectableFlowable instanceof io.reactivex.internal.disposables.ResettableConnectable) {
                    ((io.reactivex.internal.disposables.ResettableConnectable) connectableFlowable).resetIf(refConnection.get());
                }
            }
        }
    }

    void timeout(io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection refConnection) {
        synchronized (this) {
            if (refConnection.subscriberCount == 0 && refConnection == this.connection) {
                this.connection = null;
                io.reactivex.disposables.Disposable disposable = refConnection.get();
                io.reactivex.internal.disposables.DisposableHelper.dispose(refConnection);
                io.reactivex.flowables.ConnectableFlowable<T> connectableFlowable = this.source;
                if (connectableFlowable instanceof io.reactivex.disposables.Disposable) {
                    ((io.reactivex.disposables.Disposable) connectableFlowable).dispose();
                } else if (connectableFlowable instanceof io.reactivex.internal.disposables.ResettableConnectable) {
                    if (disposable == null) {
                        refConnection.disconnectedEarly = true;
                    } else {
                        ((io.reactivex.internal.disposables.ResettableConnectable) connectableFlowable).resetIf(disposable);
                    }
                }
            }
        }
    }

    static final class RefConnection extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements java.lang.Runnable, io.reactivex.functions.Consumer<io.reactivex.disposables.Disposable> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final io.reactivex.internal.operators.flowable.FlowableRefCount<?> parent;
        long subscriberCount;
        io.reactivex.disposables.Disposable timer;

        RefConnection(io.reactivex.internal.operators.flowable.FlowableRefCount<?> flowableRefCount) {
            this.parent = flowableRefCount;
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

    static final class RefCountSubscriber<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -7419642935409022375L;
        final io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection connection;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final io.reactivex.internal.operators.flowable.FlowableRefCount<T> parent;
        org.reactivestreams.Subscription upstream;

        RefCountSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.internal.operators.flowable.FlowableRefCount<T> flowableRefCount, io.reactivex.internal.operators.flowable.FlowableRefCount.RefConnection refConnection) {
            this.downstream = subscriber;
            this.parent = flowableRefCount;
            this.connection = refConnection;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (compareAndSet(false, true)) {
                this.parent.terminated(this.connection);
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.terminated(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.upstream.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.cancel();
            if (compareAndSet(false, true)) {
                this.parent.cancel(this.connection);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }
    }
}
