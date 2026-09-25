package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class BlockingFlowableMostRecent<T> implements java.lang.Iterable<T> {
    final T initialValue;
    final io.reactivex.Flowable<T> source;

    public BlockingFlowableMostRecent(io.reactivex.Flowable<T> flowable, T t) {
        this.source = flowable;
        this.initialValue = t;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent.MostRecentSubscriber mostRecentSubscriber = new io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent.MostRecentSubscriber(this.initialValue);
        this.source.subscribe((io.reactivex.FlowableSubscriber) mostRecentSubscriber);
        return mostRecentSubscriber.getIterable();
    }

    static final class MostRecentSubscriber<T> extends io.reactivex.subscribers.DefaultSubscriber<T> {
        volatile java.lang.Object value;

        MostRecentSubscriber(T t) {
            this.value = io.reactivex.internal.util.NotificationLite.next(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.value = io.reactivex.internal.util.NotificationLite.complete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            this.value = io.reactivex.internal.util.NotificationLite.error(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.value = io.reactivex.internal.util.NotificationLite.next(t);
        }

        public io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent.MostRecentSubscriber<T>.Iterator getIterable() {
            return new io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent.MostRecentSubscriber.Iterator();
        }

        final class Iterator implements java.util.Iterator<T> {
            private java.lang.Object buf;

            Iterator() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                java.lang.Object obj = io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent.MostRecentSubscriber.this.value;
                this.buf = obj;
                return !io.reactivex.internal.util.NotificationLite.isComplete(obj);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.buf == null) {
                        this.buf = io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent.MostRecentSubscriber.this.value;
                    }
                    if (io.reactivex.internal.util.NotificationLite.isComplete(this.buf)) {
                        throw new java.util.NoSuchElementException();
                    }
                    if (io.reactivex.internal.util.NotificationLite.isError(this.buf)) {
                        throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(io.reactivex.internal.util.NotificationLite.getError(this.buf));
                    }
                    T t = (T) io.reactivex.internal.util.NotificationLite.getValue(this.buf);
                    this.buf = null;
                    return t;
                } catch (java.lang.Throwable th) {
                    this.buf = null;
                    throw th;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException("Read only iterator");
            }
        }
    }
}
