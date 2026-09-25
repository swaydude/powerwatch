package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleToFlowable<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.SingleSource<? extends T> source;

    public SingleToFlowable(io.reactivex.SingleSource<? extends T> singleSource) {
        this.source = singleSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleToFlowable.SingleToFlowableObserver(subscriber));
    }

    static final class SingleToFlowableObserver<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> implements io.reactivex.SingleObserver<T> {
        private static final long serialVersionUID = 187782011903685568L;
        io.reactivex.disposables.Disposable upstream;

        SingleToFlowableObserver(org.reactivestreams.Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            complete(t);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }
    }
}
