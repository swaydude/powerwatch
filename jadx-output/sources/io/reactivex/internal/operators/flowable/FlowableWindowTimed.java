package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableWindowTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.Flowable<T>> {
    final int bufferSize;
    final long maxSize;
    final boolean restartTimerOnMaxSize;
    final io.reactivex.Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final java.util.concurrent.TimeUnit unit;

    public FlowableWindowTimed(io.reactivex.Flowable<T> flowable, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, long j3, int i, boolean z) {
        super(flowable);
        this.timespan = j;
        this.timeskip = j2;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.maxSize = j3;
        this.bufferSize = i;
        this.restartTimerOnMaxSize = z;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber) {
        io.reactivex.subscribers.SerializedSubscriber serializedSubscriber = new io.reactivex.subscribers.SerializedSubscriber(subscriber);
        if (this.timespan != this.timeskip) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber(serializedSubscriber, this.timespan, this.timeskip, this.unit, this.scheduler.createWorker(), this.bufferSize));
        } else if (this.maxSize == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber(serializedSubscriber, this.timespan, this.unit, this.scheduler, this.bufferSize));
        } else {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber(serializedSubscriber, this.timespan, this.unit, this.scheduler, this.bufferSize, this.maxSize, this.restartTimerOnMaxSize));
        }
    }

    static final class WindowExactUnboundedSubscriber<T> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, java.lang.Object, io.reactivex.Flowable<T>> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        static final java.lang.Object NEXT = new java.lang.Object();
        final int bufferSize;
        final io.reactivex.Scheduler scheduler;
        volatile boolean terminated;
        final io.reactivex.internal.disposables.SequentialDisposable timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        org.reactivestreams.Subscription upstream;
        io.reactivex.processors.UnicastProcessor<T> window;

        WindowExactUnboundedSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i) {
            super(subscriber, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.timer = new io.reactivex.internal.disposables.SequentialDisposable();
            this.timespan = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.window = io.reactivex.processors.UnicastProcessor.create(this.bufferSize);
                org.reactivestreams.Subscriber<? super V> subscriber = this.downstream;
                subscriber.onSubscribe(this);
                long jRequested = requested();
                if (jRequested != 0) {
                    subscriber.onNext(this.window);
                    if (jRequested != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                        produced(1L);
                    }
                    if (this.cancelled) {
                        return;
                    }
                    io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = this.timer;
                    io.reactivex.Scheduler scheduler = this.scheduler;
                    long j = this.timespan;
                    if (sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(this, j, j, this.unit))) {
                        subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
                        return;
                    }
                    return;
                }
                this.cancelled = true;
                subscription.cancel();
                subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver first window due to lack of requests."));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
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

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
        }

        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.timer);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.terminated = true;
                dispose();
            }
            this.queue.offer((U) NEXT);
            if (enter()) {
                drainLoop();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.processors.UnicastProcessor<T>] */
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
            io.reactivex.internal.fuseable.SimpleQueue simpleQueue = this.queue;
            org.reactivestreams.Subscriber<? super V> subscriber = this.downstream;
            io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.window;
            int iLeave = 1;
            while (true) {
                boolean z = this.terminated;
                boolean z2 = this.done;
                java.lang.Object objPoll = simpleQueue.poll();
                if (z2 && (objPoll == null || objPoll == NEXT)) {
                    break;
                }
                if (objPoll != null) {
                    if (objPoll == NEXT) {
                        unicastProcessor.onComplete();
                        if (!z) {
                            unicastProcessor = (io.reactivex.processors.UnicastProcessor<T>) io.reactivex.processors.UnicastProcessor.create(this.bufferSize);
                            this.window = unicastProcessor;
                            long jRequested = requested();
                            if (jRequested != 0) {
                                subscriber.onNext(unicastProcessor);
                                if (jRequested != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                                    produced(1L);
                                }
                            } else {
                                this.window = null;
                                this.queue.clear();
                                this.upstream.cancel();
                                dispose();
                                subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver first window due to lack of requests."));
                                return;
                            }
                        } else {
                            this.upstream.cancel();
                        }
                    } else {
                        unicastProcessor.onNext(io.reactivex.internal.util.NotificationLite.getValue(objPoll));
                    }
                } else {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                }
            }
            this.window = null;
            simpleQueue.clear();
            dispose();
            java.lang.Throwable th = this.error;
            if (th != null) {
                unicastProcessor.onError(th);
            } else {
                unicastProcessor.onComplete();
            }
        }
    }

    static final class WindowExactBoundedSubscriber<T> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, java.lang.Object, io.reactivex.Flowable<T>> implements org.reactivestreams.Subscription {
        final int bufferSize;
        long count;
        final long maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;
        final io.reactivex.Scheduler scheduler;
        volatile boolean terminated;
        final io.reactivex.internal.disposables.SequentialDisposable timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        org.reactivestreams.Subscription upstream;
        io.reactivex.processors.UnicastProcessor<T> window;
        final io.reactivex.Scheduler.Worker worker;

        WindowExactBoundedSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i, long j2, boolean z) {
            super(subscriber, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.timer = new io.reactivex.internal.disposables.SequentialDisposable();
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
        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.disposables.Disposable disposableSchedulePeriodicallyDirect;
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                org.reactivestreams.Subscriber<? super V> subscriber = this.downstream;
                subscriber.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                io.reactivex.processors.UnicastProcessor<T> unicastProcessorCreate = io.reactivex.processors.UnicastProcessor.create(this.bufferSize);
                this.window = unicastProcessorCreate;
                long jRequested = requested();
                if (jRequested != 0) {
                    subscriber.onNext(unicastProcessorCreate);
                    if (jRequested != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                        produced(1L);
                    }
                    io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder consumerIndexHolder = new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder(this.producerIndex, this);
                    if (this.restartTimerOnMaxSize) {
                        io.reactivex.Scheduler.Worker worker = this.worker;
                        long j = this.timespan;
                        disposableSchedulePeriodicallyDirect = worker.schedulePeriodically(consumerIndexHolder, j, j, this.unit);
                    } else {
                        io.reactivex.Scheduler scheduler = this.scheduler;
                        long j2 = this.timespan;
                        disposableSchedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(consumerIndexHolder, j2, j2, this.unit);
                    }
                    if (this.timer.replace(disposableSchedulePeriodicallyDirect)) {
                        subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
                        return;
                    }
                    return;
                }
                this.cancelled = true;
                subscription.cancel();
                subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver initial window due to lack of requests."));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.terminated) {
                return;
            }
            if (fastEnter()) {
                io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.window;
                unicastProcessor.onNext(t);
                long j = this.count + 1;
                if (j >= this.maxSize) {
                    this.producerIndex++;
                    this.count = 0L;
                    unicastProcessor.onComplete();
                    long jRequested = requested();
                    if (jRequested != 0) {
                        io.reactivex.processors.UnicastProcessor<T> unicastProcessorCreate = io.reactivex.processors.UnicastProcessor.create(this.bufferSize);
                        this.window = unicastProcessorCreate;
                        this.downstream.onNext(unicastProcessorCreate);
                        if (jRequested != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                            produced(1L);
                        }
                        if (this.restartTimerOnMaxSize) {
                            this.timer.get().dispose();
                            io.reactivex.Scheduler.Worker worker = this.worker;
                            io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder consumerIndexHolder = new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder(this.producerIndex, this);
                            long j2 = this.timespan;
                            this.timer.replace(worker.schedulePeriodically(consumerIndexHolder, j2, j2, this.unit));
                        }
                    } else {
                        this.window = null;
                        this.upstream.cancel();
                        this.downstream.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver window due to lack of requests"));
                        dispose();
                        return;
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

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
        }

        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.timer);
            io.reactivex.Scheduler.Worker worker = this.worker;
            if (worker != null) {
                worker.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
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
            io.reactivex.processors.UnicastProcessor<T> unicastProcessorCreate;
            io.reactivex.internal.fuseable.SimpleQueue simpleQueue = this.queue;
            org.reactivestreams.Subscriber<? super V> subscriber = this.downstream;
            io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.window;
            int iLeave = 1;
            while (!this.terminated) {
                boolean z = this.done;
                java.lang.Object objPoll = simpleQueue.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder;
                if (z && (z2 || z3)) {
                    this.window = null;
                    simpleQueue.clear();
                    java.lang.Throwable th = this.error;
                    if (th != null) {
                        ((io.reactivex.processors.UnicastProcessor) unicastProcessor).onError(th);
                    } else {
                        ((io.reactivex.processors.UnicastProcessor) unicastProcessor).onComplete();
                    }
                    dispose();
                    return;
                }
                if (z2) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else {
                    int i = iLeave;
                    if (z3) {
                        io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder consumerIndexHolder = (io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder) objPoll;
                        if (this.restartTimerOnMaxSize || this.producerIndex == consumerIndexHolder.index) {
                            unicastProcessor = unicastProcessor;
                            ((io.reactivex.processors.UnicastProcessor) unicastProcessor).onComplete();
                            this.count = 0L;
                            unicastProcessorCreate = io.reactivex.processors.UnicastProcessor.create(this.bufferSize);
                            this.window = unicastProcessorCreate;
                            long jRequested = requested();
                            if (jRequested != 0) {
                                subscriber.onNext(unicastProcessorCreate);
                                if (jRequested != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                                    unicastProcessor = unicastProcessorCreate;
                                    produced(1L);
                                    unicastProcessor = unicastProcessorCreate;
                                }
                            } else {
                                this.window = null;
                                this.queue.clear();
                                this.upstream.cancel();
                                subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver first window due to lack of requests."));
                                dispose();
                                return;
                            }
                        }
                    } else {
                        ((io.reactivex.processors.UnicastProcessor) unicastProcessor).onNext(io.reactivex.internal.util.NotificationLite.getValue(objPoll));
                        long j = this.count + 1;
                        if (j >= this.maxSize) {
                            this.producerIndex++;
                            this.count = 0L;
                            ((io.reactivex.processors.UnicastProcessor) unicastProcessor).onComplete();
                            long jRequested2 = requested();
                            if (jRequested2 != 0) {
                                io.reactivex.processors.UnicastProcessor<T> unicastProcessorCreate2 = io.reactivex.processors.UnicastProcessor.create(this.bufferSize);
                                this.window = unicastProcessorCreate2;
                                this.downstream.onNext(unicastProcessorCreate2);
                                if (jRequested2 != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                                    produced(1L);
                                }
                                if (this.restartTimerOnMaxSize) {
                                    this.timer.get().dispose();
                                    io.reactivex.Scheduler.Worker worker = this.worker;
                                    io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder consumerIndexHolder2 = new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder(this.producerIndex, this);
                                    long j2 = this.timespan;
                                    this.timer.replace(worker.schedulePeriodically(consumerIndexHolder2, j2, j2, this.unit));
                                }
                                unicastProcessor = unicastProcessorCreate2;
                            } else {
                                this.window = null;
                                this.upstream.cancel();
                                this.downstream.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver window due to lack of requests"));
                                dispose();
                                return;
                            }
                        } else {
                            this.count = j;
                            unicastProcessor = unicastProcessor;
                        }
                    }
                    unicastProcessor = unicastProcessorCreate;
                    unicastProcessor = unicastProcessor;
                    iLeave = i;
                }
            }
            this.upstream.cancel();
            simpleQueue.clear();
            dispose();
        }

        static final class ConsumerIndexHolder implements java.lang.Runnable {
            final long index;
            final io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber<?> parent;

            ConsumerIndexHolder(long j, io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber) {
                this.index = j;
                this.parent = windowExactBoundedSubscriber;
            }

            @Override // java.lang.Runnable
            public void run() {
                io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber = this.parent;
                if (!((io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber) windowExactBoundedSubscriber).cancelled) {
                    ((io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber) windowExactBoundedSubscriber).queue.offer(this);
                } else {
                    windowExactBoundedSubscriber.terminated = true;
                    windowExactBoundedSubscriber.dispose();
                }
                if (windowExactBoundedSubscriber.enter()) {
                    windowExactBoundedSubscriber.drainLoop();
                }
            }
        }
    }

    static final class WindowSkipSubscriber<T> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, java.lang.Object, io.reactivex.Flowable<T>> implements org.reactivestreams.Subscription, java.lang.Runnable {
        final int bufferSize;
        volatile boolean terminated;
        final long timeskip;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        org.reactivestreams.Subscription upstream;
        final java.util.List<io.reactivex.processors.UnicastProcessor<T>> windows;
        final io.reactivex.Scheduler.Worker worker;

        WindowSkipSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker, int i) {
            super(subscriber, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.timespan = j;
            this.timeskip = j2;
            this.unit = timeUnit;
            this.worker = worker;
            this.bufferSize = i;
            this.windows = new java.util.LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                long jRequested = requested();
                if (jRequested != 0) {
                    io.reactivex.processors.UnicastProcessor<T> unicastProcessorCreate = io.reactivex.processors.UnicastProcessor.create(this.bufferSize);
                    this.windows.add(unicastProcessorCreate);
                    this.downstream.onNext(unicastProcessorCreate);
                    if (jRequested != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                        produced(1L);
                    }
                    this.worker.schedule(new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.Completion(unicastProcessorCreate), this.timespan, this.unit);
                    io.reactivex.Scheduler.Worker worker = this.worker;
                    long j = this.timeskip;
                    worker.schedulePeriodically(this, j, j, this.unit);
                    subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
                    return;
                }
                subscription.cancel();
                this.downstream.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not emit the first window due to lack of requests"));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (fastEnter()) {
                java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it = this.windows.iterator();
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

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
        }

        public void dispose() {
            this.worker.dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void complete(io.reactivex.processors.UnicastProcessor<T> unicastProcessor) {
            this.queue.offer((U) new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.SubjectWork(unicastProcessor, false));
            if (enter()) {
                drainLoop();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        void drainLoop() {
            io.reactivex.internal.fuseable.SimpleQueue simpleQueue = this.queue;
            org.reactivestreams.Subscriber<? super V> subscriber = this.downstream;
            java.util.List<io.reactivex.processors.UnicastProcessor<T>> list = this.windows;
            int iLeave = 1;
            while (!this.terminated) {
                boolean z = this.done;
                java.lang.Object objPoll = simpleQueue.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.SubjectWork;
                if (z && (z2 || z3)) {
                    simpleQueue.clear();
                    java.lang.Throwable th = this.error;
                    if (th != null) {
                        java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    dispose();
                    return;
                }
                if (z2) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (z3) {
                    io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.SubjectWork subjectWork = (io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.SubjectWork) objPoll;
                    if (subjectWork.open) {
                        if (!this.cancelled) {
                            long jRequested = requested();
                            if (jRequested != 0) {
                                io.reactivex.processors.UnicastProcessor<T> unicastProcessorCreate = io.reactivex.processors.UnicastProcessor.create(this.bufferSize);
                                list.add(unicastProcessorCreate);
                                subscriber.onNext(unicastProcessorCreate);
                                if (jRequested != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                                    produced(1L);
                                }
                                this.worker.schedule(new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.Completion(unicastProcessorCreate), this.timespan, this.unit);
                            } else {
                                subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Can't emit window due to lack of requests"));
                            }
                        }
                    } else {
                        list.remove(subjectWork.w);
                        subjectWork.w.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.terminated = true;
                        }
                    }
                } else {
                    java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objPoll);
                    }
                }
            }
            this.upstream.cancel();
            dispose();
            simpleQueue.clear();
            list.clear();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            java.lang.Object subjectWork = new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.SubjectWork(io.reactivex.processors.UnicastProcessor.create(this.bufferSize), true);
            if (!this.cancelled) {
                this.queue.offer((U) subjectWork);
            }
            if (enter()) {
                drainLoop();
            }
        }

        static final class SubjectWork<T> {
            final boolean open;
            final io.reactivex.processors.UnicastProcessor<T> w;

            SubjectWork(io.reactivex.processors.UnicastProcessor<T> unicastProcessor, boolean z) {
                this.w = unicastProcessor;
                this.open = z;
            }
        }

        final class Completion implements java.lang.Runnable {
            private final io.reactivex.processors.UnicastProcessor<T> processor;

            Completion(io.reactivex.processors.UnicastProcessor<T> unicastProcessor) {
                this.processor = unicastProcessor;
            }

            @Override // java.lang.Runnable
            public void run() {
                io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.this.complete(this.processor);
            }
        }
    }
}
