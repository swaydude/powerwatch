package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableWindowTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Observable<T>> {
    final int bufferSize;
    final long maxSize;
    final boolean restartTimerOnMaxSize;
    final io.reactivex.Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final java.util.concurrent.TimeUnit unit;

    public ObservableWindowTimed(io.reactivex.ObservableSource<T> observableSource, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, long j3, int i, boolean z) {
        super(observableSource);
        this.timespan = j;
        this.timeskip = j2;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.maxSize = j3;
        this.bufferSize = i;
        this.restartTimerOnMaxSize = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer) {
        io.reactivex.observers.SerializedObserver serializedObserver = new io.reactivex.observers.SerializedObserver(observer);
        if (this.timespan != this.timeskip) {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver(serializedObserver, this.timespan, this.timeskip, this.unit, this.scheduler.createWorker(), this.bufferSize));
        } else if (this.maxSize == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactUnboundedObserver(serializedObserver, this.timespan, this.unit, this.scheduler, this.bufferSize));
        } else {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver(serializedObserver, this.timespan, this.unit, this.scheduler, this.bufferSize, this.maxSize, this.restartTimerOnMaxSize));
        }
    }

    static final class WindowExactUnboundedObserver<T> extends io.reactivex.internal.observers.QueueDrainObserver<T, java.lang.Object, io.reactivex.Observable<T>> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        static final java.lang.Object NEXT = new java.lang.Object();
        final int bufferSize;
        final io.reactivex.Scheduler scheduler;
        volatile boolean terminated;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        io.reactivex.disposables.Disposable upstream;
        io.reactivex.subjects.UnicastSubject<T> window;

        WindowExactUnboundedObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.timer = new java.util.concurrent.atomic.AtomicReference<>();
            this.timespan = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.window = io.reactivex.subjects.UnicastSubject.create(this.bufferSize);
                io.reactivex.Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                observer.onNext(this.window);
                if (this.cancelled) {
                    return;
                }
                io.reactivex.Scheduler scheduler = this.scheduler;
                long j = this.timespan;
                io.reactivex.internal.disposables.DisposableHelper.replace(this.timer, scheduler.schedulePeriodicallyDirect(this, j, j, this.unit));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.terminated) {
                return;
            }
            if (fastEnter()) {
                this.window.onNext(t);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) io.reactivex.internal.util.NotificationLite.next(t));
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            disposeTimer();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            disposeTimer();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        void disposeTimer() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.timer);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.terminated = true;
                disposeTimer();
            }
            this.queue.offer((U) NEXT);
            if (enter()) {
                drainLoop();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        void drainLoop() {
            io.reactivex.internal.queue.MpscLinkedQueue mpscLinkedQueue = (io.reactivex.internal.queue.MpscLinkedQueue) this.queue;
            io.reactivex.Observer<? super V> observer = this.downstream;
            io.reactivex.subjects.UnicastSubject<T> unicastSubject = this.window;
            int iLeave = 1;
            while (true) {
                boolean z = this.terminated;
                boolean z2 = this.done;
                java.lang.Object objPoll = mpscLinkedQueue.poll();
                if (z2 && (objPoll == null || objPoll == NEXT)) {
                    break;
                }
                if (objPoll != null) {
                    if (objPoll == NEXT) {
                        unicastSubject.onComplete();
                        if (!z) {
                            unicastSubject = (io.reactivex.subjects.UnicastSubject<T>) io.reactivex.subjects.UnicastSubject.create(this.bufferSize);
                            this.window = unicastSubject;
                            observer.onNext(unicastSubject);
                        } else {
                            this.upstream.dispose();
                        }
                    } else {
                        unicastSubject.onNext(io.reactivex.internal.util.NotificationLite.getValue(objPoll));
                    }
                } else {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                }
            }
            this.window = null;
            mpscLinkedQueue.clear();
            disposeTimer();
            java.lang.Throwable th = this.error;
            if (th != null) {
                unicastSubject.onError(th);
            } else {
                unicastSubject.onComplete();
            }
        }
    }

    static final class WindowExactBoundedObserver<T> extends io.reactivex.internal.observers.QueueDrainObserver<T, java.lang.Object, io.reactivex.Observable<T>> implements io.reactivex.disposables.Disposable {
        final int bufferSize;
        long count;
        final long maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;
        final io.reactivex.Scheduler scheduler;
        volatile boolean terminated;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        io.reactivex.disposables.Disposable upstream;
        io.reactivex.subjects.UnicastSubject<T> window;
        final io.reactivex.Scheduler.Worker worker;

        WindowExactBoundedObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i, long j2, boolean z) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.timer = new java.util.concurrent.atomic.AtomicReference<>();
            this.timespan = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i;
            this.maxSize = j2;
            this.restartTimerOnMaxSize = z;
            if (z) {
                this.worker = scheduler.createWorker();
            } else {
                this.worker = null;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.disposables.Disposable disposableSchedulePeriodicallyDirect;
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                io.reactivex.Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                io.reactivex.subjects.UnicastSubject<T> unicastSubjectCreate = io.reactivex.subjects.UnicastSubject.create(this.bufferSize);
                this.window = unicastSubjectCreate;
                observer.onNext(unicastSubjectCreate);
                io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder consumerIndexHolder = new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder(this.producerIndex, this);
                if (this.restartTimerOnMaxSize) {
                    io.reactivex.Scheduler.Worker worker = this.worker;
                    long j = this.timespan;
                    disposableSchedulePeriodicallyDirect = worker.schedulePeriodically(consumerIndexHolder, j, j, this.unit);
                } else {
                    io.reactivex.Scheduler scheduler = this.scheduler;
                    long j2 = this.timespan;
                    disposableSchedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(consumerIndexHolder, j2, j2, this.unit);
                }
                io.reactivex.internal.disposables.DisposableHelper.replace(this.timer, disposableSchedulePeriodicallyDirect);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.terminated) {
                return;
            }
            if (fastEnter()) {
                io.reactivex.subjects.UnicastSubject<T> unicastSubject = this.window;
                unicastSubject.onNext(t);
                long j = this.count + 1;
                if (j >= this.maxSize) {
                    this.producerIndex++;
                    this.count = 0L;
                    unicastSubject.onComplete();
                    io.reactivex.subjects.UnicastSubject<T> unicastSubjectCreate = io.reactivex.subjects.UnicastSubject.create(this.bufferSize);
                    this.window = unicastSubjectCreate;
                    this.downstream.onNext(unicastSubjectCreate);
                    if (this.restartTimerOnMaxSize) {
                        this.timer.get().dispose();
                        io.reactivex.Scheduler.Worker worker = this.worker;
                        io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder consumerIndexHolder = new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder(this.producerIndex, this);
                        long j2 = this.timespan;
                        io.reactivex.internal.disposables.DisposableHelper.replace(this.timer, worker.schedulePeriodically(consumerIndexHolder, j2, j2, this.unit));
                    }
                } else {
                    this.count = j;
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) io.reactivex.internal.util.NotificationLite.next(t));
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
            disposeTimer();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
            disposeTimer();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        void disposeTimer() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.timer);
            io.reactivex.Scheduler.Worker worker = this.worker;
            if (worker != null) {
                worker.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        void drainLoop() {
            io.reactivex.internal.queue.MpscLinkedQueue mpscLinkedQueue = (io.reactivex.internal.queue.MpscLinkedQueue) this.queue;
            io.reactivex.Observer<? super V> observer = this.downstream;
            io.reactivex.subjects.UnicastSubject<T> unicastSubject = this.window;
            int iLeave = 1;
            while (!this.terminated) {
                boolean z = this.done;
                java.lang.Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder;
                if (z && (z2 || z3)) {
                    this.window = null;
                    mpscLinkedQueue.clear();
                    disposeTimer();
                    java.lang.Throwable th = this.error;
                    if (th != null) {
                        unicastSubject.onError(th);
                        return;
                    } else {
                        unicastSubject.onComplete();
                        return;
                    }
                }
                if (z2) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (z3) {
                    io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder consumerIndexHolder = (io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder) objPoll;
                    if (this.restartTimerOnMaxSize || this.producerIndex == consumerIndexHolder.index) {
                        unicastSubject.onComplete();
                        this.count = 0L;
                        unicastSubject = (io.reactivex.subjects.UnicastSubject<T>) io.reactivex.subjects.UnicastSubject.create(this.bufferSize);
                        this.window = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(io.reactivex.internal.util.NotificationLite.getValue(objPoll));
                    long j = this.count + 1;
                    if (j >= this.maxSize) {
                        this.producerIndex++;
                        this.count = 0L;
                        unicastSubject.onComplete();
                        unicastSubject = (io.reactivex.subjects.UnicastSubject<T>) io.reactivex.subjects.UnicastSubject.create(this.bufferSize);
                        this.window = unicastSubject;
                        this.downstream.onNext(unicastSubject);
                        if (this.restartTimerOnMaxSize) {
                            io.reactivex.disposables.Disposable disposable = this.timer.get();
                            disposable.dispose();
                            io.reactivex.Scheduler.Worker worker = this.worker;
                            io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder consumerIndexHolder2 = new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder(this.producerIndex, this);
                            long j2 = this.timespan;
                            io.reactivex.disposables.Disposable disposableSchedulePeriodically = worker.schedulePeriodically(consumerIndexHolder2, j2, j2, this.unit);
                            if (!this.timer.compareAndSet(disposable, disposableSchedulePeriodically)) {
                                disposableSchedulePeriodically.dispose();
                            }
                        }
                    } else {
                        this.count = j;
                    }
                }
            }
            this.upstream.dispose();
            mpscLinkedQueue.clear();
            disposeTimer();
        }

        static final class ConsumerIndexHolder implements java.lang.Runnable {
            final long index;
            final io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver<?> parent;

            ConsumerIndexHolder(long j, io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver<?> windowExactBoundedObserver) {
                this.index = j;
                this.parent = windowExactBoundedObserver;
            }

            @Override // java.lang.Runnable
            public void run() {
                io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver<?> windowExactBoundedObserver = this.parent;
                if (!((io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver) windowExactBoundedObserver).cancelled) {
                    ((io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver) windowExactBoundedObserver).queue.offer(this);
                } else {
                    windowExactBoundedObserver.terminated = true;
                    windowExactBoundedObserver.disposeTimer();
                }
                if (windowExactBoundedObserver.enter()) {
                    windowExactBoundedObserver.drainLoop();
                }
            }
        }
    }

    static final class WindowSkipObserver<T> extends io.reactivex.internal.observers.QueueDrainObserver<T, java.lang.Object, io.reactivex.Observable<T>> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        final int bufferSize;
        volatile boolean terminated;
        final long timeskip;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        io.reactivex.disposables.Disposable upstream;
        final java.util.List<io.reactivex.subjects.UnicastSubject<T>> windows;
        final io.reactivex.Scheduler.Worker worker;

        WindowSkipObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker, int i) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.timespan = j;
            this.timeskip = j2;
            this.unit = timeUnit;
            this.worker = worker;
            this.bufferSize = i;
            this.windows = new java.util.LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                io.reactivex.subjects.UnicastSubject<T> unicastSubjectCreate = io.reactivex.subjects.UnicastSubject.create(this.bufferSize);
                this.windows.add(unicastSubjectCreate);
                this.downstream.onNext(unicastSubjectCreate);
                this.worker.schedule(new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.CompletionTask(unicastSubjectCreate), this.timespan, this.unit);
                io.reactivex.Scheduler.Worker worker = this.worker;
                long j = this.timeskip;
                worker.schedulePeriodically(this, j, j, this.unit);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (fastEnter()) {
                java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it = this.windows.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) t);
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
            disposeWorker();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
            disposeWorker();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        void disposeWorker() {
            this.worker.dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void complete(io.reactivex.subjects.UnicastSubject<T> unicastSubject) {
            this.queue.offer((U) new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.SubjectWork(unicastSubject, false));
            if (enter()) {
                drainLoop();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void drainLoop() {
            io.reactivex.internal.queue.MpscLinkedQueue mpscLinkedQueue = (io.reactivex.internal.queue.MpscLinkedQueue) this.queue;
            io.reactivex.Observer<? super V> observer = this.downstream;
            java.util.List<io.reactivex.subjects.UnicastSubject<T>> list = this.windows;
            int iLeave = 1;
            while (!this.terminated) {
                boolean z = this.done;
                java.lang.Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.SubjectWork;
                if (z && (z2 || z3)) {
                    mpscLinkedQueue.clear();
                    java.lang.Throwable th = this.error;
                    if (th != null) {
                        java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    disposeWorker();
                    list.clear();
                    return;
                }
                if (z2) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (z3) {
                    io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.SubjectWork subjectWork = (io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.SubjectWork) objPoll;
                    if (subjectWork.open) {
                        if (!this.cancelled) {
                            io.reactivex.subjects.UnicastSubject<T> unicastSubjectCreate = io.reactivex.subjects.UnicastSubject.create(this.bufferSize);
                            list.add(unicastSubjectCreate);
                            observer.onNext(unicastSubjectCreate);
                            this.worker.schedule(new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.CompletionTask(unicastSubjectCreate), this.timespan, this.unit);
                        }
                    } else {
                        list.remove(subjectWork.w);
                        subjectWork.w.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.terminated = true;
                        }
                    }
                } else {
                    java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objPoll);
                    }
                }
            }
            this.upstream.dispose();
            disposeWorker();
            mpscLinkedQueue.clear();
            list.clear();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            java.lang.Object subjectWork = new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.SubjectWork(io.reactivex.subjects.UnicastSubject.create(this.bufferSize), true);
            if (!this.cancelled) {
                this.queue.offer((U) subjectWork);
            }
            if (enter()) {
                drainLoop();
            }
        }

        static final class SubjectWork<T> {
            final boolean open;
            final io.reactivex.subjects.UnicastSubject<T> w;

            SubjectWork(io.reactivex.subjects.UnicastSubject<T> unicastSubject, boolean z) {
                this.w = unicastSubject;
                this.open = z;
            }
        }

        final class CompletionTask implements java.lang.Runnable {
            private final io.reactivex.subjects.UnicastSubject<T> w;

            CompletionTask(io.reactivex.subjects.UnicastSubject<T> unicastSubject) {
                this.w = unicastSubject;
            }

            @Override // java.lang.Runnable
            public void run() {
                io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.this.complete(this.w);
            }
        }
    }
}
