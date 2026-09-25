package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableConcatArray<T> extends io.reactivex.Flowable<T> {
    final boolean delayError;
    final org.reactivestreams.Publisher<? extends T>[] sources;

    public FlowableConcatArray(org.reactivestreams.Publisher<? extends T>[] publisherArr, boolean z) {
        this.sources = publisherArr;
        this.delayError = z;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableConcatArray.ConcatArraySubscriber concatArraySubscriber = new io.reactivex.internal.operators.flowable.FlowableConcatArray.ConcatArraySubscriber(this.sources, this.delayError, subscriber);
        subscriber.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }

    static final class ConcatArraySubscriber<T> extends io.reactivex.internal.subscriptions.SubscriptionArbiter implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        final boolean delayError;
        final org.reactivestreams.Subscriber<? super T> downstream;
        java.util.List<java.lang.Throwable> errors;
        int index;
        long produced;
        final org.reactivestreams.Publisher<? extends T>[] sources;
        final java.util.concurrent.atomic.AtomicInteger wip;

        ConcatArraySubscriber(org.reactivestreams.Publisher<? extends T>[] publisherArr, boolean z, org.reactivestreams.Subscriber<? super T> subscriber) {
            super(false);
            this.downstream = subscriber;
            this.sources = publisherArr;
            this.delayError = z;
            this.wip = new java.util.concurrent.atomic.AtomicInteger();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            setSubscription(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            if (this.delayError) {
                java.util.List arrayList = this.errors;
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList((this.sources.length - this.index) + 1);
                    this.errors = arrayList;
                }
                arrayList.add(th);
                onComplete();
                return;
            }
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                org.reactivestreams.Publisher<? extends T>[] publisherArr = this.sources;
                int length = publisherArr.length;
                int i = this.index;
                while (i != length) {
                    org.reactivestreams.Publisher<? extends T> publisher = publisherArr[i];
                    if (publisher == null) {
                        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("A Publisher entry is null");
                        if (this.delayError) {
                            java.util.List arrayList = this.errors;
                            if (arrayList == null) {
                                arrayList = new java.util.ArrayList((length - i) + 1);
                                this.errors = arrayList;
                            }
                            arrayList.add(nullPointerException);
                            i++;
                        } else {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                    } else {
                        long j = this.produced;
                        if (j != 0) {
                            this.produced = 0L;
                            produced(j);
                        }
                        publisher.subscribe(this);
                        i++;
                        this.index = i;
                        if (this.wip.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                java.util.List<java.lang.Throwable> list = this.errors;
                if (list != null) {
                    if (list.size() == 1) {
                        this.downstream.onError(list.get(0));
                        return;
                    } else {
                        this.downstream.onError(new io.reactivex.exceptions.CompositeException(list));
                        return;
                    }
                }
                this.downstream.onComplete();
            }
        }
    }
}
