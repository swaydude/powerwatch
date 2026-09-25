package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDematerialize<T, R> extends io.reactivex.Maybe<R> {
    final io.reactivex.functions.Function<? super T, io.reactivex.Notification<R>> selector;
    final io.reactivex.Single<T> source;

    public SingleDematerialize(io.reactivex.Single<T> single, io.reactivex.functions.Function<? super T, io.reactivex.Notification<R>> function) {
        this.source = single;
        this.selector = function;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.single.SingleDematerialize.DematerializeObserver(maybeObserver, this.selector));
    }

    static final class DematerializeObserver<T, R> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super R> downstream;
        final io.reactivex.functions.Function<? super T, io.reactivex.Notification<R>> selector;
        io.reactivex.disposables.Disposable upstream;

        DematerializeObserver(io.reactivex.MaybeObserver<? super R> maybeObserver, io.reactivex.functions.Function<? super T, io.reactivex.Notification<R>> function) {
            this.downstream = maybeObserver;
            this.selector = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
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
            try {
                io.reactivex.Notification notification = (io.reactivex.Notification) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.selector.apply(t), "The selector returned a null Notification");
                if (notification.isOnNext()) {
                    this.downstream.onSuccess((java.lang.Object) notification.getValue());
                } else if (notification.isOnComplete()) {
                    this.downstream.onComplete();
                } else {
                    this.downstream.onError(notification.getError());
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }
    }
}
