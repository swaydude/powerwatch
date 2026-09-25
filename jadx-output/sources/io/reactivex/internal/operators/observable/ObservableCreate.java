package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableCreate<T> extends io.reactivex.Observable<T> {
    final io.reactivex.ObservableOnSubscribe<T> source;

    public ObservableCreate(io.reactivex.ObservableOnSubscribe<T> observableOnSubscribe) {
        this.source = observableOnSubscribe;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableCreate.CreateEmitter createEmitter = new io.reactivex.internal.operators.observable.ObservableCreate.CreateEmitter(observer);
        observer.onSubscribe(createEmitter);
        try {
            this.source.subscribe(createEmitter);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            createEmitter.onError(th);
        }
    }

    static final class CreateEmitter<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.ObservableEmitter<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -3434801548987643227L;
        final io.reactivex.Observer<? super T> observer;

        CreateEmitter(io.reactivex.Observer<? super T> observer) {
            this.observer = observer;
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (isDisposed()) {
                    return;
                }
                this.observer.onNext(t);
            }
        }

        @Override // io.reactivex.Emitter
        public void onError(java.lang.Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.ObservableEmitter
        public boolean tryOnError(java.lang.Throwable th) {
            if (th == null) {
                th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.observer.onError(th);
                return true;
            } finally {
                dispose();
            }
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            if (isDisposed()) {
                return;
            }
            try {
                this.observer.onComplete();
            } finally {
                dispose();
            }
        }

        @Override // io.reactivex.ObservableEmitter
        public void setDisposable(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.set(this, disposable);
        }

        @Override // io.reactivex.ObservableEmitter
        public void setCancellable(io.reactivex.functions.Cancellable cancellable) {
            setDisposable(new io.reactivex.internal.disposables.CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.ObservableEmitter
        public io.reactivex.ObservableEmitter<T> serialize() {
            return new io.reactivex.internal.operators.observable.ObservableCreate.SerializedEmitter(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.ObservableEmitter, io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public java.lang.String toString() {
            return java.lang.String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    static final class SerializedEmitter<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.ObservableEmitter<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        volatile boolean done;
        final io.reactivex.ObservableEmitter<T> emitter;
        final io.reactivex.internal.util.AtomicThrowable error = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(16);

        @Override // io.reactivex.ObservableEmitter
        public io.reactivex.ObservableEmitter<T> serialize() {
            return this;
        }

        SerializedEmitter(io.reactivex.ObservableEmitter<T> observableEmitter) {
            this.emitter = observableEmitter;
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            if (this.emitter.isDisposed() || this.done) {
                return;
            }
            if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.emitter.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
                synchronized (spscLinkedArrayQueue) {
                    spscLinkedArrayQueue.offer(t);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.Emitter
        public void onError(java.lang.Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.ObservableEmitter
        public boolean tryOnError(java.lang.Throwable th) {
            if (!this.emitter.isDisposed() && !this.done) {
                if (th == null) {
                    th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.error.addThrowable(th)) {
                    this.done = true;
                    drain();
                    return true;
                }
            }
            return false;
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            if (this.emitter.isDisposed() || this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        void drainLoop() {
            io.reactivex.ObservableEmitter<T> observableEmitter = this.emitter;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.error;
            int iAddAndGet = 1;
            while (!observableEmitter.isDisposed()) {
                if (atomicThrowable.get() != null) {
                    spscLinkedArrayQueue.clear();
                    observableEmitter.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z = this.done;
                T tPoll = spscLinkedArrayQueue.poll();
                boolean z2 = tPoll == null;
                if (z && z2) {
                    observableEmitter.onComplete();
                    return;
                } else if (!z2) {
                    observableEmitter.onNext(tPoll);
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        @Override // io.reactivex.ObservableEmitter
        public void setDisposable(io.reactivex.disposables.Disposable disposable) {
            this.emitter.setDisposable(disposable);
        }

        @Override // io.reactivex.ObservableEmitter
        public void setCancellable(io.reactivex.functions.Cancellable cancellable) {
            this.emitter.setCancellable(cancellable);
        }

        @Override // io.reactivex.ObservableEmitter, io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.emitter.isDisposed();
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public java.lang.String toString() {
            return this.emitter.toString();
        }
    }
}
