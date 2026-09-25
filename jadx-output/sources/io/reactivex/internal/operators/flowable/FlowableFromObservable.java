package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFromObservable<T> extends io.reactivex.Flowable<T> {
    private final io.reactivex.Observable<T> upstream;

    public FlowableFromObservable(io.reactivex.Observable<T> observable) {
        this.upstream = observable;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.upstream.subscribe(new io.reactivex.internal.operators.flowable.FlowableFromObservable.SubscriberObserver(subscriber));
    }

    static final class SubscriberObserver<T> implements io.reactivex.Observer<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> downstream;
        io.reactivex.disposables.Disposable upstream;

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
        }

        SubscriberObserver(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.downstream = subscriber;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.upstream.dispose();
        }
    }
}
