package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableSequenceEqualSingle<T> extends io.reactivex.Single<java.lang.Boolean> implements io.reactivex.internal.fuseable.FuseToObservable<java.lang.Boolean> {
    final int bufferSize;
    final io.reactivex.functions.BiPredicate<? super T, ? super T> comparer;
    final io.reactivex.ObservableSource<? extends T> first;
    final io.reactivex.ObservableSource<? extends T> second;

    public ObservableSequenceEqualSingle(io.reactivex.ObservableSource<? extends T> observableSource, io.reactivex.ObservableSource<? extends T> observableSource2, io.reactivex.functions.BiPredicate<? super T, ? super T> biPredicate, int i) {
        this.first = observableSource;
        this.second = observableSource2;
        this.comparer = biPredicate;
        this.bufferSize = i;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
        io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualCoordinator equalCoordinator = new io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualCoordinator(singleObserver, this.bufferSize, this.first, this.second, this.comparer);
        singleObserver.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe();
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public io.reactivex.Observable<java.lang.Boolean> fuseToObservable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableSequenceEqual(this.first, this.second, this.comparer, this.bufferSize));
    }

    static final class EqualCoordinator<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -6178010334400373240L;
        volatile boolean cancelled;
        final io.reactivex.functions.BiPredicate<? super T, ? super T> comparer;
        final io.reactivex.SingleObserver<? super java.lang.Boolean> downstream;
        final io.reactivex.ObservableSource<? extends T> first;
        final io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<T>[] observers;
        final io.reactivex.internal.disposables.ArrayCompositeDisposable resources = new io.reactivex.internal.disposables.ArrayCompositeDisposable(2);
        final io.reactivex.ObservableSource<? extends T> second;
        T v1;
        T v2;

        EqualCoordinator(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver, int i, io.reactivex.ObservableSource<? extends T> observableSource, io.reactivex.ObservableSource<? extends T> observableSource2, io.reactivex.functions.BiPredicate<? super T, ? super T> biPredicate) {
            this.downstream = singleObserver;
            this.first = observableSource;
            this.second = observableSource2;
            this.comparer = biPredicate;
            this.observers = new io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver[]{new io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<>(this, 0, i), new io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<>(this, 1, i)};
        }

        boolean setDisposable(io.reactivex.disposables.Disposable disposable, int i) {
            return this.resources.setResource(i, disposable);
        }

        void subscribe() {
            io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<T>[] equalObserverArr = this.observers;
            this.first.subscribe(equalObserverArr[0]);
            this.second.subscribe(equalObserverArr[1]);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.resources.dispose();
            if (getAndIncrement() == 0) {
                io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<T>[] equalObserverArr = this.observers;
                equalObserverArr[0].queue.clear();
                equalObserverArr[1].queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        void cancel(io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue, io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue2) {
            this.cancelled = true;
            spscLinkedArrayQueue.clear();
            spscLinkedArrayQueue2.clear();
        }

        void drain() {
            java.lang.Throwable th;
            java.lang.Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<T>[] equalObserverArr = this.observers;
            io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<T> equalObserver = equalObserverArr[0];
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = equalObserver.queue;
            io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<T> equalObserver2 = equalObserverArr[1];
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = equalObserver2.queue;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z = equalObserver.done;
                if (z && (th2 = equalObserver.error) != null) {
                    cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.downstream.onError(th2);
                    return;
                }
                boolean z2 = equalObserver2.done;
                if (z2 && (th = equalObserver2.error) != null) {
                    cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.downstream.onError(th);
                    return;
                }
                if (this.v1 == null) {
                    this.v1 = spscLinkedArrayQueue.poll();
                }
                boolean z3 = this.v1 == null;
                if (this.v2 == null) {
                    this.v2 = spscLinkedArrayQueue2.poll();
                }
                T t = this.v2;
                boolean z4 = t == null;
                if (z && z2 && z3 && z4) {
                    this.downstream.onSuccess(true);
                    return;
                }
                if (z && z2 && z3 != z4) {
                    cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.downstream.onSuccess(false);
                    return;
                }
                if (!z3 && !z4) {
                    try {
                        if (!this.comparer.test(this.v1, t)) {
                            cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                            this.downstream.onSuccess(false);
                            return;
                        } else {
                            this.v1 = null;
                            this.v2 = null;
                        }
                    } catch (java.lang.Throwable th3) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                        cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                        this.downstream.onError(th3);
                        return;
                    }
                }
                if (z3 || z4) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            spscLinkedArrayQueue.clear();
            spscLinkedArrayQueue2.clear();
        }
    }

    static final class EqualObserver<T> implements io.reactivex.Observer<T> {
        volatile boolean done;
        java.lang.Throwable error;
        final int index;
        final io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualCoordinator<T> parent;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;

        EqualObserver(io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualCoordinator<T> equalCoordinator, int i, int i2) {
            this.parent = equalCoordinator;
            this.index = i;
            this.queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i2);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.parent.setDisposable(disposable, this.index);
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
    }
}
