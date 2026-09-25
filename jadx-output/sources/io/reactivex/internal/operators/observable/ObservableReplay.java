package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableReplay<T> extends io.reactivex.observables.ConnectableObservable<T> implements io.reactivex.internal.fuseable.HasUpstreamObservableSource<T>, io.reactivex.internal.disposables.ResettableConnectable {
    static final io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier DEFAULT_UNBOUNDED_FACTORY = new io.reactivex.internal.operators.observable.ObservableReplay.UnBoundedFactory();
    final io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> bufferFactory;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T>> current;
    final io.reactivex.ObservableSource<T> onSubscribe;
    final io.reactivex.ObservableSource<T> source;

    interface BufferSupplier<T> {
        io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> call();
    }

    interface ReplayBuffer<T> {
        void complete();

        void error(java.lang.Throwable th);

        void next(T t);

        void replay(io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> innerDisposable);
    }

    public static <U, R> io.reactivex.Observable<R> multicastSelector(java.util.concurrent.Callable<? extends io.reactivex.observables.ConnectableObservable<U>> callable, io.reactivex.functions.Function<? super io.reactivex.Observable<U>, ? extends io.reactivex.ObservableSource<R>> function) {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableReplay.MulticastReplay(callable, function));
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> observeOn(io.reactivex.observables.ConnectableObservable<T> connectableObservable, io.reactivex.Scheduler scheduler) {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly((io.reactivex.observables.ConnectableObservable) new io.reactivex.internal.operators.observable.ObservableReplay.Replay(connectableObservable, connectableObservable.observeOn(scheduler)));
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> createFrom(io.reactivex.ObservableSource<? extends T> observableSource) {
        return create(observableSource, DEFAULT_UNBOUNDED_FACTORY);
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> create(io.reactivex.ObservableSource<T> observableSource, int i) {
        if (i == Integer.MAX_VALUE) {
            return createFrom(observableSource);
        }
        return create(observableSource, new io.reactivex.internal.operators.observable.ObservableReplay.ReplayBufferSupplier(i));
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> create(io.reactivex.ObservableSource<T> observableSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return create(observableSource, j, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> create(io.reactivex.ObservableSource<T> observableSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i) {
        return create(observableSource, new io.reactivex.internal.operators.observable.ObservableReplay.ScheduledReplaySupplier(i, j, timeUnit, scheduler));
    }

    static <T> io.reactivex.observables.ConnectableObservable<T> create(io.reactivex.ObservableSource<T> observableSource, io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> bufferSupplier) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return io.reactivex.plugins.RxJavaPlugins.onAssembly((io.reactivex.observables.ConnectableObservable) new io.reactivex.internal.operators.observable.ObservableReplay(new io.reactivex.internal.operators.observable.ObservableReplay.ReplaySource(atomicReference, bufferSupplier), observableSource, atomicReference, bufferSupplier));
    }

    private ObservableReplay(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<T> observableSource2, java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T>> atomicReference, io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> bufferSupplier) {
        this.onSubscribe = observableSource;
        this.source = observableSource2;
        this.current = atomicReference;
        this.bufferFactory = bufferSupplier;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public io.reactivex.ObservableSource<T> source() {
        return this.source;
    }

    @Override // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(io.reactivex.disposables.Disposable disposable) {
        this.current.compareAndSet((io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver) disposable, null);
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.onSubscribe.subscribe(observer);
    }

    @Override // io.reactivex.observables.ConnectableObservable
    public void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
        io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T> replayObserver;
        while (true) {
            replayObserver = this.current.get();
            if (replayObserver != null && !replayObserver.isDisposed()) {
                break;
            }
            io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T> replayObserver2 = new io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<>(this.bufferFactory.call());
            if (this.current.compareAndSet(replayObserver, replayObserver2)) {
                replayObserver = replayObserver2;
                break;
            }
        }
        boolean z = !replayObserver.shouldConnect.get() && replayObserver.shouldConnect.compareAndSet(false, true);
        try {
            consumer.accept(replayObserver);
            if (z) {
                this.source.subscribe(replayObserver);
            }
        } catch (java.lang.Throwable th) {
            if (z) {
                replayObserver.shouldConnect.compareAndSet(true, false);
            }
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    static final class ReplayObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[] EMPTY = new io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[0];
        static final io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[] TERMINATED = new io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[0];
        private static final long serialVersionUID = -533785617179540163L;
        final io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> buffer;
        boolean done;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[]> observers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
        final java.util.concurrent.atomic.AtomicBoolean shouldConnect = new java.util.concurrent.atomic.AtomicBoolean();

        ReplayObserver(io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> replayBuffer) {
            this.buffer = replayBuffer;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.observers.get() == TERMINATED;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.observers.set(TERMINATED);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        boolean add(io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> innerDisposable) {
            io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[] innerDisposableArr;
            io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.observers.get();
                if (innerDisposableArr == TERMINATED) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[length + 1];
                java.lang.System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!this.observers.compareAndSet(innerDisposableArr, innerDisposableArr2));
            return true;
        }

        void remove(io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> innerDisposable) {
            io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[] innerDisposableArr;
            io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[] innerDisposableArr2;
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
                    io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[] innerDisposableArr3 = new io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[length - 1];
                    java.lang.System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i);
                    java.lang.System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr3, i, (length - i) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!this.observers.compareAndSet(innerDisposableArr, innerDisposableArr2));
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                replay();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            this.buffer.next(t);
            replay();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (!this.done) {
                this.done = true;
                this.buffer.error(th);
                replayFinal();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.buffer.complete();
            replayFinal();
        }

        void replay() {
            for (io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> innerDisposable : this.observers.get()) {
                this.buffer.replay(innerDisposable);
            }
        }

        void replayFinal() {
            for (io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> innerDisposable : this.observers.getAndSet(TERMINATED)) {
                this.buffer.replay(innerDisposable);
            }
        }
    }

    static final class InnerDisposable<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 2728361546769921047L;
        volatile boolean cancelled;
        final io.reactivex.Observer<? super T> child;
        java.lang.Object index;
        final io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T> parent;

        InnerDisposable(io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T> replayObserver, io.reactivex.Observer<? super T> observer) {
            this.parent = replayObserver;
            this.child = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.parent.remove(this);
            this.index = null;
        }

        <U> U index() {
            return (U) this.index;
        }
    }

    static final class UnboundedReplayBuffer<T> extends java.util.ArrayList<java.lang.Object> implements io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        UnboundedReplayBuffer(int i) {
            super(i);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public void next(T t) {
            add(io.reactivex.internal.util.NotificationLite.next(t));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public void error(java.lang.Throwable th) {
            add(io.reactivex.internal.util.NotificationLite.error(th));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public void complete() {
            add(io.reactivex.internal.util.NotificationLite.complete());
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public void replay(io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.Observer<? super T> observer = innerDisposable.child;
            int iAddAndGet = 1;
            while (!innerDisposable.isDisposed()) {
                int i = this.size;
                java.lang.Integer num = (java.lang.Integer) innerDisposable.index();
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i) {
                    if (io.reactivex.internal.util.NotificationLite.accept(get(iIntValue), observer) || innerDisposable.isDisposed()) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                innerDisposable.index = java.lang.Integer.valueOf(iIntValue);
                iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    static final class Node extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final java.lang.Object value;

        Node(java.lang.Object obj) {
            this.value = obj;
        }
    }

    static abstract class BoundedReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.Node> implements io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        int size;
        io.reactivex.internal.operators.observable.ObservableReplay.Node tail;

        java.lang.Object enterTransform(java.lang.Object obj) {
            return obj;
        }

        java.lang.Object leaveTransform(java.lang.Object obj) {
            return obj;
        }

        abstract void truncate();

        BoundedReplayBuffer() {
            io.reactivex.internal.operators.observable.ObservableReplay.Node node = new io.reactivex.internal.operators.observable.ObservableReplay.Node(null);
            this.tail = node;
            set(node);
        }

        final void addLast(io.reactivex.internal.operators.observable.ObservableReplay.Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        final void removeFirst() {
            io.reactivex.internal.operators.observable.ObservableReplay.Node node = get().get();
            this.size--;
            setFirst(node);
        }

        final void trimHead() {
            io.reactivex.internal.operators.observable.ObservableReplay.Node node = get();
            if (node.value != null) {
                io.reactivex.internal.operators.observable.ObservableReplay.Node node2 = new io.reactivex.internal.operators.observable.ObservableReplay.Node(null);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        final void removeSome(int i) {
            io.reactivex.internal.operators.observable.ObservableReplay.Node node = get();
            while (i > 0) {
                node = node.get();
                i--;
                this.size--;
            }
            setFirst(node);
        }

        final void setFirst(io.reactivex.internal.operators.observable.ObservableReplay.Node node) {
            set(node);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void next(T t) {
            addLast(new io.reactivex.internal.operators.observable.ObservableReplay.Node(enterTransform(io.reactivex.internal.util.NotificationLite.next(t))));
            truncate();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void error(java.lang.Throwable th) {
            addLast(new io.reactivex.internal.operators.observable.ObservableReplay.Node(enterTransform(io.reactivex.internal.util.NotificationLite.error(th))));
            truncateFinal();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void complete() {
            addLast(new io.reactivex.internal.operators.observable.ObservableReplay.Node(enterTransform(io.reactivex.internal.util.NotificationLite.complete())));
            truncateFinal();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void replay(io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                io.reactivex.internal.operators.observable.ObservableReplay.Node head = (io.reactivex.internal.operators.observable.ObservableReplay.Node) innerDisposable.index();
                if (head == null) {
                    head = getHead();
                    innerDisposable.index = head;
                }
                while (true) {
                    if (innerDisposable.isDisposed()) {
                        innerDisposable.index = null;
                        return;
                    }
                    io.reactivex.internal.operators.observable.ObservableReplay.Node node = head.get();
                    if (node != null) {
                        if (io.reactivex.internal.util.NotificationLite.accept(leaveTransform(node.value), innerDisposable.child)) {
                            innerDisposable.index = null;
                            return;
                        }
                        head = node;
                    }
                }
                innerDisposable.index = head;
                iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        void truncateFinal() {
            trimHead();
        }

        final void collect(java.util.Collection<? super T> collection) {
            io.reactivex.internal.operators.observable.ObservableReplay.Node head = getHead();
            while (true) {
                head = head.get();
                if (head == null) {
                    return;
                }
                java.lang.Object objLeaveTransform = leaveTransform(head.value);
                if (io.reactivex.internal.util.NotificationLite.isComplete(objLeaveTransform) || io.reactivex.internal.util.NotificationLite.isError(objLeaveTransform)) {
                    return;
                } else {
                    collection.add((java.lang.Object) io.reactivex.internal.util.NotificationLite.getValue(objLeaveTransform));
                }
            }
        }

        boolean hasError() {
            return this.tail.value != null && io.reactivex.internal.util.NotificationLite.isError(leaveTransform(this.tail.value));
        }

        boolean hasCompleted() {
            return this.tail.value != null && io.reactivex.internal.util.NotificationLite.isComplete(leaveTransform(this.tail.value));
        }

        io.reactivex.internal.operators.observable.ObservableReplay.Node getHead() {
            return get();
        }
    }

    static final class SizeBoundReplayBuffer<T> extends io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        SizeBoundReplayBuffer(int i) {
            this.limit = i;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }
    }

    static final class SizeAndTimeBoundReplayBuffer<T> extends io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAge;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.TimeUnit unit;

        SizeAndTimeBoundReplayBuffer(int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.scheduler = scheduler;
            this.limit = i;
            this.maxAge = j;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        java.lang.Object enterTransform(java.lang.Object obj) {
            return new io.reactivex.schedulers.Timed(obj, this.scheduler.now(this.unit), this.unit);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        java.lang.Object leaveTransform(java.lang.Object obj) {
            return ((io.reactivex.schedulers.Timed) obj).value();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        void truncate() {
            io.reactivex.internal.operators.observable.ObservableReplay.Node node;
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            io.reactivex.internal.operators.observable.ObservableReplay.Node node2 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) get();
            io.reactivex.internal.operators.observable.ObservableReplay.Node node3 = node2.get();
            int i = 0;
            while (true) {
                io.reactivex.internal.operators.observable.ObservableReplay.Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    if (this.size <= this.limit) {
                        if (((io.reactivex.schedulers.Timed) node2.value).time() > jNow) {
                            break;
                        }
                        i++;
                        this.size--;
                        node3 = node2.get();
                    } else {
                        i++;
                        this.size--;
                        node3 = node2.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                setFirst(node);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        void truncateFinal() {
            io.reactivex.internal.operators.observable.ObservableReplay.Node node;
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            io.reactivex.internal.operators.observable.ObservableReplay.Node node2 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) get();
            io.reactivex.internal.operators.observable.ObservableReplay.Node node3 = node2.get();
            int i = 0;
            while (true) {
                io.reactivex.internal.operators.observable.ObservableReplay.Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null || this.size <= 1 || ((io.reactivex.schedulers.Timed) node2.value).time() > jNow) {
                    break;
                }
                i++;
                this.size--;
                node3 = node2.get();
            }
            if (i != 0) {
                setFirst(node);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        io.reactivex.internal.operators.observable.ObservableReplay.Node getHead() {
            io.reactivex.internal.operators.observable.ObservableReplay.Node node;
            long jNow = this.scheduler.now(this.unit) - this.maxAge;
            io.reactivex.internal.operators.observable.ObservableReplay.Node node2 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) get();
            io.reactivex.internal.operators.observable.ObservableReplay.Node node3 = node2.get();
            while (true) {
                io.reactivex.internal.operators.observable.ObservableReplay.Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null) {
                    break;
                }
                io.reactivex.schedulers.Timed timed = (io.reactivex.schedulers.Timed) node2.value;
                if (io.reactivex.internal.util.NotificationLite.isComplete(timed.value()) || io.reactivex.internal.util.NotificationLite.isError(timed.value()) || timed.time() > jNow) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }
    }

    static final class UnBoundedFactory implements io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<java.lang.Object> {
        UnBoundedFactory() {
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier
        public io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<java.lang.Object> call() {
            return new io.reactivex.internal.operators.observable.ObservableReplay.UnboundedReplayBuffer(16);
        }
    }

    static final class DisposeConsumer<R> implements io.reactivex.functions.Consumer<io.reactivex.disposables.Disposable> {
        private final io.reactivex.internal.operators.observable.ObserverResourceWrapper<R> srw;

        DisposeConsumer(io.reactivex.internal.operators.observable.ObserverResourceWrapper<R> observerResourceWrapper) {
            this.srw = observerResourceWrapper;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(io.reactivex.disposables.Disposable disposable) {
            this.srw.setResource(disposable);
        }
    }

    static final class ReplayBufferSupplier<T> implements io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> {
        private final int bufferSize;

        ReplayBufferSupplier(int i) {
            this.bufferSize = i;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier
        public io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> call() {
            return new io.reactivex.internal.operators.observable.ObservableReplay.SizeBoundReplayBuffer(this.bufferSize);
        }
    }

    static final class ScheduledReplaySupplier<T> implements io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> {
        private final int bufferSize;
        private final long maxAge;
        private final io.reactivex.Scheduler scheduler;
        private final java.util.concurrent.TimeUnit unit;

        ScheduledReplaySupplier(int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.bufferSize = i;
            this.maxAge = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier
        public io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> call() {
            return new io.reactivex.internal.operators.observable.ObservableReplay.SizeAndTimeBoundReplayBuffer(this.bufferSize, this.maxAge, this.unit, this.scheduler);
        }
    }

    static final class ReplaySource<T> implements io.reactivex.ObservableSource<T> {
        private final io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> bufferFactory;
        private final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T>> curr;

        ReplaySource(java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T>> atomicReference, io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> bufferSupplier) {
            this.curr = atomicReference;
            this.bufferFactory = bufferSupplier;
        }

        @Override // io.reactivex.ObservableSource
        public void subscribe(io.reactivex.Observer<? super T> observer) {
            io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T> replayObserver;
            while (true) {
                replayObserver = this.curr.get();
                if (replayObserver != null) {
                    break;
                }
                io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T> replayObserver2 = new io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<>(this.bufferFactory.call());
                if (this.curr.compareAndSet(null, replayObserver2)) {
                    replayObserver = replayObserver2;
                    break;
                }
            }
            io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> innerDisposable = new io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<>(replayObserver, observer);
            observer.onSubscribe(innerDisposable);
            replayObserver.add(innerDisposable);
            if (innerDisposable.isDisposed()) {
                replayObserver.remove(innerDisposable);
            } else {
                replayObserver.buffer.replay(innerDisposable);
            }
        }
    }

    static final class MulticastReplay<R, U> extends io.reactivex.Observable<R> {
        private final java.util.concurrent.Callable<? extends io.reactivex.observables.ConnectableObservable<U>> connectableFactory;
        private final io.reactivex.functions.Function<? super io.reactivex.Observable<U>, ? extends io.reactivex.ObservableSource<R>> selector;

        MulticastReplay(java.util.concurrent.Callable<? extends io.reactivex.observables.ConnectableObservable<U>> callable, io.reactivex.functions.Function<? super io.reactivex.Observable<U>, ? extends io.reactivex.ObservableSource<R>> function) {
            this.connectableFactory = callable;
            this.selector = function;
        }

        @Override // io.reactivex.Observable
        protected void subscribeActual(io.reactivex.Observer<? super R> observer) {
            try {
                io.reactivex.observables.ConnectableObservable connectableObservable = (io.reactivex.observables.ConnectableObservable) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.connectableFactory.call(), "The connectableFactory returned a null ConnectableObservable");
                io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.selector.apply(connectableObservable), "The selector returned a null ObservableSource");
                io.reactivex.internal.operators.observable.ObserverResourceWrapper observerResourceWrapper = new io.reactivex.internal.operators.observable.ObserverResourceWrapper(observer);
                observableSource.subscribe(observerResourceWrapper);
                connectableObservable.connect(new io.reactivex.internal.operators.observable.ObservableReplay.DisposeConsumer(observerResourceWrapper));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
            }
        }
    }

    static final class Replay<T> extends io.reactivex.observables.ConnectableObservable<T> {
        private final io.reactivex.observables.ConnectableObservable<T> co;
        private final io.reactivex.Observable<T> observable;

        Replay(io.reactivex.observables.ConnectableObservable<T> connectableObservable, io.reactivex.Observable<T> observable) {
            this.co = connectableObservable;
            this.observable = observable;
        }

        @Override // io.reactivex.observables.ConnectableObservable
        public void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
            this.co.connect(consumer);
        }

        @Override // io.reactivex.Observable
        protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
            this.observable.subscribe(observer);
        }
    }
}
