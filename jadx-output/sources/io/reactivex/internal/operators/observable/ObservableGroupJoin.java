package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<TLeft, R> {
    final io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> leftEnd;
    final io.reactivex.ObservableSource<? extends TRight> other;
    final io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Observable<TRight>, ? extends R> resultSelector;
    final io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> rightEnd;

    interface JoinSupport {
        void innerClose(boolean z, io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver);

        void innerCloseError(java.lang.Throwable th);

        void innerComplete(io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver leftRightObserver);

        void innerError(java.lang.Throwable th);

        void innerValue(boolean z, java.lang.Object obj);
    }

    public ObservableGroupJoin(io.reactivex.ObservableSource<TLeft> observableSource, io.reactivex.ObservableSource<? extends TRight> observableSource2, io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> function, io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> function2, io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Observable<TRight>, ? extends R> biFunction) {
        super(observableSource);
        this.other = observableSource2;
        this.leftEnd = function;
        this.rightEnd = function2;
        this.resultSelector = biFunction;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> observer) {
        io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable groupJoinDisposable = new io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable(observer, this.leftEnd, this.rightEnd, this.resultSelector);
        observer.onSubscribe(groupJoinDisposable);
        io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver leftRightObserver = new io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver(groupJoinDisposable, true);
        groupJoinDisposable.disposables.add(leftRightObserver);
        io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver leftRightObserver2 = new io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver(groupJoinDisposable, false);
        groupJoinDisposable.disposables.add(leftRightObserver2);
        this.source.subscribe(leftRightObserver);
        this.other.subscribe(leftRightObserver2);
    }

    static final class GroupJoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport {
        private static final long serialVersionUID = -6071216598687999801L;
        volatile boolean cancelled;
        final io.reactivex.Observer<? super R> downstream;
        final io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> leftEnd;
        int leftIndex;
        final io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Observable<TRight>, ? extends R> resultSelector;
        final io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> rightEnd;
        int rightIndex;
        static final java.lang.Integer LEFT_VALUE = 1;
        static final java.lang.Integer RIGHT_VALUE = 2;
        static final java.lang.Integer LEFT_CLOSE = 3;
        static final java.lang.Integer RIGHT_CLOSE = 4;
        final io.reactivex.disposables.CompositeDisposable disposables = new io.reactivex.disposables.CompositeDisposable();
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.Observable.bufferSize());
        final java.util.Map<java.lang.Integer, io.reactivex.subjects.UnicastSubject<TRight>> lefts = new java.util.LinkedHashMap();
        final java.util.Map<java.lang.Integer, TRight> rights = new java.util.LinkedHashMap();
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> error = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicInteger active = new java.util.concurrent.atomic.AtomicInteger(2);

        GroupJoinDisposable(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> function, io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> function2, io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Observable<TRight>, ? extends R> biFunction) {
            this.downstream = observer;
            this.leftEnd = function;
            this.rightEnd = function2;
            this.resultSelector = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        void cancelAll() {
            this.disposables.dispose();
        }

        void errorAll(io.reactivex.Observer<?> observer) {
            java.lang.Throwable thTerminate = io.reactivex.internal.util.ExceptionHelper.terminate(this.error);
            java.util.Iterator<io.reactivex.subjects.UnicastSubject<TRight>> it = this.lefts.values().iterator();
            while (it.hasNext()) {
                it.next().onError(thTerminate);
            }
            this.lefts.clear();
            this.rights.clear();
            observer.onError(thTerminate);
        }

        void fail(java.lang.Throwable th, io.reactivex.Observer<?> observer, io.reactivex.internal.queue.SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.util.ExceptionHelper.addThrowable(this.error, th);
            spscLinkedArrayQueue.clear();
            cancelAll();
            errorAll(observer);
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.queue;
            io.reactivex.Observer<? super R> observer = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (this.error.get() != null) {
                    spscLinkedArrayQueue.clear();
                    cancelAll();
                    errorAll(observer);
                    return;
                }
                boolean z = this.active.get() == 0;
                java.lang.Integer num = (java.lang.Integer) spscLinkedArrayQueue.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    java.util.Iterator<io.reactivex.subjects.UnicastSubject<TRight>> it = this.lefts.values().iterator();
                    while (it.hasNext()) {
                        it.next().onComplete();
                    }
                    this.lefts.clear();
                    this.rights.clear();
                    this.disposables.dispose();
                    observer.onComplete();
                    return;
                }
                if (!z2) {
                    java.lang.Object objPoll = spscLinkedArrayQueue.poll();
                    if (num == LEFT_VALUE) {
                        io.reactivex.subjects.UnicastSubject unicastSubjectCreate = io.reactivex.subjects.UnicastSubject.create();
                        int i = this.leftIndex;
                        this.leftIndex = i + 1;
                        this.lefts.put(java.lang.Integer.valueOf(i), (io.reactivex.subjects.UnicastSubject<TRight>) unicastSubjectCreate);
                        try {
                            io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.leftEnd.apply(objPoll), "The leftEnd returned a null ObservableSource");
                            io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver = new io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver(this, true, i);
                            this.disposables.add(leftRightEndObserver);
                            observableSource.subscribe(leftRightEndObserver);
                            if (this.error.get() != null) {
                                spscLinkedArrayQueue.clear();
                                cancelAll();
                                errorAll(observer);
                                return;
                            } else {
                                try {
                                    observer.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.resultSelector.apply(objPoll, unicastSubjectCreate), "The resultSelector returned a null value"));
                                    java.util.Iterator<TRight> it2 = this.rights.values().iterator();
                                    while (it2.hasNext()) {
                                        unicastSubjectCreate.onNext(it2.next());
                                    }
                                } catch (java.lang.Throwable th) {
                                    fail(th, observer, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            fail(th2, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == RIGHT_VALUE) {
                        int i2 = this.rightIndex;
                        this.rightIndex = i2 + 1;
                        this.rights.put(java.lang.Integer.valueOf(i2), (TRight) objPoll);
                        try {
                            io.reactivex.ObservableSource observableSource2 = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.rightEnd.apply(objPoll), "The rightEnd returned a null ObservableSource");
                            io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver2 = new io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver(this, false, i2);
                            this.disposables.add(leftRightEndObserver2);
                            observableSource2.subscribe(leftRightEndObserver2);
                            if (this.error.get() != null) {
                                spscLinkedArrayQueue.clear();
                                cancelAll();
                                errorAll(observer);
                                return;
                            } else {
                                java.util.Iterator<io.reactivex.subjects.UnicastSubject<TRight>> it3 = this.lefts.values().iterator();
                                while (it3.hasNext()) {
                                    it3.next().onNext(objPoll);
                                }
                            }
                        } catch (java.lang.Throwable th3) {
                            fail(th3, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == LEFT_CLOSE) {
                        io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver3 = (io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver) objPoll;
                        io.reactivex.subjects.UnicastSubject<TRight> unicastSubjectRemove = this.lefts.remove(java.lang.Integer.valueOf(leftRightEndObserver3.index));
                        this.disposables.remove(leftRightEndObserver3);
                        if (unicastSubjectRemove != null) {
                            unicastSubjectRemove.onComplete();
                        }
                    } else if (num == RIGHT_CLOSE) {
                        io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver4 = (io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver) objPoll;
                        this.rights.remove(java.lang.Integer.valueOf(leftRightEndObserver4.index));
                        this.disposables.remove(leftRightEndObserver4);
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public void innerError(java.lang.Throwable th) {
            if (io.reactivex.internal.util.ExceptionHelper.addThrowable(this.error, th)) {
                this.active.decrementAndGet();
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public void innerComplete(io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver leftRightObserver) {
            this.disposables.delete(leftRightObserver);
            this.active.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public void innerValue(boolean z, java.lang.Object obj) {
            synchronized (this) {
                this.queue.offer(z ? LEFT_VALUE : RIGHT_VALUE, obj);
            }
            drain();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public void innerClose(boolean z, io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                this.queue.offer(z ? LEFT_CLOSE : RIGHT_CLOSE, leftRightEndObserver);
            }
            drain();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public void innerCloseError(java.lang.Throwable th) {
            if (io.reactivex.internal.util.ExceptionHelper.addThrowable(this.error, th)) {
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }

    static final class LeftRightObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final boolean isLeft;
        final io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport parent;

        LeftRightObserver(io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport joinSupport, boolean z) {
            this.parent = joinSupport;
            this.isLeft = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object obj) {
            this.parent.innerValue(this.isLeft, obj);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.parent.innerError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.parent.innerComplete(this);
        }
    }

    static final class LeftRightEndObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final int index;
        final boolean isLeft;
        final io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport parent;

        LeftRightEndObserver(io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport joinSupport, boolean z, int i) {
            this.parent = joinSupport;
            this.isLeft = z;
            this.index = i;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object obj) {
            if (io.reactivex.internal.disposables.DisposableHelper.dispose(this)) {
                this.parent.innerClose(this.isLeft, this);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.parent.innerCloseError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.parent.innerClose(this.isLeft, this);
        }
    }
}
