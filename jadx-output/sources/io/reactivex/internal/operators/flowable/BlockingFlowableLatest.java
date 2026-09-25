package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class BlockingFlowableLatest<T> implements java.lang.Iterable<T> {
    final org.reactivestreams.Publisher<? extends T> source;

    public BlockingFlowableLatest(org.reactivestreams.Publisher<? extends T> publisher) {
        this.source = publisher;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        io.reactivex.internal.operators.flowable.BlockingFlowableLatest.LatestSubscriberIterator latestSubscriberIterator = new io.reactivex.internal.operators.flowable.BlockingFlowableLatest.LatestSubscriberIterator();
        io.reactivex.Flowable.fromPublisher(this.source).materialize().subscribe((io.reactivex.FlowableSubscriber<? super io.reactivex.Notification<T>>) latestSubscriberIterator);
        return latestSubscriberIterator;
    }

    static final class LatestSubscriberIterator<T> extends io.reactivex.subscribers.DisposableSubscriber<io.reactivex.Notification<T>> implements java.util.Iterator<T> {
        io.reactivex.Notification<T> iteratorNotification;
        final java.util.concurrent.Semaphore notify = new java.util.concurrent.Semaphore(0);
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.Notification<T>> value = new java.util.concurrent.atomic.AtomicReference<>();

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        LatestSubscriberIterator() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(io.reactivex.Notification<T> notification) {
            if (this.value.getAndSet(notification) == null) {
                this.notify.release();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            io.reactivex.Notification<T> notification = this.iteratorNotification;
            if (notification != null && notification.isOnError()) {
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(this.iteratorNotification.getError());
            }
            io.reactivex.Notification<T> notification2 = this.iteratorNotification;
            if ((notification2 == null || notification2.isOnNext()) && this.iteratorNotification == null) {
                try {
                    io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                    this.notify.acquire();
                    io.reactivex.Notification<T> andSet = this.value.getAndSet(null);
                    this.iteratorNotification = andSet;
                    if (andSet.isOnError()) {
                        throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(andSet.getError());
                    }
                } catch (java.lang.InterruptedException e) {
                    dispose();
                    this.iteratorNotification = io.reactivex.Notification.createOnError(e);
                    throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
                }
            }
            return this.iteratorNotification.isOnNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext() && this.iteratorNotification.isOnNext()) {
                T value = this.iteratorNotification.getValue();
                this.iteratorNotification = null;
                return value;
            }
            throw new java.util.NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Read-only iterator.");
        }
    }
}
