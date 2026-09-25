package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservablePublish<T> extends io.reactivex.observables.ConnectableObservable<T> implements io.reactivex.internal.fuseable.HasUpstreamObservableSource<T> {
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T>> current;
    final io.reactivex.ObservableSource<T> onSubscribe;
    final io.reactivex.ObservableSource<T> source;

    public static <T> io.reactivex.observables.ConnectableObservable<T> create(io.reactivex.ObservableSource<T> observableSource) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return io.reactivex.plugins.RxJavaPlugins.onAssembly((io.reactivex.observables.ConnectableObservable) new io.reactivex.internal.operators.observable.ObservablePublish(new io.reactivex.internal.operators.observable.ObservablePublish.PublishSource(atomicReference), observableSource, atomicReference));
    }

    private ObservablePublish(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<T> observableSource2, java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T>> atomicReference) {
        this.onSubscribe = observableSource;
        this.source = observableSource2;
        this.current = atomicReference;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public io.reactivex.ObservableSource<T> source() {
        return this.source;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.onSubscribe.subscribe(observer);
    }

    @Override // io.reactivex.observables.ConnectableObservable
    public void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
        io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T> publishObserver;
        while (true) {
            publishObserver = this.current.get();
            if (publishObserver != null && !publishObserver.isDisposed()) {
                break;
            }
            io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T> publishObserver2 = new io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<>(this.current);
            if (this.current.compareAndSet(publishObserver, publishObserver2)) {
                publishObserver = publishObserver2;
                break;
            }
        }
        boolean z = !publishObserver.shouldConnect.get() && publishObserver.shouldConnect.compareAndSet(false, true);
        try {
            consumer.accept(publishObserver);
            if (z) {
                this.source.subscribe(publishObserver);
            }
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    static final class PublishObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[] EMPTY = new io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[0];
        static final io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[] TERMINATED = new io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[0];
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T>> current;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> upstream = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T>[]> observers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
        final java.util.concurrent.atomic.AtomicBoolean shouldConnect = new java.util.concurrent.atomic.AtomicBoolean();

        PublishObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T>> atomicReference) {
            this.current = atomicReference;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T>[]> atomicReference = this.observers;
            io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T>[] innerDisposableArr = TERMINATED;
            if (atomicReference.getAndSet(innerDisposableArr) != innerDisposableArr) {
                this.current.compareAndSet(this, null);
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.upstream);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.observers.get() == TERMINATED;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.upstream, disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            for (io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T> innerDisposable : this.observers.get()) {
                innerDisposable.child.onNext(t);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.current.compareAndSet(this, null);
            io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T>[] andSet = this.observers.getAndSet(TERMINATED);
            if (andSet.length != 0) {
                for (io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T> innerDisposable : andSet) {
                    innerDisposable.child.onError(th);
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.current.compareAndSet(this, null);
            for (io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T> innerDisposable : this.observers.getAndSet(TERMINATED)) {
                innerDisposable.child.onComplete();
            }
        }

        boolean add(io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T> innerDisposable) {
            io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T>[] innerDisposableArr;
            io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T>[] innerDisposableArr2;
            do {
                innerDisposableArr = this.observers.get();
                if (innerDisposableArr == TERMINATED) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[length + 1];
                java.lang.System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!this.observers.compareAndSet(innerDisposableArr, innerDisposableArr2));
            return true;
        }

        void remove(io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T> innerDisposable) {
            io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T>[] innerDisposableArr;
            io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T>[] innerDisposableArr2;
            do {
                innerDisposableArr = this.observers.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (innerDisposableArr[i2].equals(innerDisposable)) {
                        i = i2;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr2 = EMPTY;
                } else {
                    io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T>[] innerDisposableArr3 = new io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[length - 1];
                    java.lang.System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i);
                    java.lang.System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr3, i, (length - i) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!this.observers.compareAndSet(innerDisposableArr, innerDisposableArr2));
        }
    }

    static final class InnerDisposable<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -1100270633763673112L;
        final io.reactivex.Observer<? super T> child;

        InnerDisposable(io.reactivex.Observer<? super T> observer) {
            this.child = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == this;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            java.lang.Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            ((io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver) andSet).remove(this);
        }

        void setParent(io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T> publishObserver) {
            if (compareAndSet(null, publishObserver)) {
                return;
            }
            publishObserver.remove(this);
        }
    }

    static final class PublishSource<T> implements io.reactivex.ObservableSource<T> {
        private final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T>> curr;

        PublishSource(java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T>> atomicReference) {
            this.curr = atomicReference;
        }

        @Override // io.reactivex.ObservableSource
        public void subscribe(io.reactivex.Observer<? super T> observer) {
            io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable innerDisposable = new io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable(observer);
            observer.onSubscribe(innerDisposable);
            while (true) {
                io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T> publishObserver = this.curr.get();
                if (publishObserver == null || publishObserver.isDisposed()) {
                    io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T> publishObserver2 = new io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<>(this.curr);
                    if (this.curr.compareAndSet(publishObserver, publishObserver2)) {
                        publishObserver = publishObserver2;
                    } else {
                        continue;
                    }
                }
                if (publishObserver.add(innerDisposable)) {
                    innerDisposable.setParent(publishObserver);
                    return;
                }
            }
        }
    }
}
