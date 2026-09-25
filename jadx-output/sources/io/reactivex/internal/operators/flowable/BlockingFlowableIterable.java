package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class BlockingFlowableIterable<T> implements java.lang.Iterable<T> {
    final int bufferSize;
    final io.reactivex.Flowable<T> source;

    public BlockingFlowableIterable(io.reactivex.Flowable<T> flowable, int i) {
        this.source = flowable;
        this.bufferSize = i;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        io.reactivex.internal.operators.flowable.BlockingFlowableIterable.BlockingFlowableIterator blockingFlowableIterator = new io.reactivex.internal.operators.flowable.BlockingFlowableIterable.BlockingFlowableIterator(this.bufferSize);
        this.source.subscribe((io.reactivex.FlowableSubscriber) blockingFlowableIterator);
        return blockingFlowableIterator;
    }

    static final class BlockingFlowableIterator<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, java.util.Iterator<T>, java.lang.Runnable, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 6695226475494099826L;
        final long batchSize;
        final java.util.concurrent.locks.Condition condition;
        volatile boolean done;
        java.lang.Throwable error;
        final long limit;
        final java.util.concurrent.locks.Lock lock;
        long produced;
        final io.reactivex.internal.queue.SpscArrayQueue<T> queue;

        BlockingFlowableIterator(int i) {
            this.queue = new io.reactivex.internal.queue.SpscArrayQueue<>(i);
            this.batchSize = i;
            this.limit = i - (i >> 2);
            java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
            this.lock = reentrantLock;
            this.condition = reentrantLock.newCondition();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (true) {
                boolean z = this.done;
                boolean zIsEmpty = this.queue.isEmpty();
                if (z) {
                    java.lang.Throwable th = this.error;
                    if (th != null) {
                        throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                this.lock.lock();
                while (!this.done && this.queue.isEmpty()) {
                    try {
                        try {
                            this.condition.await();
                        } catch (java.lang.InterruptedException e) {
                            run();
                            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
                        }
                    } catch (java.lang.Throwable th2) {
                        this.lock.unlock();
                        throw th2;
                    }
                }
                this.lock.unlock();
            }
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T tPoll = this.queue.poll();
                long j = this.produced + 1;
                if (j == this.limit) {
                    this.produced = 0L;
                    get().request(j);
                } else {
                    this.produced = j;
                }
                return tPoll;
            }
            throw new java.util.NoSuchElementException();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, this.batchSize);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (!this.queue.offer(t)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
                onError(new io.reactivex.exceptions.MissingBackpressureException("Queue full?!"));
            } else {
                signalConsumer();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
            signalConsumer();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            signalConsumer();
        }

        void signalConsumer() {
            this.lock.lock();
            try {
                this.condition.signalAll();
            } finally {
                this.lock.unlock();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
            signalConsumer();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("remove");
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }
    }
}
