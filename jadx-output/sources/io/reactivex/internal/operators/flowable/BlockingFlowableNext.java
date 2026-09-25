package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class BlockingFlowableNext<T> implements java.lang.Iterable<T> {
    final org.reactivestreams.Publisher<? extends T> source;

    public BlockingFlowableNext(org.reactivestreams.Publisher<? extends T> publisher) {
        this.source = publisher;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return new io.reactivex.internal.operators.flowable.BlockingFlowableNext.NextIterator(this.source, new io.reactivex.internal.operators.flowable.BlockingFlowableNext.NextSubscriber());
    }

    static final class NextIterator<T> implements java.util.Iterator<T> {
        private java.lang.Throwable error;
        private boolean hasNext = true;
        private boolean isNextConsumed = true;
        private final org.reactivestreams.Publisher<? extends T> items;
        private T next;
        private boolean started;
        private final io.reactivex.internal.operators.flowable.BlockingFlowableNext.NextSubscriber<T> subscriber;

        NextIterator(org.reactivestreams.Publisher<? extends T> publisher, io.reactivex.internal.operators.flowable.BlockingFlowableNext.NextSubscriber<T> nextSubscriber) {
            this.items = publisher;
            this.subscriber = nextSubscriber;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            java.lang.Throwable th = this.error;
            if (th != null) {
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
            }
            if (this.hasNext) {
                return !this.isNextConsumed || moveToNext();
            }
            return false;
        }

        private boolean moveToNext() {
            try {
                if (!this.started) {
                    this.started = true;
                    this.subscriber.setWaiting();
                    io.reactivex.Flowable.fromPublisher(this.items).materialize().subscribe((io.reactivex.FlowableSubscriber<? super io.reactivex.Notification<T>>) this.subscriber);
                }
                io.reactivex.Notification<T> notificationTakeNext = this.subscriber.takeNext();
                if (notificationTakeNext.isOnNext()) {
                    this.isNextConsumed = false;
                    this.next = notificationTakeNext.getValue();
                    return true;
                }
                this.hasNext = false;
                if (notificationTakeNext.isOnComplete()) {
                    return false;
                }
                if (notificationTakeNext.isOnError()) {
                    java.lang.Throwable error = notificationTakeNext.getError();
                    this.error = error;
                    throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(error);
                }
                throw new java.lang.IllegalStateException("Should not reach here");
            } catch (java.lang.InterruptedException e) {
                this.subscriber.dispose();
                this.error = e;
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
            }
        }

        @Override // java.util.Iterator
        public T next() {
            java.lang.Throwable th = this.error;
            if (th != null) {
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
            }
            if (hasNext()) {
                this.isNextConsumed = true;
                return this.next;
            }
            throw new java.util.NoSuchElementException("No more elements");
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Read only iterator");
        }
    }

    static final class NextSubscriber<T> extends io.reactivex.subscribers.DisposableSubscriber<io.reactivex.Notification<T>> {
        private final java.util.concurrent.BlockingQueue<io.reactivex.Notification<T>> buf = new java.util.concurrent.ArrayBlockingQueue(1);
        final java.util.concurrent.atomic.AtomicInteger waiting = new java.util.concurrent.atomic.AtomicInteger();

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        NextSubscriber() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(io.reactivex.Notification<T> notification) {
            if (this.waiting.getAndSet(0) == 1 || !notification.isOnNext()) {
                while (!this.buf.offer(notification)) {
                    io.reactivex.Notification<T> notificationPoll = this.buf.poll();
                    if (notificationPoll != null && !notificationPoll.isOnNext()) {
                        notification = notificationPoll;
                    }
                }
            }
        }

        public io.reactivex.Notification<T> takeNext() throws java.lang.InterruptedException {
            setWaiting();
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
            return this.buf.take();
        }

        void setWaiting() {
            this.waiting.set(1);
        }
    }
}
