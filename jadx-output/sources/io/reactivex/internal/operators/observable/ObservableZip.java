package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableZip<T, R> extends io.reactivex.Observable<R> {
    final int bufferSize;
    final boolean delayError;
    final io.reactivex.ObservableSource<? extends T>[] sources;
    final java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> sourcesIterable;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

    public ObservableZip(io.reactivex.ObservableSource<? extends T>[] observableSourceArr, java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> iterable, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function, int i, boolean z) {
        this.sources = observableSourceArr;
        this.sourcesIterable = iterable;
        this.zipper = function;
        this.bufferSize = i;
        this.delayError = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super R> observer) {
        int length;
        io.reactivex.ObservableSource<? extends T>[] observableSourceArr = this.sources;
        if (observableSourceArr == null) {
            observableSourceArr = new io.reactivex.Observable[8];
            length = 0;
            for (io.reactivex.ObservableSource<? extends T> observableSource : this.sourcesIterable) {
                if (length == observableSourceArr.length) {
                    io.reactivex.ObservableSource<? extends T>[] observableSourceArr2 = new io.reactivex.ObservableSource[(length >> 2) + length];
                    java.lang.System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                    observableSourceArr = observableSourceArr2;
                }
                observableSourceArr[length] = observableSource;
                length++;
            }
        } else {
            length = observableSourceArr.length;
        }
        if (length == 0) {
            io.reactivex.internal.disposables.EmptyDisposable.complete(observer);
        } else {
            new io.reactivex.internal.operators.observable.ObservableZip.ZipCoordinator(observer, this.zipper, length, this.delayError).subscribe(observableSourceArr, this.bufferSize);
        }
    }

    static final class ZipCoordinator<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 2983708048395377667L;
        volatile boolean cancelled;
        final boolean delayError;
        final io.reactivex.Observer<? super R> downstream;
        final io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<T, R>[] observers;
        final T[] row;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

        ZipCoordinator(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function, int i, boolean z) {
            this.downstream = observer;
            this.zipper = function;
            this.observers = new io.reactivex.internal.operators.observable.ObservableZip.ZipObserver[i];
            this.row = (T[]) new java.lang.Object[i];
            this.delayError = z;
        }

        public void subscribe(io.reactivex.ObservableSource<? extends T>[] observableSourceArr, int i) {
            io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<T, R>[] zipObserverArr = this.observers;
            int length = zipObserverArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                zipObserverArr[i2] = new io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<>(this, i);
            }
            lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.cancelled; i3++) {
                observableSourceArr[i3].subscribe(zipObserverArr[i3]);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelSources();
            if (getAndIncrement() == 0) {
                clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        void cancel() {
            clear();
            cancelSources();
        }

        void cancelSources() {
            for (io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<T, R> zipObserver : this.observers) {
                zipObserver.dispose();
            }
        }

        void clear() {
            for (io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<T, R> zipObserver : this.observers) {
                zipObserver.queue.clear();
            }
        }

        public void drain() {
            java.lang.Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<T, R>[] zipObserverArr = this.observers;
            io.reactivex.Observer<? super R> observer = this.downstream;
            T[] tArr = this.row;
            boolean z = this.delayError;
            int iAddAndGet = 1;
            while (true) {
                int i = 0;
                int i2 = 0;
                for (io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<T, R> zipObserver : zipObserverArr) {
                    if (tArr[i2] == null) {
                        boolean z2 = zipObserver.done;
                        T tPoll = zipObserver.queue.poll();
                        boolean z3 = tPoll == null;
                        if (checkTerminated(z2, z3, observer, z, zipObserver)) {
                            return;
                        }
                        if (z3) {
                            i++;
                        } else {
                            tArr[i2] = tPoll;
                        }
                    } else if (zipObserver.done && !z && (th = zipObserver.error) != null) {
                        this.cancelled = true;
                        cancel();
                        observer.onError(th);
                        return;
                    }
                    i2++;
                }
                if (i == 0) {
                    try {
                        observer.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.zipper.apply(tArr.clone()), "The zipper returned a null value"));
                        java.util.Arrays.fill(tArr, (java.lang.Object) null);
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        cancel();
                        observer.onError(th2);
                        return;
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        boolean checkTerminated(boolean z, boolean z2, io.reactivex.Observer<? super R> observer, boolean z3, io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<?, ?> zipObserver) {
            if (this.cancelled) {
                cancel();
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                java.lang.Throwable th = zipObserver.error;
                this.cancelled = true;
                cancel();
                if (th != null) {
                    observer.onError(th);
                } else {
                    observer.onComplete();
                }
                return true;
            }
            java.lang.Throwable th2 = zipObserver.error;
            if (th2 != null) {
                this.cancelled = true;
                cancel();
                observer.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            this.cancelled = true;
            cancel();
            observer.onComplete();
            return true;
        }
    }

    static final class ZipObserver<T, R> implements io.reactivex.Observer<T> {
        volatile boolean done;
        java.lang.Throwable error;
        final io.reactivex.internal.operators.observable.ObservableZip.ZipCoordinator<T, R> parent;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> upstream = new java.util.concurrent.atomic.AtomicReference<>();

        ZipObserver(io.reactivex.internal.operators.observable.ObservableZip.ZipCoordinator<T, R> zipCoordinator, int i) {
            this.parent = zipCoordinator;
            this.queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.upstream, disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.queue.offer(t);
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.upstream);
        }
    }
}
