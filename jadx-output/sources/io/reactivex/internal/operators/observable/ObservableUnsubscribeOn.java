package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableUnsubscribeOn<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.Scheduler scheduler;

    public ObservableUnsubscribeOn(io.reactivex.ObservableSource<T> observableSource, io.reactivex.Scheduler scheduler) {
        super(observableSource);
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableUnsubscribeOn.UnsubscribeObserver(observer, this.scheduler));
    }

    static final class UnsubscribeObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 1015244841293359600L;
        final io.reactivex.Observer<? super T> downstream;
        final io.reactivex.Scheduler scheduler;
        io.reactivex.disposables.Disposable upstream;

        UnsubscribeObserver(io.reactivex.Observer<? super T> observer, io.reactivex.Scheduler scheduler) {
            this.downstream = observer;
            this.scheduler = scheduler;
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
            if (get()) {
                return;
            }
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (get()) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.scheduler.scheduleDirect(new io.reactivex.internal.operators.observable.ObservableUnsubscribeOn.UnsubscribeObserver.DisposeTask());
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }

        final class DisposeTask implements java.lang.Runnable {
            DisposeTask() {
            }

            @Override // java.lang.Runnable
            public void run() {
                io.reactivex.internal.operators.observable.ObservableUnsubscribeOn.UnsubscribeObserver.this.upstream.dispose();
            }
        }
    }
}
