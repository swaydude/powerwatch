package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableDematerialize<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.Notification<R>> selector;

    public ObservableDematerialize(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.Notification<R>> function) {
        super(observableSource);
        this.selector = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super R> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDematerialize.DematerializeObserver(observer, this.selector));
    }

    static final class DematerializeObserver<T, R> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        boolean done;
        final io.reactivex.Observer<? super R> downstream;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.Notification<R>> selector;
        io.reactivex.disposables.Disposable upstream;

        DematerializeObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.Notification<R>> function) {
            this.downstream = observer;
            this.selector = function;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.done) {
                if (t instanceof io.reactivex.Notification) {
                    io.reactivex.Notification notification = (io.reactivex.Notification) t;
                    if (notification.isOnError()) {
                        io.reactivex.plugins.RxJavaPlugins.onError(notification.getError());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                io.reactivex.Notification notification2 = (io.reactivex.Notification) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.selector.apply(t), "The selector returned a null Notification");
                if (notification2.isOnError()) {
                    this.upstream.dispose();
                    onError(notification2.getError());
                } else if (notification2.isOnComplete()) {
                    this.upstream.dispose();
                    onComplete();
                } else {
                    this.downstream.onNext((java.lang.Object) notification2.getValue());
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }
    }
}
