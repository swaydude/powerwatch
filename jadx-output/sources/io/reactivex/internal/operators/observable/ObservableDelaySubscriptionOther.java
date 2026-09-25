package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableDelaySubscriptionOther<T, U> extends io.reactivex.Observable<T> {
    final io.reactivex.ObservableSource<? extends T> main;
    final io.reactivex.ObservableSource<U> other;

    public ObservableDelaySubscriptionOther(io.reactivex.ObservableSource<? extends T> observableSource, io.reactivex.ObservableSource<U> observableSource2) {
        this.main = observableSource;
        this.other = observableSource2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        this.other.subscribe(new io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther.DelayObserver(sequentialDisposable, observer));
    }

    final class DelayObserver implements io.reactivex.Observer<U> {
        final io.reactivex.Observer<? super T> child;
        boolean done;
        final io.reactivex.internal.disposables.SequentialDisposable serial;

        DelayObserver(io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable, io.reactivex.Observer<? super T> observer) {
            this.serial = sequentialDisposable;
            this.child = observer;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.serial.update(disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(U u) {
            onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.child.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther.this.main.subscribe(new io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther.DelayObserver.OnComplete());
        }

        final class OnComplete implements io.reactivex.Observer<T> {
            OnComplete() {
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther.DelayObserver.this.serial.update(disposable);
            }

            @Override // io.reactivex.Observer
            public void onNext(T t) {
                io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther.DelayObserver.this.child.onNext(t);
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther.DelayObserver.this.child.onError(th);
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther.DelayObserver.this.child.onComplete();
            }
        }
    }
}
