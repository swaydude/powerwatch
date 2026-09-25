package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableAll<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, java.lang.Boolean> {
    final io.reactivex.functions.Predicate<? super T> predicate;

    public ObservableAll(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Predicate<? super T> predicate) {
        super(observableSource);
        this.predicate = predicate;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super java.lang.Boolean> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableAll.AllObserver(observer, this.predicate));
    }

    static final class AllObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        boolean done;
        final io.reactivex.Observer<? super java.lang.Boolean> downstream;
        final io.reactivex.functions.Predicate<? super T> predicate;
        io.reactivex.disposables.Disposable upstream;

        AllObserver(io.reactivex.Observer<? super java.lang.Boolean> observer, io.reactivex.functions.Predicate<? super T> predicate) {
            this.downstream = observer;
            this.predicate = predicate;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                if (this.predicate.test(t)) {
                    return;
                }
                this.done = true;
                this.upstream.dispose();
                this.downstream.onNext(false);
                this.downstream.onComplete();
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
            this.downstream.onNext(true);
            this.downstream.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }
    }
}
