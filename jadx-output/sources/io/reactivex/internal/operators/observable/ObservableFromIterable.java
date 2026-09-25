package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableFromIterable<T> extends io.reactivex.Observable<T> {
    final java.lang.Iterable<? extends T> source;

    public ObservableFromIterable(java.lang.Iterable<? extends T> iterable) {
        this.source = iterable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        try {
            java.util.Iterator<? extends T> it = this.source.iterator();
            try {
                if (!it.hasNext()) {
                    io.reactivex.internal.disposables.EmptyDisposable.complete(observer);
                    return;
                }
                io.reactivex.internal.operators.observable.ObservableFromIterable.FromIterableDisposable fromIterableDisposable = new io.reactivex.internal.operators.observable.ObservableFromIterable.FromIterableDisposable(observer, it);
                observer.onSubscribe(fromIterableDisposable);
                if (fromIterableDisposable.fusionMode) {
                    return;
                }
                fromIterableDisposable.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
            }
        } catch (java.lang.Throwable th2) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            io.reactivex.internal.disposables.EmptyDisposable.error(th2, observer);
        }
    }

    static final class FromIterableDisposable<T> extends io.reactivex.internal.observers.BasicQueueDisposable<T> {
        boolean checkNext;
        volatile boolean disposed;
        boolean done;
        final io.reactivex.Observer<? super T> downstream;
        boolean fusionMode;
        final java.util.Iterator<? extends T> it;

        FromIterableDisposable(io.reactivex.Observer<? super T> observer, java.util.Iterator<? extends T> it) {
            this.downstream = observer;
            this.it = it;
        }

        void run() {
            while (!isDisposed()) {
                try {
                    this.downstream.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.it.next(), "The iterator returned a null value"));
                    if (isDisposed()) {
                        return;
                    }
                    try {
                        if (!this.it.hasNext()) {
                            if (isDisposed()) {
                                return;
                            }
                            this.downstream.onComplete();
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.downstream.onError(th);
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    this.downstream.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.fusionMode = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() {
            if (this.done) {
                return null;
            }
            if (this.checkNext) {
                if (!this.it.hasNext()) {
                    this.done = true;
                    return null;
                }
            } else {
                this.checkNext = true;
            }
            return (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.it.next(), "The iterator returned a null value");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.done;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.done = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }
    }
}
