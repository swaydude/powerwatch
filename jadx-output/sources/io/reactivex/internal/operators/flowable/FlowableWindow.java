package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableWindow<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.Flowable<T>> {
    final int bufferSize;
    final long size;
    final long skip;

    public FlowableWindow(io.reactivex.Flowable<T> flowable, long j, long j2, int i) {
        super(flowable);
        this.size = j;
        this.skip = j2;
        this.bufferSize = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber) {
        long j = this.skip;
        long j2 = this.size;
        if (j == j2) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableWindow.WindowExactSubscriber(subscriber, this.size, this.bufferSize));
        } else if (j > j2) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableWindow.WindowSkipSubscriber(subscriber, this.size, this.skip, this.bufferSize));
        } else {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableWindow.WindowOverlapSubscriber(subscriber, this.size, this.skip, this.bufferSize));
        }
    }

    static final class WindowExactSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -2365647875069161133L;
        final int bufferSize;
        final org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> downstream;
        long index;
        final java.util.concurrent.atomic.AtomicBoolean once;
        final long size;
        org.reactivestreams.Subscription upstream;
        io.reactivex.processors.UnicastProcessor<T> window;

        WindowExactSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, long j, int i) {
            super(1);
            this.downstream = subscriber;
            this.size = j;
            this.once = new java.util.concurrent.atomic.AtomicBoolean();
            this.bufferSize = i;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            long j = this.index;
            io.reactivex.processors.UnicastProcessor<T> unicastProcessorCreate = this.window;
            if (j == 0) {
                getAndIncrement();
                unicastProcessorCreate = io.reactivex.processors.UnicastProcessor.create(this.bufferSize, this);
                this.window = unicastProcessorCreate;
                this.downstream.onNext(unicastProcessorCreate);
            }
            long j2 = j + 1;
            unicastProcessorCreate.onNext(t);
            if (j2 == this.size) {
                this.index = 0L;
                this.window = null;
                unicastProcessorCreate.onComplete();
                return;
            }
            this.index = j2;
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                this.upstream.request(io.reactivex.internal.util.BackpressureHelper.multiplyCap(this.size, j));
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    static final class WindowSkipSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -8792836352386833856L;
        final int bufferSize;
        final org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> downstream;
        final java.util.concurrent.atomic.AtomicBoolean firstRequest;
        long index;
        final java.util.concurrent.atomic.AtomicBoolean once;
        final long size;
        final long skip;
        org.reactivestreams.Subscription upstream;
        io.reactivex.processors.UnicastProcessor<T> window;

        WindowSkipSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, long j, long j2, int i) {
            super(1);
            this.downstream = subscriber;
            this.size = j;
            this.skip = j2;
            this.once = new java.util.concurrent.atomic.AtomicBoolean();
            this.firstRequest = new java.util.concurrent.atomic.AtomicBoolean();
            this.bufferSize = i;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            long j = this.index;
            io.reactivex.processors.UnicastProcessor<T> unicastProcessorCreate = this.window;
            if (j == 0) {
                getAndIncrement();
                unicastProcessorCreate = io.reactivex.processors.UnicastProcessor.create(this.bufferSize, this);
                this.window = unicastProcessorCreate;
                this.downstream.onNext(unicastProcessorCreate);
            }
            long j2 = j + 1;
            if (unicastProcessorCreate != null) {
                unicastProcessorCreate.onNext(t);
            }
            if (j2 == this.size) {
                this.window = null;
                unicastProcessorCreate.onComplete();
            }
            if (j2 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j2;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                if (!this.firstRequest.get() && this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(io.reactivex.internal.util.BackpressureHelper.addCap(io.reactivex.internal.util.BackpressureHelper.multiplyCap(this.size, j), io.reactivex.internal.util.BackpressureHelper.multiplyCap(this.skip - this.size, j - 1)));
                } else {
                    this.upstream.request(io.reactivex.internal.util.BackpressureHelper.multiplyCap(this.skip, j));
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    static final class WindowOverlapSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = 2428527070996323976L;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> downstream;
        java.lang.Throwable error;
        final java.util.concurrent.atomic.AtomicBoolean firstRequest;
        long index;
        final java.util.concurrent.atomic.AtomicBoolean once;
        long produced;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.processors.UnicastProcessor<T>> queue;
        final java.util.concurrent.atomic.AtomicLong requested;
        final long size;
        final long skip;
        org.reactivestreams.Subscription upstream;
        final java.util.ArrayDeque<io.reactivex.processors.UnicastProcessor<T>> windows;
        final java.util.concurrent.atomic.AtomicInteger wip;

        WindowOverlapSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, long j, long j2, int i) {
            super(1);
            this.downstream = subscriber;
            this.size = j;
            this.skip = j2;
            this.queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
            this.windows = new java.util.ArrayDeque<>();
            this.once = new java.util.concurrent.atomic.AtomicBoolean();
            this.firstRequest = new java.util.concurrent.atomic.AtomicBoolean();
            this.requested = new java.util.concurrent.atomic.AtomicLong();
            this.wip = new java.util.concurrent.atomic.AtomicInteger();
            this.bufferSize = i;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            long j = this.index;
            if (j == 0 && !this.cancelled) {
                getAndIncrement();
                io.reactivex.processors.UnicastProcessor<T> unicastProcessorCreate = io.reactivex.processors.UnicastProcessor.create(this.bufferSize, this);
                this.windows.offer(unicastProcessorCreate);
                this.queue.offer(unicastProcessorCreate);
                drain();
            }
            long j2 = j + 1;
            java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            long j3 = this.produced + 1;
            if (j3 == this.size) {
                this.produced = j3 - this.skip;
                io.reactivex.processors.UnicastProcessor<T> unicastProcessorPoll = this.windows.poll();
                if (unicastProcessorPoll != null) {
                    unicastProcessorPoll.onComplete();
                }
            } else {
                this.produced = j3;
            }
            if (j2 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j2;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.windows.clear();
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.windows.clear();
            this.done = true;
            drain();
        }

        void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber = this.downstream;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.processors.UnicastProcessor<T>> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.done;
                    io.reactivex.processors.UnicastProcessor<T> unicastProcessorPoll = spscLinkedArrayQueue.poll();
                    boolean z2 = unicastProcessorPoll == null;
                    if (checkTerminated(z, z2, subscriber, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(unicastProcessorPoll);
                    j2++;
                }
                if (j2 == j && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), subscriber, spscLinkedArrayQueue)) {
                    return;
                }
                if (j2 != 0 && j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                    this.requested.addAndGet(-j2);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        boolean checkTerminated(boolean z, boolean z2, org.reactivestreams.Subscriber<?> subscriber, io.reactivex.internal.queue.SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            java.lang.Throwable th = this.error;
            if (th != null) {
                spscLinkedArrayQueue.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.requested, j);
                if (!this.firstRequest.get() && this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(io.reactivex.internal.util.BackpressureHelper.addCap(this.size, io.reactivex.internal.util.BackpressureHelper.multiplyCap(this.skip, j - 1)));
                } else {
                    this.upstream.request(io.reactivex.internal.util.BackpressureHelper.multiplyCap(this.skip, j));
                }
                drain();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }
}
